package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.d;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.i;
import com.taobao.android.nav.Nav;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.listener.PlatformListenerEnum;
import com.taobao.taolive.room.openarchitecture.listener.WatchPlatformListenerEnum;
import com.taobao.taolive.room.utils.ap;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.c;
import com.taobao.taolive.sdk.adapter.nav.INavInterceptor;
import com.taobao.taolive.sdk.controller.e;
import com.taobao.taolive.sdk.core.g;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.OpenHiglightAccess;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.tbpoplayer.nativerender.l;
import com.uc.webview.export.media.MessageID;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public class ies implements ier, mff, pjf, pjg, pji, pkf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String c;
    private String A;
    private String B;
    private String C;
    private boolean F;
    private Object I;
    private boolean J;
    private Intent K;
    private squ L;
    private boolean M;

    /* renamed from: a  reason: collision with root package name */
    public TaoliveOpenLiveRoom f28976a;
    public pkg b;
    private Context d;
    private ViewGroup e;
    private String f;
    private String g;
    private String h;
    private VideoInfo i;
    private FandomInfo j;
    private OpenHiglightAccess k;
    private AccountInfo l;
    private String m;
    private boolean o;
    private boolean p;
    private JSONObject q;
    private JSONObject r;
    private DXRootView s;
    private String u;
    private boolean v;
    private boolean w;
    private String y;
    private String z;
    private Float n = Float.valueOf(0.0f);
    private boolean t = true;
    private boolean x = false;
    private List<WeakReference<Activity>> D = new ArrayList();
    private Application.ActivityLifecycleCallbacks E = new Application.ActivityLifecycleCallbacks() { // from class: tb.ies.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            String w = ies.w();
            mfj.c(w, "onActivityCreated " + activity + " " + ies.a(ies.this));
            ies.b(ies.this).add(new WeakReference(activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
                return;
            }
            String w = ies.w();
            mfj.c(w, "onActivityStarted " + activity + " " + ies.a(ies.this));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                return;
            }
            String w = ies.w();
            mfj.c(w, "onActivityResumed " + activity + " " + ies.a(ies.this));
            if (ies.a(ies.this) == null || !ies.a(ies.this).equals(activity)) {
                return;
            }
            pmd.a().r().a(ies.c(ies.this));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
                return;
            }
            String w = ies.w();
            mfj.c(w, "onActivityPaused " + activity + " " + ies.a(ies.this));
            if (ies.a(ies.this) == null || !ies.a(ies.this).equals(activity)) {
                return;
            }
            pmd.a().r().b(ies.c(ies.this));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                return;
            }
            String w = ies.w();
            mfj.c(w, "onActivityStopped " + activity + " " + ies.a(ies.this));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
                return;
            }
            String w = ies.w();
            mfj.c(w, "onActivityDestroyed " + activity + " " + ies.a(ies.this));
            for (int i = 0; i < ies.b(ies.this).size(); i++) {
                WeakReference weakReference = (WeakReference) ies.b(ies.this).get(i);
                if (weakReference != null && weakReference.get() != null && weakReference.get() == activity) {
                    ies.b(ies.this).remove(weakReference);
                }
            }
        }
    };
    private PanguApplication.CrossActivityLifecycleCallback G = new PanguApplication.CrossActivityLifecycleCallback() { // from class: tb.ies.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onCreated(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f00e362", new Object[]{this, activity});
            }
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc107b13", new Object[]{this, activity});
            }
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b167bb", new Object[]{this, activity});
            } else {
                ies.a(ies.this, false);
            }
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82d37207", new Object[]{this, activity});
            } else {
                ies.a(ies.this, true);
            }
        }
    };
    private INavInterceptor H = new INavInterceptor() { // from class: tb.ies.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.taolive.sdk.adapter.nav.INavInterceptor
        public boolean a(Context context, String str, Bundle bundle, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5844084e", new Object[]{this, context, str, bundle, new Integer(i), new Integer(i2)})).booleanValue();
            }
            String w = ies.w();
            mfj.c(w, "onNavIntercept " + str);
            if (!TextUtils.isEmpty(str)) {
                if (ies.d(ies.this) && ies.e(ies.this) && ((str.contains("market.m.taobao.com/app/mtb/app-live-h5-room/home/index.html") || str.contains("h5.m.taobao.com/taolive/video.html") || str.contains("huodong.m.taobao.com/act/talent/live.html")) && ies.this.f28976a != null)) {
                    String w2 = ies.w();
                    mfj.c(w2, "onNavIntercept mEnableMixNavInterceptor " + ies.d(ies.this));
                    Uri parse = Uri.parse(str);
                    boolean booleanQueryParameter = parse != null ? parse.getBooleanQueryParameter(aw.PARAM_FORCE_REFRESH, false) : false;
                    HashMap hashMap = new HashMap();
                    hashMap.put("uri", parse);
                    hashMap.put(aw.PARAM_FORCE_REFRESH, Boolean.valueOf(booleanQueryParameter));
                    hashMap.put("needUT", true);
                    ies.this.f28976a.callWatchPlatform(WatchPlatformListenerEnum.refreshByUi, hashMap);
                    return true;
                }
                String w3 = ies.w();
                mfj.c(w3, "onNavIntercept mEnableMixNavInterceptor " + ies.d(ies.this));
                Intent intentForUri = Nav.from(context).intentForUri(str);
                if (intentForUri != null && intentForUri.getComponent() != null) {
                    String w4 = ies.w();
                    mfj.c(w4, "onNavIntercept  className = " + intentForUri.getComponent().getClassName());
                    if ((ies.a(ies.this) instanceof Activity) && ((Activity) ies.a(ies.this)).getComponentName() != null && ((Activity) ies.a(ies.this)).getComponentName().getClassName() != null && ((Activity) ies.a(ies.this)).getComponentName().getClassName().equals(intentForUri.getComponent().getClassName())) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("targetUrl", str);
                        Nav.from(ies.a(ies.this)).withExtras(bundle2).toUri("https://h5.m.taobao.com/taolive/router.html");
                        return true;
                    }
                }
            }
            return false;
        }
    };
    private g.a N = new g.a() { // from class: tb.ies.4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.taolive.sdk.core.g.a
        public void onGlobalLiveRoomMuteChanged(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ead943b", new Object[]{this, new Boolean(z)});
            } else {
                ies.b(ies.this, z);
            }
        }
    };

    @Override // tb.pjg
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        }
    }

    @Override // tb.pjl
    public void aQ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac53b56", new Object[]{this});
        }
    }

    @Override // tb.pjh
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // tb.pjg
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.pji
    public void cO_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("128009a", new Object[]{this});
        }
    }

    @Override // tb.pjh
    public void cQ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("491b1d8", new Object[]{this});
        }
    }

    @Override // tb.pjk
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        }
    }

    @Override // tb.pjk
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        }
    }

    @Override // tb.pjk
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        }
    }

    @Override // tb.pjl
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        }
    }

    @Override // tb.pkf
    public View j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b51e1df3", new Object[]{this});
        }
        return null;
    }

    @Override // tb.pji
    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
        }
    }

    public static /* synthetic */ Context a(ies iesVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("17372099", new Object[]{iesVar}) : iesVar.d;
    }

    public static /* synthetic */ boolean a(ies iesVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c344f257", new Object[]{iesVar, new Boolean(z)})).booleanValue();
        }
        iesVar.F = z;
        return z;
    }

    public static /* synthetic */ List b(ies iesVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("809a8ee5", new Object[]{iesVar}) : iesVar.D;
    }

    public static /* synthetic */ boolean b(ies iesVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a522bbf6", new Object[]{iesVar, new Boolean(z)})).booleanValue();
        }
        iesVar.M = z;
        return z;
    }

    public static /* synthetic */ INavInterceptor c(ies iesVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (INavInterceptor) ipChange.ipc$dispatch("98dbc32c", new Object[]{iesVar}) : iesVar.H;
    }

    public static /* synthetic */ boolean d(ies iesVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b90f6828", new Object[]{iesVar})).booleanValue() : iesVar.w;
    }

    public static /* synthetic */ boolean e(ies iesVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a7926ea9", new Object[]{iesVar})).booleanValue() : iesVar.p;
    }

    public static /* synthetic */ boolean f(ies iesVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9615752a", new Object[]{iesVar})).booleanValue() : iesVar.F;
    }

    public static /* synthetic */ String g(ies iesVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("da715bd9", new Object[]{iesVar}) : iesVar.u;
    }

    public static /* synthetic */ DXRootView h(ies iesVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("7ae46af", new Object[]{iesVar}) : iesVar.s;
    }

    public static /* synthetic */ JSONObject i(ies iesVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("11284fc9", new Object[]{iesVar}) : iesVar.r;
    }

    public static /* synthetic */ squ j(ies iesVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (squ) ipChange.ipc$dispatch("df4f4125", new Object[]{iesVar}) : iesVar.L;
    }

    public static /* synthetic */ String w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f74eee2", new Object[0]) : c;
    }

    static {
        kge.a(-1530013742);
        kge.a(514298380);
        kge.a(-598112112);
        kge.a(-1025874655);
        kge.a(-1829180491);
        kge.a(-2044291106);
        kge.a(1038752494);
        c = ies.class.getSimpleName();
    }

    public ies(Context context, Object obj, boolean z, Intent intent) {
        mfj.c(c, "MixLiveRoomController");
        this.J = z;
        this.I = obj;
        this.K = intent;
        mfg.a().a(this);
        this.d = context;
        this.w = i.t();
        if (this.K.getData() != null) {
            this.f = this.K.getData().toString();
        } else {
            this.f = "https://h5.m.taobao.com/taolive/video.html";
        }
        pmd.a().r().a(this.H);
        ((PanguApplication) Globals.getApplication()).registerCrossActivityLifecycleCallback(this.G);
    }

    public void a(Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f847471", new Object[]{this, f});
        } else {
            this.n = f;
        }
    }

    public void a(squ squVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff40cda1", new Object[]{this, squVar});
        } else {
            this.L = squVar;
        }
    }

    public View k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ff4fb734", new Object[]{this});
        }
        mfj.c(c, "getRootView");
        return this.e;
    }

    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb64bd29", new Object[]{this, viewGroup});
        }
        mfj.c(c, "onCreateView");
        this.e = (ViewGroup) LayoutInflater.from(this.d).inflate(R.layout.mix_live_root_flexalocal, viewGroup, false);
        cgl.g().a().registerActivityLifecycleCallbacks(this.E);
        if (x()) {
            cT_();
        }
        return this.e;
    }

    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        this.d = context;
        return this.e;
    }

    public void a(Intent intent) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
        } else if (intent == null) {
        } else {
            ((Activity) this.d).setIntent(intent);
            Uri data = intent.getData();
            if (data == null) {
                return;
            }
            String queryParameter = data.getQueryParameter("channelType");
            String queryParameter2 = data.getQueryParameter("smallWindowClick");
            String queryParameter3 = data.getQueryParameter(d.LIVE_HOME_PAGE_TYPE);
            if (!"jingxuan,singleLiveTab".equals(queryParameter)) {
                return;
            }
            if ("true".equals(queryParameter2) && !this.p && this.o) {
                if (this.s != null && (jSONObject2 = this.r) != null && jSONObject2.getString("tabChangeIndex") != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("channelType", (Object) d.TAB_SINGLELIVE);
                    squ squVar = this.L;
                    if (squVar == null) {
                        return;
                    }
                    squVar.onSwitchToSingleTab(this.r.getString("tabChangeIndex"), this.s, jSONObject3);
                    return;
                }
                squ squVar2 = this.L;
                if (squVar2 == null) {
                    return;
                }
                squVar2.onSwitchToSingleTab(null, null, null);
                return;
            }
            boolean booleanQueryParameter = data.getBooleanQueryParameter(aw.PARAM_FORCE_REFRESH, false);
            HashMap hashMap = new HashMap();
            hashMap.put("uri", a(data, queryParameter3));
            hashMap.put(aw.PARAM_FORCE_REFRESH, Boolean.valueOf(booleanQueryParameter));
            this.f28976a.callWatchPlatform(WatchPlatformListenerEnum.refreshByUi, hashMap);
            if (this.p) {
                return;
            }
            if (this.s != null && (jSONObject = this.r) != null && jSONObject.getString("tabChangeIndex") != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("channelType", (Object) d.TAB_SINGLELIVE);
                squ squVar3 = this.L;
                if (squVar3 == null) {
                    return;
                }
                squVar3.onSwitchToSingleTab(this.r.getString("tabChangeIndex"), this.s, jSONObject4);
                return;
            }
            squ squVar4 = this.L;
            if (squVar4 == null) {
                return;
            }
            squVar4.onSwitchToSingleTab(null, null, null);
        }
    }

    private Uri a(Uri uri, String str) {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        boolean z = true;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("e52e6d20", new Object[]{this, uri, str});
        }
        String uri2 = uri.toString();
        if (d.LIVE_HOME_PAGE_TYPE_mixLive.equals(str) || d.LIVE_HOME_PAGE_TYPE_mixLiveAndTab.equals(str)) {
            z = false;
        }
        if (z) {
            this.m = uri.getQueryParameter("livesource");
            this.z = uri.getQueryParameter("spm");
            uri2 = c.a(c.a(c.a(c.a("https://h5.m.taobao.com/taolive/video.html", aw.PARAM_NEED_RECOMMEND, "true"), "livesource", this.m), "spm", this.z), aw.PARAM_IS_LIVE_MUTE, String.valueOf(this.M));
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.f28976a;
        if (taoliveOpenLiveRoom != null) {
            if (taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.isDestroyed, new Object[0]) != null) {
                z2 = ((Boolean) this.f28976a.callWatchPlatform(WatchPlatformListenerEnum.isDestroyed, new Object[0])).booleanValue();
            }
            if (z2 && (viewGroup = this.e) != null) {
                viewGroup.removeAllViews();
                d(uri2);
            }
        } else {
            d(uri2);
        }
        return Uri.parse(uri2);
    }

    private boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue();
        }
        mfj.c(c, "enablePreLoad");
        if (this.q == null) {
            return false;
        }
        String str = c;
        mfj.c(str, "enablePreLoad mQueryParamsJson " + this.q);
        String string = this.q.getString("selectedSingleLiveTab");
        String string2 = this.q.getString("channelType");
        if ("true".equals(string)) {
            string2 = "jingxuan,singleLiveTab";
        }
        this.v = "jingxuan,singleLiveTab".equals(string2);
        return !this.J && this.v && i.u();
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        String str = c;
        mfj.c(str, "setQueryParamsJson queryParamsJson " + jSONObject);
        this.q = jSONObject;
        y();
    }

    private void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        mfj.c(c, "initParams");
        this.u = "normal";
        JSONObject jSONObject = this.q;
        if (jSONObject == null) {
            return;
        }
        String string = jSONObject.getString(d.LIVE_HOME_PAGE_TYPE);
        if (!TextUtils.isEmpty(string)) {
            this.u = string;
        }
        this.m = this.q.getString("livesource");
        this.y = this.q.getString("tabSpm");
        this.z = this.q.getString("spm");
        this.B = this.q.getString("scm");
        this.C = Uri.encode(this.q.getString(aw.PARAM_UT_PARAMS));
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        String str2 = c;
        mfj.c(str2, "initController url " + str);
        this.e.addView(a((Activity) this.d, str));
        if (this.f28976a == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(DataReceiveMonitor.CB_LISTENER, new ISmallWindowStrategy() { // from class: tb.ies.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy
            public void a(View view, String str3, String str4, String str5) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b9b1c8", new Object[]{this, view, str3, str4, str5});
                    return;
                }
                for (WeakReference weakReference : ies.b(ies.this)) {
                    if (weakReference != null && weakReference.get() != null && !((Activity) weakReference.get()).isFinishing()) {
                        ((Activity) weakReference.get()).finish();
                    }
                }
                if (ies.f(ies.this)) {
                    Nav from = Nav.from(ies.a(ies.this));
                    from.toUri("http://h5.m.taobao.com/taolive/main.html?channelType=jingxuan,singleLiveTab&smallWindowClick=true&id=" + str4 + "&liveHomePageType=" + ies.g(ies.this));
                    if (((Activity) ies.a(ies.this)).getIntent() == null || ((Activity) ies.a(ies.this)).getIntent().getExtras() == null || !((Activity) ies.a(ies.this)).getIntent().getExtras().getBoolean("cold_startup_h5")) {
                        return;
                    }
                    ((Activity) ies.a(ies.this)).finish();
                } else if (ies.h(ies.this) == null || ies.i(ies.this) == null || ies.i(ies.this).getString("tabChangeIndex") == null) {
                    if (ies.j(ies.this) == null) {
                        return;
                    }
                    ies.j(ies.this).onSwitchToSingleTab(null, null, null);
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("channelType", (Object) d.TAB_SINGLELIVE);
                    if (ies.j(ies.this) == null) {
                        return;
                    }
                    ies.j(ies.this).onSwitchToSingleTab(ies.i(ies.this).getString("tabChangeIndex"), ies.h(ies.this), jSONObject);
                }
            }
        });
        this.f28976a.callWatchPlatform(WatchPlatformListenerEnum.setSmallWindowClickListener, hashMap);
        Object callWatchPlatform = this.f28976a.callWatchPlatform(WatchPlatformListenerEnum.getGlobalContext, new Object[0]);
        if (!(callWatchPlatform instanceof e)) {
            return;
        }
        e eVar = (e) callWatchPlatform;
        this.M = eVar.r();
        eVar.a(this.N);
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.f28976a;
        if (taoliveOpenLiveRoom == null || !this.o || !this.p) {
            return;
        }
        taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onStart, new Object[0]);
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else {
            A();
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        mfj.c(c, "onAppear");
        this.x = true;
        if (i.x()) {
            this.p = true;
        }
        l();
        A();
    }

    private void cT_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b03bb5", new Object[]{this});
            return;
        }
        mfj.c(c, oyw.PRE_LOAD);
        d(c(this.f));
        this.o = true;
        this.p = true;
        l();
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.f28976a;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onResume, new Object[0]);
        }
        this.t = false;
    }

    private void A() {
        ViewGroup viewGroup;
        String a2;
        OpenHiglightAccess openHiglightAccess;
        String c2;
        String str;
        String str2;
        String a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
            return;
        }
        mfj.c(c, "resume");
        if (this.t) {
            mfj.c(c, "resume mNeePreLoadResume " + this.t);
            TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.f28976a;
            boolean booleanValue = (taoliveOpenLiveRoom == null || taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.isDestroyed, new Object[0]) == null) ? false : ((Boolean) this.f28976a.callWatchPlatform(WatchPlatformListenerEnum.isDestroyed, new Object[0])).booleanValue();
            String str3 = "https://h5.m.taobao.com/taolive/video.html";
            if (!this.o) {
                String str4 = this.f;
                if (!this.v) {
                    squ squVar = this.L;
                    JSONArray jSONArray = null;
                    JSONObject tabRecommendData = squVar != null ? squVar.getTabRecommendData() : null;
                    if (tabRecommendData != null) {
                        str2 = tabRecommendData.getString(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID);
                        str = tabRecommendData.getString("liveUrlList");
                    } else {
                        str = null;
                        str2 = null;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        a3 = c.a(str3, "id", str2);
                        if (!TextUtils.isEmpty(str)) {
                            a3 = c.a(a3, aw.PARAM_CUSTOM_PLAY_CTRL, Uri.encode(str));
                        }
                    } else {
                        a3 = c.a(str3, aw.PARAM_NEED_RECOMMEND, "true");
                    }
                    squ squVar2 = this.L;
                    if (squVar2 != null) {
                        jSONArray = squVar2.getChannelTabExpInfo();
                    }
                    if (jSONArray != null) {
                        a3 = c.a(a3, aw.CHANNEL_EXP_INFO, Uri.encode(jSONArray.toJSONString()));
                    }
                    c2 = c.a(c.a(a3, "livesource", "newslide"), "spm", "a2141.28677910");
                    this.m = "newslide";
                    this.z = "a2141.28677910";
                } else {
                    c2 = c(str4);
                }
                d(c2);
                this.o = true;
                ap.b = System.currentTimeMillis();
                ap.c = true;
            } else if (booleanValue && (viewGroup = this.e) != null) {
                viewGroup.removeAllViews();
                if (!TextUtils.isEmpty(this.m)) {
                    str3 = c.d(str3, this.m);
                }
                if (!TextUtils.isEmpty(this.z)) {
                    str3 = c.a(str3, "spm", this.z);
                }
                String a4 = c.a(str3, aw.PARAM_IS_LIVE_MUTE, String.valueOf(this.M));
                if (i.w() && (openHiglightAccess = this.k) != null && openHiglightAccess.highlightSkipParams != null && this.k.highlightSkipParams.id != null) {
                    a2 = c.a(a4, "id", this.k.highlightSkipParams.id);
                    String str5 = this.A;
                    if (str5 != null && str5.equals(this.k.highlightSkipParams.id)) {
                        String str6 = this.B;
                        if (str6 != null) {
                            a2 = c.a(a2, "scm", str6);
                        }
                        String str7 = this.C;
                        if (str7 != null) {
                            a2 = c.a(a2, aw.PARAM_UT_PARAMS, str7);
                        }
                    }
                    if (!TextUtils.isEmpty(this.k.highlightSkipParams.keyPointId)) {
                        a2 = c.a(a2, aw.PARAM_TIMEMOVE_KEYPOINTID, this.k.highlightSkipParams.keyPointId);
                    }
                    if (!TextUtils.isEmpty(this.k.highlightSkipParams.productType)) {
                        a2 = c.a(a2, aw.PARAM_PRODUCT_TYPE, this.k.highlightSkipParams.productType);
                    }
                    if (!TextUtils.isEmpty(this.k.highlightSkipParams.sjsdItemId)) {
                        a2 = c.a(a2, aw.PARAM_SJSD_ITEM_ID, this.k.highlightSkipParams.sjsdItemId);
                    }
                } else {
                    if (!TextUtils.isEmpty(this.g)) {
                        a4 = c.a(a4, "id", this.g);
                    }
                    String str8 = this.A;
                    if (str8 != null && str8.equals(this.g)) {
                        String str9 = this.B;
                        if (str9 != null) {
                            a4 = c.a(a4, "scm", str9);
                        }
                        String str10 = this.C;
                        if (str10 != null) {
                            a4 = c.a(a4, aw.PARAM_UT_PARAMS, str10);
                        }
                    }
                    if (!TextUtils.isEmpty(this.h)) {
                        a2 = c.a(a4, "userId", this.h);
                    } else {
                        a2 = c.a(a4, aw.PARAM_NEED_RECOMMEND, "true");
                    }
                }
                d(a2);
            }
            u();
            TaoliveOpenLiveRoom taoliveOpenLiveRoom2 = this.f28976a;
            if (taoliveOpenLiveRoom2 != null && this.o && this.p) {
                taoliveOpenLiveRoom2.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onResume, new Object[0]);
            }
        }
        this.t = true;
    }

    private String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        Uri parse = Uri.parse(str);
        return (parse.getQueryParameter("id") == null && parse.getQueryParameter("userId") == null && !"true".equals(parse.getQueryParameter(aw.PARAM_NEED_RECOMMEND))) ? c.a(str, aw.PARAM_NEED_RECOMMEND, "true") : str;
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        String a2 = c.a(str, aw.PARAM_LIVE_ROOM_SPM_PARAM, !TextUtils.isEmpty(this.y) ? this.y : "a2141.28646552");
        String str2 = c;
        mfj.c(str2, "init url " + a2);
        v();
        b(a2);
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        mfj.c(c, "pageSelected");
        this.p = true;
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        mfj.c(c, "onDisappear");
        this.p = false;
        r();
        e("false");
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        mfj.c(c, "onPause");
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.f28976a;
        if (taoliveOpenLiveRoom == null || !this.o) {
            return;
        }
        taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onPause, new Object[0]);
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        mfj.c(c, MessageID.onStop);
        e("true");
    }

    private void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else if (this.f28976a == null || !this.o) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("showSmallWindow", str);
            this.f28976a.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onStop, hashMap);
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        String str = c;
        mfj.c(str, "onDestroy " + this);
        this.A = null;
        pmd.a().r().b(this.H);
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.f28976a;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onDestroy, new Object[0]);
        }
        cgl.g().a().unregisterActivityLifecycleCallbacks(this.E);
        ((PanguApplication) Globals.getApplication()).unregisterCrossActivityLifecycleCallback(this.G);
        mfg.a().b(this);
    }

    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        String str = c;
        mfj.c(str, "onActivityResult " + i + " " + i2);
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.f28976a;
        if (taoliveOpenLiveRoom == null) {
            return;
        }
        if (i == 20000) {
            taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.processGoToDetailAction, new Object[0]);
        } else if (i == 20001) {
            taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.processGoToBulkDetailAction, new Object[0]);
        } else if (i != 10000) {
        } else {
            HashMap hashMap = new HashMap();
            if (i2 == 8) {
                hashMap.put("success", false);
            } else if (i2 == 1) {
                hashMap.put("success", true);
            }
            this.f28976a.callWatchPlatform(WatchPlatformListenerEnum.processAddCartAction, hashMap);
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        iet ietVar = new iet();
        ietVar.a((ier) this);
        ietVar.a((pjg) this);
        ietVar.a((pji) this);
        ietVar.a((pjf) this);
        HashMap hashMap = new HashMap();
        hashMap.put(d.LIVE_HOME_PAGE_TYPE, this.u);
        if (i.v()) {
            hashMap.put("aliveChanel", "TaoBaoOpenWatchMixed");
        }
        hashMap.put("utPage", this.I);
        this.b = pki.a().a(this.d, TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.toString(), this, ietVar, hashMap);
        pki.a().a(this.b);
        this.f28976a = pki.a().b(this.b);
        this.I = null;
    }

    public View a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("927f446", new Object[]{this, activity, str});
        }
        if (this.b != null && this.f28976a != null) {
            return pki.a().a(this.b, this.f28976a, activity, str, (pla) null);
        }
        return new View(activity);
    }

    @Override // tb.pjg
    public void a(String str, String str2, String str3) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        String str4 = c;
        mfj.c(str4, "onFollowAction " + this + " mTabSelected: " + this.p + " accountId:" + str);
        if (!this.p || this.L == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("follow", (Object) "true");
        jSONObject2.put("accountId", (Object) str);
        c(true);
        if (this.s != null && (jSONObject = this.r) != null && jSONObject.getString("followCallback") != null) {
            this.L.onFollowChangedAction(this.r.getString("followCallback"), this.s, jSONObject2);
        } else {
            this.L.onFollowChangedAction(null, null, jSONObject2);
        }
    }

    @Override // tb.pjg
    public void b(String str, String str2, String str3) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{this, str, str2, str3});
            return;
        }
        String str4 = c;
        mfj.c(str4, "onUnfollowAciton " + this + " mTabSelected: " + this.p + " accountId:" + str);
        if (!this.p || this.L == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("follow", (Object) "false");
        jSONObject2.put("accountId", (Object) str);
        c(false);
        if (this.s != null && (jSONObject = this.r) != null && jSONObject.getString("followCallback") != null) {
            this.L.onFollowChangedAction(this.r.getString("followCallback"), this.s, jSONObject2);
        } else {
            this.L.onFollowChangedAction(null, null, jSONObject2);
        }
    }

    public void c(boolean z) {
        VideoInfo videoInfo;
        AccountInfo accountInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else if (!i.G() || (videoInfo = this.i) == null || a(videoInfo) || (accountInfo = this.i.broadCaster) == null) {
        } else {
            accountInfo.follow = z;
            if (z) {
                return;
            }
            accountInfo.topFollow = false;
        }
    }

    private boolean a(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ead9f969", new Object[]{this, videoInfo})).booleanValue() : videoInfo != null && videoInfo.officialLiveInfo != null && !TextUtils.isEmpty(videoInfo.officialLiveInfo.officialLive) && "1".equals(videoInfo.roomStatus) && "official".equals(videoInfo.officialLiveInfo.officialLive);
    }

    @Override // tb.pji
    public void n() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        String str = c;
        mfj.c(str, "onHorizontalScrollEnable " + this + " mTabSelected: " + this.p);
        if (!this.p || this.L == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(l.TRIGGER_NAME_SCROLL_STATUS, (Object) "true");
        if (this.s != null && (jSONObject = this.r) != null && jSONObject.getString("updateTabScrollStatus") != null) {
            this.L.onHorizontalScrollEnable(this.r.getString("updateTabScrollStatus"), this.s, jSONObject2);
        } else {
            this.L.onHorizontalScrollEnable(null, null, jSONObject2);
        }
    }

    @Override // tb.pji
    public void o() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        String str = c;
        mfj.c(str, "onHorizontalScrollDisable " + this + " mTabSelected: " + this.p);
        if (!this.p || this.L == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(l.TRIGGER_NAME_SCROLL_STATUS, (Object) "false");
        if (this.s != null && (jSONObject = this.r) != null && jSONObject.getString("updateTabScrollStatus") != null) {
            this.L.onHorizontalScrollEnable(this.r.getString("updateTabScrollStatus"), this.s, jSONObject2);
        } else {
            this.L.onHorizontalScrollEnable(null, null, jSONObject2);
        }
    }

    @Override // tb.pjj
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.x = false;
        }
    }

    @Override // tb.pjj
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!this.x) {
        } else {
            this.x = false;
            String str = "https://h5.m.taobao.com/taolive/video.html";
            if (!TextUtils.isEmpty(this.m)) {
                str = c.d(str, this.m);
            }
            Uri parse = Uri.parse(c.a(str, aw.PARAM_NEED_RECOMMEND, "true"));
            HashMap hashMap = new HashMap();
            hashMap.put("uri", parse);
            hashMap.put(aw.PARAM_FORCE_REFRESH, true);
            this.f28976a.callWatchPlatform(WatchPlatformListenerEnum.refreshByUi, hashMap);
        }
    }

    @Override // tb.pkf
    public Float aR_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Float) ipChange.ipc$dispatch("7d17be3e", new Object[]{this}) : this.n;
    }

    @Override // tb.pkf
    public Float i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Float) ipChange.ipc$dispatch("c7707cb9", new Object[]{this}) : Float.valueOf(0.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
        if (r5.equals(r4.k.accountId) != false) goto L15;
     */
    @Override // tb.ier
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.Object r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ies.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r4
            r1[r3] = r5
            java.lang.String r5 = "a6251244"
            r0.ipc$dispatch(r5, r1)
            return
        L15:
            boolean r0 = r5 instanceof com.taobao.taolive.sdk.model.common.VideoInfo
            r1 = 0
            if (r0 == 0) goto L3b
            r4.k = r1
            com.taobao.taolive.sdk.model.common.VideoInfo r5 = (com.taobao.taolive.sdk.model.common.VideoInfo) r5
            r4.i = r5
            com.taobao.taolive.sdk.model.common.AccountInfo r5 = r5.broadCaster
            r4.l = r5
            com.taobao.taolive.sdk.model.common.VideoInfo r5 = r4.i
            java.lang.String r5 = r5.liveId
            r4.g = r5
            java.lang.String r5 = r4.A
            if (r5 != 0) goto L32
            java.lang.String r5 = r4.g
            r4.A = r5
        L32:
            com.taobao.taolive.sdk.model.common.AccountInfo r5 = r4.l
            if (r5 == 0) goto L6d
            java.lang.String r5 = r5.accountId
            r4.h = r5
            goto L6d
        L3b:
            boolean r0 = r5 instanceof com.taobao.taolive.sdk.model.common.FandomInfo
            if (r0 == 0) goto L56
            r4.k = r1
            r4.i = r1
            com.taobao.taolive.sdk.model.common.FandomInfo r5 = (com.taobao.taolive.sdk.model.common.FandomInfo) r5
            com.taobao.taolive.sdk.model.common.AccountInfo r0 = r5.broadCaster
            r4.l = r0
            r4.j = r5
            r4.g = r1
            com.taobao.taolive.sdk.model.common.AccountInfo r5 = r4.l
            if (r5 == 0) goto L6d
            java.lang.String r5 = r5.accountId
            r4.h = r5
            goto L6d
        L56:
            boolean r0 = r5 instanceof com.taobao.taolive.sdk.model.common.OpenHiglightAccess
            if (r0 == 0) goto L6d
            com.taobao.taolive.sdk.model.common.OpenHiglightAccess r5 = (com.taobao.taolive.sdk.model.common.OpenHiglightAccess) r5
            r4.k = r5
            java.lang.String r5 = r4.h
            if (r5 == 0) goto L6d
            com.taobao.taolive.sdk.model.common.OpenHiglightAccess r0 = r4.k
            java.lang.String r0 = r0.accountId
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L6d
            goto L6e
        L6d:
            r2 = 1
        L6e:
            if (r2 == 0) goto L73
            r4.D()
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ies.a(java.lang.Object):void");
    }

    private void D() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
            return;
        }
        String str = c;
        mfj.c(str, "notifyAccountInfo " + this + " mTabSelected: " + this.p);
        if (this.L == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        VideoInfo videoInfo = this.i;
        if (videoInfo != null && videoInfo.officialLiveInfo != null && "official".equals(this.i.officialLiveInfo.officialLive)) {
            jSONObject2.put("accountHeadPic", (Object) this.i.officialLiveInfo.officialHeadImg);
            jSONObject2.put("accountName", (Object) this.i.officialLiveInfo.accountName);
            jSONObject2.put("accountId", (Object) this.i.officialLiveInfo.accountId);
            jSONObject2.put("follow", (Object) String.valueOf(this.i.officialLiveInfo.follow));
            jSONObject2.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, (Object) this.i.officialLiveInfo.officialLiveId);
        } else {
            jSONObject2.put("accountHeadPic", (Object) this.l.headImg);
            jSONObject2.put("accountName", (Object) this.l.accountName);
            jSONObject2.put("accountId", (Object) this.l.accountId);
            jSONObject2.put("follow", (Object) String.valueOf(this.l.follow));
            jSONObject2.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, (Object) this.g);
        }
        if (this.s != null && (jSONObject = this.r) != null && jSONObject.getString("updateTabAccount") != null && this.l != null) {
            this.L.onAccountInfoChanged(this.r.getString("updateTabAccount"), this.s, jSONObject2);
        } else {
            this.L.onAccountInfoChanged(null, null, jSONObject2);
        }
    }

    @Override // tb.mff
    public void onLiveEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d9ef1c", new Object[]{this, str, obj});
            return;
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1758525404) {
            if (hashCode == -1623001426 && str.equals("com.taobao.taolive.mix.follow.action")) {
                c2 = 0;
            }
        } else if (str.equals("com.taobao.taolive.mix.present.avatarpage.action")) {
            c2 = 1;
        }
        if (c2 == 0) {
            if (this.f28976a == null || this.l == null) {
                return;
            }
            String str2 = c;
            mfj.c(str2, "EventType.EVENT_MIX_FOLLOW_ACTION " + this + " mTabSelected: " + this.p);
            HashMap hashMap = new HashMap();
            VideoInfo videoInfo = this.i;
            if (videoInfo != null && videoInfo.officialLiveInfo != null && "official".equals(this.i.officialLiveInfo.officialLive)) {
                hashMap.put("accountId", this.i.officialLiveInfo.accountId);
            } else {
                hashMap.put("accountId", this.l.accountId);
                hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_ENCODE_ACCOUNT_ID, this.l.encodeAccountId);
            }
            hashMap.put("accountType", "");
            hashMap.put("followSource", d.LIVE_HOME_PAGE_TYPE_mixLive);
            this.f28976a.callPlatform(PlatformListenerEnum.onFollowAction, hashMap);
        } else if (c2 != 1 || this.f28976a == null || this.l == null) {
        } else {
            String str3 = c;
            mfj.c(str3, "EventType.EVENT_MIX_PRESENT_AVATARPAGE_ACTION " + this + " mTabSelected: " + this.p);
            HashMap hashMap2 = new HashMap();
            VideoInfo videoInfo2 = this.i;
            if (videoInfo2 != null) {
                if (videoInfo2.officialLiveInfo != null && "official".equals(this.i.officialLiveInfo.officialLive)) {
                    hashMap2.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, this.i.officialLiveInfo.officialLiveId);
                } else {
                    hashMap2.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, this.i.liveId);
                }
                hashMap2.put("sourceType", d.LIVE_HOME_PAGE_TYPE_mixLive);
            } else if (this.j != null) {
                hashMap2.put("sourceType", "mixFandom");
            }
            VideoInfo videoInfo3 = this.i;
            if (videoInfo3 != null && videoInfo3.officialLiveInfo != null && "official".equals(this.i.officialLiveInfo.officialLive)) {
                hashMap2.put("accountId", this.i.officialLiveInfo.accountId);
            } else {
                hashMap2.put("accountId", this.l.accountId);
                hashMap2.put(LiveAvatarNewFrame.LIVE_AVATAR_ENCODE_ACCOUNT_ID, this.l.encodeAccountId);
            }
            this.f28976a.callPlatform(PlatformListenerEnum.needPresentAvatarPage, hashMap2);
        }
    }
}
