package com.taobao.share.copy;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import tb.kge;

/* loaded from: classes8.dex */
public class c implements Nav.h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1479044769);
        kge.a(-234059470);
    }

    public c() {
        try {
            Nav.registerStickPreprocessor(new com.taobao.tao.relation.f());
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.android.nav.Nav.h
    public boolean beforeNavTo(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a5c187", new Object[]{this, intent})).booleanValue();
        }
        if (intent == null) {
            return true;
        }
        com.taobao.share.copy.process.b.a().b(intent);
        return true;
    }
}
