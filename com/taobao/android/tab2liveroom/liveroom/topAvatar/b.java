package com.taobao.android.tab2liveroom.liveroom.topAvatar;

import android.content.Context;
import android.graphics.Outline;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.android.utils.StringUtils;
import com.taobao.android.nav.Nav;
import com.taobao.android.tab2liveroom.liveroom.a;
import com.taobao.android.tab2liveroom.liveroom.topAvatar.LiveAvatarAdapter;
import com.taobao.android.tab2liveroom.liveroom.topAvatar.LiveAvatarResult;
import com.taobao.android.tab2liveroom.liveroom.topAvatar.d;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.module.TrackerModule;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.listener.WatchPlatformListenerEnum;
import com.taobao.taolive.sdk.controller.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ogv;
import tb.ohd;

/* loaded from: classes6.dex */
public class b implements d.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MORE_LIVE = "更多直播";
    public static final String MORE_LIVE_URL = "https://gw.alicdn.com/imgextra/i2/O1CN010SzHJ81xQCSa7ICW5_!!6000000006437-2-tps-180-180.png";
    public static final String TAG = "LiveAvatorController";
    public final float b;
    private final Context c;
    private View e;
    private long f;
    private long g;
    private RecyclerView i;
    private View j;
    private TaoliveOpenLiveRoom k;
    private ArrayList<LiveAvatarResult.LiveAccount> l;
    private d m;
    private Map n;
    private String p;
    private LiveAvatarResult q;
    private LiveAvatarAdapter r;
    private String s;
    private a u;

    /* renamed from: a */
    public boolean f15309a = false;
    private boolean h = true;
    private boolean o = false;
    private boolean d = false;
    private final Handler t = new Handler(Looper.getMainLooper()) { // from class: com.taobao.android.tab2liveroom.liveroom.topAvatar.b.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            b.this = this;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (b.a(b.this)) {
            } else {
                ogg.a(b.TAG, "倒计时结束 关闭导航");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isAuto", (Object) true);
                b.a(2201, "Page_TaobaoLiveWatch_Tab2_LiveTab_TopBar_Collapse", jSONObject);
                b.b(b.this);
                if (b.c(b.this) != null) {
                    b.c(b.this).c();
                }
                b.a(b.this, true);
            }
        }
    };

    static {
        kge.a(1320938738);
        kge.a(-1242220874);
    }

    public static /* synthetic */ void lambda$kFGwkSTFqXHTgouYxoSTgegGHoc(b bVar, boolean z) {
        bVar.j(z);
    }

    /* renamed from: lambda$ovG9usH-8ITLF6IaLVPtXdYXTOE */
    public static /* synthetic */ void m1023lambda$ovG9usH8ITLF6IaLVPtXdYXTOE(b bVar, boolean z) {
        bVar.i(z);
    }

    public static /* synthetic */ long a(b bVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7c9dd552", new Object[]{bVar, new Long(j)})).longValue();
        }
        bVar.g = j;
        return j;
    }

    public static /* synthetic */ LiveAvatarResult a(b bVar, LiveAvatarResult liveAvatarResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveAvatarResult) ipChange.ipc$dispatch("24273ea6", new Object[]{bVar, liveAvatarResult});
        }
        bVar.q = liveAvatarResult;
        return liveAvatarResult;
    }

    public static /* synthetic */ void a(b bVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b61003a", new Object[]{bVar, str, str2});
        } else {
            bVar.a(str, str2);
        }
    }

    public static /* synthetic */ boolean a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2d4f662a", new Object[]{bVar})).booleanValue() : bVar.o;
    }

    public static /* synthetic */ boolean a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c9e1172", new Object[]{bVar, new Boolean(z)})).booleanValue();
        }
        bVar.o = z;
        return z;
    }

    public static /* synthetic */ void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e0532e7", new Object[]{bVar});
        } else {
            bVar.d();
        }
    }

    public static /* synthetic */ void b(b bVar, LiveAvatarResult liveAvatarResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54f68767", new Object[]{bVar, liveAvatarResult});
        } else {
            bVar.a(liveAvatarResult);
        }
    }

    public static /* synthetic */ d c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("72a113aa", new Object[]{bVar}) : bVar.m;
    }

    public static /* synthetic */ ArrayList d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("43ba61c3", new Object[]{bVar}) : bVar.l;
    }

    public static /* synthetic */ a e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("c95606a", new Object[]{bVar}) : bVar.u;
    }

    public static /* synthetic */ TaoliveOpenLiveRoom f(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoliveOpenLiveRoom) ipChange.ipc$dispatch("daefd877", new Object[]{bVar}) : bVar.k;
    }

    public static /* synthetic */ Context g(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("9b1c4da4", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ Handler h(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("6b9d9639", new Object[]{bVar}) : bVar.t;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    public static boolean a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dbad4dc", new Object[]{str, str2, new Boolean(z)})).booleanValue();
        }
        JSONObject jSONObject = new JSONObject();
        if (!oeb.cF()) {
            jSONObject.put("reason", (Object) "other");
            a(19997, "Page_TaobaoLiveWatch_Tab2_LiveTab_TopBar_Show_Failed", jSONObject);
            return false;
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("hideLiveTopbar");
            ogg.a(TAG, "isOpenLiveAvatar source:" + str2 + " hideLiveTopbar:" + queryParameter + " isLastTab:" + z);
            if (!StringUtils.equals(str2, "outside")) {
                return !oec.a((Object) queryParameter, false);
            }
            jSONObject.put("reason", (Object) "waitou");
            a(19997, "Page_TaobaoLiveWatch_Tab2_LiveTab_TopBar_Show_Failed", jSONObject);
            return false;
        } catch (Exception e) {
            ogg.a(TAG, "isOpenLiveAvatar error:" + e.getMessage());
            return false;
        }
    }

    public void a(View view, TaoliveOpenLiveRoom taoliveOpenLiveRoom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd2b7632", new Object[]{this, view, taoliveOpenLiveRoom});
            return;
        }
        this.j = view;
        this.k = taoliveOpenLiveRoom;
    }

    public b(d.b bVar) {
        this.c = bVar.f15318a;
        this.b = bVar.f;
        this.j = bVar.c;
        this.k = bVar.d;
        this.e = LayoutInflater.from(this.c).inflate(R.layout.tab2_liveroom_fluid_sdk_live_avatar, (ViewGroup) null);
        this.i = (RecyclerView) this.e.findViewById(R.id.avatar_recycler_view);
        this.n = bVar.j;
        b("init");
        this.m = bVar.k;
        this.u = bVar.e;
    }

    private void a(LiveAvatarResult liveAvatarResult) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c839e86", new Object[]{this, liveAvatarResult});
            return;
        }
        ogg.a(TAG, "接口返回打开开播导航逻辑");
        if (!oeb.T()) {
            return;
        }
        if (this.l == null) {
            ogg.a(TAG, "首次接口返回打开开播导航逻辑");
            c(liveAvatarResult);
            if (this.m == null) {
                return;
            }
            ((ViewGroup) this.e).removeView(this.i);
            this.m.a(this.i, this.h);
            if (this.h) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason", (Object) "timeout");
            a(19997, "Page_TaobaoLiveWatch_Tab2_LiveTab_TopBar_Show_Failed", jSONObject);
        } else if (this.i == null) {
        } else {
            ogg.a(TAG, "刷新接口返回打开开播导航逻辑");
            if (this.d && (dVar = this.m) != null) {
                dVar.a((View) this.i, false);
                this.d = false;
            }
            b(liveAvatarResult);
        }
    }

    private void b(LiveAvatarResult liveAvatarResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86f497a5", new Object[]{this, liveAvatarResult});
        } else if (this.r == null) {
        } else {
            this.l.clear();
            this.l.addAll(liveAvatarResult.result);
            d(liveAvatarResult);
            this.r.notifyDataSetChanged();
        }
    }

    private void c(LiveAvatarResult liveAvatarResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a16590c4", new Object[]{this, liveAvatarResult});
        } else if (liveAvatarResult.result == null) {
        } else {
            this.l = new ArrayList<>();
            this.l.addAll(liveAvatarResult.result);
            d(liveAvatarResult);
            this.i.setLayoutManager(new LinearLayoutManager(this.c, 0, false) { // from class: com.taobao.android.tab2liveroom.liveroom.topAvatar.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    b.this = this;
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                    if (str.hashCode() == 1046880189) {
                        return new Integer(super.getExtraLayoutSpace((RecyclerView.State) objArr[0]));
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.support.v7.widget.LinearLayoutManager
                public int getExtraLayoutSpace(RecyclerView.State state) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("3e661fbd", new Object[]{this, state})).intValue() : super.getExtraLayoutSpace(state) + 1;
                }
            });
            this.i.addItemDecoration(new c(ohd.b(this.c, 7)));
            this.r = new LiveAvatarAdapter(this.l);
            this.r.a(new LiveAvatarAdapter.LiveAvatarViewHolder.OnItemClickListener() { // from class: com.taobao.android.tab2liveroom.liveroom.topAvatar.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    b.this = this;
                }

                @Override // com.taobao.android.tab2liveroom.liveroom.topAvatar.LiveAvatarAdapter.LiveAvatarViewHolder.OnItemClickListener
                public void a(int i) {
                    IpChange ipChange2 = $ipChange;
                    boolean z = false;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                        return;
                    }
                    String str = "0";
                    if (i >= b.d(b.this).size() || i < 0 || ((LiveAvatarResult.LiveAccount) b.d(b.this).get(i)).status == null || ((LiveAvatarResult.LiveAccount) b.d(b.this).get(i)).status.redirectUrl == null) {
                        if (i <= 0 || i >= b.d(b.this).size() || !StringUtils.equals(((LiveAvatarResult.LiveAccount) b.d(b.this).get(i)).specialType, b.MORE_LIVE)) {
                            return;
                        }
                        b.e(b.this).b("onMoreLiveClick", (Map) null);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("index", (Object) Integer.valueOf(i));
                        if (!StringUtils.isEmpty(((LiveAvatarResult.LiveAccount) b.d(b.this).get(i)).topParams)) {
                            str = "1";
                        }
                        jSONObject.put("is_reddot", (Object) str);
                        b.a(2101, "Page_TaobaoLiveWatch_Button-Tab2MoreLive", jSONObject);
                        return;
                    }
                    String str2 = ((LiveAvatarResult.LiveAccount) b.d(b.this).get(i)).status.redirectUrl;
                    if (!StringUtils.isEmpty(str2)) {
                        Object callWatchPlatform = b.f(b.this).callWatchPlatform(WatchPlatformListenerEnum.getGlobalContext, new Object[0]);
                        if (callWatchPlatform instanceof e) {
                            z = ((e) callWatchPlatform).r();
                        }
                        ogg.a(b.TAG, "执行二跳页跳转" + z);
                        str2 = str2 + "&isLiveMute=" + z;
                    }
                    Nav.from(b.g(b.this)).withExtras(null).toUri(str2);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("index", (Object) Integer.valueOf(i));
                    if (!StringUtils.isEmpty(((LiveAvatarResult.LiveAccount) b.d(b.this).get(i)).topParams)) {
                        str = "1";
                    }
                    jSONObject2.put("is_reddot", (Object) str);
                    if (((LiveAvatarResult.LiveAccount) b.d(b.this).get(i)).accountLiveTag != null) {
                        jSONObject2.put("pushReason", (Object) ((LiveAvatarResult.LiveAccount) b.d(b.this).get(i)).accountLiveTag.pushReason);
                    }
                    b.a(2101, "Page_TaobaoLiveWatch_Tab2_LiveTab_TopBar_Click", jSONObject2);
                    ogg.a(b.TAG, "执行二跳页跳转" + str2);
                }
            });
            this.i.setAdapter(this.r);
            new FrameLayout.LayoutParams(-1, -1).topMargin = (int) this.b;
            this.e.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.android.tab2liveroom.liveroom.topAvatar.b.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    b.this = this;
                }

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                    }
                    if (motionEvent.getAction() == 0 && b.c(b.this) != null && b.c(b.this).d()) {
                        b.h(b.this).removeCallbacksAndMessages(null);
                        b.b(b.this);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("isAuto", (Object) false);
                        b.a(2101, "Page_TaobaoLiveWatch_Tab2_LiveTab_TopBar_Collapse", jSONObject);
                    }
                    return true;
                }
            });
            this.i.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.tab2liveroom.liveroom.topAvatar.b.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    b.this = this;
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass5 anonymousClass5, String str, Object... objArr) {
                    if (str.hashCode() == 2142696127) {
                        super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                        return;
                    }
                    super.onScrollStateChanged(recyclerView, i);
                    if ((i != 1 && i != 2) || b.h(b.this) == null) {
                        return;
                    }
                    b.h(b.this).removeCallbacksAndMessages(null);
                }
            });
        }
    }

    private void d(LiveAvatarResult liveAvatarResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbd689e3", new Object[]{this, liveAvatarResult});
        } else if (!StringUtils.equals(liveAvatarResult.version, "0823")) {
        } else {
            LiveAvatarAdapter liveAvatarAdapter = this.r;
            if (liveAvatarAdapter != null) {
                liveAvatarAdapter.a(true);
            }
            a aVar = this.u;
            if (aVar == null || aVar.f() == null || !this.u.f().a()) {
                return;
            }
            LiveAvatarResult.LiveAccount liveAccount = new LiveAvatarResult.LiveAccount();
            liveAccount.accountNick = MORE_LIVE;
            liveAccount.avatarUrl = MORE_LIVE_URL;
            liveAccount.specialType = MORE_LIVE;
            liveAccount.status = new LiveAvatarResult.Status();
            this.l.add(liveAccount);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.m == null) {
        } else {
            c(false);
        }
    }

    public void b(boolean z) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f = System.currentTimeMillis();
        this.t.removeCallbacksAndMessages(null);
        long j = this.g;
        if (j > 0) {
            this.t.sendEmptyMessageDelayed(0, j);
        }
        if (this.j == null || (dVar = this.m) == null || !dVar.d() || this.i == null || this.r == null) {
            return;
        }
        h(z);
    }

    public void c(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.j;
        if (view == null) {
            return;
        }
        view.post(new Runnable() { // from class: com.taobao.android.tab2liveroom.liveroom.topAvatar.-$$Lambda$b$kFGwkSTFqXHTgouYxoSTgegGHoc
            {
                b.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b.lambda$kFGwkSTFqXHTgouYxoSTgegGHoc(b.this, z);
            }
        });
    }

    public /* synthetic */ void j(boolean z) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d7103", new Object[]{this, new Boolean(z)});
        } else if (this.k == null || (dVar = this.m) == null) {
        } else {
            if (z && !dVar.d()) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("isClear", Boolean.valueOf(z));
            if (this.k == null) {
                return;
            }
            ogg.a(TAG, "调用了直播清屏能力" + z);
            this.k.callWatchPlatform(WatchPlatformListenerEnum.clearScreen, hashMap);
        }
    }

    @Override // com.taobao.android.tab2liveroom.liveroom.topAvatar.d.a
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.p = str;
        a(this.p, "receiveDetail");
    }

    @Override // com.taobao.android.tab2liveroom.liveroom.topAvatar.d.a
    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    @Override // com.taobao.android.tab2liveroom.liveroom.topAvatar.d.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.t.removeCallbacksAndMessages(null);
        long j = this.g;
        if (j <= 0) {
            return;
        }
        this.t.sendEmptyMessageDelayed(0, j);
    }

    @Override // com.taobao.android.tab2liveroom.liveroom.topAvatar.d.a
    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!z) {
            a(true);
        }
        ogg.a(TAG, "onFirstStageVisible: " + z);
        if (!this.f15309a) {
            b("appear");
        }
        b(z);
        c(true);
        g(true);
    }

    @Override // com.taobao.android.tab2liveroom.liveroom.topAvatar.d.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ogg.a(TAG, "onFirstStageDidAppear");
        d dVar = this.m;
        if (dVar == null || !dVar.d()) {
            return;
        }
        g(true);
        c(true);
    }

    @Override // com.taobao.android.tab2liveroom.liveroom.topAvatar.d.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.t.removeCallbacksAndMessages(null);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f > this.g) {
            return;
        }
        this.f = currentTimeMillis;
        ogg.a(TAG, "切tab重新计时mStartTime = " + this.f);
    }

    @Override // com.taobao.android.tab2liveroom.liveroom.topAvatar.d.a
    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
            return;
        }
        c(false);
        g(false);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isAuto", (Object) Boolean.valueOf(z));
        a(2101, "Page_TaobaoLiveWatch_Tab2_LiveTab_TopBar_Collapse", jSONObject);
    }

    @Override // com.taobao.android.tab2liveroom.liveroom.topAvatar.d.a
    public void b(View view, TaoliveOpenLiveRoom taoliveOpenLiveRoom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2d6d2b3", new Object[]{this, view, taoliveOpenLiveRoom});
        } else {
            a(view, taoliveOpenLiveRoom);
        }
    }

    @Override // com.taobao.android.tab2liveroom.liveroom.topAvatar.d.a
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            char c = 65535;
            if (str.hashCode() == 107944136 && str.equals("query")) {
                c = 0;
            }
            if (c != 0 || !(obj instanceof Map)) {
                return;
            }
            this.n = (Map) obj;
        }
    }

    private void b(final String str) {
        boolean z;
        Map map;
        Map map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (oeb.as() && StringUtils.equals(str, "appear") && StringUtils.equals(this.s, "init")) {
            this.s = str;
        } else {
            this.s = str;
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName("mtop.cogman.container.center.nologin");
            mtopRequest.setVersion("1.0");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("entityId", (Object) "104853");
            if (!oeb.as() || (map2 = this.n) == null || !oec.a(map2.get(a.KEY_LIVE_TAB_TOP_ITEM_SWITCH), false)) {
                z = false;
            } else {
                jSONObject.put("params", (Object) e());
                z = true;
            }
            mtopRequest.setData(JSONObject.toJSONString(jSONObject));
            this.f15309a = true;
            MtopBusiness registerListener = RemoteBusiness.build(mtopRequest).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.tab2liveroom.liveroom.topAvatar.LiveAvatarController$6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    b.this.f15309a = false;
                    ogg.a(b.TAG, "onSystemError");
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    try {
                        b.this.f15309a = false;
                        b.a(b.this, (LiveAvatarResult) JSON.toJavaObject((JSONObject) mtopResponse.getOriginFastJsonObject().get("data"), LiveAvatarResult.class));
                        b bVar = b.this;
                        int i2 = b.$ipChange.showSeconds * 1000;
                        b bVar2 = b.this;
                        if (b.$ipChange.result != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("delayTime = ");
                            sb.append(i2);
                            sb.append("dataList = ");
                            b bVar3 = b.this;
                            sb.append(b.$ipChange.result.size());
                            ogg.a(b.TAG, sb.toString());
                        }
                        b bVar4 = b.this;
                        b bVar5 = b.this;
                        b.a(bVar4, b.$ipChange, str);
                        b.a(b.this, i2);
                        b bVar6 = b.this;
                        if (!b.$ipChange.enable) {
                            b.c(b.this).a(false);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("reason", (Object) "other");
                            b.a(19997, "Page_TaobaoLiveWatch_Tab2_LiveTab_TopBar_Show_Failed", jSONObject2);
                            return;
                        }
                        b bVar7 = b.this;
                        if (b.$ipChange.result != null) {
                            b bVar8 = b.this;
                            if (b.$ipChange.result.size() > 0) {
                                b bVar9 = b.this;
                                b bVar10 = b.this;
                                b.b(bVar9, b.$ipChange);
                                return;
                            }
                        }
                        b bVar11 = b.this;
                        if (b.$ipChange.result != null) {
                            b bVar12 = b.this;
                            if (b.$ipChange.result.size() != 0) {
                                return;
                            }
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("reason", (Object) "nodata");
                        b.a(19997, "Page_TaobaoLiveWatch_Tab2_LiveTab_TopBar_Show_Failed", jSONObject3);
                    } catch (Exception e) {
                        ogg.a(b.TAG, "e = " + e);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    b.this.f15309a = false;
                    ogg.a(b.TAG, "onError" + mtopResponse.getRetCode());
                }
            });
            registerListener.mo1330supportStreamJson(true);
            registerListener.mo1305reqMethod(MethodEnum.POST);
            registerListener.startRequest();
            if (!z || (map = this.n) == null) {
                return;
            }
            map.put(a.KEY_LIVE_TAB_TOP_ITEM_SWITCH, false);
        }
    }

    private String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        if (!ogv.a(this.n)) {
            String a2 = oec.a(this.n.get("id"), "");
            String a3 = oec.a(this.n.get("userId"), "");
            if (!StringUtils.isEmpty(a2)) {
                jSONObject.put("topLiveId", (Object) a2);
            } else if (!StringUtils.isEmpty(a3)) {
                jSONObject.put("topAccountId", (Object) a3);
            }
            jSONObject.put("topParams", (Object) JSONObject.toJSONString(this.n));
        }
        return JSONObject.toJSONString(jSONObject);
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
        } else if (this.j == null) {
        } else {
            final boolean d = this.m.d();
            this.j.post(new Runnable() { // from class: com.taobao.android.tab2liveroom.liveroom.topAvatar.-$$Lambda$b$ovG9usH-8ITLF6IaLVPtXdYXTOE
                {
                    b.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b.m1023lambda$ovG9usH8ITLF6IaLVPtXdYXTOE(b.this, d);
                }
            });
        }
    }

    public /* synthetic */ void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c89864", new Object[]{this, new Boolean(z)});
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            if (z) {
                this.j.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.tab2liveroom.liveroom.topAvatar.LiveAvatarController$7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                        } else {
                            outline.setRoundRect(view.getLeft(), view.getTop(), view.getWidth(), view.getHeight(), ohd.b(b.g(b.this), 12));
                        }
                    }
                });
                this.j.setClipToOutline(true);
                return;
            }
            this.j.setOutlineProvider(null);
            this.j.setClipToOutline(false);
        }
    }

    private void a(String str, String str2) {
        LiveAvatarAdapter liveAvatarAdapter;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str)) {
            ogg.a(TAG, "filterRepeatIds0 = " + str);
        } else {
            char c = 65535;
            int hashCode = str2.hashCode();
            if (hashCode != -1411068523) {
                if (hashCode != 3237136) {
                    if (hashCode == 1062895892 && str2.equals("receiveDetail")) {
                        c = 2;
                    }
                } else if (str2.equals("init")) {
                    c = 0;
                }
            } else if (str2.equals("appear")) {
                c = 1;
            }
            if (c == 0 || c == 1) {
                c(str);
            } else if (c != 2) {
            } else {
                if (this.m.d() && (liveAvatarAdapter = this.r) != null && !ogv.a(liveAvatarAdapter.a())) {
                    z = true;
                }
                if (!z) {
                    return;
                }
                d(str);
            }
        }
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        LiveAvatarResult liveAvatarResult = this.q;
        if (liveAvatarResult == null || ogv.a(liveAvatarResult.result)) {
            return;
        }
        for (int size = this.q.result.size() - 1; size >= 0; size--) {
            if (StringUtils.equals(str, this.q.result.get(size).accountId)) {
                ogg.a(TAG, "filterRepeatIds2 = " + str + ",index= " + size);
                this.q.result.remove(size);
            }
        }
        f();
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        LiveAvatarAdapter liveAvatarAdapter = this.r;
        if (liveAvatarAdapter == null || ogv.a(liveAvatarAdapter.a())) {
            return;
        }
        int size = this.r.a().size() - 1;
        while (true) {
            if (size < 0) {
                break;
            } else if (StringUtils.equals(str, this.r.a().get(size).accountId)) {
                ogg.a(TAG, "filterRepeatIds1 = " + str + ",index= " + size);
                this.r.a(size);
                break;
            } else {
                size--;
            }
        }
        f();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!oeb.br() || this.m == null || !ogv.a(this.q.result)) {
        } else {
            this.m.g();
            this.d = true;
        }
    }

    private void h(boolean z) {
        LiveAvatarAdapter liveAvatarAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b413bfc5", new Object[]{this, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (this.i != null && (liveAvatarAdapter = this.r) != null) {
            jSONObject.put("onLiveNum", (Object) Integer.valueOf(liveAvatarAdapter.getItemCount()));
            jSONObject.put("isEmpty", (Object) "1");
        } else {
            jSONObject.put("onLiveNum", (Object) 0);
            jSONObject.put("isEmpty", (Object) "0");
        }
        jSONObject.put("isAuto", (Object) Integer.valueOf(z ? 1 : 0));
        jSONObject.put("time", (Object) Long.valueOf(System.currentTimeMillis()));
        ogg.a(TAG, "trackLiveTabTopBarShow = " + jSONObject.toJSONString());
        a(2201, "Page_TaobaoLiveWatch_Tab2_LiveTab_TopBar_Show", jSONObject);
    }

    public static void a(int i, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb0bf6eb", new Object[]{new Integer(i), str, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("pageName", (Object) "Page_TaobaoLiveWatch");
        jSONObject2.put(PopConst.POP_EVENT_ID_KEY, (Object) Integer.valueOf(i));
        jSONObject2.put("arg1", (Object) str);
        jSONObject.put("spm", "a2141.8001249");
        jSONObject.put("entryLivesource", "tb_tab2.guangguang_newlivetab.topbar");
        jSONObject2.put("args", (Object) jSONObject);
        TrackerModule.commit(new g.c(null, jSONObject2, null), false);
    }
}
