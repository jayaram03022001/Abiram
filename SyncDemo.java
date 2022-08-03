import java.io.*;
import java.util.*;
class Sender
{
	public void send(String msg)
	{
		System.out.printf("Sending\t" +msg);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("Thread interruputed.");
		}
		System.out.println("\n" +msg+"sent");
	}
}
class ThreadedSend extends Thread
{
	private String msg;
	private Thread t;
	Sender sender;
	ThreadedSend(String m,Sender obj)
	{
		msg=m;
		sender=obj;
	}
	public void run()
	{
		synchronized(sender)
		{
			sender.send(msg);
		}
	}
}
public class SyncDemo 
{
	public static void main(String args[])
	{
		
	Sender snd=new Sender();
	ThreadedSend S1=new ThreadedSend("Hellow",snd);
	ThreadedSend S2=new ThreadedSend("world",snd);
	S1.start();
	S2.start();
	try
	{
		S1.join();
		S2.join();
	}
	catch(Exception e)
	{
		//System.out.println("Interrupted";)
	}
	}
}



	