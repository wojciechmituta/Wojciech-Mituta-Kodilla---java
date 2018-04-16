class User {
    private String name;
    private String lastName;
    private char sex;
    private int age;
    private String email;

    public User(String name, String lastName, char sex, int age, String email) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.email = email;
    }

    public void logOn() {

    }

    public void logOff() {

    }

    public void delAcc() {

    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public char getSex() {
        return this.sex;
    }

    public int getAge() {
        return this.age;
    }

    public String getEmail() {
        return this.email;
    }
}

class ForumUser extends User {

    private String userName;
    private int numberOfPost;
    private boolean online;

    public ForumUser(String name, String lastName, char sex, int age, String email, String userName, int numberOfPost, boolean online) {
        super(name, lastName, sex, age, email);
        this.userName = userName;
        this.numberOfPost = numberOfPost;
        this.online = online;
    }

    public void publicPost() {

    }

    public void deletePost() {

    }

    public String checkStatus(boolean online) {
        if (online == true) {
            return "uzytkownik jest online";
        } else {
            return "uzytkownik jest offline";
        }

    }

    public String getUserData() {
        return "Imie:" + super.getName() + "\nNazwisko:" + super.getLastName() + "\nWiek:" + super.getAge() + "\nEmail:" + super.getEmail() + "\nPlec:" + super.getSex() + "\nNazwa uzykownika:" + this.userName + "\nStatus:" + checkStatus(online);

    }
}


class Aplication {
    public static void main(String[] args) {
        ForumUser Maciek = new ForumUser("Maciej", "Molenda", 'M', 36, "macciekm@wp.pl", "MacMol", 45, false);
        System.out.println(Maciek.getUserData());
    }
}