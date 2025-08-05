package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.utils.c;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.performance.i;

@AURAExtensionImpl(code = "alidetail.impl.mainpic.degrade")
/* loaded from: classes4.dex */
public final class ejr extends arm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1360967133);
    }

    public ejr() {
        emu.a("com.taobao.android.detail.core.standard.mainpic.error.AliSDetailMainPicDowngradeExtension");
    }

    @Override // tb.aro
    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c671180", new Object[]{this, bVar});
            return;
        }
        if ("AURARenderServiceDomain".equals(bVar.f()) && bVar.c() != null && bVar.c().get("containerName") != null) {
            String bVar2 = bVar.toString();
            String a2 = i.a("AliSDetailMainPicDowngradeExtension", BTags.DxRender);
            com.taobao.android.detail.core.utils.i.a(a2, "aura header render dx error:" + bVar2);
            eca.a(a().e(), bVar2, bVar.c(), eca.TYPE_DETAIL_AURA);
        }
        if (bVar.d() != 0) {
            return;
        }
        arc.a().c("AliSDetailMainPicDowngradeExtension", "onError", "行业化头图降级了");
        c.a(a().e());
    }
}
