package Bloc;

public class SimpleBloc extends MotherBloc {

    int[] placement = new int[2];
    String strContent;
    int intContent;



    private void setPlacement(int x, int y){
        this.placement[0] = x;
        this.placement[1] = y;
    }
    private void setStrContent(String str){this.strContent = str;}
    private void setIntContent(int intC){this.intContent = intC;}

    private int[] getPlacement(){return this.placement;}
    private String getStrContent(){return this.strContent;}
    private int getIntContent(){return this.intContent;}

}
