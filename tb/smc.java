package tb;

import android.content.Context;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.deprecated.message.module.notify.NotifyImpl;
import com.taobao.android.fluid.framework.deprecated.message.module.notify.a;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class smc implements NotifyImpl.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, NotifyImpl.CommonBroadcastReceiver> f33717a = new HashMap<>();

    static {
        kge.a(-1636908488);
        kge.a(-100811647);
    }

    @Override // com.taobao.android.fluid.framework.deprecated.message.module.notify.NotifyImpl.a
    public void a(Context context, String str, a.C0495a c0495a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9ccf7", new Object[]{this, context, str, c0495a});
            return;
        }
        try {
            NotifyImpl.CommonBroadcastReceiver commonBroadcastReceiver = this.f33717a.get(str);
            if (commonBroadcastReceiver == null) {
                commonBroadcastReceiver = new NotifyImpl.CommonBroadcastReceiver();
                this.f33717a.put(str, commonBroadcastReceiver);
                IntentFilter intentFilter = new IntentFilter(str);
                context.registerReceiver(commonBroadcastReceiver, intentFilter);
                LocalBroadcastManager.getInstance(context).registerReceiver(commonBroadcastReceiver, intentFilter);
            }
            commonBroadcastReceiver.a(c0495a);
        } catch (Throwable th) {
            spz.c("NormalNotifyImpl", "register failed=" + th.getMessage());
        }
    }

    @Override // com.taobao.android.fluid.framework.deprecated.message.module.notify.NotifyImpl.a
    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
            return;
        }
        try {
            NotifyImpl.CommonBroadcastReceiver commonBroadcastReceiver = this.f33717a.get(str);
            if (commonBroadcastReceiver == null) {
                return;
            }
            commonBroadcastReceiver.a();
            context.unregisterReceiver(commonBroadcastReceiver);
            LocalBroadcastManager.getInstance(context).unregisterReceiver(commonBroadcastReceiver);
            this.f33717a.remove(str);
        } catch (Throwable th) {
            spz.c("NormalNotifyImpl", "unregister failed=" + th.getMessage());
        }
    }

    @Override // com.taobao.android.fluid.framework.deprecated.message.module.notify.NotifyImpl.a
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        try {
            for (NotifyImpl.CommonBroadcastReceiver commonBroadcastReceiver : this.f33717a.values()) {
                context.unregisterReceiver(commonBroadcastReceiver);
                LocalBroadcastManager.getInstance(context).unregisterReceiver(commonBroadcastReceiver);
            }
            this.f33717a.clear();
        } catch (Throwable th) {
            spz.c("NormalNotifyImpl", "unregister failed=" + th.getMessage());
        }
    }
}
