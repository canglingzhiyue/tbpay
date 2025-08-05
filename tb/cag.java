package tb;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.config.model.predeal.PreDealCustomEventParams;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.Event;
import com.alibaba.poplayer.trigger.InternalTriggerController;
import com.alibaba.poplayer.trigger.b;
import com.alibaba.poplayer.trigger.d;
import com.alibaba.poplayer.trigger.i;
import com.alibaba.poplayer.utils.Monitor;
import com.alibaba.poplayer.utils.c;
import com.alibaba.poplayer.utils.f;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

@Monitor.TargetClass
/* loaded from: classes.dex */
public class cag extends com.alibaba.poplayer.trigger.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_SCHEME = "poplayer://";
    private static final String d;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private static final cag f26223a;

        static {
            kge.a(1275576602);
            f26223a = new cag();
        }

        public static /* synthetic */ cag a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (cag) ipChange.ipc$dispatch("f031e75", new Object[0]) : f26223a;
        }
    }

    public static /* synthetic */ Object ipc$super(cag cagVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -927263484) {
            super.a((Activity) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode != 1304089816) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((String) objArr[0], (String) objArr[1], ((Boolean) objArr[2]).booleanValue());
            return null;
        }
    }

    public static /* synthetic */ void lambda$yPHV1_1rzliVSCdHreRFwj3GLls(cag cagVar, Event event) {
        cagVar.g(event);
    }

    static {
        kge.a(1713342023);
        d = cag.class.getSimpleName();
    }

    @Override // com.alibaba.poplayer.trigger.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.c = new i(this);
        }
    }

    public static cag i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cag) ipChange.ipc$dispatch("4c90496d", new Object[0]) : a.a();
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            c(InternalTriggerController.d(), InternalTriggerController.c());
        }
    }

    public Event a(PreDealCustomEventParams preDealCustomEventParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Event) ipChange.ipc$dispatch("f4f48dde", new Object[]{this, preDealCustomEventParams});
        }
        Event event = new Event(InternalTriggerController.b(), InternalTriggerController.d(), InternalTriggerController.c(), preDealCustomEventParams);
        c.c("triggerEvent", "", "preDealCustomAccept.event=" + event);
        a(event);
        return event;
    }

    public void a(BaseConfigItem baseConfigItem, String str, String str2, JSONObject jSONObject, cai caiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e05f73", new Object[]{this, baseConfigItem, str, str2, jSONObject, caiVar});
            return;
        }
        Event a2 = a(baseConfigItem, str2, jSONObject, str, InternalTriggerController.b(), InternalTriggerController.d(), InternalTriggerController.c(), caiVar);
        c.c("triggerEvent", baseConfigItem.indexID, "popHubAccept.event");
        a(a2);
    }

    public void a(String str, String str2, String str3, cai caiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c7ffd0b", new Object[]{this, str, str2, str3, caiVar});
            return;
        }
        Event a2 = a(str, str2, str3, InternalTriggerController.b(), InternalTriggerController.d(), InternalTriggerController.c(), caiVar);
        c.a("PageTriggerService.triggerAccept.create Event=" + a2, new Object[0]);
        a(a2);
    }

    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
            return;
        }
        Event a2 = a(str, str2, "", InternalTriggerController.b(), InternalTriggerController.d(), InternalTriggerController.c(), null);
        c.a("PageTriggerService.create Event:{%s}.", a2);
        if (d(a2)) {
            c.c("pageLifeCycle", "", "PageTriggerService.hangingEvent.");
            return;
        }
        if (Event.a.a(a2.source)) {
            this.f3206a.a(a2);
        } else {
            this.f3206a.d();
            this.f3206a.a(a2);
        }
        a(a2);
    }

    @Override // com.alibaba.poplayer.trigger.a
    public void a(Event event) {
        cai processCallBack;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee64f7e2", new Object[]{this, event});
        } else if (f(event)) {
            c.c("triggerEvent", "", "PageTriggerService.accept.loadLocalFiles.return.");
        } else {
            e(event);
            long currentTimeMillis = System.currentTimeMillis();
            String b = InternalTriggerController.b();
            if (TextUtils.isEmpty(event.attachKeyCode) || TextUtils.isEmpty(b) || !event.attachKeyCode.equals(b)) {
                c.c("triggerEvent", "", "PageTriggerService.accept.activeAccept Useless event,eventKeyCode=" + event.attachKeyCode + ",curKeyCode=" + b);
                return;
            }
            b findConfigs = PopLayer.getReference().getConfigMgr().findConfigs(event, c(event), true);
            if (findConfigs == null) {
                c.c("triggerEvent", "", "PageTriggerService.accept.findConfigs=null");
                cai processCallBack2 = event.getProcessCallBack();
                if (processCallBack2 == null) {
                    return;
                }
                processCallBack2.a("catchError");
                return;
            }
            if (!findConfigs.f3207a.isEmpty() || !findConfigs.e.isEmpty()) {
                c.c("triggerEvent", "", "PageTriggerService.findAllValidConfigs:started Count=" + findConfigs.f3207a.size() + ",unstarted Count=" + findConfigs.e.size());
            }
            caa.a(0, "debug", event, findConfigs.f3207a, "PopConfigCheckSuccess", "");
            a(event, findConfigs);
            c.c("triggerEvent", "", "PageTriggerService.accept.tryOpenRequest.cos time ::: " + (System.currentTimeMillis() - currentTimeMillis));
            a(event.attachKeyCode, event, findConfigs);
            if (2 == event.source && !findConfigs.e.isEmpty()) {
                this.c.a(event, findConfigs.e);
            }
            if (!findConfigs.a() || (processCallBack = event.getProcessCallBack()) == null) {
                return;
            }
            processCallBack.a("configNotExist");
        }
    }

    @Override // com.alibaba.poplayer.trigger.a
    public void b(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b0522e3", new Object[]{this, event});
            return;
        }
        String b = InternalTriggerController.b();
        if (2 != event.source || TextUtils.isEmpty(b) || TextUtils.isEmpty(event.attachKeyCode) || !event.attachKeyCode.equals(b)) {
            c.a("%s activeAccept Useless event,eventKeyCode:%s,curKeyCode:%s.", d, event.attachKeyCode, b);
            return;
        }
        b findConfigs = PopLayer.getReference().getConfigMgr().findConfigs(event, c(event), false);
        if (findConfigs == null) {
            return;
        }
        c.a("PageTriggerService.findValidConfigs:started Count:{%s},unstarted Count:{%s}.", Integer.valueOf(findConfigs.f3207a.size()), Integer.valueOf(findConfigs.e.size()));
        if (findConfigs.e.isEmpty()) {
            return;
        }
        this.c.a(event, findConfigs.e);
    }

    private void e(Event event) {
        PreDealCustomEventParams preDealCustomEventParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20e5a3e6", new Object[]{this, event});
        } else if (event.source != 4 || (preDealCustomEventParams = event.getPreDealCustomEventParams()) == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewCreated", (Object) "false");
            jSONObject.put("displayed", (Object) "false");
            caa.a(0, "debug", event, preDealCustomEventParams.getIndexIds(), jSONObject, "PopEventAccept", "");
        }
    }

    private void a(Event event, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3402fe74", new Object[]{this, event, bVar});
        } else if (2 != event.source) {
            if (bVar.a()) {
                if (event.source == 4) {
                    for (String str : bVar.f) {
                        try {
                            d dVar = new d(event, str, PopLayer.getReference().internalGetCurrentActivity(), this);
                            OnePopModule t = dVar.t();
                            t.ac = PopLayer.getReference().getCurrentTimeStamp(false);
                            t.T = OnePopModule.OnePopLoseReasonCode.ConfigCheckFail;
                            t.U = "configNotExist";
                            bzz.a(dVar);
                            cab.a(event, str, false);
                        } catch (Throwable th) {
                            c.a("PageTriggerService.trackConfigNotExist.error", th);
                        }
                    }
                    return;
                }
                cab.a(event, "", false);
            } else if (event.source == 4) {
                for (String str2 : bVar.g) {
                    cab.a(event, str2, true);
                }
            } else {
                cab.a(event, "", true);
            }
        }
    }

    private Event a(String str, String str2, String str3, String str4, String str5, String str6, cai caiVar) {
        IpChange ipChange = $ipChange;
        int i = 3;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Event) ipChange.ipc$dispatch("37a31287", new Object[]{this, str, str2, str3, str4, str5, str6, caiVar});
        }
        Event event = new Event(str, null, str2, str3, str4, str5, str6, 2);
        int indexOf = event.uri.indexOf(63);
        boolean z2 = -1 == indexOf;
        String substring = z2 ? event.uri : event.uri.substring(0, indexOf);
        if (!event.uri.startsWith(PAGE_SCHEME)) {
            i = 2;
        } else if (!Event.isDirectlyOpen(event.uri)) {
            i = 1;
        }
        if (i != event.source) {
            z = false;
        }
        if (!z2 || !z) {
            if (z) {
                substring = event.uri;
            }
            event = new Event(substring, null, event.param, str3, str4, str5, str6, i);
        }
        event.originUri = str;
        event.setProcessCallBack(caiVar);
        return event;
    }

    private Event a(BaseConfigItem baseConfigItem, String str, JSONObject jSONObject, String str2, String str3, String str4, String str5, cai caiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Event) ipChange.ipc$dispatch("806c194b", new Object[]{this, baseConfigItem, str, jSONObject, str2, str3, str4, str5, caiVar});
        }
        Event event = new Event("PopHubUniUri", baseConfigItem, str2, "", str3, str4, str5, 5);
        event.setAugeCode(str);
        event.setUcpBackFlowTrackInfo(jSONObject);
        event.setProcessCallBack(caiVar);
        return event;
    }

    @Override // com.alibaba.poplayer.trigger.a
    public void a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        try {
            super.a(str, str2, z);
            this.c.a(str, false);
            a(str, str2, z, false);
        } catch (Throwable th) {
            c.a("PageTriggerService.pageClean.error.", th);
        }
    }

    @Override // com.alibaba.poplayer.trigger.a
    public void a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8bb1504", new Object[]{this, activity, str});
            return;
        }
        try {
            super.a(activity, str);
            this.c.a(str, false);
            a(str, InternalTriggerController.a(activity), true, false);
        } catch (Throwable th) {
            c.a("PageTriggerService.pageDestroy.error.", th);
        }
    }

    private boolean f(final Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad85ceeb", new Object[]{this, event})).booleanValue();
        }
        try {
            if (!com.alibaba.poplayer.utils.a.a().d()) {
                f.a(new Runnable() { // from class: tb.-$$Lambda$cag$yPHV1_1rzliVSCdHreRFwj3GLls
                    @Override // java.lang.Runnable
                    public final void run() {
                        cag.lambda$yPHV1_1rzliVSCdHreRFwj3GLls(cag.this, event);
                    }
                });
                return true;
            }
        } catch (Throwable th) {
            c.a("PageTriggerService.loadLocalFiles.error.", th);
        }
        return false;
    }

    public /* synthetic */ void g(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a25f9e8", new Object[]{this, event});
            return;
        }
        try {
            com.alibaba.poplayer.utils.a.a().f();
            a(event);
        } catch (Throwable th) {
            c.a("PopLayer.setup.newReadAndSetup.error.", th);
        }
    }
}
