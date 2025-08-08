package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;
import com.taobao.android.detail.ttdetail.utils.ae;
import com.taobao.android.detail.ttdetail.utils.f;
import com.taobao.android.detail.ttdetail.utils.j;
import com.taobao.android.detail.ttdetail.utils.o;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class smx extends snb<MainRequestParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_NAME = "mtop.taobao.detail.data.get";

    static {
        kge.a(-162842576);
    }

    public static /* synthetic */ Object ipc$super(smx smxVar, String str, Object... objArr) {
        if (str.hashCode() == 96532846) {
            super.g();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.snb
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : API_NAME;
    }

    @Override // tb.snb
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "1.0";
    }

    public smx(MainRequestParams mainRequestParams) {
        super(mainRequestParams);
    }

    @Override // tb.snb
    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this});
        }
        ((MainRequestParams) this.b).removeUselessExParams();
        Map<String, String> buildParams = ((MainRequestParams) this.b).buildParams();
        String str = buildParams.get("itemNumId");
        buildParams.remove("itemNumId");
        buildParams.put("id", str);
        if (StringUtils.isEmpty(str)) {
            eZ_();
        }
        return JSONObject.toJSONString(buildParams);
    }

    @Override // tb.snb
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.c.mo1340setBizId(9998);
        this.c.mo1296handler(tae.b());
        this.c.mo1330supportStreamJson(true);
        this.c.forbidStreamExceptionCallback(j.t());
        super.g();
    }

    @Override // tb.snb
    public Map<String, String> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d67b6a5", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        if (j.u() && o.a(f.a())) {
            hashMap.put("x-nw-retry", "true");
        }
        return hashMap;
    }

    private void eZ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7db9c5f1", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        if (this.b != 0 && ((MainRequestParams) this.b).getExParams() != null && !((MainRequestParams) this.b).getExParams().isEmpty()) {
            hashMap.putAll(((MainRequestParams) this.b).getExParams());
        }
        ae.a(hashMap, -300017, "请求参数id为空");
    }
}
