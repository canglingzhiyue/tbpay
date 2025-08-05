package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* loaded from: classes.dex */
public class lbz implements lcg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f30466a;
    private lcf b;

    public lbz(String str) {
        this.f30466a = str;
        TLog.logd("InfoFlowAdServiceImpl", "InfoFlowAdServiceImpl", "bizType : " + this.f30466a);
    }

    @Override // tb.lcg
    public lcf a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lcf) ipChange.ipc$dispatch("f073d2f", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new lca();
        }
        return this.b;
    }
}
