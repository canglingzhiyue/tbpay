package com.taobao.search.m3.image;

import android.graphics.Canvas;
import android.graphics.Color;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.search.m3.i;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final float g;
    private static final int h;
    private static final int i;
    private static final int j;

    /* renamed from: a  reason: collision with root package name */
    private final TextPaint f19113a;
    private final com.taobao.search.m3.d b;
    private String c;
    private int d;
    private float e;
    private final View f;

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-2138973973);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public h(View view) {
        q.c(view, "view");
        this.f = view;
        this.f19113a = new TextPaint(1);
        this.b = new com.taobao.search.m3.d(this.f, null, 2, null);
        this.f19113a.setTextSize(g);
        this.f19113a.setColor(h);
    }

    static {
        kge.a(1168969059);
        Companion = new a(null);
        g = l.a(10.0f);
        h = Color.parseColor("#ffecd0");
        i = l.a(17.0f);
        j = l.a(6.0f);
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.equals(this.c, str)) {
        } else {
            this.e = 0.0f;
            this.d = 0;
            this.c = str;
            c();
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.e > 0 || StringUtils.isEmpty(this.c)) {
        } else {
            i.a aVar = com.taobao.search.m3.i.Companion;
            String str = this.c;
            if (str == null) {
                q.a();
            }
            this.e = aVar.a(str, this.f19113a);
            this.d = (int) (this.e + (j << 1));
            b();
        }
    }

    public final void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        if (StringUtils.isEmpty(this.c)) {
            return;
        }
        this.b.a(canvas);
        TextPaint textPaint = this.f19113a;
        float f = (this.d - this.e) / 2.0f;
        String str = this.c;
        if (str == null) {
            q.a();
        }
        com.taobao.search.m3.a.a(canvas, textPaint, f, str, 0.0f, i);
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.d == 0 || StringUtils.isEmpty(this.c)) {
        } else {
            this.b.a("https://gw.alicdn.com/imgextra/i2/O1CN01buNxLW1lRmNeEPWmb_!!6000000004816-2-tps-228-68.png", this.d, i);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.b.a();
        }
    }
}
