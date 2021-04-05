public class Part1 {
        public static void main(String[] args) {
            System.out.println(loginCredentials("Neo", "followthewhiterabbit"));
        }

        public static String loginCredentials(String userName, String passWord){
            if (userName.equals("Neo") && passWord.equals("followthewhiterabbit")){
                return "Welcome, Neo";
            }
            return "Invalid user name or password";
        }
}


