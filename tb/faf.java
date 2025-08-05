package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes5.dex */
public class faf extends egv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1221038536);
    }

    @Override // tb.epi
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        return 44;
    }

    public faf(ComponentModel componentModel, b bVar) {
        super(componentModel, bVar);
        emu.a("com.taobao.android.detail.wrapper.ext.component.bottombar.viewmodel.BottomBarFavViewModel");
    }

    @Override // tb.epi
    public double b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d7", new Object[]{this})).doubleValue() : this.A;
    }

    public faf(IDMComponent iDMComponent, b bVar) {
        super(iDMComponent, bVar);
    }
}
