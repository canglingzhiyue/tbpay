package com.taobao.android.tucaoba;

import android.content.Intent;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.sfj;

/* loaded from: classes6.dex */
public class c implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1289141401);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "FeedbackNavProcessor";
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        if (sfj.INSTANCE.b(dVar.a())) {
            AppMonitor.Counter.commit("TuCaoBaNativeNav", "enter_tucaoba_counter", 1.0d);
            AppMonitor.Counter.commit("TuCaoBaNativeNav", "enter_tucaoba_feature_counter", 1.0d);
            dVar.a("com.taobao.taobao");
            dVar.b("com.taobao.android.tucaoba.ondemand.EntryActivity");
        }
        return true;
    }
}
