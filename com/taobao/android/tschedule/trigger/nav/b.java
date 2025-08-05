package com.taobao.android.tschedule.trigger.nav;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jkq;
import tb.jmg;
import tb.jmh;
import tb.kge;

/* loaded from: classes6.dex */
public class b implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f15684a;

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "TScheduleAfterNavProcessor";
    }

    static {
        kge.a(-839469350);
        kge.a(-719787762);
        f15684a = "TScheduleAfterNavProcessor";
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        try {
            com.taobao.android.tschedule.e.i().b(intent);
        } catch (Throwable th) {
            jkq.a(f15684a, "process AfterNavTrigger error", th);
            th.printStackTrace();
        }
        return true;
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        try {
        } catch (Throwable th) {
            jkq.a(f15684a, "registerNavTrigger error", th);
            th.printStackTrace();
        }
        return !jmh.a(jmg.SWITCH_KEY_ENABLE_NAV, false);
    }
}
