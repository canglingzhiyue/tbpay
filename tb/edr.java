package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import java.util.Map;

/* loaded from: classes4.dex */
public class edr extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UPDATE_DATA = "data";
    public static final String UPDATE_TARGET = "target";

    /* renamed from: a  reason: collision with root package name */
    public ActionModel f27215a;

    static {
        kge.a(240571968);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public edr(ActionModel actionModel, b bVar, JSONObject jSONObject, Map<String, Object> map) {
        this.f27215a = actionModel;
        emu.a("com.taobao.android.detail.core.event.dinamic.UpdateComponentEvent");
    }
}
