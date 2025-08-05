package tb;

import android.preference.PreferenceManager;
import android.taobao.mulitenv.EnvironmentSwitcher;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class plr implements phk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-999953368);
        kge.a(797253708);
    }

    @Override // tb.phk
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.phk
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : PreferenceManager.getDefaultSharedPreferences(cgl.g().a()).getInt(EnvironmentSwitcher.SPKEY_ENV, 0);
    }
}
