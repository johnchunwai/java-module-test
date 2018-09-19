package com.jc.modulehello;

import com.jc.modulehi.HiModule;
import com.jc.serviceproviderinterface.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static javax.xml.XMLConstants.XML_NS_PREFIX;

public class HelloModule {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(XML_NS_PREFIX);
        HiModule hi = new HiModule();
        System.out.println(hi.hi());

        checkExportsDirectiveWithReflection();
        checkEOpensDirectiveWithReflection();

        checkProviderWith();
    }

    private static void checkExportsDirectiveWithReflection() {
        try {
            Class c = Class.forName("com.jc.modulehi.HiModule");
            Method m = c.getMethod("hi");
            System.out.println(m.invoke(c.getDeclaredConstructor().newInstance()));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    private static void checkEOpensDirectiveWithReflection() {
        try {
            Class c = Class.forName("com.jc.moduleopenshi.OpenModule");
            Method m = c.getMethod("hi");
            System.out.println(m.invoke(c.getDeclaredConstructor().newInstance()));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    private static void checkProviderWith() {
        com.jc.serviceproviderinterface.Service service = Service.instance();
        service.printServiceNames();
    }
}