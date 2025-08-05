package com.taobao.android.weex_uikit.widget.text;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v4.text.TextDirectionHeuristicCompat;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LineHeightSpan;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.common.MUSConstants;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.border.BorderProp;
import tb.kge;

/* loaded from: classes6.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private UINode f16218a;
    private int b;
    private int c;
    private CharSequence d;

    static {
        kge.a(602110890);
    }

    public h(UINode uINode) {
        this.f16218a = uINode;
    }

    private int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        Integer num = (Integer) this.f16218a.getAttribute("lines");
        int intValue = num == null ? Integer.MAX_VALUE : num.intValue();
        if (intValue != Integer.MAX_VALUE || !TextUtils.equals((String) this.f16218a.getAttribute("whiteSpace"), "nowrap")) {
            return intValue;
        }
        return 1;
    }

    public void a(boolean z, int i, int i2, int i3, int i4, int[] iArr, int i5, UINode uINode) {
        int i6 = i;
        int i7 = i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60610e9f", new Object[]{this, new Boolean(z), new Integer(i6), new Integer(i7), new Integer(i3), new Integer(i4), iArr, new Integer(i5), uINode});
            return;
        }
        CharSequence charSequence = (CharSequence) uINode.getAttribute("value");
        if (!z && i5 == 2 && charSequence != null) {
            charSequence = a(charSequence);
            uINode.setAttribute("breakValue", charSequence);
        }
        CharSequence charSequence2 = charSequence;
        if (TextUtils.isEmpty(charSequence2)) {
            if (i3 != 1073741824) {
                i6 = 0;
            }
            if (i4 != 1073741824) {
                i7 = 0;
            }
            iArr[0] = i6;
            iArr[1] = i7;
            uINode.setExtra("textLayout", null);
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, i3);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, i4);
        Layout a2 = a(makeMeasureSpec, a(), false, f(), 0.0f, 0.0f, 0.0f, -7829368, false, charSequence2, b(), f.c, -16776961, c(), 0.0f, 1.0f, 0.0f, f.d, (Typeface) uINode.getExtra("fontFace"), d(), false, b.a(), -1, Integer.MIN_VALUE, 0, Integer.MAX_VALUE, uINode.getInstance().getContext().a().getResources().getDisplayMetrics().density, 0, 0, 0, f.f, e());
        iArr[0] = a(makeMeasureSpec, Integer.MAX_VALUE, a2, false, 0);
        iArr[1] = b.a(makeMeasureSpec2, Integer.MAX_VALUE, Math.max(0, b.b(a2)));
        if (iArr[0] < 0 || iArr[1] < 0) {
            iArr[0] = Math.max(iArr[0], 0);
            iArr[1] = Math.max(iArr[1], 0);
        }
        this.b = iArr[0];
        this.c = iArr[1];
        uINode.setExtra("textLayout", a2);
    }

    private static CharSequence a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("f6c0212e", new Object[]{charSequence});
        }
        StringBuilder sb = new StringBuilder(charSequence.length() << 1);
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (charAt >= 55296 && charAt < 56320) {
                sb.append(charAt);
            } else {
                sb.append(charAt);
                sb.append("\u200b");
            }
        }
        return sb.toString();
    }

    public void a(boolean z, int i, int i2, int i3, int i4, int i5, UINode uINode) {
        int i6;
        int i7;
        int i8;
        int i9;
        int a2;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b984c11", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), uINode});
            return;
        }
        this.d = (CharSequence) uINode.getAttribute("value");
        if (TextUtils.isEmpty(this.d)) {
            uINode.setExtra("textLayout", null);
            return;
        }
        if (!z && i5 == 2) {
            CharSequence charSequence = (CharSequence) uINode.getAttribute("breakValue");
            if (TextUtils.isEmpty(charSequence)) {
                CharSequence charSequence2 = this.d;
                if (charSequence2 != null) {
                    this.d = a(charSequence2);
                    uINode.setAttribute("breakValue", this.d);
                }
            } else {
                this.d = charSequence;
            }
        }
        Layout layout = (Layout) uINode.getExtra("textLayout");
        Rect v = uINode.getNodeInfo().v();
        BorderProp a3 = uINode.getNodeInfo().a(false);
        if (a3 != null) {
            i8 = a3.b(0);
            i7 = a3.b(2);
            i9 = a3.b(1);
            i6 = a3.b(3);
        } else {
            i6 = 0;
            i7 = 0;
            i8 = 0;
            i9 = 0;
        }
        float f = ((((i3 - i) - v.left) - v.right) - i8) - i7;
        float f2 = ((((i4 - i2) - v.top) - v.bottom) - i9) - i6;
        TextUtils.TruncateAt a4 = a();
        String str = a4 == null ? "" : "...";
        if (layout == null || this.b != f || this.c != f2) {
            layout = a(View.MeasureSpec.makeMeasureSpec((int) f, 1073741824), a4, false, f(), 0.0f, 0.0f, 0.0f, -7829368, false, this.d, b(), f.c, -16776961, c(), 0.0f, 1.0f, 0.0f, f.d, (Typeface) uINode.getExtra("fontFace"), d(), false, b.a(), -1, Integer.MIN_VALUE, 0, Integer.MAX_VALUE, uINode.getInstance().getContext().a().getResources().getDisplayMetrics().density, 0, 0, 0, f.f, e());
            uINode.setExtra("textLayout", layout);
        }
        if (a4 != null && (TextUtils.isEmpty(str) || TextUtils.equals("...", str))) {
            z2 = false;
        }
        if (!z2 || (a2 = a(layout)) == -1) {
            return;
        }
        uINode.setExtra("textLayout", a(View.MeasureSpec.makeMeasureSpec((int) f, 1073741824), a4, false, f(), 0.0f, 0.0f, 0.0f, -7829368, false, a(this.d, str, layout, a2, f), b(), f.c, -16776961, c(), 0.0f, 1.0f, 0.0f, f.d, (Typeface) uINode.getExtra("fontFace"), d(), false, b.a(), -1, Integer.MIN_VALUE, 0, Integer.MAX_VALUE, uINode.getInstance().getContext().a().getResources().getDisplayMetrics().density, 0, 0, 0, f.f, e()));
    }

    private static CharSequence a(CharSequence charSequence, CharSequence charSequence2, Layout layout, int i, float f) {
        Rect rect;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("88cbde58", new Object[]{charSequence, charSequence2, layout, new Integer(i), new Float(f)});
        }
        if (TextUtils.isEmpty(charSequence2)) {
            int ellipsisStart = layout.getEllipsisStart(i);
            if (ellipsisStart < charSequence.length()) {
                ellipsisStart++;
            }
            if (Layout.getDesiredWidth(charSequence.subSequence(layout.getLineStart(i), layout.getLineStart(i) + ellipsisStart), layout.getPaint()) > layout.getWidth()) {
                ellipsisStart--;
            }
            return charSequence.subSequence(0, layout.getLineStart(i) + ellipsisStart);
        }
        layout.getPaint().getTextBounds(charSequence2.toString(), 0, charSequence2.length(), new Rect());
        int offsetForHorizontal = layout.getOffsetForHorizontal(i, (f - rect.width()) + layout.getLineLeft(i));
        if (offsetForHorizontal <= 0) {
            return charSequence;
        }
        int i3 = offsetForHorizontal - 1;
        if (layout.getEllipsisCount(i) <= 0 || i3 <= (i2 = layout.getEllipsisStart(i) + layout.getLineStart(i))) {
            i2 = i3;
        }
        return TextUtils.concat(charSequence.subSequence(0, i2), charSequence2);
    }

    private static int a(Layout layout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bfc35b80", new Object[]{layout})).intValue();
        }
        for (int i = 0; i < layout.getLineCount(); i++) {
            if (layout.getEllipsisCount(i) > 0) {
                return i;
            }
        }
        return -1;
    }

    private static Layout a(int i, TextUtils.TruncateAt truncateAt, boolean z, int i2, float f, float f2, float f3, int i3, boolean z2, CharSequence charSequence, int i4, ColorStateList colorStateList, int i5, int i6, float f4, float f5, float f6, int i7, Typeface typeface, Layout.Alignment alignment, boolean z3, int i8, int i9, int i10, int i11, int i12, float f7, int i13, int i14, int i15, TextDirectionHeuristicCompat textDirectionHeuristicCompat, float f8) {
        int i16;
        CharSequence charSequence2 = charSequence;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Layout) ipChange.ipc$dispatch("1d3d0796", new Object[]{new Integer(i), truncateAt, new Boolean(z), new Integer(i2), new Float(f), new Float(f2), new Float(f3), new Integer(i3), new Boolean(z2), charSequence2, new Integer(i4), colorStateList, new Integer(i5), new Integer(i6), new Float(f4), new Float(f5), new Float(f6), new Integer(i7), typeface, alignment, new Boolean(z3), new Integer(i8), new Integer(i9), new Integer(i10), new Integer(i11), new Integer(i12), new Float(f7), new Integer(i13), new Integer(i14), new Integer(i15), textDirectionHeuristicCompat, new Float(f8)});
        }
        final float f9 = f8 > 0.0f ? f8 : i6 * (-f8);
        TextLayoutBuilder textLayoutBuilder = new TextLayoutBuilder();
        textLayoutBuilder.c(false);
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i16 = 2;
        } else if (mode == 0) {
            i16 = 0;
        } else if (mode != 1073741824) {
            throw new IllegalStateException("Unexpected size mode: " + View.MeasureSpec.getMode(i));
        } else {
            i16 = 1;
        }
        TextUtils.TruncateAt truncateAt2 = (truncateAt != null || i2 == Integer.MAX_VALUE) ? truncateAt : TextUtils.TruncateAt.END;
        if (f9 != Float.MAX_VALUE && !(charSequence2 instanceof SpannableString)) {
            SpannableString spannableString = new SpannableString(charSequence2);
            spannableString.setSpan(new LineHeightSpan() { // from class: com.taobao.android.weex_uikit.widget.text.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.text.style.LineHeightSpan
                public void chooseHeight(CharSequence charSequence3, int i17, int i18, int i19, int i20, Paint.FontMetricsInt fontMetricsInt) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("646418b3", new Object[]{this, charSequence3, new Integer(i17), new Integer(i18), new Integer(i19), new Integer(i20), fontMetricsInt});
                        return;
                    }
                    int i21 = (int) ((f9 - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2.0f);
                    fontMetricsInt.top -= i21;
                    fontMetricsInt.bottom += i21;
                    fontMetricsInt.ascent -= i21;
                    fontMetricsInt.descent += i21;
                }
            }, 0, spannableString.length(), 33);
            charSequence2 = spannableString;
        }
        if (truncateAt == TextUtils.TruncateAt.MIDDLE && i2 == 1) {
            charSequence2 = a(charSequence2, i6, View.MeasureSpec.getSize(i));
        }
        textLayoutBuilder.d(f7).a(truncateAt2).e(i2).a(f, f2, f3, i3).b(z2).a(charSequence2).a(i6).a(View.MeasureSpec.getSize(i), i16).a(z).a(f4).b(f5).a(alignment).c(i5).f(i13).g(i14);
        if (Build.VERSION.SDK_INT >= 26) {
            textLayoutBuilder.l(i15);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            textLayoutBuilder.c(f6);
        }
        if (i9 != -1) {
            textLayoutBuilder.h(i9);
        } else {
            textLayoutBuilder.i(i11);
        }
        if (i10 != Integer.MIN_VALUE) {
            textLayoutBuilder.j(i10);
        } else {
            textLayoutBuilder.k(i12);
        }
        if (i4 != 0) {
            textLayoutBuilder.b(i4);
        } else {
            textLayoutBuilder.a(colorStateList);
        }
        if (!f.f16216a.equals(typeface)) {
            textLayoutBuilder.a(typeface);
        } else {
            textLayoutBuilder.d(i7);
        }
        if (textDirectionHeuristicCompat != null) {
            textLayoutBuilder.a(textDirectionHeuristicCompat);
        }
        Layout b = textLayoutBuilder.b();
        if (z3) {
            l.a().a(b);
        }
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e1, code lost:
        return r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.CharSequence a(java.lang.CharSequence r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.text.h.a(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    private static int a(int i, int i2, Layout layout, boolean z, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("343eb48f", new Object[]{new Integer(i), new Integer(i2), layout, new Boolean(z), new Integer(i3)})).intValue();
        }
        if (layout == null) {
            return 0;
        }
        int a2 = b.a(i, i2, layout.getWidth());
        if (z && layout.getLineCount() > 1) {
            int a3 = b.a(i, i2, b.a(layout));
            if (a2 - a3 > i3) {
                return a3;
            }
        }
        return a2;
    }

    public TextUtils.TruncateAt a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextUtils.TruncateAt) ipChange.ipc$dispatch("676bf2de", new Object[]{this});
        }
        String str = (String) this.f16218a.getAttribute("textOverflow");
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 3056464) {
            if (hashCode == 188702929 && str.equals("ellipsis")) {
                c = 2;
            }
        } else if (str.equals("clip")) {
            c = 0;
        }
        if (c == 2) {
            return a((String) this.f16218a.getAttribute(MUSConstants.ELLIPSIS_POSITION));
        }
        return null;
    }

    private TextUtils.TruncateAt a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextUtils.TruncateAt) ipChange.ipc$dispatch("7d756028", new Object[]{this, str});
        }
        if (str == null) {
            return TextUtils.TruncateAt.END;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1074341483) {
            if (hashCode != 100571) {
                if (hashCode == 109757538 && str.equals("start")) {
                    c = 0;
                }
            } else if (str.equals("end")) {
                c = 1;
            }
        } else if (str.equals("middle")) {
            c = 2;
        }
        if (c == 0) {
            return TextUtils.TruncateAt.START;
        }
        if (c == 1) {
            return TextUtils.TruncateAt.END;
        }
        return TextUtils.TruncateAt.MIDDLE;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : ((Integer) this.f16218a.getAttribute("color")).intValue();
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : ((Integer) this.f16218a.getAttribute("fontSize")).intValue();
    }

    public Layout.Alignment d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Layout.Alignment) ipChange.ipc$dispatch("c87c2ad1", new Object[]{this});
        }
        String str = (String) this.f16218a.getAttribute("textAlign");
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1364013995) {
            if (hashCode != 3317767) {
                if (hashCode == 108511772 && str.equals("right")) {
                    c = 3;
                }
            } else if (str.equals("left")) {
                c = 0;
            }
        } else if (str.equals("center")) {
            c = 2;
        }
        if (c == 2) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (c != 3) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    public float e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[]{this})).floatValue() : ((Float) this.f16218a.getAttribute("lineHeight")).floatValue();
    }
}
