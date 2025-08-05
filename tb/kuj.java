package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.g;

/* loaded from: classes6.dex */
public abstract class kuj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public c f30327a;
    public int d;

    static {
        kge.a(-962044332);
    }

    public abstract g a(int i);

    public abstract String a();

    public kuj(c cVar) {
        this.f30327a = cVar;
    }

    public void a(g gVar, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6cac85e", new Object[]{this, gVar, jSONObject, new Integer(i)});
        } else {
            this.d = i;
        }
    }
}
