package com.alipay.android.phone.seauthenticator.iotauth.authmanager;

import android.content.Context;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.IAuthenticatorManager;
import com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager;
import com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpAuthManager;
import com.alipay.security.mobile.api.BICDataModel;
import com.alipay.security.mobile.api.BICDataUtil;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.alipay.security.mobile.ifaa.adapter.IFAAManagerAdapter;
import com.alipay.security.mobile.ifaa.auth.IAuthenticator;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class GlobalAuthenticatorManager implements IAuthenticatorManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static GlobalAuthenticatorManager b;

    /* renamed from: a  reason: collision with root package name */
    private Context f5131a;

    public static synchronized GlobalAuthenticatorManager getInstance(Context context) {
        synchronized (GlobalAuthenticatorManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GlobalAuthenticatorManager) ipChange.ipc$dispatch("3cc24221", new Object[]{context});
            }
            if (b == null) {
                b = new GlobalAuthenticatorManager(context);
            }
            return b;
        }
    }

    private GlobalAuthenticatorManager(Context context) {
        this.f5131a = context.getApplicationContext();
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.IAuthenticatorManager
    public boolean startBIOManager(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("59501839", new Object[]{this, new Integer(i)})).booleanValue() : IFAAManagerAdapter.getInstance(this.f5131a).startBIOManager(i);
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.IAuthenticatorManager
    public String getSecData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5a3e4b4", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        BICDataModel fpBicDataModel = FpAuthManager.getInstance().getFpBicDataModel(this.f5131a);
        if (fpBicDataModel != null) {
            arrayList.add(fpBicDataModel);
        }
        BICDataModel faceBicDataModel = FaceAuthManager.getInstance(this.f5131a).getFaceBicDataModel(this.f5131a);
        if (faceBicDataModel != null) {
            arrayList.add(faceBicDataModel);
        }
        String globalSecDataJson = BICDataUtil.getGlobalSecDataJson(arrayList, this.f5131a);
        AuthenticatorLOG.fpInfo("GlobalAuthenticatorManager.getSecData: " + globalSecDataJson);
        return globalSecDataJson;
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.IAuthenticatorManager
    public int startReg(Context context, String str, int i, final IAuthenticatorManager.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25cbe01b", new Object[]{this, context, str, new Integer(i), callback})).intValue();
        }
        PreDataHelper.getInstance().initClientText(null);
        AuthenticatorMessage authenticatorMessage = new AuthenticatorMessage(2, str);
        authenticatorMessage.setAuthenticatorType(i);
        if (i == Constants.TYPE_FINGERPRINT) {
            return FpAuthManager.getInstance().startVerify(context, "", authenticatorMessage, callback);
        }
        if (i != Constants.TYPE_FACE) {
            return -1;
        }
        return FaceAuthManager.getInstance(this.f5131a).startAuth(context, authenticatorMessage, new AuthenticatorManager.Callback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.authmanager.GlobalAuthenticatorManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.Callback
            public void onResult(AuthenticatorResponse authenticatorResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("688a9824", new Object[]{this, authenticatorResponse});
                } else {
                    callback.onResult(authenticatorResponse);
                }
            }
        }, "");
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.IAuthenticatorManager
    public int startDeReg(String str, int i, final IAuthenticatorManager.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bbdb89a4", new Object[]{this, str, new Integer(i), callback})).intValue();
        }
        if (i == Constants.TYPE_FINGERPRINT) {
            return FpAuthManager.getInstance().dereg(this.f5131a, str, callback);
        }
        if (i != Constants.TYPE_FACE) {
            return -1;
        }
        return FaceAuthManager.getInstance(this.f5131a).dereg(str, new IAuthenticator.Callback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.authmanager.GlobalAuthenticatorManager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.security.mobile.ifaa.auth.IAuthenticator.Callback
            public void onAuthStatus(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("50675803", new Object[]{this, new Integer(i2)});
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
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.IAuthenticatorManager
    public int startAuth(Context context, String str, final IAuthenticatorManager.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4953b1c4", new Object[]{this, context, str, callback})).intValue();
        }
        PreDataHelper preDataHelper = PreDataHelper.getInstance();
        if (preDataHelper.initData(str) != 0) {
            AuthenticatorResponse authenticatorResponse = new AuthenticatorResponse();
            authenticatorResponse.setResult(101);
            callback.onResult(authenticatorResponse);
            return -1;
        }
        AuthenticatorMessage authenticatorMessage = new AuthenticatorMessage(3, preDataHelper.getRenderData());
        authenticatorMessage.setAuthenticatorType(preDataHelper.getProductType());
        authenticatorMessage.setId(preDataHelper.getVerifyId());
        if (preDataHelper.getProductType() == Constants.TYPE_FINGERPRINT) {
            return FpAuthManager.getInstance().startVerify(context, preDataHelper.getToken(), authenticatorMessage, callback);
        }
        if (preDataHelper.getProductType() == Constants.TYPE_FACE) {
            return FaceAuthManager.getInstance(this.f5131a).startAuth(context, preDataHelper.getToken(), authenticatorMessage, new AuthenticatorManager.Callback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.authmanager.GlobalAuthenticatorManager.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.Callback
                public void onResult(AuthenticatorResponse authenticatorResponse2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("688a9824", new Object[]{this, authenticatorResponse2});
                    } else {
                        callback.onResult(authenticatorResponse2);
                    }
                }
            }, "");
        }
        AuthenticatorResponse authenticatorResponse2 = new AuthenticatorResponse();
        authenticatorResponse2.setResult(111);
        callback.onResult(authenticatorResponse2);
        return -1;
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.IAuthenticatorManager
    public void stopAuth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc55e4d2", new Object[]{this, new Integer(i)});
        } else if (i == Constants.TYPE_FINGERPRINT) {
            FpAuthManager.getInstance().stopAuth(this.f5131a);
        } else if (i != Constants.TYPE_FACE) {
        } else {
            FaceAuthManager.getInstance(this.f5131a).cancel();
        }
    }
}
