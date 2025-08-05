package com.taobao.browser.utils;

import android.support.v7.app.AppCompatActivity;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2017975782);
    }

    public static void a(AppCompatActivity appCompatActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1cb6f21", new Object[]{appCompatActivity});
            return;
        }
        try {
            appCompatActivity.getSupportActionBar().e();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
