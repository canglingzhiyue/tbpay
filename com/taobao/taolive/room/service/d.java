package com.taobao.taolive.room.service;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.cgl;
import tb.kge;
import tb.poz;
import tb.ppx;

/* loaded from: classes8.dex */
public class d implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ppx f21682a;

    static {
        kge.a(-1233112959);
        kge.a(-1053867513);
    }

    public d() {
        com.taobao.taolive.movehighlight.utils.d.f21479a = true;
    }

    @Override // com.taobao.taolive.room.service.a
    public ViewGroup a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("d01cc9b5", new Object[]{this, context});
        }
        if (!(context instanceof Activity)) {
            return null;
        }
        return (ViewGroup) ((Activity) context).findViewById(R.id.taolive_global_layout);
    }

    @Override // com.taobao.taolive.room.service.a
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        if (f21682a == null && cgl.e() != null) {
            f21682a = cgl.e().c();
        }
        ppx ppxVar = f21682a;
        if (ppxVar == null) {
            return -1;
        }
        return ppxVar.f32806a;
    }

    public static void a(com.taobao.taolive.sdk.controller.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24a981fe", new Object[]{eVar});
            return;
        }
        com.taobao.taolive.room.c.f21538a = poz.v(eVar);
        com.taobao.taolive.room.c.b = poz.x(eVar);
        com.taobao.taolive.room.c.d = poz.y(eVar);
    }
}
