package com.taobao.allspark;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class Tab2InitTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static InitTaskImpl initTask;

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        InitTaskImpl initTaskImpl = new InitTaskImpl(application, true);
        initTask = initTaskImpl;
        initTaskImpl.a();
    }
}
