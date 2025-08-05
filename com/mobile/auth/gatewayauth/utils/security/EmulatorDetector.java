package com.mobile.auth.gatewayauth.utils.security;

import android.content.Context;
import android.os.Build;
import com.alibaba.security.realidentity.g4;
import com.mobile.auth.gatewayauth.ExceptionProcessor;

/* loaded from: classes4.dex */
public class EmulatorDetector {
    private static final String TAG = "EmulatorDetector";
    private static int rating = -1;

    private static final String getProp(Context context, String str) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            return (String) loadClass.getMethod("get", String.class).invoke(loadClass, str);
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:9|10|(20:31|32|33|(1:126)|45|46|(1:125)|54|55|(1:124)|73|(1:123)|89|(1:122)|97|(1:121)|113|114|(1:116)|117)|127|32|33|(1:35)|126|45|46|(1:48)|125|54|55|(1:57)|124|73|(1:75)|123|89|(1:91)|122|97|(1:99)|121|113|114|(0)|117) */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0219, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x021a, code lost:
        com.mobile.auth.gatewayauth.utils.O0000Oo0.O000000o(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0216  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isEmulator(android.content.Context r15) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.gatewayauth.utils.security.EmulatorDetector.isEmulator(android.content.Context):boolean");
    }

    private static boolean isEmulatorAbsoluly(Context context) {
        try {
            if (!mayOnEmulatorViaQEMU(context) && !Build.PRODUCT.contains(g4.a.f3423a) && !Build.PRODUCT.contains("sdk_x86") && !Build.PRODUCT.contains("sdk_google") && !Build.PRODUCT.contains("Andy") && !Build.PRODUCT.contains("Droid4X") && !Build.PRODUCT.contains("nox") && !Build.PRODUCT.contains("vbox86p") && !Build.PRODUCT.contains("aries") && !"Genymotion".equals(Build.MANUFACTURER) && !Build.MANUFACTURER.contains("Andy") && !Build.MANUFACTURER.contains("nox") && !Build.MANUFACTURER.contains("TiantianVM") && !Build.BRAND.contains("Andy") && !Build.DEVICE.contains("Andy") && !Build.DEVICE.contains("Droid4X") && !Build.DEVICE.contains("nox") && !Build.DEVICE.contains("vbox86p") && !Build.DEVICE.contains("aries") && !Build.MODEL.contains("Emulator") && !"google_sdk".equals(Build.MODEL) && !Build.MODEL.contains("Droid4X") && !Build.MODEL.contains("TiantianVM") && !Build.MODEL.contains("Andy") && !"Android SDK built for x86_64".equals(Build.MODEL) && !"Android SDK built for x86".equals(Build.MODEL) && !"vbox86".equals(Build.HARDWARE) && !Build.HARDWARE.contains("nox") && !Build.HARDWARE.contains("ttVM_x86") && !Build.FINGERPRINT.contains("generic/sdk/generic") && !Build.FINGERPRINT.contains("generic_x86/sdk_x86/generic_x86") && !Build.FINGERPRINT.contains("Andy") && !Build.FINGERPRINT.contains("ttVM_Hdragon") && !Build.FINGERPRINT.contains("generic/google_sdk/generic") && !Build.FINGERPRINT.contains("vbox86p")) {
                if (!Build.FINGERPRINT.contains("generic/vbox86p/vbox86p")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    private static final boolean mayOnEmulatorViaQEMU(Context context) {
        try {
            return "1".equals(getProp(context, "ro.kernel.qemu"));
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }
}
