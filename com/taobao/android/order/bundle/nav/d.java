package com.taobao.android.order.bundle.nav;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import tb.hyk;
import tb.kge;

/* loaded from: classes6.dex */
public class d implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-270885310);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "LogisticNotificationProcessor";
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
        if (!hyk.q()) {
            return true;
        }
        Uri data = intent == null ? null : intent.getData();
        if (data == null || !data.isHierarchical()) {
            return true;
        }
        String queryParameter = data.getQueryParameter("directTo");
        if (TextUtils.isEmpty(queryParameter)) {
            return true;
        }
        if (hyk.N()) {
            Nav.from(dVar.a()).toUri(queryParameter);
            return false;
        }
        intent.setData(Uri.parse(queryParameter));
        return true;
    }
}
