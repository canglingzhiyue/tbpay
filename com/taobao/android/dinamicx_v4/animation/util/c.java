package com.taobao.android.dinamicx_v4.animation.util;

import android.util.Pair;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.gbg;
import tb.gbh;
import tb.gbl;
import tb.gfl;
import tb.gfm;
import tb.kge;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-159679202);
    }

    public static void a(gbl gblVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53f74d6d", new Object[]{gblVar, new Boolean(z)});
            return;
        }
        View a2 = gblVar.a();
        DXWidgetNode b = gbh.b(a2);
        if (!(b instanceof DXWidgetNode) || b.getReferenceNode() == null) {
            return;
        }
        for (Pair pair : gblVar.b()) {
            a a3 = a.a((String) pair.first);
            if (a3 != null) {
                a3.a(a2, z);
            }
        }
    }

    public static Object a(String str, View view, Object obj) {
        DXWidgetNode b;
        com.taobao.android.dinamicx.model.b<gfm> c;
        Long a2;
        gfm gfmVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3fddd376", new Object[]{str, view, obj});
        }
        try {
            b = gbh.b(view);
        } catch (Throwable unused) {
        }
        if (!(b instanceof DXWidgetNode)) {
            return view;
        }
        DXWidgetNode dXWidgetNode = b;
        if (dXWidgetNode.getReferenceNode() == null) {
            return view;
        }
        gfl dxv4Properties = dXWidgetNode.getDxv4Properties();
        if (dxv4Properties != null && (c = dxv4Properties.c()) != null && (a2 = com.taobao.android.dinamicx_v4.responsive.impl.b.a(str)) != null && (gfmVar = c.get(a2.longValue())) != null && gfmVar.a() == 32 && (obj instanceof Number)) {
            return Float.valueOf(gbg.a(gbg.a(view), DinamicXEngine.i(), ((Number) obj).floatValue()));
        }
        return obj;
    }
}
