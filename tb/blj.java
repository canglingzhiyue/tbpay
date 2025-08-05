package tb;

import android.content.Context;
import com.alibaba.android.ultron.ext.vlayout.c;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class blj extends blg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1177452944);
    }

    @Override // tb.blg
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "tabcontent";
    }

    @Override // tb.blg
    public c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("49ed05f1", new Object[]{this}) : new blv(1);
    }

    @Override // tb.blg
    public void a(Context context, c cVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aa40dad", new Object[]{this, context, cVar, jSONObject});
        } else if (!(cVar instanceof blv) || jSONObject == null) {
        } else {
            blv blvVar = (blv) cVar;
            blvVar.b_(1);
            blf.a(context, blvVar, jSONObject);
        }
    }
}
