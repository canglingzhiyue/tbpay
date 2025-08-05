package com.taobao.weex.adapter;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import tb.kge;

/* loaded from: classes.dex */
public class TBWXNavPreProcessor implements Nav.h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1674930552);
        kge.a(-234059470);
    }

    @Override // com.taobao.android.nav.Nav.h
    public boolean beforeNavTo(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a5c187", new Object[]{this, intent})).booleanValue();
        }
        return true;
    }
}
