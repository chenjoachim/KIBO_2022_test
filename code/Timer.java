package jp.jaxa.iss.kibo.rpc.sampleapk;

public class Timer {
    private long startTime;
    public void start()
    {
        startTime=System.nanoTime();
    }
    public double timeElapsed()
    {
        return (System.nanoTime()-startTime*1e-9);
    }
}