package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.ext.p;
import com.alibaba.android.ultron.vfw.instance.b;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.core.c;
import com.taobao.android.order.core.h;
import com.taobao.android.order.core.request.DataStatus;
import com.taobao.android.order.core.request.PageStatus;
import com.taobao.android.order.core.request.a;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes6.dex */
public class iam extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "logisticsV2";

    /* renamed from: a  reason: collision with root package name */
    private String f28876a;
    private String b;
    private b l;
    private IDMComponent m;
    private Set<String> n = new HashSet();
    private Context o;

    static {
        kge.a(1343268688);
    }

    public static /* synthetic */ Object ipc$super(iam iamVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "619610359928115438";
    }

    public static /* synthetic */ Context a(iam iamVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("cd11625b", new Object[]{iamVar}) : iamVar.o;
    }

    public static /* synthetic */ void a(iam iamVar, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("352adf68", new Object[]{iamVar, mtopResponse});
        } else {
            iamVar.a(mtopResponse);
        }
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public void d(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
            return;
        }
        hzy.a("newAddress", "onHandleEventChain", "----");
        if (eVar == null || eVar.d() == null) {
            return;
        }
        this.o = eVar.a();
        this.l = eVar.h();
        this.m = eVar.d();
        JSONObject e = e(eVar);
        if (e == null) {
            return;
        }
        this.f28876a = e.getString("mainOrderId");
        hzy.a("newAddress", "onHandleEventChain", "mainOrderId =" + this.f28876a);
        this.b = e.getString(CoreConstants.IN_PARAM_ARCHIVE);
        hzy.a("newAddress", "onHandleEventChain", "archive =" + this.b);
        String b = eVar.b();
        hzy.a("newAddress", "onHandleEventChain", "current eventKey =" + b);
        if (this.n.contains(b)) {
            return;
        }
        a(b, eVar.a());
        this.n.add(b);
    }

    private void a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
        } else if (mtopResponse == null || mtopResponse.getDataJsonObject() == null) {
        } else {
            org.json.JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
            JSONObject jSONObject = this.m.getFields().getJSONObject("mainTitle");
            if (jSONObject != null && dataJsonObject != null) {
                try {
                    hzy.a("newAddress", "notifyDataSetChanged", dataJsonObject.toString());
                    if (jSONObject.containsKey("desc") && !TextUtils.isEmpty(dataJsonObject.getString("description"))) {
                        jSONObject.put("desc", (Object) dataJsonObject.getString("description"));
                    }
                    if (jSONObject.containsKey("title") && !TextUtils.isEmpty(dataJsonObject.getString("title"))) {
                        jSONObject.put("title", (Object) dataJsonObject.getString("title"));
                    }
                } catch (Throwable unused) {
                    return;
                }
            }
            if (!(this.l instanceof d)) {
                return;
            }
            ((d) this.l).b(2);
        }
    }

    private boolean a(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6e7fbda", new Object[]{this, str, context})).booleanValue();
        }
        if (!SUBSCRIBER_ID.equals(str)) {
            return false;
        }
        if (!TextUtils.isEmpty(this.f28876a)) {
            "true".equals(this.b);
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("taobaoTradeId", this.f28876a);
                a.a(new h(this.o).a(hzb.CAINIAO_API_NAME).b(hashMap).b("1.0").a(false), new c() { // from class: tb.iam.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.order.core.c
                    public void onLoadSuccess(JSONObject jSONObject, DataStatus dataStatus, PageStatus pageStatus) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("48a82554", new Object[]{this, jSONObject, dataStatus, pageStatus});
                        }
                    }

                    @Override // com.taobao.android.order.core.c
                    public void onReloadRequested(JSONObject jSONObject) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("1f4f8313", new Object[]{this, jSONObject});
                        }
                    }

                    @Override // com.taobao.android.order.core.c
                    public void onLoadError(String str2, MtopResponse mtopResponse, DataStatus dataStatus, PageStatus pageStatus) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("fc8b03e2", new Object[]{this, str2, mtopResponse, dataStatus, pageStatus});
                        } else if (mtopResponse == null) {
                        } else {
                            iaa.a(iam.a(iam.this), "newAddress", mtopResponse);
                        }
                    }

                    @Override // com.taobao.android.order.core.c
                    public void onLoadSuccess(MtopResponse mtopResponse, DataStatus dataStatus, PageStatus pageStatus) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("329d6593", new Object[]{this, mtopResponse, dataStatus, pageStatus});
                        } else if (mtopResponse == null) {
                        } else {
                            hzy.a("newAddress", "onSuccess", mtopResponse.getApi() + "-" + mtopResponse.getV(), mtopResponse.getRet().toString(), "请求成功");
                            iam.a(iam.this, mtopResponse);
                        }
                    }
                });
                hzy.a("newAddress", "startAsyncLogisticsWork", "star load cainiao api");
            } catch (Throwable th) {
                iaa.a(this.o, "newAddress", th.toString());
            }
        } else {
            iaa.a(this.o, "newAddress", this.f28876a, "");
        }
        return true;
    }
}
