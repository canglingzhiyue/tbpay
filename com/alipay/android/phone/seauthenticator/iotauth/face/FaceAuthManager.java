package com.alipay.android.phone.seauthenticator.iotauth.face;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.alibaba.security.ccrc.service.build.X;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager;
import com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintManagerAdapter;
import com.alipay.security.mobile.api.BICDataModel;
import com.alipay.security.mobile.api.IFAAManagerAdaptor;
import com.alipay.security.mobile.auth.AuthenticatorFactory;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.auth.IAuthenticator;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.alipay.security.mobile.face.FaceAuthenticatorAdapter;
import com.alipay.security.mobile.ifaa.auth.FaceAuthenticator;
import com.alipay.security.mobile.ifaa.auth.IAuthenticator;
import com.alipay.security.mobile.util.CommonUtils;
import com.alipay.security.mobile.util.ConfigServiceUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class FaceAuthManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static FaceAuthManager g;
    private IAuthenticator f;
    private FaceAuthDialog i;
    private final int b = 3;
    private int c = 3;
    private boolean d = false;
    public boolean startCheck = false;
    private AtomicBoolean e = new AtomicBoolean(false);
    private boolean h = true;

    /* renamed from: a  reason: collision with root package name */
    private FaceAuthenticator f5159a = new FaceAuthenticator();

    public static /* synthetic */ int a(FaceAuthManager faceAuthManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7663f792", new Object[]{faceAuthManager, new Integer(i)})).intValue();
        }
        faceAuthManager.c = i;
        return i;
    }

    public static /* synthetic */ FaceAuthDialog a(FaceAuthManager faceAuthManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FaceAuthDialog) ipChange.ipc$dispatch("7984f441", new Object[]{faceAuthManager}) : faceAuthManager.i;
    }

    public static /* synthetic */ boolean a(FaceAuthManager faceAuthManager, AuthenticatorMessage authenticatorMessage, AuthenticatorManager.Callback callback, IAuthenticator.Callback callback2, FaceAnimationManager faceAnimationManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("68f63582", new Object[]{faceAuthManager, authenticatorMessage, callback, callback2, faceAnimationManager})).booleanValue() : faceAuthManager.a(authenticatorMessage, callback, callback2, faceAnimationManager);
    }

    public static /* synthetic */ boolean a(FaceAuthManager faceAuthManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76643774", new Object[]{faceAuthManager, new Boolean(z)})).booleanValue();
        }
        faceAuthManager.d = z;
        return z;
    }

    public static /* synthetic */ int b(FaceAuthManager faceAuthManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2d22a536", new Object[]{faceAuthManager})).intValue() : faceAuthManager.c;
    }

    public static /* synthetic */ boolean c(FaceAuthManager faceAuthManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6f39d2a6", new Object[]{faceAuthManager})).booleanValue() : faceAuthManager.d;
    }

    public static /* synthetic */ AtomicBoolean d(FaceAuthManager faceAuthManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("6f89e401", new Object[]{faceAuthManager}) : faceAuthManager.e;
    }

    public static /* synthetic */ FaceAuthenticator e(FaceAuthManager faceAuthManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FaceAuthenticator) ipChange.ipc$dispatch("26a42db9", new Object[]{faceAuthManager}) : faceAuthManager.f5159a;
    }

    public static FaceAuthManager getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FaceAuthManager) ipChange.ipc$dispatch("2cb3b532", new Object[]{context});
        }
        if (g == null) {
            g = new FaceAuthManager(context);
        }
        return g;
    }

    private FaceAuthManager(Context context) {
        this.f5159a.init(context);
    }

    public int startBioManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb036881", new Object[]{this})).intValue();
        }
        this.f5159a.startBIOManager();
        return 0;
    }

    public boolean hasEnroll() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2fe6486b", new Object[]{this})).booleanValue() : this.f5159a.hasEnroll();
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else {
            this.f5159a.cancel();
        }
    }

    public int startAuth(final Context context, final AuthenticatorMessage authenticatorMessage, final AuthenticatorManager.Callback callback, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae0cc09e", new Object[]{this, context, authenticatorMessage, callback, str})).intValue();
        }
        AuthenticatorLOG.faceInfo("call FaceAuthManager start Auth");
        this.c = 3;
        this.d = false;
        this.startCheck = false;
        a();
        if (authenticatorMessage.getType() == 2) {
            this.f5159a.register(authenticatorMessage, new IAuthenticator.Callback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.security.mobile.ifaa.auth.IAuthenticator.Callback
                public void onAuthStatus(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("50675803", new Object[]{this, new Integer(i)});
                    }
                }

                @Override // com.alipay.security.mobile.ifaa.auth.IAuthenticator.Callback
                public void onResult(AuthenticatorResponse authenticatorResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("688a9824", new Object[]{this, authenticatorResponse});
                    } else {
                        callback.onResult(authenticatorResponse);
                    }
                }
            });
            return 111;
        } else if (authenticatorMessage.getType() != 3) {
            return 111;
        } else {
            if (authenticatorMessage == null || CommonUtils.isBlank(authenticatorMessage.getData())) {
                AuthenticatorLOG.faceInfo(X.a.d);
                AuthenticatorResponse authenticatorResponse = new AuthenticatorResponse(authenticatorMessage.getType(), authenticatorMessage.getVersion(), null);
                authenticatorResponse.setResult(101);
                callback.onResult(authenticatorResponse);
                return 101;
            }
            final FaceAnimationManager faceAnimationManager = FaceAuthActivity.animationCall;
            this.d = false;
            this.e.getAndSet(false);
            final ConditionVariable conditionVariable = new ConditionVariable();
            conditionVariable.close();
            final IAuthenticator.Callback callback2 = new IAuthenticator.Callback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.security.mobile.ifaa.auth.IAuthenticator.Callback
                public void onResult(AuthenticatorResponse authenticatorResponse2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("688a9824", new Object[]{this, authenticatorResponse2});
                        return;
                    }
                    int result = authenticatorResponse2.getResult();
                    if (result == 100) {
                        FaceAuthManager.a(FaceAuthManager.this, true);
                        if (FaceAuthManager.a(FaceAuthManager.this) != null) {
                            FaceAuthManager.a(FaceAuthManager.this).onAuthSuccess(context);
                        }
                        faceAnimationManager.updateUI(3);
                        faceAnimationManager.checkSuccess(new FaceAnimationManager.AnimationCallback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.AnimationCallback
                            public void onAnimationEnd() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7c281bbd", new Object[]{this});
                                } else {
                                    conditionVariable.open();
                                }
                            }
                        });
                    } else if (result == 101) {
                        if (FaceAuthManager.a(FaceAuthManager.this) != null) {
                            FaceAuthManager.a(FaceAuthManager.this).onAuthFail(context);
                        }
                        if (FaceAuthManager.b(FaceAuthManager.this) <= 0) {
                            FaceAuthManager.a(FaceAuthManager.this, true);
                        }
                        faceAnimationManager.checkFail(new FaceAnimationManager.AnimationCallback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager.2.6
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.AnimationCallback
                            public void onAnimationEnd() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7c281bbd", new Object[]{this});
                                } else if (FaceAuthManager.b(FaceAuthManager.this) <= 0) {
                                    conditionVariable.open();
                                } else {
                                    AuthenticatorLOG.faceInfo("check fail end with RESULT_FAILURE");
                                    FaceAuthManager.a(FaceAuthManager.this, authenticatorMessage, callback, this, faceAnimationManager);
                                }
                            }
                        });
                    } else if (result == 103) {
                        if (FaceAuthManager.a(FaceAuthManager.this) != null) {
                            FaceAuthManager.a(FaceAuthManager.this).onAuthNoMatch(context);
                        }
                        if (FaceAuthManager.b(FaceAuthManager.this) <= 0) {
                            FaceAuthManager.a(FaceAuthManager.this, true);
                        }
                        faceAnimationManager.checkFail(new FaceAnimationManager.AnimationCallback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager.2.4
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.AnimationCallback
                            public void onAnimationEnd() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7c281bbd", new Object[]{this});
                                } else if (FaceAuthManager.b(FaceAuthManager.this) <= 0) {
                                    conditionVariable.open();
                                } else {
                                    AuthenticatorLOG.faceInfo("check fail end with RESULT_NO_MATCH");
                                    FaceAuthManager.a(FaceAuthManager.this, authenticatorMessage, callback, this, faceAnimationManager);
                                }
                            }
                        });
                    } else if (result == 113) {
                        if (FaceAuthManager.a(FaceAuthManager.this) != null) {
                            FaceAuthManager.a(FaceAuthManager.this).onAuthNoMatch(context);
                        }
                        if (FaceAuthManager.b(FaceAuthManager.this) <= 0) {
                            FaceAuthManager.a(FaceAuthManager.this, true);
                        }
                        if (FaceAuthManager.this.startCheck) {
                            faceAnimationManager.checkFail(new FaceAnimationManager.AnimationCallback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager.2.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.AnimationCallback
                                public void onAnimationEnd() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("7c281bbd", new Object[]{this});
                                    } else if (FaceAuthManager.b(FaceAuthManager.this) <= 0) {
                                        conditionVariable.open();
                                    } else {
                                        AuthenticatorLOG.faceInfo("check fail end with RESULT_TIMEOUT");
                                        FaceAuthManager.a(FaceAuthManager.this, authenticatorMessage, callback, this, faceAnimationManager);
                                    }
                                }
                            });
                        } else {
                            faceAnimationManager.captureFail(new FaceAnimationManager.AnimationCallback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager.2.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.AnimationCallback
                                public void onAnimationEnd() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("7c281bbd", new Object[]{this});
                                    } else if (FaceAuthManager.b(FaceAuthManager.this) <= 0) {
                                        conditionVariable.open();
                                    } else {
                                        AuthenticatorLOG.faceInfo("capture fail end with RESULT_TIMEOUT");
                                        FaceAuthManager.a(FaceAuthManager.this, authenticatorMessage, callback, this, faceAnimationManager);
                                    }
                                }
                            });
                        }
                    } else if (result == 129) {
                        if (FaceAuthManager.a(FaceAuthManager.this) != null) {
                            FaceAuthManager.a(FaceAuthManager.this).onAuthNoMatchTooMuch(context);
                        }
                        FaceAuthManager.a(FaceAuthManager.this, true);
                        faceAnimationManager.checkFail(new FaceAnimationManager.AnimationCallback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager.2.5
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.AnimationCallback
                            public void onAnimationEnd() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7c281bbd", new Object[]{this});
                                } else {
                                    conditionVariable.open();
                                }
                            }
                        });
                    }
                    if (!FaceAuthManager.c(FaceAuthManager.this)) {
                        return;
                    }
                    if (FaceAuthManager.d(FaceAuthManager.this).compareAndSet(false, true)) {
                        conditionVariable.block(5000L);
                        faceAnimationManager.checkFinish(0L);
                        callback.onResult(authenticatorResponse2);
                        AuthenticatorLOG.faceInfo("startauth callback onResult: " + authenticatorResponse2.getResult());
                        return;
                    }
                    AuthenticatorLOG.faceInfo("startauth callback onResult no valid : " + authenticatorResponse2.getResult());
                }

                @Override // com.alipay.security.mobile.ifaa.auth.IAuthenticator.Callback
                public void onAuthStatus(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("50675803", new Object[]{this, new Integer(i)});
                    } else if (i != 4 || FaceAuthManager.this.startCheck) {
                    } else {
                        faceAnimationManager.startCheck();
                        FaceAuthManager.this.startCheck = true;
                    }
                }
            };
            FaceAnimationManager.ActionCallback actionCallback = new FaceAnimationManager.ActionCallback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
                @Override // com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.ActionCallback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onAction(int r7) {
                    /*
                        r6 = this;
                        com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager.AnonymousClass3.$ipChange
                        boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                        r2 = 2
                        r3 = 0
                        r4 = 1
                        if (r1 == 0) goto L1a
                        java.lang.Object[] r1 = new java.lang.Object[r2]
                        r1[r3] = r6
                        java.lang.Integer r2 = new java.lang.Integer
                        r2.<init>(r7)
                        r1[r4] = r2
                        java.lang.String r7 = "781efb87"
                        r0.ipc$dispatch(r7, r1)
                        return
                    L1a:
                        if (r7 != 0) goto L34
                        java.lang.String r7 = "action code start to authentication"
                        com.alipay.security.mobile.auth.AuthenticatorLOG.faceInfo(r7)
                        com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager r7 = r2
                        r7.updateUI(r4)
                        com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager r7 = com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager.this
                        com.alipay.security.mobile.auth.message.AuthenticatorMessage r0 = r3
                        com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager$Callback r1 = r4
                        com.alipay.security.mobile.ifaa.auth.IAuthenticator$Callback r2 = r5
                        com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager r3 = r2
                        com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager.a(r7, r0, r1, r2, r3)
                        return
                    L34:
                        r0 = 4
                        if (r7 == r0) goto L40
                        com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager r1 = com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager.this
                        com.alipay.security.mobile.ifaa.auth.FaceAuthenticator r1 = com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager.e(r1)
                        r1.cancel()
                    L40:
                        com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager r1 = com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager.this
                        com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager.a(r1, r3)
                        com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager$Callback r1 = r4
                        if (r1 == 0) goto Lad
                        com.alipay.security.mobile.auth.message.AuthenticatorResponse r1 = new com.alipay.security.mobile.auth.message.AuthenticatorResponse
                        r1.<init>()
                        r5 = 101(0x65, float:1.42E-43)
                        r1.setResult(r5)
                        if (r7 == r4) goto L6c
                        if (r7 == r2) goto L69
                        r2 = 3
                        if (r7 == r2) goto L66
                        if (r7 == r0) goto L63
                        r0 = 5
                        if (r7 == r0) goto L60
                        goto L71
                    L60:
                        r0 = 135(0x87, float:1.89E-43)
                        goto L6e
                    L63:
                        r0 = 403(0x193, float:5.65E-43)
                        goto L6e
                    L66:
                        r0 = 134(0x86, float:1.88E-43)
                        goto L6e
                    L69:
                        r0 = 121(0x79, float:1.7E-43)
                        goto L6e
                    L6c:
                        r0 = 102(0x66, float:1.43E-43)
                    L6e:
                        r1.setResult(r0)
                    L71:
                        com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager r0 = com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager.this
                        java.util.concurrent.atomic.AtomicBoolean r0 = com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager.d(r0)
                        boolean r0 = r0.compareAndSet(r3, r4)
                        if (r0 == 0) goto L98
                        com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager$Callback r0 = r4
                        r0.onResult(r1)
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "startauth callback action: "
                        r0.append(r1)
                        r0.append(r7)
                        java.lang.String r7 = r0.toString()
                        com.alipay.security.mobile.auth.AuthenticatorLOG.faceInfo(r7)
                        return
                    L98:
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "startauth callback action no valid: "
                        r0.append(r1)
                        r0.append(r7)
                        java.lang.String r7 = r0.toString()
                        com.alipay.security.mobile.auth.AuthenticatorLOG.faceInfo(r7)
                    Lad:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager.AnonymousClass3.onAction(int):void");
                }
            };
            this.c = 3;
            if (IFAAManagerAdaptor.isSupportBioType(Constants.TYPE_FACE, context) && this.f5159a.getEnabled() == 1000) {
                FaceAuthActivity.actionCallback = actionCallback;
                Intent intent = new Intent();
                intent.putExtra(FaceAuthActivity.KEY_SWITCH_BTN_TYPE, authenticatorMessage.getSwitchBtnType());
                intent.putExtra(FaceAuthActivity.KEY_UI_STYLE, this.h ? 1 : 0);
                intent.setClass(context, FaceAuthActivity.class);
                context.startActivity(intent);
                if (this.h) {
                    this.i = FaceAuthActivity.notify;
                }
            } else {
                AuthenticatorResponse authenticatorResponse2 = new AuthenticatorResponse();
                authenticatorResponse2.setResult(129);
                callback.onResult(authenticatorResponse2);
                AuthenticatorLOG.faceInfo("startauth check onResult:RESULT_SYSTEMBLOCK firsttime because enable vaule: ");
            }
            return 0;
        }
    }

    private boolean a(AuthenticatorMessage authenticatorMessage, AuthenticatorManager.Callback callback, IAuthenticator.Callback callback2, FaceAnimationManager faceAnimationManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c81db806", new Object[]{this, authenticatorMessage, callback, callback2, faceAnimationManager})).booleanValue();
        }
        if (this.f5159a.getEnabled() == 1000) {
            int i = this.c;
            if (i == 3) {
                faceAnimationManager.updateUI(1);
            } else if (i == 2) {
                faceAnimationManager.updateUI(2);
            }
            AuthenticatorLOG.faceInfo("start call faceAuthenticator authenticate ...");
            this.startCheck = false;
            this.f5159a.authenticate(authenticatorMessage, callback2);
            this.c--;
            faceAnimationManager.startCapture();
            return true;
        }
        faceAnimationManager.checkFinish(0L);
        AuthenticatorResponse authenticatorResponse = new AuthenticatorResponse();
        authenticatorResponse.setResult(129);
        callback.onResult(authenticatorResponse);
        AuthenticatorLOG.faceInfo("startauth check onResult:RESULT_SYSTEMBLOCK because enalbe value ");
        return false;
    }

    public int dereg(String str, IAuthenticator.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("246d4471", new Object[]{this, str, callback})).intValue();
        }
        if (this.f5159a == null) {
            return -1;
        }
        AuthenticatorMessage authenticatorMessage = new AuthenticatorMessage();
        authenticatorMessage.setAuthenticatorType(Constants.TYPE_FACE);
        authenticatorMessage.setData(str);
        authenticatorMessage.setType(4);
        this.f5159a.deregister(authenticatorMessage, callback);
        return 0;
    }

    public int startAuth(Context context, String str, AuthenticatorMessage authenticatorMessage, AuthenticatorManager.Callback callback, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e91ee3a8", new Object[]{this, context, str, authenticatorMessage, callback, str2})).intValue();
        }
        if (authenticatorMessage.getType() == 3 && (TextUtils.isEmpty(str) || this.f5159a.getUserStatusWithToken(str) != 2)) {
            AuthenticatorLOG.faceInfo("token:" + str + ", face not registed");
            AuthenticatorResponse authenticatorResponse = new AuthenticatorResponse(authenticatorMessage.getType(), authenticatorMessage.getVersion(), null);
            authenticatorResponse.setResult(115);
            callback.onResult(authenticatorResponse);
            return 115;
        }
        return startAuth(context, authenticatorMessage, callback, str2);
    }

    public BICDataModel getFaceBicDataModel(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BICDataModel) ipChange.ipc$dispatch("619d302f", new Object[]{this, context});
        }
        com.alipay.security.mobile.auth.IAuthenticator iAuthenticator = this.f;
        if (iAuthenticator == null) {
            try {
                this.f = AuthenticatorFactory.create(context, 4);
                if (!(this.f instanceof FaceAuthenticatorAdapter)) {
                    return null;
                }
            } catch (Exception e) {
                AuthenticatorLOG.fpInfo(e);
                return null;
            }
        } else if (!(iAuthenticator instanceof FaceAuthenticatorAdapter)) {
            return null;
        }
        try {
            String deviceId = this.f.getDeviceId();
            if (TextUtils.isEmpty(deviceId)) {
                deviceId = "null";
            }
            return new BICDataModel(deviceId, Build.MODEL, IFAAFingerprintManagerAdapter.getInstance(context).getDeviceModel(), 0, Constants.TYPE_FACE, 102, this.f5159a.hasEnroll() ? 1 : 0, 1, 0);
        } catch (Exception unused) {
            return null;
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if ("true".equalsIgnoreCase(ConfigServiceUtil.syncConfigMode(ConfigServiceUtil.KEY_FACE_ID_UI_RALL_BACK, ""))) {
            this.h = false;
        } else {
            this.h = true;
        }
    }
}
