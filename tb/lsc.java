package tb;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultron.goods.list.IDMComponentsFrameLayout;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultron.goods.list.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.g;

/* loaded from: classes6.dex */
public class lsc extends kuj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a b;
    private String c;

    static {
        kge.a(1228765156);
    }

    public static /* synthetic */ Object ipc$super(lsc lscVar, String str, Object... objArr) {
        if (str.hashCode() == -1228224418) {
            super.a((g) objArr[0], (JSONObject) objArr[1], ((Number) objArr[2]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public lsc(c cVar, a aVar, String str) {
        super(cVar);
        this.b = aVar;
        this.c = str;
    }

    @Override // tb.kuj
    public g a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("64e5757e", new Object[]{this, new Integer(i)});
        }
        if (TextUtils.isEmpty(this.c)) {
            return null;
        }
        IDMComponentsFrameLayout a2 = this.b.a();
        a2.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        g gVar = new g(a2);
        gVar.a(true);
        gVar.a(this.c);
        his.b("UltronItemView", "onCreateViewHolder | ultron, viewType=" + i + "  renderType=" + this.c + "    holder=" + gVar);
        return gVar;
    }

    @Override // tb.kuj
    public void a(g gVar, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6cac85e", new Object[]{this, gVar, jSONObject, new Integer(i)});
            return;
        }
        super.a(gVar, jSONObject, i);
        String a2 = gVar.a();
        if (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.f() && !com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.a(this.f30327a) && TextUtils.equals("normal", a2) && hiu.a(jSONObject, true)) {
            a2 = "secKill";
        }
        this.b.a(this.f30327a, (IDMComponentsFrameLayout) gVar.itemView, jSONObject, a2);
        if (!jSONObject.getBooleanValue("native_topItemAnimShow")) {
            return;
        }
        this.b.a((IDMComponentsFrameLayout) gVar.itemView);
    }

    @Override // tb.kuj
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.c;
    }
}
