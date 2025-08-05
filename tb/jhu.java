package tb;

import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.ui.WebConstant;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.c;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.android.tlog.protocol.model.request.base.b;
import com.taobao.themis.kernel.logger.a;

/* loaded from: classes6.dex */
public class jhu extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f29565a;
    public String b;
    public String c;
    public String d;
    public Long e;
    public String f;
    public String g;
    private String q = "TLOG.Protocol.StartupRequest";
    private String r = a.EVENT_REQUEST;

    static {
        kge.a(511960387);
    }

    public jhh a() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jhh) ipChange.ipc$dispatch("f066774", new Object[]{this});
        }
        String a2 = jhz.a();
        String a3 = jhz.a();
        String a4 = jhz.a();
        JSONObject a5 = jhr.a(this, a2, a3);
        JSONObject jSONObject = new JSONObject();
        if (this.o != null) {
            jSONObject.put("appVersion", (Object) this.o);
        }
        String str = this.f29565a;
        if (str != null) {
            jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, (Object) str);
        }
        if (this.k != null) {
            jSONObject.put("userNick", (Object) this.k);
        }
        String str2 = this.b;
        if (str2 != null) {
            jSONObject.put("osPlatform", (Object) str2);
        }
        String str3 = this.c;
        if (str3 != null) {
            jSONObject.put("osVersion", (Object) str3);
        }
        String str4 = this.d;
        if (str4 != null) {
            jSONObject.put(BioDetector.EXT_KEY_GEO, (Object) str4);
        }
        Long l = this.e;
        if (l != null) {
            jSONObject.put("clientTime", (Object) l);
        }
        String str5 = this.f;
        if (str5 != null) {
            jSONObject.put("brand", (Object) str5);
        }
        String str6 = this.g;
        if (str6 != null) {
            jSONObject.put(c.IP, (Object) str6);
        }
        if (this.m != null) {
            jSONObject.put(WebConstant.WEB_LOGIN_TOKEN_TYPE, (Object) this.m);
        }
        if (this.n != null) {
            jSONObject.put(ApiConstants.ApiField.TOKEN_INFO, (Object) this.n);
        }
        return jhr.a(jSONObject, a5, this.r, a2, a3, a4);
    }
}
