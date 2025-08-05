package com.alibaba.android.split.core.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.alibaba.android.split.a;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bgu;
import tb.kge;

/* loaded from: classes2.dex */
public final class PhoneskyVerificationUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final bgu logger;

    static {
        kge.a(1081858571);
        logger = (bgu) a.b(bgu.class, "PhoneskyVerificationUtils");
    }

    public static boolean verify(Context context) {
        Signature[] signatureArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e59f34c", new Object[]{context})).booleanValue();
        }
        try {
            signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (signatureArr != null && signatureArr.length != 0) {
            for (Signature signature : signatureArr) {
                String digest = ObjectInvoker.digest(signature.toByteArray());
                if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(digest) || "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(digest)) {
                    return true;
                }
            }
            return false;
        }
        logger.c("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
        return false;
    }
}
