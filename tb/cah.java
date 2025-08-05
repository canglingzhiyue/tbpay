package tb;

import com.alibaba.poplayer.trigger.Event;
import com.alibaba.poplayer.trigger.FutureEvent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class cah {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<Event> f26224a = new CopyOnWriteArrayList();
    private final List<FutureEvent> b = new CopyOnWriteArrayList();

    /* loaded from: classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final cah f26225a;

        static {
            kge.a(458861434);
            f26225a = new cah();
        }

        public static /* synthetic */ cah a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (cah) ipChange.ipc$dispatch("f031e94", new Object[0]) : f26225a;
        }
    }

    static {
        kge.a(-867028825);
    }

    public static cah a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cah) ipChange.ipc$dispatch("f031e94", new Object[0]) : a.a();
    }

    public List<Event> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.f26224a;
    }

    public List<FutureEvent> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.b;
    }

    public void a(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee64f7e2", new Object[]{this, event});
        } else {
            this.f26224a.add(event);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.f26224a.clear();
        }
    }

    public void a(FutureEvent futureEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9812fc5", new Object[]{this, futureEvent});
        } else {
            this.b.add(futureEvent);
        }
    }

    public void b(FutureEvent futureEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6efb5606", new Object[]{this, futureEvent});
        } else {
            this.b.remove(futureEvent);
        }
    }
}
