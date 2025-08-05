package com.taobao.taolive.adapterimpl.global;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.cgs;
import tb.kge;

/* loaded from: classes8.dex */
public class b implements cgs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(789832314);
        kge.a(-963618112);
    }

    @Override // tb.cgs
    public Application a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("f921f837", new Object[]{this}) : Globals.getApplication();
    }
}
