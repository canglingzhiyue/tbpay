package tb;

import android.app.Activity;
import android.app.LocalActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.LocalBroadcastManager;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.presenter.b;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.abilitykit.ability.pop.render.d;
import com.taobao.android.tbabilitykit.pop.StdPopActivityGroup;
import com.taobao.android.tbabilitykit.weex.pop.render.e;
import com.taobao.android.weex.WeexExternalEventType;
import com.taobao.android.weex_ability.page.WeexContainerFragment;
import com.taobao.android.weex_ability.page.WeexFragment;
import com.taobao.tao.log.TLog;
import com.taobao.tao.tbmainfragment.i;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;

/* loaded from: classes6.dex */
public final class scp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final scp INSTANCE;

    static {
        kge.a(1724813678);
        INSTANCE = new scp();
    }

    private scp() {
    }

    @JvmStatic
    public static final dkx<?> a(Intent intent, dlr akContext, com.taobao.android.abilitykit.ability.pop.model.a popParams, dlh akData, dll akCb) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("b42cf20b", new Object[]{intent, akContext, popParams, akData, akCb});
        }
        q.d(intent, "intent");
        q.d(akContext, "akContext");
        q.d(popParams, "popParams");
        q.d(akData, "akData");
        q.d(akCb, "akCb");
        String a2 = popParams.a();
        if (a2 == null) {
            a2 = intent.getStringExtra(i.KEY_FRAGMENT_NAME);
        }
        popParams.a(a2);
        Context a3 = akContext.a();
        if (a3 != null) {
            List<ResolveInfo> queryIntentActivities = a3.getPackageManager().queryIntentActivities(intent, 0);
            q.b(queryIntentActivities, "it.packageManager.queryIntentActivities(intent, 0)");
            if (queryIntentActivities.size() > 0) {
                popParams.a(queryIntentActivities.get(0).activityInfo);
            }
        }
        if (popParams.a() == null) {
            popParams.h = true;
            obj = (IAKPopRender) new a(intent, akContext, popParams);
        } else {
            obj = (IAKPopRender) new com.taobao.android.abilitykit.ability.pop.render.a(null);
        }
        b bVar = new b();
        bVar.a((IAKPopRender) obj);
        dkx<?> a4 = jal.a(bVar, popParams, akData, akContext, akCb);
        q.b(a4, "BizUtils.showPop(\n      …           akCb\n        )");
        return a4;
    }

    /* loaded from: classes6.dex */
    public static final class a implements IAKPopRender<com.taobao.android.abilitykit.ability.pop.model.a, dlr> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f33477a;
        public final /* synthetic */ dlr b;
        public final /* synthetic */ com.taobao.android.abilitykit.ability.pop.model.a c;
        private StdPopActivityGroup d;
        private int e;
        private com.taobao.android.abilitykit.ability.pop.model.a f;
        private d g;
        private WeakReference<dlx> h;
        private WeakReference<fmg> i;
        private boolean j;

        @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            }
        }

        @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            }
        }

        @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
        public void dW_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43b500d3", new Object[]{this});
            }
        }

        public a(Intent intent, dlr dlrVar, com.taobao.android.abilitykit.ability.pop.model.a aVar) {
            this.f33477a = intent;
            this.b = dlrVar;
            this.c = aVar;
            Context a2 = dlrVar.a();
            this.h = new WeakReference<>((dlx) (!(a2 instanceof dlx) ? null : a2));
            Context a3 = dlrVar.a();
            this.i = new WeakReference<>((fmg) (!(a3 instanceof fmg) ? null : a3));
            this.e = -1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
            r10.f8913a.e(tb.dms.b(r10.f(), r9));
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void a(com.taobao.android.tbabilitykit.pop.StdPopActivityGroup r9, com.taobao.android.abilitykit.ability.pop.model.a r10, com.taobao.android.abilitykit.ability.pop.render.d r11) {
            /*
                Method dump skipped, instructions count: 280
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.scp.a.a(com.taobao.android.tbabilitykit.pop.StdPopActivityGroup, com.taobao.android.abilitykit.ability.pop.model.a, com.taobao.android.abilitykit.ability.pop.render.d):void");
        }

        @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
        public void a(dlr akCtx, com.taobao.android.abilitykit.ability.pop.model.a params, View view, d callback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d554d98", new Object[]{this, akCtx, params, view, callback});
                return;
            }
            q.d(akCtx, "akCtx");
            q.d(params, "params");
            q.d(callback, "callback");
            Context a2 = akCtx.a();
            if (!(a2 instanceof StdPopActivityGroup)) {
                a2 = null;
            }
            this.d = (StdPopActivityGroup) a2;
            this.f = params;
            this.g = callback;
            StdPopActivityGroup stdPopActivityGroup = this.d;
            if (stdPopActivityGroup == null) {
                return;
            }
            Resources resources = stdPopActivityGroup.getResources();
            q.b(resources, "it.resources");
            this.e = resources.getConfiguration().orientation;
            a(stdPopActivityGroup, params, callback);
        }

        @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
        public void a(int i, int i2) {
            com.taobao.android.abilitykit.ability.pop.model.a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            StdPopActivityGroup stdPopActivityGroup = this.d;
            if (stdPopActivityGroup == null || (aVar = this.f) == null || !aVar.g()) {
                return;
            }
            Resources resources = stdPopActivityGroup.getResources();
            q.b(resources, "act.resources");
            int i3 = resources.getConfiguration().orientation;
            if (this.e == i3) {
                return;
            }
            this.e = i3;
            d dVar = this.g;
            q.a(dVar);
            a(stdPopActivityGroup, aVar, dVar);
            stdPopActivityGroup.b();
        }

        @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
        public boolean a(View contentView, int i) {
            LocalActivityManager localActivityManager;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b3afcdd", new Object[]{this, contentView, new Integer(i)})).booleanValue();
            }
            q.d(contentView, "contentView");
            StdPopActivityGroup stdPopActivityGroup = this.d;
            Boolean bool = null;
            Activity currentActivity = (stdPopActivityGroup == null || (localActivityManager = stdPopActivityGroup.getLocalActivityManager()) == null) ? null : localActivityManager.getCurrentActivity();
            if (!(currentActivity instanceof hfg)) {
                currentActivity = null;
            }
            hfg hfgVar = (hfg) currentActivity;
            if (hfgVar != null) {
                bool = Boolean.valueOf(hfgVar.f());
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return !this.c.f8913a.q();
        }

        @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
        public void a(String type, JSONObject jSONObject) {
            StdPopActivityGroup stdPopActivityGroup;
            LocalActivityManager localActivityManager;
            Activity currentActivity;
            FragmentManager supportFragmentManager;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6635bcfe", new Object[]{this, type, jSONObject});
                return;
            }
            q.d(type, "type");
            boolean a2 = q.a((Object) (jSONObject != null ? jSONObject.getString("from") : null), (Object) "innerPopForward");
            if (!a2) {
                c(type, jSONObject);
            }
            if (this.c.f8913a.y() || a2) {
                if (jSONObject != null) {
                    jSONObject.remove("from");
                }
                dlx dlxVar = this.h.get();
                if (q.a((Object) type, (Object) IAKPopRender.LifecycleType.CHANGE_POSITION) || q.a((Object) type, (Object) IAKPopRender.LifecycleType.ANIMATION_POSITION_CHANGE)) {
                    if (dlxVar != null) {
                        dlxVar.a(jSONObject);
                    }
                    c("mega.stdPop.broadcast.positionChanged", jSONObject);
                    return;
                }
                if (dlxVar != null) {
                    dlxVar.a(type, jSONObject);
                }
                if (jSONObject != null) {
                    jSONObject.put("popState", (Object) type);
                }
                c("mega.stdPop.broadcast.popStateChanged", jSONObject);
            } else if (!this.c.f8913a.H() || (stdPopActivityGroup = this.d) == null || (localActivityManager = stdPopActivityGroup.getLocalActivityManager()) == null || (currentActivity = localActivityManager.getCurrentActivity()) == null) {
            } else {
                if (!(currentActivity instanceof FragmentActivity)) {
                    currentActivity = null;
                }
                FragmentActivity fragmentActivity = (FragmentActivity) currentActivity;
                Fragment findFragmentByTag = (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) ? null : supportFragmentManager.findFragmentByTag("ali_mus_fragment_tag");
                if (!(findFragmentByTag instanceof WeexFragment) && !(findFragmentByTag instanceof WeexContainerFragment)) {
                    return;
                }
                e eVar = new e(findFragmentByTag);
                if (q.a((Object) type, (Object) IAKPopRender.LifecycleType.CHANGE_POSITION) || q.a((Object) type, (Object) IAKPopRender.LifecycleType.ANIMATION_POSITION_CHANGE)) {
                    Object obj = jSONObject != null ? jSONObject.get("data") : null;
                    if (!(obj instanceof JSONObject)) {
                        obj = null;
                    }
                    JSONObject jSONObject2 = (JSONObject) obj;
                    if (jSONObject2 != null) {
                        if (!this.j) {
                            this.j = true;
                            eVar.a(jSONObject2, this.d, WeexExternalEventType.START);
                        }
                        eVar.a(jSONObject2, this.d, WeexExternalEventType.UPDATE);
                    }
                }
                if (!q.a((Object) type, (Object) IAKPopRender.LifecycleType.OUT_ANIMATION_END) && !q.a((Object) type, (Object) IAKPopRender.LifecycleType.IN_ANIMATION_END) && !q.a((Object) type, (Object) IAKPopRender.LifecycleType.PAN_ANIMATION_RECOVER_END)) {
                    return;
                }
                Object obj2 = jSONObject != null ? jSONObject.get("data") : null;
                if (!(obj2 instanceof JSONObject)) {
                    obj2 = null;
                }
                JSONObject jSONObject3 = (JSONObject) obj2;
                if (jSONObject3 == null) {
                    return;
                }
                if (!this.j) {
                    eVar.a(jSONObject3, this.d, WeexExternalEventType.START);
                }
                this.j = false;
                eVar.a(jSONObject3, this.d, WeexExternalEventType.END);
            }
        }

        @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
        public void b(String state, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("676c0fdd", new Object[]{this, state, jSONObject});
                return;
            }
            q.d(state, "state");
            if (!this.c.f8913a.F()) {
                return;
            }
            fmg fmgVar = this.i.get();
            if (fmgVar != null) {
                fmgVar.b(state, jSONObject);
                TLog.loge("stdPopTag", "stdPopTag", "send event to " + fmgVar.getClass().getName() + ' ' + state);
            }
            if (jSONObject != null) {
                jSONObject.put((JSONObject) "windowState", state);
            }
            c("mega.stdPop.broadcast.windowStateChanged", jSONObject);
        }

        private final void c(String str, JSONObject jSONObject) {
            Context applicationContext;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68a262bc", new Object[]{this, str, jSONObject});
                return;
            }
            StdPopActivityGroup stdPopActivityGroup = this.d;
            if (stdPopActivityGroup == null || (applicationContext = stdPopActivityGroup.getApplicationContext()) == null) {
                return;
            }
            Intent intent = new Intent(str);
            intent.replaceExtras(hsu.a(intent.getExtras(), jSONObject));
            LocalBroadcastManager.getInstance(applicationContext).sendBroadcast(intent);
        }
    }

    @JvmStatic
    public static final dkx<?> a(Fragment fragment, dlr akContext, com.taobao.android.abilitykit.ability.pop.model.a popParams, dlh akData, dll akCb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("539d3ff0", new Object[]{fragment, akContext, popParams, akData, akCb});
        }
        q.d(fragment, "fragment");
        q.d(akContext, "akContext");
        q.d(popParams, "popParams");
        q.d(akData, "akData");
        q.d(akCb, "akCb");
        b bVar = new b();
        bVar.a(new com.taobao.android.abilitykit.ability.pop.render.a(fragment));
        dkx<?> a2 = jal.a(bVar, popParams, akData, akContext, akCb);
        q.b(a2, "BizUtils.showPop(\n      …           akCb\n        )");
        return a2;
    }
}
