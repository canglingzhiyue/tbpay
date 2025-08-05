package com.taobao.android.detail.core.detail.fragment.desc;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.holder.desc.b;
import com.taobao.android.detail.core.event.basic.m;
import com.taobao.android.detail.core.event.basic.o;
import com.taobao.android.detail.core.event.video.c;
import com.taobao.android.detail.core.event.video.e;
import com.taobao.android.detail.core.event.video.l;
import com.taobao.android.detail.core.event.video.n;
import com.taobao.android.detail.datasdk.event.sku.OpenSkuEvent;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.d;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import tb.dyq;
import tb.dyr;
import tb.edg;
import tb.eei;
import tb.emu;
import tb.eno;
import tb.kge;

/* loaded from: classes4.dex */
public class a extends eei {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Activity f9490a;
    private HashMap<Integer, dyq> b = new HashMap<>();
    private HashMap<Integer, dyq> c = new HashMap<>();
    private int d = -1;
    private dyr f = new dyr() { // from class: com.taobao.android.detail.core.detail.fragment.desc.a.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.dyr
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            if (a.this.d() != -1 && a.this.d() != i) {
                ((dyq) a.a(a.this).get(Integer.valueOf(a.this.d()))).c();
            }
            a.this.a(i);
        }

        @Override // tb.dyr
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                a.this.a(-1);
            }
        }

        @Override // tb.dyr
        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            } else {
                a.a(a.this, i);
            }
        }
    };
    private ArrayList<Integer> e = new ArrayList<>(1);

    static {
        kge.a(132443173);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.eei
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.detail.fragment.desc.DescVideoNativeController";
    }

    public static /* synthetic */ HashMap a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("6dea7953", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ void a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f21f1113", new Object[]{aVar, new Integer(i)});
        } else {
            aVar.b(i);
        }
    }

    public a(Activity activity) {
        this.f9490a = activity;
        e();
        emu.a("com.taobao.android.detail.core.detail.fragment.desc.DescVideoNativeController");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            f.a(this.f9490a).a(eno.a(m.class), this);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            f.a(this.f9490a).b(eno.a(m.class), this);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        f();
        this.b.clear();
        this.c.clear();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        d a2 = f.a(this.f9490a);
        if (a2 == null) {
            return;
        }
        a2.a(eno.a(o.class), this);
        a2.a(eno.a(OpenSkuEvent.class), this);
        a2.a(eno.a(n.class), this);
        a2.a(eno.a(com.taobao.android.detail.core.event.video.m.class), this);
        a2.a(eno.a(l.class), this);
        a2.a(eno.a(com.taobao.android.detail.core.event.video.f.class), this);
        a2.a(eno.a(edg.class), this);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        d a2 = f.a(this.f9490a);
        if (a2 == null) {
            return;
        }
        a2.b(eno.a(m.class), this);
        a2.b(eno.a(o.class), this);
        a2.b(eno.a(OpenSkuEvent.class), this);
        a2.b(eno.a(n.class), this);
        a2.b(eno.a(com.taobao.android.detail.core.event.video.m.class), this);
        a2.b(eno.a(l.class), this);
        a2.b(eno.a(com.taobao.android.detail.core.event.video.f.class), this);
        a2.b(eno.a(edg.class), this);
    }

    @Override // tb.eei, com.taobao.android.trade.event.j
    public i handleEvent(Event event) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event});
        }
        if (eno.a(com.taobao.android.detail.core.event.video.m.class) == event.getEventId()) {
            g();
            return com.taobao.android.detail.core.event.a.SUCCESS;
        } else if (eno.a(n.class) == event.getEventId()) {
            h();
            return com.taobao.android.detail.core.event.a.SUCCESS;
        } else if (eno.a(com.taobao.android.detail.core.event.video.f.class) == event.getEventId()) {
            g();
            return com.taobao.android.detail.core.event.a.SUCCESS;
        } else if (eno.a(o.class) == event.getEventId()) {
            return com.taobao.android.detail.core.event.a.SUCCESS;
        } else {
            if (eno.a(OpenSkuEvent.class) == event.getEventId()) {
                return com.taobao.android.detail.core.event.a.SUCCESS;
            }
            if (eno.a(edg.class) == event.getEventId()) {
                HashMap<Integer, dyq> hashMap = this.b;
                if (hashMap != null && !hashMap.isEmpty()) {
                    int d = d();
                    if (d != -1 && this.b.get(Integer.valueOf(d)) != null) {
                        a(d, (b) this.b.get(Integer.valueOf(d)));
                    } else if (d == -1 && (num = this.e.get(0)) != null) {
                        a(num.intValue(), (b) this.b.get(num));
                    }
                }
                return com.taobao.android.detail.core.event.a.SUCCESS;
            }
            return com.taobao.android.detail.core.event.a.FAILURE;
        }
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.d;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        dyq dyqVar = this.c.get(Integer.valueOf(d()));
        if (dyqVar == null) {
            return;
        }
        dyqVar.e();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        dyq dyqVar = this.c.get(Integer.valueOf(d()));
        if (dyqVar == null) {
            return;
        }
        dyqVar.d();
    }

    public dyq a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dyq) ipChange.ipc$dispatch("3aaf0442", new Object[]{this, bVar});
        }
        if (bVar != null && (bVar instanceof dyq)) {
            return (dyq) bVar;
        }
        return null;
    }

    public void a(int i, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bd23a3b", new Object[]{this, new Integer(i), bVar});
            return;
        }
        final dyq a2 = a(bVar);
        if (a2 == null) {
            return;
        }
        this.e.add(Integer.valueOf(i));
        a2.a(this.f);
        this.b.put(Integer.valueOf(i), a2);
        this.c.put(Integer.valueOf(i), a2);
        if (d() == -1 && a2.f()) {
            c.a(this.f9490a, new com.taobao.android.trade.event.c<e>() { // from class: com.taobao.android.detail.core.detail.fragment.desc.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.trade.event.c
                public void onEventException(j jVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9f9dab53", new Object[]{this, jVar});
                    }
                }

                @Override // com.taobao.android.trade.event.c
                public void a(e eVar, j jVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5d70d478", new Object[]{this, eVar, jVar});
                    } else if (eVar.f9738a) {
                    } else {
                        a2.a(0);
                    }
                }
            });
        } else if (d() == -1 || d() != i) {
        } else {
            a2.d();
        }
    }

    public void a(int i, boolean z, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("451ef0b9", new Object[]{this, new Integer(i), new Boolean(z), bVar});
            return;
        }
        dyq a2 = a(bVar);
        if (a2 == null) {
            return;
        }
        this.e.remove(Integer.valueOf(i));
        this.b.remove(Integer.valueOf(i));
        if (d() == -1) {
            return;
        }
        a2.b(true, z);
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        HashMap<Integer, dyq> hashMap = this.b;
        if (hashMap == null || hashMap.isEmpty()) {
            return;
        }
        Object[] array = this.b.keySet().toArray();
        Arrays.sort(array);
        List asList = Arrays.asList(array);
        int indexOf = asList.indexOf(Integer.valueOf(i));
        for (int i2 = indexOf + 1; i2 < asList.size(); i2++) {
            if (c(((Integer) asList.get(i2)).intValue())) {
                return;
            }
        }
        for (int i3 = 0; i3 < indexOf; i3++) {
            if (c(((Integer) asList.get(i3)).intValue())) {
                return;
            }
        }
        a(-1);
    }

    private boolean c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{this, new Integer(i)})).booleanValue();
        }
        dyq dyqVar = this.b.get(Integer.valueOf(i));
        if (!dyqVar.f()) {
            return false;
        }
        dyqVar.a(0);
        return true;
    }
}
