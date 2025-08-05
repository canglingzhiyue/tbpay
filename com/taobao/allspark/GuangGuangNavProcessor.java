package com.taobao.allspark;

import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.a;
import com.taobao.android.layoutmanager.b;
import com.taobao.android.nav.d;

/* loaded from: classes4.dex */
public class GuangGuangNavProcessor implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "GuangGuangNavProcessor";
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
        Context context = null;
        if (!b.INSTANCE.a(dVar == null ? null : dVar.a(), intent)) {
            if (dVar != null) {
                context = dVar.a();
            }
            if (!a.a(context, intent)) {
                return false;
            }
        }
        return true;
    }
}
