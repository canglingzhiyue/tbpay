package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.tao.homepage.f;
import com.taobao.tao.log.TLog;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public class kyb implements j<kwy> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private lbo f30392a;

    static {
        kge.a(-1408573683);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(kwy kwyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, kwyVar}) : a(kwyVar);
    }

    public kyb(lbo lboVar) {
        this.f30392a = lboVar;
    }

    public i a(kwy kwyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("a1572764", new Object[]{this, kwyVar});
        }
        if (kwyVar.d) {
            return i.FAILURE;
        }
        if (!kwyVar.b()) {
            return i.FAILURE;
        }
        f.a().a(lbo.b().b(com.taobao.android.home.component.utils.i.a()), "homepage", new a(this.f30392a));
        return i.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.BackgroundThread;
    }

    /* loaded from: classes7.dex */
    public static class a implements f.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<lbo> f30393a;

        static {
            kge.a(-450757633);
            kge.a(-1737719104);
        }

        public a(lbo lboVar) {
            this.f30393a = new WeakReference<>(lboVar);
        }

        @Override // com.taobao.tao.homepage.f.b
        public void a() {
            lbo lboVar;
            Activity curActivity;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            WeakReference<lbo> weakReference = this.f30393a;
            if (weakReference == null || (lboVar = weakReference.get()) == null || (curActivity = lboVar.a().getCurActivity()) == null) {
                return;
            }
            curActivity.runOnUiThread(new Runnable() { // from class: tb.kyb.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TLog.loge("Home.TemplateDownloader", "download success, notifyDataSetChanged");
                    kxf.a().c(50033);
                }
            });
        }
    }
}
