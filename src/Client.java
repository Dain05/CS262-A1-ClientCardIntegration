public class Client {

    private int idNumber;
    private String firstName;
    private String lastName;
    private int age;
    private Card card;

    public Client(int idNumber, String firstName, String lastName, int age,
                  String cardNumber, double balance, int pin, boolean isActive) {

        if (age < 18) {
            throw new IllegalArgumentException("Client must be 18 or older.");
        }

        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

        // composition: client owns the card
        this.card = new Card(cardNumber, balance, pin, isActive);
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            System.out.println("Age cannot be less than 18.");
            return;
        }
        this.age = age;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "Client ID: " + idNumber +
                "\nName: " + firstName + " " + lastName +
                "\nAge: " + age +
                "\n" + card.toString();
    }
}

