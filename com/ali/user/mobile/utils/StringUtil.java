package com.ali.user.mobile.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class StringUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String AREACODE_852 = "852";
    private static final String AREACODE_853 = "853";
    private static final String AREACODE_86 = "86";
    private static final String AREACODE_886 = "886";
    public static final String CALLBACK = "https://www.alipay.com/webviewbridge";

    static {
        kge.a(2010957081);
    }

    public static boolean checkWebviewBridge(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80b177cf", new Object[]{str})).booleanValue();
        }
        Uri parse = Uri.parse(str);
        StringBuilder sb = new StringBuilder();
        sb.append(parse.getAuthority());
        sb.append(parse.getPath());
        return CALLBACK.contains(sb.toString());
    }

    public static boolean contains(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d8ebed3e", new Object[]{str, str2})).booleanValue() : (str == null || str2 == null || !str.contains(str2)) ? false : true;
    }

    public static String dataMasking(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("38ea3e43", new Object[]{str}) : dataMasking(str, false);
    }

    public static String dataMasking(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("879baf09", new Object[]{str, new Boolean(z)});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("@")) {
            int indexOf = str.indexOf("@");
            String substring = str.substring(0, indexOf);
            String substring2 = str.substring(indexOf, str.length());
            if (substring.length() >= 3) {
                return substring.substring(0, 3) + "***" + substring2;
            }
            return substring + "***" + substring2;
        } else if (str.matches("1\\d{10}")) {
            String substring3 = str.substring(0, 3);
            String substring4 = str.substring(7, str.length());
            return substring3 + "****" + substring4;
        } else if (str.length() <= 1 || z) {
            return str;
        } else {
            String substring5 = str.substring(0, 1);
            String substring6 = str.substring(str.length() - 1, str.length());
            return substring5 + "***" + substring6;
        }
    }

    public static boolean isMobileHidden(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd49d94b", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return str.matches("[0-9*]+");
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static String hiddenMiddle(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef08fd10", new Object[]{str, new Integer(i), new Integer(i2)});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i3 = 1; i3 <= length; i3++) {
            if (i3 >= i && i3 < i + i2) {
                sb.append('*');
            } else {
                sb.append(str.charAt(i3 - 1));
            }
        }
        return sb.toString();
    }

    public static String hiddenExceptPreAndPost(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad76ad38", new Object[]{str, new Integer(i), new Integer(i2)});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int length = str.length();
        return length <= i + i2 ? str : hiddenMiddle(str, i + 1, (length - i) - i2);
    }

    public static String showSensitiveFieldForMobileLocal(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b2c558e4", new Object[]{str, str2});
        }
        if (str2 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(str) || AREACODE_86.equals(str)) {
            if (str2.length() < 11) {
                sb.append("***");
                sb.append(str2.substring(str2.length() - 1));
            } else {
                sb.append(hiddenExceptPreAndPost(str2, 3, 4));
            }
        } else if (AREACODE_886.equals(str)) {
            if (str2.length() < 6) {
                sb.append("***");
                sb.append(str2.substring(str2.length() - 1));
            } else {
                sb.append(hiddenExceptPreAndPost(str2, 2, 3));
            }
        } else if (AREACODE_852.equals(str) || AREACODE_853.equals(str)) {
            if (str2.length() < 6) {
                sb.append("***");
                sb.append(str2.substring(str2.length() - 1));
            } else {
                sb.append(hiddenExceptPreAndPost(str2, 2, 2));
            }
        } else if (str2.length() < 5) {
            sb.append("***");
            sb.append(str2.substring(str2.length() - 1));
        } else {
            int length = (str2.length() / 2) - 2;
            sb.append(hiddenExceptPreAndPost(str2, length, (str2.length() - length) - 4));
        }
        return sb.toString();
    }
}
