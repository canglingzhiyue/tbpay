package com.alibaba.android.ultron.vfw.template;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.bnu;
import tb.bny;
import tb.bpd;
import tb.brx;
import tb.fvd;
import tb.jnq;
import tb.jns;
import tb.jqg;
import tb.kge;

/* loaded from: classes2.dex */
public class b extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final Map<String, DXTemplateItem> f2731a = new HashMap();
    private ConcurrentHashMap<String, String> b;
    private final bd c;
    private final bny e;
    private final g f;

    static {
        kge.a(850006727);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(b bVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df9acffb", new Object[]{bVar, list});
        } else {
            bVar.a(list);
        }
    }

    public static /* synthetic */ void b(b bVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dfbd3da", new Object[]{bVar, list});
        } else {
            bVar.b(list);
        }
    }

    public static /* synthetic */ boolean c(b bVar, List list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dc5cd7bd", new Object[]{bVar, list})).booleanValue() : bVar.c(list);
    }

    public b(bny bnyVar) {
        this.e = bnyVar;
        this.f = new g(bnyVar, new jnq<List<DXTemplateItem>>() { // from class: com.alibaba.android.ultron.vfw.template.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                b.this = this;
            }

            @Override // tb.jnq
            public void a(List<DXTemplateItem> list) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
                } else {
                    b.a(b.this, list);
                }
            }
        }, new jnq<List<DXTemplateItem>>() { // from class: com.alibaba.android.ultron.vfw.template.DinamicXTemplateProvider$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jnq
            public void a(List<DXTemplateItem> list) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
                } else if (list == null) {
                } else {
                    b.b(b.this, list);
                }
            }
        }, new jns<Boolean, List<fvd>>() { // from class: com.alibaba.android.ultron.vfw.template.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                b.this = this;
            }

            @Override // tb.jns
            public Boolean a(List<fvd> list) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("a441f696", new Object[]{this, list}) : Boolean.valueOf(b.c(b.this, list));
            }
        });
        this.c = bnyVar.e().a();
        this.c.a(this.f);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        bd bdVar = this.c;
        if (bdVar == null) {
            return;
        }
        bdVar.b(this.f);
    }

    private void a(List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null) {
            for (DXTemplateItem dXTemplateItem : list) {
                a(dXTemplateItem.f11925a, dXTemplateItem.g());
            }
        }
    }

    @Override // com.alibaba.android.ultron.vfw.template.c
    public void a(List<com.taobao.android.ultron.common.model.a> list, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37717637", new Object[]{this, list, dVar});
        } else {
            a(list, dVar, (brx) null);
        }
    }

    public void a(List<com.taobao.android.ultron.common.model.a> list, d dVar, brx brxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a8faa7f", new Object[]{this, list, dVar, brxVar});
        } else if (list == null || list.isEmpty()) {
        } else {
            this.f.a(dVar);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (brxVar != null && brxVar.f()) {
                b(list, arrayList, arrayList2);
            } else {
                a(list, arrayList, arrayList2, brxVar);
            }
        }
    }

    private void a(List<com.taobao.android.ultron.common.model.a> list, List<DXTemplateItem> list2, List<DXTemplateItem> list3, brx brxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11698d83", new Object[]{this, list, list2, list3, brxVar});
            return;
        }
        jnq<DXTemplateItem> g = brxVar != null ? brxVar.g() : null;
        for (com.taobao.android.ultron.common.model.a aVar : list) {
            if (aVar != null) {
                DXTemplateItem a2 = bnu.a(aVar);
                bny bnyVar = this.e;
                if (bnyVar != null && bnyVar.E() != null && this.e.E().g() != null) {
                    this.e.E().g();
                }
                if (a2.b <= 0) {
                    continue;
                } else {
                    DXTemplateItem a3 = this.c.a(a2);
                    if (a3 == null) {
                        list2.add(a2);
                        if (g != null) {
                            g.a(a2);
                        }
                        jqg.a("DinamicXTemplateProvider", "fetch为空，准备下载DX:", a2.f());
                    } else {
                        String str = a3.f11925a;
                        if (a2.b != a3.b) {
                            list2.add(a2);
                            if (g != null) {
                                g.a(a2);
                            }
                            jqg.a("DinamicXTemplateProvider", "版本不一致，准备下载DX:", a2.f());
                        }
                        synchronized (this) {
                            a(list3, a2, a3);
                        }
                        a(str, a3.g());
                    }
                }
            }
        }
        if (list3.size() > 0) {
            b(list3);
        }
        int size = list2.size();
        if (size <= 0) {
            return;
        }
        jqg.b("DinamicXTemplateProvider", "下载DX组件，个数：" + size);
        this.c.a(list2);
    }

    private void b(List<com.taobao.android.ultron.common.model.a> list, List<DXTemplateItem> list2, List<DXTemplateItem> list3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc8b4ebc", new Object[]{this, list, list2, list3});
            return;
        }
        jqg.b("DinamicXTemplateProvider", "缓存渲染，跳过模板下载");
        for (com.taobao.android.ultron.common.model.a aVar : list) {
            if (aVar != null) {
                DXTemplateItem a2 = bnu.a(aVar);
                if (a2.b > 0) {
                    DXTemplateItem a3 = this.c.a(a2);
                    if (a3 == null) {
                        list2.add(a2);
                    } else {
                        a(a3);
                    }
                }
            }
        }
    }

    private void a(List<DXTemplateItem> list, DXTemplateItem dXTemplateItem, DXTemplateItem dXTemplateItem2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("793b3b6b", new Object[]{this, list, dXTemplateItem, dXTemplateItem2});
            return;
        }
        String str = dXTemplateItem2.f11925a;
        DXTemplateItem dXTemplateItem3 = this.f2731a.get(str);
        if (dXTemplateItem3 == null) {
            this.f2731a.put(str, dXTemplateItem2);
            return;
        }
        long j = dXTemplateItem3.b;
        long j2 = dXTemplateItem2.b;
        if (j >= j2) {
            z = false;
        }
        if (!z) {
            return;
        }
        if (bpd.g()) {
            if (dXTemplateItem.b != j2) {
                return;
            }
            list.add(dXTemplateItem);
            return;
        }
        list.add(dXTemplateItem);
    }

    private void a(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a042611", new Object[]{this, dXTemplateItem});
            return;
        }
        String str = dXTemplateItem.f11925a;
        if (this.f2731a.get(str) != null) {
            return;
        }
        this.f2731a.put(str, dXTemplateItem);
    }

    public DXTemplateItem a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXTemplateItem) ipChange.ipc$dispatch("606b2ecd", new Object[]{this, str}) : this.f2731a.get(str);
    }

    private void b(List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        for (DXTemplateItem dXTemplateItem : list) {
            if (dXTemplateItem != null) {
                this.f2731a.put(dXTemplateItem.f11925a, dXTemplateItem);
            }
        }
    }

    private boolean c(List<fvd> list) {
        DXTemplateItem a2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e037145f", new Object[]{this, list})).booleanValue();
        }
        for (fvd fvdVar : list) {
            if (fvdVar != null && fvdVar.f28145a != null && fvdVar.c == 1000 && (a2 = this.c.a(fvdVar.f28145a)) != null && !a2.equals(this.f2731a.get(a2.f11925a))) {
                this.f2731a.put(a2.f11925a, a2);
                z = true;
            }
        }
        return z;
    }

    public Map<String, DXTemplateItem> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.f2731a;
    }

    private void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
        } else if (str == null) {
        } else {
            if (this.b == null) {
                this.b = new ConcurrentHashMap<>();
            }
            this.b.put(str, String.valueOf(j));
        }
    }

    @Override // com.alibaba.android.ultron.vfw.template.a
    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        ConcurrentHashMap<String, String> concurrentHashMap = this.b;
        return concurrentHashMap != null && str2.equals(concurrentHashMap.get(str));
    }
}
