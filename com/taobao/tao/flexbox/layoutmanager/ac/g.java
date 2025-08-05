package com.taobao.tao.flexbox.layoutmanager.ac;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.flexa.compat.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.ac.e;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.w;
import com.taobao.tao.flexbox.layoutmanager.module.Priority;
import com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import mtopsdk.mtop.util.ErrorConstant;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ogh;
import tb.ohc;
import tb.ohi;
import tb.tjz;

/* loaded from: classes8.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERR_FAIL = "AC_ERR_FAILED";
    public static final String ERR_NO_METHOD = "AC_ERR_NO_METHOD";
    public static final String ERR_NO_MODULE = "AC_ERR_NO_MODULE";
    public static final String ERR_PARAM = "AC_ERR_PARAM";
    public static final String PRIORITY_HIGH = "high";
    public static final String PRIORITY_LOW = "low";
    private static final List<String> i;

    /* renamed from: a  reason: collision with root package name */
    public com.taobao.tao.flexbox.layoutmanager.ac.c f19928a;
    private com.taobao.tao.flexbox.layoutmanager.ac.b d;
    private ab g;
    private tjz e = new tjz();
    public HashMap<Integer, b> b = new HashMap<>();
    public int c = 1;
    private NotifyManager h = new NotifyManager();
    private com.taobao.tao.flexbox.layoutmanager.ac.d f = new com.taobao.tao.flexbox.layoutmanager.ac.d();

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f19936a;
        public String b;
        public Object c;

        static {
            kge.a(-1758093408);
        }

        public a(String str, String str2, Object obj) {
            this.f19936a = str;
            this.b = str2 == null ? ErrorConstant.MappingMsg.NETWORK_MAPPING_MSG : str2;
            this.c = obj;
        }
    }

    /* loaded from: classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public c f19937a;

        static {
            kge.a(734623507);
        }

        public b(c cVar) {
            this.f19937a = cVar;
        }
    }

    /* loaded from: classes8.dex */
    public interface d {
        void a(c cVar, a aVar);

        void a(c cVar, Object obj);
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.ac.b a(g gVar, com.taobao.tao.flexbox.layoutmanager.ac.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.ac.b) ipChange.ipc$dispatch("36337380", new Object[]{gVar, bVar});
        }
        gVar.d = bVar;
        return bVar;
    }

    public static /* synthetic */ ab a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ab) ipChange.ipc$dispatch("5ddf37e7", new Object[]{gVar}) : gVar.g;
    }

    public static /* synthetic */ void a(g gVar, boolean z, boolean z2, String str, String str2, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("400c17f5", new Object[]{gVar, new Boolean(z), new Boolean(z2), str, str2, cVar});
        } else {
            gVar.a(z, z2, str, str2, cVar);
        }
    }

    public static /* synthetic */ NotifyManager b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NotifyManager) ipChange.ipc$dispatch("e3803078", new Object[]{gVar}) : gVar.h;
    }

    static {
        kge.a(1716961325);
        kge.a(1556182120);
        i = new ArrayList();
        if (oeb.al()) {
            i.add("$app.commit");
        }
        if (oeb.f("orange")) {
            i.add("$orange.getConfigs");
            i.add("$orange.getConfig");
        }
        if (oeb.f("ab")) {
            i.add("$ab.get");
        }
        i.add("$app.keypathForTarget");
        i.add("$tab.getIconInfo");
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        this.f.a(str, str2);
        a(str, this.f.c(str));
    }

    public void a(String str, Class<? extends Object> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af6b54b", new Object[]{this, str, cls});
        } else {
            this.f.a(str, cls);
        }
    }

    public Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[]{this}) : this.g.l();
    }

    /* loaded from: classes8.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public ab f19938a;
        public JSON b;
        public d c;
        public com.taobao.tao.flexbox.layoutmanager.event.b d;
        public int e;
        public boolean f = false;
        public long g;
        public String h;
        public Handler i;

        static {
            kge.a(-1902063666);
        }

        public c(ab abVar, JSON json, d dVar) {
            this.f19938a = abVar;
            this.b = json;
            this.c = dVar;
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            this.e = i;
            if (i <= 0) {
                z = false;
            }
            this.f = z;
        }

        public Context a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("75941360", new Object[]{this});
            }
            ab abVar = this.f19938a;
            if (abVar == null) {
                return null;
            }
            return abVar.l();
        }

        public String a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
            }
            JSON json = this.b;
            return json instanceof Map ? oec.a(((Map) json).get(str), str2) : str2;
        }

        public Map a(String str, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("49ed9a08", new Object[]{this, str, map});
            }
            JSON json = this.b;
            return json instanceof Map ? oec.a(((Map) json).get(str), map) : map;
        }
    }

    public g(ab abVar) {
        this.g = abVar;
    }

    public ab b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ab) ipChange.ipc$dispatch("eea45494", new Object[]{this}) : this.g;
    }

    public void a(String str, String str2, final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57040483", new Object[]{this, str, str2, cVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        String str3 = str + "." + str2;
        ogh.a("executeCode:" + ogh.b(str3));
        jSONObject.put("name", (Object) str3);
        jSONObject.put("cid", (Object) Integer.valueOf(this.c));
        jSONObject.put("args", (Object) cVar.b);
        jSONObject.put("flag", (Object) "jsonpatchex|newEvent");
        if (cVar.c != null) {
            this.b.put(Integer.valueOf(this.c), new b(cVar));
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(jSONObject);
        this.c++;
        String jSONString = JSON.toJSONString(jSONArray, SerializerFeature.DisableCircularReferenceDetect);
        com.taobao.tao.flexbox.layoutmanager.ac.b bVar = this.d;
        if (bVar != null) {
            bVar.sendData(jSONString);
            if (cVar.d instanceof com.taobao.tao.flexbox.layoutmanager.event.a) {
                oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.ac.g.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            ((com.taobao.tao.flexbox.layoutmanager.event.a) cVar.d).a();
                        }
                    }
                }, true);
            }
        } else {
            this.f19928a.a(str3, jSONString, cVar.d);
        }
        ogh.b();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.d != null || this.f19928a != null) {
        } else {
            this.f19928a = h();
            this.f19928a.a(a(), this);
        }
    }

    private com.taobao.tao.flexbox.layoutmanager.ac.c h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.ac.c) ipChange.ipc$dispatch("6a3a5841", new Object[]{this}) : com.taobao.tao.flexbox.layoutmanager.adapter.a.a().r().a();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            g();
        }
    }

    public void a(String str, e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea061b91", new Object[]{this, str, aVar});
            return;
        }
        ogh.a("registerJSMode");
        if (!aVar.e) {
            com.taobao.tao.flexbox.layoutmanager.ac.b bVar = this.d;
            if (bVar != null) {
                bVar.sendData(c(str, aVar.b));
            } else {
                com.taobao.tao.flexbox.layoutmanager.ac.c cVar = this.f19928a;
                if (cVar != null) {
                    cVar.a(str, aVar.b);
                }
            }
            aVar.e = true;
        }
        ogh.b();
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("name", (Object) "$.cb");
        jSONObject2.put("args", (Object) jSONObject);
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(jSONObject2);
        String jSONString = JSON.toJSONString(jSONArray, SerializerFeature.DisableCircularReferenceDetect);
        com.taobao.tao.flexbox.layoutmanager.ac.b bVar = this.d;
        if (bVar != null) {
            bVar.sendData(jSONString);
        } else {
            this.f19928a.a("$.cb", jSONString, null);
        }
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        String[] split = str2.split(":");
        String str3 = split[0];
        String str4 = split[1];
        a(a());
        try {
            this.d.start(this, str, str3, Integer.parseInt(str4));
        } catch (Exception e) {
            ohi.a(ab.a(), e.getMessage());
            com.taobao.tao.flexbox.layoutmanager.ac.b bVar = this.d;
            if (bVar != null) {
                bVar.stop();
            }
            this.d = null;
        }
    }

    private void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        com.alibaba.flexa.compat.c.a("com.taobao.tao.flexbox.layoutmanager.tool.Debugger", new c.a() { // from class: com.taobao.tao.flexbox.layoutmanager.ac.g.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.flexa.compat.c.a
            public void onClassLoaded(Class<?> cls) {
                try {
                    g.a(g.this, (com.taobao.tao.flexbox.layoutmanager.ac.b) cls.getConstructor(Context.class).newInstance(context));
                } catch (Throwable th) {
                    th.printStackTrace();
                    ogg.a(w.TAG, "FlexaClass load Debugger error:Throwable: " + th.toString());
                }
                countDownLatch.countDown();
            }

            @Override // com.alibaba.flexa.compat.c.a
            public void onClassNotFound() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ad9dd2ef", new Object[]{this});
                    return;
                }
                ogg.a(w.TAG, "FlexaClass load Debugger error:onClassNotFound");
                countDownLatch.countDown();
            }
        }, AsyncTask.THREAD_POOL_EXECUTOR);
        try {
            countDownLatch.await(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.d != null;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.ac.b bVar = this.d;
        if (bVar == null) {
            return;
        }
        bVar.stop();
    }

    public void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.e.a(new tjz.a() { // from class: com.taobao.tao.flexbox.layoutmanager.ac.g.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.tjz.a, java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        g.this.b(str);
                    }
                }
            });
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        try {
            JSONArray parseArray = JSON.parseArray(str);
            for (int i2 = 0; i2 < parseArray.size(); i2++) {
                b(parseArray.getJSONObject(i2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void b(JSONObject jSONObject) {
        JSON json;
        IpChange ipChange = $ipChange;
        final int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            Object obj = jSONObject.get("args");
            if (jSONObject.containsKey("cid")) {
                i2 = jSONObject.getInteger("cid").intValue();
            }
            if (obj instanceof JSON) {
                json = (JSON) obj;
            } else {
                JSONArray jSONArray = new JSONArray();
                jSONArray.add(obj);
                json = jSONArray;
            }
            d dVar = new d() { // from class: com.taobao.tao.flexbox.layoutmanager.ac.g.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.ac.g.d
                public void a(c cVar, Object obj2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb15ed33", new Object[]{this, cVar, obj2});
                    } else if (i2 <= 0) {
                    } else {
                        JSONObject jSONObject2 = new JSONObject();
                        if (obj2 != null) {
                            jSONObject2.put("data", obj2);
                        }
                        jSONObject2.put("methodId", (Object) Integer.valueOf(i2));
                        g.this.a(jSONObject2);
                        g.a(g.this).d().appendModuleExecuteCallback(cVar, obj2, true);
                    }
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.ac.g.d
                public void a(c cVar, a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fed2540a", new Object[]{this, cVar, aVar});
                    } else if (i2 <= 0) {
                    } else {
                        JSONObject jSONObject2 = new JSONObject();
                        if (aVar != null) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("code", aVar.f19936a);
                            hashMap.put("message", aVar.b);
                            hashMap.put("userInfo", aVar.c);
                            jSONObject2.put("error", (Object) hashMap);
                        }
                        jSONObject2.put("methodId", (Object) Integer.valueOf(i2));
                        g.this.a(jSONObject2);
                        g.a(g.this).d().appendModuleExecuteCallback(cVar, null, false);
                    }
                }
            };
            String string = jSONObject.getString("name");
            c cVar = new c(this.g, json, dVar);
            cVar.g = System.currentTimeMillis();
            cVar.h = string;
            cVar.a(i2);
            a(string, (aa) null, cVar);
        }
    }

    private boolean d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f180e83", new Object[]{this, str, str2})).booleanValue();
        }
        List<String> list = i;
        return list.contains(str + "." + str2);
    }

    private void c(final String str, final String str2, final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24689c1", new Object[]{this, str, str2, cVar});
            return;
        }
        final e.a a2 = this.f.a(str);
        final boolean b2 = this.f.b(str);
        if ((a2 != null && a2.f) || b2 || d(str, str2)) {
            a(a2 != null, b2, str, str2, cVar);
        } else if (oec.f()) {
            a(a2 != null, b2, str, str2, cVar);
        } else {
            tjz.a aVar = new tjz.a(str + str2) { // from class: com.taobao.tao.flexbox.layoutmanager.ac.g.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass5 anonymousClass5, String str3, Object... objArr) {
                    if (str3.hashCode() == 1548812690) {
                        super.run();
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str3));
                }

                @Override // tb.tjz.a, java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    g.a(g.this, a2 != null, b2, str, str2, cVar);
                    super.run();
                }
            };
            aVar.a(a(cVar, a2, str2));
            this.e.a(aVar);
        }
    }

    private int a(c cVar, e.a aVar, String str) {
        Method a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("29cf3189", new Object[]{this, cVar, aVar, str})).intValue();
        }
        if (cVar.b instanceof JSONObject) {
            String string = ((JSONObject) cVar.b).getString("priority");
            Priority priority = null;
            if (aVar != null && aVar.d != null && (a2 = ohc.a(str, aVar.d, (Class<?>[]) new Class[]{c.class})) != null) {
                priority = (Priority) a2.getAnnotation(Priority.class);
            }
            if ("low".equals(string)) {
                return 2;
            }
            if (priority != null && "low".equals(priority.name())) {
                return 2;
            }
            if ("high".equals(string) || (priority != null && "high".equals(priority.name()))) {
                return 1;
            }
        }
        return 0;
    }

    private void a(boolean z, boolean z2, String str, String str2, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3683403", new Object[]{this, new Boolean(z), new Boolean(z2), str, str2, cVar});
            return;
        }
        String b2 = ogh.b(str + str2);
        if (ogh.e()) {
            b2 = b2 + cVar.a("pluginName", "") + cVar.a(FluidException.METHOD_NAME, "");
        }
        if (z) {
            ab abVar = this.g;
            if (abVar != null && ((abVar.i() || this.g.j()) && oeb.bs())) {
                return;
            }
            ogh.a(" native module " + b2);
            b(str, str2, cVar);
            if (!cVar.f) {
                this.g.d().appendModuleExecuteInfo(cVar);
            }
            ogh.b();
        } else if (z2) {
            ogh.a("js module " + b2);
            c();
            d(str, str2, cVar);
            ogh.b();
        } else if (cVar == null || cVar.c == null) {
        } else {
            cVar.c.a(cVar, new a("AC_ERR_NO_MODULE", str + " not exist", null));
        }
    }

    public void a(String str, aa aaVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f56cc25", new Object[]{this, str, aaVar, cVar});
            return;
        }
        int indexOf = str.indexOf(".");
        c(str.substring(0, indexOf), str.substring(indexOf + 1), cVar);
    }

    public void b(String str, String str2, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ca54722", new Object[]{this, str, str2, cVar});
            return;
        }
        e.a a2 = this.f.a(str);
        if (a2.d != null) {
            a(a2.d, str2, cVar);
        } else if (!TextUtils.isEmpty(a2.c)) {
            a(a2.c, str2, getClass().getClassLoader(), cVar);
        } else if (cVar == null || cVar.c == null) {
        } else {
            cVar.c.a(cVar, new a("AC_ERR_NO_MODULE", "AC_ERR_NO_MODULE", null));
        }
    }

    private void a(Class<? extends Object> cls, String str, c cVar) {
        try {
            if (com.taobao.tao.flexbox.layoutmanager.module.b.a(cls.getName(), str, cVar)) {
                return;
            }
            cls.getDeclaredMethod(str, c.class).invoke(null, cVar);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            if (cVar == null || cVar.c == null) {
                return;
            }
            cVar.c.a(cVar, new a("AC_ERR_PARAM", "illegalAccess", null));
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
            if (cVar == null || cVar.c == null) {
                return;
            }
            d dVar = cVar.c;
            dVar.a(cVar, new a("AC_ERR_NO_METHOD", "method: " + str + " not exist", null));
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
            if (cVar == null || cVar.c == null) {
                return;
            }
            cVar.c.a(cVar, new a("AC_ERR_PARAM", "params invalid", null));
        } catch (Throwable th) {
            th.printStackTrace();
            if (cVar == null || cVar.c == null) {
                return;
            }
            d dVar2 = cVar.c;
            dVar2.a(cVar, new a("AC_ERR_FAILED", "fail to execute className:" + cls.getName() + "  methodName:" + str + "  exception:" + th.getMessage(), null));
        }
    }

    private void a(String str, String str2, ClassLoader classLoader, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1112cdd1", new Object[]{this, str, str2, classLoader, cVar});
            return;
        }
        try {
            if (com.taobao.tao.flexbox.layoutmanager.module.b.a(str, str2, cVar)) {
                return;
            }
            a((Class<? extends Object>) Class.forName(str, true, classLoader), str2, cVar);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            if (cVar == null || cVar.c == null) {
                return;
            }
            d dVar = cVar.c;
            dVar.a(cVar, new a("AC_ERR_NO_MODULE", "className: " + str + " not found", null));
        } catch (Exception e2) {
            e2.printStackTrace();
            if (cVar == null || cVar.c == null) {
                return;
            }
            d dVar2 = cVar.c;
            dVar2.a(cVar, new a("AC_ERR_FAILED", "fail to execute className:" + str + "  methodName:" + str2 + "  exception:" + e2.getMessage(), null));
        }
    }

    public void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
        } else {
            this.h.a(intent);
        }
    }

    public void a(String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed70b58d", new Object[]{this, str, cVar});
        } else {
            this.h.a(str, cVar);
        }
    }

    public void b(String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89deb1ec", new Object[]{this, str, cVar});
        } else {
            this.h.b(str, cVar);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.e.a(new tjz.a() { // from class: com.taobao.tao.flexbox.layoutmanager.ac.g.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.tjz.a, java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    g.b(g.this).a();
                    if (g.this.f19928a == null) {
                        return;
                    }
                    g.this.f19928a.a();
                }
            }, 300);
        }
    }

    private void d(final String str, final String str2, final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27e7cc60", new Object[]{this, str, str2, cVar});
        } else {
            this.f.a(str, new d.a() { // from class: com.taobao.tao.flexbox.layoutmanager.ac.g.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.ac.d.a
                public void a(e.a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("12ebdb1b", new Object[]{this, aVar});
                        return;
                    }
                    g.this.a(str, aVar);
                    g.this.a(str, str2, cVar);
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.ac.d.a
                public void a(String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str3});
                        return;
                    }
                    c cVar2 = cVar;
                    if (cVar2 == null || cVar2.c == null) {
                        return;
                    }
                    cVar.c.a(cVar, new a("AC_ERR_NO_MODULE", str3, null));
                }
            });
        }
    }

    public void a(int i2, boolean z, Object obj, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f850b3f", new Object[]{this, new Integer(i2), new Boolean(z), obj, new Boolean(z2)});
            return;
        }
        b bVar = this.b.get(Integer.valueOf(i2));
        if (bVar == null) {
            return;
        }
        if (z) {
            if (bVar.f19937a.c != null) {
                bVar.f19937a.c.a(bVar.f19937a, obj);
            }
        } else {
            a aVar = new a("AC_ERR_FAILED", "module execute failed", obj);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if (!TextUtils.isEmpty(jSONObject.getString("errorCode"))) {
                    aVar.f19936a = jSONObject.getString("errorCode");
                }
                if (!TextUtils.isEmpty(jSONObject.getString("errorMsg"))) {
                    aVar.b = jSONObject.getString("errorMsg");
                }
                if (jSONObject.containsKey("result")) {
                    aVar.c = jSONObject.get("result");
                }
            }
            if (bVar.f19937a.c != null) {
                bVar.f19937a.c.a(bVar.f19937a, aVar);
            }
        }
        if (z2) {
            return;
        }
        this.b.remove(Integer.valueOf(i2));
    }

    public static String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cef1bce2", new Object[]{str, str2});
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(str);
        jSONArray.add(str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) "$.register");
        jSONObject.put("args", (Object) jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.add(jSONObject);
        return JSON.toJSONString(jSONArray2, SerializerFeature.DisableCircularReferenceDetect);
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        return "(function () { let module={};" + str + "return module.exports;})()";
    }
}
