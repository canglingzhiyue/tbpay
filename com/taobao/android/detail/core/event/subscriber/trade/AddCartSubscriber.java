package com.taobao.android.detail.core.event.subscriber.trade;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.params.JoinJhsParams;
import com.taobao.android.detail.core.request.cart.AddBagRequestClient;
import com.taobao.android.detail.core.request.cart.AddBagRequestParams;
import com.taobao.android.detail.core.utils.n;
import com.taobao.android.detail.datasdk.event.params.c;
import com.taobao.android.detail.datasdk.model.datamodel.node.SkuCoreNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.TradeNode;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import java.io.Serializable;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;
import tb.bgc;
import tb.ecg;
import tb.ecu;
import tb.edc;
import tb.edd;
import tb.edu;
import tb.efr;
import tb.efs;
import tb.eft;
import tb.ehs;
import tb.emu;
import tb.ens;
import tb.enw;
import tb.epo;
import tb.eps;
import tb.eqb;
import tb.eqg;
import tb.kge;
import tb.nom;

/* loaded from: classes4.dex */
public class AddCartSubscriber implements j<efr>, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ADD_CART_FAILED = "加入购物车出错";
    public static final String ADD_CART_SUCCESS = "添加成功，在购物车等亲～";
    public static final String CART_REFRESH_DATA = "cartRefreshData";
    private static final String JOIN_JHS_ACTION = "add2Cart";
    public static final String UNKNOW_ERR = "小二很忙，系统很累，请稍后重试";
    public static String YXG_ADD_CART_SUCCESS;
    public DetailCoreActivity mActivity;
    public ArrayList<a> mAddCartListenerList = new ArrayList<>();

    public static /* synthetic */ void access$000(AddCartSubscriber addCartSubscriber, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("540b3d03", new Object[]{addCartSubscriber, str});
        } else {
            addCartSubscriber.exposureAddCart(str);
        }
    }

    public static /* synthetic */ boolean access$100(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7d435aa7", new Object[]{detailCoreActivity})).booleanValue() : checkNodeBundleNotNull(detailCoreActivity);
    }

    static {
        kge.a(1216826385);
        kge.a(-1453870097);
        kge.a(1028243835);
        YXG_ADD_CART_SUCCESS = "";
    }

    public AddCartSubscriber(DetailCoreActivity detailCoreActivity) {
        this.mActivity = detailCoreActivity;
        emu.a("com.taobao.android.detail.core.event.subscriber.trade.AddCartSubscriber");
    }

    @Override // com.taobao.android.trade.event.j
    public i handleEvent(efr efrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("69ba5377", new Object[]{this, efrVar});
        }
        if (efrVar == null) {
            return com.taobao.android.detail.core.event.a.FAILURE;
        }
        c cVar = efrVar.c;
        com.taobao.android.detail.datasdk.event.params.a aVar = cVar.f9951a;
        if (TextUtils.isEmpty(aVar.b)) {
            return com.taobao.android.detail.core.event.a.FAILURE;
        }
        String str = aVar.b;
        if (cVar.b) {
            f.a(this.mActivity).a(new edu(new JoinJhsParams(str, JOIN_JHS_ACTION, new efr(), aVar)));
            return com.taobao.android.detail.core.event.a.SUCCESS;
        }
        eps.a(this.mActivity, "WantAddCart", new Pair[0]);
        addCart(aVar, cVar.c);
        return com.taobao.android.detail.core.event.a.SUCCESS;
    }

    private void addCart(com.taobao.android.detail.datasdk.event.params.a aVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f28c5da5", new Object[]{this, aVar, map});
        } else if (aVar == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("addSource", "nativeDetail");
            if (!eqg.a(aVar.i)) {
                hashMap.putAll(aVar.i);
            }
            if (!eqg.a(map)) {
                hashMap.putAll(map);
            }
            long j = aVar.c;
            if (aVar.d > 1) {
                j /= aVar.d;
            }
            if (j < 1) {
                j = 1;
            }
            AddBagRequestParams addBagRequestParams = new AddBagRequestParams(aVar.b, aVar.f9948a, "" + j, aVar.e, aVar.f, null, hashMap);
            a aVar2 = new a(addBagRequestParams);
            this.mAddCartListenerList.add(aVar2);
            AddBagRequestClient addBagRequestClient = new AddBagRequestClient();
            ecg.b(this.mActivity, "mtop.trade.addBag", "3.1", JSON.toJSONString(addBagRequestParams), (Map<String, Object>) null);
            addBagRequestClient.execute(addBagRequestParams, aVar2, epo.f());
        }
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    public void onAddCartSuccess(MtopResponse mtopResponse, AddBagRequestParams addBagRequestParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a76b51f0", new Object[]{this, mtopResponse, addBagRequestParams});
        } else if (mtopResponse != null && mtopResponse.isApiSuccess()) {
            new b(this.mActivity).a(false, true, "", getMtopDataString(mtopResponse));
        } else {
            handleAddCartError(mtopResponse, addBagRequestParams);
        }
    }

    private String getMtopDataString(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf3ee23b", new Object[]{this, mtopResponse});
        }
        if (mtopResponse == null) {
            return null;
        }
        try {
            return JSON.parseObject(new String(mtopResponse.getBytedata())).getString("data");
        } catch (Throwable unused) {
            return null;
        }
    }

    public void handleAddonEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("234d3409", new Object[]{this});
        } else if (!checkNodeBundleNotNull(this.mActivity) || eqb.f(this.mActivity.y().h.f27459a.f10055a) == null || !eqb.f(this.mActivity.y().h.f27459a.f10055a).openAddOnTools) {
        } else {
            f.a(this.mActivity).a(new edd());
        }
    }

    private static boolean checkNodeBundleNotNull(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2e8e79aa", new Object[]{detailCoreActivity})).booleanValue() : (detailCoreActivity == null || detailCoreActivity.y() == null || detailCoreActivity.y().h == null || detailCoreActivity.y().h.f27459a == null || detailCoreActivity.y().h.f27459a.f10055a == null) ? false : true;
    }

    public void onAddCartFailed(MtopResponse mtopResponse, AddBagRequestParams addBagRequestParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c85481f2", new Object[]{this, mtopResponse, addBagRequestParams});
        } else {
            handleAddCartError(mtopResponse, addBagRequestParams);
        }
    }

    private void handleAddCartError(MtopResponse mtopResponse, AddBagRequestParams addBagRequestParams) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("476a29e2", new Object[]{this, mtopResponse, addBagRequestParams});
            return;
        }
        if (mtopResponse != null) {
            try {
                JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                if (dataJsonObject.getBoolean(nom.KEY_IS_FULL)) {
                    f.a(this.mActivity, new ens(dataJsonObject.getString("popLayerUrl")));
                    return;
                }
            } catch (Throwable unused) {
            }
        }
        DetailCoreActivity detailCoreActivity = this.mActivity;
        String str2 = "";
        String str3 = addBagRequestParams != null ? addBagRequestParams.itemId : str2;
        ecg.g(detailCoreActivity, str3, mtopResponse.getRetCode() + str2, mtopResponse.toString());
        if (mtopResponse == null || mtopResponse.is41XResult()) {
            str = "小二很忙，系统很累，请稍后重试";
        } else {
            String retMsg = mtopResponse.getRetMsg();
            if (TextUtils.isEmpty(retMsg)) {
                retMsg = ADD_CART_FAILED;
            }
            str = retMsg;
            str2 = mtopResponse.getRetMsg();
        }
        if (mtopResponse == null || !mtopResponse.isSessionInvalid()) {
            enw enwVar = new enw();
            enwVar.f27481a = true;
            if (mtopResponse == null || mtopResponse.isMtopServerError() || mtopResponse.isMtopSdkError() || mtopResponse.isNetworkError() || mtopResponse.isSystemError() || mtopResponse.isExpiredRequest() || mtopResponse.is41XResult() || mtopResponse.isApiLockedResult()) {
                enwVar.b = "小二很忙，系统很累，请稍后重试";
            } else {
                enwVar.b = str;
            }
            f.a(this.mActivity, enwVar);
        }
        f.a(this.mActivity).a(new efs(addBagRequestParams));
        n.a("AddCart", "80002", str2);
    }

    private void exposureAddCart(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b00ff6b", new Object[]{this, str});
            return;
        }
        DetailCoreActivity detailCoreActivity = this.mActivity;
        String str3 = "";
        if (detailCoreActivity == null || detailCoreActivity.y() == null || this.mActivity.y().t == null) {
            str2 = str3;
        } else {
            str3 = this.mActivity.y().t.i();
            str2 = this.mActivity.y().t.h();
        }
        eps.a("Page_Detail", 2101, str, null, null, "itemId=" + str3, "sellerId=" + str2);
    }

    /* loaded from: classes4.dex */
    public class a implements com.taobao.android.trade.boost.request.mtop.a<MtopResponse> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public AddBagRequestParams f9732a;

        static {
            kge.a(-860529534);
            kge.a(1595456606);
        }

        @Override // com.taobao.android.trade.boost.request.mtop.c
        public /* synthetic */ void onFailure(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a1cc110e", new Object[]{this, mtopResponse});
            } else {
                b(mtopResponse);
            }
        }

        @Override // com.taobao.android.trade.boost.request.mtop.c
        public /* synthetic */ void onSuccess(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
            } else {
                a((MtopResponse) obj);
            }
        }

        public a(AddBagRequestParams addBagRequestParams) {
            this.f9732a = addBagRequestParams;
        }

        public void a(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                return;
            }
            if (AddCartSubscriber.this.mAddCartListenerList != null) {
                AddCartSubscriber.this.mAddCartListenerList.remove(this);
            }
            AddCartSubscriber.this.onAddCartSuccess(mtopResponse, this.f9732a);
            new HashMap().put("requestParams", this.f9732a);
            ecg.a(AddCartSubscriber.this.mActivity, mtopResponse, (Map<String, Object>) null);
            AddCartSubscriber.access$000(AddCartSubscriber.this, "addCartSuccess");
            bgc.b("detail", mtopResponse);
        }

        public void b(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("743cc56e", new Object[]{this, mtopResponse});
                return;
            }
            if (AddCartSubscriber.this.mAddCartListenerList != null) {
                AddCartSubscriber.this.mAddCartListenerList.remove(this);
            }
            AddCartSubscriber.this.onAddCartFailed(mtopResponse, this.f9732a);
            new HashMap().put("requestParams", this.f9732a);
            ecg.a(AddCartSubscriber.this.mActivity, mtopResponse, (Map<String, Object>) null);
            AddCartSubscriber.access$000(AddCartSubscriber.this, "addCartFailed");
            bgc.a("detail", mtopResponse);
        }

        @Override // com.taobao.android.trade.boost.request.mtop.a
        public void onSystemFailure(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
            } else {
                b(mtopResponse);
            }
        }
    }

    public void broadcastCartDataUpdate(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d3b162d", new Object[]{this, context});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("cartRefreshData");
        intent.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    /* loaded from: classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private DetailCoreActivity f9733a;

        static {
            kge.a(260532318);
        }

        public b(DetailCoreActivity detailCoreActivity) {
            this.f9733a = detailCoreActivity;
        }

        public void a(boolean z, boolean z2, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6de2dfc", new Object[]{this, new Boolean(z), new Boolean(z2), str, str2});
                return;
            }
            if (!a(z, str) && z2) {
                enw enwVar = new enw();
                enwVar.f27481a = false;
                enwVar.b = AddCartSubscriber.ADD_CART_SUCCESS;
                f.a(this.f9733a, enwVar);
            }
            a(str, str2);
        }

        private void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            a(epo.a(), str2);
            n.a("AddCart");
            f.a(this.f9733a).a(new eft(null));
            a(str);
        }

        private boolean a(boolean z, String str) {
            com.alibaba.fastjson.JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f7197a3a", new Object[]{this, new Boolean(z), str})).booleanValue();
            }
            if (!z && ecu.D && AddCartSubscriber.access$100(this.f9733a)) {
                com.taobao.android.detail.datasdk.model.datamodel.node.b bVar = this.f9733a.y().h.f27459a.f10055a;
                com.alibaba.fastjson.JSONObject jSONObject2 = ((TradeNode) bVar.b("trade", TradeNode.class)).afterAddToCartAction;
                if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("fields")) == null) {
                    return false;
                }
                String string = jSONObject2.getString("type");
                String string2 = jSONObject.getString("url");
                if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string)) {
                    if (!TextUtils.isEmpty(str)) {
                        com.alibaba.fastjson.JSONObject jSONObject3 = jSONObject2.getJSONObject("fields");
                        jSONObject3.put("url", (Object) (string2 + "&skuInfo=" + str));
                        jSONObject2.put("fields", (Object) jSONObject3);
                    }
                    f.a(this.f9733a).a(ehs.a(this.f9733a, new ActionModel(jSONObject2), bVar, null, null));
                    return true;
                }
            }
            return false;
        }

        private void a(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
                return;
            }
            Intent intent = new Intent();
            intent.setAction("cartRefreshData");
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            intent.putExtra("stringifyAddCartResult", str);
            intent.addCategory("android.intent.category.DEFAULT");
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        }

        private void a(String str) {
            com.alibaba.fastjson.JSONObject parseObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else if (!AddCartSubscriber.access$100(this.f9733a) || eqb.f(this.f9733a.y().h.f27459a.f10055a) == null) {
            } else {
                if (eqb.f(this.f9733a.y().h.f27459a.f10055a).openAddOnTools) {
                    f.a(this.f9733a).a(new edd());
                }
                if (!eqb.f(this.f9733a.y().h.f27459a.f10055a).smAcitonAfterPurchase) {
                    return;
                }
                try {
                    String str2 = "";
                    if (!TextUtils.isEmpty(str) && (parseObject = com.alibaba.fastjson.JSONObject.parseObject(URLDecoder.decode(str, "utf-8"))) != null && parseObject.containsKey("skuId")) {
                        str2 = parseObject.getString("skuId");
                    }
                    if (eqb.j(this.f9733a.y().h.f27459a.f10055a) == null || eqb.j(this.f9733a.y().h.f27459a.f10055a).sku2info == null) {
                        return;
                    }
                    HashMap<String, SkuCoreNode.SkuAttribute> hashMap = eqb.j(this.f9733a.y().h.f27459a.f10055a).sku2info;
                    if (TextUtils.isEmpty(str2) && hashMap.size() == 1) {
                        str2 = "0";
                    }
                    if (TextUtils.isEmpty(str2) || hashMap.get(str2) == null) {
                        return;
                    }
                    emu.a("com.taobao.android.detail.core.event.subscriber.trade.AddCartSubscriber#AchieveCouponAfterSuperMarketAddCart");
                    SkuCoreNode.SkuAttribute skuAttribute = hashMap.get(str2);
                    com.taobao.android.detail.core.event.params.a aVar = new com.taobao.android.detail.core.event.params.a();
                    aVar.b = skuAttribute.asac;
                    aVar.c = skuAttribute.itemApplyParams;
                    edc edcVar = new edc();
                    edcVar.f27205a = aVar;
                    aVar.f9714a = this.f9733a.y().t.h();
                    f.a(this.f9733a).a(edcVar);
                } catch (Exception unused) {
                }
            }
        }
    }
}
