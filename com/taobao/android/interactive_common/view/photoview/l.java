package com.taobao.android.interactive_common.view.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v4.view.MotionEventCompat;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class l implements View.OnLayoutChangeListener, View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static float f12946a = 2.5f;
    private static float b = 1.75f;
    private static float c = 1.0f;
    private static float d = 0.5f;
    private static int e = 200;
    private static int f = 1;
    private j A;
    private g B;
    private h C;
    private i D;
    private b E;
    private float G;
    private ImageView n;
    private GestureDetector o;
    private com.taobao.android.interactive_common.view.photoview.b p;
    private d v;
    private f w;
    private e x;
    private k y;
    private View.OnClickListener z;
    private Interpolator g = new AccelerateDecelerateInterpolator();
    private int h = e;
    private float i = c;
    private float j = b;
    private float k = f12946a;
    private boolean l = true;
    private boolean m = false;
    private final Matrix q = new Matrix();
    private final Matrix r = new Matrix();
    private final Matrix s = new Matrix();
    private final RectF t = new RectF();
    private final float[] u = new float[9];
    private int F = 2;
    private boolean H = true;
    private ImageView.ScaleType I = ImageView.ScaleType.FIT_CENTER;
    private c J = new c() { // from class: com.taobao.android.interactive_common.view.photoview.l.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.interactive_common.view.photoview.c
        public void a(float f2, float f3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f2), new Float(f3)});
            } else if (l.a(l.this).a()) {
            } else {
                if (l.b(l.this) != null) {
                    l.b(l.this);
                }
                l.c(l.this).postTranslate(f2, f3);
                l.d(l.this);
                ViewParent parent = l.e(l.this).getParent();
                if (!l.f(l.this) || l.a(l.this).a() || l.g(l.this)) {
                    if (parent == null) {
                        return;
                    }
                    parent.requestDisallowInterceptTouchEvent(true);
                } else if ((l.h(l.this) != 2 && ((l.h(l.this) != 0 || f2 < 1.0f) && (l.h(l.this) != 1 || f2 > -1.0f))) || parent == null) {
                } else {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            }
        }

        @Override // com.taobao.android.interactive_common.view.photoview.c
        public void a(float f2, float f3, float f4, float f5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97cbe868", new Object[]{this, new Float(f2), new Float(f3), new Float(f4), new Float(f5)});
                return;
            }
            l lVar = l.this;
            l.a(lVar, new b(l.e(lVar).getContext()));
            b i = l.i(l.this);
            l lVar2 = l.this;
            int a2 = l.a(lVar2, l.e(lVar2));
            l lVar3 = l.this;
            i.a(a2, l.b(lVar3, l.e(lVar3)), (int) f4, (int) f5);
            l.e(l.this).post(l.i(l.this));
        }

        @Override // com.taobao.android.interactive_common.view.photoview.c
        public void a(float f2, float f3, float f4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25edca58", new Object[]{this, new Float(f2), new Float(f3), new Float(f4)});
            } else if (l.this.f() > l.j(l.this) + l.k() && f2 > 1.0f) {
            } else {
                if (l.this.f() < l.k(l.this) - l.k() && f2 < 1.0f) {
                    return;
                }
                if (l.l(l.this) != null) {
                    l.l(l.this).onScaleChange(l.this.f(), f3, f4);
                }
                l.c(l.this).postScale(f2, f2, f3, f4);
                l.d(l.this);
            }
        }
    };

    /* renamed from: com.taobao.android.interactive_common.view.photoview.l$4  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12950a = new int[ImageView.ScaleType.values().length];

        static {
            try {
                f12950a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12950a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12950a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12950a[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static /* synthetic */ int a(l lVar, ImageView imageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ccce3e66", new Object[]{lVar, imageView})).intValue() : lVar.a(imageView);
    }

    public static /* synthetic */ com.taobao.android.interactive_common.view.photoview.b a(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.interactive_common.view.photoview.b) ipChange.ipc$dispatch("f1d97498", new Object[]{lVar}) : lVar.p;
    }

    public static /* synthetic */ b a(l lVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("17a5b0dd", new Object[]{lVar, bVar});
        }
        lVar.E = bVar;
        return bVar;
    }

    public static /* synthetic */ int b(l lVar, ImageView imageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3b554fa7", new Object[]{lVar, imageView})).intValue() : lVar.b(imageView);
    }

    public static /* synthetic */ i b(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("67ef97d0", new Object[]{lVar}) : lVar.D;
    }

    public static /* synthetic */ Matrix c(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Matrix) ipChange.ipc$dispatch("6976287", new Object[]{lVar}) : lVar.s;
    }

    public static /* synthetic */ void d(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c3d097c", new Object[]{lVar});
        } else {
            lVar.p();
        }
    }

    public static /* synthetic */ ImageView e(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("efdf1c33", new Object[]{lVar}) : lVar.n;
    }

    public static /* synthetic */ boolean f(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c1284a82", new Object[]{lVar})).booleanValue() : lVar.l;
    }

    public static /* synthetic */ boolean g(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7b9deb03", new Object[]{lVar})).booleanValue() : lVar.m;
    }

    public static /* synthetic */ int h(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("36138b73", new Object[]{lVar})).intValue() : lVar.F;
    }

    public static /* synthetic */ b i(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("2a0b2508", new Object[]{lVar}) : lVar.E;
    }

    public static /* synthetic */ float j(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aafecc72", new Object[]{lVar})).floatValue() : lVar.k;
    }

    public static /* synthetic */ float k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95762", new Object[0])).floatValue() : d;
    }

    public static /* synthetic */ float k(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65746cf3", new Object[]{lVar})).floatValue() : lVar.i;
    }

    public static /* synthetic */ float l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee3", new Object[0])).floatValue() : c;
    }

    public static /* synthetic */ g l(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("4ccef48", new Object[]{lVar}) : lVar.B;
    }

    public static /* synthetic */ int m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158667", new Object[0])).intValue() : f;
    }

    public static /* synthetic */ j m(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("7ae31204", new Object[]{lVar}) : lVar.A;
    }

    public static /* synthetic */ h n(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("f0f93425", new Object[]{lVar}) : lVar.C;
    }

    public static /* synthetic */ View.OnClickListener o(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("76ff20b0", new Object[]{lVar}) : lVar.z;
    }

    public static /* synthetic */ k p(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("dd257940", new Object[]{lVar}) : lVar.y;
    }

    public static /* synthetic */ f q(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("533b9b04", new Object[]{lVar}) : lVar.w;
    }

    public static /* synthetic */ e r(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("c951bd44", new Object[]{lVar}) : lVar.x;
    }

    public static /* synthetic */ c s(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("3f67df65", new Object[]{lVar}) : lVar.J;
    }

    public static /* synthetic */ int t(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f397117f", new Object[]{lVar})).intValue() : lVar.h;
    }

    public static /* synthetic */ Interpolator u(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Interpolator) ipChange.ipc$dispatch("16acd3a2", new Object[]{lVar}) : lVar.g;
    }

    public l(ImageView imageView) {
        this.n = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.G = 0.0f;
        this.p = new com.taobao.android.interactive_common.view.photoview.b(imageView.getContext(), this.J);
        this.o = new GestureDetector(imageView.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.taobao.android.interactive_common.view.photoview.l.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
                } else if (l.m(l.this) == null) {
                } else {
                    l.m(l.this).a(l.e(l.this), motionEvent);
                }
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f2), new Float(f3)})).booleanValue();
                }
                if (l.n(l.this) != null && l.this.f() <= l.l() && MotionEventCompat.getPointerCount(motionEvent) <= l.m() && MotionEventCompat.getPointerCount(motionEvent2) <= l.m()) {
                    return l.n(l.this).a(motionEvent, motionEvent2, f2, f3);
                }
                return false;
            }
        });
        this.o.setOnDoubleTapListener(new GestureDetector.OnDoubleTapListener() { // from class: com.taobao.android.interactive_common.view.photoview.l.3
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
                if (l.o(l.this) != null) {
                    l.o(l.this).onClick(l.e(l.this));
                }
                RectF b2 = l.this.b();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (l.p(l.this) != null) {
                    l.p(l.this);
                    l.e(l.this);
                }
                if (b2 != null) {
                    if (b2.contains(x, y)) {
                        float f2 = b2.left;
                        b2.width();
                        float f3 = b2.top;
                        b2.height();
                        if (l.q(l.this) != null) {
                            l.q(l.this);
                            l.e(l.this);
                        }
                        return true;
                    } else if (l.r(l.this) != null) {
                        l.r(l.this);
                        l.e(l.this);
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
                    float f2 = l.this.f();
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (f2 < l.this.e()) {
                        l.this.a(l.this.e(), x, y, true);
                    } else {
                        l.this.a(l.this.c(), x, y, true);
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
            ipChange.ipc$dispatch("1cd9e21e", new Object[]{this, gVar});
        } else {
            this.B = gVar;
        }
    }

    public void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cda567d", new Object[]{this, hVar});
        } else {
            this.C = hVar;
        }
    }

    @Deprecated
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.H;
    }

    public RectF b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("e8a87f5e", new Object[]{this});
        }
        q();
        return e(n());
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
        p();
        return true;
    }

    public void a(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f2)});
            return;
        }
        this.s.setRotate(f2 % 360.0f);
        p();
    }

    public void b(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f2)});
            return;
        }
        this.s.postRotate(f2 % 360.0f);
        p();
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
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[]{this})).floatValue() : this.k;
    }

    public float f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1dd", new Object[]{this})).floatValue() : (float) Math.sqrt(((float) Math.pow(a(this.s, 0), 2.0d)) + ((float) Math.pow(a(this.s, 3), 2.0d)));
    }

    public ImageView.ScaleType g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView.ScaleType) ipChange.ipc$dispatch("a31a5542", new Object[]{this}) : this.I;
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

    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ce  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            r11 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.interactive_common.view.photoview.l.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1f
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r11
            r1[r4] = r12
            r12 = 2
            r1[r12] = r13
            java.lang.String r12 = "d4aa3aa4"
            java.lang.Object r12 = r0.ipc$dispatch(r12, r1)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            return r12
        L1f:
            boolean r0 = r11.H
            if (r0 == 0) goto Lda
            r0 = r12
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            boolean r0 = com.taobao.android.interactive_common.view.photoview.m.a(r0)
            if (r0 == 0) goto Lda
            int r0 = r13.getAction()
            if (r0 == 0) goto L8a
            if (r0 == r4) goto L37
            if (r0 == r2) goto L37
            goto L96
        L37:
            float r0 = r11.f()
            float r1 = r11.i
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L60
            android.graphics.RectF r0 = r11.b()
            if (r0 == 0) goto L96
            com.taobao.android.interactive_common.view.photoview.l$a r1 = new com.taobao.android.interactive_common.view.photoview.l$a
            float r7 = r11.f()
            float r8 = r11.i
            float r9 = r0.centerX()
            float r10 = r0.centerY()
            r5 = r1
            r6 = r11
            r5.<init>(r7, r8, r9, r10)
            r12.post(r1)
            goto L88
        L60:
            float r0 = r11.f()
            float r1 = r11.k
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L96
            android.graphics.RectF r0 = r11.b()
            if (r0 == 0) goto L96
            com.taobao.android.interactive_common.view.photoview.l$a r1 = new com.taobao.android.interactive_common.view.photoview.l$a
            float r7 = r11.f()
            float r8 = r11.k
            float r9 = r0.centerX()
            float r10 = r0.centerY()
            r5 = r1
            r6 = r11
            r5.<init>(r7, r8, r9, r10)
            r12.post(r1)
        L88:
            r12 = 1
            goto L97
        L8a:
            android.view.ViewParent r12 = r12.getParent()
            if (r12 == 0) goto L93
            r12.requestDisallowInterceptTouchEvent(r4)
        L93:
            r11.r()
        L96:
            r12 = 0
        L97:
            com.taobao.android.interactive_common.view.photoview.b r0 = r11.p
            if (r0 == 0) goto Lce
            boolean r12 = r0.a()
            com.taobao.android.interactive_common.view.photoview.b r0 = r11.p
            boolean r0 = r0.b()
            com.taobao.android.interactive_common.view.photoview.b r1 = r11.p
            boolean r1 = r1.a(r13)
            if (r12 != 0) goto Lb7
            com.taobao.android.interactive_common.view.photoview.b r12 = r11.p
            boolean r12 = r12.a()
            if (r12 != 0) goto Lb7
            r12 = 1
            goto Lb8
        Lb7:
            r12 = 0
        Lb8:
            if (r0 != 0) goto Lc4
            com.taobao.android.interactive_common.view.photoview.b r0 = r11.p
            boolean r0 = r0.b()
            if (r0 != 0) goto Lc4
            r0 = 1
            goto Lc5
        Lc4:
            r0 = 0
        Lc5:
            if (r12 == 0) goto Lca
            if (r0 == 0) goto Lca
            r3 = 1
        Lca:
            r11.m = r3
            r3 = r1
            goto Lcf
        Lce:
            r3 = r12
        Lcf:
            android.view.GestureDetector r12 = r11.o
            if (r12 == 0) goto Lda
            boolean r12 = r12.onTouchEvent(r13)
            if (r12 == 0) goto Lda
            r3 = 1
        Lda:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.interactive_common.view.photoview.l.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public void c(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b3996", new Object[]{this, new Float(f2)});
            return;
        }
        m.a(f2, this.j, this.k);
        this.i = f2;
    }

    public void d(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401235", new Object[]{this, new Float(f2)});
            return;
        }
        m.a(this.i, f2, this.k);
        this.j = f2;
    }

    public void e(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4ead4", new Object[]{this, new Float(f2)});
            return;
        }
        m.a(this.i, this.j, f2);
        this.k = f2;
    }

    public void a(float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25edca58", new Object[]{this, new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        m.a(f2, f3, f4);
        this.i = f2;
        this.j = f3;
        this.k = f4;
    }

    public void a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cdb3f3b", new Object[]{this, jVar});
        } else {
            this.A = jVar;
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
            ipChange.ipc$dispatch("1cd88501", new Object[]{this, dVar});
        } else {
            this.v = dVar;
        }
    }

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cd96dbf", new Object[]{this, fVar});
        } else {
            this.w = fVar;
        }
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cd8f960", new Object[]{this, eVar});
        } else {
            this.x = eVar;
        }
    }

    public void a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cdbb39a", new Object[]{this, kVar});
        } else {
            this.y = kVar;
        }
    }

    public void a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cdacadc", new Object[]{this, iVar});
        } else {
            this.D = iVar;
        }
    }

    public void f(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9c373", new Object[]{this, new Float(f2)});
        } else {
            a(f2, false);
        }
    }

    public void a(float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c10357c", new Object[]{this, new Float(f2), new Boolean(z)});
        } else {
            a(f2, this.n.getRight() / 2, this.n.getBottom() / 2, z);
        }
    }

    public void a(float f2, float f3, float f4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97cc337c", new Object[]{this, new Float(f2), new Float(f3), new Float(f4), new Boolean(z)});
        } else if (f2 < this.i || f2 > this.k) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        } else {
            if (z) {
                this.n.post(new a(f(), f2, f3, f4));
                return;
            }
            this.s.setScale(f2, f2, f3, f4);
            p();
        }
    }

    public void a(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91bcf1c2", new Object[]{this, scaleType});
        } else if (!m.a(scaleType) || scaleType == this.I) {
        } else {
            this.I = scaleType;
            i();
        }
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.H;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.H = z;
        i();
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.H) {
            a(this.n.getDrawable());
        } else {
            o();
        }
    }

    public void b(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6519693", new Object[]{this, matrix});
        } else {
            matrix.set(n());
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

    private Matrix n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("dc2c981", new Object[]{this});
        }
        this.r.set(this.q);
        this.r.postConcat(this.s);
        return this.r;
    }

    public Matrix j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Matrix) ipChange.ipc$dispatch("6883377d", new Object[]{this}) : this.r;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
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

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        this.s.reset();
        b(this.G);
        d(n());
        q();
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

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else if (!q()) {
        } else {
            d(n());
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
            float f2 = intrinsicWidth;
            float f3 = a2 / f2;
            float f4 = intrinsicHeight;
            float f5 = b2 / f4;
            if (this.I == ImageView.ScaleType.CENTER) {
                this.q.postTranslate((a2 - f2) / 2.0f, (b2 - f4) / 2.0f);
            } else if (this.I == ImageView.ScaleType.CENTER_CROP) {
                float max = Math.max(f3, f5);
                this.q.postScale(max, max);
                this.q.postTranslate((a2 - (f2 * max)) / 2.0f, (b2 - (f4 * max)) / 2.0f);
            } else if (this.I == ImageView.ScaleType.CENTER_INSIDE) {
                float min = Math.min(1.0f, Math.min(f3, f5));
                this.q.postScale(min, min);
                this.q.postTranslate((a2 - (f2 * min)) / 2.0f, (b2 - (f4 * min)) / 2.0f);
            } else {
                RectF rectF = new RectF(0.0f, 0.0f, f2, f4);
                RectF rectF2 = new RectF(0.0f, 0.0f, a2, b2);
                if (((int) this.G) % 180 != 0) {
                    rectF = new RectF(0.0f, 0.0f, f4, f2);
                }
                int i = AnonymousClass4.f12950a[this.I.ordinal()];
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
            o();
        }
    }

    private boolean q() {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue();
        }
        RectF e2 = e(n());
        if (e2 == null) {
            return false;
        }
        float height = e2.height();
        float width = e2.width();
        float b2 = b(this.n);
        float f7 = 0.0f;
        if (height <= b2) {
            int i = AnonymousClass4.f12950a[this.I.ordinal()];
            if (i != 2) {
                if (i == 3) {
                    b2 -= height;
                    f3 = e2.top;
                } else {
                    b2 = (b2 - height) / 2.0f;
                    f3 = e2.top;
                }
                f2 = b2 - f3;
            } else {
                f4 = e2.top;
                f2 = -f4;
            }
        } else if (e2.top > 0.0f) {
            f4 = e2.top;
            f2 = -f4;
        } else if (e2.bottom < b2) {
            f3 = e2.bottom;
            f2 = b2 - f3;
        } else {
            f2 = 0.0f;
        }
        float a2 = a(this.n);
        if (width <= a2) {
            int i2 = AnonymousClass4.f12950a[this.I.ordinal()];
            if (i2 != 2) {
                if (i2 == 3) {
                    f5 = a2 - width;
                    f6 = e2.left;
                } else {
                    f5 = (a2 - width) / 2.0f;
                    f6 = e2.left;
                }
                f7 = f5 - f6;
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
        this.s.postTranslate(f7, f2);
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

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        b bVar = this.E;
        if (bVar == null) {
            return;
        }
        bVar.a();
        this.E = null;
    }

    /* loaded from: classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final float b;
        private final float c;
        private final long d = System.currentTimeMillis();
        private final float e;
        private final float f;

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
            l.s(l.this).a((f + ((this.f - f) * a2)) / l.this.f(), this.b, this.c);
            if (a2 >= 1.0f) {
                return;
            }
            com.taobao.android.interactive_common.view.photoview.a.a(l.e(l.this), this);
        }

        private float a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : l.u(l.this).getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.d)) * 1.0f) / l.t(l.this)));
        }
    }

    /* loaded from: classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final OverScroller b;
        private int c;
        private int d;

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
            RectF b = l.this.b();
            if (b == null) {
                return;
            }
            int round = Math.round(-b.left);
            float f = i;
            if (f < b.width()) {
                i6 = Math.round(b.width() - f);
                i5 = 0;
            } else {
                i5 = round;
                i6 = i5;
            }
            int round2 = Math.round(-b.top);
            float f2 = i2;
            if (f2 < b.height()) {
                i8 = Math.round(b.height() - f2);
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
                l.c(l.this).postTranslate(this.c - currX, this.d - currY);
                l.d(l.this);
                this.c = currX;
                this.d = currY;
                com.taobao.android.interactive_common.view.photoview.a.a(l.e(l.this), this);
            }
        }
    }
}
