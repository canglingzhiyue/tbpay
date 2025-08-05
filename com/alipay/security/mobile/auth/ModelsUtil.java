package com.alipay.security.mobile.auth;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class ModelsUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, String> modes;

    static {
        HashMap hashMap = new HashMap();
        modes = hashMap;
        hashMap.put("HUAWEI-Z100", "huaweiold_VALUES");
        modes.put("HUAWEI-PLK100", "huawei_VALUES");
        modes.put("HUAWEI-RI100", "huawei_VALUES");
        modes.put("YUNOS-CM810", "yunos_VALUES");
        modes.put("YUNOS-B50", "yunos_VALUES");
        modes.put("YUNOS-I966", "yunos_VALUES");
        modes.put("OPPO-N5207", "oppo_VALUES");
        modes.put("MEIZU-M76", "meizu_VALUES");
        modes.put("MEIZU-M85", "meizu_VALUES");
        modes.put("HTC-HTC-0PK71", "htc_VALUES");
        modes.put("HTC-htc_hima_ace_ml", "htc_VALUES");
        modes.put("VIVO-Xplay5", "vivo_VALUES");
        modes.put("LENOVO-MTK", "lenovo_VALUES");
        modes.put("GiONEE-GN9008", "gionee_VALUES");
        modes.put("Coolpad-T2", "coolpad_VALUES");
        modes.put("Coolpad-8692", "coolpad_VALUES");
        modes.put("ZTE-A2015", "zte_VALUES");
        modes.put("ShenQi-Z1221", "fancymaker_VALUES");
        modes.put("OnePlus-ONE-A2001", "oneplus_VALUES");
        modes.put("huaweiold_VALUES", "{\"packageName\":\"com.alipay.security.mobile.authentication.huawei\",\"vendor\":\"2\",\"protocalType\":\"2\",\"protocolVersion\":\"1\",\"serviceUrl\":\"https://t.alipayobjects.com/L1/71/900/androidSec/Alipaysec.apk\"}");
        modes.put("huawei_VALUES", "{\"packageName\":\"com.alipay.security.mobile.authenticator\",\"vendor\":\"2\",\"protocalType\":\"2\",\"protocolVersion\":\"1\",\"serviceUrl\":\"https://t.alipayobjects.com/L1/71/900/androidSec/Alipaysec_common.apk\"}");
        modes.put("yunos_VALUES", "{\"packageName\":\"com.alipay.security.mobile.authenticator\",\"vendor\":\"3\",\"protocalType\":\"2\",\"protocolVersion\":\"1\",\"serviceUrl\":\"https://t.alipayobjects.com/L1/71/900/androidSec/Alipaysec_common.apk\"}");
        modes.put("oppo_VALUES", "{\"packageName\":\"com.alipay.security.mobile.authenticator\",\"vendor\":\"4\",\"protocalType\":\"2\",\"protocolVersion\":\"1\",\"serviceUrl\":\"https://t.alipayobjects.com/L1/71/900/androidSec/Alipaysec_common.apk\"}");
        modes.put("meizu_VALUES", "{\"packageName\":\"com.alipay.security.mobile.authenticator\",\"vendor\":\"5\",\"protocalType\":\"2\",\"protocolVersion\":\"1\",\"serviceUrl\":\"https://t.alipayobjects.com/L1/71/900/androidSec/Alipaysec_common.apk\"}");
        modes.put("htc_VALUES", "{\"packageName\":\"com.alipay.security.mobile.authenticator\",\"vendor\":\"6\",\"protocalType\":\"2\",\"protocolVersion\":\"1\",\"serviceUrl\":\"https://t.alipayobjects.com/L1/71/900/androidSec/Alipaysec_common.apk\"}");
        modes.put("vivo_VALUES", "{\"packageName\":\"com.alipay.security.mobile.authenticator\",\"vendor\":\"7\",\"protocalType\":\"2\",\"protocolVersion\":\"1\",\"serviceUrl\":\"https://t.alipayobjects.com/L1/71/900/androidSec/Alipaysec_common.apk\"}");
        modes.put("lenovo_VALUES", "{\"packageName\":\"com.alipay.security.mobile.authenticator\",\"vendor\":\"8\",\"protocalType\":\"2\",\"protocolVersion\":\"1\",\"serviceUrl\":\"https://t.alipayobjects.com/L1/71/900/androidSec/Alipaysec_common.apk\"}");
        modes.put("gionee_VALUES", "{\"packageName\":\"com.alipay.security.mobile.authenticator\",\"vendor\":\"9\",\"protocalType\":\"2\",\"protocolVersion\":\"1\",\"serviceUrl\":\"https://t.alipayobjects.com/L1/71/900/androidSec/Alipaysec_common.apk\"}");
        modes.put("xiaomi_VALUES", "{\"packageName\":\"com.alipay.security.mobile.authenticator\",\"vendor\":\"10\",\"protocalType\":\"2\",\"protocolVersion\":\"1\",\"serviceUrl\":\"https://t.alipayobjects.com/L1/71/900/androidSec/Alipaysec_common.apk\"}");
        modes.put("coolpad_VALUES", "{\"packageName\":\"com.alipay.security.mobile.authenticator\",\"vendor\":\"11\",\"protocalType\":\"2\",\"protocolVersion\":\"1\",\"serviceUrl\":\"https://t.alipayobjects.com/L1/71/900/androidSec/Alipaysec_common.apk\"}");
        modes.put("letv_VALUES", "{\"packageName\":\"com.alipay.security.mobile.authenticator\",\"vendor\":\"12\",\"protocalType\":\"2\",\"protocolVersion\":\"1\",\"serviceUrl\":\"https://t.alipayobjects.com/L1/71/900/androidSec/Alipaysec_common.apk\"}");
        modes.put("zte_VALUES", "{\"packageName\":\"com.alipay.security.mobile.authenticator\",\"vendor\":\"13\",\"protocalType\":\"2\",\"protocolVersion\":\"1\",\"serviceUrl\":\"https://t.alipayobjects.com/L1/71/900/androidSec/Alipaysec_common.apk\"}");
        modes.put("fancymaker_VALUES", "{\"packageName\":\"com.alipay.security.mobile.authenticator\",\"vendor\":\"14\",\"protocalType\":\"2\",\"protocolVersion\":\"1\",\"serviceUrl\":\"https://t.alipayobjects.com/L1/71/900/androidSec/Alipaysec_common.apk\"}");
        modes.put("oneplus_VALUES", "{\"packageName\":\"com.alipay.security.mobile.authenticator\",\"vendor\":\"15\",\"protocalType\":\"2\",\"protocolVersion\":\"1\",\"serviceUrl\":\"https://t.alipayobjects.com/L1/71/900/androidSec/Alipaysec_common.apk\"}");
    }

    public static String getProperty(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("88202484", new Object[]{str}) : modes.get(str);
    }
}
