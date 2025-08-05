package com.taobao.android.weex_uikit.widget.text;

import android.os.Build;
import android.support.v4.text.TextDirectionHeuristicCompat;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1974603381);
    }

    private static StaticLayout a(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i4, int i5, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StaticLayout) ipChange.ipc$dispatch("4d73c8ac", new Object[]{charSequence, new Integer(i), new Integer(i2), textPaint, new Integer(i3), alignment, new Float(f), new Float(f2), new Boolean(z), truncateAt, new Integer(i4), new Integer(i5), textDirectionHeuristicCompat});
        }
        try {
            return e.a(charSequence, i, i2, textPaint, i3, alignment, f, f2, z, truncateAt, i4, i5, textDirectionHeuristicCompat);
        } catch (Exception unused) {
            return a(charSequence, i, i2, textPaint, i3, alignment, f, f2, z, truncateAt, i4);
        }
    }

    private static StaticLayout a(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StaticLayout) ipChange.ipc$dispatch("ade0af89", new Object[]{charSequence, new Integer(i), new Integer(i2), textPaint, new Integer(i3), alignment, new Float(f), new Float(f2), new Boolean(z), truncateAt, new Integer(i4)}) : new StaticLayout(charSequence, i, i2, textPaint, i3, alignment, f, f2, z, truncateAt, i4);
    }

    public static StaticLayout a(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i4, int i5, TextDirectionHeuristicCompat textDirectionHeuristicCompat, int i6, int i7, int i8, int[] iArr, int[] iArr2) {
        int lineStart;
        CharSequence charSequence2 = charSequence;
        int i9 = i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StaticLayout) ipChange.ipc$dispatch("531661e1", new Object[]{charSequence2, new Integer(i), new Integer(i2), textPaint, new Integer(i3), alignment, new Float(f), new Float(f2), new Boolean(z), truncateAt, new Integer(i4), new Integer(i9), textDirectionHeuristicCompat, new Integer(i6), new Integer(i7), new Integer(i8), iArr, iArr2});
        }
        if (Build.VERSION.SDK_INT >= 23) {
            StaticLayout.Builder indents = StaticLayout.Builder.obtain(charSequence, i, i2, textPaint, i3).setAlignment(alignment).setLineSpacing(f2, f).setIncludePad(z).setEllipsize(truncateAt).setEllipsizedWidth(i4).setMaxLines(i9).setTextDirection(e.a(textDirectionHeuristicCompat)).setBreakStrategy(i6).setHyphenationFrequency(i7).setIndents(iArr, iArr2);
            if (Build.VERSION.SDK_INT >= 26) {
                indents.setJustificationMode(i8);
            }
            return indents.build();
        }
        StaticLayout a2 = a(charSequence, i, i2, textPaint, i3, alignment, f, f2, z, truncateAt, i4, i5, textDirectionHeuristicCompat);
        if (i9 > 0) {
            int i10 = i2;
            while (a2.getLineCount() > i9 && (lineStart = a2.getLineStart(i9)) < i10) {
                int i11 = lineStart;
                while (i11 > i && Character.isSpace(charSequence2.charAt(i11 - 1))) {
                    i11--;
                }
                int i12 = i11;
                int i13 = i9;
                a2 = a(charSequence, i, i11, textPaint, i3, alignment, f, f2, z, truncateAt, i4, i5, textDirectionHeuristicCompat);
                if (a2.getLineCount() < i13 || a2.getEllipsisCount(i13 - 1) != 0) {
                    charSequence2 = charSequence;
                } else {
                    StringBuilder sb = new StringBuilder();
                    charSequence2 = charSequence;
                    sb.append((Object) charSequence2.subSequence(i, i12));
                    sb.append(" …");
                    String sb2 = sb.toString();
                    a2 = a(sb2, 0, sb2.length(), textPaint, i3, alignment, f, f2, z, truncateAt, i4, i5, textDirectionHeuristicCompat);
                }
                i9 = i5;
                i10 = i12;
            }
        }
        do {
        } while (!a(a2));
        return a2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
        r2 = android.text.StaticLayout.class.getDeclaredField("mLines");
        r2.setAccessible(true);
        r3 = android.text.StaticLayout.class.getDeclaredField("mColumns");
        r3.setAccessible(true);
        r2 = (int[]) r2.get(r7);
        r7 = r3.getInt(r7);
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
        if (r3 >= r7) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
        r5 = (r7 * r1) + r3;
        a(r2, r5, r5 + r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.text.StaticLayout r7) {
        /*
            r0 = 0
            int r1 = r7.getLineStart(r0)
            int r2 = r7.getLineCount()
            r3 = r1
            r1 = 0
        Lb:
            r4 = 1
            if (r1 >= r2) goto L47
            int r5 = r7.getLineEnd(r1)
            if (r5 >= r3) goto L43
            java.lang.Class<android.text.StaticLayout> r2 = android.text.StaticLayout.class
            java.lang.String r3 = "mLines"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.Exception -> L47
            r2.setAccessible(r4)     // Catch: java.lang.Exception -> L47
            java.lang.Class<android.text.StaticLayout> r3 = android.text.StaticLayout.class
            java.lang.String r5 = "mColumns"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r5)     // Catch: java.lang.Exception -> L47
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L47
            java.lang.Object r2 = r2.get(r7)     // Catch: java.lang.Exception -> L47
            int[] r2 = (int[]) r2     // Catch: java.lang.Exception -> L47
            int r7 = r3.getInt(r7)     // Catch: java.lang.Exception -> L47
            r3 = 0
        L35:
            if (r3 >= r7) goto L42
            int r5 = r7 * r1
            int r5 = r5 + r3
            int r6 = r5 + r7
            a(r2, r5, r6)     // Catch: java.lang.Exception -> L47
            int r3 = r3 + 1
            goto L35
        L42:
            return r0
        L43:
            int r1 = r1 + 1
            r3 = r5
            goto Lb
        L47:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.text.d.a(android.text.StaticLayout):boolean");
    }

    private static void a(int[] iArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbcd5c56", new Object[]{iArr, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }
}
