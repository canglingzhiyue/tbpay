package com.taobao.android.tbsku.image;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class k implements View.OnLayoutChangeListener, View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static float f15423a;
    private static float b;
    private static float c;
    private static int d;
    private static int e;
    private View.OnLongClickListener A;
    private g B;
    private h C;
    private i D;
    private b E;
    private float H;
    private ImageView n;
    private GestureDetector o;
    private com.taobao.android.tbsku.image.b p;
    private d v;
    private f w;
    private e x;
    private j y;
    private View.OnClickListener z;
    private Interpolator f = new AccelerateDecelerateInterpolator();
    private int g = d;
    private float h = c;
    private float i = b;
    private float j = f15423a;
    private boolean k = true;
    private boolean l = false;
    private boolean m = false;
    private final Matrix q = new Matrix();
    private final Matrix r = new Matrix();
    private final Matrix s = new Matrix();
    private final RectF t = new RectF();
    private final float[] u = new float[9];
    private int F = 2;
    private int G = 2;
    private boolean I = true;
    private ImageView.ScaleType J = ImageView.ScaleType.FIT_CENTER;
    private c K = new c() { // from class: com.taobao.android.tbsku.image.k.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.tbsku.image.c
        public void a(float f, float f2, float f3, float f4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97cbe868", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            } else if (k.a(k.this).a()) {
            } else {
                if (k.b(k.this) != null) {
                    k.b(k.this);
                }
                k.c(k.this).postTranslate(f, f2);
                k.d(k.this);
                ViewParent parent = k.e(k.this).getParent();
                if (!k.f(k.this) || k.a(k.this).a() || k.g(k.this) || k.h(k.this)) {
                    if (parent == null) {
                        return;
                    }
                    parent.requestDisallowInterceptTouchEvent(true);
                } else if ((k.i(k.this) != 2 && ((k.i(k.this) != 0 || f < 1.0f) && ((k.i(k.this) != 1 || f > -1.0f) && ((k.j(k.this) != 0 || f2 < 1.0f) && (k.j(k.this) != 1 || f2 > -1.0f))))) || parent == null) {
                } else {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            }
        }

        @Override // com.taobao.android.tbsku.image.c
        public void b(float f, float f2, float f3, float f4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c105769", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
                return;
            }
            k kVar = k.this;
            k.a(kVar, new b(k.e(kVar).getContext()));
            b k = k.k(k.this);
            k kVar2 = k.this;
            int a2 = k.a(kVar2, k.e(kVar2));
            k kVar3 = k.this;
            k.a(a2, k.b(kVar3, k.e(kVar3)), (int) f3, (int) f4);
            k.e(k.this).post(k.k(k.this));
        }

        @Override // com.taobao.android.tbsku.image.c
        public void a(float f, float f2, float f3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25edca58", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
            } else if (k.this.e() >= k.l(k.this) && f >= 1.0f) {
            } else {
                if (k.m(k.this) != null) {
                    k.m(k.this);
                }
                k.c(k.this).postScale(f, f, f2, f3);
                k.d(k.this);
            }
        }
    };

    /* renamed from: com.taobao.android.tbsku.image.k$4  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15427a = new int[ImageView.ScaleType.values().length];

        static {
            try {
                f15427a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15427a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15427a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15427a[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static /* synthetic */ int a(k kVar, ImageView imageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("87d03420", new Object[]{kVar, imageView})).intValue() : kVar.a(imageView);
    }

    public static /* synthetic */ com.taobao.android.tbsku.image.b a(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.tbsku.image.b) ipChange.ipc$dispatch("83332ff7", new Object[]{kVar}) : kVar.p;
    }

    public static /* synthetic */ b a(k kVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("8d577023", new Object[]{kVar, bVar});
        }
        kVar.E = bVar;
        return bVar;
    }

    public static /* synthetic */ int b(k kVar, ImageView imageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d58fac21", new Object[]{kVar, imageView})).intValue() : kVar.b(imageView);
    }

    public static /* synthetic */ i b(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("57de5af", new Object[]{kVar}) : kVar.D;
    }

    public static /* synthetic */ Matrix c(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Matrix) ipChange.ipc$dispatch("fe75ac41", new Object[]{kVar}) : kVar.s;
    }

    public static /* synthetic */ void d(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e63b7f6", new Object[]{kVar});
        } else {
            kVar.n();
        }
    }

    public static /* synthetic */ ImageView e(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("65498c39", new Object[]{kVar}) : kVar.n;
    }

    public static /* synthetic */ boolean f(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d065a67c", new Object[]{kVar})).booleanValue() : kVar.k;
    }

    public static /* synthetic */ boolean g(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("99669dbd", new Object[]{kVar})).booleanValue() : kVar.l;
    }

    public static /* synthetic */ boolean h(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("626794fe", new Object[]{kVar})).booleanValue() : kVar.m;
    }

    public static /* synthetic */ int i(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2b688c2e", new Object[]{kVar})).intValue() : kVar.F;
    }

    public static /* synthetic */ float j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe1", new Object[0])).floatValue() : c;
    }

    public static /* synthetic */ int j(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f469836f", new Object[]{kVar})).intValue() : kVar.G;
    }

    public static /* synthetic */ int k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95765", new Object[0])).intValue() : e;
    }

    public static /* synthetic */ b k(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("8b949686", new Object[]{kVar}) : kVar.E;
    }

    public static /* synthetic */ float l(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("866b71ee", new Object[]{kVar})).floatValue() : kVar.j;
    }

    public static /* synthetic */ g m(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("9eb3ab06", new Object[]{kVar}) : kVar.B;
    }

    public static /* synthetic */ View.OnLongClickListener n(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnLongClickListener) ipChange.ipc$dispatch("ae082885", new Object[]{kVar}) : kVar.A;
    }

    public static /* synthetic */ h o(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("a34914e3", new Object[]{kVar}) : kVar.C;
    }

    public static /* synthetic */ View.OnClickListener p(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("4ecfc1eb", new Object[]{kVar}) : kVar.z;
    }

    public static /* synthetic */ j q(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("a7de7edf", new Object[]{kVar}) : kVar.y;
    }

    public static /* synthetic */ f r(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("2a293342", new Object[]{kVar}) : kVar.w;
    }

    public static /* synthetic */ e s(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("ac73e802", new Object[]{kVar}) : kVar.x;
    }

    public static /* synthetic */ c t(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("2ebe9ca3", new Object[]{kVar}) : kVar.K;
    }

    public static /* synthetic */ int u(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9774233a", new Object[]{kVar})).intValue() : kVar.g;
    }

    public static /* synthetic */ Interpolator v(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Interpolator) ipChange.ipc$dispatch("54a3da9d", new Object[]{kVar}) : kVar.f;
    }

    static {
        kge.a(394733282);
        kge.a(-468432129);
        kge.a(-782512414);
        f15423a = 3.0f;
        b = 1.75f;
        c = 1.0f;
        d = 200;
        e = 1;
    }

    public k(ImageView imageView) {
        this.n = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.H = 0.0f;
        this.p = new com.taobao.android.tbsku.image.b(imageView.getContext(), this.K);
        this.o = new GestureDetector(imageView.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.taobao.android.tbsku.image.k.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
                } else if (k.n(k.this) == null) {
                } else {
                    k.n(k.this).onLongClick(k.e(k.this));
                }
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
                }
                if (k.o(k.this) != null && k.this.e() <= k.j() && motionEvent.getPointerCount() <= k.k() && motionEvent2.getPointerCount() <= k.k()) {
                    return k.o(k.this).a(motionEvent, motionEvent2, f, f2);
                }
                return false;
            }
        });
        this.o.setOnDoubleTapListener(new GestureDetector.OnDoubleTapListener() { // from class: com.taobao.android.tbsku.image.k.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTapEvent(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("886c5d07", new Object[]{this, motionEvent})).booleanValue();
                }
                return false;
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("d156fc43", new Object[]{this, motionEvent})).booleanValue();
                }
                if (k.p(k.this) != null) {
                    k.p(k.this).onClick(k.e(k.this));
                }
                RectF a2 = k.this.a();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (k.q(k.this) != null) {
                    k.q(k.this);
                    k.e(k.this);
                }
                if (a2 != null) {
                    if (a2.contains(x, y)) {
                        float f = a2.left;
                        a2.width();
                        float f2 = a2.top;
                        a2.height();
                        if (k.r(k.this) != null) {
                            k.r(k.this);
                            k.e(k.this);
                        }
                        return true;
                    } else if (k.s(k.this) != null) {
                        k.s(k.this);
                        k.e(k.this);
                    }
                }
                return false;
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("7a319393", new Object[]{this, motionEvent})).booleanValue();
                }
                try {
                    float e2 = k.this.e();
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (e2 < k.this.c()) {
                        k.this.a(k.this.c(), x, y, true);
                    } else if (e2 >= k.this.c() && e2 < k.this.d()) {
                        k.this.a(k.this.d(), x, y, true);
                    } else {
                        k.this.a(k.this.b(), x, y, true);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
                return true;
            }
        });
    }

    public void a(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b71b68f", new Object[]{this, onDoubleTapListener});
        } else {
            this.o.setOnDoubleTapListener(onDoubleTapListener);
        }
    }

    public void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e35f00b7", new Object[]{this, gVar});
        } else {
            this.B = gVar;
        }
    }

    public void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e35f7516", new Object[]{this, hVar});
        } else {
            this.C = hVar;
        }
    }

    public RectF a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("f7d777ff", new Object[]{this});
        }
        o();
        return e(l());
    }

    public boolean a(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5a4eaf8", new Object[]{this, matrix})).booleanValue();
        }
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix cannot be null");
        }
        if (this.n.getDrawable() == null) {
            return false;
        }
        this.s.set(matrix);
        n();
        return true;
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        this.s.setRotate(f % 360.0f);
        n();
    }

    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
            return;
        }
        this.s.postRotate(f % 360.0f);
        n();
    }

    public float b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d9", new Object[]{this})).floatValue() : this.h;
    }

    public float c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5a", new Object[]{this})).floatValue() : this.i;
    }

    public float d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2db", new Object[]{this})).floatValue() : this.j;
    }

    public float e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[]{this})).floatValue() : (float) Math.sqrt(((float) Math.pow(a(this.s, 0), 2.0d)) + ((float) Math.pow(a(this.s, 3), 2.0d)));
    }

    public ImageView.ScaleType f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView.ScaleType) ipChange.ipc$dispatch("4bfc6463", new Object[]{this}) : this.J;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
        } else if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
        } else {
            a(this.n.getDrawable());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbsku.image.k.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public void c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b3996", new Object[]{this, new Float(f)});
            return;
        }
        m.a(f, this.i, this.j);
        this.h = f;
    }

    public void d(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401235", new Object[]{this, new Float(f)});
            return;
        }
        m.a(this.h, f, this.j);
        this.i = f;
    }

    public void e(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4ead4", new Object[]{this, new Float(f)});
            return;
        }
        m.a(this.h, this.i, f);
        this.j = f;
    }

    public void a(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25edca58", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
            return;
        }
        m.a(f, f2, f3);
        this.h = f;
        this.i = f2;
        this.j = f3;
    }

    public void a(View.OnLongClickListener onLongClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f1d2ed", new Object[]{this, onLongClickListener});
        } else {
            this.A = onLongClickListener;
        }
    }

    public void a(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7931bad1", new Object[]{this, onClickListener});
        } else {
            this.z = onClickListener;
        }
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e35da39a", new Object[]{this, dVar});
        } else {
            this.v = dVar;
        }
    }

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e35e8c58", new Object[]{this, fVar});
        } else {
            this.w = fVar;
        }
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e35e17f9", new Object[]{this, eVar});
        } else {
            this.x = eVar;
        }
    }

    public void a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3605dd4", new Object[]{this, jVar});
        } else {
            this.y = jVar;
        }
    }

    public void a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e35fe975", new Object[]{this, iVar});
        } else {
            this.D = iVar;
        }
    }

    public void f(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9c373", new Object[]{this, new Float(f)});
        } else {
            a(f, false);
        }
    }

    public void a(float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c10357c", new Object[]{this, new Float(f), new Boolean(z)});
        } else {
            a(f, this.n.getRight() / 2, this.n.getBottom() / 2, z);
        }
    }

    public void a(float f, float f2, float f3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97cc337c", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Boolean(z)});
        } else if (f < this.h || f > this.j) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        } else {
            if (z) {
                this.n.post(new a(e(), f, f2, f3));
                return;
            }
            this.s.setScale(f, f, f2, f3);
            n();
        }
    }

    public void a(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91bcf1c2", new Object[]{this, scaleType});
        } else if (!m.a(scaleType) || scaleType == this.J) {
        } else {
            this.J = scaleType;
            h();
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.I;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.I = z;
        h();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.I) {
            a(this.n.getDrawable());
        } else {
            m();
        }
    }

    public void b(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6519693", new Object[]{this, matrix});
        } else {
            matrix.set(l());
        }
    }

    public void c(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6fe4232", new Object[]{this, matrix});
        } else {
            matrix.set(this.s);
        }
    }

    private Matrix l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("bb23007f", new Object[]{this});
        }
        this.r.set(this.q);
        this.r.postConcat(this.s);
        return this.r;
    }

    public Matrix i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Matrix) ipChange.ipc$dispatch("3f3352fc", new Object[]{this}) : this.r;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    private float a(Matrix matrix, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("def8e67f", new Object[]{this, matrix, new Integer(i)})).floatValue();
        }
        matrix.getValues(this.u);
        return this.u[i];
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        this.s.reset();
        b(this.H);
        d(l());
        o();
    }

    private void d(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7aaedd1", new Object[]{this, matrix});
            return;
        }
        this.n.setImageMatrix(matrix);
        if (this.v == null) {
            return;
        }
        e(matrix);
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (!o()) {
        } else {
            d(l());
        }
    }

    private RectF e(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("32b621f7", new Object[]{this, matrix});
        }
        Drawable drawable = this.n.getDrawable();
        if (drawable == null) {
            return null;
        }
        this.t.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(this.t);
        return this.t;
    }

    private void a(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
        } else if (drawable == null) {
        } else {
            float a2 = a(this.n);
            float b2 = b(this.n);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            this.q.reset();
            float f = intrinsicWidth;
            float f2 = a2 / f;
            float f3 = intrinsicHeight;
            float f4 = b2 / f3;
            if (this.J == ImageView.ScaleType.CENTER) {
                this.q.postTranslate((a2 - f) / 2.0f, (b2 - f3) / 2.0f);
            } else if (this.J == ImageView.ScaleType.CENTER_CROP) {
                float max = Math.max(f2, f4);
                this.q.postScale(max, max);
                this.q.postTranslate((a2 - (f * max)) / 2.0f, (b2 - (f3 * max)) / 2.0f);
            } else if (this.J == ImageView.ScaleType.CENTER_INSIDE) {
                float min = Math.min(1.0f, Math.min(f2, f4));
                this.q.postScale(min, min);
                this.q.postTranslate((a2 - (f * min)) / 2.0f, (b2 - (f3 * min)) / 2.0f);
            } else {
                RectF rectF = new RectF(0.0f, 0.0f, f, f3);
                RectF rectF2 = new RectF(0.0f, 0.0f, a2, b2);
                if (((int) this.H) % 180 != 0) {
                    rectF = new RectF(0.0f, 0.0f, f3, f);
                }
                int i = AnonymousClass4.f15427a[this.J.ordinal()];
                if (i == 1) {
                    this.q.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
                } else if (i == 2) {
                    this.q.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
                } else if (i == 3) {
                    this.q.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
                } else if (i == 4) {
                    this.q.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
                }
            }
            m();
        }
    }

    private boolean o() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
        }
        RectF e2 = e(l());
        if (e2 == null) {
            return false;
        }
        float height = e2.height();
        float width = e2.width();
        float b2 = b(this.n);
        float f7 = 0.0f;
        if (height <= b2) {
            int i = AnonymousClass4.f15427a[this.J.ordinal()];
            if (i != 2) {
                if (i == 3) {
                    f5 = b2 - height;
                    f6 = e2.top;
                } else {
                    f5 = (b2 - height) / 2.0f;
                    f6 = e2.top;
                }
                f4 = f5 - f6;
            } else {
                f4 = -e2.top;
            }
            this.G = 2;
            f = f4;
        } else if (e2.top > 0.0f) {
            this.G = 0;
            f = -e2.top;
        } else if (e2.bottom < b2) {
            this.G = 1;
            f = b2 - e2.bottom;
        } else {
            this.G = -1;
            f = 0.0f;
        }
        float a2 = a(this.n);
        if (width <= a2) {
            int i2 = AnonymousClass4.f15427a[this.J.ordinal()];
            if (i2 != 2) {
                if (i2 == 3) {
                    f2 = a2 - width;
                    f3 = e2.left;
                } else {
                    f2 = (a2 - width) / 2.0f;
                    f3 = e2.left;
                }
                f7 = f2 - f3;
            } else {
                f7 = -e2.left;
            }
            this.F = 2;
        } else if (e2.left > 0.0f) {
            this.F = 0;
            f7 = -e2.left;
        } else if (e2.right < a2) {
            f7 = a2 - e2.right;
            this.F = 1;
        } else {
            this.F = -1;
        }
        this.s.postTranslate(f7, f);
        return true;
    }

    private int a(ImageView imageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("83f7c615", new Object[]{this, imageView})).intValue() : (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    private int b(ImageView imageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("98e08e56", new Object[]{this, imageView})).intValue() : (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        b bVar = this.E;
        if (bVar == null) {
            return;
        }
        bVar.a();
        this.E = null;
    }

    /* loaded from: classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final float b;
        private final float c;
        private final long d = System.currentTimeMillis();
        private final float e;
        private final float f;

        static {
            kge.a(953683445);
            kge.a(-1390502639);
        }

        public a(float f, float f2, float f3, float f4) {
            this.b = f3;
            this.c = f4;
            this.e = f;
            this.f = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            float a2 = a();
            float f = this.e;
            k.t(k.this).a((f + ((this.f - f) * a2)) / k.this.e(), this.b, this.c);
            if (a2 >= 1.0f) {
                return;
            }
            com.taobao.android.tbsku.image.a.a(k.e(k.this), this);
        }

        private float a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : k.v(k.this).getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.d)) * 1.0f) / k.u(k.this)));
        }
    }

    /* loaded from: classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final OverScroller b;
        private int c;
        private int d;

        static {
            kge.a(-454744521);
            kge.a(-1390502639);
        }

        public b(Context context) {
            this.b = new OverScroller(context);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.b.forceFinished(true);
            }
        }

        public void a(int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            RectF a2 = k.this.a();
            if (a2 == null) {
                return;
            }
            int round = Math.round(-a2.left);
            float f = i;
            if (f < a2.width()) {
                i6 = Math.round(a2.width() - f);
                i5 = 0;
            } else {
                i5 = round;
                i6 = i5;
            }
            int round2 = Math.round(-a2.top);
            float f2 = i2;
            if (f2 < a2.height()) {
                i8 = Math.round(a2.height() - f2);
                i7 = 0;
            } else {
                i7 = round2;
                i8 = i7;
            }
            this.c = round;
            this.d = round2;
            if (round == i6 && round2 == i8) {
                return;
            }
            this.b.fling(round, round2, i3, i4, i5, i6, i7, i8, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.b.isFinished() || !this.b.computeScrollOffset()) {
            } else {
                int currX = this.b.getCurrX();
                int currY = this.b.getCurrY();
                k.c(k.this).postTranslate(this.c - currX, this.d - currY);
                k.d(k.this);
                this.c = currX;
                this.d = currY;
                com.taobao.android.tbsku.image.a.a(k.e(k.this), this);
            }
        }
    }
}
