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
public class jhq extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f29562a;
    public String b;
    public String c;
    public FileInfo[] d;
    private String e = "TLOG.Protocol.ApplyUploadRequestInfo";
    private String f = a.EVENT_REQUEST;

    static {
        kge.a(-551834639);
    }

    public jhh a(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jhh) ipChange.ipc$dispatch("7c71106a", new Object[]{this, str});
        }
        String a2 = jhz.a();
        if (StringUtils.isEmpty(str)) {
            str = jhz.a();
        }
        String str2 = str;
        JSONObject a3 = jhr.a(this, a2, str2);
        JSONObject jSONObject = new JSONObject();
        String str3 = this.b;
        if (str3 != null) {
            jSONObject.put("debugType", (Object) str3);
        }
        String str4 = this.f29562a;
        if (str4 != null) {
            jSONObject.put("bizType", (Object) str4);
        }
        String str5 = this.c;
        if (str5 != null) {
            jSONObject.put("bizCode", (Object) str5);
        }
        if (this.m != null) {
            jSONObject.put(WebConstant.WEB_LOGIN_TOKEN_TYPE, (Object) this.m);
        }
        if (this.n != null) {
            jSONObject.put(ApiConstants.ApiField.TOKEN_INFO, (Object) this.n);
        }
        FileInfo[] fileInfoArr = this.d;
        if (fileInfoArr != null) {
            jSONObject.put("fileInfos", (Object) jhr.a(fileInfoArr));
        }
        if (this.p != null) {
            jSONObject.put("extraInfo", (Object) this.p);
        }
        return jhr.a(jSONObject, a3, this.f, a2, str2, str2);
    }
}
