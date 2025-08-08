package com.taobao.android.opencart;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.ResultCode;
import com.taobao.android.opencart.AddBagModel;
import com.taobao.android.opencart.view.VesselViewWrapper;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.taobao.R;
import com.taobao.vessel.VesselView;
import com.taobao.vessel.base.a;
import java.net.URLEncoder;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.hve;
import tb.hvf;
import tb.hvg;
import tb.hvj;
import tb.hvk;
import tb.hvm;
import tb.rgu;
import tb.rgw;
import tb.rgy;
import tb.tfu;
import tb.tpq;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_ADD_CART = "mtop.trade.addBag";
    public static final String CART_REFRESH_DATA = "cartRefreshData";
    public static final String VERSION_ADD_CART = "3.1";

    /* renamed from: a  reason: collision with root package name */
    private Context f14485a;
    private hve b;
    private VesselView c;
    private boolean d;
    private long e;
    private boolean f;
    public static final String ADD_CART_SUCCESS = b.a(R.string.taobao_app_cart_addbag_success);
    public static final String ADD_CART_FAILED = b.a(R.string.taobao_app_1028_1_21681);

    public static /* synthetic */ long a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("68c1a7dc", new Object[]{cVar})).longValue() : cVar.e;
    }

    public static /* synthetic */ void a(c cVar, AddBagModel addBagModel, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daf05264", new Object[]{cVar, addBagModel, new Integer(i), str});
        } else {
            cVar.a(addBagModel, i, str);
        }
    }

    public static /* synthetic */ void a(c cVar, MtopResponse mtopResponse, AddBagModel addBagModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f418e4", new Object[]{cVar, mtopResponse, addBagModel});
        } else {
            cVar.b(mtopResponse, addBagModel);
        }
    }

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af7407f0", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.d = z;
        return z;
    }

    public static /* synthetic */ void b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd00e047", new Object[]{cVar});
        } else {
            cVar.b();
        }
    }

    public static /* synthetic */ void b(c cVar, MtopResponse mtopResponse, AddBagModel addBagModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1dbb725", new Object[]{cVar, mtopResponse, addBagModel});
        } else {
            cVar.a(mtopResponse, addBagModel);
        }
    }

    public static /* synthetic */ boolean b(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c31bdb71", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.f = z;
        return z;
    }

    public static /* synthetic */ boolean c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("514018aa", new Object[]{cVar})).booleanValue() : cVar.f;
    }

    public static /* synthetic */ boolean d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c57f5109", new Object[]{cVar})).booleanValue() : cVar.d;
    }

    public static /* synthetic */ VesselView f(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VesselView) ipChange.ipc$dispatch("6d552f81", new Object[]{cVar}) : cVar.c;
    }

    public static /* synthetic */ hve g(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hve) ipChange.ipc$dispatch("67871fed", new Object[]{cVar}) : cVar.b;
    }

    public void a(Context context, final AddBagModel addBagModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76e64391", new Object[]{this, context, addBagModel});
            return;
        }
        this.f = false;
        if (addBagModel == null) {
            return;
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(JSONObject.toJSONString(addBagModel));
            hvf.c("AddBagRequest", "request addBag json =" + parseObject);
            hvg.a("OpenCart_Addbag_Start", hvg.a(parseObject));
        } catch (Exception e) {
            hvf.c("AddBagRequest", "toJson error" + e.getMessage());
        }
        this.f14485a = context;
        if (!addBagModel.isOpenUrlInDetail() && (context instanceof Activity)) {
            this.b = new hve((Activity) context, this);
            this.c = new VesselViewWrapper(context);
            this.c.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.c.setAlpha(0.0f);
            this.c.setOnLoadListener(new rgu() { // from class: com.taobao.android.opencart.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.rgu
                public void onLoadStart() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f829aa04", new Object[]{this});
                    }
                }

                @Override // tb.rgu
                public void onLoadFinish(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c38c0593", new Object[]{this, view});
                        return;
                    }
                    c.a(c.this, true);
                    hvf.c("AddBagRequest", "weex load finish " + (System.currentTimeMillis() - c.a(c.this)) + "ms");
                }

                @Override // tb.rgu
                public void onLoadError(rgy rgyVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d36981b6", new Object[]{this, rgyVar});
                        return;
                    }
                    c.b(c.this);
                    hvg.a("OpenCart_Addbag_VLView_LoadError", new String[0]);
                    hvf.c("AddBagRequest", "vlview load error");
                }

                @Override // tb.rgu
                public void onDowngrade(rgy rgyVar, Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("775d4b7c", new Object[]{this, rgyVar, map});
                        return;
                    }
                    c.b(c.this);
                    if (c.c(c.this)) {
                        c.a(c.this, addBagModel, 2, c.ADD_CART_SUCCESS);
                        c.b(c.this, false);
                    }
                    hvg.a("OpenCart_Addbag_VLView_LoadDowngrade", new String[0]);
                    hvf.c("AddBagRequest", "vlview load onDowngrade, show toast");
                }
            });
            this.c.setVesselViewCallback(new rgw() { // from class: com.taobao.android.opencart.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.rgw
                public void a(Map<String, Object> map, a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ab6dfe3", new Object[]{this, map, aVar});
                    } else if (map == null || !"dismiss".equals(map.get("method"))) {
                    } else {
                        c.b(c.this);
                    }
                }
            });
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.trade.addBag");
        mtopRequest.setVersion("3.1");
        mtopRequest.setNeedSession(true);
        mtopRequest.setNeedEcode(true);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("itemId", (Object) addBagModel.getItemId());
        jSONObject.put("skuId", (Object) addBagModel.getSkuId());
        jSONObject.put("quantity", (Object) Long.valueOf(addBagModel.getQuantity()));
        jSONObject.put("cartFrom", (Object) addBagModel.getCartFrom());
        if (!StringUtils.isEmpty(addBagModel.getExParams())) {
            try {
                jSONObject.put("exParams", (Object) addBagModel.getExParams());
            } catch (Exception unused) {
            }
        }
        mtopRequest.setData(jSONObject.toJSONString());
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        build.mo1305reqMethod(MethodEnum.POST);
        build.mo1328setUnitStrategy("UNIT_TRADE");
        final long currentTimeMillis = System.currentTimeMillis();
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.opencart.AddBagRequester$3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                c.a(c.this, mtopResponse, addBagModel);
                tpq.a("mtop.trade.addBag", currentTimeMillis, false, mtopResponse == null ? "错误" : mtopResponse.getRetMsg());
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                c.b(c.this, mtopResponse, addBagModel);
                tpq.a("mtop.trade.addBag", currentTimeMillis, true, mtopResponse == null ? ResultCode.MSG_SUCCESS : mtopResponse.getRetMsg());
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                c.a(c.this, mtopResponse, addBagModel);
                tpq.a("mtop.trade.addBag", currentTimeMillis, false, mtopResponse == null ? "错误" : mtopResponse.getRetMsg());
            }
        }).startRequest();
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.d;
    }

    private void a(MtopResponse mtopResponse, AddBagModel addBagModel) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25d8464", new Object[]{this, mtopResponse, addBagModel});
        } else if (mtopResponse != null && mtopResponse.isApiSuccess()) {
            this.f = true;
            JSONObject b = b(mtopResponse);
            hvf.b("AddBagRequest", "mtop addbag success", b.toJSONString());
            a(addBagModel, b.getJSONObject("addCartResult"));
            try {
                z = JSONObject.parseObject(addBagModel.getExParams()).getBooleanValue("depressTBCartRefresh");
            } catch (Exception unused) {
            }
            if (!z) {
                a(a(mtopResponse));
            }
            com.taobao.android.msoa.c.a().a(addBagModel.getRequestId(), b);
            hve hveVar = this.b;
            if (hveVar != null && !hveVar.a(addBagModel)) {
                this.b.a(addBagModel, new AnimatorListenerAdapter() { // from class: com.taobao.android.opencart.c.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        } else if (c.f(c.this) == null) {
                        } else {
                            hvf.c("AddBagRequest", "onAnimationEnd isWeexLoadSuccess=" + c.d(c.this));
                            if (c.d(c.this)) {
                                c.f(c.this).setAlpha(1.0f);
                                return;
                            }
                            hvg.a("OpenCart_Addbag_VLView_DoNotLoadSuccessAfterAnimation", new String[0]);
                            hvf.c("AddBagRequest", String.format("vlview do not load success in %d second", Long.valueOf(c.g(c.this).b())));
                        }
                    }
                });
            } else {
                a(addBagModel, 2, ADD_CART_SUCCESS);
            }
        } else {
            c(mtopResponse, addBagModel);
        }
    }

    private void a(AddBagModel addBagModel, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564d56e4", new Object[]{this, addBagModel, new Integer(i), str});
            return;
        }
        Map<String, Object> clientExParams = addBagModel.getClientExParams();
        if (clientExParams != null && Boolean.TRUE.equals(clientExParams.get("disableToast"))) {
            return;
        }
        hvm.a(this.f14485a, i, str);
    }

    private void a(AddBagModel addBagModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c330cb87", new Object[]{this, addBagModel, jSONObject});
        } else if (this.c == null) {
        } else {
            ViewGroup viewGroup = (ViewGroup) ((Activity) this.f14485a).getWindow().getDecorView();
            if (viewGroup.indexOfChild(this.c) == -1) {
                viewGroup.addView(this.c);
            }
            String b = b(addBagModel, jSONObject);
            hvf.c("AddBagRequest", "vlview start loading url=" + b);
            hvg.a("OpenCart_Addbag_VLView_Loading", new String[0]);
            this.c.loadUrl(b);
            this.e = System.currentTimeMillis();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        VesselView vesselView = this.c;
        if (vesselView == null || vesselView.getParent() == null) {
            return;
        }
        ViewParent parent = this.c.getParent();
        if (!(parent instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) parent).removeView(this.c);
    }

    private void b(MtopResponse mtopResponse, AddBagModel addBagModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9050ea43", new Object[]{this, mtopResponse, addBagModel});
            return;
        }
        this.f = false;
        c(mtopResponse, addBagModel);
        JSONObject b = b(mtopResponse);
        hvf.c("AddBagRequest", "mtop addbag fail", b.toJSONString());
        b.put("MSOAErrorWVUserInfo", (Object) true);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("userInfo", (Object) b);
        com.taobao.android.msoa.c.a().a(addBagModel.getRequestId(), mtopResponse.getRetCode(), mtopResponse.getRetMsg(), jSONObject);
    }

    private void c(MtopResponse mtopResponse, AddBagModel addBagModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e445022", new Object[]{this, mtopResponse, addBagModel});
            return;
        }
        String str = ADD_CART_FAILED;
        if (mtopResponse != null && !StringUtils.isEmpty(mtopResponse.getRetMsg())) {
            str = mtopResponse.getRetMsg();
        }
        if (mtopResponse != null) {
            try {
                String string = mtopResponse.getDataJsonObject().getString("addFailedPopUrl");
                if (!StringUtils.isEmpty(string)) {
                    hvk.a(this.f14485a, string);
                    return;
                }
            } catch (Throwable unused) {
            }
        }
        a(addBagModel, 3, str);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("cartRefreshData");
        if (StringUtils.isEmpty(str)) {
            str = "";
        }
        intent.putExtra("stringifyAddCartResult", str);
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("cartBroadcastFrom", tfu.ADD_CART);
        LocalBroadcastManager.getInstance(this.f14485a).sendBroadcast(intent);
    }

    private String a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf8a613", new Object[]{this, mtopResponse});
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

    private String b(AddBagModel addBagModel, JSONObject jSONObject) {
        AddBagModel.b endRect;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83c88fd8", new Object[]{this, addBagModel, jSONObject});
        }
        if (jSONObject == null || (endRect = addBagModel.getEndRect()) == null) {
            return null;
        }
        String str = "https://market.m.taobao.com/app/tb-trade/icart-group-list/detail-pop?wh_weex=true";
        try {
            if (hvj.a()) {
                str = "https://market.wapa.taobao.com/app/tb-trade/icart-group-list/detail-pop?wh_weex=true";
            }
        } catch (Exception unused) {
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        try {
            buildUpon.appendQueryParameter("cartId", jSONObject.getString("cartId"));
            String string = jSONObject.getString("addToGroupExParams");
            if (string != null) {
                buildUpon.appendQueryParameter("exParams", URLEncoder.encode(string, "UTF-8"));
            }
        } catch (Exception unused2) {
        }
        buildUpon.appendQueryParameter("x", String.valueOf(endRect.b() + (endRect.d() / 2.0f)));
        buildUpon.appendQueryParameter("y", String.valueOf(endRect.c() + endRect.e()));
        return buildUpon.build().toString();
    }

    private JSONObject b(MtopResponse mtopResponse) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("92da388e", new Object[]{this, mtopResponse});
        }
        JSONObject jSONObject = new JSONObject();
        if (mtopResponse.getBytedata() != null && (parseObject = JSONObject.parseObject(new String(mtopResponse.getBytedata()))) != null) {
            jSONObject.put("addCartResult", (Object) parseObject.getJSONObject("data"));
        }
        return jSONObject;
    }
}
