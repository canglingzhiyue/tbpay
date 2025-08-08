package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.fastjson.JSONArray;
import com.alipay.android.app.pay.PayTask;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.awi;

/* loaded from: classes6.dex */
public class idp implements awi.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2127335551);
        kge.a(1180555221);
    }

    @Override // tb.awi.a
    public void a(String str, JSONArray jSONArray, RenderComponent renderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88b8ae41", new Object[]{this, str, jSONArray, renderComponent});
        } else if (StringUtils.isEmpty(str) || jSONArray == null || renderComponent == null || renderComponent.component == null || renderComponent.component.getFields() == null) {
        } else {
            Map<String, Object> fields = renderComponent.component.getFields();
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof String) {
                    Object obj = fields.get(next);
                    if ((obj instanceof String) && str.equals("alipay")) {
                        Map<String, Object> decCashierObfs = PayTask.decCashierObfs((String) obj);
                        if (decCashierObfs == null) {
                            a((String) next, fields);
                        } else {
                            Object obj2 = decCashierObfs.get("value");
                            if (!(obj2 instanceof String)) {
                                a((String) next, fields);
                            } else {
                                fields.put((String) next, (String) obj2);
                            }
                        }
                    }
                }
            }
        }
    }

    private void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        map.put(str, "");
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            UmbrellaTracker.commitFailureStability("umbrella.ultron.parse", "feature.decrypt.alipay", "1.0", "ultronTrade", "unknown", new HashMap(), "decryptFailed", "alipay sdk decrypt failed");
        }
    }
}
