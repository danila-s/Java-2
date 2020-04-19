package ru.geekbrains.lesson5.homeWork;

public class MyThread extends Thread  {
    private  float[]arr ;


    @Override
    public void run(){
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    MyThread(float[] arr){
    this.arr=arr;
    }

    public float[] getArr(){
        return arr;
    }
}
