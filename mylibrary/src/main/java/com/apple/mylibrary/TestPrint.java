package com.apple.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * 作者： lcw on 2016/7/15.
 * 博客： http://blog.csdn.net/lsyz0021/
 */
public class TestPrint {

    public void toast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

    public void sout() {
        System.out.println("测试信息，已经调用了sout()方法");
    }

}