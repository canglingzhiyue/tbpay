package tb;

import android.content.Context;
import com.alibaba.android.ultron.ext.vlayout.c;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;

/* loaded from: classes2.dex */
public class blk extends blg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1404924028);
    }

    @Override // tb.blg
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "waterfall";
    }

    @Override // tb.blg
    public c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("49ed05f1", new Object[]{this}) : new blx();
    }

    @Override // tb.blg
    public void a(Context context, c cVar, JSONObject jSONObject) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aa40dad", new Object[]{this, context, cVar, jSONObject});
        } else if (!(cVar instanceof blx)) {
        } else {
            blx blxVar = (blx) cVar;
            if (jSONObject != null) {
                i = jSONObject.getIntValue(a.ATOM_EXT_column);
                String string = jSONObject.getString("vGap");
                String string2 = jSONObject.getString("hGap");
                blxVar.j(gbg.a(context, string, 0));
                blxVar.c(gbg.a(context, string2, 0));
                blf.a(context, blxVar, jSONObject);
            } else {
                i = 0;
            }
            if (i <= 0) {
                i = 2;
            }
            blxVar.k(i);
        }
    }
}
