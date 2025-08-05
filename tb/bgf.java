package tb;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bgf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-972642435);
    }

    public static void a(Context context, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a729a6a", new Object[]{context, str, bundle});
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(str);
        intent.setAction("com.alibaba.android.split.core.splitinstall.receiver.SplitInstallUpdateIntentService");
        intent.putExtra("session_state", bundle);
        intent.addFlags(1073741824);
        if (a()) {
            intent.addFlags(2097152);
        }
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : Build.VERSION.SDK_INT >= 26;
    }
}
