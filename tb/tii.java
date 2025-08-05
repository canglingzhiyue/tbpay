package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes8.dex */
public class tii extends ipz {
    public pnn f;
    public int g;

    static {
        kge.a(-1808838009);
    }

    public tii(String str, boolean z, String str2, String str3, pnn pnnVar) {
        super(str, z, str2, str3, null);
        this.g = 0;
        this.f = pnnVar;
    }

    public tii(String str, boolean z, String str2, String str3, final Map<String, String> map) {
        super(str, z, str2, str3, map);
        this.g = 0;
        this.f = new pnn() { // from class: tb.tii.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pnn
            public Map<String, String> getHeartParams() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("ab918d32", new Object[]{this}) : map;
            }
        };
    }
}
