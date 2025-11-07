package inheritance_pratice;

interface Games{
	
	public void GameType(String gametype);

	
}


class Indoor implements Games {
	public void GameType(String gametype) {
		System.out.println("This is an indoor game ");
	}
	
	public void GameType(String gametype, int no_of_player) {
		System.out.println("This is an "+gametype + "no of Players are "+no_of_player);
	}
}

class Outdoor implements Games {
	@Override
	public void GameType(String gametype) {
		// TODO Auto-generated method stub
		System.out.println("This is a outdoor game");
	}
	
	public void Gametype(int no_of_players) {
		System.out.println("Number of players: " + no_of_players );
	}
	

	
}

public class Interface_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Indoor i=new Indoor();
		i.GameType("indoor");
		i.GameType("board game", 6);
		
		Outdoor o= new Outdoor();
		
		o.GameType("outdoor");
		o.Gametype(30);
				

	}

}
