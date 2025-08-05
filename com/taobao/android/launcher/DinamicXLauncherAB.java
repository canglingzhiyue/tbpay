package com.taobao.android.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.bx;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class DinamicXLauncherAB implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
        } else {
            bx.d();
        }
    }
}
