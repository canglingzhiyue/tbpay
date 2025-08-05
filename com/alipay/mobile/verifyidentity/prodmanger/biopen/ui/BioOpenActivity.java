package com.alipay.mobile.verifyidentity.prodmanger.biopen.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransAppVisibleReceiver;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.data.ProdManagerResult;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.info.EnvInfoUtil;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.log.behavior.VerifyLogger;
import com.alipay.mobile.verifyidentity.module.utils.DataHelper;
import com.alipay.mobile.verifyidentity.prod.manager.module.BaseProdManager;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.callback.BioCheckCallback;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.callback.VerifyCheckCallback;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.utils.BioCheckManager;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz;
import com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.alipay.mobileic.core.model.rpc.MICProdmngRequest;
import com.alipay.mobileic.core.model.rpc.MICRpcRequest;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.util.InstallServiceCallback;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import tb.rrv;

/* loaded from: classes3.dex */
public class BioOpenActivity extends BaseVerifyActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static String f6024a = "com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity";
    private Bundle b;
    private Bundle c;
    private BaseProdManager d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private BioCheckManager n;
    private AuthenticatorManager o;
    private BroadcastReceiver p;
    private LocalBroadcastManager q;

    public static /* synthetic */ Object ipc$super(BioOpenActivity bioOpenActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    public static /* synthetic */ AuthenticatorManager a(BioOpenActivity bioOpenActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AuthenticatorManager) ipChange.ipc$dispatch("3ff24f5f", new Object[]{bioOpenActivity}) : bioOpenActivity.o;
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f6024a;
    }

    public static /* synthetic */ void a(BioOpenActivity bioOpenActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4673a5b", new Object[]{bioOpenActivity, str});
        } else {
            bioOpenActivity.a(str);
        }
    }

    public static /* synthetic */ void a(BioOpenActivity bioOpenActivity, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fdd9def", new Object[]{bioOpenActivity, str, str2, str3});
        } else {
            bioOpenActivity.a(str, str2, str3);
        }
    }

    public static /* synthetic */ void a(BioOpenActivity bioOpenActivity, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc24c783", new Object[]{bioOpenActivity, str, str2, str3, str4, str5});
        } else {
            bioOpenActivity.b(str, str2, str3, str4, str5);
        }
    }

    public static /* synthetic */ void a(BioOpenActivity bioOpenActivity, String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be16368d", new Object[]{bioOpenActivity, str, str2, str3, str4, str5, str6});
        } else {
            bioOpenActivity.a(str2, str3, str4, str5, str6);
        }
    }

    public static /* synthetic */ String b(BioOpenActivity bioOpenActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cd666a70", new Object[]{bioOpenActivity}) : bioOpenActivity.e;
    }

    public static /* synthetic */ String c(BioOpenActivity bioOpenActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b311c6f1", new Object[]{bioOpenActivity}) : bioOpenActivity.m;
    }

    public static /* synthetic */ String d(BioOpenActivity bioOpenActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("98bd2372", new Object[]{bioOpenActivity}) : bioOpenActivity.f;
    }

    public static /* synthetic */ String e(BioOpenActivity bioOpenActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7e687ff3", new Object[]{bioOpenActivity}) : bioOpenActivity.k;
    }

    public static /* synthetic */ String f(BioOpenActivity bioOpenActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6413dc74", new Object[]{bioOpenActivity}) : bioOpenActivity.g;
    }

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.translucent_view);
        if (getIntent() != null) {
            this.b = getIntent().getExtras();
        }
        Bundle bundle2 = this.b;
        if (bundle2 != null) {
            this.k = bundle2.getString("token");
            this.d = MicroModuleContext.getInstance().findProManager(this.k);
            this.o = AuthenticatorManager.getInstance(this);
            this.l = this.b.getString("code");
            String str = f6024a;
            VerifyLogCat.i(str, "bioOPeng:" + this.l);
            this.e = this.b.getString(aw.PARAM_PRODUCT_TYPE);
            this.h = this.b.getString("downloadurl");
            this.i = this.b.getString("alertText");
            this.j = this.b.getString("module");
            this.c = this.b.getBundle("extParams");
            Bundle bundle3 = this.c;
            if (bundle3 != null) {
                this.m = bundle3.getString("sceneId");
                this.f = this.c.getString(rrv.PRODUCT_ID);
            }
        }
        Bundle bundle4 = this.c;
        if (bundle4 != null && "startByVIData".equalsIgnoreCase(bundle4.getString("source"))) {
            String string2 = this.b.getString(Constants.VI_ENGINE_FAST_MODULENAME);
            if (TextUtils.isEmpty(string2)) {
                b("1005", "", "", "", "");
                return;
            }
            this.n = new BioCheckManager(this);
            try {
                JSONObject parseObject = JSON.parseObject(string2);
                String string3 = parseObject.getString("productCode");
                final String string4 = parseObject.getString(Constants.VI_ENGINE_VERIFYID);
                this.f = parseObject.getString(rrv.PRODUCT_ID);
                this.e = parseObject.getString(aw.PARAM_PRODUCT_TYPE);
                this.m = parseObject.getString("sceneId");
                this.g = parseObject.getString("bizId");
                final String string5 = parseObject.getString(DataHelper.FP_CHALLENGE_KEY);
                final String string6 = parseObject.getString("action");
                if ("BIC".equalsIgnoreCase(string3) || "BIS".equalsIgnoreCase(string3)) {
                    AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity.10
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
                                mICRpcRequest.verifyId = string4;
                                mICRpcRequest.module = BioOpenActivity.d(BioOpenActivity.this);
                                mICRpcRequest.token = BioOpenActivity.e(BioOpenActivity.this);
                                mICRpcRequest.action = "triggerAction";
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put(rrv.PRODUCT_ID, (Object) BioOpenActivity.d(BioOpenActivity.this));
                                jSONObject.put("module", (Object) BioOpenActivity.d(BioOpenActivity.this));
                                jSONObject.put("sceneId", (Object) BioOpenActivity.c(BioOpenActivity.this));
                                jSONObject.put("action", (Object) "triggerAction");
                                jSONObject.put("token", (Object) BioOpenActivity.e(BioOpenActivity.this));
                                jSONObject.put("bizId", (Object) BioOpenActivity.f(BioOpenActivity.this));
                                mICRpcRequest.bizRequestData = jSONObject.toJSONString();
                                if (new MICRpcServiceBiz().trigger(mICRpcRequest) == null) {
                                    throw new Exception();
                                }
                                BioOpenActivity.this.runOnUiThread(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity.10.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        }
                                    }
                                });
                            } catch (RpcException e) {
                                VerifyLogCat.e(BioOpenActivity.a(), e);
                                BioOpenActivity.this.runOnUiThread(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity.10.2
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        }
                                    }
                                });
                                throw e;
                            } catch (Exception e2) {
                                VerifyLogCat.e(BioOpenActivity.a(), e2);
                            }
                        }
                    }, "trigger rpc");
                }
                if ("BIC".equalsIgnoreCase(string3)) {
                    if (CommonConstant.FINGERPRINT_PAY.equalsIgnoreCase(this.f)) {
                        runOnUiThread(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity.7
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public final void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                BioOpenActivity bioOpenActivity = BioOpenActivity.this;
                                BioOpenActivity.a(bioOpenActivity, string4, BioOpenActivity.b(bioOpenActivity), string6, string5, BioOpenActivity.c(BioOpenActivity.this), BioOpenActivity.d(BioOpenActivity.this));
                            }
                        });
                        return;
                    } else if (!CommonConstant.FACEID_PAY.equalsIgnoreCase(this.f)) {
                        return;
                    } else {
                        a(this.e, string6, string5, this.m, this.f);
                        return;
                    }
                } else if (!"BIS".equalsIgnoreCase(string3) && !"RESET_PWD".equalsIgnoreCase(string3)) {
                    return;
                } else {
                    String string7 = parseObject.getString("moduleData");
                    if (this.n == null) {
                        return;
                    }
                    this.n.a(string4, string7, this.m, this.f, new VerifyCheckCallback() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity.8
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.callback.VerifyCheckCallback
                        public final void a(VerifyIdentityResult verifyIdentityResult) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dca1d00", new Object[]{this, verifyIdentityResult});
                            } else if (verifyIdentityResult != null) {
                                BioOpenActivity.a(BioOpenActivity.this, verifyIdentityResult.getCode(), string6, BioOpenActivity.b(BioOpenActivity.this), BioOpenActivity.c(BioOpenActivity.this), "");
                            } else {
                                BioOpenActivity bioOpenActivity = BioOpenActivity.this;
                                BioOpenActivity.a(bioOpenActivity, "1005", string6, BioOpenActivity.b(bioOpenActivity), BioOpenActivity.c(BioOpenActivity.this), "");
                            }
                        }
                    });
                    return;
                }
            } catch (Exception unused) {
                b("1005", "", "", "", "");
                return;
            }
        }
        this.p = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                String action = intent.getAction();
                if (!ExtTransAppVisibleReceiver.FRAMEWORK_ACTIVITY_USERLEAVEHINT.equalsIgnoreCase(action) && !"android.intent.action.SCREEN_OFF".equalsIgnoreCase(action)) {
                    return;
                }
                BioOpenActivity.a(BioOpenActivity.this, "1003");
            }
        };
        this.q = LocalBroadcastManager.getInstance(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ExtTransAppVisibleReceiver.FRAMEWORK_ACTIVITY_USERLEAVEHINT);
        this.q.registerReceiver(this.p, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.SCREEN_OFF");
        registerReceiver(this.p, intentFilter2);
        String str2 = f6024a;
        VerifyLogCat.d(str2, "无ui开通:" + this.l);
        BioOpenHandler bioOpenHandler = new BioOpenHandler();
        if ("not_install_ifaa".equalsIgnoreCase(this.l)) {
            VerifyLogCat.i(f6024a, "无UI 未安装服务");
            Bundle bundle5 = new Bundle();
            if (TextUtils.isEmpty(this.i)) {
                if ("1".equalsIgnoreCase(this.e)) {
                    this.i = MicroModuleContext.getInstance().getContext().getResources().getString(R.string.finger_guide_not_install);
                } else if ("4".equalsIgnoreCase(this.e)) {
                    this.i = MicroModuleContext.getInstance().getContext().getResources().getString(R.string.face_guide_not_install);
                }
            }
            bundle5.putBoolean(CommonConstant.alertTextColor, true);
            MicroModuleContext.getInstance().alert(null, this.i, MicroModuleContext.getInstance().getContext().getResources().getString(R.string.finger_install), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    BioOpenActivity.a(BioOpenActivity.this).downloadIfaaService(BioOpenActivity.this, new InstallServiceCallback() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity.1.1
                        public final void onFinish() {
                            VerifyLogCat.i(BioOpenActivity.a(), "download ifaa finish");
                        }

                        public final void onFailed() {
                            VerifyLogCat.i(BioOpenActivity.a(), "download ifaa failed");
                        }

                        public final void onCancel() {
                            VerifyLogCat.i(BioOpenActivity.a(), "download ifaa cancel");
                        }
                    });
                    BioOpenActivity.a(BioOpenActivity.this, "UC-MobileIC-20190425-1", "1", "");
                    BioOpenActivity.a(BioOpenActivity.this, "1003");
                }
            }, MicroModuleContext.getInstance().getContext().getResources().getString(R.string.finger_cancel), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    BioOpenActivity.a(BioOpenActivity.this, "1003");
                    BioOpenActivity.a(BioOpenActivity.this, "UC-MobileIC-20190425-2", "0", "");
                }
            }, bundle5);
        } else if ("not_exist_bic_feature".equalsIgnoreCase(this.l)) {
            Bundle bundle6 = new Bundle();
            bundle6.putBoolean(CommonConstant.alertTextColor, true);
            if ("1".equalsIgnoreCase(this.e)) {
                string = MicroModuleContext.getInstance().getContext().getResources().getString(R.string.finger_guide_print);
            } else {
                string = "4".equalsIgnoreCase(this.e) ? MicroModuleContext.getInstance().getContext().getResources().getString(R.string.face_guide_print) : "";
            }
            MicroModuleContext.getInstance().alert(null, string, MicroModuleContext.getInstance().getContext().getResources().getString(R.string.finger_register), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    BioOpenActivity.a(BioOpenActivity.this).startBioManager(Integer.valueOf(BioOpenActivity.b(BioOpenActivity.this)).intValue());
                    BioOpenActivity.a(BioOpenActivity.this, "UC-MobileIC-20180315-5", "1", "");
                    BioOpenActivity.a(BioOpenActivity.this, "1003");
                }
            }, MicroModuleContext.getInstance().getContext().getResources().getString(R.string.finger_cancel), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    BioOpenActivity.a(BioOpenActivity.this, "1003");
                    BioOpenActivity.a(BioOpenActivity.this, "UC-MobileIC-20180315-5", "0", "");
                }
            }, bundle6);
        } else {
            bioOpenHandler.a(this, this.b, new BioOpenHandler.BioOpenCallback() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.BioOpenCallback
                public final void a(String str3, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8123ece2", new Object[]{this, str3, new Boolean(z)});
                    } else {
                        BioOpenActivity.a(BioOpenActivity.this, str3);
                    }
                }
            });
        }
    }

    private void a(final String str, final String str2, String str3, final String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        BioCheckManager bioCheckManager = this.n;
        if (bioCheckManager == null) {
            return;
        }
        bioCheckManager.a(Integer.parseInt(str), str3, str4, str5, new BioCheckCallback() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.callback.BioCheckCallback
            public final void onBioCheckResult(AuthenticatorResponse authenticatorResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("51346624", new Object[]{this, authenticatorResponse});
                } else if (authenticatorResponse == null) {
                    VerifyLogCat.i(BioOpenActivity.a(), "生物校验失败");
                    BioOpenActivity.a(BioOpenActivity.this, "1005", str2, str, str4, "");
                } else {
                    String a2 = BioOpenActivity.a();
                    VerifyLogCat.i(a2, "无UI result：" + authenticatorResponse.getResult());
                    if ("100".equalsIgnoreCase(String.valueOf(authenticatorResponse.getResult()))) {
                        if (authenticatorResponse.getData() != null) {
                            BioOpenActivity.a(BioOpenActivity.this, "1000", str2, str, str4, authenticatorResponse.getData());
                        } else {
                            BioOpenActivity.a(BioOpenActivity.this, "1005", str2, str, str4, "");
                        }
                    } else if ("102".equalsIgnoreCase(String.valueOf(authenticatorResponse.getResult()))) {
                        BioOpenActivity.a(BioOpenActivity.this, "1003", str2, str, str4, "");
                    } else {
                        BioOpenActivity.a(BioOpenActivity.this, "1002", str2, str, str4, "");
                    }
                }
            }
        });
    }

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        if (!"BIC".equalsIgnoreCase(this.j)) {
            return;
        }
        try {
            AuthenticatorManager.getInstance(this).stopAuth(this, Integer.valueOf(this.e).intValue());
            a("1003");
        } catch (Throwable th) {
            VerifyLogCat.d(f6024a, th.getMessage());
            a("1005");
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 4) {
            a("1003");
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    private void b(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2001a9b", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        a("UC-MobileIC-20180904-2", "", str);
        String verifyData = getVerifyData(str2, str3, str4, str5);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", (Object) str);
        jSONObject.put("result", (Object) verifyData);
        BaseProdManager baseProdManager = this.d;
        if (baseProdManager != null) {
            baseProdManager.callback(jSONObject.toJSONString());
        } else {
            VerifyLogCat.i(f6024a, "fingerManager为空！无法回调！");
        }
        finish();
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        ProdManagerResult prodManagerResult = new ProdManagerResult(str);
        BaseProdManager baseProdManager = this.d;
        if (baseProdManager != null) {
            baseProdManager.callback(prodManagerResult, null);
        } else {
            VerifyLogCat.i(f6024a, "fingerManager为空！无法回调！");
        }
        finish();
    }

    public String getVerifyData(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("595451b8", new Object[]{this, str, str2, str3, str4});
        }
        MICProdmngRequest mICProdmngRequest = new MICProdmngRequest();
        mICProdmngRequest.token = this.k;
        mICProdmngRequest.module = this.j;
        mICProdmngRequest.action = str;
        mICProdmngRequest.envData = EnvInfoUtil.getBaseEnvData();
        mICProdmngRequest.params = new HashMap();
        mICProdmngRequest.params.put(aw.PARAM_PRODUCT_TYPE, str2);
        mICProdmngRequest.params.put("sceneId", str3);
        mICProdmngRequest.params.put("secData", EnvInfoUtil.getFpSecdata());
        mICProdmngRequest.params.put("data", str4);
        return JSON.toJSONString(mICProdmngRequest).toString();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        MicroModuleContext.getInstance().onDestroyProManager();
        try {
            if (this.q != null && this.p != null) {
                this.q.unregisterReceiver(this.p);
            }
            if (this.p == null) {
                return;
            }
            unregisterReceiver(this.p);
        } catch (Throwable th) {
            String str = f6024a;
            VerifyLogCat.i(str, "unregisterReceiver error:" + th.getMessage());
        }
    }

    private void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sysSelectCode", str2);
        hashMap.put("resultCode", str3);
        hashMap.put("sceneId", this.m);
        hashMap.put(rrv.PRODUCT_ID, this.f);
        VerifyLogger.getInstance().eventBehavior(str, "", "", "", hashMap);
    }
}
