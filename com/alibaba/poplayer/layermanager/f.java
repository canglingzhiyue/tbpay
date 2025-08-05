package com.alibaba.poplayer.layermanager;

import android.app.Activity;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Window;
import android.widget.LinearLayout;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.exception.PoplayerException;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.layermanager.config.BizConfig;
import com.alibaba.poplayer.layermanager.config.ConfigItem;
import com.alibaba.poplayer.layermanager.view.PopLayerViewContainer;
import com.alibaba.poplayer.trigger.InternalTriggerController;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.bzv;
import tb.kge;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    public static boolean f3197a;
    private static final String c;
    private static f j;
    private final com.alibaba.poplayer.layermanager.config.a d;
    private final c e;
    private BizConfig f;
    private final ArrayList<PopRequest> g = new ArrayList<>();
    private final Map<String, Map<String, b>> h = new ConcurrentHashMap();

    public static /* synthetic */ void lambda$6JvDiSfnDRig5cvahFmn94z1Eho(f fVar, ArrayList arrayList, String str, String str2) {
        fVar.c(arrayList, str, str2);
    }

    public static /* synthetic */ void lambda$X6SgPRLSdAHyHPyV7lAwNsnRa50(f fVar, List list) {
        fVar.c(list);
    }

    public static /* synthetic */ void lambda$o6q7BKVopL2GSivI_4GfFwvbasM(f fVar, PopRequest popRequest) {
        fVar.e(popRequest);
    }

    /* renamed from: lambda$u-FV1snDm3F30q7l4lghveLuWR0 */
    public static /* synthetic */ void m239lambda$uFV1snDm3F30q7l4lghveLuWR0(f fVar, ArrayList arrayList) {
        fVar.a(arrayList);
    }

    static {
        kge.a(86297697);
        c = f.class.getSimpleName();
        f3197a = false;
    }

    public f(c cVar) {
        this.e = cVar;
        this.d = new com.alibaba.poplayer.layermanager.config.a(this.e);
    }

    public static f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("b769ef58", new Object[0]) : j;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (j == null) {
            j = this;
        }
        this.e.a(this);
    }

    public boolean a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8bb1508", new Object[]{this, activity, str})).booleanValue();
        }
        h b = b(InternalTriggerController.a(activity), str);
        return b != null && b.b();
    }

    public void a(final List<? extends PopRequest> list) throws PoplayerException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (this.d.a()) {
            for (PopRequest popRequest : list) {
                com.alibaba.poplayer.utils.c.c("triggerEvent", com.alibaba.poplayer.trigger.d.b(popRequest), "LayerManager.tryOpen,but LayerMgr`configs not ready.Saving");
            }
            this.g.addAll(list);
        } else {
            com.alibaba.poplayer.utils.f.b(new Runnable() { // from class: com.alibaba.poplayer.layermanager.-$$Lambda$f$X6SgPRLSdAHyHPyV7lAwNsnRa50
                {
                    f.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    f.lambda$X6SgPRLSdAHyHPyV7lAwNsnRa50(f.this, list);
                }
            });
        }
    }

    public /* synthetic */ void c(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
            return;
        }
        bzv<b, PopRequest> b = b(list);
        for (b bVar : b.a().keySet()) {
            bVar.a(b.a(bVar));
        }
    }

    public void a(final PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9690e74", new Object[]{this, popRequest});
        } else if (popRequest.e() != PopRequest.Status.READY) {
            com.alibaba.poplayer.utils.c.a("LayerManager.viewReadyNotify=> add but status != READY.", new Object[0]);
        } else if (!(popRequest.h() instanceof d)) {
            com.alibaba.poplayer.utils.c.a("LayerManager.viewReadyNotify=> add but popParam not InnerPopParam", new Object[0]);
        } else if (popRequest.g() == null) {
            com.alibaba.poplayer.utils.c.a("LayerManager.viewReadyNotify=>layer is empty.", new Object[0]);
        } else {
            com.alibaba.poplayer.utils.f.b(new Runnable() { // from class: com.alibaba.poplayer.layermanager.-$$Lambda$f$o6q7BKVopL2GSivI_4GfFwvbasM
                @Override // java.lang.Runnable
                public final void run() {
                    f.lambda$o6q7BKVopL2GSivI_4GfFwvbasM(f.this, popRequest);
                }
            });
        }
    }

    public /* synthetic */ void e(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7958578", new Object[]{this, popRequest});
            return;
        }
        b d = d(popRequest);
        if (d == null) {
            com.alibaba.poplayer.utils.c.a("LayerManager.viewReadyNotify=>findCanvasViewModel cvm is null.", new Object[0]);
        } else {
            d.a(popRequest);
        }
    }

    public void a(final ArrayList<? extends PopRequest> arrayList, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eff03a56", new Object[]{this, arrayList, str, str2});
        } else {
            com.alibaba.poplayer.utils.f.b(new Runnable() { // from class: com.alibaba.poplayer.layermanager.-$$Lambda$f$6JvDiSfnDRig5cvahFmn94z1Eho
                {
                    f.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    f.lambda$6JvDiSfnDRig5cvahFmn94z1Eho(f.this, arrayList, str, str2);
                }
            });
        }
    }

    public /* synthetic */ void c(ArrayList arrayList, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186d1994", new Object[]{this, arrayList, str, str2});
            return;
        }
        bzv<b, PopRequest> b = b(arrayList, str, str2);
        for (b bVar : b.a().keySet()) {
            bVar.c(b.a(bVar));
        }
    }

    public void b(final ArrayList<? extends PopRequest> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e188d161", new Object[]{this, arrayList});
        } else {
            com.alibaba.poplayer.utils.f.b(new Runnable() { // from class: com.alibaba.poplayer.layermanager.-$$Lambda$f$u-FV1snDm3F30q7l4lghveLuWR0
                {
                    f.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    f.m239lambda$uFV1snDm3F30q7l4lghveLuWR0(f.this, arrayList);
                }
            });
        }
    }

    public /* synthetic */ void a(ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
            return;
        }
        bzv<b, PopRequest> d = d(arrayList);
        for (b bVar : d.a().keySet()) {
            bVar.b(d.a(bVar));
        }
    }

    public void b(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf42c35", new Object[]{this, popRequest});
        } else if (popRequest == null) {
        } else {
            ArrayList<? extends PopRequest> arrayList = new ArrayList<>();
            arrayList.add(popRequest);
            b(arrayList);
        }
    }

    public int c(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("307f49e9", new Object[]{this, popRequest})).intValue();
        }
        b d = d(popRequest);
        if (d == null) {
            com.alibaba.poplayer.utils.c.a("LayerManager.notifyDisplay=>findCanvasViewModel cvm is null.", new Object[0]);
            return -1;
        }
        return d.b(popRequest);
    }

    private void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14ab5c5c", new Object[]{this, bVar});
        } else {
            bVar.a();
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.h.remove(str);
        }
    }

    public com.alibaba.poplayer.layermanager.config.a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.poplayer.layermanager.config.a) ipChange.ipc$dispatch("fe3aa982", new Object[]{this}) : this.d;
    }

    public void a(Activity activity, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("911f05a", new Object[]{this, activity, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else if (z3 && z) {
            com.alibaba.poplayer.utils.c.a("%s.touchActivity.is same page.", c);
        } else {
            try {
                a(b(activity, InternalTriggerController.b()));
                com.alibaba.poplayer.utils.c.a("%s.currentActivity is: %s. curUri is %s", c, InternalTriggerController.d(), InternalTriggerController.d());
                if (z3 && z2) {
                    return;
                }
                d();
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("LayerManager.touchActivity.error.", th);
            }
        }
    }

    private b b(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("6942cf79", new Object[]{this, activity, str});
        }
        String a2 = InternalTriggerController.a(activity);
        h b = b(a2, str);
        Object[] objArr = new Object[2];
        objArr[0] = c;
        if (b != null) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        com.alibaba.poplayer.utils.c.a("%s.resetActivityViewModels: find pageVM : %s.", objArr);
        if (b == null) {
            b = new h(activity);
            a(a2, b, b(str));
        }
        b.a(activity);
        return b;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        String d = InternalTriggerController.d();
        if (!TextUtils.isEmpty(d)) {
            this.f = this.d.a(d);
        }
        if (this.g.isEmpty()) {
            return;
        }
        a((List<? extends PopRequest>) this.g);
        this.g.clear();
    }

    private bzv<b, PopRequest> b(List<? extends PopRequest> list) throws PoplayerException {
        ConfigItem configItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bzv) ipChange.ipc$dispatch("eb2b130e", new Object[]{this, list});
        }
        bzv<b, PopRequest> bzvVar = new bzv<>();
        for (PopRequest popRequest : list) {
            popRequest.t().ae = SystemClock.elapsedRealtime();
            if (popRequest.e() == PopRequest.Status.WAITING || popRequest.e() == PopRequest.Status.SHOWING) {
                BizConfig bizConfig = this.f;
                if (bizConfig == null || (configItem = bizConfig.findConfig(popRequest.j())) == null) {
                    com.alibaba.poplayer.utils.c.a("%s.tryAdjustRequests.not find ConfigRule,use default.", c);
                    configItem = new ConfigItem();
                }
                b d = d(popRequest);
                if (d == null) {
                    com.alibaba.poplayer.utils.c.a("%s.tryAdjustRequests=> find canvas view model fail.", c);
                } else {
                    if (!(popRequest.h() instanceof d)) {
                        popRequest.a(new d(popRequest.h(), configItem));
                    }
                    bzvVar.a(d, popRequest);
                }
            } else {
                com.alibaba.poplayer.utils.c.a("%s.tryAdjustRequests=> add but status not in (waiting or showing)", c);
            }
        }
        return bzvVar;
    }

    private bzv<b, PopRequest> b(ArrayList<? extends PopRequest> arrayList, String str, String str2) throws PoplayerException {
        ConfigItem configItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bzv) ipChange.ipc$dispatch("b0b7e393", new Object[]{this, arrayList, str, str2});
        }
        bzv<b, PopRequest> bzvVar = new bzv<>();
        Iterator<? extends PopRequest> it = arrayList.iterator();
        while (it.hasNext()) {
            PopRequest next = it.next();
            if (next.e() != PopRequest.Status.SHOWING) {
                com.alibaba.poplayer.utils.c.a("%s.tryAdjustRequests=> saveEmbed but status not in showing", c);
            } else {
                BizConfig bizConfig = this.f;
                if (bizConfig == null || (configItem = bizConfig.findConfig(next.j())) == null) {
                    com.alibaba.poplayer.utils.c.a("%s.tryAdjustRequests.not find ConfigRule,use default.", c);
                    configItem = new ConfigItem();
                }
                b a2 = a(str, str2);
                if (a2 == null) {
                    com.alibaba.poplayer.utils.c.a("%s.tryAdjustRequests=> find canvas view model fail.", c);
                } else {
                    if (!(next.h() instanceof d)) {
                        next.a(new d(next.h(), configItem));
                    }
                    bzvVar.a(a2, next);
                }
            }
        }
        return bzvVar;
    }

    private bzv<b, PopRequest> d(ArrayList<? extends PopRequest> arrayList) throws PoplayerException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bzv) ipChange.ipc$dispatch("96a242a9", new Object[]{this, arrayList});
        }
        bzv<b, PopRequest> bzvVar = new bzv<>();
        Iterator<? extends PopRequest> it = arrayList.iterator();
        while (it.hasNext()) {
            PopRequest next = it.next();
            if (!this.g.isEmpty() && this.g.contains(next)) {
                this.g.remove(next);
            } else if (next.f()) {
                com.alibaba.poplayer.utils.c.a("LayerManager.removeAdjustRequests=> but status = remove.uuid=%s", com.alibaba.poplayer.trigger.d.b(next));
            } else if (next.h() == null || !(next.h() instanceof d)) {
                com.alibaba.poplayer.utils.c.a("LayerManager.removeAdjustRequests=> but popParam is empty or but InnerPopParam.uuid=%s", com.alibaba.poplayer.trigger.d.b(next));
            } else {
                b d = d(next);
                if (d == null) {
                    com.alibaba.poplayer.utils.c.a("LayerManager.removeAdjustRequests=> find canvas view model fail.uuid=%s", com.alibaba.poplayer.trigger.d.b(next));
                } else {
                    bzvVar.a(d, next);
                }
            }
        }
        return bzvVar;
    }

    public PopLayerViewContainer e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopLayerViewContainer) ipChange.ipc$dispatch("3c3573e2", new Object[]{this}) : a(PopLayer.getReference().internalGetCurrentActivity());
    }

    public void a(String str, b bVar, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13c14c1c", new Object[]{this, str, bVar, str2});
            return;
        }
        Map<String, b> c2 = c(str);
        if (c2 == null) {
            return;
        }
        c2.put(str2, bVar);
    }

    public b a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("ed1515f0", new Object[]{this, str, str2}) : b(str, str2);
    }

    public b d(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("78b0aeab", new Object[]{this, popRequest});
        }
        Activity a2 = popRequest.a();
        if (a2 != null) {
            return b(InternalTriggerController.a(a2), popRequest.n());
        }
        return null;
    }

    public PopLayerViewContainer a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopLayerViewContainer) ipChange.ipc$dispatch("7223fb54", new Object[]{this, activity});
        }
        if (com.alibaba.poplayer.utils.g.b(activity)) {
            activity = activity.getParent();
        }
        return (PopLayerViewContainer) activity.getWindow().findViewById(R.id.layermanager_penetrate_webview_container_id);
    }

    public PopLayerViewContainer b(Activity activity) {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopLayerViewContainer) ipChange.ipc$dispatch("d47f1233", new Object[]{this, activity});
        }
        PopLayerViewContainer a2 = a(activity);
        if (a2 != null) {
            return a2;
        }
        if (com.alibaba.poplayer.utils.g.b(activity)) {
            activity = activity.getParent();
        }
        PopLayerViewContainer popLayerViewContainer = new PopLayerViewContainer(activity);
        popLayerViewContainer.setId(R.id.layermanager_penetrate_webview_container_id);
        popLayerViewContainer.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 16) {
            popLayerViewContainer.setImportantForAccessibility(2);
        }
        if (com.alibaba.poplayer.utils.g.b(activity)) {
            window = activity.getParent().getWindow();
        } else {
            window = activity.getWindow();
        }
        window.addContentView(popLayerViewContainer, new LinearLayout.LayoutParams(-1, -1));
        popLayerViewContainer.bringToFront();
        return popLayerViewContainer;
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        return str + "_pagecvm";
    }

    public h b(String str, String str2) {
        Map<String, b> c2;
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("ede3952b", new Object[]{this, str, str2});
        }
        if (!TextUtils.isEmpty(str2) && (c2 = c(str)) != null && (bVar = c2.get(b(str2))) != null) {
            return (h) bVar;
        }
        return null;
    }

    public Map<String, b> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e68dc5e9", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.h.containsKey(str)) {
            return this.h.get(str);
        }
        HashMap hashMap = new HashMap();
        this.h.put(str, hashMap);
        return hashMap;
    }
}
