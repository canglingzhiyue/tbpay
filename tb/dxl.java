package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.BehaviR;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Map;

@AURAExtensionImpl(code = "alidetail.impl.event.userTrack.commit")
/* loaded from: classes4.dex */
public final class dxl implements axz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1174603507);
        kge.a(-1245808966);
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        }
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public dxl() {
        emu.a("com.taobao.android.detail.core.aura.extension.event.ut.AliDetailUserTrackCommitExtension");
    }

    @Override // tb.axz
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
