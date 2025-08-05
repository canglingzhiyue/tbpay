package com.taobao.android.detail.core.detail.kit.view.widget.base.photo;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.widget.base.photo.d;
import java.lang.ref.SoftReference;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class b implements GestureDetector.OnDoubleTapListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, d.InterfaceC0378d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float DEFAULT_MAX_SCALE = 3.0f;
    public static final float DEFAULT_MID_SCALE = 1.75f;
    public static final float DEFAULT_MIN_SCALE = 1.0f;
    private boolean f;
    private SoftReference<ImageView> g;
    private ViewTreeObserver h;
    private GestureDetector i;
    private com.taobao.android.detail.core.detail.kit.view.widget.base.photo.d j;
    private c o;
    private d p;
    private e q;
    private View.OnLongClickListener r;
    private int s;
    private int t;
    private int u;
    private int v;
    private RunnableC0377b w;
    private boolean y;
    private float b = 1.0f;
    private float c = 1.75f;
    private float d = 3.0f;
    private boolean e = true;

    /* renamed from: a  reason: collision with root package name */
    public Matrix f9609a = new Matrix();
    private final Matrix k = new Matrix();
    private final Matrix l = new Matrix();
    private final RectF m = new RectF();
    private final float[] n = new float[9];
    private int x = 2;
    private ImageView.ScaleType z = ImageView.ScaleType.FIT_CENTER;

    /* renamed from: com.taobao.android.detail.core.detail.kit.view.widget.base.photo.b$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9611a = new int[ImageView.ScaleType.values().length];

        static {
            try {
                f9611a[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9611a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9611a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9611a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9611a[ImageView.ScaleType.FIT_XY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface c {
    }

    /* loaded from: classes4.dex */
    public interface d {
    }

    /* loaded from: classes4.dex */
    public interface e {
        void a(View view, float f, float f2);
    }

    static {
        kge.a(392689857);
        kge.a(-1119332714);
        kge.a(-468432129);
        kge.a(1508565050);
        kge.a(-1853581880);
        kge.a(300785761);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("886c5d07", new Object[]{this, motionEvent})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ View.OnLongClickListener a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnLongClickListener) ipChange.ipc$dispatch("9bbd8122", new Object[]{bVar}) : bVar.r;
    }

    public static /* synthetic */ void a(b bVar, Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69942e1f", new Object[]{bVar, matrix});
        } else {
            bVar.c(matrix);
        }
    }

    public static /* synthetic */ SoftReference b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SoftReference) ipChange.ipc$dispatch("6e0cffde", new Object[]{bVar}) : bVar.g;
    }

    public static /* synthetic */ Matrix c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Matrix) ipChange.ipc$dispatch("9af8c26b", new Object[]{bVar}) : bVar.l;
    }

    public static /* synthetic */ void d(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc211be0", new Object[]{bVar});
        } else {
            bVar.m();
        }
    }

    private static boolean a(ImageView imageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("83f7c626", new Object[]{imageView})).booleanValue() : (imageView == null || imageView.getDrawable() == null) ? false : true;
    }

    private static boolean b(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e5d1cc7", new Object[]{scaleType})).booleanValue();
        }
        if (scaleType == null) {
            return false;
        }
        if (AnonymousClass2.f9611a[scaleType.ordinal()] != 1) {
            return true;
        }
        throw new IllegalArgumentException(scaleType.name() + " is not supported in PhotoView");
    }

    private static void b(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98e08e63", new Object[]{imageView});
        } else if (imageView == null || (imageView instanceof PhotoView)) {
        } else {
            imageView.setScaleType(ImageView.ScaleType.MATRIX);
        }
    }

    public b(ImageView imageView) {
        this.g = new SoftReference<>(imageView);
        imageView.setOnTouchListener(this);
        this.h = imageView.getViewTreeObserver();
        this.h.addOnGlobalLayoutListener(this);
        b(imageView);
        if (!imageView.isInEditMode()) {
            this.j = com.taobao.android.detail.core.detail.kit.view.widget.base.photo.d.a(imageView.getContext(), this);
            this.i = new GestureDetector(imageView.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.taobao.android.detail.core.detail.kit.view.widget.base.photo.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public void onLongPress(MotionEvent motionEvent) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
                    } else if (b.a(b.this) == null) {
                    } else {
                        b.a(b.this).onLongClick((View) b.b(b.this).get());
                    }
                }
            });
            this.i.setOnDoubleTapListener(this);
            b(true);
        }
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.base.photo.PhotoViewAttacher");
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.y;
    }

    public final void b() {
        ImageView imageView;
        ViewTreeObserver viewTreeObserver;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        SoftReference<ImageView> softReference = this.g;
        if (softReference != null && (imageView = softReference.get()) != null && (viewTreeObserver = imageView.getViewTreeObserver()) != null) {
            if (Build.VERSION.SDK_INT < 16) {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            } else {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
        this.h = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.g = null;
    }

    public final RectF c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("d97986bd", new Object[]{this});
        }
        o();
        return b(k());
    }

    public final ImageView d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("3c1f5b05", new Object[]{this});
        }
        ImageView imageView = null;
        SoftReference<ImageView> softReference = this.g;
        if (softReference != null) {
            imageView = softReference.get();
        }
        if (imageView == null) {
            b();
        }
        return imageView;
    }

    public float e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[]{this})).floatValue() : this.b;
    }

    public float f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1dd", new Object[]{this})).floatValue() : this.c;
    }

    public float g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f95e", new Object[]{this})).floatValue() : this.d;
    }

    public final float h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10df", new Object[]{this})).floatValue() : a(this.l, 0);
    }

    public final ImageView.ScaleType i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView.ScaleType) ipChange.ipc$dispatch("51563700", new Object[]{this}) : this.z;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a319393", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            float h = h();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (h <= this.c) {
                b(this.d, x, y);
            } else {
                b(this.b, x, y);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return true;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.widget.base.photo.d.InterfaceC0378d
    public final void a(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        ImageView d2 = d();
        if (d2 == null || !a(d2)) {
            return;
        }
        this.l.postTranslate(f, f2);
        m();
        if (!this.e || this.j.a()) {
            return;
        }
        int i = this.x;
        if (i != 2 && ((i != 0 || f < 1.0f) && (this.x != 1 || f > -1.0f))) {
            return;
        }
        d2.getParent().requestDisallowInterceptTouchEvent(false);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.widget.base.photo.d.InterfaceC0378d
    public final void a(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97cbe868", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        ImageView d2 = d();
        if (!a(d2)) {
            return;
        }
        this.w = new RunnableC0377b(d2.getContext());
        this.w.a(d2.getWidth(), d2.getHeight(), (int) f3, (int) f4);
        d2.post(this.w);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
            return;
        }
        ImageView d2 = d();
        if (d2 == null || !this.y) {
            return;
        }
        int top = d2.getTop();
        int right = d2.getRight();
        int bottom = d2.getBottom();
        int left = d2.getLeft();
        if (top == this.s && bottom == this.u && left == this.v && right == this.t) {
            return;
        }
        a(d2.getDrawable());
        this.s = top;
        this.t = right;
        this.u = bottom;
        this.v = left;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.widget.base.photo.d.InterfaceC0378d
    public final void a(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25edca58", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
        } else if (h() >= this.d && f >= 1.0f) {
        } else {
            this.l.postScale(f, f, f2, f3);
            m();
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        RectF c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d156fc43", new Object[]{this, motionEvent})).booleanValue();
        }
        ImageView d2 = d();
        if (d2 != null) {
            if (this.p != null && (c2 = c()) != null && c2.contains(motionEvent.getX(), motionEvent.getY())) {
                float f = c2.left;
                c2.width();
                float f2 = c2.top;
                c2.height();
                return true;
            }
            e eVar = this.q;
            if (eVar != null) {
                eVar.a(d2, motionEvent.getX(), motionEvent.getY());
            }
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        RectF c2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (!this.y) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            l();
        } else if ((action == 1 || action == 3) && this.f && h() < this.b && (c2 = c()) != null) {
            view.post(new a(h(), this.b, c2.centerX(), c2.centerY()));
            z = true;
        }
        GestureDetector gestureDetector = this.i;
        if (gestureDetector != null && gestureDetector.onTouchEvent(motionEvent)) {
            z = true;
        }
        com.taobao.android.detail.core.detail.kit.view.widget.base.photo.d dVar = this.j;
        if (dVar != null && dVar.a(motionEvent)) {
            return true;
        }
        return z;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.b = f;
        }
    }

    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
        } else {
            this.c = f;
        }
    }

    public void c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b3996", new Object[]{this, new Float(f)});
        } else {
            this.d = f;
        }
    }

    public final void a(View.OnLongClickListener onLongClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f1d2ed", new Object[]{this, onLongClickListener});
        } else {
            this.r = onLongClickListener;
        }
    }

    public final void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c15047e", new Object[]{this, cVar});
        } else {
            this.o = cVar;
        }
    }

    public final void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c1578dd", new Object[]{this, dVar});
        } else {
            this.p = dVar;
        }
    }

    public final void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c15ed3c", new Object[]{this, eVar});
        } else {
            this.q = eVar;
        }
    }

    public final void a(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91bcf1c2", new Object[]{this, scaleType});
        } else if (!b(scaleType) || scaleType == this.z) {
        } else {
            this.z = scaleType;
            j();
        }
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.y = z;
        j();
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        ImageView d2 = d();
        if (d2 == null) {
            return;
        }
        if (this.y) {
            b(d2);
            a(d2.getDrawable());
            return;
        }
        p();
    }

    public final void b(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dcef737", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
            return;
        }
        ImageView d2 = d();
        if (d2 == null || !this.f) {
            return;
        }
        d2.post(new a(h(), f, f2, f3));
    }

    public Matrix k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("91d31bfe", new Object[]{this});
        }
        this.k.set(this.f9609a);
        this.k.postConcat(this.l);
        return this.k;
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        RunnableC0377b runnableC0377b = this.w;
        if (runnableC0377b == null) {
            return;
        }
        runnableC0377b.a();
        this.w = null;
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (!o()) {
        } else {
            c(k());
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        ImageView d2 = d();
        if (d2 != null && !(d2 instanceof PhotoView) && d2.getScaleType() != ImageView.ScaleType.MATRIX) {
            throw new IllegalStateException("The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher");
        }
    }

    private boolean o() {
        RectF b;
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
        ImageView d2 = d();
        if (d2 == null || (b = b(k())) == null) {
            return false;
        }
        float height = b.height();
        float width = b.width();
        float height2 = d2.getHeight();
        float f7 = 0.0f;
        if (height <= height2) {
            int i = AnonymousClass2.f9611a[this.z.ordinal()];
            if (i != 2) {
                if (i == 3) {
                    height2 -= height;
                    f2 = b.top;
                } else {
                    height2 = (height2 - height) / 2.0f;
                    f2 = b.top;
                }
                f = height2 - f2;
            } else {
                f3 = b.top;
                f = -f3;
            }
        } else if (b.top > 0.0f) {
            f3 = b.top;
            f = -f3;
        } else if (b.bottom < height2) {
            f2 = b.bottom;
            f = height2 - f2;
        } else {
            f = 0.0f;
        }
        float width2 = d2.getWidth();
        if (width <= width2) {
            int i2 = AnonymousClass2.f9611a[this.z.ordinal()];
            if (i2 != 2) {
                if (i2 == 3) {
                    f5 = width2 - width;
                    f6 = b.left;
                } else {
                    f5 = (width2 - width) / 2.0f;
                    f6 = b.left;
                }
                f4 = f5 - f6;
            } else {
                f4 = -b.left;
            }
            f7 = f4;
            this.x = 2;
        } else if (b.left > 0.0f) {
            this.x = 0;
            f7 = -b.left;
        } else if (b.right < width2) {
            f7 = width2 - b.right;
            this.x = 1;
        } else {
            this.x = -1;
        }
        this.l.postTranslate(f7, f);
        return true;
    }

    private RectF b(Matrix matrix) {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("8b060d74", new Object[]{this, matrix});
        }
        ImageView d2 = d();
        if (d2 == null || (drawable = d2.getDrawable()) == null) {
            return null;
        }
        this.m.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(this.m);
        return this.m;
    }

    private float a(Matrix matrix, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("def8e67f", new Object[]{this, matrix, new Integer(i)})).floatValue();
        }
        matrix.getValues(this.n);
        return this.n[i];
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        this.l.reset();
        c(k());
        o();
    }

    private void c(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6fe4232", new Object[]{this, matrix});
            return;
        }
        ImageView d2 = d();
        if (d2 == null) {
            return;
        }
        n();
        d2.setImageMatrix(matrix);
        if (this.o == null) {
            return;
        }
        b(matrix);
    }

    private void a(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
            return;
        }
        ImageView d2 = d();
        if (d2 == null || drawable == null) {
            return;
        }
        float width = d2.getWidth();
        float height = d2.getHeight();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f9609a.reset();
        float f = intrinsicWidth;
        float f2 = width / f;
        float f3 = intrinsicHeight;
        float f4 = height / f3;
        if (this.z == ImageView.ScaleType.CENTER) {
            this.f9609a.postTranslate((width - f) / 2.0f, (height - f3) / 2.0f);
        } else if (this.z == ImageView.ScaleType.CENTER_CROP) {
            float max = Math.max(f2, f4);
            this.f9609a.postScale(max, max);
            this.f9609a.postTranslate((width - (f * max)) / 2.0f, (height - (f3 * max)) / 2.0f);
        } else if (this.z == ImageView.ScaleType.CENTER_INSIDE) {
            float min = Math.min(1.0f, Math.min(f2, f4));
            this.f9609a.postScale(min, min);
            this.f9609a.postTranslate((width - (f * min)) / 2.0f, (height - (f3 * min)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f, f3);
            RectF rectF2 = new RectF(0.0f, 0.0f, width, height);
            int i = AnonymousClass2.f9611a[this.z.ordinal()];
            if (i == 2) {
                this.f9609a.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i == 3) {
                this.f9609a.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i == 4) {
                this.f9609a.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i == 5) {
                this.f9609a.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        p();
    }

    /* loaded from: classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final float b;
        private final float c;
        private final float d;
        private final float e;

        static {
            kge.a(1087466870);
            kge.a(-1390502639);
        }

        public a(float f, float f2, float f3, float f4) {
            this.d = f2;
            this.b = f3;
            this.c = f4;
            if (f < f2) {
                this.e = 1.2f;
            } else {
                this.e = 0.8f;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ImageView d = b.this.d();
            if (d == null) {
                return;
            }
            Matrix c = b.c(b.this);
            float f = this.e;
            c.postScale(f, f, this.b, this.c);
            b.d(b.this);
            float h = b.this.h();
            if ((this.e > 1.0f && h < this.d) || (this.e < 1.0f && this.d < h)) {
                com.taobao.android.detail.core.detail.kit.view.widget.base.photo.a.a(d, this);
                return;
            }
            float f2 = this.d / h;
            b.c(b.this).postScale(f2, f2, this.b, this.c);
            b.d(b.this);
        }
    }

    /* renamed from: com.taobao.android.detail.core.detail.kit.view.widget.base.photo.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class RunnableC0377b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final com.taobao.android.detail.core.detail.kit.view.widget.base.photo.c b;
        private int c;
        private int d;

        static {
            kge.a(77972950);
            kge.a(-1390502639);
        }

        public RunnableC0377b(Context context) {
            this.b = com.taobao.android.detail.core.detail.kit.view.widget.base.photo.c.a(context);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.b.a(true);
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
            RectF c = b.this.c();
            if (c == null) {
                return;
            }
            int round = Math.round(-c.left);
            float f = i;
            if (f < c.width()) {
                i6 = Math.round(c.width() - f);
                i5 = 0;
            } else {
                i5 = round;
                i6 = i5;
            }
            int round2 = Math.round(-c.top);
            float f2 = i2;
            if (f2 < c.height()) {
                i8 = Math.round(c.height() - f2);
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
            this.b.a(round, round2, i3, i4, i5, i6, i7, i8, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ImageView d = b.this.d();
            if (d == null || !this.b.a()) {
                return;
            }
            int b = this.b.b();
            int c = this.b.c();
            b.c(b.this).postTranslate(this.c - b, this.d - c);
            b bVar = b.this;
            b.a(bVar, bVar.k());
            this.c = b;
            this.d = c;
            com.taobao.android.detail.core.detail.kit.view.widget.base.photo.a.a(d, this);
        }
    }

    public void a(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a4eaf4", new Object[]{this, matrix});
            return;
        }
        this.f9609a = matrix;
        c(matrix);
        c(false);
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }
}
