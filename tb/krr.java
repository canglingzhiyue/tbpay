package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.handler.event.a;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.msoa.c;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.msoa.h;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class krr implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "msoa";

    /* renamed from: a  reason: collision with root package name */
    private Context f30280a;
    private eyx b;

    static {
        kge.a(-435501713);
        kge.a(1967244270);
    }

    public krr(Context context, eyx eyxVar) {
        this.f30280a = context;
        this.b = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (aVar == null || (b = aVar.b()) == null) {
            return false;
        }
        final String string = b.getString("serviceId");
        final String string2 = b.getString("version");
        c.a().a(new h("msoa.taobao.detail", string, string2, "taobao_detail", new HashMap(b)), new MSOAServiceListener() { // from class: tb.krr.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.msoa.callback.MSOAServiceListener
            public void onSuccess(Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                    return;
                }
                i.a("RunMsoaImplementor", "msoa 调用成功, serviceId: " + string + " ;version: " + string2);
            }

            @Override // com.taobao.android.msoa.callback.MSOAServiceListener
            public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                    return;
                }
                i.a("RunMsoaImplementor", "msoa 调用失败, serviceId: " + string + " ;version: " + string2 + "errCode: " + str + " ;errStr: " + str2);
            }
        });
        return true;
    }
}
