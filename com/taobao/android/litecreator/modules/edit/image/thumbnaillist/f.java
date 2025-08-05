package com.taobao.android.litecreator.modules.edit.image.thumbnaillist;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.u;
import tb.kge;

/* loaded from: classes5.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Interpolator f13359a;
    private View b;
    private int d;
    private long e;
    private float f;
    private a g;
    private final b j;
    private final b k;
    private int l;
    private int m;
    private boolean c = true;
    private final Handler n = new Handler(Looper.getMainLooper()) { // from class: com.taobao.android.litecreator.modules.edit.image.thumbnaillist.f.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            if (message.what == 1) {
                if (!f.a(f.this)) {
                    f.b(f.this).sendEmptyMessageDelayed(1, 20L);
                } else if (f.c(f.this) != null) {
                    f.c(f.this);
                    f.d(f.this);
                }
            }
            super.handleMessage(message);
        }
    };
    private final b h = new b();
    private final b i = new b();

    /* loaded from: classes5.dex */
    public interface a {
    }

    static {
        kge.a(102028999);
    }

    private int a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2619792e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (i < i2) {
            return i2 - i;
        }
        if (i != i2) {
            return i3 - i2;
        }
        return 0;
    }

    private int b(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8dfaa60d", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (i > i3) {
            return i3 - i;
        }
        if (i != i3) {
            return i2 - i3;
        }
        return 0;
    }

    public static /* synthetic */ boolean a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c66f0a69", new Object[]{fVar})).booleanValue() : fVar.d();
    }

    public static /* synthetic */ Handler b(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("ed688102", new Object[]{fVar}) : fVar.n;
    }

    public static /* synthetic */ a c(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("1e01c103", new Object[]{fVar}) : fVar.g;
    }

    public static /* synthetic */ View d(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("c50a44c4", new Object[]{fVar}) : fVar.b;
    }

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f13361a;
        public int b;

        static {
            kge.a(-19690077);
        }

        public b(int i, int i2) {
            this.f13361a = i;
            this.b = i2;
        }

        public b() {
        }
    }

    public f(int i, int i2, int i3, int i4, int i5) {
        this.d = i5;
        this.j = new b(i, i3);
        this.k = new b(i2, i4);
    }

    public void a(Interpolator interpolator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ade445bd", new Object[]{this, interpolator});
        } else {
            this.f13359a = interpolator;
        }
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (this.c) {
            return true;
        }
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.e);
        if (elapsedRealtime <= this.d) {
            float f = elapsedRealtime * this.f;
            Interpolator interpolator = this.f13359a;
            if (interpolator != null) {
                f = interpolator.getInterpolation(f);
            }
            this.i.b = this.h.b + Math.round(this.m * f);
            this.i.f13361a = this.h.f13361a + Math.round(f * this.l);
        } else {
            this.c = true;
            this.i.b = this.h.b + this.m;
            this.i.f13361a = this.h.f13361a + this.l;
        }
        e();
        return this.c;
    }

    public void a(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b3caa", new Object[]{this, view, new Boolean(z)});
        } else if (view == null) {
        } else {
            this.b = view;
            if (!this.c) {
                return;
            }
            this.f = 1.0f / this.d;
            b bVar = this.h;
            b bVar2 = this.i;
            int height = this.b.getHeight();
            bVar2.f13361a = height;
            bVar.f13361a = height;
            b bVar3 = this.h;
            b bVar4 = this.i;
            int width = this.b.getWidth();
            bVar4.b = width;
            bVar3.b = width;
            if (z) {
                if (this.i.b >= this.j.b || this.i.f13361a >= this.j.f13361a) {
                    u.a("ThumbnailStretchAnimationHelper", "startAnimation fail when stretch out");
                    return;
                } else {
                    this.l = a(this.i.f13361a, this.j.f13361a, this.k.f13361a);
                    this.m = a(this.i.b, this.j.b, this.k.b);
                }
            } else if (this.i.b <= this.k.b || this.i.f13361a <= this.k.f13361a) {
                u.a("ThumbnailStretchAnimationHelper", "startAnimation fail when draw back");
                return;
            } else {
                this.l = b(this.i.f13361a, this.j.f13361a, this.k.f13361a);
                this.m = b(this.i.b, this.j.b, this.k.b);
            }
            if (this.l == 0 || this.m == 0) {
                return;
            }
            this.c = false;
            this.e = SystemClock.elapsedRealtime();
            this.n.sendEmptyMessage(1);
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        View view = this.b;
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        layoutParams.height = this.i.f13361a;
        layoutParams.width = this.i.b;
        this.b.setLayoutParams(layoutParams);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.c;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.n.removeCallbacksAndMessages(null);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.c = true;
        this.n.removeCallbacksAndMessages(null);
    }
}
