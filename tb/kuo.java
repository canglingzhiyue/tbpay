package tb;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.tao.Globals;

/* loaded from: classes7.dex */
public class kuo implements kui {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(596902495);
        kge.a(-165588708);
    }

    @Override // tb.kui
    public boolean a(kuk kukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1cddafb", new Object[]{this, kukVar})).booleanValue();
        }
        if (kukVar == null || !"com.alibaba.poplayer.PopLayer.action.POP".equals(kukVar.f30328a)) {
            return false;
        }
        e.b("poplayerevent dispatch ", kukVar.toString());
        Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
        intent.putExtra("event", kukVar.b);
        if (kukVar.a() != null) {
            intent.putExtra("param", kukVar.a().toString());
        }
        LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(intent);
        return true;
    }
}
