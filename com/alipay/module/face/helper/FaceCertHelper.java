package com.alipay.module.face.helper;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.bio.api.BioCallback;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.alipay.mobile.security.bio.api.BioDetectorBuilder;
import com.alipay.mobile.security.bio.api.BioParameter;
import com.alipay.mobile.security.bio.api.BioResponse;
import com.alipay.mobile.security.zim.api.ZIMCallback;
import com.alipay.mobile.security.zim.api.ZIMFacade;
import com.alipay.mobile.security.zim.api.ZIMFacadeBuilder;
import com.alipay.mobile.security.zim.api.ZIMResponse;
import com.alipay.mobile.security.zim.biz.ZimPlatform;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.data.ModuleExecuteResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.info.AppInfo;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.alipay.mobileic.core.model.rpc.MICRpcRequest;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.alipay.module.common.FaceDetectUtils;
import com.alipay.module.face.proxy.BioDetectorProxy;
import com.alipay.module.face.proxy.ZIMFacadeProxy;
import com.alipay.zoloz.toyger.ToygerBaseService;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class FaceCertHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f6115a;
    public String b;
    public String c;
    public MicroModule d;
    public Bundle e;
    public String g;
    private ZIMFacade l;
    private boolean m;
    public AtomicBoolean f = new AtomicBoolean(false);
    private Handler j = new Handler(Looper.getMainLooper());
    private BioDetector k = null;
    public BioCallback h = new BioCallback() { // from class: com.alipay.module.face.helper.FaceCertHelper.1
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private AtomicBoolean b = new AtomicBoolean(false);

        @Override // com.alipay.mobile.security.bio.api.BioCallback
        public final void onResult(BioResponse bioResponse) {
            String jSONString;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af293cbe", new Object[]{this, bioResponse});
                return;
            }
            if (FaceCertHelper.a(FaceCertHelper.this) != null) {
                VerifyLogCat.w("FaceCertHelper", "调用BioDetector.destroy()");
                FaceCertHelper.a(FaceCertHelper.this).destroy();
                FaceCertHelper.b(FaceCertHelper.this);
            }
            if (this.b.getAndSet(true)) {
                VerifyLogCat.w("FaceCertHelper", "Bio has already callback and do nothing");
                HashMap hashMap = new HashMap();
                hashMap.put(CommonConstant.EXCEPTION_TYPE, "bio_face");
                hashMap.put(CommonConstant.EXCEPTION_INFO, "face_callback_twice");
                FaceCertHelper.a(FaceCertHelper.this, CommonConstant.EXCEPTION_CASE_ID, CommonConstant.EXCEPTION_BIZ, hashMap);
                return;
            }
            FaceCertHelper.b(FaceCertHelper.this, "UC-MobileIC-160316-2", "mdsdswkjhd", FaceCertHelper.a(bioResponse));
            if (bioResponse != null) {
                try {
                    jSONString = JSONObject.toJSONString(bioResponse);
                } catch (Throwable th) {
                    VerifyLogCat.e("FaceCertHelper", th);
                }
                VerifyLogCat.d("FaceCertHelper", "faceResult: " + jSONString);
                if (bioResponse != null || FaceCertHelper.c(FaceCertHelper.this) == null) {
                    VerifyLogCat.w("FaceCertHelper", "BioResponse or token is null");
                    MicroModuleContext.getInstance().notifyAndFinishModule(FaceCertHelper.d(FaceCertHelper.this), FaceCertHelper.c(FaceCertHelper.this), FaceCertHelper.e(FaceCertHelper.this).getModuleName(), new DefaultModuleResult("1006"));
                } else if (!bioResponse.isSuccess()) {
                    FaceCertHelper.a(FaceCertHelper.this, bioResponse);
                    return;
                } else {
                    FaceCertHelper.b(FaceCertHelper.this, bioResponse);
                    return;
                }
            }
            jSONString = "";
            VerifyLogCat.d("FaceCertHelper", "faceResult: " + jSONString);
            if (bioResponse != null) {
            }
            VerifyLogCat.w("FaceCertHelper", "BioResponse or token is null");
            MicroModuleContext.getInstance().notifyAndFinishModule(FaceCertHelper.d(FaceCertHelper.this), FaceCertHelper.c(FaceCertHelper.this), FaceCertHelper.e(FaceCertHelper.this).getModuleName(), new DefaultModuleResult("1006"));
        }
    };
    public ZIMCallback i = new VIZIMCallback(this);

    public static /* synthetic */ BioDetector a(FaceCertHelper faceCertHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BioDetector) ipChange.ipc$dispatch("f0dd917f", new Object[]{faceCertHelper}) : faceCertHelper.k;
    }

    public static /* synthetic */ void a(FaceCertHelper faceCertHelper, String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d5449a4", new Object[]{faceCertHelper, str, str2, map});
        } else {
            faceCertHelper.b(str, str2, map);
        }
    }

    public static /* synthetic */ BioDetector b(FaceCertHelper faceCertHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BioDetector) ipChange.ipc$dispatch("b80cdd9e", new Object[]{faceCertHelper});
        }
        faceCertHelper.k = null;
        return null;
    }

    public static /* synthetic */ void b(FaceCertHelper faceCertHelper, BioResponse bioResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1433b849", new Object[]{faceCertHelper, bioResponse});
        } else {
            faceCertHelper.a(bioResponse, true);
        }
    }

    public static /* synthetic */ void b(FaceCertHelper faceCertHelper, String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b26e43", new Object[]{faceCertHelper, str, str2, map});
        } else {
            faceCertHelper.a(str, str2, map);
        }
    }

    public static /* synthetic */ String c(FaceCertHelper faceCertHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("95fb37d1", new Object[]{faceCertHelper}) : faceCertHelper.b;
    }

    public static /* synthetic */ void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else {
            d();
        }
    }

    public static /* synthetic */ String d(FaceCertHelper faceCertHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("32693430", new Object[]{faceCertHelper}) : faceCertHelper.f6115a;
    }

    public static /* synthetic */ MicroModule e(FaceCertHelper faceCertHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("8328573", new Object[]{faceCertHelper}) : faceCertHelper.d;
    }

    public static /* synthetic */ ZIMFacade f(FaceCertHelper faceCertHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ZIMFacade) ipChange.ipc$dispatch("afbac15a", new Object[]{faceCertHelper}) : faceCertHelper.l;
    }

    public FaceCertHelper(MicroModule microModule, String str, String str2, String str3, Bundle bundle) {
        VerifyLogCat.d("FaceCertHelper", "FaceCertHelper onCreate");
        this.d = microModule;
        this.f6115a = str;
        if (str.endsWith("_site")) {
            this.m = true;
        } else {
            this.m = false;
        }
        this.b = str2;
        this.c = str3;
        this.e = bundle;
        if (this.e == null) {
            this.e = new Bundle();
        }
    }

    public final void a() {
        String str;
        String str2;
        String str3 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        VerifyLogCat.d("FaceCertHelper", "FaceCertHelper onStart");
        if (TextUtils.isEmpty(this.c)) {
            VerifyLogCat.w("FaceCertHelper", "mModuleData is empty");
            MicroModuleContext.getInstance().notifyAndFinishModule(this.f6115a, this.b, this.d.getModuleName(), new DefaultModuleResult("2002"));
            return;
        }
        String str4 = null;
        b("UC-MobileIC-151016-01", "mdhxdyrl", null);
        JSONObject parseObject = JSON.parseObject(this.c);
        if (parseObject != null) {
            String string = parseObject.getString("zimId");
            String string2 = parseObject.getString("useZim");
            str2 = parseObject.getString("popupErrMsg");
            this.g = parseObject.getString("desensName");
            str = string;
            str4 = string2;
        } else {
            str = null;
            str2 = null;
        }
        Bundle bundle = new Bundle(this.e);
        this.e.putString("useZim", str4);
        this.e.putString("popupErrMsg", str2);
        if ("Y".equalsIgnoreCase(str4)) {
            new HashMap().put("zimId", str);
            VerifyLogCat.i("FaceCertHelper", "本次走佐罗人脸，zimId：" + str);
            this.e.putString("zimId", str);
            this.e.putString("desensName", this.g);
            ZIMFacade.install(MicroModuleContext.getInstance().getContext());
            HashMap hashMap = new HashMap();
            for (String str5 : parseObject.keySet()) {
                hashMap.put(str5, parseObject.getString(str5));
            }
            hashMap.put(ZIMFacade.KEY_AUTO_CLOSE, "false");
            if (this.m) {
                hashMap.put(ZimPlatform.KYE_REMOTESERVER, "iPay");
            }
            if (this.l == null) {
                this.l = ZIMFacadeBuilder.create(MicroModuleContext.getInstance().getContext());
            }
            for (String str6 : bundle.keySet()) {
                hashMap.put(str6, bundle.getString(str6));
            }
            new ZIMFacadeProxy(this.l).verify(str, hashMap, this.i);
            return;
        }
        Bundle bundle2 = new Bundle();
        try {
            String apdid = AppInfo.getInstance().getApdid();
            bundle2.putAll(this.e);
            if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.noOthersOnFace))) {
                JSONObject parseObject2 = JSON.parseObject(this.c);
                parseObject2.remove(BioDetector.EXT_KEY_HAS_OTHERS);
                this.c = parseObject2.toJSONString();
            }
            bundle2.putString(BioDetector.EXT_KEY_MODULE_DATA_BUNDLE, this.c);
            bundle2.putString("verifyid", TextUtils.isEmpty(this.f6115a) ? str3 : this.f6115a);
            if (TextUtils.isEmpty(apdid)) {
                apdid = str3;
            }
            bundle2.putString("APDID", apdid);
            bundle2.putString("TOKEN_ID", TextUtils.isEmpty(this.b) ? str3 : this.b);
        } catch (Exception e) {
            VerifyLogCat.e("FaceCertHelper", e);
        }
        this.k = BioDetectorBuilder.create(this.d.getMicroModuleContext().getContext(), new com.alipay.mobile.security.bio.module.MicroModule());
        VerifyLogCat.i("FaceCertHelper", "start AP_ACTION");
        BioParameter bioParameter = new BioParameter();
        bioParameter.setAutoClose(false);
        bioParameter.setBundle(bundle2);
        String string3 = this.e.getString(ToygerBaseService.KEY_PUBLIC_KEY);
        if (!TextUtils.isEmpty(string3)) {
            str3 = string3;
        }
        bioParameter.addExtProperty(ToygerBaseService.KEY_PUBLIC_KEY, str3);
        new BioDetectorProxy(this.k).auth(bioParameter, this.h);
    }

    private void a(final BioResponse bioResponse, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a51571", new Object[]{this, bioResponse, new Boolean(z)});
        } else {
            this.j.postDelayed(new Runnable() { // from class: com.alipay.module.face.helper.FaceCertHelper.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FaceRpcRunnable faceRpcRunnable = new FaceRpcRunnable(bioResponse, FaceCertHelper.d(FaceCertHelper.this), FaceCertHelper.c(FaceCertHelper.this), FaceCertHelper.e(FaceCertHelper.this).getModuleName(), bioResponse.getToken(), FaceCertHelper.this.e, z, FaceCertHelper.e(FaceCertHelper.this));
                    faceRpcRunnable.f6123a = FaceCertHelper.f(FaceCertHelper.this);
                    AsyncTaskExecutor.getInstance().execute(faceRpcRunnable, "BioCallbak");
                }
            }, 500L);
        }
    }

    public final void a(final ZIMResponse zIMResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243e4817", new Object[]{this, zIMResponse});
        } else {
            this.j.post(new Runnable() { // from class: com.alipay.module.face.helper.FaceCertHelper.3
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final /* synthetic */ boolean b = true;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FaceRpcRunnable faceRpcRunnable = new FaceRpcRunnable(zIMResponse, FaceCertHelper.d(FaceCertHelper.this), FaceCertHelper.c(FaceCertHelper.this), FaceCertHelper.e(FaceCertHelper.this).getModuleName(), "", FaceCertHelper.this.e, this.b, FaceCertHelper.e(FaceCertHelper.this));
                    faceRpcRunnable.f6123a = FaceCertHelper.f(FaceCertHelper.this);
                    AsyncTaskExecutor.getInstance().execute(faceRpcRunnable, "BioCallbak");
                }
            });
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        VerifyLogCat.i("FaceCertHelper", "选择了其他方式");
        MicroModuleContext.getInstance().showProgressDialog("");
        HashMap hashMap = new HashMap();
        hashMap.put("module", this.d.getModuleName());
        b("UC-MobileIC-20191118-01", "mdhxdyrl", hashMap);
        AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.module.face.helper.FaceCertHelper.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    MICRpcRequest mICRpcRequest = new MICRpcRequest();
                    mICRpcRequest.verifyId = FaceCertHelper.e(FaceCertHelper.this).getVerifyId();
                    mICRpcRequest.token = FaceCertHelper.e(FaceCertHelper.this).getToken();
                    mICRpcRequest.module = ModuleConstants.VI_MODULE_MENU;
                    MICRpcResponse dispatch = new MICRpcServiceBiz().dispatch(mICRpcRequest);
                    MicroModuleContext.getInstance().dismissProgressDialog();
                    if (dispatch == null || !dispatch.success) {
                        FaceCertHelper.g(FaceCertHelper.this);
                        return;
                    }
                    ModuleExecuteResult moduleExecuteResult = new ModuleExecuteResult();
                    dispatch.finishCode = "1002";
                    moduleExecuteResult.setMICRpcResponse(dispatch);
                    MicroModuleContext.getInstance().notifyAndFinishModule(FaceCertHelper.e(FaceCertHelper.this).getVerifyId(), FaceCertHelper.e(FaceCertHelper.this).getToken(), FaceCertHelper.e(FaceCertHelper.this).getModuleName(), moduleExecuteResult);
                    try {
                        Thread.sleep(500L);
                    } catch (Exception unused) {
                    }
                    FaceCertHelper.c();
                } catch (RpcException unused2) {
                    MicroModuleContext.getInstance().dismissProgressDialog();
                    FaceCertHelper.g(FaceCertHelper.this);
                }
            }
        }, "goOtherVerifyProduct");
    }

    private static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        try {
            VerifyLogCat.i("FaceCertHelper", "立刻关闭人脸");
            BioDetector create = BioDetectorBuilder.create(MicroModuleContext.getInstance().getContext(), new com.alipay.mobile.security.bio.module.MicroModule());
            create.command(4099);
            create.destroy();
        } catch (Throwable th) {
            VerifyLogCat.e("FaceCertHelper", "关闭人脸时出错！", th);
        }
    }

    private void b(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{this, str, str2, map});
        } else {
            VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str, Constants.VI_ENGINE_APPID, str2, this.b, this.f6115a, null, map);
        }
    }

    public final void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
        } else {
            VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str, Constants.VI_ENGINE_APPID, str2, this.b, this.f6115a, null, map, 1);
        }
    }

    public static /* synthetic */ HashMap a(BioResponse bioResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("b7ec066", new Object[]{bioResponse});
        }
        if (bioResponse == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isSuccess", String.valueOf(bioResponse.isSuccess()));
        hashMap.put("result", String.valueOf(bioResponse.getResult()));
        hashMap.put("tag", bioResponse.getTag());
        hashMap.put("token", bioResponse.getToken());
        hashMap.put("resultMessage", bioResponse.getResultMessage());
        return hashMap;
    }

    public static /* synthetic */ void a(FaceCertHelper faceCertHelper, BioResponse bioResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5798088", new Object[]{faceCertHelper, bioResponse});
        } else if (303 == bioResponse.getResult()) {
            faceCertHelper.b();
        } else {
            DefaultModuleResult defaultModuleResult = new DefaultModuleResult((104 == bioResponse.getResult() || 201 == bioResponse.getResult() || 204 == bioResponse.getResult() || 206 == bioResponse.getResult()) ? "1006" : "1003");
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("faceResult", Integer.valueOf(bioResponse.getResult()));
            hashMap.put("faceMemo", FaceDetectUtils.a(bioResponse.getResult()));
            if (bioResponse.getExt() != null) {
                hashMap.putAll(bioResponse.getExt());
            }
            defaultModuleResult.setExtInfo(hashMap);
            VerifyLogCat.i("FaceCertHelper", "response.isSuccess() = false");
            MicroModuleContext.getInstance().notifyAndFinishModule(faceCertHelper.f6115a, faceCertHelper.b, faceCertHelper.d.getModuleName(), defaultModuleResult);
            if (300 == bioResponse.getResult() || 208 == bioResponse.getResult() || 209 == bioResponse.getResult()) {
                faceCertHelper.a(bioResponse, false);
            }
            if (301 == bioResponse.getResult()) {
                return;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put(CommonConstant.EXCEPTION_TYPE, "bio_face");
            hashMap2.put(CommonConstant.EXCEPTION_INFO, String.valueOf(bioResponse.getResult()));
            faceCertHelper.b(CommonConstant.EXCEPTION_CASE_ID, CommonConstant.EXCEPTION_BIZ, hashMap2);
        }
    }

    public static /* synthetic */ void g(FaceCertHelper faceCertHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("780ec7b3", new Object[]{faceCertHelper});
        } else if (faceCertHelper.d.getTask().getPluginOrProxyMode()) {
            faceCertHelper.j.postDelayed(new Runnable() { // from class: com.alipay.module.face.helper.FaceCertHelper.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        FaceCertHelper.h(FaceCertHelper.this);
                    }
                }
            }, 500L);
        } else {
            MicroModuleContext.getInstance().alert(null, MicroModuleContext.getInstance().getContext().getResources().getString(R.string.vi_network_unavailable), MicroModuleContext.getInstance().getContext().getResources().getString(R.string.retry), new DialogInterface.OnClickListener() { // from class: com.alipay.module.face.helper.FaceCertHelper.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        FaceCertHelper.this.b();
                    }
                }
            }, MicroModuleContext.getInstance().getContext().getResources().getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: com.alipay.module.face.helper.FaceCertHelper.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        FaceCertHelper.h(FaceCertHelper.this);
                    }
                }
            });
        }
    }

    public static /* synthetic */ void h(FaceCertHelper faceCertHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb99e574", new Object[]{faceCertHelper});
            return;
        }
        MicroModuleContext.getInstance().notifyAndFinishModule(faceCertHelper.f6115a, faceCertHelper.b, faceCertHelper.d.getModuleName(), new DefaultModuleResult("1003"));
        d();
    }
}
