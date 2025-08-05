package com.etao.feimagesearch.mnn.realtime;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CAN_REQUEST = 1;
    public static final a Companion;
    public static final int SHOW_CARD = 1;

    /* renamed from: a  reason: collision with root package name */
    private final float f6799a;
    private final float b;
    private final Rect c;
    private final Integer d;
    private final int e;
    private final String f;
    private final int g;
    private Bitmap h;
    private final long i;
    private final float j;
    private final RectF k;

    static {
        kge.a(2137179549);
        Companion = new a(null);
    }

    public l(Rect bbox, Integer num, int i, String objectCategory, int i2, Bitmap bitmap, long j, float f, RectF originRateBox) {
        q.c(bbox, "bbox");
        q.c(objectCategory, "objectCategory");
        q.c(originRateBox, "originRateBox");
        this.c = bbox;
        this.d = num;
        this.e = i;
        this.f = objectCategory;
        this.g = i2;
        this.h = bitmap;
        this.i = j;
        this.j = f;
        this.k = originRateBox;
        this.f6799a = (this.c.left + this.c.right) / 2;
        this.b = (this.c.top + this.c.bottom) / 2;
    }

    public final Rect d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("9b2bb1f4", new Object[]{this}) : this.c;
    }

    public final Integer e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("2ea92693", new Object[]{this}) : this.d;
    }

    public final int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.e;
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.f;
    }

    public final int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.g;
    }

    public final Bitmap i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("6f3274e", new Object[]{this}) : this.h;
    }

    public final long j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe5", new Object[]{this})).longValue() : this.i;
    }

    public final float k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95762", new Object[]{this})).floatValue() : this.j;
    }

    public final RectF l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RectF) ipChange.ipc$dispatch("50d2c914", new Object[]{this}) : this.k;
    }

    public final float a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : this.f6799a;
    }

    public final float b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d9", new Object[]{this})).floatValue() : this.b;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.h = null;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(-129888091);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
