package tb;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import com.taobao.android.autosize.l;
import mtopsdk.common.util.ConfigStoreManager;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.global.SwitchConfig;

/* loaded from: classes.dex */
public class saa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f33448a;
    private static ConfigStoreManager b;

    static {
        kge.a(-320609752);
        b = ConfigStoreManager.getInstance();
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        try {
            String str = Build.VERSION.RELEASE;
            String str2 = Build.MANUFACTURER;
            String str3 = Build.MODEL;
            StringBuilder sb = new StringBuilder(32);
            sb.append("MTOPSDK/");
            sb.append(HttpHeaderConstant.M_SDKVER_VALUE);
            sb.append(" (");
            sb.append("Android");
            sb.append(";");
            sb.append(str);
            sb.append(";");
            sb.append(str2);
            sb.append(";");
            sb.append(str3);
            sb.append(riy.BRACKET_END_STR);
            try {
                if (SwitchConfig.getInstance().uaAddDeviceType()) {
                    if (StringUtils.isEmpty(f33448a)) {
                        if (l.d(context)) {
                            f33448a = "Fold";
                        } else if (l.b(context)) {
                            f33448a = "Pad";
                        } else {
                            f33448a = "Phone";
                        }
                    }
                    sb.append(" ");
                    sb.append("DeviceType");
                    sb.append(riy.BRACKET_START_STR);
                    sb.append(f33448a);
                    sb.append(riy.BRACKET_END_STR);
                }
            } catch (Throwable unused) {
            }
            return sb.toString();
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.PhoneInfo", "[getPhoneBaseInfo] error ---" + th.toString());
            return "";
        }
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        try {
            String proxy_getDeviceId = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getDeviceId((TelephonyManager) context.getSystemService("phone"));
            return proxy_getDeviceId != null ? proxy_getDeviceId.trim() : proxy_getDeviceId;
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.PhoneInfo", "[getOriginalImei]error ---" + th.toString());
            return null;
        }
    }

    public static String d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c344f03", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        try {
            String proxy_getSubscriberId = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getSubscriberId((TelephonyManager) context.getSystemService("phone"));
            return proxy_getSubscriberId != null ? proxy_getSubscriberId.trim() : proxy_getSubscriberId;
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.PhoneInfo", "[getOriginalImsi]error ---" + th.toString());
            return null;
        }
    }

    public static String a() {
        if (Build.VERSION.SDK_INT > 27) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.serialno", "unknown");
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.PhoneInfo", "[getSerialNum]error ---" + th.toString());
            return null;
        }
    }

    public static String e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91ae7544", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.PhoneInfo", "[getAndroidId]error ---" + th.toString());
            return null;
        }
    }
}
