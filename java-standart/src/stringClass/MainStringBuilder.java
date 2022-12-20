package stringClass;

public class MainStringBuilder {
    public static void main(String[] args) {
        String firstName = "natadekoko";
        System.out.println("First Name "+ firstName);
        String lastName = "tok";
        System.out.println("Last Name "+ lastName);

        String namaLengkap = firstName +" "+lastName;
        System.out.println("Nama Lengkap "+ namaLengkap);


        StringBuilder builder = new StringBuilder((firstName))
                .append(" ").append(lastName);
        System.out.println("Builder "+builder);

        String fullName = builder.toString();
        System.out.println(fullName);
    }


}
