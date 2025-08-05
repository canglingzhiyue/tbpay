package com.taobao.phenix.animate;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.animate.AnimatedDrawableFrameInfo;
import com.taobao.pexode.d;
import com.taobao.rxm.schedule.f;
import com.taobao.rxm.schedule.g;
import com.taobao.rxm.schedule.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.niw;
import tb.nmv;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f18859a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private boolean g;
    private final j h;
    private final SparseArray<C0753a> i;
    private List<Bitmap> j;
    private AnimatedFrameCompositor k;
    private String l;
    private SparseArray<Runnable> m;
    private final g n = new b(this);
    private final Handler f = new Handler(Looper.getMainLooper());

    static {
        kge.a(-1019490973);
    }

    private boolean a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2619793f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue() : (i2 > i && i3 >= i && i3 < i2) || (i2 <= i && (i3 >= i || i3 < i2));
    }

    public static /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6200bc52", new Object[]{aVar});
        } else {
            aVar.b();
        }
    }

    /* renamed from: com.taobao.phenix.animate.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static class C0753a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Bitmap f18860a;
        private int b = 0;

        static {
            kge.a(1450031462);
        }

        public static /* synthetic */ int a(C0753a c0753a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e397e7e8", new Object[]{c0753a})).intValue();
            }
            int i = c0753a.b;
            c0753a.b = i + 1;
            return i;
        }

        public static /* synthetic */ Bitmap b(C0753a c0753a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("933cb332", new Object[]{c0753a}) : c0753a.f18860a;
        }

        public static /* synthetic */ int c(C0753a c0753a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cc1658a6", new Object[]{c0753a})).intValue() : c0753a.b;
        }

        public static /* synthetic */ int d(C0753a c0753a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("40559105", new Object[]{c0753a})).intValue();
            }
            int i = c0753a.b;
            c0753a.b = i - 1;
            return i;
        }

        public C0753a(Bitmap bitmap) {
            this.f18860a = bitmap;
        }
    }

    public a(com.taobao.pexode.animate.a aVar, j jVar, String str, boolean z) {
        this.l = str;
        this.f18859a = aVar.getWidth();
        this.b = aVar.getHeight();
        this.c = aVar.getFrameCount();
        int max = Math.max(1, 5242880 / ((this.f18859a * this.b) << 2));
        int max2 = Math.max(1, 2097152 / ((this.f18859a * this.b) << 2));
        int min = Math.min(Math.max(1, this.c), max);
        if (z && !com.taobao.phenix.intf.b.h().w()) {
            this.d = Math.max(min, 2);
        } else {
            this.d = min;
        }
        this.e = Math.min(Math.max(1, this.c / 2), max2);
        this.h = jVar;
        this.i = new SparseArray<>(this.d);
        this.j = new ArrayList(this.e);
        this.m = new SparseArray<>(this.d);
        this.k = new AnimatedFrameCompositor(aVar, this, str);
    }

    public synchronized Bitmap a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("81838179", new Object[]{this, new Integer(i)});
        }
        C0753a c0753a = this.i.get(i);
        if (c0753a == null) {
            return null;
        }
        C0753a.a(c0753a);
        return C0753a.b(c0753a);
    }

    private C0753a b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0753a) ipChange.ipc$dispatch("8f04dec7", new Object[]{this, new Integer(i)});
        }
        Bitmap bitmap = null;
        synchronized (this) {
            if (this.j.size() > 0) {
                bitmap = this.j.remove(0);
            }
        }
        if (bitmap == null && d.c()) {
            bitmap = com.taobao.pexode.common.a.a().b(this.f18859a, this.b, Bitmap.Config.ARGB_8888);
        }
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(this.f18859a, this.b, Bitmap.Config.ARGB_8888);
        }
        this.k.a(i, bitmap);
        return new C0753a(bitmap);
    }

    public synchronized void a(int i, int i2, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6230946", new Object[]{this, new Integer(i), new Integer(i2), runnable});
            return;
        }
        com.taobao.tcommon.core.b.a(i >= 0);
        com.taobao.tcommon.core.b.a(i2 > 0);
        if (i2 > this.d) {
            i2 = this.d;
        }
        int max = this.k.a(i).f == AnimatedDrawableFrameInfo.DisposalMode.DISPOSE_TO_PREVIOUS ? Math.max(0, i - 1) : i;
        int i3 = max;
        while (true) {
            if (i3 < 0) {
                i3 = -1;
                break;
            } else if (this.i.get(i3) != null) {
                break;
            } else {
                i3--;
            }
        }
        int i4 = (max + i2) % this.c;
        int i5 = 0;
        while (i5 < this.i.size()) {
            int keyAt = this.i.keyAt(i5);
            if (keyAt != i3 && !a(max, i4, keyAt)) {
                C0753a valueAt = this.i.valueAt(i5);
                this.i.removeAt(i5);
                if (valueAt != null && C0753a.c(valueAt) <= 0) {
                    b(C0753a.b(valueAt));
                }
            }
            i5++;
        }
        int i6 = 0;
        while (i6 < this.m.size()) {
            if (a(max, i2, this.m.keyAt(i6))) {
                i6++;
            } else {
                this.m.removeAt(i6);
            }
        }
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = (max + i7) % this.c;
            if (this.i.get(i8) != null) {
                if (i == i8) {
                    this.f.post(runnable);
                }
            } else if (i == i8) {
                this.m.put(i8, runnable);
            } else {
                this.m.put(i8, null);
            }
        }
        if (!this.g) {
            this.g = true;
            this.h.a(this.n);
        }
    }

    public void a(int i, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5a299", new Object[]{this, new Integer(i), runnable});
        } else {
            a(i, this.d, runnable);
        }
    }

    private void b() {
        int keyAt;
        Runnable valueAt;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        while (true) {
            synchronized (this) {
                if (this.m.size() <= 0) {
                    this.g = false;
                    return;
                }
                keyAt = this.m.keyAt(0);
                valueAt = this.m.valueAt(0);
                this.m.removeAt(0);
            }
            synchronized (this) {
                z = this.i.get(keyAt) == null;
            }
            if (z) {
                C0753a b2 = b(keyAt);
                synchronized (this) {
                    this.i.put(keyAt, b2);
                }
            }
            if (valueAt != null) {
                this.f.post(valueAt);
            }
        }
    }

    public synchronized void a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc0f2c6", new Object[]{this, bitmap});
            return;
        }
        int size = this.i.size();
        while (true) {
            if (i < size) {
                C0753a valueAt = this.i.valueAt(i);
                if (valueAt != null && C0753a.b(valueAt) == bitmap) {
                    C0753a.d(valueAt);
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        if (i == size) {
            b(bitmap);
        }
    }

    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.k.a();
        this.m.clear();
        this.i.clear();
        this.j.clear();
        niw.a("AnimatedImage", "%s dropped frame caches", this.l);
    }

    private void b(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6d9e65", new Object[]{this, bitmap});
        } else if (this.j.size() >= this.e || bitmap == null || !bitmap.isMutable() || bitmap.getWidth() != this.f18859a || bitmap.getHeight() != this.b || this.j.contains(bitmap)) {
        } else {
            this.j.add(bitmap);
        }
    }

    /* loaded from: classes7.dex */
    public static class b extends g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<a> f18861a;

        static {
            kge.a(-1118661987);
        }

        public b(a aVar) {
            super(1, null, null, false);
            this.f18861a = new WeakReference<>(aVar);
        }

        @Override // com.taobao.rxm.schedule.g
        public void a(nmv nmvVar, f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d6a83457", new Object[]{this, nmvVar, fVar});
                return;
            }
            a aVar = this.f18861a.get();
            if (aVar == null) {
                return;
            }
            a.a(aVar);
        }
    }
}
