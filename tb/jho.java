package tb;

import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.ui.WebConstant;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.request.base.FileInfo;
import com.taobao.android.tlog.protocol.model.request.base.b;
import com.taobao.themis.kernel.logger.a;

/* loaded from: classes6.dex */
public class jho extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f29560a;
    public FileInfo[] b;
    private String c = "TLOG.Protocol.ApplyTokenRequestInfo";
    private String d = a.EVENT_REQUEST;

    static {
        kge.a(1526477651);
    }

    public jhh a(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jhh) ipChange.ipc$dispatch("7c71106a", new Object[]{this, str});
        }
        String a2 = jhz.a();
        String a3 = !StringUtils.isEmpty(str) ? str : jhz.a();
        JSONObject a4 = jhr.a(this, a2, a3);
        JSONObject jSONObject = new JSONObject();
        String str2 = this.f29560a;
        if (str2 != null) {
            jSONObject.put("uploadId", (Object) str2);
        }
        if (this.m != null) {
            jSONObject.put(WebConstant.WEB_LOGIN_TOKEN_TYPE, (Object) this.m);
        }
        if (this.n != null) {
            jSONObject.put(ApiConstants.ApiField.TOKEN_INFO, (Object) this.n);
        }
        FileInfo[] fileInfoArr = this.b;
        if (fileInfoArr != null) {
            jSONObject.put("fileInfos", (Object) jhr.a(fileInfoArr));
        }
        return jhr.a(jSONObject, a4, this.d, a2, a3, this.f29560a);
    }
}
