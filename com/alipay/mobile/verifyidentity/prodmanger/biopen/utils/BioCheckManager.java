package com.alipay.mobile.verifyidentity.prodmanger.biopen.utils;

import android.content.Context;
import android.os.SystemClock;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager;
import com.alipay.mobile.verifyidentity.callback.VIListenerByVerifyId;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityResult;
import com.alipay.mobile.verifyidentity.engine.VerifyIdentityEngine;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.log.behavior.VerifyLogger;
import com.alipay.mobile.verifyidentity.prod.manager.engine.ProductManagerEngine;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.callback.AuthManagerCallback;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.callback.BioCheckCallback;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.callback.VerifyCheckCallback;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.rrv;

/* loaded from: classes3.dex */
public class BioCheckManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f6042a = ProductManagerEngine.class.getSimpleName();
    private Long b;
    private Long c;
    private Context d;
    private AuthenticatorManager e;

    public static /* synthetic */ Long a(BioCheckManager bioCheckManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("d102f3cb", new Object[]{bioCheckManager}) : bioCheckManager.c;
    }

    public static /* synthetic */ Long a(BioCheckManager bioCheckManager, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("654129ac", new Object[]{bioCheckManager, l});
        }
        bioCheckManager.c = l;
        return l;
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f6042a;
    }

    public static /* synthetic */ Long b(BioCheckManager bioCheckManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("a0c3276a", new Object[]{bioCheckManager}) : bioCheckManager.b;
    }

    public BioCheckManager(Context context) {
        this.d = context;
    }

    public final void a(final String str, String str2, final String str3, final String str4, final VerifyCheckCallback verifyCheckCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23aca8e5", new Object[]{this, str, str2, str3, str4, verifyCheckCallback});
        } else {
            VerifyIdentityEngine.getInstance(this.d).unifiedStartByVerifyId(str, str2, "", null, new VIListenerByVerifyId() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.utils.BioCheckManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.verifyidentity.callback.VIListenerByVerifyId
                public final void onVerifyResult(String str5, String str6, String str7, VerifyIdentityResult verifyIdentityResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("aa9841f2", new Object[]{this, str5, str6, str7, verifyIdentityResult});
                        return;
                    }
                    if (verifyIdentityResult != null) {
                        String a2 = BioCheckManager.a();
                        VerifyLogCat.i(a2, "核身校验结果:" + verifyIdentityResult.getCode());
                        BioCheckManager.a("UC-MobileIC-20180315-7", "", str, str3, str4, "", verifyIdentityResult.getCode());
                    }
                    verifyCheckCallback.a(verifyIdentityResult);
                }
            });
        }
    }

    public final void a(int i, String str, final String str2, final String str3, final BioCheckCallback bioCheckCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e39dbdb", new Object[]{this, new Integer(i), str, str2, str3, bioCheckCallback});
            return;
        }
        this.e = AuthenticatorManager.getInstance(this.d);
        AuthenticatorMessage authenticatorMessage = new AuthenticatorMessage(2, 2, str);
        authenticatorMessage.setAuthenticatorType(i);
        try {
            this.b = Long.valueOf(SystemClock.elapsedRealtime());
            if (this.e == null) {
                return;
            }
            this.e.startAuth(this.d, authenticatorMessage, new AuthManagerCallback() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.utils.BioCheckManager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.callback.AuthManagerCallback, com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.Callback
                public final void onResult(AuthenticatorResponse authenticatorResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("688a9824", new Object[]{this, authenticatorResponse});
                        return;
                    }
                    BioCheckManager.a(BioCheckManager.this, Long.valueOf(SystemClock.elapsedRealtime()));
                    if (authenticatorResponse != null) {
                        String a2 = BioCheckManager.a();
                        VerifyLogCat.i(a2, "生物校验结果:" + authenticatorResponse.getResult());
                        BioCheckManager.a("UC-MobileIC-20180315-6", String.valueOf(BioCheckManager.a(BioCheckManager.this).longValue() - BioCheckManager.b(BioCheckManager.this).longValue()), "", str2, str3, String.valueOf(authenticatorResponse.getResult()), "");
                    }
                    bioCheckCallback.onBioCheckResult(authenticatorResponse);
                }
            }, "");
        } catch (Exception e) {
            bioCheckCallback.onBioCheckResult(null);
            VerifyLogCat.e(f6042a, e.getMessage());
        }
    }

    public static /* synthetic */ void a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b86a6e", new Object[]{str, str2, str3, str4, str5, str6, str7});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", str6);
        hashMap.put("code", str7);
        hashMap.put("sceneId", str4);
        hashMap.put(rrv.PRODUCT_ID, str5);
        hashMap.put(Constants.VI_ENGINE_VERIFYID, str3);
        VerifyLogger.getInstance().eventBehavior(str, "", "", str2, hashMap);
    }
}
