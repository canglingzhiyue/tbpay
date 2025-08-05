package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class tkh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_PREFERENCE_RESOURCE_ID = "hasShowEndResources";
    public static final String SHARE_PREFERENCE_NAME = "taolive";

    static {
        kge.a(355825928);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        SharedPreferences.Editor edit = pmd.a().u().c().getSharedPreferences("taolive", 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : pmd.a().u().c().getSharedPreferences("taolive", 0).getString(str, "");
    }
}
