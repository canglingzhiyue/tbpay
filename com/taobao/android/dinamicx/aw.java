package com.taobao.android.dinamicx;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.alibaba.ip.server.FileManager;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import tb.ctz;
import tb.fqi;
import tb.fuw;
import tb.fux;
import tb.fwh;
import tb.fwi;
import tb.fwj;
import tb.fwk;
import tb.fwl;
import tb.fwn;
import tb.fwo;
import tb.fxb;
import tb.fxc;
import tb.fxe;
import tb.fxn;
import tb.kge;

/* loaded from: classes.dex */
public class aw extends m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, DXTemplateItem> h;
    public fwo c;
    public Context d;
    private com.taobao.android.dinamicx.template.download.a e;
    private fwi f;
    private long g;

    /* loaded from: classes5.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public List<DXTemplateItem> f11818a = new ArrayList();

        static {
            kge.a(824361246);
        }

        public a() {
        }
    }

    public static /* synthetic */ Object ipc$super(aw awVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ long a(aw awVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1560bf22", new Object[]{awVar})).longValue() : awVar.g;
    }

    static {
        kge.a(818769708);
        h = new ConcurrentHashMap();
    }

    public aw(r rVar, final Context context) {
        super(rVar);
        this.d = context;
        this.g = b().b();
        this.c = new fwo(b().D());
        this.f = new fwi(b().d);
        this.e = new com.taobao.android.dinamicx.template.download.a(u.d, rVar.b().g, h);
        final String c = b().c();
        fxe.e(new Runnable() { // from class: com.taobao.android.dinamicx.aw.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    fwh.a().a(context, "dinamicx", c);
                }
            }
        });
        fwn.a().a(context);
        d();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!fwj.a().a(this.f11887a)) {
        } else {
            JSONObject a2 = com.taobao.android.dinamicx.template.download.c.a(this.f11887a, fxb.ASSET_PRESET_TEMPLATE_INFOLIST);
            if (fxn.a().c()) {
                JSONObject a3 = com.taobao.android.dinamicx.template.download.c.a(this.f11887a, fxb.ASSET_SUB_PRESET_TEMPLATE_INFOLIST);
                if (a2 != null && a3 != null) {
                    a3.putAll(a2);
                    fwj.a().a(this.f11887a, a3);
                    return;
                }
                fwj.a().a(this.f11887a, a2);
                return;
            }
            fwj.a().a(this.f11887a, a2);
        }
    }

    public synchronized DXWidgetNode a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("f6ee1cf8", new Object[]{this, dXRuntimeContext});
        }
        return a(dXRuntimeContext, true);
    }

    public synchronized DXWidgetNode a(DXRuntimeContext dXRuntimeContext, boolean z) {
        String str;
        DXWidgetNode b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("77bd933a", new Object[]{this, dXRuntimeContext, new Boolean(z)});
        } else if (dXRuntimeContext == null) {
            dXRuntimeContext.n().c.add(new s.a(DXMonitorConstant.DX_MONITOR_SERVICE_ID_PIPELINE_RENDER, DXMonitorConstant.DX_MONITOR_SERVICE_ID_PIPELINE_STAGE_GET_TEMPLATE_WT, s.DX_LOAD_WT_ERROR_400014));
            fux.b(" getTemplateWT DX_LOAD_WT_ERROR_400014  runtimeContext == null ");
            return null;
        } else {
            DXRuntimeContext a2 = dXRuntimeContext.a((DXWidgetNode) null);
            a2.t = new s(this.f11887a);
            a2.t.b = dXRuntimeContext.c();
            a2.f11781a = a2.f11781a.a();
            a2.f11781a.n = null;
            a2.f11781a.m = null;
            DXTemplateItem c = a2.c();
            if (c == null) {
                dXRuntimeContext.n().c.add(new s.a(DXMonitorConstant.DX_MONITOR_SERVICE_ID_PIPELINE_RENDER, DXMonitorConstant.DX_MONITOR_SERVICE_ID_PIPELINE_STAGE_GET_TEMPLATE_WT, s.DX_LOAD_WT_ERROR_400016));
                fux.b(" getTemplateWT DX_LOAD_WT_ERROR_400016");
                return null;
            } else if (a(c)) {
                if (c.g == null || TextUtils.isEmpty(c.g.f11934a)) {
                    c.g = fwj.a().d(this.f11887a, c);
                }
                if (c.g == null) {
                    dXRuntimeContext.n().c.add(new s.a(DXMonitorConstant.DX_MONITOR_SERVICE_ID_PIPELINE_RENDER, DXMonitorConstant.DX_MONITOR_SERVICE_ID_PIPELINE_STAGE_GET_TEMPLATE_WT, s.DX_GET_PACKAGEINFO_NULL));
                    fux.b("getTemplateWT templateItem.packageInfo == null 400011");
                    return null;
                }
                boolean a3 = c.a(this.f11887a);
                if (a3) {
                    b = ctz.b().b(this.f11887a, c, dXRuntimeContext.D());
                } else {
                    b = fwl.b().b(this.f11887a, c, dXRuntimeContext.D());
                }
                if (b == null) {
                    fux.b(c.b() + " cache widgetTree == null");
                    long nanoTime = System.nanoTime();
                    b = this.c.a(c, a2, this.d);
                    if (b == null) {
                        fux.b(" load widgetTree == null 400012");
                        dXRuntimeContext.n().c.add(new s.a(DXMonitorConstant.DX_MONITOR_SERVICE_ID_PIPELINE_RENDER, DXMonitorConstant.DX_MONITOR_SERVICE_ID_PIPELINE_STAGE_GET_TEMPLATE_WT, s.DX_LOAD_WT_NULL));
                    }
                    com.taobao.android.dinamicx.monitor.b.a(3, this.f11887a, DXMonitorConstant.DX_MONITOR_TEMPLATE, "Pipeline_Stage_Load_Binary", c, (Map<String, String>) null, System.nanoTime() - nanoTime, true);
                    if (b != null) {
                        dXRuntimeContext.a("loadBinaryUseFileCache", "true");
                        dXRuntimeContext.a("loadBinaryFromCache", "false");
                        b.setStatFlag(1);
                        if (b.isV4Node()) {
                            fwl.b().a(this.f11887a, c, b);
                        } else if (a3) {
                            ctz.b().a(this.f11887a, c, b);
                        } else {
                            fwl.b().a(this.f11887a, c, b);
                        }
                    }
                } else {
                    dXRuntimeContext.a("loadBinaryUseFileCache", "false");
                    dXRuntimeContext.a("loadBinaryFromCache", "true");
                    fuw.f("命中原型树缓存: " + dXRuntimeContext.K());
                }
                if (b == null && dXRuntimeContext.n() != null && dXRuntimeContext.n().c != null && a2.n() != null && a2.n().c != null) {
                    dXRuntimeContext.n().c.addAll(a2.n().c);
                }
                if (!z) {
                    return b;
                }
                return a(b, dXRuntimeContext, c, a2, a3);
            } else {
                if (c == null || c.g == null) {
                    str = null;
                } else {
                    str = c.b() + c.g.f11934a;
                }
                fux.b(" load widgetTree == null DX_LOAD_WT_ERROR_400015  isTemplateNotExist" + str);
                return null;
            }
        }
    }

    public boolean a(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a042615", new Object[]{this, dXTemplateItem})).booleanValue();
        }
        long nanoTime = System.nanoTime();
        boolean a2 = fwj.a().a(this.f11887a, dXTemplateItem);
        a(DXMonitorConstant.DX_MONITOR_TEMPLATE_EXIST, this.f11887a, dXTemplateItem, System.nanoTime() - nanoTime, (DXTemplateItem) null);
        return a2;
    }

    public DXTemplateItem d(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("41e6d4eb", new Object[]{this, dXTemplateItem});
        }
        long nanoTime = System.nanoTime();
        DXTemplateItem c = this.f.c(this.f11887a, this.g, dXTemplateItem);
        a(DXMonitorConstant.DX_MONITOR_TEMPLATE_FETCH, this.f11887a, dXTemplateItem, System.nanoTime() - nanoTime, c);
        return c;
    }

    public DXTemplateItem b(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("64c1bd2d", new Object[]{this, dXTemplateItem});
        }
        long nanoTime = System.nanoTime();
        DXTemplateItem a2 = this.f.a(this.f11887a, this.g, dXTemplateItem);
        fwk.a(this.f11887a, this.g, dXTemplateItem);
        a(DXMonitorConstant.DX_MONITOR_TEMPLATE_FETCH, this.f11887a, dXTemplateItem, System.nanoTime() - nanoTime, a2);
        return a2;
    }

    public void c(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1871d93", new Object[]{this, dXTemplateItem});
        } else {
            this.f.b(this.f11887a, this.g, dXTemplateItem);
        }
    }

    public void a(List<DXTemplateItem> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6e0ee3", new Object[]{this, list, str});
        } else if (fqi.aQ()) {
            a(list, str, null, true);
        } else {
            this.e.a(this.f11887a, b(list, str).f11818a, new com.taobao.android.dinamicx.template.download.i() { // from class: com.taobao.android.dinamicx.aw.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.template.download.i
                public boolean a(final DXTemplateItem dXTemplateItem, Map<String, byte[]> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("d76cb158", new Object[]{this, dXTemplateItem, map})).booleanValue();
                    }
                    if (map == null || map.size() <= 0) {
                        return false;
                    }
                    final int size = map.size();
                    final AtomicInteger atomicInteger = new AtomicInteger();
                    AtomicBoolean atomicBoolean = new AtomicBoolean();
                    for (Map.Entry<String, byte[]> entry : map.entrySet()) {
                        final String key = entry.getKey();
                        final byte[] value = entry.getValue();
                        fwn.a().b(key, value);
                        if (fqi.ax()) {
                            aw.this.a(atomicInteger, key, size, dXTemplateItem, value, atomicBoolean);
                        } else {
                            fxe.a(new fxc(2, new Runnable() { // from class: com.taobao.android.dinamicx.aw.2.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (!fwn.a().a(key, value) || atomicInteger.incrementAndGet() != size) {
                                    } else {
                                        fwh.a().a(aw.this.f11887a, dXTemplateItem);
                                    }
                                }
                            }));
                        }
                    }
                    if (!fqi.aM()) {
                        fwj.a().c(aw.this.f11887a, aw.a(aw.this), dXTemplateItem);
                        return true;
                    } else if (atomicBoolean.get()) {
                        fwj.a().c(aw.this.f11887a, aw.a(aw.this), dXTemplateItem);
                        return true;
                    } else {
                        fux.b("1 有文件写入失败 不在通知");
                        return false;
                    }
                }
            }, true);
        }
    }

    public void a(final AtomicInteger atomicInteger, final String str, final int i, final DXTemplateItem dXTemplateItem, final byte[] bArr, final AtomicBoolean atomicBoolean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2dd3c99", new Object[]{this, atomicInteger, str, new Integer(i), dXTemplateItem, bArr, atomicBoolean});
        } else if (str != null && str.endsWith(FileManager.CLASSES_DEX_SUFFIX)) {
            if (fwn.a().a(str, bArr, false)) {
                if (atomicInteger.incrementAndGet() != i) {
                    return;
                }
                fwh.a().a(this.f11887a, dXTemplateItem);
                atomicBoolean.set(true);
                return;
            }
            atomicBoolean.set(false);
        } else if (fqi.aM()) {
            if (!fwn.a().a(str, bArr) || atomicInteger.incrementAndGet() != i) {
                return;
            }
            atomicBoolean.set(true);
            fwh.a().a(this.f11887a, dXTemplateItem);
        } else {
            fxe.a(new fxc(2, new Runnable() { // from class: com.taobao.android.dinamicx.aw.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!fwn.a().a(str, bArr) || atomicInteger.incrementAndGet() != i) {
                    } else {
                        atomicBoolean.set(true);
                        fwh.a().a(aw.this.f11887a, dXTemplateItem);
                    }
                }
            }));
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f.a(i);
        }
    }

    public void a(List<DXTemplateItem> list, String str, final bk bkVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d4170de", new Object[]{this, list, str, bkVar, new Boolean(z)});
        } else {
            this.e.a(this.f11887a, b(list, str).f11818a, new com.taobao.android.dinamicx.template.download.i() { // from class: com.taobao.android.dinamicx.aw.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.template.download.i
                public boolean a(final DXTemplateItem dXTemplateItem, Map<String, byte[]> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("d76cb158", new Object[]{this, dXTemplateItem, map})).booleanValue();
                    }
                    if (map == null || map.size() <= 0) {
                        return false;
                    }
                    final int size = map.size();
                    final AtomicInteger atomicInteger = new AtomicInteger();
                    AtomicBoolean atomicBoolean = new AtomicBoolean();
                    for (Map.Entry<String, byte[]> entry : map.entrySet()) {
                        final String key = entry.getKey();
                        final byte[] value = entry.getValue();
                        fwn.a().b(key, value);
                        if (fqi.ax()) {
                            aw.this.a(atomicInteger, key, size, dXTemplateItem, value, atomicBoolean);
                        } else {
                            fxe.a(new fxc(2, new Runnable() { // from class: com.taobao.android.dinamicx.aw.4.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (!fwn.a().a(key, value) || atomicInteger.incrementAndGet() != size) {
                                    } else {
                                        fwh.a().a(aw.this.f11887a, dXTemplateItem);
                                    }
                                }
                            }));
                        }
                    }
                    if (!fqi.aM()) {
                        fwj.a().c(aw.this.f11887a, aw.a(aw.this), dXTemplateItem);
                        return true;
                    } else if (atomicBoolean.get()) {
                        fwj.a().c(aw.this.f11887a, aw.a(aw.this), dXTemplateItem);
                        bk bkVar2 = bkVar;
                        if (bkVar2 == null) {
                            return true;
                        }
                        bkVar2.a(dXTemplateItem);
                        return true;
                    } else {
                        s sVar = new s("dinamicx");
                        sVar.b = dXTemplateItem;
                        s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_V4_LOGIC, DXMonitorConstant.DX_MONITOR_V4_LOGIC_ERROR, bkVar != null ? s.DX_V4_LOGIC_4100003 : s.DX_V4_LOGIC_4100007);
                        String str2 = bkVar != null ? "remote  有文件写入失败 不在通知" : " engine 有文件写入失败 不在通知";
                        aVar.e = str2;
                        sVar.c.add(aVar);
                        com.taobao.android.dinamicx.monitor.b.a(sVar);
                        fux.b(str2);
                        return false;
                    }
                }
            }, z);
        }
    }

    private a b(List<DXTemplateItem> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("2064a05b", new Object[]{this, list, str});
        }
        a aVar = new a();
        if (list != null && !list.isEmpty()) {
            HashSet<DXTemplateItem> hashSet = new HashSet(list);
            if (hashSet.size() > 0) {
                for (DXTemplateItem dXTemplateItem : hashSet) {
                    if (fxb.a(dXTemplateItem) && !a(dXTemplateItem) && (!fqi.h() || !a(dXTemplateItem, str))) {
                        aVar.f11818a.add(dXTemplateItem);
                    }
                }
            }
        }
        return aVar;
    }

    private boolean a(DXTemplateItem dXTemplateItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b69c4d9f", new Object[]{this, dXTemplateItem, str})).booleanValue();
        }
        if (!fqi.aO() && dXTemplateItem.e() == 0) {
            return false;
        }
        String a2 = a(str, dXTemplateItem);
        for (Map.Entry<String, DXTemplateItem> entry : h.entrySet()) {
            if (a2.equals(entry.getKey())) {
                if (DinamicXEngine.j()) {
                    fuw.a("DXTemplateManager", a2 + " 已在下载队列中，无需下载 " + h.size());
                }
                return true;
            }
        }
        h.put(a2, dXTemplateItem);
        return false;
    }

    public static String a(String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b56935a5", new Object[]{str, dXTemplateItem});
        }
        if (dXTemplateItem != null) {
            return str + dXTemplateItem.b();
        }
        return str + "null";
    }

    private DXWidgetNode a(DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext, DXTemplateItem dXTemplateItem, DXRuntimeContext dXRuntimeContext2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("f6093e1", new Object[]{this, dXWidgetNode, dXRuntimeContext, dXTemplateItem, dXRuntimeContext2, new Boolean(z)});
        }
        try {
            if (!fqi.L()) {
                return dXWidgetNode;
            }
            if (dXWidgetNode == null) {
                fux.b("checkRootLayoutWidgetNode widgetNode == null");
                return null;
            } else if (dXRuntimeContext == null) {
                fux.b("checkRootLayoutWidgetNode runtimeContext == null");
                return dXWidgetNode;
            } else if (dXRuntimeContext2 == null) {
                fux.b("checkRootLayoutWidgetNode cloneRuntimeContext == null");
                return dXWidgetNode;
            } else if (dXWidgetNode instanceof com.taobao.android.dinamicx.widget.m) {
                return dXWidgetNode;
            } else {
                s sVar = new s(this.f11887a);
                s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE_DETAIL, DXMonitorConstant.DX_MONITOR_SERVICE_ID_PIPELINE_STAGE_GET_TEMPLATE_WT, s.DXERROR_PIPELINE_LOAD_WT_IS_NULL_OR_NOT_LAYOUT);
                aVar.e = "getTemplateWT !(widgetNode instanceof DXLayout)";
                sVar.c.add(aVar);
                com.taobao.android.dinamicx.monitor.b.a(sVar);
                if (fqi.k(dXRuntimeContext.A())) {
                    boolean M = fqi.M();
                    if (M) {
                        fux.b("before reload widgetMap: " + dXRuntimeContext.R() + "; cloneWidgetMap: " + dXRuntimeContext2.R());
                    }
                    if (z) {
                        ctz.b().a(dXRuntimeContext.A(), dXRuntimeContext.c(), dXRuntimeContext.D());
                    } else {
                        fwl.b().a(dXRuntimeContext.A(), dXRuntimeContext.c(), dXRuntimeContext.D());
                    }
                    if (dXTemplateItem != null && dXTemplateItem.g != null) {
                        fwn.a().a(dXTemplateItem.g.f11934a);
                    }
                    dXWidgetNode = a(dXRuntimeContext, false);
                    if (!(dXWidgetNode instanceof com.taobao.android.dinamicx.widget.m)) {
                        s sVar2 = new s(this.f11887a);
                        s.a aVar2 = new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE_DETAIL, DXMonitorConstant.DX_MONITOR_SERVICE_ID_PIPELINE_STAGE_GET_TEMPLATE_WT, s.DXERROR_PIPELINE_LOAD_WT_FROM_BINARY_IS_NULL_OR_NOT_LAYOUT);
                        aVar2.e = "getTemplateWTFromBinary ";
                        if (dXWidgetNode == null) {
                            aVar2.e += "reload widgetNode is null; ";
                        } else {
                            aVar2.e += "reload !(widgetNode instanceof DXLayout); ";
                        }
                        if (M) {
                            aVar2.e += "widgetMapInfo: " + dXRuntimeContext.R() + "; cloneWidgetMap: " + dXRuntimeContext2.R();
                        }
                        sVar2.c.add(aVar2);
                        com.taobao.android.dinamicx.monitor.b.a(sVar2);
                    }
                }
                return dXWidgetNode;
            }
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
            fux.b(com.taobao.android.dinamicx.exception.a.a(th));
            return dXWidgetNode;
        }
    }

    private void a(String str, String str2, DXTemplateItem dXTemplateItem, long j, DXTemplateItem dXTemplateItem2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85be6aa8", new Object[]{this, str, str2, dXTemplateItem, new Long(j), dXTemplateItem2});
            return;
        }
        HashMap hashMap = new HashMap();
        if (dXTemplateItem2 != null && dXTemplateItem2.e) {
            hashMap.put("isPreset", "true");
            hashMap.put("presetTempName", dXTemplateItem2.f());
            hashMap.put("presetTempVer", String.valueOf(dXTemplateItem2.g()));
            if (DinamicXEngine.j()) {
                fuw.d("DXFetchTemplate", str2 + " 访问到了预置模版: " + dXTemplateItem2.b());
            }
        }
        com.taobao.android.dinamicx.monitor.b.a(2, str2, DXMonitorConstant.DX_MONITOR_TEMPLATE, str, dXTemplateItem, (Map<String, String>) hashMap, j, true);
    }

    public static aw a(r rVar, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aw) ipChange.ipc$dispatch("927ee5ce", new Object[]{rVar, context}) : new aw(rVar, context);
    }
}
