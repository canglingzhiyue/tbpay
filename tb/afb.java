package tb;

import android.content.Context;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lightbuy.a;
import com.taobao.android.purchase.aura.b;
import java.util.Map;

@AURAExtensionImpl(code = "lightbuy.impl.nextrpc.requestParams")
/* loaded from: classes5.dex */
public final class afb extends asf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private afa f25301a;

    static {
        kge.a(1972271092);
    }

    public static /* synthetic */ Object ipc$super(afb afbVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.asf, tb.asg
    public void b(AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15d40e4c", new Object[]{this, aURANextRPCEndpoint});
            return;
        }
        Context e = c().e();
        if (!(e instanceof b) || !"weex".equals(((b) e).getRenderContainer())) {
            return;
        }
        a(aURANextRPCEndpoint.getDataParams());
    }

    private void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map != null) {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                jSONObject.put(str, (Object) map.get(str));
            }
            afa g = g();
            if (g == null) {
                arc.a().b("LightBuyDataSourceManager is null !!");
            } else {
                g.a(c().e(), jSONObject);
            }
        }
    }

    private afa g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (afa) ipChange.ipc$dispatch("3d2c27fc", new Object[]{this});
        }
        afa afaVar = this.f25301a;
        if (afaVar != null) {
            return afaVar;
        }
        a aVar = (a) c().a(a.KEY_LIGHT_BUY, a.class);
        if (aVar == null) {
            return null;
        }
        this.f25301a = aVar.b();
        return this.f25301a;
    }
}
