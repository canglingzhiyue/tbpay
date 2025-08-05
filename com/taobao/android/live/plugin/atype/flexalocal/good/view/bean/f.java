package com.taobao.android.live.plugin.atype.flexalocal.good.view.bean;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultron.goods.list.IDMComponentsFrameLayout;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.afs;
import tb.bob;
import tb.hiq;
import tb.his;
import tb.hix;
import tb.kas;
import tb.kge;
import tb.sxt;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f13846a;
    private boolean b;
    private com.alibaba.android.ultron.vfw.instance.d c;
    private l d;
    private afs n;
    private kas o;
    private List<com.alibaba.android.ultron.vfw.viewholder.h> e = new ArrayList();
    private Map<IDMComponentsFrameLayout, List<String>> f = new HashMap();
    private List<com.alibaba.android.ultron.vfw.viewholder.h> g = new ArrayList();
    private int h = 0;
    private int i = 0;
    private int q = 0;
    private int r = 0;
    private int j = 0;
    private int k = 0;
    private int l = 0;
    private int m = 0;
    private k p = new k() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.f.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.k
        public List<String> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
            }
            return null;
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.k
        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.k
        public void a(List<DXTemplateItem> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            } else if (list != null && !list.isEmpty()) {
                his.b("TemplateHelper", "onFinished. finishSize=" + list.size());
                if (f.a(f.this).isEmpty() && f.b(f.this).isEmpty()) {
                    his.a("TemplateHelper", "onFinished | no error template.");
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (DXTemplateItem dXTemplateItem : list) {
                    if (dXTemplateItem != null && !TextUtils.isEmpty(dXTemplateItem.f11925a) && dXTemplateItem.b != 0) {
                        f.a(f.this, dXTemplateItem, arrayList);
                    }
                }
                if (!arrayList.isEmpty() && f.c(f.this) != null) {
                    f fVar = f.this;
                    f.a(fVar, f.d(fVar) + arrayList.size());
                    f.c(f.this).a(arrayList);
                }
                if (f.e(f.this) == null || !com.taobao.taolive.sdk.utils.b.d(f.e(f.this).a())) {
                    return;
                }
                hix.a(f.e(f.this).a(), "模板下载成功，页面刷新");
            }
        }
    };

    static {
        kge.a(310273032);
    }

    public static /* synthetic */ int a(f fVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("758ac7ca", new Object[]{fVar, new Integer(i)})).intValue();
        }
        fVar.i = i;
        return i;
    }

    public static /* synthetic */ List a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("a521241b", new Object[]{fVar}) : fVar.e;
    }

    public static /* synthetic */ void a(f fVar, DXTemplateItem dXTemplateItem, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd48de46", new Object[]{fVar, dXTemplateItem, list});
        } else {
            fVar.a(dXTemplateItem, list);
        }
    }

    public static /* synthetic */ Map b(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("5a27a362", new Object[]{fVar}) : fVar.f;
    }

    public static /* synthetic */ kas c(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kas) ipChange.ipc$dispatch("c5b17d5b", new Object[]{fVar}) : fVar.o;
    }

    public static /* synthetic */ int d(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("39b0da62", new Object[]{fVar})).intValue() : fVar.i;
    }

    public static /* synthetic */ com.alibaba.android.ultron.vfw.instance.d e(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.instance.d) ipChange.ipc$dispatch("575384d5", new Object[]{fVar}) : fVar.c;
    }

    public void a(com.alibaba.android.ultron.vfw.instance.d dVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a26c908d", new Object[]{this, dVar});
        } else if (dVar == null || dVar.q() == null) {
        } else {
            this.c = dVar;
            f13846a = sxt.a("gl_first_in_live", true);
            sxt.b("gl_first_in_live", false);
            if (!f13846a || !a.c().booleanValue()) {
                z = false;
            }
            this.b = z;
            his.b("TemplateHelper", "init | mSwitch=" + this.b + " sFirstInLive=" + f13846a + "   orange=" + a.c());
            if (!this.b) {
                return;
            }
            bob e = this.c.q().e();
            if (e == null) {
                his.b("TemplateHelper", "dinamicXEngineManager is null.");
                return;
            }
            this.d = new l(e.a().d());
            this.d.a();
            this.d.a(this.p);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("failTotalHead", Integer.toString(this.j));
            hashMap.put("failTotalBody", Integer.toString(this.l));
            hashMap.put("failFirstHead", Integer.toString(this.k));
            hashMap.put("failFirstBody", Integer.toString(this.m));
            hashMap.put("refreshHead", Integer.toString(this.h));
            hashMap.put("refreshBody", Integer.toString(this.i));
            hashMap.put("createTotalHead", Integer.toString(this.q));
            hashMap.put("createTotalBody", Integer.toString(this.r));
            hashMap.put("sFirstInLive", Boolean.toString(f13846a));
            hashMap.put("trackV", "1");
            hashMap.put("mSwitch", Boolean.toString(this.b));
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a("gl_close", hashMap);
        }
        d();
        e();
    }

    public com.alibaba.android.ultron.vfw.viewholder.h a(com.alibaba.android.ultron.vfw.viewholder.j jVar, ViewGroup viewGroup, int i, IDMComponent iDMComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.viewholder.h) ipChange.ipc$dispatch("a5cb895e", new Object[]{this, jVar, viewGroup, new Integer(i), iDMComponent, new Boolean(z)});
        }
        if (jVar == null || viewGroup == null) {
            return null;
        }
        com.alibaba.android.ultron.vfw.viewholder.h a2 = jVar.a(viewGroup, i);
        if (a2 != null) {
            his.c("TemplateHelper", "createTemplate | name=" + iDMComponent.getKey() + "   result=" + a2.itemView);
        }
        if (z) {
            this.q++;
        } else {
            this.r++;
        }
        if (!hiq.a(iDMComponent) || a2 == null) {
            if (z) {
                this.j++;
            } else {
                this.l++;
            }
            return a2;
        } else if (!this.b) {
            if (!(a2.itemView instanceof DXRootView)) {
                if (z) {
                    this.j++;
                } else {
                    this.l++;
                }
            }
            return a2;
        } else {
            if (!(a2.itemView instanceof DXRootView)) {
                if (z) {
                    if (!this.e.contains(a2)) {
                        this.e.add(a2);
                    }
                    this.k++;
                } else {
                    ViewGroup e = a2.e();
                    if (e instanceof IDMComponentsFrameLayout) {
                        List<String> list = this.f.get(e);
                        if (list == null) {
                            list = new ArrayList<>();
                        }
                        String a3 = a(iDMComponent);
                        if (!list.contains(a3)) {
                            list.add(a3);
                        }
                        if (!this.f.keySet().contains(e)) {
                            this.f.put((IDMComponentsFrameLayout) e, list);
                        }
                        his.b("TemplateHelper", "createTemplate | root, templateSize=" + list.size() + "    values=" + com.taobao.taolive.sdk.utils.l.a(list, '&'));
                    }
                    this.m++;
                }
            }
            return a2;
        }
    }

    public void a(afs afsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfeda72a", new Object[]{this, afsVar});
        } else {
            this.n = afsVar;
        }
    }

    public void a(kas kasVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0b7a7db", new Object[]{this, kasVar});
        } else {
            this.o = kasVar;
        }
    }

    private void a(DXTemplateItem dXTemplateItem, List<IDMComponentsFrameLayout> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef2e7102", new Object[]{this, dXTemplateItem, list});
            return;
        }
        his.a("TemplateHelper", "noticeCreateFailedHolders | name=" + dXTemplateItem.f11925a + " version=" + dXTemplateItem.b + "    headSize=" + this.e.size() + "    rootBodySize=" + this.f.size() + "    holderBodySize=" + this.g.size());
        Iterator<com.alibaba.android.ultron.vfw.viewholder.h> it = this.e.iterator();
        while (it.hasNext()) {
            com.alibaba.android.ultron.vfw.viewholder.h next = it.next();
            if (TextUtils.equals(dXTemplateItem.f11925a, a(next))) {
                it.remove();
                afs afsVar = this.n;
                if (afsVar == null) {
                    return;
                }
                afsVar.a(next.f());
                this.h++;
                return;
            }
        }
        Iterator<IDMComponentsFrameLayout> it2 = this.f.keySet().iterator();
        while (it2.hasNext()) {
            IDMComponentsFrameLayout next2 = it2.next();
            List<String> list2 = this.f.get(next2);
            Iterator<String> it3 = list2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (TextUtils.equals(it3.next(), dXTemplateItem.f11925a)) {
                        it3.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
            his.a("TemplateHelper", "noticeCreateFailedHolders | root, templateSize=" + list2.size() + "    values=" + com.taobao.taolive.sdk.utils.l.a(list2, '&'));
            if (list2.size() == 0) {
                it2.remove();
                list.add(next2);
            }
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.e.clear();
        this.f.clear();
        this.g.clear();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.q = 0;
        this.r = 0;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        l lVar = this.d;
        if (lVar != null) {
            lVar.b();
        }
        d();
        e();
        this.n = null;
        this.o = null;
    }

    private static String a(com.alibaba.android.ultron.vfw.viewholder.h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("518c2c73", new Object[]{hVar}) : (hVar == null || hVar.f() == null) ? "" : a(hVar.f());
    }

    private static String a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("41ebe234", new Object[]{iDMComponent}) : (iDMComponent == null || iDMComponent.getContainerInfo() == null) ? "" : iDMComponent.getContainerInfo().getString("name");
    }
}
