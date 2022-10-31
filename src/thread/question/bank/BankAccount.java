package thread.question.bank;

/*
 練習.
 模擬同時有多個Threads 對Bank Account 存錢和取錢

 , 和對個Threads取錢. 取錢時, 需要戶口的Balance有錢. 不然就需要等待. 戶口的上限是10元.
 超過上限, 存錢thread就需要等待.

 工作:
 1.  Create(建立) 一個 Account Object, 內有一個 balance. 一個 deposit(int amt) 存錢, 一個widthDraw(int amt) 取錢. 每次存取amt元.
       戶口
 2.  寫2個Thread, 一個存錢. DepositThread, 一個取錢WithDrawThread. 需要使用 synchronized block.
 3.  寫住程序. 建立一個存錢thread和一個取錢thread, 對account進行1000次存取.  戶口balance最後應該=0

 4.  修改程序. 對balance加入限制. balance不可以大過10元. 如果多過10元. 要wait, 而取錢時. balance要多過1.
        - 加入 wait(), notifyAll() 方式實現.

 5.  修改程序. 改用 Runnable 方式建立Threads
 6.  修改寫主程序. 模擬有100個存錢和取錢的Thread運行. 運行完後取出balance的餘數. 看看balance是否=0.
*/

public class BankAccount {
}
