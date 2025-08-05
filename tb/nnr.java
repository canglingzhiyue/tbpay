package tb;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class nnr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1902913123);
    }

    public static boolean a(Context context) {
        NetworkInfo activeNetworkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                if (activeNetworkInfo.getState() != NetworkInfo.State.CONNECTING) {
                    if (activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    }
                }
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{runnable, new Long(j)});
        } else if (runnable == null) {
        } else {
            if (Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId()) {
                new Handler(Looper.getMainLooper()).postDelayed(runnable, j);
            } else if (j <= 0) {
                runnable.run();
            } else {
                new Handler(Looper.getMainLooper()).postDelayed(runnable, j);
            }
        }
    }
}
