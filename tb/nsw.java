package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.c;
import com.taobao.search.common.util.q;
import com.taobao.tao.Globals;
import com.taobao.tao.util.TaoHelper;
import com.ut.device.UTDevice;

/* loaded from: classes8.dex */
public class nsw implements iml {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f31740a;

    static {
        kge.a(-707819458);
        kge.a(-1423665603);
    }

    @Override // tb.iml
    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        return 89;
    }

    @Override // tb.iml
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : noa.SERVER_VERSION_VALUE;
    }

    @Override // tb.iml
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : TaoHelper.getTTID();
    }

    @Override // tb.iml
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        if (this.f31740a == null) {
            try {
                this.f31740a = UTDevice.getUtdid(Globals.getApplication());
            } catch (Exception e) {
                q.c("TBSearchConstantAdapter", "获取utdid失败", e);
            }
        }
        return this.f31740a;
    }

    @Override // tb.iml
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : c.a();
    }
}
