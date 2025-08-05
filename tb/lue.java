package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class lue extends lua implements ljx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1704499908);
        kge.a(-1629617083);
    }

    public lue(lud ludVar) {
        super(ludVar);
    }

    @Override // tb.ljx
    public JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : e().o();
    }
}
