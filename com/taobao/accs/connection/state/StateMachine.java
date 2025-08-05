package com.taobao.accs.connection.state;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes.dex */
public abstract class StateMachine {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static long c;

    /* renamed from: a  reason: collision with root package name */
    public volatile a f8218a;
    private final Object b = new Object();

    /* loaded from: classes.dex */
    public static abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-11099928);
        }

        public abstract int a();

        public abstract void a(Event event);

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            }
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19031701", new Object[]{this, aVar});
            return;
        }
        c(aVar);
        this.f8218a = aVar;
    }

    public void b(a aVar) {
        a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("331e95a0", new Object[]{this, aVar});
            return;
        }
        c(aVar);
        synchronized (this.b) {
            aVar2 = this.f8218a;
            this.f8218a = aVar;
        }
        ALog.e("StateMachine", "transitionTo", "old_state", Integer.valueOf(aVar2.a()), "new_state", Integer.valueOf(this.f8218a.a()));
        if (aVar2.a() == this.f8218a.a()) {
            return;
        }
        this.f8218a.c();
        aVar2.b();
    }

    public int c() {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        synchronized (this.b) {
            a2 = this.f8218a.a();
        }
        return a2;
    }

    private void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d3a143f", new Object[]{this, aVar});
        } else if (aVar == null) {
            throw new NullPointerException("StateMachine's state = null");
        }
    }

    static {
        kge.a(1496696411);
        c = 0L;
    }

    public final void b(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf41c67", new Object[]{this, event});
        } else if (c > 0 && event.getHappenedTimeInMill() < c) {
            ALog.e("StateMachine", "event expired", "eventId", Integer.valueOf(event.getEventId()));
        } else {
            c = event.getHappenedTimeInMill();
            a(event);
        }
    }

    public void a(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60070548", new Object[]{this, event});
            return;
        }
        ALog.e("StateMachine", "processEvent", "eventId", Integer.valueOf(event.getEventId()), "stateId", Integer.valueOf(this.f8218a.a()));
        this.f8218a.a(event);
    }

    /* loaded from: classes.dex */
    public static class Event implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final int eventId;
        private final long happenedTimeInMill = SystemClock.elapsedRealtime();

        static {
            kge.a(-23965967);
            kge.a(1028243835);
        }

        private Event(int i) {
            this.eventId = i;
        }

        public static Event obtain(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Event) ipChange.ipc$dispatch("31fd30b7", new Object[]{new Integer(i)}) : new Event(i);
        }

        public long getHappenedTimeInMill() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7973d620", new Object[]{this})).longValue() : this.happenedTimeInMill;
        }

        public int getEventId() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue() : this.eventId;
        }
    }
}
