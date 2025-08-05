package com.alipay.android.app.template;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v4.view.InputDeviceCompat;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.util.Log;
import com.alipay.birdnest.api.BirdNestEngine;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBTools;
import com.taobao.android.weex_framework.util.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class HtmlLite {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f4447a = Pattern.compile("\\s*([\\w|-]+)\\s*=\\s*[\"|']?([^\"'\\s]+)[\"|']?");
    public static final HashMap<String, String> b;
    public static final HashMap<String, Integer> c;
    public static final HashMap<String, Integer> d;

    /* loaded from: classes3.dex */
    public static class CustomTypefaceSpan extends TypefaceSpan {

        /* renamed from: a  reason: collision with root package name */
        public final Typeface f4448a;

        public CustomTypefaceSpan(String str, Typeface typeface) {
            super(str);
            this.f4448a = typeface;
        }

        public static void a(Paint paint, Typeface typeface) {
            Typeface typeface2 = paint.getTypeface();
            int style = (typeface2 == null ? 0 : typeface2.getStyle()) & (~typeface.getStyle());
            if ((style & 1) != 0) {
                paint.setFakeBoldText(true);
            }
            if ((style & 2) != 0) {
                paint.setTextSkewX(-0.25f);
            }
            paint.setTypeface(typeface);
        }

        @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            a(textPaint, this.f4448a);
        }

        @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
        public void updateMeasureState(TextPaint textPaint) {
            a(textPaint, this.f4448a);
        }
    }

    /* loaded from: classes3.dex */
    public static class E {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String TEXT = "text";
        public ArrayList<E> children;
        public Map<String, String> props;
        public String tag;
        public String text;

        public String toString() {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            sb.append("tag: ");
            sb.append(this.tag);
            sb.append(", text: ");
            sb.append(this.text);
            sb.append(" children: ");
            if (this.children == null) {
                i = 0;
            } else {
                i = this.children.size() + ", props: " + this.props;
            }
            sb.append(i);
            return sb.toString();
        }
    }

    /* loaded from: classes3.dex */
    public interface UrlSpanFactory {
        URLSpan createInstance(String str);
    }

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        b = hashMap;
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        c = hashMap2;
        HashMap<String, Integer> hashMap3 = new HashMap<>();
        d = hashMap3;
        hashMap.put("&nbsp;", " ");
        hashMap.put("&lt;", "<");
        hashMap.put("&gt;", ">");
        hashMap.put("&amp;", "&");
        hashMap.put("&quot;", "\"");
        hashMap.put("&apos;", "'");
        hashMap.put("&cent;", "￠");
        hashMap.put("&pound;", "");
        hashMap.put("&yen;", "¥");
        hashMap.put("&euro;", "€");
        hashMap.put("&sect;", "§");
        hashMap.put("&copy;", "©");
        hashMap.put("&reg;", "®");
        hashMap.put("&trade;", "™");
        hashMap.put("&times;", "×");
        hashMap.put("&divide;", "÷");
        hashMap.put("&middot;", "·");
        hashMap2.put(a.ATOM_EXT_black, -16777216);
        hashMap2.put("darkgray", -12303292);
        hashMap2.put(a.ATOM_EXT_gray, -7829368);
        hashMap2.put("lightgray", -3355444);
        hashMap2.put(a.ATOM_EXT_white, -1);
        hashMap2.put(a.ATOM_EXT_red, -65536);
        hashMap2.put(a.ATOM_EXT_green, -16711936);
        hashMap2.put(a.ATOM_EXT_blue, -16776961);
        hashMap2.put(a.ATOM_EXT_yellow, Integer.valueOf((int) InputDeviceCompat.SOURCE_ANY));
        hashMap2.put("cyan", -16711681);
        hashMap2.put("magenta", -65281);
        hashMap2.put(a.ATOM_EXT_aqua, -16711681);
        hashMap2.put(a.ATOM_EXT_fuchsia, -65281);
        hashMap2.put("darkgrey", -12303292);
        hashMap2.put("grey", -7829368);
        hashMap2.put("lightgrey", -3355444);
        hashMap2.put(a.ATOM_EXT_lime, -16711936);
        hashMap2.put(a.ATOM_EXT_maroon, -8388608);
        hashMap2.put(a.ATOM_EXT_navy, -16777088);
        hashMap2.put(a.ATOM_EXT_olive, -8355840);
        hashMap2.put(a.ATOM_EXT_purple, -8388480);
        hashMap2.put(a.ATOM_EXT_silver, -4144960);
        hashMap2.put(a.ATOM_EXT_teal, -16744320);
        hashMap3.put("bold", 1);
        hashMap3.put("normal", 0);
        hashMap3.put("italic", 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0110 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.SpannableStringBuilder a(com.alipay.android.app.template.HtmlLite.E r22, android.text.SpannableStringBuilder r23, float r24, com.alipay.android.app.template.HtmlLite.UrlSpanFactory r25, android.content.Context r26, com.alipay.birdnest.api.BirdNestEngine.ThemeColorProvider r27, int r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.app.template.HtmlLite.a(com.alipay.android.app.template.HtmlLite$E, android.text.SpannableStringBuilder, float, com.alipay.android.app.template.HtmlLite$UrlSpanFactory, android.content.Context, com.alipay.birdnest.api.BirdNestEngine$ThemeColorProvider, int, boolean):android.text.SpannableStringBuilder");
    }

    public static String convertHtmlEntities(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1cdeb70", new Object[]{str});
        }
        for (String str2 : b.keySet()) {
            str = str.replace(str2, b.get(str2));
        }
        return str;
    }

    public static Spannable fromHtml(Context context, float f, String str, UrlSpanFactory urlSpanFactory) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Spannable) ipChange.ipc$dispatch("e8805a52", new Object[]{context, new Float(f), str, urlSpanFactory}) : fromHtml(context, f, str, urlSpanFactory, null, 0);
    }

    public static int getFontWeight(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10923261", new Object[]{str})).intValue();
        }
        Integer num = d.get(str.toLowerCase(Locale.ROOT));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static int getHtmlColor(String str, BirdNestEngine.ThemeColorProvider themeColorProvider, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("adf23aa8", new Object[]{str, themeColorProvider, new Integer(i)})).intValue() : getHtmlColor(str, themeColorProvider, i, true);
    }

    public static boolean hasHtmlEntityChar(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ab90533", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        for (String str2 : b.keySet()) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasUrlSpan(Spannable spannable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6c169bd", new Object[]{spannable})).booleanValue();
        }
        try {
            URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
            if (uRLSpanArr != null) {
                if (uRLSpanArr.length > 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            Log.e("hasUrlSpan-tag", "hasUrlSpan failed", th);
            return false;
        }
    }

    public static Spannable fromHtml(Context context, float f, String str, UrlSpanFactory urlSpanFactory, BirdNestEngine.ThemeColorProvider themeColorProvider, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Spannable) ipChange.ipc$dispatch("938da830", new Object[]{context, new Float(f), str, urlSpanFactory, themeColorProvider, new Integer(i)}) : fromHtml(context, f, str, urlSpanFactory, themeColorProvider, i, true);
    }

    public static int getHtmlColor(String str, BirdNestEngine.ThemeColorProvider themeColorProvider, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1055ceb2", new Object[]{str, themeColorProvider, new Integer(i), new Boolean(z)})).intValue();
        }
        try {
            Integer num = c.get(str.toLowerCase(Locale.ROOT));
            if (num == null) {
                return FBTools.parseColor(str, themeColorProvider, i, z);
            }
            return themeColorProvider != null ? themeColorProvider.mapHexColor(num.intValue(), i) : num.intValue();
        } catch (Throwable th) {
            Log.e("", "html color failed", th);
            return -1;
        }
    }

    public static SpannableStringBuilder fromHtml(Context context, float f, String str, UrlSpanFactory urlSpanFactory, BirdNestEngine.ThemeColorProvider themeColorProvider, int i, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("8be6b6be", new Object[]{context, new Float(f), str, urlSpanFactory, themeColorProvider, new Integer(i), new Boolean(z)});
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str.indexOf("&") == -1) {
            z2 = false;
        }
        if (str.indexOf("<") == -1 && !z2) {
            spannableStringBuilder.append((CharSequence) str);
            return spannableStringBuilder;
        }
        E e = new E();
        if (z2) {
            str = convertHtmlEntities(str);
        }
        a(str, e);
        return a(e, spannableStringBuilder, f, urlSpanFactory, context, themeColorProvider, i, z);
    }

    public static void a(String str, E e) {
        String substring;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4e45ef7", new Object[]{str, e});
        } else if (str.startsWith("<")) {
            int indexOf = str.indexOf(" ");
            HashMap hashMap = null;
            if (indexOf != -1) {
                substring = str.substring(1, indexOf);
            } else {
                substring = str.substring(1, str.indexOf(">"));
                indexOf = 0;
            }
            int indexOf2 = str.indexOf(">", indexOf);
            if (indexOf2 == -1) {
                return;
            }
            Matcher matcher = f4447a.matcher(str.substring(indexOf, indexOf2).trim());
            while (matcher.find()) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                hashMap.put(group, group2);
            }
            String str2 = "</" + substring + ">";
            int indexOf3 = str.indexOf(str2);
            if (indexOf3 == -1) {
                return;
            }
            E e2 = new E();
            e2.tag = substring;
            e2.props = hashMap;
            String substring2 = str.substring(indexOf2 + 1, indexOf3);
            if ("font".equals(substring)) {
                e2.text = substring2;
            } else if ("a".equals(substring)) {
                if (substring2.indexOf("<") == -1) {
                    e2.text = substring2;
                } else {
                    a(substring2, e2);
                }
            }
            if (e.children == null) {
                e.children = new ArrayList<>();
            }
            e.children.add(e2);
            if (e.tag != null || str2.length() + indexOf3 > str.length() - 1) {
                return;
            }
            a(str.substring(indexOf3 + str2.length(), str.length()), e);
        } else {
            int indexOf4 = str.indexOf("<");
            if (e.children == null) {
                e.children = new ArrayList<>();
            }
            if (indexOf4 != -1) {
                E e3 = new E();
                e3.text = str.substring(0, indexOf4);
                e3.tag = "text";
                e.children.add(e3);
                a(str.substring(indexOf4, str.length()), e);
                return;
            }
            E e4 = new E();
            e4.text = str;
            e4.tag = "text";
            e.children.add(e4);
        }
    }
}
