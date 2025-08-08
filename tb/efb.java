package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.request.isv.QueryIsvUrlRequestClient;
import com.taobao.android.detail.core.request.isv.QueryIsvUrlRequestResult;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.sku.SkuPageModel;
import com.taobao.android.trade.boost.request.mtop.a;
import com.taobao.android.trade.boost.request.mtop.c;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes4.dex */
public class efb implements j<edt> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "IsvCustomSubscriber";

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f27259a;
    private a b;

    static {
        kge.a(-436440395);
        kge.a(-1453870097);
    }

    public static /* synthetic */ DetailCoreActivity a(efb efbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("5dfe75a2", new Object[]{efbVar}) : efbVar.f27259a;
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(edt edtVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, edtVar}) : a(edtVar);
    }

    public efb(DetailCoreActivity detailCoreActivity) {
        this.f27259a = detailCoreActivity;
        emu.a("com.taobao.android.detail.core.event.subscriber.isv.IsvCustomSubscriber");
    }

    public i a(edt edtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("4fe89a8c", new Object[]{this, edtVar});
        }
        this.f27259a.y().u = (HashMap) edtVar.f27219a.clone();
        HashMap a2 = a(edtVar.f27219a);
        this.b = new a<QueryIsvUrlRequestResult>() { // from class: tb.efb.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.trade.boost.request.mtop.c
            public /* synthetic */ void onFailure(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a1cc110e", new Object[]{this, mtopResponse});
                } else {
                    a(mtopResponse);
                }
            }

            @Override // com.taobao.android.trade.boost.request.mtop.c
            public /* synthetic */ void onSuccess(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                } else {
                    a((QueryIsvUrlRequestResult) obj);
                }
            }

            @Override // com.taobao.android.trade.boost.request.mtop.a
            public void onSystemFailure(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
                    return;
                }
                epo.a("系统异常，请重试");
                com.taobao.android.detail.core.utils.i.a(efb.TAG, "IsvGetUrl request onSystemFailure");
            }

            public void a(QueryIsvUrlRequestResult queryIsvUrlRequestResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8750150", new Object[]{this, queryIsvUrlRequestResult});
                    return;
                }
                String str = queryIsvUrlRequestResult.url;
                if (StringUtils.isEmpty(str)) {
                    epo.a("系统异常，数据错误");
                } else {
                    epq.a(efb.a(efb.this), str);
                }
            }

            public void a(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                    return;
                }
                epo.a("系统异常，请重试");
                com.taobao.android.detail.core.utils.i.a(efb.TAG, "IsvGetUrl request onFailure");
            }
        };
        a(a2, this.b);
        return com.taobao.android.detail.core.event.a.SUCCESS;
    }

    private void a(Map map, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c701185e", new Object[]{this, map, cVar});
            return;
        }
        new QueryIsvUrlRequestClient().execute(new com.taobao.android.detail.core.request.isv.a(map), (a) cVar, epj.a().getTTID());
    }

    private HashMap a(HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("aefa94ee", new Object[]{this, hashMap});
        }
        b bVar = this.f27259a.y().t.f10055a;
        String str = eqb.c(bVar) != null ? eqb.c(bVar).itemId : "";
        SkuPageModel h = this.f27259a.y().h();
        String skuId = h.getSkuId() != null ? h.getSkuId() : "0";
        JSONObject jSONObject = eqb.g(bVar).isvCustomNode.tradeBefor.b;
        String str2 = eqb.d(bVar).sellerNick;
        JSONObject jSONObject2 = new JSONObject(hashMap);
        jSONObject2.putAll(jSONObject);
        jSONObject2.put("tradeToken", (Object) (this.f27259a.getClass().getSimpleName() + this.f27259a.hashCode()));
        jSONObject2.put("sellerNick", (Object) str2);
        String jSONString = jSONObject2.toJSONString();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("itemId", str);
        hashMap2.put("skuId", skuId);
        hashMap2.put("pluginParams", jSONString);
        return hashMap2;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
