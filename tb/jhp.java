package tb;

import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.ui.WebConstant;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.reply.base.RemoteFileInfo;
import com.taobao.android.tlog.protocol.model.request.base.b;
import com.taobao.themis.kernel.logger.a;

/* loaded from: classes6.dex */
public class jhp extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f29561a;
    public RemoteFileInfo[] b;
    private String c = a.EVENT_REQUEST;

    static {
        kge.a(-476942728);
    }

    public static /* synthetic */ Object ipc$super(jhp jhpVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public jhh a(String str, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jhh) ipChange.ipc$dispatch("953ba7e0", new Object[]{this, str, str2});
        }
        String a2 = jhz.a();
        String a3 = jhz.a();
        return jhr.a(b(str, str2), jhr.a(this, a2, a3), this.c, a2, a3, jhz.a());
    }

    private JSONObject b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c38d2f9d", new Object[]{this, str, str2});
        }
        JSONObject jSONObject = new JSONObject();
        String str3 = this.f29561a;
        if (str3 != null) {
            jSONObject.put("uploadId", (Object) str3);
        }
        if (!StringUtils.isEmpty(str)) {
            jSONObject.put("errorCode", (Object) str);
        }
        if (!StringUtils.isEmpty(str2)) {
            jSONObject.put("errorMessage", (Object) str2);
        }
        RemoteFileInfo[] remoteFileInfoArr = this.b;
        if (remoteFileInfoArr != null) {
            jSONObject.put("remoteFileInfos", (Object) remoteFileInfoArr);
        }
        if (this.m != null) {
            jSONObject.put(WebConstant.WEB_LOGIN_TOKEN_TYPE, (Object) this.m);
        }
        if (this.n != null) {
            jSONObject.put(ApiConstants.ApiField.TOKEN_INFO, (Object) this.n);
        }
        return jSONObject;
    }
}
