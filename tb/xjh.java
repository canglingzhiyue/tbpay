package tb;

import android.content.Intent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class xjh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-99393474);
    }

    public static void a(Object obj, Intent intent) {
        Intent d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bdf0e01", new Object[]{obj, intent});
        } else if (!(obj instanceof xje) || (d = ((xje) obj).d()) == null || intent == null) {
        } else {
            Bundle extras = intent.getExtras();
            Bundle extras2 = d.getExtras();
            if (extras == null) {
                return;
            }
            fjt.a(fjt.TAG_TIP, "StartPutNavExtras.");
            extras.putAll(extras2);
            d.putExtras(extras);
        }
    }
}
