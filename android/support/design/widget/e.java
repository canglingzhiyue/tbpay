package android.support.design.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v4.math.MathUtils;
import android.support.v4.text.TextDirectionHeuristicsCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.TintTypedArray;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.animation.Interpolator;
import com.taobao.taobao.R;

/* loaded from: classes2.dex */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f1209a;
    private static final Paint b;
    private boolean A;
    private Bitmap B;
    private Paint C;
    private float D;
    private float E;
    private float F;
    private float G;
    private int[] H;
    private boolean I;
    private Interpolator K;
    private Interpolator L;
    private float M;
    private float N;
    private float O;
    private int P;
    private float Q;
    private float R;
    private float S;
    private int T;
    private final View c;
    private boolean d;
    private float e;
    private ColorStateList m;
    private ColorStateList n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private Typeface u;
    private Typeface v;
    private Typeface w;
    private CharSequence x;
    private CharSequence y;
    private boolean z;
    private int i = 16;
    private int j = 16;
    private float k = 15.0f;
    private float l = 15.0f;
    private final TextPaint J = new TextPaint(129);
    private final Rect g = new Rect();
    private final Rect f = new Rect();
    private final RectF h = new RectF();

    static {
        f1209a = Build.VERSION.SDK_INT < 18;
        b = null;
    }

    public e(View view) {
        this.c = view;
    }

    private static float a(float f, float f2, float f3, Interpolator interpolator) {
        if (interpolator != null) {
            f3 = interpolator.getInterpolation(f3);
        }
        return a.a(f, f2, f3);
    }

    private static int a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    private static boolean a(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    private static boolean a(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    private boolean a(Typeface typeface, Typeface typeface2) {
        if (typeface == null || typeface.equals(typeface2)) {
            return typeface == null && typeface2 != null;
        }
        return true;
    }

    private boolean b(CharSequence charSequence) {
        boolean z = true;
        if (ViewCompat.getLayoutDirection(this.c) != 1) {
            z = false;
        }
        return (z ? TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL : TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR).isRtl(charSequence, 0, charSequence.length());
    }

    private void c(float f) {
        TextPaint textPaint;
        int n;
        d(f);
        this.s = a(this.q, this.r, f, this.K);
        this.t = a(this.o, this.p, f, this.K);
        e(a(this.k, this.l, f, this.L));
        if (this.n != this.m) {
            textPaint = this.J;
            n = a(m(), n(), f);
        } else {
            textPaint = this.J;
            n = n();
        }
        textPaint.setColor(n);
        this.J.setShadowLayer(a(this.Q, this.M, f, (Interpolator) null), a(this.R, this.N, f, (Interpolator) null), a(this.S, this.O, f, (Interpolator) null), a(this.T, this.P, f));
        ViewCompat.postInvalidateOnAnimation(this.c);
    }

    private void d(float f) {
        this.h.left = a(this.f.left, this.g.left, f, this.K);
        this.h.top = a(this.o, this.p, f, this.K);
        this.h.right = a(this.f.right, this.g.right, f, this.K);
        this.h.bottom = a(this.f.bottom, this.g.bottom, f, this.K);
    }

    private Typeface e(int i) {
        TypedArray obtainStyledAttributes = this.c.getContext().obtainStyledAttributes(i, new int[]{16843692});
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                return Typeface.create(string, 0);
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void e(float f) {
        f(f);
        this.A = f1209a && this.F != 1.0f;
        if (this.A) {
            p();
        }
        ViewCompat.postInvalidateOnAnimation(this.c);
    }

    private void f(float f) {
        float f2;
        boolean z;
        boolean z2;
        if (this.x == null) {
            return;
        }
        float width = this.g.width();
        float width2 = this.f.width();
        boolean z3 = true;
        if (a(f, this.l)) {
            float f3 = this.l;
            this.F = 1.0f;
            if (a(this.w, this.u)) {
                this.w = this.u;
                z2 = true;
            } else {
                z2 = false;
            }
            f2 = f3;
            z = z2;
        } else {
            f2 = this.k;
            if (a(this.w, this.v)) {
                this.w = this.v;
                z = true;
            } else {
                z = false;
            }
            if (a(f, this.k)) {
                this.F = 1.0f;
            } else {
                this.F = f / this.k;
            }
            float f4 = this.l / this.k;
            width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
        }
        if (width > 0.0f) {
            z = this.G != f2 || this.I || z;
            this.G = f2;
            this.I = false;
        }
        if (this.y != null && !z) {
            return;
        }
        this.J.setTextSize(this.G);
        this.J.setTypeface(this.w);
        TextPaint textPaint = this.J;
        if (this.F == 1.0f) {
            z3 = false;
        }
        textPaint.setLinearText(z3);
        CharSequence ellipsize = StringUtils.ellipsize(this.x, this.J, width, StringUtils.TruncateAt.END);
        if (StringUtils.equals(ellipsize, this.y)) {
            return;
        }
        this.y = ellipsize;
        this.z = b(this.y);
    }

    private void l() {
        c(this.e);
    }

    private int m() {
        int[] iArr = this.H;
        return iArr != null ? this.m.getColorForState(iArr, 0) : this.m.getDefaultColor();
    }

    private int n() {
        int[] iArr = this.H;
        return iArr != null ? this.n.getColorForState(iArr, 0) : this.n.getDefaultColor();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void o() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.e.o():void");
    }

    private void p() {
        if (this.B != null || this.f.isEmpty() || StringUtils.isEmpty(this.y)) {
            return;
        }
        c(0.0f);
        this.D = this.J.ascent();
        this.E = this.J.descent();
        TextPaint textPaint = this.J;
        CharSequence charSequence = this.y;
        int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
        int round2 = Math.round(this.E - this.D);
        if (round <= 0 || round2 <= 0) {
            return;
        }
        this.B = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.B);
        CharSequence charSequence2 = this.y;
        canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, round2 - this.J.descent(), this.J);
        if (this.C != null) {
            return;
        }
        this.C = new Paint(3);
    }

    private void q() {
        Bitmap bitmap = this.B;
        if (bitmap != null) {
            bitmap.recycle();
            this.B = null;
        }
    }

    void a() {
        this.d = this.g.width() > 0 && this.g.height() > 0 && this.f.width() > 0 && this.f.height() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f) {
        if (this.k != f) {
            this.k = f;
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        if (this.i != i) {
            this.i = i;
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2, int i3, int i4) {
        if (!a(this.f, i, i2, i3, i4)) {
            this.f.set(i, i2, i3, i4);
            this.I = true;
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        if (this.n != colorStateList) {
            this.n = colorStateList;
            i();
        }
    }

    public void a(Canvas canvas) {
        float ascent;
        int save = canvas.save();
        if (this.y != null && this.d) {
            float f = this.s;
            float f2 = this.t;
            boolean z = this.A && this.B != null;
            if (z) {
                ascent = this.D * this.F;
            } else {
                ascent = this.J.ascent() * this.F;
                this.J.descent();
            }
            if (z) {
                f2 += ascent;
            }
            float f3 = f2;
            float f4 = this.F;
            if (f4 != 1.0f) {
                canvas.scale(f4, f4, f, f3);
            }
            if (z) {
                canvas.drawBitmap(this.B, f, f3, this.C);
            } else {
                CharSequence charSequence = this.y;
                canvas.drawText(charSequence, 0, charSequence.length(), f, f3, this.J);
            }
        }
        canvas.restoreToCount(save);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Typeface typeface) {
        if (a(this.u, typeface)) {
            this.u = typeface;
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Interpolator interpolator) {
        this.L = interpolator;
        i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(CharSequence charSequence) {
        if (charSequence == null || !charSequence.equals(this.x)) {
            this.x = charSequence;
            this.y = null;
            q();
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(int[] iArr) {
        this.H = iArr;
        if (f()) {
            i();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(float f) {
        float clamp = MathUtils.clamp(f, 0.0f, 1.0f);
        if (clamp != this.e) {
            this.e = clamp;
            l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i) {
        if (this.j != i) {
            this.j = i;
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i, int i2, int i3, int i4) {
        if (!a(this.g, i, i2, i3, i4)) {
            this.g.set(i, i2, i3, i4);
            this.I = true;
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Typeface typeface) {
        if (a(this.v, typeface)) {
            this.v = typeface;
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Interpolator interpolator) {
        this.K = interpolator;
        i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.c.getContext(), i, R.styleable.TextAppearance);
        if (obtainStyledAttributes.hasValue(R.styleable.TextAppearance_android_textColor)) {
            this.n = obtainStyledAttributes.getColorStateList(R.styleable.TextAppearance_android_textColor);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.TextAppearance_android_textSize)) {
            this.l = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, (int) this.l);
        }
        this.P = obtainStyledAttributes.getInt(R.styleable.TextAppearance_android_shadowColor, 0);
        this.N = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.O = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.M = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 16) {
            this.u = e(i);
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Typeface typeface) {
        this.v = typeface;
        this.u = typeface;
        i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Typeface d() {
        Typeface typeface = this.u;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.c.getContext(), i, R.styleable.TextAppearance);
        if (obtainStyledAttributes.hasValue(R.styleable.TextAppearance_android_textColor)) {
            this.m = obtainStyledAttributes.getColorStateList(R.styleable.TextAppearance_android_textColor);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.TextAppearance_android_textSize)) {
            this.k = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, (int) this.k);
        }
        this.T = obtainStyledAttributes.getInt(R.styleable.TextAppearance_android_shadowColor, 0);
        this.R = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.S = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.Q = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 16) {
            this.v = e(i);
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Typeface e() {
        Typeface typeface = this.v;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    final boolean f() {
        ColorStateList colorStateList = this.n;
        if (colorStateList == null || !colorStateList.isStateful()) {
            ColorStateList colorStateList2 = this.m;
            return colorStateList2 != null && colorStateList2.isStateful();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float g() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float h() {
        return this.l;
    }

    public void i() {
        if (this.c.getHeight() <= 0 || this.c.getWidth() <= 0) {
            return;
        }
        o();
        l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence j() {
        return this.x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList k() {
        return this.n;
    }
}
