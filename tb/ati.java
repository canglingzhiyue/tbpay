package tb;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.a;
import com.android.alibaba.ip.runtime.IpChange;

@AURAExtensionImpl(code = "aura.impl.render.component.creator.default")
/* loaded from: classes2.dex */
public final class ati extends atl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1297138293);
    }

    @Override // tb.atc
    public void a(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebad0c4", new Object[]{this, aURARenderComponent, view, new Integer(i)});
        }
    }

    @Override // tb.atc
    public View a(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("e8922edd", new Object[]{this, viewGroup, aURARenderComponentContainer}) : new Space(viewGroup.getContext());
    }

    @Override // tb.atc
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : a.b.d;
    }

    @Override // tb.atc
    public String a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e2c2912d", new Object[]{this, aURARenderComponent}) : a.C0066a.f2132a;
    }
}
