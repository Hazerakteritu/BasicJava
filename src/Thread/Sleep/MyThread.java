package Thread.Sleep;

public class MyThread extends Thread{
    private String threadName;
    public MyThread(String threadName){
        this.threadName = threadName;
    }
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println(threadName+": "+ i);
            try{
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println(threadName + " has finished.");
    }
}
