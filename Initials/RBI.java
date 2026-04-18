package Initials;
public interface RBI{
  double IntRate=3.5;//compiler will consider it as public static final double intrate=3.5;
  void deposit();//compiler will consider it as public abstract void deposit();
  void withdraw();//compiler will consider it as public abstract void withdraw();
}