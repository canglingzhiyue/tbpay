package com.taobao.android.remoteso.tbadapter.ext;

import android.app.Application;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.tbuprofen.plugin.DefaultPlugin;
import com.taobao.android.weex_framework.module.builtin.WXStorageModule;
import com.taobao.weex.WXEnvironment;
import java.util.HashMap;
import java.util.Map;
import tb.ihl;
import tb.ihr;
import tb.iiw;
import tb.iix;
import tb.ijd;
import tb.iji;
import tb.iju;
import tb.ika;
import tb.ikg;
import tb.iki;
import tb.ikn;
import tb.ikq;
import tb.ikx;
import tb.kpv;
import tb.nvf;
import tb.orj;
import tb.ric;
import tb.xjz;

/* loaded from: classes6.dex */
public final class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        RSoLog.a(RSoLog.LogLevel.DEBUG, new l("RemoteSo", LauncherRuntime.l, ikx.a(".enableLog")));
        ikq.a(new o());
    }

    public static ihr a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ihr) ipChange.ipc$dispatch("f245325c", new Object[]{application});
        }
        ika.a(new p());
        if (StringUtils.equals(LauncherRuntime.b, LauncherRuntime.c)) {
            c.a(application);
        }
        final h hVar = new h(application);
        final g gVar = new g(new b(application));
        final d dVar = new d();
        final e eVar = new e();
        final com.taobao.android.remoteso.tbadapter.ext.a aVar = new com.taobao.android.remoteso.tbadapter.ext.a();
        m mVar = new m();
        iiw<ihl, iix<String>> iiwVar = new iiw<ihl, iix<String>>() { // from class: com.taobao.android.remoteso.tbadapter.ext.n.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iiw
            public iix<String> a(ihl ihlVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (iix) ipChange2.ipc$dispatch("bf6e1b43", new Object[]{this, ihlVar}) : new i(ihlVar.b);
            }
        };
        f fVar = new f(application);
        a aVar2 = new a(hVar);
        aVar2.a();
        ikq.a().a(aVar2);
        iki.a(application);
        a();
        ihr ihrVar = new ihr(hVar, gVar, dVar, eVar, aVar, iiwVar, mVar, new j(application, fVar), new k(fVar), new ihr.c<com.taobao.android.remoteso.resolver2.d>() { // from class: com.taobao.android.remoteso.tbadapter.ext.n.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ihr.c
            public com.taobao.android.remoteso.resolver2.d a(ihl ihlVar, com.taobao.android.remoteso.resolver2.d dVar2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (com.taobao.android.remoteso.resolver2.d) ipChange2.ipc$dispatch("26e78579", new Object[]{this, ihlVar, dVar2}) : new TaobaoUCKernelResolveHook(iju.this, gVar, ihlVar.d, dVar, eVar, aVar, dVar2);
            }
        }, new iiw<ihl, nvf>() { // from class: com.taobao.android.remoteso.tbadapter.ext.n.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iiw
            public nvf a(ihl ihlVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (nvf) ipChange2.ipc$dispatch("bf708fbd", new Object[]{this, ihlVar}) : new orj();
            }
        });
        ihrVar.a(com.taobao.android.remoteso.index.g.class, new iiw<ihl, com.taobao.android.remoteso.index.g>() { // from class: com.taobao.android.remoteso.tbadapter.ext.n.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iiw
            public com.taobao.android.remoteso.index.g a(ihl ihlVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (com.taobao.android.remoteso.index.g) ipChange2.ipc$dispatch("58539eec", new Object[]{this, ihlVar}) : new com.taobao.android.remoteso.index.h(new xjz(ijd.this), new kpv(ijd.this), new ric());
            }
        });
        return ihrVar;
    }

    /* loaded from: classes6.dex */
    public static class a implements ikn.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final iju f14869a;
        private final Map<String, Object> b = new HashMap();

        public a(iju ijuVar) {
            this.f14869a = ijuVar;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.b.put(ikn.ARGS_CPU_ABI, this.f14869a.b());
            this.b.put("args_is_main_process", Boolean.valueOf(this.f14869a.d()));
            this.b.put("isFirstLaunch", Boolean.valueOf(ikg.b()));
            this.b.put("isFullNewInstall", Boolean.valueOf(ikg.a()));
        }

        @Override // tb.ikn.a
        public void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
                return;
            }
            map.putAll(this.b);
            map.put(WXStorageModule.NAME, Long.valueOf(this.f14869a.c()));
        }
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        iji.a("cro_python_kit", "AliNNPython");
        iji.a(com.taobao.android.tbuprofen.common.c.ENGINE_LIB_NAME, "tbuprofen-util");
        iji.a(DefaultPlugin.PLUGIN_LIB_NAME, "zstd", "tbuprofen-util");
        iji.a("mnncv", "AliNNPython");
        iji.a("walle_base", "AliNNPython");
        iji.a("mrt", "AliNNPython");
        iji.a("mnnpybridge", "MNN", "MNN_Express", "MNNOpenCV", "AliNNPython");
        iji.a("mnnkitcore", "MNN");
        iji.a("MNN_Express", "MNN");
        iji.a("MNN_CL", "MNN");
        iji.a("MNNOpenCV", "MNN_Express", "MNN");
        iji.a("mnnqjs", "MNN", "MNN_Express");
        iji.a("mnn_jsi", "MNN", "MNN_Express");
        iji.a("mnnface", "MNN");
        iji.a("wbdebug", "AliNNPython");
        iji.a("nnrruntime", "MNN");
        iji.a(WXEnvironment.CORE_JSC_SO_NAME, "WTF");
    }
}
