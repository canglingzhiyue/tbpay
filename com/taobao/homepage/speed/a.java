package com.taobao.homepage.speed;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.d;
import com.taobao.homepage.datasource.OnDataSourceUpdatedListener;
import com.taobao.homepage.utils.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.kge;
import tb.kwy;
import tb.kxf;
import tb.lar;
import tb.opb;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final a f17276a;
    private final List<Event> b = new ArrayList();

    /* renamed from: com.taobao.homepage.speed.a$2  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17278a = new int[ThreadMode.values().length];

        static {
            try {
                f17278a[ThreadMode.MainThread.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17278a[ThreadMode.AsyncThread.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17278a[ThreadMode.BackgroundThread.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17278a[ThreadMode.CurrentThread.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static /* synthetic */ void a(a aVar, Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8a52ab6", new Object[]{aVar, event});
        } else {
            aVar.b(event);
        }
    }

    static {
        kge.a(343414310);
        f17276a = new a();
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("88e66d4e", new Object[0]) : f17276a;
    }

    private a() {
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!n.o()) {
            this.b.clear();
        } else {
            for (Event event : this.b) {
                if (event != null) {
                    kxf.a().a(event);
                    if (("resend event:" + event) != null) {
                        event.getClass().getName();
                    }
                }
            }
            this.b.clear();
        }
    }

    public void a(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1e8a50", new Object[]{this, event});
        } else {
            a(event, ThreadMode.CurrentThread);
        }
    }

    public void a(final Event event, ThreadMode threadMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95dc82d1", new Object[]{this, event, threadMode});
            return;
        }
        boolean b = opb.b();
        if (AnonymousClass2.f17278a[threadMode.ordinal()] != 1) {
            b(event);
        } else if (b) {
            b(event);
        } else {
            com.taobao.gateway.dispatch.a.b().c(new Runnable() { // from class: com.taobao.homepage.speed.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        a.a(a.this, event);
                    }
                }
            });
        }
    }

    private void b(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef5ff911", new Object[]{this, event});
        } else if (event == null) {
        } else {
            e.e("guzhan", "postEvent " + event.getClass().getSimpleName() + "  " + kwy.class.getSimpleName());
            d a2 = kxf.a();
            if (a2.b(event.getEventId())) {
                a2.a(event);
                return;
            }
            if ((event instanceof kwy) && ((kwy) event).a() == OnDataSourceUpdatedListener.DataSourceType.DS_TYPE_REMOTE_CONTENT) {
                Iterator<Event> it = this.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Event next = it.next();
                    if ((next instanceof kwy) && ((kwy) next).a() == OnDataSourceUpdatedListener.DataSourceType.DS_TYPE_CACHED_CONTENT) {
                        it.remove();
                        break;
                    }
                }
                e.e("guzhan", "减少一次二刷");
                lar.e("renderOnce");
                lar.f("renderOnce");
            }
            this.b.add(event);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.b.clear();
        }
    }
}
