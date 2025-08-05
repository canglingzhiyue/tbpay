package com.taobao.android.detail.core.utils;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.datasdk.model.datamodel.node.NativeFloatButtonNode;
import com.taobao.android.detail.ttdetail.utils.ac;
import java.util.ArrayList;
import java.util.Iterator;
import tb.dya;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(300223081);
        emu.a("com.taobao.android.detail.core.utils.DetailFloatUtils");
    }

    public static ArrayList<NativeFloatButtonNode.a> a(Context context) {
        dya y;
        com.taobao.android.detail.datasdk.model.datamodel.node.c cVar;
        NativeFloatButtonNode D;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("d4ca583a", new Object[]{context});
        }
        if ((context instanceof DetailCoreActivity) && (y = ((DetailCoreActivity) context).y()) != null && (cVar = y.t) != null && (D = cVar.D()) != null) {
            return D.getFloatButtons();
        }
        return null;
    }

    public static NativeFloatButtonNode.a b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NativeFloatButtonNode.a) ipChange.ipc$dispatch("1f53d91d", new Object[]{context});
        }
        ArrayList<NativeFloatButtonNode.a> a2 = a(context);
        if (a2 != null && !a2.isEmpty()) {
            Iterator<NativeFloatButtonNode.a> it = a2.iterator();
            while (it.hasNext()) {
                NativeFloatButtonNode.a next = it.next();
                if (ac.CODE_NPS.equals(next.e())) {
                    return next;
                }
            }
        }
        return null;
    }

    public static NativeFloatButtonNode.a c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NativeFloatButtonNode.a) ipChange.ipc$dispatch("60139e", new Object[]{context});
        }
        ArrayList<NativeFloatButtonNode.a> a2 = a(context);
        if (a2 != null && !a2.isEmpty()) {
            Iterator<NativeFloatButtonNode.a> it = a2.iterator();
            while (it.hasNext()) {
                NativeFloatButtonNode.a next = it.next();
                if (ac.CODE_TALK_GROUP.equals(next.e())) {
                    return next;
                }
            }
        }
        return null;
    }

    public static boolean a(NativeFloatButtonNode.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ec7a4d2", new Object[]{aVar})).booleanValue();
        }
        if (aVar != null) {
            return aVar.a();
        }
        return false;
    }

    public static NativeFloatButtonNode.a.C0384a b(NativeFloatButtonNode.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NativeFloatButtonNode.a.C0384a) ipChange.ipc$dispatch("d5d2330", new Object[]{aVar});
        }
        if (aVar != null) {
            return aVar.d();
        }
        return null;
    }

    public static String c(NativeFloatButtonNode.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b44f0ed0", new Object[]{aVar});
        }
        if (aVar != null) {
            return aVar.c();
        }
        return null;
    }

    public static String d(NativeFloatButtonNode.a aVar) {
        NativeFloatButtonNode.a.C0384a b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7cad336f", new Object[]{aVar});
        }
        if (aVar != null && (b = b(aVar)) != null) {
            return b.c();
        }
        return null;
    }

    public static String e(NativeFloatButtonNode.a aVar) {
        NativeFloatButtonNode.a.C0384a b;
        JSONObject b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("450b580e", new Object[]{aVar});
        }
        if (aVar != null && (b = b(aVar)) != null && (b2 = b.b()) != null) {
            return b2.getString("url");
        }
        return null;
    }
}
