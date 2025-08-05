package com.taobao.themis.kernel.ability;

import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.register.AbilityType;
import com.taobao.themis.kernel.ability.register.b;
import com.taobao.themis.kernel.adapter.IApiInvokerChainFactory;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.d;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.alo;
import tb.alq;
import tb.alr;
import tb.alu;
import tb.kge;
import tb.qox;
import tb.qoy;
import tb.qpt;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TMSAbilityManager";

    /* renamed from: a  reason: collision with root package name */
    public static volatile a f22485a;
    public static Map<String, Map<String, com.taobao.themis.kernel.ability.base.a>> b;
    public static Map<String, com.taobao.themis.kernel.ability.base.a> c;
    public static Map<String, alu> d;

    /* renamed from: com.taobao.themis.kernel.ability.a$4  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22489a = new int[AbilityType.values().length];

        static {
            try {
                f22489a[AbilityType.GLOBAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22489a[AbilityType.INSTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22489a[AbilityType.SUBPAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static /* synthetic */ void a(a aVar, d dVar, String str, JSONObject jSONObject, ApiContext apiContext, qox qoxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d0989b", new Object[]{aVar, dVar, str, jSONObject, apiContext, qoxVar});
        } else {
            aVar.b(dVar, str, jSONObject, apiContext, qoxVar);
        }
    }

    static {
        kge.a(-976659236);
        b = new ConcurrentHashMap();
        c = new ConcurrentHashMap();
        d = new ConcurrentHashMap();
    }

    public static synchronized a a() {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("26acde9d", new Object[0]);
            }
            if (f22485a == null) {
                f22485a = new a();
            }
            return f22485a;
        }
    }

    public void a(final d dVar, final String str, final JSONObject jSONObject, final ApiContext apiContext, final qox qoxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b07766a", new Object[]{this, dVar, str, jSONObject, apiContext, qoxVar});
        } else {
            ((IExecutorService) qpt.a(IExecutorService.class)).getExecutor(ExecutorType.JSAPI).execute(new Runnable() { // from class: com.taobao.themis.kernel.ability.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        a.a(a.this, dVar, str, jSONObject, apiContext, qoxVar);
                    }
                }
            });
        }
    }

    private void b(d dVar, String str, JSONObject jSONObject, ApiContext apiContext, qox qoxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faec5009", new Object[]{this, dVar, str, jSONObject, apiContext, qoxVar});
            return;
        }
        b a2 = com.taobao.themis.kernel.ability.register.c.a(str, apiContext.a());
        if (a2 == null) {
            TMSLogger.d(TAG, "cannot find ApiMeta " + str);
            qoxVar.a(qoy.a("1", "Api meta not found"), false);
            return;
        }
        com.taobao.themis.kernel.ability.base.a a3 = a(dVar, a2.b);
        if (a3 == null) {
            TMSLogger.d(TAG, "cannot create AbilityInstance");
            qoxVar.a(qoy.a("1", "cannot create AbilityInstance"), false);
            return;
        }
        ((IApiInvokerChainFactory) qpt.a(IApiInvokerChainFactory.class)).createApiInvokerChain(dVar, a3, a2, jSONObject).a(apiContext, new Object[1], qoxVar);
    }

    public qoy a(d dVar, String str, JSONObject jSONObject, ApiContext apiContext, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qoy) ipChange.ipc$dispatch("69fb38db", new Object[]{this, dVar, str, jSONObject, apiContext, new Long(j)});
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final qoy[] qoyVarArr = new qoy[1];
        try {
            b(dVar, str, jSONObject, apiContext, new qox() { // from class: com.taobao.themis.kernel.ability.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.qox
                public void a(qoy qoyVar, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7bdbcf97", new Object[]{this, qoyVar, new Boolean(z)});
                        return;
                    }
                    qoyVarArr[0] = qoyVar;
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(j, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                TMSLogger.d(TAG, "sync lock await error!");
            }
            if (qoyVarArr[0] == null) {
                TMSLogger.d(TAG, "callSync api TimeOut!");
                return qoy.a("9", "callSync timeout");
            }
            return qoyVarArr[0];
        } catch (Throwable th) {
            TMSLogger.b(TAG, "call Sync exception", th);
            countDownLatch.countDown();
            return qoy.a("6", Arrays.toString(th.getStackTrace()));
        }
    }

    public void a(f fVar, String str, final String str2, String str3, String str4, final String str5, JSONObject jSONObject, final qox qoxVar) {
        alu aluVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ecfc407", new Object[]{this, fVar, str, str2, str3, str4, str5, jSONObject, qoxVar});
            return;
        }
        alu aluVar2 = d.get(fVar.a());
        alr alrVar = new alr(fVar.h(), str);
        alrVar.a(new WeakReference<>(fVar.o()));
        if (aluVar2 == null) {
            aluVar = new alu(alrVar);
            d.put(fVar.a(), aluVar);
        } else {
            aluVar = aluVar2;
        }
        HashMap hashMap = new HashMap();
        alq alqVar = new alq(alrVar);
        alqVar.a((Map<String, Object>) hashMap);
        alqVar.a(fVar.h());
        alqVar.b(str3);
        try {
            aluVar.b(str4, str5, alqVar, jSONObject, new alo() { // from class: com.taobao.themis.kernel.ability.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.alo
                public void onCallback(ExecuteResult executeResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                        return;
                    }
                    com.taobao.themis.kernel.logger.a.b(com.taobao.themis.kernel.logger.a.MODULE_MEGA, str5, str2, com.taobao.themis.kernel.logger.a.a("Mega"), new JSONObject(executeResult.c()));
                    if (executeResult.d() == 0) {
                        qoxVar.a(new qoy(true, new JSONObject(executeResult.c())), false);
                    } else if (executeResult.d() == 1) {
                        if ("result".equals(executeResult.f()) && executeResult.e() == null) {
                            return;
                        }
                        qoxVar.a(new qoy(true, new JSONObject(executeResult.c())), true);
                    } else if (executeResult.d() == 99 || executeResult.d() <= 100) {
                    } else {
                        qoxVar.a(qoy.a("meg_error", JSON.toJSONString(executeResult.c())), false);
                    }
                }
            });
        } catch (Throwable th) {
            try {
                qoxVar.a(qoy.a("meg_error", JSON.toJSONString(a$a.c(th.getMessage()).c())), true);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public synchronized void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0caa16f", new Object[]{this, dVar});
            return;
        }
        d.remove(dVar.a());
        Map<String, com.taobao.themis.kernel.ability.base.a> remove = b.remove(dVar.a());
        if (remove != null && !remove.isEmpty()) {
            for (com.taobao.themis.kernel.ability.base.a aVar : remove.values()) {
                if (aVar != null) {
                    aVar.onFinalized();
                }
            }
        }
    }

    private synchronized com.taobao.themis.kernel.ability.base.a a(d dVar, com.taobao.themis.kernel.ability.register.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.themis.kernel.ability.base.a) ipChange.ipc$dispatch("e1439d89", new Object[]{this, dVar, aVar});
        }
        String name = aVar.f22497a.getName();
        Map<String, com.taobao.themis.kernel.ability.base.a> hashMap = new HashMap<>();
        int i = AnonymousClass4.f22489a[aVar.c.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                }
            } else if (dVar instanceof ITMSPage) {
                dVar = ((ITMSPage) dVar).b();
            }
            if (dVar == null) {
                TMSLogger.d(TAG, "findAbilityInstance but node is null");
            } else {
                Map<String, com.taobao.themis.kernel.ability.base.a> map = b.get(dVar.a());
                if (map != null) {
                    hashMap = map;
                } else {
                    b.put(dVar.a(), hashMap);
                }
            }
        } else {
            hashMap = c;
        }
        if (hashMap.containsKey(name)) {
            return hashMap.get(name);
        }
        com.taobao.themis.kernel.ability.base.a a2 = a(aVar.f22497a);
        if (a2 != null) {
            hashMap.put(name, a2);
        }
        return a2;
    }

    private com.taobao.themis.kernel.ability.base.a a(Class<? extends com.taobao.themis.kernel.ability.base.a> cls) {
        try {
            com.taobao.themis.kernel.ability.base.a newInstance = cls.newInstance();
            newInstance.onInitialized();
            return newInstance;
        } catch (Throwable th) {
            TMSLogger.b(TAG, "createAbilityInstance failed", th);
            return null;
        }
    }
}
