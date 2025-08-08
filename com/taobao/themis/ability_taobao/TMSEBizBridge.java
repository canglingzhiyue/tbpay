package com.taobao.themis.ability_taobao;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.message.util.MessageNavProcessorV2;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.AutoCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.adapter.IMonitorAdapter;
import com.taobao.themis.kernel.adapter.INavigatorAdapter;
import com.taobao.themis.kernel.adapter.IUserTrackerAdapter;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.network.IMtopInnerAdapter;
import com.taobao.themis.kernel.utils.k;
import com.taobao.themis.open.utils.nav.a;
import com.vivo.push.BuildConfig;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.ai;
import kotlin.i;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.crd;
import tb.kge;
import tb.noa;
import tb.qpt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J&\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J\u001f\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010\u0011J&\u0010\u0012\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J&\u0010\u0013\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J(\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J(\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u000bH\u0002J&\u0010\u001a\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\u001b\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002Jh\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\b2\b\u0010!\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010%H\u0002J(\u0010&\u001a\u00020'2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010(\u001a\u00020\b2\n\b\u0001\u0010)\u001a\u0004\u0018\u00010*H\u0007J\b\u0010+\u001a\u00020\u0004H\u0016J\b\u0010,\u001a\u00020\u0004H\u0016J&\u0010-\u001a\u00020'2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010.\u001a\u00020\b2\b\b\u0001\u0010/\u001a\u00020\u000fH\u0007J&\u00100\u001a\u00020'2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\b2\b\b\u0001\u0010/\u001a\u00020\u000fH\u0007J2\u00101\u001a\u00020'2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u00102\u001a\u00020\b2\n\b\u0001\u00103\u001a\u0004\u0018\u00010*2\b\b\u0001\u0010/\u001a\u00020\u000fH\u0007JP\u00104\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010 \u001a\u00020\b2\b\b\u0001\u00105\u001a\u00020\b2\b\b\u0001\u00106\u001a\u00020\b2\b\b\u0001\u00107\u001a\u00020\b2\n\b\u0001\u00108\u001a\u0004\u0018\u00010*2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J&\u00109\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J&\u0010:\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007¨\u0006<"}, d2 = {"Lcom/taobao/themis/ability_taobao/TMSEBizBridge;", "Lcom/taobao/themis/kernel/ability/base/TMSAbility;", "()V", "addToCart", "", "apiContext", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "itemIds", "", Constants.KEY_EXTS, "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "checkGoodsCollectedStatus", "id", "checkShopFavorStatus", "", "sellerId", "(Ljava/lang/String;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)Ljava/lang/Boolean;", "checkShopFavoredStatus", "collectGoods", "collectOrUnCollectGoods", "isCollect", "favorOrUnFavorShop", "isFavor", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "favorShop", "getSpm", "monitor", "pageName", "monitorPoint", "appId", "itemId", "spm", "logKey", "shopId", "extra", "", "navigateToTaobaoPage", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "appCode", "appParams", "Lcom/alibaba/fastjson/JSONObject;", "onFinalized", "onInitialized", "openCart", "cartType", "forceH5", "openDetail", "openMessage", "sellerNick", "params", "showSku", "sourceType", "skuId", noa.KEY_MSOA_TRANS_KEY, "exParams", "unCollectGoods", "unFavorShop", "Companion", "themis_ability_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSEBizBridge implements com.taobao.themis.kernel.ability.base.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final int ERROR_CODE = 10;
    public static final int ERROR_NEED_PARAMS = 106;
    public static final int ERROR_UNSUPPORTED_APP = 101;
    public static final int SKU_ADDCART_FINAL = 2;
    public static final int SKU_ADDCART_SUCCESS = 1;
    public static final int SKU_DOBUY_FINAL = 4;
    public static final int SKU_DOBUY_SUCCESS = 3;
    public static final int SKU_RESULT_CANCELED = 7;
    public static final int SKU_RESULT_CONFIRM = 5;
    public static final int SKU_RESULT_INVALID_INPUT = 9;
    public static final int SKU_RESULT_NONEXIST_GOODS = 11;
    public static final int SKU_RESULT_NOSKU = 10;
    public static final int SKU_RESULT_QUERYDATA_FAILED = 8;
    public static final int SKU_RESULT_UNSUPPORTED_TYPE = 6;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ BridgeCallback d;
        public final /* synthetic */ ApiContext e;

        public b(String str, String str2, BridgeCallback bridgeCallback, ApiContext apiContext) {
            this.b = str;
            this.c = str2;
            this.d = bridgeCallback;
            this.e = apiContext;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            IMtopInnerAdapter iMtopInnerAdapter = (IMtopInnerAdapter) qpt.b(IMtopInnerAdapter.class);
            if (iMtopInnerAdapter == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "itemIds", this.b);
            jSONObject.put((JSONObject) Constants.KEY_EXTS, this.c);
            t tVar = t.INSTANCE;
            IMtopInnerAdapter.a.a(iMtopInnerAdapter, "mtop.tmall.retail.cart.new.add", "1.0", jSONObject, null, true, null, null, null, null, new TMSEBizBridge$addToCart$1$2(this), BuildConfig.VERSION_CODE, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f22298a;

        public c(BridgeCallback bridgeCallback) {
            this.f22298a = bridgeCallback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else {
                this.f22298a.sendBridgeResponse(BridgeResponse.newError(11, "用户拒绝"));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ ApiContext c;
        public final /* synthetic */ BridgeCallback d;

        public d(String str, ApiContext apiContext, BridgeCallback bridgeCallback) {
            this.b = str;
            this.c = apiContext;
            this.d = bridgeCallback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else {
                TMSEBizBridge.access$collectOrUnCollectGoods(TMSEBizBridge.this, true, this.b, this.c, this.d);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class e implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f22300a;

        public e(BridgeCallback bridgeCallback) {
            this.f22300a = bridgeCallback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else {
                this.f22300a.sendBridgeResponse(BridgeResponse.newError(11, "用户拒绝"));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"com/taobao/themis/ability_taobao/TMSEBizBridge$showSku$4", "Lcom/taobao/themis/open/utils/nav/NavForResultUtils$Callback;", "onNavActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "themis_ability_taobao_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class f implements a.InterfaceC0968a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22301a;
        public final /* synthetic */ BridgeCallback b;

        public f(String str, BridgeCallback bridgeCallback) {
            this.f22301a = str;
            this.b = bridgeCallback;
        }

        @Override // com.taobao.themis.open.utils.nav.a.InterfaceC0968a
        public void a(int i, int i2, Intent intent) {
            String str;
            String str2;
            String str3;
            String str4;
            Bundle bundleExtra;
            Bundle extras;
            Bundle extras2;
            Bundle extras3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "resultCode", String.valueOf(i2));
            if (intent == null || (extras3 = intent.getExtras()) == null || (str = extras3.getString("id")) == null) {
                str = "";
            }
            jSONObject2.put((JSONObject) "itemId", str);
            if (intent == null || (extras2 = intent.getExtras()) == null || (str2 = extras2.getString("skuId")) == null) {
                str2 = "";
            }
            jSONObject2.put((JSONObject) "skuId", str2);
            if (intent == null || (extras = intent.getExtras()) == null || (str3 = extras.getString("sku_quantity")) == null) {
                str3 = "";
            }
            jSONObject2.put((JSONObject) "quantity", str3);
            try {
                Result.a aVar = Result.Companion;
                str4 = this.f22301a;
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                Result.m2371constructorimpl(i.a(th));
            }
            if (str4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            if (q.a((Object) "11", (Object) n.b((CharSequence) str4).toString())) {
                jSONObject.put((JSONObject) "skuCloseFrom", "proBtnClick");
                Serializable serializable = (intent == null || (bundleExtra = intent.getBundleExtra("buildOrderParamsBundle")) == null) ? null : bundleExtra.getSerializable("buildOrderParams");
                if (!(serializable instanceof HashMap)) {
                    serializable = null;
                }
                HashMap hashMap = (HashMap) serializable;
                if (hashMap != null) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        jSONObject.put((JSONObject) entry.getKey().toString(), entry.getValue().toString());
                    }
                }
            }
            Result.m2371constructorimpl(t.INSTANCE);
            switch (i2) {
                case 1:
                    jSONObject2.put((JSONObject) "status", "addCartSuccess");
                    this.b.sendJSONResponse(jSONObject);
                    return;
                case 2:
                    jSONObject2.put((JSONObject) "status", "addCartFailed");
                    BridgeCallback bridgeCallback = this.b;
                    jSONObject2.put((JSONObject) "message", "加入购物车失败");
                    jSONObject2.put((JSONObject) "errorMessage", "加入购物车失败");
                    jSONObject2.put((JSONObject) "error", "6");
                    t tVar = t.INSTANCE;
                    bridgeCallback.sendJSONResponse(jSONObject);
                    return;
                case 3:
                    jSONObject2.put((JSONObject) "status", "doBuySuccess");
                    this.b.sendJSONResponse(null);
                    return;
                case 4:
                    jSONObject2.put((JSONObject) "status", "doBuyFailed");
                    BridgeCallback bridgeCallback2 = this.b;
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = jSONObject3;
                    jSONObject4.put((JSONObject) "message", "购买失败");
                    jSONObject4.put((JSONObject) "errorMessage", "购买失败");
                    jSONObject4.put((JSONObject) "error", "6");
                    t tVar2 = t.INSTANCE;
                    bridgeCallback2.sendJSONResponse(jSONObject3);
                    return;
                case 5:
                case 10:
                default:
                    jSONObject2.put((JSONObject) "status", "");
                    BridgeCallback bridgeCallback3 = this.b;
                    jSONObject2.put((JSONObject) "message", "未知错误");
                    jSONObject2.put((JSONObject) "errorMessage", "未知错误");
                    jSONObject2.put((JSONObject) "error", "6");
                    t tVar3 = t.INSTANCE;
                    bridgeCallback3.sendJSONResponse(jSONObject);
                    return;
                case 6:
                    jSONObject2.put((JSONObject) "status", "");
                    BridgeCallback bridgeCallback4 = this.b;
                    jSONObject2.put((JSONObject) "message", "不支持的消息类型");
                    jSONObject2.put((JSONObject) "errorMessage", "不支持的消息类型");
                    jSONObject2.put((JSONObject) "error", "6");
                    t tVar4 = t.INSTANCE;
                    bridgeCallback4.sendJSONResponse(jSONObject);
                    return;
                case 7:
                    jSONObject2.put((JSONObject) "status", "");
                    BridgeCallback bridgeCallback5 = this.b;
                    jSONObject2.put((JSONObject) "message", "用户取消");
                    jSONObject2.put((JSONObject) "errorMessage", "用户取消");
                    jSONObject2.put((JSONObject) "error", "6");
                    t tVar5 = t.INSTANCE;
                    bridgeCallback5.sendJSONResponse(jSONObject);
                    return;
                case 8:
                    jSONObject2.put((JSONObject) "status", "");
                    BridgeCallback bridgeCallback6 = this.b;
                    jSONObject2.put((JSONObject) "message", "SKU网络请求失败");
                    jSONObject2.put((JSONObject) "errorMessage", "SKU网络请求失败");
                    jSONObject2.put((JSONObject) "error", "6");
                    t tVar6 = t.INSTANCE;
                    bridgeCallback6.sendJSONResponse(jSONObject);
                    return;
                case 9:
                    jSONObject2.put((JSONObject) "status", "");
                    BridgeCallback bridgeCallback7 = this.b;
                    jSONObject2.put((JSONObject) "message", "缺少必要的参数");
                    jSONObject2.put((JSONObject) "errorMessage", "缺少必要的参数");
                    jSONObject2.put((JSONObject) "error", "6");
                    t tVar7 = t.INSTANCE;
                    bridgeCallback7.sendJSONResponse(jSONObject);
                    return;
                case 11:
                    jSONObject2.put((JSONObject) "status", "");
                    BridgeCallback bridgeCallback8 = this.b;
                    jSONObject2.put((JSONObject) "message", "宝贝不存在");
                    jSONObject2.put((JSONObject) "errorMessage", "宝贝不存在");
                    jSONObject2.put((JSONObject) "error", "6");
                    t tVar8 = t.INSTANCE;
                    bridgeCallback8.sendJSONResponse(jSONObject);
                    return;
            }
        }
    }

    static {
        kge.a(-2013467877);
        kge.a(-86622547);
        Companion = new a(null);
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/taobao/themis/ability_taobao/TMSEBizBridge$Companion;", "", "()V", "ADDRESS_REQUEST_CODE", "", "ERROR_CODE", "ERROR_NEED_PARAMS", "ERROR_UNSUPPORTED_APP", "SKU_ADDCART_FINAL", "SKU_ADDCART_SUCCESS", "SKU_DOBUY_FINAL", "SKU_DOBUY_SUCCESS", "SKU_REQUEST_CODE", "SKU_RESULT_CANCELED", "SKU_RESULT_CONFIRM", "SKU_RESULT_INVALID_INPUT", "SKU_RESULT_NONEXIST_GOODS", "SKU_RESULT_NOSKU", "SKU_RESULT_QUERYDATA_FAILED", "SKU_RESULT_UNSUPPORTED_TYPE", "themis_ability_taobao_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-557715293);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public static final /* synthetic */ void access$collectOrUnCollectGoods(TMSEBizBridge tMSEBizBridge, boolean z, String str, ApiContext apiContext, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b85e1b4e", new Object[]{tMSEBizBridge, new Boolean(z), str, apiContext, bridgeCallback});
        } else {
            tMSEBizBridge.a(z, str, apiContext, bridgeCallback);
        }
    }

    public static final /* synthetic */ void access$favorOrUnFavorShop(TMSEBizBridge tMSEBizBridge, boolean z, String str, com.taobao.themis.kernel.f fVar, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be0f026e", new Object[]{tMSEBizBridge, new Boolean(z), str, fVar, bridgeCallback});
        } else {
            tMSEBizBridge.a(z, str, fVar, bridgeCallback);
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public final void collectGoods(@BindingApiContext ApiContext apiContext, @BindingParam({"id"}) String id, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ae16aa2", new Object[]{this, apiContext, id, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(id, "id");
        q.d(bridgeCallback, "bridgeCallback");
        if (StringUtils.isEmpty(id)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else {
            new AlertDialog.Builder(apiContext.a()).setMessage("是否收藏该商品? ").setPositiveButton("同意", new d(id, apiContext, bridgeCallback)).setNegativeButton("拒绝", new e(bridgeCallback)).create().show();
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public final void unCollectGoods(@BindingApiContext ApiContext apiContext, @BindingParam({"id"}) String id, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37161349", new Object[]{this, apiContext, id, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(id, "id");
        q.d(bridgeCallback, "bridgeCallback");
        if (StringUtils.isEmpty(id)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else {
            a(false, id, apiContext, bridgeCallback);
        }
    }

    private final void a(boolean z, String str, ApiContext apiContext, BridgeCallback bridgeCallback) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d6d0ca9", new Object[]{this, new Boolean(z), str, apiContext, bridgeCallback});
            return;
        }
        String str4 = z ? "mtop.taobao.miniapp.items.collection.collect" : "mtop.taobao.miniapp.items.collection.del";
        IMtopInnerAdapter iMtopInnerAdapter = (IMtopInnerAdapter) qpt.b(IMtopInnerAdapter.class);
        if (iMtopInnerAdapter == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "itemId", str);
        t tVar = t.INSTANCE;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        com.taobao.themis.kernel.f c2 = apiContext.c();
        if (c2 == null || (str2 = c2.h()) == null) {
            str2 = "";
        }
        linkedHashMap.put("x-container-miniapp-id", str2);
        com.taobao.themis.kernel.f c3 = apiContext.c();
        if (c3 == null || (str3 = k.p(c3)) == null) {
            str3 = "";
        }
        linkedHashMap.put("x-container-miniapp-key", str3);
        t tVar2 = t.INSTANCE;
        IMtopInnerAdapter.a.a(iMtopInnerAdapter, str4, "1.0", jSONObject, null, true, null, linkedHashMap, null, null, new TMSEBizBridge$collectOrUnCollectGoods$3(this, z, bridgeCallback, apiContext, str), 424, null);
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public final void checkGoodsCollectedStatus(@BindingApiContext ApiContext apiContext, @BindingParam({"id"}) String id, @BindingCallback BridgeCallback bridgeCallback) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8737b441", new Object[]{this, apiContext, id, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(id, "id");
        q.d(bridgeCallback, "bridgeCallback");
        if (StringUtils.isEmpty(id)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            return;
        }
        IMtopInnerAdapter iMtopInnerAdapter = (IMtopInnerAdapter) qpt.b(IMtopInnerAdapter.class);
        if (iMtopInnerAdapter == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "itemId", id);
        t tVar = t.INSTANCE;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        com.taobao.themis.kernel.f c2 = apiContext.c();
        if (c2 == null || (str = c2.h()) == null) {
            str = "";
        }
        linkedHashMap.put("x-container-miniapp-id", str);
        com.taobao.themis.kernel.f c3 = apiContext.c();
        if (c3 == null || (str2 = k.p(c3)) == null) {
            str2 = "";
        }
        linkedHashMap.put("x-container-miniapp-key", str2);
        t tVar2 = t.INSTANCE;
        IMtopInnerAdapter.a.a(iMtopInnerAdapter, "mtop.taobao.miniapp.items.collection.check", "1.0", jSONObject, null, true, null, linkedHashMap, null, null, new TMSEBizBridge$checkGoodsCollectedStatus$3(bridgeCallback, id), 424, null);
    }

    @ThreadType(ExecutorType.UI)
    @AutoCallback
    @APIMethod
    public final BridgeResponse openDetail(@BindingApiContext ApiContext apiContext, @BindingParam({"itemId"}) String id, @BindingParam({"forceH5"}) boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("c8f3d29b", new Object[]{this, apiContext, id, new Boolean(z)});
        }
        q.d(apiContext, "apiContext");
        q.d(id, "id");
        if (StringUtils.isEmpty(id)) {
            BridgeResponse bridgeResponse = BridgeResponse.INVALID_PARAM;
            q.b(bridgeResponse, "BridgeResponse.INVALID_PARAM");
            return bridgeResponse;
        }
        Uri uri = Uri.parse("https://detail.m.tmall.com/item.htm");
        com.taobao.themis.kernel.f it = apiContext.c();
        if (it != null) {
            q.b(uri, "uri");
            q.b(it, "it");
            com.taobao.themis.kernel.utils.q.a(uri, it);
        }
        Uri.Builder appendQueryParameter = uri.buildUpon().appendQueryParameter("id", id);
        com.taobao.themis.kernel.f c2 = apiContext.c();
        String str = null;
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("fromAppId", c2 != null ? c2.h() : null);
        if (z) {
            appendQueryParameter2.appendQueryParameter("hybrid", "true");
        }
        com.taobao.themis.kernel.f c3 = apiContext.c();
        if (c3 != null) {
            str = c3.h();
        }
        monitor$default(this, "TRVTbApiPage", "TRVopenDetail", str, id, a(apiContext.c()), "", null, null, 128, null);
        INavigatorAdapter iNavigatorAdapter = (INavigatorAdapter) qpt.b(INavigatorAdapter.class);
        if (iNavigatorAdapter != null) {
            Activity a2 = apiContext.a();
            q.b(a2, "apiContext.activity");
            String uri2 = appendQueryParameter2.build().toString();
            q.b(uri2, "uriBuilder.build().toString()");
            iNavigatorAdapter.openURL(a2, uri2, null, null, null);
        }
        BridgeResponse bridgeResponse2 = BridgeResponse.SUCCESS;
        q.b(bridgeResponse2, "BridgeResponse.SUCCESS");
        return bridgeResponse2;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020e  */
    @com.taobao.themis.kernel.ability.base.annotation.ThreadType(com.taobao.themis.kernel.executor.ExecutorType.IDLE)
    @com.taobao.themis.kernel.ability.base.annotation.AutoCallback
    @com.taobao.themis.kernel.ability.base.annotation.APIMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse navigateToTaobaoPage(@com.taobao.themis.kernel.ability.base.annotation.BindingApiContext com.taobao.themis.kernel.ability.base.ApiContext r15, @com.taobao.themis.kernel.ability.base.annotation.BindingParam({"appCode"}) java.lang.String r16, @com.taobao.themis.kernel.ability.base.annotation.BindingParam({"appParams"}) com.alibaba.fastjson.JSONObject r17) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.ability_taobao.TMSEBizBridge.navigateToTaobaoPage(com.taobao.themis.kernel.ability.base.ApiContext, java.lang.String, com.alibaba.fastjson.JSONObject):com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse");
    }

    @ThreadType(ExecutorType.UI)
    @AutoCallback
    @APIMethod
    public final BridgeResponse openMessage(@BindingApiContext ApiContext apiContext, @BindingParam({"sellerNick"}) String sellerNick, @BindingParam({"params"}) JSONObject jSONObject, @BindingParam({"forceH5"}) boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("3b4fb27f", new Object[]{this, apiContext, sellerNick, jSONObject, new Boolean(z)});
        }
        q.d(apiContext, "apiContext");
        q.d(sellerNick, "sellerNick");
        if (StringUtils.isEmpty(sellerNick)) {
            BridgeResponse bridgeResponse = BridgeResponse.INVALID_PARAM;
            q.b(bridgeResponse, "BridgeResponse.INVALID_PARAM");
            return bridgeResponse;
        }
        Uri uri = Uri.parse("https://h5.m.taobao.com/wx/h5chat.html?targetType=7&bizType=11001");
        com.taobao.themis.kernel.f it = apiContext.c();
        if (it != null) {
            q.b(uri, "uri");
            q.b(it, "it");
            com.taobao.themis.kernel.utils.q.a(uri, it);
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("targetId", MessageNavProcessorV2.KEY_BC_TAOBAO + sellerNick);
        if (z) {
            buildUpon.appendQueryParameter("hybrid", "true");
        }
        if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue().toString());
            }
        }
        INavigatorAdapter iNavigatorAdapter = (INavigatorAdapter) qpt.b(INavigatorAdapter.class);
        if (iNavigatorAdapter != null) {
            Activity a2 = apiContext.a();
            q.b(a2, "apiContext.activity");
            String uri2 = buildUpon.build().toString();
            q.b(uri2, "builder.build().toString()");
            INavigatorAdapter.b.a(iNavigatorAdapter, a2, uri2, null, null, null, 16, null);
        }
        com.taobao.themis.kernel.f c2 = apiContext.c();
        String h = c2 != null ? c2.h() : null;
        String a3 = a(apiContext.c());
        HashMap hashMap = new HashMap();
        hashMap.put("sellerNick", sellerNick);
        t tVar = t.INSTANCE;
        monitor$default(this, "TRVTbApiPage", "openMessage", h, null, a3, null, null, hashMap, 104, null);
        BridgeResponse bridgeResponse2 = BridgeResponse.SUCCESS;
        q.b(bridgeResponse2, "BridgeResponse.SUCCESS");
        return bridgeResponse2;
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public final void addToCart(@BindingApiContext ApiContext apiContext, @BindingParam({"itemIds"}) String itemIds, @BindingParam({"exts"}) String exts, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5317b028", new Object[]{this, apiContext, itemIds, exts, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(itemIds, "itemIds");
        q.d(exts, "exts");
        q.d(bridgeCallback, "bridgeCallback");
        if (StringUtils.isEmpty(itemIds)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else {
            new AlertDialog.Builder(apiContext.a()).setMessage("是否确认加入到购物车？").setPositiveButton("同意", new b(itemIds, exts, bridgeCallback, apiContext)).setNegativeButton("拒绝", new c(bridgeCallback)).create().show();
        }
    }

    @ThreadType(ExecutorType.UI)
    @AutoCallback
    @APIMethod
    public final BridgeResponse openCart(@BindingApiContext ApiContext apiContext, @BindingParam({"cartType"}) String cartType, @BindingParam({"forceH5"}) boolean z) {
        Uri uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("3948e66c", new Object[]{this, apiContext, cartType, new Boolean(z)});
        }
        q.d(apiContext, "apiContext");
        q.d(cartType, "cartType");
        if (q.a((Object) com.taobao.linkmanager.flowout.c.TMALL, (Object) cartType)) {
            uri = Uri.parse("https://cart.m.tmall.com/cart/myCart.htm?cartfrom=triver");
        } else {
            uri = Uri.parse("https://h5.m.taobao.com/awp/base/cart.htm?hasback=true&cartfrom=triver");
        }
        com.taobao.themis.kernel.f it = apiContext.c();
        if (it != null) {
            q.b(uri, "uri");
            q.b(it, "it");
            com.taobao.themis.kernel.utils.q.a(uri, it);
        }
        Uri.Builder buildUpon = uri.buildUpon();
        com.taobao.themis.kernel.f c2 = apiContext.c();
        Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("fromAppId", c2 != null ? c2.h() : null);
        if (z) {
            appendQueryParameter.appendQueryParameter("hybrid", "true");
        }
        INavigatorAdapter iNavigatorAdapter = (INavigatorAdapter) qpt.b(INavigatorAdapter.class);
        if (iNavigatorAdapter != null) {
            Activity a2 = apiContext.a();
            q.b(a2, "apiContext.activity");
            String uri2 = appendQueryParameter.build().toString();
            q.b(uri2, "builder.build().toString()");
            INavigatorAdapter.b.a(iNavigatorAdapter, a2, uri2, null, null, null, 16, null);
        }
        com.taobao.themis.kernel.f c3 = apiContext.c();
        monitor$default(this, "TRVTbApiPage", "TRVopenCart", c3 != null ? c3.h() : null, null, a(apiContext.c()), null, null, null, 232, null);
        BridgeResponse bridgeResponse = BridgeResponse.SUCCESS;
        q.b(bridgeResponse, "BridgeResponse.SUCCESS");
        return bridgeResponse;
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void favorShop(@BindingApiContext ApiContext apiContext, @BindingParam({"id"}) String id, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fb7c39a", new Object[]{this, apiContext, id, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(id, "id");
        q.d(bridgeCallback, "bridgeCallback");
        com.taobao.themis.kernel.f c2 = apiContext.c();
        if (c2 != null) {
            q.b(c2, "apiContext.invokeInstanc…         return\n        }");
            String str = id;
            if (n.a((CharSequence) str)) {
                str = k.x(c2);
            }
            String str2 = str;
            if (StringUtils.isEmpty(str2)) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
                return;
            }
            q.a((Object) str2);
            Boolean a2 = a(str2, bridgeCallback);
            if (a2 == null) {
                return;
            }
            if (a2.booleanValue()) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = jSONObject;
                jSONObject2.put((JSONObject) "error", "12");
                jSONObject2.put((JSONObject) "message", "用户已订阅");
                jSONObject2.put((JSONObject) "errorMessage", "用户已订阅");
                t tVar = t.INSTANCE;
                bridgeCallback.sendJSONResponse(jSONObject);
                return;
            }
            com.taobao.themis.kernel.utils.a.a(new TMSEBizBridge$favorShop$2(this, apiContext, str2, c2, bridgeCallback));
            return;
        }
        bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void checkShopFavoredStatus(@BindingApiContext ApiContext apiContext, @BindingParam({"id"}) String id, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab53991d", new Object[]{this, apiContext, id, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(id, "id");
        q.d(bridgeCallback, "bridgeCallback");
        com.taobao.themis.kernel.f c2 = apiContext.c();
        if (c2 != null) {
            q.b(c2, "apiContext.invokeInstanc…         return\n        }");
            String str = id;
            if (n.a((CharSequence) str)) {
                str = k.x(c2);
            }
            String str2 = str;
            if (StringUtils.isEmpty(str2)) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
                return;
            }
            q.a((Object) str2);
            Boolean a2 = a(str2, bridgeCallback);
            if (a2 == null) {
                return;
            }
            boolean booleanValue = a2.booleanValue();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "id", str2);
            jSONObject2.put((JSONObject) "isFavor", (String) Boolean.valueOf(booleanValue));
            t tVar = t.INSTANCE;
            bridgeCallback.sendJSONResponse(jSONObject);
            return;
        }
        bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void unFavorShop(@BindingApiContext ApiContext apiContext, @BindingParam({"id"}) String id, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92213453", new Object[]{this, apiContext, id, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(id, "id");
        q.d(bridgeCallback, "bridgeCallback");
        com.taobao.themis.kernel.f c2 = apiContext.c();
        if (c2 != null) {
            q.b(c2, "apiContext.invokeInstanc…         return\n        }");
            String str = id;
            if (n.a((CharSequence) str)) {
                str = k.x(c2);
            }
            String str2 = str;
            if (StringUtils.isEmpty(str2)) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
                return;
            }
            q.a((Object) str2);
            Boolean a2 = a(str2, bridgeCallback);
            if (a2 == null) {
                return;
            }
            if (!a2.booleanValue()) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = jSONObject;
                jSONObject2.put((JSONObject) "error", "12");
                jSONObject2.put((JSONObject) "message", "用户未订阅");
                jSONObject2.put((JSONObject) "errorMessage", "用户未订阅");
                t tVar = t.INSTANCE;
                bridgeCallback.sendJSONResponse(jSONObject);
                return;
            }
            a(false, str2, c2, bridgeCallback);
            return;
        }
        bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
    }

    private final Boolean a(String str, BridgeCallback bridgeCallback) {
        IMtopInnerAdapter.Response response;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("68cbc7c7", new Object[]{this, str, bridgeCallback});
        }
        IMtopInnerAdapter iMtopInnerAdapter = (IMtopInnerAdapter) qpt.b(IMtopInnerAdapter.class);
        if (iMtopInnerAdapter != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put((JSONObject) "pubAccountId", str);
            jSONObject2.put((JSONObject) "accountType", "1");
            t tVar = t.INSTANCE;
            response = IMtopInnerAdapter.a.a(iMtopInnerAdapter, "mtop.cybertron.follow.detail", "2.0", jSONObject2, null, true, null, null, null, null, BuildConfig.VERSION_CODE, null);
        } else {
            response = null;
        }
        if (response != null && response.getSuccess()) {
            JSONObject data = response.getData();
            Boolean bool = (data == null || (jSONObject = data.getJSONObject("data")) == null) ? null : jSONObject.getBoolean("follow");
            if (bool != null) {
                return bool;
            }
            bridgeCallback.sendBridgeResponse(BridgeResponse.newError(5, "服务端数据解析错误"));
            return null;
        }
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject3;
        jSONObject4.put((JSONObject) "error", response != null ? response.getErrorCode() : null);
        jSONObject4.put((JSONObject) "message", response != null ? response.getErrorMsg() : null);
        jSONObject4.put((JSONObject) "errorMessage", response != null ? response.getErrorMsg() : null);
        bridgeCallback.sendJSONResponse(jSONObject3);
        return null;
    }

    private final void a(boolean z, String str, com.taobao.themis.kernel.f fVar, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba86b4e1", new Object[]{this, new Boolean(z), str, fVar, bridgeCallback});
            return;
        }
        String str2 = z ? "mtop.taobao.social.follow.weitao.add" : "mtop.taobao.weitao.follow.remove";
        IMtopInnerAdapter iMtopInnerAdapter = (IMtopInnerAdapter) qpt.b(IMtopInnerAdapter.class);
        if (iMtopInnerAdapter == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "pubAccountId", str);
        jSONObject.put((JSONObject) "accountType", "1");
        jSONObject.put((JSONObject) "originBiz", "shoutao_miniapp");
        t tVar = t.INSTANCE;
        IMtopInnerAdapter.a.a(iMtopInnerAdapter, str2, "3.0", jSONObject, null, true, null, null, null, null, new TMSEBizBridge$favorOrUnFavorShop$2(this, bridgeCallback, z, fVar, str), BuildConfig.VERSION_CODE, null);
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public final void showSku(@BindingApiContext ApiContext apiContext, @BindingParam({"itemId"}) String itemId, @BindingParam({"sourceType"}) String sourceType, @BindingParam({"skuId"}) String skuId, @BindingParam({"transparent_key"}) String str, @BindingParam({"exParams"}) JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        String transparent_key = str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea43398", new Object[]{this, apiContext, itemId, sourceType, skuId, transparent_key, jSONObject, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(itemId, "itemId");
        q.d(sourceType, "sourceType");
        q.d(skuId, "skuId");
        q.d(transparent_key, "transparent_key");
        q.d(bridgeCallback, "bridgeCallback");
        if (StringUtils.isEmpty(itemId)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            return;
        }
        String str2 = sourceType;
        if (n.a((CharSequence) str2)) {
            str2 = "0";
        }
        String str3 = str2;
        Uri.Builder buildUpon = Uri.parse("https://a.m.taobao.com/sku" + itemId + ".htm?skuId=" + skuId).buildUpon();
        if (!(!n.a((CharSequence) transparent_key))) {
            transparent_key = null;
        }
        if (transparent_key != null) {
            buildUpon.appendQueryParameter(noa.KEY_MSOA_TRANS_KEY, transparent_key);
        }
        if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue().toString());
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("bizName", "miniapp");
        int parseInt = Integer.parseInt(str3);
        if (parseInt == 1) {
            bundle.putString("bottom_bar_style", "bottombar_style_confirm_addcart");
        } else if (parseInt == 2) {
            bundle.putString("bottom_bar_style", "bottombar_style_confirm_buy");
        } else if (parseInt == 3) {
            bundle.putString("bottom_bar_style", "bottombar_style_confirm");
        } else if (parseInt == 5) {
            bundle.putString("bottom_bar_style", "bottombar_style_addcartonly");
        } else if (parseInt == 6) {
            bundle.putString("bottom_bar_style", "bottombar_style_buyonly");
        } else {
            bundle.putString("bottom_bar_style", "bottombar_style_buyaddcart");
        }
        com.taobao.themis.kernel.f c2 = apiContext.c();
        monitor$default(this, "TRVTbApiPage", "TRVshowSku", c2 != null ? c2.h() : null, itemId, a(apiContext.c()), "/mapp.guide.pdp", null, null, crd.DETECT_WIDTH, null);
        a.b a2 = new a.b().a(bundle).a(buildUpon.build().toString()).a(101);
        com.taobao.themis.open.utils.nav.a aVar = com.taobao.themis.open.utils.nav.a.INSTANCE;
        Activity a3 = apiContext.a();
        q.b(a3, "apiContext.activity");
        aVar.a(a3, a2, new f(sourceType, bridgeCallback));
    }

    public static /* synthetic */ void monitor$default(TMSEBizBridge tMSEBizBridge, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c5944b2", new Object[]{tMSEBizBridge, str, str2, str3, str4, str5, str6, str7, map, new Integer(i), obj});
        } else {
            tMSEBizBridge.a(str, str2, str3, (i & 8) != 0 ? null : str4, str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : map);
        }
    }

    private final void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f258757", new Object[]{this, str, str2, str3, str4, str5, str6, str7, map});
        } else if (StringUtils.isEmpty(str3) || StringUtils.isEmpty(str4)) {
        } else {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = hashMap;
            hashMap2.put("trv_appid", str3);
            hashMap2.put("miniapp_id", str3);
            if (str4 != null) {
                hashMap2.put("item_id", str4);
            }
            if (str7 != null) {
                hashMap2.put("shopId", str7);
            }
            if (!StringUtils.isEmpty(str5)) {
                hashMap2.put("spm_ori", str5);
            }
            if (!StringUtils.isEmpty(str6)) {
                hashMap2.put("logkey", str6);
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "trv_appid", str3);
            jSONObject2.put((JSONObject) "miniapp_id", str3);
            if (str4 != null) {
                jSONObject2.put((JSONObject) "item_id", str4);
            }
            if (str7 != null) {
                jSONObject2.put((JSONObject) "shopId", str7);
            }
            if (!(map == null || map.isEmpty())) {
                hashMap.putAll(map);
            }
            IUserTrackerAdapter iUserTrackerAdapter = (IUserTrackerAdapter) qpt.b(IUserTrackerAdapter.class);
            if (iUserTrackerAdapter != null) {
                iUserTrackerAdapter.customAdvance("2101", str, str2, "", "", ai.b(hashMap2), ai.a());
            }
            IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) qpt.b(IMonitorAdapter.class);
            if (iMonitorAdapter == null) {
                return;
            }
            iMonitorAdapter.trackCounter(str, str2, 1, jSONObject.toJSONString());
        }
    }

    private final String a(com.taobao.themis.kernel.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9586a13", new Object[]{this, fVar});
        }
        if (fVar == null) {
            return "";
        }
        String c2 = fVar.c();
        String a2 = c2 == null ? com.taobao.themis.utils.n.a(fVar.o(), fVar.g()) : c2;
        return a2 == null ? "" : a2;
    }
}
