package com.taobao.themis.widget.kernal;

import android.app.Application;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.resource.api.models.AppInfoModel;
import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.i;
import com.taobao.themis.kernel.metaInfo.appinfo.core.AppInfoStrategy;
import com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.AbsAppInfoRequestConfig;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.widget.kernal.b;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qpt;
import tb.rne;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\u0004J\b\u0010\t\u001a\u00020\nH\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/widget/kernal/TMSWidgetEngineManager;", "", "()V", "globalEngine", "Lcom/taobao/themis/widget/kernal/TMSWidgetEngine;", "isIniting", "", "isUpdating", "getCurrentEngine", "replaceNewEngine", "", "tryUpdateEngine", "updateFrameworkInfoAsync", "callBack", "Lcom/taobao/themis/kernel/metaInfo/appinfo/core/callback/AppInfoCallBack;", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static com.taobao.themis.widget.kernal.b f22940a;
    private static boolean b;
    private static boolean c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/taobao/themis/widget/kernal/TMSWidgetEngineManager$replaceNewEngine$1", "Lcom/taobao/themis/widget/kernal/TMSWidgetEngine$InitListener;", "onInitFail", "", "onInitFinish", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements b.InterfaceC0985b {
    }

    static {
        kge.a(876907366);
        INSTANCE = new c();
        Object a2 = qpt.a(IEnvironmentService.class);
        q.b(a2, "TMSAdapterManager.getNot…ice::class.java\n        )");
        Application applicationContext = ((IEnvironmentService) a2).getApplicationContext();
        q.b(applicationContext, "TMSAdapterManager.getNot…     ).applicationContext");
        f22940a = new com.taobao.themis.widget.kernal.b(applicationContext, null, 2, null);
        com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_GLOBAL_WIDGET_ENGINE, com.taobao.themis.kernel.logger.a.EVENT_ON_INIT, com.taobao.themis.kernel.logger.a.GLOBAL_EVENT_ROOT_ID, com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.GLOBAL_EVENT_ROOT_ID), new JSONObject());
        com.taobao.themis.widget.kernal.b.a(f22940a, true, null, null, null, null, null, 62, null);
    }

    private c() {
    }

    public static final /* synthetic */ com.taobao.themis.widget.kernal.b a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.themis.widget.kernal.b) ipChange.ipc$dispatch("84dc7d97", new Object[]{cVar}) : f22940a;
    }

    public static final /* synthetic */ void a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41238005", new Object[]{cVar, new Boolean(z)});
        } else {
            b = z;
        }
    }

    public static final /* synthetic */ void b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ac4398e", new Object[]{cVar});
        } else {
            cVar.c();
        }
    }

    public final com.taobao.themis.widget.kernal.b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.themis.widget.kernal.b) ipChange.ipc$dispatch("59fc7310", new Object[]{this});
        }
        if (f22940a.d() >= n.INSTANCE.aC()) {
            com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_GLOBAL_WIDGET_ENGINE, "ON_REPLACE_ENGINE", com.taobao.themis.kernel.logger.a.GLOBAL_EVENT_ROOT_ID, com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.GLOBAL_EVENT_ROOT_ID), new JSONObject());
            c();
        }
        return f22940a;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (b) {
        } else {
            com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_GLOBAL_WIDGET_ENGINE, "ON_CHECK_UPDATE", com.taobao.themis.kernel.logger.a.GLOBAL_EVENT_ROOT_ID, com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.GLOBAL_EVENT_ROOT_ID), new JSONObject());
            b = true;
            a(new b());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u000e"}, d2 = {"com/taobao/themis/widget/kernal/TMSWidgetEngineManager$tryUpdateEngine$1", "Lcom/taobao/themis/kernel/metaInfo/appinfo/core/callback/AppInfoCallBack;", "onError", "", "errorCode", "", "errorMsg", "extInfo", "Lcom/alibaba/fastjson/JSONObject;", "onSuccess", RVConstants.EXTRA_APPINFO, "Lcom/alibaba/ariver/resource/api/models/AppModel;", "strategy", "Lcom/taobao/themis/kernel/metaInfo/appinfo/core/AppInfoStrategy;", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements rne {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.rne
        public void a(AppModel appModel, AppInfoStrategy appInfoStrategy) {
            AppInfoModel appInfoModel;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c49f009c", new Object[]{this, appModel, appInfoStrategy});
                return;
            }
            if (c.a(c.INSTANCE).c() != null) {
                if (com.taobao.themis.utils.f.a((appModel == null || (appInfoModel = appModel.getAppInfoModel()) == null) ? null : appInfoModel.getDeveloperVersion(), c.a(c.INSTANCE).c()) > 0) {
                    c.b(c.INSTANCE);
                }
            }
            c.a(c.INSTANCE, false);
        }

        @Override // tb.rne
        public void a(String str, String str2, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2bf4cf4", new Object[]{this, str, str2, jSONObject});
            } else {
                c.a(c.INSTANCE, false);
            }
        }
    }

    private final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (c) {
        } else {
            c = true;
            Object a2 = qpt.a(IEnvironmentService.class);
            q.b(a2, "TMSAdapterManager.getNot…nmentService::class.java)");
            Application applicationContext = ((IEnvironmentService) a2).getApplicationContext();
            q.b(applicationContext, "TMSAdapterManager.getNot….java).applicationContext");
            com.taobao.themis.widget.kernal.b bVar = new com.taobao.themis.widget.kernal.b(applicationContext, null, 2, null);
            com.taobao.themis.widget.kernal.b.a(bVar, true, new a(), null, null, null, null, 60, null);
            com.taobao.themis.widget.kernal.b bVar2 = f22940a;
            f22940a = bVar;
            bVar2.h();
            c = false;
        }
    }

    private final void a(rne rneVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd5a688f", new Object[]{this, rneVar});
            return;
        }
        AbsAppInfoRequestConfig.BasicRequestParam basicRequestParam = new AbsAppInfoRequestConfig.BasicRequestParam();
        basicRequestParam.appId = i.WIDGET_FRAMEWORK_ID;
        com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.b bVar = new com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.b(basicRequestParam);
        bVar.e = null;
        bVar.f22551a = AppInfoScene.ONLINE;
        bVar.c = AbsAppInfoRequestConfig.AppInfoRequestScene.ASYNCLOAD;
        com.taobao.themis.kernel.metaInfo.appinfo.a.a().a(bVar, true, rneVar);
    }
}
