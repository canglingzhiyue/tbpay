package com.taobao.tao.welcome;

import android.app.Activity;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.welcome.d;
import tb.kge;

/* loaded from: classes.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_GENERAL = "general";
    public static final String TYPE_LAUNCH = "launch";

    static {
        kge.a(-1432279111);
    }

    public static e a(String str, Activity activity, d.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("5d32b22e", new Object[]{str, activity, aVar}) : TextUtils.equals("launch", str) ? new f(activity, aVar) : new g(activity, aVar);
    }
}
