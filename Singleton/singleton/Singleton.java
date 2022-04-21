public class Singleton {
    private static Singleton log;
    private Singleton(){
    }

    public static Singleton getLog() {
        if(log==null){
            log= new Singleton();
        }
        return log;
    }

    public static void printLog(String log) {
        System.out.println(log);
    }
}
