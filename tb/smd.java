package tb;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.deprecated.message.module.notify.NotifyImpl;
import com.taobao.android.fluid.framework.deprecated.message.module.notify.a;
import com.tmall.android.dai.DAI;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class smd implements NotifyImpl.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, NotifyImpl.CommonBroadcastReceiver> f33718a = new HashMap<>();

    static {
        kge.a(530901507);
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
            NotifyImpl.CommonBroadcastReceiver commonBroadcastReceiver = this.f33718a.get(str);
            if (commonBroadcastReceiver == null) {
                commonBroadcastReceiver = new NotifyImpl.CommonBroadcastReceiver();
                this.f33718a.put(str, commonBroadcastReceiver);
                IntentFilter intentFilter = new IntentFilter(DAI.ACTION_COMPUTE_COMPLETE);
                intentFilter.addDataScheme(str);
                if (Build.VERSION.SDK_INT >= 19) {
                    intentFilter.addDataSchemeSpecificPart("com.tmall.android.dai", 0);
                }
                context.registerReceiver(commonBroadcastReceiver, intentFilter);
            }
            commonBroadcastReceiver.a(c0495a);
        } catch (Throwable th) {
            spz.c("SmartMobileBroadcastHandler", "register failed=" + th.getMessage());
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
            NotifyImpl.CommonBroadcastReceiver commonBroadcastReceiver = this.f33718a.get(str);
            if (commonBroadcastReceiver == null) {
                return;
            }
            commonBroadcastReceiver.a();
            context.unregisterReceiver(commonBroadcastReceiver);
            this.f33718a.remove(str);
        } catch (Throwable th) {
            spz.c("SmartMobileBroadcastHandler", "unregister failed=" + th.getMessage());
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
            for (NotifyImpl.CommonBroadcastReceiver commonBroadcastReceiver : this.f33718a.values()) {
                context.unregisterReceiver(commonBroadcastReceiver);
            }
            this.f33718a.clear();
        } catch (Throwable th) {
            spz.c("SmartMobileBroadcastHandler", "unregister failed=" + th.getMessage());
        }
    }
}
