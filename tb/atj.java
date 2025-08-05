package tb;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentLayout;
import com.alibaba.android.aura.datamodel.render.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

@AURAExtensionImpl(code = "aura.impl.render.component.creator.dividerLine")
/* loaded from: classes2.dex */
public final class atj extends atl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final float d = 12.0f;

    static {
        kge.a(1362793185);
    }

    @Override // tb.atc
    public View a(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e8922edd", new Object[]{this, viewGroup, aURARenderComponentContainer});
        }
        View view = new View(viewGroup.getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, bay.a(12.0f)));
        return view;
    }

    @Override // tb.atc
    public void a(AURARenderComponent aURARenderComponent, View view, int i) {
        AURARenderComponentLayout aURARenderComponentLayout;
        Map<String, Object> map;
        Float a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebad0c4", new Object[]{this, aURARenderComponent, view, new Integer(i)});
            return;
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null || (aURARenderComponentLayout = aURARenderComponentData.layout) == null || (map = aURARenderComponentLayout.style) == null || (a2 = bbc.a(map, "cardMargin", null)) == null || a2.floatValue() < 0.0f || a2.floatValue() == 12.0f) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int a3 = bay.a(a2.floatValue());
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, a3);
        } else {
            layoutParams.height = a3;
        }
        view.setLayoutParams(layoutParams);
    }

    @Override // tb.atc
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : a.b.e;
    }

    @Override // tb.atc
    public String a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e2c2912d", new Object[]{this, aURARenderComponent}) : a.b.e;
    }
}
