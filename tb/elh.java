package tb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentLayout;
import com.alibaba.android.aura.datamodel.render.AURARenderIO;
import com.alibaba.android.aura.datamodel.render.AURARenderStickyFloatShowType;
import com.alibaba.android.aura.datamodel.render.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@AURAExtensionImpl(code = "alidetail.impl.topmask.data.adapter")
/* loaded from: classes4.dex */
public final class elh extends atm implements ath {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1454530916);
        kge.a(-450410939);
    }

    public static /* synthetic */ Object ipc$super(elh elhVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ath
    public void a(View view, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b016bcab", new Object[]{this, view, state});
        }
    }

    @Override // tb.ath
    public void a(AURAInputData<AURARenderIO> aURAInputData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4bc11", new Object[]{this, aURAInputData});
        }
    }

    @Override // tb.ath
    public void a(List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        }
    }

    @Override // tb.ath
    public void b(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ed2032", new Object[]{this, aURARenderComponent});
        }
    }

    public elh() {
        emu.a("com.taobao.android.detail.core.standard.mainpic.topmask.AliSDetailTopMaskDataAdapterExtension");
    }

    @Override // tb.ath
    public void a(AURARenderComponent aURARenderComponent) {
        AURARenderComponent aURARenderComponent2;
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7f23d3", new Object[]{this, aURARenderComponent});
            return;
        }
        AURARenderComponent c = c(aURARenderComponent);
        if (c == null || (aURARenderComponent2 = c.parent) == null) {
            return;
        }
        List<AURARenderComponent> list = aURARenderComponent2.children;
        if (bau.a(list) || (indexOf = list.indexOf(c)) < 0) {
            return;
        }
        for (AURARenderComponent aURARenderComponent3 : list) {
            if ("aliDetailTopMaskArea".equalsIgnoreCase(aURARenderComponent3.key)) {
                return;
            }
        }
        AURARenderComponent a2 = a();
        a2.parent = aURARenderComponent2;
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(indexOf, a2);
        aURARenderComponent2.children = arrayList;
    }

    private AURARenderComponent c(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("95b3e03c", new Object[]{this, aURARenderComponent});
        }
        if (aURARenderComponent != null && !bau.a(aURARenderComponent.children)) {
            if ("locatorArea".equalsIgnoreCase(aURARenderComponent.key)) {
                return aURARenderComponent;
            }
            for (AURARenderComponent aURARenderComponent2 : aURARenderComponent.children) {
                AURARenderComponent c = c(aURARenderComponent2);
                if (c != null) {
                    return c;
                }
            }
        }
        return null;
    }

    private AURARenderComponent a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("b75d01d3", new Object[]{this});
        }
        AURARenderComponent aURARenderComponent = new AURARenderComponent();
        aURARenderComponent.key = elg.COMPONENT_TYPE;
        AURARenderComponentData aURARenderComponentData = new AURARenderComponentData();
        aURARenderComponentData.container = new AURARenderComponentContainer(elg.COMPONENT_TYPE, elg.COMPONENT_TYPE, "1.0", null, null, null);
        aURARenderComponent.data = aURARenderComponentData;
        AURARenderComponent aURARenderComponent2 = new AURARenderComponent();
        aURARenderComponent2.key = "aliDetailTopMaskArea";
        AURARenderComponentData aURARenderComponentData2 = new AURARenderComponentData();
        HashMap hashMap = new HashMap();
        hashMap.put("showType", AURARenderStickyFloatShowType.showAlways);
        hashMap.put("position", "floatTop");
        AURARenderComponentLayout aURARenderComponentLayout = new AURARenderComponentLayout();
        aURARenderComponentLayout.type = "sticky";
        aURARenderComponentLayout.style = hashMap;
        aURARenderComponentData2.layout = aURARenderComponentLayout;
        aURARenderComponentData2.container = new AURARenderComponentContainer(a.b.f, "sticky", "1.0", null, null, null);
        aURARenderComponent2.data = aURARenderComponentData2;
        aURARenderComponent.parent = aURARenderComponent2;
        aURARenderComponent2.addChildComponent(aURARenderComponent);
        return aURARenderComponent2;
    }
}
