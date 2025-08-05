package com.alipay.zoloz.toyger.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.alipay.android.phone.zoloz.camera.BuildConfig;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.zoloz.hardware.camera.utils.AndroidCameraUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public class EnvCheck {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : Build.VERSION.SDK != null && Integer.parseInt(Build.VERSION.SDK) < 18;
    }

    public EnvErrorType check(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EnvErrorType) ipChange.ipc$dispatch("e08a1409", new Object[]{this, new Boolean(z)});
        }
        EnvErrorType envErrorType = EnvErrorType.ENV_ERROR_INVALID;
        if (a()) {
            return EnvErrorType.ENV_ERROR_LOW_OS;
        }
        return (!"Android".equals(getCamera()) || z || AndroidCameraUtil.findFacingCamera() != -1) ? envErrorType : EnvErrorType.ENV_ERROR_NO_FRONT_CAMERA;
    }

    public static String getCamera() {
        try {
            Field field = BuildConfig.class.getField("CAMERA");
            field.setAccessible(true);
            return (String) field.get(BuildConfig.class);
        } catch (IllegalAccessException e) {
            BioLog.w(e);
            return "Android";
        } catch (NoSuchFieldException e2) {
            BioLog.w(e2);
            return "Android";
        }
    }

    public static boolean isWifiNetwork(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49ad95b6", new Object[]{context})).booleanValue();
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return activeNetworkInfo.getType() == 1;
            }
        } catch (Exception e) {
            BioLog.e("check Network Type exception:" + e);
        }
        return false;
    }
}
