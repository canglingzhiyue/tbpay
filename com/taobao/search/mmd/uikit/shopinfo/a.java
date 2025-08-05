package com.taobao.search.mmd.uikit.shopinfo;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.g;
import com.taobao.android.weex_framework.util.i;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f19188a;
    private final int b;
    private final int e;
    private final int f;
    private final RectF d = new RectF();
    private final Paint c = new Paint(1);

    static {
        kge.a(1312706993);
    }

    public a(int i, int i2, int i3, int i4) {
        this.b = i2;
        this.f19188a = i;
        this.c.setColor(i);
        this.e = i3;
        this.f = i4;
    }

    private void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.c.setAlpha((int) (Math.min(Math.max(f, 0.0f), 1.0f) * 255.0f));
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.c.setColor(i);
        this.f19188a = i;
    }

    public static a a(JSONObject jSONObject) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("4e435d3b", new Object[]{jSONObject});
        }
        int a2 = g.a(jSONObject.getString(com.taobao.tao.infoflow.multitab.e.KEY_BG_COLOR), 0);
        String string = jSONObject.getString("radius");
        String string2 = jSONObject.getString("paddingLeft");
        String string3 = jSONObject.getString("paddingRight");
        int a3 = TextUtils.isEmpty(string2) ? 0 : (int) i.a(string2);
        int a4 = TextUtils.isEmpty(string3) ? 0 : (int) i.a(string3);
        if (TextUtils.isEmpty(string)) {
            aVar = new a(a2, 0, a3, a4);
        } else {
            aVar = new a(a2, (int) i.a(string), a3, a4);
        }
        String string4 = jSONObject.getString("opacity");
        if (!TextUtils.isEmpty(string4)) {
            aVar.a(g.a(string4, 1.0f));
        }
        return aVar;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.e;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.f;
    }

    public void a(Canvas canvas, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a565671d", new Object[]{this, canvas, new Integer(i), new Integer(i2)});
        } else if (this.f19188a == 0) {
        } else {
            this.d.set(0.0f, 0.0f, i, i2);
            RectF rectF = this.d;
            int i3 = this.b;
            canvas.drawRoundRect(rectF, i3, i3, this.c);
        }
    }
}
