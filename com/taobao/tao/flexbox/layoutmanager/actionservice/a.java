package com.taobao.tao.flexbox.layoutmanager.actionservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.mulitenv.EnvironmentSwitcher;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.taobao.tao.flexbox.layoutmanager.actionservice.a;
import com.taobao.tao.flexbox.layoutmanager.actionservice.b;
import com.taobao.tao.flexbox.layoutmanager.actionservice.d;
import com.ut.mini.UTHitBuilders;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import mtopsdk.mtop.util.ErrorConstant;
import tb.kge;
import tb.oed;

/* loaded from: classes8.dex */
public class a implements d.c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BROADCAST_ACTION = "TAOBAO.OCEAN.ActionServiceBC";
    public static final String ERR_FAIL = "AC_ERR_FAILED";
    public static final String ERR_NO_METHOD = "AC_ERR_NO_METHOD";
    public static final String ERR_NO_MODULE = "AC_ERR_NO_MODULE";
    public static final String ERR_PARAM = "AC_ERR_PARAM";
    public static final String ERR_TIMEOUT = "AC_ERR_TIMEOUT";
    private static boolean h;
    private static HashMap<Context, a> n;
    public com.taobao.tao.flexbox.layoutmanager.actionservice.core.b b;
    private com.taobao.tao.flexbox.layoutmanager.actionservice.d l;
    private Context m;
    private HashMap<String, String> o;

    /* renamed from: a  reason: collision with root package name */
    public volatile int f19940a = 0;
    private Handler i = new Handler(Looper.getMainLooper());
    private ArrayList<e> j = new ArrayList<>();
    public HashMap<Integer, d> c = new HashMap<>();
    public int d = 1;
    private boolean k = false;
    public String e = "https://h5.m.taobao.com/app/actionservice/2.0/webview.js";
    public boolean f = false;
    public HashMap<String, d> g = new HashMap<>();
    private BroadcastReceiver p = new BroadcastReceiver() { // from class: com.taobao.tao.flexbox.layoutmanager.actionservice.ActionService$4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            a.d dVar;
            JSONObject parseObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null) {
                String action = intent.getAction();
                if (a.BROADCAST_ACTION.equalsIgnoreCase(action)) {
                    String stringExtra = intent.getStringExtra("result");
                    if (TextUtils.isEmpty(stringExtra) || (parseObject = JSON.parseObject(stringExtra)) == null) {
                        return;
                    }
                    String string = parseObject.getString("seqId");
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    String string2 = parseObject.getString("data");
                    a.d dVar2 = a.this.g.get(string);
                    if (dVar2 == null) {
                        return;
                    }
                    a.this.g.remove(string);
                    if (!TextUtils.isEmpty(string2)) {
                        dVar2.b.a(dVar2.f19949a, JSON.parse(string2));
                        return;
                    } else {
                        dVar2.b.a(dVar2.f19949a, (Object) null);
                        return;
                    }
                }
                a aVar = a.this;
                if (a.$ipChange == null) {
                    return;
                }
                a aVar2 = a.this;
                if (!a.$ipChange.containsKey(action)) {
                    return;
                }
                a aVar3 = a.this;
                String str = (String) a.$ipChange.get(action);
                if (TextUtils.isEmpty(str) || (dVar = a.this.g.get(str)) == null) {
                    return;
                }
                a.this.g.remove(str);
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    dVar.b.a(dVar.f19949a, (Object) null);
                    return;
                }
                Set<String> keySet = extras.keySet();
                JSONObject jSONObject = new JSONObject();
                for (String str2 : keySet) {
                    jSONObject.put(str2, (Object) extras.getString(str2));
                }
                dVar.b.a(dVar.f19949a, jSONObject);
            }
        }
    };

    /* renamed from: com.taobao.tao.flexbox.layoutmanager.actionservice.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public interface InterfaceC0830a {
        void a(b bVar, c cVar);

        void a(b bVar, Object obj);
    }

    /* loaded from: classes8.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public String f19948a;
        public String b = ErrorConstant.MappingMsg.NETWORK_MAPPING_MSG;
        public Object c;

        static {
            kge.a(-1928128281);
        }

        public c(String str, String str2, Object obj) {
            this.f19948a = str;
            this.c = obj;
        }
    }

    /* loaded from: classes8.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public b f19949a;
        public InterfaceC0830a b;
        public f c;

        static {
            kge.a(-2004034772);
        }

        public d(b bVar, InterfaceC0830a interfaceC0830a, f fVar) {
            this.f19949a = bVar;
            this.b = interfaceC0830a;
            this.c = fVar;
        }
    }

    /* loaded from: classes8.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public String f19950a;
        public String b;
        public JSON c;
        public b d;
        public InterfaceC0830a e;
        public f f;
        public boolean g;

        static {
            kge.a(-5973756);
        }
    }

    /* loaded from: classes8.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public String f19951a;
        public String b;
        public long c;

        static {
            kge.a(-1094944120);
        }
    }

    public static /* synthetic */ ArrayList a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("c7ee7589", new Object[]{aVar}) : aVar.j;
    }

    public static /* synthetic */ void a(a aVar, String str, String str2, long j, boolean z, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a176fda", new Object[]{aVar, str, str2, new Long(j), new Boolean(z), bool});
        } else {
            aVar.a(str, str2, j, z, bool);
        }
    }

    public static /* synthetic */ void a(a aVar, String str, String str2, b bVar, JSON json, boolean z, InterfaceC0830a interfaceC0830a, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae951640", new Object[]{aVar, str, str2, bVar, json, new Boolean(z), interfaceC0830a, fVar});
        } else {
            aVar.b(str, str2, bVar, json, z, interfaceC0830a, fVar);
        }
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.actionservice.d b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.actionservice.d) ipChange.ipc$dispatch("5feeabca", new Object[]{aVar}) : aVar.l;
    }

    public static /* synthetic */ void b(a aVar, String str, String str2, b bVar, JSON json, boolean z, InterfaceC0830a interfaceC0830a, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4673b601", new Object[]{aVar, str, str2, bVar, json, new Boolean(z), interfaceC0830a, fVar});
        } else {
            aVar.d(str, str2, bVar, json, z, interfaceC0830a, fVar);
        }
    }

    static {
        kge.a(-827361722);
        kge.a(-754604069);
        h = false;
        n = new HashMap<>();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.actionservice.d.c
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            Iterator<e> it = this.j.iterator();
            while (it.hasNext()) {
                e next = it.next();
                if (next != null) {
                    c(next.f19950a, next.b, next.d, next.c, next.g, next.e, next.f);
                }
            }
            this.j.clear();
        } else {
            Iterator<e> it2 = this.j.iterator();
            while (it2.hasNext()) {
                e next2 = it2.next();
                if (next2.e != null) {
                    a(next2.f19950a, next2.b, System.nanoTime() - next2.f.c, false, (Boolean) null);
                    next2.e.a(next2.d, new c("AC_ERR_FAILED", "fail to download module mapping", null));
                }
            }
            this.j.clear();
        }
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Context f19947a;
        public String b;
        public Object c;

        static {
            kge.a(630145230);
        }

        public b(Context context, String str) {
            this.f19947a = context;
            this.b = str;
        }

        public b(Context context, String str, Object obj) {
            this.f19947a = context;
            this.b = str;
            this.c = obj;
        }

        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            } else {
                this.c = obj;
            }
        }
    }

    public a(Context context) {
        if (context != null) {
            com.taobao.tao.flexbox.layoutmanager.actionservice.core.a.a(context);
        }
        context = context == null ? com.taobao.tao.flexbox.layoutmanager.actionservice.core.a.a() : context;
        this.l = new com.taobao.tao.flexbox.layoutmanager.actionservice.d();
        this.m = context;
        if (b() == 1 || h) {
            this.l.a();
        }
        a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (Build.VERSION.SDK_INT < 20) {
            this.e = "https://h5.m.taobao.com/app/actionservice/2.0/webview-polyfill.js";
        }
        if (b() != 1 && !h) {
            return;
        }
        this.e = this.e.replace("h5", "wapp");
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        if (com.taobao.tao.flexbox.layoutmanager.actionservice.core.a.a() != null) {
            return PreferenceManager.getDefaultSharedPreferences(com.taobao.tao.flexbox.layoutmanager.actionservice.core.a.a()).getInt(EnvironmentSwitcher.SPKEY_ENV, 0);
        }
        return 0;
    }

    public static synchronized a c() {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ad3d9433", new Object[0]);
            }
            Context a2 = com.taobao.tao.flexbox.layoutmanager.actionservice.core.a.a();
            a aVar = n.get(a2);
            if (aVar == null) {
                aVar = new a(a2);
                n.put(a2, aVar);
            }
            return aVar;
        }
    }

    public Context d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f183c0e3", new Object[]{this}) : this.m;
    }

    public static a a(IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("df41e0d1", new Object[]{iWVWebView}) : n.get(iWVWebView.getContext());
    }

    public com.taobao.tao.flexbox.layoutmanager.actionservice.d e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.actionservice.d) ipChange.ipc$dispatch("c717c2ce", new Object[]{this}) : this.l;
    }

    private void b(String str, String str2, b bVar, JSON json, boolean z, InterfaceC0830a interfaceC0830a, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("515e68fa", new Object[]{this, str, str2, bVar, json, new Boolean(z), interfaceC0830a, fVar});
        } else if (this.l.a(str)) {
            a(str, str2, bVar, json, interfaceC0830a, fVar);
        } else if (!this.l.b(str)) {
            if (interfaceC0830a == null) {
                return;
            }
            a(fVar.f19951a, fVar.b, System.nanoTime() - fVar.c, false, (Boolean) null);
            interfaceC0830a.a(bVar, new c("AC_ERR_NO_MODULE", str + " not exist", null));
        } else {
            a(bVar, interfaceC0830a, fVar);
            if (this.k) {
                d(str, str2, bVar, json, z, interfaceC0830a, fVar);
                return;
            }
            e eVar = new e();
            eVar.f19950a = str;
            eVar.b = str2;
            eVar.d = bVar;
            eVar.c = json;
            eVar.e = interfaceC0830a;
            eVar.f = fVar;
            eVar.g = z;
            this.j.add(eVar);
        }
    }

    private void c(final String str, final String str2, final b bVar, final JSON json, final boolean z, final InterfaceC0830a interfaceC0830a, final f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7801937b", new Object[]{this, str, str2, bVar, json, new Boolean(z), interfaceC0830a, fVar});
        } else {
            this.i.post(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.actionservice.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        a.a(a.this, str, str2, bVar, json, z, interfaceC0830a, fVar);
                    }
                }
            });
        }
    }

    public void a(String str, b bVar, JSON json, InterfaceC0830a interfaceC0830a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b37687e", new Object[]{this, str, bVar, json, interfaceC0830a});
        } else {
            a(str, bVar, json, false, interfaceC0830a);
        }
    }

    public void a(String str, final b bVar, final JSON json, final boolean z, final InterfaceC0830a interfaceC0830a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40090f2a", new Object[]{this, str, bVar, json, new Boolean(z), interfaceC0830a});
            return;
        }
        int indexOf = str.indexOf(".");
        final String substring = str.substring(0, indexOf);
        final String substring2 = str.substring(indexOf + 1);
        final f fVar = new f();
        fVar.c = System.nanoTime();
        fVar.f19951a = substring;
        fVar.b = substring2;
        if (this.m != com.taobao.tao.flexbox.layoutmanager.actionservice.core.a.a() || this.l.b()) {
            c(substring, substring2, bVar, json, z, interfaceC0830a, fVar);
        } else {
            this.i.post(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.actionservice.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    e eVar = new e();
                    eVar.f19950a = substring;
                    eVar.b = substring2;
                    eVar.c = json;
                    eVar.d = bVar;
                    eVar.e = interfaceC0830a;
                    eVar.f = fVar;
                    eVar.g = z;
                    a.a(a.this).add(eVar);
                    a.b(a.this).a(a.this);
                }
            });
        }
    }

    public void a(String str, String str2, b bVar, JSON json, InterfaceC0830a interfaceC0830a, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea8a1f9", new Object[]{this, str, str2, bVar, json, interfaceC0830a, fVar});
            return;
        }
        d.b d2 = this.l.d(str);
        if (!TextUtils.isEmpty(d2.d)) {
            a(d2.d, str2, getClass().getClassLoader(), bVar, json, interfaceC0830a, fVar);
        } else if (d2.e != null) {
            a(d2.e.getName(), str2, d2.e.getClassLoader(), bVar, json, interfaceC0830a, fVar);
        } else if (interfaceC0830a == null) {
        } else {
            a(fVar.f19951a, fVar.b, System.nanoTime() - fVar.c, false, (Boolean) true);
            interfaceC0830a.a(bVar, new c("AC_ERR_NO_MODULE", "AC_ERR_NO_MODULE", null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a A[Catch: IllegalAccessException -> 0x00fb, InvocationTargetException -> 0x0127, NoSuchMethodException -> 0x0154, ClassNotFoundException -> 0x0197, TRY_ENTER, TRY_LEAVE, TryCatch #4 {NoSuchMethodException -> 0x0154, blocks: (B:3:0x0012, B:16:0x006a, B:26:0x00d4, B:20:0x00a7, B:22:0x00ab, B:23:0x00be, B:25:0x00c2), top: B:50:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0067 -> B:51:0x0068). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.String r23, java.lang.String r24, java.lang.ClassLoader r25, com.taobao.tao.flexbox.layoutmanager.actionservice.a.b r26, com.alibaba.fastjson.JSON r27, com.taobao.tao.flexbox.layoutmanager.actionservice.a.InterfaceC0830a r28, com.taobao.tao.flexbox.layoutmanager.actionservice.a.f r29) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.actionservice.a.a(java.lang.String, java.lang.String, java.lang.ClassLoader, com.taobao.tao.flexbox.layoutmanager.actionservice.a$b, com.alibaba.fastjson.JSON, com.taobao.tao.flexbox.layoutmanager.actionservice.a$a, com.taobao.tao.flexbox.layoutmanager.actionservice.a$f):void");
    }

    public void a(String str, String str2, b bVar, JSON json, boolean z, InterfaceC0830a interfaceC0830a, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2abb3e79", new Object[]{this, str, str2, bVar, json, new Boolean(z), interfaceC0830a, fVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("actionName", (Object) (str + "." + str2));
        jSONObject.put("methodId", (Object) Integer.valueOf(this.d));
        jSONObject.put("args", (Object) json);
        jSONObject.put("jsonpatch", (Object) Boolean.valueOf(z));
        if (interfaceC0830a != null) {
            this.c.put(Integer.valueOf(this.d), new d(bVar, interfaceC0830a, fVar));
        }
        this.d++;
        WVStandardEventCenter.postNotificationToJS(this.b.a(), "ActionServiceEvent", JSON.toJSONString(jSONObject, SerializerFeature.DisableCircularReferenceDetect));
    }

    public void a(b bVar, InterfaceC0830a interfaceC0830a, final f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e80b420", new Object[]{this, bVar, interfaceC0830a, fVar});
        } else if ((this.f19940a != -1 && this.f19940a != 0) || !oed.a(com.taobao.tao.flexbox.layoutmanager.actionservice.core.a.a())) {
        } else {
            if (this.b == null) {
                Context context = this.m;
                if (context == null) {
                    context = com.taobao.tao.flexbox.layoutmanager.actionservice.core.a.a();
                }
                this.b = new com.taobao.tao.flexbox.layoutmanager.actionservice.core.b(context);
            }
            String streamByUrl = android.taobao.windvane.packageapp.zipapp.utils.c.getStreamByUrl(this.e);
            if (streamByUrl != null) {
                this.f19940a = 2;
                this.b.a("http://localhost/", streamByUrl, "text/html", "UTF-8", null);
                a(BROADCAST_ACTION, (String) null);
                return;
            }
            this.f19940a = 1;
            com.taobao.tao.flexbox.layoutmanager.actionservice.b.a().a(this.e, new b.a() { // from class: com.taobao.tao.flexbox.layoutmanager.actionservice.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.actionservice.b.a
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    } else if (a.this.b.b()) {
                        a aVar = a.this;
                        aVar.f19940a = -1;
                        Iterator it = a.a(aVar).iterator();
                        while (it.hasNext()) {
                            e eVar = (e) it.next();
                            if (eVar.e != null) {
                                a.a(a.this, fVar.f19951a, fVar.b, System.nanoTime() - fVar.c, false, (Boolean) false);
                                eVar.e.a(eVar.d, new c("AC_ERR_FAILED", "fail to init webview", null));
                            }
                        }
                        a.a(a.this).clear();
                    } else {
                        a aVar2 = a.this;
                        aVar2.f19940a = 2;
                        aVar2.b.a("http://localhost/", str, "text/html", "UTF-8", null);
                        a.this.a(a.BROADCAST_ACTION, (String) null);
                    }
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.actionservice.b.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    a aVar = a.this;
                    aVar.f19940a = -1;
                    Iterator it = a.a(aVar).iterator();
                    while (it.hasNext()) {
                        e eVar = (e) it.next();
                        if (eVar.e != null) {
                            a.a(a.this, fVar.f19951a, fVar.b, System.nanoTime() - fVar.c, false, (Boolean) false);
                            eVar.e.a(eVar.d, new c("AC_ERR_FAILED", "fail to init webview", null));
                        }
                    }
                    a.a(a.this).clear();
                }
            });
        }
    }

    public void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
        } else {
            LocalBroadcastManager.getInstance(com.taobao.tao.flexbox.layoutmanager.actionservice.core.a.a()).sendBroadcast(intent);
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        IntentFilter intentFilter = new IntentFilter(str);
        if (this.o == null) {
            this.o = new HashMap<>();
        }
        if (!TextUtils.isEmpty(str2)) {
            this.o.put(str, str2);
        }
        if (this.f) {
            return;
        }
        LocalBroadcastManager.getInstance(com.taobao.tao.flexbox.layoutmanager.actionservice.core.a.a()).registerReceiver(this.p, intentFilter);
        com.taobao.tao.flexbox.layoutmanager.actionservice.core.a.a().registerReceiver(this.p, intentFilter);
        this.f = true;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.k = true;
        this.i.post(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.actionservice.a.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (a.a(a.this).isEmpty()) {
                } else {
                    Iterator it = a.a(a.this).iterator();
                    while (it.hasNext()) {
                        e eVar = (e) it.next();
                        if (eVar != null) {
                            a.b(a.this, eVar.f19950a, eVar.b, eVar.d, eVar.c, eVar.g, eVar.e, eVar.f);
                        }
                    }
                    a.a(a.this).clear();
                }
            }
        });
    }

    private void d(final String str, final String str2, final b bVar, final JSON json, final boolean z, final InterfaceC0830a interfaceC0830a, final f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ea4bdfc", new Object[]{this, str, str2, bVar, json, new Boolean(z), interfaceC0830a, fVar});
        } else {
            this.l.a(str, new d.a() { // from class: com.taobao.tao.flexbox.layoutmanager.actionservice.a.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.actionservice.d.a
                public void a(d.b bVar2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d7d4e5ce", new Object[]{this, bVar2});
                        return;
                    }
                    a.this.a(str, bVar2);
                    a.this.a(str, str2, bVar, json, z, interfaceC0830a, fVar);
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.actionservice.d.a
                public void a(String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str3});
                    } else if (interfaceC0830a == null) {
                    } else {
                        a.a(a.this, fVar.f19951a, fVar.b, System.nanoTime() - fVar.c, false, (Boolean) false);
                        interfaceC0830a.a(bVar, new c("AC_ERR_NO_MODULE", str3, null));
                    }
                }
            });
        }
    }

    public void a(String str, d.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b4df98", new Object[]{this, str, bVar});
        } else if (bVar.f) {
        } else {
            JSONArray jSONArray = new JSONArray();
            jSONArray.add(str);
            jSONArray.add(bVar.b);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("actionName", (Object) "$.register");
            jSONObject.put("args", (Object) jSONArray);
            WVStandardEventCenter.postNotificationToJS(this.b.a(), "ActionServiceEvent", jSONObject.toJSONString());
            bVar.f = true;
        }
    }

    private void a(int i, boolean z, b bVar, JSONObject jSONObject, Object obj, boolean z2) {
        b bVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90528baa", new Object[]{this, new Integer(i), new Boolean(z), bVar, jSONObject, obj, new Boolean(z2)});
            return;
        }
        d dVar = this.c.get(Integer.valueOf(i));
        if (dVar == null) {
            return;
        }
        b bVar3 = dVar.f19949a;
        if (bVar3 != null) {
            bVar2 = bVar3;
        } else if (bVar != null) {
            bVar2 = bVar;
        } else if (jSONObject == null) {
            bVar2 = new b(null, null, null);
        } else {
            bVar2 = new b(null, jSONObject.getString("source"), null);
        }
        if (z) {
            a(dVar.c.f19951a, dVar.c.b, System.nanoTime() - dVar.c.c, true, (Boolean) false);
            dVar.b.a(bVar2, obj);
        } else {
            c cVar = new c("AC_ERR_FAILED", "module execute failed", obj);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) obj;
                if (!TextUtils.isEmpty(jSONObject2.getString("errorCode"))) {
                    cVar.f19948a = jSONObject2.getString("errorCode");
                }
                if (!TextUtils.isEmpty(jSONObject2.getString("errorMsg"))) {
                    cVar.b = jSONObject2.getString("errorMsg");
                }
                if (jSONObject2.containsKey("result")) {
                    cVar.c = jSONObject2.get("result");
                }
            }
            a(dVar.c.f19951a, dVar.c.b, System.nanoTime() - dVar.c.c, false, (Boolean) false);
            dVar.b.a(bVar2, cVar);
        }
        if (!z2) {
            return;
        }
        this.c.remove(Integer.valueOf(i));
    }

    public void a(int i, boolean z, b bVar, JSONObject jSONObject, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7844b46a", new Object[]{this, new Integer(i), new Boolean(z), bVar, jSONObject, obj});
        } else {
            a(i, z, bVar, jSONObject, obj, true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.taobao.tao.flexbox.layoutmanager.actionservice.a$6] */
    private void a(final String str, final String str2, final long j, final boolean z, final Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e31c8c1", new Object[]{this, str, str2, new Long(j), new Boolean(z), bool});
        } else {
            new AsyncTask<Void, Void, Object>() { // from class: com.taobao.tao.flexbox.layoutmanager.actionservice.a.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.AsyncTask
                public /* synthetic */ Object doInBackground(Void[] voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                }

                public Object a(Void... voidArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ipChange2.ipc$dispatch("5307165e", new Object[]{this, voidArr});
                    }
                    Properties properties = new Properties();
                    properties.put(UTHitBuilders.a.FIELD_PAGE, "Page_ActionService");
                    properties.put(UTHitBuilders.a.FIELD_EVENT_ID, "19999");
                    properties.put("actionName", str + "." + str2);
                    properties.put("success", Boolean.valueOf(z));
                    properties.put("time", Long.valueOf(j / 1000000));
                    properties.put("os", "Android");
                    Boolean bool2 = bool;
                    if (bool2 != null) {
                        properties.put("native", bool2);
                    }
                    try {
                        TBS.Ext.commitEvent("Page_ActionService", properties);
                        return null;
                    } catch (Exception unused) {
                        return null;
                    }
                }
            }.execute(new Void[0]);
        }
    }
}
