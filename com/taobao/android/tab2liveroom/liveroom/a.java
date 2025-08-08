package com.taobao.android.tab2liveroom.liveroom;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.Fragment;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaMeasureFunction;
import com.taobao.android.layoutmanager.adapter.impl.n;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.tab2liveroom.liveroom.preload.LivePreloadData;
import com.taobao.android.tab2liveroom.liveroom.topAvatar.d;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.ad;
import com.taobao.tao.flexbox.layoutmanager.core.s;
import com.taobao.taolive.room.launch.TaoLiveLaunchInitializer;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.listener.PlatformListenerEnum;
import com.taobao.taolive.room.openarchitecture.listener.WatchPlatformListenerEnum;
import com.taobao.taolive.room.utils.ap;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.adapter.nav.INavInterceptor;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.mqn;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ogl;
import tb.pkg;
import tb.pki;
import tb.pla;
import tb.pmd;
import tb.pnw;
import tb.tjy;

/* loaded from: classes6.dex */
public class a extends Component<FrameLayout, b> implements s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_REFRESH_URL = "https://h5.m.taobao.com/taolive/video.html?livesource=tb_tab2.guangguang_newlivetab";
    public static final String KEY_LIVE_TAB_TOP_ITEM_SWITCH = "live_tab_top_item_switch";
    public static final String KEY_QUERY = "query";
    public static final String TAG = "[live-native]";
    private static boolean b;
    private com.taobao.android.tab2liveroom.liveroom.topAvatar.d c;
    private View d;
    private TaoliveOpenLiveRoom e;
    private pkg f;
    private com.taobao.android.tab2liveroom.liveroom.plugins.a g;
    private String h;
    private VideoInfo i;
    private FrameLayout k;
    private boolean l;
    private mqn m;
    private com.taobao.android.tab2liveroom.liveroom.immersive.a n;
    private LivePreloadData t;
    private boolean j = oeb.a("enableLiveRoomIntercept", true);

    /* renamed from: a  reason: collision with root package name */
    public boolean f15282a = true;
    private t o = tjy.b("tab2");
    private List<InterfaceC0586a> s = new CopyOnWriteArrayList();
    private Handler p = new Handler(Looper.getMainLooper()) { // from class: com.taobao.android.tab2liveroom.liveroom.a.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what != 1) {
            } else {
                a.a(a.this, false);
            }
        }
    };
    private ComponentCallbacks q = new ComponentCallbacks() { // from class: com.taobao.android.tab2liveroom.liveroom.a.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            } else if (a.a(a.this).aj() || !oeb.cB()) {
            } else {
                ogg.c(a.TAG, "onLowMemory");
                a.b(a.this).removeMessages(1);
                a.b(a.this).sendEmptyMessage(1);
            }
        }
    };
    private INavInterceptor r = new INavInterceptor() { // from class: com.taobao.android.tab2liveroom.liveroom.a.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.taolive.sdk.adapter.nav.INavInterceptor
        public boolean a(Context context, String str, Bundle bundle, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5844084e", new Object[]{this, context, str, bundle, new Integer(i), new Integer(i2)})).booleanValue();
            }
            ogg.c(a.TAG, "onNavIntercept, url: " + str + " appear:" + a.c(a.this).o());
            if (a.d(a.this) && !StringUtils.isEmpty(str)) {
                Uri parse = Uri.parse(str);
                if (a.e(a.this) != null && a.f(a.this).o() && context == a.g(a.this).N() && e.b(parse)) {
                    a.a(a.this, str, parse.getBooleanQueryParameter(aw.PARAM_FORCE_REFRESH, false));
                    return true;
                }
            }
            return false;
        }
    };

    /* renamed from: com.taobao.android.tab2liveroom.liveroom.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public interface InterfaceC0586a {
        void a(Map map, Map map2);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 112483626) {
            super.onCreate((aa) objArr[0]);
            return null;
        } else if (hashCode == 258418204) {
            return new Boolean(super.invoke((g.c) objArr[0], (String) objArr[1], (JSONObject) objArr[2], (g.d) objArr[3]));
        } else {
            if (hashCode != 1052797818) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.detach(((Boolean) objArr[0]).booleanValue());
            return null;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleTNodeMessage(aa aaVar, aa aaVar2, String str, String str2, Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30d88851", new Object[]{this, aaVar, aaVar2, str, str2, map, bVar})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ aa a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("d0482958", new Object[]{aVar}) : aVar.node;
    }

    public static /* synthetic */ void a(a aVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e8c2664", new Object[]{aVar, str, new Boolean(z)});
        } else {
            aVar.a(str, z);
        }
    }

    public static /* synthetic */ void a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f146c96e", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.d(z);
        }
    }

    public static /* synthetic */ Handler b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("69ed0f3f", new Object[]{aVar}) : aVar.p;
    }

    public static /* synthetic */ boolean b(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2f06f91", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.l = z;
        return z;
    }

    public static /* synthetic */ aa c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("6fc89096", new Object[]{aVar}) : aVar.node;
    }

    public static /* synthetic */ boolean d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a34c7c2d", new Object[]{aVar})).booleanValue() : aVar.j;
    }

    public static /* synthetic */ TaoliveOpenLiveRoom e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoliveOpenLiveRoom) ipChange.ipc$dispatch("8623d936", new Object[]{aVar}) : aVar.e;
    }

    public static /* synthetic */ aa f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("df092b73", new Object[]{aVar}) : aVar.node;
    }

    public static /* synthetic */ aa g(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("aec95f12", new Object[]{aVar}) : aVar.node;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [tb.ogl, com.taobao.android.tab2liveroom.liveroom.b] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public /* synthetic */ b mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("36baa12b", new Object[]{this}) : c();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.widget.FrameLayout, android.view.View] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ FrameLayout onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : a(context);
    }

    static {
        kge.a(33451302);
        kge.a(-1420926486);
        b = false;
    }

    public com.taobao.android.tab2liveroom.liveroom.topAvatar.d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.tab2liveroom.liveroom.topAvatar.d) ipChange.ipc$dispatch("369a1eea", new Object[]{this}) : this.c;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public YogaMeasureFunction onCreateMeasureFunction() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (YogaMeasureFunction) ipChange.ipc$dispatch("622da8f1", new Object[]{this}) : this.n.a();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onCreate(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b45d2a", new Object[]{this, aaVar});
            return;
        }
        super.onCreate(aaVar);
        this.n = new com.taobao.android.tab2liveroom.liveroom.immersive.a(this, aaVar.N());
    }

    public FrameLayout a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b87ee879", new Object[]{this, context});
        }
        ogg.c(TAG, "onCreateView");
        this.n.b();
        l();
        String a2 = a(((b) this.viewParams).f15288a, a(b(context)));
        C();
        this.h = e.a(a2, this.t);
        this.k = new FrameLayout(context);
        return this.k;
    }

    private void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
            return;
        }
        this.t = com.taobao.android.tab2liveroom.liveroom.preload.b.a().c();
        com.taobao.android.tab2liveroom.liveroom.preload.b.a().d();
    }

    private Map b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c7c4b7f4", new Object[]{this, context});
        }
        Map map = ((b) this.viewParams).b;
        if ((((b) this.viewParams).b != null && !((b) this.viewParams).b.isEmpty()) || !com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().a(context) || !oeb.a("enableLiveRoomExtParamsInUrl", true)) {
            return map;
        }
        String a2 = oec.a(this.node.f("url"), (String) null);
        if (StringUtils.isEmpty(a2)) {
            return map;
        }
        Uri parse = Uri.parse(a2);
        if (!StringUtils.equals(parse.getQueryParameter("tabid"), ((b) this.viewParams).i)) {
            return map;
        }
        String queryParameter = parse.getQueryParameter("extParams");
        if (StringUtils.isEmpty(queryParameter)) {
            return map;
        }
        this.l = true;
        JSONObject parseObject = JSONObject.parseObject(queryParameter);
        oec.a(new Runnable() { // from class: com.taobao.android.tab2liveroom.liveroom.a.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    a.b(a.this, false);
                }
            }
        }, 3000L);
        return parseObject;
    }

    private void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
        } else if (this.e != null) {
        } else {
            d(context);
            o();
            m();
        }
    }

    private void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{this, context});
            return;
        }
        try {
            this.d = j();
            this.k.removeAllViews();
            if (this.c == null) {
                this.c = new d.b().a(context).a((ViewGroup) this.k).a(this.d).a(this.e).a(this).a(((b) this.viewParams).c).a(this.h).b(((b) this.viewParams).n).a(((b) this.viewParams).k).a(((b) this.viewParams).b).a();
            } else {
                this.c.a(this.k, this.d, this.e);
            }
            a(context, this.d);
        } catch (Exception e) {
            ogg.a(TAG, "initLiveRoomView error: " + e.getMessage());
        }
    }

    private void a(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8ef3872", new Object[]{this, context, view});
        } else {
            this.c.a(new com.taobao.tao.flexbox.layoutmanager.view.swipeRefresh.a() { // from class: com.taobao.android.tab2liveroom.liveroom.a.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.view.swipeRefresh.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        a.this.b("onrefresh", (Map) null);
                    }
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.view.swipeRefresh.a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else {
                        ogg.c(a.TAG, "onPostRefresh");
                    }
                }
            }, ((b) this.viewParams).g);
        }
    }

    public TaoliveOpenLiveRoom b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoliveOpenLiveRoom) ipChange.ipc$dispatch("9cbbd775", new Object[]{this}) : this.e;
    }

    private void a(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bfeb4e", new Object[]{this, str, str2, str3, new Boolean(z)});
        } else if (StringUtils.isEmpty(str) || this.e == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("accountId", str);
            hashMap.put("accountType", str2);
            hashMap.put("followSource", str3);
            this.e.callPlatform(z ? PlatformListenerEnum.onFollowAction : PlatformListenerEnum.onUnfollowAciton, hashMap);
        }
    }

    public static String a(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dcf7ed", new Object[]{str, map});
        }
        Uri parse = Uri.parse(str);
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put(aw.PARAM_UPDATE_ALL_DATA_WHEN_REFRESH, "true");
        String queryParameter = parse.getQueryParameter("id");
        String queryParameter2 = parse.getQueryParameter("userId");
        String queryParameter3 = parse.getQueryParameter(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID);
        Object obj = hashMap.get("id");
        Object obj2 = hashMap.get("userId");
        Object obj3 = hashMap.get(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID);
        if (StringUtils.isEmpty(queryParameter) && StringUtils.isEmpty(queryParameter3) && StringUtils.isEmpty(queryParameter2) && ((obj == null || StringUtils.isEmpty(obj.toString())) && ((obj2 == null || StringUtils.isEmpty(obj2.toString())) && (obj3 == null || StringUtils.isEmpty(obj3.toString()))))) {
            hashMap.put(aw.PARAM_NEED_RECOMMEND, "true");
        }
        return oec.a(parse, (Map) hashMap).toString();
    }

    private Map a(Map map) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{this, map});
        }
        Uri parse = Uri.parse(((b) this.viewParams).f15288a);
        String queryParameter = parse.getQueryParameter("id");
        String queryParameter2 = parse.getQueryParameter("userId");
        String queryParameter3 = parse.getQueryParameter(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID);
        boolean z2 = map != null && oeb.as() && oec.a(map.get(KEY_LIVE_TAB_TOP_ITEM_SWITCH), false);
        ogg.a(TAG, "interceptQuery, isRedPoint2TopAvatar: " + z2);
        if (!StringUtils.isEmpty(queryParameter) || !StringUtils.isEmpty(queryParameter3) || !StringUtils.isEmpty(queryParameter2)) {
            z = false;
        }
        if (!z2 || !z || this.viewParams == 0 || !com.taobao.android.tab2liveroom.liveroom.topAvatar.b.a(((b) this.viewParams).f15288a, ((b) this.viewParams).n, ((b) this.viewParams).k)) {
            return map;
        }
        com.taobao.android.tab2liveroom.liveroom.topAvatar.d dVar = this.c;
        if (dVar != null) {
            dVar.a("query", map);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(KEY_LIVE_TAB_TOP_ITEM_SWITCH, "true");
        hashMap.put(aw.PARAM_NEED_RECOMMEND, "true");
        hashMap.put(aw.PARAM_UPDATE_ALL_DATA_WHEN_REFRESH, "true");
        return hashMap;
    }

    private void b(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        String a2 = a(((b) this.viewParams).f15288a, a(map));
        if (a(map, a2)) {
            this.h = a2;
        } else {
            a(a2, true);
        }
    }

    private boolean a(Map map, String str) {
        com.taobao.android.tab2liveroom.liveroom.topAvatar.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7b3ceab", new Object[]{this, map, str})).booleanValue();
        }
        boolean a2 = map != null ? oec.a(map.get(KEY_LIVE_TAB_TOP_ITEM_SWITCH), false) : false;
        if (((b) this.viewParams).b != null) {
            ((b) this.viewParams).b.put(KEY_LIVE_TAB_TOP_ITEM_SWITCH, Boolean.valueOf(a2));
        }
        if (!oeb.as() || !a2 || !com.taobao.android.tab2liveroom.liveroom.topAvatar.b.a(str, ((b) this.viewParams).n, ((b) this.viewParams).k) || (dVar = this.c) == null) {
            return false;
        }
        dVar.b();
        return true;
    }

    private void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        this.h = str;
        ogg.a(TAG, "初始的url是" + this.h);
        i();
        if (this.e != null) {
            Uri parse = Uri.parse(str);
            HashMap hashMap = new HashMap();
            hashMap.put("uri", parse);
            hashMap.put(aw.PARAM_FORCE_REFRESH, Boolean.valueOf(z));
            hashMap.put("needUT", true);
            ogg.a("refreshWithUrl forceRefresh=" + z + " url=" + str);
            this.e.callWatchPlatform(WatchPlatformListenerEnum.refreshByUi, hashMap);
            this.f15282a = true;
            a(false, true);
            return;
        }
        ogg.a("refreshWithUrl fail, forceRefresh=" + z + " url=" + str);
    }

    private void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        a(this.f15282a, z, z2);
        Object callWatchPlatform = this.e.callWatchPlatform(WatchPlatformListenerEnum.getGlobalContext, new Object[0]);
        if (!(callWatchPlatform instanceof com.taobao.taolive.sdk.controller.e)) {
            return;
        }
        c(((com.taobao.taolive.sdk.controller.e) callWatchPlatform).r());
    }

    private void i() {
        com.taobao.android.tab2liveroom.liveroom.topAvatar.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (com.taobao.android.tab2liveroom.liveroom.topAvatar.b.a(this.h, ((b) this.viewParams).n, ((b) this.viewParams).k) || (dVar = this.c) == null) {
        } else {
            dVar.c();
        }
    }

    private View j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b51e1df3", new Object[]{this});
        }
        LiveRoomEventHandler liveRoomEventHandler = new LiveRoomEventHandler(this);
        this.m = new mqn(this);
        HashMap hashMap = new HashMap();
        Object g = this.node.k().g();
        if (g instanceof Fragment) {
            hashMap.put("goDetailFragment", g);
        }
        hashMap.put(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.LIVE_HOME_PAGE_TYPE, k());
        hashMap.put("enableReplayStatusShowLiveEnd", Boolean.valueOf(this.m.b()));
        this.f = pki.a().a(this.node.N(), TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString(), liveRoomEventHandler.k(), liveRoomEventHandler.j(), hashMap);
        pki.a().a(this.f);
        this.e = pki.a().b(this.f);
        ViewGroup a2 = pki.a().a(this.f, this.e, (Activity) this.node.N(), this.h, (pla) null);
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.e;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onCreate, new Object[0]);
            liveRoomEventHandler.i();
        }
        ap.b = System.currentTimeMillis();
        ap.c = true;
        return a2;
    }

    private String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this});
        }
        String str = null;
        String str2 = ((b) this.viewParams).f15288a;
        if (str2 != null) {
            str = Uri.parse(str2).getQueryParameter(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.LIVE_HOME_PAGE_TYPE);
        }
        return StringUtils.isEmpty(str) ? ((b) this.viewParams).h : str;
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (b) {
        } else {
            TaoLiveLaunchInitializer.init();
            b = true;
        }
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < 14) {
        } else {
            this.node.N().registerComponentCallbacks(this.q);
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < 14) {
        } else {
            this.node.N().unregisterComponentCallbacks(this.q);
        }
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        ab.e S = this.node.S();
        if (S == null) {
            return;
        }
        S.a("onactivityresult", this);
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        ab.e S = this.node.S();
        if (S == null) {
            return;
        }
        S.b("onactivityresult", this);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean invoke(g.c cVar, String str, JSONObject jSONObject, g.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f67261c", new Object[]{this, cVar, str, jSONObject, dVar})).booleanValue();
        }
        if (!StringUtils.equals(str, b.c.EVENT_ON_MESSAGE)) {
            return super.invoke(cVar, str, jSONObject, dVar);
        }
        if (jSONObject != null) {
            String string = jSONObject.getString("type");
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            ogg.c(TAG, "onMessage type " + string + " args " + jSONObject2 + "ignoreFirstRefresh:" + this.l);
            char c = 65535;
            switch (string.hashCode()) {
                case -1268958287:
                    if (string.equals("follow")) {
                        c = 1;
                        break;
                    }
                    break;
                case -437769565:
                    if (string.equals("presentAvatarPage")) {
                        c = 3;
                        break;
                    }
                    break;
                case -382454902:
                    if (string.equals(com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_UNFOLLOWED)) {
                        c = 2;
                        break;
                    }
                    break;
                case 1085444827:
                    if (string.equals("refresh")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                if (!this.l) {
                    b(jSONObject2);
                }
                this.l = false;
            } else if (c == 1 || c == 2) {
                if (jSONObject2 != null) {
                    a(jSONObject2.getString("accountId"), jSONObject2.getString("accountType"), jSONObject2.getString("followSource"), StringUtils.equals(string, "follow"));
                }
            } else if (c == 3) {
                q();
            }
        }
        return true;
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else if (this.e == null || this.i == null || this.c.d()) {
        } else {
            HashMap hashMap = new HashMap();
            if (this.i.officialLiveInfo != null && "official".equals(this.i.officialLiveInfo.officialLive)) {
                hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, this.i.officialLiveInfo.officialLiveId);
            } else {
                hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, this.i.liveId);
            }
            hashMap.put("sourceType", com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.LIVE_HOME_PAGE_TYPE_mixLive);
            if (this.i.officialLiveInfo != null && "official".equals(this.i.officialLiveInfo.officialLive)) {
                hashMap.put("accountId", this.i.officialLiveInfo.accountId);
            } else if (this.i.broadCaster != null) {
                hashMap.put("accountId", this.i.broadCaster.accountId);
                hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_ENCODE_ACCOUNT_ID, this.i.broadCaster.encodeAccountId);
            }
            this.e.callPlatform(PlatformListenerEnum.needPresentAvatarPage, hashMap);
        }
    }

    public void a(VideoInfo videoInfo, String str, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf89efe", new Object[]{this, videoInfo, str, bool});
            return;
        }
        this.i = videoInfo;
        HashMap hashMap = new HashMap();
        if (!StringUtils.isEmpty(str)) {
            hashMap.put("id", str);
        }
        if (bool != null) {
            hashMap.put(aw.PARAM_IS_LIVE_MUTE, String.valueOf(bool));
        }
        this.h = a(((b) this.viewParams).f15288a, hashMap);
    }

    private boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue();
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.e;
        boolean a2 = taoliveOpenLiveRoom != null ? oec.a(taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.isDestroyed, new Object[0]), false) : false;
        ogg.c(TAG, "checkDestroyed isDestroy " + a2);
        if (!a2) {
            return false;
        }
        com.taobao.android.tab2liveroom.liveroom.topAvatar.d dVar = this.c;
        if (dVar != null && dVar.e() != null) {
            this.c.e().removeView(this.d);
        }
        d(this.node.N());
        return true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        super.detach(z);
        w();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
        if (r0.equals("onpagedisappear") != false) goto L11;
     */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onHandleMessage(com.taobao.tao.flexbox.layoutmanager.core.aa.e r7) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.tab2liveroom.liveroom.a.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r6
            r1[r4] = r7
            java.lang.String r7 = "4492e532"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L1c:
            java.lang.String r0 = r7.c
            int r1 = r0.hashCode()
            r5 = -1
            switch(r1) {
                case -2055736715: goto L74;
                case -1307342365: goto L69;
                case -1263645693: goto L5e;
                case -1012003231: goto L53;
                case -696134142: goto L48;
                case 261869451: goto L3d;
                case 1228998971: goto L32;
                case 1729966319: goto L27;
                default: goto L26;
            }
        L26:
            goto L7e
        L27:
            java.lang.String r1 = "onforcerefresh"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7e
            r2 = 6
            goto L7f
        L32:
            java.lang.String r1 = "ondestroy"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7e
            r2 = 4
            goto L7f
        L3d:
            java.lang.String r1 = "onactivityresult"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7e
            r2 = 5
            goto L7f
        L48:
            java.lang.String r1 = "onbackclick"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7e
            r2 = 7
            goto L7f
        L53:
            java.lang.String r1 = "onstop"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7e
            r2 = 3
            goto L7f
        L5e:
            java.lang.String r1 = "onpageappear"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7e
            r2 = 1
            goto L7f
        L69:
            java.lang.String r1 = "onstart"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7e
            r2 = 0
            goto L7f
        L74:
            java.lang.String r1 = "onpagedisappear"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7e
            goto L7f
        L7e:
            r2 = -1
        L7f:
            switch(r2) {
                case 0: goto Lca;
                case 1: goto Lc6;
                case 2: goto Lbf;
                case 3: goto Lbb;
                case 4: goto Lb7;
                case 5: goto L8f;
                case 6: goto L87;
                case 7: goto L83;
                default: goto L82;
            }
        L82:
            goto Lcd
        L83:
            r6.a(r7)
            goto Lcd
        L87:
            r7 = 0
            java.lang.String r0 = "onrefresh"
            r6.b(r0, r7)
            return r4
        L8f:
            java.util.Map r0 = r7.d
            java.lang.String r1 = "requestCode"
            java.lang.Object r0 = r0.get(r1)
            int r0 = tb.oec.a(r0, r5)
            java.util.Map r1 = r7.d
            java.lang.String r2 = "resultCode"
            java.lang.Object r1 = r1.get(r2)
            int r1 = tb.oec.a(r1, r5)
            java.util.Map r7 = r7.d
            java.lang.String r2 = "data"
            java.lang.Object r7 = r7.get(r2)
            android.content.Intent r7 = (android.content.Intent) r7
            r6.a(r0, r1, r7)
            goto Lcd
        Lb7:
            r6.w()
            goto Lcd
        Lbb:
            r6.b(r7)
            goto Lcd
        Lbf:
            r6.b(r4)
            r6.t()
            goto Lcd
        Lc6:
            r6.u()
            goto Lcd
        Lca:
            r6.v()
        Lcd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tab2liveroom.liveroom.a.onHandleMessage(com.taobao.tao.flexbox.layoutmanager.core.aa$e):boolean");
    }

    private void a(aa.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("956925ef", new Object[]{this, eVar});
        } else if (!this.node.o()) {
        } else {
            boolean g = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().g();
            if (oeb.a("enableInterceptBackFloatViewShow", true) && y()) {
                eVar.d.put("handled", true);
                ogg.c(TAG, "onBackClick回退挽留,isFloatViewShowing");
                s();
            } else if (g || com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().a() != getNode().N()) {
            } else {
                eVar.d.put("handled", true);
                ogg.c(TAG, "onBackClick回退挽留");
                a(false);
                b("onBack", (Map) null);
            }
        }
    }

    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        TaoliveOpenLiveRoom b2 = b();
        if (b2 == null) {
            return;
        }
        b2.callWatchPlatform(WatchPlatformListenerEnum.onClickCloseBtn, new Object[0]);
    }

    public void a(boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("271102ec", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(com.taobao.android.detail2.core.framework.view.feeds.d.KEY_SCROLL_ENABLE, Boolean.valueOf(z));
        hashMap.put("isAppearCompensate", Boolean.valueOf(z2));
        hashMap.put("isRefreshCompensate", Boolean.valueOf(z3));
        b("onScrollEnableChanged", hashMap);
    }

    public void b(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a01b2", new Object[]{this, str, map});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", str);
        hashMap.put("args", map);
        sendMessage(this.node, "onmessage", null, hashMap, null);
    }

    private void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        ogg.c(TAG, "onActivityResult " + i + " " + i2);
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.e;
        if (taoliveOpenLiveRoom == null) {
            return;
        }
        if (i == 20000) {
            taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.processGoToDetailAction, new Object[0]);
        } else if (i == 20001) {
            taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.processGoToBulkDetailAction, new Object[0]);
        } else if (i != 10000) {
        } else {
            if (i2 != 8 && i2 != 1) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("success", Boolean.valueOf(i2 == 1));
            this.e.callWatchPlatform(WatchPlatformListenerEnum.processAddCartAction, hashMap);
        }
    }

    private void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        ogg.c(TAG, "onLiveRoomPause");
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.e;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onPause, new Object[0]);
            pnw r = pmd.a().r();
            if (r != null) {
                r.b(this.r);
            }
        }
        com.taobao.android.tab2liveroom.liveroom.plugins.a aVar = this.g;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    private void b(aa.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22a3d770", new Object[]{this, eVar});
            return;
        }
        String c = ad.c(eVar);
        ogg.c(TAG, "onLiveRoomStop, type:" + c);
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.e;
        if (taoliveOpenLiveRoom == null) {
            return;
        }
        taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onStop, new Object[0]);
        if (oeb.cB() && oeb.cE()) {
            this.p.removeMessages(1);
            if (!z()) {
                this.p.sendEmptyMessageDelayed(1, oeb.a("liveRoomMemReleaseDelay", 5000));
            }
        }
        com.taobao.android.tab2liveroom.liveroom.topAvatar.d dVar = this.c;
        if (dVar != null && dVar.a() != null) {
            this.c.a().c();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", c);
        this.e.callWatchPlatform(WatchPlatformListenerEnum.onTabUnselected, hashMap);
    }

    private void u() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        boolean x = x();
        ogg.c(TAG, "onLiveRoomResume topActivity: " + x);
        this.p.removeMessages(1);
        if (this.e == null || !x) {
            z = false;
        } else {
            z = r();
            if (z) {
                this.e.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onStart, new Object[0]);
            }
            this.e.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onResume, new Object[0]);
            pnw r = pmd.a().r();
            if (r != null) {
                r.a(this.r);
            }
        }
        if (this.e != null) {
            if (z) {
                this.f15282a = true;
            }
            a(true, false);
        }
        com.taobao.android.tab2liveroom.liveroom.topAvatar.d dVar = this.c;
        if (dVar != null && dVar.a() != null) {
            this.c.a().a();
        }
        if (this.g == null) {
            this.g = new com.taobao.android.tab2liveroom.liveroom.plugins.a(this.node.N(), this.k, this.node);
        }
        this.g.a();
    }

    private void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        ogg.c(TAG, "onLiveRoomStart");
        this.p.removeMessages(1);
        c(this.node.N());
        if (this.e == null) {
            return;
        }
        if (x()) {
            r();
        }
        this.e.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onStart, new Object[0]);
    }

    private void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else if (this.e == null) {
        } else {
            ogg.c(TAG, "destroyLiveRoomInternal clearLiveRoomObject:" + z);
            this.e.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onDestroy, new Object[0]);
            if (z) {
                this.e = null;
                this.f = null;
            } else if (StringUtils.isEmpty(this.h)) {
            } else {
                a(this.i, Uri.parse(this.h).getQueryParameter("id"), (Boolean) null);
            }
        }
    }

    private void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        ogg.c(TAG, "onLiveRoomDestroy");
        this.p.removeMessages(1);
        p();
        n();
        this.n.c();
        pnw r = pmd.a().r();
        if (r != null) {
            r.b(this.r);
        }
        d(true);
        this.s.clear();
    }

    public b c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("41e07649", new Object[]{this}) : new b();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        com.taobao.android.tab2liveroom.liveroom.topAvatar.d dVar = this.c;
        if (dVar == null) {
            return;
        }
        dVar.a(this.i);
    }

    private boolean x() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue();
        }
        if (!oeb.a("enableLiveRoomTopActivityCheck", true)) {
            return true;
        }
        String d = oec.d(this.node.N());
        Activity activity = null;
        if (this.node.N() instanceof Activity) {
            activity = (Activity) this.node.N();
            str = activity.getComponentName().getClassName();
        } else {
            str = null;
        }
        boolean equals = StringUtils.equals(d, str);
        return (equals || activity == null || !n.b(activity)) ? equals : com.taobao.application.common.c.b() == activity;
    }

    private boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[]{this})).booleanValue();
        }
        TaoliveOpenLiveRoom b2 = b();
        return oec.a(b2 != null ? b2.callWatchPlatform(WatchPlatformListenerEnum.isFloatViewShowing, new Object[0]) : false, false);
    }

    private boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue();
        }
        TaoliveOpenLiveRoom b2 = b();
        boolean callWatchPlatform = b2 != null ? b2.callWatchPlatform(WatchPlatformListenerEnum.isInSmallMode, new Object[0]) : false;
        ogg.c(TAG, "查询是否是小窗模式: " + callWatchPlatform);
        return oec.a(callWatchPlatform, false);
    }

    public Map e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this}) : oec.a(this.node.e("pageUtParams"), (Map) null);
    }

    public Map<String, String> A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("eac8707d", new Object[]{this});
        }
        if (this.t == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("hitRecommendPreload", String.valueOf(this.t.isHitPreloadAB()));
        this.t.buildPreloadStatus();
        hashMap.put("recommendPreloadResult", String.valueOf(this.t.getPreloadStatus()));
        ogg.a(TAG, "buildCustomerKLifecycleParam:" + hashMap);
        return hashMap;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.android.tab2liveroom.liveroom.immersive.a aVar = this.n;
        if (aVar == null) {
            return;
        }
        aVar.a(z);
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.android.tab2liveroom.liveroom.immersive.a aVar = this.n;
        if (aVar == null) {
            return;
        }
        aVar.b(z);
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
        } else {
            this.t = null;
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("mute", Boolean.valueOf(z));
        b("onMuteChanged", hashMap);
    }

    public mqn f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mqn) ipChange.ipc$dispatch("358021ef", new Object[]{this}) : this.m;
    }

    public com.taobao.android.tab2liveroom.liveroom.immersive.a g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.tab2liveroom.liveroom.immersive.a) ipChange.ipc$dispatch("9889e7a", new Object[]{this}) : this.n;
    }

    public t h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (t) ipChange.ipc$dispatch("32989a58", new Object[]{this}) : this.o;
    }

    public void a(Map map, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0efabc8", new Object[]{this, map, map2});
            return;
        }
        ogg.a(TAG, "业务接收直播间内发来的互动消息，msg = " + map + ", params = " + map2);
        for (InterfaceC0586a interfaceC0586a : this.s) {
            interfaceC0586a.a(map, map2);
        }
    }

    public void a(InterfaceC0586a interfaceC0586a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3651b4c9", new Object[]{this, interfaceC0586a});
        } else if (interfaceC0586a == null) {
        } else {
            this.s.add(interfaceC0586a);
        }
    }

    public void b(InterfaceC0586a interfaceC0586a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79dcd28a", new Object[]{this, interfaceC0586a});
        } else if (interfaceC0586a == null) {
        } else {
            this.s.remove(interfaceC0586a);
        }
    }
}
