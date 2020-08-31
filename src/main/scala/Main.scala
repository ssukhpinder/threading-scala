object Main extends App {
	var thread = new ScalaThreadExample()  
	thread.start() 
	
	var runnableObj = new ScalaRunnableThreadExample()  
	var threadRunnable = new Thread(runnableObj)  
	threadRunnable.start()
	
	var thread1=new ThreadSleepExample();
	var thread2=new ThreadSleepExample();
	//thread1.start()
	//thread2.start()
	
	var thread3=new ThreadSleepExample();
	//thread1.start()
	//thread1.join()
	//thread2.start()
	//thread3.start()
	
	var thread4=new ThreadSetNameExample();
	thread4.setName("Thread 4");
	thread4.start()
}

class ScalaThreadExample extends Thread{  
	override def run(){  
		println("Thread in scala in running !!");  
	}  
}  

class ScalaRunnableThreadExample extends Runnable{  
	override def run(){  
		println("Thread is running using the Runnable interface !!")  
	}  
}   

class ThreadSleepExample extends Thread{  
	override def run(){  
		for(i<- 0 to 5){  
			println(i)  
			Thread.sleep(500)  
		}  
	}
}

class ThreadSetNameExample() extends Thread{  
	override def run(){  
		for(i<- 0 to 5){  
			println(this.getName()+" - "+i)  
			Thread.sleep(500)  
		}  
	}  
}  