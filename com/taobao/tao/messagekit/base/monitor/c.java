package com.taobao.tao.messagekit.base.monitor;

import android.database.Cursor;
import android.support.v4.util.ArrayMap;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import tb.kge;
import tb.olw;
import tb.omb;
import tb.omg;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONF_DEFAULT_TIME = "monitor_report_default_time";
    public static final int MONITOR_REPORT_DEFAULT_TIME = 2;
    public static final String TAG = "MonitorManager";
    private static String b;
    private d c = new d(0, null, null);

    /* renamed from: a  reason: collision with root package name */
    public ArrayMap<Integer, d> f20758a = new ArrayMap<>();

    /* loaded from: classes8.dex */
    public static class a implements InterfaceC0870c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1036731163);
            kge.a(-120014959);
        }

        @Override // com.taobao.tao.messagekit.base.monitor.c.InterfaceC0870c
        public long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue();
            }
            return 1000L;
        }

        @Override // com.taobao.tao.messagekit.base.monitor.c.InterfaceC0870c
        public boolean a(List<com.taobao.tao.messagekit.base.monitor.b> list, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("19a0788f", new Object[]{this, list, new Long(j)})).booleanValue();
            }
            return false;
        }

        @Override // com.taobao.tao.messagekit.base.monitor.c.InterfaceC0870c
        public boolean b(List<com.taobao.tao.messagekit.base.monitor.b> list, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a026332e", new Object[]{this, list, new Long(j)})).booleanValue();
            }
            return false;
        }
    }

    /* loaded from: classes8.dex */
    public static class b extends com.taobao.tao.messagekit.base.monitor.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-323985201);
        }

        @Override // tb.olw
        public int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
            }
            return 0;
        }

        @Override // com.taobao.tao.messagekit.base.monitor.a
        public com.taobao.tao.messagekit.base.monitor.b a(long j, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.tao.messagekit.base.monitor.b) ipChange.ipc$dispatch("80ea1426", new Object[]{this, new Long(j), str, str2});
            }
            return null;
        }

        @Override // com.taobao.tao.messagekit.base.monitor.a
        public List<com.taobao.tao.messagekit.base.monitor.b> a(Cursor cursor) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("cc960838", new Object[]{this, cursor}) : new ArrayList();
        }

        @Override // com.taobao.tao.messagekit.base.monitor.a
        public void a(String str, List<com.taobao.tao.messagekit.base.monitor.b> list, com.taobao.tao.messagekit.core.model.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b03be247", new Object[]{this, str, list, aVar});
            }
        }

        @Override // com.taobao.tao.messagekit.base.monitor.a
        public boolean b(List<com.taobao.tao.messagekit.base.monitor.b> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d39e1ede", new Object[]{this, list})).booleanValue();
            }
            return false;
        }

        @Override // com.taobao.tao.messagekit.base.monitor.a
        public String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : "";
        }

        @Override // com.taobao.tao.messagekit.base.monitor.a
        public int d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
            }
            return 0;
        }

        @Override // com.taobao.tao.messagekit.base.monitor.a
        public String g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : "";
        }
    }

    /* renamed from: com.taobao.tao.messagekit.base.monitor.c$c  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public interface InterfaceC0870c {
        long a();

        boolean a(List<com.taobao.tao.messagekit.base.monitor.b> list, long j);

        boolean b(List<com.taobao.tao.messagekit.base.monitor.b> list, long j);
    }

    /* loaded from: classes8.dex */
    public static class d implements olw {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int b;
        private com.taobao.tao.messagekit.base.monitor.a c = new b();
        private InterfaceC0870c d = new a();
        private boolean e = true;

        /* renamed from: a  reason: collision with root package name */
        public com.taobao.tao.messagekit.base.monitor.d f20760a = new com.taobao.tao.messagekit.base.monitor.d();

        static {
            kge.a(-1680878451);
            kge.a(1712074463);
        }

        public d(int i, com.taobao.tao.messagekit.base.monitor.a aVar, InterfaceC0870c interfaceC0870c) {
            this.b = i;
            a(aVar);
            a(interfaceC0870c);
        }

        @Override // tb.olw
        public int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.b;
        }

        public int a(com.taobao.tao.messagekit.base.monitor.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ffaee33c", new Object[]{this, aVar})).intValue();
            }
            if (aVar == null) {
                return 0;
            }
            this.c = aVar;
            return 1;
        }

        public int a(InterfaceC0870c interfaceC0870c) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d1c2c71b", new Object[]{this, interfaceC0870c})).intValue();
            }
            if (interfaceC0870c == null) {
                return 0;
            }
            this.d = interfaceC0870c;
            return 1;
        }

        public void a(long j, Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("53d73bda", new Object[]{this, new Long(j), runnable});
                return;
            }
            com.taobao.tao.messagekit.base.monitor.d dVar = this.f20760a;
            if (dVar == null) {
                return;
            }
            dVar.a(j, runnable);
        }

        public com.taobao.tao.messagekit.base.monitor.a b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.tao.messagekit.base.monitor.a) ipChange.ipc$dispatch("8dfa9aae", new Object[]{this}) : this.c;
        }

        public InterfaceC0870c c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (InterfaceC0870c) ipChange.ipc$dispatch("3389e7ac", new Object[]{this}) : this.d;
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            } else if (!this.e) {
            } else {
                this.e = false;
                MsgLog.c(c.TAG, Integer.valueOf(this.b), "init");
                com.taobao.tao.messagekit.base.d.a().h().c(a());
                if (!com.taobao.tao.messagekit.base.d.a().h().a(this.b).c().b(null, omg.b)) {
                    return;
                }
                com.taobao.tao.messagekit.base.d.a().h().a(a(), true);
            }
        }
    }

    static {
        kge.a(320099398);
        b = "mkt_monitor.db";
    }

    public static String a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d97c20e", new Object[]{str, new Long(j)});
        }
        if (str != null) {
            return str;
        }
        return "" + j;
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (!StringUtils.isEmpty(str2)) {
            return str2;
        }
        if (!StringUtils.isEmpty(str)) {
            return str;
        }
        return "nodid" + System.currentTimeMillis();
    }

    public static void a(com.taobao.tao.messagekit.base.monitor.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffaf57a8", new Object[]{bVar});
        } else {
            a(bVar, com.taobao.tao.messagekit.base.d.a().h().a(bVar.a()).c().a(), false);
        }
    }

    public static void a(final com.taobao.tao.messagekit.base.monitor.b bVar, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1472238", new Object[]{bVar, new Long(j), new Boolean(z)});
            return;
        }
        ArrayList<com.taobao.tao.messagekit.base.monitor.b> arrayList = new ArrayList<com.taobao.tao.messagekit.base.monitor.b>() { // from class: com.taobao.tao.messagekit.base.monitor.MonitorManager$1
            {
                add(b.this);
            }
        };
        MsgLog.a(TAG, "putMonitorRecordTask, key=", Long.valueOf(bVar.b()), "ID=", bVar.d(), "sysCode=", Integer.valueOf(bVar.a()), "typeID=", Integer.valueOf(bVar.c()), "time=", Long.valueOf(j));
        com.taobao.tao.messagekit.base.d.a().h().a(bVar.a(), j, z, arrayList);
    }

    public synchronized int a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1c33b7a", new Object[]{this, dVar})).intValue();
        } else if (dVar == null) {
            return -1;
        } else {
            MsgLog.c(TAG, "registerGuardian", Integer.valueOf(dVar.a()));
            this.f20758a.put(Integer.valueOf(dVar.a()), dVar);
            return 0;
        }
    }

    public d a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("37461afa", new Object[]{this, new Integer(i)});
        }
        d dVar = this.f20758a.get(Integer.valueOf(i));
        return dVar == null ? this.c : dVar;
    }

    public Collection<d> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("66d215f", new Object[]{this}) : new ArrayList(this.f20758a.values());
    }

    public void a(final int i, long j, boolean z, List<com.taobao.tao.messagekit.base.monitor.b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f00e845c", new Object[]{this, new Integer(i), new Long(j), new Boolean(z), list});
            return;
        }
        if (z || com.taobao.tao.messagekit.base.d.a().h().a(i).c().a(list, omg.b)) {
            Object[] objArr = new Object[6];
            objArr[0] = Integer.valueOf(i);
            objArr[1] = "record";
            objArr[2] = "size=";
            objArr[3] = Integer.valueOf(list == null ? 0 : list.size());
            objArr[4] = "time=";
            objArr[5] = Long.valueOf(j);
            MsgLog.c(TAG, objArr);
            com.taobao.tao.messagekit.base.monitor.monitorthread.a.a().a(omb.a(2, i, list), false);
        }
        if (!z && !com.taobao.tao.messagekit.base.d.a().h().a(i).c().b(list, omg.b)) {
            return;
        }
        if (j < 0) {
            j = -1;
        }
        com.taobao.tao.messagekit.base.d.a().h().a(i).a(j, new Runnable() { // from class: com.taobao.tao.messagekit.base.monitor.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    com.taobao.tao.messagekit.base.d.a().h().a(i, false);
                }
            }
        });
        if (com.taobao.tao.messagekit.base.d.a().h().b(i).e() < 500) {
            return;
        }
        MsgLog.c(TAG, Integer.valueOf(i), "trigger max report");
        com.taobao.tao.messagekit.base.d.a().h().a(i, false);
    }

    public void a(int i, List<com.taobao.tao.messagekit.base.monitor.b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52638a8c", new Object[]{this, new Integer(i), list});
            return;
        }
        MsgLog.a(TAG, Integer.valueOf(i), "putMonitorRemoveTask");
        com.taobao.tao.messagekit.base.monitor.monitorthread.a.a().a(omb.a(4, i, list), false);
    }

    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        MsgLog.c(TAG, Integer.valueOf(i), "putMessageReportTask");
        com.taobao.tao.messagekit.base.monitor.monitorthread.a.a().a(omb.a(3, i, null), false, z);
    }

    public com.taobao.tao.messagekit.base.monitor.a b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.messagekit.base.monitor.a) ipChange.ipc$dispatch("5b29817d", new Object[]{this, new Integer(i)}) : a(i).b();
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        for (d dVar : com.taobao.tao.messagekit.base.d.a().h().a()) {
            dVar.d();
        }
        if (com.taobao.tao.messagekit.base.monitor.monitorthread.a.a().getState() == Thread.State.NEW) {
            com.taobao.tao.messagekit.base.monitor.monitorthread.a.a().start();
        }
    }

    public void b(int i, List<com.taobao.tao.messagekit.base.monitor.b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8e9452b", new Object[]{this, new Integer(i), list});
            return;
        }
        MsgLog.a(TAG, Integer.valueOf(i), "putMonitorAddTask");
        com.taobao.tao.messagekit.base.monitor.monitorthread.a.a().a(omb.a(5, i, list), false);
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        MsgLog.c(TAG, Integer.valueOf(i), "putMonitorInitTask");
        com.taobao.tao.messagekit.base.monitor.monitorthread.a.a().a(omb.a(1, i, null), false, true);
    }
}
