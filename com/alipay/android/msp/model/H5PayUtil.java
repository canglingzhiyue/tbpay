package com.alipay.android.msp.model;

import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import tb.riy;

/* loaded from: classes3.dex */
public class H5PayUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_AND_LITE = "ty";
    public static final String KEY_APP_KEY = "appkey";
    public static final String KEY_START_TIME = "sdk_start_time";
    public static final String TAOBAO_BACK_URL = "https://h5.m.taobao.com/mlapp/olist.html";
    public static final String newWap = "mclient.alipay.com/home/exterfaceAssign.htm";
    public static final String oldWap = "wappaygw.alipay.com/service/rest.htm";
    public static final String oldWapTwo = "mclient.alipay.com/service/rest.htm";

    public static boolean appendVarialbeValue(boolean z, boolean z2, String str, StringBuilder sb, Map<String, String> map, String... strArr) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6940e11", new Object[]{new Boolean(z), new Boolean(z2), str, sb, map, strArr})).booleanValue();
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str2 = "";
                break;
            }
            String str3 = strArr[i];
            if (!StringUtils.isEmpty(map.get(str3))) {
                str2 = map.get(str3);
                break;
            }
            i++;
        }
        if (StringUtils.isEmpty(str2)) {
            if (z2) {
                return false;
            }
        } else if (z) {
            sb.append("&");
            sb.append(str);
            sb.append("=\"");
            sb.append(str2);
            sb.append("\"");
        } else {
            sb.append(str);
            sb.append("=\"");
            sb.append(str2);
            sb.append("\"");
        }
        return true;
    }

    public static String getValue(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5f588a", new Object[]{str, str2});
        }
        String str3 = str2 + "={";
        return str.substring(str.indexOf(str3) + str3.length(), str.lastIndexOf(riy.BLOCK_END_STR));
    }

    public static Map<String, String> convertArgs(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("83e57436", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        for (String str2 : str.split("&")) {
            int indexOf = str2.indexOf("=", 1);
            hashMap.put(str2.substring(0, indexOf), URLDecoder.decode(str2.substring(indexOf + 1)));
        }
        return hashMap;
    }

    public static String subString(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b95f350a", new Object[]{str, str2, str3});
        }
        try {
            int indexOf = str3.indexOf(str) + str.length();
            if (indexOf < str.length()) {
                return "";
            }
            if (!StringUtils.isEmpty(str2)) {
                i = str3.indexOf(str2, indexOf);
            }
            if (i <= 0) {
                return str3.substring(indexOf);
            }
            return str3.substring(indexOf, i);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String buildSimpleBizContext(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9d74469", new Object[]{str, str2});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appkey", "2014052600006128");
            jSONObject.put("ty", "sdk_and");
            jSONObject.put("sdk_start_time", System.currentTimeMillis());
            if (!StringUtils.isEmpty(str)) {
                jSONObject.put(str, str2);
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return "";
        }
    }
}
