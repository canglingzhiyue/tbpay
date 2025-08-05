package com.taobao.themis.canvas.extension.page;

import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import com.taobao.android.themis.graphics.IRiverBackend;
import com.taobao.android.themis.graphics.JNIBridge;
import com.taobao.android.themis.graphics.c;
import com.taobao.themis.canvas.canvas.TMSCanvasRender;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.open.extension.e;
import com.taobao.themis.utils.o;
import com.taobao.themis.utils.q;
import java.net.URLDecoder;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.d;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0014J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0014¨\u0006\u0018"}, d2 = {"Lcom/taobao/themis/canvas/extension/page/GameV8RuntimeExtension;", "Lcom/taobao/themis/canvas/extension/page/BaseGameJSRuntimeExtension;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "(Lcom/taobao/themis/kernel/page/ITMSPage;)V", "connectDebugServer", "", "destroy", "executeJSInCurrentThread", "script", "", "name", "", "sourceMapUrl", "executeMainPackage", "generateBackendConfiguration", "Lcom/taobao/android/themis/graphics/DefaultWRiverBackend$ConfigurationBuilder;", "canvasId", NetworkAbility.API_GET_TYPE, "Lcom/taobao/themis/open/extension/IJSRuntimeFactoryExtension$Type;", "initApiFramework", "initBackend", "initJSFramework", "Companion", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class c extends com.taobao.themis.canvas.extension.page.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/taobao/themis/canvas/extension/page/GameV8RuntimeExtension$generateBackendConfiguration$1", "Lcom/taobao/android/themis/graphics/JNIBridge$OnSourceMapListener;", "onGetSourceMapForURL", "", "sourceMapUrl", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements JNIBridge.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.themis.graphics.JNIBridge.h
        public String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
            }
            try {
                return q.a(URLDecoder.decode(str, "utf-8"));
            } catch (Throwable th) {
                TMSLogger.b("GameV8RuntimeExtension", "获取sourceMap失败", th);
                return null;
            }
        }
    }

    static {
        kge.a(-1768293910);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012643660:
                super.c((String) objArr[0]);
                return null;
            case 96532846:
                super.g();
                return null;
            case 97456367:
                super.h();
                return null;
            case 1667994815:
                return super.b((String) objArr[0]);
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ITMSPage page) {
        super(page);
        kotlin.jvm.internal.q.d(page, "page");
    }

    @Override // com.taobao.themis.canvas.extension.page.a
    public c.b b(String canvasId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c.b) ipChange.ipc$dispatch("636b94bf", new Object[]{this, canvasId});
        }
        kotlin.jvm.internal.q.d(canvasId, "canvasId");
        c.b b2 = super.b(canvasId);
        b2.a(IRiverBackend.EngineType.V8).a(new b());
        return b2;
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
        com.taobao.themis.open.resource.c c = eVar.c("gm.fm.js");
        if (c == null) {
            TMSLogger.d("GameV8RuntimeExtension", "框架包获取失败");
            return;
        }
        a2.a(c.b(), "https://hybrid.miniapp.taobao.com/gm.fm.js");
        TMSLogger.a("GameV8RuntimeExtension", "框架包执行完成");
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
        kotlin.jvm.internal.q.b(eVar, "page.getInstance().getEx…va)\n            ?: return");
        TMSMetaInfoWrapper w = j().b().w();
        List<PluginModel> p = w != null ? w.p() : null;
        List<PluginModel> list = p;
        if (list == null || list.isEmpty()) {
            z = true;
        }
        if (!z) {
            for (PluginModel pluginModel : p) {
                String appId = pluginModel.getAppId();
                kotlin.jvm.internal.q.b(appId, "pluginModel.appId");
                com.taobao.themis.open.resource.c a3 = eVar.a(appId, "api-extension.min.js");
                if (a3 != null) {
                    String b2 = a3.b();
                    a2.a(b2, TMSCanvasRender.ONLINE_HOST_ONLY_FILENAME + pluginModel.getAppId() + "-api-extension.min.js");
                }
            }
        }
        TMSLogger.a("GameV8RuntimeExtension", "二方拓展API执行完成");
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
        com.taobao.themis.open.resource.c a3 = eVar != null ? eVar.a("gm.js") : null;
        if (a3 == null) {
            TMSLogger.d("GameV8RuntimeExtension", "业务包获取失败");
            return;
        }
        if (n.bm()) {
            TMSMetaInfoWrapper v = j().b().v();
            if (v != null) {
                appModel = v.z();
            }
            String a4 = com.taobao.themis.kernel.metaInfo.appinfo.b.a(appModel, "gm.js.map");
            kotlin.jvm.internal.q.b(a4, "AppInfoUtils.convertSour…\"gm.js.map\"\n            )");
            a2.a(a3.b(), "https://hybrid.miniapp.taobao.com/gm.js", a4);
        } else {
            a2.c(a3.b(), "https://hybrid.miniapp.taobao.com/gm.js");
        }
        TMSLogger.a("GameV8RuntimeExtension", "游戏主包执行完成");
    }

    @Override // com.taobao.themis.open.extension.b
    public void a(String script, String name) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, script, name});
            return;
        }
        kotlin.jvm.internal.q.d(script, "script");
        kotlin.jvm.internal.q.d(name, "name");
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
        kotlin.jvm.internal.q.d(script, "script");
        kotlin.jvm.internal.q.d(name, "name");
        if (str == null) {
            com.taobao.android.themis.graphics.c a2 = a();
            if (a2 == null) {
                return;
            }
            a2.b(new String(script, d.UTF_8), name);
            return;
        }
        com.taobao.android.themis.graphics.c a3 = a();
        if (a3 == null) {
            return;
        }
        a3.b(new String(script, d.UTF_8), name, str);
    }

    private final void k() {
        com.taobao.android.themis.graphics.c a2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        String a3 = o.a(j().e(), "debugServerUrl");
        String str = null;
        if (a3 != null) {
            if (a3.length() > 0) {
                str = URLDecoder.decode(a3);
            }
        }
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        }
        if (z || (a2 = a()) == null) {
            return;
        }
        a2.b(str);
    }

    @Override // com.taobao.themis.canvas.extension.page.a, com.taobao.themis.open.extension.b
    public void c(String canvasId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, canvasId});
            return;
        }
        kotlin.jvm.internal.q.d(canvasId, "canvasId");
        super.c(canvasId);
        k();
    }

    @Override // com.taobao.themis.canvas.extension.page.a, com.taobao.themis.open.extension.b
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        super.h();
        com.taobao.android.themis.graphics.c a2 = a();
        if (a2 == null) {
            return;
        }
        a2.c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/canvas/extension/page/GameV8RuntimeExtension$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-204339022);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }
}
