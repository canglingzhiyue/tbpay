package com.taobao.themis.kernel.page;

import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.extension.page.aa;
import com.taobao.themis.kernel.extension.page.k;
import com.taobao.themis.kernel.extension.page.l;
import com.taobao.themis.kernel.extension.page.m;
import com.taobao.themis.kernel.extension.page.t;
import com.taobao.themis.kernel.extension.page.v;
import com.taobao.themis.kernel.extension.page.x;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.d;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.kernel.utils.o;
import kotlin.Pair;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.mqf;
import tb.mqh;
import tb.muu;
import tb.qqa;
import tb.thm;
import tb.tli;
import tb.tny;

/* loaded from: classes9.dex */
public class b implements ITMSPageFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final f f22562a;

    static {
        kge.a(-803290156);
        kge.a(1107846374);
    }

    public b(f instance) {
        q.d(instance, "instance");
        this.f22562a = instance;
    }

    public final f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("52d36a33", new Object[]{this}) : this.f22562a;
    }

    @Override // com.taobao.themis.kernel.page.ITMSPageFactory
    public ITMSPage a(String pageId, Window window, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("ad6790d0", new Object[]{this, pageId, window, str, jSONObject});
        }
        q.d(pageId, "pageId");
        com.taobao.themis.kernel.container.b b = o.b(this.f22562a, pageId);
        if (b == null) {
            return null;
        }
        return a(this.f22562a, com.taobao.themis.kernel.container.b.a(b, null, str == null ? b.b() : str, null, null, false, o.a(this.f22562a, pageId, window), null, false, null, null, null, 2013, null), jSONObject == null ? new JSONObject() : jSONObject);
    }

    @Override // com.taobao.themis.kernel.page.ITMSPageFactory
    public ITMSPage a(String url, Window window, JSONObject jSONObject, String str) {
        Window window2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("736c43fc", new Object[]{this, url, window, jSONObject, str});
        }
        q.d(url, "url");
        if (window == null) {
            com.taobao.themis.kernel.container.a x = this.f22562a.x();
            window2 = x != null ? x.b() : null;
        } else {
            window2 = window;
        }
        return a(this.f22562a, new com.taobao.themis.kernel.container.b(null, url, null, null, false, window2, null, false, null, null, null, 2013, null), jSONObject == null ? new JSONObject() : jSONObject);
    }

    public ITMSPage a(f instance, com.taobao.themis.kernel.container.b pageModel, JSONObject extraPrams) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("e7e955", new Object[]{this, instance, pageModel, extraPrams});
        }
        q.d(instance, "instance");
        q.d(pageModel, "pageModel");
        q.d(extraPrams, "extraPrams");
        String str = null;
        try {
            d.a("TMSBasePageFactory#createPage", (Pair) null, (Pair) null, 6, (Object) null);
            JSONObject jSONObject = extraPrams;
            TMSSolutionType j = instance.j();
            if (j != null) {
                int i = c.$EnumSwitchMapping$0[j.ordinal()];
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        Uri b = com.taobao.themis.utils.o.b(instance.g());
                        if (b != null) {
                            str = b.getQueryParameter("status_bar_transparent");
                        }
                        z = q.a((Object) "true", (Object) str);
                    } else if (i != 4) {
                        if (i == 5) {
                            Uri b2 = com.taobao.themis.utils.o.b(instance.g());
                            if (!q.a((Object) (b2 != null ? b2.getQueryParameter("_wx_statusbar_hidden") : null), (Object) "true")) {
                                if (b2 != null) {
                                    str = b2.getQueryParameter("wx_statusbar_hidden");
                                }
                                if (q.a((Object) str, (Object) "true")) {
                                }
                            }
                        }
                    }
                }
                jSONObject.put((JSONObject) com.taobao.themis.kernel.entity.a.KEY_STATUS_BAR_IMMERSIVE_ENABLE, (String) Boolean.valueOf(z));
                TMSPage tMSPage = new TMSPage(instance, pageModel, extraPrams);
                tMSPage.t();
                b(tMSPage);
                a(tMSPage);
                c(tMSPage);
                return tMSPage;
            }
            z = false;
            jSONObject.put((JSONObject) com.taobao.themis.kernel.entity.a.KEY_STATUS_BAR_IMMERSIVE_ENABLE, (String) Boolean.valueOf(z));
            TMSPage tMSPage2 = new TMSPage(instance, pageModel, extraPrams);
            tMSPage2.t();
            b(tMSPage2);
            a(tMSPage2);
            c(tMSPage2);
            return tMSPage2;
        } finally {
            d.a("TMSBasePageFactory#createPage");
        }
    }

    public void b(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95f55494", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        if (n.bX()) {
            page.a(new aa(page));
        }
        page.a(new com.taobao.themis.kernel.extension.page.b(page));
        page.a(new l(page));
        page.a(new com.taobao.themis.kernel.extension.page.c(page));
        page.a(new m(page));
        page.a(new t(page));
        if (page.b().i() == TMSContainerType.GENERIC) {
            page.a(new com.taobao.themis.kernel.extension.page.a(page));
            page.a(new k(page));
            page.a(new x(page));
            page.a(new com.taobao.themis.kernel.extension.page.q(page));
            page.a(new v(page));
        }
        if (page.b().i() != TMSContainerType.EMBEDDED) {
            return;
        }
        page.a(new tny(page));
    }

    public void a(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb549213", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        if (n.at() || page.b().j() == TMSSolutionType.UNIAPP) {
            page.a(new tli());
        }
        page.a(new mqf());
        page.a(new thm());
        page.a(new muu());
        page.a(new mqh());
    }

    /* loaded from: classes9.dex */
    public static final class a implements qqa.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ITMSPage f22563a;

        @Override // tb.qqa.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            }
        }

        public a(ITMSPage iTMSPage) {
            this.f22563a = iTMSPage;
        }

        @Override // tb.qqa.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            com.taobao.themis.kernel.extension.page.d dVar = (com.taobao.themis.kernel.extension.page.d) this.f22563a.a(com.taobao.themis.kernel.extension.page.d.class);
            if (dVar == null) {
                return;
            }
            dVar.a();
        }
    }

    public void c(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30961715", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        if (!page.b().q().isFragmentContainer()) {
            return;
        }
        page.a(new a(page));
    }
}
