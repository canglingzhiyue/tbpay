package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.stdpop.api.StdPopNativeParams;
import com.taobao.android.tbabilitykit.pop.StdPopActivityGroup;
import com.taobao.android.tbabilitykit.pop.StdPopContainerActivity;
import com.taobao.tao.log.TLog;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import kotlin.t;

/* loaded from: classes6.dex */
public final class scs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final scs INSTANCE;

    /* loaded from: classes6.dex */
    public static final class a implements dll {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ scq f33479a;

        public a(scq scqVar) {
            this.f33479a = scqVar;
        }

        @Override // tb.dll
        public final void callback(String str, dkx<Object> dkxVar) {
            scq scqVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("398d9b15", new Object[]{this, str, dkxVar});
            } else if (q.a((Object) str, (Object) "onClose")) {
                scq scqVar2 = this.f33479a;
                if (scqVar2 == null) {
                    return;
                }
                Object c = dkxVar != null ? dkxVar.c() : null;
                if (!(c instanceof JSONObject)) {
                    c = null;
                }
                scqVar2.b((JSONObject) c);
            } else if (!q.a((Object) str, (Object) "onBlockBackDismissed") || (scqVar = this.f33479a) == null) {
            } else {
                Object c2 = dkxVar != null ? dkxVar.c() : null;
                if (!(c2 instanceof JSONObject)) {
                    c2 = null;
                }
                scqVar.a((JSONObject) c2);
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class b implements dll {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.stdpop.api.a f33480a;

        public b(com.taobao.android.stdpop.api.a aVar) {
            this.f33480a = aVar;
        }

        @Override // tb.dll
        public final void callback(String str, dkx<Object> dkxVar) {
            com.taobao.android.stdpop.api.a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("398d9b15", new Object[]{this, str, dkxVar});
            } else if (!q.a((Object) str, (Object) "onClose") || (aVar = this.f33480a) == null) {
            } else {
                Object c = dkxVar != null ? dkxVar.c() : null;
                if (!(c instanceof JSONObject)) {
                    c = null;
                }
                aVar.b((JSONObject) c);
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class c extends com.taobao.android.stdpop.api.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ scq f33481a;

        public c(scq scqVar) {
            this.f33481a = scqVar;
        }

        @Override // com.taobao.android.stdpop.api.a, tb.scq
        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
                return;
            }
            scq scqVar = this.f33481a;
            if (scqVar == null) {
                return;
            }
            scqVar.b(jSONObject);
        }
    }

    /* loaded from: classes6.dex */
    public static final class d extends com.taobao.android.stdpop.api.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ scq f33482a;

        public d(scq scqVar) {
            this.f33482a = scqVar;
        }

        @Override // com.taobao.android.stdpop.api.a, tb.scq
        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
                return;
            }
            scq scqVar = this.f33482a;
            if (scqVar == null) {
                return;
            }
            scqVar.b(jSONObject);
        }
    }

    static {
        kge.a(498635723);
        INSTANCE = new scs();
    }

    private scs() {
    }

    @JvmStatic
    public static final scr a(Context context, Intent intent, Fragment fromFragment, scq scqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (scr) ipChange.ipc$dispatch("7ddad040", new Object[]{context, intent, fromFragment, scqVar});
        }
        q.d(fromFragment, "fromFragment");
        gmm gmmVar = new gmm();
        if (intent == null) {
            scr scrVar = new scr();
            scrVar.f33478a = false;
            return scrVar;
        } else if (context == null) {
            scr scrVar2 = new scr();
            scrVar2.f33478a = false;
            return scrVar2;
        } else if (dmr.c(context)) {
            try {
                fromFragment.startActivityForResult(intent, intent.getIntExtra("stdPopShowWithCode", -1));
            } catch (Throwable unused) {
            }
            scr scrVar3 = new scr();
            scrVar3.f33478a = false;
            return scrVar3;
        } else {
            gmmVar.a(context);
            gmmVar.a(new WeakReference<>(fromFragment));
            AppMonitor.Counter.commit("AbilityKit", "showDrawerByFragment", intent.getDataString(), 1.0d);
            return a(gmmVar, intent, INSTANCE.a(intent, context), new d(scqVar));
        }
    }

    private final StdPopNativeParams a(Intent intent, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StdPopNativeParams) ipChange.ipc$dispatch("8c8d64f4", new Object[]{this, intent, context});
        }
        String a2 = dms.a(intent, "stdPopAttachMode");
        float floatExtra = intent.getFloatExtra("stdPopMaxW", 1.0f);
        float floatExtra2 = intent.getFloatExtra("stdPopMaxH", 1.0f);
        int intExtra = intent.getIntExtra("stdPopCorner", 0);
        int intExtra2 = intent.getIntExtra("stdPopShowWithCode", -1);
        boolean booleanExtra = intent.getBooleanExtra("stdPopModal", false);
        boolean booleanExtra2 = intent.getBooleanExtra("stdPopPanEnable", true);
        boolean booleanExtra3 = intent.getBooleanExtra("stdPopHandleBack", true);
        boolean booleanExtra4 = intent.getBooleanExtra("stdPopBlockHandleBack", false);
        boolean booleanExtra5 = intent.getBooleanExtra("stdPopFullScreen", true);
        boolean booleanExtra6 = intent.getBooleanExtra("stdPopRecreateOnSysChanged", false);
        boolean booleanExtra7 = intent.getBooleanExtra("stdPopTapEnable", true);
        boolean booleanExtra8 = intent.getBooleanExtra("stdPopEnablePadActTransition", true);
        Map b2 = ai.b(j.a("maxWidth", Float.valueOf(floatExtra)), j.a("maxHeight", Float.valueOf(floatExtra2)), j.a("cornerRadius", Integer.valueOf(intExtra)), j.a("panEnable", Boolean.valueOf(booleanExtra2)), j.a("drawerNotModal", Boolean.valueOf(!booleanExtra)), j.a("droidFullScreen", Boolean.valueOf(booleanExtra5)), j.a("drawerMode", com.taobao.android.abilitykit.ability.pop.model.c.PAD_FULL_SCREEN_DRAWER), j.a("recoverWindow", true), j.a("adaptSpecificPadPop", true), j.a("animation", "noAnimation"), j.a(com.taobao.android.detail.wrapper.nav.c.STDPOP_CONFIG_BACK, Boolean.valueOf(booleanExtra3)), j.a("droidBlockHandleBack", Boolean.valueOf(booleanExtra4)), j.a("tapEnable", Boolean.valueOf(booleanExtra7)), j.a("autoRotate", Boolean.valueOf(dms.b(context))), j.a(com.taobao.android.detail.wrapper.nav.c.STDPOP_CONFIG_WINDOW_NOTIFY, false));
        if (b2 != null) {
            JSONObject jSONObject = new JSONObject(b2);
            String str = a2;
            if (!(str == null || str.length() == 0)) {
                jSONObject.put((JSONObject) "attachMode", a2);
            }
            if (!booleanExtra) {
                JSONObject jSONObject2 = jSONObject;
                jSONObject2.put((JSONObject) "backgroundMode", "color");
                jSONObject2.put((JSONObject) "backgroundStyle", "#00000000");
            }
            StdPopNativeParams stdPopNativeParams = new StdPopNativeParams(jSONObject);
            Map b3 = ai.b(j.a("showNativeWithCode", Integer.valueOf(intExtra2)), j.a("recreateOnSysChanged", Boolean.valueOf(booleanExtra6)), j.a("recoverWindow", true), j.a("enablePadActTransition", Boolean.valueOf(booleanExtra8)));
            if (b3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            }
            return stdPopNativeParams.extConfig(new JSONObject(new JSONObject(b3)));
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
    }

    @JvmStatic
    public static final scr a(Context context, Intent intent, scq scqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (scr) ipChange.ipc$dispatch("860ab358", new Object[]{context, intent, scqVar});
        }
        if (intent == null) {
            scr scrVar = new scr();
            scrVar.f33478a = false;
            return scrVar;
        } else if (context == null) {
            scr scrVar2 = new scr();
            scrVar2.f33478a = false;
            return scrVar2;
        } else if (dmr.c(context)) {
            try {
                if (context instanceof Activity) {
                    ((Activity) context).startActivityForResult(intent, intent.getIntExtra("stdPopShowWithCode", -1));
                } else {
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                }
            } catch (Throwable unused) {
            }
            scr scrVar3 = new scr();
            scrVar3.f33478a = false;
            return scrVar3;
        } else {
            gmm gmmVar = new gmm();
            gmmVar.a(context);
            gmmVar.a(intent);
            gmmVar.a(new WeakReference<>(context));
            AppMonitor.Counter.commit("AbilityKit", "showDrawerByCtx", intent.getDataString(), 1.0d);
            return a(gmmVar, intent, INSTANCE.a(intent, context), new c(scqVar));
        }
    }

    @JvmStatic
    public static final scr a(Context appContext, Fragment fragment, scq scqVar) {
        String str;
        boolean z;
        boolean z2;
        String str2;
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (scr) ipChange.ipc$dispatch("94a1b683", new Object[]{appContext, fragment, scqVar});
        }
        q.d(appContext, "appContext");
        q.d(fragment, "fragment");
        Class<?> cls = fragment.getClass();
        String str3 = null;
        AppMonitor.Counter.commit("AbilityKit", "showFragmentDrawer", cls != null ? cls.getName() : null, 1.0d);
        Bundle arguments = fragment.getArguments();
        boolean z4 = arguments != null ? arguments.getBoolean("stdPopModal", true) : true;
        float f = 1.0f;
        float f2 = arguments != null ? arguments.getFloat("stdPopMaxW", 1.0f) : 1.0f;
        if (arguments != null) {
            f = arguments.getFloat("stdPopMaxH", 1.0f);
        }
        int i = arguments != null ? arguments.getInt("stdPopCorner", 0) : 0;
        String string = arguments != null ? arguments.getString("stdPopAttachMode") : null;
        Boolean valueOf = arguments != null ? Boolean.valueOf(arguments.getBoolean("stdPopMatchContent", false)) : null;
        String string2 = arguments != null ? arguments.getString("stdPopPopId", null) : null;
        boolean z5 = arguments != null ? arguments.getBoolean("stdPopBlockClose", false) : false;
        boolean z6 = arguments != null ? arguments.getBoolean("stdPopHandleBack", true) : true;
        String string3 = arguments != null ? arguments.getString("stdPopAnimation", null) : null;
        if (arguments != null) {
            str3 = arguments.getString("landScapeAnimation", null);
        }
        boolean z7 = arguments != null ? arguments.getBoolean("stdPopPanEnable", true) : true;
        boolean z8 = arguments != null ? arguments.getBoolean("stdPopBlockHandleBack", false) : false;
        if (arguments != null) {
            str = string2;
            z = true;
            z2 = arguments.getBoolean("stdPopTapEnable", true);
        } else {
            str = string2;
            z = true;
            z2 = true;
        }
        if (arguments != null) {
            str2 = string;
            z3 = arguments.getBoolean("useDrawerMode", z);
        } else {
            str2 = string;
            z3 = true;
        }
        Pair[] pairArr = new Pair[15];
        pairArr[0] = j.a("maxWidth", Float.valueOf(f2));
        pairArr[1] = j.a("maxHeight", Float.valueOf(f));
        pairArr[2] = j.a("cornerRadius", Integer.valueOf(i));
        pairArr[3] = j.a("panEnable", Boolean.valueOf(z7));
        pairArr[4] = j.a("drawerNotModal", Boolean.valueOf(!z4));
        pairArr[5] = j.a(com.taobao.android.abilitykit.ability.pop.model.b.TAK_ABILITY_MATCH_CONTENT, valueOf);
        pairArr[6] = j.a("adaptSpecificPadPop", Boolean.valueOf(z3));
        pairArr[7] = j.a("autoRotate", Boolean.valueOf(dms.b(appContext)));
        pairArr[8] = j.a("shouldBlockClose", Boolean.valueOf(z5));
        pairArr[9] = j.a(com.taobao.android.detail.wrapper.nav.c.STDPOP_CONFIG_BACK, Boolean.valueOf(z6));
        pairArr[10] = j.a("droidBlockHandleBack", Boolean.valueOf(z8));
        pairArr[11] = j.a("landScapeAnimation", string3);
        pairArr[12] = j.a("tapEnable", Boolean.valueOf(z2));
        pairArr[13] = j.a("animation", string3);
        pairArr[14] = j.a("landScapeAnimation", str3);
        Map b2 = ai.b(pairArr);
        if (b2 != null) {
            JSONObject jSONObject = new JSONObject(b2);
            String str4 = str2;
            if (!(str4 == null || str4.length() == 0)) {
                jSONObject.put("attachMode", (Object) str2);
            }
            if (!z4) {
                JSONObject jSONObject2 = jSONObject;
                jSONObject2.put((JSONObject) "backgroundMode", "color");
                jSONObject2.put((JSONObject) "backgroundStyle", "#00000000");
            }
            Map b3 = ai.b(j.a("popId", str), j.a(com.taobao.android.abilitykit.ability.pop.model.c.KEY_POP_CONFIG, jSONObject));
            if (b3 != null) {
                return a(appContext, fragment, new JSONObject(b3), scqVar);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
    }

    @JvmStatic
    private static final scr a(gmm gmmVar, Intent intent, StdPopNativeParams stdPopNativeParams, com.taobao.android.stdpop.api.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (scr) ipChange.ipc$dispatch("6a3c0ef0", new Object[]{gmmVar, intent, stdPopNativeParams, aVar});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("intent = ");
        String str = null;
        sb.append(intent != null ? intent.toString() : null);
        TLog.loge("stdPopTag", sb.toString());
        JSONObject jSONObject = new JSONObject(2);
        jSONObject.put("type", (Object) "showNativePop");
        jSONObject.put("params", (Object) stdPopNativeParams);
        t tVar = t.INSTANCE;
        dlh dlhVar = new dlh(jSONObject);
        dkx<?> a2 = scp.a(intent, gmmVar, new com.taobao.android.abilitykit.ability.pop.model.a(dlhVar.c()), dlhVar, new b(aVar));
        scr scrVar = new scr();
        if (a2 instanceof dkw) {
            dkw dkwVar = (dkw) a2;
            dkv c2 = dkwVar.c();
            scrVar.b = c2 != null ? String.valueOf(c2.a()) : null;
            dkv c3 = dkwVar.c();
            if (c3 != null) {
                str = c3.b();
            }
            scrVar.c = str;
            scrVar.f33478a = false;
        } else {
            scrVar.f33478a = true;
        }
        return scrVar;
    }

    @JvmStatic
    public static final scr a(Context appContext, Fragment fragment, JSONObject params, scq scqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (scr) ipChange.ipc$dispatch("6639f077", new Object[]{appContext, fragment, params, scqVar});
        }
        q.d(appContext, "appContext");
        q.d(fragment, "fragment");
        q.d(params, "params");
        TLog.loge("stdPopTag", "showFragmentPop = " + fragment.getClass().getName());
        dlr dlrVar = new dlr();
        dlrVar.a(appContext);
        JSONObject jSONObject = new JSONObject(2);
        jSONObject.put("type", (Object) "showNativePop");
        jSONObject.put("params", (Object) params);
        t tVar = t.INSTANCE;
        dlh dlhVar = new dlh(jSONObject);
        dkx<?> a2 = scp.a(fragment, dlrVar, new com.taobao.android.abilitykit.ability.pop.model.a(dlhVar.c()), dlhVar, new a(scqVar));
        scr scrVar = new scr();
        if (a2 instanceof dkw) {
            dkw dkwVar = (dkw) a2;
            dkv c2 = dkwVar.c();
            String str = null;
            scrVar.b = c2 != null ? String.valueOf(c2.a()) : null;
            dkv c3 = dkwVar.c();
            if (c3 != null) {
                str = c3.b();
            }
            scrVar.c = str;
            scrVar.f33478a = false;
        } else {
            scrVar.f33478a = true;
        }
        return scrVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0127, code lost:
        if (r10.equals("fullscreen") == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0164, code lost:
        if (r10.equals("offsetFullscreen") != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0166, code lost:
        r1 = 1.0f;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final tb.scr a(tb.gmm r19, com.taobao.android.stdpop.api.a r20) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.scs.a(tb.gmm, com.taobao.android.stdpop.api.a):tb.scr");
    }

    @JvmStatic
    public static final void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else {
            com.taobao.android.abilitykit.ability.pop.presenter.a.Companion.a(context, str, null);
        }
    }

    @JvmStatic
    public static final void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51141ea", new Object[]{context, str, new Boolean(z)});
        } else {
            com.taobao.android.abilitykit.ability.pop.presenter.a.Companion.a(context, str, null, z);
        }
    }

    @JvmStatic
    public static final boolean a(Activity activity) {
        com.taobao.android.abilitykit.ability.pop.model.c b2;
        com.taobao.android.abilitykit.ability.pop.model.b bVar;
        com.taobao.android.abilitykit.ability.pop.model.c b3;
        com.taobao.android.abilitykit.ability.pop.model.b bVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{activity})).booleanValue();
        }
        String str = null;
        if (activity instanceof StdPopActivityGroup) {
            com.taobao.android.tbabilitykit.pop.d a2 = ((StdPopActivityGroup) activity).a();
            if (a2 != null && (b3 = a2.b()) != null && (bVar2 = b3.k) != null) {
                str = bVar2.A();
            }
            return q.a((Object) str, (Object) com.taobao.android.abilitykit.ability.pop.model.c.DEFAULT_LANDSCAPE_DRAWER);
        } else if (!(activity instanceof StdPopContainerActivity)) {
            return false;
        } else {
            com.taobao.android.tbabilitykit.pop.d b4 = ((StdPopContainerActivity) activity).b();
            if (b4 != null && (b2 = b4.b()) != null && (bVar = b2.k) != null) {
                str = bVar.A();
            }
            return q.a((Object) str, (Object) com.taobao.android.abilitykit.ability.pop.model.c.DEFAULT_LANDSCAPE_DRAWER);
        }
    }

    @JvmStatic
    public static final boolean b(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fdb367f", new Object[]{activity})).booleanValue() : c(activity);
    }

    @JvmStatic
    public static final boolean c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("792c4740", new Object[]{activity})).booleanValue();
        }
        return (activity != null ? activity.getParent() : null) instanceof StdPopActivityGroup;
    }
}
