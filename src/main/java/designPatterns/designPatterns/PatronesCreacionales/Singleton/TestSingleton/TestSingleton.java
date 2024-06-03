package designPatterns.designPatterns.PatronesCreacionales.Singleton.TestSingleton;

import designPatterns.designPatterns.PatronesCreacionales.Singleton.Player;

public class TestSingleton {
    public static void main(String[] args) {
      Thread threadIrina = new Thread(new RunIrina());
      Thread threadJuan = new Thread(new RunJuan());

      threadIrina.start();
      threadJuan.start();
    }

    static class RunIrina implements Runnable{

        @Override
        public void run() {
            Player player = Player.getPlayer("Irina");
            System.out.println("Running Juan:"+player);
        }
    }

    static class RunJuan implements Runnable{

        @Override
        public void run() {
            Player player = Player.getPlayer("Juan");
            System.out.println("Running Irina:"+player);
        }
    }
}
