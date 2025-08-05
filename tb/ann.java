package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.bridge.JSCallback;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class ann implements amt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public alu f25455a;
    public alr b;
    public WXSDKInstance c;

    static {
        kge.a(-161736247);
        kge.a(1333317935);
    }

    @Override // tb.amt
    public void a(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("421b9086", new Object[]{this, wXSDKInstance});
            return;
        }
        this.c = wXSDKInstance;
        this.b = new alr(!TextUtils.isEmpty(this.c.ak()) ? Uri.parse(this.c.ak()).buildUpon().clearQuery().build().toString() : "default", "Weex1");
        this.f25455a = new alu(this.b);
        this.b.a(new WeakReference<>(this.c.O()));
    }

    @Override // tb.amt
    public Object a(String str, String str2, JSONObject jSONObject, final JSCallback jSCallback, final JSCallback jSCallback2, final JSCallback jSCallback3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9c76ce9e", new Object[]{this, str, str2, jSONObject, jSCallback, jSCallback2, jSCallback3});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(MUSMonitor.MODULE_DIM_ABILITY, (Object) str);
        jSONObject2.put("api", (Object) str2);
        AppMonitor.Counter.commit("weex", "WXMegBridgeCall", jSONObject2.toJSONString(), 1.0d);
        HashMap hashMap = new HashMap();
        hashMap.put("wxInstance", this.c);
        new alq(this.b).a((Map<String, Object>) hashMap);
        this.f25455a.b(str, str2, new alq().a(this.c.am()), jSONObject, new alo() { // from class: tb.ann.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.alo
            public void onCallback(ExecuteResult executeResult) {
                JSCallback jSCallback4;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                } else if (executeResult.d() == 0) {
                    JSCallback jSCallback5 = jSCallback;
                    if (jSCallback5 == null) {
                        return;
                    }
                    jSCallback5.invoke(executeResult.c());
                } else if (executeResult.d() == 1) {
                    JSCallback jSCallback6 = jSCallback3;
                    if (jSCallback6 == null) {
                        return;
                    }
                    jSCallback6.invokeAndKeepAlive(executeResult.c());
                } else if (executeResult.d() == 99) {
                    JSCallback jSCallback7 = jSCallback3;
                    if (jSCallback7 == null) {
                        return;
                    }
                    jSCallback7.invoke(executeResult.c());
                } else if (executeResult.d() <= 99 || (jSCallback4 = jSCallback2) == null) {
                } else {
                    jSCallback4.invoke(executeResult.c());
                }
            }
        });
        return null;
    }
}
