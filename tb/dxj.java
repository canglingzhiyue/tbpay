package tb;

import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import tb.dxh;

/* loaded from: classes4.dex */
public class dxj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1425784697);
    }

    public static dxh.a a(JSONObject jSONObject, String str, String str2, DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dxh.a) ipChange.ipc$dispatch("794d22a8", new Object[]{jSONObject, str, str2, dinamicXEngine});
        }
        dxh.a aVar = new dxh.a();
        aVar.f27062a = str.length() - str2.length();
        aVar.b = aVar.f27062a + str2.length();
        Object a2 = a(jSONObject, dinamicXEngine);
        if (a2 != null) {
            aVar.d.add(a2);
        }
        Object b = b(jSONObject);
        if (b != null) {
            aVar.d.add(b);
        }
        Object c = c(jSONObject);
        if (c != null) {
            aVar.d.add(c);
        }
        Object d = d(jSONObject);
        if (d != null) {
            aVar.d.add(d);
        }
        if (aVar.d.size() <= 0) {
            return null;
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Object a(com.alibaba.fastjson.JSONObject r4, com.taobao.android.dinamicx.DinamicXEngine r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.dxj.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r4
            r1[r2] = r5
            java.lang.String r4 = "9a6a0399"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            return r4
        L16:
            r0 = 0
            if (r4 == 0) goto L24
            java.lang.String r1 = "size"
            java.lang.String r4 = r4.getString(r1)
            float r0 = java.lang.Float.parseFloat(r4)     // Catch: java.lang.Throwable -> L24
            goto L25
        L24:
            r2 = 0
        L25:
            int r4 = (int) r0
            if (r2 == 0) goto L30
            android.content.Context r4 = com.taobao.tao.navigation.a.b()     // Catch: java.lang.Throwable -> L31
            int r4 = tb.gbg.a(r5, r4, r0)     // Catch: java.lang.Throwable -> L31
        L30:
            r3 = r4
        L31:
            android.text.style.AbsoluteSizeSpan r4 = new android.text.style.AbsoluteSizeSpan
            r4.<init>(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dxj.a(com.alibaba.fastjson.JSONObject, com.taobao.android.dinamicx.DinamicXEngine):java.lang.Object");
    }

    private static Object b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4c59f1eb", new Object[]{jSONObject});
        }
        if (jSONObject != null) {
            z = Boolean.parseBoolean(jSONObject.getString("bold"));
        }
        if (!z) {
            return null;
        }
        return new StyleSpan(1);
    }

    private static Object c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("75ae472c", new Object[]{jSONObject});
        }
        if (jSONObject != null) {
            z = Boolean.parseBoolean(jSONObject.getString("italic"));
        }
        if (!z) {
            return null;
        }
        return new StyleSpan(2);
    }

    private static Object d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9f029c6d", new Object[]{jSONObject});
        }
        if (jSONObject == null || !Boolean.parseBoolean(jSONObject.getString("strikeThrough"))) {
            return null;
        }
        return new StrikethroughSpan();
    }
}
