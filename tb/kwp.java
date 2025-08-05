package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.g;

/* loaded from: classes6.dex */
public class kwp extends kuj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String b;
    private DXRootView c;

    static {
        kge.a(-1986781084);
    }

    public static /* synthetic */ Object ipc$super(kwp kwpVar, String str, Object... objArr) {
        if (str.hashCode() == -1228224418) {
            super.a((g) objArr[0], (JSONObject) objArr[1], ((Number) objArr[2]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public kwp(c cVar, String str) {
        super(cVar);
        this.b = str;
    }

    @Override // tb.kuj
    public g a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("64e5757e", new Object[]{this, new Integer(i)});
        }
        if (this.f30327a == null || this.f30327a.f() == null) {
            return null;
        }
        this.c = hhs.a().b(this.f30327a.f(), this.b);
        DXRootView dXRootView = this.c;
        if (dXRootView == null) {
            new View(this.f30327a.f()).setTag("null");
            return new g(new View(this.f30327a.f()));
        }
        return new g(dXRootView);
    }

    @Override // tb.kuj
    public void a(g gVar, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6cac85e", new Object[]{this, gVar, jSONObject, new Integer(i)});
            return;
        }
        super.a(gVar, jSONObject, i);
        if (this.c == null || jSONObject == null) {
            his.b("DXItemView", "onBindViewHolder | itemView exception,  mDXRootView=" + this.c + "    data=" + jSONObject);
            return;
        }
        his.b("DXItemView", "onBindViewHolder | dx,  holder=" + this.c);
        hhs.a().a(this.c, jSONObject, this.f30327a);
        if (!jSONObject.getBooleanValue("native_topItemAnimShow")) {
            return;
        }
        hhs.a().b(this.c);
    }

    @Override // tb.kuj
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
    }
}
