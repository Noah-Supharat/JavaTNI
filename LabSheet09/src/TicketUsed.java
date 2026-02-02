import javax.swing.*;

public class TicketUsed {
    static void main() {
        Ticket[] tickets = new Ticket[]{
          new Ticket("T001", new Movie("Titanic", 120, "PG-13"), "12:00", "B7", 280),
                new Ticket("T002", new Movie("Pokemon", 102, "PG"), "11:00", "G11", 240),
                new Ticket("T003", new Movie("Silent Hill", 125, "R-13"), "14:30", "H2", 240)
        };

        String ticId;
        int menu;
        int ans = JOptionPane.showConfirmDialog(null, "Do you want to book or use a ticket","Ticket", JOptionPane.YES_NO_OPTION);
        while(true){
            if (ans != JOptionPane.YES_OPTION){
                break;
            }

            ticId = JOptionPane.showInputDialog(null, show_movie_list(tickets) + "\nEnter a ticket id for booking:");

            for (Ticket t : tickets){
                if (t.getTicket_id().equalsIgnoreCase(ticId)){
                    menu = Integer.parseInt(JOptionPane.showInputDialog(null,  t.getTicket_id() + ": " + t.getMovie() +
                            "\n" + "\nPress 1 to book a ticket" + "\nPress 2 to use a ticket" + "\nPress 3 to see a ticket status" +
                            " \n" + "\nEnter a menu:"));

                    if(menu == 1){
                        JOptionPane.showMessageDialog(null,t.bookTicket() + "\n---------------------------\n" +  t.toString());
                    }

                    else if(menu == 2){
                        JOptionPane.showMessageDialog(null, t.useTicket() + "\n---------------------------\n" + t.toString());
                    }

                    else{
                        JOptionPane.showMessageDialog(null, t.toString());
                    }
                }
            }

            int anotherTic = JOptionPane.showConfirmDialog(null, "Do you want to book or use other tickets?",
                    "Ticket", JOptionPane.YES_NO_OPTION);

            if(anotherTic == JOptionPane.NO_OPTION){
                break;
            }
        }

    }

    public static String show_movie_list(Ticket... ticket){
        String result = "";

        for (Ticket t : ticket){
            result += t.getTicket_id() + ": " + t.getMovie().toString() + "\n";
        }
        return result;
    }
}
