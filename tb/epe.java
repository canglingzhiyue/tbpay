package tb;

import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.b;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes4.dex */
public abstract class epe extends b {
    static {
        kge.a(-1084914755);
    }

    public epe(ComponentModel componentModel) {
        this(componentModel, (com.taobao.android.detail.datasdk.model.datamodel.node.b) null);
    }

    public epe(ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(componentModel, bVar);
        emu.a("com.taobao.android.detail.datasdk.model.viewmodel.container.DetailContainerViewModel");
    }

    public epe(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(iDMComponent, bVar);
        emu.a("com.taobao.android.detail.datasdk.model.viewmodel.container.DetailContainerViewModel");
    }
}
