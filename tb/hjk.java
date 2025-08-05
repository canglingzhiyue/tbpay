package tb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import com.taobao.android.fluid.framework.preload.dwinstance.c;
import com.taobao.avplayer.DWInstanceType;

/* loaded from: classes5.dex */
public final class hjk extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private sor f28700a;
    private FluidContext b;

    static {
        kge.a(1009433819);
    }

    public hjk(FluidContext fluidContext, View view) {
        super(view);
        this.b = fluidContext;
    }

    public void a(sor sorVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff234182", new Object[]{this, sorVar});
            return;
        }
        this.f28700a = sorVar;
        if (sorVar == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.itemView;
        if (sil.e()) {
            frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
        }
        IUsePreloadService iUsePreloadService = (IUsePreloadService) this.b.getService(IUsePreloadService.class);
        snv snvVar = sorVar.f33778a;
        ViewGroup f = snvVar.f();
        c.b(f);
        if (f == null) {
            return;
        }
        sjq videoCommentSizeObject = iUsePreloadService.setVideoCommentSizeObject(f);
        snvVar.a(videoCommentSizeObject.d, videoCommentSizeObject.c);
        snvVar.a(DWInstanceType.VIDEO);
        FrameLayout.LayoutParams a2 = soi.a(this.b.getContext(), videoCommentSizeObject, soq.a(this.b));
        if (f.getParent() instanceof ViewGroup) {
            ((ViewGroup) f.getParent()).removeView(f);
        }
        frameLayout.addView(f, a2);
        if (this.f28700a.o != null) {
            if (this.f28700a.o.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.f28700a.o.getParent()).removeView(this.f28700a.o);
            }
            if (snvVar.e() != 1) {
                frameLayout.addView(this.f28700a.o, a2);
            }
        }
        spz.c("CacheVideoViewHolder", "添加预加载视频到cell videoCommentSizeObject = " + videoCommentSizeObject);
        spz.c("CacheVideoViewHolder", "添加预加载视频到cell, w:" + a2.width + " h:" + a2.height + " top:" + a2.topMargin + " bottom:" + a2.bottomMargin);
    }
}
