package cn.cnhoyun.chapter19;

import com.sun.jmx.snmp.Enumerated;

import java.util.EnumMap;

interface CommandHandle {
    boolean handle(FMail m);
}

public class E09_PostOffice2 {
    static EnumMap<MailHandler, CommandHandle> em =
            new EnumMap<>(MailHandler.class);

    static {
        em.put(MailHandler.GENERAL_DELIVERY, (m) -> {
            switch (m.generalDelivery) {
                case YES:
                    System.out.println("Using general delivery for " + m);
                    return true;
                default:
                    return false;
            }
        });
        em.put(MailHandler.MACHINE_SCAN, new CommandHandle() {
            public boolean handle(FMail m) {
                switch (m.scannability) {
                    case UNSCANNABLE:
                        return false;
                    default:
                        switch (m.address) {
                            case INCORRECT:
                                return false;
                            default:
                                System.out.println("Delivering " + m + " automatically");
                                return true;
                        }
                }
            }
        });
        em.put(MailHandler.VISUAL_INSPECTION, new CommandHandle() {
            public boolean handle(FMail m) {
                switch (m.readability) {
                    case ILLEGIBLE:
                        return false;
                    default:
                        switch (m.address) {
                            case INCORRECT:
                                return false;
                            default:
                                System.out.println("Delivering " + m + " normally");
                                return true;
                        }
                }
            }
        });
        em.put(MailHandler.RETURN_TO_SENDER, new CommandHandle() {
            public boolean handle(FMail m) {
                switch (m.returnAddress) {
                    case MISSING:
                        return false;
                    default:
                        System.out.println("Returning " + m + " to sender");
                        return true;
                }
            }
        });
    }

    enum MailHandler {
        GENERAL_DELIVERY, MACHINE_SCAN, VISUAL_INSPECTION,
        RETURN_TO_SENDER;
    }

    static void handle(FMail m) {
        for (CommandHandle cmd : em.values())
            if (cmd.handle(m))
                return;
        System.out.println(m + " is a dead letter");
    }

    public static void main(String[] args) {
        for (FMail mail : FMail.generator(10)) {
            System.out.println(mail.details());
            handle(mail);
            System.out.println("*****");
        }
    }
}