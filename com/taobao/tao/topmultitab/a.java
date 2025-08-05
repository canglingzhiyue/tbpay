package com.taobao.tao.topmultitab;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.l;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.revision.ChangeContainerProcess;
import tb.bxu;
import tb.kge;
import tb.lap;
import tb.ncx;
import tb.ndf;
import tb.ovr;
import tb.sqg;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HOME_TAB_ID_DYNAMIC = "intl_tmg_dynamic";
    public static final String HOME_TAB_ID_LITE_TAO = "intl_taote";

    /* renamed from: a  reason: collision with root package name */
    private ncx f21144a;
    private ndf b;
    private Boolean c;
    private c d;
    private bxu e;

    static {
        kge.a(-253060492);
    }

    public a(c cVar) {
        this.d = cVar;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (this.c == null) {
            this.c = Boolean.valueOf(Boolean.parseBoolean(com.taobao.homepage.utils.d.b("overseaTopMultiTabSign", Boolean.FALSE.toString())));
        }
        return this.c.booleanValue();
    }

    public boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
        }
        if (!c()) {
            lap.a("OverseaTopMultiTab", "OverseaTopMultiTab", "不是海外版本，不处理");
            return false;
        }
        return b(c(jSONObject));
    }

    public void a(com.taobao.tao.topmultitab.protocol.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b12c66f", new Object[]{this, cVar});
        } else if (!c()) {
            com.taobao.android.home.component.utils.e.e("OverseaTopMultiTab", "不是海外");
        } else {
            if (this.f21144a == null) {
                this.f21144a = new ncx(cVar);
                this.d.a(HOME_TAB_ID_LITE_TAO, this.f21144a);
            }
            if (this.e == null) {
                this.e = new bxu(cVar);
                this.d.a(HOME_TAB_ID_DYNAMIC, this.e);
            }
            b(cVar);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (this.f21144a != null) {
            this.d.d(HOME_TAB_ID_LITE_TAO);
            this.f21144a = null;
        }
        if (this.e != null) {
            this.d.d(HOME_TAB_ID_DYNAMIC);
            this.e = null;
        }
        d();
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : l.d(Globals.getApplication());
    }

    private boolean b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63b9982b", new Object[]{this, jSONObject})).booleanValue();
        }
        boolean a2 = a();
        boolean d = d(jSONObject);
        a(d);
        lap.a("OverseaTopMultiTab", "OverseaTopMultiTab", "isExistMultiTabBySearchBar ： " + d + ", isCurrentMultiTab: " + a2);
        if (d == a2) {
            return false;
        }
        lap.a("OverseaTopMultiTab", "OverseaTopMultiTab", "海外容器热切");
        com.taobao.gateway.dispatch.a.b().a(new Runnable() { // from class: com.taobao.tao.topmultitab.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ChangeContainerProcess.a().a(ChangeContainerProcess.ChangeContainerType.overseaHotRevision);
                }
            }
        }, 0L);
        return true;
    }

    private JSONObject c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b45647e6", new Object[]{this, jSONObject});
        }
        JSONObject a2 = sqg.a(jSONObject);
        if (a2 != null) {
            return a2.getJSONObject("item");
        }
        return null;
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.c.booleanValue() == z) {
        } else {
            this.c = Boolean.valueOf(z);
            com.taobao.homepage.utils.d.a("overseaTopMultiTabSign", String.valueOf(z));
        }
    }

    private boolean d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("265ed169", new Object[]{this, jSONObject})).booleanValue() : jSONObject != null && jSONObject.size() > 1;
    }

    private void b(com.taobao.tao.topmultitab.protocol.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dff2fce", new Object[]{this, cVar});
        } else if (this.b != null) {
        } else {
            this.b = new ndf(cVar, ovr.TAB_ID_OVERSEA_RECOMMEND_MICROSERVICES);
            this.d.a(ovr.TAB_ID_OVERSEA_RECOMMEND_MICROSERVICES, this.b);
            com.taobao.android.home.component.utils.e.e("OverseaTopMultiTab", "注册海外推荐controller");
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.b == null) {
        } else {
            this.d.d(ovr.TAB_ID_OVERSEA_RECOMMEND_MICROSERVICES);
            this.b = null;
        }
    }
}
