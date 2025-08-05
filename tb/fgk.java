package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.BehaviR;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Map;

/* loaded from: classes5.dex */
public class fgk implements bmd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1694538589);
        kge.a(1770798250);
    }

    public fgk() {
        emu.a("com.taobao.android.detail.wrapper.ultronengine.listener.DetailOnUTCommitListener");
    }

    @Override // tb.bmd
    public void a(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b903f76", new Object[]{this, str, new Integer(i), str2, str3, str4, map});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, i, str2, str3, str4, map).build());
        if (i == 2101) {
            BehaviR.getInstance().commitNewTap(str, str2, null, a(map));
        } else if (i != 2201) {
        } else {
            BehaviR.getInstance().trackAppear(str, str2, null, null, a(map));
        }
    }

    private String[] a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ab7e78ac", new Object[]{this, map});
        }
        if (map == null || map.size() == 0) {
            return null;
        }
        String[] strArr = new String[map.size()];
        int i = 0;
        for (String str : map.keySet()) {
            String str2 = map.get(str);
            if (str2 != null) {
                strArr[i] = String.format("%s=%s", str, str2);
                i++;
            }
        }
        return strArr;
    }
}
