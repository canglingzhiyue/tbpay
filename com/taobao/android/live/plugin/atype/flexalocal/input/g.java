package com.taobao.android.live.plugin.atype.flexalocal.input;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.context.atmo.bean.AtmosphereResListResponseData;
import com.taobao.alilive.aliliveframework.context.atmo.bean.AtmosphereResListResponseDataNew;
import com.taobao.alilive.aliliveframework.context.atmo.bean.EffectResConfig;
import com.taobao.alilive.aliliveframework.context.atmo.bean.StickerConfig;
import com.taobao.alilive.aliliveframework.context.atmo.bean.StickerGroup;
import com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.business.AtmosphereResListResponse;
import com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.business.AtmosphereResListResponseDataNew2;
import com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.business.AtmosphereResListResponseNew;
import com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.business.KeywordAtmosphere;
import com.taobao.android.task.Coordinator;
import com.taobao.taolive.room.utils.ad;
import com.taobao.taolive.room.utils.l;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.core.h;
import com.taobao.taolive.sdk.mergeInfo.UnImportantLiveInfoResponseData;
import com.taobao.taolive.sdk.mergeInfo.b;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.w;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.ffg;
import tb.fht;
import tb.gwy;
import tb.hgs;
import tb.hkk;
import tb.kge;
import tb.plx;
import tb.ply;
import tb.plz;
import tb.pmd;
import tb.tkg;
import tb.tki;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;

