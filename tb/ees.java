package tb;

import android.os.Handler;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.widget.toast.b;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;

/* loaded from: classes4.dex */
public class ees implements j<enw> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DetailCoreActivity f27249a;
    private Handler b = new Handler();

    static {
        kge.a(-532990364);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(enw enwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, enwVar}) : a(enwVar);
    }

    public ees(DetailCoreActivity detailCoreActivity) {
        this.f27249a = detailCoreActivity;
        emu.a("com.taobao.android.detail.core.event.subscriber.basic.ShowToastSubscriber");
    }

    public i a(enw enwVar) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("581a3345", new Object[]{this, enwVar});
        }
        if (this.f27249a.isFinishing() || TextUtils.isEmpty(enwVar.b)) {
            return a.SUCCESS;
        }
        if ("2".equals(enwVar.c)) {
            b bVar = new b(this.f27249a);
            String str = enwVar.b;
            if (enwVar.f27481a) {
                i = 2;
            }
            bVar.a(str, i);
        } else {
            final com.taobao.android.detail.core.detail.widget.toast.a aVar = new com.taobao.android.detail.core.detail.widget.toast.a(this.f27249a);
            String str2 = enwVar.b;
            if (enwVar.f27481a) {
                i = 2;
            }
            aVar.a(str2, i);
            this.b.postDelayed(new Runnable() { // from class: tb.ees.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        aVar.a();
                    }
                }
            }, 2000L);
        }
        return a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
