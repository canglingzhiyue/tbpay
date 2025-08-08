package com.taobao.android.weex_uikit.util;

import android.content.Context;
import android.graphics.Color;
import mtopsdk.common.util.StringUtils;
import android.util.TypedValue;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_uikit.ui.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
import tb.jwx;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1423136431);
    }

    public static jwx a(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jwx) ipChange.ipc$dispatch("9c8d666", new Object[]{mUSValue});
        }
        String stringValue = mUSValue.getStringValue();
        if (StringUtils.isEmpty(stringValue)) {
            throw new IllegalArgumentException("backgroundImage is empty string");
        }
        List<String> e = e(stringValue);
        if (e == null || e.size() != 3) {
            throw new IllegalArgumentException("backgroundImage is invalid string");
        }
        return new jwx(e.get(0).trim(), a(e.get(1).trim()), a(e.get(2).trim()));
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if (str == null) {
            throw new IllegalArgumentException("Color is null");
        }
        if (str.startsWith("#")) {
            return b(str);
        }
        if (str.startsWith("rgba(")) {
            return d(str);
        }
        if (str.startsWith("rgb(")) {
            return c(str);
        }
        return z.a(str);
    }

    private static int c(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7926cac2", new Object[]{str, new Integer(i)})).intValue() : (int) ((Float.parseFloat(str) / 100.0f) * i);
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }

    public static int b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d253be3", new Object[]{str, new Integer(i)})).intValue();
        }
        int lastIndexOf = str.lastIndexOf(37);
        if (lastIndexOf != -1) {
            return c(str.substring(0, lastIndexOf), i);
        }
        return (int) Float.parseFloat(str);
    }

    private static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{str})).intValue();
        }
        if (str.length() == 4) {
            int parseInt = Integer.parseInt(str.substring(1, 2), 16);
            int parseInt2 = Integer.parseInt(str.substring(2, 3), 16);
            int parseInt3 = Integer.parseInt(str.substring(3, 4), 16);
            return Color.rgb(parseInt + (parseInt << 4), parseInt2 + (parseInt2 << 4), parseInt3 + (parseInt3 << 4));
        }
        return Color.parseColor(str);
    }

    private static int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea7", new Object[]{str})).intValue();
        }
        String[] split = str.substring(str.indexOf(riy.BRACKET_START_STR) + 1, str.lastIndexOf(riy.BRACKET_END_STR)).split(",");
        if (split.length != 3) {
            throw new IllegalArgumentException("Invalid rgb() format");
        }
        return Color.rgb(b(split[0].trim(), 255), b(split[1].trim(), 255), b(split[2].trim(), 255));
    }

    private static int d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d23b17e8", new Object[]{str})).intValue();
        }
        String[] split = str.substring(str.indexOf(riy.BRACKET_START_STR) + 1, str.lastIndexOf(riy.BRACKET_END_STR)).split(",");
        if (split.length != 4) {
            throw new IllegalArgumentException("Invalid rgba() format");
        }
        float parseFloat = Float.parseFloat(split[3].trim());
        if (parseFloat < 0.0f) {
            parseFloat = 0.0f;
        } else if (parseFloat > 1.0f) {
            parseFloat = 1.0f;
        }
        return Color.argb((int) (parseFloat * 255.0f), b(split[0].trim(), 255), b(split[1].trim(), 255), b(split[2].trim(), 255));
    }

    public static float[] a(String str, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("c6cef76f", new Object[]{str, new Float(f), new Float(f2)});
        }
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        if (!StringUtils.isEmpty(str)) {
            str = str.replaceAll("\\s*", "").toLowerCase(Locale.ROOT);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1352032154:
                if (str.equals("tobottom")) {
                    c = 2;
                    break;
                }
                break;
            case -1137407871:
                if (str.equals("toright")) {
                    c = 0;
                    break;
                }
                break;
            case -868157182:
                if (str.equals("toleft")) {
                    c = 1;
                    break;
                }
                break;
            case -172068863:
                if (str.equals("totopleft")) {
                    c = 5;
                    break;
                }
                break;
            case 110550266:
                if (str.equals("totop")) {
                    c = 3;
                    break;
                }
                break;
            case 1176531318:
                if (str.equals("tobottomright")) {
                    c = 4;
                    break;
                }
                break;
        }
        if (c == 0) {
            fArr[2] = f;
        } else if (c == 1) {
            fArr[0] = f;
        } else if (c == 2) {
            fArr[3] = f2;
        } else if (c == 3) {
            fArr[1] = f2;
        } else if (c == 4) {
            fArr[2] = f;
            fArr[3] = f2;
        } else if (c == 5) {
            fArr[0] = f;
            fArr[1] = f2;
        }
        return fArr;
    }

    private static List<String> e(String str) {
        String nextToken;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("adc5ce51", new Object[]{str});
        }
        if (!str.startsWith("linear-gradient")) {
            throw new IllegalArgumentException("backgroundImage only support linear-gradient");
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str.substring(str.indexOf(riy.BRACKET_START_STR) + 1, str.lastIndexOf(riy.BRACKET_END_STR)), ",");
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str2 = null;
            while (stringTokenizer.hasMoreTokens()) {
                nextToken = stringTokenizer.nextToken();
                if (nextToken.contains(riy.BRACKET_START_STR)) {
                    str2 = nextToken + ",";
                } else if (nextToken.contains(riy.BRACKET_END_STR)) {
                    break;
                } else if (str2 != null) {
                    str2 = str2 + nextToken + ",";
                } else {
                    arrayList.add(nextToken);
                }
            }
            return arrayList;
            arrayList.add(str2 + nextToken);
        }
    }

    public static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{context, new Float(f)})).intValue() : (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }
}
