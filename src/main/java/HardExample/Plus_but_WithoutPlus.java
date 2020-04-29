package HardExample;

public class Plus_but_WithoutPlus {
    public Integer myPlus(int firstNum,int SecondNum){
      if(SecondNum==0)return firstNum;
      int Sum=firstNum^SecondNum;
      int carry=(firstNum&SecondNum)<<1;
      return myPlus(Sum,carry);
    }
}
