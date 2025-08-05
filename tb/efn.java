package tb;

import android.content.Context;
import com.alibaba.android.aura.service.event.c;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;

/* loaded from: classes4.dex */
public class efn implements efh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f27279a;
    private Context b;

    static {
        kge.a(1062761202);
        kge.a(1880844890);
    }

    public efn(Context context, JSONObject jSONObject) {
        this.f27279a = jSONObject;
        this.b = context;
        emu.a("com.taobao.android.detail.core.event.subscriber.title.UserTrackAction");
    }

    @Override // tb.efh
    public void a() {
        dwk G;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Context context = this.b;
        if (!(context instanceof DetailCoreActivity) || (G = ((DetailCoreActivity) context).G()) == null || G.d() == null) {
            return;
        }
        d dVar = new d();
        dVar.a("" + System.currentTimeMillis());
        dVar.a(this.f27279a);
        c.a(G.d(), "userTrack", dVar);
    }
}
