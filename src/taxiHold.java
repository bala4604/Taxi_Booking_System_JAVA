/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.*;
/**
 *
 * @author Balaji
 */
class taxiHold extends Thread
{
    taxi t;
    
    taxiHold(taxi t)
    {
	this.t=t;
    }
    
    public void run()
    {
	t.isFree=false;
	try
	{
            System.out.println("Taxi id "+t.id+" is Assigned ");
            Thread.sleep(6000000);//10 sec but calculation = Math.abs(pp-dp)*60*60*1000
            t.isFree=true;
	}
	catch(Exception e)
	{
            System.out.println(e);
	}
    }
}