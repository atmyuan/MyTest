package main.com.atmyuan.javabase.common;

public enum EnumDome2 {

    //3.定义三个类型
    LAUNCH("launch"),PAGEVIEW("pageview"),EVENT("event");

    //4.生成有参构造方法
    EnumDome2(String name ){
        this.name = name;
    }

    //1.定义一个属性
    private String name;

    //2.定义一个方法
    public void show(){
        System.out.println(this.name);
        EnumDome2[] ee = values();
        for (EnumDome2 enumDome2 :ee){
            System.out.println(enumDome2);
        }
    }


}
