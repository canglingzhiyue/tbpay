package com.alipay.security.mobile.silentop;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;

/* loaded from: classes3.dex */
public interface MobileBiometricSilenceOpenClientApi {
    @OperationType("alipay.bic.silence.doRegister")
    @SignCheck
    void doSilenceRegister(BiometricSilenceOperationSubmitData biometricSilenceOperationSubmitData);

    @OperationType("alipay.bic.silence.doRegister.withResult")
    @SignCheck
    SilenceRpcResult doSilenceRegisterWithResult(BiometricSilenceOperationSubmitData biometricSilenceOperationSubmitData);
}
