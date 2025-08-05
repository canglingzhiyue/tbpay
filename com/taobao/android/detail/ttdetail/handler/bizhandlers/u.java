package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import tb.eyx;
import tb.ezm;
import tb.kge;

/* loaded from: classes5.dex */
public class u implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openShare";
    public static final String EVENT_TYPE_ALTERNATIVE = "share";
    private Context c;
    private eyx d;

    static {
        kge.a(-1639347620);
        kge.a(1967244270);
    }

    public u(Context context, eyx eyxVar) {
        this.c = context;
        this.d = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        Toast.makeText(this.c, "please implement share", 0).show();
        return true;
    }
}
