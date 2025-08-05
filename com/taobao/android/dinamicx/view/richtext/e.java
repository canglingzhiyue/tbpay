package com.taobao.android.dinamicx.view.richtext;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.view.richtext.node.RichText;
import com.taobao.android.dinamicx.view.richtext.span.h;
import com.taobao.android.dinamicx.view.richtext.span.i;
import com.taobao.android.dinamicx.view.richtext.span.j;
import java.util.Iterator;
import java.util.regex.Pattern;
import tb.gbg;
import tb.kge;

/* loaded from: classes5.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final CharSequence DEFAULT_ELLIPSIS_TEXT;
    private int B;
    private int C;
    private Integer D;
    private int E;
    private int F;
    private float G;
    private float H;
    private float J;
    private int N;
    private int O;
    private int P;
    private int Q;
    private float S;
    private boolean T;

    /* renamed from: a  reason: collision with root package name */
    private Context f11963a;
    private RichText ab;
    private boolean ac;
    private int ad;
    private RichText b;
    private Layout c;
    private float d;
    private float e;
    private CharSequence f;
    private TextPaint g;
    private Paint h;
    private TextUtils.TruncateAt i;
    private Layout.Alignment j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int r;
    private CharSequence s;
    private String x;
    private float q = -1.0f;
    private int t = 32;
    private int u = -16777216;
    private boolean v = false;
    private boolean w = false;
    private int y = 0;
    private int z = 0;
    private int A = 0;
    private int I = 0;
    private int K = Integer.MAX_VALUE;
    private int L = Integer.MAX_VALUE;
    private int M = 1;
    private float R = -1.0f;
    private CharSequence U = DEFAULT_ELLIPSIS_TEXT;
    private float V = 0.0f;
    private boolean W = true;
    private boolean X = false;
    private boolean Z = false;
    private int aa = 0;
    private int Y = 0;

    private boolean a(char c) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8217d19", new Object[]{this, new Character(c)})).booleanValue() : c >= 9728 && c <= 10239;
    }

    static {
        kge.a(-1545197074);
        DEFAULT_ELLIPSIS_TEXT = "…";
    }

    public a a(int i, int i2) {
        int size;
        RichText richText;
        RichText richText2;
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("29d8d046", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        j();
        CharSequence charSequence = this.s;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            size = View.MeasureSpec.getSize(i);
        } else {
            size = View.MeasureSpec.getSize(i);
            if (charSequence != null) {
                size = Math.min(Math.min(((int) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.g))) + c() + d() + (this.A << 1), size), this.K);
            }
        }
        if (size != 0 && this.N == 4 && !TextUtils.isEmpty(charSequence)) {
            a(size, charSequence);
        } else if (size != 0 && !TextUtils.isEmpty(charSequence)) {
            int c = ((size - c()) - d()) - (this.A << 1);
            boolean z = this.f != null && !this.b.renderText().equals(charSequence);
            Layout layout = this.c;
            if (layout != null) {
                if (layout.getWidth() > c || z || this.X) {
                    this.c = a(c, charSequence, true);
                    this.X = false;
                } else if (this.c.getWidth() < c) {
                    this.c.increaseWidthTo(size);
                }
            } else {
                this.c = a(c, charSequence, true);
            }
            this.Y = this.c.getLineCount();
            if (this.c.getLineCount() > this.M || (this.ac && this.c.getLineCount() > this.ad)) {
                if (this.Z && (richText = this.ab) != null) {
                    int length = richText.originText().length();
                    x(2);
                    if ((this.ac && this.c.getLineCount() > this.ad) || this.c.getLineEnd(this.M - 1) >= length) {
                        charSequence = this.s.subSequence(0, length);
                        this.c = a(c, charSequence, false);
                    }
                }
                if (this.c.getLineCount() > this.M) {
                    charSequence = SpannableStringBuilder.valueOf(b(charSequence));
                    this.c = a(c, charSequence, false);
                }
            } else {
                CharSequence charSequence2 = this.f;
                if (charSequence2 != null) {
                    charSequence = charSequence2;
                }
                if (this.Z && (richText2 = this.ab) != null) {
                    if (this.c.getLineForOffset(richText2.originText().length()) != this.c.getLineForOffset(this.b.originText().length())) {
                        charSequence = this.s.subSequence(0, this.ab.originText().length());
                        this.c = a(c, charSequence, false);
                        x(2);
                    } else {
                        x(1);
                    }
                }
            }
        }
        if (this.c == null || charSequence == null) {
            return new a(size, 0);
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            i3 = size2;
        } else if (!TextUtils.isEmpty(charSequence)) {
            i3 = Math.min(Math.min(this.c.getHeight() + this.p + this.o + (this.A << 1), size2), this.L);
        }
        this.e = b(i3, mode);
        CharSequence a2 = a(charSequence, size);
        if (a2 == null) {
            a2 = charSequence;
        }
        this.f = a2;
        return new a(size, i3);
    }

    private void a(int i, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("289f173f", new Object[]{this, new Integer(i), charSequence});
            return;
        }
        float measureText = this.g.measureText(DEFAULT_ELLIPSIS_TEXT.toString());
        int c = ((i - c()) - d()) - (this.A << 1);
        float f = c;
        float f2 = measureText + f;
        final int[] iArr = {0};
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i3 >= this.M) {
                break;
            }
            int i6 = i3 + 1;
            iArr[0] = 0;
            final CharSequence subSequence = charSequence.subSequence(i5, charSequence.length());
            Spanned spanned = (Spanned) TextUtils.ellipsize(subSequence, this.g, f2, TextUtils.TruncateAt.END, false, new TextUtils.EllipsizeCallback() { // from class: com.taobao.android.dinamicx.view.richtext.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.text.TextUtils.EllipsizeCallback
                public void ellipsized(int i7, int i8) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1637c15e", new Object[]{this, new Integer(i7), new Integer(i8)});
                    } else if (i7 == i8 && i7 == 0) {
                        iArr[0] = subSequence.length();
                    } else {
                        iArr[0] = i7;
                    }
                }
            }).subSequence(0, iArr[0]);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) spanned.toString());
            a(spanned, 0, spanned.length(), Object.class, spannableStringBuilder, length);
            spannableStringBuilder.append((CharSequence) "\n");
            i5 += spanned.length();
            if (i5 == charSequence.length()) {
                i4 = length;
                break;
            } else {
                i3 = i6;
                i4 = length;
            }
        }
        SpannableStringBuilder delete = spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        float desiredWidth = Layout.getDesiredWidth(delete, i4, delete.length(), this.g);
        while (desiredWidth > f) {
            i2++;
            desiredWidth = Layout.getDesiredWidth(delete, i4, delete.length() - i2, this.g);
        }
        if (i2 > 0) {
            delete = delete.delete(delete.length() - i2, delete.length());
        }
        this.c = a(c, (CharSequence) delete, true);
    }

    private CharSequence b(CharSequence charSequence) {
        int i;
        float measureText;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("2498bb8d", new Object[]{this, charSequence});
        }
        int lineEnd = this.c.getLineEnd(this.M - 1);
        try {
            if (this.i != null && this.i == TextUtils.TruncateAt.END && charSequence.length() != 1) {
                if (this.U instanceof Spannable) {
                    measureText = Layout.getDesiredWidth(this.U, 0, this.U.length(), this.g);
                } else {
                    measureText = this.g.measureText(this.U, 0, this.U.length());
                }
                float width = this.c.getWidth() - measureText;
                int lineStart = this.c.getLineStart(this.M - 1);
                Iterator<com.taobao.android.dinamicx.view.richtext.node.b> descendingIterator = this.b.descendingIterator();
                int length = this.b.originText().length();
                TextPaint textPaint = new TextPaint();
                if (Build.VERSION.SDK_INT >= 21) {
                    textPaint.setLetterSpacing(this.g.getLetterSpacing());
                }
                float min = Math.min(Math.max(0.0f, this.c.getLineWidth(this.M - 1)), this.c.getWidth());
                com.taobao.android.dinamicx.view.richtext.node.c cVar = null;
                int i6 = 0;
                while (descendingIterator.hasNext()) {
                    com.taobao.android.dinamicx.view.richtext.node.b next = descendingIterator.next();
                    int max = Math.max(length - next.b().length(), lineStart);
                    if (length > lineEnd) {
                        int lineForOffset = this.c.getLineForOffset(length);
                        int lineForOffset2 = this.c.getLineForOffset(length - next.b().length());
                        if (lineForOffset > this.M - 1 && descendingIterator.hasNext() && lineForOffset2 > this.M - 1) {
                            length -= next.b().length();
                        } else if (!(next instanceof com.taobao.android.dinamicx.view.richtext.node.a)) {
                            i4 = lineEnd;
                        } else {
                            continue;
                        }
                    } else {
                        i4 = length;
                    }
                    if (max < lineStart) {
                        break;
                    }
                    if (next instanceof com.taobao.android.dinamicx.view.richtext.node.c) {
                        cVar = (com.taobao.android.dinamicx.view.richtext.node.c) next;
                        textPaint.setTextSize(cVar.a() == 0 ? this.t : cVar.a());
                        int i7 = i4 - 1;
                        boolean z2 = charSequence.charAt(i7) == ' ';
                        while (true) {
                            if (i7 < max) {
                                i2 = lineStart;
                                break;
                            }
                            i2 = lineStart;
                            if (charSequence.charAt(i7) != ' ' || !z2) {
                                break;
                            }
                            i7--;
                            lineStart = i2;
                        }
                        int i8 = i7 + 1;
                        int i9 = i8 - 1;
                        if (i()) {
                            i9++;
                        }
                        float f = min;
                        while (true) {
                            if (i9 < max) {
                                z = false;
                                break;
                            }
                            f = min - textPaint.measureText(charSequence, i9, i8);
                            if (f < width) {
                                if (!a(charSequence.charAt(i9)) && i9 - 1 >= max && b(charSequence.subSequence(i5, i9 + 1).toString())) {
                                    i9--;
                                }
                                i6 = i9;
                                z = true;
                            } else {
                                i9--;
                            }
                        }
                        if (z) {
                            break;
                        }
                        min = f;
                    } else {
                        i2 = lineStart;
                        if (next instanceof com.taobao.android.dinamicx.view.richtext.node.a) {
                            com.taobao.android.dinamicx.view.richtext.node.a aVar = (com.taobao.android.dinamicx.view.richtext.node.a) next;
                            min -= aVar.c();
                            if (min < width) {
                                i3 = i4 - aVar.b().length();
                                break;
                            }
                        }
                    }
                    length -= next.b().length();
                    lineStart = i2;
                }
                i2 = lineStart;
                i3 = i6;
                if (i3 == 0) {
                    i3 = i2;
                }
                CharSequence charSequence2 = this.U;
                if (!(charSequence2 instanceof Spannable) && cVar != null && cVar.c() != null) {
                    SpannableString spannableString = new SpannableString(charSequence2);
                    spannableString.setSpan(new ForegroundColorSpan(cVar.c().intValue()), 0, charSequence2.length(), 33);
                    charSequence2 = spannableString;
                }
                return TextUtils.concat(charSequence.subSequence(0, i3), charSequence2);
            }
            i = 0;
            try {
                return charSequence.subSequence(0, lineEnd);
            } catch (Exception e) {
                e = e;
                CharSequence subSequence = charSequence.subSequence(i, lineEnd);
                e.printStackTrace();
                return subSequence;
            }
        } catch (Exception e2) {
            e = e2;
            i = 0;
        }
    }

    public static void a(Spanned spanned, int i, int i2, Class cls, Spannable spannable, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("effbce69", new Object[]{spanned, new Integer(i), new Integer(i2), cls, spannable, new Integer(i3)});
            return;
        }
        if (cls == null) {
            cls = Object.class;
        }
        Object[] spans = spanned.getSpans(i, i2, cls);
        for (int i4 = 0; i4 < spans.length; i4++) {
            int spanStart = spanned.getSpanStart(spans[i4]);
            int spanEnd = spanned.getSpanEnd(spans[i4]);
            int spanFlags = spanned.getSpanFlags(spans[i4]);
            if (spanStart < i) {
                spanStart = i;
            }
            if (spanEnd > i2) {
                spanEnd = i2;
            }
            int spanStart2 = spannable.getSpanStart(spans[i4]);
            int spanEnd2 = spannable.getSpanEnd(spans[i4]);
            int i5 = (spanStart - i) + i3;
            int i6 = (spanEnd - i) + i3;
            if (spanStart2 >= 0) {
                i5 = Math.min(spanStart2, i5);
            }
            if (spanEnd2 >= 0) {
                i6 = Math.max(spanEnd2, i6);
            }
            spannable.setSpan(spans[i4], i5, i6, spanFlags);
        }
    }

    public void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
            return;
        }
        this.d = c();
        canvas.save();
        float f = this.d;
        int i = this.A;
        canvas.translate(f + i, this.e + this.o + i);
        Layout layout = this.c;
        if (layout != null) {
            layout.draw(canvas);
        }
        canvas.restore();
    }

    public int a(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0fea5b", new Object[]{this, new Float(f), new Float(f2)})).intValue();
        }
        int i = (int) f;
        int i2 = (int) f2;
        Layout layout = this.c;
        if (layout == null) {
            return -1;
        }
        int i3 = i - this.k;
        int lineForVertical = layout.getLineForVertical(i2 - this.o);
        int offsetForHorizontal = this.c.getOffsetForHorizontal(lineForVertical, i3);
        int i4 = this.c.getPrimaryHorizontal(offsetForHorizontal) < f ? offsetForHorizontal + 1 : offsetForHorizontal - 1;
        int lineStart = this.c.getLineStart(lineForVertical);
        int lineEnd = this.c.getLineEnd(lineForVertical);
        return i4 < lineStart ? lineStart : i4 > lineEnd ? lineEnd : i4;
    }

    public <T> T[] a(int i, int i2, Class<T> cls) {
        CharSequence charSequence;
        Layout layout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T[]) ((Object[]) ipChange.ipc$dispatch("c55d5096", new Object[]{this, new Integer(i), new Integer(i2), cls}));
        }
        if (this.b == null) {
            return null;
        }
        if ((this.U instanceof Spannable) && (charSequence = this.f) != null && this.N == 3) {
            int length = charSequence.length() - this.U.length();
            int length2 = this.f.length();
            if (i >= length && i2 <= length2 && (layout = this.c) != null && this.Y > layout.getLineCount()) {
                CharSequence charSequence2 = this.U;
                return (T[]) ((Spannable) charSequence2).getSpans(0, charSequence2.length(), cls);
            }
        }
        CharSequence renderText = this.b.renderText();
        if (renderText instanceof Spannable) {
            return (T[]) ((Spannable) renderText).getSpans(i, i2, cls);
        }
        return null;
    }

    private void j() {
        Context i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        RichText richText = this.b;
        if (richText != null) {
            CharSequence renderText = richText.renderText();
            if (!renderText.equals(this.s)) {
                this.s = renderText;
            }
        }
        if (this.s == null) {
            return;
        }
        if (this.g == null) {
            this.g = new TextPaint();
        }
        if (this.h == null) {
            this.h = new Paint();
        }
        this.g.setAntiAlias(true);
        int i3 = this.t;
        if (i3 >= 0) {
            this.g.setTextSize(i3);
        }
        this.g.setColor(this.u);
        this.g.setTypeface(k());
        this.i = w(this.N);
        if (Build.VERSION.SDK_INT >= 17) {
            this.j = a(this.P);
        }
        TextPaint textPaint = this.g;
        textPaint.bgColor = this.y;
        float f = this.J;
        if (f != 0.0f && (i2 = this.I) != 0) {
            textPaint.setShadowLayer(f, this.G, this.H, i2);
        }
        if (this.S >= 0.0f && Build.VERSION.SDK_INT >= 21 && (i = DinamicXEngine.i()) != null) {
            TextPaint textPaint2 = this.g;
            textPaint2.setLetterSpacing(this.S / gbg.d(i, textPaint2.getTextSize()));
        }
        if (this.O > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(this.s);
            valueOf.setSpan(new LeadingMarginSpan.Standard(this.O, 0), 0, valueOf.length(), 33);
            this.s = valueOf;
        }
        if (this.C == 1) {
            this.g.setUnderlineText(true);
        }
        if (this.E != 1) {
            return;
        }
        this.g.setStrikeThruText(true);
    }

    private Typeface k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("4a7b4ce8", new Object[]{this});
        }
        if (this.x != null) {
            return Typeface.createFromAsset(b().getAssets(), this.x);
        }
        if (this.v && this.w) {
            return Typeface.defaultFromStyle(3);
        }
        if (this.v) {
            return Typeface.defaultFromStyle(1);
        }
        if (this.w) {
            return Typeface.defaultFromStyle(2);
        }
        return Typeface.defaultFromStyle(0);
    }

    private TextUtils.TruncateAt w(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextUtils.TruncateAt) ipChange.ipc$dispatch("1bd8407b", new Object[]{this, new Integer(i)});
        }
        if (i == 1) {
            return TextUtils.TruncateAt.START;
        }
        if (i == 2) {
            return TextUtils.TruncateAt.MIDDLE;
        }
        if (i == 3) {
            return TextUtils.TruncateAt.END;
        }
        return null;
    }

    public Layout.Alignment a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Layout.Alignment) ipChange.ipc$dispatch("ecc8b781", new Object[]{this, new Integer(i)});
        }
        if (g() == 1) {
            if (i == 1) {
                return Layout.Alignment.ALIGN_CENTER;
            }
            if (i == 2) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        } else {
            if (i == 2) {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }
    }

    private Layout a(int i, CharSequence charSequence, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return (Layout) ipChange.ipc$dispatch("1028ceda", new Object[]{this, new Integer(i), charSequence, new Boolean(z)});
        }
        if (i < 0) {
            i = 0;
        }
        boolean z3 = this.q >= 0.0f;
        float f = this.t;
        float descent = this.g.descent() - this.g.ascent();
        if (this.R < descent) {
            z2 = false;
        }
        this.o = e();
        this.p = f();
        if (z) {
            if (z3 && !z2) {
                this.V = this.q - (descent - f);
                this.V = Math.max(this.V, 0.0f);
                this.W = false;
            }
            if (z2) {
                float f2 = descent - f;
                float f3 = this.R;
                int i2 = (int) (((f3 - descent) + f2) / 2.0f);
                int max = Math.max((int) (((f3 - descent) - f2) / 2.0f), 0);
                int max2 = Math.max(i2, 0);
                this.o = e() + max;
                this.p = f() + max2;
                if (z3) {
                    this.V = max + max2 + this.q;
                } else {
                    this.V = max + max2;
                }
                this.W = false;
            }
        }
        return new StaticLayout(charSequence, this.g, i, this.j, 1.0f, this.V, this.W);
    }

    private CharSequence a(CharSequence charSequence, int i) {
        int i2;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        int i5 = 3;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("4ac43663", new Object[]{this, charSequence, new Integer(i)});
        }
        boolean z = this.Q == 0;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        boolean z2 = valueOf.length() < this.s.length() && this.i == TextUtils.TruncateAt.END;
        int length = valueOf.length() - (z2 ? this.U.length() : 0);
        int i6 = 0;
        int i7 = 0;
        while (i6 < this.b.size()) {
            int lineForOffset = this.c.getLineForOffset(i7);
            com.taobao.android.dinamicx.view.richtext.node.b bVar = this.b.get(i6);
            if ((bVar instanceof com.taobao.android.dinamicx.view.richtext.node.c) && !z) {
                if (i7 >= length) {
                    break;
                }
                int min = Math.min(bVar.b().length() + i7, length);
                int lineForOffset2 = this.c.getLineForOffset(min - 1);
                int i8 = lineForOffset;
                while (i8 <= lineForOffset2) {
                    if (this.Q == i5) {
                        i3 = lineForOffset2;
                        i4 = length;
                        valueOf.setSpan(new j(), Math.max(i7, this.c.getLineStart(i8)), Math.min(min, this.c.getLineEnd(i8)), 33);
                    } else {
                        i3 = lineForOffset2;
                        i4 = length;
                        int lineTop = this.c.getLineTop(i8) - this.c.getLineBaseline(i8);
                        int lineBottom = this.c.getLineBottom(i8) - this.c.getLineBaseline(i8);
                        if (i8 == this.c.getLineCount() - 1) {
                            lineBottom = (int) (lineBottom + this.c.getSpacingAdd());
                        }
                        valueOf.setSpan(this.Q == 1 ? new h(lineTop, lineBottom, ((int) this.c.getSpacingAdd()) / 2) : new i(lineTop, lineBottom), Math.max(i7, this.c.getLineStart(i8)), Math.min(min, this.c.getLineEnd(i8)), 33);
                    }
                    i8++;
                    lineForOffset2 = i3;
                    length = i4;
                    i5 = 3;
                }
            }
            int i9 = length;
            if (bVar instanceof com.taobao.android.dinamicx.view.richtext.node.a) {
                com.taobao.android.dinamicx.view.richtext.node.a aVar = (com.taobao.android.dinamicx.view.richtext.node.a) bVar;
                int lineBottom2 = this.c.getLineBottom(lineForOffset) - this.c.getLineTop(lineForOffset);
                if (this.Q == 1) {
                    i2 = ((lineBottom2 - aVar.d()) >> 1) + ((int) (this.c.getSpacingAdd() / 2.0f));
                    if (lineForOffset == this.c.getLineCount() - 1) {
                        i2 = (int) (i2 - (this.c.getSpacingAdd() / 2.0f));
                    }
                } else {
                    i2 = 0;
                }
                if (this.Q == 2) {
                    i2 = lineBottom2 - aVar.d();
                }
                int i10 = this.Q;
                if (i10 == 0 || i10 == 3) {
                    i2 = (int) this.c.getSpacingAdd();
                }
                aVar.a(-i2);
            }
            i7 += bVar.b().length();
            i6++;
            length = i9;
            i5 = 3;
        }
        if (z2 && !z) {
            if (this.Q == 3) {
                valueOf.setSpan(new j(), Math.max(valueOf.length() - this.U.length(), 0), valueOf.length(), 33);
            } else {
                int lineCount = this.c.getLineCount() - 1;
                int lineTop2 = this.c.getLineTop(lineCount) - this.c.getLineBaseline(lineCount);
                int lineBottom3 = (this.c.getLineBottom(lineCount) - this.c.getLineBaseline(lineCount)) + ((int) this.c.getSpacingAdd());
                valueOf.setSpan(this.Q == 1 ? new h(lineTop2, lineBottom3, ((int) this.c.getSpacingAdd()) / 2) : new i(lineTop2, lineBottom3), Math.max(valueOf.length() - this.U.length(), 0), valueOf.length(), 33);
            }
        }
        if (charSequence instanceof SpannableStringBuilder) {
            return null;
        }
        this.c = a(((i - c()) - d()) - (this.A << 1), (CharSequence) valueOf, false);
        return valueOf;
    }

    private float b(int i, int i2) {
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90f78df9", new Object[]{this, new Integer(i), new Integer(i2)})).floatValue();
        }
        Layout layout = this.c;
        if (layout != null) {
            i3 = layout.getHeight();
        }
        int i4 = ((i - this.o) - this.p) - (this.A << 1);
        if (i3 > 0 && i4 > 0 && i3 < i4 && i2 == 1073741824) {
            return (i4 - i3) >> 1;
        }
        return 0.0f;
    }

    private boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : Pattern.compile("[🀀-🏿]|[🐀-\u1f7ff]").matcher(str).find();
    }

    public void a(RichText richText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2192d2", new Object[]{this, richText});
            return;
        }
        this.s = null;
        this.b = richText;
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f11965a;
        private int b;

        static {
            kge.a(-1362028859);
        }

        public a(int i, int i2) {
            this.f11965a = i;
            this.b = i2;
        }

        public int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f11965a;
        }

        public int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
        }
    }

    public RichText a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RichText) ipChange.ipc$dispatch("853bc252", new Object[]{this}) : this.b;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.t = i;
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.u = i;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.v = z;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.w = z;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.x = str;
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else {
            this.z = i;
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
        } else {
            this.A = Math.max(i, 0);
        }
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
        } else {
            this.B = i;
        }
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
        } else {
            this.C = i;
        }
    }

    public void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
        } else {
            this.D = num;
        }
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4137ff4", new Object[]{this, new Integer(i)});
        } else {
            this.E = i;
        }
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c85893", new Object[]{this, new Integer(i)});
        } else {
            this.F = i;
        }
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d3132", new Object[]{this, new Integer(i)});
        } else {
            this.I = i;
        }
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.G = f;
        }
    }

    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
        } else {
            this.H = f;
        }
    }

    public void c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b3996", new Object[]{this, new Float(f)});
        } else {
            this.J = f;
        }
    }

    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93209d1", new Object[]{this, new Integer(i)});
            return;
        }
        this.K = i;
        this.X = true;
    }

    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae6e270", new Object[]{this, new Integer(i)});
            return;
        }
        this.L = i;
        this.X = true;
    }

    public void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9bbb0f", new Object[]{this, new Integer(i)});
            return;
        }
        this.M = i;
        this.X = true;
    }

    public void n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be5093ae", new Object[]{this, new Integer(i)});
        } else {
            this.N = i;
        }
    }

    public void o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0056c4d", new Object[]{this, new Integer(i)});
        } else {
            this.O = i;
        }
    }

    public void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ba44ec", new Object[]{this, new Integer(i)});
        } else {
            this.P = i;
        }
    }

    public void q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c36f1d8b", new Object[]{this, new Integer(i)});
        } else {
            this.Q = i;
        }
    }

    public void d(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401235", new Object[]{this, new Float(f)});
        } else {
            this.R = f;
        }
    }

    public void e(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4ead4", new Object[]{this, new Float(f)});
            return;
        }
        this.S = f;
        this.X = true;
    }

    public void a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("638f990c", new Object[]{this, charSequence});
            return;
        }
        this.U = charSequence;
        this.X = true;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.f11963a = context;
        }
    }

    public Context b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("9ee3f7e1", new Object[]{this}) : this.f11963a;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.k;
    }

    public void r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c523f62a", new Object[]{this, new Integer(i)});
            return;
        }
        this.k = i;
        this.X = true;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.l;
    }

    public void s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6d8cec9", new Object[]{this, new Integer(i)});
            return;
        }
        this.l = i;
        this.X = true;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.m;
    }

    public void t(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c88da768", new Object[]{this, new Integer(i)});
        } else {
            this.m = i;
        }
    }

    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.n;
    }

    public void u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca428007", new Object[]{this, new Integer(i)});
        } else {
            this.n = i;
        }
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.r;
    }

    public void v(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbf758a6", new Object[]{this, new Integer(i)});
        } else {
            this.r = i;
        }
    }

    public void f(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9c373", new Object[]{this, new Float(f)});
        } else {
            this.q = f;
        }
    }

    public boolean h() {
        Layout layout;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : !this.U.equals(DEFAULT_ELLIPSIS_TEXT) && (layout = this.c) != null && this.Y > layout.getLineCount();
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.T = z;
        }
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.T;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.Z;
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.Z = z;
        }
    }

    public int m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue() : this.aa;
    }

    public void x(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf6109e4", new Object[]{this, new Integer(i)});
        } else {
            this.aa = i;
        }
    }

    public void b(RichText richText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51600271", new Object[]{this, richText});
        } else {
            this.ab = richText;
        }
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else {
            this.ac = z;
        }
    }

    public void y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d115e283", new Object[]{this, new Integer(i)});
        } else {
            this.ad = i;
        }
    }
}
