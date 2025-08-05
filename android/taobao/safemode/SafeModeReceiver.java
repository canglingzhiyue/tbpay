package android.taobao.safemode;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class SafeModeReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        Context applicationContext = context.getApplicationContext();
        i.a(applicationContext, "EnterSafeModeService");
        if (intent == null) {
            System.exit(0);
        } else {
            new e(applicationContext, intent.getStringExtra(SafeModeActivity.b), intent.getBooleanExtra(SafeModeActivity.f1513a, true), new f() { // from class: android.taobao.safemode.SafeModeReceiver.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.taobao.safemode.f
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        System.exit(0);
                    }
                }
            }).a();
        }
    }
}
