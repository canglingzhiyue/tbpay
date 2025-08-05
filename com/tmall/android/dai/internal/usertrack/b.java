package com.tmall.android.dai.internal.usertrack;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.internal.util.g;
import com.ut.mini.internal.f;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.gsg;
import tb.kge;
import tb.rqk;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TriggerEngine.UserTrackDataQueue";

    /* renamed from: a  reason: collision with root package name */
    private final BlockingQueue<UserTrackDO> f23705a;
    private final com.tmall.android.dai.internal.usertrack.a b;
    private final AtomicBoolean c;
    private String d;

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final b f23708a;

        static {
            kge.a(-1894265918);
            f23708a = new b();
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("d12c82e4", new Object[0]) : f23708a;
        }
    }

    static {
        kge.a(-1769596112);
    }

    public static /* synthetic */ String a(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("757662b8", new Object[]{bVar, str});
        }
        bVar.d = str;
        return str;
    }

    public static /* synthetic */ void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("747ec09e", new Object[]{bVar});
        } else {
            bVar.c();
        }
    }

    public static /* synthetic */ AtomicBoolean b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("5cd3191f", new Object[]{bVar}) : bVar.c;
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("d12c82e4", new Object[0]) : a.a();
    }

    private b() {
        this.f23705a = new LinkedBlockingQueue();
        this.c = new AtomicBoolean(false);
        this.d = null;
        this.b = com.tmall.android.dai.internal.usertrack.a.a();
        rqk.getInstance().registerAppStatusCallbacks(new gsg() { // from class: com.tmall.android.dai.internal.usertrack.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gsg, tb.rqi
            public void onSwitchBackground() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("74060788", new Object[]{this});
                } else {
                    b.a(b.this, null);
                }
            }
        });
    }

    public void a(UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa89db5", new Object[]{this, userTrackDO});
            return;
        }
        this.f23705a.offer(userTrackDO);
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.c.compareAndSet(false, true)) {
        } else {
            g.a(new Runnable() { // from class: com.tmall.android.dai.internal.usertrack.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    try {
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            b.a(b.this);
                        }
                    } catch (Exception e) {
                        com.taobao.mrt.utils.a.b(b.TAG, e.getMessage(), e);
                    } finally {
                        b.b(b.this).set(false);
                    }
                }
            });
        }
    }

    private synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        while (true) {
            UserTrackDO poll = this.f23705a.poll(1L, TimeUnit.SECONDS);
            if (poll == null) {
                return;
            }
            System.nanoTime();
            if (poll.getEventId() != -19999 && poll.getEventId() != 99099) {
                if (poll.getSesionId() == null) {
                    if (this.d == null) {
                        this.d = f.getInstance().getUtsid();
                    }
                    poll.setSessionId(this.d);
                }
                this.b.a(poll);
            }
            com.tmall.android.dai.trigger.c.a().a(poll);
        }
    }
}
