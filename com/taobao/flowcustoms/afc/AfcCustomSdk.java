package com.taobao.flowcustoms.afc;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.model.SmallHandleData;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.taobao.flowcustoms.afc.utils.c;
import com.taobao.flowcustoms.afc.utils.d;
import com.taobao.flowcustoms.afc.utils.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.intf.Mtop;
import org.json.JSONObject;
import tb.kge;
import tb.knr;
import tb.knv;
import tb.knx;
import tb.kny;
import tb.koe;
import tb.kog;
import tb.koh;
import tb.koi;
import tb.koj;
import tb.kok;
import tb.kol;

/* loaded from: classes.dex */
public class AfcCustomSdk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_TAG = "linkx";
    public static final String LOG_TAG_UT = "afcPoint";
    public static final String LOG_TIME = "link_time";
    public static final String SDK_VERSION = "5.0";
    public static boolean e;
    public static boolean i;
    public static AtomicBoolean j;

    /* renamed from: a  reason: collision with root package name */
    public Application f17167a;
    public String b;
    public String c;
    public Environment d;
    public String f;
    public String g;
    public com.taobao.flowcustoms.afc.a h;

    /* renamed from: com.taobao.flowcustoms.afc.AfcCustomSdk$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public class AnonymousClass1 implements kny {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f17168a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;

        public AnonymousClass1(long j, boolean z, boolean z2) {
            this.f17168a = j;
            this.b = z;
            this.c = z2;
        }

        @Override // tb.kny
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            c.a("linkx", "AfcCustomSdk === handleUrl === 分流前插件执行完毕" + str);
            HashMap hashMap = new HashMap();
            hashMap.put(koh.LINK_MANAGER_SDK_VERSION, AfcCustomSdk.SDK_VERSION);
            hashMap.put("userId", TextUtils.isEmpty(AfcCustomSdk.this.h.B) ? "unknown" : AfcCustomSdk.this.h.B);
            com.taobao.flowcustoms.afc.utils.b.a(com.taobao.flowcustoms.afc.utils.b.AFC_FLOW_ROUTER_BEFORE, "", "", hashMap);
            long a2 = AfcUtils.a();
            c.b(AfcCustomSdk.LOG_TIME, "海关分流前节点耗时：" + (a2 - this.f17168a) + "");
            StringBuilder sb = new StringBuilder();
            sb.append(a2 - this.f17168a);
            sb.append("");
            com.taobao.flowcustoms.afc.utils.b.a(com.taobao.flowcustoms.afc.utils.b.AFC_BEFORE_LINK_ROUTER_TIME, sb.toString(), "", null);
            final long a3 = AfcUtils.a();
            AfcCustomSdk afcCustomSdk = AfcCustomSdk.this;
            AfcCustomSdk.a(afcCustomSdk, afcCustomSdk.h, new knr() { // from class: com.taobao.flowcustoms.afc.AfcCustomSdk.1.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.knr
                public void a(boolean z, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c190d17", new Object[]{this, new Boolean(z), new Integer(i)});
                        return;
                    }
                    long a4 = AfcUtils.a();
                    c.b(AfcCustomSdk.LOG_TIME, "海关分流节点耗时：" + (a4 - a3) + "");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(a4 - a3);
                    sb2.append("");
                    com.taobao.flowcustoms.afc.utils.b.a(com.taobao.flowcustoms.afc.utils.b.AFC_LINK_ROUTER_TIME, sb2.toString(), "", null);
                    String str2 = AfcCustomSdk.this.h.E;
                    c.b("linkx", "AfcCustomSdk === handleUrl === 分流逻辑返回的URL：" + str2);
                    if (TextUtils.isEmpty(str2)) {
                        str2 = AfcCustomSdk.this.h.g;
                    }
                    final HashMap hashMap2 = new HashMap();
                    hashMap2.put("isRequestSuccess", Boolean.valueOf(z));
                    hashMap2.put("cold_startup_h5", Boolean.valueOf(AnonymousClass1.this.b));
                    hashMap2.put("hot_startup_h5", Boolean.valueOf(AnonymousClass1.this.c));
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put(koh.LINK_MANAGER_SDK_VERSION, AfcCustomSdk.SDK_VERSION);
                    hashMap3.put("userId", TextUtils.isEmpty(AfcCustomSdk.this.h.B) ? "unknown" : AfcCustomSdk.this.h.B);
                    hashMap3.put("url", str2);
                    String string = AfcCustomSdk.this.h.J.getString("asyncReqBucketId");
                    if (TextUtils.isEmpty(string)) {
                        string = "";
                    }
                    hashMap3.put("asyncReqBucketId", string);
                    hashMap3.put("routerStrategy", kol.a().a(i));
                    com.taobao.flowcustoms.afc.utils.b.a(com.taobao.flowcustoms.afc.utils.b.AFC_FLOW_ROUTER_AFTER, "", "", hashMap3);
                    ArrayList arrayList = new ArrayList(Arrays.asList(new koj[kok.a().b.size()]));
                    Collections.copy(arrayList, kok.a().b);
                    final long a5 = AfcUtils.a();
                    AfcCustomSdk.a(AfcCustomSdk.this, AfcCustomSdk.this.h, arrayList, str2, new kny() { // from class: com.taobao.flowcustoms.afc.AfcCustomSdk.1.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.kny
                        public void a(String str3) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("f3a64c32", new Object[]{this, str3});
                                return;
                            }
                            long a6 = AfcUtils.a();
                            c.b(AfcCustomSdk.LOG_TIME, "海关分流后节点耗时：" + (a6 - a5) + "");
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(a6 - a5);
                            sb3.append("");
                            com.taobao.flowcustoms.afc.utils.b.a(com.taobao.flowcustoms.afc.utils.b.AFC_AFTER_LINK_ROUTER_TIME, sb3.toString(), "", null);
                            c.b("linkx", "AfcCustomSdk === handleUrl === 分流后插件执行完毕" + str3);
                            kog.a().a(AfcCustomSdk.this.h, com.taobao.flowcustoms.afc.utils.b.AFC_LINK_END, new HashMap<>());
                            if (TextUtils.isEmpty(AfcCustomSdk.this.h.F)) {
                                kol.a().b(AfcCustomSdk.this.h);
                            }
                            AfcCustomSdk.a(AfcCustomSdk.this, AfcCustomSdk.this.h, str3, hashMap2);
                        }
                    });
                }
            });
        }
    }

    /* loaded from: classes7.dex */
    public enum Environment {
        ONLINE,
        PRE
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static AfcCustomSdk f17178a;

        static {
            kge.a(-1333172099);
            f17178a = new AfcCustomSdk(null);
        }

        public static /* synthetic */ AfcCustomSdk a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AfcCustomSdk) ipChange.ipc$dispatch("3d80582f", new Object[0]) : f17178a;
        }
    }

    public /* synthetic */ AfcCustomSdk(AnonymousClass1 anonymousClass1) {
        this();
    }

    public static /* synthetic */ void a(AfcCustomSdk afcCustomSdk, com.taobao.flowcustoms.afc.a aVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd45b99f", new Object[]{afcCustomSdk, aVar, str, map});
        } else {
            afcCustomSdk.a(aVar, str, map);
        }
    }

    public static /* synthetic */ void a(AfcCustomSdk afcCustomSdk, com.taobao.flowcustoms.afc.a aVar, List list, String str, kny knyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f49c9411", new Object[]{afcCustomSdk, aVar, list, str, knyVar});
        } else {
            afcCustomSdk.a(aVar, list, str, knyVar);
        }
    }

    public static /* synthetic */ void a(AfcCustomSdk afcCustomSdk, com.taobao.flowcustoms.afc.a aVar, knr knrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5642eafd", new Object[]{afcCustomSdk, aVar, knrVar});
        } else {
            afcCustomSdk.a(aVar, knrVar);
        }
    }

    public static /* synthetic */ void a(AfcCustomSdk afcCustomSdk, String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21788022", new Object[]{afcCustomSdk, str, str2, map});
        } else {
            afcCustomSdk.a(str, str2, map);
        }
    }

    static {
        kge.a(-433433686);
        e = false;
        i = false;
        j = new AtomicBoolean(false);
    }

    public static AfcCustomSdk a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AfcCustomSdk) ipChange.ipc$dispatch("3d80582f", new Object[0]) : a.a();
    }

    private AfcCustomSdk() {
        this.d = Environment.ONLINE;
        this.g = "";
        this.h = new com.taobao.flowcustoms.afc.a();
    }

    public void a(Environment environment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdbd1740", new Object[]{this, environment});
        } else {
            this.d = environment;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            c.a(true);
        }
    }

    public void a(Application application, String str, String str2, Environment environment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfbfae7d", new Object[]{this, application, str, str2, environment});
        } else if (e) {
        } else {
            e = true;
            if (application == null) {
                c.a("linkx", "AfcCustomSdk === init === 初始化失败，application为空");
                return;
            }
            this.f17167a = application;
            this.b = str;
            this.c = str2;
            f.a(application);
            a(Mtop.Id.INNER);
            a(environment);
            koi.a().a(application);
            b.a();
            kog.a().a(null, com.taobao.flowcustoms.afc.utils.b.AFC_SDK_INIT, new HashMap<>());
            koh.a(application, str, SDK_VERSION);
            com.taobao.flowcustoms.afc.utils.a.a(application);
        }
    }

    public void a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9cc1d", new Object[]{this, context, intent});
            return;
        }
        long a2 = AfcUtils.a();
        if (AfcUtils.c(context)) {
            AfcUtils.d(context);
        }
        boolean a3 = com.taobao.flowcustoms.afc.a.a(intent);
        boolean b = com.taobao.flowcustoms.afc.a.b(intent);
        this.h = new com.taobao.flowcustoms.afc.a(intent, context);
        c.a("linkx", "AFCRouter === router：执行外链唤端逻辑");
        try {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put(com.taobao.flowcustoms.afc.utils.b.AFC_ID, this.g);
            hashMap.put("url", intent.getData() == null ? "" : intent.getData().toString());
            hashMap.put("sourceApplication", AfcUtils.a(koi.a().b()));
            kog.a().a(this.h, com.taobao.flowcustoms.afc.utils.b.AFC_LINK_START, hashMap);
        } catch (Exception e2) {
            c.b("linkx", "AfcCustomSdk === handleUrl === afc_link_start埋点异常：" + e2);
        }
        koh.a(koh.a(intent), this.h);
        ArrayList arrayList = new ArrayList(Arrays.asList(new koj[kok.a().f30192a.size()]));
        Collections.copy(arrayList, kok.a().f30192a);
        com.taobao.flowcustoms.afc.a aVar = this.h;
        a(aVar, arrayList, aVar.g, new AnonymousClass1(a2, a3, b));
    }

    private void a(final com.taobao.flowcustoms.afc.a aVar, final knr knrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e13e936", new Object[]{this, aVar, knrVar});
            return;
        }
        int a2 = kol.a().a(aVar);
        try {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put(com.taobao.flowcustoms.afc.utils.b.AFC_ID, this.g);
            hashMap.put("url", this.h.g);
            hashMap.put("isNativeRouter", String.valueOf(a2 == 0));
            hashMap.put("routerStrategy", kol.a().a(a2));
            kog.a().a(aVar, com.taobao.flowcustoms.afc.utils.b.AFC_LINK_ROUTER, hashMap);
        } catch (Exception e2) {
            c.b("linkx", "AfcCustomSdk === routerUrl === afc_link_router埋点异常：" + e2);
        }
        aVar.J.put("routerStrategy", (Object) kol.a().a(a2));
        String str = "unknown";
        if (a2 == 0) {
            c.a("linkx", "AfcCustomSdk === routerUrl === 走客户端分流");
            HashMap hashMap2 = new HashMap();
            hashMap2.put(koh.LINK_MANAGER_SDK_VERSION, SDK_VERSION);
            hashMap2.put("url", this.h.g);
            if (!TextUtils.isEmpty(this.h.B)) {
                str = this.h.B;
            }
            hashMap2.put("userId", str);
            com.taobao.flowcustoms.afc.utils.b.a(com.taobao.flowcustoms.afc.utils.b.AFC_FLOW_LOCAL_ROUTER, "", "", hashMap2);
            try {
                Uri parse = Uri.parse(this.h.g);
                if (parse != null && TextUtils.isEmpty(parse.getQueryParameter("isNeedHome"))) {
                    Uri.Builder buildUpon = parse.buildUpon();
                    buildUpon.appendQueryParameter("isNeedHome", "0");
                    this.h.E = buildUpon.build().toString();
                }
            } catch (Exception e3) {
                c.b("linkx", "AfcCustomSdk === routerUrl === " + e3);
            }
            c();
            knrVar.a(true, 0);
            try {
                d();
            } catch (Exception e4) {
                c.a("linkx", "AfcCustomSdk === routerUrl === 客户端分流逻辑异常：" + e4.getMessage());
                com.taobao.flowcustoms.afc.utils.b.a(com.taobao.flowcustoms.afc.utils.b.AFC_LINK_CRASH_MESSAGE, com.taobao.flowcustoms.afc.utils.b.AFC_LINK_CRASH_ROUTER_URL, e4.getMessage(), null);
            }
        } else if (a2 == 1) {
            c.a("linkx", "AfcCustomSdk === routerUrl === 走本地分流");
            HashMap hashMap3 = new HashMap();
            hashMap3.put(koh.LINK_MANAGER_SDK_VERSION, SDK_VERSION);
            if (!TextUtils.isEmpty(this.h.B)) {
                str = this.h.B;
            }
            hashMap3.put("userId", str);
            String string = aVar.J.getString("asyncReqBucketId");
            if (TextUtils.isEmpty(string)) {
                string = "";
            }
            hashMap3.put("asyncReqBucketId", string);
            hashMap3.put("routerStrategy", "asyncRemote");
            com.taobao.flowcustoms.afc.utils.b.a(com.taobao.flowcustoms.afc.utils.b.AFC_FLOW_REMOTE_ROUTER, "", "", hashMap3);
            kog.a().b("");
            kol.a().a(aVar, a2, new knv() { // from class: com.taobao.flowcustoms.afc.AfcCustomSdk.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.knv
                public void a(boolean z, int i2, String str2, String str3, Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dd770d7a", new Object[]{this, new Boolean(z), new Integer(i2), str2, str3, map});
                        return;
                    }
                    c.a("linkx", "AfcCustomSdk === onMTOPDataBack === 走本地分流");
                    Object obj = map.get("afcBackUrl");
                    if (obj instanceof String) {
                        String str4 = (String) obj;
                        if (!TextUtils.isEmpty(str4)) {
                            aVar.F = str4;
                            kog.a().b(str4);
                        }
                    }
                    AfcCustomSdk.a(AfcCustomSdk.this, str2, str3, map);
                }
            });
            knrVar.a(true, 1);
        } else {
            c.a("linkx", "AfcCustomSdk === routerUrl === 走服务端分流");
            HashMap hashMap4 = new HashMap();
            hashMap4.put(koh.LINK_MANAGER_SDK_VERSION, SDK_VERSION);
            if (!TextUtils.isEmpty(this.h.B)) {
                str = this.h.B;
            }
            hashMap4.put("userId", str);
            String string2 = aVar.J.getString("asyncReqBucketId");
            if (TextUtils.isEmpty(string2)) {
                string2 = "";
            }
            hashMap4.put("asyncReqBucketId", string2);
            hashMap4.put("routerStrategy", "syncRemote");
            com.taobao.flowcustoms.afc.utils.b.a(com.taobao.flowcustoms.afc.utils.b.AFC_FLOW_REMOTE_ROUTER, "", "", hashMap4);
            if (Boolean.parseBoolean(kog.a().a("useDefaultLinkBack", "true"))) {
                kog.a().b("");
            }
            kol.a().a(aVar, a2, new knv() { // from class: com.taobao.flowcustoms.afc.AfcCustomSdk.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.knv
                public void a(boolean z, int i2, String str2, String str3, Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dd770d7a", new Object[]{this, new Boolean(z), new Integer(i2), str2, str3, map});
                        return;
                    }
                    Object obj = map.get("afcBackUrl");
                    if (obj instanceof String) {
                        aVar.F = (String) obj;
                    }
                    Object obj2 = map.get("jumpUrl");
                    if (obj2 instanceof String) {
                        String str4 = (String) obj2;
                        if (!TextUtils.isEmpty(str4)) {
                            aVar.E = str4;
                        }
                    }
                    knr knrVar2 = knrVar;
                    if (knrVar2 != null) {
                        knrVar2.a(z, 2);
                    }
                    AfcCustomSdk.a(AfcCustomSdk.this, str2, str3, map);
                }
            });
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!kol.a().e(this.h)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("afcId", this.g);
            hashMap.put("openAppUrl", this.h.o);
            com.taobao.flowcustoms.afc.request.mtop.b.a().a(com.taobao.flowcustoms.afc.request.mtop.b.LOCAL_ROUTE_REPORT_API, "1.0", hashMap, false, new koe() { // from class: com.taobao.flowcustoms.afc.AfcCustomSdk.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.koe
                public void a(JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("32861656", new Object[]{this, jSONObject});
                        return;
                    }
                    c.a("linkx", "LocalRouteReportRequest === onSuccess: " + jSONObject);
                }

                @Override // tb.koe
                public void a(JSONObject jSONObject, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1b6e96a0", new Object[]{this, jSONObject, str});
                        return;
                    }
                    c.a("linkx", "LocalRouteReportRequest === onError === 请求失败:" + jSONObject + " 错误码：" + str);
                }
            }, new Handler(d.b.f17188a.getLooper()), 10000);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (kol.a().d(this.h) || kol.a().e(this.h)) {
            String str = (String) f.a(a().f17167a).b("applink_xbs_config", "");
            long longValue = ((Long) f.a(a().f17167a).b("timestamp", 0L)).longValue();
            f a2 = f.a(a().f17167a);
            String str2 = (String) a2.b("local_appKeys" + this.h.f17179a, "");
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(str2)) {
                com.taobao.flowcustoms.afc.xbs.a.a(this.h, (SmallHandleData.BackAppInfos) JSON.parseObject(str2, SmallHandleData.BackAppInfos.class));
            } else if (!TextUtils.isEmpty(this.h.f17179a)) {
                sb.append(this.h.f17179a);
            }
            if (!TextUtils.isEmpty(str)) {
                com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(str);
                if (!parseObject.isEmpty()) {
                    for (String str3 : parseObject.keySet()) {
                        if (Long.parseLong(str3) > longValue) {
                            if (sb.length() != 0) {
                                sb.append(",");
                            }
                            sb.append(parseObject.get(str3));
                        }
                    }
                }
            }
            if (sb.length() == 0) {
                return;
            }
            this.h.I = String.valueOf(sb);
            kol.a().a(this.h, 0, new knv() { // from class: com.taobao.flowcustoms.afc.AfcCustomSdk.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.knv
                public void a(boolean z, int i2, String str4, String str5, Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dd770d7a", new Object[]{this, new Boolean(z), new Integer(i2), str4, str5, map});
                    } else {
                        AfcCustomSdk.a(AfcCustomSdk.this, str4, str5, map);
                    }
                }
            });
        }
    }

    private SmallHandleData.BackAppInfos a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SmallHandleData.BackAppInfos) ipChange.ipc$dispatch("8cb49833", new Object[]{this, map});
        }
        SmallHandleData.BackAppInfos backAppInfos = null;
        SmallHandleData smallHandleData = (SmallHandleData) com.alibaba.fastjson.JSONObject.parseObject(JSON.toJSONString(map), SmallHandleData.class);
        if (smallHandleData != null && smallHandleData.getBackAppInfos() != null && smallHandleData.getBackAppInfos().size() > 0) {
            for (SmallHandleData.BackAppInfos backAppInfos2 : smallHandleData.getBackAppInfos()) {
                if (backAppInfos2.getAppKey().equals(this.h.f17179a)) {
                    backAppInfos = backAppInfos2;
                }
                f a2 = f.a(a().f17167a);
                a2.a("local_appKeys" + backAppInfos2.getAppKey(), backAppInfos2);
            }
            f.a(a().f17167a).a("timestamp", Long.valueOf(System.currentTimeMillis()));
        }
        return backAppInfos;
    }

    private void a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
            return;
        }
        try {
            if (com.taobao.flowcustoms.afc.request.mtop.b.LINK_INFO_API_NEW.equals(str) && "2.0".equals(str2)) {
                com.taobao.flowcustoms.afc.xbs.a.a(this.h, a(map));
            } else {
                com.taobao.flowcustoms.afc.xbs.a.a(this.h, map);
            }
        } catch (Exception e2) {
            c.a("linkx", "AfcCustomSdk === routerUrl === 小把手解析错误：" + e2.getMessage());
            com.taobao.flowcustoms.afc.utils.b.a(com.taobao.flowcustoms.afc.utils.b.AFC_LINK_CRASH_MESSAGE, com.taobao.flowcustoms.afc.utils.b.AFC_LINK_CRASH_SMALL_HANDLE, e2.getMessage(), null);
        }
    }

    private void a(com.taobao.flowcustoms.afc.a aVar, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("951fd86", new Object[]{this, aVar, str, map});
            return;
        }
        try {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put(com.taobao.flowcustoms.afc.utils.b.AFC_ID, this.g);
            hashMap.put("h5Url", aVar.g);
            hashMap.put("jumpUrl", str);
            kog.a().a(aVar, com.taobao.flowcustoms.afc.utils.b.AFC_LINK_NAV_START, hashMap);
        } catch (Exception e2) {
            c.b("linkx", "AfcCustomSdk === nav2Page === afc_link_nav_start埋点异常：" + e2);
        }
        try {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(koh.LINK_MANAGER_SDK_VERSION, SDK_VERSION);
            hashMap2.put("userId", TextUtils.isEmpty(aVar.B) ? "unknown" : aVar.B);
            hashMap2.put("url", str);
            hashMap2.put("afcBackUrl", aVar.F);
            com.taobao.flowcustoms.afc.utils.b.a(com.taobao.flowcustoms.afc.utils.b.AFC_NAV_URL, "", "", hashMap2);
            c.b("linkx", "AfcCustomSdk === nav2Page === 开始导航：" + str);
        } catch (Exception e3) {
            c.b("linkx", "AfcCustomSdk === nav2Page === 开始导航埋点异常：" + e3);
        }
        kog.a().a(str, map);
        com.taobao.flowcustoms.afc.xbs.a.a(aVar);
    }

    private void a(final com.taobao.flowcustoms.afc.a aVar, final List<koj> list, final String str, final kny knyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf0c40a", new Object[]{this, aVar, list, str, knyVar});
        } else if (list.size() == 0) {
            knyVar.a(str);
            c.a("linkx", "AfcCustomSdk === executePlugin === 没有可执行的插件，返回=" + str);
        } else {
            final koj kojVar = list.get(0);
            list.remove(0);
            if (1 == kojVar.a(aVar)) {
                kojVar.a(aVar, str, new knx() { // from class: com.taobao.flowcustoms.afc.AfcCustomSdk.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.knx
                    public void a(boolean z, String str2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str2});
                        } else {
                            AfcCustomSdk.a(AfcCustomSdk.this, aVar, list, str2, knyVar);
                        }
                    }
                });
                return;
            }
            d.b.a(new Runnable() { // from class: com.taobao.flowcustoms.afc.AfcCustomSdk.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        kojVar.a(aVar, str, new knx() { // from class: com.taobao.flowcustoms.afc.AfcCustomSdk.7.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.knx
                            public void a(boolean z, String str2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str2});
                                }
                            }
                        });
                    }
                }
            });
            a(aVar, list, str, knyVar);
        }
    }
}
