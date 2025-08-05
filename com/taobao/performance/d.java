package com.taobao.performance;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class d implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-49755985);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "PageHomeNav";
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
        com.taobao.tao.recommend3.tracelog.b.a().e(com.taobao.tao.recommend3.tracelog.b.HOME_NAVI);
        com.taobao.tao.recommend3.tracelog.b.a().e(com.taobao.tao.recommend3.tracelog.b.HOME_VISIBLE);
        return true;
    }
}
