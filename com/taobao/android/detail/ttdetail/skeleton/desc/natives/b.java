package com.taobao.android.detail.ttdetail.skeleton.desc.natives;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import tb.kge;
import tb.syq;
import tb.syr;
import tb.szj;
import tb.szk;
import tb.szm;
import tb.szn;
import tb.szt;
import tb.szu;
import tb.szv;

/* loaded from: classes5.dex */
public class b implements com.taobao.android.detail.ttdetail.communication.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f10812a;
    private HashMap<Integer, syq> b = new HashMap<>();
    private HashMap<Integer, syq> c = new HashMap<>();
    private int d = -1;
    private syr f = new syr() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.b.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.syr
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            if (b.this.c() != -1 && b.this.c() != i) {
                ((syq) b.a(b.this).get(Integer.valueOf(b.this.c()))).a();
            }
            b.this.a(i);
        }

        @Override // tb.syr
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                b.this.a(-1);
            }
        }

        @Override // tb.syr
        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            } else {
                b.a(b.this, i);
            }
        }
    };
    private ArrayList<Integer> e = new ArrayList<>(1);

    static {
        kge.a(475359739);
        kge.a(-767194759);
    }

    public static /* synthetic */ HashMap a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("a74e475a", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ void a(b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("822d382c", new Object[]{bVar, new Integer(i)});
        } else {
            bVar.b(i);
        }
    }

    public b(Context context) {
        this.f10812a = context;
        d();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            com.taobao.android.detail.ttdetail.communication.c.a(this.f10812a, szm.class, this);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        e();
        this.b.clear();
        this.c.clear();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        com.taobao.android.detail.ttdetail.communication.c.a(this.f10812a, szm.class, this);
        com.taobao.android.detail.ttdetail.communication.c.a(this.f10812a, szn.class, this);
        com.taobao.android.detail.ttdetail.communication.c.a(this.f10812a, szv.class, this);
        com.taobao.android.detail.ttdetail.communication.c.a(this.f10812a, szu.class, this);
        com.taobao.android.detail.ttdetail.communication.c.a(this.f10812a, szt.class, this);
        com.taobao.android.detail.ttdetail.communication.c.a(this.f10812a, szk.class, this);
        com.taobao.android.detail.ttdetail.communication.c.a(this.f10812a, szj.class, this);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        com.taobao.android.detail.ttdetail.communication.c.a(this.f10812a, szm.class);
        com.taobao.android.detail.ttdetail.communication.c.a(this.f10812a, szn.class);
        com.taobao.android.detail.ttdetail.communication.c.a(this.f10812a, szv.class);
        com.taobao.android.detail.ttdetail.communication.c.a(this.f10812a, szu.class);
        com.taobao.android.detail.ttdetail.communication.c.a(this.f10812a, szt.class);
        com.taobao.android.detail.ttdetail.communication.c.a(this.f10812a, szk.class);
        com.taobao.android.detail.ttdetail.communication.c.a(this.f10812a, szj.class);
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.d;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        syq syqVar = this.c.get(Integer.valueOf(c()));
        if (syqVar == null) {
            return;
        }
        syqVar.c();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        syq syqVar = this.c.get(Integer.valueOf(c()));
        if (syqVar == null) {
            return;
        }
        syqVar.cH_();
    }

    public syq a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (syq) ipChange.ipc$dispatch("2ee19c66", new Object[]{this, eVar});
        }
        if (eVar != null && (eVar instanceof syq)) {
            return (syq) eVar;
        }
        return null;
    }

    public void a(int i, com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8acee302", new Object[]{this, new Integer(i), eVar});
            return;
        }
        syq a2 = a(eVar);
        if (a2 == null) {
            return;
        }
        this.e.add(Integer.valueOf(i));
        a2.a(this.f);
        this.b.put(Integer.valueOf(i), a2);
        this.c.put(Integer.valueOf(i), a2);
        com.taobao.android.detail.ttdetail.utils.i.a("desc video", "onItemVisible" + i + "|" + a2);
        if ((c() == -1 && a2.d()) || c() == -1 || c() != i) {
            return;
        }
        a2.cH_();
    }

    public void a(int i, boolean z, com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea068b44", new Object[]{this, new Integer(i), new Boolean(z), eVar});
            return;
        }
        syq a2 = a(eVar);
        if (a2 == null) {
            return;
        }
        this.e.remove(Integer.valueOf(i));
        this.b.remove(Integer.valueOf(i));
        com.taobao.android.detail.ttdetail.utils.i.a("desc video", "onItemInvisible" + i + "|" + a2);
        if (c() == -1) {
            return;
        }
        a2.a(true, z);
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        HashMap<Integer, syq> hashMap = this.b;
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
        syq syqVar = this.b.get(Integer.valueOf(i));
        if (!syqVar.d()) {
            return false;
        }
        syqVar.a(0);
        return true;
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public boolean receiveMessage(com.taobao.android.detail.ttdetail.communication.d dVar) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("318750e6", new Object[]{this, dVar})).booleanValue();
        }
        if (dVar instanceof szu) {
            f();
            return true;
        } else if (dVar instanceof szv) {
            g();
            return true;
        } else if (dVar instanceof szk) {
            f();
            return true;
        } else if (dVar instanceof szn) {
            return true;
        } else {
            if (!(dVar instanceof szj)) {
                return false;
            }
            HashMap<Integer, syq> hashMap = this.b;
            if (hashMap != null && !hashMap.isEmpty()) {
                int c = c();
                if (c != -1 && this.b.get(Integer.valueOf(c)) != null) {
                    a(c, (com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e) this.b.get(Integer.valueOf(c)));
                } else if (c == -1 && (num = this.e.get(0)) != null) {
                    a(num.intValue(), (com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e) this.b.get(num));
                }
            }
            return true;
        }
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public ThreadMode onRunThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this}) : ThreadMode.MainThread;
    }
}
