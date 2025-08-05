package tb;

import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class mth {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(String str) {
        int i;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String a2 = mti.a().a("mode", "1");
            String a3 = mti.a().a("list", "");
            if (!TextUtils.isEmpty(a3) && a3.split(",").length != 0) {
                if (str.startsWith(ado.URL_SEPARATOR)) {
                    i = 2;
                } else {
                    int indexOf = str.indexOf(HttpConstant.SCHEME_SPLIT);
                    i = indexOf < 0 ? 0 : indexOf + 3;
                }
                if (i >= str.length()) {
                    return false;
                }
                String substring = str.substring(i);
                String[] split = a3.split(",");
                if (TextUtils.equals(a2, "2")) {
                    int length = split.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        String str2 = split[i2];
                        if (!TextUtils.isEmpty(str2) && substring.startsWith(str2)) {
                            z = false;
                            break;
                        }
                        i2++;
                    }
                    if (!z) {
                        return false;
                    }
                } else if (TextUtils.equals(a2, "1")) {
                    int length2 = split.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            z = false;
                            break;
                        }
                        String str3 = split[i3];
                        if (!TextUtils.isEmpty(str3) && substring.startsWith(str3)) {
                            break;
                        }
                        i3++;
                    }
                    if (!z) {
                        return false;
                    }
                }
                return str.contains("x-ssr=true");
            }
            if (TextUtils.equals(a2, "2")) {
                return str.contains("x-ssr=true");
            }
            if (TextUtils.equals(a2, "1")) {
                return false;
            }
            return str.contains("x-ssr=true");
        } catch (Throwable unused) {
            return false;
        }
    }
}
