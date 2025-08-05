package com.taobao.taolive.room.mediaplatform;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import tb.kge;
import tb.qmn;

/* loaded from: classes8.dex */
public class d extends qmn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1519848401);
    }

    @Override // tb.qmn
    public DXRootView a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("fb6cf46d", new Object[]{this, context, str}) : com.taobao.taolive.room.dx.b.c().a(context, str);
    }

    @Override // tb.qmn
    public void a(DXRootView dXRootView, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66865031", new Object[]{this, dXRootView, jSONObject, str});
        } else {
            com.taobao.taolive.room.dx.b.c().a(dXRootView, jSONObject);
        }
    }
}
