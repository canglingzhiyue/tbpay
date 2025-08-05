package com.taobao.search.m3.property;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.search.m3.i;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class c extends com.taobao.search.m3.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final int h;
    private static final float i;
    private static final int j;
    private static final int k;
    private static final int l;
    private static final int m;

    /* renamed from: a  reason: collision with root package name */
    private final Paint f19133a;
    private final Paint b;
    private int c;
    private final b d;
    private final Integer e;
    private final boolean f;
    private final View g;

    public static final /* synthetic */ int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue() : j;
    }

    public c(b info, Integer num, boolean z, View view) {
        q.c(info, "info");
        q.c(view, "view");
        this.d = info;
        this.e = num;
        this.f = z;
        this.g = view;
        this.f19133a = new Paint(1);
        this.b = new Paint(1);
        this.f19133a.setColor(h);
        Paint paint = this.b;
        Integer num2 = this.e;
        paint.setColor(num2 != null ? num2.intValue() : this.f ? k : l);
        this.b.setTextSize(i);
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-799755769);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : c.d();
        }
    }

    static {
        kge.a(-588555905);
        Companion = new a(null);
        h = Color.parseColor("#f7f7f7");
        float a2 = l.a(12.0f);
        i = a2;
        j = (int) a2;
        k = Color.parseColor("#333333");
        l = Color.parseColor("#999999");
        m = l.a(6.0f);
    }

    @Override // com.taobao.search.m3.c
    public void a(Canvas canvas) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        if (this.f) {
            float height = this.g.getHeight() / 2.0f;
            canvas.drawRoundRect(0.0f, 0.0f, this.c, this.g.getHeight(), height, height, this.f19133a);
            f = 0.0f + m;
        } else {
            f = 0.0f;
        }
        if (this.d.c()) {
            com.taobao.search.m3.a.a(canvas, this.b, f, this.d.a(), 0.0f, this.g.getHeight());
        } else {
            com.taobao.search.m3.a.a(canvas, this.b, f, this.d.b(), 0.0f, this.g.getHeight());
        }
    }

    @Override // com.taobao.search.m3.c
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        if (this.c == 0) {
            float f = 0.0f;
            if (this.f) {
                f = 0.0f + (m << 1);
            }
            this.c = (int) (f + i.Companion.a(this.d.c() ? this.d.a() : this.d.b(), this.b));
        }
        return this.c;
    }
}
