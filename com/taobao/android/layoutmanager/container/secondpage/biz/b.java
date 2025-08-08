package com.taobao.android.layoutmanager.container.secondpage.biz;

import android.app.Activity;
import android.support.v4.view.ViewPager;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.CommonContainerActivity;
import com.taobao.android.layoutmanager.container.secondpage.biz.weexadapter.c;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import tb.gvz;
import tb.kge;
import tb.ofz;

/* loaded from: classes5.dex */
public class b extends gvz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ofz e;
    private Object f;
    private Object l;
    private String n;
    private String g = null;
    private Map h = new HashMap();
    private String i = null;
    private Map j = new HashMap();
    private Object m = null;
    private boolean k = false;

    static {
        kge.a(-1409273234);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1474194533:
                super.a(((Number) objArr[0]).intValue());
                return null;
            case -1416936231:
                super.c(((Number) objArr[0]).intValue());
                return null;
            case 93762283:
                super.d();
                return null;
            case 94685804:
                super.e();
                return null;
            case 230012543:
                return new Boolean(super.a((f) objArr[0], ((Number) objArr[1]).intValue()));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public b(Activity activity) {
        this.e = null;
        this.f28534a = activity;
        UTAnalytics.getInstance().getDefaultTracker().skipPage(p());
        if (activity instanceof CommonContainerActivity) {
            if (com.taobao.android.layoutmanager.a.b()) {
                this.e = new com.taobao.android.layoutmanager.container.secondpage.biz.weexadapter.a();
            } else {
                this.e = new GGSecWebViewPage();
            }
        } else if (com.taobao.android.layoutmanager.a.c()) {
            this.e = new com.taobao.android.layoutmanager.container.secondpage.biz.weexadapter.a();
        } else {
            this.e = new GGSecWebViewPage();
        }
    }

    public b() {
        this.e = null;
        this.e = new com.taobao.android.layoutmanager.container.secondpage.biz.weexadapter.a();
    }

    public Object a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : this.f;
    }

    @Override // tb.gvz, tb.oga
    public boolean a(f fVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5b67f", new Object[]{this, fVar, new Integer(i)})).booleanValue();
        }
        ofz ofzVar = this.e;
        if (ofzVar instanceof com.taobao.android.layoutmanager.container.secondpage.biz.weexadapter.a) {
            ((com.taobao.android.layoutmanager.container.secondpage.biz.weexadapter.a) ofzVar).a(fVar);
        }
        this.l = fVar.getUTObject();
        return super.a(fVar, i);
    }

    public void a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cbb30e", new Object[]{this, obj, str});
        } else if (obj == null) {
        } else {
            this.f = obj;
            this.n = str;
        }
    }

    private Object p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9f09f71b", new Object[]{this});
        }
        Object obj = this.l;
        return obj != null ? obj : this.f28534a;
    }

    @Override // tb.gvz
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        super.a(i);
        this.k = false;
        if (i != 0) {
            return;
        }
        if (i == 0) {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(p());
        }
        c().a(this.f, this.n);
        if (!(this.c instanceof GGSecPageViewPager)) {
            return;
        }
        ((GGSecPageViewPager) this.c).triggerTransitionStartEvent();
    }

    @Override // tb.gvz
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        if (i == 0) {
            c().b();
            if (!c.a()) {
                UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(getSecondPageUTObject());
            }
            UTAnalytics.getInstance().getDefaultTracker().pageAppear(p(), getFirstPageName());
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(p(), getFirstPageProperty());
        }
        if (!this.k || this.d == null) {
            return;
        }
        this.d.onPageSelected(i);
        this.k = false;
    }

    @Override // tb.gvz
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        super.c(i);
        if (this.d == null) {
            return;
        }
        this.k = true;
    }

    @Override // tb.gvz
    public ViewPager b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("52a73e15", new Object[]{this});
        }
        GGSecPageViewPager gGSecPageViewPager = new GGSecPageViewPager(this.f28534a);
        gGSecPageViewPager.setSecPageWrapper(this);
        return gGSecPageViewPager;
    }

    @Override // tb.oga
    public ofz c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ofz) ipChange.ipc$dispatch("1e6bf2b9", new Object[]{this}) : this.e;
    }

    @Override // tb.oga
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        super.d();
        c().d();
    }

    @Override // tb.oga
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        super.e();
        c().e();
    }

    @Override // tb.oga
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            c().c();
        }
    }

    @Override // tb.ogc
    public void setFirstPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76692fd9", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.g = str;
        }
    }

    @Override // tb.ogc
    public void setFirstPageProperty(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48f12cc", new Object[]{this, map});
        } else if (map == null) {
        } else {
            this.h = map;
        }
    }

    @Override // tb.ogc
    public String getFirstPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("232786a5", new Object[]{this}) : this.g;
    }

    @Override // tb.ogc
    public Map getFirstPageProperty() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("8efdfe9a", new Object[]{this}) : this.h;
    }

    @Override // tb.ogc
    public void setSecondPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e7e79e1", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.i = str;
        }
    }

    @Override // tb.ogc
    public void setSecondPageProperty(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2309c4", new Object[]{this, map});
        } else if (map == null) {
        } else {
            this.j = map;
        }
    }

    @Override // tb.ogc
    public String getSecondPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("19bb6e35", new Object[]{this}) : this.i;
    }

    @Override // tb.ogc
    public Map getSecondPageProperty() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6ae7090a", new Object[]{this}) : this.j;
    }

    @Override // tb.ogc
    public Object getSecondPageUTObject() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e1f89714", new Object[]{this}) : this.m;
    }

    @Override // tb.ogc
    public void setSecondPageUTObject(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9039d46", new Object[]{this, obj});
        } else {
            this.m = obj;
        }
    }
}
