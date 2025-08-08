package com.alipay.android.msp.framework.dynfun;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.EventLogUtilMig;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import com.taobao.android.weex_framework.MUSAppMonitor;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class NativeDynFunManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final ConcurrentHashMap<Integer, HashSet<String>> b = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<Integer, ConcurrentHashMap<String, DynDataWrapper<?>>> c = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap<Integer, ConcurrentHashMap<String, Pair<ResultCallbackFunction<?>, FallbackFunction<?>>>> f4698a = new ConcurrentHashMap<>();

    /* loaded from: classes3.dex */
    public @interface EventId {
        public static final String EV_ID_ANS = "1010516";
        public static final String EV_ID_ERR = "1010515";
    }

    /* loaded from: classes3.dex */
    public @interface EventPhase {
        public static final int EV_PH_1_SEND_REQ = 1;
        public static final int EV_PH_2_GOT_REQ = 2;
        public static final int EV_PH_3_SEND_RESP = 3;
        public static final int EV_PH_4_GOT_RESP = 4;
    }

    /* loaded from: classes3.dex */
    public interface FallbackFunction<R> {
        public static final Noop noop = new Noop();

        /* loaded from: classes3.dex */
        public static class Noop implements FallbackFunction<Void> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.msp.framework.dynfun.NativeDynFunManager.FallbackFunction
            public Void call() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Void) ipChange.ipc$dispatch("b898ca78", new Object[]{this});
                }
                return null;
            }
        }

        R call();
    }

    /* loaded from: classes3.dex */
    public interface ResultCallbackFunction<T> {
        public static final Noop<?> noop = new Noop<>();

        /* loaded from: classes3.dex */
        public static class Noop<X> implements ResultCallbackFunction<X> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.msp.framework.dynfun.NativeDynFunManager.ResultCallbackFunction
            public void onResult(X x) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8251d27f", new Object[]{this, x});
                }
            }
        }

        void onResult(T t);
    }

    /* loaded from: classes3.dex */
    public static final class TargetTplNotFoundException extends Exception {
        private TargetTplNotFoundException() {
        }
    }

    private static void a(TplMsg tplMsg) throws TargetTplNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c4fe98a", new Object[]{tplMsg});
            return;
        }
        LogUtil.record(1, "NativeDynFunManager", StEvent.SEND_MSG, "sending ".concat(String.valueOf(tplMsg)));
        if (tplMsg == null) {
            return;
        }
        try {
            Pair<TplIdentity, FBDocument> findOneTpl = NativeTplRuntimeManager.findOneTpl(tplMsg.to);
            if (findOneTpl != null) {
                final FBDocument fBDocument = (FBDocument) findOneTpl.second;
                final String str = "window.__on_msp_msg && window.__on_msp_msg(" + tplMsg.toJSON().toJSONString() + ");";
                if (TaskHelper.isMainThread()) {
                    fBDocument.executeJs(str);
                    return;
                } else {
                    TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.framework.dynfun.NativeDynFunManager.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                FBDocument.this.executeJs(str);
                            }
                        }
                    });
                    return;
                }
            }
            LogUtil.record(4, "NativeDynFunManager", StEvent.SEND_MSG, "no target ".concat(String.valueOf(tplMsg)));
            throw new TargetTplNotFoundException();
        } catch (TargetTplNotFoundException e) {
            throw e;
        } catch (Exception e2) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.WARNING, ErrorCode.DYN_FUN_SEND_EX, e2);
            LogUtil.record(4, "NativeDynFunManager", StEvent.SEND_MSG, "exception caught while sending ".concat(String.valueOf(tplMsg)));
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:64|(1:66)(1:138)|(1:68)(1:137)|(1:70)(1:136)|71|72|73|74|(4:(1:(1:(1:(10:81|82|83|(1:85)|86|87|88|89|90|91)(5:98|(1:100)(1:107)|101|(1:103)(1:106)|104))(3:108|(1:110)(1:112)|111))(3:113|(1:115)(1:117)|116))(3:118|(2:121|119)|122)|89|90|91)|105|83|(0)|86|87|88) */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0255, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0256, code lost:
        com.alipay.android.msp.utils.LogUtil.record(4, "NativeDynFunManager", com.alipay.android.msp.framework.statisticsv2.model.StEvent.RECV_MSG, "ret j err: ".concat(java.lang.String.valueOf(r0)));
        r20 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0237  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void recvMsg(com.alipay.android.msp.framework.dynfun.TplMsg r22) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.dynfun.NativeDynFunManager.recvMsg(com.alipay.android.msp.framework.dynfun.TplMsg):void");
    }

    private static synchronized void a(int i, Collection<String> collection) {
        synchronized (NativeDynFunManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5b3eb0c", new Object[]{new Integer(i), collection});
                return;
            }
            if (collection != null && !collection.isEmpty()) {
                HashSet<String> hashSet = b.get(Integer.valueOf(i));
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                    b.put(Integer.valueOf(i), hashSet);
                }
                hashSet.addAll(collection);
            }
        }
    }

    public static synchronized <T> void registerData(int i, String str, DynDataWrapper<T> dynDataWrapper) throws RuntimeException {
        synchronized (NativeDynFunManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82de1bfc", new Object[]{new Integer(i), str, dynDataWrapper});
                return;
            }
            if (!StringUtils.isEmpty(str) && dynDataWrapper != null) {
                ConcurrentHashMap<String, DynDataWrapper<?>> concurrentHashMap = c.get(Integer.valueOf(i));
                if (concurrentHashMap == null) {
                    concurrentHashMap = new ConcurrentHashMap<>();
                    c.put(Integer.valueOf(i), concurrentHashMap);
                }
                if (concurrentHashMap.containsKey(str)) {
                    LogUtil.record(4, "NativeDynFunManager:registerData", "dataName: " + str + " has already registered");
                }
                concurrentHashMap.put(str, dynDataWrapper);
            }
        }
    }

    public static synchronized void garbageRemoval(int i) {
        synchronized (NativeDynFunManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0618fc5", new Object[]{new Integer(i)});
                return;
            }
            c.remove(Integer.valueOf(i));
            b.remove(Integer.valueOf(i));
            f4698a.remove(Integer.valueOf(i));
        }
    }

    private static synchronized void a(int i, String str, Object obj) {
        synchronized (NativeDynFunManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("33931d41", new Object[]{new Integer(i), str, obj});
            } else if (StringUtils.isEmpty(str)) {
                throw new RuntimeException("missing dataName");
            } else {
                ConcurrentHashMap<String, DynDataWrapper<?>> concurrentHashMap = c.get(Integer.valueOf(i));
                if (concurrentHashMap != null && concurrentHashMap.containsKey(str)) {
                    concurrentHashMap.get(str).a(obj);
                }
            }
        }
    }

    private static synchronized Object a(int i, String str) {
        synchronized (NativeDynFunManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("da8a292d", new Object[]{new Integer(i), str});
            } else if (StringUtils.isEmpty(str)) {
                throw new RuntimeException("missing dataName");
            } else {
                ConcurrentHashMap<String, DynDataWrapper<?>> concurrentHashMap = c.get(Integer.valueOf(i));
                if (concurrentHashMap != null && concurrentHashMap.containsKey(str)) {
                    return concurrentHashMap.get(str).read();
                }
                return null;
            }
        }
    }

    public static <R> R processWithFallbackSync(int i, String str, Object[] objArr, FallbackFunction<R> fallbackFunction) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (R) ipChange.ipc$dispatch("ae3edf10", new Object[]{new Integer(i), str, objArr, fallbackFunction}) : (R) processWithFallbackSync(i, str, objArr, fallbackFunction, 2000L);
    }

    public static <R> R processWithFallbackSync(int i, final String str, Object[] objArr, FallbackFunction<R> fallbackFunction, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (R) ipChange.ipc$dispatch("b593b4d0", new Object[]{new Integer(i), str, objArr, fallbackFunction, new Long(j)});
        }
        if (!drmEnabled()) {
            return fallbackFunction.call();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        LogUtil.record(1, "NativeDynFunManager", "processWithFallbackSync", "invoking " + str + " on " + i);
        if (TaskHelper.isMainThread()) {
            LogUtil.record(4, "NativeDynFunManager", "processWithFallbackSync", "MUST NOT called on main thread: ".concat(String.valueOf(str)));
            antEventErr("fallback 1", str, Integer.valueOf(i));
            return fallbackFunction.call();
        }
        final Object obj = new Object();
        final Object[] objArr2 = {null, null};
        if (a(i, str, objArr, new FallbackFunction<Void>() { // from class: com.alipay.android.msp.framework.dynfun.NativeDynFunManager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.msp.framework.dynfun.NativeDynFunManager.FallbackFunction
            public Void call() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("b898ca78", new Object[]{this});
                }
                LogUtil.record(1, "NativeDynFunManager", "processWithFallbackSync", "got fallback from async of " + str);
                return null;
            }
        }, new ResultCallbackFunction<R>() { // from class: com.alipay.android.msp.framework.dynfun.NativeDynFunManager.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.msp.framework.dynfun.NativeDynFunManager.ResultCallbackFunction
            public void onResult(R r) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8251d27f", new Object[]{this, r});
                    return;
                }
                synchronized (obj) {
                    LogUtil.record(1, "NativeDynFunManager", "processWithFallbackSync", "got result from async of " + str + "," + r);
                    objArr2[0] = Boolean.TRUE;
                    objArr2[1] = r;
                    obj.notifyAll();
                }
            }
        })) {
            try {
                synchronized (obj) {
                    obj.wait(j);
                }
                LogUtil.record(1, "NativeDynFunManager", "processWithFallbackSync", "returning for " + str + ", " + Arrays.toString(objArr2));
                if (Boolean.TRUE.equals(objArr2[0])) {
                    antEventCall(str, 4, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), Integer.valueOf(i));
                    return (R) objArr2[1];
                }
                antEventErr("d_timeout", str, Integer.valueOf(i));
                return fallbackFunction.call();
            } catch (Exception e) {
                LogUtil.record(4, "NativeDynFunManager", "processWithFallbackSync", "exception on waiting ".concat(String.valueOf(str)));
                e.printStackTrace();
                antEventErr("fallback 2", str, Integer.valueOf(i));
                return fallbackFunction.call();
            }
        }
        return fallbackFunction.call();
    }

    public static <T> boolean processWithFallbackAsync(final int i, final String str, Object[] objArr, final FallbackFunction<Void> fallbackFunction, final ResultCallbackFunction<T> resultCallbackFunction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dde9341e", new Object[]{new Integer(i), str, objArr, fallbackFunction, resultCallbackFunction})).booleanValue();
        }
        if (!drmEnabled()) {
            fallbackFunction.call();
            return true;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        return a(i, str, objArr, new FallbackFunction<Void>() { // from class: com.alipay.android.msp.framework.dynfun.NativeDynFunManager.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.msp.framework.dynfun.NativeDynFunManager.FallbackFunction
            public Void call() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("b898ca78", new Object[]{this});
                }
                FallbackFunction.this.call();
                return null;
            }
        }, new ResultCallbackFunction<T>() { // from class: com.alipay.android.msp.framework.dynfun.NativeDynFunManager.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.msp.framework.dynfun.NativeDynFunManager.ResultCallbackFunction
            public void onResult(T t) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8251d27f", new Object[]{this, t});
                    return;
                }
                NativeDynFunManager.antEventCall(str, 4, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), Integer.valueOf(i));
                resultCallbackFunction.onResult(t);
            }
        });
    }

    private static <T> boolean a(int i, String str, Object[] objArr, FallbackFunction<Void> fallbackFunction, ResultCallbackFunction<T> resultCallbackFunction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3db4739a", new Object[]{new Integer(i), str, objArr, fallbackFunction, resultCallbackFunction})).booleanValue();
        }
        LogUtil.record(1, "NativeDynFunManager", "processWithFallbackAsync", "invoking " + str + " on " + i);
        HashSet<String> hashSet = b.get(Integer.valueOf(i));
        if (hashSet == null) {
            LogUtil.record(4, "NativeDynFunManager", "processWithFallbackAsync", "missing fun 1 ".concat(String.valueOf(str)));
            fallbackFunction.call();
            return false;
        } else if (!hashSet.contains(str)) {
            LogUtil.record(4, "NativeDynFunManager", "processWithFallbackAsync", "missing fun 2 ".concat(String.valueOf(str)));
            fallbackFunction.call();
            return false;
        } else {
            antEventCall(str, 1, 0L, Integer.valueOf(i));
            Pair<TplIdentity, FBDocument> findOneTpl = NativeTplRuntimeManager.findOneTpl(TplIdentity.generateSpec(null, Integer.valueOf(i), Boolean.TRUE));
            if (findOneTpl == null) {
                LogUtil.record(4, "NativeDynFunManager", "processWithFallbackAsync", "missing worker for ".concat(String.valueOf(str)));
                antEventErr("d_tpl_not_found", str, Integer.valueOf(i));
                fallbackFunction.call();
                return false;
            }
            TplMsg generate = TplMsg.generate(null, "f", null, (TplIdentity) findOneTpl.first, (JSONObject) JSON.toJSON(new TplMsg.TplMsgPayloadCall(str, Arrays.asList(objArr))), null);
            ConcurrentHashMap<String, Pair<ResultCallbackFunction<?>, FallbackFunction<?>>> concurrentHashMap = f4698a.get(Integer.valueOf(i));
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap<>();
                f4698a.put(Integer.valueOf(i), concurrentHashMap);
            }
            concurrentHashMap.put(generate.id, new Pair<>(resultCallbackFunction, fallbackFunction));
            try {
                a(generate);
                return true;
            } catch (TargetTplNotFoundException unused) {
                LogUtil.record(4, "NativeDynFunManager", "processWithFallbackAsync", "missing worker 2 for ".concat(String.valueOf(str)));
                fallbackFunction.call();
                concurrentHashMap.remove(generate.id);
                return false;
            }
        }
    }

    public static void antEvent(String str, String str2, Integer num, Long l, String str3, String str4, Integer num2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81ab19fb", new Object[]{str, str2, num, l, str3, str4, num2});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("type", "native");
            if (str2 != null) {
                hashMap.put("method_name", str2);
            }
            if (num != null) {
                hashMap.put("phase", String.valueOf(num));
            }
            if (l != null) {
                hashMap.put("time", String.valueOf(l));
            }
            if (str3 != null) {
                hashMap.put("result_msg", str3);
            }
            if (str4 != null) {
                hashMap.put(MUSAppMonitor.ERROR_MSG, str4);
            }
            if (num2 != null) {
                EventLogUtilMig.appendBizInfoToLogMap(hashMap, num2.intValue());
            }
            EventLogUtil.logPayEvent(str, hashMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void antEventErr(String str, String str2, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4287dca", new Object[]{str, str2, num});
        } else {
            antEvent(EventId.EV_ID_ERR, str2, null, null, null, str, num);
        }
    }

    public static void antEventCall(String str, Integer num, Long l, Integer num2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7147643", new Object[]{str, num, l, num2});
            return;
        }
        LogUtil.record(2, "NativeDynFunManager", "msp-msg: " + str + ", " + num + ", " + l + ", " + num2);
    }

    public static boolean drmEnabled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c604402d", new Object[0])).booleanValue() : DynConstants.a();
    }

    public static boolean drmVerifyEnabled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c0f9d34", new Object[0])).booleanValue() : DynConstants.b();
    }
}
