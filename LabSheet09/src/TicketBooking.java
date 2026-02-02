import javax.swing.*;

public class TicketBooking {
    static void main() {
        Movie movie1 = new Movie("Titanic", 120, "PG-13");
        String show_time = select_showtime(movie1);
        String seat_number = select_seat_number();
        Ticket ticket1 = new Ticket("T001", movie1, show_time, seat_number, 240);

        int result = JOptionPane.showConfirmDialog(null, "Do you want to book a " + movie1.getTitle() + " ticket?",
                "Book Ticket", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION){
            ticket1.bookTicket();
            JOptionPane.showMessageDialog(null,"Ticket booked successfully!!");
        }

        JOptionPane.showMessageDialog(null,ticket1.toString());
        //JOptionPane.showMessageDialog(null,ticket1.useTicket());
    }

    public static String select_showtime(Movie movie){

        int ans = Integer.parseInt(JOptionPane.showInputDialog(null, (movie.toString()) +
                "\nPress 1 to select show time = 13.00" +
                "\nPress 2 to select show time = 14:00" +
                "\nPress 3 to select show time = 15:00"));
        if(ans == 1){
            return "13:00";
        }
        else if(ans == 2){
            return "14:00";
        }
        else if(ans == 3){
            return "15:00";
        }
        else{
            return "Error time";
        }
    }

    public static String select_seat_number(){
        String row;
        int number;

        while(true){
            row = JOptionPane.showInputDialog("Select seat row [A-G]");
            row = row.trim().toUpperCase();
            if(row.length() == 1 && row.charAt(0) >= 'A' && row.charAt(0) <= 'G'){
                break;
            }
        }

        while(true){
            number = Integer.parseInt(JOptionPane.showInputDialog("Select seat number [1-12]"));
            if(number >= 1 && number <= 12){
                break;
            }
        }

        return row + number;
    }
}
