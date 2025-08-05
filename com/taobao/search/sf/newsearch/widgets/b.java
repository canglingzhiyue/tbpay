package com.taobao.search.sf.newsearch.widgets;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import com.taobao.search.common.util.r;
import com.taobao.search.mmd.datasource.bean.SFPromotionBean;
import com.taobao.search.musie.q;
import com.taobao.search.sf.newsearch.widgets.a;
import java.util.Map;
import tb.iom;
import tb.iqt;
import tb.iru;
import tb.ium;
import tb.iur;
import tb.kge;
import tb.ntx;

/* loaded from: classes8.dex */
public class b extends q implements a.InterfaceC0787a, iom {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int b;
    private Integer c;
    private boolean d;
    private boolean e;
    private boolean f;
    private int g;
    private int h;

    static {
        kge.a(1421772464);
        kge.a(-1901192749);
        kge.a(2125559488);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1474194533:
                super.a(((Number) objArr[0]).intValue());
                return null;
            case 189826977:
                super.a((MuiseBean) objArr[0]);
                return null;
            case 217607196:
                super.onCtxResume();
                return null;
            case 299066517:
                super.onCtxPause();
                return null;
            case 1514279453:
                super.a((Map) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.iom
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.iom
    public Integer e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("2ea92693", new Object[]{this});
        }
        return null;
    }

    @Override // tb.iom
    public Integer f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("78dabfd4", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.search.musie.q, tb.itl
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.search.musie.q, com.taobao.android.xsearchplugin.muise.o, tb.iup, tb.iui
    public /* synthetic */ void bindWithData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2491dd0", new Object[]{this, obj});
        } else {
            a((MuiseBean) obj);
        }
    }

    public b(Activity activity, ium iumVar, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar, TemplateBean templateBean, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, iruVar, templateBean, viewGroup, iurVar);
        this.b = r.cA();
        this.d = true;
        this.e = true;
        this.f = false;
        this.h = (int) ((ntx.a() / 750.0f) * this.b);
    }

    @Override // com.taobao.search.musie.q, com.taobao.android.xsearchplugin.muise.o
    public void a(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5087a1", new Object[]{this, muiseBean});
            return;
        }
        super.a(muiseBean);
        if (muiseBean == null) {
            return;
        }
        JSONObject b = com.taobao.android.searchbaseframe.util.a.b(muiseBean.model, "style");
        if (b != null) {
            this.c = Integer.valueOf(SFPromotionBean.a(b.getString("statusBarStyle")));
        }
        w();
    }

    @Override // com.taobao.android.xsearchplugin.muise.o, tb.iut
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        this.d = true;
        w();
    }

    @Override // com.taobao.android.xsearchplugin.muise.o, tb.iut
    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.onCtxPause();
        this.d = false;
        w();
    }

    private void w() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        if (this.e && this.d) {
            z = true;
        }
        if (z == this.f) {
            return;
        }
        this.f = z;
        if (this.f) {
            k();
        } else {
            l();
        }
    }

    @Override // com.taobao.search.musie.q, com.taobao.android.xsearchplugin.muise.o
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        super.a(map);
        map.put("offsetTop", String.valueOf(j.d(this.g)));
        map.put("offsetBottom", String.valueOf(j.d(this.h)));
    }

    @Override // com.taobao.search.musie.q, tb.itl
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        super.a(i);
        this.g = i;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    @Override // com.taobao.search.musie.q, tb.itl
    public com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a) ipChange.ipc$dispatch("26ed9943", new Object[]{this}) : new a(this, this, getView(), this.h);
    }

    @Override // com.taobao.search.musie.q, tb.itl
    public void a(boolean z, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1901d4", new Object[]{this, new Boolean(z), new Float(f)});
            return;
        }
        ((FrameLayout) getView()).setAlpha(f);
        postEvent(iqt.a.a((int) ((1.0f - f) * ((FrameLayout) getView()).getMeasuredHeight())));
    }

    @Override // com.taobao.search.musie.q, tb.itl
    public void aG_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b4c520", new Object[]{this});
            return;
        }
        this.e = true;
        w();
    }

    @Override // com.taobao.search.musie.q, tb.itl
    public void aH_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b699dbf", new Object[]{this});
            return;
        }
        this.e = false;
        w();
    }

    @Override // com.taobao.search.sf.newsearch.widgets.a.InterfaceC0787a
    public void aI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d1e765e", new Object[]{this});
        } else if (this.f16263a.e() == null || this.f16263a.e().isDestroyed()) {
        } else {
            this.f16263a.e().sendInstanceMessage(JarvisConstant.KEY_JARVIS_TRIGGER, null);
        }
    }

    @Override // tb.iom
    public int aK_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9088278f", new Object[]{this})).intValue() : ((FrameLayout) getView()).getMeasuredHeight();
    }

    @Override // tb.iom
    public Integer g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("c30c5915", new Object[]{this}) : this.c;
    }
}
