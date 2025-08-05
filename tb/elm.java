package tb;

import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.presenter.c;
import com.taobao.search.common.util.i;
import java.util.Map;

/* loaded from: classes4.dex */
public final class elm extends aqm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f27401a;

    static {
        kge.a(1892167713);
    }

    public elm() {
        emu.a("com.taobao.android.detail.core.standard.mainscreen.branch.AliSDetailMainGalleryComponentCondition");
    }

    @Override // tb.aqm, tb.aqn
    public void a(q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c6de311", new Object[]{this, qVar});
            return;
        }
        try {
            this.f27401a = (String) qVar.a("instanceType", String.class);
        } catch (Exception e) {
            arc.a().c("AliSDetailMainGalleryComponentCondition", i.b.MEASURE_ONCREATE, e.getMessage());
        }
    }

    @Override // tb.aqn
    public boolean a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{this, map})).booleanValue() : c.TYPE.equalsIgnoreCase(this.f27401a);
    }
}
