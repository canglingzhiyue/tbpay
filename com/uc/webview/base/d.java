package com.uc.webview.base;

import com.uc.webview.base.SdkGlobalSettings;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class d {
    protected static final String TAG = "GlobalSettings";
    private static final SdkGlobalSettings.Interface sSdkImpl = new e();
    protected static final AtomicReference<SdkGlobalSettings.Interface> sImpl = new AtomicReference<>(sSdkImpl);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SdkGlobalSettings.Interface switchToCore(SdkGlobalSettings.Interface r3) {
        SdkGlobalSettings.Interface andSet;
        if (sImpl.get() != sSdkImpl) {
            Log.i(TAG, "sdk switch to core(U4Patch warmup mode)");
            andSet = sImpl.get();
        } else {
            Log.d(TAG, "sdk switch to core");
            andSet = sImpl.getAndSet(r3);
        }
        return andSet;
    }
}
