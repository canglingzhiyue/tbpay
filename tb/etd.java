package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.wrapper.ext.event.subscriber.sku.a;
import com.taobao.android.trade.event.f;

/* loaded from: classes4.dex */
public class etd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1808421494);
        emu.a("com.taobao.android.detail.industry.ablility.utility.SyncSku");
    }

    public static final void a(String str, String str2, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d63e1cc", new Object[]{str, str2, context});
            return;
        }
        a aVar = new a();
        aVar.a(str);
        aVar.b(str2);
        aVar.a(true);
        f.a(context).a(aVar);
    }
}
