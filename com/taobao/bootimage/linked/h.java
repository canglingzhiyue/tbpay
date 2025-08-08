package com.taobao.bootimage.linked;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.bootimage.BootImageDataMgr;
import com.taobao.bootimage.data.BootImageData;
import com.taobao.bootimage.linked.e;
import com.taobao.popupcenter.strategy.PopStrategy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import tb.kdo;
import tb.kdx;
import tb.kef;
import tb.keh;
import tb.kej;
import tb.kel;
import tb.kem;
import tb.keo;
import tb.keq;
import tb.kge;
import tb.srd;
import tb.ssh;
import tb.tiq;

/* loaded from: classes.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final h f16709a;
    private static final keo.a l;
    private static final BootImageDataMgr.a m;
    private c b;
    private kef g;
    private volatile d j;
    private volatile List<LinkedSplashData> k;
    public DinamicXEngine n;
    private final e c = new e();
    private final com.taobao.bootimage.h d = new com.taobao.bootimage.h();
    private final kdx e = new kdx();
    private final kdo f = new kdo();
    private final keq h = new keq();
    private final srd o = new srd();
    private final f i = new f() { // from class: com.taobao.bootimage.linked.h.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.bootimage.linked.f
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            try {
                if (h.a(h.i()) == null) {
                    return false;
                }
                f a2 = h.a(h.i()).a();
                if (a2 == null) {
                    kej.a("LinkedSplashManager", "checkIsAtHomepageCmd, envCallback = " + ((Object) null));
                    return false;
                }
                boolean a3 = a2.a();
                kej.a("LinkedSplashManager", "checkIsAtHomepageCmd, atHomepageRmdTab = " + a3);
                return a3;
            } catch (Throwable th) {
                kej.a("LinkedSplashManager", "checkIsAtHomepageCmd", th);
                return false;
            }
        }
    };

    public static /* synthetic */ BootImageData a(List list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BootImageData) ipChange.ipc$dispatch("c0a5e283", new Object[]{list}) : b(list);
    }

    public static /* synthetic */ c a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("4d6a1499", new Object[]{hVar}) : hVar.b;
    }

    public static /* synthetic */ List b(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("3873649a", new Object[]{hVar}) : hVar.k;
    }

    public static /* synthetic */ h i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("7e914476", new Object[0]) : f16709a;
    }

    static {
        kge.a(-791914128);
        f16709a = new h();
        l = new keo.a() { // from class: com.taobao.bootimage.linked.h.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.keo.a
            public BootImageData a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (BootImageData) ipChange.ipc$dispatch("74b0aa92", new Object[]{this});
                }
                List b = h.b(h.i());
                if (b == null) {
                    return null;
                }
                return h.a(b);
            }
        };
        m = new BootImageDataMgr.a() { // from class: com.taobao.bootimage.linked.h.3
        };
    }

    private h() {
    }

    public static h a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("9262e8b8", new Object[]{str});
        }
        kej.a("LinkedSplashManager", "getLinkedSplashManager, bizName: " + str);
        return f16709a;
    }

    public static c b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("1f9d999e", new Object[]{str});
        }
        kej.a("LinkedSplashManager", "getCooperator bizName: " + str);
        if (f16709a.b == null) {
            kej.a("LinkedSplashManager", "getCooperator create LinkedSplashCooperator: " + str);
            f16709a.b = new c(str);
            h hVar = f16709a;
            hVar.b.a(new com.taobao.bootimage.linked.ext.d(hVar.i));
            f16709a.b.a(new com.taobao.bootimage.interact.pop.a());
        }
        return f16709a.b;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : Boolean.parseBoolean(kem.a().a("key_new_linked_splash_enabled", Boolean.TRUE.toString()));
    }

    public d b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("aea405b3", new Object[]{this});
        }
        d dVar = this.j;
        return dVar == null ? new d(new JSONObject()) : dVar;
    }

    public List<LinkedSplashData> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this});
        }
        List<LinkedSplashData> list = this.k;
        return list == null ? Collections.emptyList() : list;
    }

    public void a(JSONObject jSONObject) {
        String str;
        e.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        kej.a("LinkedSplashManager", "updateData, topViewSplashSection, start");
        try {
            a2 = this.c.a(jSONObject);
            kel.a(jSONObject);
            if (a2.a()) {
                kej.a("LinkedSplashManager", "updateData, got null, reset local data");
                this.f.c();
                if (kel.f()) {
                    this.o.a(jSONObject);
                }
                ssh.a(ssh.TOP_VIEW_CACHE, false);
                ssh.a(false);
            } else {
                kej.a("LinkedSplashManager", "updateData, parse result , parse.ext = " + a2.b + ", parse.dataList = " + a2.f16707a);
            }
            this.j = a2.b;
            this.k = a2.f16707a;
            this.e.a(jSONObject == null ? null : jSONObject.getJSONObject("ext"));
            if (a2.b != null) {
                kem.a().a(a2.b);
            }
            kej.a("LinkedSplashManager", "有数据更新saveAdvInfo");
        } catch (Throwable th) {
            kej.a("LinkedSplashManager", "updateData", th);
        }
        if (kel.f() && (!keo.a(a2.f16707a) || kel.j())) {
            this.o.a(jSONObject);
            this.o.a(1000);
            for (LinkedSplashData linkedSplashData : c()) {
                if (this.b != null) {
                    this.b.a(linkedSplashData);
                }
            }
            kej.a("LinkedSplashManager", "preDownload, data pre download finish ");
            return;
        }
        if (a2.f16707a != null) {
            keo.a(l);
            BootImageDataMgr.a(m);
        } else {
            keo.a();
            BootImageDataMgr.b();
        }
        kej.a("LinkedSplashManager", "updateData, parse data finish ");
        try {
        } catch (Throwable th2) {
            kej.a("LinkedSplashManager", "preDownload", th2);
        }
        if (c().isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (LinkedSplashData linkedSplashData2 : c()) {
            if (com.taobao.mmad.data.b.TYPE_BANNER.equals(linkedSplashData2.getLinkedDataType())) {
                str = "TopView";
                ssh.a(ssh.TOP_VIEW_CACHE, true);
            } else {
                str = tiq.BIZ_CODE;
                ssh.a(true);
            }
            arrayList.add(new LinkedSplashData(linkedSplashData2.getSubSection(), linkedSplashData2.getTraceId(), a(str, linkedSplashData2.getData())));
        }
        this.f.a(arrayList);
        for (LinkedSplashData linkedSplashData3 : c()) {
            if (this.b != null) {
                this.b.a(linkedSplashData3);
            }
        }
        kej.a("LinkedSplashManager", "preDownload, data pre download finish ");
        b(jSONObject);
    }

    private void b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            try {
                DXEngineConfig a2 = new DXEngineConfig.a("MMAdBiz").a();
                if (this.n == null) {
                    this.n = new DinamicXEngine(a2);
                }
                JSONArray jSONArray = jSONObject.getJSONArray("sections");
                if (jSONArray == null || jSONArray.size() <= 0) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    DXTemplateItem dXTemplateItem = new DXTemplateItem();
                    JSONObject jSONObject5 = (JSONObject) next;
                    if (jSONObject5 != null && (jSONObject2 = jSONObject5.getJSONObject("subSection")) != null && !jSONObject2.isEmpty() && (jSONObject3 = jSONObject2.getJSONObject(PopStrategy.IDENTIFIER_SPLASH)) != null && !jSONObject3.isEmpty() && (jSONObject4 = jSONObject3.getJSONObject("template")) != null) {
                        if (!StringUtils.isEmpty(jSONObject4.getString("version"))) {
                            dXTemplateItem.b = Long.parseLong(jSONObject4.getString("version"));
                        }
                        dXTemplateItem.f11925a = jSONObject4.getString("name");
                        dXTemplateItem.c = jSONObject4.getString("url");
                        arrayList.add(dXTemplateItem);
                    }
                }
                kej.a("LinkedSplashManager", "downloadTemplate start ");
                this.n.a(arrayList);
            } catch (Throwable th) {
                kej.a("LinkedSplashManager", "downloadTemplate error", th);
            }
        }
    }

    public static BootImageData a(String str, BootImageData bootImageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BootImageData) ipChange.ipc$dispatch("ac73bab2", new Object[]{str, bootImageData});
        }
        if (bootImageData == null || bootImageData.result == null) {
            kej.a(kem.TAG, "SplashDataMgr preDownloadResource");
            return null;
        }
        keo.a(bootImageData);
        keo.a(str, bootImageData, keo.a(str, bootImageData));
        return bootImageData;
    }

    private static BootImageData b(List<LinkedSplashData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BootImageData) ipChange.ipc$dispatch("7b1b8304", new Object[]{list});
        }
        BootImageData bootImageData = new BootImageData();
        bootImageData.result = new ArrayList();
        for (LinkedSplashData linkedSplashData : list) {
            if (linkedSplashData != null) {
                bootImageData.result.addAll(linkedSplashData.getData().result);
            }
        }
        return bootImageData;
    }

    public com.taobao.bootimage.h d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.bootimage.h) ipChange.ipc$dispatch("bb7db8ab", new Object[]{this}) : this.d;
    }

    public kdx e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kdx) ipChange.ipc$dispatch("2dcd643b", new Object[]{this}) : this.e;
    }

    public kdo f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kdo) ipChange.ipc$dispatch("357f0883", new Object[]{this}) : this.f;
    }

    public kef g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kef) ipChange.ipc$dispatch("3d30b08c", new Object[]{this});
        }
        if (this.g == null) {
            this.g = new keh();
        }
        return this.g;
    }

    public keq h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (keq) ipChange.ipc$dispatch("44e25740", new Object[]{this}) : this.h;
    }

    public srd j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (srd) ipChange.ipc$dispatch("54497430", new Object[]{this}) : this.o;
    }
}
