package thread;

/**
 * 각 스레드가 공유하는 자원 만들어 보기(Shared Resource) - 공유 자원
 */
public class BankAccount {

    private int money = 100_000;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    // 입금
    public void deposit(int money) {
       int currentMoney = getMoney();
       // synchronized 블록 처리
       synchronized (this) {
           try {
               Thread.sleep(3000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           // this.money += money;
           //       10   +  1 = 11
           setMoney(currentMoney + money);
           System.out.println("ATM 현재 잔액(입금) : " + getMoney());
       }

    }

    // 출금
    // synchronized 메서드 처리
    public synchronized int widthDraw(int money) {
        int currentMoney = getMoney();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        
        // 방어적 코드 
        if(currentMoney < money) {
            System.out.println("잔액이 부족합니다");
            return 0;
        } else {
            setMoney(currentMoney - money);
            System.out.println("ATM 현재 잔액(출금) : " + getMoney());
            return 0;
        }
    }
}
