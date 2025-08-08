package com.taobao.message.kit.util;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import tb.kge;

/* loaded from: classes7.dex */
public class AmpUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CODE_SEPRATOR = "_";
    private static final String TAG = "AmpUtil";

    static {
        kge.a(1170536333);
    }

    public static String createPrivateCcode(long j, long j2, int i) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb5594ad", new Object[]{new Long(j), new Long(j2), new Integer(i)});
        }
        if (j == 0 || j2 == 0) {
            throw new Exception("createPrivateCcode error:param is null");
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(0);
        stringBuffer.append("_");
        stringBuffer.append("U");
        stringBuffer.append("_");
        stringBuffer.append(j);
        stringBuffer.append("_");
        stringBuffer.append(j2);
        if (i > 0) {
            stringBuffer.append("_");
            stringBuffer.append(i);
        }
        return stringBuffer.toString();
    }

    public static String old2NewPrivateCcode(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6fbbf3a", new Object[]{str, str2, new Integer(i)});
        }
        if (i <= 0) {
            i = 1;
        }
        try {
            String substring = str.substring(str.indexOf("_", str.indexOf("_") + 1) + 1, str.indexOf("_", str.indexOf("_", str.indexOf("_") + 1) + 1));
            String substring2 = str.substring(str.indexOf("_", str.indexOf("_", str.indexOf("_") + 1) + 1) + 1);
            return "0_U_" + getMinStr(substring, substring2) + "#" + str2 + "_" + getMaxStr(substring, substring2) + "#" + str2 + "_" + i + "_" + substring + "#" + str2;
        } catch (Exception e) {
            TLog.loge(TAG, e.toString());
            return null;
        }
    }

    public static String new2OldGroupCcode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c20961c9", new Object[]{str});
        }
        try {
            return getOldGroupCcodeFromGroupId(str.substring(0, str.lastIndexOf("_")));
        } catch (Exception e) {
            TLog.loge(TAG, e.toString());
            return null;
        }
    }

    public static String new2OldPrivateCcode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80a4b40d", new Object[]{str});
        }
        try {
            String substring = str.substring(str.lastIndexOf("_") + 1, str.lastIndexOf("#"));
            String substring2 = str.substring(str.indexOf("_", str.indexOf("_") + 1) + 1, str.indexOf("#"));
            String substring3 = str.substring(str.indexOf("_", str.indexOf("_", str.indexOf("_") + 1) + 1) + 1, str.indexOf("#", str.indexOf("#") + 1));
            if (!substring2.equals(substring)) {
                substring3 = substring2;
            }
            return "0_U_" + substring + "_" + substring3;
        } catch (Exception e) {
            TLog.loge(TAG, e.toString());
            return null;
        }
    }

    public static String getOldGroupCcodeFromGroupId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c3070e41", new Object[]{str});
        }
        try {
            String replace = str.replace(str.substring(str.indexOf("#"), str.indexOf("#") + 2), "");
            return replace.substring(0, replace.length() - 2);
        } catch (Exception e) {
            TLog.loge(TAG, e.toString());
            return null;
        }
    }

    public static String getGroupIdFromOldGroupCcode(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa6b36fb", new Object[]{str, str2});
        }
        try {
            int indexOf = str.indexOf("_", str.indexOf("_", str.indexOf("_") + 1) + 1);
            if (indexOf > 0) {
                StringBuilder sb = new StringBuilder(str);
                StringBuilder insert = sb.insert(indexOf, "#" + str2);
                insert.append("_0");
                return insert.toString();
            }
            TLog.loge(TAG, "index invalid");
            return null;
        } catch (Exception e) {
            TLog.loge(TAG, e.toString());
            return null;
        }
    }

    public static String getContactIdFromOldPrivateCcode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d8c29aa", new Object[]{str});
        }
        try {
            return str.substring(str.indexOf("_", str.indexOf("_", str.indexOf("_") + 1) + 1) + 1);
        } catch (Exception e) {
            TLog.loge(TAG, e.toString());
            return null;
        }
    }

    public static boolean isPrivateCcode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15b6aaac", new Object[]{str})).booleanValue();
        }
        try {
            int indexOf = str.indexOf("_") + 1;
            return "U".equals(str.substring(indexOf, str.indexOf("_", indexOf)));
        } catch (Exception e) {
            TLog.loge(TAG, e.toString());
            return false;
        }
    }

    public static boolean isGroupCcode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc0d46b0", new Object[]{str})).booleanValue();
        }
        try {
            int indexOf = str.indexOf("_") + 1;
            return "G".equals(str.substring(indexOf, str.indexOf("_", indexOf)));
        } catch (Exception e) {
            TLog.loge(TAG, e.toString());
            return false;
        }
    }

    private static String getMinStr(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6e633410", new Object[]{str, str2}) : (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || str.compareTo(str2) < 0) ? str : str2;
    }

    private static String getMaxStr(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1507fc22", new Object[]{str, str2}) : (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || str.compareTo(str2) > 0) ? str : str2;
    }
}
