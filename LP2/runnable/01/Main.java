public class Main {
 public static void main(String[] args) {

  ContadorRunnable contador1 = new ContadorRunnable(100, "contador 1");
  ContadorRunnable contador2 = new ContadorRunnable(200, "contador 2");

  Thread t1 = new Thread(contador1);
  Thread t2 = new Thread(contador2);

  t1.run();
  t2.run();
 }
}
