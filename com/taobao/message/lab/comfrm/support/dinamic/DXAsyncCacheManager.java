package com.taobao.message.lab.comfrm.support.dinamic;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.LruCache;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.virtual_thread.annotation.IgnoreVirtualThread;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.message.kit.util.SharedPreferencesUtil;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.lab.comfrm.render.RenderTemplate;
import com.taobao.message.lab.comfrm.util.TraceUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.log.TLog;
import com.taobao.unit.center.mdc.MsgDinamicxEngine;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import tb.kge;

@IgnoreVirtualThread
/* loaded from: classes7.dex */
public class DXAsyncCacheManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DXAsyncCacheManager";
    public static boolean closeAsyncRenderBan;
    public static boolean debugPauseRenderPrefetch;
    public static LruCache<String, DXRootView> dxCache;
    public static boolean isOpen;
    public static boolean isOpenPostBeforeParsePrefetch;
    private static ScheduledExecutorService preLoadPool;
    public static Set<String> uniqueId;

    static {
        kge.a(1592830561);
        isOpen = true;
        isOpenPostBeforeParsePrefetch = true;
        closeAsyncRenderBan = ABGlobal.isFeatureOpened(ApplicationUtil.getApplication(), "debugCloseAsyncRenderBan");
        debugPauseRenderPrefetch = ABGlobal.isFeatureOpened(ApplicationUtil.getApplication(), "debugPauseRenderPrefetch");
        uniqueId = Collections.newSetFromMap(new ConcurrentHashMap());
        dxCache = new LruCache<>(50);
        preLoadPool = VExecutors.newScheduledThreadPool(2, new Schedules.MyThreadNameFactory("MessagePreload-DX"));
    }

    public static void ban(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81be7772", new Object[]{obj});
        } else if (!isOpen || closeAsyncRenderBan) {
        } else {
            uniqueId.add(String.valueOf(obj.hashCode()));
        }
    }

    public static void asyncRender(final Context context, final DinamicXEngine dinamicXEngine, final DXTemplateItem dXTemplateItem, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4adb925", new Object[]{context, dinamicXEngine, dXTemplateItem, obj});
        } else if (!isOpen) {
        } else {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.containsKey("VC_UNI_ID") && uniqueId.contains(jSONObject.getString("VC_UNI_ID"))) {
                    return;
                }
            }
            if (uniqueId.contains(Integer.valueOf(obj.hashCode()))) {
                return;
            }
            post(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.dinamic.DXAsyncCacheManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    String str;
                    DXResult<DXRootView> b;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Object obj2 = obj;
                    if (obj2 instanceof JSONObject) {
                        str = ((JSONObject) obj2).getString("VC_UNI_ID");
                        if (DXAsyncCacheManager.uniqueId.contains(str)) {
                            return;
                        }
                    } else {
                        str = "";
                    }
                    if (DXAsyncCacheManager.uniqueId.contains(String.valueOf(obj.hashCode()))) {
                        return;
                    }
                    DXAsyncCacheManager.ban(obj);
                    TraceUtil.beginSection("DXASYNC-MSG-" + dXTemplateItem.f11925a);
                    DXRenderOptions.a aVar = new DXRenderOptions.a();
                    try {
                        b = dinamicXEngine.b(context, dXTemplateItem);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    if (b.b()) {
                        return;
                    }
                    DXRootView dXRootView = b.f11780a;
                    if (dinamicXEngine.a(dXRootView.getContext(), dXRootView, dXRootView.getDxTemplateItem(), (JSONObject) obj, -1, aVar.a()).b()) {
                        return;
                    }
                    DXAsyncCacheManager.dxCache.put(String.valueOf(obj.hashCode()), dXRootView);
                    if (!StringUtils.isEmpty(str)) {
                        DXAsyncCacheManager.dxCache.put(str, dXRootView);
                    }
                    TraceUtil.endTrace();
                }
            });
        }
    }

    public static void asyncRender(final Context context, final DinamicXEngine dinamicXEngine, final DXTemplateItem dXTemplateItem, final Object obj, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3076c3af", new Object[]{context, dinamicXEngine, dXTemplateItem, obj, str});
        } else if (!isOpen || uniqueId.contains(str) || uniqueId.contains(String.valueOf(obj.hashCode()))) {
        } else {
            post(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.dinamic.DXAsyncCacheManager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    DXResult<DXRootView> b;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (DXAsyncCacheManager.uniqueId.contains(str)) {
                    } else {
                        TraceUtil.beginSection("DXASYNC-MSG-" + dXTemplateItem.f11925a);
                        DXRenderOptions.a aVar = new DXRenderOptions.a();
                        try {
                            b = dinamicXEngine.b(context, dXTemplateItem);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        if (b.b()) {
                            return;
                        }
                        DXRootView dXRootView = b.f11780a;
                        if (dinamicXEngine.a(dXRootView.getContext(), dXRootView, dXRootView.getDxTemplateItem(), (JSONObject) obj, -1, aVar.a()).b()) {
                            return;
                        }
                        DXAsyncCacheManager.dxCache.put(String.valueOf(obj.hashCode()), dXRootView);
                        TLog.loge(DXAsyncCacheManager.TAG, "asyncRender " + str);
                        DXAsyncCacheManager.dxCache.put(str, dXRootView);
                        TraceUtil.endTrace();
                    }
                }
            });
        }
    }

    public static void post(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd609e25", new Object[]{runnable});
        } else {
            preLoadPool.execute(runnable);
        }
    }

    public static void preLoadDX(final List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539c0775", new Object[]{list});
        } else if (!ABGlobal.isFeatureOpened(ApplicationUtil.getApplication(), "MsgPreLoadDX")) {
        } else {
            post(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.dinamic.DXAsyncCacheManager.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TraceUtil.beginSection("preLoadDX");
                    MsgDinamicxEngine.createNewEngine(null, MsgDinamicxEngine.DX_SUB_BIZTYPE_MESSAGE_CHAT, "alimp_message", null, 100, false).c(list);
                    TraceUtil.endTrace();
                }
            });
        }
    }

    public static void prefetch(final Context context, final ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fec7aef5", new Object[]{context, viewObject});
        } else if (!ABGlobal.isFeatureOpened(ApplicationUtil.getApplication(), "MsgPrefetchDX")) {
        } else {
            post(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.dinamic.DXAsyncCacheManager.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TraceUtil.beginSection("prefetch");
                    DinamicXEngine createNewEngine = MsgDinamicxEngine.createNewEngine(null, MsgDinamicxEngine.DX_SUB_BIZTYPE_MESSAGE_CHAT, "alimp_message", null, 100, false);
                    RenderTemplate renderTemplate = ViewObject.this.info.renderTemplate;
                    DXTemplateItem dXTemplateItem = new DXTemplateItem();
                    dXTemplateItem.f11925a = (String) renderTemplate.renderData.get("name");
                    dXTemplateItem.b = Long.parseLong((String) renderTemplate.renderData.get("version"));
                    dXTemplateItem.c = (String) renderTemplate.renderData.get("url");
                    createNewEngine.a(context, (JSONObject) ViewObject.this.data, dXTemplateItem, -1, new DXRenderOptions.a().e(2).a());
                    TraceUtil.endTrace();
                }
            });
        }
    }

    public static void prefetch(final Context context, final DXTemplateItem dXTemplateItem, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c412009d", new Object[]{context, dXTemplateItem, jSONObject});
        } else if (!ABGlobal.isFeatureOpened(ApplicationUtil.getApplication(), "MsgPrefetchDX")) {
        } else {
            post(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.dinamic.DXAsyncCacheManager.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TraceUtil.beginSection("prefetch");
                    MsgDinamicxEngine.createNewEngine(null, MsgDinamicxEngine.DX_SUB_BIZTYPE_MESSAGE_CHAT, "alimp_message", null, 100, false).a(context, jSONObject, dXTemplateItem, -1, new DXRenderOptions.a().e(2).a());
                    TraceUtil.endTrace();
                }
            });
        }
    }

    public static void prefetchParseToInnerCache(final Context context, final ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24aa43c1", new Object[]{context, viewObject});
        } else {
            post(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.dinamic.DXAsyncCacheManager.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TraceUtil.beginSection("prefetchParseToInnerCache");
                    try {
                        DinamicXEngine createNewEngine = MsgDinamicxEngine.createNewEngine(null, MsgDinamicxEngine.DX_SUB_BIZTYPE_MESSAGE_CHAT, "alimp_message", null, 100, false);
                        DXWidgetInstance.setupFullPageEngine(createNewEngine);
                        RenderTemplate renderTemplate = ViewObject.this.info.renderTemplate;
                        DXTemplateItem dXTemplateItem = new DXTemplateItem();
                        dXTemplateItem.f11925a = (String) renderTemplate.renderData.get("name");
                        dXTemplateItem.b = Long.parseLong((String) renderTemplate.renderData.get("version"));
                        dXTemplateItem.c = (String) renderTemplate.renderData.get("url");
                        int intSharedPreference = SharedPreferencesUtil.getIntSharedPreference(DXWidgetInstance.DEFAULT_CAHCE_KEY, 0);
                        DXRenderOptions.a e = new DXRenderOptions.a().e(2);
                        if (intSharedPreference > 0) {
                            e.b(DXWidgetNode.DXMeasureSpec.a(intSharedPreference + 1, 1073741824));
                        }
                        createNewEngine.a(context, (JSONObject) ViewObject.this.data, dXTemplateItem, -1, e.a());
                    } finally {
                        TraceUtil.endTrace();
                    }
                }
            });
        }
    }
}
