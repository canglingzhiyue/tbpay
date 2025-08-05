package tb;

import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class gpd implements gom {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2037441902);
        kge.a(1196462549);
    }

    @Override // tb.gom
    public void a(gol golVar, boolean z, boolean z2, IDMComponent iDMComponent, IDMComponent iDMComponent2, IDMComponent iDMComponent3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7537c700", new Object[]{this, golVar, new Boolean(z), new Boolean(z2), iDMComponent, iDMComponent2, iDMComponent3});
            return;
        }
        boolean b = gof.b(iDMComponent, golVar.c());
        gof.g(iDMComponent);
        if (gof.m(iDMComponent3) && b) {
            if (z) {
                golVar.a(2, b.a(R.string.taobao_app_1028_1_21643), true);
            } else {
                golVar.a(1, b.a(R.string.taobao_app_1028_1_21624), false);
            }
        } else if (gof.m(iDMComponent3) || !gof.m(iDMComponent)) {
        } else {
            if (z) {
                golVar.a(2, b.a(R.string.taobao_app_1028_1_21643), true);
            } else {
                golVar.a(1, b.a(R.string.taobao_app_1028_1_21627), false);
            }
        }
    }
}
