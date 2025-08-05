package com.taobao.tbpoplayer.filter;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.norm.IUserCheckRequestListener;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.d;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.login4android.api.Login;
import com.taobao.tao.TaoPackageInfo;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tbpoplayer.filter.MtopGroupPreCheckManager;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.arz;
import tb.cag;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopGroupPreCheckManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private ConcurrentMap<String, Map<String, a>> f22209a = new ConcurrentHashMap();

    /* loaded from: classes8.dex */
    public enum RequestState {
        waiting,
        success,
        fail,
        noLogin
    }

    /* loaded from: classes8.dex */
    public class b {

        /* renamed from: a */
        public PopRequest f22211a;
        public JSONObject b;
        public IUserCheckRequestListener c;

        static {
            kge.a(1196574856);
        }

        public b(PopRequest popRequest, JSONObject jSONObject, IUserCheckRequestListener iUserCheckRequestListener) {
            MtopGroupPreCheckManager.this = r1;
            this.f22211a = popRequest;
            this.b = jSONObject;
            this.c = iUserCheckRequestListener;
        }
    }

    /* loaded from: classes8.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private static MtopGroupPreCheckManager f22212a;

        static {
            kge.a(-2113147059);
            f22212a = new MtopGroupPreCheckManager();
        }

        public static /* synthetic */ MtopGroupPreCheckManager a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MtopGroupPreCheckManager) ipChange.ipc$dispatch("9358edf", new Object[0]) : f22212a;
        }
    }

    static {
        kge.a(1253341818);
    }

    /* renamed from: lambda$AQe6m1ZPbo93ITtV4O-ypkl6WSY */
    public static /* synthetic */ void m1442lambda$AQe6m1ZPbo93ITtV4Oypkl6WSY(MtopGroupPreCheckManager mtopGroupPreCheckManager, String str, JSONObject jSONObject, d dVar, a aVar) {
        mtopGroupPreCheckManager.b(str, jSONObject, dVar, aVar);
    }

    public static /* synthetic */ void lambda$cJ0c7cXASjjTqmVO1QWM8yM1Wvg(MtopGroupPreCheckManager mtopGroupPreCheckManager, String str, JSONObject jSONObject, d dVar, a aVar) {
        mtopGroupPreCheckManager.d(str, jSONObject, dVar, aVar);
    }

    public static /* synthetic */ void lambda$efVZrJq4rOrxnHkvdp910jC0_Qo(MtopGroupPreCheckManager mtopGroupPreCheckManager, String str, JSONObject jSONObject, d dVar, a aVar) {
        mtopGroupPreCheckManager.c(str, jSONObject, dVar, aVar);
    }

    public static /* synthetic */ void a(MtopGroupPreCheckManager mtopGroupPreCheckManager, d dVar, String str, MtopResponse mtopResponse, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ced188ac", new Object[]{mtopGroupPreCheckManager, dVar, str, mtopResponse, aVar});
        } else {
            mtopGroupPreCheckManager.a(dVar, str, mtopResponse, aVar);
        }
    }

    public static MtopGroupPreCheckManager a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopGroupPreCheckManager) ipChange.ipc$dispatch("9358edf", new Object[0]) : c.a();
    }

    /* loaded from: classes8.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public volatile MtopResponse f22210a;
        public Map<String, String> c;
        public volatile OnePopModule i;
        public final Set<String> d = Collections.synchronizedSet(new HashSet());
        public final Map<String, b> e = new ConcurrentHashMap();
        public final Set<String> f = Collections.synchronizedSet(new HashSet());
        public final Set<String> g = Collections.synchronizedSet(new HashSet());
        public final Map<String, JSONObject> h = new ConcurrentHashMap();
        public volatile RequestState b = RequestState.waiting;

        static {
            kge.a(1850962459);
        }

        public static /* synthetic */ void lambda$abumJnWrQpcydjJEqICQrC3xZkI(a aVar) {
            aVar.b();
        }

        public static /* synthetic */ void lambda$n7aFz2J30VcNowjVaoxRNE5IKBo(a aVar, RequestState requestState, String str, OnePopModule.OnePopLoseReasonCode onePopLoseReasonCode, String str2, String str3) {
            aVar.b(requestState, str, onePopLoseReasonCode, str2, str3);
        }

        public a(d dVar, JSONObject jSONObject, IUserCheckRequestListener iUserCheckRequestListener) {
            MtopGroupPreCheckManager.this = r3;
            this.i = dVar.t();
            this.e.put(dVar.x().indexID, new b(dVar, jSONObject, iUserCheckRequestListener));
            this.d.addAll(cag.i().a(dVar.n(), dVar.x().preCheckGroupId));
            this.c = r3.a(dVar.n(), dVar.x().preCheckGroupId);
        }

        public void a(final RequestState requestState, final String str, final OnePopModule.OnePopLoseReasonCode onePopLoseReasonCode, final String str2, final String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a781c333", new Object[]{this, requestState, str, onePopLoseReasonCode, str2, str3});
                return;
            }
            try {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.tbpoplayer.filter.-$$Lambda$MtopGroupPreCheckManager$a$n7aFz2J30VcNowjVaoxRNE5IKBo
                    @Override // java.lang.Runnable
                    public final void run() {
                        MtopGroupPreCheckManager.a.lambda$n7aFz2J30VcNowjVaoxRNE5IKBo(MtopGroupPreCheckManager.a.this, requestState, str, onePopLoseReasonCode, str2, str3);
                    }
                });
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("MtopGroupInfo.triggerListenersOnFail.error.", th);
            }
        }

        public /* synthetic */ void b(RequestState requestState, String str, OnePopModule.OnePopLoseReasonCode onePopLoseReasonCode, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec0acf92", new Object[]{this, requestState, str, onePopLoseReasonCode, str2, str3});
                return;
            }
            this.b = requestState;
            for (String str4 : this.e.keySet()) {
                try {
                    b bVar = this.e.get(str4);
                    if (bVar != null && bVar.c != null) {
                        bVar.c.onFinished(false, str, onePopLoseReasonCode, str2, str3, null);
                    }
                } catch (Throwable th) {
                    com.alibaba.poplayer.utils.c.a("MtopGroupInfo.triggerListenersOnFail.onFinished.error.", th);
                }
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            try {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.tbpoplayer.filter.-$$Lambda$MtopGroupPreCheckManager$a$abumJnWrQpcydjJEqICQrC3xZkI
                    {
                        MtopGroupPreCheckManager.a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MtopGroupPreCheckManager.a.lambda$abumJnWrQpcydjJEqICQrC3xZkI(MtopGroupPreCheckManager.a.this);
                    }
                });
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("MtopGroupInfo.triggerListenersOnSuccess.error.", th);
            }
        }

        public /* synthetic */ void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            this.b = RequestState.success;
            for (String str : this.e.keySet()) {
                try {
                    b bVar = this.e.get(str);
                    a(str, bVar.b, bVar.f22211a, bVar.c);
                } catch (Throwable th) {
                    com.alibaba.poplayer.utils.c.a("MtopGroupInfo.triggerListenersOnSuccess.onFinished.error.", th);
                }
            }
        }

        public void a(String str, JSONObject jSONObject, PopRequest popRequest, IUserCheckRequestListener iUserCheckRequestListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70e4d12d", new Object[]{this, str, jSONObject, popRequest, iUserCheckRequestListener});
                return;
            }
            boolean contains = this.f.contains(str);
            JSONObject jSONObject2 = this.h.get(str);
            com.alibaba.poplayer.utils.c.b("triggerEvent", str, "MtopGroupPreCheckManager.dealMtopResponse.isApiSuccess=true.isPop=" + contains);
            if (contains) {
                iUserCheckRequestListener.onFinished(true, "", null, null, null, jSONObject2);
                return;
            }
            if (this.g.contains(str)) {
                com.taobao.tbpoplayer.filter.b.a().a(jSONObject.getString("falseAction"), popRequest);
            }
            iUserCheckRequestListener.onFinished(false, "", OnePopModule.OnePopLoseReasonCode.MtopPreCheckNoPop, com.taobao.tbpoplayer.filter.b.a().a(jSONObject2), null, null);
        }
    }

    public boolean a(PopRequest popRequest) {
        BaseConfigItem x;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9690e78", new Object[]{this, popRequest})).booleanValue() : (popRequest instanceof d) && (x = ((d) popRequest).x()) != null && !TextUtils.isEmpty(x.preCheckGroupId);
    }

    public boolean a(PopRequest popRequest, JSONObject jSONObject, IUserCheckRequestListener iUserCheckRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f77571ff", new Object[]{this, popRequest, jSONObject, iUserCheckRequestListener})).booleanValue();
        }
        try {
            String n = popRequest.n();
            BaseConfigItem x = ((d) popRequest).x();
            if (!this.f22209a.containsKey(n)) {
                a aVar = new a((d) popRequest, jSONObject, iUserCheckRequestListener);
                HashMap hashMap = new HashMap();
                hashMap.put(x.preCheckGroupId, aVar);
                this.f22209a.put(n, hashMap);
                a((d) popRequest, jSONObject, aVar);
            } else {
                Map<String, a> map = this.f22209a.get(n);
                if (!map.containsKey(x.preCheckGroupId)) {
                    a aVar2 = new a((d) popRequest, jSONObject, iUserCheckRequestListener);
                    map.put(x.preCheckGroupId, aVar2);
                    a((d) popRequest, jSONObject, aVar2);
                } else {
                    a aVar3 = map.get(x.preCheckGroupId);
                    MtopResponse mtopResponse = aVar3.f22210a;
                    if (aVar3.b == RequestState.waiting) {
                        aVar3.e.put(x.indexID, new b(popRequest, jSONObject, iUserCheckRequestListener));
                    } else if (aVar3.b == RequestState.fail) {
                        popRequest.t().W = aVar3.i.W;
                        popRequest.t().w = aVar3.i.w;
                        popRequest.t().aj = false;
                        iUserCheckRequestListener.onFinished(false, "", OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail, mtopResponse.getRetCode(), mtopResponse.getApi(), null);
                    } else if (aVar3.b == RequestState.success) {
                        popRequest.t().v = aVar3.i.v;
                        popRequest.t().w = aVar3.i.w;
                        popRequest.t().aj = false;
                        aVar3.a(x.indexID, jSONObject, popRequest, iUserCheckRequestListener);
                    } else if (aVar3.b == RequestState.noLogin) {
                        popRequest.t().aj = false;
                        iUserCheckRequestListener.onFinished(false, "", OnePopModule.OnePopLoseReasonCode.MtopPreCheckNoPop, "userIdEmpty", null, null);
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("MtopGroupPreCheckManager.startNewPreCheckGroup.error.", th);
            iUserCheckRequestListener.onFinished(false, "", OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail, "startGroupCheckError", null, null);
            return true;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            Iterator<String> it = this.f22209a.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!TextUtils.isEmpty(next) && (next.equals(str) || next.startsWith(str))) {
                    it.remove();
                }
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("MtopGroupPreCheckManager.cleanPageCacheRequests.error.", th);
        }
    }

    private void a(final d dVar, final JSONObject jSONObject, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("104d8572", new Object[]{this, dVar, jSONObject, aVar});
            return;
        }
        try {
            final String string = jSONObject.containsKey("name") ? jSONObject.getString("name") : "";
            long longValue = jSONObject.containsKey("sliceMs") ? jSONObject.getLong("sliceMs").longValue() : 0L;
            if (longValue > 0 && Build.VERSION.SDK_INT >= 19) {
                Handler handler = new Handler(Looper.getMainLooper());
                long abs = Math.abs(new SecureRandom().nextLong()) % longValue;
                String a2 = d.a(dVar);
                com.alibaba.poplayer.utils.c.b("triggerEvent", a2, "MtopGroupPreCheckManager.startPopCheckRequest.ReadyToExecute.name=" + string + ".sliceMs=" + longValue + ".delayMs=" + abs);
                handler.postDelayed(new Runnable() { // from class: com.taobao.tbpoplayer.filter.-$$Lambda$MtopGroupPreCheckManager$efVZrJq4rOrxnHkvdp910jC0_Qo
                    @Override // java.lang.Runnable
                    public final void run() {
                        MtopGroupPreCheckManager.lambda$efVZrJq4rOrxnHkvdp910jC0_Qo(MtopGroupPreCheckManager.this, string, jSONObject, dVar, aVar);
                    }
                }, abs);
                return;
            }
            String a3 = d.a(dVar);
            com.alibaba.poplayer.utils.c.b("triggerEvent", a3, "MtopGroupPreCheckManager.startPopCheckRequest.ReadyToExecute.name=" + string + ".NoDelay.");
            Coordinator.execute(new Runnable() { // from class: com.taobao.tbpoplayer.filter.-$$Lambda$MtopGroupPreCheckManager$AQe6m1ZPbo93ITtV4O-ypkl6WSY
                @Override // java.lang.Runnable
                public final void run() {
                    MtopGroupPreCheckManager.m1442lambda$AQe6m1ZPbo93ITtV4Oypkl6WSY(MtopGroupPreCheckManager.this, string, jSONObject, dVar, aVar);
                }
            }, 23);
        } catch (Throwable th) {
            aVar.a(RequestState.fail, "", OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail, "startError", "");
            com.alibaba.poplayer.utils.c.a("MtopGroupPreCheckManager.startPopCheckRequest.error", th);
        }
    }

    public /* synthetic */ void c(final String str, final JSONObject jSONObject, final d dVar, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a55701e", new Object[]{this, str, jSONObject, dVar, aVar});
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.tbpoplayer.filter.-$$Lambda$MtopGroupPreCheckManager$cJ0c7cXASjjTqmVO1QWM8yM1Wvg
                @Override // java.lang.Runnable
                public final void run() {
                    MtopGroupPreCheckManager.lambda$cJ0c7cXASjjTqmVO1QWM8yM1Wvg(MtopGroupPreCheckManager.this, str, jSONObject, dVar, aVar);
                }
            }, 23);
        }
    }

    public /* synthetic */ void d(String str, JSONObject jSONObject, d dVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2de3e1f", new Object[]{this, str, jSONObject, dVar, aVar});
        } else {
            a(str, jSONObject, dVar, aVar);
        }
    }

    public /* synthetic */ void b(String str, JSONObject jSONObject, d dVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61cca21d", new Object[]{this, str, jSONObject, dVar, aVar});
        } else {
            a(str, jSONObject, dVar, aVar);
        }
    }

    private void a(final String str, JSONObject jSONObject, final d dVar, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2943d41c", new Object[]{this, str, jSONObject, dVar, aVar});
            return;
        }
        try {
            if (!this.f22209a.containsKey(dVar.n())) {
                com.alibaba.poplayer.utils.c.b("pageLifeCycle", d.a(dVar), "MtopGroupPreCheckManager.sendUserCheckRequest.pageSwitched.");
                return;
            }
            String string = jSONObject.containsKey("version") ? jSONObject.getString("version") : "1.0";
            String string2 = jSONObject.containsKey("requestParams") ? jSONObject.getString("requestParams") : "";
            int intValue = jSONObject.containsKey("timeoutMs") ? jSONObject.getInteger("timeoutMs").intValue() : 3000;
            boolean booleanValue = jSONObject.getBooleanValue("login");
            boolean booleanValue2 = jSONObject.getBooleanValue("wua");
            if (booleanValue && TextUtils.isEmpty(Login.getUserId())) {
                dVar.t().aj = false;
                aVar.a(RequestState.noLogin, str, OnePopModule.OnePopLoseReasonCode.MtopPreCheckNoPop, "userIdEmpty", null);
                return;
            }
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName(str);
            mtopRequest.setVersion(string);
            mtopRequest.setNeedEcode(booleanValue);
            String a2 = d.a(dVar);
            com.alibaba.poplayer.utils.c.b("triggerEvent", a2, "MtopGroupPreCheckManager.ReadyToSend.names=" + str + ".needLogin=" + booleanValue + ".needECode=" + booleanValue);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("poplayerParams", (Object) dVar.x().params);
            jSONObject2.put("triggerUri", (Object) dVar.y().uri);
            jSONObject2.put("triggerParam", (Object) dVar.y().param);
            jSONObject2.put("uuid", (Object) a2);
            jSONObject2.put("preCheckGroupId", (Object) dVar.x().preCheckGroupId);
            jSONObject2.put("popEnableList", (Object) aVar.d);
            jSONObject2.put("popEnableMap", (Object) aVar.c);
            JSONObject jSONObject3 = new JSONObject();
            if (!TextUtils.isEmpty(string2)) {
                jSONObject3 = JSON.parseObject(string2);
            }
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            com.taobao.tbpoplayer.filter.b.a().a(jSONObject3, jSONObject2, true);
            mtopRequest.setData(JSON.toJSONString(jSONObject3));
            MtopBusiness mo1326setSocketTimeoutMilliSecond = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, PopLayer.getReference().getApp()), mtopRequest, TaoPackageInfo.getTTID()).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.tbpoplayer.filter.MtopGroupPreCheckManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    MtopGroupPreCheckManager.this = this;
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        MtopGroupPreCheckManager.a(MtopGroupPreCheckManager.this, dVar, str, mtopResponse, aVar);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    } else {
                        MtopGroupPreCheckManager.a(MtopGroupPreCheckManager.this, dVar, str, mtopResponse, aVar);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        MtopGroupPreCheckManager.a(MtopGroupPreCheckManager.this, dVar, str, mtopResponse, aVar);
                    }
                }
            }).mo1342showLoginUI(false).mo1305reqMethod(MethodEnum.POST).mo1312setConnectionTimeoutMilliSecond(3000).mo1326setSocketTimeoutMilliSecond(intValue);
            if (booleanValue2) {
                mo1326setSocketTimeoutMilliSecond.mo1335useWua();
            }
            mo1326setSocketTimeoutMilliSecond.startRequest();
        } catch (Throwable th) {
            aVar.a(RequestState.fail, str, OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail, "sendError", str);
            com.alibaba.poplayer.utils.c.a("MtopGroupPreCheckManager.sendUserCheckRequest.error", th);
        }
    }

    private void a(d dVar, String str, MtopResponse mtopResponse, a aVar) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("566e33c3", new Object[]{this, dVar, str, mtopResponse, aVar});
            return;
        }
        String a2 = d.a(dVar);
        com.alibaba.poplayer.utils.c.b("triggerEvent", a2, "MtopGroupPreCheckManager.dealMtopResponse");
        if (!this.f22209a.containsKey(dVar.n())) {
            com.alibaba.poplayer.utils.c.b("pageLifeCycle", d.a(dVar), "MtopGroupPreCheckManager.pageSwitched.");
            return;
        }
        com.alibaba.poplayer.utils.c.b("triggerEvent", a2, "MtopGroupPreCheckManager.dealMtopResponse.NeedDeal.");
        try {
            if (mtopResponse != null) {
                aVar.f22210a = mtopResponse;
                String str2 = null;
                if (mtopResponse.getHeaderFields() != null && (list = mtopResponse.getHeaderFields().get("eagleeye-traceid")) != null && !list.isEmpty()) {
                    str2 = list.get(0);
                }
                dVar.t().w = str2;
                JSONObject jSONObject = (JSONObject) com.taobao.tbpoplayer.filter.b.a().a(mtopResponse).get("result");
                if (mtopResponse.isApiSuccess()) {
                    a(mtopResponse, jSONObject, aVar);
                    aVar.a();
                    return;
                }
                com.alibaba.poplayer.utils.c.b("triggerEvent", a2, "MtopGroupPreCheckManager.dealMtopResponse.isApiSuccess=false.RetCode=" + mtopResponse.getRetCode() + ".ResponseCode=" + mtopResponse.getResponseCode());
                dVar.t().W = com.taobao.tbpoplayer.filter.b.a().b(mtopResponse);
                aVar.a(RequestState.fail, str, OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail, mtopResponse.getRetCode(), str);
                return;
            }
            com.alibaba.poplayer.utils.c.b("triggerEvent", a2, "MtopGroupPreCheckManager.dealMtopResponse.response==null.");
            aVar.a(RequestState.fail, str, OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail, "responseNull", str);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("MtopGroupPreCheckManager.dealMtopResponse.error", th);
            aVar.a(RequestState.fail, str, OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail, "dealMtopResponseError", str);
        }
    }

    private void a(MtopResponse mtopResponse, JSONObject jSONObject, a aVar) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96298fa7", new Object[]{this, mtopResponse, jSONObject, aVar});
        } else if (jSONObject != null) {
            try {
                if (!jSONObject.containsKey("data") || aVar == null || (jSONObject2 = jSONObject.getJSONObject("data")) == null) {
                    return;
                }
                String string = jSONObject2.getString("popEnableList");
                JSONObject jSONObject4 = jSONObject2.getJSONObject("groupContent");
                List<String> parseArray = JSONObject.parseArray(string, String.class);
                if (parseArray != null) {
                    for (String str : parseArray) {
                        if (aVar.d.contains(str)) {
                            aVar.f.add(str);
                            if (jSONObject4 != null && (jSONObject3 = jSONObject4.getJSONObject(str)) != null) {
                                aVar.h.put(str, a(mtopResponse, jSONObject3));
                            }
                        }
                    }
                }
                List parseArray2 = JSONObject.parseArray(jSONObject2.getString("falseActionList"), String.class);
                aVar.g.clear();
                if (parseArray2 == null) {
                    return;
                }
                aVar.g.addAll(parseArray2);
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("MtopGroupPreCheckManager.syncDataToGroupInfo.error.", th);
            }
        }
    }

    private JSONObject a(MtopResponse mtopResponse, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7ce0583", new Object[]{this, mtopResponse, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (mtopResponse != null) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("retCode", mtopResponse.getRetCode());
                hashMap.put(arz.KEY_MAPPING_CODE, mtopResponse.getMappingCode());
                hashMap.put(ZimMessageChannel.K_RPC_RES_CODE, Integer.valueOf(mtopResponse.getResponseCode()));
                jSONObject2.put("appendInfo", (Object) new JSONObject(hashMap));
                jSONObject2.put("result", (Object) jSONObject);
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("getResponseData.error.", th);
            }
        }
        return jSONObject2;
    }

    public Map<String, String> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c27656b1", new Object[]{this, str, str2});
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        if (TextUtils.isEmpty(str2)) {
            return concurrentHashMap;
        }
        try {
            List<d> b2 = cag.i().b(str, str2);
            if (b2 != null) {
                for (d dVar : b2) {
                    if (dVar != null && str2.equals(dVar.x().preCheckGroupId)) {
                        concurrentHashMap.put(dVar.x().indexID, com.taobao.tbpoplayer.filter.b.a().a(dVar));
                    }
                }
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("getPagePreCheckGroupRequestPramsMap", th);
        }
        return concurrentHashMap;
    }
}
