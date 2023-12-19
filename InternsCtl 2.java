public class InternsCtl {
    private static final String VERSION = "1.0.0";

    public static void main(String[] args) {
        if (args.length > 0) {
            if (args[0].equals("--help")) {
                printHelp();
            } else if (args[0].equals("--version")) {
                printVersion();
            } else {
                
            
        } else {
            
        }
    }

    private static void printHelp() {
     
    }

    private static void printVersion() {
        System.out.println("internsctl version " + VERSION);
    }
}
