package com.taobao.android.dinamicx.monitor;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import tb.fqi;
import tb.kge;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f11901a;
    public static String b;
    public static String c;
    public static String d;
    private static k e;

    static {
        kge.a(-720879382);
        f11901a = "dinamicx_template_name";
        b = "dinamicx_template_version";
        c = "dinamicx_template_url";
        d = "dinamicx_template_isPreset";
    }

    public static void a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c032636", new Object[]{kVar});
        } else if (!fqi.C()) {
        } else {
            e = kVar;
        }
    }

    public static void a(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a042611", new Object[]{dXTemplateItem});
            return;
        }
        try {
            if (!fqi.C() || dXTemplateItem == null) {
                return;
            }
            a(f11901a, dXTemplateItem.f());
            a(b, Long.valueOf(dXTemplateItem.g()));
            a(c, dXTemplateItem.c);
            a(d, Boolean.valueOf(dXTemplateItem.e));
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
        }
    }

    private static void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{str, obj});
            return;
        }
        k kVar = e;
        if (kVar == null) {
            return;
        }
        kVar.a(str, obj);
    }
}
