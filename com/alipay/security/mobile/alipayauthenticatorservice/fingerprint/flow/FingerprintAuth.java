package com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.flow;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintCallback;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintManagerAdapter;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.util.FingerprintBroadcastUtil;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.util.FingerprintDataUtil;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.util.BioBehaviorUtils;
import com.alipay.security.mobile.util.TrackEvent;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class FingerprintAuth {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String mAAID;
    public Context mContext;
    public String mFacetId;
    public Bundle mMessage;
    public int mTimeout;
    private boolean isFingerprintAuthing = false;
    public boolean isFingerprintAuthCancel = false;
    public boolean isFingerprintAuthSuccess = false;
    public boolean isNotMatch = false;
    private boolean isFinish = false;
    private boolean isErrorTimesLimit = false;
    private boolean isTimeout = false;

    public abstract Bundle doTransaction();

    public abstract int getReponseType();

    public static /* synthetic */ boolean access$002(FingerprintAuth fingerprintAuth, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6990174", new Object[]{fingerprintAuth, new Boolean(z)})).booleanValue();
        }
        fingerprintAuth.isFingerprintAuthing = z;
        return z;
    }

    public static /* synthetic */ boolean access$100(FingerprintAuth fingerprintAuth) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1904f527", new Object[]{fingerprintAuth})).booleanValue() : fingerprintAuth.isFinish;
    }

    public static /* synthetic */ boolean access$202(FingerprintAuth fingerprintAuth, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("879c9132", new Object[]{fingerprintAuth, new Boolean(z)})).booleanValue();
        }
        fingerprintAuth.isErrorTimesLimit = z;
        return z;
    }

    public static /* synthetic */ boolean access$302(FingerprintAuth fingerprintAuth, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("681e5911", new Object[]{fingerprintAuth, new Boolean(z)})).booleanValue();
        }
        fingerprintAuth.isTimeout = z;
        return z;
    }

    public FingerprintAuth(Context context, Bundle bundle) {
        this.mTimeout = 10000;
        this.mContext = context;
        this.mMessage = bundle;
        Bundle bundle2 = this.mMessage;
        if (bundle2 != null) {
            this.mTimeout = bundle2.getInt(AuthenticatorMessage.KEY_TIME_OUT, 10000);
        }
        this.mFacetId = context.getPackageName();
    }

    public final synchronized Bundle doAuth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("d7c1de1e", new Object[]{this});
        }
        this.isFinish = false;
        this.isTimeout = false;
        this.isErrorTimesLimit = false;
        if (this.mMessage != null && this.mContext != null) {
            final ConditionVariable conditionVariable = new ConditionVariable();
            int i = this.mMessage.getInt(AuthenticatorMessage.KEY_OPERATIONT_TYPE);
            if (2 == i || 3 == i) {
                this.isFingerprintAuthing = true;
                this.isFingerprintAuthSuccess = false;
                this.isNotMatch = false;
                this.isFingerprintAuthCancel = false;
                IFAAFingerprintManagerAdapter iFAAFingerprintManagerAdapter = IFAAFingerprintManagerAdapter.getInstance(this.mContext);
                this.mAAID = iFAAFingerprintManagerAdapter.getDeviceModel();
                iFAAFingerprintManagerAdapter.authenticate(new IFAAFingerprintCallback() { // from class: com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.flow.FingerprintAuth.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintCallback
                    public void onAuthenticationSucceeded() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("af3a6571", new Object[]{this});
                            return;
                        }
                        FingerprintAuth.access$002(FingerprintAuth.this, false);
                        FingerprintAuth fingerprintAuth = FingerprintAuth.this;
                        fingerprintAuth.isFingerprintAuthSuccess = true;
                        FingerprintBroadcastUtil.sendIdentifyStatusChangeMessage(fingerprintAuth.mContext, 2);
                        FingerprintBroadcastUtil.sendIdentifyStatusChangeMessage(FingerprintAuth.this.mContext, 0);
                        FingerprintBroadcastUtil.sendIdentifyStatusChangeMessage(FingerprintAuth.this.mContext, 100);
                        TrackEvent.getIns().event(FingerprintAuth.this.mMessage, "fp_auth success");
                        BioBehaviorUtils.getInstance().add(FingerprintAuth.this.mMessage, "fp_auth success");
                    }

                    @Override // com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintCallback
                    public void onAuthenticationFailed() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d822ffdb", new Object[]{this});
                            return;
                        }
                        if (!FingerprintAuth.access$100(FingerprintAuth.this)) {
                            FingerprintBroadcastUtil.sendIdentifyStatusChangeMessage(FingerprintAuth.this.mContext, 2);
                            FingerprintBroadcastUtil.sendIdentifyStatusChangeMessage(FingerprintAuth.this.mContext, 0);
                            FingerprintBroadcastUtil.sendIdentifyStatusChangeMessage(FingerprintAuth.this.mContext, 103);
                        }
                        FingerprintAuth.access$002(FingerprintAuth.this, false);
                        FingerprintAuth fingerprintAuth = FingerprintAuth.this;
                        fingerprintAuth.isFingerprintAuthSuccess = false;
                        fingerprintAuth.isNotMatch = true;
                        TrackEvent.getIns().event(FingerprintAuth.this.mMessage, "fp_auth failed,not match");
                        BioBehaviorUtils.getInstance().add(FingerprintAuth.this.mMessage, "fp_auth failed,not match");
                    }

                    @Override // com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintCallback
                    public void onAuthenticationError(int i2, CharSequence charSequence) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4947938f", new Object[]{this, new Integer(i2), charSequence});
                            return;
                        }
                        if (!FingerprintAuth.access$100(FingerprintAuth.this)) {
                            if (i2 == 7) {
                                FingerprintAuth.access$202(FingerprintAuth.this, true);
                                TrackEvent.getIns().event(FingerprintAuth.this.mMessage, "fp_auth error,fp lock");
                                BioBehaviorUtils.getInstance().add(FingerprintAuth.this.mMessage, "fp_auth error,fp lock");
                            } else if (i2 == 3) {
                                FingerprintAuth.access$302(FingerprintAuth.this, true);
                                TrackEvent.getIns().event(FingerprintAuth.this.mMessage, "fp_auth error,time out of os limit");
                                BioBehaviorUtils.getInstance().add(FingerprintAuth.this.mMessage, "fp_auth error,time out of os limit");
                            } else if (i2 == 5) {
                                FingerprintAuth.this.isFingerprintAuthCancel = true;
                                if (Build.VERSION.SDK_INT >= 24) {
                                    try {
                                        conditionVariable.open();
                                    } catch (Exception e) {
                                        AuthenticatorLOG.error(e);
                                    }
                                }
                                TrackEvent.getIns().event(FingerprintAuth.this.mMessage, "fp_auth error,cancel");
                                BioBehaviorUtils.getInstance().add(FingerprintAuth.this.mMessage, "fp_auth error,cancel");
                            } else {
                                TrackEvent ins = TrackEvent.getIns();
                                Bundle bundle = FingerprintAuth.this.mMessage;
                                ins.event(bundle, "fp_auth error,other:" + i2 + ",errorMsg:" + ((Object) charSequence));
                                BioBehaviorUtils bioBehaviorUtils = BioBehaviorUtils.getInstance();
                                Bundle bundle2 = FingerprintAuth.this.mMessage;
                                bioBehaviorUtils.add(bundle2, "fp_auth error,other:" + i2 + ",errorMsg:" + ((Object) charSequence));
                            }
                            FingerprintBroadcastUtil.sendIdentifyStatusChangeMessage(FingerprintAuth.this.mContext, 2);
                            FingerprintBroadcastUtil.sendIdentifyStatusChangeMessage(FingerprintAuth.this.mContext, 0);
                            AuthenticatorLOG.debug("errCode: " + i2);
                            if (i2 != 5) {
                                FingerprintBroadcastUtil.sendIdentifyStatusChangeMessage(FingerprintAuth.this.mContext, 101);
                            } else {
                                FingerprintBroadcastUtil.sendIdentifyStatusChangeMessage(FingerprintAuth.this.mContext, 102);
                            }
                        }
                        FingerprintAuth.access$002(FingerprintAuth.this, false);
                        FingerprintAuth.this.isFingerprintAuthSuccess = false;
                    }
                });
                FingerprintBroadcastUtil.sendIdentifyStatusChangeMessage(this.mContext, 1);
                int i2 = 120000;
                try {
                    do {
                        if (this.isFingerprintAuthing) {
                            try {
                                Thread.sleep(20L);
                                i2 -= 20;
                                continue;
                            } catch (Exception unused) {
                            }
                        }
                        break;
                    } while (i2 > 0);
                    break;
                    this.isFinish = true;
                    iFAAFingerprintManagerAdapter.cancel();
                    if (Build.VERSION.SDK_INT >= 24 && this.isNotMatch) {
                        AuthenticatorLOG.fpInfo("waiting for cancel callback");
                        conditionVariable.block(350L);
                        AuthenticatorLOG.fpInfo("continue...");
                    } else {
                        Thread.sleep(200L);
                    }
                } catch (Exception e) {
                    AuthenticatorLOG.error(e);
                }
                this.isTimeout = true;
                this.isFingerprintAuthing = false;
                FingerprintBroadcastUtil.sendIdentifyStatusChangeMessage(this.mContext, 2);
                FingerprintBroadcastUtil.sendIdentifyStatusChangeMessage(this.mContext, 0);
                FingerprintBroadcastUtil.sendIdentifyStatusChangeMessage(this.mContext, 113);
                TrackEvent.getIns().event(this.mMessage, "fp_auth error,time out of app limit(2min)");
                BioBehaviorUtils.getInstance().add(this.mMessage, "fp_auth error,time out of app limit(2min)");
                if (this.isNotMatch) {
                    return FingerprintDataUtil.constructResultBundle(getReponseType(), 103);
                } else if (this.isFingerprintAuthCancel) {
                    return FingerprintDataUtil.constructResultBundle(getReponseType(), 102);
                } else if (this.isTimeout) {
                    return FingerprintDataUtil.constructResultBundle(getReponseType(), 113);
                } else if (this.isErrorTimesLimit) {
                    return FingerprintDataUtil.constructResultBundle(getReponseType(), 129);
                }
            }
            return doTransaction();
        }
        AuthenticatorLOG.debug("mContext null");
        return FingerprintDataUtil.constructResultBundle(getReponseType(), 101);
    }
}
