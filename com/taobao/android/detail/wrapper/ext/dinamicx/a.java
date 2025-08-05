package com.taobao.android.detail.wrapper.ext.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar.KAPContainerConstructor;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar.a;
import com.taobao.android.dinamic.c;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.sku.dinamicx.widget.d;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1063643908);
        emu.a("com.taobao.android.detail.wrapper.ext.dinamicx.CustomDinamicUtils");
    }

    public static void a(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156633a2", new Object[]{bdVar});
            return;
        }
        try {
            c.a().a("detail", KAPContainerConstructor.VIEW_TAG, new KAPContainerConstructor());
        } catch (Throwable th) {
            i.a("dinamic", "dinamic registe onFailure!", th);
        }
        try {
            b(bdVar);
        } catch (Throwable th2) {
            i.a("dinamic", "dinamic registe onFailure!", th2);
        }
    }

    private static void b(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("290e0723", new Object[]{bdVar});
        } else if (bdVar == null) {
        } else {
            i.a("CustomDinamicUtils", "registerDinamicV3 kap");
            bdVar.a(com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar.a.DXXKAPVIEW, new a.C0439a());
            bdVar.a(d.DX_WIDGET_ID, new d());
        }
    }
}
