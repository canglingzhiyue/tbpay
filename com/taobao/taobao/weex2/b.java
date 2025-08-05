package com.taobao.taobao.weex2;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.v;

/* loaded from: classes8.dex */
public class b implements com.taobao.android.weex_framework.adapter.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.weex_framework.adapter.a
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null) {
        } else {
            view.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_VALID);
        }
    }

    @Override // com.taobao.android.weex_framework.adapter.a
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else if (view == null) {
        } else {
            view.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_INVALID);
        }
    }
}
