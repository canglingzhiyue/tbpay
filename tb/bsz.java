package tb;

import com.alibaba.appmonitor.event.EventType;
import com.alibaba.appmonitor.event.e;
import com.alipay.security.mobile.module.http.constant.RpcConfigureConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public class bsz implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f26118a;
    private static Map<Integer, bsz> e;
    private static HashMap<Integer, ScheduledFuture> f;
    private int b;
    private int c;
    private long d = System.currentTimeMillis();

    static {
        kge.a(-1023174479);
        kge.a(-1390502639);
        f26118a = false;
        f = new HashMap<>();
    }

    public static void a() {
        EventType[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (!f26118a) {
            apr.b("CommitTask", "init StatisticsAlarmEvent");
            e = new ConcurrentHashMap();
            for (EventType eventType : EventType.values()) {
                if (eventType.isOpen()) {
                    int eventId = eventType.getEventId();
                    bsz bszVar = new bsz(eventId, eventType.getForegroundStatisticsInterval() * 1000);
                    e.put(Integer.valueOf(eventId), bszVar);
                    f.put(Integer.valueOf(eventId), aqe.a().a(f.get(Integer.valueOf(eventId)), bszVar, bszVar.b));
                }
            }
            f26118a = true;
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        for (Integer num : f.keySet()) {
            ScheduledFuture scheduledFuture = f.get(num);
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                scheduledFuture.cancel(true);
            }
        }
        f26118a = false;
        e = null;
        f.clear();
    }

    public static void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{new Integer(i), new Integer(i2)});
            return;
        }
        synchronized (e) {
            bsz bszVar = e.get(Integer.valueOf(i));
            if (bszVar == null) {
                if (i2 > 0) {
                    bsz bszVar2 = new bsz(i, i2 * 1000);
                    e.put(Integer.valueOf(i), bszVar2);
                    f.put(Integer.valueOf(i), aqe.a().a(f.get(Integer.valueOf(i)), bszVar2, bszVar2.b));
                }
            } else if (i2 > 0) {
                int i3 = i2 * 1000;
                if (bszVar.b != i3) {
                    bszVar.b = i3;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = bszVar.b - (currentTimeMillis - bszVar.d);
                    if (j < 0) {
                        j = 0;
                    }
                    ScheduledFuture scheduledFuture = f.get(Integer.valueOf(i));
                    aqe.a().a(scheduledFuture, bszVar, j);
                    f.put(Integer.valueOf(i), scheduledFuture);
                    bszVar.d = currentTimeMillis;
                }
            } else {
                e.remove(Integer.valueOf(i));
            }
        }
    }

    private bsz(int i, int i2) {
        this.b = RpcConfigureConstant.STATIC_DATA_UPDATE_TIMEOUT;
        this.c = i;
        this.b = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        apr.b("CommitTask", "check&commit event", Integer.valueOf(this.c));
        e.a().b(this.c);
        if (!e.containsValue(this)) {
            return;
        }
        this.d = System.currentTimeMillis();
        f.put(Integer.valueOf(this.c), aqe.a().a(f.get(Integer.valueOf(this.c)), this, this.b));
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        for (EventType eventType : EventType.values()) {
            e.a().b(eventType.getEventId());
        }
    }
}
