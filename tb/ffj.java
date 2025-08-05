package tb;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;

/* loaded from: classes5.dex */
public class ffj extends etw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f27899a = "DetailWeexMainPicAutoScrollLifecycle";

    static {
        kge.a(1199752125);
    }

    public ffj() {
        emu.a("com.taobao.android.detail.wrapper.mainpic.autoscroll.DetailWeexMainPicAutoScrollLifecycle");
    }

    @Override // tb.etw
    public void a(final RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
        } else if (recyclerView == null) {
        } else {
            final int intValue = ((Integer) eue.a(ffk.class, Integer.class, -1)).intValue();
            if (-1 == intValue) {
                i.a("DetailWeexMainPicAutoScrollLifecycle", "afterUltronRenderData,no need to scroll, because invalid position");
            } else {
                recyclerView.post(new Runnable() { // from class: tb.ffj.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        RecyclerView.Adapter adapter = recyclerView.getAdapter();
                        if (adapter == null) {
                            return;
                        }
                        int itemCount = adapter.getItemCount();
                        int i = intValue;
                        if (i >= 0 && i < itemCount) {
                            recyclerView.scrollToPosition(i);
                            recyclerView.post(new Runnable() { // from class: tb.ffj.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    recyclerView.onScrollStateChanged(0);
                                    eue.a(ffk.class);
                                    eue.a(euf.class);
                                }
                            });
                            return;
                        }
                        i.a("DetailWeexMainPicAutoScrollLifecycle", "afterUltronRenderData,frameIndex" + intValue + " is out of bound[0," + itemCount + riy.ARRAY_END_STR);
                    }
                });
            }
        }
    }
}
