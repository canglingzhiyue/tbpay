package com.taobao.tao.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import tb.kge;

/* loaded from: classes.dex */
public class StringUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-992086400);
    }

    public static String safeSetString(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8153ad69", new Object[]{str}) : str == null ? "" : str;
    }

    public static boolean isEmpty(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a300898", new Object[]{str})).booleanValue() : str == null || "".equals(str);
    }

    public static boolean contains(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d8ebed3e", new Object[]{str, str2})).booleanValue() : (str == null || str2 == null || str.indexOf(str2) < 0) ? false : true;
    }

    public static boolean contains(String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99fd51c7", new Object[]{strArr, str})).booleanValue();
        }
        if (strArr != null && str != null) {
            for (String str2 : strArr) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String join(Collection collection, String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4402534", new Object[]{collection, str});
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (Object obj : collection) {
            if (!z) {
                stringBuffer.append(str);
            }
            stringBuffer.append(obj.toString());
            z = false;
        }
        return stringBuffer.toString();
    }
}
