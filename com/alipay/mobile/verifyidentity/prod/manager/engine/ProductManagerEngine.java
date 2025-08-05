package com.alipay.mobile.verifyidentity.prod.manager.engine;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.mobile.verifyidentity.callback.ProdManagerListener;
import com.alipay.mobile.verifyidentity.callback.RecommendBioListener;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.ProdManagerResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.engine.VerifyIdentityEngine;
import com.alipay.mobile.verifyidentity.info.EnvInfoUtil;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.log.behavior.VerifyLogger;
import com.alipay.mobile.verifyidentity.prod.manager.ProdManagerMetaInfo;
import com.alipay.mobile.verifyidentity.prod.manager.module.BaseProdManager;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.alipay.mobileic.core.model.rpc.MICProdmngRequest;
import com.alipay.mobileic.core.model.rpc.MICProdmngResponse;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.canvas.canvas.a;
import java.util.HashMap;
import java.util.Map;
import tb.rrv;

/* loaded from: classes3.dex */
public class ProductManagerEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5941a = "ProductManagerEngine";
    private static volatile ProductManagerEngine b = null;
    private static String c = "SYSTEM_ERROR";
    private static String d = "not_exist_bic_feature";
    private static String e = "not_install_ifaa";
    private String f;
    private long g;

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f5941a;
    }

    public static /* synthetic */ String a(ProductManagerEngine productManagerEngine) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1d583c3c", new Object[]{productManagerEngine}) : productManagerEngine.f;
    }

    public static /* synthetic */ void b(ProductManagerEngine productManagerEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0ce02c3", new Object[]{productManagerEngine});
        } else {
            b();
        }
    }

    private ProductManagerEngine(Context context) {
        VerifyIdentityEngine.getInstance(context);
    }

    public static ProductManagerEngine getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProductManagerEngine) ipChange.ipc$dispatch("99234b2", new Object[]{context});
        }
        if (b == null) {
            synchronized (ProductManagerEngine.class) {
                if (b == null) {
                    b = new ProductManagerEngine(context);
                }
            }
        }
        return b;
    }

    public synchronized void startByToken(String str, String str2, String str3, Bundle bundle, ProdManagerListener prodManagerListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f69870", new Object[]{this, str, str2, str3, bundle, prodManagerListener});
        } else if (isDoubleClick()) {
        } else {
            a(str, str2, str3, bundle, prodManagerListener);
        }
    }

    public synchronized void startByVIData(String str, Bundle bundle, RecommendBioListener recommendBioListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2dbb0d4", new Object[]{this, str, bundle, recommendBioListener});
            return;
        }
        VerifyLogCat.i(f5941a, "启动支付后推荐开通");
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                if (parseObject != null) {
                    String string = parseObject.getString("token");
                    String string2 = parseObject.getString("productCode");
                    a("UC-MobileIC-20180904-1", "", "", "", parseObject.getString("sceneId"), parseObject.getString(rrv.PRODUCT_ID));
                    if (bundle != null) {
                        bundle.putString("source", "startByVIData");
                    } else {
                        bundle = new Bundle();
                        bundle.putString("source", "startByVIData");
                    }
                    BaseProdManager a2 = a(string2);
                    if (a2 != null) {
                        a2.mName = string2;
                        a2.create(string, str, bundle, recommendBioListener);
                        return;
                    }
                    a(string, "1002", recommendBioListener);
                    VerifyLogCat.i(f5941a, "启动支付后推荐异常");
                }
                return;
            } catch (Exception unused) {
            }
        }
        a("", "1002", recommendBioListener);
    }

    public synchronized void startByToken(String str, Bundle bundle, ProdManagerListener prodManagerListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d19fc4dc", new Object[]{this, str, bundle, prodManagerListener});
        } else {
            a(str, "", "", bundle, prodManagerListener);
        }
    }

    private void a(final String str, final String str2, final String str3, final Bundle bundle, final ProdManagerListener prodManagerListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a545231", new Object[]{this, str, str2, str3, bundle, prodManagerListener});
            return;
        }
        final Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prod.manager.engine.ProductManagerEngine.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    MicroModuleContext.getInstance().showProgressProDialog("");
                    MICProdmngRequest mICProdmngRequest = new MICProdmngRequest();
                    mICProdmngRequest.token = str;
                    mICProdmngRequest.module = str2;
                    mICProdmngRequest.action = str3;
                    Map<String, Object> baseEnvData = EnvInfoUtil.getBaseEnvData();
                    baseEnvData.put(ModuleConstants.VI_MODULE_BIO_METAINFO, EnvInfoUtil.getBioMetaInfo());
                    mICProdmngRequest.envData = baseEnvData;
                    mICProdmngRequest.params = new HashMap();
                    for (String str4 : bundle2.keySet()) {
                        mICProdmngRequest.params.put(str4, bundle2.get(str4));
                    }
                    ProductManagerEngine.a(ProductManagerEngine.this, new MICRpcServiceBiz().prodmng(mICProdmngRequest), str, bundle, prodManagerListener);
                    MicroModuleContext.getInstance().dismissProgressDialog();
                } catch (RpcException unused) {
                    VerifyLogCat.i(ProductManagerEngine.a(), "RPC异常");
                    MicroModuleContext.getInstance().dismissProgressDialog();
                    if (!"true".equalsIgnoreCase(ProductManagerEngine.a(ProductManagerEngine.this))) {
                        ProductManagerEngine.b(ProductManagerEngine.this);
                    }
                    ProductManagerEngine.a(ProductManagerEngine.this, str, prodManagerListener);
                }
            }
        }, "getNextStep");
    }

    private static void a(String str, Map<String, String> map, String str2, Map<String, String> map2, Bundle bundle, ProdManagerListener prodManagerListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a0c4333", new Object[]{str, map, str2, map2, bundle, prodManagerListener});
            return;
        }
        String str3 = f5941a;
        VerifyLogCat.i(str3, "启动对应产品管理类:" + str2);
        String str4 = map.get("module");
        String str5 = map.get("action");
        BaseProdManager a2 = a(str4);
        if (a2 != null) {
            a2.mName = str4;
            a2.create(str, str5, str2, JSON.toJSONString(map2), JSON.toJSONString(map), bundle, prodManagerListener);
            return;
        }
        a(str, "1002", prodManagerListener);
        VerifyLogCat.i(f5941a, "启动产品管理类异常");
    }

    private static BaseProdManager a(String str) {
        String str2 = ProdManagerMetaInfo.f5940a.get(str);
        try {
            Class<?> cls = Class.forName(str2);
            return (BaseProdManager) (cls != null ? cls.newInstance() : null);
        } catch (Throwable th) {
            String str3 = f5941a;
            VerifyLogCat.e(str3, "Fail to load " + str2, th);
            return null;
        }
    }

    private static void a(String str, String str2, ProdManagerListener prodManagerListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a2159c3", new Object[]{str, str2, prodManagerListener});
        } else {
            a(str, str2, "", prodManagerListener);
        }
    }

    private static void a(String str, String str2, String str3, ProdManagerListener prodManagerListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8beae5b9", new Object[]{str, str2, str3, prodManagerListener});
        } else if (prodManagerListener == null) {
            VerifyLogCat.i(f5941a, "调用方没有传入回调，放弃回调");
        } else {
            ProdManagerResult prodManagerResult = new ProdManagerResult(str2);
            if (!TextUtils.isEmpty(str3)) {
                prodManagerResult.setMessage(str3);
            }
            prodManagerListener.onResult(str, prodManagerResult);
        }
    }

    private static void a(String str, String str2, RecommendBioListener recommendBioListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8934183", new Object[]{str, str2, recommendBioListener});
        } else if (recommendBioListener == null) {
            VerifyLogCat.i(f5941a, "调用方没有传入回调，放弃回调");
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", (Object) str2);
            jSONObject.put("result", (Object) str);
            recommendBioListener.onResult(jSONObject.toJSONString());
        }
    }

    private void a(MICProdmngResponse mICProdmngResponse, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71c1b2e0", new Object[]{this, mICProdmngResponse, str, str2});
        } else if ("true".equalsIgnoreCase(this.f)) {
            a("UC-MobileIC-20180315-3", String.valueOf(mICProdmngResponse.success), mICProdmngResponse.code, mICProdmngResponse.finishCode, str, str2);
        } else {
            a("UC-MobileIC-20180315-2", String.valueOf(mICProdmngResponse.success), mICProdmngResponse.code, mICProdmngResponse.finishCode, str, str2);
        }
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            MicroModuleContext.getInstance().toast("网络不给力", R.drawable.warning, 0);
        }
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else {
            MicroModuleContext.getInstance().toast("系统正忙，稍后再试", R.drawable.warning, 0);
        }
    }

    private static void a(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2562e1a4", new Object[]{str, str2, str3, str4, str5, str6});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("success", str2);
        hashMap.put("code", str3);
        hashMap.put(MspFlybirdDefine.FLYBIRD_VIDATA_FINISH_CODE, str4);
        hashMap.put("sceneId", str5);
        hashMap.put(rrv.PRODUCT_ID, str6);
        VerifyLogger.getInstance().eventBehavior(str, "", "", "", hashMap);
    }

    public boolean isDoubleClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f3d16b8", new Object[]{this})).booleanValue();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.g;
        if (0 < j && j < 1000) {
            return true;
        }
        this.g = elapsedRealtime;
        return false;
    }

    public static /* synthetic */ void a(ProductManagerEngine productManagerEngine, MICProdmngResponse mICProdmngResponse, String str, Bundle bundle, ProdManagerListener prodManagerListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd67f285", new Object[]{productManagerEngine, mICProdmngResponse, str, bundle, prodManagerListener});
            return;
        }
        String str2 = f5941a;
        VerifyLogCat.i(str2, "bio response code:" + mICProdmngResponse.code + ", success:" + mICProdmngResponse.success + "，message:" + mICProdmngResponse.message + ",token:" + mICProdmngResponse.token);
        productManagerEngine.f = bundle.getString("forbidUI");
        String string = bundle.getString("sceneId");
        String string2 = bundle.getString(rrv.PRODUCT_ID);
        if (mICProdmngResponse == null) {
            if (!"true".equalsIgnoreCase(productManagerEngine.f)) {
                b();
            }
            a(str, "2003", prodManagerListener);
            return;
        }
        Map<String, String> map = mICProdmngResponse.nextStep;
        if (!mICProdmngResponse.success) {
            if (mICProdmngResponse.finish && c.equalsIgnoreCase(mICProdmngResponse.code)) {
                VerifyLogCat.i(f5941a, "系统异常");
                if (!"true".equalsIgnoreCase(productManagerEngine.f)) {
                    c();
                }
                productManagerEngine.a(mICProdmngResponse, string, string2);
                a(str, "1001", prodManagerListener);
            } else if (!mICProdmngResponse.finish && "FACE_REGISTER_ERROR_CODE".equalsIgnoreCase(mICProdmngResponse.code)) {
                VerifyLogCat.i(f5941a, "人脸开通错误");
                productManagerEngine.a(mICProdmngResponse, string, string2);
                a(str, a.FCANVAS_ERROR_OPEN_GL, mICProdmngResponse.message, prodManagerListener);
            } else if (!mICProdmngResponse.finish && d.equalsIgnoreCase(mICProdmngResponse.code)) {
                VerifyLogCat.i(f5941a, "未录入生物特征");
                a(mICProdmngResponse.token, map, mICProdmngResponse.code, mICProdmngResponse.data, bundle, prodManagerListener);
            } else if (!mICProdmngResponse.finish && e.equalsIgnoreCase(mICProdmngResponse.code)) {
                VerifyLogCat.i(f5941a, "未安装生物服务");
                a(mICProdmngResponse.token, map, mICProdmngResponse.code, mICProdmngResponse.data, bundle, prodManagerListener);
            } else if (mICProdmngResponse.finish && "2001".equalsIgnoreCase(mICProdmngResponse.finishCode)) {
                a(mICProdmngResponse.token, map, mICProdmngResponse.code, mICProdmngResponse.data, bundle, prodManagerListener);
            } else {
                VerifyLogCat.i(f5941a, "系统异常");
                if (!"true".equalsIgnoreCase(productManagerEngine.f)) {
                    c();
                }
                productManagerEngine.a(mICProdmngResponse, string, string2);
                a(str, "1001", prodManagerListener);
            }
        } else if (!mICProdmngResponse.finish) {
            if (map == null || map.isEmpty()) {
                VerifyLogCat.i(f5941a, "nextStep为空");
                if (!"true".equalsIgnoreCase(productManagerEngine.f)) {
                    c();
                }
                productManagerEngine.a(mICProdmngResponse, string, string2);
                a(str, "1001", prodManagerListener);
                return;
            }
            String str3 = f5941a;
            VerifyLogCat.i(str3, "startProManager:" + mICProdmngResponse.code);
            a(mICProdmngResponse.token, map, mICProdmngResponse.code, mICProdmngResponse.data, bundle, prodManagerListener);
        } else if (!mICProdmngResponse.finish) {
        } else {
            VerifyLogCat.i(f5941a, "重复开通");
            if ("1000".equalsIgnoreCase(mICProdmngResponse.finishCode)) {
                productManagerEngine.a(mICProdmngResponse, string, string2);
                a(str, "1000", prodManagerListener);
                return;
            }
            if (!"true".equalsIgnoreCase(productManagerEngine.f)) {
                c();
            }
            productManagerEngine.a(mICProdmngResponse, string, string2);
            a(str, "1001", prodManagerListener);
        }
    }

    public static /* synthetic */ void a(ProductManagerEngine productManagerEngine, String str, ProdManagerListener prodManagerListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81f2d351", new Object[]{productManagerEngine, str, prodManagerListener});
        } else {
            a(str, "2003", prodManagerListener);
        }
    }
}
