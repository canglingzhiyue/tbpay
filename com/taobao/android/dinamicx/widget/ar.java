package com.taobao.android.dinamicx.widget;

import android.graphics.Color;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.as;
import java.util.Locale;

/* loaded from: classes5.dex */
public class ar {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public as.c a(as asVar, JSONObject jSONObject, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (as.c) ipChange.ipc$dispatch("a2e7eaa7", new Object[]{this, asVar, jSONObject, str, str2, new Boolean(z)});
        }
        as.c cVar = new as.c();
        cVar.f12063a = str.length() - str2.length();
        cVar.b = cVar.f12063a + str2.length();
        Object a2 = a(asVar, jSONObject, z);
        if (a2 != null) {
            cVar.d.add(a2);
        }
        Object a3 = a(asVar, jSONObject);
        if (a3 != null) {
            cVar.d.add(a3);
        }
        Object b = b(asVar, jSONObject);
        if (b != null) {
            cVar.d.add(b);
        }
        Object c = c(asVar, jSONObject);
        if (c != null) {
            cVar.d.add(c);
        }
        Object b2 = b(jSONObject);
        if (b2 != null) {
            cVar.d.add(b2);
        }
        if (cVar.d.size() <= 0) {
            return null;
        }
        return cVar;
    }

    private Object a(as asVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("24c7d271", new Object[]{this, asVar, jSONObject});
        }
        int i = -16777216;
        if (asVar != null) {
            i = asVar.getTextColor();
        }
        if (jSONObject != null) {
            try {
                i = a(jSONObject.getString("color"), i);
            } catch (Throwable unused) {
            }
        }
        return new ForegroundColorSpan(i);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:6|(1:8)|(9:10|11|12|13|14|(1:16)(1:(2:22|23)(3:24|18|19))|17|18|19)|28|13|14|(0)(0)|17|18|19) */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039 A[Catch: Throwable -> 0x005b, TRY_ENTER, TryCatch #0 {Throwable -> 0x005b, blocks: (B:16:0x0039, B:18:0x004c), top: B:26:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Object a(com.taobao.android.dinamicx.widget.as r5, com.alibaba.fastjson.JSONObject r6, boolean r7) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.dinamicx.widget.ar.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L21
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r4
            r1[r2] = r5
            r5 = 2
            r1[r5] = r6
            r5 = 3
            java.lang.Boolean r6 = new java.lang.Boolean
            r6.<init>(r7)
            r1[r5] = r6
            java.lang.String r5 = "8a46937f"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            return r5
        L21:
            r0 = 0
            if (r5 == 0) goto L28
            float r0 = r5.getTextSize()
        L28:
            if (r6 == 0) goto L35
            java.lang.String r1 = "size"
            java.lang.String r6 = r6.getString(r1)
            float r0 = java.lang.Float.parseFloat(r6)     // Catch: java.lang.Throwable -> L35
            goto L36
        L35:
            r2 = 0
        L36:
            int r6 = (int) r0
            if (r7 == 0) goto L4a
            com.taobao.android.dinamicx.DinamicXEngine r6 = r5.getEngine()     // Catch: java.lang.Throwable -> L5b
            com.taobao.android.dinamicx.DXRuntimeContext r5 = r5.getDXRuntimeContext()     // Catch: java.lang.Throwable -> L5b
            android.content.Context r5 = r5.m()     // Catch: java.lang.Throwable -> L5b
            int r3 = tb.gbg.a(r6, r5, r0)     // Catch: java.lang.Throwable -> L5b
            goto L5b
        L4a:
            if (r2 == 0) goto L5a
            com.taobao.android.dinamicx.DXRuntimeContext r5 = r5.getDXRuntimeContext()     // Catch: java.lang.Throwable -> L5b
            android.content.Context r5 = r5.m()     // Catch: java.lang.Throwable -> L5b
            int r5 = tb.gbg.a(r5, r0)     // Catch: java.lang.Throwable -> L5b
            r3 = r5
            goto L5b
        L5a:
            r3 = r6
        L5b:
            android.text.style.AbsoluteSizeSpan r5 = new android.text.style.AbsoluteSizeSpan
            r5.<init>(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.ar.a(com.taobao.android.dinamicx.widget.as, com.alibaba.fastjson.JSONObject, boolean):java.lang.Object");
    }

    private Object b(as asVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f4880610", new Object[]{this, asVar, jSONObject});
        }
        if (asVar != null && asVar.getTextStyle() == 1) {
            z = true;
        }
        if (jSONObject != null) {
            z = Boolean.parseBoolean(jSONObject.getString("bold"));
        }
        if (!z) {
            return null;
        }
        return new StyleSpan(1);
    }

    private Object c(as asVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c44839af", new Object[]{this, asVar, jSONObject});
        }
        if (asVar != null && asVar.getTextStyle() == 2) {
            z = true;
        }
        if (jSONObject != null) {
            z = Boolean.parseBoolean(jSONObject.getString("italic"));
        }
        if (!z) {
            return null;
        }
        return new StyleSpan(2);
    }

    private Object b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4c59f1eb", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || !Boolean.parseBoolean(jSONObject.getString("strikeThrough"))) {
            return null;
        }
        return new StrikethroughSpan();
    }

    public int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue();
        }
        if (str == null || str.length() <= 0) {
            return i;
        }
        String lowerCase = str.toLowerCase(Locale.SIMPLIFIED_CHINESE);
        StringBuilder sb = new StringBuilder("#");
        for (int i2 = 1; i2 < 9 && i2 < lowerCase.length(); i2++) {
            char charAt = lowerCase.charAt(i2);
            if ((charAt >= '0' && charAt <= '9') || (charAt >= 'a' && charAt <= 'f')) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        return (sb2.length() == 7 || sb2.length() == 9) ? Color.parseColor(sb2) : i;
    }

    public boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        return Boolean.parseBoolean(jSONObject.getString("tailIndent"));
    }
}
