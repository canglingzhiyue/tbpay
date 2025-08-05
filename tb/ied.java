package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class ied {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f28960a = 0;

    static {
        Pattern.compile("^([a-z_]{2,32})(\\.[a-z0-9_]{1,32}){1,8}$");
    }

    public static String a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a51c09c9", new Object[]{strArr});
        }
        for (String str : strArr) {
            if (str != null && str.length() > 0) {
                return str;
            }
        }
        return "";
    }

    public static String a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{obj});
        }
        if (obj == null) {
            return "<null>";
        }
        if (!(obj instanceof Integer) && !(obj instanceof Float) && !(obj instanceof Byte) && !(obj instanceof Long) && !(obj instanceof String) && !(obj instanceof Boolean)) {
            return "<" + obj.getClass().getName() + "@" + obj.hashCode() + ">";
        }
        return "<" + obj + ">";
    }

    public static String[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ad023781", new Object[]{str});
        }
        String[] split = str.split("\\.", 2);
        String[] strArr = new String[2];
        String str2 = null;
        strArr[0] = split.length == 2 ? split[0] : null;
        if (split.length == 2) {
            str2 = split[1];
        }
        strArr[1] = str2;
        return strArr;
    }

    public static boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{str, str2, str3})).booleanValue();
        }
        if (str != null && !TextUtils.isEmpty(str3)) {
            return new HashSet(Arrays.asList(str.split(str2))).contains(str3);
        }
        return false;
    }
}
