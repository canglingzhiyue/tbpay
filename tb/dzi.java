package tb;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.model.theme.a;
import com.taobao.android.detail.datasdk.model.viewmodel.main.b;

/* loaded from: classes4.dex */
public class dzi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f27131a;

    static {
        kge.a(2105893331);
        f27131a = new a();
        emu.a("com.taobao.android.detail.core.detail.kit.theme.ThemeEngine");
    }

    public static void a(View view, b bVar, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b106af1c", new Object[]{view, bVar, str});
            return;
        }
        String str3 = "";
        if (bVar != null && bVar.component != null) {
            String str4 = bVar.component.style;
            str2 = a(bVar.themeGroup);
            if (!TextUtils.isEmpty(str4)) {
                str3 = str4;
            }
        } else {
            str2 = f27131a.f9541a;
        }
        if (bVar.component != null) {
            rly a2 = rly.a();
            a2.a(view, str3 + str, str2);
        } else if (bVar.ultronStyleNode == null) {
        } else {
            eoy.a(view, bVar.ultronStyleNode.getJSONObject(str), false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(com.taobao.android.detail.datasdk.model.viewmodel.main.b r3, java.lang.String r4, java.lang.String r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.dzi.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L19
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            java.lang.String r3 = "caf8994e"
            java.lang.Object r3 = r0.ipc$dispatch(r3, r1)
            return r3
        L19:
            java.lang.String r0 = ""
            if (r3 == 0) goto L32
            com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel r1 = r3.component
            if (r1 == 0) goto L32
            com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel r1 = r3.component
            java.lang.String r1 = r1.style
            java.lang.String r3 = r3.themeGroup
            java.lang.String r3 = a(r3)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L37
            goto L36
        L32:
            com.taobao.android.detail.core.detail.kit.model.theme.a r3 = tb.dzi.f27131a
            java.lang.String r3 = r3.f9541a
        L36:
            r1 = r0
        L37:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            r2 = 0
            if (r1 == 0) goto L4e
            return r2
        L4e:
            tb.rlz r1 = tb.rlz.a()
            java.util.HashMap r1 = r1.f()
            if (r1 == 0) goto L66
            tb.rlz r0 = tb.rlz.a()
            java.util.HashMap r0 = r0.f()
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
        L66:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L6d
            goto L6e
        L6d:
            r4 = r0
        L6e:
            tb.rlz r0 = tb.rlz.a()
            java.util.HashMap r0 = r0.e(r3)
            if (r0 == 0) goto L99
            tb.rlz r0 = tb.rlz.a()
            java.util.HashMap r0 = r0.e(r3)
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L99
            tb.rlz r0 = tb.rlz.a()
            java.util.HashMap r3 = r0.e(r3)
            java.lang.Object r3 = r3.get(r4)
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r3 = r3.get(r5)
            return r3
        L99:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dzi.a(com.taobao.android.detail.datasdk.model.viewmodel.main.b, java.lang.String, java.lang.String):java.lang.Object");
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde752f6", new Object[]{aVar});
        } else {
            f27131a = aVar;
        }
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str) && rlz.a().g().contains(str)) {
            return str;
        }
        a aVar = f27131a;
        return aVar == null ? "" : aVar.f9541a;
    }
}
