package functionalintreface;

import java.util.List;

public class _Supllier {
    public static void main(String[] args) {
        System.out.println(getJdbcIrl());
        System.out.println(getJdbcIrls());
    }

    private static String getJdbcIrl(){
        return "jdbc:localhost//54321";
    }

    private static List<String> getJdbcIrls(){
        return List.of("jdbc:localhost//54321", "jdbc:localhost//costumer");
    }
}
