package tb;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.a;
import com.alibaba.android.umf.datamodel.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public final class brp extends brl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1960318432);
    }

    public static /* synthetic */ Object ipc$super(brp brpVar, String str, Object... objArr) {
        if (str.hashCode() == -1054399266) {
            super.a((b) objArr[0], (brk) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.brm, tb.brj
    public void a(b bVar, brk brkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c12724de", new Object[]{this, bVar, brkVar});
        } else {
            super.a(bVar, brkVar);
        }
    }

    @Override // tb.brj
    public View a(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e8922edd", new Object[]{this, viewGroup, aURARenderComponentContainer});
        }
        brj a2 = a(aURARenderComponentContainer);
        if (a2 == null) {
            return b();
        }
        return a2.a(viewGroup, aURARenderComponentContainer);
    }

    private brj a(AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (brj) ipChange.ipc$dispatch("9d7b7a10", new Object[]{this, aURARenderComponentContainer});
        }
        if (aURARenderComponentContainer == null) {
            return null;
        }
        String str = aURARenderComponentContainer.name;
        if (!StringUtils.isEmpty(str)) {
            return a(str);
        }
        return null;
    }

    private View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        bqe.a().c("UMFNativeComponentCreatorAbility", "failed to create native view, use default instead");
        return new Space(this.d);
    }

    @Override // tb.brj
    public void a(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebad0c4", new Object[]{this, aURARenderComponent, view, new Integer(i)});
            return;
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null) {
            bqe.a().c("UMFNativeComponentCreatorAbility", "renderView#UMFRenderComponentData is null");
            return;
        }
        brj a2 = a(aURARenderComponentData.container);
        if (a2 == null) {
            bqd a3 = bqe.a();
            a3.c("UMFNativeComponentCreatorAbility", "renderView#cannot find componentCreator, containerInfo=" + aURARenderComponentData.container);
            return;
        }
        a2.a(aURARenderComponent, view, i);
    }

    @Override // tb.brj
    public String a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2c2912d", new Object[]{this, aURARenderComponent});
        }
        brj a2 = a(aURARenderComponent.data.container);
        if (a2 == null) {
            return a.C0066a.f2132a;
        }
        return a2.a(aURARenderComponent);
    }
}
