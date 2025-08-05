package tb;

import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class gpa implements gom {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-327024444);
        kge.a(1196462549);
    }

    @Override // tb.gom
    public void a(gol golVar, boolean z, boolean z2, IDMComponent iDMComponent, IDMComponent iDMComponent2, IDMComponent iDMComponent3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7537c700", new Object[]{this, golVar, new Boolean(z), new Boolean(z2), iDMComponent, iDMComponent2, iDMComponent3});
        } else if (z) {
            if (gof.h(iDMComponent3) || gof.g(iDMComponent3)) {
                golVar.a(2, b.a(R.string.taobao_app_1028_1_21643), true);
            } else if (gof.b(iDMComponent, golVar.c())) {
                golVar.a(2, b.a(R.string.taobao_app_1028_1_21624), true);
            } else {
                golVar.a(2, b.a(R.string.taobao_app_1028_1_21627), true);
            }
        } else if (gof.g(iDMComponent)) {
            if (gof.d(iDMComponent3, iDMComponent)) {
                golVar.a(1, b.a(R.string.taobao_app_1028_1_21630), true);
            } else {
                golVar.a(4, b.a(R.string.taobao_app_1028_1_21626), true);
            }
        } else {
            golVar.a(1, b.a(R.string.taobao_app_1028_1_21630), true);
        }
    }
}
