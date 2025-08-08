package tb;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public class dtd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DIMEN_SUFFIX_AP = "ap";
    public static final String DIMEN_SUFFIX_NP = "np";

    static {
        kge.a(-195681922);
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        if (str == null || str.length() <= 0) {
            return i;
        }
        String lowerCase = str.toLowerCase(Locale.SIMPLIFIED_CHINESE);
        StringBuilder sb = new StringBuilder("#");
        for (int i2 = 1; i2 < 9 && i2 < lowerCase.length(); i2++) {
            char charAt = lowerCase.charAt(i2);
            if ((charAt >= '0' && charAt <= '9') || (charAt >= 'a' && charAt <= 'f')) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        return (sb2.length() == 7 || sb2.length() == 9) ? Color.parseColor(sb2) : i;
    }

    public static GradientDrawable a(String[] strArr, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("59b31468", new Object[]{strArr, fArr});
        }
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        if (strArr.length == 1) {
            strArr = new String[]{strArr[0], strArr[0]};
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Integer.valueOf(a(str instanceof String ? str : null, 0)));
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, iArr);
        if (fArr != null) {
            gradientDrawable.setCornerRadii(fArr);
        }
        return gradientDrawable;
    }

    public static GradientDrawable a(List<String> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("88a59471", new Object[]{list}) : a(list, (float[]) null);
    }

    public static GradientDrawable a(String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("39773f53", new Object[]{strArr}) : a(strArr, (float[]) null);
    }

    public static GradientDrawable a(List<String> list, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("96a09a06", new Object[]{list, fArr});
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        if (list.size() == 1) {
            list.add(list.get(0));
        }
        return a((String[]) list.toArray(new String[list.size()]), fArr);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (str.contains("ap")) {
                Float.parseFloat(str.replace("ap", ""));
            } else if (str.contains("np")) {
                Float.parseFloat(str.replace("np", ""));
            } else {
                Float.parseFloat(str);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (StringUtils.isEmpty(str) || str.contains("ap") || str.contains("np")) {
            return str;
        }
        return str + "np";
    }
}
