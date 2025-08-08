package android.taobao.windvane.util;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f1713a;

    static {
        MimeTypeEnum[] values;
        kge.a(138484009);
        f1713a = new HashMap();
        for (MimeTypeEnum mimeTypeEnum : MimeTypeEnum.values()) {
            f1713a.put(mimeTypeEnum.getSuffix(), mimeTypeEnum.getMimeType());
        }
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        if (str != null && !StringUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str);
                if (!parse.isHierarchical() || parse.getQueryParameter(str2) != null) {
                    return str;
                }
                Uri.Builder buildUpon = parse.buildUpon();
                buildUpon.appendQueryParameter(str2, str3);
                return buildUpon.toString();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return str;
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (str != null && str2 != null) {
            return Uri.parse(str).getQueryParameter(str2);
        }
        return null;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        return str.toLowerCase().startsWith(com.taobao.search.common.util.k.HTTP_PREFIX) || str.toLowerCase().startsWith(com.taobao.search.common.util.k.HTTPS_PREFIX);
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str}) : StringUtils.isEmpty(str) ? "" : str.replaceAll("^((?i)https:)?//", com.taobao.search.common.util.k.HTTP_PREFIX);
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        int f = f(str);
        if (f != -1) {
            return str.substring(0, f);
        }
        return str.indexOf("#") > 0 ? str.substring(0, str.indexOf("#")) : str;
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("666b162a", new Object[]{str}) : c(d(str));
    }

    public static int f(String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("669e4a6a", new Object[]{str})).intValue();
        }
        int length = str.length();
        while (true) {
            indexOf = str.indexOf("?", i);
            if (indexOf == -1) {
                return -1;
            }
            int i2 = indexOf + 1;
            if (i2 >= length || str.charAt(i2) != '?') {
                break;
            }
            i = indexOf + 2;
        }
        return indexOf;
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14a6f7e8", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        String str2 = null;
        if (str.startsWith("http:")) {
            str2 = str.replace("http:", "");
        }
        if (str.startsWith(com.taobao.vessel.utils.b.HTTPS_SCHEMA)) {
            str2 = str.replace(com.taobao.vessel.utils.b.HTTPS_SCHEMA, "");
        }
        return StringUtils.isEmpty(str2) ? str : str2;
    }

    public static String h(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6bc4e8c7", new Object[]{str}) : (!StringUtils.isEmpty(str) && str.indexOf("#") != -1) ? str.substring(0, str.indexOf("#")) : str;
    }

    public static String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2e2d9a6", new Object[]{str});
        }
        if (!StringUtils.isEmpty(str)) {
            try {
                Uri parse = Uri.parse(str);
                if (parse.isHierarchical()) {
                    return new Uri.Builder().scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath()).toString();
                }
            } catch (Throwable unused) {
            }
            int indexOf = str.indexOf("?");
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
            if (!StringUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }
}
