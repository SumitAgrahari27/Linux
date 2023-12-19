public class InternsCtl {
    public static void main(String[] args) {
        if (args.length > 0 && args[0].equals("--help")) {
            printHelp();
        } else {
            
        }
    }

    private static void printHelp() {
        System.out.println("Usage: internsctl [options]");
        System.out.println("Options:");
        System.out.println("  --help     Display this help message");
        System.out.println("  --version  Display version information");
        
    }
}
