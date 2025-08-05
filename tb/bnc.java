package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.trade.event.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.model.b;
import java.util.List;

/* loaded from: classes2.dex */
public class bnc extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(469352164);
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        jny H;
        IDMComponent b;
        List<b> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        JSONObject fields = b().getFields();
        if (fields == null) {
            return;
        }
        String string = fields.getString(fin.EVENT_KEY);
        String string2 = fields.getString("target");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || (H = this.f.H()) == null || (b = H.b(string2)) == null || b.getEventMap() == null || (list = b.getEventMap().get(string)) == null) {
            return;
        }
        for (b bVar : list) {
            bna F = this.f.F();
            bmz a2 = F.a();
            a2.a(bVar.getType());
            a2.a(b);
            a2.a(bVar);
            a2.a("isFromRouterEvent", Boolean.TRUE);
            F.a(a2);
        }
    }
}
