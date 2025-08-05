package com.taobao.tao.flexbox.layoutmanager.container.dx;

import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.ugc.h5.WVMicorPublishPlugin;
import com.uc.webview.export.media.MessageID;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.ogg;
import tb.ohg;
import tb.ohh;
import tb.ruk;
import tb.rul;
import tb.rva;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010!\u001a\u00020\u001c2\b\u0010\"\u001a\u0004\u0018\u00010\u0007H\u0002J\u001e\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u0007J\b\u0010'\u001a\u00020\u000fH\u0002J\b\u0010(\u001a\u00020\u001cH\u0002J\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*J\u0010\u0010,\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u0007J\u0010\u0010-\u001a\u0004\u0018\u00010*2\u0006\u0010$\u001a\u00020\u0007J\u001a\u0010.\u001a\u00020\u001c2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001c00J\u0016\u00101\u001a\u00020\u00072\f\u00102\u001a\b\u0012\u0004\u0012\u00020*03H\u0002J\u0012\u00104\u001a\u0004\u0018\u00010\u00162\u0006\u00105\u001a\u000206H\u0002J\u0006\u00107\u001a\u00020\u001cJ\u0006\u00108\u001a\u00020\u001cJ\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020*0\u00142\u0006\u0010:\u001a\u00020\u0007H\u0002J\b\u0010;\u001a\u00020\u001cH\u0002J\b\u0010<\u001a\u00020\u001cH\u0002J\b\u0010=\u001a\u00020\u001cH\u0002J[\u0010>\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00072K\u0010?\u001aG\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u0015J\b\u0010@\u001a\u00020\u001cH\u0002J[\u0010A\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00072K\u0010?\u001aG\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u0015J\u0018\u0010B\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020\u00162\b\b\u0002\u0010D\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000Re\u0010\u0012\u001aY\u0012\u0004\u0012\u00020\u0007\u0012O\u0012M\u0012I\u0012G\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u00150\u00140\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0 X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxTemplateVersionManager;", "", "()V", "STRATEGY_DOWN_RENDER", "", "STRATEGY_ONLY_DOWN", RPCDataItems.SWITCH_TAG_LOG, "", "diskReadTime", "", "getDiskReadTime", "()J", "setDiskReadTime", "(J)V", "handler", "Landroid/os/Handler;", "isStart", "", "itemListenerMap", "", "", "Lkotlin/Function3;", "Lcom/taobao/tao/flexbox/layoutmanager/container/dx/ItemData;", "Lkotlin/ParameterName;", "name", "itemData", "isUpdate", "strategy", "", "itemNameMap", "storageKey", "syncRunnable", "Lkotlin/Function0;", "applyOrangeVersion", "orangeConfig", "callRenderSuccess", "templateName", "templateVersion", WVMicorPublishPlugin.TEMPLATE_URL, "checkHandler", "commitSyncToDisk", "fetchLatestVersion", "Lcom/taobao/android/dinamicx/template/download/DXTemplateItem;", "source", "getItemData", "getLastRenderInfo", "itemForEach", "call", "Lkotlin/Function1;", "itemListPrint", "list", "", "jSONObjectToItemData", "jsonObject", "Lcom/alibaba/fastjson/JSONObject;", "lazyStart", MessageID.onDestroy, "parseOrangeConfig", "configString", "readConfigsFromDisk", "readNetVersionFromOrange", "readStrategyFromOrange", "registerVersionListener", DataReceiveMonitor.CB_LISTENER, "syncToDisk", "unregisterVersionListener", "updateTemplateInfo", "waitUpdateItemData", "priority", "layoutmanager-taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final d INSTANCE;
    public static final int STRATEGY_DOWN_RENDER = 2;
    public static final int STRATEGY_ONLY_DOWN = 1;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, f> f20247a;
    private static Map<String, List<rva<f, Boolean, Integer, t>>> b;
    private static Handler c;
    private static int d;
    private static boolean e;
    private static long f;
    private static ruk<t> g;

    static {
        kge.a(581401991);
        INSTANCE = new d();
        f20247a = new LinkedHashMap();
        b = new LinkedHashMap();
        d = 1;
        g = DxTemplateVersionManager$syncRunnable$1.INSTANCE;
    }

    private d() {
    }

    public static final /* synthetic */ Handler a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("61048c4d", new Object[]{dVar}) : dVar.c();
    }

    public static final /* synthetic */ void a(d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ceff63", new Object[]{dVar, str});
        } else {
            dVar.c(str);
        }
    }

    public static final /* synthetic */ void b(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10650f8", new Object[]{dVar});
        } else {
            dVar.h();
        }
    }

    public final long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : f;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (e) {
        } else {
            f();
            d();
            e();
            e = true;
        }
    }

    private final Handler c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("a819f71c", new Object[]{this});
        }
        Handler handler = c;
        if (handler != null) {
            return handler;
        }
        Handler handler2 = new Handler();
        c = handler2;
        q.a(handler2);
        return handler2;
    }

    private final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        String a2 = ohg.a().a("weitao_switch", "DX_template", "");
        ogg.a("DxTemplateVersionManager", "startPrefetch: 拉取到的orange配置为：" + a2);
        c(a2);
        ohg.a().a("weitao_switch", "DX_template", a.INSTANCE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0006\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "group", "", "kotlin.jvm.PlatformType", "key", "value", "onConfigChanged"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes8.dex */
    public static final class a implements ohg.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // tb.ohg.a
        public final void a(String str, String str2, final String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            } else {
                d.a(d.INSTANCE).postDelayed(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.container.dx.d.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            d.a(d.INSTANCE, str3);
                        }
                    }
                }, 1000L);
            }
        }
    }

    private final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            q.a((Object) str);
            List<DXTemplateItem> d2 = d(str);
            ogg.a(c.TAG, "startReadFromOrange: 解析出的配置个数：" + d2.size() + "信息如下:" + a(d2));
            for (DXTemplateItem dXTemplateItem : d2) {
                d dVar = INSTANCE;
                String str2 = dXTemplateItem.f11925a;
                q.b(str2, "it.name");
                long j = dXTemplateItem.b;
                String str3 = dXTemplateItem.c;
                q.b(str3, "it.templateUrl");
                dVar.a(new f(str2, j, str3, -1L, ""), true);
            }
            g();
        }
    }

    private final List<DXTemplateItem> d(String str) {
        JSONObject jSONObject;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4c7331b2", new Object[]{this, str});
        }
        ArrayList arrayList = new ArrayList();
        try {
            Object parse = JSONArray.parse(str);
            if (parse != null && (parse instanceof JSONArray)) {
                for (Object obj2 : (JSONArray) parse) {
                    if (obj2 != null && (obj2 instanceof JSONObject) && (obj = (jSONObject = (JSONObject) obj2).get("name")) != null) {
                        DXTemplateItem dXTemplateItem = new DXTemplateItem();
                        if (obj != null) {
                            dXTemplateItem.f11925a = (String) obj;
                            Object obj3 = jSONObject.get("version");
                            if (obj3 == null) {
                                obj3 = "0";
                            }
                            if (obj3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            dXTemplateItem.b = Long.parseLong((String) obj3);
                            Object obj4 = jSONObject.get("url");
                            if (obj4 == null) {
                                obj4 = "";
                            }
                            if (obj4 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            dXTemplateItem.c = (String) obj4;
                            t tVar = t.INSTANCE;
                            arrayList.add(dXTemplateItem);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                }
            }
        } catch (Throwable unused) {
            ogg.b("orange 配置读取出错");
        }
        return arrayList;
    }

    private final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        try {
            String orangeStrategy = ohg.a().a("weitao_switch", "dxVersionStrategy", "1");
            q.b(orangeStrategy, "orangeStrategy");
            d = Integer.parseInt(orangeStrategy);
            ogg.a("DxTemplateVersionManager", "orange 上的策略配置为：" + d);
        } catch (Throwable unused) {
            ogg.a("DxTemplateVersionManager", "拉取并解析Orange 配置失败，请检查Orange配置");
        }
    }

    private final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ogg.a("DxTemplateVersionManager", "readConfigsFromDisk :" + currentTimeMillis);
        try {
            Object b2 = ohh.b("guangguang_local_dx_version");
            if (b2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            String str = (String) b2;
            ogg.a("DxTemplateVersionManager", "readConfigsFromDisk configString:" + str);
            JSONObject parseObject = JSONObject.parseObject(str);
            q.b(parseObject, "JSONObject.parseObject(configString)");
            for (Map.Entry<String, Object> entry : parseObject.entrySet()) {
                d dVar = INSTANCE;
                Object value = entry.getValue();
                if (value == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                }
                f a2 = dVar.a((JSONObject) value);
                if (a2 != null) {
                    Map<String, f> map = f20247a;
                    String key = entry.getKey();
                    q.b(key, "it.key");
                    map.put(key, a2);
                }
            }
            f = System.currentTimeMillis() - currentTimeMillis;
            ogg.a("DxTemplateVersionManager", "readConfigsFromDisk 解析结束，解析出" + f20247a.size() + "个数据，耗时：" + f);
        } catch (Throwable th) {
            ogg.a("DxTemplateVersionManager", "从磁盘读取本地DX版本失效,异常：" + th.getMessage());
        }
    }

    private final f a(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("f3928cf7", new Object[]{this, jSONObject});
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("item");
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            String str2 = "";
            if (jSONObject2 == null || (str = jSONObject2.getString("name")) == null) {
                str = str2;
            }
            dXTemplateItem.f11925a = str;
            String string = jSONObject2.getString(WVMicorPublishPlugin.TEMPLATE_URL);
            if (string != null) {
                str2 = string;
            }
            dXTemplateItem.c = str2;
            Long l = jSONObject2.getLong("version");
            dXTemplateItem.b = l != null ? l.longValue() : 0L;
            String str3 = dXTemplateItem.f11925a;
            q.b(str3, "dxTemplateItem.name");
            long j = dXTemplateItem.b;
            String str4 = dXTemplateItem.c;
            q.b(str4, "dxTemplateItem.templateUrl");
            return new f(str3, j, str4, -1L, "");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.taobao.tao.flexbox.layoutmanager.container.dx.e] */
    private final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        c().removeCallbacksAndMessages(null);
        Handler c2 = c();
        ruk<t> rukVar = g;
        if (rukVar != null) {
            rukVar = new e(rukVar);
        }
        c2.postDelayed((Runnable) rukVar, 1000L);
    }

    private final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        ogg.a("DxTemplateVersionManager", "syncToDisk ");
        String jSONString = JSONObject.toJSONString(f20247a);
        ogg.a("DxTemplateVersionManager", "syncToDisk localConfigs:" + jSONString);
        ohh.b("guangguang_local_dx_version", jSONString);
    }

    public final f a(String name) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("33c3bca1", new Object[]{this, name});
        }
        q.d(name, "name");
        ogg.a("DxTemplateVersionManager", "获取当前的版本管理器里面的信息");
        return f20247a.get(name);
    }

    public final void a(String templateName, long j, String templateUrl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa210a1c", new Object[]{this, templateName, new Long(j), templateUrl});
            return;
        }
        q.d(templateName, "templateName");
        q.d(templateUrl, "templateUrl");
        f fVar = f20247a.get(templateName);
        if (fVar != null) {
            fVar.b(j);
            fVar.b(templateUrl);
        } else {
            fVar = new f(templateName, j, templateUrl, j, templateUrl);
        }
        f20247a.put(templateName, fVar);
        g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0073, code lost:
        if (r0.b() != r9.b()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0083, code lost:
        if (r0.b() < r9.b()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0085, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0086, code lost:
        r10 = new java.lang.StringBuilder();
        r10.append("versionCheck");
        r10.append(r2);
        r10.append(",url判断：");
        r10.append(!kotlin.jvm.internal.q.a((java.lang.Object) r0.c(), (java.lang.Object) r9.c()));
        tb.ogg.a("DxTemplateVersionManager", r10.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b0, code lost:
        if (r2 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bf, code lost:
        if ((!kotlin.jvm.internal.q.a((java.lang.Object) r0.c(), (java.lang.Object) r9.c())) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c1, code lost:
        r0.a(r9.b());
        r0.a(r9.c());
        r0.b(r9.d());
        r0.b(r9.e());
        r9 = com.taobao.tao.flexbox.layoutmanager.container.dx.d.b.get(r9.a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e9, code lost:
        if (r9 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00eb, code lost:
        r9 = r9.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f5, code lost:
        if (r9.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f7, code lost:
        tb.ogg.a("DxTemplateVersionManager", " 激活更新的监听器");
        ((tb.rva) r9.next()).invoke(r0, true, java.lang.Integer.valueOf(com.taobao.tao.flexbox.layoutmanager.container.dx.d.d));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.taobao.tao.flexbox.layoutmanager.container.dx.f r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.container.dx.d.a(com.taobao.tao.flexbox.layoutmanager.container.dx.f, boolean):void");
    }

    public final DXTemplateItem b(String templateName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("a86a8d2c", new Object[]{this, templateName});
        }
        q.d(templateName, "templateName");
        f fVar = f20247a.get(templateName);
        if ((fVar != null ? fVar.d() : 0L) <= 0) {
            return null;
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f11925a = templateName;
        q.a(fVar);
        dXTemplateItem.b = fVar.d();
        dXTemplateItem.c = fVar.e();
        return dXTemplateItem;
    }

    public final void a(String name, rva<? super f, ? super Boolean, ? super Integer, t> listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3db3c8e5", new Object[]{this, name, listener});
            return;
        }
        q.d(name, "name");
        q.d(listener, "listener");
        List<rva<f, Boolean, Integer, t>> list = b.get(name);
        if (list != null && list.contains(listener)) {
            return;
        }
        if (list != null) {
            list.add(listener);
            if (list != null) {
                return;
            }
        }
        b.put(name, p.c(listener));
        t tVar = t.INSTANCE;
    }

    public final void b(String name, rva<? super f, ? super Boolean, ? super Integer, t> listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("529c9126", new Object[]{this, name, listener});
            return;
        }
        q.d(name, "name");
        q.d(listener, "listener");
        List<rva<f, Boolean, Integer, t>> list = b.get(name);
        if (list == null || !list.contains(listener)) {
            return;
        }
        list.remove(listener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(rul<? super f, t> call) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc03baf", new Object[]{this, call});
            return;
        }
        q.d(call, "call");
        for (Object obj : f20247a.values()) {
            call.mo2421invoke(obj);
        }
    }

    private final String a(List<? extends DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80c38867", new Object[]{this, list});
        }
        StringBuilder sb = new StringBuilder();
        for (DXTemplateItem dXTemplateItem : list) {
            sb.append(dXTemplateItem.toString());
            sb.append(";");
        }
        String sb2 = sb.toString();
        q.b(sb2, "stringBuilder.toString()");
        return sb2;
    }
}
