package com.taobao.linkmanager.afc.utils;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1265467569);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        String a2 = com.taobao.flowcustoms.afc.b.a().a("is_get_device_imei", "false");
        if (StringUtils.equals("false", a2)) {
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "DeviceIdentificationUtils === getDeviceIdentification === 是否获取imei：" + a2);
            return;
        }
        String a3 = a(context, 0);
        String a4 = a(context, 1);
        HashMap hashMap = new HashMap();
        hashMap.put("imei1", a3);
        hashMap.put("imei2", a4);
        hashMap.put("oaid", TFCCommonUtils.b(context));
        hashMap.put("manufacturer", Build.MANUFACTURER);
        hashMap.put("model", Build.MODEL);
        hashMap.put("version", Build.VERSION.RELEASE);
        com.taobao.flowcustoms.afc.utils.b.a("imei_info_android", "", "", hashMap);
    }

    public static String a(Context context, int i) {
        if (context == null) {
            return "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return (String) telephonyManager.getClass().getDeclaredMethod("getImei", Integer.TYPE).invoke(telephonyManager, Integer.valueOf(i));
        } catch (Throwable th) {
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "DeviceIdentificationUtils === getIMEIIndex === 获取imei异常：" + th);
            return "";
        }
    }
}
