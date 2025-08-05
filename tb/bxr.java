package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;

/* loaded from: classes7.dex */
public class bxr implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f26168a;
    private int b;

    static {
        kge.a(-990837140);
        kge.a(-1390502639);
    }

    public bxr(ljs ljsVar) {
        this.f26168a = ljsVar;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            a(-1);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        c();
        a();
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : a(this.f26168a) != -1;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f26168a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            return;
        }
        int a2 = a(this.f26168a);
        if (a2 == -1) {
            ldf.d("ScrollToBannerRunnable", "未找到目标位置");
            return;
        }
        ldf.d("ScrollToBannerRunnable", "执行滚动到banner，bannerPosition ： " + a2);
        iMainFeedsViewService.smoothScrollToPositionWithOffset(a2, 0);
    }

    private int a(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f2eb53f6", new Object[]{this, ljsVar})).intValue();
        }
        int b = b(ljsVar);
        if (b == -1) {
            ldf.d("ScrollToBannerRunnable", "未找到首焦的位置,尝试寻找信息流首坑的位置");
            b = liy.a(ljsVar);
        }
        if (b == -1) {
            ldf.d("ScrollToBannerRunnable", "未找到首焦或信息流首坑，不执行");
            return -1;
        } else if (!a(ljsVar, b)) {
            ldf.d("ScrollToBannerRunnable", "目标卡片上边沿不可见");
            return -1;
        } else if (b <= this.b) {
            return b;
        } else {
            ldf.d("ScrollToBannerRunnable", "bannerPosition ： " + b + "，mLastClickIndex ： " + this.b);
            return -1;
        }
    }

    private boolean a(ljs ljsVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a7f9f64", new Object[]{this, ljsVar, new Integer(i)})).booleanValue();
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            ldf.d("ScrollToBannerRunnable", "isCardTopEdgeVisible mainFeedsViewService is null");
            return false;
        }
        return bxs.a(ljsVar, iMainFeedsViewService, i);
    }

    private int b(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e16e5a77", new Object[]{this, ljsVar})).intValue() : bxs.a(bxn.c(ljsVar));
    }
}
