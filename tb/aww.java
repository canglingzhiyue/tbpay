package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.SmartLandingTask;
import java.util.Map;
import tb.bax;

/* loaded from: classes2.dex */
public final class aww extends aqm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-330420504);
    }

    @Override // tb.aqn
    public boolean a(Map<String, String> map) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{this, map})).booleanValue();
        }
        String str = map.get("value");
        String str2 = map.get("diff");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            bax.a a2 = bax.a();
            if (a2.f25741a == 0) {
                return false;
            }
            if (str.equalsIgnoreCase("low")) {
                i = 1;
            } else if (str.equalsIgnoreCase("middle")) {
                i = 2;
            } else {
                i = str.equalsIgnoreCase("high") ? 3 : 0;
            }
            if (i == 0) {
                return false;
            }
            char c = 65535;
            int hashCode = str2.hashCode();
            if (hashCode != 3318169) {
                if (hashCode != 96757556) {
                    if (hashCode == 283601914 && str2.equals("greater")) {
                        c = 1;
                    }
                } else if (str2.equals(SmartLandingTask.Operation.STR_EQUAL)) {
                    c = 0;
                }
            } else if (str2.equals("less")) {
                c = 2;
            }
            if (c != 0) {
                return c != 1 ? c == 2 && a2.f25741a < i : a2.f25741a > i;
            } else if (a2.f25741a == i) {
                return true;
            }
        }
        return false;
    }
}
