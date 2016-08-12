package cap17.lab;

public class ThreadLab extends Thread {
	
//	String texto;
	
	public ThreadLab(String texto){
		setName(texto);
	}
	
	public void run(){
		for(int i = 0; i < 10; i++){
			System.out.println(getName());
			metodoAuxiliar();
			try{
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void metodoAuxiliar(){
		for(int i = 0; i < 10; i++){
			System.out.println(getName());			
//			try{
//				Thread.sleep(500);
//			}catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}

	}
}
