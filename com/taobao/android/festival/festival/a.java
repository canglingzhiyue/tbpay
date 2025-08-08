package com.taobao.android.festival.festival;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.festival.GloblaNavUIConfig;
import com.taobao.android.festival.business.data.FestivalInfoData;
import com.taobao.android.festival.business.data.FestivalResponse;
import com.taobao.android.festival.business.data.FestivalResponseData;
import com.taobao.android.festival.business.data.FestivalValueData;
import com.taobao.android.festival.d;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.task.Coordinator;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.g;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.global.SDKUtils;
import tb.giy;
import tb.giz;
import tb.gjb;
import tb.ilw;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static long g;

    /* renamed from: a  reason: collision with root package name */
    public String f12349a;
    public long b;
    public long c;
    private Map<String, Map<String, FestivalValueData[]>> d;
    private Map<String, Map<String, FestivalValueData[]>> e;
    private List<Long> h;
    private List<Long> i;
    private final Map<Long, Set<String>> j;
    private final Map<Long, Set<String>> k;

    /* renamed from: com.taobao.android.festival.festival.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0484a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f12355a;

        static {
            kge.a(-969870907);
            f12355a = new a();
        }
    }

    static {
        kge.a(-309718496);
    }

    public static /* synthetic */ long a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{new Long(j)})).longValue();
        }
        g = j;
        return j;
    }

    public static /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a69489", new Object[]{aVar});
        } else {
            aVar.m();
        }
    }

    public static /* synthetic */ Map b(a aVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("be519e30", new Object[]{aVar, map});
        }
        aVar.d = map;
        return map;
    }

    public static /* synthetic */ boolean b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f47570e", new Object[]{aVar})).booleanValue() : aVar.h();
    }

    public static /* synthetic */ FestivalInfoData c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FestivalInfoData) ipChange.ipc$dispatch("1fd1d030", new Object[]{aVar}) : aVar.o();
    }

    public static /* synthetic */ Map c(a aVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d8c2974f", new Object[]{aVar, map});
        }
        aVar.e = map;
        return map;
    }

    public static /* synthetic */ void d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d488dc0c", new Object[]{aVar});
        } else {
            aVar.j();
        }
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("3e04f70f", new Object[0]) : C0484a.f12355a;
    }

    private a() {
        this.f12349a = "";
        this.b = Long.MAX_VALUE;
        this.c = -1L;
        this.j = new ConcurrentHashMap();
        this.k = new ConcurrentHashMap();
        OrangeConfig.getInstance().registerListener(new String[]{"festival_data"}, new g() { // from class: com.taobao.android.festival.festival.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.g
            public void onConfigUpdate(String str, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                } else if (z) {
                } else {
                    a.a().a(false);
                }
            }
        });
        LocalBroadcastManager.getInstance(Globals.getApplication()).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.android.festival.festival.FestivalConfigLoader$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                try {
                    GloblaNavUIConfig.a();
                } catch (Throwable unused) {
                }
            }
        }, new IntentFilter(FestivalMgr.ACTION_FESTIVAL_CHANGE));
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            Coordinator.postTaskToHandler(new Runnable() { // from class: com.taobao.android.festival.festival.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        byte[] d = gjb.d("festival_config");
                        if (d != null && d.length > 0) {
                            Map<String, Map<String, FestivalValueData[]>> map = (Map) JSON.parseObject(new String(d, Charset.forName("UTF-8")), new TypeReference<Map<String, Map<String, FestivalValueData[]>>>() { // from class: com.taobao.android.festival.festival.a.3.1
                            }, Feature.AllowComment);
                            String g2 = gjb.g("festival_config_version");
                            if (map != null && !StringUtils.isEmpty(g2)) {
                                if (a.this.b(map)) {
                                    gjb.f("festival_config");
                                    gjb.a("festival_config_version", "");
                                    return;
                                }
                                a.this.f12349a = g2;
                                a.b(a.this, map);
                                if (!a.this.e()) {
                                    return;
                                }
                                a.a(a.this);
                                a.this.f();
                            }
                        }
                    } catch (Exception e) {
                        TLog.loge("festival.Loader", "load config error" + e.getMessage());
                    }
                }
            });
        }
    }

    public void a(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            Coordinator.postTaskToHandler(new Runnable() { // from class: com.taobao.android.festival.festival.a.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (z && !a.b(a.this)) {
                    } else {
                        a.a(SDKUtils.getCorrectionTime());
                        try {
                            FestivalInfoData c = a.c(a.this);
                            if (c == null || a.this.b(c.content) || StringUtils.equals(c.version, a.this.f12349a)) {
                                return;
                            }
                            a.this.f12349a = c.version;
                            a.b(a.this, c.content);
                            if (a.this.e()) {
                                a.d(a.this);
                            }
                            a.this.f();
                            a.a(a.this);
                            gjb.a("festival_config", JSONObject.toJSONBytes(c.content, new SerializerFeature[0]));
                            gjb.a("festival_config_version", a.this.f12349a);
                        } catch (Throwable unused) {
                        }
                    }
                }
            });
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            Coordinator.postTaskToHandler(new Runnable() { // from class: com.taobao.android.festival.festival.FestivalConfigLoader$5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    final int i = -1;
                    FestivalResponse a2 = giz.a(Globals.getApplication(), "0");
                    Handler handler = new Handler(Looper.getMainLooper());
                    handler.post(new Runnable() { // from class: com.taobao.android.festival.festival.FestivalConfigLoader$5.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                Log.e("festival.Loader", "开始尝试加载预览氛围...");
                            }
                        }
                    });
                    while (i < 10) {
                        i++;
                        if (a2 != null && a2.mo2429getData() != null && (a2.mo2429getData() == null || (a2.mo2429getData().data != null && a2.mo2429getData().data.size() != 0))) {
                            if (a2.mo2429getData() != null && a2.mo2429getData().data != null && a2.mo2429getData().data.size() > 0) {
                                break;
                            }
                        } else {
                            try {
                                handler.post(new Runnable() { // from class: com.taobao.android.festival.festival.FestivalConfigLoader$5.2
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            return;
                                        }
                                        Log.e("festival.Loader", "正在获取预览氛围，请等待 " + i);
                                    }
                                });
                                Thread.sleep(3000L);
                            } catch (Exception unused) {
                            }
                            a2 = giz.a(Globals.getApplication(), "0");
                        }
                    }
                    if (a2 != null && a2.mo2429getData() != null && (a2.mo2429getData().data == null || a2.mo2429getData().data.size() == 0)) {
                        handler.post(new Runnable() { // from class: com.taobao.android.festival.festival.FestivalConfigLoader$5.3
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    Log.e("festival.Loader", "未能获取预览氛围，可能是服务端预览白名单响应超时。请重新扫码。");
                                }
                            }
                        });
                    }
                    if (a2 == null || a2.mo2429getData() == null) {
                        return;
                    }
                    String str = a2.mo2429getData().modified;
                    if (StringUtils.isEmpty(str) || !str.equals("y")) {
                        return;
                    }
                    FestivalResponseData mo2429getData = a2.mo2429getData();
                    a.b(a.this, mo2429getData.data);
                    a.this.f12349a = mo2429getData.version != null ? mo2429getData.version : "";
                    a aVar = a.this;
                    Map<String, Map<String, FestivalValueData[]>> map = mo2429getData.data;
                    if (!a.$ipChange) {
                        return;
                    }
                    a.c(a.this, mo2429getData.data);
                    a.a(SDKUtils.getCorrectionTime());
                    a aVar2 = a.this;
                    if (a.$ipChange != null) {
                        a aVar3 = a.this;
                        if (!a.$ipChange.isEmpty()) {
                            a.d(a.this);
                        }
                    }
                    try {
                        a.this.f();
                        a.a(a.this);
                        gjb.a("festival_config", JSONObject.toJSONBytes(mo2429getData, new SerializerFeature[0]));
                        gjb.a("festival_config_version", a.this.f12349a);
                        handler.post(new Runnable() { // from class: com.taobao.android.festival.festival.FestivalConfigLoader$5.4
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                Log.e("festival.Loader", "氛围 version = " + a.this.f12349a);
                            }
                        });
                    } catch (Exception unused2) {
                        Log.e("festival.Loader", "parse config  error");
                    }
                }
            });
        }
    }

    private boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        long a2 = d.a();
        return a2 <= 0 || g + a2 < SDKUtils.getCorrectionTime();
    }

    private FestivalInfoData o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FestivalInfoData) ipChange.ipc$dispatch("a3870565", new Object[]{this});
        }
        if ("true".equals(d.c(d.SP_KEY_ENABLE_MTOP))) {
            FestivalInfoData a2 = giz.a();
            if (a2 == null || a2.content == null || StringUtils.isEmpty(a2.version)) {
                return null;
            }
            if (a2.enable) {
                return a2;
            }
        }
        OrangeConfig orangeConfig = OrangeConfig.getInstance();
        FestivalInfoData festivalInfoData = new FestivalInfoData();
        String config = orangeConfig.getConfig("festival_data", "content", "");
        String config2 = orangeConfig.getConfig("festival_data", "version", "");
        if (StringUtils.isEmpty(config) || StringUtils.isEmpty(config2)) {
            return null;
        }
        festivalInfoData.content = (Map) JSON.parseObject(config, new TypeReference<Map<String, Map<String, FestivalValueData[]>>>() { // from class: com.taobao.android.festival.festival.a.2
        }, new Feature[0]);
        festivalInfoData.version = config2;
        return festivalInfoData;
    }

    public boolean b(Map<String, Map<String, FestivalValueData[]>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41e3e880", new Object[]{this, map})).booleanValue();
        }
        if (map == null || map.isEmpty()) {
            return true;
        }
        long j = -1;
        for (String str : new HashSet(map.keySet())) {
            Map<String, FestivalValueData[]> map2 = map.get(str);
            if (map2 != null) {
                for (FestivalValueData[] festivalValueDataArr : map2.values()) {
                    if (festivalValueDataArr != null) {
                        long j2 = j;
                        for (FestivalValueData festivalValueData : festivalValueDataArr) {
                            if (festivalValueData.gmt_end > j2) {
                                j2 = festivalValueData.gmt_end;
                            }
                        }
                        j = j2;
                    }
                }
            }
        }
        return j != -1 && j < SDKUtils.getCorrectionTimeMillis();
    }

    public synchronized boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        } else if (this.e == null) {
            return false;
        } else {
            for (String str : new HashSet(this.e.keySet())) {
                if (c(str)) {
                    return true;
                }
            }
            return false;
        }
    }

    public synchronized String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        } else if (this.e == null) {
            return null;
        } else {
            Map<String, FestivalValueData[]> map = this.e.get(str);
            if (map != null && !map.isEmpty()) {
                FestivalValueData[] festivalValueDataArr = map.get(str2);
                if (festivalValueDataArr != null && festivalValueDataArr.length != 0) {
                    for (FestivalValueData festivalValueData : festivalValueDataArr) {
                        if (a(festivalValueData)) {
                            return festivalValueData.content;
                        }
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
    }

    public synchronized Map<String, String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d2e5f268", new Object[]{this, str});
        } else if (this.e == null) {
            return null;
        } else {
            Map<String, FestivalValueData[]> map = this.e.get(str);
            if (map != null && !map.isEmpty()) {
                HashMap hashMap = new HashMap();
                for (String str2 : map.keySet()) {
                    FestivalValueData[] festivalValueDataArr = map.get(str2);
                    if (festivalValueDataArr != null && festivalValueDataArr.length != 0) {
                        int length = festivalValueDataArr.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                FestivalValueData festivalValueData = festivalValueDataArr[i];
                                if (a(festivalValueData)) {
                                    hashMap.put(str2, festivalValueData.content);
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                }
                return hashMap;
            }
            return null;
        }
    }

    public synchronized boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        } else if (this.e == null) {
            return false;
        } else {
            Map<String, FestivalValueData[]> map = this.e.get(str);
            if (map != null && !map.isEmpty()) {
                for (FestivalValueData[] festivalValueDataArr : map.values()) {
                    if (festivalValueDataArr != null && festivalValueDataArr.length != 0) {
                        for (FestivalValueData festivalValueData : festivalValueDataArr) {
                            if (a(festivalValueData)) {
                                return true;
                            }
                        }
                        continue;
                    }
                }
                return false;
            }
            return false;
        }
    }

    private boolean a(FestivalValueData festivalValueData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e9b7ef4", new Object[]{this, festivalValueData})).booleanValue();
        }
        if (festivalValueData != null && festivalValueData.gmt_start != -1 && festivalValueData.gmt_end != -1) {
            long correctionTimeMillis = SDKUtils.getCorrectionTimeMillis();
            if (correctionTimeMillis >= festivalValueData.gmt_start && correctionTimeMillis < festivalValueData.gmt_end) {
                return true;
            }
        }
        return false;
    }

    public synchronized boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        } else if (!a(this.d)) {
            return false;
        } else {
            this.e = this.d;
            return true;
        }
    }

    private static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : !TBRevisionSwitchManager.i().e() && TBRevisionSwitchManager.i().a(ilw.KEY_NEW_CONTENT_ENABLE);
    }

    private boolean a(Map<String, Map<String, FestivalValueData[]>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        boolean c = com.taobao.android.tbelder.b.c();
        Map<String, FestivalValueData[]> map2 = map.get("global");
        if (map2 == null) {
            return true;
        }
        FestivalValueData[] festivalValueDataArr = map2.get("ignoreElder");
        if (festivalValueDataArr != null) {
            for (FestivalValueData festivalValueData : festivalValueDataArr) {
                if (Boolean.parseBoolean(festivalValueData.content) && c) {
                    return false;
                }
            }
        }
        boolean i = i();
        FestivalValueData[] festivalValueDataArr2 = map2.get("ignoreForeign");
        if (festivalValueDataArr2 != null) {
            for (FestivalValueData festivalValueData2 : festivalValueDataArr2) {
                if (Boolean.parseBoolean(festivalValueData2.content) && !i) {
                    return false;
                }
            }
        }
        return true;
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        try {
            if (this.e != null && !this.e.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Map<String, FestivalValueData[]> map : this.e.values()) {
                    if (map != null && !map.isEmpty()) {
                        for (FestivalValueData[] festivalValueDataArr : map.values()) {
                            if (festivalValueDataArr != null && festivalValueDataArr.length != 0) {
                                for (FestivalValueData festivalValueData : festivalValueDataArr) {
                                    if (festivalValueData != null && !StringUtils.isEmpty(festivalValueData.content) && a(festivalValueData.content)) {
                                        arrayList.add(festivalValueData.content);
                                    }
                                }
                            }
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                com.taobao.phenix.intf.b.h().a("common", arrayList).a();
            }
        } catch (Throwable th) {
            TLog.loge("festival.Loader", "load image error" + th.getMessage());
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        return str.endsWith(".png") || str.endsWith(".gif") || str.endsWith(".jpg");
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            giy.a(Globals.getApplication(), FestivalMgr.FESTIVAL_CHANGE_REASON_CONFIG_CHANGE);
        }
    }

    public synchronized void l() {
        long j;
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        while (true) {
            if (this.h.isEmpty()) {
                j = 0;
                break;
            }
            j = this.h.get(0).longValue();
            if (j - SDKUtils.getCorrectionTimeMillis() > 0) {
                break;
            }
            this.h.remove(0);
        }
        while (true) {
            if (this.i.isEmpty()) {
                j2 = 0;
                break;
            }
            j2 = this.i.get(0).longValue();
            if (j2 - SDKUtils.getCorrectionTimeMillis() > 0 || this.i.size() == 1) {
                break;
            }
            this.i.remove(0);
        }
        if (j > 0 && j < j2) {
            this.h.remove(0);
            giy.a(j - SDKUtils.getCorrectionTimeMillis());
            return;
        }
        if (j2 > 0) {
            this.i.remove(0);
            giy.a(j2 - SDKUtils.getCorrectionTimeMillis());
        }
    }

    private synchronized void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (this.e != null) {
            this.j.clear();
            this.k.clear();
            for (String str : this.e.keySet()) {
                Map<String, FestivalValueData[]> map = this.e.get(str);
                if (map != null && !map.isEmpty()) {
                    for (FestivalValueData[] festivalValueDataArr : map.values()) {
                        if (festivalValueDataArr != null && festivalValueDataArr.length != 0) {
                            for (FestivalValueData festivalValueData : festivalValueDataArr) {
                                if (festivalValueData.gmt_end < festivalValueData.gmt_start) {
                                    return;
                                }
                                long correctionTimeMillis = SDKUtils.getCorrectionTimeMillis();
                                long j = festivalValueData.gmt_start - correctionTimeMillis;
                                if (festivalValueData.gmt_start != -1 && j > 0) {
                                    Set<String> set = this.j.get(Long.valueOf(festivalValueData.gmt_start));
                                    if (set == null) {
                                        set = new HashSet<>();
                                        this.j.put(Long.valueOf(festivalValueData.gmt_start), set);
                                    }
                                    if (set.size() < 100) {
                                        set.add(str);
                                    }
                                }
                                long j2 = festivalValueData.gmt_end - correctionTimeMillis;
                                if (festivalValueData.gmt_end != -1 && j2 > 0) {
                                    Set<String> set2 = this.k.get(Long.valueOf(festivalValueData.gmt_end));
                                    if (set2 == null) {
                                        set2 = new HashSet<>();
                                        this.k.put(Long.valueOf(festivalValueData.gmt_end), set2);
                                    }
                                    if (set2.size() < 100) {
                                        set2.add(str);
                                    }
                                }
                                if (this.c < festivalValueData.gmt_end) {
                                    this.c = festivalValueData.gmt_end;
                                }
                                if (this.b > festivalValueData.gmt_start) {
                                    this.b = festivalValueData.gmt_start;
                                }
                            }
                            continue;
                        }
                    }
                    continue;
                }
            }
            this.h = new ArrayList(this.j.keySet());
            this.i = new ArrayList(this.k.keySet());
            Collections.sort(this.h);
            Collections.sort(this.i);
            l();
        }
    }
}
