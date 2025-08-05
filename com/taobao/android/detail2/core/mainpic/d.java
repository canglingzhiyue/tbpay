package com.taobao.android.detail2.core.mainpic;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.global.NewDetailScreenConfig;
import tb.fjt;
import tb.fmd;
import tb.gbg;
import tb.kge;

/* loaded from: classes5.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static float f11663a;
    public static float b;
    private com.taobao.android.detail2.core.framework.b d;
    private fmd e;
    private a g;
    private float c = -1.0f;
    private int f = -1;

    /* renamed from: com.taobao.android.detail2.core.mainpic.d$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11664a = new int[NewDetailScreenConfig.ScreenType.values().length];

        static {
            try {
                f11664a[NewDetailScreenConfig.ScreenType.FOLD_DEVICE_LANDSCAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11664a[NewDetailScreenConfig.ScreenType.PAD_LANDSCAPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11664a[NewDetailScreenConfig.ScreenType.PAD_PORTRAIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static /* synthetic */ void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11cedec2", new Object[]{dVar});
        } else {
            dVar.b();
        }
    }

    static {
        kge.a(1691225973);
        f11663a = 120.0f;
        b = 30.0f;
    }

    /* loaded from: classes5.dex */
    public class a implements fmd.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1032647124);
            kge.a(-37335218);
        }

        private a() {
        }

        public /* synthetic */ a(d dVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // tb.fmd.d
        public void a(int i, int i2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2619b90c", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
            } else {
                d.a(d.this);
            }
        }
    }

    public d(com.taobao.android.detail2.core.framework.b bVar, fmd fmdVar) {
        this.d = bVar;
        this.e = fmdVar;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.taobao.android.detail2.core.framework.b bVar = this.d;
        if (bVar == null || bVar.g() == null) {
            this.c = f11663a;
            return;
        }
        NewDetailScreenConfig K = this.d.h().K();
        int i = AnonymousClass1.f11664a[K.f().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            a(K);
            return;
        }
        this.c = f11663a;
        fjt.a(fjt.TAG_TIP, "MainPicScrollSpeedForPhone: mSpeedPerDp:" + this.c);
    }

    private void a(NewDetailScreenConfig newDetailScreenConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("256067c1", new Object[]{this, newDetailScreenConfig});
            return;
        }
        int b2 = newDetailScreenConfig.b();
        float a2 = gbg.a((Context) this.d.g(), 480.0f);
        float f = b2 / a2;
        this.c = f11663a / f;
        float f2 = this.c;
        float f3 = b;
        if (f2 < f3) {
            this.c = f3;
        }
        fjt.a(fjt.TAG_TIP, "MainPicScrollSpeedForPad: standardWidth:" + a2 + " widthMultiple:" + f + " mSpeedPerDp:" + this.c);
    }

    public float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue();
        }
        if (this.c < 0.0f) {
            fjt.a(fjt.TAG_TIP, "MainPicScrollSpeed-CalculateSpeedPerDp call for init.");
            b();
            if (this.g == null && this.e != null) {
                this.g = new a(this, null);
                this.e.a(this.g);
            }
        }
        return this.c;
    }
}
