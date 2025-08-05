package com.taobao.android.ab.api;

import android.app.Application;
import android.content.Context;
import com.alibaba.evo.EVO;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import java.util.HashMap;
import java.util.Map;
import tb.djy;
import tb.dkl;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        ABGlobal.a.f8617a.a(djy.a(context));
        EVO.initBeforeExperimentTask(context, false);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
        } else {
            ABGlobal.a.f8617a.a(djy.a(application), hashMap);
        }
    }

    public static Map<String, dkl> b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("c7c4b7f4", new Object[]{context}) : ABGlobal.a.f8617a.c(djy.a(context));
    }
}
