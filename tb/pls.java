package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.n;
import java.util.Map;

/* loaded from: classes8.dex */
public class pls implements cgx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(598335608);
        kge.a(1378681186);
    }

    @Override // tb.cgx
    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : poy.d(n.a());
    }
}
