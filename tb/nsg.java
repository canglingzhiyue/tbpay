package tb;

import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.xsl.module.XslModule;
import com.taobao.search.common.util.q;
import com.taobao.search.common.util.r;
import com.taobao.search.searchdoor.activate.data.ActivateBean;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b;
import com.taobao.search.searchdoor.shop.a;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.jvm;
import tb.npr;

/* loaded from: classes8.dex */
public class nsg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HISTORY_GROUP = "nt_history";

    /* renamed from: a  reason: collision with root package name */
    private nsh f31717a;
    private npn b;
    private Map<String, TemplateBean> c = new HashMap();
    private Map<String, jvm.c> d = new ConcurrentHashMap();
    private a e;

    static {
        kge.a(-2002372158);
    }

    public static /* synthetic */ nsh a(nsg nsgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nsh) ipChange.ipc$dispatch("d42a428d", new Object[]{nsgVar}) : nsgVar.f31717a;
    }

    public static /* synthetic */ void a(nsg nsgVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84cfdce2", new Object[]{nsgVar, bVar});
        } else {
            nsgVar.a(bVar);
        }
    }

    public nsg(nsh nshVar) {
        this.f31717a = nshVar;
    }

    private List<String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : Arrays.asList(r.aO().split("&"));
    }

    public void a(String str, String str2, SearchDoorContext searchDoorContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67564383", new Object[]{this, str, str2, searchDoorContext});
            return;
        }
        npn npnVar = this.b;
        if (npnVar != null && !npnVar.b()) {
            this.b.a();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("seller_id", str);
        hashMap.put("shop_id", str2);
        boolean equals = "true".equals(this.f31717a.getModel().b().get(noa.KEY_SEARCH_ELDER_HOME_OPEN));
        List<String> a2 = a();
        if (a2 != null) {
            for (String str3 : a2) {
                String a3 = searchDoorContext.a(str3);
                if (!StringUtils.isEmpty(a3)) {
                    hashMap.put(str3, a3);
                }
            }
        }
        hashMap.put(noa.KEY_GRAY_HAIR, String.valueOf(equals));
        this.b = new npr.b().a(new nsf("suggest", hashMap)).a(new nqo("")).a(new nul("Default")).a().b().a((iud) new iud<b>() { // from class: tb.nsg.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iud
            public void a(b bVar) throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f273174", new Object[]{this, bVar});
                    return;
                }
                com.taobao.android.weex_framework.r rVar = new com.taobao.android.weex_framework.r();
                Intent intent = nsg.a(nsg.this).getActivity().getIntent();
                if (intent != null && intent.getData() != null) {
                    rVar.a(intent.getData().toString());
                } else {
                    XslModule.a().b().b("ShopSearchActivateModel", "No bundleUrl");
                }
                rVar.b("Page_Shop_Search");
                ity.a(rVar, bVar.g, XslModule.a(), bVar.k);
            }
        }).c().a(new iud<b>() { // from class: tb.nsg.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iud
            public void a(b bVar) throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f273174", new Object[]{this, bVar});
                } else {
                    nsg.a(nsg.this, bVar);
                }
            }
        }, new npj(nrh.TYPE_ACTIVATE) { // from class: tb.nsg.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str4, Object... objArr) {
                if (str4.hashCode() == -73738099) {
                    super.a((Throwable) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str4));
            }

            @Override // tb.npj, tb.iud
            public void a(Throwable th) throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                    return;
                }
                super.a(th);
                TLogTracker.a("Default", "-1", th.getMessage());
            }
        });
    }

    private void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f273174", new Object[]{this, bVar});
        } else if (bVar == null || bVar.d == null || bVar.d.size() == 0) {
            q.b("ShopSearchActivateModel", "activate cell list is empty");
        } else {
            this.c.clear();
            if (bVar.g != null) {
                this.c.putAll(bVar.g);
            }
            this.d.putAll(bVar.k);
            ArrayList arrayList = new ArrayList();
            if (bVar.d != null) {
                arrayList.addAll(bVar.d);
            }
            if (bVar.c != null && this.e != null) {
                arrayList.remove(bVar.c);
                this.e.a(bVar.c);
                arrayList.add(0, this.e.a());
            }
            this.f31717a.a(arrayList);
            this.f31717a.a(bVar.i);
        }
    }

    public TemplateBean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateBean) ipChange.ipc$dispatch("45058b5e", new Object[]{this, str}) : this.c.get(str);
    }

    public jvm.c b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jvm.c) ipChange.ipc$dispatch("ad662293", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            return this.d.get(str);
        }
        return null;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        this.e = new a(this.f31717a.getActivity(), "shop_search_history");
        this.e.a(this.f31717a);
        this.e.a(str);
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else if (this.e == null) {
        } else {
            ActivateBean activateBean = new ActivateBean();
            activateBean.keyword = str;
            activateBean.groupType = "nt_history";
            this.e.a(activateBean);
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.b(str);
    }

    public void a(ActivateBean activateBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cbdd948", new Object[]{this, activateBean});
            return;
        }
        a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.b(activateBean);
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.c(str);
    }
}
