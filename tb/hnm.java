package tb;

import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.container.render.view.MultiTabLayout;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.list.view.LockableRecycerView;

/* loaded from: classes5.dex */
public class hnm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(104398334);
    }

    public static /* synthetic */ boolean b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8f4da19f", new Object[]{fluidContext})).booleanValue() : c(fluidContext);
    }

    public static void a(final FluidContext fluidContext, final Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eed2118", new Object[]{fluidContext, runnable});
            return;
        }
        spz.c("IdleTaskHelper", "doWhenIdle --- runnable=" + runnable);
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: tb.hnm.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.MessageQueue.IdleHandler
            public boolean queueIdle() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                }
                spz.c("IdleTaskHelper", "queueIdle --- runnable=" + runnable);
                if (!hnm.b(fluidContext)) {
                    return true;
                }
                runnable.run();
                return false;
            }
        });
    }

    private static boolean c(FluidContext fluidContext) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ed73ba0", new Object[]{fluidContext})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            z = Looper.myQueue().isIdle();
            spz.c("IdleTaskHelper", "inIdle myQueue.isIdle :" + z);
        } else {
            z = true;
        }
        if (z) {
            z = !d(fluidContext);
        }
        spz.c("IdleTaskHelper", "final inIdle:" + z);
        return z;
    }

    public static boolean a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fc4079e", new Object[]{fluidContext})).booleanValue();
        }
        try {
            boolean isFastScroll = ((IFeedsListService) fluidContext.getService(IFeedsListService.class)).isFastScroll();
            sno mediaCardListAdapter = ((IFeedsListService) fluidContext.getService(IFeedsListService.class)).getMediaCardListAdapter();
            boolean l = mediaCardListAdapter != null ? mediaCardListAdapter.l() : false;
            boolean d = d(fluidContext);
            spz.c("IdleTaskHelper", "IdleTaskHelper --- isMainListIdle, fastScroll=" + isFastScroll + " showingLoadMore=" + l + " inTouchOrScroll=" + d);
            return !isFastScroll && !l && !d;
        } catch (Throwable th) {
            spz.c("IdleTaskHelper", "isMainListIdle error. " + th.getMessage());
            return true;
        }
    }

    private static boolean d(FluidContext fluidContext) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e60d5a1", new Object[]{fluidContext})).booleanValue();
        }
        ViewGroup contentView = ((IContainerService) fluidContext.getService(IContainerService.class)).getContentView();
        if (contentView instanceof MultiTabLayout) {
            z = !((MultiTabLayout) contentView).isTouchOnView();
            spz.c("IdleTaskHelper", "inIdle MultiTabLayout touch idle:" + z);
        } else {
            z = true;
        }
        LockableRecycerView recyclerView = ((IFeedsListService) fluidContext.getService(IFeedsListService.class)).getRecyclerView();
        if (recyclerView != null) {
            spz.c("IdleTaskHelper", " scrollState:" + recyclerView.getScrollState());
            z &= recyclerView.getScrollState() == 0;
        }
        return !z;
    }
}
