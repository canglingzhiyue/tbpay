package com.alipay.mobile.verifyidentity.module.fingerprint;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.GlobalAuthenticatorManager;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.IAuthenticatorManager;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.module.faceid.FaceIdChecker;
import com.alipay.mobile.verifyidentity.module.fingerprint.proxy.GlobalAuthenticatorManagerProxy;
import com.alipay.mobile.verifyidentity.module.utils.DataHelper;
import com.alipay.mobile.verifyidentity.module.utils.DataHelperManager;
import com.alipay.mobile.verifyidentity.module.zface.ZFaceChecker;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz;
import com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.VIFBPluginManager;
import com.alipay.mobile.verifyidentity.ui.utils.DensityUtil;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.alipay.mobileic.core.model.rpc.MICRpcRequest;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class FingerprintCheckActivity extends BaseVerifyActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, DataHelper> g = new HashMap();
    private FaceIdChecker f;
    public BroadcastReceiver fpBroadcastReceiver;
    public GlobalAuthenticatorManager globalAuthenticatorManager;
    private ZFaceChecker l;
    private GlobalAuthenticatorManagerProxy n;
    public BroadcastReceiver payStatusBroadcastReceiver;

    /* renamed from: a  reason: collision with root package name */
    private Handler f5898a = new Handler(Looper.getMainLooper());
    public AtomicBoolean hasCancelled = new AtomicBoolean(false);
    private AtomicBoolean b = new AtomicBoolean(true);
    private AtomicBoolean c = new AtomicBoolean(false);
    private FpBaseHelper d = null;
    private AtomicBoolean e = new AtomicBoolean(false);
    public SafepayChecker mSafepayChecker = new SafepayChecker();
    private DataHelper h = null;
    private boolean i = false;
    private boolean j = false;
    private String k = "";
    private boolean m = false;

    /* renamed from: com.alipay.mobile.verifyidentity.module.fingerprint.FingerprintCheckActivity$8  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass8 extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass8() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String stringExtra = intent.getStringExtra("status");
            if ("success".equalsIgnoreCase(stringExtra)) {
                VerifyLogCat.i("FingerprintCheckActivityTag", "支付成功");
            } else if ("paying".equalsIgnoreCase(stringExtra)) {
                VerifyLogCat.i("FingerprintCheckActivityTag", "支付中");
            } else {
                VerifyLogCat.i("FingerprintCheckActivityTag", "支付失败");
                FingerprintCheckActivity.access$2300(FingerprintCheckActivity.this, 0);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(FingerprintCheckActivity fingerprintCheckActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 188604040:
                super.onStop();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ DataHelper access$000(FingerprintCheckActivity fingerprintCheckActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataHelper) ipChange.ipc$dispatch("f59d2667", new Object[]{fingerprintCheckActivity}) : fingerprintCheckActivity.h;
    }

    public static /* synthetic */ AtomicBoolean access$1000(FingerprintCheckActivity fingerprintCheckActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("a16e7196", new Object[]{fingerprintCheckActivity}) : fingerprintCheckActivity.b;
    }

    public static /* synthetic */ boolean access$102(FingerprintCheckActivity fingerprintCheckActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bf55e2e", new Object[]{fingerprintCheckActivity, new Boolean(z)})).booleanValue();
        }
        fingerprintCheckActivity.m = z;
        return z;
    }

    public static /* synthetic */ AtomicBoolean access$1100(FingerprintCheckActivity fingerprintCheckActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("147b6dd7", new Object[]{fingerprintCheckActivity}) : fingerprintCheckActivity.c;
    }

    public static /* synthetic */ MicroModule access$1200(FingerprintCheckActivity fingerprintCheckActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("b292c69a", new Object[]{fingerprintCheckActivity}) : fingerprintCheckActivity.mModule;
    }

    public static /* synthetic */ boolean access$1300(FingerprintCheckActivity fingerprintCheckActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("caa705d", new Object[]{fingerprintCheckActivity})).booleanValue() : fingerprintCheckActivity.i;
    }

    public static /* synthetic */ String access$1400(FingerprintCheckActivity fingerprintCheckActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d7d34606", new Object[]{fingerprintCheckActivity}) : fingerprintCheckActivity.k;
    }

    public static /* synthetic */ FpBaseHelper access$1500(FingerprintCheckActivity fingerprintCheckActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FpBaseHelper) ipChange.ipc$dispatch("57781ab5", new Object[]{fingerprintCheckActivity}) : fingerprintCheckActivity.d;
    }

    public static /* synthetic */ MicroModule access$1600(FingerprintCheckActivity fingerprintCheckActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("bae0429e", new Object[]{fingerprintCheckActivity}) : fingerprintCheckActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$1800(FingerprintCheckActivity fingerprintCheckActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("bf0700a0", new Object[]{fingerprintCheckActivity}) : fingerprintCheckActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$1900(FingerprintCheckActivity fingerprintCheckActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("c11a5fa1", new Object[]{fingerprintCheckActivity}) : fingerprintCheckActivity.mModule;
    }

    public static /* synthetic */ FaceIdChecker access$200(FingerprintCheckActivity fingerprintCheckActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FaceIdChecker) ipChange.ipc$dispatch("1059e155", new Object[]{fingerprintCheckActivity}) : fingerprintCheckActivity.f;
    }

    public static /* synthetic */ MicroModule access$2000(FingerprintCheckActivity fingerprintCheckActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("eec489b7", new Object[]{fingerprintCheckActivity}) : fingerprintCheckActivity.mModule;
    }

    public static /* synthetic */ FaceIdChecker access$202(FingerprintCheckActivity fingerprintCheckActivity, FaceIdChecker faceIdChecker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FaceIdChecker) ipChange.ipc$dispatch("6ae7588b", new Object[]{fingerprintCheckActivity, faceIdChecker});
        }
        fingerprintCheckActivity.f = faceIdChecker;
        return faceIdChecker;
    }

    public static /* synthetic */ MicroModuleContext access$2100(FingerprintCheckActivity fingerprintCheckActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModuleContext) ipChange.ipc$dispatch("5eb1f245", new Object[]{fingerprintCheckActivity}) : fingerprintCheckActivity.mMicroModuleContext;
    }

    public static /* synthetic */ MicroModule access$2400(FingerprintCheckActivity fingerprintCheckActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("f71205bb", new Object[]{fingerprintCheckActivity}) : fingerprintCheckActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$2500(FingerprintCheckActivity fingerprintCheckActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("f92564bc", new Object[]{fingerprintCheckActivity}) : fingerprintCheckActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$2600(FingerprintCheckActivity fingerprintCheckActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("fb38c3bd", new Object[]{fingerprintCheckActivity}) : fingerprintCheckActivity.mModule;
    }

    public static /* synthetic */ ZFaceChecker access$300(FingerprintCheckActivity fingerprintCheckActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ZFaceChecker) ipChange.ipc$dispatch("ac915ca4", new Object[]{fingerprintCheckActivity}) : fingerprintCheckActivity.l;
    }

    public static /* synthetic */ ZFaceChecker access$302(FingerprintCheckActivity fingerprintCheckActivity, ZFaceChecker zFaceChecker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ZFaceChecker) ipChange.ipc$dispatch("9d23092a", new Object[]{fingerprintCheckActivity, zFaceChecker});
        }
        fingerprintCheckActivity.l = zFaceChecker;
        return zFaceChecker;
    }

    public static /* synthetic */ AtomicBoolean access$400(FingerprintCheckActivity fingerprintCheckActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("7e83c66b", new Object[]{fingerprintCheckActivity}) : fingerprintCheckActivity.e;
    }

    public static /* synthetic */ void access$500(FingerprintCheckActivity fingerprintCheckActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e0fb36", new Object[]{fingerprintCheckActivity, str});
        } else {
            fingerprintCheckActivity.b(str);
        }
    }

    public static /* synthetic */ MicroModule access$600(FingerprintCheckActivity fingerprintCheckActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("e657d52f", new Object[]{fingerprintCheckActivity}) : fingerprintCheckActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$700(FingerprintCheckActivity fingerprintCheckActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("e86b3430", new Object[]{fingerprintCheckActivity}) : fingerprintCheckActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$800(FingerprintCheckActivity fingerprintCheckActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("ea7e9331", new Object[]{fingerprintCheckActivity}) : fingerprintCheckActivity.mModule;
    }

    public static /* synthetic */ boolean access$900(FingerprintCheckActivity fingerprintCheckActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bc294a74", new Object[]{fingerprintCheckActivity})).booleanValue() : b();
    }

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        VerifyLogCat.i("FingerprintCheckActivityTag", "FingerprintCheckActivity is onCreate");
        super.onCreate(bundle);
        this.h = g.get(this.mModule.getVerifyId());
        if (this.h == null) {
            this.h = DataHelperManager.getInstance().getHelper(this.mModule.getVerifyId());
            DataHelper dataHelper = this.h;
            if (dataHelper != null) {
                dataHelper.isFromUserBack = true;
                VIFBPluginManager.mBackPlugin = dataHelper.mPlugin;
                VIFBPluginManager.addPlugin(this.mModule.getVerifyId(), this.h.mPlugin);
            }
        }
        if (this.h != null) {
            VerifyLogCat.i("FingerprintCheckActivityTag", "从鸟巢插件启动弹框式指纹");
            DataHelperManager.getInstance().removeHelper(this.mModule.getVerifyId());
        } else {
            VerifyLogCat.i("FingerprintCheckActivityTag", "标准启动方式启动弹框式指纹");
            this.h = new DataHelper(this.mModule);
            if (getIntent() == null || getIntent().getExtras() == null) {
                VerifyLogCat.w("FingerprintCheckActivityTag", "FingerprintCheckActivity meet empty data. It cant go on");
                this.h.notifyResult(null);
                return;
            }
            this.h.parseInitData(getIntent().getExtras().getString(FingerprintModule.FP_MODULE_DATA_KEY));
        }
        this.i = getIntent().getExtras().getBoolean(FingerprintModule.FP_IS_IPAY, false);
        this.j = getIntent().getExtras().getBoolean(FingerprintModule.FP_IS_MSP_USE_PWD, false);
        handleBio();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007f A[Catch: Throwable -> 0x0086, TRY_LEAVE, TryCatch #0 {Throwable -> 0x0086, blocks: (B:6:0x001b, B:8:0x001f, B:10:0x0025, B:12:0x003b, B:22:0x007f, B:14:0x004c, B:16:0x0054, B:17:0x0064, B:19:0x006c), top: B:27:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a() {
        /*
            r7 = this;
            java.lang.String r0 = "FingerprintCheckActivityTag"
            com.android.alibaba.ip.runtime.IpChange r1 = com.alipay.mobile.verifyidentity.module.fingerprint.FingerprintCheckActivity.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1b
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r7
            java.lang.String r2 = "56c6c6c"
            java.lang.Object r0 = r1.ipc$dispatch(r2, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L1b:
            boolean r1 = r7.j     // Catch: java.lang.Throwable -> L86
            if (r1 == 0) goto L8d
            com.alipay.mobile.verifyidentity.module.utils.DataHelper r1 = r7.h     // Catch: java.lang.Throwable -> L86
            boolean r1 = r1.isFromUserBack     // Catch: java.lang.Throwable -> L86
            if (r1 != 0) goto L8d
            java.lang.String r1 = "needGoPwdPre true"
            com.alipay.mobile.verifyidentity.log.VerifyLogCat.i(r0, r1)     // Catch: java.lang.Throwable -> L86
            com.alipay.mobile.verifyidentity.module.utils.DataHelper r1 = r7.h     // Catch: java.lang.Throwable -> L86
            java.lang.String r2 = "PWD"
            java.lang.String r1 = r1.getIdTip(r2, r7)     // Catch: java.lang.Throwable -> L86
            com.alipay.mobile.verifyidentity.module.utils.DataHelper r2 = r7.h     // Catch: java.lang.Throwable -> L86
            boolean r2 = r2.isFP()     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L4c
            com.alipay.mobile.verifyidentity.module.utils.DataHelper r2 = r7.h     // Catch: java.lang.Throwable -> L86
            android.content.res.Resources r5 = r7.getResources()     // Catch: java.lang.Throwable -> L86
            int r6 = com.taobao.taobao.R.string.go_fp_pay     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = r5.getString(r6)     // Catch: java.lang.Throwable -> L86
            r2.goToPayPwdWithStr(r5, r1, r4)     // Catch: java.lang.Throwable -> L86
        L4a:
            r1 = 1
            goto L7d
        L4c:
            com.alipay.mobile.verifyidentity.module.utils.DataHelper r2 = r7.h     // Catch: java.lang.Throwable -> L86
            boolean r2 = r2.isFACEID()     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L64
            com.alipay.mobile.verifyidentity.module.utils.DataHelper r2 = r7.h     // Catch: java.lang.Throwable -> L86
            android.content.res.Resources r5 = r7.getResources()     // Catch: java.lang.Throwable -> L86
            int r6 = com.taobao.taobao.R.string.go_faceid_pay     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = r5.getString(r6)     // Catch: java.lang.Throwable -> L86
            r2.goToPayPwdWithStr(r5, r1, r4)     // Catch: java.lang.Throwable -> L86
            goto L4a
        L64:
            com.alipay.mobile.verifyidentity.module.utils.DataHelper r2 = r7.h     // Catch: java.lang.Throwable -> L86
            boolean r2 = r2.isZFACE()     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L7c
            com.alipay.mobile.verifyidentity.module.utils.DataHelper r2 = r7.h     // Catch: java.lang.Throwable -> L86
            android.content.res.Resources r5 = r7.getResources()     // Catch: java.lang.Throwable -> L86
            int r6 = com.taobao.taobao.R.string.go_face_pay     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = r5.getString(r6)     // Catch: java.lang.Throwable -> L86
            r2.goToPayPwdWithStr(r5, r1, r4)     // Catch: java.lang.Throwable -> L86
            goto L4a
        L7c:
            r1 = 0
        L7d:
            if (r1 == 0) goto L8d
            java.lang.String r1 = "tryGoPwdWithBackTips succeed"
            com.alipay.mobile.verifyidentity.log.VerifyLogCat.i(r0, r1)     // Catch: java.lang.Throwable -> L86
            return r4
        L86:
            r1 = move-exception
            java.lang.String r2 = "tryGoPwdPre"
            com.alipay.mobile.verifyidentity.log.VerifyLogCat.e(r0, r2, r1)
        L8d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.module.fingerprint.FingerprintCheckActivity.a():boolean");
    }

    public void handleBio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1beeaa47", new Object[]{this});
        } else if (a()) {
        } else {
            if (this.h.isFP()) {
                if (this.i) {
                    this.k = "1";
                    a("1");
                } else {
                    this.d = new FpBaseHelper();
                    this.d.init(this, this.h);
                    this.d.startSpFingerprintChecker();
                }
                sendModelChangeEvent("", "BIO", "fp");
            } else if (this.h.isFACEID()) {
                if (this.i) {
                    this.k = "4";
                    a("4");
                    return;
                }
                this.h.startBioCheck(new DataHelper.BioCheckCallBack() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.FingerprintCheckActivity.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.mobile.verifyidentity.module.utils.DataHelper.BioCheckCallBack
                    public void bioCheckResult(boolean z, boolean z2, boolean z3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("bf1b0eb0", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
                        } else if (z) {
                            if (FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).ppwFirst && !FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).isFromUserBackNoCashier && !FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).isFromUserBack) {
                                FingerprintCheckActivity.access$102(FingerprintCheckActivity.this, false);
                                FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).goToPayPwdWithStr(FingerprintCheckActivity.this.getResources().getString(R.string.go_faceid_pay), FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).getIdTip("PWD", FingerprintCheckActivity.this));
                                return;
                            }
                            FingerprintCheckActivity fingerprintCheckActivity = FingerprintCheckActivity.this;
                            FingerprintCheckActivity.access$202(fingerprintCheckActivity, new FaceIdChecker(fingerprintCheckActivity, FingerprintCheckActivity.access$000(fingerprintCheckActivity)));
                            FingerprintCheckActivity.access$200(FingerprintCheckActivity.this).start();
                            FingerprintCheckActivity.access$102(FingerprintCheckActivity.this, true);
                            FingerprintCheckActivity.this.sendModelChangeEvent("", "BIO", BaseFBPlugin.VERIFY_TYPE.faceid);
                        } else if (z2) {
                            FingerprintCheckActivity.access$102(FingerprintCheckActivity.this, false);
                            FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).goToPayPwdWithStr(FingerprintCheckActivity.this.getResources().getString(R.string.go_faceid_pay), FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).getIdTip("PWD", FingerprintCheckActivity.this));
                        } else if (!z3) {
                        } else {
                            FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).isIntelligent = true;
                            if (FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).bioTypes != null) {
                                if (DataHelper.ZFACE_TYPE_VALUE.equalsIgnoreCase(FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).bioTypes.getString(0))) {
                                    FingerprintCheckActivity.this.toast(FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).getIdTip(DataHelper.ZFACE_TYPE_VALUE, FingerprintCheckActivity.this), 0);
                                } else if (DataHelper.FP_TYPE_VALUE.equalsIgnoreCase(FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).bioTypes.getString(0))) {
                                    FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).mDecisionTip = FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).getIdTip(DataHelper.FP_TYPE_VALUE, FingerprintCheckActivity.this);
                                }
                            }
                            FingerprintCheckActivity.this.handleBio();
                        }
                    }
                }, DataHelper.FACEID_TYPE_VALUE);
            } else if (this.h.isZFACE()) {
                this.h.startBioCheck(new DataHelper.BioCheckCallBack() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.FingerprintCheckActivity.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.mobile.verifyidentity.module.utils.DataHelper.BioCheckCallBack
                    public void bioCheckResult(boolean z, boolean z2, boolean z3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("bf1b0eb0", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
                        } else if (z) {
                            if (FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).ppwFirst && !FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).isFromUserBackNoCashier && !FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).isFromUserBack) {
                                FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).goToPayPwdWithStr(FingerprintCheckActivity.this.getResources().getString(R.string.go_face_pay), FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).getIdTip("PWD", FingerprintCheckActivity.this));
                                return;
                            }
                            FingerprintCheckActivity fingerprintCheckActivity = FingerprintCheckActivity.this;
                            FingerprintCheckActivity.access$302(fingerprintCheckActivity, new ZFaceChecker(fingerprintCheckActivity, FingerprintCheckActivity.access$000(fingerprintCheckActivity)));
                            FingerprintCheckActivity.access$300(FingerprintCheckActivity.this).start();
                            FingerprintCheckActivity.this.sendModelChangeEvent("", "BIO", "zface");
                        } else if (z2) {
                            FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).goToPayPwdWithStr(FingerprintCheckActivity.this.getResources().getString(R.string.go_face_pay), FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).getIdTip("PWD", FingerprintCheckActivity.this));
                        } else if (!z3) {
                        } else {
                            FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).isIntelligent = true;
                            if (FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).bioTypes != null) {
                                if (DataHelper.FACEID_TYPE_VALUE.equalsIgnoreCase(FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).bioTypes.getString(0))) {
                                    FingerprintCheckActivity.this.toast(FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).getIdTip(DataHelper.FACEID_TYPE_VALUE, FingerprintCheckActivity.this), 0);
                                } else if (DataHelper.FP_TYPE_VALUE.equalsIgnoreCase(FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).bioTypes.getString(0))) {
                                    FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).mDecisionTip = FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).getIdTip(DataHelper.FP_TYPE_VALUE, FingerprintCheckActivity.this);
                                }
                            }
                            FingerprintCheckActivity.this.handleBio();
                        }
                    }
                }, DataHelper.ZFACE_TYPE_VALUE);
            } else {
                VerifyLogCat.w("FingerprintCheckActivityTag", "Predata Type is not FP or WL. Go to check pay pwd!");
                this.h.goToPayPwd();
            }
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        VerifyLogCat.i("FingerprintCheckActivityTag", "finger onResume");
        if (!this.hasCancelled.get()) {
            return;
        }
        if (!this.b.get()) {
            VerifyLogCat.i("FingerprintCheckActivityTag", "用户回来了，当前指纹已进入rpc校验流程，不转支付密码");
            return;
        }
        this.h.logFpResBehavior("BIO_BACK_TO_FORGROUND", null);
        VerifyLogCat.i("FingerprintCheckActivityTag", "用户回来了，指纹校验已做取消处理。跳转到支付密码");
        this.h.goToPayPwd();
    }

    public static void addDataHelper(String str, DataHelper dataHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69f2ee2", new Object[]{str, dataHelper});
        } else {
            g.put(str, dataHelper);
        }
    }

    public static void removeHelper(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9fe1263", new Object[]{str});
        } else {
            g.remove(str);
        }
    }

    private void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        VerifyLogCat.i("FingerprintCheckActivityTag", "startInternalFpChecker");
        this.globalAuthenticatorManager = GlobalAuthenticatorManager.getInstance(this);
        this.n = new GlobalAuthenticatorManagerProxy(this.globalAuthenticatorManager);
        this.n.startAuth(this, this.h.preDataJson.toJSONString(), new IAuthenticatorManager.Callback() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.FingerprintCheckActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.IAuthenticatorManager.Callback
            public void onResult(final AuthenticatorResponse authenticatorResponse) {
                FingerprintCheckActivity fingerprintCheckActivity;
                int i;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("688a9824", new Object[]{this, authenticatorResponse});
                    return;
                }
                VerifyLogCat.i("FingerprintCheckActivityTag", "startInternalFpChecker1");
                if (FingerprintCheckActivity.this.hasCancelled.get()) {
                    VerifyLogCat.i("FingerprintCheckActivityTag", "指纹校验已取消，不处理回调结果[]");
                } else if (FingerprintCheckActivity.access$400(FingerprintCheckActivity.this).getAndSet(true)) {
                    VerifyLogCat.i("FingerprintCheckActivityTag", "【出现多次回调！！】  忽略");
                } else {
                    int result = authenticatorResponse.getResult();
                    if (result == 100) {
                        VerifyLogCat.i("FingerprintCheckActivityTag", "startInternalFpChecker2");
                        FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).buildRequestFpInData(str, true, authenticatorResponse);
                        FingerprintCheckActivity.this.updateVerifyStatus("end");
                        FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).logFpResBehavior(String.valueOf(authenticatorResponse.getResult()), "ipay");
                        FingerprintCheckActivity.this.checkByServer();
                    } else if (result == 102) {
                        VerifyLogCat.i("FingerprintCheckActivityTag", "startInternalFpChecker3");
                        if ("4".equals(str)) {
                            FingerprintCheckActivity fingerprintCheckActivity2 = FingerprintCheckActivity.this;
                            fingerprintCheckActivity2.alert((String) null, fingerprintCheckActivity2.getResources().getString(R.string.face_really_wanna_leave), FingerprintCheckActivity.this.getResources().getString(R.string.to_pay_pwd), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.FingerprintCheckActivity.3.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.content.DialogInterface.OnClickListener
                                public void onClick(DialogInterface dialogInterface, int i2) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                                        return;
                                    }
                                    VerifyLogCat.i("FingerprintCheckActivityTag", "【用户选择切密码】");
                                    FingerprintCheckActivity.access$500(FingerprintCheckActivity.this, "");
                                    FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).goToIpayPwd(str, authenticatorResponse);
                                }
                            }, FingerprintCheckActivity.this.getResources().getString(R.string.verifyidentity_confirm), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.FingerprintCheckActivity.3.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.content.DialogInterface.OnClickListener
                                public void onClick(DialogInterface dialogInterface, int i2) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                                        return;
                                    }
                                    VerifyLogCat.i("FingerprintCheckActivityTag", "【用户选择放弃】");
                                    FingerprintCheckActivity.this.updateVerifyStatus(BaseFBPlugin.VERIFY_STATUS.abort);
                                    FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).notifyResult(new DefaultModuleResult("1003"));
                                }
                            }, (Boolean) false);
                            return;
                        }
                        FingerprintCheckActivity.this.updateVerifyStatus(BaseFBPlugin.VERIFY_STATUS.abort);
                        FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).logFpResBehavior("INTERNAL_RESULT_USER_CANCEL", null);
                        FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).notifyResult(new DefaultModuleResult("1003"));
                    } else {
                        VerifyLogCat.i("FingerprintCheckActivityTag", "startInternalFpChecker code:" + authenticatorResponse.getResult());
                        FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).logFpResBehavior(String.valueOf(authenticatorResponse.getResult()), "ipay");
                        FingerprintCheckActivity.this.updateVerifyStatus("end");
                        if ("4".equals(str)) {
                            String string = FingerprintCheckActivity.this.getString(R.string.face_failed_pwd_tip);
                            if (403 == authenticatorResponse.getResult()) {
                                fingerprintCheckActivity = FingerprintCheckActivity.this;
                                i = R.string.face_no_permission_pwd_tip;
                            } else if (129 == authenticatorResponse.getResult()) {
                                fingerprintCheckActivity = FingerprintCheckActivity.this;
                                i = R.string.face_system_block;
                            } else {
                                if (121 == authenticatorResponse.getResult() || 134 == authenticatorResponse.getResult()) {
                                    string = "";
                                }
                                FingerprintCheckActivity.access$500(FingerprintCheckActivity.this, string);
                            }
                            string = fingerprintCheckActivity.getString(i);
                            FingerprintCheckActivity.access$500(FingerprintCheckActivity.this, string);
                        }
                        FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).goToIpayPwd(str, authenticatorResponse);
                    }
                }
            }
        });
    }

    public void goToPwd(String str, String str2, AuthenticatorResponse authenticatorResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3695c72", new Object[]{this, str, str2, authenticatorResponse});
            return;
        }
        b(str2);
        this.h.goToPayPwd(str, authenticatorResponse);
    }

    public void goToPwd(String str, String str2, Object obj, String str3, int i, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87ad7332", new Object[]{this, str, str2, obj, str3, new Integer(i), str4});
            return;
        }
        b(str2);
        this.h.goToPayPwd(str, obj, str3, i, str4);
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        VerifyLogCat.i("FingerprintCheckActivityTag", "开始切密码");
        if (!StringUtils.isEmpty(str)) {
            this.h.updateTipToPwd(str);
        }
        updateVerifyStatus("end");
    }

    public void sendModelChangeEvent(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97f3176e", new Object[]{this, str, str2, str3});
        } else if (!this.h.isPluginMode) {
        } else {
            this.h.mPlugin.sendModelChangeEvent(str, str2, str3);
        }
    }

    public void updateVerifyStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a90588c5", new Object[]{this, str});
        } else if (!this.h.isPluginMode) {
        } else {
            this.h.mPlugin.updateVerifyStatus(str);
        }
    }

    public void updateVerifyStatusNew(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3060e15d", new Object[]{this, str});
        } else if (!this.h.isPluginMode) {
        } else {
            this.h.mPlugin.updateVerifyStatusNew(str);
        }
    }

    public void updateStatuesWithSecne(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6d33957", new Object[]{this, str, str2});
        } else if (!this.h.isPluginMode) {
        } else {
            this.h.mPlugin.updateVerifyStatusWithScene(str, str2);
        }
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        try {
            String reportFlag = ReportHelper.getReportFlag(ReportHelper.enableMultiCashierFixPolice);
            VerifyLogCat.i("FingerprintCheckActivityTag", "downgradeBgCancelFix config: " + reportFlag);
            return !"Y".equalsIgnoreCase(reportFlag);
        } catch (Throwable th) {
            VerifyLogCat.e("FingerprintCheckActivityTag", "downgradeBgCancelFix exp: ", th);
            return true;
        }
    }

    public void checkByServer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7dbef29", new Object[]{this});
            return;
        }
        if (b()) {
            this.b.set(false);
        }
        VerifyLogCat.i("FingerprintCheckActivityTag", "checkByServer");
        AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.FingerprintCheckActivity.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                JSONObject parseObject;
                String jSONString;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    MICRpcRequest mICRpcRequest = new MICRpcRequest();
                    mICRpcRequest.module = FingerprintCheckActivity.access$600(FingerprintCheckActivity.this).getModuleName();
                    mICRpcRequest.verifyId = FingerprintCheckActivity.access$700(FingerprintCheckActivity.this).getVerifyId();
                    mICRpcRequest.action = "VERIFY_PPW";
                    mICRpcRequest.token = FingerprintCheckActivity.access$800(FingerprintCheckActivity.this).getToken();
                    VerifyLogCat.i("FingerprintCheckActivityTag", "校验数据：" + FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).fingerprintResultData);
                    mICRpcRequest.data = FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).fingerprintResultData;
                    if (FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).multiBio) {
                        String preBioType = FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).getPreBioType();
                        if (!StringUtils.isEmpty(preBioType)) {
                            JSONObject parseObject2 = JSON.parseObject(FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).fingerprintResultData);
                            parseObject2.put("preType", (Object) preBioType);
                            if (FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).isIntelligent) {
                                parseObject2.put("bioPayUsableStrategy", (Object) false);
                            }
                            jSONString = parseObject2.toJSONString();
                        } else if (FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).isIntelligent) {
                            JSONObject parseObject3 = JSON.parseObject(FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).fingerprintResultData);
                            parseObject3.put("bioPayUsableStrategy", (Object) false);
                            jSONString = parseObject3.toJSONString();
                        }
                        mICRpcRequest.data = jSONString;
                    }
                    if (FingerprintCheckActivity.this.hasCancelled.get()) {
                        VerifyLogCat.i("FingerprintCheckActivityTag", "已压后台。不再发rpc了！");
                        return;
                    }
                    if (!FingerprintCheckActivity.access$900(FingerprintCheckActivity.this)) {
                        FingerprintCheckActivity.access$1000(FingerprintCheckActivity.this).set(false);
                    }
                    final MICRpcResponse sendRpcRequest = FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).isPluginMode ? FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).mPlugin.sendRpcRequest(mICRpcRequest) : new MICRpcServiceBiz().dispatch(mICRpcRequest);
                    FingerprintCheckActivity.access$1100(FingerprintCheckActivity.this).set(true);
                    if (sendRpcRequest == null) {
                        FingerprintCheckActivity.access$1700(FingerprintCheckActivity.this);
                        return;
                    }
                    boolean handleZimMessage = FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).handleZimMessage(sendRpcRequest);
                    if (sendRpcRequest.verifySuccess) {
                        if (!StringUtils.isEmpty(sendRpcRequest.data) && sendRpcRequest.data.contains("bicAsyncData") && (parseObject = JSON.parseObject(sendRpcRequest.data)) != null) {
                            AuthenticatorManager.getInstance(FingerprintCheckActivity.this).processAfterAuth(parseObject.getString("bicAsyncData"));
                        }
                        FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).notifyResult(sendRpcRequest, false, FingerprintCheckActivity.access$1600(FingerprintCheckActivity.this).needKeepInside.get());
                    } else if (sendRpcRequest.finish) {
                        String str = sendRpcRequest.verifyMessage;
                        if (StringUtils.isEmpty(str)) {
                            str = FingerprintCheckActivity.this.getResources().getString(R.string.verifyidentity_wrong_data);
                        }
                        FingerprintCheckActivity.this.alert("", str, FingerprintCheckActivity.this.getResources().getString(R.string.verifyidentity_confirm), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.FingerprintCheckActivity.4.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                    return;
                                }
                                FingerprintCheckActivity.this.updateVerifyStatus(BaseFBPlugin.VERIFY_STATUS.abort);
                                FingerprintCheckActivity.access$1200(FingerprintCheckActivity.this).needKeepInside.set(false);
                                FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).notifyResult(sendRpcRequest);
                            }
                        }, null, null);
                    } else if (handleZimMessage) {
                        VerifyLogCat.i("FingerprintCheckActivityTag", "本次RPC返回已交给ZIM处理，核身不做切密码动作");
                    } else {
                        if (FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).isPluginMode) {
                            FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).updateTipToPwd(sendRpcRequest.verifyMessage);
                        } else if (!FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).multiBio || !FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).hasNextBio()) {
                            FingerprintCheckActivity.this.toast(sendRpcRequest.verifyMessage, 0);
                        }
                        FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).logFpResBehavior(sendRpcRequest.verifyCode, "server");
                        if (FingerprintCheckActivity.access$1300(FingerprintCheckActivity.this) && (FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).isFACEID() || FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).isFP())) {
                            FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).buildFpRequestData(FingerprintCheckActivity.access$1400(FingerprintCheckActivity.this), false, InputFrame3.TYPE_RESPONSE, "", 100, sendRpcRequest.verifyMessage);
                            FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).appendPredata();
                        }
                        if (!FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).multiBio) {
                            FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).goToPayPwd();
                        } else if (!FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).hasNextBio()) {
                            FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).goToPayPwd();
                        } else {
                            FingerprintCheckActivity.access$1000(FingerprintCheckActivity.this).set(true);
                            FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).updateTipToPwd("");
                            DataHelper access$000 = FingerprintCheckActivity.access$000(FingerprintCheckActivity.this);
                            access$000.mulitiSourceTo = FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).predata_type + "2" + FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).getNextBioType();
                            FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).logMultiBioBehavior("RPC_FAIL_TO_BIO", FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).predata_type, FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).getNextBioType());
                            if (FingerprintCheckActivity.access$1500(FingerprintCheckActivity.this) != null) {
                                FingerprintCheckActivity.access$1500(FingerprintCheckActivity.this).cancelVerify();
                            }
                            String str2 = FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).predata_type;
                            FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).parseNextBio();
                            final String genErrorMsg = FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).genErrorMsg(str2, FingerprintCheckActivity.this);
                            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.FingerprintCheckActivity.4.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    if (FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).isFP()) {
                                        FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).errorForFp = genErrorMsg;
                                    } else {
                                        FingerprintCheckActivity.this.showNewToast(genErrorMsg, 0);
                                    }
                                    FingerprintCheckActivity.this.handleBio();
                                }
                            });
                        }
                    }
                } catch (RpcException unused) {
                    FingerprintCheckActivity.access$1100(FingerprintCheckActivity.this).set(true);
                    VerifyLogCat.w("FingerprintCheckActivityTag", "upload fingerprint check result got rpc error");
                    FingerprintCheckActivity.access$1700(FingerprintCheckActivity.this);
                }
            }
        }, "VERIFY_FINGERPRINT");
        this.f5898a.postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.FingerprintCheckActivity.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (FingerprintCheckActivity.access$1100(FingerprintCheckActivity.this).get() || FingerprintCheckActivity.this.isFinishing()) {
                    VerifyLogCat.i("FingerprintCheckActivityTag", "rpc已返回，不同再做处理");
                } else {
                    VerifyLogCat.i("FingerprintCheckActivityTag", "1秒后，rpc仍未返回，关弹框，出菊花");
                    if (FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).isPluginMode || FingerprintCheckActivity.access$000(FingerprintCheckActivity.this).isZFACE()) {
                        return;
                    }
                    FingerprintCheckActivity.this.showProgressDialog("");
                }
            }
        }, 1000L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r3.mSafepayChecker != null) goto L20;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onStop() {
        /*
            r3 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.verifyidentity.module.fingerprint.FingerprintCheckActivity.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            r1[r2] = r3
            java.lang.String r2 = "b3dde88"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            super.onStop()
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.hasCancelled
            boolean r0 = r0.getAndSet(r2)
            if (r0 != 0) goto L89
            com.alipay.mobile.verifyidentity.module.utils.DataHelper r0 = r3.h
            boolean r0 = r0.isFP()
            java.lang.String r1 = "FingerprintCheckActivityTag"
            if (r0 == 0) goto L50
            com.alipay.android.phone.seauthenticator.iotauth.authmanager.GlobalAuthenticatorManager r0 = r3.globalAuthenticatorManager
            if (r0 == 0) goto L2f
            r0.stopAuth(r2)
            goto L43
        L2f:
            com.alipay.mobile.verifyidentity.module.fingerprint.FpBaseHelper r0 = r3.d
            if (r0 == 0) goto L3a
            r0.cancelVerify()
            com.alipay.mobile.verifyidentity.module.fingerprint.SafepayChecker r0 = r3.mSafepayChecker
            if (r0 == 0) goto L43
        L3a:
            com.alipay.mobile.verifyidentity.module.fingerprint.SafepayChecker r0 = r3.mSafepayChecker
            com.alipay.android.app.smartpays.api.FingerprintManager r0 = r0.getFingerprintManager(r3)
            r0.cancelVerify()
        L43:
            java.lang.String r0 = "取消指纹校验"
            com.alipay.mobile.verifyidentity.log.VerifyLogCat.i(r1, r0)
            com.alipay.mobile.verifyidentity.module.fingerprint.proxy.GlobalAuthenticatorManagerProxy r0 = r3.n
            if (r0 == 0) goto L50
            r0.cancel()
        L50:
            com.alipay.mobile.verifyidentity.module.utils.DataHelper r0 = r3.h
            boolean r0 = r0.isFACEID()
            if (r0 == 0) goto L78
            boolean r0 = r3.m
            if (r0 == 0) goto L78
            com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager r0 = com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.getInstance(r3)
            r2 = 4
            r0.stopAuth(r3, r2)
            java.lang.String r0 = "停止FACEID校验"
            com.alipay.mobile.verifyidentity.log.VerifyLogCat.i(r1, r0)
            com.alipay.mobile.verifyidentity.module.faceid.FaceIdChecker r0 = r3.f
            if (r0 == 0) goto L71
            r0.cancelVerify()
        L71:
            com.alipay.mobile.verifyidentity.module.fingerprint.proxy.GlobalAuthenticatorManagerProxy r0 = r3.n
            if (r0 == 0) goto L78
            r0.cancel()
        L78:
            com.alipay.mobile.verifyidentity.module.utils.DataHelper r0 = r3.h
            if (r0 == 0) goto L89
            boolean r0 = r0.isZFACE()
            if (r0 == 0) goto L89
            com.alipay.mobile.verifyidentity.module.zface.ZFaceChecker r0 = r3.l
            if (r0 == 0) goto L89
            r0.cancelVerify()
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.module.fingerprint.FingerprintCheckActivity.onStop():void");
    }

    public void showNewToast(CharSequence charSequence, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c9c034", new Object[]{this, charSequence, new Integer(i)});
            return;
        }
        try {
            Toast makeText = Toast.makeText(this, charSequence, i);
            View inflate = LayoutInflater.from(this).inflate(R.layout.simple_toast, (ViewGroup) null);
            ((TextView) inflate.findViewById(R.id.tip_content)).setText(charSequence);
            makeText.setView(inflate);
            makeText.setGravity(17, 0, DensityUtil.dip2px(this, 105.0f));
            makeText.show();
        } catch (Throwable unused) {
            VerifyLogCat.i("FingerprintCheckActivityTag", "toast error");
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        dismissProgressDialog();
        BroadcastReceiver broadcastReceiver = this.fpBroadcastReceiver;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
        if (this.payStatusBroadcastReceiver != null) {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(this.payStatusBroadcastReceiver);
        }
        ZFaceChecker zFaceChecker = this.l;
        if (zFaceChecker != null) {
            zFaceChecker.unRegisterReceiver();
        }
        g.remove(this.mModule.getVerifyId());
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        super.onBackPressed();
        try {
            if (b()) {
                return;
            }
            VerifyLogCat.i("FingerprintCheckActivityTag", "onBackPressed");
            this.h.logBehavior("fpbackpressed", "UC-MobileIC-20221207-1", null);
            updateVerifyStatus(BaseFBPlugin.VERIFY_STATUS.abort);
            this.h.notifyResult(new DefaultModuleResult("1003"));
        } catch (Throwable th) {
            VerifyLogCat.e("FingerprintCheckActivityTag", th);
        }
    }

    public static /* synthetic */ void access$1700(FingerprintCheckActivity fingerprintCheckActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec5c265d", new Object[]{fingerprintCheckActivity});
            return;
        }
        fingerprintCheckActivity.mModule.needKeepInside.set(false);
        fingerprintCheckActivity.b.set(false);
        if (fingerprintCheckActivity.h.isZFACE() && fingerprintCheckActivity.h.zFaceChecker != null) {
            fingerprintCheckActivity.h.zFaceChecker.shutDown();
        }
        if (fingerprintCheckActivity.mModule.getTask().getPluginOrProxyMode()) {
            fingerprintCheckActivity.mMicroModuleContext.notifyAndFinishModule(fingerprintCheckActivity.mModule.getVerifyId(), fingerprintCheckActivity.mModule.getToken(), fingerprintCheckActivity.mModule.getModuleName(), new DefaultModuleResult("2003"));
            VIFBPluginManager.mBackPlugin = null;
            return;
        }
        fingerprintCheckActivity.alert((String) null, fingerprintCheckActivity.getResources().getString(R.string.network_unavailable), fingerprintCheckActivity.getResources().getString(R.string.retry), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.FingerprintCheckActivity.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                } else {
                    FingerprintCheckActivity.access$2100(FingerprintCheckActivity.this).notifyAndFinishModule(FingerprintCheckActivity.access$1800(FingerprintCheckActivity.this).getVerifyId(), FingerprintCheckActivity.access$1900(FingerprintCheckActivity.this).getToken(), FingerprintCheckActivity.access$2000(FingerprintCheckActivity.this).getModuleName(), new DefaultModuleResult("2003"));
                }
            }
        }, fingerprintCheckActivity.getResources().getString(R.string.give_up), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.FingerprintCheckActivity.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                } else {
                    FingerprintCheckActivity.access$2200(FingerprintCheckActivity.this);
                }
            }
        }, (Boolean) false);
    }

    public static /* synthetic */ void access$2200(FingerprintCheckActivity fingerprintCheckActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5f4577", new Object[]{fingerprintCheckActivity});
        } else {
            fingerprintCheckActivity.mMicroModuleContext.notifyAndFinishModule(fingerprintCheckActivity.mModule.getVerifyId(), fingerprintCheckActivity.mModule.getToken(), fingerprintCheckActivity.mModule.getModuleName(), new DefaultModuleResult("1003"));
        }
    }

    public static /* synthetic */ void access$2300(FingerprintCheckActivity fingerprintCheckActivity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f72b1f0b", new Object[]{fingerprintCheckActivity, new Integer(i)});
            return;
        }
        fingerprintCheckActivity.mModule.needKeepInside.set(false);
        VerifyLogCat.i("FingerprintCheckActivityTag", "finishOnUIKept");
        fingerprintCheckActivity.f5898a.postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.FingerprintCheckActivity.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                VerifyLogCat.i("FingerprintCheckActivityTag", "现在关闭手环Activity");
                MicroModuleContext.getInstance().finishModule(FingerprintCheckActivity.access$2400(FingerprintCheckActivity.this).getVerifyId(), FingerprintCheckActivity.access$2500(FingerprintCheckActivity.this).getToken(), FingerprintCheckActivity.access$2600(FingerprintCheckActivity.this).getModuleName());
                if (FingerprintCheckActivity.this.isFinishing()) {
                    return;
                }
                FingerprintCheckActivity.this.finish();
            }
        }, i);
    }
}
