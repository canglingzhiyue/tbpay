package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.tao.recommend3.util.a;
import com.taobao.tao.topmultitab.c;

/* loaded from: classes7.dex */
public class kxj implements j<Event> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final lbo f30378a;
    private boolean b = false;

    static {
        kge.a(1617513226);
        kge.a(-1453870097);
    }

    public static /* synthetic */ void a(kxj kxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1f7ad1b", new Object[]{kxjVar});
        } else {
            kxjVar.b();
        }
    }

    public kxj(lbo lboVar) {
        this.f30378a = lboVar;
    }

    @Override // com.taobao.android.trade.event.j
    public i handleEvent(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event});
        }
        switch (event.getEventId()) {
            case 50043:
                e.e("NewFaceFestivalChange", "receive EVENT_NEW_FACE_FESTIVAL_UPDATE");
                a();
                break;
            case 50044:
                e.e("NewFaceFestivalChange", "receive EVENT_NEW_FACE_FESTIVAL_UPDATE_CHECK");
                if (this.b) {
                    a();
                    this.b = false;
                    break;
                }
                break;
        }
        return i.SUCCESS;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f30378a.j().c().a()) {
            c();
        } else {
            this.b = true;
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            c.a().H();
        }
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        int a2 = com.taobao.android.home.component.utils.j.a("randomDelayRefreshFestivalValue2", 0);
        ldf.d("NewFaceFestivalChange", "min : 0, max : " + a2);
        if (a2 < 0) {
            b();
            return;
        }
        int a3 = a.a(0, a2);
        ldf.d("NewFaceFestivalChange", "randomDelay : " + a3);
        com.taobao.gateway.dispatch.a.b().a(new Runnable() { // from class: tb.kxj.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    kxj.a(kxj.this);
                }
            }
        }, (long) a3);
    }
}
