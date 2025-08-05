package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.parse.c;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b;

/* loaded from: classes7.dex */
public class npy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c<ActivateTypedBean, b> f31637a;

    static {
        kge.a(1590436801);
    }

    public npy(imn imnVar) {
        this.f31637a = new c<>(imnVar, new nqv(), new nqu());
    }

    public void a(nqr nqrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6b73569", new Object[]{this, nqrVar});
        } else {
            this.f31637a.a(nqrVar);
        }
    }

    public ActivateTypedBean a(JSONObject jSONObject, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ActivateTypedBean) ipChange.ipc$dispatch("a1d90569", new Object[]{this, jSONObject, bVar}) : (ActivateTypedBean) this.f31637a.a(jSONObject, (JSONObject) bVar);
    }
}
