package com.taobao.android.behavir;

import android.app.Application;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.solution.BHRSolution;

/* loaded from: classes.dex */
public abstract class a implements com.taobao.android.behavix.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract void initialize(Application application, String str, String str2);

    public abstract void registerConfig(String str, String str2) throws Exception;

    public abstract void registerSolution(String str, BHRSolution bHRSolution);

    public abstract void triggerEvent(String str, JSONObject jSONObject);

    public abstract void unRegisterSolution(String str, BHRSolution bHRSolution);
}
