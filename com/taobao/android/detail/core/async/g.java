package com.taobao.android.detail.core.async;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ViewFactory";

    /* renamed from: a  reason: collision with root package name */
    private static final g f9382a;

    static {
        kge.a(1924365965);
        f9382a = new g();
        emu.a("com.taobao.android.detail.core.async.ViewFactory");
    }

    public static g a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("1a46cd8e", new Object[0]) : f9382a;
    }

    public View a(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("9a97f025", new Object[]{this, context, new Integer(i)}) : View.inflate(context, i, null);
    }
}
