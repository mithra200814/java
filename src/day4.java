
    /*
    int[][] marks=new int[4][4];
    int[][] studentMarks={
            {15,89,70,78},
            {78,48,79,20},
            {56,78,56,46},
            {98,89,67,45}
   };
    for(int row=0;row<studentMarks.length;row++){
        for(int col=0;col<studentMarks[row].length;col++){
     System.out.print(studentMarks[row][col] +" ");
        }
        System.out.println();
    }
}
*/
    /*
    int[][] attendance = new int[5][3];
    int[][] studentattendance = {
            {0, 1, 0},
            {1, 0, 0},
            {1, 1, 1},
            {1, 0, 1},
            {0, 0, 0},
    };
    for (int row = 0; row < studentattendance.length; row++) {
        System.out.println("Student" + (1 + row) + ":");
        for (int column = 0; column < studentattendance[row].length; column++) {
            if (studentattendance[row][column] == 1) {
                System.out.println("class" + (column) + ": present");
            } else {
                System.out.println("class" + (1 + column) + ": Absent");
            }
        }
        System.out.println(" ");
    }
}
*/
void main() {
    System.out.println(add(4,6));
    System.out.println(sub(6,5));
    System.out.println(multi(3,5));
    System.out.println(division(4,8));
    System.out.println(modulus(3,6));
}
 public int add(int a,int b) {
    return a+b;
 }
public int sub(int a,int b){
        return a-b;
}
public int multi(int a,int b){

    return a*b;
}
public int division(int a,int b){

    return a/b;
}
public int modulus(int a,int b){

    return a%b;
}









