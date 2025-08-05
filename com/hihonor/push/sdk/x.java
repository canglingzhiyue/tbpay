package com.hihonor.push.sdk;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.hihonor.push.framework.aidl.DataBuffer;
import com.hihonor.push.framework.aidl.IMessageEntity;
import com.hihonor.push.framework.aidl.IPushInvoke;
import com.hihonor.push.framework.aidl.MessageCodec;
import com.hihonor.push.framework.aidl.entity.RequestHeader;
import com.hihonor.push.sdk.ab;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;
import com.hihonor.push.sdk.ipc.HonorApiAvailability;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import tb.cwp;

/* loaded from: classes4.dex */
public class x implements Handler.Callback {
    public static final x c = new x();

    /* renamed from: a  reason: collision with root package name */
    public final Handler f7292a;
    public final Map<q, a> b = new ConcurrentHashMap(5, 0.75f, 1);

    /* loaded from: classes4.dex */
    public class a implements ab.a {

        /* renamed from: a  reason: collision with root package name */
        public final Queue<ai<?>> f7293a = new LinkedList();
        public final Queue<ai<?>> b = new LinkedList();
        public final ab c = new ae(this);
        public HonorPushErrorEnum d = null;
        public final q e;

        public a(q qVar) {
            this.e = qVar;
        }

        public void a() {
            e.a(x.this.f7292a);
            ae aeVar = (ae) this.c;
            int i = aeVar.f7263a.get();
            String str = "enter disconnect, connection Status: " + i;
            if (i != 3) {
                if (i != 5) {
                    return;
                }
                aeVar.f7263a.set(4);
                return;
            }
            ah ahVar = aeVar.d;
            if (ahVar != null) {
                ahVar.a();
            }
            aeVar.f7263a.set(1);
        }

        public final synchronized void a(ai<?> aiVar) {
            Type type;
            this.b.add(aiVar);
            ab abVar = this.c;
            b bVar = new b(aiVar);
            aiVar.getClass();
            Object obj = null;
            try {
                Type genericSuperclass = aiVar.getClass().getGenericSuperclass();
                Class cls = (genericSuperclass == null || (type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]) == null) ? null : (Class) type;
                if (cls != null && !cls.isPrimitive()) {
                    obj = cls.newInstance();
                }
            } catch (Exception e) {
                g.a("In newResponseInstance, instancing exception." + e.getMessage());
            }
            r rVar = new r(obj, bVar);
            String str = "start transport parse. " + aiVar.b;
            IPushInvoke iPushInvoke = ((ae) abVar).b;
            String str2 = aiVar.b;
            RequestHeader requestHeader = aiVar.e;
            IMessageEntity iMessageEntity = aiVar.c;
            Bundle bundle = new Bundle();
            Bundle bundle2 = new Bundle();
            MessageCodec.formMessageEntity(requestHeader, bundle);
            MessageCodec.formMessageEntity(iMessageEntity, bundle2);
            DataBuffer dataBuffer = new DataBuffer(str2, bundle, bundle2);
            if (iPushInvoke != null) {
                try {
                    iPushInvoke.call(dataBuffer, rVar);
                } catch (Exception e2) {
                    String str3 = "transport remote error. " + e2;
                }
            }
        }

        public final synchronized void a(HonorPushErrorEnum honorPushErrorEnum) {
            e.a(x.this.f7292a);
            for (ai<?> aiVar : this.f7293a) {
                aiVar.b(honorPushErrorEnum.toApiException(), null);
            }
            this.f7293a.clear();
            this.d = honorPushErrorEnum;
            a();
            x.this.b.remove(this.e);
        }

