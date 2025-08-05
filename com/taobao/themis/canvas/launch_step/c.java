package com.taobao.themis.canvas.launch_step;

import android.app.Activity;
import android.view.Window;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.utils.n;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.dkt;
import tb.dkx;
import tb.dlh;
import tb.dll;
import tb.dlr;
import tb.kge;
import tb.qpp;
import tb.qpr;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u000eH\u0014J\b\u0010\u0010\u001a\u00020\u000eH\u0014J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0002¨\u0006\u0015"}, d2 = {"Lcom/taobao/themis/canvas/launch_step/TMSGameStopServiceStep;", "Lcom/taobao/themis/kernel/launcher/step/TMSBaseLaunchStep;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "launcher", "Lcom/taobao/themis/kernel/launcher/TMSBaseLauncher;", DataReceiveMonitor.CB_LISTENER, "Lcom/taobao/themis/kernel/launcher/ITMSLaunchListener;", "(Lcom/taobao/themis/kernel/TMSInstance;Lcom/taobao/themis/kernel/launcher/TMSBaseLauncher;Lcom/taobao/themis/kernel/launcher/ITMSLaunchListener;)V", "getName", "", "needStopService", "", "onAfterExecute", "", "onBeforeExecute", "onExecuting", "showStopServiceGuide", "stopServiceInfo", "Lcom/alibaba/fastjson/JSONObject;", "Companion", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class c extends TMSBaseLaunchStep {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032&\u0010\u0005\u001a\"\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007 \u0004*\u000b\u0012\u0002\b\u0003\u0018\u00010\u0006¨\u0006\u00010\u0006¨\u0006\u0001H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "nextAbilityTypeKey", "", "kotlin.jvm.PlatformType", "result", "Lcom/taobao/android/abilitykit/AKAbilityExecuteResult;", "", "callback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements dll {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.themis.kernel.f f22346a;

        public b(com.taobao.themis.kernel.f fVar) {
            this.f22346a = fVar;
        }

        @Override // tb.dll
        public final void callback(String str, dkx<Object> dkxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("398d9b15", new Object[]{this, str, dkxVar});
                return;
            }
            if (q.a((Object) str, (Object) "onClose")) {
                this.f22346a.b().b();
            }
            TMSLogger.a("TMSGameStopServiceStep", str + dkxVar);
        }
    }

    static {
        kge.a(-1369695765);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "TMSGameStopServiceStep";
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        }
    }

    public static final /* synthetic */ void a(c cVar, com.taobao.themis.kernel.f fVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88d0f49f", new Object[]{cVar, fVar, jSONObject});
        } else {
            cVar.a(fVar, jSONObject);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.taobao.themis.kernel.f instance, qpr launcher, qpp listener) {
        super(instance, launcher, listener);
        q.d(instance, "instance");
        q.d(launcher, "launcher");
        q.d(listener, "listener");
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        com.taobao.themis.kernel.f mInstance = this.f22538a;
        q.b(mInstance, "mInstance");
        if (a(mInstance)) {
            return;
        }
        c();
    }

    private final boolean a(com.taobao.themis.kernel.f fVar) {
        TMSMetaInfoWrapper v;
        JSONObject m;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0cb8a31", new Object[]{this, fVar})).booleanValue();
        }
        if (!n.bq()) {
            return false;
        }
        try {
            v = fVar.v();
        } catch (Throwable th) {
            TMSLogger.b("TMSGameStopServiceStep", "needStopService failed", th);
        }
        if (v != null && (m = v.m()) != null && (jSONObject = m.getJSONObject("stopServiceInfo")) != null) {
            Long startTime = jSONObject.getLong("startTime");
            Long endTime = jSONObject.getLong("endTime");
            long currentTimeMillis = System.currentTimeMillis();
            q.b(startTime, "startTime");
            if (currentTimeMillis >= startTime.longValue()) {
                q.b(endTime, "endTime");
                if (currentTimeMillis <= endTime.longValue()) {
                    com.taobao.themis.kernel.utils.a.a(new TMSGameStopServiceStep$needStopService$1(this, jSONObject));
                    return true;
                }
            }
        }
        return false;
    }

    private final void a(com.taobao.themis.kernel.f fVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1916a63", new Object[]{this, fVar, jSONObject});
            return;
        }
        dlr dlrVar = new dlr();
        dlrVar.a(fVar.o());
        Activity o = fVar.o();
        q.b(o, "instance.activity");
        Window window = o.getWindow();
        q.b(window, "instance.activity.window");
        dlrVar.a(window.getDecorView());
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject2;
        jSONObject3.put((JSONObject) "type", "showWeex2Pop");
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = jSONObject4;
        jSONObject5.put((JSONObject) "url", n.bk());
        JSONObject jSONObject6 = new JSONObject();
        JSONObject jSONObject7 = jSONObject6;
        jSONObject7.put((JSONObject) "gravity", "center");
        jSONObject7.put((JSONObject) "tapEnable", (String) true);
        jSONObject7.put((JSONObject) "pushType", "outterJump");
        jSONObject7.put((JSONObject) "maxHeight", (String) 1);
        jSONObject7.put((JSONObject) "originHeight", (String) 1);
        jSONObject7.put((JSONObject) "useViewMode", (String) true);
        jSONObject7.put((JSONObject) "animation", com.taobao.android.abilitykit.ability.pop.model.d.KEY_BOTTOM_IN_OUT);
        jSONObject7.put((JSONObject) "cornerRadius", (String) Float.valueOf(0.0f));
        jSONObject7.put((JSONObject) "shouldBlockClose", (String) true);
        t tVar = t.INSTANCE;
        jSONObject5.put((JSONObject) com.taobao.android.abilitykit.ability.pop.model.c.KEY_POP_CONFIG, (String) jSONObject6);
        jSONObject5.put((JSONObject) "popId", "stop_service_" + fVar.h());
        jSONObject5.put((JSONObject) "content", (String) jSONObject);
        t tVar2 = t.INSTANCE;
        jSONObject3.put((JSONObject) "params", (String) jSONObject4);
        new dkt().a(new dlh(jSONObject2), dlrVar, new b(fVar));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/canvas/launch_step/TMSGameStopServiceStep$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-330245261);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
