package tb;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.c;
import com.taobao.tao.navigation.a;
import tb.dxh;

/* loaded from: classes4.dex */
public class dxi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1088674737);
    }

    public static dxh.a a(JSONObject jSONObject, String str, String str2, DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dxh.a) ipChange.ipc$dispatch("794d22a8", new Object[]{jSONObject, str, str2, dinamicXEngine});
        }
        if (jSONObject == null) {
            return null;
        }
        dxh.a aVar = new dxh.a();
        aVar.f27062a = str.length() - str2.length();
        aVar.b = aVar.f27062a + str2.length();
        Drawable drawable = new Drawable() { // from class: tb.dxi.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.graphics.drawable.Drawable
            public void draw(Canvas canvas) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
                }
            }

            @Override // android.graphics.drawable.Drawable
            public int getOpacity() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
                }
                return -1;
            }

            @Override // android.graphics.drawable.Drawable
            public void setAlpha(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
                }
            }

            @Override // android.graphics.drawable.Drawable
            public void setColorFilter(ColorFilter colorFilter) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
                }
            }
        };
        float a2 = a(jSONObject, dinamicXEngine);
        drawable.setBounds(0, 0, (int) (a(jSONObject, str2) * a2), (int) a2);
        aVar.d.add(new c(drawable, a2));
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static float a(com.alibaba.fastjson.JSONObject r3, java.lang.String r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.dxi.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            java.lang.String r3 = "48075342"
            java.lang.Object r3 = r0.ipc$dispatch(r3, r1)
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            return r3
        L1c:
            r0 = 0
            if (r3 != 0) goto L20
            return r0
        L20:
            java.lang.String r1 = "ratio"
            java.lang.String r3 = r3.getString(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ratioStr =  "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ImageSpanGenerator"
            com.taobao.android.detail.core.utils.i.d(r2, r1)
            boolean r1 = android.text.StringUtils.isEmpty(r3)
            if (r1 != 0) goto L47
            float r3 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.Throwable -> L47
            goto L48
        L47:
            r3 = 0
        L48:
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L50
            float r3 = a(r4)
        L50:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "getRatio: "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.taobao.android.detail.core.utils.i.d(r2, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dxi.a(com.alibaba.fastjson.JSONObject, java.lang.String):float");
    }

    public static float a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c22", new Object[]{str})).floatValue();
        }
        if (str == null) {
            return 0.0f;
        }
        if (str.contains(".png")) {
            str = str.substring(0, str.indexOf(".png"));
        } else if (str.contains(".jpg")) {
            str = str.substring(0, str.indexOf(".jpg"));
        }
        String[] split = str.split("-");
        if (split.length > 2) {
            String str2 = split[split.length - 2];
            String str3 = split[split.length - 1];
            if (str2 != null && str3 != null) {
                try {
                    return Float.parseFloat(str2) / Float.parseFloat(str3);
                } catch (Throwable unused) {
                }
            }
        }
        return 0.0f;
    }

    private static float a(JSONObject jSONObject, DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4610fca9", new Object[]{jSONObject, dinamicXEngine})).floatValue();
        }
        try {
            return gbg.a(dinamicXEngine, a.b(), Float.parseFloat(jSONObject.getString("size")));
        } catch (Throwable unused) {
            return 0.0f;
        }
    }
}