        public final synchronized void b() {
            e.a(x.this.f7292a);
            this.d = null;
            for (ai<?> aiVar : this.f7293a) {
                a(aiVar);
            }
            this.f7293a.clear();
        }
    }

    /* loaded from: classes4.dex */
    public static class b implements al {

        /* renamed from: a  reason: collision with root package name */
        public ai<?> f7294a;

        public b(ai<?> aiVar) {
            this.f7294a = aiVar;
        }
    }

    public x() {
        HandlerThread handlerThread = new HandlerThread("HonorApiManager");
        handlerThread.start();
        this.f7292a = new Handler(handlerThread.getLooper(), this);
    }

    public <TResult> y<TResult> a(ai<TResult> aiVar) {
        aq<TResult> aqVar = new aq<>();
        aiVar.f = aqVar;
        Handler handler = this.f7292a;
        handler.sendMessage(handler.obtainMessage(1, aiVar));
        return aqVar.f7269a;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        a aVar;
        int i = message.what;
        boolean z = false;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            ai aiVar = (ai) message.obj;
            q qVar = aiVar.d;
            if (qVar != null && this.b.containsKey(qVar) && (aVar = this.b.get(qVar)) != null) {
                synchronized (aVar) {
                    String str = "resolveResult apiCall " + aiVar.b;
                    aVar.b.remove(aiVar);
                    if (aVar.f7293a.peek() == null || aVar.b.peek() == null) {
                        aVar.a();
                        x.this.b.remove(aVar.e);
                    }
                }
            }
            return true;
        }
        ai<?> aiVar2 = (ai) message.obj;
        q qVar2 = aiVar2.d;
        a aVar2 = this.b.get(qVar2);
        if (aVar2 == null) {
            aVar2 = new a(qVar2);
            this.b.put(qVar2, aVar2);
        }
        synchronized (aVar2) {
            e.a(x.this.f7292a);
            String str2 = "sendRequest " + aiVar2.b;
            if (((ae) aVar2.c).a()) {
                aVar2.a(aiVar2);
            } else {
                aVar2.f7293a.add(aiVar2);
                HonorPushErrorEnum honorPushErrorEnum = aVar2.d;
                if (honorPushErrorEnum == null || honorPushErrorEnum.getErrorCode() == 0) {
                    synchronized (aVar2) {
                        e.a(x.this.f7292a);
                        if (!((ae) aVar2.c).a()) {
                            if (((ae) aVar2.c).f7263a.get() == 5) {
                                z = true;
                            }
                            if (!z) {
                                ae aeVar = (ae) aVar2.c;
                                aeVar.getClass();
                                int i2 = aeVar.f7263a.get();
                                String str3 = "enter connect, connection Status: " + i2;
                                if (i2 != 3 && i2 != 5 && i2 != 4) {
                                    k kVar = k.e;
                                    int a2 = HonorApiAvailability.a(kVar.a());
                                    if (a2 == HonorPushErrorEnum.SUCCESS.getErrorCode()) {
                                        aeVar.f7263a.set(5);
                                        cwp b2 = HonorApiAvailability.b(kVar.a());
                                        ah ahVar = new ah(b2);
                                        aeVar.d = ahVar;
                                        ahVar.b = new ad(aeVar);
                                        if (!b2.e()) {
                                            String str4 = "bind core is null : " + ahVar.f7265a;
                                            ahVar.a(8002004);
                                        } else {
                                            Intent intent = new Intent();
                                            String a3 = ahVar.f7265a.a();
                                            String c2 = ahVar.f7265a.c();
                                            String d = ahVar.f7265a.d();
                                            if (!TextUtils.isEmpty(d)) {
                                                intent.setComponent(new ComponentName(a3, d));
                                            } else {
                                                intent.setAction(c2);
                                                intent.setPackage(a3);
                                            }
                                            synchronized (ah.e) {
                                                if (kVar.a().bindService(intent, ahVar, 1)) {
                                                    Handler handler = ahVar.c;
                                                    if (handler != null) {
                                                        handler.removeMessages(1001);
                                                    } else {
                                                        ahVar.c = new Handler(Looper.getMainLooper(), new af(ahVar));
                                                    }
                                                    ahVar.c.sendEmptyMessageDelayed(1001, 10000L);
                                                } else {
                                                    ahVar.d = true;
                                                    ahVar.a(8002001);
                                                }
                                            }
                                        }
                                    } else {
                                        aeVar.a(a2);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    aVar2.a(aVar2.d);
                }
            }
        }
        return true;
    }
}
