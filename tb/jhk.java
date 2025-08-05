package tb;

import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.ui.WebConstant;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.reply.base.UploadTokenInfo;
import com.taobao.android.tlog.protocol.model.reply.base.a;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class jhk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f29557a;
    public UploadTokenInfo b;
    private String c = "TLOG.Protocol.LogConfigureReply";
    private String d = "REPLY";

    static {
        kge.a(-638068270);
    }

    public String a(jhg jhgVar, a aVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c72f7007", new Object[]{this, jhgVar, aVar});
        }
        if (aVar == null) {
            return null;
        }
        Map<String, String> a2 = jhe.a(jhgVar, aVar);
        JSONObject jSONObject = new JSONObject();
        String str = this.f29557a;
        if (str != null) {
            jSONObject.put(WebConstant.WEB_LOGIN_TOKEN_TYPE, (Object) str);
        }
        UploadTokenInfo uploadTokenInfo = this.b;
        if (uploadTokenInfo != null) {
            jSONObject.put(ApiConstants.ApiField.TOKEN_INFO, (Object) uploadTokenInfo);
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jhgVar.k != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("content", new String(jhgVar.k, "utf-8"));
            jSONObject2.put("forward", (Object) linkedHashMap);
        }
        jSONObject2.put("version", (Object) jhb.version);
        jSONObject2.put("type", (Object) this.d);
        jSONObject2.put("headers", (Object) a2);
        jSONObject2.put("data", (Object) jSONObject);
        return jhf.a(jSONObject2.toString());
    }
}
