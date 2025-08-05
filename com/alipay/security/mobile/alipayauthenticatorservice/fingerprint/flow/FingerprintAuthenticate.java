package com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.flow;

import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.ta.TACommands;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.ta.TAInterationV1;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.util.FingerprintDataUtil;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.util.BioBehaviorUtils;
import com.alipay.security.mobile.util.TrackEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.ifaa.ifaf.OperationHeader;
import org.ifaa.ifaf.message.IFAFMessage;

/* loaded from: classes3.dex */
public class FingerprintAuthenticate extends FingerprintAuth {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.flow.FingerprintAuthenticate";

    public static /* synthetic */ Object ipc$super(FingerprintAuthenticate fingerprintAuthenticate, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.flow.FingerprintAuth
    public int getReponseType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5abf12c", new Object[]{this})).intValue();
        }
        return 9;
    }

    public FingerprintAuthenticate(Context context, Bundle bundle) {
        super(context, bundle);
    }

    @Override // com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.flow.FingerprintAuth
    public Bundle doTransaction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("b5ac169e", new Object[]{this});
        }
        if (!this.isFingerprintAuthSuccess) {
            TrackEvent.getIns().event(this.mMessage, "end,fp_auth failed ");
            BioBehaviorUtils.getInstance().add(this.mMessage, "end,fp_auth failed ");
            return FingerprintDataUtil.constructResultBundle(getReponseType(), 101);
        }
        try {
            return sendMessageToTee();
        } catch (Exception e) {
            AuthenticatorLOG.error("fingerprint authenticate", e);
            return FingerprintDataUtil.constructResultBundle(getReponseType(), 101);
        }
    }

    private Bundle sendMessageToTee() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("79d0ad85", new Object[]{this});
        }
        try {
            IFAFMessage parseIFAFMessage = IFAFMessage.parseIFAFMessage(this.mMessage.getString(AuthenticatorMessage.KEY_MESSAGE));
            byte[] decode = Base64.decode(parseIFAFMessage.getSignedData().getIdentifyData(), 8);
            TrackEvent.getIns().event(this.mMessage, "send message to tee start");
            BioBehaviorUtils.getInstance().add(this.mMessage, "send message to tee start");
            Result sendCommandAndData = TAInterationV1.sendCommandAndData(this.mContext, TACommands.COMMAND_FINGERPRINT_AUTH, decode);
            if (sendCommandAndData.getStatus() == 0) {
                TrackEvent.getIns().event(this.mMessage, "send message to tee end,success");
                BioBehaviorUtils.getInstance().add(this.mMessage, "send message to tee end,success");
                new OperationHeader();
                return FingerprintDataUtil.constructResultBundle(getReponseType(), 100, FingerprintDataUtil.makeAuthResponse(this.mAAID, parseIFAFMessage.getHeader(), sendCommandAndData));
            }
            String str = TAG;
            AuthenticatorLOG.error(str, "fingerprint auth TA onResult not 0, " + sendCommandAndData.getStatusString());
            TrackEvent ins = TrackEvent.getIns();
            Bundle bundle = this.mMessage;
            ins.event(bundle, "send message to tee end,failed:" + sendCommandAndData.getStatusStringIFAA2());
            BioBehaviorUtils bioBehaviorUtils = BioBehaviorUtils.getInstance();
            Bundle bundle2 = this.mMessage;
            bioBehaviorUtils.add(bundle2, "send message to tee end,failed:" + sendCommandAndData.getStatusStringIFAA2());
            return FingerprintDataUtil.constructResultBundle(getReponseType(), 101);
        } catch (Throwable th) {
            AuthenticatorLOG.error(TAG, th);
            TrackEvent.getIns().event(this.mMessage, "end,send message to tee exception");
            BioBehaviorUtils.getInstance().add(this.mMessage, "end,send message to tee exception");
            return FingerprintDataUtil.constructResultBundle(getReponseType(), 101);
        }
    }
}
