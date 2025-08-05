package com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.text.DecimalFormat;
import tb.kge;

/* loaded from: classes5.dex */
public class SeekBar {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INDICATOR_ALWAYS_HIDE = 1;
    public static final int INDICATOR_ALWAYS_SHOW = 3;
    public static final int INDICATOR_ALWAYS_SHOW_AFTER_TOUCH = 2;
    public static final int INDICATOR_SHOW_WHEN_TOUCH = 0;
    public static final int MATCH_PARENT = -2;
    public static final int WRAP_CONTENT = -1;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private float I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private boolean S;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f12490a;
    public final RangeSeekBar b;
    public float g;
    public int h;
    public int i;
    public int j;
    public int k;
    public float l;
    public Bitmap n;
    public Bitmap o;
    public Bitmap p;
    public ValueAnimator q;
    public String r;
    public String u;
    public DecimalFormat v;
    public int w;
    public int x;
    public final Path c = new Path();
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Paint f = new Paint(1);
    public float m = 0.0f;
    public boolean s = false;
    public boolean t = true;
    private boolean y = false;
    private boolean z = false;

    /* loaded from: classes5.dex */
    public @interface IndicatorModeDef {
    }

    static {
        kge.a(-805362375);
    }

    public SeekBar(RangeSeekBar rangeSeekBar, AttributeSet attributeSet, boolean z) {
        this.b = rangeSeekBar;
        this.f12490a = z;
        a(attributeSet);
        s();
        r();
    }

