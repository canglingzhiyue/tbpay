package tb;

import android.text.GetChars;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes8.dex */
public class ofu implements GetChars, Spanned {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final char[] ELLIPSIS_NORMAL;

    /* renamed from: a  reason: collision with root package name */
    private final Spanned f32018a;
    private Layout b;
    private int c = -1;
    private int d = -1;
    private ReplacementSpan e;

    static {
        kge.a(-1253670432);
        kge.a(1877392033);
        kge.a(-2037822135);
        ELLIPSIS_NORMAL = new char[]{8230};
    }

    public ofu(Spanned spanned) {
        this.f32018a = spanned;
    }

    public void a(ReplacementSpan replacementSpan) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65865db", new Object[]{this, replacementSpan});
        } else {
            this.e = replacementSpan;
        }
    }

    public ReplacementSpan a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ReplacementSpan) ipChange.ipc$dispatch("99525661", new Object[]{this}) : this.e;
    }

    public Spanned b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Spanned) ipChange.ipc$dispatch("34b3873b", new Object[]{this}) : this.f32018a;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5bdb51", new Object[]{this, obj})).intValue();
        }
        ReplacementSpan replacementSpan = this.e;
        if (replacementSpan != null && replacementSpan == obj) {
            return this.d + 1;
        }
        return this.f32018a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f445effd", new Object[]{this, obj})).intValue();
        }
        ReplacementSpan replacementSpan = this.e;
        if (replacementSpan != null && replacementSpan == obj) {
            return 17;
        }
        return this.f32018a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a711f98", new Object[]{this, obj})).intValue();
        }
        ReplacementSpan replacementSpan = this.e;
        if (replacementSpan != null && replacementSpan == obj) {
            return this.c;
        }
        return this.f32018a.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        int i3;
        IpChange ipChange = $ipChange;
        int i4 = 1;
        if (ipChange instanceof IpChange) {
            return (T[]) ((Object[]) ipChange.ipc$dispatch("48ecbc84", new Object[]{this, new Integer(i), new Integer(i2), cls}));
        }
        if (this.d >= i2 && (i3 = this.c) <= i2) {
            Object[] spans = this.f32018a.getSpans(i, Math.max(i3, i), cls);
            Object[] spans2 = this.f32018a.getSpans(Math.min(i2, this.d), i2, cls);
            if (this.e == null || (!cls.isAssignableFrom(ReplacementSpan.class) && cls != this.e.getClass())) {
                i4 = 0;
            }
            int length = spans.length + spans2.length + i4;
            T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, length));
            if (tArr.length > length) {
                tArr = (T[]) Arrays.copyOf(tArr, length);
            }
            System.arraycopy(spans, 0, tArr, 0, spans.length);
            if (i4 > 0) {
                tArr[spans.length] = this.e;
            }
            System.arraycopy(spans2, 0, tArr, spans.length + i4, spans2.length);
            return tArr;
        }
        return (T[]) this.f32018a.getSpans(i, i2, cls);
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("16413897", new Object[]{this, new Integer(i), new Integer(i2), cls})).intValue() : this.f32018a.nextSpanTransition(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("451fdc60", new Object[]{this})).intValue() : this.f32018a.length();
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Character) ipChange.ipc$dispatch("797dd2c0", new Object[]{this, new Integer(i)})).charValue() : this.f32018a.charAt(i);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("45243232", new Object[]{this, new Integer(i), new Integer(i2)}) : this.f32018a.subSequence(i, i2);
    }

    @Override // android.text.GetChars
    public void getChars(int i, int i2, char[] cArr, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("989204ad", new Object[]{this, new Integer(i), new Integer(i2), cArr, new Integer(i3)});
            return;
        }
        TextUtils.getChars(this.f32018a, i, i2, cArr, i3);
        Layout layout = this.b;
        if (layout == null) {
            return;
        }
        int lineForOffset = this.b.getLineForOffset(i2);
        for (int lineForOffset2 = layout.getLineForOffset(i); lineForOffset2 <= lineForOffset; lineForOffset2++) {
            a(i, i2, lineForOffset2, cArr, i3);
        }
    }

    public void a(int i, int i2, int i3, char[] cArr, int i4) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b11bc460", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), cArr, new Integer(i4)});
            return;
        }
        int ellipsisCount = this.b.getEllipsisCount(i3);
        if (ellipsisCount == 0) {
            return;
        }
        int ellipsisStart = this.b.getEllipsisStart(i3);
        int lineStart = this.b.getLineStart(i3);
        for (int i5 = ellipsisStart; i5 < ellipsisStart + ellipsisCount; i5++) {
            if (i5 == ellipsisStart) {
                c = ELLIPSIS_NORMAL[0];
                this.c = i5 + lineStart;
                this.d = this.c + ellipsisCount;
            } else {
                c = 65279;
            }
            int i6 = i5 + lineStart;
            if (i6 >= i && i6 < i2) {
                cArr[(i6 + i4) - i] = c;
            }
        }
    }

    public void a(Layout layout) {
        int ellipsisCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfc35b8d", new Object[]{this, layout});
            return;
        }
        this.b = layout;
        if (layout.getLineCount() != 1 || (ellipsisCount = this.b.getEllipsisCount(0)) == 0) {
            return;
        }
        this.c = this.b.getEllipsisStart(0);
        this.d = this.c + ellipsisCount;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.b = null;
        this.d = -1;
        this.c = -1;
    }
}
