package tb;

import android.content.Context;
import com.alibaba.android.aura.service.event.c;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;

/* loaded from: classes4.dex */
public class efj implements efh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f27271a;
    private Context b;

    static {
        kge.a(-1301757806);
        kge.a(1880844890);
    }

    public efj(Context context, JSONObject jSONObject) {
        this.f27271a = jSONObject;
        this.b = context;
        emu.a("com.taobao.android.detail.core.event.subscriber.title.ExposeReportAction");
    }

    @Override // tb.efh
    public void a() {
        dwk G;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f27271a == null) {
        } else {
            Context context = this.b;
            if (!(context instanceof DetailCoreActivity) || (G = ((DetailCoreActivity) context).G()) == null || G.d() == null) {
                return;
            }
            String string = this.f27271a.getString("type");
            d dVar = new d();
            dVar.a("" + System.currentTimeMillis());
            dVar.a(this.f27271a.getJSONObject("fields"));
            c.a(G.d(), string, dVar);
        }
    }
}
