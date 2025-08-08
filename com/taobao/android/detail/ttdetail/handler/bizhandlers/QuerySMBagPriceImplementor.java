package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Seller;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.request.params.MtopRequestParams;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.eyx;
import tb.ezm;
import tb.kge;
import tb.snb;

/* loaded from: classes5.dex */
public class QuerySMBagPriceImplementor implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "querySMBagPrice";

    /* renamed from: a  reason: collision with root package name */
    private Context f10669a;
    private eyx b;

    static {
        kge.a(1007482798);
        kge.a(1967244270);
    }

    public static /* synthetic */ eyx a(QuerySMBagPriceImplementor querySMBagPriceImplementor) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyx) ipChange.ipc$dispatch("37665ab7", new Object[]{querySMBagPriceImplementor}) : querySMBagPriceImplementor.b;
    }

    public QuerySMBagPriceImplementor(Context context, eyx eyxVar) {
        this.f10669a = context;
        this.b = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (aVar == null || (b = aVar.b()) == null) {
            return false;
        }
        if (com.taobao.android.detail.ttdetail.utils.d.a(this.b.a())) {
            return true;
        }
        a(b, runtimeAbilityParamArr);
        return true;
    }

    private void a(JSONObject jSONObject, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ca12ce", new Object[]{this, jSONObject, runtimeAbilityParamArr});
            return;
        }
        Boolean bool = jSONObject.getBoolean("downgrade");
        if ((bool != null && bool.booleanValue()) || !com.taobao.android.detail.ttdetail.utils.ao.c()) {
            return;
        }
        a aVar = new a(new MarketBagPriceRequestParams(jSONObject.getString(com.taobao.android.detail.wrapper.ultronengine.event.s.DIVISION_CODE), com.taobao.android.detail.ttdetail.utils.d.a((Seller) this.b.a().a(Seller.class), "")));
        aVar.a(new MarketBagPriceRequestCallback(jSONObject, runtimeAbilityParamArr));
        aVar.k();
    }

    /* loaded from: classes5.dex */
    public class MarketBagPriceRequestCallback implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private JSONObject mEventFields;
        private RuntimeAbilityParam[] mRuntimeParams;

        static {
            kge.a(517383457);
            kge.a(-525336021);
        }

        public MarketBagPriceRequestCallback(JSONObject jSONObject, RuntimeAbilityParam... runtimeAbilityParamArr) {
            this.mEventFields = jSONObject;
            this.mRuntimeParams = runtimeAbilityParamArr;
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            String bagPrice = getBagPrice(mtopResponse);
            if (StringUtils.isEmpty(bagPrice)) {
                writeBackRoutes(this.mEventFields.getString(com.taobao.android.detail.wrapper.ultronengine.event.s.UNLOGIN_BTN_TITLE), "");
                return;
            }
            String string = this.mEventFields.getString(com.taobao.android.detail.wrapper.ultronengine.event.s.LOGIN_BTN_TITLE);
            writeBackRoutes(string, "¥" + bagPrice);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            writeBackRoutes(this.mEventFields.getString(com.taobao.android.detail.wrapper.ultronengine.event.s.UNLOGIN_BTN_TITLE), "");
            monitorResponseError();
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            writeBackRoutes(this.mEventFields.getString(com.taobao.android.detail.wrapper.ultronengine.event.s.UNLOGIN_BTN_TITLE), "");
            monitorResponseError();
        }

        private void monitorResponseError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6f7f914", new Object[]{this});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("itemId", QuerySMBagPriceImplementor.a(QuerySMBagPriceImplementor.this).e().a("requestItemId"));
            com.taobao.android.detail.ttdetail.utils.ae.a(hashMap, -500004, "猫超购物车价格查询失败");
        }

        private void writeBackRoutes(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d6f2da6b", new Object[]{this, str, str2});
                return;
            }
            final JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(this.mEventFields);
            jSONObject.put("subType", (Object) "jhsRemind");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("beReplaced", (Object) "bottomBarVO");
            jSONObject2.put("toReplace", (Object) "fields");
            jSONObject.put("targetReplacement", (Object) jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("price", (Object) str2);
            jSONObject3.put("btnTitle", (Object) str);
            jSONObject.put("payload", (Object) jSONObject3);
            QuerySMBagPriceImplementor.a(QuerySMBagPriceImplementor.this).c().a(new com.taobao.android.detail.ttdetail.handler.event.a(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.QuerySMBagPriceImplementor.MarketBagPriceRequestCallback.1
                {
                    put("type", "adjustState");
                    put("fields", (Object) jSONObject);
                }
            }), this.mRuntimeParams);
        }

        private String getBagPrice(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5f107a1d", new Object[]{this, mtopResponse});
            }
            if (mtopResponse == null || mtopResponse.getBytedata() == null) {
                writeBackRoutes(this.mEventFields.getString(com.taobao.android.detail.wrapper.ultronengine.event.s.UNLOGIN_BTN_TITLE), "");
                return null;
            }
            JSONObject parseObject = JSON.parseObject(new String(mtopResponse.getBytedata()));
            if (parseObject == null) {
                writeBackRoutes(this.mEventFields.getString(com.taobao.android.detail.wrapper.ultronengine.event.s.UNLOGIN_BTN_TITLE), "");
                return null;
            }
            JSONObject jSONObject = parseObject.getJSONObject("data");
            if (jSONObject == null) {
                writeBackRoutes(this.mEventFields.getString(com.taobao.android.detail.wrapper.ultronengine.event.s.UNLOGIN_BTN_TITLE), "");
                return null;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("model");
            if (jSONObject2 == null) {
                writeBackRoutes(this.mEventFields.getString(com.taobao.android.detail.wrapper.ultronengine.event.s.UNLOGIN_BTN_TITLE), "");
                return null;
            }
            return jSONObject2.getString("price");
        }
    }

    /* loaded from: classes5.dex */
    public class a extends snb<MarketBagPriceRequestParams> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(998309799);
        }

        @Override // tb.snb
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "mtop.trade.queryBagPrice";
        }

        @Override // tb.snb
        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "1.2";
        }

        @Override // tb.snb
        public boolean e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
            }
            return true;
        }

        public a(MarketBagPriceRequestParams marketBagPriceRequestParams) {
            super(marketBagPriceRequestParams);
        }
    }

    /* loaded from: classes5.dex */
    public class MarketBagPriceRequestParams implements MtopRequestParams {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String mDivisionCode;
        private String mSellerId;

        static {
            kge.a(1360594274);
            kge.a(395113271);
        }

        public MarketBagPriceRequestParams(String str, String str2) {
            this.mDivisionCode = str;
            this.mSellerId = str2;
        }

        @Override // com.taobao.android.detail.ttdetail.request.params.MtopRequestParams
        public String toData() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("add28f54", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("cartFrom", "tsm_client_native");
            hashMap.put("sellerId", this.mSellerId);
            HashMap hashMap2 = new HashMap();
            hashMap2.put(com.taobao.android.detail.wrapper.ultronengine.event.s.DIVISION_CODE, this.mDivisionCode);
            hashMap.put("exParams", JSON.toJSONString(hashMap2));
            hashMap.put("detail_v", "3.3.2");
            return JSON.toJSONString(hashMap);
        }
    }
}
