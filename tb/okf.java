package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.engine.invoke.biz.ITopViewService;
import com.taobao.infoflow.protocol.engine.invoke.biz.e;

/* loaded from: classes.dex */
public class okf implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ljs f32137a;

    static {
        kge.a(1044968796);
        kge.a(796285305);
    }

    public okf(ljs ljsVar) {
        this.f32137a = ljsVar;
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.e
    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        ITopViewService iTopViewService = (ITopViewService) this.f32137a.a(ITopViewService.class);
        if (iTopViewService == null) {
            return null;
        }
        return iTopViewService.getSubTabSearchBarData();
    }
}
