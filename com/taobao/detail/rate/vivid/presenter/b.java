package com.taobao.detail.rate.vivid.presenter;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.mtop.RateListDetailRequest;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import org.android.agoo.common.AgooConstants;
import tb.fxr;
import tb.xkm;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private JSONObject f17049a;
    private boolean b = true;
    private a c;
    private JSONObject d;
    private c e;
    private JSONObject f;
    private final boolean g;
    private final boolean h;

    /* loaded from: classes7.dex */
    public interface a {
        void a(JSONObject jSONObject);

        void a(String str);
    }

    public static /* synthetic */ JSONObject a(b bVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("50cf2ff", new Object[]{bVar, jSONObject});
        }
        bVar.d = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ a a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("96bf8071", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ void a(b bVar, JSONObject jSONObject, RateListDetailRequest rateListDetailRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68c38485", new Object[]{bVar, jSONObject, rateListDetailRequest});
        } else {
            bVar.a(jSONObject, rateListDetailRequest);
        }
    }

    public static /* synthetic */ boolean a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fda777c7", new Object[]{bVar, new Boolean(z)})).booleanValue();
        }
        bVar.b = z;
        return z;
    }

    public b(boolean z, boolean z2) {
        this.g = z;
        this.h = z2;
        if (this.g || this.h) {
            this.e = new c();
        }
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.d;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.f17049a = jSONObject;
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b606d114", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this}) : this.f;
    }

    private boolean c(RateListDetailRequest rateListDetailRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca82df1e", new Object[]{this, rateListDetailRequest})).booleanValue();
        }
        if (this.h) {
            return d(rateListDetailRequest);
        }
        if (!this.g) {
            return false;
        }
        return a(rateListDetailRequest);
    }

    private boolean d(RateListDetailRequest rateListDetailRequest) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbb931fd", new Object[]{this, rateListDetailRequest})).booleanValue();
        }
        c cVar = this.e;
        if (cVar != null && (a2 = cVar.a(rateListDetailRequest)) != null) {
            this.f = a2;
        }
        return false;
    }

    private boolean a(RateListDetailRequest rateListDetailRequest) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8163960", new Object[]{this, rateListDetailRequest})).booleanValue();
        }
        c cVar = this.e;
        if (cVar == null || (a2 = cVar.a(rateListDetailRequest)) == null) {
            return false;
        }
        this.b = true;
        this.d = a2;
        return true;
    }

    private void a(RateListDetailRequest rateListDetailRequest, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b6d9d14", new Object[]{this, rateListDetailRequest, jSONObject});
            return;
        }
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        cVar.a(rateListDetailRequest, jSONObject);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.f17049a == null) {
        } else {
            this.b = false;
            final RateListDetailRequest rateListDetailRequest = new RateListDetailRequest();
            b(rateListDetailRequest);
            if (c(rateListDetailRequest)) {
                return;
            }
            MtopBusiness.build(Mtop.instance(null), rateListDetailRequest).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.detail.rate.vivid.presenter.PreRequestPresenter$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    b.a(b.this, true);
                    if (b.a(b.this) == null) {
                        return;
                    }
                    b.a(b.this).a("onSystemError");
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    b.a(b.this, true);
                    JSONObject parseObject = JSONObject.parseObject(mtopResponse.getDataJsonObject().toString());
                    if (parseObject != null && !parseObject.isEmpty()) {
                        b.a(b.this, parseObject, rateListDetailRequest);
                        b.a(b.this, parseObject);
                        if (b.a(b.this) == null) {
                            return;
                        }
                        b.a(b.this).a(parseObject);
                    } else if (b.a(b.this) == null) {
                    } else {
                        b.a(b.this).a("onDataError");
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    b.a(b.this, true);
                    if (b.a(b.this) == null) {
                        return;
                    }
                    b.a(b.this).a("onError");
                }
            }).mo1305reqMethod(MethodEnum.POST).startRequest();
        }
    }

    private void a(JSONObject jSONObject, RateListDetailRequest rateListDetailRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c62a963c", new Object[]{this, jSONObject, rateListDetailRequest});
            return;
        }
        if (xkm.INSTANCE.g()) {
            new d().a(jSONObject);
        }
        a(rateListDetailRequest, jSONObject);
    }

    private void b(RateListDetailRequest rateListDetailRequest) {
        String str;
        String string;
        String str2;
        String str3;
        String str4;
        int i;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c94c8c3b", new Object[]{this, rateListDetailRequest});
            return;
        }
        JSONObject a2 = fxr.a("rateExtParams", this.f17049a, new JSONObject());
        JSONObject a3 = fxr.a("exParams", a2, new JSONObject());
        JSONArray a4 = fxr.a("rateKeywordList", this.f17049a, (JSONArray) null);
        String str10 = "";
        String a5 = fxr.a("invokeSource", this.f17049a, str10);
        int a6 = fxr.a("foldFlag", a2, 0);
        String str11 = a6 != 0 ? "1" : "0";
        String a7 = fxr.a("expression", this.f17049a, str10);
        String a8 = fxr.a("itemId", this.f17049a, str10);
        String a9 = fxr.a("invokeSource", a2, str10);
        String str12 = "12";
        if (a9.equals(str12)) {
            str = fxr.a("itemId", a2, str10);
            a7 = fxr.a("expression", a2, str10);
        } else if (a9.equals(AgooConstants.ACK_FLAG_NULL)) {
            str = a8;
        } else {
            str = a8;
            a9 = a5;
        }
        if (!StringUtils.isEmpty(a7)) {
            if (a3.get("rateType") != null) {
                string = a3.getString("rateType");
            } else {
                if (a4 != null && !a4.isEmpty()) {
                    string = fxr.a("rateType", a4.getJSONObject(0), str10);
                }
                string = str10;
            }
        } else {
            if (a3.get("rateType") != null) {
                string = a3.getString("rateType");
            }
            string = str10;
        }
        if (string.equals(str10)) {
            str2 = "0";
            str3 = "-8";
        } else {
            str2 = "0";
            str3 = string;
        }
        if (!StringUtils.isEmpty(a7)) {
            str4 = str;
            i = a6;
            str5 = "1";
        } else {
            str4 = str;
            i = a6;
            str5 = str2;
        }
        if (a9.equals("-2")) {
            str6 = "shoutao_rate_history_list";
        } else if (a9.equals(str12)) {
            str6 = "shoutao_shop_rate_list";
        } else {
            str6 = a9.equals(AgooConstants.ACK_FLAG_NULL) ? "shoutao_item_tk_rate_list" : "shoutao_rate_list";
        }
        if (str6.equals("shoutao_rate_history_list")) {
            str7 = str6;
            str8 = str10;
        } else {
            str7 = str6;
            str8 = "1";
        }
        String a10 = fxr.a("storeId", a3, str10);
        JSONObject parseObject = JSON.parseObject(a3.toJSONString());
        String str13 = str8;
        parseObject.remove("enableExtraRateTypes");
        parseObject.remove("rateType");
        String a11 = fxr.a("feedId", this.f17049a, str10);
        if (!a9.equals(str12)) {
            if (a9.equals(AgooConstants.ACK_FLAG_NULL)) {
                str12 = AgooConstants.ACK_FLAG_NULL;
            } else {
                str12 = !StringUtils.isEmpty(a11) ? "4" : "-1";
            }
        }
        String a12 = fxr.a("vids", fxr.a("initSelectSku", this.f17049a, (JSONObject) null), str10);
        if (a4 != null && !a4.isEmpty()) {
            JSONObject jSONObject = new JSONObject(a3);
            jSONObject.put("detail_impr", (Object) a4);
            str9 = jSONObject.toJSONString();
        } else {
            if (!a3.isEmpty()) {
                str10 = a3.toJSONString();
            }
            str9 = str10;
        }
        rateListDetailRequest.feature = str11;
        rateListDetailRequest.rateType = string;
        rateListDetailRequest.searchImpr = str3;
        rateListDetailRequest.expression = a7;
        rateListDetailRequest.fromImpr = str5;
        rateListDetailRequest.hasPic = str13;
        rateListDetailRequest.pageSize = "10";
        rateListDetailRequest.rateSrc = str7;
        String str14 = "1";
        rateListDetailRequest.pageNo = str14;
        rateListDetailRequest.storeId = a10;
        rateListDetailRequest.orderType = "defaultorder";
        rateListDetailRequest.andQueryCondition = parseObject.toJSONString();
        rateListDetailRequest.invokeSource = str12;
        rateListDetailRequest.feedId = a11;
        rateListDetailRequest.skuVids = a12;
        rateListDetailRequest.auctionNumId = str4;
        if (i != 1) {
            str14 = str2;
        }
        rateListDetailRequest.foldFlag = str14;
        rateListDetailRequest.extraInfoString = str9;
        rateListDetailRequest.extraInfoMap = "{\"filterCurItemOnly\":\"false\"}";
    }
}
