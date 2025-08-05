package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.engine.env.protocol.f;
import java.util.Map;

/* loaded from: classes.dex */
public class lly implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-228294004);
        kge.a(721405067);
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.f
    public void a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
            return;
        }
        try {
            kyh.a().a(str, str2, map);
        } catch (Exception e) {
            ldf.d("HomeInfoFlowMessiah", "commitLog error: " + e);
        }
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.f
    public void b(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{this, str, str2, map});
            return;
        }
        try {
            kyh.a().b(str, str2, map);
        } catch (Exception e) {
            ldf.d("HomeInfoFlowMessiah", "commitMonitor error: " + e);
        }
    }
}
