package tb;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.pissarro.external.Image;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class ici {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1210389977);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        Intent intent = new Intent();
        intent.setAction(icf.BROADCAST_CANCEL_ACTION);
        LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(intent);
    }

    public static void a(Context context, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74de81ad", new Object[]{context, new Integer(i), str});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.taobao.interact.publish.action.error");
        intent.putExtra("errorMsg", str);
        intent.putExtra("errorCode", String.valueOf(i));
        LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(intent);
    }

    public static void a(Context context, List<Image> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9773151", new Object[]{context, list});
            return;
        }
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra(icf.KEY_IMAGE_RESULT, (ArrayList) list);
        intent.setAction(icf.BROADCAST_COMPLETE_ACTION);
        LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(intent);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : b() || Build.VERSION.SDK_INT >= 29;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : Build.VERSION.CODENAME.length() == 1 && Build.VERSION.CODENAME.charAt(0) >= 'Q' && Build.VERSION.CODENAME.charAt(0) <= 'Z';
    }
}
