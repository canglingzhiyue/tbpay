package com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.task;

import android.content.Context;
import android.os.Bundle;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.adapter.FingerprintAdapter;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.flow.FingerprintAuth;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.flow.FingerprintAuthenticate;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.flow.FingerprintDeregister;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.flow.FingerprintRegister;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.util.FingerprintDataUtil;
import com.alipay.security.mobile.api.IFAAManagerAdaptor;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.util.BioBehaviorUtils;
import com.alipay.security.mobile.util.CommonUtils;
import com.alipay.security.mobile.util.TrackEvent;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class FingerprintTask implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;
    private Bundle mMessage;

    public FingerprintTask(Context context, Bundle bundle) {
        this.mContext = context;
        this.mMessage = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        Bundle bundle = this.mMessage;
        Bundle bundle2 = null;
        if (bundle != null && this.mContext != null) {
            int i = bundle.getInt(AuthenticatorMessage.KEY_OPERATIONT_TYPE);
            try {
                TrackEvent.getIns().event(this.mMessage, "task process start");
                BioBehaviorUtils.getInstance().add(this.mMessage, "task process start");
                int supportBioTypes = IFAAManagerAdaptor.getSupportBioTypes(this.mContext);
                if ((Constants.TYPE_FINGERPRINT & supportBioTypes) != 0 && (supportBioTypes & 16) != 0 && !CommonUtils.isBlank(IFAAManagerAdaptor.getFingerprintExtInfo(this.mContext))) {
                    TrackEvent.getIns().event(this.mMessage, "underscreen");
                    BioBehaviorUtils.getInstance().add(this.mMessage, "underscreen");
                }
                FingerprintAuth fingerprintDeregister = i != 2 ? i != 3 ? i != 4 ? null : new FingerprintDeregister(this.mContext, this.mMessage) : new FingerprintAuthenticate(this.mContext, this.mMessage) : new FingerprintRegister(this.mContext, this.mMessage);
                if (fingerprintDeregister != null) {
                    bundle2 = fingerprintDeregister.doAuth();
                }
            } catch (Exception e) {
                AuthenticatorLOG.error(e);
                bundle2 = FingerprintDataUtil.constructResultBundle(i + 6, 101);
                TrackEvent.getIns().event(this.mMessage, "task process end,exception");
                BioBehaviorUtils.getInstance().add(this.mMessage, "task process end,exception");
            }
        }
        FingerprintAdapter.getInstance(this.mContext).finishAuth(bundle2, this.mMessage);
    }
}
