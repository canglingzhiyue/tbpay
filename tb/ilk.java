package tb;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.resourceguardian.data.model.a;

/* loaded from: classes6.dex */
public class ilk extends ilj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1226270689);
    }

    public static /* synthetic */ Object ipc$super(ilk ilkVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private int a(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d8033c18", new Object[]{this, intent})).intValue() : (intent.getIntExtra("level", 100) * 100) / intent.getIntExtra("scale", 100);
    }

    private int b(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1532099", new Object[]{this, intent})).intValue() : intent.getIntExtra("temperature", 0) / 10;
    }

    @Override // tb.ilj
    public void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{this, context});
        } else if (Build.VERSION.SDK_INT <= 22) {
        } else {
            try {
                Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver == null) {
                    ilt.a("Battery", "update failed, batteryInfoIntent is null");
                    return;
                }
                a(new a.C0567a().a(4).b(2).a("battery_level", String.valueOf(a(registerReceiver))).a());
                a(new a.C0567a().a(4).b(5).a("battery_temperature", String.valueOf(b(registerReceiver))).a());
            } catch (Exception e) {
                ilt.a("Battery", "update failed, register receiver error", e.toString());
            }
        }
    }
}
