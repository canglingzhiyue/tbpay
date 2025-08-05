package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;

/* loaded from: classes.dex */
public class huw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final huw c = new huw(LauncherRuntime.g);

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f28801a;

    private huw(Context context) {
        this.f28801a = context.getSharedPreferences("uikit_navigation_extern", 0);
    }

    public static huw b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (huw) ipChange.ipc$dispatch("16b756b3", new Object[0]) : c;
    }

    public String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2});
        }
        String string = this.f28801a.getString(str, str2);
        hut.b("SPStorage", "get string: " + str + " ret is " + string);
        return string;
    }

    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
            return;
        }
        hut.b("SPStorage", "set string" + str + " ret is " + str2);
        c().putString(str, str2).apply();
    }

    public SharedPreferences.Editor c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences.Editor) ipChange.ipc$dispatch("e880d8c7", new Object[]{this}) : this.f28801a.edit();
    }
}
