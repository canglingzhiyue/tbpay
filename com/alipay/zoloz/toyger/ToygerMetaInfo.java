package com.alipay.zoloz.toyger;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.alipay.zoloz.toyger.face.ToygerFaceService;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ToygerMetaInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String ifaaVersion(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2f578e7a", new Object[]{context}) : "";
    }

    public static boolean isBat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9923596", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean isBlink() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f8b67dd", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean isDepth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d4a77c4", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean isDoc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a52f539", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean isGemini() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8d7f10a", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean isSupportGrayNano() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddc9bca7", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean isSupportLocalMatching(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abb4f2c2", new Object[]{context})).booleanValue();
        }
        return false;
    }

    public static boolean isZFace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("103d70f8", new Object[0])).booleanValue();
        }
        return true;
    }

    private ToygerMetaInfo() {
    }

    public static boolean isDragonfly(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65c2656f", new Object[]{context})).booleanValue() : isSupportNano(context);
    }

    public static boolean isSupportNano(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa19442c", new Object[]{context})).booleanValue();
        }
        if (context != null) {
            boolean isModelFileReady = ToygerFaceService.isModelFileReady(context);
            ToygerLog.d("TOYGER_FLOW_ANDROID_META", "exclude model file|exists:" + isModelFileReady);
            ToygerLog.d("TOYGER_FLOW_ANDROID_META", "filePath =toyger.face.dat|exist:" + isModelFileReady);
            return isModelFileReady;
        }
        ToygerLog.d("TOYGER_FLOW_ANDROID_META", "context is null");
        return false;
    }

    public static boolean isLocalMatchingUsable(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ce9d55e", new Object[]{context, map})).booleanValue();
        }
        Log.e("aoling", "!!! map is empty");
        return false;
    }

    public static boolean isSensor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e75c680f", new Object[0])).booleanValue() : Build.VERSION.SDK_INT >= 21;
    }
}
