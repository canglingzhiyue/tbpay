package tb;

import com.ali.user.mobile.ui.WebConstant;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.reply.base.UploadTokenInfo;

/* loaded from: classes6.dex */
public class jhj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f29556a;
    public String b;
    public UploadTokenInfo[] c;
    private String d = "TLOG.Protocol.ApplyUploadReplyParser";

    static {
        kge.a(1849085457);
    }

    public void a(JSON json, jhg jhgVar) throws Exception {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a32ca6e", new Object[]{this, json, jhgVar});
            return;
        }
        JSONObject jSONObject = (JSONObject) json;
        if (jSONObject.containsKey(WebConstant.WEB_LOGIN_TOKEN_TYPE)) {
            this.b = jSONObject.getString(WebConstant.WEB_LOGIN_TOKEN_TYPE);
        }
        if (jSONObject.containsKey("uploadId")) {
            this.f29556a = jSONObject.getString("uploadId");
        }
        if (!jSONObject.containsKey("tokenInfos") || (jSONArray = jSONObject.getJSONArray("tokenInfos")) == null || jSONArray.size() <= 0) {
            return;
        }
        this.c = jhm.a(jSONArray);
    }
}
