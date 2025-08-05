package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.ugc.fragment.request.GetOrderRateInfoRequest;
import com.taobao.ugc.fragment.request.GetOrderRateInfoResponse;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.tkz;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, d2 = {"Lcom/taobao/ugc/fragment/request/OrderRequest;", "", "()V", "doRequest", "", "orderId", "", "channelId", "extraParams", "", DataReceiveMonitor.CB_LISTENER, "Lcom/taobao/ugc/fragment/request/OrderRequestListener;", "taobao_rate_sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class tko {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1831606287);
    }

    public final void a(String str, String str2, Map<String, String> map, final tkz tkzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bc56836", new Object[]{this, str, str2, map, tkzVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("orderId", str);
        hashMap.put("channel", str2);
        if (map != null) {
            hashMap.putAll(map);
        }
        GetOrderRateInfoRequest getOrderRateInfoRequest = new GetOrderRateInfoRequest();
        getOrderRateInfoRequest.setData(JSONObject.toJSONString(hashMap));
        RemoteBusiness build = RemoteBusiness.build((MtopRequest) getOrderRateInfoRequest);
        q.b(build, "RemoteBusiness.build(request)");
        build.mo1340setBizId(17);
        build.mo1305reqMethod(MethodEnum.POST);
        build.mo1339retryTime(1);
        build.registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.ugc.fragment.request.OrderRequest$doRequest$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                tkz tkzVar2 = tkz.this;
                if (tkzVar2 == null) {
                    return;
                }
                String str3 = null;
                String retCode = mtopResponse != null ? mtopResponse.getRetCode() : null;
                if (mtopResponse != null) {
                    str3 = mtopResponse.getRetMsg();
                }
                tkzVar2.a(mtopResponse, retCode, str3);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                tkz tkzVar2 = tkz.this;
                if (tkzVar2 == null) {
                    return;
                }
                if (baseOutDo == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.taobao.ugc.fragment.request.GetOrderRateInfoResponse");
                }
                tkzVar2.a((GetOrderRateInfoResponse) baseOutDo);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                tkz tkzVar2 = tkz.this;
                if (tkzVar2 == null) {
                    return;
                }
                String str3 = null;
                String retCode = mtopResponse != null ? mtopResponse.getRetCode() : null;
                if (mtopResponse != null) {
                    str3 = mtopResponse.getRetMsg();
                }
                tkzVar2.a(mtopResponse, retCode, str3);
            }
        });
        build.startRequest(20, GetOrderRateInfoResponse.class);
    }
}
