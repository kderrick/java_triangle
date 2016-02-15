public class Triangle {
  private int mLength1;
  private int mLength2;
  private int mLength3;

  public Triangle(int length1, int length2, int length3) {
    mLength1 = length1;
    mLength2 = length2;
    mLength3 = length3;
  }

  public int getLength1() {
    return mLength1;
  }
  public int getLength2() {
    return mLength2;
  }
  public int getLength3() {
    return mLength3;
  }

  public String checkTriangle() {
    String result = "";
    if ((mLength1 + mLength2 <= mLength3) || (mLength1 + mLength3 <= mLength2) || (mLength3 + mLength2 <= mLength1)) {
      result = "Not a triangle";
    } else if ((mLength1 == mLength2) && (mLength2 == mLength3)) {
      result = "Equilateral";
    } else if (((mLength1 == mLength2) && (mLength2 != mLength3)) || ((mLength1 == mLength3) && (mLength1 != mLength2))) {
      result = "Isosceles";
    } else {
      result = "Scalene";
    }
    return result;
  }

}
