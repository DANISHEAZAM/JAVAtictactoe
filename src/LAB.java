import java.util.Scanner;
public class LAB {
	char board[][]=new char[3][3];
	Scanner bucky=new Scanner(System.in);
	char player1='X';
	char player2='0';
	char currentplayer;boolean is=true;
public  void call(){
	int x,y;clearboard();
currentplayer=player1;
while(is==true){
	
print();
System.out.println(currentplayer+ " TURN");
x=rowno();
y=columno();
if(spot(y,x,currentplayer)==false)
{
    System.out.println("\nbox is already filled\n");
}
else{
     declare(currentplayer);
 if(currentplayer==player1)
 {
     currentplayer=player2;

 }
 else{
     currentplayer=player1;

 }

}

	}}



public void clearboard()
{
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++){
			board[i][j]=' ';
		}
	}
}


public void print(){System.out.println("\n\t\t+-----------+");
	System.out.println("\t\t| |1||2||3| |");
System.out.println("\t\t+-----------+");
	for(int i=0;i<3;i++)
	{System.out.print("\t\t|"+(i+1));
		for(int j=0;j<3;j++){
			System.out.print("|"+board[i][j]+"|");
			if(j==2){
				System.out.print(i+1+"|");
			}
		}System.out.println("\n\t\t+-----------+");
		
	}System.out.println("\t\t| |1||2||3| |");
	System.out.println("\t\t+-----------+");
	System.out.println("\n\n");
	
}

public int rowno(){
	System.out.print("ENTER ROW NUMBER:");
	int row=bucky.nextInt();
	if(row>=1&&row<=3){
		return row-1;
	}
	else{
		System.out.println("SPOT CANNOT BE IDENTIFIED");
		rowno();
	}
	return 0;
	
}
public int columno(){
	System.out.print("ENTER COLUMN NUMBER:");
	int column=bucky.nextInt();
	if(column>=1&&column<=3){
	}
	else{
		System.out.println("SPOT CANNOT BE IDENTIFIED");
		columno();
	}
	return column-1;
	
}

public boolean spot(int a,int b ,char turn){
if(board[b][a]!=' '){

  return false;
}
else{
    board[b][a]=currentplayer;
return true;
}

}


public void declare(char current)
{int p=0;

   for(int i=0;i<3;i++)
   {
       if((board[i][0]==currentplayer)&&(board[i][0] == board[i][1]) && (board[i][1]==board[i][2]))
       {
           p++;
       }
   }
   for(int i=0;i<3;i++)
   {
       if((board[0][i]==currentplayer)&&(board[0][i] == board[1][i]) && (board[1][i]==board[2][i]))
       {
           p++;
       }
   }
   if((board[0][0]==currentplayer)&&(board[0][0]==board[1][1])&& (board[1][1]==board[2][2]))
   {
       p++;
   }
    if((board[0][2]==currentplayer)&&(board[0][2]==board[1][1])&& (board[1][1]==board[2][0]))
   {
       p++;
   }

if(p==1)
    {print();
        System.out.println("\n______--------------_____   "+currentplayer+"  WINS______--------------_____\n");
        is=false;
    }

}}



