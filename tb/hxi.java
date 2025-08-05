package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.search.network.a;
import com.taobao.android.order.bundle.search.ui.pojo.RecommendDataResponse;
import java.util.ArrayList;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes6.dex */
public class hxi implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f28830a = hxi.class.getSimpleName();
    private hxk b;

    static {
        kge.a(-1266313292);
        kge.a(-83281825);
    }

    public hxi(hxk hxkVar) {
        this.b = hxkVar;
    }

    @Override // com.taobao.android.order.bundle.search.network.a
    public void a(MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce18d5fc", new Object[]{this, mtopResponse, baseOutDo, obj, map});
        } else if (mtopResponse == null || mtopResponse.getBytedata() == null) {
            hyn.a(this.f28830a, "onSuccess() response is null ||  response.getBytedata() is null", new String[0]);
        } else {
            try {
                JSONObject parseObject = JSONObject.parseObject(new String(mtopResponse.getBytedata(), "utf-8"));
                if (parseObject == null) {
                    hyn.a(this.f28830a, "onSuccess() root is null", new String[0]);
                    return;
                }
                JSONObject jSONObject = parseObject.getJSONObject("data");
                if (jSONObject == null) {
                    hyn.a(this.f28830a, "onSuccess() data is null", new String[0]);
                    return;
                }
                RecommendDataResponse recommendDataResponse = (RecommendDataResponse) JSON.parseObject(jSONObject.toJSONString(), RecommendDataResponse.class);
                ArrayList arrayList = new ArrayList();
                hxz.b(arrayList, recommendDataResponse);
                hxz.a(arrayList, recommendDataResponse);
                String str = this.f28830a;
                hyn.a(str, "recommendDataResponse:" + recommendDataResponse, new String[0]);
                if (this.b == null) {
                    return;
                }
                this.b.a(arrayList);
            } catch (Exception unused) {
                hyn.a(hxi.class.getSimpleName(), "onSuccess json parse data exception", new String[0]);
            }
        }
    }

    @Override // com.taobao.android.order.bundle.search.network.a
    public void a(MtopResponse mtopResponse, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2b8239c", new Object[]{this, mtopResponse, obj, map});
        } else {
            hyn.a(this.f28830a, "onError()", new String[0]);
        }
    }

    @Override // com.taobao.android.order.bundle.search.network.a
    public void b(MtopResponse mtopResponse, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3502d87b", new Object[]{this, mtopResponse, obj, map});
        } else {
            hyn.a(this.f28830a, "onSystemError()", new String[0]);
        }
    }

    @Override // com.taobao.android.order.bundle.search.network.a
    public void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
        } else {
            hyn.a(this.f28830a, "parseParamError()", new String[0]);
        }
    }

    @Override // com.taobao.android.order.bundle.search.network.a
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            hyn.a(this.f28830a, "onStart()", new String[0]);
        }
    }
}
