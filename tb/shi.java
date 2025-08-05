package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WindVaneInterface;
import android.taobao.windvane.jsbridge.r;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.i;
import com.taobao.tao.homepage.windvane.b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public class shi implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1308635388);
        kge.a(-1531379759);
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public List<String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : Collections.singletonList("getPassParams");
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public boolean a(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("77d86ebd", new Object[]{this, str, str2, wVCallBackContext})).booleanValue() : a(wVCallBackContext);
    }

    @WindVaneInterface
    public boolean a(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca15efa9", new Object[]{this, wVCallBackContext})).booleanValue();
        }
        JSONObject e = lbo.b().a(i.a()).e();
        if (e != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject(e);
            r rVar = new r();
            rVar.a("passParams", jSONObject);
            wVCallBackContext.success(rVar);
        } else {
            wVCallBackContext.success();
        }
        return true;
    }
}
