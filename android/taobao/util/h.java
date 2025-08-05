package android.taobao.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.support.v4.app.ActivityCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Random;
import tb.kge;

/* loaded from: classes2.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IMEI = "imei";
    public static final String IMSI = "imsi";
    public static final String MACADDRESS = "mac_address";

    /* renamed from: a  reason: collision with root package name */
    private static String f1542a;
    private static String b;
    private static String c;

    static {
        kge.a(-789474128);
        f1542a = "";
        b = "";
        c = "";
    }

    private static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        StringBuffer stringBuffer = new StringBuffer();
        long currentTimeMillis = System.currentTimeMillis();
        String l = Long.toString(currentTimeMillis);
        stringBuffer.append(l.substring(l.length() - 5));
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(Build.MODEL.replaceAll(" ", ""));
        while (stringBuffer2.length() < 6) {
            stringBuffer2.append('0');
        }
        stringBuffer.append(stringBuffer2.substring(0, 6));
        Random random = new Random(currentTimeMillis);
        long j = 0;
        while (j < ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
            j = random.nextLong();
        }
        stringBuffer.append(Long.toHexString(j).substring(0, 4));
        return stringBuffer.toString();
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        if (!TextUtils.isEmpty(f1542a)) {
            return f1542a;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String string = defaultSharedPreferences.getString("imei", null);
        if (string == null || string.length() == 0) {
            if (ActivityCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0) {
                String proxy_getDeviceId = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getDeviceId((TelephonyManager) context.getSystemService("phone"));
                if (proxy_getDeviceId == null || proxy_getDeviceId.length() == 0) {
                    proxy_getDeviceId = a();
                }
                string = proxy_getDeviceId.replaceAll(" ", "").trim();
                while (string.length() < 15) {
                    string = "0" + string;
                }
                SharedPreferences.Editor edit = defaultSharedPreferences.edit();
                edit.putString("imei", string);
                if (Build.VERSION.SDK_INT >= 9) {
                    edit.apply();
                } else {
                    edit.commit();
                }
            } else {
                string = "";
            }
        }
        String trim = string.trim();
        f1542a = trim;
        return trim;
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String string = defaultSharedPreferences.getString("imsi", null);
        if (string == null || string.length() == 0) {
            if (ActivityCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0) {
                String proxy_getSubscriberId = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getSubscriberId((TelephonyManager) context.getSystemService("phone"));
                if (proxy_getSubscriberId == null || proxy_getSubscriberId.length() == 0) {
                    proxy_getSubscriberId = a();
                }
                string = proxy_getSubscriberId.replaceAll(" ", "").trim();
                while (string.length() < 15) {
                    string = "0" + string;
                }
                SharedPreferences.Editor edit = defaultSharedPreferences.edit();
                edit.putString("imsi", string);
                if (Build.VERSION.SDK_INT >= 9) {
                    edit.apply();
                } else {
                    edit.commit();
                }
            } else {
                string = "";
            }
        }
        b = string;
        return string;
    }
}
