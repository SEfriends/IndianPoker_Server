package Model; 

public class Player {
	public String name;
	public Card card;
	public int point;
	public int betPoint;	
	public int win;
	public boolean setBet;
	public boolean isGiveUp;
	public int score;
	
	public Player(String n, int s){
		name = n; //생성자에서 이름을 매개변수로 받아 초기화
		card = new Card(); //해당 플레이어가 사용할 카드
		point = 200; //기본 점수 200점
		betPoint = 0; //베팅 포인트 초기화
		win = 0; //이긴 횟수	
		setBet = false; //베팅점수를 입력완료했는지 (베팅점수가 업데이트됐는지)
		isGiveUp = false; //포기 버튼을 눌렀는지
		score = s; //랭킹점수
	}
	public boolean isbetting(int bp){
		return point >= bp; // 현재 점수보다 베팅포인트가 작거나 같으면 문제 없으므로 True 아니면 False
	}
}
