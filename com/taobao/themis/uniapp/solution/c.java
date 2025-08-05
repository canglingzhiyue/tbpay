package com.taobao.themis.uniapp.solution;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.container.app.page.i;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.extension.page.ac;
import com.taobao.themis.kernel.extension.page.x;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.o;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.iwl;
import tb.iwm;
import tb.kge;
import tb.ljl;
import tb.mqh;
import tb.qqa;
import tb.suj;
import tb.tca;
import tb.tli;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0014J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0014J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0014¨\u0006\u0013"}, d2 = {"Lcom/taobao/themis/uniapp/solution/TMSUniAppPageFactory;", "Lcom/taobao/themis/kernel/page/TMSBasePageFactory;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "(Lcom/taobao/themis/kernel/TMSInstance;)V", "createPageByUrl", "Lcom/taobao/themis/kernel/page/ITMSPage;", "url", "", com.taobao.android.weex_framework.util.a.ATOM_EXT_window, "Lcom/taobao/themis/kernel/container/Window;", "extraPrams", "Lcom/alibaba/fastjson/JSONObject;", "renderer", "initLifeCycleListener", "", "page", "initRenderStateListener", "registerExtension", "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class c extends com.taobao.themis.kernel.page.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2116107682);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1779084140) {
            super.b((ITMSPage) objArr[0]);
            return null;
        } else if (hashCode == -78343661) {
            super.a((ITMSPage) objArr[0]);
            return null;
        } else if (hashCode != 815142677) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.c((ITMSPage) objArr[0]);
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f instance) {
        super(instance);
        q.d(instance, "instance");
    }

    @Override // com.taobao.themis.kernel.page.b, com.taobao.themis.kernel.page.ITMSPageFactory
    public ITMSPage a(String url, Window window, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("736c43fc", new Object[]{this, url, window, jSONObject, str});
        }
        q.d(url, "url");
        Window a2 = o.a(a(), null, window);
        return a(a(), com.taobao.themis.kernel.container.b.a(new com.taobao.themis.kernel.container.b(null, url, null, str, false, a2, null, false, null, null, null, 2005, null), null, url, null, null, false, a2, null, false, null, null, null, 2013, null), jSONObject == null ? new JSONObject() : jSONObject);
    }

    @Override // com.taobao.themis.kernel.page.b
    public void b(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95f55494", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        page.a(new iwm());
        if (page.c().m()) {
            page.a(new i(page));
            page.a(new x(page));
            return;
        }
        super.b(page);
        page.a(new iwl(page));
        if (!page.c().e().h()) {
            return;
        }
        page.a(new com.taobao.themis.container.app.page.swiper.c(page));
    }

    @Override // com.taobao.themis.kernel.page.b
    public void a(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb549213", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        if (page.c().k()) {
            return;
        }
        if (page.a(suj.class) != null) {
            page.a(new tli());
        } else if (page.a(tca.class) != null) {
            page.a(new tli());
            page.a(new mqh());
        } else {
            super.a(page);
        }
    }

    @Override // com.taobao.themis.kernel.page.b
    public void c(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30961715", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        super.c(page);
        ac acVar = (ac) page.a(ac.class);
        if (acVar == null || !page.c().e().f()) {
            return;
        }
        page.a(new a(acVar));
        page.a(new b());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/taobao/themis/uniapp/solution/TMSUniAppPageFactory$initRenderStateListener$1", "Lcom/taobao/themis/kernel/page/ITMSPage$RenderListener;", "onRenderReady", "", ljl.RENDER_SUCCESS_TIME, "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements qqa.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ac f22868a;

        @Override // tb.qqa.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            }
        }

        public a(ac acVar) {
            this.f22868a = acVar;
        }

        @Override // tb.qqa.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.f22868a.g();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/themis/uniapp/solution/TMSUniAppPageFactory$initRenderStateListener$2", "Lcom/taobao/themis/kernel/page/ITMSPage$LifeCycleListener;", "onPause", "", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements qqa.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.qqa.b
        public void a(ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb549213", new Object[]{this, page});
                return;
            }
            q.d(page, "page");
            qqa.b.a.e(this, page);
        }

        @Override // tb.qqa.b
        public void c(ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30961715", new Object[]{this, page});
                return;
            }
            q.d(page, "page");
            qqa.b.a.c(this, page);
        }

        @Override // tb.qqa.b
        public void d(ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb36d996", new Object[]{this, page});
                return;
            }
            q.d(page, "page");
            qqa.b.a.d(this, page);
        }

        @Override // tb.qqa.b
        public void e(ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d79c17", new Object[]{this, page});
                return;
            }
            q.d(page, "page");
            qqa.b.a.a(this, page);
        }

        @Override // tb.qqa.b
        public void f(ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("785e98", new Object[]{this, page});
                return;
            }
            q.d(page, "page");
            qqa.b.a.b(this, page);
        }

        @Override // tb.qqa.b
        public void b(ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95f55494", new Object[]{this, page});
                return;
            }
            q.d(page, "page");
            ac acVar = (ac) page.a(ac.class);
            if (acVar == null) {
                return;
            }
            acVar.h();
        }
    }
}
