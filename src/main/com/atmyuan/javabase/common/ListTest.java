package main.com.atmyuan.javabase.common;

import org.w3c.dom.traversal.NodeIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
    //主方法
    public static void main(String[] args) {
        List list = new ArrayList();
        //List.of();
        list.add("a");
        list.add(123);
        list.add(false);
        ListIterator listIterator = list.listIterator();
        Iterator iterator = list.iterator();
        //list==null 回车不能带出if表达式
        //list.for 回车可以自动补全for增强表达式
        for (Object o : list) {

        }
        //list.fori 回车可以自动补全for普通表达式
        for (int i = 0; i < list.size(); i++) {

        }
        //list.size()>0.if 回车快速构建if表达式
        if (list.size() > 0) {

        }
        //list==null.if 回车快速构建if表达式
        if (list == null) {

        }
        //list.nn list!=null.if 回车快速构建if表达式
        if (list != null) {

        }
        if (list!=null) {

        }
        //list.get(0).cast 回车进行类型强转
        String s = (String) list.get(0);
//s.return
        //return s;


    }
}
