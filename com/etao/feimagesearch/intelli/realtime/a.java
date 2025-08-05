package com.etao.feimagesearch.intelli.realtime;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.intelli.realtime.mtop.a;
import com.etao.feimagesearch.mnn.realtime.k;
import com.etao.feimagesearch.mnn.realtime.l;
import com.etao.feimagesearch.util.ac;
import com.taobao.android.dinamicx.s;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;
import kotlin.TypeCastException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import tb.akl;
import tb.com;
import tb.cot;
import tb.coy;
import tb.cuk;
import tb.jbg;
import tb.kge;

/* loaded from: classes3.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final e Companion;
    public static final String TAG = "realtime_DataPool";
    private static final int r;
    private static final kotlin.d s;

    /* renamed from: a  reason: collision with root package name */
    private final HashSet<Integer> f6716a;
    private final HashSet<Integer> b;
    private final ConcurrentHashMap<Integer, ObjectCardWrapper> c;
    private final ConcurrentHashMap<Integer, d> d;
    private String e;
    private final AtomicBoolean f;
    private final ConcurrentHashMap<Integer, c> g;
    private final CopyOnWriteArrayList<String> h;
    private HandlerThread i;
    private final Handler j;
    private Handler k;
    private final AtomicBoolean l;
    private Bitmap m;
    private com.etao.feimagesearch.intelli.realtime.c n;
    private long o;
    private boolean p;
    private boolean q;

    /* loaded from: classes3.dex */
    public interface b {
        void a();

        void a(com.etao.feimagesearch.mnn.realtime.b bVar);
    }

    /* loaded from: classes3.dex */
    public static final class g extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HandlerThread f6722a;
        public final /* synthetic */ a b;

        public g(HandlerThread handlerThread, a aVar) {
            this.f6722a = handlerThread;
            this.b = aVar;
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.f6722a.quit();
            Handler g = a.g(this.b);
            if (g == null) {
                return;
            }
            g.removeCallbacksAndMessages(null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class i extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HandlerThread f6724a;
        public final /* synthetic */ a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(HandlerThread handlerThread, Looper looper, a aVar) {
            super(looper);
            this.f6724a = handlerThread;
            this.b = aVar;
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, msg});
                return;
            }
            q.c(msg, "msg");
            super.handleMessage(msg);
            if (a.a(this.b).get() || msg.what != 110001) {
                return;
            }
            a.b(this.b);
        }
    }

    /* loaded from: classes3.dex */
    public static final class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ com.etao.feimagesearch.mnn.realtime.h b;

        public j(com.etao.feimagesearch.mnn.realtime.h hVar) {
            this.b = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (a.a(a.this).get() || this.b.a() == null) {
            } else {
                ArrayList<l> a2 = this.b.a();
                if (a2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<com.etao.feimagesearch.mnn.realtime.RealtimeObject> /* = java.util.ArrayList<com.etao.feimagesearch.mnn.realtime.RealtimeObject> */");
                }
                Iterator<l> it = a2.iterator();
                while (it.hasNext()) {
                    l realtimeObject = it.next();
                    Bitmap b = this.b.b();
                    a aVar = a.this;
                    q.a((Object) realtimeObject, "realtimeObject");
                    ObjectCardWrapper a3 = a.a(aVar, realtimeObject);
                    if (b != null && a3 != null) {
                        Integer e = realtimeObject.e();
                        if (e != null && e.intValue() == 1) {
                            if (!a.c(a.this)) {
                                a.a(a.this, true);
                                k.Companion.a();
                            }
                            a.d(a.this).put(Integer.valueOf(realtimeObject.f()), new c(realtimeObject, b));
                        }
                        z = true;
                    }
                }
                if (!z) {
                    return;
                }
                String c = this.b.c();
                if (c != null) {
                    a.e(a.this).add(c);
                }
                a.a(a.this, this.b.b());
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ kotlin.reflect.k[] f6720a;

        static {
            kge.a(-709495129);
            f6720a = new kotlin.reflect.k[]{t.a(new PropertyReference1Impl(t.b(e.class), "instance", "getInstance()Lcom/etao/feimagesearch/intelli/realtime/DataPool;"))};
        }

        public final a a() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("855d14b1", new Object[]{this});
            } else {
                kotlin.d c = a.c();
                e eVar = a.Companion;
                value = c.getValue();
            }
            return (a) value;
        }

        private e() {
        }

        public /* synthetic */ e(o oVar) {
            this();
        }

        public final void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            cot.c(a.TAG, "muiseCardClicked: " + i);
            ObjectCardWrapper objectCardWrapper = (ObjectCardWrapper) a.h(a()).get(Integer.valueOf(i));
            if (objectCardWrapper == null) {
                return;
            }
            objectCardWrapper.a(true);
        }
    }

    private a() {
        this.f6716a = new HashSet<>();
        this.b = new HashSet<>();
        this.c = new ConcurrentHashMap<>();
        this.d = new ConcurrentHashMap<>();
        this.e = "";
        this.f = new AtomicBoolean(false);
        this.g = new ConcurrentHashMap<>(10);
        this.h = new CopyOnWriteArrayList<>();
        this.j = new Handler(Looper.getMainLooper());
        this.l = new AtomicBoolean(false);
    }

    public /* synthetic */ a(o oVar) {
        this();
    }

    public static final /* synthetic */ ObjectCardWrapper a(a aVar, l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ObjectCardWrapper) ipChange.ipc$dispatch("81d6a1bd", new Object[]{aVar, lVar}) : aVar.a(lVar);
    }

    public static final /* synthetic */ AtomicBoolean a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("92f676b1", new Object[]{aVar}) : aVar.l;
    }

    public static final /* synthetic */ void a(a aVar, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("911649d", new Object[]{aVar, bitmap});
        } else {
            aVar.m = bitmap;
        }
    }

    public static final /* synthetic */ void a(a aVar, JSONObject jSONObject, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a9b8f4", new Object[]{aVar, jSONObject, hashMap});
        } else {
            aVar.a(jSONObject, hashMap);
        }
    }

    public static final /* synthetic */ void a(a aVar, com.etao.feimagesearch.mnn.realtime.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4d6fe41", new Object[]{aVar, bVar});
        } else {
            aVar.a(bVar);
        }
    }

    public static final /* synthetic */ void a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7539a43", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.q = z;
        }
    }

    public static final /* synthetic */ void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d59090", new Object[]{aVar});
        } else {
            aVar.e();
        }
    }

    public static final /* synthetic */ kotlin.d c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kotlin.d) ipChange.ipc$dispatch("8055a8c5", new Object[0]) : s;
    }

    public static final /* synthetic */ boolean c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cda03273", new Object[]{aVar})).booleanValue() : aVar.q;
    }

    public static final /* synthetic */ ConcurrentHashMap d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("248bffd8", new Object[]{aVar}) : aVar.g;
    }

    public static final /* synthetic */ CopyOnWriteArrayList e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArrayList) ipChange.ipc$dispatch("a610111a", new Object[]{aVar}) : aVar.h;
    }

    public static final /* synthetic */ AtomicBoolean f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("aaaabe4c", new Object[]{aVar}) : aVar.f;
    }

    public static final /* synthetic */ Handler g(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("8d441efb", new Object[]{aVar}) : aVar.k;
    }

    public static final /* synthetic */ ConcurrentHashMap h(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("dea844dc", new Object[]{aVar}) : aVar.c;
    }

    static {
        kge.a(-576985569);
        Companion = new e(null);
        r = com.etao.feimagesearch.config.b.aG();
        s = kotlin.e.a(LazyThreadSafetyMode.SYNCHRONIZED, DataPool$Companion$instance$2.INSTANCE);
    }

    public final void a(com.etao.feimagesearch.intelli.realtime.c detector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a0bd76f", new Object[]{this, detector});
            return;
        }
        q.c(detector, "detector");
        this.n = detector;
        this.f6716a.clear();
        this.b.clear();
        this.e = "";
        this.p = false;
        this.q = false;
        this.o = System.currentTimeMillis();
        this.l.set(false);
        this.i = jbg.a("realtime_image_search");
        HandlerThread handlerThread = this.i;
        if (handlerThread == null) {
            return;
        }
        handlerThread.start();
        this.k = new i(handlerThread, handlerThread.getLooper(), this);
        Handler handler = this.k;
        if (handler == null) {
            return;
        }
        handler.sendEmptyMessageDelayed(s.DX_ERROR_CODE_SIGNAL_EXCEPTION_CRASH, 400L);
    }

    public final void a(com.etao.feimagesearch.mnn.realtime.h output) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("135ccae4", new Object[]{this, output});
            return;
        }
        q.c(output, "output");
        if (this.l.get()) {
            return;
        }
        this.j.post(new j(output));
    }

    private final ObjectCardWrapper a(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectCardWrapper) ipChange.ipc$dispatch("89902ee6", new Object[]{this, lVar});
        }
        this.f6716a.add(Integer.valueOf(lVar.f()));
        ObjectCardWrapper objectCardWrapper = this.c.get(Integer.valueOf(lVar.f()));
        com.etao.feimagesearch.intelli.realtime.c cVar = this.n;
        if (cVar == null) {
            return null;
        }
        if (objectCardWrapper == null) {
            if (lVar.h() != 1) {
                return null;
            }
            d();
            FrameLayout d2 = cVar.d();
            q.a((Object) d2, "it.rootView");
            Context context = d2.getContext();
            q.a((Object) context, "it.rootView.context");
            FrameLayout d3 = cVar.d();
            q.a((Object) d3, "it.rootView");
            ObjectCardWrapper objectCardWrapper2 = new ObjectCardWrapper(context, d3, lVar, cVar, this.e);
            this.c.put(Integer.valueOf(lVar.f()), objectCardWrapper2);
            this.b.add(Integer.valueOf(lVar.f()));
            return objectCardWrapper2;
        }
        objectCardWrapper.a(lVar);
        return objectCardWrapper;
    }

    private final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.c.size() >= r) {
            int i2 = -1;
            int i3 = akl.SECOND_IN_NANOS;
            for (ObjectCardWrapper objectCardWrapper : this.c.values()) {
                Rect d2 = objectCardWrapper.c().d();
                int width = d2.width() * d2.height();
                if (width < i3) {
                    i2 = objectCardWrapper.c().f();
                    i3 = width;
                }
            }
            if (i2 <= 0) {
                return;
            }
            ObjectCardWrapper remove = this.c.remove(Integer.valueOf(i2));
            cot.b(TAG, "remove card " + i2);
            if (remove == null) {
                return;
            }
            remove.a();
        }
    }

    private final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        Handler handler = this.k;
        if (handler != null) {
            handler.removeMessages(s.DX_ERROR_CODE_SIGNAL_EXCEPTION_CRASH);
            handler.sendEmptyMessageDelayed(s.DX_ERROR_CODE_SIGNAL_EXCEPTION_CRASH, 400L);
        }
        if (this.g.size() == 0) {
            return;
        }
        if (this.f.get()) {
            cot.c(TAG, "is requesting");
            return;
        }
        HashMap<Integer, c> hashMap = new HashMap<>(this.g);
        String extraInfo = JSON.toJSONString(this.h);
        this.h.clear();
        this.g.clear();
        if (hashMap.size() <= 0) {
            return;
        }
        cot.c(TAG, "prepare fetchCloudMsg");
        k.Companion.b();
        String str = this.e;
        q.a((Object) extraInfo, "extraInfo");
        com.etao.feimagesearch.intelli.realtime.mtop.a.Companion.a(hashMap, new h(hashMap), str, extraInfo);
        this.f.set(true);
    }

    /* loaded from: classes3.dex */
    public static final class h implements a.C0228a.InterfaceC0229a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ HashMap b;

        public h(HashMap hashMap) {
            this.b = hashMap;
        }

        @Override // com.etao.feimagesearch.intelli.realtime.mtop.a.C0228a.InterfaceC0229a
        public void a(JSONObject data) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, data});
                return;
            }
            q.c(data, "data");
            StringBuilder sb = new StringBuilder();
            sb.append("onSuccess: threadName ");
            Thread currentThread = Thread.currentThread();
            q.a((Object) currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            cot.c(a.TAG, sb.toString());
            try {
                a.a(a.this, data, this.b);
            } catch (Exception e) {
                e.printStackTrace();
                a.f(a.this).set(false);
                k.Companion.a(false, 0);
            }
        }

        @Override // com.etao.feimagesearch.intelli.realtime.mtop.a.C0228a.InterfaceC0229a
        public void a(int i, String errorMsg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), errorMsg});
                return;
            }
            q.c(errorMsg, "errorMsg");
            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "metasightRequestFailed", 2101, "errorCode", String.valueOf(i), "errorMsg", errorMsg);
            cot.b(a.TAG, "onFailed: " + i + ", " + errorMsg);
            a.f(a.this).set(false);
            k.Companion.a(false, 0);
        }
    }

    private final void a(com.etao.feimagesearch.mnn.realtime.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("135a10aa", new Object[]{this, bVar});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("updateAlgoMsgResult: threadName ");
        Thread currentThread = Thread.currentThread();
        q.a((Object) currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        cot.c(TAG, sb.toString());
        if (this.l.get()) {
            return;
        }
        for (com.etao.feimagesearch.mnn.realtime.c cVar : bVar.a()) {
            if (cVar.b() == 1) {
                ObjectCardWrapper objectCardWrapper = this.c.get(Integer.valueOf(cVar.a()));
                d dVar = this.d.get(Integer.valueOf(cVar.a()));
                if (dVar != null && objectCardWrapper != null) {
                    objectCardWrapper.a(dVar);
                    if (!this.p) {
                        this.p = true;
                        cuk.a(com.b(), com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19063), 0);
                    }
                }
            }
        }
        this.d.clear();
        this.f.set(false);
    }

    private final void a(JSONObject jSONObject, HashMap<Integer, c> hashMap) {
        Iterator<Object> it;
        JSONObject jSONObject2 = jSONObject;
        HashMap<Integer, c> hashMap2 = hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2b992b", new Object[]{this, jSONObject2, hashMap2});
            return;
        }
        JSONArray jSONArray = new JSONArray();
        if (jSONObject2.get("realtimeResult") == null) {
            this.f.set(false);
            k.Companion.a(false, 0);
            return;
        }
        String str = (String) jSONObject2.get("mssid");
        if (str == null) {
            str = "";
        }
        Object obj = jSONObject2.get("realtimeResult");
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONArray");
        }
        JSONArray jSONArray2 = (JSONArray) obj;
        k.Companion.a(true, jSONArray2.size());
        Iterator<Object> it2 = jSONArray2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof JSONObject) {
                JSONObject jSONObject3 = (JSONObject) next;
                Object obj2 = jSONObject3.get("imageId");
                if (obj2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
                int parseInt = Integer.parseInt((String) obj2);
                c cVar = hashMap2.get(Integer.valueOf(parseInt));
                if (cVar == null) {
                    continue;
                } else {
                    q.a((Object) cVar, "canRequestObjectModelMap[number] ?: continue");
                    Bitmap b2 = cVar.b();
                    RectF l = cVar.a().l();
                    JSONObject jSONObject4 = (JSONObject) jSONObject3.get("objectData");
                    if (jSONObject4 != null) {
                        JSONArray jSONArray3 = (JSONArray) jSONObject4.get("algoInfos");
                        Object obj3 = jSONObject2.get("templates");
                        if (obj3 == null) {
                            throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONArray");
                        }
                        JSONArray jSONArray4 = (JSONArray) obj3;
                        if (jSONArray3 != null) {
                            it = it2;
                            this.d.put(Integer.valueOf(parseInt), new d(jSONObject4, jSONArray4, b2, l, str));
                            this.e = str;
                            JSONObject jSONObject5 = new JSONObject();
                            JSONObject jSONObject6 = jSONObject5;
                            jSONObject6.put((JSONObject) "imageId", (String) Integer.valueOf(parseInt));
                            jSONObject6.put((JSONObject) "returnList", (String) jSONArray3);
                            jSONArray.add(jSONObject5);
                            jSONObject2 = jSONObject;
                            hashMap2 = hashMap;
                            it2 = it;
                        } else {
                            jSONObject2 = jSONObject;
                            hashMap2 = hashMap;
                        }
                    }
                }
            }
            it = it2;
            jSONObject2 = jSONObject;
            hashMap2 = hashMap;
            it2 = it;
        }
        C0227a c0227a = new C0227a(jSONArray, new f(jSONArray));
        com.etao.feimagesearch.intelli.realtime.c cVar2 = this.n;
        if (cVar2 == null) {
            return;
        }
        cVar2.a(c0227a);
    }

    /* loaded from: classes3.dex */
    public static final class f implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JSONArray b;

        public f(JSONArray jSONArray) {
            this.b = jSONArray;
        }

        @Override // com.etao.feimagesearch.intelli.realtime.a.b
        public void a(com.etao.feimagesearch.mnn.realtime.b algoOutput) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("135a10aa", new Object[]{this, algoOutput});
                return;
            }
            q.c(algoOutput, "algoOutput");
            a.a(a.this, algoOutput);
            k.Companion.a(true, this.b.size(), algoOutput.a().size());
        }

        @Override // com.etao.feimagesearch.intelli.realtime.a.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            a.f(a.this).set(false);
            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "metasightTppReturnProcessFailed", 2101, new String[0]);
            k.Companion.a(false, this.b.size(), 0);
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        cot.c(TAG, "destroy");
        this.f6716a.clear();
        this.b.clear();
        this.h.clear();
        this.l.set(true);
        this.e = "";
        this.p = false;
        this.q = false;
        this.f.set(false);
        this.j.removeCallbacksAndMessages(null);
        for (ObjectCardWrapper objectCardWrapper : this.c.values()) {
            objectCardWrapper.a();
        }
        this.c.clear();
        this.d.clear();
        HandlerThread handlerThread = this.i;
        if (handlerThread != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                handlerThread.quitSafely();
                Handler handler = this.k;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } else {
                Handler handler2 = this.k;
                if (handler2 != null) {
                    handler2.post(new g(handlerThread, this));
                }
            }
        }
        this.m = null;
        this.n = null;
    }

    public final Collection<ObjectCardWrapper> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("846747e", new Object[]{this});
        }
        Collection<ObjectCardWrapper> values = this.c.values();
        q.a((Object) values, "objectCardHashMap.values");
        return values;
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final JSONObject f6719a;
        private final JSONArray b;
        private final Bitmap c;
        private final RectF d;
        private final String e;

        static {
            kge.a(-1057775384);
        }

        public d(JSONObject cloudObjectData, JSONArray templates, Bitmap frame, RectF originRateBox, String mssid) {
            q.c(cloudObjectData, "cloudObjectData");
            q.c(templates, "templates");
            q.c(frame, "frame");
            q.c(originRateBox, "originRateBox");
            q.c(mssid, "mssid");
            this.f6719a = cloudObjectData;
            this.b = templates;
            this.c = frame;
            this.d = originRateBox;
            this.e = mssid;
        }

        public final JSONObject a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.f6719a;
        }

        public final JSONArray b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("505e5935", new Object[]{this}) : this.b;
        }

        public final Bitmap c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("f13cc48", new Object[]{this}) : this.c;
        }

        public final RectF d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RectF) ipChange.ipc$dispatch("ca4a8e1c", new Object[]{this}) : this.d;
        }

        public final String e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.e;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final l f6718a;
        private final Bitmap b;

        static {
            kge.a(234477606);
        }

        public c(l realtimeObject, Bitmap frame) {
            q.c(realtimeObject, "realtimeObject");
            q.c(frame, "frame");
            this.f6718a = realtimeObject;
            this.b = frame;
        }

        public final l a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("522d90a0", new Object[]{this}) : this.f6718a;
        }

        public final Bitmap b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("e5c3e7c7", new Object[]{this}) : this.b;
        }
    }

    /* renamed from: com.etao.feimagesearch.intelli.realtime.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0227a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final JSONArray f6717a;
        private final b b;

        static {
            kge.a(371767053);
        }

        public C0227a(JSONArray algoMsg, b callback) {
            q.c(algoMsg, "algoMsg");
            q.c(callback, "callback");
            this.f6717a = algoMsg;
            this.b = callback;
        }

        public final JSONArray a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("dc1f20d6", new Object[]{this}) : this.f6717a;
        }

        public final b b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("a1f3fc34", new Object[]{this}) : this.b;
        }
    }
}
