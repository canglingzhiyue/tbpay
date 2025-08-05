package tb;

import com.alibaba.android.ultron.trade.presenter.b;
import com.alibaba.android.ultron.vfw.web.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Map;

/* loaded from: classes2.dex */
public class bmf implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BRIDGE_TAG = "getComponentData";

    /* renamed from: a  reason: collision with root package name */
    public b f25976a;

    static {
        kge.a(-1162132686);
        kge.a(2085380955);
    }

    public bmf(b bVar) {
        this.f25976a = bVar;
    }

    @Override // com.alibaba.android.ultron.vfw.web.a
    public void a(Map<String, Object> map, com.taobao.vessel.base.a aVar, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72ab51", new Object[]{this, map, aVar, iDMComponent});
        } else if (iDMComponent == null || aVar == null) {
        } else {
            aVar.invoke(iDMComponent.getFields());
        }
    }
}
