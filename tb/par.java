package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.n;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class par implements pok {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1697422406);
        kge.a(-1821197694);
    }

    @Override // tb.pok
    public void a(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3202a441", new Object[]{this, str, hashMap});
        } else {
            ai.a(n.a(), str, hashMap);
        }
    }

    @Override // tb.pok
    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            ai.a(n.a(), str, map);
        }
    }
}
