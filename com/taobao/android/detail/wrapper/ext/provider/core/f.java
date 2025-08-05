package com.taobao.android.detail.wrapper.ext.provider.core;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.wrapper.ext.windvane.webview.DetailHybridWebView;
import tb.ehl;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class f implements ehl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-47053586);
        kge.a(-2105964740);
    }

    public f() {
        emu.a("com.taobao.android.detail.wrapper.ext.provider.core.TBH5Depend");
    }

    @Override // tb.ehl
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            DetailHybridWebView.registerPlugins();
        }
    }

    @Override // tb.ehl
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            DetailHybridWebView.unregisterPlugins();
        }
    }
}
