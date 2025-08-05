package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.SeekBarScrollInterceptView;
import com.taobao.android.fluid.framework.container.IContainerService;

/* loaded from: classes5.dex */
public class iyq extends pta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final sii c;

    static {
        kge.a(-901240945);
    }

    public static /* synthetic */ Object ipc$super(iyq iyqVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1294174408) {
            super.onDisActive((psw) objArr[0]);
            return null;
        } else if (hashCode != -893732120) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onActive((psw) objArr[0]);
            return null;
        }
    }

    @Override // tb.ptc
    public String cL_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1e3f2f83", new Object[]{this}) : "SeekBarScrollInterceptLayer";
    }

    public iyq(FluidContext fluidContext, sii siiVar) {
        super(fluidContext, siiVar);
        this.c = siiVar;
    }

    @Override // tb.pta, tb.shm
    public void onActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cababae8", new Object[]{this, pswVar});
            return;
        }
        super.onActive(pswVar);
        SeekBarScrollInterceptView scrollInterceptView = ((IContainerService) this.f32873a.getService(IContainerService.class)).getScrollInterceptView();
        if (scrollInterceptView == null) {
            return;
        }
        scrollInterceptView.setCurrentRelatedView(this.c.Z().d(), this.c.aa().d());
        scrollInterceptView.setVisibility(0);
    }

    @Override // tb.pta, tb.shm
    public void onDisActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2dc7738", new Object[]{this, pswVar});
            return;
        }
        super.onDisActive(pswVar);
        SeekBarScrollInterceptView scrollInterceptView = ((IContainerService) this.f32873a.getService(IContainerService.class)).getScrollInterceptView();
        if (scrollInterceptView == null) {
            return;
        }
        scrollInterceptView.setVisibility(8);
    }
}
