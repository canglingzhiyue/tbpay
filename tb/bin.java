package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes2.dex */
public class bin {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private MtopBusiness f25929a;

    static {
        kge.a(-815316717);
    }

    public void a(jnw jnwVar, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f81f11", new Object[]{this, jnwVar, iRemoteBaseListener});
            return;
        }
        String e = jnwVar.e();
        if (StringUtils.isEmpty(e)) {
            iRemoteBaseListener.onError(-1, new MtopResponse("-1", "api is empty"), null);
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(e);
        mtopRequest.setVersion(jnwVar.f());
        mtopRequest.setNeedSession(mtopRequest.isNeedSession());
        mtopRequest.setNeedEcode(mtopRequest.isNeedEcode());
        HashMap hashMap = new HashMap();
        if (jnwVar.t()) {
            hashMap.put("feature", "{\"gzip\":\"true\"}");
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(hashMap);
            mtopRequest.setData(jSONObject.toJSONString());
        }
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        this.f25929a = build;
        if (jnwVar.n()) {
            build.mo1335useWua();
        }
        if (jnwVar.l()) {
            build.mo1305reqMethod(MethodEnum.POST);
        }
        String i = jnwVar.i();
        if (i != null) {
            build.mo1313setCustomDomain(i);
        }
        int k = jnwVar.k();
        if (-1 != k) {
            build.mo1340setBizId(k);
        }
        String j = jnwVar.j();
        if (j != null) {
            build.mo1328setUnitStrategy(j);
        }
        Map<String, String> p = jnwVar.p();
        if (p != null && build.mtopProp != null) {
            build.mtopProp.setRequestHeaders(p);
        }
        build.mo1341setErrorNotifyAfterCache(true);
        String u = jnwVar.u();
        if (u != null) {
            build.mo1327setTraceId(u);
        }
        build.registerListener((IRemoteListener) iRemoteBaseListener);
        Class<?> a2 = jnwVar.a();
        if (a2 == null) {
            build.startRequest();
        } else {
            build.startRequest(a2);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        MtopBusiness mtopBusiness = this.f25929a;
        if (mtopBusiness == null) {
            return;
        }
        mtopBusiness.cancelRequest();
    }
}
