package ru.geekbrains.java_2.lesson2.homework;

public class Main {



   /* Есть строка вида: "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0"; (другими словами матрица 4x4)
            10 3 1 2
            2 3 2 2
            5 6 7 1
            300 3 1 0
    Написать метод, на вход которого подаётся такая строка, метод должен преобразовать строку в двумерный массив типа String[][];
2. Преобразовать все элементы массива в числа типа int, просуммировать, поделить полученную сумму на 2, и вернуть результат;
3. Ваши методы должны бросить исключения в случаях:
    Если размер матрицы, полученной из строки, не равен 4x4;
    Если в одной из ячеек полученной матрицы не число; (например символ или слово)
            4. В методе main необходимо вызвать полученные методы, обработать возможные исключения и вывести результат расчета.
5. * Написать собственные классы исключений для каждого из случаев


    */
  public static void main(String[] args) throws OnlyNumbersException {
      String s = new String("10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0\n");
      String[][]a= new String[0][];
      try {
          a = createArray4x4(s);
      } catch (Exception e) {
          e.printStackTrace();

      }
      try {
          System.out.println(stringSum(a));
      }catch (NumberFormatException e){
          e.printStackTrace();
          throw new OnlyNumbersException(e);
      }




  }


  public static String [][] createArray4x4(String s)throws Check4X4Exceptions{

      int SIZE = 4;
      String[] a = s.split("\n");
      if(a.length!=SIZE) throw  new Check4X4Exceptions();
      String[][] result = new String[SIZE][SIZE];
      for (int i = 0; i <SIZE ; i++) {

              result[i]=a[i].split(" ");
              if(result[i].length!=SIZE)throw new Check4X4Exceptions();
          }
      return result;
      }

      public static int stringSum(String [][] sArr)throws NumberFormatException{
      int SIZE=4;
      int sum=0;
      int[][] result= new int[SIZE][SIZE];
          for (int i = 0; i < SIZE; i++) {
              for (int j=0 ; j < SIZE; j++){
                  result[i][j]=Integer.parseInt(sArr[i][j]);
                  sum+=result[i][j];
              }

          }
          return sum/2;
      }



  }


