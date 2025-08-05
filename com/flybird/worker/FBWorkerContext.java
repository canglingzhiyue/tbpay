package com.flybird.worker;

import android.content.Context;
import android.os.Message;
import com.alipay.android.app.template.JSPlugin;
import com.alipay.android.app.template.JSPluginManager;
import com.alipay.birdnest.api.BirdNestEngine;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocumentAssistor;
import com.flybird.support.basics.AppContextHolder;
import com.flybird.worker.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import tb.cul;
import tb.cun;
import tb.ieb;

/* loaded from: classes4.dex */
public class FBWorkerContext implements JSPlugin.ISession, a.InterfaceC0257a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int JS_SUCCESS = 0;
    private static final String NS_EXTHUB = "exthub.";
    private static final String NS_FB = "fb.";
    private static final String TAG = "FBWorkerCtx";
    private Context androidContext;
    private b delegate;
    private BirdNestEngine engine;
    private long nWorker;
    private List<cul<FBWorkerContext, Void>> onDestroyTasks;
    private com.flybird.worker.b safeHandler;
    private com.flybird.worker.a timer = new com.flybird.worker.a(this);
    private String tplId;

    /* loaded from: classes4.dex */
    public static class a {
    }

    /* loaded from: classes4.dex */
    public interface b {
        Object a(String str);
    }

    /* loaded from: classes4.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        public long f7239a;
        public Object b;

        public c(FBWorkerContext fBWorkerContext, long j, Object obj) {
            this.f7239a = j;
            this.b = obj;
        }
    }

    public FBWorkerContext() {
        this.nWorker = 0L;
        this.nWorker = nCreate();
    }

    private void _handleJSInvoke(boolean z, final boolean z2, String str, String str2, final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b58befe", new Object[]{this, new Boolean(z), new Boolean(z2), str, str2, cVar});
            return;
        }
        JSPluginManager instanse = JSPluginManager.getInstanse();
        if (z) {
            if (str.startsWith(NS_FB)) {
                String substring = str.substring(3);
                Context context = this.androidContext;
                BirdNestEngine birdNestEngine = this.engine;
                JSPlugin.FromCall fromCall = JSPlugin.FromCall.INVOKE;
                JSPlugin registeredPlugin = instanse.getRegisteredPlugin(context, birdNestEngine, fromCall, substring, true);
                if (registeredPlugin != null) {
                    sendInvokeResult(cVar, registeredPlugin.execute(fromCall, substring, str2, null, 0L, this.androidContext, this), z2);
                    return;
                } else if (!instanse.isExtHubValid(substring)) {
                    return;
                } else {
                    instanse.invokeOnExtHub(this.androidContext, substring, str2, new JSPluginManager.ExtHubCallback() { // from class: com.flybird.worker.FBWorkerContext.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.android.app.template.JSPluginManager.ExtHubCallback
                        public void a(JSONObject jSONObject) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("32861656", new Object[]{this, jSONObject});
                            } else {
                                FBWorkerContext.access$000(FBWorkerContext.this, cVar, jSONObject, z2);
                            }
                        }
                    }, this);
                    return;
                }
            } else if (str.startsWith(NS_EXTHUB)) {
                try {
                    instanse.invokeOnExtHub(this.androidContext, str.substring(7), str2, new JSPluginManager.ExtHubCallback() { // from class: com.flybird.worker.FBWorkerContext.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.android.app.template.JSPluginManager.ExtHubCallback
                        public void a(JSONObject jSONObject) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("32861656", new Object[]{this, jSONObject});
                            } else {
                                FBWorkerContext.access$000(FBWorkerContext.this, cVar, jSONObject, z2);
                            }
                        }
                    }, this);
                    return;
                } catch (Throwable th) {
                    cun.a(TAG, "handleJs failed", th);
                    return;
                }
            } else {
                _handleJSInvokeNoSpace(instanse, z2, str, str2, cVar);
                return;
            }
        }
        _handleJSInvokeNoSpace(instanse, z2, str, str2, cVar);
    }

    private void _handleJSInvokeNoSpace(JSPluginManager jSPluginManager, boolean z, String str, String str2, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c43ad87", new Object[]{this, jSPluginManager, new Boolean(z), str, str2, cVar});
            return;
        }
        Context context = this.androidContext;
        BirdNestEngine birdNestEngine = this.engine;
        JSPlugin.FromCall fromCall = JSPlugin.FromCall.INVOKE;
        JSPlugin registeredPlugin = jSPluginManager.getRegisteredPlugin(context, birdNestEngine, fromCall, str, true);
        if (registeredPlugin == null) {
            return;
        }
        sendInvokeResult(cVar, registeredPlugin.execute(fromCall, str, str2, null, 0L, this.androidContext, this), z);
    }

    public static /* synthetic */ void access$000(FBWorkerContext fBWorkerContext, c cVar, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc19902c", new Object[]{fBWorkerContext, cVar, obj, new Boolean(z)});
        } else {
            fBWorkerContext.sendInvokeResult(cVar, obj, z);
        }
    }

    private a buildJSResponse(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("7fa777b", new Object[]{this, new Integer(i), str, str2});
        }
        a aVar = new a();
        if (i == 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.getInt("code");
                jSONObject.optString("message");
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null) {
                    optJSONObject.toString();
                }
            } catch (Throwable th) {
                cun.a(TAG, "buildJSResponse, data = " + str, th);
            }
        }
        return aVar;
    }

    private void cancelTimer(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4219f551", new Object[]{this, new Integer(i)});
        } else {
            this.timer.c.removeMessages(i);
        }
    }

    private String clientInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5fe4d980", new Object[]{this});
        }
        BirdNestEngine birdNestEngine = this.engine;
        return (birdNestEngine == null || birdNestEngine.getConfig() == null || this.engine.getConfig().getDevicePropProvider() == null) ? "{}" : this.engine.getConfig().getDevicePropProvider().getProperty("getClientInfo", null);
    }

    private int createTimer(int i, boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9361c2f6", new Object[]{this, new Integer(i), new Boolean(z), new Long(j)})).intValue();
        }
        com.flybird.worker.a aVar = this.timer;
        a.b bVar = new a.b(aVar);
        int andIncrement = aVar.b.getAndIncrement();
        bVar.f7241a = andIncrement;
        bVar.b = i;
        bVar.c = z;
        bVar.d = j;
        aVar.c.sendMessageDelayed(Message.obtain(aVar.c, andIncrement, bVar), bVar.b);
        return bVar.f7241a;
    }

    private String getStorageForKey(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2efbe118", new Object[]{this, str, new Boolean(z)}) : FBDocumentAssistor.a(getEngine().inMemKV, str, z);
    }

    private void handleConsoleLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a18b7f86", new Object[]{this, str});
        }
    }

    private void handleJSException(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff237df9", new Object[]{this, str, str2});
        } else {
            FBDocumentAssistor.a(this.tplId, str, str2);
        }
    }

    private boolean handleJSInvoke(long j, final String str, final String str2, long j2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c02d7940", new Object[]{this, new Long(j), str, str2, new Long(j2)})).booleanValue();
        }
        boolean z2 = (1 & j) != 0;
        if ((j & 2) != 0) {
            z = true;
        }
        final c cVar = new c(this, j2, this.delegate.a(str));
        final boolean z3 = z;
        final boolean z4 = z2;
        ieb.b.submit(new Runnable() { // from class: com.flybird.worker.-$$Lambda$FBWorkerContext$ryIAF5dR2aedM_bZOiq7gmrMfVE
            {
                FBWorkerContext.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FBWorkerContext.this.lambda$handleJSInvoke$1$FBWorkerContext(z3, z4, str, str2, cVar);
            }
        });
        return true;
    }

    private native boolean nConstructWorker(long j, String str, boolean z);

    private native long nCreate();

    private native void nDestroy(long j);

    private native boolean nFireTimer(long j, long j2);

    private native a nInvokeJS(long j, String str, String str2);

    private native void nInvokeJSCallback(long j, long j2, String str);

    private native void nNotifyEvent(long j, String str, String str2);

    private native boolean nRunWorker(long j, String str);

    private String readFile(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de2a0e80", new Object[]{this, str, new Integer(i)});
        }
        return null;
    }

    private void setStorage(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c76ac80", new Object[]{this, str, str2, new Boolean(z)});
        } else {
            FBDocumentAssistor.a(getEngine().inMemKV, str, str2, z);
        }
    }

    private void triggerOnDestroyTasks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7802a12", new Object[]{this});
            return;
        }
        final List<cul<FBWorkerContext, Void>> list = this.onDestroyTasks;
        if (list == null) {
            return;
        }
        this.onDestroyTasks = null;
        ieb.d.submit(new Runnable() { // from class: com.flybird.worker.-$$Lambda$FBWorkerContext$mEqSgU9rBLg0BObA_CpKn3ZUDzE
            {
                FBWorkerContext.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FBWorkerContext.this.lambda$triggerOnDestroyTasks$3$FBWorkerContext(list);
            }
        });
    }

    public void addOnDestroyTask(cul<FBWorkerContext, Void> culVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82a2a71c", new Object[]{this, culVar});
        } else if (this.nWorker == 0) {
        } else {
            synchronized (this) {
                if (this.nWorker == 0) {
                    return;
                }
                List<cul<FBWorkerContext, Void>> list = this.onDestroyTasks;
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(culVar);
                this.onDestroyTasks = list;
            }
        }
    }

    public boolean constructWorker(String str, String str2, b bVar, Context context, BirdNestEngine birdNestEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc93a460", new Object[]{this, str, str2, bVar, context, birdNestEngine})).booleanValue();
        }
        this.engine = birdNestEngine;
        this.androidContext = context;
        this.delegate = bVar;
        this.tplId = str2;
        return nConstructWorker(this.nWorker, str, AppContextHolder.b);
    }

    public void destroyWorker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8347349f", new Object[]{this});
            return;
        }
        long j = this.nWorker;
        if (j == 0) {
            return;
        }
        this.timer.c.removeCallbacksAndMessages(null);
        this.nWorker = 0L;
        nDestroy(j);
        triggerOnDestroyTasks();
        this.safeHandler = null;
        cun.b(TAG, "destroyWorker, worker = " + j);
    }

    public BirdNestEngine getEngine() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BirdNestEngine) ipChange.ipc$dispatch("66fb5877", new Object[]{this}) : this.engine;
    }

    public com.flybird.worker.b getSafeHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.flybird.worker.b) ipChange.ipc$dispatch("30954055", new Object[]{this}) : this.safeHandler;
    }

    @Override // com.flybird.worker.a.InterfaceC0257a
    public void handleTick(final a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3181edc", new Object[]{this, bVar});
        } else {
            new Runnable() { // from class: com.flybird.worker.-$$Lambda$FBWorkerContext$-8uTe2-bZr8n5uT86DUEO27tOhU
                @Override // java.lang.Runnable
                public final void run() {
                    FBWorkerContext.this.lambda$handleTick$0$FBWorkerContext(bVar);
                }
            };
        }
    }

    public a invokeJS(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("17ef0f7", new Object[]{this, str, str2}) : nInvokeJS(this.nWorker, str, str2);
    }

    public /* synthetic */ void lambda$handleJSInvoke$1$FBWorkerContext(boolean z, boolean z2, String str, String str2, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df62469", new Object[]{this, new Boolean(z), new Boolean(z2), str, str2, cVar});
        } else {
            _handleJSInvoke(z, z2, str, str2, cVar);
        }
    }

    public /* synthetic */ void lambda$handleTick$0$FBWorkerContext(a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f397865", new Object[]{this, bVar});
            return;
        }
        long j = this.nWorker;
        cun.b(TAG, "nFireTimer, worker = " + j + ", callback = " + bVar.d);
        nFireTimer(j, bVar.d);
    }

    public /* synthetic */ void lambda$sendInvokeResult$2$FBWorkerContext(Object obj, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9532b06", new Object[]{this, obj, cVar});
        } else {
            nInvokeJSCallback(this.nWorker, cVar.f7239a, obj == null ? "{}" : obj.toString());
        }
    }

    public /* synthetic */ void lambda$triggerOnDestroyTasks$3$FBWorkerContext(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596099f5", new Object[]{this, list});
            return;
        }
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((cul) it.next()).apply(this);
            }
        } catch (Throwable th) {
            cun.a(TAG, "triggerOnDestroyTasks err", th);
        }
    }

    public void notifyEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34ae6dec", new Object[]{this, str, str2});
        } else {
            nNotifyEvent(this.nWorker, str, str2);
        }
    }

    public boolean runWithData(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("90a07190", new Object[]{this, str})).booleanValue() : nRunWorker(this.nWorker, str);
    }

    public void setSafeHandler(com.flybird.worker.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d48370f", new Object[]{this, bVar});
        } else {
            this.safeHandler = bVar;
        }
    }

    private void sendInvokeResult(final c cVar, final Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2091b9", new Object[]{this, cVar, obj, new Boolean(z)});
        } else if (z) {
            cun.b(TAG, "sendInvokeResult ignore, useDetach = " + z);
        } else {
            new Runnable() { // from class: com.flybird.worker.-$$Lambda$FBWorkerContext$uEJ47hAcwn6TgD6w8i7lKoOGrGs
                {
                    FBWorkerContext.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FBWorkerContext.this.lambda$sendInvokeResult$2$FBWorkerContext(obj, cVar);
                }
            };
        }
    }
}
