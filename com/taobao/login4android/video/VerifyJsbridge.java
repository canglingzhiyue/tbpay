package com.taobao.login4android.video;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.helper.DialogHelper;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.FingerprintService;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.verify.VerifyApi;
import com.ali.user.mobile.verify.model.VerifyParam;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.constants.LoginEnvType;
import com.taobao.login4android.login.LoginController;
import com.taobao.login4android.session.constants.SessionConstants;
import com.taobao.taobao.R;
import java.util.Properties;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes7.dex */
public class VerifyJsbridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private BroadcastReceiver mLoginReceiver;
    private WVCallBackContext mCallback = null;
    private final String TAG = "loginsdk.JSBridgeService";

    /* renamed from: com.taobao.login4android.video.VerifyJsbridge$7  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass7 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18000a = new int[LoginAction.values().length];

        static {
            try {
                f18000a[LoginAction.NOTIFY_IV_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18000a[LoginAction.NOTIFY_IV_FAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        kge.a(-103163299);
    }

    public static /* synthetic */ Object ipc$super(VerifyJsbridge verifyJsbridge, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(VerifyJsbridge verifyJsbridge, WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2462b234", new Object[]{verifyJsbridge, wVCallBackContext, str});
        } else {
            verifyJsbridge.successCallback(wVCallBackContext, str);
        }
    }

    public static /* synthetic */ Context access$100(VerifyJsbridge verifyJsbridge) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("9204dc4", new Object[]{verifyJsbridge}) : verifyJsbridge.mContext;
    }

    public static /* synthetic */ Context access$200(VerifyJsbridge verifyJsbridge) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("22219f63", new Object[]{verifyJsbridge}) : verifyJsbridge.mContext;
    }

    public static /* synthetic */ void access$300(VerifyJsbridge verifyJsbridge, WVCallBackContext wVCallBackContext, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8c750d2", new Object[]{verifyJsbridge, wVCallBackContext, str, new Integer(i)});
        } else {
            verifyJsbridge.errorCallback(wVCallBackContext, str, i);
        }
    }

    public static /* synthetic */ WVCallBackContext access$400(VerifyJsbridge verifyJsbridge) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVCallBackContext) ipChange.ipc$dispatch("bdf814ca", new Object[]{verifyJsbridge}) : verifyJsbridge.mCallback;
    }

    public static /* synthetic */ void access$500(VerifyJsbridge verifyJsbridge, WVCallBackContext wVCallBackContext, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e770168", new Object[]{verifyJsbridge, wVCallBackContext, new Integer(i), str});
        } else {
            verifyJsbridge.ivErrorCallback(wVCallBackContext, i, str);
        }
    }

    public static void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
            return;
        }
        try {
            q.a("aluVerifyJSBridge", (Class<? extends e>) VerifyJsbridge.class);
        } catch (Exception unused) {
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!StringUtils.isEmpty(str)) {
            UserTrackAdapter.sendUT(str);
        }
        if ("supportBiometricType".equals(str)) {
            supportBiometricType(wVCallBackContext);
        } else if ("openBiometric".equals(str)) {
            openBiometric(str2, wVCallBackContext);
        } else if ("closeBiometric".equals(str)) {
            closeBiometric(str2, wVCallBackContext);
        } else if ("checkBiometricStatus".equals(str)) {
            checkBiometricStatus(str2, wVCallBackContext);
        } else if ("biometricIV".equals(str)) {
            biometricIV(str2, wVCallBackContext);
        } else if ("aluApplyIVToken".equals(str)) {
            applyIVToken(str2, wVCallBackContext);
        } else if (!"checkEnv".equals(str)) {
            return false;
        } else {
            if (wVCallBackContext != null) {
                wVCallBackContext.success();
            }
        }
        return true;
    }

    private synchronized void checkBiometricStatus(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcca3970", new Object[]{this, str, wVCallBackContext});
            return;
        }
        r rVar = new r();
        String optString = new JSONObject(str).optString(SessionConstants.BIOMETRIC);
        if (ServiceFactory.getService(FingerprintService.class) != null) {
            if (!StringUtils.isEmpty(SecurityGuardManagerWraper.getFingerValue(optString))) {
                if (wVCallBackContext != null) {
                    rVar.a("supportBiometricType", MspFlybirdDefine.FLYBIRD_SETTING_FINGERPRINT);
                    wVCallBackContext.success(rVar);
                }
                return;
            }
            rVar.a("code", (Object) 4021);
        }
        if (wVCallBackContext != null) {
            wVCallBackContext.error(rVar);
        }
    }

    private synchronized void biometricIV(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c31ef0f3", new Object[]{this, str, wVCallBackContext});
            return;
        }
        final r rVar = new r();
        String optString = new JSONObject(str).optString(SessionConstants.BIOMETRIC);
        if (ServiceFactory.getService(FingerprintService.class) != null) {
            final String fingerValue = SecurityGuardManagerWraper.getFingerValue(optString);
            if (!StringUtils.isEmpty(fingerValue)) {
                ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).fingerIV(this.mContext, new CommonCallback() { // from class: com.taobao.login4android.video.VerifyJsbridge.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.model.CommonCallback
                    public void onSuccess() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                            return;
                        }
                        rVar.a("biometricKey", fingerValue);
                        WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                        if (wVCallBackContext2 == null) {
                            return;
                        }
                        wVCallBackContext2.success(rVar);
                    }

                    @Override // com.ali.user.mobile.model.CommonCallback
                    public void onFail(int i, String str2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str2});
                            return;
                        }
                        rVar.a("code", Integer.valueOf(i));
                        WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                        if (wVCallBackContext2 == null) {
                            return;
                        }
                        wVCallBackContext2.error(rVar);
                    }
                });
                return;
            }
            rVar.a("code", (Object) 4021);
        }
        if (wVCallBackContext != null) {
            wVCallBackContext.error(rVar);
        }
    }

    private synchronized void supportBiometricType(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("793eadc7", new Object[]{this, wVCallBackContext});
            return;
        }
        r rVar = new r();
        rVar.a("HY_SUCCESS");
        if (ServiceFactory.getService(FingerprintService.class) != null && ((FingerprintService) ServiceFactory.getService(FingerprintService.class)).isFingerprintSetable()) {
            rVar.a("supportBiometricType", MspFlybirdDefine.FLYBIRD_SETTING_FINGERPRINT);
        } else {
            rVar.a("supportBiometricType", "");
        }
        if (wVCallBackContext != null) {
            wVCallBackContext.success(rVar);
        }
    }

    private synchronized void openBiometric(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e25b9b5c", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            final VerifyParam buildVerifyParam = buildVerifyParam(str);
            UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.OPEN_BIO_C, buildVerifyParam.requestScene, buildVerifyParam.requestScene, null);
            VerifyApi.openBiometric(this.mContext, buildVerifyParam, new CommonCallback() { // from class: com.taobao.login4android.video.VerifyJsbridge.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.model.CommonCallback
                public void onSuccess() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                        return;
                    }
                    UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.OPEN_BIO_S, buildVerifyParam.requestScene, buildVerifyParam.requestScene, null);
                    VerifyJsbridge.access$000(VerifyJsbridge.this, wVCallBackContext, "openBiometric");
                }

                @Override // com.ali.user.mobile.model.CommonCallback
                public void onFail(int i, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str2});
                        return;
                    }
                    UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.OPEN_BIO_F, buildVerifyParam.requestScene, buildVerifyParam.requestScene, null);
                    if (i == 4004) {
                        if (!(VerifyJsbridge.access$100(VerifyJsbridge.this) instanceof Activity)) {
                            return;
                        }
                        final Activity activity = (Activity) VerifyJsbridge.access$200(VerifyJsbridge.this);
                        new DialogHelper(activity).alert("", activity.getString(R.string.aliuser_finger_not_roll), activity.getString(R.string.aliuser_finger_go_set), new DialogInterface.OnClickListener() { // from class: com.taobao.login4android.video.VerifyJsbridge.5.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                                    return;
                                }
                                VerifyJsbridge.access$300(VerifyJsbridge.this, wVCallBackContext, "openBiometricGoSetting", 4002);
                                VerifyJsbridge.goSettings(activity);
                            }
                        }, activity.getString(R.string.aliuser_cancel), new DialogInterface.OnClickListener() { // from class: com.taobao.login4android.video.VerifyJsbridge.5.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                                } else {
                                    VerifyJsbridge.access$300(VerifyJsbridge.this, wVCallBackContext, "openBiometricCancelSetting", 4002);
                                }
                            }
                        });
                        return;
                    }
                    VerifyJsbridge.access$300(VerifyJsbridge.this, wVCallBackContext, "openBiometric", i);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            UserTrackAdapter.sendUT(UTConstant.CustomEvent.OPEN_BIO_S);
            errorCallback(wVCallBackContext, "openBiometric", 4003);
        }
    }

    public static VerifyParam buildVerifyParam(String str) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerifyParam) ipChange.ipc$dispatch("9775b46e", new Object[]{str});
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString(SessionConstants.BIOMETRIC);
        String string = jSONObject.getString("requestScene");
        String string2 = jSONObject.getString("biometricType");
        String optString2 = jSONObject.optString("token");
        VerifyParam verifyParam = new VerifyParam();
        verifyParam.biometricId = optString;
        verifyParam.requestScene = string;
        verifyParam.biometricType = string2;
        verifyParam.loginToken = optString2;
        return verifyParam;
    }

    private synchronized void closeBiometric(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e152a8ee", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            final VerifyParam buildVerifyParam = buildVerifyParam(str);
            UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.CLOSE_BIO_C, buildVerifyParam.requestScene, buildVerifyParam.requestScene, null);
            VerifyApi.closeBiometric(buildVerifyParam, new CommonCallback() { // from class: com.taobao.login4android.video.VerifyJsbridge.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.model.CommonCallback
                public void onSuccess() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                        return;
                    }
                    UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.CLOSE_BIO_S, buildVerifyParam.requestScene, buildVerifyParam.requestScene, null);
                    VerifyJsbridge.access$000(VerifyJsbridge.this, wVCallBackContext, "closeBiometric");
                }

                @Override // com.ali.user.mobile.model.CommonCallback
                public void onFail(int i, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str2});
                        return;
                    }
                    UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.CLOSE_BIO_F, buildVerifyParam.requestScene, buildVerifyParam.requestScene, null);
                    VerifyJsbridge.access$300(VerifyJsbridge.this, wVCallBackContext, "closeBiometric", i);
                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
            errorCallback(wVCallBackContext, "closeBiometric", 4010);
        }
    }

    private synchronized void applyIVToken(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aec3276c", new Object[]{this, str, wVCallBackContext});
            return;
        }
        this.mCallback = wVCallBackContext;
        try {
            String string = new JSONObject(str).getString("actionType");
            if (this.mWebView != null) {
                try {
                    String host = Uri.parse(this.mWebView.getUrl()).getHost();
                    if (DataProviderFactory.getDataProvider().getEnvType() == LoginEnvType.ONLINE.getSdkEnvType() && !host.endsWith(".taobao.com") && !host.endsWith(".tmall.com")) {
                        ivErrorCallback(wVCallBackContext, -3, "invalid host");
                        return;
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            if (this.mLoginReceiver == null) {
                this.mLoginReceiver = new BroadcastReceiver() { // from class: com.taobao.login4android.video.VerifyJsbridge.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        } else if (intent == null) {
                        } else {
                            int i = AnonymousClass7.f18000a[LoginAction.valueOf(intent.getAction()).ordinal()];
                            if (i != 1) {
                                if (i != 2) {
                                    return;
                                }
                                VerifyJsbridge.access$500(VerifyJsbridge.this, wVCallBackContext, intent.getIntExtra("errorCode", 1100), intent.getStringExtra("message"));
                                return;
                            }
                            String stringExtra = intent.getStringExtra("token");
                            if (StringUtils.isEmpty(stringExtra)) {
                                VerifyJsbridge.access$500(VerifyJsbridge.this, wVCallBackContext, -2, "empty token");
                                return;
                            }
                            r rVar = new r();
                            rVar.a("HY_SUCCESS");
                            rVar.a("token", stringExtra);
                            if (VerifyJsbridge.access$400(VerifyJsbridge.this) == null) {
                                return;
                            }
                            VerifyJsbridge.access$400(VerifyJsbridge.this).success(rVar);
                        }
                    }
                };
                LoginBroadcastHelper.registerLoginReceiver(DataProviderFactory.getApplicationContext(), this.mLoginReceiver);
            }
            LoginController.getInstance().navToIVByScene(DataProviderFactory.getApplicationContext(), string, DataProviderFactory.getDataProvider().getSite());
        } catch (Exception unused) {
            ivErrorCallback(wVCallBackContext, -1, "error param");
        }
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        if (this.mLoginReceiver != null) {
            LoginBroadcastHelper.unregisterLoginReceiver(DataProviderFactory.getApplicationContext(), this.mLoginReceiver);
            this.mLoginReceiver = null;
        }
        this.mCallback = null;
        super.onDestroy();
    }

    private void successCallback(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46e15676", new Object[]{this, wVCallBackContext, str});
            return;
        }
        r rVar = new r();
        rVar.a("HY_SUCCESS");
        rVar.a(ChangeAppIconBridge.KEY_DEVICEMODEL, Build.MODEL);
        wVCallBackContext.success(rVar);
        Properties properties = new Properties();
        properties.put(UTConstant.Args.UT_PROPERTY_SUCCESS, "T");
        if (StringUtils.isEmpty(str)) {
            return;
        }
        UserTrackAdapter.sendUT(str, properties);
    }

    private void errorCallback(WVCallBackContext wVCallBackContext, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93a9f128", new Object[]{this, wVCallBackContext, str, new Integer(i)});
            return;
        }
        r rVar = new r();
        rVar.a("HY_FAILED");
        rVar.a("code", Integer.valueOf(i));
        rVar.a(ChangeAppIconBridge.KEY_DEVICEMODEL, Build.MODEL);
        wVCallBackContext.error(rVar);
        Properties properties = new Properties();
        properties.put(UTConstant.Args.UT_PROPERTY_SUCCESS, UTConstant.Args.UT_SUCCESS_F);
        properties.put("code", Integer.valueOf(i));
        if (StringUtils.isEmpty(str)) {
            return;
        }
        UserTrackAdapter.sendUT(str, properties);
    }

    private void ivErrorCallback(WVCallBackContext wVCallBackContext, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43734309", new Object[]{this, wVCallBackContext, new Integer(i), str});
            return;
        }
        r rVar = new r();
        rVar.a("HY_FAILED");
        rVar.a("code", Integer.valueOf(i));
        rVar.a("message", str);
        wVCallBackContext.error(rVar);
    }

    public static void goSettings(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdaa2204", new Object[]{activity});
        } else if (activity == null) {
        } else {
            try {
                activity.startActivity(new Intent("android.settings.SETTINGS"));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
