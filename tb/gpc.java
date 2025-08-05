package tb;

import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class gpc implements gom {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1885180943);
        kge.a(1196462549);
    }

    @Override // tb.gom
    public void a(gol golVar, boolean z, boolean z2, IDMComponent iDMComponent, IDMComponent iDMComponent2, IDMComponent iDMComponent3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7537c700", new Object[]{this, golVar, new Boolean(z), new Boolean(z2), iDMComponent, iDMComponent2, iDMComponent3});
            return;
        }
        golVar.a(false, iDMComponent3, iDMComponent2, golVar.e().indexOf(iDMComponent2), gof.d(iDMComponent3) && (gof.g(iDMComponent2) || gof.h(iDMComponent2)));
        if (golVar.d().isEmpty()) {
            golVar.a(0, "", true);
        } else {
            golVar.a(4, a(iDMComponent3, iDMComponent2), true);
        }
    }

    private String a(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c42d0ab8", new Object[]{this, iDMComponent, iDMComponent2}) : b.a(R.string.taobao_app_1028_1_21635);
    }
}
