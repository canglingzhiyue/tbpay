package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.android.split.core.splitinstall.h;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class bgg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AtomicReference<Boolean> f25872a;

    static {
        kge.a(1955608870);
        f25872a = new AtomicReference<>(null);
    }

    public static boolean a(Context context) {
        String str;
        AtomicReference<Boolean> atomicReference;
        boolean valueOf;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            obj = ipChange.ipc$dispatch("9e1d6464", new Object[]{context});
        } else if (!h.a(context).a().contains(j.PLUGIN_NAME)) {
            return false;
        } else {
            if (f25872a.get() == null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("taobao_plugin", 0);
                SharedPreferences.Editor edit = context.getSharedPreferences("taobao_plugin", 0).edit();
                try {
                    str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                    str = "";
                }
                if (!str.equals(sharedPreferences.getString("plugin_version_name", ""))) {
                    if (j.c(context)) {
                        edit.putString("plugin_version_name", str).putBoolean("plugin_first_load", false).apply();
                    }
                    atomicReference = f25872a;
                    valueOf = true;
                } else {
                    boolean z = sharedPreferences.getBoolean("plugin_first_load", true);
                    if (z && j.c(context)) {
                        edit.putBoolean("plugin_first_load", false).apply();
                    }
                    atomicReference = f25872a;
                    valueOf = Boolean.valueOf(z);
                }
                atomicReference.compareAndSet(null, valueOf);
            }
            obj = f25872a.get();
        }
        return ((Boolean) obj).booleanValue();
    }
}
