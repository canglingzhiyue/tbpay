package com.taobao.tbugc.adapter;

import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import tb.jmt;
import tb.kge;

/* loaded from: classes9.dex */
public class c implements jmt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-877956967);
        kge.a(-429599772);
    }

    @Override // tb.jmt
    public void a(Context context, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a729a6a", new Object[]{this, context, str, bundle});
        } else {
            Nav.from(context).withExtras(bundle).toUri(str);
        }
    }
}
