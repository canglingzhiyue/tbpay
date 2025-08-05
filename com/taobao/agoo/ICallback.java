package com.taobao.agoo;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public abstract class ICallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String b;

    static {
        kge.a(-53696936);
    }

    public abstract void onFailure(String str, String str2);

    public abstract void onSuccess();
}
