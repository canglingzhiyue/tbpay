package tb;

import android.view.ViewGroup;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class ffd implements ffc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-5688717);
        kge.a(1436023986);
    }

    public ffd() {
        emu.a("com.taobao.android.detail.wrapper.industry.maingallery.render.component.vessel.urlassembler.impl.TBDetailMainGalleryUrlFieldsAssembler");
    }

    @Override // tb.ffc
    public void a(ViewGroup viewGroup, AURARenderComponent aURARenderComponent, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eedc97f", new Object[]{this, viewGroup, aURARenderComponent, hashMap});
            return;
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData != null && aURARenderComponentData.fields == null) {
        }
    }
}
