package com.taobao.tao.flexbox.layoutmanager.usertracker;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.flexa.compat.c;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.core.w;
import com.taobao.tao.flexbox.layoutmanager.module.TrackerModule;
import com.taobao.tao.flexbox.layoutmanager.usertracker.IPerformCollect;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.kge;
import tb.nfc;
import tb.oeb;
import tb.ogg;
import tb.ogt;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CELL_RENDER_FINISH = "cellRenderFinish";
    public static final String FIRST_FRAME_RENDER_FINISH = "firstFrameRenderFinish";
    public static final String GG_PICK_NATIVE_TASKS = "gg_pick_native_tasks";
    public static final List<String> GLOBAL_TASK_NAMES;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, b> f20497a;
    private static Map<String, Integer> b;
    private b c;
    private String d;
    private Set<String> e;
    private Handler f;
    private Handler g;
    private IPerformCollect h;
    private String i;

    /* renamed from: com.taobao.tao.flexbox.layoutmanager.usertracker.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class C0855a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static a f20501a;

        static {
            kge.a(1013831546);
            f20501a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("92fe88a7", new Object[0]) : f20501a;
        }
    }

    public static /* synthetic */ IPerformCollect a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPerformCollect) ipChange.ipc$dispatch("e4677c1d", new Object[]{aVar}) : aVar.h;
    }

    public static /* synthetic */ IPerformCollect a(a aVar, IPerformCollect iPerformCollect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPerformCollect) ipChange.ipc$dispatch("211ec515", new Object[]{aVar, iPerformCollect});
        }
        aVar.h = iPerformCollect;
        return iPerformCollect;
    }

    public static /* synthetic */ void a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6da4482b", new Object[]{aVar, str});
        } else {
            aVar.d(str);
        }
    }

    static {
        kge.a(477731070);
        GLOBAL_TASK_NAMES = Arrays.asList("gg_videoTab_page_fever", "gg_TNodeDefaultPageName_page_create", "gg_TNodeDefaultPageName_page_appear");
        f20497a = new HashMap();
        b = new HashMap();
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("92fe88a7", new Object[0]) : C0855a.a();
    }

    private a() {
        this.e = new HashSet();
        this.g = new Handler(Looper.getMainLooper());
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private JSONArray f20502a;
        private Map<String, String> b;
        private long c;
        private int d;
        private boolean e;

        static {
            kge.a(-1802120538);
        }

        private b() {
            this.f20502a = new JSONArray();
            this.b = new HashMap();
        }

        public static /* synthetic */ int a(b bVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d96a273", new Object[]{bVar, new Integer(i)})).intValue();
            }
            bVar.d = i;
            return i;
        }

        public static /* synthetic */ long a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9d576cd7", new Object[]{bVar})).longValue() : bVar.c;
        }

        public static /* synthetic */ long a(b bVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d96a635", new Object[]{bVar, new Long(j)})).longValue();
            }
            bVar.c = j;
            return j;
        }

        public static /* synthetic */ JSONArray a(b bVar, JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("82c19ed3", new Object[]{bVar, jSONArray});
            }
            bVar.f20502a = jSONArray;
            return jSONArray;
        }

        public static /* synthetic */ JSONObject a(b bVar, String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ed9fb0d", new Object[]{bVar, str}) : bVar.a(str);
        }

        public static /* synthetic */ Map a(b bVar, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("f6b322f7", new Object[]{bVar, map});
            }
            bVar.b = map;
            return map;
        }

        public static /* synthetic */ boolean a(b bVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d96e255", new Object[]{bVar, new Boolean(z)})).booleanValue();
            }
            bVar.e = z;
            return z;
        }

        public static /* synthetic */ JSONArray b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("adf3ac1a", new Object[]{bVar}) : bVar.f20502a;
        }

        public static /* synthetic */ Map c(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b4383da", new Object[]{bVar}) : bVar.b;
        }

        public static /* synthetic */ int d(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf78d319", new Object[]{bVar})).intValue() : bVar.d;
        }

        private JSONObject a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{this, str});
            }
            if (this.e && !a.GLOBAL_TASK_NAMES.contains(str) && !oeb.a("GLOBAL_TASK_NAMES", "").contains(str)) {
                return null;
            }
            for (int i = 0; i < this.f20502a.size(); i++) {
                JSONObject jSONObject = this.f20502a.getJSONObject(i);
                if (jSONObject != null && TextUtils.equals(str, jSONObject.getString("name"))) {
                    return jSONObject;
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", (Object) str);
            this.f20502a.add(jSONObject2);
            return jSONObject2;
        }
    }

    private b c(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("e21275dd", new Object[]{this, str});
        }
        this.d = str;
        b bVar = f20497a.get(str);
        if (bVar == null) {
            bVar = new b();
            b.a(bVar, b.a(this.c));
            b.a(bVar, b.b(this.c));
            b.a(bVar, b.c(this.c));
            Integer num = b.get(str);
            if (num != null) {
                i = num.intValue();
            }
            Integer valueOf = Integer.valueOf(i);
            b.a(bVar, valueOf.intValue());
            b.put(str, Integer.valueOf(valueOf.intValue() + 1));
            f20497a.put(str, bVar);
        } else {
            b bVar2 = this.c;
            if (bVar2 != null && b.b(bVar2) != null && b.b(this.c).size() > 0) {
                b.b(bVar).addAll(b.b(this.c));
            }
        }
        this.c = null;
        return bVar;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        JSONObject c = c(str, str2);
        if (c != null) {
            c.put("start", (Object) Long.valueOf(System.currentTimeMillis()));
            ogg.a("SubTaskTracker", str + ":" + str2 + " subTaskBegin");
            return;
        }
        ogg.a("SubTaskTracker", str + ":" + str2 + " subTaskBegin error");
    }

    public void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf4cf4", new Object[]{this, str, str2, jSONObject});
            return;
        }
        JSONObject c = c(str, str2);
        if (c != null && c.getLongValue("start") > 0) {
            c.put("end", (Object) Long.valueOf(System.currentTimeMillis()));
            if (jSONObject != null) {
                c.putAll(jSONObject);
            }
            ogg.a("SubTaskTracker", str + ":" + str2 + " subTaskSuccess");
            return;
        }
        ogg.a("SubTaskTracker", str + ":" + str2 + " subTaskSuccess error");
    }

    public void a(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d5d0b6a", new Object[]{this, str, str2, str3, jSONObject});
            return;
        }
        JSONObject c = c(str, str2);
        if (c != null) {
            c.put("end", (Object) Long.valueOf(System.currentTimeMillis()));
            c.put("errorType", (Object) str3);
            c.put("errorInfo", (Object) jSONObject);
            ogg.a("SubTaskTracker", str + ":" + str2 + " subTaskFail");
            return;
        }
        ogg.a("SubTaskTracker", str + ":" + str2 + " subTaskFail error");
    }

    public void b(final String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        if (this.f == null) {
            this.f = new Handler(Looper.getMainLooper()) { // from class: com.taobao.tao.flexbox.layoutmanager.usertracker.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("282a8c19", new Object[]{this, message});
                    } else {
                        a.a(a.this, str);
                    }
                }
            };
        }
        this.e.add(str2);
        if (this.e.size() < 2) {
            if (this.f.hasMessages(1)) {
                return;
            }
            this.f.sendEmptyMessageDelayed(1, oeb.cb());
        } else if (!this.f.hasMessages(1)) {
        } else {
            this.f.removeMessages(1);
            d(str);
        }
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        b bVar = f20497a.get(str);
        if (bVar != null) {
            b.a(bVar, true);
            IPerformCollect iPerformCollect = this.h;
            if (iPerformCollect != null) {
                iPerformCollect.doCollect(IPerformCollect.Scene.RENDER_END);
            }
        }
        Handler handler = this.f;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f = null;
        }
        ogg.a("SubTaskTracker", str + " subTaskTrackFinish");
    }

    private JSONObject c(String str, String str2) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8a99169e", new Object[]{this, str, str2});
        }
        try {
            if (this.h == null && ogt.TASK_FRAGMENT_CREATE.equals(str2) && !TextUtils.equals(this.i, str2)) {
                this.i = str2;
                c();
            }
            if (TextUtils.isEmpty(str)) {
                str = this.d;
            }
            if (TextUtils.isEmpty(str)) {
                if (this.c == null) {
                    this.c = new b();
                    b.a(this.c, System.currentTimeMillis());
                }
                return b.a(this.c, str2);
            } else if (!TextUtils.isEmpty(str) && this.c != null) {
                return b.a(c(str), str2);
            } else {
                if (f20497a.get(str) != null && (bVar = f20497a.get(str)) != null) {
                    return b.a(bVar, str2);
                }
                return null;
            }
        } catch (Throwable th) {
            ogg.a("SubTaskTracker", "getSubTask error:Throwable: " + th.toString());
            return null;
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!oeb.X()) {
        } else {
            c.a("com.taobao.performance.CollectorManager", new c.a() { // from class: com.taobao.tao.flexbox.layoutmanager.usertracker.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.flexa.compat.c.a
                public void onClassLoaded(Class<?> cls) {
                    try {
                        if (a.a(a.this) != null) {
                            return;
                        }
                        a.a(a.this, (IPerformCollect) cls.newInstance());
                        a.a(a.this).onStart();
                    } catch (Throwable th) {
                        th.printStackTrace();
                        ogg.a("SubTaskTracker", "FlexaClass load CollectorManager error:Throwable: " + th.toString());
                        w.a(true, "type", "CollectorManager", "error", th.toString());
                    }
                }

                @Override // com.alibaba.flexa.compat.c.a
                public void onClassNotFound() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ad9dd2ef", new Object[]{this});
                        return;
                    }
                    ogg.a("SubTaskTracker", "FlexaClass load CollectorManager error:onClassNotFound");
                    w.a(true, "type", "CollectorManager", "error", "ClassNotFound");
                }
            });
        }
    }

    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        b bVar = f20497a.get(str);
        if (bVar == null) {
            return;
        }
        b.a(bVar, map);
    }

    public JSONArray a(String str) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("e47bc7cc", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            str = this.d;
        }
        if (TextUtils.isEmpty(str) && (bVar = this.c) != null) {
            return b.b(bVar);
        }
        b bVar2 = f20497a.get(str);
        if (bVar2 != null) {
            return b.b(bVar2);
        }
        b bVar3 = this.c;
        if (bVar3 == null) {
            return null;
        }
        return b.b(bVar3);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            d(str, GG_PICK_NATIVE_TASKS);
        }
    }

    public void d(final String str, final String str2) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
            return;
        }
        b bVar2 = f20497a.get(str);
        final b bVar3 = (bVar2 != null || (bVar = this.c) == null) ? bVar2 : bVar;
        if (bVar3 == null || b.b(bVar3).isEmpty()) {
            return;
        }
        IPerformCollect iPerformCollect = this.h;
        if (iPerformCollect != null) {
            iPerformCollect.onEnd();
        }
        IPerformCollect iPerformCollect2 = this.h;
        final JSONObject data = iPerformCollect2 != null ? iPerformCollect2.getData() : null;
        this.g.postDelayed(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.usertracker.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pageName", (Object) "ShortVideoMonitor");
                jSONObject.put(PopConst.POP_EVENT_ID_KEY, (Object) 19997);
                jSONObject.put("arg1", (Object) str);
                jSONObject.put("arg2", (Object) "page_enter");
                jSONObject.put("arg3", (Object) str2);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("subtasks", (Object) b.b(bVar3));
                jSONObject2.put("properties", (Object) b.c(bVar3));
                jSONObject2.put(MspGlobalDefine.SESSION, (Object) Long.valueOf(b.a(bVar3)));
                jSONObject2.put("index", (Object) Integer.valueOf(b.d(bVar3)));
                jSONObject2.put("time", (Object) Long.valueOf(System.currentTimeMillis()));
                JSONObject jSONObject3 = data;
                if (jSONObject3 != null) {
                    jSONObject2.put(nfc.PHA_MONITOR_MODULE_POINT_PERFORMANCE, (Object) jSONObject3);
                }
                jSONObject.put("args", (Object) jSONObject2);
                TrackerModule.commit(new g.c(null, jSONObject, null), false);
                ogg.a("SubTaskTracker", str + " commitSubTaskInfos" + b.b(bVar3).toJSONString());
            }
        }, 1000L);
        f20497a.remove(str);
        this.d = null;
        this.h = null;
        this.i = null;
    }
}
