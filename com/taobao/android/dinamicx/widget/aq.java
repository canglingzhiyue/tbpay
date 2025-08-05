package com.taobao.android.dinamicx.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.as;
import tb.gbg;

/* loaded from: classes5.dex */
public class aq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public as.c a(as asVar, JSONObject jSONObject, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (as.c) ipChange.ipc$dispatch("a2e7eaa7", new Object[]{this, asVar, jSONObject, str, str2, new Boolean(z)});
        }
        as.c cVar = new as.c();
        cVar.f12063a = str.length() - str2.length();
        cVar.b = cVar.f12063a + str2.length();
        Drawable drawable = new Drawable() { // from class: com.taobao.android.dinamicx.widget.aq.1
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
                return 0;
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
        float a2 = a(asVar, jSONObject, z);
        float a3 = a(jSONObject, str2);
        drawable.setBounds(0, 0, (int) (a2 * a3), (int) a2);
        cVar.d.add(new c(drawable, a2));
        asVar.a(str2, cVar, a3, a2);
        return cVar;
    }

    private float a(as asVar, JSONObject jSONObject, boolean z) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7d5cc03", new Object[]{this, asVar, jSONObject, new Boolean(z)})).floatValue();
        }
        float f = 0.0f;
        if (asVar != null) {
            f = asVar.getTextSize();
        }
        if (jSONObject == null) {
            return f;
        }
        String string = jSONObject.getString("size");
        try {
            if (z) {
                a2 = gbg.a(asVar.getEngine(), asVar.getDXRuntimeContext().m(), Float.parseFloat(string));
            } else {
                a2 = gbg.a(asVar.getDXRuntimeContext().m(), Float.parseFloat(string));
            }
            f = a2;
            return f;
        } catch (Throwable unused) {
            return f;
        }
    }

    private float a(JSONObject jSONObject, String str) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48075342", new Object[]{this, jSONObject, str})).floatValue();
        }
        if (jSONObject == null) {
            return 0.0f;
        }
        try {
            f = Float.parseFloat(jSONObject.getString("ratio"));
        } catch (Throwable unused) {
            f = 0.0f;
        }
        return f == 0.0f ? a(str) : f;
    }

    private float a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c22", new Object[]{this, str})).floatValue();
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
}
