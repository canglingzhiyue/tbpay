package com.taobao.android.behavir;

import android.app.Application;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.decision.BHRDecisionEngine;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.android.behavir.solution.BHRSolution;
import com.taobao.android.behavix.adapter.BXBRBridge;
import com.taobao.android.behavix.d;
import com.taobao.android.behavix.h;
import com.taobao.android.external.BHXVisualCenterItem;
import java.util.List;
import java.util.Map;
import tb.drp;

/* loaded from: classes.dex */
public class BehaviR extends com.taobao.android.behavir.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private com.taobao.android.behavir.config.a mConfigCenter;
    private BHRDecisionEngine mDecisionEngine;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final BehaviR f9128a = new BehaviR();

        public static /* synthetic */ BehaviR a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (BehaviR) ipChange.ipc$dispatch("4d42e0d9", new Object[0]) : f9128a;
        }
    }

    public static /* synthetic */ Object ipc$super(BehaviR behaviR, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static BehaviR getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BehaviR) ipChange.ipc$dispatch("4ddae3ef", new Object[0]) : a.a();
    }

    private BehaviR() {
        this.mConfigCenter = com.taobao.android.behavir.config.a.a();
        this.mDecisionEngine = null;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            BXBRBridge.a(c.a());
        }
    }

    @Override // com.taobao.android.behavir.a
    public void registerConfig(String str, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2a330e0", new Object[]{this, str, str2});
        } else if (!isBehaviREnable()) {
        } else {
            this.mConfigCenter.a(str2, str);
        }
    }

    @Override // com.taobao.android.behavir.a
    public void initialize(Application application, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("408007bc", new Object[]{this, application, str, str2});
            return;
        }
        d.a().a(application, str, str2);
        com.taobao.android.behavir.init.a.a();
    }

    @Override // com.taobao.android.behavix.c
    public void commitEnter(String str, String str2, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c564b847", new Object[]{this, str, str2, obj, strArr});
        } else {
            h.a(str, str2, obj, strArr);
        }
    }

    public void updateScene(String str, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90b3df15", new Object[]{this, str, obj, map});
        } else {
            h.a(str, obj, map);
        }
    }

    public void updateScene(drp drpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b51aafd8", new Object[]{this, drpVar});
            return;
        }
        BHREvent e = BHRDecisionEngine.a().e();
        if (e == null || drpVar == null || !TextUtils.equals(e.scene, drpVar.d) || !TextUtils.equals(e.sessionId, drpVar.b) || e.seqId != drpVar.f26928a) {
            return;
        }
        e.bizArgs = drpVar.l;
        e.bizArgsMap = drpVar.u;
        e.bizArgKVMapObject = drpVar.v;
    }

    @Override // com.taobao.android.behavix.c
    public void commitLeave(String str, String str2, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e38feac8", new Object[]{this, str, str2, obj, strArr});
        } else {
            h.b(str, str2, obj, strArr);
        }
    }

    @Override // com.taobao.android.behavix.c
    public void commitLeave(String str, String str2, String str3, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ceb1ffe", new Object[]{this, str, str2, str3, obj, strArr});
        } else {
            h.a(str, str2, str3, obj, strArr);
        }
    }

    public void commitNewTap(String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5efb220", new Object[]{this, str, str2, str3, strArr});
        } else {
            h.a(str, str2, str3, strArr);
        }
    }

    @Override // com.taobao.android.behavix.c
    public void commitTap(String str, String str2, String str3, String str4, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c09eea4", new Object[]{this, str, str2, str3, str4, strArr});
        } else {
            h.a(str, str2, str3, str4, strArr);
        }
    }

    public void commitCustom(String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b473c752", new Object[]{this, str, str2, str3, strArr});
        } else {
            h.b(str, str2, str3, strArr);
        }
    }

    @Override // com.taobao.android.behavix.c
    public void trackScrollStart(String str, String str2, int i, int i2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dee0ea7a", new Object[]{this, str, str2, new Integer(i), new Integer(i2), strArr});
        } else {
            h.a(str, str2, i, i2, strArr);
        }
    }

    @Override // com.taobao.android.behavix.c
    public void trackScrollEnd(String str, String str2, int i, int i2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc0ea1", new Object[]{this, str, str2, new Integer(i), new Integer(i2), strArr});
        } else {
            h.b(str, str2, i, i2, strArr);
        }
    }

    @Override // com.taobao.android.behavix.c
    public void trackAppear(String str, String str2, String str3, View view, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("761a6532", new Object[]{this, str, str2, str3, view, strArr});
        } else {
            h.a(str, str2, str3, view, strArr);
        }
    }

    @Override // com.taobao.android.behavix.c
    public void trackDisAppear(String str, String str2, String str3, View view, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9af0d2a", new Object[]{this, str, str2, str3, view, strArr});
        } else {
            h.b(str, str2, str3, view, strArr);
        }
    }

    @Override // com.taobao.android.behavix.c
    public void commitRequest(String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce026f82", new Object[]{this, str, str2, str3, strArr});
        } else {
            h.c(str, str2, str3, strArr);
        }
    }

    public void commitAppIn(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c137d5c", new Object[]{this, str, obj});
        } else {
            h.a(str, obj);
        }
    }

    public void commitAppOut(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c787c1b1", new Object[]{this, str, obj});
        } else {
            h.b(str, obj);
        }
    }

    public static void commitVisualCenter(String str, List<BHXVisualCenterItem> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31362586", new Object[]{str, list, new Boolean(z)});
        } else {
            h.a(str, list, z);
        }
    }

    public static void trackScrollStart(String str, String str2, float f, float f2, List<com.taobao.android.external.e> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("681797af", new Object[]{str, str2, new Float(f), new Float(f2), list, map});
        } else {
            h.a(str, str2, f, f2, list, map);
        }
    }

    public static void trackScrolling(String str, String str2, float f, float f2, List<com.taobao.android.external.e> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a08060f", new Object[]{str, str2, new Float(f), new Float(f2), list, map});
        } else {
            h.b(str, str2, f, f2, list, map);
        }
    }

    public static void trackScrollEnd(String str, String str2, float f, float f2, List<com.taobao.android.external.e> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af72b956", new Object[]{str, str2, new Float(f), new Float(f2), list, map});
        } else {
            h.c(str, str2, f, f2, list, map);
        }
    }

    public com.taobao.android.behavir.config.a getConfigCenter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.behavir.config.a) ipChange.ipc$dispatch("11cbe832", new Object[]{this}) : this.mConfigCenter;
    }

    @Override // com.taobao.android.behavir.a
    public void registerSolution(String str, BHRSolution bHRSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60fca446", new Object[]{this, str, bHRSolution});
        } else {
            com.taobao.android.behavir.config.a.a().a(str, bHRSolution);
        }
    }

    @Override // com.taobao.android.behavir.a
    public void unRegisterSolution(String str, BHRSolution bHRSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53cb596d", new Object[]{this, str, bHRSolution});
        } else {
            com.taobao.android.behavir.config.a.a().b(str, bHRSolution);
        }
    }

    @Override // com.taobao.android.behavir.a
    public void triggerEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac5f447d", new Object[]{this, str, jSONObject});
            return;
        }
        BHREvent bHREvent = new BHREvent();
        bHREvent.actionType = "internal";
        bHREvent.actionName = str;
        bHREvent.actionArgsJSON = jSONObject;
        getDecisionEngine().a(bHREvent, this.mConfigCenter.c());
    }

    private BHRDecisionEngine getDecisionEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BHRDecisionEngine) ipChange.ipc$dispatch("565fadb6", new Object[]{this});
        }
        if (this.mDecisionEngine == null) {
            this.mDecisionEngine = BHRDecisionEngine.a();
        }
        return this.mDecisionEngine;
    }

    private boolean isBehaviREnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a0a22e7", new Object[]{this})).booleanValue() : this.mConfigCenter.f() && d.e();
    }
}
