package week1.day2;

public class Browser {
	
	public void launchBrowser() {
		System.out.println("Browser sucessfully launched");
	}
	
	public void loadUrl() {
		System.out.println("URL sucessfully loaded");
	}
	
	public static void main(String[] args) {
		Browser chrome = new Browser();
		Browser edge = new Browser();
		
		System.out.println("Chrome Browser");
		chrome.launchBrowser();
		chrome.loadUrl();
		
		System.out.println("Edge Browser");
		edge.launchBrowser();
		edge.loadUrl();
	}
}

