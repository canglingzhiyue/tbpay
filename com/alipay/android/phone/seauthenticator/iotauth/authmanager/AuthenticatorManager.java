package com.alipay.android.phone.seauthenticator.iotauth.authmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.phone.seauthenticator.iotauth.AuthViewManager;
import com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager;
import com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpFullViewDialog;
import com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpNormalAuthDialog;
import com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateDialog;
import com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog;
import com.alipay.security.mobile.agent.managerservice.ServiceImpl;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.util.FingerprintBroadcastUtil;
import com.alipay.security.mobile.api.AuthenticatorApi;
import com.alipay.security.mobile.api.IFAAManagerAdaptor;
import com.alipay.security.mobile.auth.AuthenticatorCallback;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.auth.IAuthenticator;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.alipay.security.mobile.silentop.SilentOpDataHelper;
import com.alipay.security.mobile.silentop.SilentOpManager;
import com.alipay.security.mobile.util.BioBehaviorUtils;
import com.alipay.security.mobile.util.CommonUtils;
import com.alipay.security.mobile.util.ConfigServiceUtil;
import com.alipay.security.mobile.util.TrackEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.ifaa.seccam.b;
import com.taobao.taobao.R;
import tb.czb;

/* loaded from: classes3.dex */
public class AuthenticatorManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static AuthenticatorManager f;
    private Context b;
    private AuthNotify c;
    private BroadcastReceiver d;
    private FaceAuthManager g;

    /* renamed from: a  reason: collision with root package name */
    private final int f5125a = 3;
    private int e = 3;

    /* loaded from: classes3.dex */
    public interface AuthNotify {
        void onAuthDone(Context context);

        void onAuthFail(Context context);

        void onAuthNoMatch(Context context);

        void onAuthNoMatchTooMuch(Context context);

        void onAuthSuccess(Context context);

        void onAuthTimeout(Context context);

        void onCompleteAuth(Context context);

        void onProcessAuth(Context context);

        void onStartAuth(Context context);
    }

    /* loaded from: classes3.dex */
    public interface Callback {
        void onResult(AuthenticatorResponse authenticatorResponse);
    }

    public static /* synthetic */ AuthNotify a(AuthenticatorManager authenticatorManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AuthNotify) ipChange.ipc$dispatch("48cb4cdd", new Object[]{authenticatorManager}) : authenticatorManager.c;
    }

    public static /* synthetic */ int b(AuthenticatorManager authenticatorManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68e9ddc8", new Object[]{authenticatorManager})).intValue();
        }
        int i = authenticatorManager.e;
        authenticatorManager.e = i - 1;
        return i;
    }

    public static /* synthetic */ int c(AuthenticatorManager authenticatorManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cb44f4a7", new Object[]{authenticatorManager})).intValue() : authenticatorManager.e;
    }

    public static /* synthetic */ BroadcastReceiver d(AuthenticatorManager authenticatorManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BroadcastReceiver) ipChange.ipc$dispatch("dfe95aca", new Object[]{authenticatorManager}) : authenticatorManager.d;
    }

    public static /* synthetic */ Context e(AuthenticatorManager authenticatorManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("36c3cb6a", new Object[]{authenticatorManager}) : authenticatorManager.b;
    }

    public static synchronized AuthenticatorManager getInstance(Context context) {
        synchronized (AuthenticatorManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AuthenticatorManager) ipChange.ipc$dispatch("7d0e3044", new Object[]{context});
            }
            if (f == null && context != null) {
                f = new AuthenticatorManager(context.getApplicationContext());
            }
            return f;
        }
    }

    private AuthenticatorManager(Context context) {
        this.b = context;
        if ("off".equals(ConfigServiceUtil.syncConfigMode(ConfigServiceUtil.KEY_AIDL_MANAGER_SWITCH, "")) || Build.VERSION.SDK_INT < 28) {
            AuthenticatorLOG.fpInfo("AuthenticatorManager  aidl :: get instance.");
            return;
        }
        AuthenticatorLOG.fpInfo("AuthenticatorManager aidl :: ifaa create AuthenticatorManager");
        ServiceImpl.getInstance(context);
    }

    private FaceAuthManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FaceAuthManager) ipChange.ipc$dispatch("68250924", new Object[]{this});
        }
        if (this.g == null) {
            this.g = FaceAuthManager.getInstance(this.b);
        }
        return this.g;
    }

    public synchronized String getSecData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d285eb2a", new Object[]{this, str});
        }
        TrackEvent.mUserId = str;
        return AuthenticatorApi.getRegAuthData(this.b, 0, 0, str);
    }

    public synchronized int startBioManager(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("656a1c28", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 1) {
            IAuthenticator create = AuthenticatorApi.create(this.b, 1);
            if (create != null) {
                create.process(new AuthenticatorMessage(16, 0));
                return 0;
            }
        } else if (i == 4) {
            a().startBioManager();
            return 0;
        }
        return 111;
    }

    public synchronized boolean hasEnroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cce33780", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i == 1) {
            IAuthenticator create = AuthenticatorApi.create(this.b, 1);
            if (create != null) {
                return create.registedFingerPrintNumber() > 0;
            }
        } else if (i == 4) {
            return a().hasEnroll();
        }
        return false;
    }

    public void stopAuth(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("250f4097", new Object[]{this, context});
            return;
        }
        try {
            AuthenticatorLOG.fpInfo("cancel on background");
            IAuthenticator create = AuthenticatorApi.create(context, 1);
            if (create != null) {
                create.cancel();
            }
            if (this.c == null) {
                return;
            }
            this.c.onCompleteAuth(context);
        } catch (Exception e) {
            AuthenticatorLOG.fpInfo(e.toString());
        }
    }

    public synchronized void stopAuth(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd9454c", new Object[]{this, context, new Integer(i)});
        } else if (i == Constants.TYPE_FINGERPRINT) {
            AuthenticatorLOG.fpInfo("cancel on background");
            IAuthenticator create = AuthenticatorApi.create(context, 1);
            if (create != null) {
                create.cancel();
            }
            if (this.c != null) {
                this.c.onCompleteAuth(context);
            }
        } else {
            if (i == Constants.TYPE_FACE) {
                a().cancel();
            }
        }
    }

    public synchronized int startAuth(final Context context, final AuthenticatorMessage authenticatorMessage, final Callback callback, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae0cc09e", new Object[]{this, context, authenticatorMessage, callback, str})).intValue();
        }
        PreDataHelper.getInstance().initClientText(str);
        if (authenticatorMessage.getAuthenticatorType() == 1) {
            BioBehaviorUtils.getInstance().add(authenticatorMessage, "start auth");
            final IAuthenticator create = AuthenticatorApi.create(this.b, 1);
            if (authenticatorMessage.getType() == 2 && IFAAManagerAdaptor.isIgnoreFpIndex(this.b)) {
                create.process(authenticatorMessage, new AuthenticatorCallback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.security.mobile.auth.AuthenticatorCallback
                    public void callback(AuthenticatorResponse authenticatorResponse) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e8b9fa1b", new Object[]{this, authenticatorResponse});
                            return;
                        }
                        callback.onResult(authenticatorResponse);
                        create.cancel();
                    }
                });
            } else if (authenticatorMessage.getType() == 2 || authenticatorMessage.getType() == 3) {
                this.e = 3;
                AuthenticatorLOG.fpInfo("start to call startAuth...");
                AuthenticatorCallback authenticatorCallback = new AuthenticatorCallback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.security.mobile.auth.AuthenticatorCallback
                    public void callback(AuthenticatorResponse authenticatorResponse) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e8b9fa1b", new Object[]{this, authenticatorResponse});
                            return;
                        }
                        int result = authenticatorResponse.getResult();
                        if (result == 100) {
                            AuthenticatorManager.a(AuthenticatorManager.this).onAuthDone(context);
                        } else if (result == 101) {
                            AuthenticatorManager.a(AuthenticatorManager.this).onAuthFail(context);
                        } else if (result == 103) {
                            AuthenticatorManager.b(AuthenticatorManager.this);
                            if (AuthenticatorManager.c(AuthenticatorManager.this) > 0) {
                                AuthenticatorManager.a(AuthenticatorManager.this).onAuthNoMatch(context);
                                create.cancel();
                                create.process(authenticatorMessage, this);
                            } else {
                                AuthenticatorManager.a(AuthenticatorManager.this).onAuthNoMatch(context);
                            }
                        } else if (result == 113) {
                            AuthenticatorManager.a(AuthenticatorManager.this).onAuthTimeout(context);
                        } else if (result == 129) {
                            AuthenticatorManager.a(AuthenticatorManager.this).onAuthNoMatchTooMuch(context);
                        }
                        if ((authenticatorResponse.getResult() == 103 && AuthenticatorManager.c(AuthenticatorManager.this) > 0) || authenticatorResponse.getResult() == 102) {
                            return;
                        }
                        callback.onResult(authenticatorResponse);
                        AuthenticatorManager.a(AuthenticatorManager.this).onCompleteAuth(context);
                        create.cancel();
                        AuthenticatorManager.e(AuthenticatorManager.this).unregisterReceiver(AuthenticatorManager.d(AuthenticatorManager.this));
                    }
                };
                this.d = new BroadcastReceiver() { // from class: com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context2, Intent intent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                            return;
                        }
                        int intExtra = intent.getIntExtra("com.alipay.security.mobile.alipayauthenticatorservice.broadcast.FINGERPRINTSENSOR_STATUS_VALUE", 0);
                        if (intExtra == 1) {
                            return;
                        }
                        if (intExtra == 2) {
                            AuthenticatorManager.a(AuthenticatorManager.this).onProcessAuth(context);
                        } else if (intExtra != 100) {
                        } else {
                            AuthenticatorManager.a(AuthenticatorManager.this).onAuthSuccess(context);
                        }
                    }
                };
                this.b.registerReceiver(this.d, FingerprintBroadcastUtil.getIdentifyChangeBroadcastFilter());
                if (create != null) {
                    this.c = a(context, 1, authenticatorMessage, create, str, callback);
                    if (this.c != null) {
                        create.process(authenticatorMessage, authenticatorCallback);
                        return 0;
                    }
                }
            }
        } else if (authenticatorMessage.getAuthenticatorType() == 4) {
            return a().startAuth(context, authenticatorMessage, callback, str);
        }
        return 111;
    }

    private AuthNotify a(Context context, int i, final AuthenticatorMessage authenticatorMessage, final IAuthenticator iAuthenticator, String str, final Callback callback) {
        IBiometricValidateDialog fpFullViewDialog;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuthNotify) ipChange.ipc$dispatch("c4d03649", new Object[]{this, context, new Integer(i), authenticatorMessage, iAuthenticator, str, callback});
        }
        if (i != 1) {
            return null;
        }
        if (authenticatorMessage.getType() != 2 && authenticatorMessage.getType() != 3) {
            return null;
        }
        AuthenticatorLOG.fpInfo(str);
        if (authenticatorMessage.getUiType() != 1 || "off".equalsIgnoreCase(ConfigServiceUtil.syncConfigMode(ConfigServiceUtil.KEY_BIO_NEW_UI, ""))) {
            if (CommonUtils.isBlank(AuthenticatorApi.getFingerprintExtInfo(context))) {
                AuthenticatorLOG.fpInfo("normal auth");
                fpFullViewDialog = new FpNormalAuthDialog();
            } else {
                AuthenticatorLOG.fpInfo("fullscreen auth");
                fpFullViewDialog = new FpFullViewDialog();
            }
            fpFullViewDialog.showDialog(context, 1, context.getString(R.string.fp_auth_start_title), new IBiometricValidateDialog.IDialogActionListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateDialog.IDialogActionListener
                public void onAction(int i2) {
                    String str2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("781efb87", new Object[]{this, new Integer(i2)});
                        return;
                    }
                    AuthenticatorLOG.fpInfo("action: " + i2);
                    if (i2 == 1) {
                        str2 = "user cancel";
                    } else if (i2 != 2) {
                        if (i2 == 3) {
                            str2 = "fallback";
                        }
                        iAuthenticator.cancel();
                        AuthenticatorResponse authenticatorResponse = new AuthenticatorResponse(1, 1);
                        authenticatorResponse.setResult(102);
                        callback.onResult(authenticatorResponse);
                    } else {
                        str2 = "system cancel";
                    }
                    AuthenticatorLOG.fpInfo(str2);
                    iAuthenticator.cancel();
                    AuthenticatorResponse authenticatorResponse2 = new AuthenticatorResponse(1, 1);
                    authenticatorResponse2.setResult(102);
                    callback.onResult(authenticatorResponse2);
                }
            });
            return fpFullViewDialog;
        }
        IBiometricValidateNewDialog authDialog = AuthViewManager.getAuthDialog(context);
        authDialog.showDialog(1, context.getString(R.string.fp_auth_start_title), authenticatorMessage.getSwitchBtnType(), new IBiometricValidateNewDialog.IDialogActionListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
            @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog.IDialogActionListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onAction(int r7) {
                /*
                    r6 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.AnonymousClass5.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1a
                    java.lang.Object[] r1 = new java.lang.Object[r2]
                    r2 = 0
                    r1[r2] = r6
                    java.lang.Integer r2 = new java.lang.Integer
                    r2.<init>(r7)
                    r1[r3] = r2
                    java.lang.String r7 = "781efb87"
                    r0.ipc$dispatch(r7, r1)
                    return
                L1a:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "action: "
                    r0.append(r1)
                    r0.append(r7)
                    java.lang.String r0 = r0.toString()
                    com.alipay.security.mobile.auth.AuthenticatorLOG.fpInfo(r0)
                    r0 = 4
                    r1 = 3
                    if (r7 == r3) goto L5d
                    if (r7 == r2) goto L59
                    if (r7 == r1) goto L48
                    if (r7 == r0) goto L39
                    goto L6c
                L39:
                    java.lang.String r2 = "switch_other"
                    com.alipay.security.mobile.auth.AuthenticatorLOG.fpInfo(r2)
                    com.alipay.security.mobile.util.BioBehaviorUtils r2 = com.alipay.security.mobile.util.BioBehaviorUtils.getInstance()
                    com.alipay.security.mobile.auth.message.AuthenticatorMessage r4 = r2
                    java.lang.String r5 = "change to other"
                    goto L55
                L48:
                    java.lang.String r2 = "fallback"
                    com.alipay.security.mobile.auth.AuthenticatorLOG.fpInfo(r2)
                    com.alipay.security.mobile.util.BioBehaviorUtils r2 = com.alipay.security.mobile.util.BioBehaviorUtils.getInstance()
                    com.alipay.security.mobile.auth.message.AuthenticatorMessage r4 = r2
                    java.lang.String r5 = "change to pwd"
                L55:
                    r2.add(r4, r5)
                    goto L6c
                L59:
                    java.lang.String r2 = "system cancel"
                    goto L60
                L5d:
                    java.lang.String r2 = "user cancel"
                L60:
                    com.alipay.security.mobile.auth.AuthenticatorLOG.fpInfo(r2)
                    com.alipay.security.mobile.util.BioBehaviorUtils r4 = com.alipay.security.mobile.util.BioBehaviorUtils.getInstance()
                    com.alipay.security.mobile.auth.message.AuthenticatorMessage r5 = r2
                    r4.add(r5, r2)
                L6c:
                    com.alipay.security.mobile.auth.IAuthenticator r2 = r3
                    r2.cancel()
                    com.alipay.security.mobile.auth.message.AuthenticatorResponse r2 = new com.alipay.security.mobile.auth.message.AuthenticatorResponse
                    r2.<init>(r3, r3)
                    if (r7 != r0) goto L7e
                    r7 = 135(0x87, float:1.89E-43)
                L7a:
                    r2.setResult(r7)
                    goto L86
                L7e:
                    if (r7 != r1) goto L83
                    r7 = 121(0x79, float:1.7E-43)
                    goto L7a
                L83:
                    r7 = 102(0x66, float:1.43E-43)
                    goto L7a
                L86:
                    com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager$Callback r7 = r4
                    r7.onResult(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.AnonymousClass5.onAction(int):void");
            }
        });
        return authDialog;
    }

    public int startDeReg(Context context, String str, int i, AuthenticatorCallback authenticatorCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73524465", new Object[]{this, context, str, new Integer(i), authenticatorCallback})).intValue();
        }
        IAuthenticator create = AuthenticatorApi.create(context, i);
        if (create == null) {
            return -1;
        }
        create.process(new AuthenticatorMessage(4, 2, str), authenticatorCallback);
        return 0;
    }

    public synchronized void processAfterAuth(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37de7cc6", new Object[]{this, str});
        } else if ("off".equals(ConfigServiceUtil.syncConfigMode(ConfigServiceUtil.KEY_IFAA_SILENT_REG, ""))) {
        } else {
            AuthenticatorLOG.fpInfo("processAfterAuth:" + str);
            if (SilentOpDataHelper.getInstance().initData(str)) {
                SilentOpManager.doSilentOp(this.b);
                return;
            }
            AuthenticatorLOG.fpInfo("silent op,initData error, bicAsyncData " + str);
        }
    }

    public static synchronized String getSecCamData(Context context) {
        synchronized (AuthenticatorManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2cbd5b9d", new Object[]{context});
            }
            return b.a().a(context);
        }
    }

    public static synchronized void startSecCamH5Auth(Context context, String str, czb czbVar) {
        synchronized (AuthenticatorManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7214bcdb", new Object[]{context, str, czbVar});
            } else if (czbVar == null || context == null || StringUtils.isEmpty(str)) {
                czbVar.authResult(-2, "parameter is null");
            } else {
                try {
                    b.a().a(context, str, czbVar);
                } catch (Exception unused) {
                    czbVar.authResult(-1, "face logic error.");
                }
            }
        }
    }
}
