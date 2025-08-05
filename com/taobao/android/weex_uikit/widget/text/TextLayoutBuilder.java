package com.taobao.android.weex_uikit.widget.text;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v4.text.TextDirectionHeuristicCompat;
import android.support.v4.text.TextDirectionHeuristicsCompat;
import android.support.v4.util.LruCache;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import tb.kge;

/* loaded from: classes6.dex */
public class TextLayoutBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_MAX_LINES = Integer.MAX_VALUE;
    public static final int MEASURE_MODE_AT_MOST = 2;
    public static final int MEASURE_MODE_EXACTLY = 1;
    public static final int MEASURE_MODE_UNSPECIFIED = 0;

    /* renamed from: a  reason: collision with root package name */
    public static final LruCache<Integer, Layout> f16213a;
    private int c = 0;
    private int d = 2;
    private int e = Integer.MAX_VALUE;
    private int f = 2;
    public final a b = new a();
    private Layout g = null;
    private boolean h = true;
    private boolean i = false;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface MeasureMode {
    }

    static {
        kge.a(779282837);
        f16213a = new LruCache<>(100);
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public float b;
        public float c;
        public float d;
        public int e;
        public int f;
        public int g;
        public CharSequence h;
        public ColorStateList i;
        public int[] v;
        public int[] w;

        /* renamed from: a  reason: collision with root package name */
        public TextPaint f16214a = new TextPaint(1);
        public float j = 1.0f;
        public float k = 0.0f;
        public float l = Float.MAX_VALUE;
        public boolean m = true;
        public TextUtils.TruncateAt n = null;
        public boolean o = false;
        public int p = Integer.MAX_VALUE;
        public Layout.Alignment q = Layout.Alignment.ALIGN_NORMAL;
        public int s = 0;
        public int t = 0;
        public int u = 0;
        public boolean x = false;
        public TextDirectionHeuristicCompat r = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;

        static {
            kge.a(1940148117);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (!this.x) {
            } else {
                TextPaint textPaint = new TextPaint(this.f16214a);
                textPaint.set(this.f16214a);
                this.f16214a = textPaint;
                this.x = false;
            }
        }

        public int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : Math.round((this.f16214a.getFontMetricsInt(null) * this.j) + this.k);
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            int color = (((((((((((((((((((((((((((((((this.f16214a.getColor() + 31) * 31) + Float.floatToIntBits(this.f16214a.getTextSize())) * 31) + (this.f16214a.getTypeface() != null ? this.f16214a.getTypeface().hashCode() : 0)) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + this.e) * 31) + this.f16214a.linkColor) * 31) + Float.floatToIntBits(this.f16214a.density)) * 31) + Arrays.hashCode(this.f16214a.drawableState)) * 31) + this.f) * 31) + this.g) * 31) + Float.floatToIntBits(this.j)) * 31) + Float.floatToIntBits(this.k)) * 31) + Float.floatToIntBits(this.l)) * 31) + (this.m ? 1 : 0)) * 31;
            TextUtils.TruncateAt truncateAt = this.n;
            int hashCode = (((((color + (truncateAt != null ? truncateAt.hashCode() : 0)) * 31) + (this.o ? 1 : 0)) * 31) + this.p) * 31;
            Layout.Alignment alignment = this.q;
            int hashCode2 = (hashCode + (alignment != null ? alignment.hashCode() : 0)) * 31;
            TextDirectionHeuristicCompat textDirectionHeuristicCompat = this.r;
            int hashCode3 = (((((((((hashCode2 + (textDirectionHeuristicCompat != null ? textDirectionHeuristicCompat.hashCode() : 0)) * 31) + this.s) * 31) + this.t) * 31) + Arrays.hashCode(this.v)) * 31) + Arrays.hashCode(this.w)) * 31;
            CharSequence charSequence = this.h;
            if (charSequence != null) {
                i = charSequence.hashCode();
            }
            return hashCode3 + i;
        }
    }

    public TextLayoutBuilder a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("b531bb04", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        if (this.b.f != i || this.b.g != i2) {
            a aVar = this.b;
            aVar.f = i;
            aVar.g = i2;
            this.g = null;
        }
        return this;
    }

    public TextLayoutBuilder a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("ecd1a348", new Object[]{this, charSequence});
        }
        if (charSequence == this.b.h) {
            return this;
        }
        if (Build.VERSION.SDK_INT >= 21 && (charSequence instanceof SpannableStringBuilder)) {
            try {
                charSequence.hashCode();
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("The given text contains a null span. Due to an Android framework bug, this will cause an exception later down the line.", e);
            }
        }
        if (charSequence != null && charSequence.equals(this.b.h)) {
            return this;
        }
        this.b.h = charSequence;
        this.g = null;
        return this;
    }

    public TextLayoutBuilder a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("20554557", new Object[]{this, new Integer(i)});
        }
        float f = i;
        if (this.b.f16214a.getTextSize() != f) {
            this.b.a();
            this.b.f16214a.setTextSize(f);
            this.g = null;
        }
        return this;
    }

    public TextLayoutBuilder b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("8a84cd76", new Object[]{this, new Integer(i)});
        }
        this.b.a();
        a aVar = this.b;
        aVar.i = null;
        aVar.f16214a.setColor(i);
        this.g = null;
        return this;
    }

    public TextLayoutBuilder a(ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("de9be22", new Object[]{this, colorStateList});
        }
        this.b.a();
        a aVar = this.b;
        aVar.i = colorStateList;
        aVar.f16214a.setColor(this.b.i != null ? this.b.i.getDefaultColor() : -16777216);
        this.g = null;
        return this;
    }

    public TextLayoutBuilder c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("f4b45595", new Object[]{this, new Integer(i)});
        }
        if (this.b.f16214a.linkColor != i) {
            this.b.a();
            this.b.f16214a.linkColor = i;
            this.g = null;
        }
        return this;
    }

    public TextLayoutBuilder a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("45a6b894", new Object[]{this, new Float(f)});
        }
        if (this.b.l == Float.MAX_VALUE && this.b.k != f) {
            this.b.k = f;
            this.g = null;
        }
        return this;
    }

    public TextLayoutBuilder b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("afd640b3", new Object[]{this, new Float(f)});
        }
        if (this.b.l == Float.MAX_VALUE && this.b.j != f) {
            this.b.j = f;
            this.g = null;
        }
        return this;
    }

    public float a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : this.b.f16214a.getLetterSpacing();
    }

    public TextLayoutBuilder c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("1a05c8d2", new Object[]{this, new Float(f)});
        }
        if (a() != f) {
            this.b.a();
            this.b.f16214a.setLetterSpacing(f);
            this.g = null;
        }
        return this;
    }

    public TextLayoutBuilder a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("4cdd0da8", new Object[]{this, new Boolean(z)});
        }
        if (this.b.m != z) {
            this.b.m = z;
            this.g = null;
        }
        return this;
    }

    public TextLayoutBuilder a(Layout.Alignment alignment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("2c5f420a", new Object[]{this, alignment});
        }
        if (this.b.q != alignment) {
            this.b.q = alignment;
            this.g = null;
        }
        return this;
    }

    public TextLayoutBuilder a(TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("c71d0be8", new Object[]{this, textDirectionHeuristicCompat});
        }
        if (this.b.r != textDirectionHeuristicCompat) {
            this.b.r = textDirectionHeuristicCompat;
            this.g = null;
        }
        return this;
    }

    public TextLayoutBuilder a(float f, float f2, float f3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("e889ad67", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Integer(i)});
        }
        this.b.a();
        a aVar = this.b;
        aVar.d = f;
        aVar.b = f2;
        aVar.c = f3;
        aVar.e = i;
        aVar.f16214a.setShadowLayer(f, f2, f3, i);
        this.g = null;
        return this;
    }

    public TextLayoutBuilder d(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextLayoutBuilder) ipChange.ipc$dispatch("5ee3ddb4", new Object[]{this, new Integer(i)}) : a(Typeface.defaultFromStyle(i));
    }

    public TextLayoutBuilder a(Typeface typeface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("a681365a", new Object[]{this, typeface});
        }
        if (this.b.f16214a.getTypeface() != typeface) {
            this.b.a();
            this.b.f16214a.setTypeface(typeface);
            this.g = null;
        }
        return this;
    }

    public TextLayoutBuilder a(TextUtils.TruncateAt truncateAt) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("6babda", new Object[]{this, truncateAt});
        }
        if (this.b.n != truncateAt) {
            this.b.n = truncateAt;
            this.g = null;
        }
        return this;
    }

    public TextLayoutBuilder b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("b70c95c7", new Object[]{this, new Boolean(z)});
        }
        if (this.b.o != z) {
            this.b.o = z;
            this.g = null;
        }
        return this;
    }

    public TextLayoutBuilder e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("c91365d3", new Object[]{this, new Integer(i)});
        }
        if (this.b.p != i) {
            this.b.p = i;
            this.g = null;
        }
        return this;
    }

    public TextLayoutBuilder f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("3342edf2", new Object[]{this, new Integer(i)});
        }
        if (this.b.s != i) {
            this.b.s = i;
            this.g = null;
        }
        return this;
    }

    public TextLayoutBuilder g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("9d727611", new Object[]{this, new Integer(i)});
        }
        if (this.b.t != i) {
            this.b.t = i;
            if (Build.VERSION.SDK_INT >= 23) {
                this.g = null;
            }
        }
        return this;
    }

    public TextLayoutBuilder c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("213c1de6", new Object[]{this, new Boolean(z)});
        }
        this.h = z;
        return this;
    }

    public TextLayoutBuilder h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("7a1fe30", new Object[]{this, new Integer(i)});
        }
        this.c = i;
        this.d = 1;
        return this;
    }

    public TextLayoutBuilder i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("71d1864f", new Object[]{this, new Integer(i)});
        }
        this.c = i;
        this.d = 2;
        return this;
    }

    public TextLayoutBuilder j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("dc010e6e", new Object[]{this, new Integer(i)});
        }
        this.e = i;
        this.f = 1;
        return this;
    }

    public TextLayoutBuilder k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("4630968d", new Object[]{this, new Integer(i)});
        }
        this.e = i;
        this.f = 2;
        return this;
    }

    public TextLayoutBuilder d(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("843550f1", new Object[]{this, new Float(f)});
        }
        if (this.b.f16214a.density != f) {
            this.b.a();
            this.b.f16214a.density = f;
            this.g = null;
        }
        return this;
    }

    public TextLayoutBuilder l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("b0601eac", new Object[]{this, new Integer(i)});
        }
        if (this.b.u != i) {
            this.b.u = i;
            if (Build.VERSION.SDK_INT >= 26) {
                this.g = null;
            }
        }
        return this;
    }

    public Layout b() {
        int i;
        int ceil;
        int min;
        int max;
        int i2;
        Layout a2;
        Layout layout;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Layout) ipChange.ipc$dispatch("a8ae0d4e", new Object[]{this});
        }
        if (this.h && (layout = this.g) != null) {
            return layout;
        }
        BoringLayout.Metrics metrics = null;
        if (TextUtils.isEmpty(this.b.h)) {
            return null;
        }
        if (this.h && (this.b.h instanceof Spannable) && ((ClickableSpan[]) ((Spannable) this.b.h).getSpans(0, this.b.h.length() - 1, ClickableSpan.class)).length > 0) {
            z = true;
        }
        if (!this.h || z) {
            i = -1;
        } else {
            int hashCode = this.b.hashCode();
            Layout layout2 = f16213a.get(Integer.valueOf(hashCode));
            if (layout2 != null) {
                return layout2;
            }
            i = hashCode;
        }
        int i3 = this.b.o ? 1 : this.b.p;
        if (i3 == 1 && this.b.r == null) {
            try {
                metrics = BoringLayout.isBoring(this.b.h, this.b.f16214a);
            } catch (NullPointerException e) {
                if (Build.VERSION.SDK_INT >= 23) {
                    throw e;
                }
            }
        }
        BoringLayout.Metrics metrics2 = metrics;
        int i4 = this.b.g;
        if (i4 == 0) {
            ceil = (int) Math.ceil(Layout.getDesiredWidth(this.b.h, this.b.f16214a));
        } else if (i4 == 1) {
            ceil = this.b.f;
        } else if (i4 == 2) {
            ceil = Math.min((int) Math.ceil(Layout.getDesiredWidth(this.b.h, this.b.f16214a)), this.b.f);
        } else {
            throw new IllegalStateException("Unexpected measure mode " + this.b.g);
        }
        int b = this.b.b();
        if (this.f == 1) {
            min = Math.min(ceil, this.e * b);
        } else {
            min = Math.min(ceil, this.e);
        }
        if (this.d == 1) {
            max = Math.max(min, this.c * b);
        } else {
            max = Math.max(min, this.c);
        }
        int i5 = max;
        if (metrics2 != null) {
            a2 = BoringLayout.make(this.b.h, this.b.f16214a, i5, this.b.q, this.b.j, this.b.k, metrics2, this.b.m, this.b.n, i5);
        } else {
            while (true) {
                try {
                    try {
                        i2 = i3;
                        try {
                            a2 = d.a(this.b.h, 0, this.b.h.length(), this.b.f16214a, i5, this.b.q, this.b.j, this.b.k, this.b.m, this.b.n, i5, i2, this.b.r, this.b.s, this.b.t, this.b.u, this.b.v, this.b.w);
                            break;
                        } catch (IndexOutOfBoundsException e2) {
                            e = e2;
                            if (!(this.b.h instanceof String)) {
                                Log.e("TextLayoutBuilder", "Hit bug #35412, retrying with Spannables removed", e);
                                a aVar = this.b;
                                aVar.h = aVar.h.toString();
                                i3 = i2;
                            } else {
                                throw e;
                            }
                        }
                    } catch (IndexOutOfBoundsException e3) {
                        e = e3;
                        i2 = i3;
                    }
                } catch (IndexOutOfBoundsException e4) {
                    e = e4;
                    i2 = i3;
                }
                Log.e("TextLayoutBuilder", "Hit bug #35412, retrying with Spannables removed", e);
                a aVar2 = this.b;
                aVar2.h = aVar2.h.toString();
                i3 = i2;
            }
        }
        if (this.h && !z) {
            this.g = a2;
            f16213a.put(Integer.valueOf(i), a2);
        }
        this.b.x = true;
        return a2;
    }
}
