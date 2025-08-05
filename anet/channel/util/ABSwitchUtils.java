package anet.channel.util;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.ab.api.b;
import com.taobao.android.behavix.feature.a;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes.dex */
public class ABSwitchUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.ABSwitchUtils";
    private static volatile boolean isValid;

    static {
        kge.a(-435254130);
        isValid = true;
    }

    public static Boolean isABGlobalFeatureOpened(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("55281037", new Object[]{context, str});
        }
        if (!isValid) {
            return null;
        }
        try {
            boolean isFeatureOpened = ABGlobal.isFeatureOpened(context, str);
            ALog.e(TAG, "[isABGlobalFeatureOpened]", null, a.FEATURE_NAME, str, "status", Boolean.valueOf(isFeatureOpened));
            return Boolean.valueOf(isFeatureOpened);
        } catch (Throwable unused) {
            ALog.e(TAG, "ABGlobal get error", null, new Object[0]);
            isValid = false;
            return null;
        }
    }

    public static String getABGlobalFeatureValue(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9cc0690a", new Object[]{context, str});
        }
        try {
            Iterator<b> a2 = ABGlobal.a(context).a();
            while (a2.hasNext()) {
                b next = a2.next();
                if (str.equals(next.a())) {
                    return next.b();
                }
            }
        } catch (Throwable unused) {
            ALog.e(TAG, "ABGlobal get FeatureValue error", null, new Object[0]);
        }
        return null;
    }
}
