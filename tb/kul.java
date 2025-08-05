package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.tbpoplayer.view.c;

/* loaded from: classes7.dex */
public class kul implements kui {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1995510561);
        kge.a(-165588708);
    }

    @Override // tb.kui
    public boolean a(kuk kukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1cddafb", new Object[]{this, kukVar})).booleanValue();
        }
        if (kukVar == null || "com.alibaba.poplayer.PopLayer.action.POP".equals(kukVar.f30328a) || kum.b(kukVar.f30328a) != 1) {
            return false;
        }
        e.b("poplayerevent dispatch", kukVar.toString());
        c.a().a(kukVar.f30328a, kukVar.b, kukVar.a(), (JSONObject) null);
        return true;
    }
}
