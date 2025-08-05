package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class asx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(717328961);
    }

    public static DXTemplateItem a(AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("66cfd923", new Object[]{aURARenderComponentContainer});
        }
        if (aURARenderComponentContainer == null || !a.b.f2133a.equals(aURARenderComponentContainer.containerType)) {
            return null;
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f11925a = aURARenderComponentContainer.name;
        dXTemplateItem.c = aURARenderComponentContainer.url;
        dXTemplateItem.e = aURARenderComponentContainer.isPreset;
        try {
            dXTemplateItem.b = Long.parseLong(aURARenderComponentContainer.version);
        } catch (NumberFormatException e) {
            dXTemplateItem.b = 1L;
            arc.a().c("UMFDXTemplateItemConverter", "convert", e.getMessage());
        }
        return dXTemplateItem;
    }

    public static List<DXTemplateItem> a(List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{list});
        }
        ArrayList arrayList = null;
        for (AURARenderComponent aURARenderComponent : list) {
            DXTemplateItem a2 = a(aURARenderComponent);
            if (a2 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public static DXTemplateItem a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("2395eacc", new Object[]{aURARenderComponent});
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData != null) {
            return a(aURARenderComponentData.container);
        }
        return null;
    }
}
