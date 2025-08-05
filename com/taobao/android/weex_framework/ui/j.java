package com.taobao.android.weex_framework.ui;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import tb.kge;

/* loaded from: classes6.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static j f16077a;
    private g b;

    static {
        kge.a(1055855420);
    }

    private j() {
    }

    public static j a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("bb553012", new Object[0]);
        }
        if (f16077a == null) {
            synchronized (j.class) {
                if (f16077a == null) {
                    f16077a = new j();
                }
            }
        }
        return f16077a;
    }

    public void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ecb3baf", new Object[]{this, gVar});
        } else {
            this.b = gVar;
        }
    }

    public View a(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a0252f50", new Object[]{this, mUSDKInstance});
        }
        if (mUSDKInstance == null) {
            com.taobao.android.weex_framework.util.g.d("instance is null when create musview!");
            return null;
        }
        g gVar = this.b;
        if (gVar != null) {
            return gVar.a(mUSDKInstance);
        }
        com.taobao.android.weex_framework.util.g.d("MUSView has not register!");
        return null;
    }
}