    public Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[]{this}) : this.b.getContext();
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.F;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
        } else {
            this.E = i;
            this.p = BitmapFactory.decodeResource(i(), i);
        }
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.B;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.D;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue();
        }
        int i = this.B;
        if (i > 0) {
            if (this.p != null) {
                return i + this.D;
            }
            return i + this.F + this.D;
        } else if (this.p != null) {
            return b.a("8", this.G).height() + this.M + this.N + this.D;
        } else {
            return b.a("8", this.G).height() + this.M + this.N + this.D + this.F;
        }
    }

    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.A;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : (int) (this.b.getMinProgress() + ((this.b.getMaxProgress() - this.b.getMinProgress()) * this.l));
    }

    public float h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10df", new Object[]{this})).floatValue() : c() + b() + d() + k();
    }

    public Resources i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources) ipChange.ipc$dispatch("47fb1581", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().getResources();
    }

    public int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.R;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        this.R = i;
        p();
    }

    public float k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95762", new Object[]{this})).floatValue() : this.R * this.g;
    }

    public float l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee3", new Object[]{this})).floatValue() : this.g;
    }

    public float m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158664", new Object[]{this})).floatValue() : this.Q * this.g;
    }

    public int n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de8", new Object[]{this})).intValue() : this.Q;
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.Q == i) {
            z = false;
        }
        this.Q = i;
        if (!z) {
            return;
        }
        p();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.t = z;
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.q = ValueAnimator.ofFloat(this.m, 0.0f);
        this.q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.SeekBar.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                    return;
                }
                SeekBar.this.m = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                if (SeekBar.this.b == null) {
                    return;
                }
                SeekBar.this.b.invalidate();
            }
        });
        this.q.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.SeekBar.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                SeekBar seekBar = SeekBar.this;
                seekBar.m = 0.0f;
                if (seekBar.b == null) {
                    return;
                }
                SeekBar.this.b.invalidate();
            }
        });
        this.q.start();
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        this.w = n();
        this.x = j();
        int progressBottom = this.b.getProgressBottom();
        int i = this.x;
        this.j = progressBottom - (i / 2);
        this.k = progressBottom + (i / 2);
        a(this.O, this.w, i);
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        this.w = (int) m();
        this.x = (int) k();
        int progressBottom = this.b.getProgressBottom();
        int i = this.x;
        this.j = progressBottom - (i / 2);
        this.k = progressBottom + (i / 2);
        a(this.O, this.w, i);
    }

    public void a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (i == 0 || i() == null || i2 <= 0 || i3 <= 0) {
        } else {
            this.O = i;
            if (Build.VERSION.SDK_INT >= 21) {
                this.n = b.a(i2, i3, i().getDrawable(i, null));
            } else {
                this.n = b.a(i2, i3, i().getDrawable(i));
            }
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.z = z;
        }
    }

    public void b(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfaa61a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (i == 0 || i() == null) {
        } else {
            this.P = i;
            if (Build.VERSION.SDK_INT >= 21) {
                this.o = b.a(i2, i3, i().getDrawable(i, null));
            } else {
                this.o = b.a(i2, i3, i().getDrawable(i));
            }
        }
    }

    public boolean a(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0fea6c", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        int progressWidth = (int) (this.b.getProgressWidth() * this.l);
        return f > ((float) (this.h + progressWidth)) && f < ((float) (this.i + progressWidth)) && f2 > ((float) this.j) && f2 < ((float) this.k);
    }

    public void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
        } else if (!this.t) {
        } else {
            canvas.save();
            canvas.translate((int) (this.b.getProgressWidth() * this.l), 0.0f);
            canvas.translate(this.h, 0.0f);
            if (this.S) {
                a(canvas, this.f, a(this.r));
            }
            b(canvas);
            canvas.restore();
        }
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        a[] rangeSeekBarState = this.b.getRangeSeekBarState();
        if (TextUtils.isEmpty(str)) {
            if (this.f12490a) {
                DecimalFormat decimalFormat = this.v;
                if (decimalFormat != null) {
                    str = decimalFormat.format(rangeSeekBarState[0].b);
                } else {
                    str = rangeSeekBarState[0].f12493a;
                }
            } else {
                DecimalFormat decimalFormat2 = this.v;
                if (decimalFormat2 != null) {
                    str = decimalFormat2.format(rangeSeekBarState[1].b);
                } else {
                    str = rangeSeekBarState[1].f12493a;
                }
            }
        }
        String str2 = this.u;
        return str2 != null ? String.format(str2, str) : str;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.s = z;
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        this.w = this.Q;
        this.x = this.R;
    }

    public void a(Canvas canvas, Paint paint, String str) {
        int width;
        int height;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bcc7c5c", new Object[]{this, canvas, paint, str});
        } else if (str == null) {
        } else {
            paint.setTextSize(this.G);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.J);
            paint.getTextBounds(str, 0, str.length(), this.d);
            int width2 = this.d.width() + this.K + this.L;
            int i = this.C;
            if (i > width2) {
                width2 = i;
            }
            int height2 = this.d.height() + this.M + this.N;
            int i2 = this.B;
            if (i2 > height2) {
                height2 = i2;
            }
            Rect rect = this.e;
            rect.left = (int) ((this.w / 2.0f) - (width2 / 2.0f));
            rect.top = ((this.k - height2) - this.x) - this.D;
            rect.right = rect.left + width2;
            Rect rect2 = this.e;
            rect2.bottom = rect2.top + height2;
            if (this.p == null) {
                int i3 = this.w / 2;
                int i4 = this.e.bottom;
                int i5 = this.F;
                int i6 = i4 - i5;
                this.c.reset();
                this.c.moveTo(i3, i4);
                float f = i6;
                this.c.lineTo(i3 - i5, f);
                this.c.lineTo(i5 + i3, f);
                this.c.close();
                canvas.drawPath(this.c, paint);
                this.e.bottom -= this.F;
                this.e.top -= this.F;
            }
            int a2 = b.a(a(), 1.0f);
            int width3 = (((this.e.width() / 2) - ((int) (this.b.getProgressWidth() * this.l))) - this.b.getProgressLeft()) + a2;
            int width4 = (((this.e.width() / 2) - ((int) (this.b.getProgressWidth() * (1.0f - this.l)))) - this.b.getProgressPaddingRight()) + a2;
            if (width3 > 0) {
                this.e.left += width3;
                this.e.right += width3;
            } else if (width4 > 0) {
                this.e.left -= width4;
                this.e.right -= width4;
            }
            Bitmap bitmap = this.p;
            if (bitmap != null) {
                b.a(canvas, paint, bitmap, this.e);
            } else if (this.I > 0.0f) {
                RectF rectF = new RectF(this.e);
                float f2 = this.I;
                canvas.drawRoundRect(rectF, f2, f2, paint);
            } else {
                canvas.drawRect(this.e, paint);
            }
            if (this.K > 0) {
                width = this.e.left + this.K;
            } else if (this.L > 0) {
                width = (this.e.right - this.L) - this.d.width();
            } else {
                width = ((width2 - this.d.width()) / 2) + this.e.left;
            }
            if (this.M > 0) {
                height = this.e.top + this.d.height() + this.M;
            } else if (this.N > 0) {
                height = (this.e.bottom - this.d.height()) - this.N;
            } else {
                height = (this.e.bottom - ((height2 - this.d.height()) / 2)) + 1;
            }
            paint.setColor(this.H);
            canvas.drawText(str, width, height, paint);
        }
    }

    public void b(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4a03d9c", new Object[]{this, canvas});
        } else if (!this.z) {
        } else {
            Bitmap bitmap = this.o;
            if (bitmap != null && !this.s) {
                canvas.drawBitmap(bitmap, 0.0f, this.b.getProgressTop() + ((this.b.getProgressHeight() - this.x) / 2.0f), (Paint) null);
                return;
            }
            Bitmap bitmap2 = this.n;
            if (bitmap2 == null) {
                return;
            }
            canvas.drawBitmap(bitmap2, 0.0f, this.b.getProgressTop() + ((this.b.getProgressHeight() - this.x) / 2.0f), (Paint) null);
        }
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        r();
        s();
        float f = i;
        this.h = (int) (f - (m() / 2.0f));
        this.i = (int) (f + (m() / 2.0f));
        this.j = i2 - (j() / 2);
        this.k = i2 + (j() / 2);
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        int i = this.A;
        if (i == 0) {
            this.S = z;
        } else if (i == 1) {
            this.S = false;
        } else if (i != 2 && i != 3) {
        } else {
            this.S = true;
        }
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        this.l = f;
    }

    private void a(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("672de2a6", new Object[]{this, attributeSet});
            return;
        }
        this.D = 0;
        this.E = 0;
        this.A = 1;
        this.B = 0;
        this.C = 0;
        this.G = b.a(a(), 14.0f);
        this.H = -1;
        this.J = ContextCompat.getColor(a(), 17170443);
        this.O = R.drawable.fluid_sdk_ict_seekbar_thumb;
        this.Q = b.a(a(), 26.0f);
        this.R = b.a(a(), 26.0f);
        this.g = 1.0f;
        this.I = 0.0f;
    }

    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        a(this.E);
        a(this.O, this.Q, this.R);
        b(this.P, this.Q, this.R);
    }
}
