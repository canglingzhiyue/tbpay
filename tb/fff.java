package tb;

import android.content.Context;
import android.view.ViewGroup;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class fff implements ffc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f27885a = "AliSDetailMainGalleryUrlTokenAndItemIdAssembler";

    static {
        kge.a(-745670592);
        kge.a(1436023986);
    }

    public fff() {
        emu.a("com.taobao.android.detail.wrapper.industry.maingallery.render.component.vessel.urlassembler.impl.TBDetailMainGalleryUrlTokenAndItemIdAssembler");
    }

    @Override // tb.ffc
    public void a(ViewGroup viewGroup, AURARenderComponent aURARenderComponent, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eedc97f", new Object[]{this, viewGroup, aURARenderComponent, hashMap});
            return;
        }
        Context context = viewGroup.getContext();
        if (!(context instanceof DetailCoreActivity)) {
            arc.a().c("AliSDetailMainGalleryUrlTokenAndItemIdAssembler", "appendTokenAndItemIdToQueryParam", "context type error, must be DetailCoreActivity");
            return;
        }
        DetailCoreActivity detailCoreActivity = (DetailCoreActivity) context;
        hashMap.put("mh_token", detailCoreActivity.h);
        ebx ebxVar = detailCoreActivity.f9411a;
        if (ebxVar == null) {
            return;
        }
        hashMap.put("mh_itemId", ebxVar.f27180a);
    }
}
