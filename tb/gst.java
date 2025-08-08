package tb;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launch.turbo.profile.TurboBoot;
import com.taobao.android.launch.turbo.profile.i;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class gst {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f28430a;

    static {
        kge.a(521975211);
        f28430a = new AtomicBoolean(false);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            i.a();
        }
    }

    public static void a(Application application, HashMap<String, Object> hashMap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931893a6", new Object[]{application, hashMap, str});
        } else if (!f28430a.compareAndSet(false, true)) {
        } else {
            gsv.a("Bootstrap", "boot for reason: " + str);
            if (!guc.a(application, "launchTurbo")) {
                gsv.a("Bootstrap", "launchTurbo is closed");
                return;
            }
            gsv.a("Bootstrap", "launchTurbo is opened");
            String str2 = (String) hashMap.get("appVersion");
            try {
                PackageInfo packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
                int i = packageInfo.versionCode;
                if (StringUtils.isEmpty(str2)) {
                    str2 = packageInfo.versionName;
                }
                boolean a2 = guc.a(application, "invokedAsFinish");
                int a3 = a(application);
                gsv.a("Bootstrap", "policy: " + a3);
                new TurboBoot.a(application, str2, i).a(a3).b(3).a(a2).a().a();
            } catch (PackageManager.NameNotFoundException e) {
                gsv.a("Bootstrap", "error occurred when get package info", e);
            }
        }
    }

    private static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        return Build.VERSION.SDK_INT <= 32 ? guc.a(context, String.format(Locale.getDefault(), "pgo_strategy_co_%d_%s", Integer.valueOf(Build.VERSION.SDK_INT), Build.MANUFACTURER.toLowerCase())) : true ? 0 : 1;
    }
}
