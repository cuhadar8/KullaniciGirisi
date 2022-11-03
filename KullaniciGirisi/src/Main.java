import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String userName,password;
		
		System.out.print("Kullanıcı adınız: ");
		userName = scanner.nextLine();
		
		System.out.print("Parolanız: ");
		password = scanner.nextLine();
		
		if(userName.equals("patika") && password.equals("1234")) {
			System.out.println("Giriş başarılı. Hoşgeldiniz :)");
		}
		else {
			System.out.print("Kullanıcı adı veya parola hatalı. Parolanızı değiştirmek ister misiniz?(evet - hayır): ");
			String response = scanner.nextLine();
			
			if(response.equals("evet")) {
				
				System.out.print("Yeni şifre: ");
				String newPassword = scanner.nextLine();
				System.out.print("Yeni şifrenizi tekrar giriniz: ");
				String newPassword2 = scanner.nextLine();
				
				if(newPassword.equals(newPassword2)) {
					System.out.println("Şifreniz başarıyla güncellendi.");
				}
				else {
					System.out.println("Girdiğiniz şifreler birbirinden farklı.");
				}
			}
			else {
				System.out.println("Mevcut şifrenizle yeniden giriş yapmayı deneyin.");
			}
		}
		
	}
}
