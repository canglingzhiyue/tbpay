package com.taobao.phenix.animate;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.cache.memory.e;
import com.taobao.rxm.schedule.k;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import tb.kge;
import tb.nin;
import tb.niw;
import tb.riy;

/* loaded from: classes7.dex */
public class b extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static k f18862a;
    private final Handler A;
    private final int b;
    private final int c;
    private int d;
    private Bitmap e;
    private int[] f;
    private c g;
    private boolean h;
    private final Runnable i;
    private final Runnable j;
    private final Runnable k;
    private final Runnable l;
    private final int m;
    private final int n;
    private boolean o;
    private boolean p;
    private long q;
    private long r;
    private int s;
    private int t;
    private int u;
    private com.taobao.phenix.animate.a v;
    private boolean w;
    private int[] x;
    private int y;
    private int z;

    static {
        kge.a(1194738140);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        return -3;
    }

    public static /* synthetic */ void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("620130b1", new Object[]{bVar});
        } else {
            bVar.q();
        }
    }

    /* loaded from: classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int INVALIDATE_TYPE = 2;
        public static final int NEXT_TYPE = 1;
        public static final int START_TYPE = 0;
        public static final int TIMEOUT_FOR_DRAW_TYPE = 3;

        /* renamed from: a  reason: collision with root package name */
        private int f18863a;
        private WeakReference<b> b;

        static {
            kge.a(1465358098);
            kge.a(-1390502639);
        }

        public a(b bVar, int i) {
            this.b = new WeakReference<>(bVar);
            this.f18863a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            b bVar = this.b.get();
            if (bVar == null) {
                return;
            }
            int i = this.f18863a;
            if (i == 0) {
                bVar.a();
            } else if (i == 1) {
                bVar.d();
            } else if (i == 2) {
                b.a(bVar);
            } else if (i != 3) {
            } else {
                bVar.g();
            }
        }
    }

    public b(com.taobao.pexode.animate.a aVar) {
        this(null, null, 0, 0, aVar);
    }

    public b(String str, String str2, int i, int i2, com.taobao.pexode.animate.a aVar) {
        super(str, str2, i, i2);
        this.i = new a(this, 0);
        this.j = new a(this, 1);
        this.k = new a(this, 2);
        this.l = new a(this, 3);
        this.A = new Handler(Looper.getMainLooper());
        this.b = aVar.getWidth();
        this.c = aVar.getHeight();
        this.f = aVar.getFrameDurations();
        this.d = aVar.getLoopCount();
        this.m = aVar.getFrameCount();
        this.y = 0;
        this.z = 0;
        this.r = -1L;
        this.w = true;
        this.p = true;
        this.n = p();
        this.h = com.taobao.phenix.intf.b.h().z();
        k j = com.taobao.phenix.intf.b.h().j();
        if (j == null) {
            synchronized (b.class) {
                if (f18862a == null) {
                    f18862a = new nin(null, 0, 3, 8, 5, 1500, 3, 0, 0);
                }
            }
            j = f18862a;
        }
        this.v = new com.taobao.phenix.animate.a(aVar, j.c(), toString(), this.h);
    }

    private int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue();
        }
        this.x = new int[this.m];
        int i = 0;
        for (int i2 = 0; i2 < this.m; i2++) {
            int[] iArr = this.f;
            if (iArr[i2] < 11) {
                iArr[i2] = 100;
            }
            this.x[i2] = i;
            i += this.f[i2];
        }
        return i;
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        this.w = true;
        this.A.removeCallbacks(this.l);
        this.A.postDelayed(this.l, 1000L);
        invalidateSelf();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.p) {
        } else {
            if (this.o) {
                this.y = this.s;
            } else {
                this.s = 0;
                this.t = 0;
                this.y = 0;
            }
            q();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.n == 0 || this.m <= 0) {
        } else {
            this.p = true;
            scheduleSelf(this.i, SystemClock.uptimeMillis());
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.p;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.r = -1L;
        if (!this.p || this.n == 0 || this.m <= 1) {
            return;
        }
        a(true, false);
    }

    private int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue();
        }
        int binarySearch = Arrays.binarySearch(this.x, i);
        return binarySearch < 0 ? ((-binarySearch) - 1) - 1 : binarySearch;
    }

    private void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (this.n == 0) {
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = uptimeMillis - this.q;
            int i = this.n;
            int i2 = (int) (j / i);
            int i3 = (int) (j % i);
            int b = b(i3);
            boolean z3 = this.s != b;
            this.s = b;
            int i4 = this.m;
            this.t = (i2 * i4) + b;
            if (!z) {
                return;
            }
            if (z3) {
                niw.a("AnimatedImage", "%s schedule next frame changed to %d, drawing=%b, now=%d", this, Integer.valueOf(this.s), Boolean.valueOf(z2), Long.valueOf(uptimeMillis));
                q();
                return;
            }
            int[] iArr = this.x;
            int i5 = this.s;
            int i6 = (i5 + 1) % i4;
            long j2 = ((iArr[i5] + this.f[i5]) - i3) + uptimeMillis + 10;
            long j3 = this.r;
            if (j3 != -1 && j3 <= j2) {
                return;
            }
            niw.a("AnimatedImage", "%s schedule next frame=%d at %d[last:%d], drawing=%b, now=%d", this, Integer.valueOf(i6), Long.valueOf(j2), Long.valueOf(this.r), Boolean.valueOf(z2), Long.valueOf(uptimeMillis));
            unscheduleSelf(this.j);
            scheduleSelf(this.j, j2);
            this.r = j2;
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6201a510", new Object[]{this, cVar});
        } else {
            this.g = cVar;
        }
    }

    private boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        Bitmap a2 = this.v.a(i);
        if (a2 == null) {
            return false;
        }
        Bitmap bitmap = this.e;
        if (bitmap != null) {
            this.v.a(bitmap);
        }
        this.e = a2;
        int i3 = this.u;
        if (i2 - i3 > 1) {
            niw.c("AnimatedImage", "%s dropped %d frames", this, Integer.valueOf((i2 - i3) - 1));
        }
        this.u = i2;
        return true;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Runnable runnable;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        niw.a("AnimatedImage", "%s start to draw, waiting=%b, playing=%b", this, Boolean.valueOf(this.w), Boolean.valueOf(this.p));
        this.A.removeCallbacks(this.l);
        if (this.w && (this.p || this.e == null)) {
            this.w = false;
            try {
                if (this.y >= 0) {
                    this.q = SystemClock.uptimeMillis() - this.x[this.y];
                }
                a(false, true);
                int i2 = this.s;
                int i3 = this.t;
                int i4 = this.u;
                boolean a2 = a(i2, i3);
                niw.a("AnimatedImage", "%s drew frame=%d|%d, success=%B", this, Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(a2));
                if (a2) {
                    boolean z = this.y == i2;
                    if (z) {
                        this.y = -1;
                    }
                    int i5 = this.z + ((i3 + 1) / this.m);
                    boolean z2 = i5 != this.z + ((i4 + 1) / this.m);
                    if ((((z && this.z == 0 && i3 == 0) || z2) && this.g != null && !this.g.onLoopCompleted(i5, this.d)) || (z2 && this.d != 0 && i5 >= this.d)) {
                        this.p = false;
                    } else {
                        a(true, true);
                    }
                    if (!this.p) {
                        r();
                    }
                }
                if (this.p || this.e == null) {
                    if (a2) {
                        runnable = null;
                        i = 1;
                    } else {
                        runnable = this.k;
                        i = 0;
                    }
                    if (this.p) {
                        this.v.a((i2 + i) % this.m, runnable);
                    } else {
                        this.v.a((i2 + i) % this.m, 1, runnable);
                    }
                }
            } catch (Throwable th) {
                niw.d("AnimatedImage", "%s frame render error=%s", this, th);
            }
        }
        Bitmap bitmap = this.e;
        if (bitmap == null) {
            return;
        }
        canvas.drawBitmap(bitmap, (Rect) null, getBounds(), (Paint) null);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            a(true);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.o = true;
        this.p = false;
        if (z) {
            this.v.a();
        }
        this.z += (this.t + 1) / this.m;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.o = false;
        this.p = false;
        r();
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        this.z = 0;
        this.v.a();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        unscheduleSelf(this.j);
        this.r = -1L;
        this.y = 0;
        this.u = 0;
        this.e = null;
        r();
        niw.a("AnimatedImage", "%s timeout for draw, maybe terminate", this);
    }

    public Bitmap h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("dda342cd", new Object[]{this}) : this.e;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2990b5b1", new Object[]{this})).intValue() : this.b;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c2b8a1d0", new Object[]{this})).intValue() : this.c;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.m;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.n;
    }

    @Override // com.taobao.phenix.cache.memory.e
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AnimatedImageDrawable(" + Integer.toHexString(hashCode()) + ", key@" + l() + riy.BRACKET_END_STR;
    }
}
