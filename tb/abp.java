package tb;

import android.os.Looper;
import android.support.v4.view.ViewCompat;
import android.util.AndroidRuntimeException;
import android.view.View;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import java.util.ArrayList;
import tb.abo;
import tb.abp;

/* loaded from: classes2.dex */
public abstract class abp<T extends abp<T>> implements abo.b {
    public static final float MIN_VISIBLE_CHANGE_ALPHA = 0.00390625f;
    public static final float MIN_VISIBLE_CHANGE_PIXELS = 1.0f;
    public static final float MIN_VISIBLE_CHANGE_ROTATION_DEGREES = 0.1f;
    public static final float MIN_VISIBLE_CHANGE_SCALE = 0.002f;
    final Object d;
    final abq e;
    private float j;
    public static final c TRANSLATION_X = new c("translationX") { // from class: tb.abp.1
        @Override // tb.abq
        public float a(View view) {
            return view.getTranslationX();
        }

        @Override // tb.abq
        public void a(View view, float f) {
            view.setTranslationX(f);
        }
    };
    public static final c TRANSLATION_Y = new c("translationY") { // from class: tb.abp.7
        @Override // tb.abq
        public float a(View view) {
            return view.getTranslationY();
        }

        @Override // tb.abq
        public void a(View view, float f) {
            view.setTranslationY(f);
        }
    };
    public static final c TRANSLATION_Z = new c("translationZ") { // from class: tb.abp.8
        @Override // tb.abq
        public float a(View view) {
            return ViewCompat.getTranslationZ(view);
        }

        @Override // tb.abq
        public void a(View view, float f) {
            ViewCompat.setTranslationZ(view, f);
        }
    };
    public static final c SCALE_X = new c("scaleX") { // from class: tb.abp.9
        @Override // tb.abq
        public float a(View view) {
            return view.getScaleX();
        }

        @Override // tb.abq
        public void a(View view, float f) {
            view.setScaleX(f);
        }
    };
    public static final c SCALE_Y = new c("scaleY") { // from class: tb.abp.10
        @Override // tb.abq
        public float a(View view) {
            return view.getScaleY();
        }

        @Override // tb.abq
        public void a(View view, float f) {
            view.setScaleY(f);
        }
    };
    public static final c ROTATION = new c("rotation") { // from class: tb.abp.11
        @Override // tb.abq
        public float a(View view) {
            return view.getRotation();
        }

        @Override // tb.abq
        public void a(View view, float f) {
            view.setRotation(f);
        }
    };
    public static final c ROTATION_X = new c("rotationX") { // from class: tb.abp.12
        @Override // tb.abq
        public float a(View view) {
            return view.getRotationX();
        }

        @Override // tb.abq
        public void a(View view, float f) {
            view.setRotationX(f);
        }
    };
    public static final c ROTATION_Y = new c("rotationY") { // from class: tb.abp.13
        @Override // tb.abq
        public float a(View view) {
            return view.getRotationY();
        }

        @Override // tb.abq
        public void a(View view, float f) {
            view.setRotationY(f);
        }
    };
    public static final c X = new c("x") { // from class: tb.abp.14
        @Override // tb.abq
        public float a(View view) {
            return view.getX();
        }

        @Override // tb.abq
        public void a(View view, float f) {
            view.setX(f);
        }
    };
    public static final c Y = new c("y") { // from class: tb.abp.2
        @Override // tb.abq
        public float a(View view) {
            return view.getY();
        }

        @Override // tb.abq
        public void a(View view, float f) {
            view.setY(f);
        }
    };
    public static final c Z = new c(AmnetConstant.VAL_SUPPORT_ZSTD) { // from class: tb.abp.3
        @Override // tb.abq
        public float a(View view) {
            return ViewCompat.getZ(view);
        }

        @Override // tb.abq
        public void a(View view, float f) {
            ViewCompat.setZ(view, f);
        }
    };
    public static final c ALPHA = new c("alpha") { // from class: tb.abp.4
        @Override // tb.abq
        public float a(View view) {
            return view.getAlpha();
        }

        @Override // tb.abq
        public void a(View view, float f) {
            view.setAlpha(f);
        }
    };
    public static final c SCROLL_X = new c("scrollX") { // from class: tb.abp.5
        @Override // tb.abq
        public float a(View view) {
            return view.getScrollX();
        }

        @Override // tb.abq
        public void a(View view, float f) {
            view.setScrollX((int) f);
        }
    };
    public static final c SCROLL_Y = new c("scrollY") { // from class: tb.abp.6
        @Override // tb.abq
        public float a(View view) {
            return view.getScrollY();
        }

        @Override // tb.abq
        public void a(View view, float f) {
            view.setScrollY((int) f);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    float f25212a = 0.0f;
    float b = Float.MAX_VALUE;
    boolean c = false;
    boolean f = false;
    float g = Float.MAX_VALUE;
    float h = -this.g;
    private long i = 0;
    private final ArrayList<b> k = new ArrayList<>();
    private final ArrayList<Object> l = new ArrayList<>();

    /* loaded from: classes2.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        float f25213a;
        float b;
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(abp abpVar, boolean z, float f, float f2);
    }

    /* loaded from: classes2.dex */
    public static abstract class c extends abq<View> {
        private c(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <K> abp(K k, abq<K> abqVar) {
        float f;
        this.d = k;
        this.e = abqVar;
        abq abqVar2 = this.e;
        if (abqVar2 == ROTATION || abqVar2 == ROTATION_X || abqVar2 == ROTATION_Y) {
            f = 0.1f;
        } else if (abqVar2 == ALPHA) {
            this.j = 0.00390625f;
            return;
        } else if (abqVar2 == SCALE_X || abqVar2 == SCALE_Y) {
            this.j = 0.00390625f;
            return;
        } else {
            f = 1.0f;
        }
        this.j = f;
    }

    private static <T> void a(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void a(boolean z) {
        this.f = false;
        abo.a().a(this);
        this.i = 0L;
        this.c = false;
        for (int i = 0; i < this.k.size(); i++) {
            if (this.k.get(i) != null) {
                this.k.get(i).a(this, z, this.b, this.f25212a);
            }
        }
        a(this.k);
    }

    private void d() {
        if (!this.f) {
            this.f = true;
            if (!this.c) {
                this.b = e();
            }
            float f = this.b;
            if (f > this.g || f < this.h) {
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            abo.a().a(this, 0L);
        }
    }

    private float e() {
        return this.e.a(this.d);
    }

    public T a(float f) {
        this.f25212a = f;
        return this;
    }

    public T a(b bVar) {
        if (!this.k.contains(bVar)) {
            this.k.add(bVar);
        }
        return this;
    }

    public void a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f) {
                return;
            }
            d();
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    }

    abstract boolean a(float f, float f2);

    @Override // tb.abo.b
    public boolean a(long j) {
        long j2 = this.i;
        if (j2 == 0) {
            this.i = j;
            b(this.b);
            return false;
        }
        this.i = j;
        boolean b2 = b(j - j2);
        this.b = Math.min(this.b, this.g);
        this.b = Math.max(this.b, this.h);
        b(this.b);
        if (b2) {
            a(false);
        }
        return b2;
    }

    public void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (!this.f) {
                return;
            }
            a(true);
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }

    void b(float f) {
        this.e.a(this.d, f);
        for (int i = 0; i < this.l.size(); i++) {
            if (this.l.get(i) != null) {
                this.l.get(i);
            }
        }
        a(this.l);
    }

    abstract boolean b(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c() {
        return this.j * 0.75f;
    }
}
