package tb;

import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.util.Locale;

/* loaded from: classes.dex */
public class gvs implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_VERSION = "version";

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f28523a = false;
    private final String b;
    private final String c;
    private final gvk d;

    public gvs(gvk gvkVar, String str, String str2) {
        this.d = gvkVar;
        this.c = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = LauncherRuntime.h.getSharedPreferences(this.b, 0);
        String c = gvk.c(this.d);
        int a2 = gvk.a(this.d);
        String d = gvk.d(this.d);
        int b = gvk.b(this.d);
        f28523a = StringUtils.equals(LauncherRuntime.e, sharedPreferences.getString("version", null));
        sharedPreferences.edit().putString(this.c, String.format(Locale.US, "%s|%d|%s-%s-%d|", this.c, Integer.valueOf(a2), c, d, Integer.valueOf(b))).putString("version", LauncherRuntime.e).commit();
    }
}
