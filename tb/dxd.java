package tb;

import android.support.v7.widget.RecyclerView;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.observer.a;
import com.taobao.android.detail.core.event.basic.c;
import com.taobao.android.trade.event.f;
import java.util.List;

@AURAExtensionImpl(code = "aura.impl.event.switchToMainPic")
/* loaded from: classes4.dex */
public final class dxd extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "switch_main_pic";

    static {
        kge.a(-1034380503);
    }

    public static /* synthetic */ Object ipc$super(dxd dxdVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "switch_main_pic";
    }

    public dxd() {
        emu.a("com.taobao.android.detail.core.aura.extension.event.sku.AliDetailSwitchToMainPicEvent");
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
        } else {
            f();
        }
    }

    private void f() {
        elq a2;
        iyh a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        if (elt.a(b())) {
            f.a(b().e()).a(new c(null));
            if ((b().e() instanceof a) && (a3 = ((a) b().e()).a()) != null) {
                a3.a(a.KEY_PROP_PATH, (String) null);
            }
        }
        Object obj = b().a().get("token");
        if (!(obj instanceof String) || (a2 = elr.a((String) obj)) == null || !(a2.b() instanceof RecyclerView)) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) a2.b();
        atq atqVar = (atq) recyclerView.getAdapter();
        if (atqVar == null) {
            return;
        }
        List<AURARenderComponent> a4 = atqVar.a();
        if (bau.a(a4)) {
            return;
        }
        emn.a(recyclerView, a4.get(0), a4);
    }
}
