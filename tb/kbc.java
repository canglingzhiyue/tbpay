package tb;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.ActivityCompat;
import android.telephony.TelephonyManager;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public class kbc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AUGE_KEY = "version";
    public static final String AUGE_LOCAL_BIZ_CODE = "auge_local_biz_code";
    public static final String BREAK_UP_TIME = "break_up_time";
    public static final int DEFAULT_DELAY_TIME = 30;
    public static final String GROUP_NAME = "augesdk_android_config";

    /* renamed from: a  reason: collision with root package name */
    private static String f29945a = "android.permission.READ_PHONE_STATE";

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (ActivityCompat.checkSelfPermission(context, f29945a) == 0) {
                return ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getDeviceId(telephonyManager);
            }
            ActivityCompat.requestPermissions((Activity) context, new String[]{f29945a}, 122);
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return (ActivityCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0 && telephonyManager != null) ? ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getSubscriberId(telephonyManager) : "";
        } catch (Exception e) {
            kbd.b(kaw.LOG_TAG, "AugeCommonUtils === getIMSI异常了：" + e.getMessage());
            return "";
        }
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        long j = 0;
        try {
            j = Long.parseLong(str);
        } catch (Exception e) {
            kbd.b(kaw.LOG_TAG, e.getMessage());
        }
        return System.currentTimeMillis() > j;
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : kax.b(kbb.GROUP_DATA_EXPIRE_TIME, "0");
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        try {
            String config = OrangeConfig.getInstance().getConfig(GROUP_NAME, BREAK_UP_TIME, "30");
            if (!StringUtils.isEmpty(config)) {
                return Integer.parseInt(config);
            }
            String b = kax.b(BREAK_UP_TIME, "30");
            if (StringUtils.isEmpty(b)) {
                b = "30";
            }
            return Integer.parseInt(b);
        } catch (Exception e) {
            kbd.b(kaw.LOG_TAG, "getBreakUpTime ===  获取最大打散时间异常 " + e);
            return 30;
        }
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        if (i > 0) {
            return new Random().nextInt(i);
        }
        return 30;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{GROUP_NAME}, new d() { // from class: tb.kbc.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                        return;
                    }
                    String config = OrangeConfig.getInstance().getConfig(kbc.GROUP_NAME, kbc.BREAK_UP_TIME, "30");
                    kax.a(kbc.BREAK_UP_TIME, config);
                    kbd.a(kaw.LOG_TAG, "orange获取到的最大打散时间=" + config + "s");
                }
            }, false);
        }
    }

    public static void b(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            String b = kax.b(AUGE_LOCAL_BIZ_CODE, "");
            if (StringUtils.isEmpty(b)) {
                str2 = str;
            } else {
                str2 = b + "," + str;
            }
            kax.a(AUGE_LOCAL_BIZ_CODE, str2);
            kbd.a(kaw.LOG_TAG, "saveBizCode === 存储的bizCode：" + str);
        }
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        String b = kax.b(AUGE_LOCAL_BIZ_CODE, "");
        kbd.a(kaw.LOG_TAG, "getBizCode === 获取的bizCode：" + b);
        return b;
    }

    public static synchronized void c(String str) {
        synchronized (kbc.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88097eb4", new Object[]{str});
            } else {
                kax.a(str);
            }
        }
    }
}
