package com.taobao.android.detail.core.performance.preload;

import android.os.Looper;
import android.support.v4.util.LruCache;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.l;
import com.taobao.android.detail.core.performance.preload.core.task.PreloadTaskEntity;
import com.taobao.android.detail.core.performance.preload.h;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import tb.ecg;
import tb.eih;
import tb.eip;
import tb.eiq;
import tb.emu;
import tb.ena;
import tb.jqm;
import tb.kge;

/* loaded from: classes4.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private d f9808a;
    private e b;
    private String[] c;
    private String[] d;
    private ConcurrentHashMap<String, i> e;

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final k f9813a;

        static {
            kge.a(1102695571);
            f9813a = new k();
        }

        public static /* synthetic */ k a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("351f1e5c", new Object[0]) : f9813a;
        }
    }

    static {
        kge.a(414647229);
    }

    public static /* synthetic */ void a(k kVar, PreloadTaskEntity preloadTaskEntity, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67489f6e", new Object[]{kVar, preloadTaskEntity, str, jSONObject});
        } else {
            kVar.a(preloadTaskEntity, str, jSONObject);
        }
    }

    private k() {
        this.f9808a = new d();
        this.b = new e();
        this.c = new String[]{"refresh", "preload"};
        this.d = new String[]{"high", "low"};
        this.e = new ConcurrentHashMap<>();
        emu.a("com.taobao.android.detail.core.performance.preload.PreloadTaskStore");
    }

    public static k a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("351f1e5c", new Object[0]) : a.a();
    }

    public void a(String str, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ada3562", new Object[]{this, str, iVar});
        } else {
            this.e.put(str, iVar);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.e.remove(str);
        }
    }

    private void a(JSONObject jSONObject, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("163ec766", new Object[]{this, jSONObject, str, str2, str3});
            return;
        }
        for (Map.Entry<String, i> entry : this.e.entrySet()) {
            i value = entry.getValue();
            if (value != null) {
                value.a(jSONObject, str, str2, str3);
            }
        }
    }

    private ExecutorService b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("1a7854d2", new Object[]{this}) : this.f9808a.a(1, 60, "Detail Preload Store");
    }

    public void a(final PreloadTaskEntity preloadTaskEntity, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c819d4", new Object[]{this, preloadTaskEntity, str});
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            b().execute(new Runnable() { // from class: com.taobao.android.detail.core.performance.preload.k.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        k.a(k.this, preloadTaskEntity, str, (JSONObject) null);
                    }
                }
            });
        } else {
            a(preloadTaskEntity, str, null);
        }
    }

    public void a(final PreloadTaskEntity preloadTaskEntity, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b1ff5a6", new Object[]{this, preloadTaskEntity, jSONObject});
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            b().execute(new Runnable() { // from class: com.taobao.android.detail.core.performance.preload.k.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        k.a(k.this, preloadTaskEntity, (String) null, jSONObject);
                    }
                }
            });
        } else {
            a(preloadTaskEntity, null, jSONObject);
        }
    }

    private void a(PreloadTaskEntity preloadTaskEntity, String str, JSONObject jSONObject) {
        com.taobao.android.detail.core.performance.preload.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be5bab9c", new Object[]{this, preloadTaskEntity, str, jSONObject});
            return;
        }
        if (jSONObject == null) {
            try {
                jSONObject = JSONObject.parseObject(str);
            } catch (Throwable th) {
                com.taobao.android.detail.core.utils.i.a(l.a("PreloadTaskStore"), "预加载保存失败", th);
                ecg.e(preloadTaskEntity.getItemsId(), th.getMessage(), preloadTaskEntity.sourceFrom, str);
                return;
            }
        }
        Map map = (Map) JSONObject.toJavaObject(jSONObject.getJSONObject("data"), Map.class);
        if (jqm.a()) {
            com.taobao.android.detail.core.utils.i.c(l.a("PreloadTaskStore"), map.toString());
        }
        for (Map.Entry entry : map.entrySet()) {
            JSONObject jSONObject2 = (JSONObject) entry.getValue();
            if (jSONObject2 != null) {
                if (eiq.n && !ena.a((Object) jSONObject2)) {
                    com.taobao.android.detail.core.utils.i.a(l.a("PreloadTaskStore"), "非奥创协议");
                } else {
                    if (eip.U) {
                        a2 = com.taobao.android.detail.core.performance.preload.a.b(jSONObject2);
                    } else {
                        a2 = com.taobao.android.detail.core.performance.preload.a.a(jSONObject2);
                    }
                    if (c.a(a2.f9787a)) {
                        if (!TextUtils.isEmpty(a2.b)) {
                            com.taobao.phenix.intf.b.h().a(a2.b).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.android.detail.core.performance.preload.k.4
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.taobao.phenix.intf.event.a
                                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                                    IpChange ipChange2 = $ipChange;
                                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                                }

                                public boolean a(SuccPhenixEvent succPhenixEvent) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                                    }
                                    com.taobao.android.detail.core.utils.i.a(l.a("PreloadTaskStore"), "图片加载完成");
                                    return true;
                                }
                            }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.android.detail.core.performance.preload.k.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.taobao.phenix.intf.event.a
                                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                                    IpChange ipChange2 = $ipChange;
                                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                                }

                                public boolean a(FailPhenixEvent failPhenixEvent) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                                    }
                                    com.taobao.android.detail.core.utils.i.a(l.a("PreloadTaskStore"), "图片加载失败");
                                    return true;
                                }
                            }).fetch();
                        }
                        h a3 = new h.a().a("preload").b(eih.a(preloadTaskEntity.sourceFrom)).c((String) entry.getKey()).a(jSONObject2).e(a2.f9787a).f(a2.b).g(preloadTaskEntity.sourceFrom).h(a2.d).a();
                        a().a(a3);
                        if (preloadTaskEntity.isNavPreload()) {
                            a(a3.d, preloadTaskEntity.getItemsId(), preloadTaskEntity.sourceFrom, a2.f9787a);
                        }
                    } else {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("preloadProtocolVersion=");
                        stringBuffer.append(a2.f9787a);
                        stringBuffer.append("sourceFrom");
                        stringBuffer.append(preloadTaskEntity.sourceFrom);
                        stringBuffer.append("itemId=");
                        stringBuffer.append((String) entry.getKey());
                        ecg.d((String) entry.getKey(), stringBuffer.toString(), preloadTaskEntity.sourceFrom, b.a(preloadTaskEntity.sourceFrom));
                        String a4 = l.a("PreloadTaskStore");
                        com.taobao.android.detail.core.utils.i.c(a4, "预请求结果数据的协议版本不在白名单里面->preloadProtocolVersion：" + a2.f9787a);
                    }
                }
            }
        }
    }

    public synchronized h a(h hVar) {
        h hVar2;
        LruCache<String, h> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("d332be4e", new Object[]{this, hVar});
        }
        try {
            hVar2 = this.b.a(hVar).put(hVar.c, hVar);
            try {
                if (jqm.a()) {
                    com.taobao.android.detail.core.utils.i.c(l.a("PreloadTaskStore"), "save cache success" + hVar.toString());
                }
                com.taobao.android.detail.core.utils.i.c(l.a("PreloadTaskStore"), "save cache success: cache_size:" + a2.size() + "max_size:" + a2.maxSize());
            } catch (Exception e) {
                e = e;
                e.printStackTrace();
                com.taobao.android.detail.core.utils.i.a(l.a("PreloadTaskStore"), "save cache error", e);
                return hVar2;
            }
        } catch (Exception e2) {
            e = e2;
            hVar2 = null;
        }
        return hVar2;
    }

    public synchronized void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        try {
            for (String str3 : this.d) {
                LruCache<String, h> a2 = this.b.a(str, str3);
                if (a2 != null) {
                    a2.remove(str2);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            com.taobao.android.detail.core.utils.i.a(l.a("PreloadTaskStore"), "delete cache error", e);
        }
    }

    public synchronized h b(String str) {
        h hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("79bb5d4", new Object[]{this, str});
        }
        try {
            String[] strArr = this.c;
            int length = strArr.length;
            hVar = null;
            int i = 0;
            while (i < length) {
                try {
                    String str2 = strArr[i];
                    h hVar2 = hVar;
                    for (String str3 : this.d) {
                        try {
                            LruCache<String, h> a2 = this.b.a(str2, str3);
                            if (a2 != null) {
                                h hVar3 = a2.get(str);
                                if (hVar3 != null) {
                                    try {
                                        if (!hVar3.a()) {
                                            return hVar3;
                                        }
                                    } catch (Exception e) {
                                        e = e;
                                        hVar = hVar3;
                                        e.printStackTrace();
                                        com.taobao.android.detail.core.utils.i.a(l.a("PreloadTaskStore"), "get cache error", e);
                                        return hVar;
                                    }
                                }
                                hVar2 = hVar3;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            hVar = hVar2;
                        }
                    }
                    i++;
                    hVar = hVar2;
                } catch (Exception e3) {
                    e = e3;
                }
            }
        } catch (Exception e4) {
            e = e4;
            hVar = null;
        }
        return hVar;
    }
}
