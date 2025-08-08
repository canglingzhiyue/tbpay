package com.alipay.mobile.verifyidentity.prodmanger.biopen.handler;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.log.behavior.VerifyLogger;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.callback.BioCheckCallback;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.callback.VerifyCheckCallback;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.helper.BioOpenHelper;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.utils.BioCheckManager;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.alipay.mobileic.core.model.rpc.MICProdmngResponse;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.util.InstallServiceCallback;
import com.alipay.security.mobile.api.AuthenticatorApi;
import com.alipay.security.mobile.auth.AuthenticatorCallback;
import com.alipay.security.mobile.auth.IAuthenticator;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.util.ErrorConstant;
import tb.rrv;

/* loaded from: classes3.dex */
public class BioOpenHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static String f5956a = "com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler";
    private AuthenticatorManager b;
    private BioCheckManager c;
    private String d;
    private String e;
    private String f;
    private String g;
    private BioOpenCallback h;
    private Context i;

    /* loaded from: classes3.dex */
    public interface BioOpenCallback {
        void a(String str, boolean z);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f5956a;
    }

    public static /* synthetic */ String a(BioOpenHandler bioOpenHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ebd0f9e6", new Object[]{bioOpenHandler}) : bioOpenHandler.d;
    }

    public static /* synthetic */ String a(BioOpenHandler bioOpenHandler, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dcbed7dc", new Object[]{bioOpenHandler, str}) : bioOpenHandler.a(str);
    }

    public static /* synthetic */ void a(BioOpenHandler bioOpenHandler, int i, String str, String str2, String str3, String str4, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba811c3", new Object[]{bioOpenHandler, new Integer(i), str, str2, str3, str4, bundle});
        } else {
            bioOpenHandler.a(i, str, str2, str3, str4, bundle);
        }
    }

    public static /* synthetic */ void a(BioOpenHandler bioOpenHandler, String str, String str2, String str3, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98e3657c", new Object[]{bioOpenHandler, str, str2, str3, bundle});
        } else {
            bioOpenHandler.a(str, str2, str3, bundle);
        }
    }

    public static /* synthetic */ void a(BioOpenHandler bioOpenHandler, String str, String str2, String str3, Map map, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ca3a387", new Object[]{bioOpenHandler, str, str2, str3, map, bundle});
        } else {
            bioOpenHandler.a(str, str2, str3, map, bundle);
        }
    }

    public static /* synthetic */ void a(BioOpenHandler bioOpenHandler, String str, Map map, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8588573", new Object[]{bioOpenHandler, str, map, bundle});
        } else {
            bioOpenHandler.a(str, map, bundle);
        }
    }

    public static /* synthetic */ void a(BioOpenHandler bioOpenHandler, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ecb8e10", new Object[]{bioOpenHandler, str, new Boolean(z)});
        } else {
            bioOpenHandler.a(str, z);
        }
    }

    public static /* synthetic */ String b(BioOpenHandler bioOpenHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1b882de7", new Object[]{bioOpenHandler}) : bioOpenHandler.f;
    }

    public static /* synthetic */ void b(BioOpenHandler bioOpenHandler, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa3e1963", new Object[]{bioOpenHandler, str});
        } else {
            bioOpenHandler.b(str, false);
        }
    }

    public static /* synthetic */ AuthenticatorManager c(BioOpenHandler bioOpenHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AuthenticatorManager) ipChange.ipc$dispatch("1e4bc286", new Object[]{bioOpenHandler}) : bioOpenHandler.b;
    }

    public static /* synthetic */ BioCheckManager d(BioOpenHandler bioOpenHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BioCheckManager) ipChange.ipc$dispatch("b89ef3c1", new Object[]{bioOpenHandler}) : bioOpenHandler.c;
    }

    public static /* synthetic */ String e(BioOpenHandler bioOpenHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aaadc9ea", new Object[]{bioOpenHandler}) : bioOpenHandler.e;
    }

    public final void a(Context context, Bundle bundle, BioOpenCallback bioOpenCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4395dc7b", new Object[]{this, context, bundle, bioOpenCallback});
            return;
        }
        this.i = context;
        this.h = bioOpenCallback;
        this.b = AuthenticatorManager.getInstance(this.i);
        this.c = new BioCheckManager(this.i);
        if (bundle == null) {
            return;
        }
        String string = bundle.getString("action");
        if (!"REGISTER_BIO_SUBMIT".equalsIgnoreCase(string)) {
            String string2 = bundle.getString("module");
            String string3 = bundle.getString("token");
            final Bundle bundle2 = bundle.getBundle("extParams");
            this.d = bundle.getString(rrv.PRODUCT_ID);
            if (bundle2 != null) {
                this.e = bundle2.getString("sceneId");
                bundle2.putString(rrv.PRODUCT_ID, this.d);
            }
            if ("open".equalsIgnoreCase(bundle.getString("status"))) {
                BioOpenHelper.doBioRpcRequest(string3, string2, string, bundle2, new BioOpenHelper.RpcCallBack() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.helper.BioOpenHelper.RpcCallBack
                    public final void onResult(String str, String str2, String str3, boolean z, MICProdmngResponse mICProdmngResponse) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("c40fbbe1", new Object[]{this, str, str2, str3, new Boolean(z), mICProdmngResponse});
                        } else if (mICProdmngResponse == null) {
                            BioOpenHandler.a(BioOpenHandler.this, "2003", true);
                        } else if ("1000".equalsIgnoreCase(str3)) {
                            if (CommonConstant.FACELOGIN.equalsIgnoreCase(BioOpenHandler.a(BioOpenHandler.this))) {
                                BioOpenHandler.a(BioOpenHandler.this, str, mICProdmngResponse.nextStep, bundle2);
                            } else {
                                BioOpenHandler.a(BioOpenHandler.this, mICProdmngResponse.token, mICProdmngResponse.code, BioOpenHandler.a(BioOpenHandler.this, JSON.toJSONString(mICProdmngResponse.data)), mICProdmngResponse.nextStep, bundle2);
                            }
                        } else if ("1004".equalsIgnoreCase(str3)) {
                            BioOpenHandler.b(BioOpenHandler.this, "OPEN_SUCCESS");
                        } else {
                            BioOpenHandler.a(BioOpenHandler.this, str3, z);
                        }
                    }
                });
                return;
            } else if (!"close".equalsIgnoreCase(bundle.getString("status"))) {
                return;
            } else {
                a(string3, string2, string, bundle2);
                return;
            }
        }
        VerifyLogCat.i(f5956a, "无UI模式，进行生物校验");
        Bundle bundle3 = bundle.getBundle("extParams");
        String string4 = bundle.getString("module");
        String string5 = bundle.getString("token");
        String string6 = bundle.getString("code");
        HashMap hashMap = new HashMap();
        this.f = bundle.getString(aw.PARAM_PRODUCT_TYPE);
        String string7 = bundle.getString(Constants.VI_ENGINE_FAST_MODULENAME);
        if (!StringUtils.isEmpty(string7)) {
            try {
                JSONObject parseObject = JSON.parseObject(string7);
                if (parseObject != null) {
                    for (String str : parseObject.keySet()) {
                        hashMap.put(str, parseObject.getString(str));
                    }
                }
            } catch (Exception unused) {
                VerifyLogCat.e(f5956a, "json fail");
                a("1005", true);
            }
        }
        if (bundle3 != null) {
            this.d = bundle3.getString(rrv.PRODUCT_ID);
            this.g = bundle3.getString("forbidUI");
            this.e = bundle3.getString("sceneId");
            bundle3.putString(aw.PARAM_PRODUCT_TYPE, this.f);
        }
        if ("BIC".equalsIgnoreCase(string4)) {
            a(string5, string6, bundle.getString("registerCommand"), hashMap, bundle3);
        } else if ("BIS".equalsIgnoreCase(string4)) {
            a(string5, hashMap, bundle3);
        }
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        try {
            JSONObject jSONObject = JSON.parseObject(str).getJSONObject("pageModel");
            if (jSONObject == null) {
                return "";
            }
            String string = jSONObject.getString("registerCommand");
            this.f = jSONObject.getString(aw.PARAM_PRODUCT_TYPE);
            String str2 = f5956a;
            VerifyLogCat.i(str2, "registerCommand:" + string);
            return string;
        } catch (Exception unused) {
            a("1005", true);
            VerifyLogCat.e(f5956a, "json fail");
            return null;
        }
    }

    private void a(final String str, String str2, final String str3, final Map<String, String> map, final Bundle bundle) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acd547f5", new Object[]{this, str, str2, str3, map, bundle});
        } else if ("not_install_ifaa".equalsIgnoreCase(str2)) {
            VerifyLogCat.i(f5956a, "未安装服务");
            String string2 = bundle.getString("alertText");
            Bundle bundle2 = new Bundle();
            if (StringUtils.isEmpty(string2)) {
                if ("1".equalsIgnoreCase(this.f)) {
                    string2 = MicroModuleContext.getInstance().getContext().getResources().getString(R.string.finger_guide_not_install);
                } else if ("4".equalsIgnoreCase(this.f)) {
                    string2 = MicroModuleContext.getInstance().getContext().getResources().getString(R.string.face_guide_not_install);
                }
            }
            bundle2.putBoolean(CommonConstant.alertTextColor, true);
            MicroModuleContext.getInstance().alert(null, string2, MicroModuleContext.getInstance().getContext().getResources().getString(R.string.finger_install), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    AuthenticatorManager.getInstance(MicroModuleContext.getInstance().getContext()).downloadIfaaService(MicroModuleContext.getInstance().getContext(), new InstallServiceCallback() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.5.1
                        public final void onFinish() {
                            VerifyLogCat.i(BioOpenHandler.a(), "detail download ifaa finish");
                        }

                        public final void onFailed() {
                            VerifyLogCat.i(BioOpenHandler.a(), "detail download ifaa failed");
                        }

                        public final void onCancel() {
                            VerifyLogCat.i(BioOpenHandler.a(), "detail download ifaa cancel");
                        }
                    });
                    BioOpenHandler.a(BioOpenHandler.this, "1003", false);
                }
            }, MicroModuleContext.getInstance().getContext().getResources().getString(R.string.finger_cancel), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        BioOpenHandler.a(BioOpenHandler.this, "1003", true);
                    }
                }
            }, bundle2);
        } else if ("not_exist_bic_feature".equalsIgnoreCase(str2)) {
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean(CommonConstant.alertTextColor, true);
            if (CommonConstant.FINGERPRINT_PAY.equalsIgnoreCase(this.d)) {
                string = MicroModuleContext.getInstance().getContext().getResources().getString(R.string.finger_guide_print);
            } else {
                string = CommonConstant.FACEID_PAY.equalsIgnoreCase(this.d) ? MicroModuleContext.getInstance().getContext().getResources().getString(R.string.face_guide_print) : "";
            }
            MicroModuleContext.getInstance().alert(null, string, MicroModuleContext.getInstance().getContext().getResources().getString(R.string.finger_register), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    BioOpenHandler.c(BioOpenHandler.this).startBioManager(Integer.valueOf(BioOpenHandler.b(BioOpenHandler.this)).intValue());
                    BioOpenHandler.a(BioOpenHandler.this, "RETRY_FINNGER", true);
                    BioOpenHandler.a(BioOpenHandler.this, "UC-MobileIC-20180315-5", "1");
                }
            }, MicroModuleContext.getInstance().getContext().getResources().getString(R.string.finger_cancel), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    VerifyLogCat.i(BioOpenHandler.a(), "cancel");
                    BioOpenHandler.a(BioOpenHandler.this, "1003", true);
                    BioOpenHandler.a(BioOpenHandler.this, "UC-MobileIC-20180315-5", "0");
                }
            }, bundle3);
        } else if (CommonConstant.FINGERPRINT_PAY.equalsIgnoreCase(this.d)) {
            ((Activity) this.i).runOnUiThread(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (BioOpenHandler.d(BioOpenHandler.this) == null || StringUtils.isEmpty(BioOpenHandler.b(BioOpenHandler.this))) {
                        BioOpenHandler.a(BioOpenHandler.this, "1003", true);
                    } else {
                        BioCheckManager d = BioOpenHandler.d(BioOpenHandler.this);
                        Map map2 = map;
                        if (map2 != null) {
                            map2.get(Constants.VI_ENGINE_VERIFYID);
                        }
                        d.a(Integer.valueOf(BioOpenHandler.b(BioOpenHandler.this)).intValue(), str3, BioOpenHandler.e(BioOpenHandler.this), BioOpenHandler.a(BioOpenHandler.this), new BioCheckCallback() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.9.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.callback.BioCheckCallback
                            public final void onBioCheckResult(AuthenticatorResponse authenticatorResponse) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("51346624", new Object[]{this, authenticatorResponse});
                                } else if (authenticatorResponse == null || !"100".equalsIgnoreCase(String.valueOf(authenticatorResponse.getResult()))) {
                                    VerifyLogCat.i(BioOpenHandler.a(), "指纹校验取消/失败");
                                    BioOpenHandler.a(BioOpenHandler.this, "1003", true);
                                } else {
                                    if (authenticatorResponse.getData() != null && bundle != null) {
                                        bundle.putString("data", authenticatorResponse.getData());
                                    }
                                    BioOpenHandler.b(BioOpenHandler.this, str, map, bundle);
                                }
                            }
                        });
                    }
                }
            });
        } else if (CommonConstant.FACEID_PAY.equalsIgnoreCase(this.d)) {
            final String str4 = map.get("module");
            final String str5 = map.get("action");
            if (!StringUtils.isEmpty(map.get(Constants.VI_ENGINE_VERIFYID))) {
                final String str6 = map.get(Constants.VI_ENGINE_VERIFYID);
                String str7 = map.get("moduleData");
                VerifyLogCat.i(f5956a, "调起核身做密码校验");
                BioCheckManager bioCheckManager = this.c;
                if (bioCheckManager == null) {
                    return;
                }
                bioCheckManager.a(str6, str7, this.e, this.d, new VerifyCheckCallback() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.10
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.callback.VerifyCheckCallback
                    public final void a(VerifyIdentityResult verifyIdentityResult) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dca1d00", new Object[]{this, verifyIdentityResult});
                            return;
                        }
                        if (verifyIdentityResult != null) {
                            if ("1000".equalsIgnoreCase(verifyIdentityResult.getCode())) {
                                if (StringUtils.isEmpty(BioOpenHandler.b(BioOpenHandler.this))) {
                                    BioOpenHandler.a(BioOpenHandler.this, "1003", true);
                                    return;
                                }
                                BioOpenHandler bioOpenHandler = BioOpenHandler.this;
                                BioOpenHandler.a(bioOpenHandler, Integer.valueOf(BioOpenHandler.b(bioOpenHandler)).intValue(), str3, str, str4, str5, bundle);
                                return;
                            }
                            VerifyLogCat.i(BioOpenHandler.a(), "核身密码校验失败");
                        }
                        BioOpenHandler.a(BioOpenHandler.this, "1003", true);
                    }
                });
            } else if (!StringUtils.isEmpty(this.f)) {
                a(Integer.valueOf(this.f).intValue(), str3, str, str4, str5, bundle);
            } else {
                a("1003", true);
            }
        } else if (!CommonConstant.FACE_PAY.equalsIgnoreCase(this.d)) {
        } else {
            a(str, map, bundle);
        }
    }

    private void a(final String str, Map<String, String> map, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff12c8e1", new Object[]{this, str, map, bundle});
            return;
        }
        final String str2 = map.get("module");
        final String str3 = map.get("action");
        if (StringUtils.isEmpty(map.get(Constants.VI_ENGINE_VERIFYID))) {
            return;
        }
        String str4 = map.get(Constants.VI_ENGINE_VERIFYID);
        String str5 = map.get("moduleData");
        BioCheckManager bioCheckManager = this.c;
        if (bioCheckManager == null) {
            return;
        }
        bioCheckManager.a(str4, str5, this.e, this.d, new VerifyCheckCallback() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.callback.VerifyCheckCallback
            public final void a(VerifyIdentityResult verifyIdentityResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dca1d00", new Object[]{this, verifyIdentityResult});
                } else if (verifyIdentityResult == null) {
                    BioOpenHandler.a(BioOpenHandler.this, "1003", true);
                } else if ("1000".equalsIgnoreCase(verifyIdentityResult.getCode())) {
                    BioOpenHandler.a(BioOpenHandler.this, str, str2, str3, bundle);
                } else if ("2006".equalsIgnoreCase(verifyIdentityResult.getCode())) {
                    BioOpenHandler.a(BioOpenHandler.this, "2006", true);
                } else {
                    BioOpenHandler.a(BioOpenHandler.this, "1003", true);
                }
            }
        });
    }

    private void a(int i, String str, final String str2, final String str3, final String str4, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5875cf31", new Object[]{this, new Integer(i), str, str2, str3, str4, bundle});
            return;
        }
        BioCheckManager bioCheckManager = this.c;
        if (bioCheckManager == null) {
            return;
        }
        bioCheckManager.a(i, str, this.e, this.d, new BioCheckCallback() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.callback.BioCheckCallback
            public final void onBioCheckResult(AuthenticatorResponse authenticatorResponse) {
                Bundle bundle2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("51346624", new Object[]{this, authenticatorResponse});
                } else if (authenticatorResponse == null || !"100".equalsIgnoreCase(String.valueOf(authenticatorResponse.getResult()))) {
                    VerifyLogCat.i(BioOpenHandler.a(), "校验人脸失败");
                    BioOpenHandler.a(BioOpenHandler.this, "1003", true);
                } else if (authenticatorResponse.getData() == null || (bundle2 = bundle) == null) {
                } else {
                    bundle2.putString("data", authenticatorResponse.getData());
                    BioOpenHandler.a(BioOpenHandler.this, str2, str3, str4, bundle);
                }
            }
        });
    }

    private void a(String str, String str2, String str3, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b732ce", new Object[]{this, str, str2, str3, bundle});
        } else {
            BioOpenHelper.doBioRpcRequest(str, str2, str3, bundle, new BioOpenHelper.RpcCallBack() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.helper.BioOpenHelper.RpcCallBack
                public final void onResult(String str4, String str5, String str6, boolean z, MICProdmngResponse mICProdmngResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c40fbbe1", new Object[]{this, str4, str5, str6, new Boolean(z), mICProdmngResponse});
                    } else if (mICProdmngResponse == null) {
                        BioOpenHandler.a(BioOpenHandler.this, "2003", true);
                    } else if (!"1000".equalsIgnoreCase(str6)) {
                        BioOpenHandler.a(BioOpenHandler.this, str6, z);
                    } else {
                        BioOpenHandler.a(BioOpenHandler.this, mICProdmngResponse, str5);
                    }
                }
            });
        }
    }

    private void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else if ("true".equalsIgnoreCase(this.g)) {
            if ("RPC_EXCEPTION".equalsIgnoreCase(str)) {
                b("2003", false);
                return;
            }
            if (!ErrorConstant.ERRCODE_SYSTEM_ERROR.equalsIgnoreCase(str)) {
                if ("1003".equalsIgnoreCase(str)) {
                    b("1003", false);
                    return;
                } else if ("2006".equalsIgnoreCase(str)) {
                    b("2006", false);
                    return;
                }
            }
            b("1001", false);
        } else if (!"true".equalsIgnoreCase(this.g) && z) {
            b(str, true);
        } else {
            b(str, false);
        }
    }

    private void a(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da24c280", new Object[]{this, new Boolean(z), str, str2});
        } else if ("true".equalsIgnoreCase(this.g)) {
            b(str2, false);
        } else if (z) {
            if ("REGISTER_BIO_SUBMIT".equalsIgnoreCase(str)) {
                b("OPEN_SUCCESS", false);
            } else if (!"CLOSE_BIO".equalsIgnoreCase(str)) {
            } else {
                b("CLOSE_SUCCESS", false);
            }
        } else {
            b("1001", true);
        }
    }

    private void b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d257bc1", new Object[]{this, str, new Boolean(z)});
            return;
        }
        BioOpenCallback bioOpenCallback = this.h;
        if (bioOpenCallback == null) {
            return;
        }
        bioOpenCallback.a(str, z);
    }

    public static /* synthetic */ void a(BioOpenHandler bioOpenHandler, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fdcae0e", new Object[]{bioOpenHandler, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sysSelectCode", str2);
        hashMap.put("sceneId", bioOpenHandler.e);
        hashMap.put(rrv.PRODUCT_ID, bioOpenHandler.d);
        VerifyLogger.getInstance().eventBehavior(str, "", "", "", hashMap);
    }

    public static /* synthetic */ void b(BioOpenHandler bioOpenHandler, final String str, Map map, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0f409d2", new Object[]{bioOpenHandler, str, map, bundle});
            return;
        }
        final String str2 = (String) map.get("module");
        final String str3 = (String) map.get("action");
        if (!StringUtils.isEmpty((CharSequence) map.get(Constants.VI_ENGINE_VERIFYID))) {
            String str4 = (String) map.get(Constants.VI_ENGINE_VERIFYID);
            String str5 = (String) map.get("moduleData");
            VerifyLogCat.i(f5956a, "调起核身做密码校验");
            BioCheckManager bioCheckManager = bioOpenHandler.c;
            if (bioCheckManager == null) {
                return;
            }
            bioCheckManager.a(str4, str5, bioOpenHandler.e, bioOpenHandler.d, new VerifyCheckCallback() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.callback.VerifyCheckCallback
                public final void a(VerifyIdentityResult verifyIdentityResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dca1d00", new Object[]{this, verifyIdentityResult});
                        return;
                    }
                    if (verifyIdentityResult != null) {
                        if ("1000".equalsIgnoreCase(verifyIdentityResult.getCode())) {
                            BioOpenHandler.a(BioOpenHandler.this, str, str2, str3, bundle);
                            return;
                        }
                        VerifyLogCat.i(BioOpenHandler.a(), "核身密码校验失败/取消");
                    }
                    BioOpenHandler.a(BioOpenHandler.this, "1003", true);
                }
            });
            return;
        }
        bioOpenHandler.a(str, str2, str3, bundle);
    }

    public static /* synthetic */ void a(BioOpenHandler bioOpenHandler, MICProdmngResponse mICProdmngResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fefff544", new Object[]{bioOpenHandler, mICProdmngResponse, str});
        } else if (mICProdmngResponse.success && "REGISTER_BIO_SUBMIT".equalsIgnoreCase(str) && mICProdmngResponse.finish) {
            if ("1000".equalsIgnoreCase(mICProdmngResponse.finishCode)) {
                bioOpenHandler.a(true, str, "1000");
            } else {
                bioOpenHandler.a(false, str, "1001");
            }
        } else if (!mICProdmngResponse.success || !"CLOSE_BIO".equalsIgnoreCase(str) || !mICProdmngResponse.finish) {
        } else {
            if ("1000".equalsIgnoreCase(mICProdmngResponse.finishCode)) {
                IAuthenticator iAuthenticator = null;
                if (CommonConstant.FINGERPRINT_PAY.equalsIgnoreCase(bioOpenHandler.d)) {
                    iAuthenticator = AuthenticatorApi.create(MicroModuleContext.getInstance().getContext(), 1);
                } else if (CommonConstant.FACEID_PAY.equalsIgnoreCase(bioOpenHandler.d)) {
                    iAuthenticator = AuthenticatorApi.create(MicroModuleContext.getInstance().getContext(), 4);
                }
                if (mICProdmngResponse.data != null) {
                    try {
                        iAuthenticator.process(new AuthenticatorMessage(4, 2, JSON.parseObject(mICProdmngResponse.data.get("pageModel")).getString("closeRequestData")), new AuthenticatorCallback() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.4
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.security.mobile.auth.AuthenticatorCallback
                            public final void callback(AuthenticatorResponse authenticatorResponse) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("e8b9fa1b", new Object[]{this, authenticatorResponse});
                                    return;
                                }
                                String a2 = BioOpenHandler.a();
                                StringBuilder sb = new StringBuilder();
                                sb.append(authenticatorResponse.getResult());
                                VerifyLogCat.i(a2, sb.toString());
                            }
                        });
                    } catch (Exception unused) {
                        bioOpenHandler.a("1005", true);
                        VerifyLogCat.e(f5956a, "json fail");
                    }
                }
                bioOpenHandler.a(true, str, "1000");
                return;
            }
            bioOpenHandler.a(false, str, "1001");
        }
    }
}
