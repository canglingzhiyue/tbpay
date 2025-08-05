package com.taobao.themis.canvas.extension.page;

import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import com.taobao.android.riverlogger.h;
import com.taobao.android.riverlogger.inspector.f;
import com.taobao.android.riverlogger.j;
import com.taobao.themis.canvas.canvas.TMSCanvasRender;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.open.extension.e;
import com.taobao.themis.utils.o;
import java.net.URLDecoder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\"\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\bH\u0014J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\b\u0010\u0016\u001a\u00020\bH\u0014R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/taobao/themis/canvas/extension/page/GameQkingJSRuntimeExtension;", "Lcom/taobao/themis/canvas/extension/page/BaseGameJSRuntimeExtension;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "(Lcom/taobao/themis/kernel/page/ITMSPage;)V", "mInspectorSession", "Lcom/taobao/android/riverlogger/inspector/InspectorSession;", "connectDebugServer", "", "destroy", "executeJSInCurrentThread", "script", "", "name", "", "sourceMapUrl", "executeMainPackage", NetworkAbility.API_GET_TYPE, "Lcom/taobao/themis/open/extension/IJSRuntimeFactoryExtension$Type;", "initApiFramework", "initBackend", "canvasId", "initJSFramework", "Companion", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class b extends com.taobao.themis.canvas.extension.page.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private f f22342a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", TplMsg.VALUE_T_NATIVE_RETURN, "", "s", "", "finish"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.canvas.extension.page.b$b  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C0927b implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public C0927b(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        @Override // com.taobao.android.riverlogger.h
        public final void a(boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
            } else {
                com.taobao.themis.kernel.utils.a.a(new GameQkingJSRuntimeExtension$connectDebugServer$1$1(this), 1000L);
            }
        }
    }

    static {
        kge.a(-505589545);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2012643660) {
            super.c((String) objArr[0]);
            return null;
        } else if (hashCode == 96532846) {
            super.g();
            return null;
        } else if (hashCode != 97456367) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.h();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ITMSPage page) {
        super(page);
        q.d(page, "page");
    }

    public static final /* synthetic */ void a(b bVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3209b8d", new Object[]{bVar, fVar});
        } else {
            bVar.f22342a = fVar;
        }
    }

    private final void k() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        String g = j().b().g();
        q.b(g, "page.getInstance().url");
        String a2 = o.a(g, "debugServerUrl");
        String str = null;
        if (a2 != null) {
            if (a2.length() > 0) {
                str = URLDecoder.decode(a2);
            }
        }
        String b = b();
        if (b == null) {
            return;
        }
        String str2 = str;
        if (!(str2 == null || str2.length() == 0)) {
            try {
                j.b(str, b, new C0927b(g, b));
            } catch (Throwable th) {
                TMSLogger.b("GameQkingJSRuntimeExtension", "开启远程调试失败", th);
            }
        } else if (!com.taobao.android.riverlogger.inspector.a.a()) {
        } else {
            if (g.length() > 0) {
                z = true;
            }
            if (!z || this.f22342a != null) {
                return;
            }
            f fVar = new f(b, g, "GM");
            com.taobao.android.riverlogger.inspector.a.a(fVar, "Qking");
            t tVar = t.INSTANCE;
            this.f22342a = fVar;
        }
    }

    @Override // com.taobao.themis.canvas.extension.page.a, com.taobao.themis.open.extension.b
    public void c(String canvasId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, canvasId});
            return;
        }
        q.d(canvasId, "canvasId");
        a(canvasId);
        k();
        super.c(canvasId);
    }

    @Override // com.taobao.themis.canvas.extension.page.a
    public void f() {
        e eVar;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        com.taobao.android.themis.graphics.c a2 = a();
        if (a2 == null || (eVar = (e) j().b().b(e.class)) == null) {
            return;
        }
        q.b(eVar, "page.getInstance().getEx…va)\n            ?: return");
        TMSMetaInfoWrapper w = j().b().w();
        List<PluginModel> p = w != null ? w.p() : null;
        List<PluginModel> list = p;
        if (list == null || list.isEmpty()) {
            z = true;
        }
        if (z) {
            return;
        }
        for (PluginModel pluginModel : p) {
            String appId = pluginModel.getAppId();
            q.b(appId, "pluginModel.appId");
            com.taobao.themis.open.resource.c a3 = eVar.a(appId, "api-extension.min.v20.wlm");
            if (a3 != null) {
                byte[] a4 = a3.a();
                a2.a(a4, TMSCanvasRender.ONLINE_HOST_ONLY_FILENAME + pluginModel.getAppId() + "-api-extension.min.v20.wlm");
            }
        }
        TMSLogger.a("GameQkingJSRuntimeExtension", "二方拓展API执行完成");
    }

    @Override // com.taobao.themis.canvas.extension.page.a
    public void e() {
        e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        com.taobao.android.themis.graphics.c a2 = a();
        if (a2 == null || (eVar = (e) j().b().b(e.class)) == null) {
            return;
        }
        com.taobao.themis.open.resource.c c = eVar.c("gm.fm.v20.wlm");
        if (c == null) {
            TMSLogger.d("GameQkingJSRuntimeExtension", "框架包获取失败");
            return;
        }
        TMSLogger.a("GameQkingJSRuntimeExtension", "框架包执行完成");
        a2.a(c.a(), "https://hybrid.miniapp.taobao.com/gm.fm.v20.wlm");
    }

    @Override // com.taobao.themis.canvas.extension.page.a, com.taobao.themis.open.extension.b
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        super.g();
        com.taobao.android.themis.graphics.c a2 = a();
        if (a2 == null) {
            return;
        }
        e eVar = (e) j().b().b(e.class);
        AppModel appModel = null;
        com.taobao.themis.open.resource.c a3 = eVar != null ? eVar.a("gm.v20.wlm") : null;
        if (a3 == null) {
            TMSLogger.d("GameQkingJSRuntimeExtension", "业务包获取失败");
            return;
        }
        if (n.bm()) {
            TMSMetaInfoWrapper v = j().b().v();
            if (v != null) {
                appModel = v.z();
            }
            String a4 = com.taobao.themis.kernel.metaInfo.appinfo.b.a(appModel, "gm.js.map");
            q.b(a4, "AppInfoUtils.convertSour…\"gm.js.map\"\n            )");
            a2.a(a3.a(), "https://hybrid.miniapp.taobao.com/gm.v20.wlm", a4);
        } else {
            a2.b(a3.a(), "https://hybrid.miniapp.taobao.com/gm.v20.wlm");
        }
        TMSLogger.a("GameQkingJSRuntimeExtension", "游戏主包执行完成");
    }

    @Override // com.taobao.themis.open.extension.b
    public void a(String script, String name) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, script, name});
            return;
        }
        q.d(script, "script");
        q.d(name, "name");
        com.taobao.android.themis.graphics.c a2 = a();
        if (a2 == null) {
            return;
        }
        a2.b(script, name);
    }

    @Override // com.taobao.themis.open.extension.b
    public void a(byte[] script, String name, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75e4f0c3", new Object[]{this, script, name, str});
            return;
        }
        q.d(script, "script");
        q.d(name, "name");
        if (str == null) {
            com.taobao.android.themis.graphics.c a2 = a();
            if (a2 == null) {
                return;
            }
            a2.c(script, name);
            return;
        }
        com.taobao.android.themis.graphics.c a3 = a();
        if (a3 == null) {
            return;
        }
        a3.b(script, name, str);
    }

    @Override // com.taobao.themis.canvas.extension.page.a, com.taobao.themis.open.extension.b
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        super.h();
        f fVar = this.f22342a;
        if (fVar == null) {
            return;
        }
        q.a(fVar);
        fVar.d();
        this.f22342a = null;
        com.taobao.android.riverlogger.e.c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/canvas/extension/page/GameQkingJSRuntimeExtension$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-216310945);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }
}