/* loaded from: classes6.dex */
public class g implements com.taobao.taolive.sdk.adapter.network.d, b.a, ffg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String STICKER_TYPE_ICON = "icon";
    public static final String STICKER_TYPE_STRIP = "strip";
    private com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.business.a l;
    private fht u;
    private List<AtmosphereResListResponseDataNew.TabInfo> v;
    private com.taobao.alilive.aliliveframework.frame.a w;
    private Context b = pmd.a().u().c();
    private boolean s = false;
    private Handler t = new Handler(Looper.getMainLooper());
    private Runnable x = new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.g.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            g.i(g.this).clear();
            g.j(g.this).clear();
            String a2 = ad.a("recently_expression_catch_key");
            String a3 = ad.a("quick_expression_catch_key");
            try {
                final ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(a2)) {
                    JSONArray jSONArray = (JSONArray) JSONObject.parse(a2);
                    for (int i = 0; i < jSONArray.size(); i++) {
                        Object obj = jSONArray.get(i);
                        if (obj instanceof String) {
                            String str = (String) obj;
                            if (!TextUtils.isEmpty(str)) {
                                arrayList.add(str);
                            }
                        }
                    }
                    q.b("AtmosphereMultiCaseManager", "read recently data");
                }
                JSONArray jSONArray2 = (JSONArray) JSONObject.parse(a3);
                final ArrayList arrayList2 = new ArrayList();
                if (!TextUtils.isEmpty(a3)) {
                    for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                        Object obj2 = jSONArray2.get(i2);
                        if (obj2 instanceof String) {
                            String str2 = (String) obj2;
                            if (!TextUtils.isEmpty(str2)) {
                                arrayList2.add(str2);
                            }
                        }
                    }
                    q.b("AtmosphereMultiCaseManager", "read quick data");
                }
                g.k(g.this).post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.g.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        g.i(g.this).addAll(arrayList);
                        g.j(g.this).addAll(arrayList2);
                    }
                });
            } catch (Exception unused) {
                plx.b("AtmosphereMultiCaseManager", "mReadExpressionRunnable value:" + a2);
            }
        }
    };
    private Runnable y = new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.g.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ad.a("recently_expression_catch_key", JSONObject.toJSONString(g.i(g.this)));
            ad.a("quick_expression_catch_key", JSONObject.toJSONString(g.j(g.this)));
            q.b("AtmosphereMultiCaseManager", "write recently data");
        }
    };
    private HashMap<String, StickerGroup> c = new HashMap<>();
    private List<AtmosphereResListResponseData.AtmosphereResItem> g = new ArrayList();
    private List<AtmosphereResListResponseData.AtmosphereResItem> h = new ArrayList();
    private HashMap<String, StickerConfig> d = new HashMap<>();
    private HashMap<String, StickerConfig> e = new HashMap<>();
    private HashMap<String, StickerConfig> f = new HashMap<>();
    private List<a> m = new ArrayList();
    private List<com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.b> n = new ArrayList();
    private HashMap<Integer, String> p = new HashMap<>();
    private List<Integer> o = new ArrayList();
    private SparseArray<HashMap<String, List<EffectResConfig>>> j = new SparseArray<>();
    private HashMap<String, List<EffectResConfig>> k = new HashMap<>();
    private ArrayList<String> q = new ArrayList<>();
    private ArrayList<String> r = new ArrayList<>();
    private List<List<AtmosphereResListResponseData.AtmosphereResItem>> i = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public boolean f13919a = ply.av();
    private HashMap<String, String> z = new HashMap<>();

    static {
        kge.a(642558679);
        kge.a(-797454141);
        kge.a(384708217);
        kge.a(-169985304);
    }

    public static /* synthetic */ Context a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("974fa65b", new Object[]{gVar}) : gVar.b;
    }

    public static /* synthetic */ HashMap b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("cb27e8e5", new Object[]{gVar}) : gVar.c;
    }

    public static /* synthetic */ HashMap c(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("a91b4ec4", new Object[]{gVar}) : gVar.d;
    }

    public static /* synthetic */ HashMap d(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("870eb4a3", new Object[]{gVar}) : gVar.f;
    }

    public static /* synthetic */ HashMap e(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("65021a82", new Object[]{gVar}) : gVar.e;
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a f(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("ec8cf033", new Object[]{gVar}) : gVar.w;
    }

    public static /* synthetic */ SparseArray g(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SparseArray) ipChange.ipc$dispatch("1672a9fc", new Object[]{gVar}) : gVar.j;
    }

    public static /* synthetic */ HashMap h(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("fedc4c1f", new Object[]{gVar}) : gVar.k;
    }

    public static /* synthetic */ ArrayList i(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("81f2a5b5", new Object[]{gVar}) : gVar.q;
    }

    public static /* synthetic */ ArrayList j(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("b0a40fd4", new Object[]{gVar}) : gVar.r;
    }

    public static /* synthetic */ Handler k(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("1d21718d", new Object[]{gVar}) : gVar.t;
    }

    public g() {
        q.b("AtmosphereMultiCaseManager", "constructor init");
    }

    @Override // tb.ffg
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Coordinator.execute(this.y);
        this.w = null;
    }

    @Override // tb.ffg
    public List<List<StickerGroup>> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        List<List<AtmosphereResListResponseData.AtmosphereResItem>> list = this.i;
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.i.size(); i++) {
            List<AtmosphereResListResponseData.AtmosphereResItem> list2 = this.i.get(i);
            ArrayList arrayList2 = new ArrayList();
            if (i == 0) {
                a(arrayList2, list2);
            } else {
                b(arrayList2, list2);
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    private List<StickerGroup> a(List<StickerGroup> list, List<AtmosphereResListResponseData.AtmosphereResItem> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("66db90bd", new Object[]{this, list, list2});
        }
        if (this.q.size() > 0) {
            StickerGroup stickerGroup = new StickerGroup();
            stickerGroup.title = "最近使用";
            stickerGroup.type = "recently";
            stickerGroup.stickerType = "icon";
            stickerGroup.stickers = new ArrayList();
            for (int i = 0; i < this.q.size(); i++) {
                String str = this.q.get(i);
                if (this.d.containsKey(str)) {
                    stickerGroup.stickers.add(this.d.get(str));
                }
            }
            list.add(stickerGroup);
        }
        return b(list, list2);
    }

    private List<StickerGroup> b(List<StickerGroup> list, List<AtmosphereResListResponseData.AtmosphereResItem> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("94b42b1c", new Object[]{this, list, list2});
        }
        for (AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem : list2) {
            HashMap<String, StickerGroup> hashMap = this.c;
            StickerGroup stickerGroup = hashMap.get(atmosphereResItem.groupId + "_" + atmosphereResItem.version);
            if (stickerGroup != null && stickerGroup.stickers != null && !stickerGroup.stickers.isEmpty()) {
                AtmosphereResListResponseData.Rule rule = stickerGroup.rule;
                if (rule != null) {
                    long b = plz.b();
                    try {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                        long time = simpleDateFormat.parse(rule.startTime).getTime();
                        long time2 = simpleDateFormat.parse(rule.endTime).getTime();
                        if (TextUtils.equals(rule.effective, "true") && b >= time && b <= time2) {
                            list.add(stickerGroup);
                        }
                    } catch (Exception e) {
                        if (TextUtils.equals(rule.effective, "true")) {
                            list.add(stickerGroup);
                        }
                        q.b("AtmosphereMultiCaseManager", "getOtherTabData catch exception:" + e.getMessage());
                    }
                } else {
                    list.add(stickerGroup);
                }
            }
        }
        return list;
    }

    @Override // tb.ffg
    public List<EffectResConfig> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str}) : this.k.get(str);
    }

    public List<JSONObject> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eb209513", new Object[]{this, str});
        }
        List<EffectResConfig> list = this.k.get(str);
        return list != null ? a(list) : new ArrayList();
    }

    @Override // tb.ffg
    public List<JSONObject> a(List<EffectResConfig> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (EffectResConfig effectResConfig : list) {
                arrayList.add(JSONObject.parseObject(JSONObject.toJSONString(effectResConfig)));
            }
        }
        return arrayList;
    }

    @Override // tb.ffg
    public HashMap<String, StickerConfig> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("52df8a4d", new Object[]{this});
        }
        if (this.d == null && com.taobao.taolive.sdk.utils.b.d(this.b)) {
            w.a(this.b, "getStickerKeyMatchMap is null");
            q.b("AtmosphereMultiCaseManager", "getStickerKeyMatchMap" + Log.getStackTraceString(new Throwable()));
        }
        return this.d;
    }

    @Override // tb.ffg
    public HashMap<String, StickerConfig> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("9d11238e", new Object[]{this});
        }
        if (this.f == null && com.taobao.taolive.sdk.utils.b.d(this.b)) {
            w.a(this.b, "getStickerIdMatchMap is null");
            q.b("AtmosphereMultiCaseManager", "getStickerIdMatchMap" + Log.getStackTraceString(new Throwable()));
        }
        return this.f;
    }

    @Override // tb.ffg
    public HashMap<String, StickerConfig> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("e742bccf", new Object[]{this}) : this.e;
    }

    @Override // tb.ffg
    public HashMap<Integer, String> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("31745610", new Object[]{this}) : this.p;
    }

    @Override // tb.ffg
    public List<StickerGroup> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d0410f19", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        if (this.q.size() > 0) {
            StickerGroup stickerGroup = new StickerGroup();
            stickerGroup.title = "最近使用";
            stickerGroup.type = "recently";
            stickerGroup.stickerType = "icon";
            stickerGroup.stickers = new ArrayList();
            for (int i = 0; i < this.q.size(); i++) {
                String str = this.q.get(i);
                if (this.d.containsKey(str)) {
                    stickerGroup.stickers.add(this.d.get(str));
                }
            }
            arrayList.add(stickerGroup);
        }
        return b(arrayList, this.g);
    }

    @Override // tb.ffg
    public List<StickerGroup> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem : this.h) {
            HashMap<String, StickerGroup> hashMap = this.c;
            StickerGroup stickerGroup = hashMap.get(atmosphereResItem.groupId + "_" + atmosphereResItem.version);
            if (stickerGroup != null && stickerGroup.stickers != null && !stickerGroup.stickers.isEmpty()) {
                arrayList.add(stickerGroup);
            }
        }
        return arrayList;
    }

    public List<StickerGroup> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("566a3ef4", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem : this.h) {
            HashMap<String, StickerGroup> hashMap = this.c;
            StickerGroup stickerGroup = hashMap.get(atmosphereResItem.groupId + "_" + atmosphereResItem.version);
            if (!TextUtils.equals(atmosphereResItem.type, "anchor_custom_sticker") && stickerGroup != null && stickerGroup.stickers != null && !stickerGroup.stickers.isEmpty()) {
                arrayList.add(stickerGroup);
            }
        }
        return arrayList;
    }

    @Override // tb.ffg
    public List<StickerGroup> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9f84bbd7", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem : this.g) {
            HashMap<String, StickerGroup> hashMap = this.c;
            StickerGroup stickerGroup = hashMap.get(atmosphereResItem.groupId + "_" + atmosphereResItem.version);
            if (stickerGroup != null && stickerGroup.stickers != null && !stickerGroup.stickers.isEmpty()) {
                arrayList.add(stickerGroup);
            }
        }
        return arrayList;
    }

    @Override // tb.ffg
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (this.q.contains(str)) {
            this.q.remove(str);
            this.q.add(0, str);
        } else {
            this.q.add(0, str);
            if (this.q.size() <= 7) {
                return;
            }
            ArrayList<String> arrayList = this.q;
            arrayList.remove(arrayList.size() - 1);
        }
    }

    @Override // tb.ffg
    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        HashMap<String, StickerConfig> c = c();
        StickerConfig stickerConfig = c.get(str);
        if (!z) {
            if (!this.r.contains(str)) {
                this.r.add(str);
            }
            a(c, stickerConfig);
        } else if (this.r.contains(str)) {
            this.r.remove(str);
            this.r.add(0, str);
        } else {
            this.r.add(0, str);
            a(c, stickerConfig);
        }
    }

    private void a(HashMap<String, StickerConfig> hashMap, StickerConfig stickerConfig) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e30843f", new Object[]{this, hashMap, stickerConfig});
        } else if (stickerConfig == null) {
        } else {
            boolean equals = TextUtils.equals("1", stickerConfig.type);
            Iterator<String> it = this.r.iterator();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (it.hasNext()) {
                String next = it.next();
                StickerConfig stickerConfig2 = hashMap.get(next);
                if (stickerConfig2 != null && TextUtils.equals("1", stickerConfig2.type)) {
                    i++;
                    i4 = this.r.indexOf(next);
                } else {
                    i2++;
                    i3 = this.r.indexOf(next);
                }
            }
            if (equals && i > 3) {
                this.r.remove(i4);
            } else if (i2 > 7) {
                this.r.remove(i3);
            } else if (this.r.size() <= 10) {
            } else {
                ArrayList<String> arrayList = this.r;
                arrayList.remove(arrayList.size() - 1);
            }
        }
    }

    @Override // tb.ffg
    public List<String> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("87269236", new Object[]{this});
        }
        if (this.r.size() < 20) {
            n();
            m();
        }
        return this.r;
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        List<StickerGroup> l = l();
        if (l == null || l.size() <= 0) {
            return;
        }
        a(l.get(0), 2);
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<AtmosphereResListResponseData.AtmosphereResItem> list = this.g;
        if (list != null && list.size() > 0) {
            for (AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem : this.g) {
                HashMap<String, StickerGroup> hashMap = this.c;
                StickerGroup stickerGroup = hashMap.get(atmosphereResItem.groupId + "_" + atmosphereResItem.version);
                if (stickerGroup != null && stickerGroup.stickers != null && !stickerGroup.stickers.isEmpty()) {
                    arrayList.add(stickerGroup);
                }
            }
        }
        if (arrayList.size() <= 0) {
            return;
        }
        a((StickerGroup) arrayList.get(0), 2);
    }

    private void a(StickerGroup stickerGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98bce36", new Object[]{this, stickerGroup, new Integer(i)});
        } else if (stickerGroup != null && stickerGroup.stickers != null && stickerGroup.stickers.size() > 0) {
            List<StickerConfig> list = stickerGroup.stickers;
            if (this.r.size() != 0) {
                i = 2;
            }
            for (int i2 = 0; i2 < list.size() && i2 < i; i2++) {
                StickerConfig stickerConfig = list.get(i2);
                if (stickerConfig != null && i2 < i) {
                    a(stickerConfig.matchKey, false);
                }
            }
        }
    }

    @Override // tb.ffg
    public void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e76f7b", new Object[]{this, aVar, str, str2, str3});
            return;
        }
        this.w = aVar;
        com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.business.a aVar2 = this.l;
        if (aVar2 != null) {
            aVar2.a();
        }
        for (a aVar3 : this.m) {
            aVar3.cancel(true);
        }
        for (com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.b bVar : this.n) {
            bVar.cancel(true);
        }
        for (Integer num : this.o) {
            pmd.a().o().a(num.intValue());
        }
        this.o.clear();
        this.m.clear();
        this.n.clear();
        this.g.clear();
        this.h.clear();
        this.d.clear();
        this.f.clear();
        this.p.clear();
        this.i.clear();
        if (tki.a()) {
            a(aVar);
        } else {
            a(str, str2, str3);
        }
    }

    private void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        this.l = new com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.business.a(this);
        if (this.f13919a && !TextUtils.isEmpty(str3)) {
            this.l.a(str, str2, str3);
        } else {
            this.l.a(str, str2);
        }
    }

    private void a(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1819755d", new Object[]{this, aVar});
        } else if (!(aVar instanceof h)) {
        } else {
            h hVar = (h) aVar;
            if (hVar.O() == null) {
                return;
            }
            hVar.O().a(this);
        }
    }

    @Override // com.taobao.taolive.sdk.mergeInfo.b.a
    public void onUnImportantLiveInfoSuccess(int i, NetResponse netResponse, UnImportantLiveInfoResponseData unImportantLiveInfoResponseData, Object obj) {
        AtmosphereResListResponseDataNew2 atmosphereResListResponseDataNew2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bacf307", new Object[]{this, new Integer(i), netResponse, unImportantLiveInfoResponseData, obj});
        } else if (unImportantLiveInfoResponseData == null || unImportantLiveInfoResponseData.atmosphereResourceData == null || (atmosphereResListResponseDataNew2 = (AtmosphereResListResponseDataNew2) tkg.a(unImportantLiveInfoResponseData.atmosphereResourceData, AtmosphereResListResponseDataNew2.class)) == null) {
        } else {
            a(atmosphereResListResponseDataNew2);
        }
    }

    @Override // com.taobao.taolive.sdk.mergeInfo.b.a
    public void onUnImportantLiveInfoError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d54c3ef", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            onError(i, netResponse, obj);
        }
    }

    @Override // com.taobao.taolive.sdk.mergeInfo.b.a
    public void onUnImportantLiveInfoSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b1993e", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            onError(i, netResponse, obj);
        }
    }

    @Override // tb.ffg
    public void a(com.taobao.alilive.aliliveframework.frame.a aVar, AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem, gwy gwyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68e4541f", new Object[]{this, aVar, atmosphereResItem, gwyVar});
        } else if (atmosphereResItem == null || v.f(atmosphereResItem.resUrl)) {
        } else {
            HashMap<String, List<EffectResConfig>> hashMap = this.j.get(atmosphereResItem.resUrl.hashCode());
            if (hashMap != null) {
                this.k.putAll(hashMap);
                if (gwyVar == null || a(atmosphereResItem.matchKey) == null) {
                    return;
                }
                gwyVar.onEffectResLoaded(c(atmosphereResItem.matchKey));
                return;
            }
            String b = l.b(l.a(this.b) + File.separator + atmosphereResItem.type + "_" + atmosphereResItem.resUrl.hashCode());
            if (new File(b).exists()) {
                atmosphereResItem.file = b;
                com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.b bVar = new com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.b(aVar, atmosphereResItem, this.j, this.k, gwyVar);
                this.n.add(bVar);
                bVar.execute(new Void[0]);
                return;
            }
            a(atmosphereResItem, gwyVar);
        }
    }

    private void a(AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f1866d", new Object[]{this, atmosphereResItem});
            return;
        }
        HashMap<String, List<EffectResConfig>> hashMap = this.j.get(atmosphereResItem.resUrl.hashCode());
        if (hashMap != null) {
            this.k.putAll(hashMap);
            return;
        }
        String b = l.b(l.a(this.b) + File.separator + atmosphereResItem.type + "_" + atmosphereResItem.resUrl.hashCode());
        if (new File(b).exists()) {
            atmosphereResItem.file = b;
            com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.b bVar = new com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.b(this.w, atmosphereResItem, this.j, this.k);
            this.n.add(bVar);
            bVar.execute(new Void[0]);
            return;
        }
        f(atmosphereResItem);
    }

    private void b(AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f82377cc", new Object[]{this, atmosphereResItem});
            return;
        }
        if ("official_sticker".equals(atmosphereResItem.type)) {
            atmosphereResItem.title = "全部表情";
        } else {
            atmosphereResItem.title = "主播专属表情";
        }
        c(atmosphereResItem);
    }

    private void c(AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd55692b", new Object[]{this, atmosphereResItem});
            return;
        }
        this.g.add(atmosphereResItem);
        HashMap<String, StickerGroup> hashMap = this.c;
        if (hashMap.containsKey(atmosphereResItem.groupId + "_" + atmosphereResItem.version)) {
            HashMap<String, StickerGroup> hashMap2 = this.c;
            StickerGroup stickerGroup = hashMap2.get(atmosphereResItem.groupId + "_" + atmosphereResItem.version);
            if (stickerGroup == null || stickerGroup.stickers == null) {
                return;
            }
            q.b("AtmosphereMultiCaseManager", "processSticker stickers size:" + stickerGroup.stickers.size());
            for (StickerConfig stickerConfig : stickerGroup.stickers) {
                if ("official_sticker".equals(atmosphereResItem.type)) {
                    this.d.put(stickerConfig.matchKey, stickerConfig);
                } else {
                    this.d.put(stickerConfig.matchKey, stickerConfig);
                    this.f.put(stickerConfig.id, stickerConfig);
                }
                if (!TextUtils.isEmpty(atmosphereResItem.stickerType)) {
                    if (TextUtils.equals(atmosphereResItem.stickerType, "icon")) {
                        stickerConfig.type = "0";
                    } else {
                        stickerConfig.type = "1";
                    }
                }
            }
            return;
        }
        String b = l.b(l.a(this.b) + File.separator + atmosphereResItem.groupId + "_" + atmosphereResItem.version);
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append(File.separator);
        sb.append("config.json");
        String b2 = l.b(sb.toString());
        if ((hgs.y() && new File(b).exists() && new File(b2).exists()) || (!hgs.y() && new File(b).exists())) {
            atmosphereResItem.file = b;
            a aVar = new a(atmosphereResItem, this.c, this.d, this.f, this.e);
            this.m.add(aVar);
            aVar.execute(new Void[0]);
            return;
        }
        f(atmosphereResItem);
    }

    private void b(List<AtmosphereResListResponseData.AtmosphereResItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else if (list != null) {
            for (AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem : list) {
                if ("anchor_fans_light".equals(atmosphereResItem.type)) {
                    if (atmosphereResItem.rule != null) {
                        this.p = atmosphereResItem.rule.fanLevels;
                    }
                    q.b("AtmosphereMultiCaseManager", "anchor_fans_light");
                } else if ("official_sticker".equals(atmosphereResItem.type)) {
                    b(atmosphereResItem);
                    q.b("AtmosphereMultiCaseManager", "processSticker");
                } else if ("recommend_atmosphere".equals(atmosphereResItem.type) || "hot_comment_atmosphere".equals(atmosphereResItem.type)) {
                    a(atmosphereResItem);
                    q.b("AtmosphereMultiCaseManager", "processEffectRes");
                } else if ("anchor_custom_sticker".equals(atmosphereResItem.type) || "official_strip_sticker".equals(atmosphereResItem.type)) {
                    d(atmosphereResItem);
                    q.b("AtmosphereMultiCaseManager", "processTextSticker");
                }
            }
        }
    }

    private void d(AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82875a8a", new Object[]{this, atmosphereResItem});
            return;
        }
        if ("official_strip_sticker".equals(atmosphereResItem.type)) {
            atmosphereResItem.title = "全部表情";
            this.h.add(atmosphereResItem);
        } else if ("anchor_custom_sticker".equals(atmosphereResItem.type)) {
            atmosphereResItem.title = "主播专属表情";
            this.h.add(0, atmosphereResItem);
        }
        HashMap<String, StickerGroup> hashMap = this.c;
        if (hashMap.containsKey(atmosphereResItem.groupId + "_" + atmosphereResItem.version)) {
            HashMap<String, StickerGroup> hashMap2 = this.c;
            StickerGroup stickerGroup = hashMap2.get(atmosphereResItem.groupId + "_" + atmosphereResItem.version);
            if (stickerGroup == null || stickerGroup.stickers == null) {
                return;
            }
            q.b("AtmosphereMultiCaseManager", "processTextSticker stickers size:" + stickerGroup.stickers.size());
            for (StickerConfig stickerConfig : stickerGroup.stickers) {
                if (stickerConfig != null) {
                    stickerConfig.type = "1";
                }
                if ("anchor_custom_sticker".equals(atmosphereResItem.type) || "official_strip_sticker".equals(atmosphereResItem.type)) {
                    this.d.put(stickerConfig.matchKey, stickerConfig);
                }
                if ("anchor_custom_sticker".equals(atmosphereResItem.type)) {
                    this.f.put(stickerConfig.id, stickerConfig);
                    this.e.put(stickerConfig.matchKey, stickerConfig);
                }
            }
            return;
        }
        q.b("AtmosphereMultiCaseManager", "processTextSticker to download and pass");
        String b = l.b(l.a(this.b) + File.separator + atmosphereResItem.groupId + "_" + atmosphereResItem.version);
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append(File.separator);
        sb.append("config.json");
        String b2 = l.b(sb.toString());
        if ((hgs.y() && new File(b).exists() && new File(b2).exists()) || (!hgs.y() && new File(b).exists())) {
            atmosphereResItem.file = b;
            a aVar = new a(atmosphereResItem, this.c, this.d, this.f, this.e);
            this.m.add(aVar);
            aVar.execute(new Void[0]);
            return;
        }
        f(atmosphereResItem);
    }

    private void e(AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47b94be9", new Object[]{this, atmosphereResItem});
            return;
        }
        this.h.add(atmosphereResItem);
        HashMap<String, StickerGroup> hashMap = this.c;
        if (hashMap.containsKey(atmosphereResItem.groupId + "_" + atmosphereResItem.version)) {
            HashMap<String, StickerGroup> hashMap2 = this.c;
            StickerGroup stickerGroup = hashMap2.get(atmosphereResItem.groupId + "_" + atmosphereResItem.version);
            if (stickerGroup == null || stickerGroup.stickers == null) {
                return;
            }
            q.b("AtmosphereMultiCaseManager", "processTextSticker stickers size:" + stickerGroup.stickers.size());
            for (StickerConfig stickerConfig : stickerGroup.stickers) {
                if (stickerConfig != null) {
                    stickerConfig.type = "1";
                }
                this.d.put(stickerConfig.matchKey, stickerConfig);
                if ("anchor_custom_sticker".equals(atmosphereResItem.type)) {
                    this.f.put(stickerConfig.id, stickerConfig);
                    this.e.put(stickerConfig.matchKey, stickerConfig);
                }
                if (!TextUtils.isEmpty(atmosphereResItem.stickerType)) {
                    if (TextUtils.equals(atmosphereResItem.stickerType, "icon")) {
                        stickerConfig.type = "0";
                    } else {
                        stickerConfig.type = "1";
                    }
                }
            }
            return;
        }
        q.b("AtmosphereMultiCaseManager", "processTextSticker to download and pass");
        String b = l.b(l.a(this.b) + File.separator + atmosphereResItem.groupId + "_" + atmosphereResItem.version);
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append(File.separator);
        sb.append("config.json");
        String b2 = l.b(sb.toString());
        if ((hgs.y() && new File(b).exists() && new File(b2).exists()) || (!hgs.y() && new File(b).exists())) {
            atmosphereResItem.file = b;
            a aVar = new a(atmosphereResItem, this.c, this.d, this.f, this.e);
            this.m.add(aVar);
            aVar.execute(new Void[0]);
            return;
        }
        f(atmosphereResItem);
    }

    private void f(AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceb3d48", new Object[]{this, atmosphereResItem});
        } else {
            a(atmosphereResItem, (gwy) null);
        }
    }

    private void a(final AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem, final gwy gwyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c3e49b4", new Object[]{this, atmosphereResItem, gwyVar});
            return;
        }
        String str = atmosphereResItem.resUrl;
        plx.b("AtmosphereMultiCaseManager", "getAtmosphereResContent:download url:" + str);
        HashMap hashMap = new HashMap();
        hashMap.put("bizId", "my3dZone");
        hashMap.put(MonitorMediaPlayer.ABTEST_USE_CACHE_ENABLE, true);
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) str);
        jSONArray.add(jSONObject);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("downloadList", jSONArray);
        hashMap2.put("downloadParam", hashMap);
        this.o.add(Integer.valueOf(pmd.a().o().a(hashMap2, new com.taobao.taolive.sdk.adapter.network.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.adapter.network.a
            public void a(String str2, int i, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ed88149b", new Object[]{this, str2, new Integer(i), str3});
                    return;
                }
                q.b("AtmosphereMultiCaseManager", "getAtmosphereResContent:download url error:" + str2 + ":" + i + ":" + str3);
            }

            @Override // com.taobao.taolive.sdk.adapter.network.a
            public void a(String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                    return;
                }
                q.b("AtmosphereMultiCaseManager", "getAtmosphereResContent:download url finish:" + str3);
                try {
                    if (!"official_sticker".equals(atmosphereResItem.type) && !"anchor_custom_sticker".equals(atmosphereResItem.type) && !"official_strip_sticker".equals(atmosphereResItem.type)) {
                        if (!"recommend_atmosphere".equals(atmosphereResItem.type) && !"hot_comment_atmosphere".equals(atmosphereResItem.type)) {
                            String b = l.b(l.a(g.a(g.this)) + File.separator + atmosphereResItem.groupId + "_" + atmosphereResItem.version);
                            l.a(str3, b);
                            StringBuilder sb = new StringBuilder();
                            sb.append(b);
                            sb.append(File.separator);
                            sb.append("config.json");
                            String b2 = l.b(sb.toString());
                            if ((!hgs.y() || !new File(b).exists() || !new File(b2).exists()) && (hgs.y() || !new File(b).exists())) {
                                return;
                            }
                            plx.b("AtmosphereMultiCaseManager", "getVideoMaterialContent:unzip file exist");
                            atmosphereResItem.file = b;
                            new a(atmosphereResItem, g.b(g.this), g.c(g.this), g.d(g.this), g.e(g.this)).execute(new Void[0]);
                            return;
                        }
                        String b3 = l.b(l.a(g.a(g.this)) + File.separator + atmosphereResItem.type + "_" + atmosphereResItem.resUrl.hashCode());
                        l.a(str3, b3);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(b3);
                        sb2.append(File.separator);
                        sb2.append("config.json");
                        String b4 = l.b(sb2.toString());
                        if ((!hgs.y() || !new File(b3).exists() || !new File(b4).exists()) && (hgs.y() || !new File(b3).exists())) {
                            return;
                        }
                        plx.b("AtmosphereMultiCaseManager", "getVideoMaterialContent:unzip file exist");
                        atmosphereResItem.file = b3;
                        new com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.b(g.f(g.this), atmosphereResItem, g.g(g.this), g.h(g.this), gwyVar).execute(new Void[0]);
                        return;
                    }
                    String b5 = l.b(l.a(g.a(g.this)) + File.separator + atmosphereResItem.groupId + "_" + atmosphereResItem.version);
                    l.a(str3, b5);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(b5);
                    sb3.append(File.separator);
                    sb3.append("config.json");
                    String b6 = l.b(sb3.toString());
                    if ((!hgs.y() || !new File(b5).exists() || !new File(b6).exists()) && (hgs.y() || !new File(b5).exists())) {
                        return;
                    }
                    plx.b("AtmosphereMultiCaseManager", "getVideoMaterialContent:unzip file exist");
                    atmosphereResItem.file = b5;
                    new a(atmosphereResItem, g.b(g.this), g.c(g.this), g.d(g.this), g.e(g.this)).execute(new Void[0]);
                } catch (Throwable th) {
                    th.printStackTrace();
                    plx.b("AtmosphereMultiCaseManager", "unzip exception:" + th.toString());
                }
            }
        })));
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (netBaseOutDo instanceof AtmosphereResListResponse) {
            AtmosphereResListResponseData atmosphereResListResponseData = (AtmosphereResListResponseData) netBaseOutDo.mo1437getData();
            if (atmosphereResListResponseData == null) {
                return;
            }
            b(atmosphereResListResponseData.result);
            if (this.s) {
                return;
            }
            o();
            this.s = true;
        } else if (!(netBaseOutDo instanceof AtmosphereResListResponseNew)) {
        } else {
            a((AtmosphereResListResponseDataNew2) netBaseOutDo.mo1437getData());
        }
    }

    private void a(AtmosphereResListResponseDataNew2 atmosphereResListResponseDataNew2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0eb2b3", new Object[]{this, atmosphereResListResponseDataNew2});
        } else if (atmosphereResListResponseDataNew2 == null) {
        } else {
            d(atmosphereResListResponseDataNew2.otherAtmosphere);
            c(atmosphereResListResponseDataNew2.tabInfoList);
            if (hkk.z()) {
                e(atmosphereResListResponseDataNew2.keywordAtmosphere);
            }
            if (this.s) {
                return;
            }
            o();
            this.s = true;
        }
    }

    private void e(List<KeywordAtmosphere> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f968ff5d", new Object[]{this, list});
            return;
        }
        this.z.clear();
        if (list == null || list.size() == 0) {
            return;
        }
        for (KeywordAtmosphere keywordAtmosphere : list) {
            if (keywordAtmosphere != null) {
                this.z.put(keywordAtmosphere.keyword, keywordAtmosphere.url);
            }
        }
    }

    @Override // tb.ffg
    public HashMap<String, String> p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("1764529a", new Object[]{this}) : this.z;
    }

    private void c(List<AtmosphereResListResponseDataNew.TabInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
            return;
        }
        for (AtmosphereResListResponseDataNew.TabInfo tabInfo : list) {
            ArrayList arrayList = new ArrayList();
            c(tabInfo.stickerList, arrayList);
            this.i.add(arrayList);
        }
        fht fhtVar = this.u;
        if (fhtVar != null) {
            fhtVar.a(list);
        }
        this.v = list;
    }

    @Override // tb.ffg
    public List<AtmosphereResListResponseDataNew.TabInfo> k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("6ec86895", new Object[]{this}) : this.v;
    }

    private void c(List<AtmosphereResListResponseData.AtmosphereResItem> list, List<AtmosphereResListResponseData.AtmosphereResItem> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2edf8b4c", new Object[]{this, list, list2});
            return;
        }
        for (AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem : list) {
            if (atmosphereResItem != null) {
                String str = atmosphereResItem.stickerType;
                if (TextUtils.equals(str, "icon")) {
                    c(atmosphereResItem);
                    list2.add(atmosphereResItem);
                } else if (TextUtils.equals(str, "strip")) {
                    e(atmosphereResItem);
                    list2.add(atmosphereResItem);
                }
            }
        }
    }

    private void d(List<AtmosphereResListResponseData.AtmosphereResItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecd009dc", new Object[]{this, list});
            return;
        }
        for (AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem : list) {
            if ("anchor_fans_light".equals(atmosphereResItem.type)) {
                if (atmosphereResItem.rule != null) {
                    this.p = atmosphereResItem.rule.fanLevels;
                }
                q.b("AtmosphereMultiCaseManager", "processOtherAtmosphereData anchor_fans_light");
            } else if ("recommend_atmosphere".equals(atmosphereResItem.type) || "hot_comment_atmosphere".equals(atmosphereResItem.type)) {
                a(atmosphereResItem);
                q.b("AtmosphereMultiCaseManager", "processOtherAtmosphereData processEffectRes");
            }
        }
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else {
            Coordinator.execute(this.x);
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            q.b("AtmosphereMultiCaseManager", "onError");
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        q.b("AtmosphereMultiCaseManager", "onError");
        onError(i, netResponse, obj);
    }

    @Override // tb.ffg
    public void a(fht fhtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e89285a6", new Object[]{this, fhtVar});
        } else {
            this.u = fhtVar;
        }
    }

    /* loaded from: classes6.dex */
    public static class a extends AsyncTask<Void, Void, List<StickerConfig>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private AtmosphereResListResponseData.AtmosphereResItem f13924a;
        private HashMap<String, StickerGroup> b;
        private HashMap<String, StickerConfig> c;
        private HashMap<String, StickerConfig> d;
        private HashMap<String, StickerConfig> e;

        static {
            kge.a(415806972);
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List<com.taobao.alilive.aliliveframework.context.atmo.bean.StickerConfig>, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ List<StickerConfig> doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(List<StickerConfig> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, list});
            } else {
                a(list);
            }
        }

        public a(AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem, HashMap<String, StickerGroup> hashMap, HashMap<String, StickerConfig> hashMap2, HashMap<String, StickerConfig> hashMap3, HashMap<String, StickerConfig> hashMap4) {
            this.f13924a = atmosphereResItem;
            this.b = hashMap;
            this.c = hashMap2;
            this.d = hashMap3;
            this.e = hashMap4;
        }

        /* JADX WARN: Removed duplicated region for block: B:52:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0113  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x013d A[Catch: Exception -> 0x0139, TRY_LEAVE, TryCatch #3 {Exception -> 0x0139, blocks: (B:60:0x0135, B:64:0x013d), top: B:70:0x0135 }] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0155  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.util.List<com.taobao.alilive.aliliveframework.context.atmo.bean.StickerConfig> a(java.lang.Void... r11) {
            /*
                Method dump skipped, instructions count: 347
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.input.g.a.a(java.lang.Void[]):java.util.List");
        }

        public void a(List<StickerConfig> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            } else if (this.b != null && this.f13924a != null) {
                StickerGroup stickerGroup = new StickerGroup();
                stickerGroup.title = this.f13924a.title;
                stickerGroup.type = this.f13924a.type;
                stickerGroup.stickerType = this.f13924a.stickerType;
                stickerGroup.rule = this.f13924a.rule;
                stickerGroup.stickers = list;
                q.b("AtmosphereMultiCaseManager", "ParseStickerTask group:" + stickerGroup.type);
                if (list != null) {
                    HashMap<String, StickerGroup> hashMap = this.b;
                    hashMap.put(this.f13924a.groupId + "_" + this.f13924a.version, stickerGroup);
                    q.b("AtmosphereMultiCaseManager", "onPostExecute type:" + stickerGroup.type + " size:" + list.size());
                    for (StickerConfig stickerConfig : list) {
                        if (TextUtils.equals("official_strip_sticker", stickerGroup.type) || TextUtils.equals("anchor_custom_sticker", stickerGroup.type)) {
                            stickerConfig.type = "1";
                        }
                        if (!TextUtils.isEmpty(stickerGroup.stickerType)) {
                            if (TextUtils.equals(stickerGroup.stickerType, "icon")) {
                                stickerConfig.type = "0";
                            } else {
                                stickerConfig.type = "1";
                            }
                        }
                        this.c.put(stickerConfig.matchKey, stickerConfig);
                        if (TextUtils.equals(stickerGroup.type, "anchor_custom_sticker")) {
                            this.d.put(stickerConfig.id, stickerConfig);
                            this.e.put(stickerConfig.matchKey, stickerConfig);
                        }
                    }
                    return;
                }
                q.b("AtmosphereMultiCaseManager", "onPostExecute type:" + stickerGroup.type + " size stickerConfigs is null");
            }
        }
    }
}
