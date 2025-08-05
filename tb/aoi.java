package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.alibaba.analytics.core.network.NetworkUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.ut.device.UTDevice;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class aoi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static aoj f25473a;

    static {
        kge.a(-638607191);
        f25473a = null;
    }

    public static void a(Context context, String str, String str2) {
        aol b;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
        } else if (context == null || aqc.e(str) || aqc.e(str2) || (b = aok.b(context)) == null) {
        } else {
            String str4 = null;
            try {
                str3 = api.c(str.getBytes("UTF-8"));
                try {
                    str4 = api.c(str2.getBytes("UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    e = e;
                    e.printStackTrace();
                    if (aqc.e(str3)) {
                        return;
                    }
                    return;
                }
            } catch (UnsupportedEncodingException e2) {
                e = e2;
                str3 = null;
            }
            if (aqc.e(str3) || aqc.e(str4)) {
                return;
            }
            b.a("EI", str3);
            b.a("SI", str4);
            b.a();
        }
    }

    private static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("Alvin3", 0);
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("UTCommon", 0);
        if (sharedPreferences2 == null || sharedPreferences == null) {
            return;
        }
        String string = sharedPreferences.getString("EI", null);
        String string2 = sharedPreferences.getString("SI", null);
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return;
        }
        String string3 = sharedPreferences2.getString("EI", null);
        String string4 = sharedPreferences2.getString("SI", null);
        if (!string.equals(string3)) {
            SharedPreferences.Editor edit = sharedPreferences2.edit();
            edit.putString("EI", string);
            edit.commit();
        }
        if (string2.equals(string4)) {
            return;
        }
        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
        edit2.putString("SI", string2);
        edit2.commit();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.aoj a(android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.aoi.a(android.content.Context):tb.aoj");
    }

    private static aoj d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aoj) ipChange.ipc$dispatch("6fb8862d", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        aoj a2 = a(context);
        a2.q(UTDevice.getUtdid(context));
        if (aqc.e(a2.a())) {
            a2.a(apx.a(context));
        }
        if (aqc.e(a2.b())) {
            a2.b(apx.b(context));
        }
        return a2;
    }

    public static synchronized aoj b(Context context) {
        synchronized (aoi.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (aoj) ipChange.ipc$dispatch("4868df2b", new Object[]{context});
            } else if (f25473a != null) {
                return f25473a;
            } else if (context == null) {
                return null;
            } else {
                aoj d = d(context);
                if (d != null) {
                    try {
                        d.e(Build.MODEL);
                        try {
                            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                            String str = packageInfo.versionName;
                            int i = packageInfo.versionCode;
                            d.n("" + i);
                            d.m(str);
                        } catch (Exception unused) {
                            d.n("Unknown");
                            d.m("Unknown");
                        }
                        d.l(Build.BRAND);
                        d.o("Android");
                        if (a()) {
                            d.o("aliyunos");
                        }
                        d.p(Build.VERSION.RELEASE);
                        Configuration configuration = new Configuration();
                        Settings.System.getConfiguration(context.getContentResolver(), configuration);
                        if (configuration.locale != null) {
                            d.f(configuration.locale.getCountry());
                            d.g(configuration.locale.toString());
                            Calendar calendar = Calendar.getInstance(configuration.locale);
                            if (calendar != null) {
                                TimeZone timeZone = calendar.getTimeZone();
                                if (timeZone != null) {
                                    d.h("" + (timeZone.getRawOffset() / 3600000));
                                } else {
                                    d.h("8");
                                }
                            } else {
                                d.h("8");
                            }
                        } else {
                            d.f("Unknown");
                            d.g("Unknown");
                            d.h("8");
                        }
                        try {
                            DisplayMetrics displayMetrics = new DisplayMetrics();
                            ((WindowManager) context.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
                            int i2 = displayMetrics.widthPixels;
                            int i3 = displayMetrics.heightPixels;
                            d.a(i2);
                            d.b(i3);
                            if (i2 > i3) {
                                int i4 = i2 ^ i3;
                                i3 ^= i4;
                                i2 = i4 ^ i3;
                            }
                            d.i(i3 + "*" + i2);
                        } catch (Exception unused2) {
                            d.i("Unknown");
                        }
                        d.j(NetworkUtil.c(context));
                        d.k(NetworkUtil.c(context));
                    } catch (Exception unused3) {
                        return null;
                    }
                }
                f25473a = d;
                return d;
            }
        }
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        String property = System.getProperty("java.vm.name");
        return (property != null && property.toLowerCase().contains("lemur")) || System.getProperty("ro.yunos.version") != null;
    }
}
