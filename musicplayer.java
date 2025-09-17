package media;
interface Media{
	void play();
	void stop();
	default void pause() {
		System.out.println("Media paused");
		
	}
	static void abt() {
		System.out.println("This is a interface");
	}
}

interface AdvancedMedia extends Media{
	void nexttrack();
}
class musicPlayer implements AdvancedMedia{
	public void play() {
	System.out.println("Music started");
}
	public void stop() {
		System.out.println("Music Stopped");
	}
public void nexttrack() {
System.out.println("Next song");
}
}
	public class musicplayer{
	 public static void main(String[]args) {
musicPlayer player=new musicPlayer();
player.play();
player.nexttrack();
player.pause();
Media.abt();
player.stop();
	 }
	}



