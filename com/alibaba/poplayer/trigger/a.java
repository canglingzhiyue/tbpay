package com.alibaba.poplayer.trigger;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.config.manager.ConfigFilterRule;
import com.alibaba.poplayer.config.model.keep.KeepModel;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.norm.IUserCheckRequestListener;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.Event;
import com.alibaba.poplayer.utils.Monitor;
import com.alipay.mobile.common.logging.api.LogContext;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.bzs;
import tb.bzz;
import tb.caa;
import tb.cac;
import tb.cah;
import tb.kge;
import tb.riy;

@Monitor.TargetClass
/* loaded from: classes.dex */
public abstract class a implements PopRequest.c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LIFE_CYCLE_PAUSE = "pause";
    public static final String LIFE_CYCLE_RESUME = "resume";
    public static final String LIFE_CYCLE_START = "start";
    public static final String LIFE_CYCLE_STOP = "stop";
    public i c;

    /* renamed from: a */
    public cah f3206a = cah.a();
    private final Map<String, List<d>> b = new ConcurrentHashMap();
    private final List<d> e = new CopyOnWriteArrayList();
    private final Handler f = new Handler(Looper.getMainLooper());

    static {
        kge.a(970678771);
        kge.a(-658935727);
    }

    public static /* synthetic */ void lambda$KkJHx0f2SVToTg2AnAcDhi1I1zg(a aVar, d dVar, Map map, boolean z, OnePopModule.OnePopLoseReasonCode onePopLoseReasonCode, String str, String str2) {
        aVar.a(dVar, map, z, onePopLoseReasonCode, str, str2);
    }

    public abstract void a();

    public void a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8bb1504", new Object[]{this, activity, str});
        }
    }

    public abstract void a(Event event);

    public void a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{this, str, str2, new Boolean(z)});
        }
    }

    public abstract void b(Event event);

    public a() {
        a();
    }

    public void a(String str, Event event, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c18993e", new Object[]{this, str, event, bVar});
            return;
        }
        ArrayList<d> arrayList = bVar.f3207a;
        ArrayList<d> arrayList2 = bVar.d;
        List<d> tryOpenRequestControl = PopLayer.getReference().tryOpenRequestControl(arrayList);
        List<d> list = this.b.get(str);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(tryOpenRequestControl);
        arrayList4.addAll(bVar.b);
        arrayList4.addAll(bVar.c);
        if (list == null || list.isEmpty()) {
            list = new CopyOnWriteArrayList<>();
            this.b.put(str, list);
        }
        List<d> list2 = list;
        boolean z = event.source == 2;
        if (z) {
            ArrayList arrayList5 = new ArrayList();
            for (d dVar : list2) {
                if (dVar != null && dVar.p()) {
                    if (!arrayList5.contains(dVar)) {
                        arrayList5.add(dVar);
                    }
                    arrayList4.remove(dVar);
                    com.alibaba.poplayer.utils.c.a("tryOpenRequest.add embed hanging request{%s}", dVar.z());
                }
            }
            ArrayList arrayList6 = new ArrayList();
            for (d dVar2 : this.e) {
                if (dVar2 != null && (dVar2.r() || dVar2.s())) {
                    if (!ConfigFilterRule.a(dVar2)) {
                        if (dVar2.r()) {
                            dVar2.t().T = OnePopModule.OnePopLoseReasonCode.ConfigCheckFail;
                            dVar2.t().U = KeepModel.MODE_KEEP_LIVE;
                            bzz.a(dVar2);
                            f(dVar2);
                            arrayList6.add(dVar2);
                        }
                    } else {
                        if (!arrayList5.contains(dVar2)) {
                            arrayList5.add(dVar2);
                        }
                        if (!list2.contains(dVar2)) {
                            list2.add(dVar2);
                        }
                        com.alibaba.poplayer.utils.c.a("tryOpenRequest.add app hanging request{%s}", dVar2.z());
                    }
                    dVar2.a(PopLayer.getReference().internalGetCurrentActivity(), str);
                    arrayList4.remove(dVar2);
                }
            }
            if (!arrayList6.isEmpty()) {
                this.e.removeAll(arrayList6);
            }
            if (!arrayList5.isEmpty()) {
                a(arrayList5);
                caa.a(0, "debug", event, arrayList5, "PopConfigReadyToOpen", "");
                com.alibaba.poplayer.layermanager.f.a().a((List<? extends PopRequest>) arrayList5);
            }
        }
        com.alibaba.poplayer.utils.c.c("triggerEvent", "", "tryOpenRequest");
        if (list2.isEmpty()) {
            boolean isEmpty = arrayList4.isEmpty();
            CopyOnWriteArrayList copyOnWriteArrayList = isEmpty ? new CopyOnWriteArrayList() : new CopyOnWriteArrayList(arrayList4);
            if (!arrayList2.isEmpty()) {
                copyOnWriteArrayList.addAll(arrayList2);
            }
            this.b.put(str, copyOnWriteArrayList);
            if (isEmpty) {
                return;
            }
            arrayList3.addAll(arrayList4);
        } else {
            com.alibaba.poplayer.utils.c.a("tryOpenRequest.event.source:{%s}.", Integer.valueOf(event.source));
            for (int i = 0; i < arrayList4.size(); i++) {
                d dVar3 = (d) arrayList4.get(i);
                String z2 = dVar3.z();
                if (z) {
                    d a2 = a(list2, dVar3);
                    Object[] objArr = new Object[2];
                    objArr[0] = Boolean.valueOf(a2 != null);
                    objArr[1] = z2;
                    com.alibaba.poplayer.utils.c.a("tryOpenRequest.isPopRequestContains:{%s}.indexId{%s}", objArr);
                    if (a2 == null) {
                        arrayList3.add(dVar3);
                        list2.add(dVar3);
                        com.alibaba.poplayer.utils.c.a("tryOpenRequest.add pageSwitchType request{%s}", z2);
                    }
                } else if (a(z2) != null) {
                    com.alibaba.poplayer.utils.c.b("pageLifeCycle", z2, "tryOpenRequest.add not pageSwitchType request.isRequesting.pass.");
                    dVar3.t().T = OnePopModule.OnePopLoseReasonCode.LMLifeCycleCheckFail;
                    dVar3.t().U = "isFiltering";
                    bzz.a(dVar3);
                } else {
                    arrayList3.add(dVar3);
                    list2.add(dVar3);
                    com.alibaba.poplayer.utils.c.a("tryOpenRequest.add otherType request{%s}", z2);
                }
            }
            if (!arrayList2.isEmpty()) {
                list2.addAll(arrayList2);
            }
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        a(arrayList3);
        caa.a(0, "debug", event, arrayList3, "PopConfigReadyToOpen", "");
        com.alibaba.poplayer.layermanager.f.a().a((List<? extends PopRequest>) arrayList3);
    }

    private d a(List<d> list, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("ad6bd09d", new Object[]{this, list, dVar});
        }
        if (list != null && !list.isEmpty() && dVar != null) {
            for (d dVar2 : list) {
                BaseConfigItem x = dVar2.x();
                if (!StringUtils.isEmpty(x.indexID)) {
                    if (x.indexID.equals(dVar.x().indexID)) {
                        return dVar2;
                    }
                } else if (x.uuid.equals(dVar.x().uuid)) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    public synchronized d a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("9e864ff4", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
            return null;
        } else {
            String b = InternalTriggerController.b();
            if (StringUtils.isEmpty(b)) {
                return null;
            }
            List<d> list = this.b.get(b);
            if (list == null) {
                return null;
            }
            for (d dVar : list) {
                BaseConfigItem x = dVar.x();
                if (!StringUtils.isEmpty(x.indexID) && x.indexID.equals(str) && !dVar.f()) {
                    return dVar;
                }
            }
            return null;
        }
    }

    public JSONObject b() {
        List<d> list;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            String b = InternalTriggerController.b();
            if (!StringUtils.isEmpty(b) && (list = this.b.get(b)) != null) {
                for (d dVar : list) {
                    if (dVar != null && dVar.e() == PopRequest.Status.SHOWING) {
                        i++;
                        jSONObject2.put(dVar.j(), (Object) Integer.valueOf(jSONObject2.getIntValue(dVar.j()) + 1));
                    }
                }
            }
            jSONObject.put("completeCount", (Object) Integer.valueOf(i));
            jSONObject.put("completeLayerType", (Object) jSONObject2);
            jSONObject.put("nativeUri", (Object) InternalTriggerController.d());
            jSONObject.put("nativeUrl", (Object) InternalTriggerController.c());
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("getCurPageRequestInfo.error", th);
        }
        return jSONObject;
    }

    public List<BaseConfigItem> c(Event event) {
        List<d> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1fe67fe3", new Object[]{this, event});
        }
        ArrayList arrayList = new ArrayList();
        try {
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("getPageSwitchOriginRequestConfigs.fail.", th);
        }
        if (event.source != 2 || StringUtils.isEmpty(event.attachKeyCode) || (list = this.b.get(event.attachKeyCode)) == null) {
            return arrayList;
        }
        for (d dVar : list) {
            if (!dVar.f()) {
                arrayList.add(dVar.x());
                com.alibaba.poplayer.utils.c.a("getPageSwitchOriginRequestConfigs.originRequestList.add origin config{%s}", d.b(dVar));
            } else {
                com.alibaba.poplayer.utils.c.a("getPageSwitchOriginRequestConfigs.originRequestList.add origin config{%s}.isRemoved.", d.b(dVar));
            }
        }
        for (d dVar2 : this.e) {
            if (!dVar2.f()) {
                arrayList.add(dVar2.x());
                com.alibaba.poplayer.utils.c.a("getPageSwitchOriginRequestConfigs.add appHangingRequest config{%s}", d.b(dVar2));
            } else {
                com.alibaba.poplayer.utils.c.a("getPageSwitchOriginRequestConfigs.add appHangingRequest config{%s}.isRemoved", d.b(dVar2));
            }
        }
        return arrayList;
    }

    public synchronized List<d> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        String b = InternalTriggerController.b();
        if (StringUtils.isEmpty(b)) {
            return arrayList;
        }
        List<d> list = this.b.get(b);
        if (list != null) {
            for (d dVar : list) {
                if (dVar != null && !dVar.f()) {
                    arrayList.add(dVar);
                }
            }
        }
        return arrayList;
    }

    public List<String> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8c4a1d4b", new Object[]{this, str, str2});
        }
        ArrayList arrayList = new ArrayList();
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            try {
                List<d> list = this.b.get(str);
                if (list != null) {
                    for (d dVar : list) {
                        if (dVar != null && str2.equals(dVar.x().preCheckGroupId) && !dVar.f()) {
                            arrayList.add(dVar.x().indexID);
                        }
                    }
                }
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("getPagePreCheckGroupRequest.error.", th);
            }
        }
        return arrayList;
    }

    public List<d> b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8d80702a", new Object[]{this, str, str2});
        }
        ArrayList arrayList = new ArrayList();
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            try {
                List<d> list = this.b.get(str);
                if (list != null) {
                    for (d dVar : list) {
                        if (dVar != null && str2.equals(dVar.x().preCheckGroupId) && !dVar.f()) {
                            arrayList.add(dVar);
                        }
                    }
                }
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("getPagePreCheckGroupRequests.error.", th);
            }
        }
        return arrayList;
    }

    private void g(PopRequest popRequest) {
        final PopLayerBaseView popLayerBaseView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eabc0fa", new Object[]{this, popRequest});
        } else if (!(popRequest instanceof d)) {
        } else {
            final d dVar = (d) popRequest;
            final Activity a2 = popRequest.a();
            if (a2 == null) {
                popRequest.t().T = OnePopModule.OnePopLoseReasonCode.OnViewErrorClose;
                popRequest.t().U = "initErrorContextNull";
                f(popRequest);
                com.alibaba.poplayer.utils.c.a("createLayerAndAddRequest fail.Removed.", new Object[0]);
                return;
            }
            if (dVar.g() == null) {
                popLayerBaseView = com.alibaba.poplayer.factory.a.a().a(a2, dVar.x().type, dVar);
                if (popLayerBaseView == null) {
                    popRequest.t().T = OnePopModule.OnePopLoseReasonCode.OnViewErrorClose;
                    popRequest.t().U = "initError";
                    f(popRequest);
                    com.alibaba.poplayer.utils.c.a("createLayerAndAddRequest fail.Create layer Fail.Removed.", new Object[0]);
                    return;
                }
                dVar.a(popLayerBaseView);
                popLayerBaseView.setPopRequest(dVar);
            } else {
                popLayerBaseView = (PopLayerBaseView) dVar.g();
            }
            if (dVar.x().viewLoadDelayTime > 0) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.alibaba.poplayer.trigger.-$$Lambda$a$VXYiAaiflSpz7Kq6cmzM1RQLKSk
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.b(dVar, a2, popLayerBaseView);
                    }
                }, dVar.x().viewLoadDelayTime * 1000);
                dVar.t().ag = SystemClock.elapsedRealtime();
                return;
            }
            a(dVar, a2, popLayerBaseView);
        }
    }

    public /* synthetic */ void b(d dVar, Context context, PopLayerBaseView popLayerBaseView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1edcb635", new Object[]{this, dVar, context, popLayerBaseView});
        } else {
            a(dVar, context, popLayerBaseView);
        }
    }

    private void a(d dVar, Context context, PopLayerBaseView popLayerBaseView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4512e8f4", new Object[]{this, dVar, context, popLayerBaseView});
            return;
        }
        OnePopModule t = dVar.t();
        if (t.ag > 0) {
            t.B = (SystemClock.elapsedRealtime() - t.ag) + "";
        }
        try {
            popLayerBaseView.init(context, dVar);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopLayerView init fail.", th);
        }
        com.alibaba.poplayer.layermanager.f.a().a(dVar);
        try {
            popLayerBaseView.onViewAdded(context);
        } catch (Throwable th2) {
            com.alibaba.poplayer.utils.c.a("PopLayerView onViewAdded fail.", th2);
        }
        View g = dVar.g();
        if (!com.alibaba.poplayer.utils.b.a(dVar.x()) || g == null) {
            return;
        }
        ((PopLayerBaseView) g).displayMe();
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x0109, code lost:
        if (3 == r13.y().source) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r17, java.lang.String r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.poplayer.trigger.a.a(java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public void f(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb20a339", new Object[]{this, popRequest});
            return;
        }
        com.alibaba.poplayer.layermanager.f.a().b(popRequest);
        h(popRequest);
        popRequest.a((View) null);
    }

    private void h(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8236debb", new Object[]{this, popRequest});
        } else if (popRequest == null || popRequest.g() == null || !(popRequest.g() instanceof PopLayerBaseView)) {
        } else {
            ((PopLayerBaseView) popRequest.g()).destroyView();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        a(InternalTriggerController.b(), InternalTriggerController.a(), false, true);
        List<Event> b = this.f3206a.b();
        if (b.isEmpty()) {
            return;
        }
        for (Event event : b) {
            if (event.source == 2) {
                a(event);
            }
        }
    }

    @Override // com.alibaba.poplayer.layermanager.PopRequest.c
    public void d(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("740a67b7", new Object[]{this, popRequest});
        } else if (popRequest == null) {
        } else {
            try {
                OnePopModule t = popRequest.t();
                t.T = OnePopModule.OnePopLoseReasonCode.LMLifeCycleEnqueue;
                if (t.ae > 0) {
                    t.y = String.valueOf(SystemClock.elapsedRealtime() - t.ae);
                }
                t.af = SystemClock.elapsedRealtime();
                String b = d.b(popRequest);
                com.alibaba.poplayer.utils.c.b("pageLifeCycle", b, "onReady.enqueue. In Layer:" + popRequest.j());
                HashMap hashMap = new HashMap();
                hashMap.put("pageOpenEvent", "onReady.enqueue");
                hashMap.put("uuid", d.a(popRequest));
                cac.a().a("pageLifeCycle", InternalTriggerController.d(), d.c(popRequest), hashMap);
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("BaseTriggerService.onEnqueue.error.", th);
            }
        }
    }

    @Override // com.alibaba.poplayer.layermanager.PopRequest.b
    public void a(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9690e74", new Object[]{this, popRequest});
        } else if (!(popRequest instanceof d)) {
        } else {
            try {
                if (bzs.a().j() && !bzs.a().i()) {
                    bzs.a().e(((d) popRequest).x().indexID);
                    if (bzs.a().k()) {
                        PopLayer.getReference().getFaceAdapter().doneConstraintMockRequest();
                        bzs.a().e();
                    }
                }
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("onReady.check.isConstraintMocking.error.{uuid:" + d.a(popRequest) + riy.BLOCK_END_STR, th);
            }
            try {
                OnePopModule t = popRequest.t();
                t.o = "true";
                if (t.ae > 0 && StringUtils.isEmpty(t.y)) {
                    t.y = String.valueOf(SystemClock.elapsedRealtime() - t.ae);
                }
                t.T = null;
                if (t.af == 0) {
                    t.z = "0";
                }
            } catch (Throwable th2) {
                com.alibaba.poplayer.utils.c.a("BaseTriggerService.onReady.track.error.", th2);
            }
            d dVar = (d) popRequest;
            caa.a(0, "debug", dVar, "PopLMCheckSuccess", "");
            b(dVar);
        }
    }

    @Override // com.alibaba.poplayer.layermanager.PopRequest.b
    public void b(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf42c35", new Object[]{this, popRequest});
        } else if (popRequest == null) {
        } else {
            try {
                if (!bzs.a().j()) {
                    return;
                }
                bzs.a().e(((d) popRequest).x().indexID);
                if (!bzs.a().k()) {
                    return;
                }
                PopLayer.getReference().getFaceAdapter().doneConstraintMockRequest();
                bzs.a().e();
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("onRecovered.check.isConstraintMocking.error.{uuid:" + d.a(popRequest) + riy.BLOCK_END_STR, th);
            }
        }
    }

    @Override // com.alibaba.poplayer.layermanager.PopRequest.b
    public void c(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("307f49f6", new Object[]{this, popRequest});
            return;
        }
        try {
            PopLayer.getReference().getFaceAdapter().cancelPopCheckRequest(popRequest);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("onForceRemoved.error.", th);
        }
    }

    @Override // com.alibaba.poplayer.layermanager.PopRequest.c
    public void e(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7958578", new Object[]{this, popRequest});
        } else if (!(popRequest instanceof d)) {
        } else {
            try {
                OnePopModule t = popRequest.t();
                if (PopLayer.getReference().getFaceAdapter().cancelPopCheckRequest(popRequest) && !t.r.equals("true") && !t.s.equals("true")) {
                    t.D = (SystemClock.elapsedRealtime() - t.ai) + "";
                    t.T = OnePopModule.OnePopLoseReasonCode.MtopPreCheckCancel;
                    bzz.a((d) popRequest);
                }
                if (!t.r.equals("false") || !t.q.equals("true") || t.ag <= 0) {
                    return;
                }
                t.B = (SystemClock.elapsedRealtime() - t.ag) + "";
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("onRemoved.error.", th);
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        for (String str : this.b.keySet()) {
            if (!StringUtils.isEmpty(str)) {
                com.alibaba.poplayer.layermanager.f.a().b(new ArrayList<>(this.b.get(str)));
            }
        }
        this.b.clear();
        com.alibaba.poplayer.layermanager.f.a().b(new ArrayList<>(this.e));
        this.e.clear();
    }

    private void b(final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22cf9739", new Object[]{this, dVar});
            return;
        }
        try {
            PopLayer.getReference().getFaceAdapter().preparePopCheckRequest(dVar);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("startPopCheckRequest.preparePopCheckRequest.error", th);
        }
        if (StringUtils.isEmpty(dVar.x().popPreCheckParams)) {
            dVar.t().v = com.taobao.bootimage.d.CLOSE_TYPE_SKIP;
            dVar.t().q = "true";
            g(dVar);
            return;
        }
        dVar.t().ai = SystemClock.elapsedRealtime();
        dVar.t().aj = true;
        final PopRequest.Status e = dVar.e();
        if (PopLayer.getReference().getFaceAdapter().startPopCheckRequest(dVar, new IUserCheckRequestListener() { // from class: com.alibaba.poplayer.trigger.-$$Lambda$a$rNMOIvvUTmvHj-0yqPy1RrqEiyY
            @Override // com.alibaba.poplayer.norm.IUserCheckRequestListener
            public final void onFinished(boolean z, String str, OnePopModule.OnePopLoseReasonCode onePopLoseReasonCode, String str2, String str3, Map map) {
                a.this.a(dVar, e, z, str, onePopLoseReasonCode, str2, str3, map);
            }
        })) {
            return;
        }
        dVar.t().q = "true";
        g(dVar);
    }

    public /* synthetic */ void a(final d dVar, PopRequest.Status status, boolean z, String str, final OnePopModule.OnePopLoseReasonCode onePopLoseReasonCode, final String str2, final String str3, final Map map) {
        final boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("625a7a5", new Object[]{this, dVar, status, new Boolean(z), str, onePopLoseReasonCode, str2, str3, map});
            return;
        }
        try {
            com.alibaba.poplayer.utils.c.a("startPopCheckRequest.FaceAdapter.sendUserCheckRequest.onFinished.shouldPop=%s uuid=%s", Boolean.valueOf(z), d.a(dVar));
            if (!z) {
                dVar.t().T = onePopLoseReasonCode;
                dVar.t().U = str2;
                dVar.t().V = str3;
            }
            if ((!z || dVar.e() == status) && dVar.n().equals(InternalTriggerController.b())) {
                z2 = z;
            } else {
                com.alibaba.poplayer.utils.c.a("startPopCheckRequest.FaceAdapter.sendUserCheckRequest.onFinished.keyCode check failed!!shouldPop=%s uuid=%s", Boolean.valueOf(z), d.a(dVar));
                dVar.t().T = OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail;
                dVar.t().U = LogContext.CLIENT_ENVENT_SWITCHPAGE;
                dVar.t().V = null;
                z2 = false;
            }
            Runnable runnable = new Runnable() { // from class: com.alibaba.poplayer.trigger.-$$Lambda$a$KkJHx0f2SVToTg2AnAcDhi1I1zg
                @Override // java.lang.Runnable
                public final void run() {
                    a.lambda$KkJHx0f2SVToTg2AnAcDhi1I1zg(a.this, dVar, map, z2, onePopLoseReasonCode, str2, str3);
                }
            };
            if (Looper.getMainLooper() != Looper.myLooper()) {
                this.f.post(runnable);
            } else {
                runnable.run();
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("startPopCheckRequest.onFinished.error", th);
        }
    }

    public /* synthetic */ void a(d dVar, Map map, boolean z, OnePopModule.OnePopLoseReasonCode onePopLoseReasonCode, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b2ba3a1", new Object[]{this, dVar, map, new Boolean(z), onePopLoseReasonCode, str, str2});
            return;
        }
        try {
            com.alibaba.poplayer.utils.c.a("startPopCheckRequest.FaceAdapter.sendUserCheckRequest.handler.UiThread.", new Object[0]);
            if (dVar.t().aj) {
                OnePopModule t = dVar.t();
                t.D = (SystemClock.elapsedRealtime() - dVar.t().ai) + "";
            }
            dVar.a(map);
            if (z) {
                dVar.t().q = "true";
                g(dVar);
                return;
            }
            dVar.t().q = "false";
            dVar.t().T = onePopLoseReasonCode;
            dVar.t().U = str;
            dVar.t().V = str2;
            if (onePopLoseReasonCode == OnePopModule.OnePopLoseReasonCode.MtopPreCheckNoPop) {
                bzz.a(dVar);
            }
            if (onePopLoseReasonCode == OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail) {
                bzz.a(dVar);
                bzz.c(dVar);
            }
            f(dVar);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("startPopCheckRequest.onFinished.postMainThread.run.error", th);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.c.a(InternalTriggerController.b(), true);
        com.alibaba.poplayer.utils.c.a("%s: activity pause,stop all timer.", getClass().getSimpleName());
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        com.alibaba.poplayer.utils.c.a("%s: restart current page switch event.", getClass().getSimpleName());
        for (Event event : this.f3206a.b()) {
            if (event.source == 2) {
                b(event);
            }
        }
    }

    private ArrayList<d> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("569491cd", new Object[]{this, str});
        }
        ArrayList<d> arrayList = new ArrayList<>();
        if (StringUtils.isEmpty(str)) {
            return arrayList;
        }
        for (String str2 : this.b.keySet()) {
            if (str2.equals(str)) {
                arrayList.addAll(this.b.get(str2));
            } else if (str2.startsWith(str) && InternalTriggerController.a(str2)) {
                arrayList.addAll(this.b.get(str2));
            }
        }
        return arrayList;
    }

    private void a(String str, String str2, boolean z, List<d> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd4b1c9", new Object[]{this, str, str2, new Boolean(z), list});
        } else if (list != null) {
            try {
                if (list.isEmpty()) {
                    return;
                }
                if (z) {
                    if (!StringUtils.isEmpty(str)) {
                        for (String str3 : this.b.keySet()) {
                            if (!StringUtils.isEmpty(str3)) {
                                List<d> list2 = this.b.get(str3);
                                if (str3.equals(str)) {
                                    if (list2 != null) {
                                        list2.removeAll(list);
                                    }
                                } else if (str3.startsWith(str) && InternalTriggerController.a(str3) && list2 != null) {
                                    list2.removeAll(list);
                                }
                                if (list2 != null && list2.isEmpty()) {
                                    this.b.remove(str3);
                                }
                            }
                        }
                    } else {
                        for (String str4 : this.b.keySet()) {
                            if (!StringUtils.isEmpty(str4)) {
                                List<d> list3 = this.b.get(str4);
                                if (list3 != null) {
                                    list3.removeAll(list);
                                }
                                if (list3 != null && list3.isEmpty()) {
                                    this.b.remove(str4);
                                }
                            }
                        }
                    }
                } else if (!StringUtils.isEmpty(str2)) {
                    List<d> list4 = this.b.get(str2);
                    if (list4 != null) {
                        list4.removeAll(list);
                    }
                    if (list4 != null && list4.isEmpty()) {
                        this.b.remove(str2);
                    }
                }
                for (d dVar : list) {
                    if (dVar != null && (dVar.E() || dVar.D())) {
                        for (String str5 : this.b.keySet()) {
                            if (!StringUtils.isEmpty(str5)) {
                                this.b.get(str5).remove(dVar);
                            }
                        }
                    }
                }
                com.alibaba.poplayer.utils.c.a("removeRequestsByActivity requestMap:%s", this.b);
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("removeRequestsByActivity.error.", th);
            }
        }
    }

    private void a(List<d> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                d dVar = list.get(i);
                if (dVar != null) {
                    dVar.t().n = "true";
                }
            }
        }
    }

    public boolean d(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("944578e9", new Object[]{this, event})).booleanValue();
        }
        if (event != null && !StringUtils.isEmpty(event.originUri) && Event.a.a(event.source) && event.originUri.contains("__popPageUris") && event.originUri.contains("__popEndTime")) {
            try {
                Uri parse = Uri.parse(event.originUri);
                String queryParameter = parse.getQueryParameter("__popPageUris");
                String queryParameter2 = parse.getQueryParameter("__popPageParamContains");
                String queryParameter3 = parse.getQueryParameter("__popEndTime");
                if (!StringUtils.isEmpty(queryParameter) && !StringUtils.isEmpty(queryParameter3)) {
                    try {
                        long parseLong = Long.parseLong(queryParameter3) * 1000;
                        if (PopLayer.getReference().getCurrentTimeStamp() > parseLong) {
                            return true;
                        }
                        try {
                            String[] split = URLDecoder.decode(queryParameter, "utf-8").split(",");
                            if (split.length == 0) {
                                return false;
                            }
                            for (String str : split) {
                                if (str.equals(event.curPage) && com.alibaba.poplayer.config.manager.d.a(event.curPageUrl, queryParameter2)) {
                                    return false;
                                }
                            }
                            this.f3206a.a(new FutureEvent(event.originUri, event.param, split, queryParameter2, parseLong));
                            return true;
                        } catch (Throwable unused) {
                            com.alibaba.poplayer.utils.c.a("isEventShouldHanging.decode uri failed.", new Object[0]);
                            return false;
                        }
                    } catch (Throwable unused2) {
                        com.alibaba.poplayer.utils.c.a("isEventShouldHanging.parse popEndTime failed.", new Object[0]);
                    }
                }
                return false;
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("isEventShouldHanging.parseUri.error.", th);
            }
        }
        return false;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        try {
            for (FutureEvent futureEvent : this.f3206a.c()) {
                if (futureEvent != null) {
                    if (PopLayer.getReference().getCurrentTimeStamp() > futureEvent.getPopEndTimeStamp()) {
                        this.f3206a.b(futureEvent);
                    } else {
                        Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
                        String[] popPageUris = futureEvent.getPopPageUris();
                        int length = popPageUris.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                String str = popPageUris[i];
                                if (!StringUtils.isEmpty(str) && str.equals(InternalTriggerController.d()) && com.alibaba.poplayer.config.manager.d.a(futureEvent.getParam(), futureEvent.getPopPageParamContains())) {
                                    intent.removeExtra("event");
                                    intent.removeExtra("param");
                                    intent.removeExtra(PopLayer.EXTRA_KEY_TRIGGER_SROUCE);
                                    intent.putExtra("event", futureEvent.getUri());
                                    intent.putExtra("param", futureEvent.getParam());
                                    intent.putExtra(PopLayer.EXTRA_KEY_TRIGGER_SROUCE, "reTrigger");
                                    LocalBroadcastManager.getInstance(PopLayer.getReference().getApp()).sendBroadcast(intent);
                                    this.f3206a.b(futureEvent);
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
            com.alibaba.poplayer.utils.c.a("reTriggerFutureBroadcastEvent.error.", new Object[0]);
        }
    }

    public void b(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("635bd785", new Object[]{this, activity, str});
            return;
        }
        ArrayList<d> b = b(InternalTriggerController.a(activity));
        if (b.isEmpty()) {
            return;
        }
        for (d dVar : b) {
            if (dVar != null) {
                try {
                    if (dVar.e() == PopRequest.Status.SHOWING && dVar.g() != null && (dVar.g() instanceof PopLayerBaseView)) {
                        PopLayerBaseView popLayerBaseView = (PopLayerBaseView) dVar.g();
                        char c = 65535;
                        switch (str.hashCode()) {
                            case -934426579:
                                if (str.equals("resume")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 3540994:
                                if (str.equals("stop")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 106440182:
                                if (str.equals("pause")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (str.equals("start")) {
                                    c = 0;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            popLayerBaseView.onActivityStart();
                        } else if (c == 1) {
                            popLayerBaseView.onActivityResumed();
                        } else if (c == 2) {
                            popLayerBaseView.onActivityPaused();
                        } else if (c == 3) {
                            popLayerBaseView.onActivityStop();
                        }
                    }
                } catch (Throwable th) {
                    com.alibaba.poplayer.utils.c.a("notifyShowingViewsOnActivityResumed error", th);
                }
            }
        }
    }
}
