package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.msoa.c;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.msoa.h;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class fcz extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f27814a;
    private String b;
    private JSONObject c;

    static {
        kge.a(-1473254293);
    }

    public fcz(JSONObject jSONObject, b bVar) {
        emu.a("com.taobao.android.detail.wrapper.ext.event.msoa.OpenMsoaEvent");
        if (jSONObject == null && bVar == null) {
            return;
        }
        this.f27814a = jSONObject.getString("serviceId");
        this.b = jSONObject.getString("version");
        this.c = jSONObject;
        new HashMap();
        c.a().a(new h("msoa.taobao.detail", this.f27814a, this.b, "taobao_detail", jSONObject), new MSOAServiceListener() { // from class: tb.fcz.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.msoa.callback.MSOAServiceListener
            public void onSuccess(Map<String, Object> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
                } else {
                    i.a("OpenMsoaEvent", "msoa 调用成功");
                }
            }

            @Override // com.taobao.android.msoa.callback.MSOAServiceListener
            public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                    return;
                }
                i.a("OpenMsoaEvent", "msoa 调用失败,errCode:" + str + ";errStr:" + str2);
            }
        });
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.c;
    }
}
