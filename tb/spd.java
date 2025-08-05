package tb;

import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import java.util.List;

/* loaded from: classes5.dex */
public class spd implements spc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private spg f33802a;

    static {
        kge.a(1422724742);
        kge.a(483350907);
    }

    @Override // tb.spc
    public a a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("70e78316", new Object[]{this, fluidContext});
        }
        return null;
    }

    @Override // tb.spc
    public void b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4da19b", new Object[]{this, fluidContext});
        }
    }

    @Override // tb.spc
    public void a(FluidContext fluidContext, Context context, f fVar, ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11536127", new Object[]{this, fluidContext, context, fVar, viewGroup, new Boolean(z)});
            return;
        }
        this.f33802a = new spt(context, fVar, fluidContext, viewGroup, z);
        this.f33802a.k();
    }

    @Override // tb.spc
    public RotateAnimation a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RotateAnimation) ipChange.ipc$dispatch("ce529029", new Object[]{this}) : this.f33802a.a();
    }

    @Override // tb.spc
    public void a(FluidContext fluidContext, List<a> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6090a3a9", new Object[]{this, fluidContext, list, new Boolean(z)});
            return;
        }
        spz.c("NormalOpen_PickPreloadController", "PickPreloadControllerNew,updateView");
        ((IDataService) fluidContext.getService(IDataService.class)).setMediaSet(list);
    }
}
