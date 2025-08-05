package com.taobao.taolivehome.nav;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.android.nav.d;
import com.taobao.android.nav.e;
import tb.kge;

/* loaded from: classes8.dex */
public class a implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-855896489);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "TaoLiveHomepageProcessor";
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
    public boolean process(Intent intent, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        com.taobao.android.live.plugin.proxy.e.a().a(com.taobao.android.live.plugin.proxy.e.TAOLIVE_HOMEPAGE, false, dVar.a());
        return f.z().processInner(intent, dVar);
    }
}
