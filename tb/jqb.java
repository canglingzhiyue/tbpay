package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes6.dex */
public final class jqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(367265988);
    }

    public static boolean a(String str, String str2, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7b3a271", new Object[]{str, str2, list})).booleanValue();
        }
        if (str2 == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        try {
            String a2 = a(str, str2);
            for (String str3 : list) {
                if (str3 != null) {
                    if (!str2.equals(str3) && !a2.equals(str3)) {
                        int length = str3.length();
                        int indexOf = str3.indexOf(".*.");
                        if (indexOf < 0) {
                            boolean startsWith = str3.startsWith("*.");
                            boolean endsWith = str3.endsWith(oan.DEFAULT_PLAN_B_PASSWORD_REGEX);
                            if (!startsWith || !endsWith) {
                                if (startsWith && length > 2 && a2.endsWith(str3.substring(2))) {
                                    return true;
                                }
                                if (endsWith && length > 2 && a2.startsWith(str3.substring(0, str3.indexOf(oan.DEFAULT_PLAN_B_PASSWORD_REGEX)))) {
                                }
                            } else if (length > 4) {
                                String substring = str3.substring(0, str3.indexOf(oan.DEFAULT_PLAN_B_PASSWORD_REGEX));
                                if (!StringUtils.isEmpty(substring) && a2.contains(substring.substring(2))) {
                                    return true;
                                }
                            } else {
                                continue;
                            }
                        } else if (length > 3) {
                            String substring2 = str3.substring(0, indexOf);
                            String substring3 = str3.substring(indexOf + 3);
                            if (a2.startsWith(substring2) && a2.endsWith(substring3)) {
                                return true;
                            }
                        } else {
                            continue;
                        }
                    }
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (StringUtils.isEmpty(str)) {
            return str2;
        }
        if (StringUtils.isEmpty(str2)) {
            return str;
        }
        return str + "." + str2;
    }
}
