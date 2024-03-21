public class ContadorRunnable implements Runnable {

 private int tempo;

 ContadorRunnable(int tempo) {
  this.tempo = tempo;
 }

 @Override
 public void run() {
  for (int i = 0; i < 1000; i += tempo) {
   System.err.println(i);
  }
 }
}