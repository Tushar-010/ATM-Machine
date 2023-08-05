import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account[] acc = new Account[10];
		
		for(int i=0; i<acc.length;i++) {
			acc[i] = new Account(i);
		}
		int id;
		
		do {

			System.out.println("Enter an ID: ");
			id = sc.nextInt();
			
			boolean b = true;

			if(id == acc[id].getId()) {
				while(b) {
					System.out.println();
					System.out.println("Main menu\n1: Check Balance\n2: Withdraw\n3: Deposit\n4: Exit");
					System.out.print("Enter a choice: ");
					int choice = sc.nextInt();
					switch(choice) {
					case 1:
						System.out.println(acc[id].getBalance());
						break;
					case 2:
						System.out.print("Enter amount to withdraw: ");
						int amount = sc.nextInt();
						if (amount < acc[id].getBalance()) {
							acc[id].withdraw(amount);
						} else {
							System.out.println("Insufficient balance");
						}
						break;
					case 3:
						System.out.print("Enter amount to deposit: ");
						int deposit = sc.nextInt();
						acc[id].deposit(deposit);
						break;
					case 4:
						b = false; 
						break;
					}
				}
			}
				
		} while(id == acc[id].getId());
		
		sc.close();
		

	}
}
