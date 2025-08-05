package com.alipay.module.face.proxy;

import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.bio.api.BioCallback;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.alipay.mobile.security.bio.api.BioParameter;
import com.alipay.mobile.security.bio.api.BioResponse;
import com.alipay.mobile.security.zim.biz.ZimPlatform;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.sentry.ASProxy;
import com.alipay.mobile.verifyidentity.sentry.SentryDelegate;
import com.alipay.mobile.verifyidentity.sentry.SentryHelper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class BioDetectorProxy implements ASProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private BioDetector bioDetector;

    public BioDetectorProxy(BioDetector bioDetector) {
        this.bioDetector = bioDetector;
    }

    public void auth(BioParameter bioParameter, final BioCallback bioCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acd1b13", new Object[]{this, bioParameter, bioCallback});
            return;
        }
        final SentryDelegate sentryDelegate = new SentryDelegate();
        SentryHelper.a(bioParameter);
        this.bioDetector.auth(bioParameter, new BioCallback() { // from class: com.alipay.module.face.proxy.BioDetectorProxy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.security.bio.api.BioCallback
            public final void onResult(BioResponse bioResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("af293cbe", new Object[]{this, bioResponse});
                    return;
                }
                if (sentryDelegate.f6066a && bioResponse != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("subCode", (Object) bioResponse.subCode);
                        jSONObject.put(ZimPlatform.KEY_SUB_MSG, (Object) bioResponse.subMsg);
                        jSONObject.put("result", (Object) Integer.valueOf(bioResponse.getResult()));
                        jSONObject.put("isSuccess", (Object) Boolean.valueOf(bioResponse.isSuccess()));
                        jSONObject.toJSONString();
                    } catch (Throwable th) {
                        VerifyLogCat.d("BioDetectorProxy", th.getMessage());
                    }
                }
                BioCallback bioCallback2 = bioCallback;
                if (bioCallback2 == null) {
                    return;
                }
                bioCallback2.onResult(bioResponse);
            }
        });
    }
}
