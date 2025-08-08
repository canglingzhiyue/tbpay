package com.taobao.taolive.room.controller2;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.view.GravityCompat;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.ChatRecyclerView2;
import com.taobao.android.live.plugin.atype.flexalocal.comments.messagecard.MessageCardScrollView;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.live.plugin.proxy.bottom.IBottomProxy;
import com.taobao.android.live.plugin.proxy.c;
import com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy;
import com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.android.nav.Nav;
import com.taobao.media.MediaConstant;
import com.taobao.message.sp.framework.model.SimpleProfile;
import com.taobao.search.common.util.i;
import com.taobao.taobao.R;
import com.taobao.taolive.lpm_android.event.LpmEventType;
import com.taobao.taolive.room.business.common.GoodItem;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.service.TBLiveRecEngineV2;
import com.taobao.taolive.room.utils.RRoomProxy;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ab;
import com.taobao.taolive.room.utils.ae;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.ak;
import com.taobao.taolive.room.utils.as;
import com.taobao.taolive.room.utils.at;
import com.taobao.taolive.room.utils.au;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.room.utils.w;
import com.taobao.taolive.room.utils.y;
import com.taobao.taolive.room.widget.RightDrawerLayout;
import com.taobao.taolive.sdk.controller.IRecyclerModel;
import com.taobao.taolive.sdk.controller.TaoLiveRecyclerView;
import com.taobao.taolive.sdk.controller.a;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import com.taobao.taolive.sdk.model.ContentType;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.LiveCommonTipsMsg;
import com.taobao.taolive.sdk.model.message.PowerMsgType;
import com.taobao.taolive.sdk.permisson.a;
import com.taobao.taolive.sdk.ui.component.VideoFrameErrorController;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.taobao.taolive.sdk.utils.u;
import com.taobao.tbliveinteractive.container.h5.TaoLiveWebBottomFragment;
import com.uc.webview.export.media.CommandID;
import com.uc.webview.export.media.MessageID;
import com.ut.device.UTDevice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONException;
import tb.bkm;
import tb.cgl;
import tb.cpe;
import tb.ddv;
import tb.ddw;
import tb.fjp;
import tb.kge;
import tb.pbt;
import tb.pdt;
import tb.phm;
import tb.pjt;
import tb.pko;
import tb.pla;
import tb.plk;
import tb.pll;
import tb.ply;
import tb.pmc;
import tb.pmd;
import tb.pmt;
import tb.pnj;
import tb.poj;
import tb.poy;
import tb.poz;
import tb.pqj;
import tb.pqq;
import tb.qne;
import tb.sst;
import tb.tnq;
import tb.xkw;
import tb.xpg;

/* loaded from: classes8.dex */
public class q extends com.taobao.taolive.sdk.controller.b implements View.OnClickListener, d, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String b;
    private boolean A;
    private boolean B;
    private boolean C;
    private int D;
    private WindowInsets E;
    private GoodItem F;
    private int G;
    private Activity H;
    private ViewGroup I;
    private Map<String, String> J;
    private String K;
    private long L;
    private boolean M;
    private boolean N;
    private String O;
    private com.taobao.taolive.sdk.playcontrol.b P;
    private Uri Q;
    private com.taobao.taolive.sdk.controller.e S;
    private IBottomProxy.a T;
    private j U;
    private ddv V;
    private boolean W;
    private boolean X;
    private BroadcastReceiver Y;
    private View Z;

    /* renamed from: a */
    public boolean f21604a;
    private ISmallWindowStrategy aa;
    private k ab;
    private String ac;
    private boolean ad;
    private String ae;
    private e af;
    private View.OnClickListener ag;
    private View.OnClickListener ah;
    private f ai;
    private pla aj;
    private long ak;
    private long al;
    private int am;
    private r an;
    private boolean ao;
    private t ap;
    private String c;
    private String d;
    private JSONObject e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private boolean o;
    private com.taobao.android.live.plugin.proxy.debugPanel.a p;
    private y q;
    private TBLiveRecEngineV2 r;
    private HashMap<String, String> s;
    private long t;
    private long u;
    private long v;
    private ddw w;
    private int x;
    private String y;
    private boolean z;

    static {
        kge.a(1743736879);
        kge.a(61413594);
        kge.a(191318335);
        kge.a(-1201612728);
        kge.a(-1450458899);
    }

    public static /* synthetic */ Object ipc$super(q qVar, String str, Object... objArr) {
        if (str.hashCode() == 2022597206) {
            super.reset();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "TaoLiveController2";
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ int a(q qVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4edf7995", new Object[]{qVar, new Integer(i)})).intValue();
        }
        qVar.D = i;
        return i;
    }

    public static /* synthetic */ View a(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("9567c383", new Object[]{qVar}) : qVar.Z;
    }

    public static /* synthetic */ WindowInsets a(q qVar, WindowInsets windowInsets) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowInsets) ipChange.ipc$dispatch("d015e3b1", new Object[]{qVar, windowInsets});
        }
        qVar.E = windowInsets;
        return windowInsets;
    }

    public static /* synthetic */ void a(q qVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99faf5b1", new Object[]{qVar, view});
        } else {
            qVar.a(view);
        }
    }

    public static /* synthetic */ void a(q qVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fae550b", new Object[]{qVar, str});
        } else {
            qVar.b(str);
        }
    }

    public static /* synthetic */ boolean a(q qVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4edfb977", new Object[]{qVar, new Boolean(z)})).booleanValue();
        }
        qVar.M = z;
        return z;
    }

    public static /* synthetic */ int b(q qVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e9803c16", new Object[]{qVar, new Integer(i)})).intValue();
        }
        qVar.G = i;
        return i;
    }

    public static /* synthetic */ TBLiveRecEngineV2 b(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLiveRecEngineV2) ipChange.ipc$dispatch("d1455b17", new Object[]{qVar}) : qVar.r;
    }

    public static /* synthetic */ void b(q qVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ecc4aa", new Object[]{qVar, str});
        } else {
            qVar.d(str);
        }
    }

    public static /* synthetic */ void b(q qVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9807bf4", new Object[]{qVar, new Boolean(z)});
        } else {
            qVar.o(z);
        }
    }

    public static /* synthetic */ int c(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3befc32", new Object[]{qVar})).intValue() : qVar.am;
    }

    public static /* synthetic */ int c(q qVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8420fe97", new Object[]{qVar, new Integer(i)})).intValue();
        }
        qVar.curStart = i;
        return i;
    }

    public static /* synthetic */ boolean c(q qVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84213e79", new Object[]{qVar, new Boolean(z)})).booleanValue();
        }
        qVar.X = z;
        return z;
    }

    public static /* synthetic */ com.taobao.taolive.sdk.controller.e d(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.controller.e) ipChange.ipc$dispatch("a2f62b34", new Object[]{qVar}) : qVar.S;
    }

    public static /* synthetic */ void d(q qVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ec200f6", new Object[]{qVar, new Boolean(z)});
        } else {
            qVar.h(z);
        }
    }

    public static /* synthetic */ r e(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (r) ipChange.ipc$dispatch("81e9bcf5", new Object[]{qVar}) : qVar.an;
    }

    public static /* synthetic */ boolean e(q qVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b962c37b", new Object[]{qVar, new Boolean(z)})).booleanValue();
        }
        qVar.C = z;
        return z;
    }

    public static /* synthetic */ WindowInsets f(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WindowInsets) ipChange.ipc$dispatch("a2e7f95d", new Object[]{qVar}) : qVar.E;
    }

    public static /* synthetic */ Activity g(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("9edd2bcd", new Object[]{qVar}) : qVar.H;
    }

    public static /* synthetic */ boolean h(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c25d0b1e", new Object[]{qVar})).booleanValue() : qVar.C;
    }

    public static /* synthetic */ int i(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8549746c", new Object[]{qVar})).intValue() : qVar.G;
    }

    public static /* synthetic */ int j(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4835ddcb", new Object[]{qVar})).intValue() : qVar.D;
    }

    public static /* synthetic */ void k(q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b224737", new Object[]{qVar});
        } else {
            qVar.y();
        }
    }

    public static /* synthetic */ ViewGroup l(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("dfca20bf", new Object[]{qVar}) : qVar.I;
    }

    public static /* synthetic */ t m(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (t) ipChange.ipc$dispatch("f7750e2b", new Object[]{qVar}) : qVar.ap;
    }

    public static /* synthetic */ void n(q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e78354", new Object[]{qVar});
        } else {
            qVar.K();
        }
    }

    public static /* synthetic */ String o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4719ea", new Object[0]) : b;
    }

    public q(Activity activity, String str, pla plaVar) {
        this(activity, str, plaVar, null);
    }

    public q(Activity activity, String str, pla plaVar, TaoliveOpenLiveRoom taoliveOpenLiveRoom) {
        super(activity);
        this.o = false;
        this.v = 0L;
        this.z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = 0;
        this.E = null;
        this.G = 0;
        this.K = null;
        this.Y = new BroadcastReceiver() { // from class: com.taobao.taolive.room.controller2.TaoLiveRealController$3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (!StringUtils.equals(intent.getAction(), "com.taobao.live.room.init")) {
                } else {
                    String stringExtra = intent.getStringExtra("force");
                    long intExtra = intent.getIntExtra("seqId", -1);
                    if (q.o() == null) {
                        return;
                    }
                    if ((intExtra == -1 || intExtra == q.c(q.this)) && !"true".equals(stringExtra)) {
                        return;
                    }
                    q.c(q.this, "true".equals(stringExtra));
                    q.d(q.this).H = true;
                    q.d(q.this, true);
                }
            }
        };
        this.ad = false;
        this.ak = 0L;
        this.al = 0L;
        e("Constructor url = " + str);
        this.X = false;
        this.S = new c(activity);
        this.S.a(activity);
        a((Context) activity);
        d(activity);
        poz.a(this.S, new com.taobao.taolive.room.service.d());
        a(plaVar);
        if (taoliveOpenLiveRoom != null) {
            a(taoliveOpenLiveRoom);
        }
        b(taoliveOpenLiveRoom);
        if (!StringUtils.isEmpty(str)) {
            Intent intent = new Intent();
            this.Q = Uri.parse(str);
            intent.setData(this.Q);
            a(intent);
            a(activity, this.c, this.d, this.f, this.K, this.J);
        }
    }

    public q(Activity activity, Intent intent, TaoliveOpenLiveRoom taoliveOpenLiveRoom) {
        super(activity);
        this.o = false;
        this.v = 0L;
        this.z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = 0;
        this.E = null;
        this.G = 0;
        this.K = null;
        this.Y = new BroadcastReceiver() { // from class: com.taobao.taolive.room.controller2.TaoLiveRealController$3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent2});
                } else if (!StringUtils.equals(intent2.getAction(), "com.taobao.live.room.init")) {
                } else {
                    String stringExtra = intent2.getStringExtra("force");
                    long intExtra = intent2.getIntExtra("seqId", -1);
                    if (q.o() == null) {
                        return;
                    }
                    if ((intExtra == -1 || intExtra == q.c(q.this)) && !"true".equals(stringExtra)) {
                        return;
                    }
                    q.c(q.this, "true".equals(stringExtra));
                    q.d(q.this).H = true;
                    q.d(q.this, true);
                }
            }
        };
        this.ad = false;
        this.ak = 0L;
        this.al = 0L;
        this.X = false;
        this.S = new c(activity);
        this.S.a(activity);
        a((Context) activity);
        if (intent != null) {
            this.Q = intent.getData();
        }
        e("Constructor intent = " + this.O);
        d(activity);
        poz.a(this.S, new com.taobao.taolive.room.service.d());
        if (taoliveOpenLiveRoom != null) {
            a(taoliveOpenLiveRoom);
        }
        b(taoliveOpenLiveRoom);
        p();
        a(intent);
        a(activity, this.c, this.d, this.f, this.K, this.J);
    }

    public q(Activity activity, Intent intent) {
        super(activity);
        this.o = false;
        this.v = 0L;
        this.z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = 0;
        this.E = null;
        this.G = 0;
        this.K = null;
        this.Y = new BroadcastReceiver() { // from class: com.taobao.taolive.room.controller2.TaoLiveRealController$3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent2});
                } else if (!StringUtils.equals(intent2.getAction(), "com.taobao.live.room.init")) {
                } else {
                    String stringExtra = intent2.getStringExtra("force");
                    long intExtra = intent2.getIntExtra("seqId", -1);
                    if (q.o() == null) {
                        return;
                    }
                    if ((intExtra == -1 || intExtra == q.c(q.this)) && !"true".equals(stringExtra)) {
                        return;
                    }
                    q.c(q.this, "true".equals(stringExtra));
                    q.d(q.this).H = true;
                    q.d(q.this, true);
                }
            }
        };
        this.ad = false;
        this.ak = 0L;
        this.al = 0L;
        this.X = false;
        this.S = new c(activity);
        this.S.a(activity);
        a((Context) activity);
        if (intent != null) {
            this.Q = intent.getData();
        }
        d(activity);
        poz.a(this.S, new com.taobao.taolive.room.service.d());
        p();
        a(intent);
        a(activity, this.c, this.d, this.f, this.K, this.J);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str});
        }
        e("updateUri");
        Uri parse = Uri.parse(str);
        HashMap hashMap = new HashMap();
        if (parse == null) {
            return hashMap;
        }
        this.g = parse.getQueryParameter("spm");
        this.J.put("spm", this.g);
        com.taobao.taolive.sdk.controller.e eVar = this.S;
        Map<String, String> a2 = ai.a(eVar, (Object) this.H, this.i, poz.m(eVar), this.m, this.n, false);
        a2.put("pageName", "Page_TaobaoLiveWatch");
        poz.a(this.g, this.S);
        return a2;
    }

    private void a(Activity activity, final String str, String str2, String str3, String str4, Map<String, String> map) {
        Activity activity2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8634ef63", new Object[]{this, activity, str, str2, str3, str4, map});
            return;
        }
        com.taobao.taolive.room.utils.m.b("TaoLiveController2_init");
        a(activity, str);
        com.taobao.taolive.sdk.playcontrol.c.a(activity);
        com.taobao.android.live.plugin.proxy.f.m().initUltronServerConfig(activity);
        com.taobao.taolive.movehighlight.utils.f.a().a(com.taobao.taolive.movehighlight.utils.f.f21480a);
        q();
        this.H = activity;
        this.ad = false;
        this.c = str;
        this.S.b(L());
        this.d = str2;
        this.f = str3;
        this.J = map;
        a(activity, str3, str4);
        pbt.a().a(this.H);
        pbt.a().b();
        this.ap = new t(this.S, this.H);
        String c = poz.c(this.S);
        this.ap.a(c, this.f, this.c, this.d);
        this.ap.a(true, c, this.f, this.c, this.d);
        if (!aa.bT()) {
            a(this.S);
        }
        com.taobao.taolive.room.service.f.a(true);
        b = toString();
        this.q = y.a();
        this.q.b();
        f(false);
        if (aa.bT()) {
            a(this.S);
        }
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(pmd.a().u().c());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.taobao.live.room.init");
        localBroadcastManager.registerReceiver(this.Y, intentFilter);
        com.taobao.taolive.room.dx.b.c().a(this.H);
        com.taobao.taolive.room.service.g.a(this.H).a();
        com.taobao.taolive.sdk.controller.e eVar = this.S;
        if (!(eVar instanceof c) || !((c) eVar).b()) {
            z = false;
        }
        if (!z) {
            com.taobao.taolive.sdk.morelive.e.a().b();
        }
        com.taobao.taolive.sdk.morelive.e.a().a(new com.taobao.taolive.sdk.morelive.c() { // from class: com.taobao.taolive.room.controller2.q.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                q.this = this;
            }

            @Override // com.taobao.taolive.sdk.morelive.c
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                ddw.a().a("taolive.more.live.status", "VISIBLE", q.this.observeUniqueIdentification());
                if (q.a(q.this) != null) {
                    q.a(q.this).setVisibility(8);
                }
                q.a(q.this, true);
                q.this.updateScrollEnabled(false);
                q.b(q.this, true);
            }

            @Override // com.taobao.taolive.sdk.morelive.c
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                ddw.a().a("taolive.more.live.status", "GONE", q.this.observeUniqueIdentification());
                if (q.a(q.this) != null && !poy.as(com.taobao.taolive.room.utils.n.a())) {
                    q.a(q.this).setVisibility(0);
                }
                q.a(q.this, false);
                q.this.updateScrollEnabled(true);
                q.b(q.this, false);
            }

            @Override // com.taobao.taolive.sdk.morelive.c
            public ArrayList c() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (ArrayList) ipChange2.ipc$dispatch("b36da644", new Object[]{this});
                }
                if (q.b(q.this) == null) {
                    return null;
                }
                return q.b(q.this).b();
            }
        });
        if (com.taobao.android.live.plugin.proxy.c.a().b()) {
            b(str);
        } else {
            com.taobao.android.live.plugin.proxy.c.a().a(new c.a() { // from class: com.taobao.taolive.room.controller2.q.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    q.this = this;
                }

                @Override // com.taobao.android.live.plugin.proxy.c.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        q.a(q.this, str);
                    }
                }
            });
        }
        if (as.f() && (activity2 = this.H) != null && activity2.getWindow() != null) {
            this.H.getWindow().addFlags(128);
        }
        Activity activity3 = this.H;
        if (activity3 == null) {
            return;
        }
        xpg.a(activity3, activity3.hashCode());
    }

    private void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c005ac1e", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.taolive.sdk.utils.q.b("TaoLiveRealController", "setCanShowPopFlag，setCanShowPopFlag发送事件");
        tnq.a(com.taobao.taolive.room.utils.n.a(), !z);
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        this.T = com.taobao.android.live.plugin.proxy.f.k().createShareFission();
        IBottomProxy.a aVar = this.T;
        if (aVar == null) {
            return;
        }
        aVar.a(poz.c(this.S), str);
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        try {
            if (pmc.a().b() == null) {
                return;
            }
            pmc.a().b().c();
            pmc.a().b().b();
        } catch (Exception unused) {
        }
    }

    private void a(Activity activity, String str) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8bb1504", new Object[]{this, activity, str});
        } else if (!com.taobao.taolive.sdk.goodlist.n.j() || !com.taobao.taolive.sdk.goodlist.n.l() || activity.getIntent() == null || (data = activity.getIntent().getData()) == null) {
        } else {
            String queryParameter = data.getQueryParameter(aw.PARAM_ITEM_IDS);
            String queryParameter2 = data.getQueryParameter(aw.PARAM_ITEM_HOLD_TYPE);
            if (StringUtils.isEmpty(queryParameter) || !"insideDetail".equals(queryParameter2)) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (com.taobao.taolive.sdk.goodlist.n.a()) {
                arrayList.add(queryParameter);
            }
            com.taobao.taolive.sdk.goodlist.n.a(activity, poz.f(this.S), str, arrayList, "hold", "hold");
        }
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        pla plaVar = this.aj;
        if (plaVar != null) {
            poz.o(plaVar.d, this.S);
        } else if (poz.z(this.S)) {
        } else {
            poz.o(false, (com.taobao.taolive.sdk.core.g) this.S);
        }
    }

    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(pmd.a().u().c()).unregisterReceiver(this.Y);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public boolean P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[]{this})).booleanValue() : this.X;
    }

    @Override // com.taobao.taolive.room.controller2.d
    public ViewGroup a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("8c7138ad", new Object[]{this});
        }
        e("getView mRootView = " + this.I);
        return this.I;
    }

    private Intent t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("dd3c67b8", new Object[]{this}) : this.H.getIntent();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void f() {
        com.taobao.taolive.sdk.controller.e eVar;
        VideoInfo j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.ad || !aa.J() || (eVar = this.S) == null || (j = eVar.j()) == null || j.broadCaster == null) {
        } else {
            com.taobao.taolive.sdk.business.g.a(j.liveId, j.broadCaster.accountId, j.topic, 10010, null, null, null, com.taobao.taolive.sdk.core.j.e(null));
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void g() {
        VideoInfo u;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!aa.J() || (u = poy.u(com.taobao.taolive.room.utils.n.a())) == null || u.broadCaster == null) {
        } else {
            LiveCommonTipsMsg liveCommonTipsMsg = new LiveCommonTipsMsg();
            liveCommonTipsMsg.userNick = v.g(cgl.i().b());
            liveCommonTipsMsg.userId = cgl.i().a();
            LiveDetailMessinfoResponseData f = (com.taobao.taolive.room.utils.n.a() == null || com.taobao.taolive.room.utils.n.a().d() == null) ? null : com.taobao.taolive.room.utils.n.a().d().f();
            if (f != null && f.visitorIdentity != null) {
                liveCommonTipsMsg.identify = f.visitorIdentity;
            } else {
                liveCommonTipsMsg.identify = u.visitorIdentity;
            }
            liveCommonTipsMsg.text = this.H.getString(R.string.taolive_bulk_hint);
            liveCommonTipsMsg.bgColor = "#ff2851";
            com.taobao.taolive.sdk.business.g.a(u.liveId, u.broadCaster.accountId, u.topic, PowerMsgType.commonTipsMsg, JSON.toJSONString(liveCommonTipsMsg), null, null, com.taobao.taolive.sdk.core.j.e(null));
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!z) {
            plk.a(this.H, R.string.taolive_sku_query_data_failed);
        } else if (this.v == 0) {
        } else {
            ddw.a().a("com.taobao.taolive.room.addcart", Long.valueOf(this.v));
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(Intent intent, boolean z) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2864fb4f", new Object[]{this, intent, new Boolean(z)});
            return;
        }
        e("refresh");
        this.W = true;
        if (intent == null) {
            return;
        }
        Uri data = intent.getData();
        Map<String, String> b2 = ak.b(data);
        this.Q = data;
        Bundle extras = intent.getExtras();
        if (extras != null) {
            a(extras);
        } else {
            poz.H(null, this.S);
        }
        String queryParameter = data != null ? data.getQueryParameter(aw.PARAM_LIVE_ROOM_SPM_PARAM) : null;
        if (data != null) {
            z2 = (!aa.cW() || data.getBooleanQueryParameter(aw.PARAM_ENTRY_QUERY_KEEP_LAST, false)) ? data.getBooleanQueryParameter(aw.PARAM_UPDATE_ALL_DATA_WHEN_REFRESH, false) : true;
        } else {
            z2 = false;
        }
        if (b2 == null) {
            return;
        }
        com.taobao.taolive.sdk.controller.e eVar = this.S;
        if (eVar != null) {
            eVar.B = false;
        }
        a(b2.get("id"), b2.get("userId"), b2.get("livesource"), queryParameter, b2, z, false, z2);
    }

    public void a(Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82aee8d5", new Object[]{this, uri, new Boolean(z)});
            return;
        }
        e("refresh");
        a(uri, z, false);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(Uri uri, boolean z, boolean z2) {
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d32ee49f", new Object[]{this, uri, new Boolean(z), new Boolean(z2)});
            return;
        }
        e("refresh");
        Map<String, String> b2 = ak.b(uri);
        String queryParameter = uri.getQueryParameter(aw.PARAM_LIVE_ROOM_SPM_PARAM);
        if (uri != null) {
            z3 = (!aa.cW() || uri.getBooleanQueryParameter(aw.PARAM_ENTRY_QUERY_KEEP_LAST, false)) ? uri.getBooleanQueryParameter(aw.PARAM_UPDATE_ALL_DATA_WHEN_REFRESH, false) : true;
        } else {
            z3 = false;
        }
        this.Q = uri;
        if (b2 == null) {
            return;
        }
        a(b2.get("id"), b2.get("userId"), b2.get("livesource"), queryParameter, b2, z, z2, z3);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public String M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d8450cc", new Object[]{this});
        }
        TBLiveRecEngineV2 tBLiveRecEngineV2 = this.r;
        if (tBLiveRecEngineV2 == null) {
            return null;
        }
        return String.valueOf(tBLiveRecEngineV2.e());
    }

    @Override // com.taobao.taolive.room.controller2.d
    public boolean O() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[]{this})).booleanValue();
        }
        if (this.z || this.A || this.B) {
            z = true;
        }
        e("互动浮层是否展开：" + z);
        return z;
    }

    public boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a7235e", new Object[]{this})).booleanValue();
        }
        boolean j = com.taobao.taolive.sdk.playcontrol.c.j(com.taobao.taolive.room.utils.n.a());
        e("小窗isInSmallMode：" + j);
        return j;
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9bfae0", new Object[]{this, new Boolean(z)});
            return;
        }
        e("调用了开放的清屏能力" + z);
        ddw.a().a(xkw.EVENT_CLEAR_SCREEN_NEW, Boolean.valueOf(z), observeUniqueIdentification());
    }

    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        Map a2 = au.a(obj, (Map) null);
        if (at.a(a2)) {
            return;
        }
        a(a2);
    }

    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
            return;
        }
        Map a2 = au.a(obj, (Map) null);
        if (at.a(a2)) {
            return;
        }
        ddw.a().a(xkw.EVENT_TAB2_MORE_LIVE_RIGHT_GUIDE_FRAME_IS_SHOW, a2, observeUniqueIdentification());
    }

    private void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        com.taobao.taolive.sdk.controller.e eVar = this.S;
        if (!(eVar != null && eVar.C())) {
            return;
        }
        String a2 = au.a(map.get("type"), (String) null);
        if (StringUtils.isEmpty(a2) || this.ad || S()) {
            return;
        }
        char c = 65535;
        int hashCode = a2.hashCode();
        if (hashCode != -1332194002) {
            if (hashCode != 114581) {
                if (hashCode == 3433103 && a2.equals("page")) {
                    c = 0;
                }
            } else if (a2.equals("tab")) {
                c = 1;
            }
        } else if (a2.equals("background")) {
            c = 2;
        }
        if (c != 0 && c != 1 && c != 2) {
            return;
        }
        pko.a().d(this.S.e());
    }

    public boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c35260", new Object[]{this})).booleanValue();
        }
        com.taobao.taolive.sdk.ui.media.d c = com.taobao.taolive.sdk.playcontrol.c.c(this.P);
        if (c == null) {
            return true;
        }
        return c.x();
    }

    public void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d169dd", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.I;
        if (!(viewGroup instanceof RightDrawerLayout)) {
            return;
        }
        ((RightDrawerLayout) viewGroup).openDrawer();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public RecyclerView N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("7e9dd54f", new Object[]{this}) : this.mRecyclerView;
    }

    private void a(String str, String str2, String str3, String str4, Map<String, String> map, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5783133f", new Object[]{this, str, str2, str3, str4, map, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else if (aa.cF() && this.ad) {
            e("refresh but isDestroyed");
        } else {
            ViewGroup viewGroup = this.I;
            if (viewGroup instanceof RightDrawerLayout) {
                ((RightDrawerLayout) viewGroup).closeDrawer();
            }
            String str5 = map.get(aw.PARAM_TIMEMOVING_ITEM_ID);
            Map<String, String> map2 = this.J;
            String str6 = map2 != null ? map2.get(aw.PARAM_TIMEMOVING_ITEM_ID) : null;
            if (!StringUtils.isEmpty(str2) && str2.equals(this.d) && !z && (StringUtils.isEmpty(str5) || str5.equals(str6))) {
                return;
            }
            if (!StringUtils.isEmpty(str) && str.equals(this.c) && !z && (StringUtils.isEmpty(str5) || str5.equals(str6))) {
                return;
            }
            t tVar = this.ap;
            if (tVar != null) {
                tVar.b();
            }
            c(z2, true);
            if (z3 && aa.br()) {
                e("refresh isRefreshAllData = true");
                Intent intent = new Intent();
                intent.setData(this.Q);
                a(intent);
                a(this.H, str3, this.K);
            } else {
                e("refresh isRefreshAllData = false");
                this.J = map;
                IBottomProxy.a aVar = this.T;
                if (aVar != null) {
                    aVar.a(map, str);
                }
                com.taobao.taolive.sdk.controller.e eVar = this.S;
                eVar.n = str4;
                poz.U(null, eVar);
            }
            pbt.a().g.a("liveRoom", "query", this.J);
            b(z2, true);
            this.c = str;
            this.d = str2;
            this.f = str3;
            f(true);
            if (this.ap == null) {
                return;
            }
            Uri uri = this.Q;
            this.ap.a(false, uri != null ? uri.toString() : "", this.f, this.c, this.d);
        }
    }

    @Override // com.taobao.taolive.sdk.controller.b, com.taobao.taolive.room.controller2.d
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        e("onConfigurationChanged");
        if (this.x == configuration.orientation) {
            return;
        }
        ddw.a().a("com.taobao.taolive.room.screen_orientation_changed", configuration.orientation == 0 ? "landscape" : "portrait");
        this.x = configuration.orientation;
        if (com.taobao.taolive.sdk.utils.y.a() && (com.taobao.taolive.sdk.utils.y.b(this.H) || com.taobao.taolive.sdk.utils.y.c(this.H))) {
            this.totalDy = 0;
            this.z = false;
            this.A = false;
            this.B = false;
            updateScrollEnabled(true);
        }
        y();
    }

    private void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            com.taobao.taolive.sdk.core.j.a();
        }
    }

    private void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else if (poz.t(this.S)) {
            v();
        } else {
            if (this.r == null) {
                this.r = new TBLiveRecEngineV2("1".equals((map == null || StringUtils.isEmpty(map.get(aw.PARAM_SWITCH_RT_RCMD))) ? "1" : this.J.get(aw.PARAM_SWITCH_RT_RCMD)), (c) this.S);
            }
            this.r.a(this.mRecyclerView);
            if (this.s == null) {
                this.s = new HashMap<>();
            }
            if (map != null) {
                this.s.put(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_ID, map.get("id"));
                if (!StringUtils.isEmpty(str)) {
                    this.s.put("entryLiveSource", str);
                } else {
                    this.s.put("entryLiveSource", map.get("livesource"));
                }
                this.s.put(TBLiveRecEngineV2.PARAM_ENTRY_SJSD_ITEM_ID, map.get(aw.PARAM_SJSD_ITEM_ID));
                this.s.put(TBLiveRecEngineV2.PARAM_ENTRY_TIMESHIFT_ITEM_ID, map.get(aw.PARAM_TIMEMOVING_ITEM_ID));
                this.s.put("appkey", pmd.a().u().b());
                this.s.put("queryKey", map.get("queryKey"));
                this.s.put("queryDetailInfo", map.get("queryDetailInfo"));
                String valueOf = String.valueOf(System.currentTimeMillis());
                this.s.put(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_TRACE_ID, valueOf);
                this.J.put(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_TRACE_ID, valueOf);
                this.s.put("timeMovingStatus", map.get("timeMovingStatus"));
                this.s.put(TBLiveRecEngineV2.PARAM_ENTRY_ITEM_ID, map.get("itemid"));
            }
            TBLiveRecEngineV2 tBLiveRecEngineV2 = this.r;
            if (tBLiveRecEngineV2 == null) {
                return;
            }
            tBLiveRecEngineV2.a(this.c, this.d, this.J, this.j);
            this.r.a(this.mAdapter);
        }
    }

    private void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
        } else if (this.mAdapter == null) {
        } else {
            ArrayList<IRecyclerModel> arrayList = new ArrayList<>();
            TBLiveRecEngineV2.RecModel recModel = new TBLiveRecEngineV2.RecModel(true, this.S);
            recModel.liveId = this.c;
            recModel.accountId = this.d;
            recModel.initParams = this.J;
            recModel.visit = true;
            recModel.isFirst = true;
            if (aa.cq()) {
                recModel.trackInfo = this.j;
            }
            arrayList.add(recModel);
            this.mAdapter.a(arrayList);
            this.mAdapter.notifyDataSetChanged();
            j(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e(boolean z) {
        GoodItem goodItem;
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            return;
        }
        u.M();
        poz.i((String) null, this.S);
        poz.H(null, this.S);
        poz.W("", this.S);
        poz.c(false, (com.taobao.taolive.sdk.core.g) this.S);
        poy.a(false, com.taobao.taolive.room.utils.n.a());
        poz.U(w(), this.S);
        this.z = false;
        this.A = false;
        Map<String, String> map = this.J;
        if (map != null) {
            poz.I(map.get("queryKey"), this.S);
            poz.H(this.J.get("liveAdParams"), this.S);
            ddw.a().a("com.taobao.taolive.room.querykey.change", poz.k(this.S));
            if (StringUtils.isEmpty(this.J.get(aw.PARAM_SJSD_ITEM_ID))) {
                String str = this.J.get("bubbleGoodInfoJson");
                if (!StringUtils.isEmpty(str)) {
                    try {
                        goodItem = (GoodItem) JSONObject.parseObject(str, GoodItem.class);
                    } catch (Exception unused) {
                    }
                    if (goodItem == null && !StringUtils.isEmpty(goodItem.itemId)) {
                        this.J.put(aw.PARAM_SJSD_ITEM_ID, goodItem.itemId);
                    } else {
                        hashMap = (HashMap) JSONObject.parseObject(this.J.get("goodInfoWeitao"), HashMap.class);
                        if (hashMap != null && !StringUtils.isEmpty((CharSequence) hashMap.get("itemId"))) {
                            this.J.put(aw.PARAM_SJSD_ITEM_ID, hashMap.get("itemId"));
                        }
                    }
                }
                goodItem = null;
                if (goodItem == null) {
                }
                hashMap = (HashMap) JSONObject.parseObject(this.J.get("goodInfoWeitao"), HashMap.class);
                if (hashMap != null) {
                    this.J.put(aw.PARAM_SJSD_ITEM_ID, hashMap.get("itemId"));
                }
            }
            this.g = this.J.get("spm");
            this.h = this.J.get("content");
            this.i = this.J.get("scm");
            this.j = this.J.get("trackInfo");
            this.l = this.J.get(aw.PARAM_TRACK_LIVEOPRT_ID);
            this.k = this.J.get("clickid");
            if (!StringUtils.isEmpty(this.J.get("livesource"))) {
                this.f = this.J.get("livesource");
            }
            if (!z) {
                this.m = this.J.get(aw.PARAM_SEARCH_KEYWORD_RN);
                this.n = this.J.get(aw.PARAM_SEARCH_KEYWORD_POS);
            }
            String str2 = this.J.get(aw.PARAM_HIDE_DYNAMIC);
            poz.j(!StringUtils.isEmpty(str2) && Boolean.parseBoolean(str2), this.S);
            String str3 = this.J.get(aw.PARAM_HIDE_H5_DYNAMIC);
            if (StringUtils.isEmpty(str3) || !Boolean.parseBoolean(str3)) {
                z2 = false;
            }
            poz.k(z2, this.S);
            this.e = null;
            this.y = this.J.get("timePointPlayUrl");
            try {
                String str4 = this.J.get(aw.PARAM_CUSTOM_PLAY_CTRL);
                if (!StringUtils.isEmpty(str4)) {
                    this.e = com.taobao.taolive.room.utils.q.a(str4);
                }
                if (this.e != null && this.y == null) {
                    String string = this.e.getString("timeMovingUrl");
                    if (!StringUtils.isEmpty(string)) {
                        this.y = string;
                    }
                }
                this.F = (GoodItem) pqj.a(this.J.get("bubbleGoodInfoJson"), GoodItem.class);
                String str5 = this.J.get(aw.PARAM_BACK_TO_LIVE);
                if (!pmd.a().a("timeShift") || StringUtils.equals("true", str5)) {
                    this.y = null;
                }
                if (this.F != null) {
                    poz.W(this.F.itemId, this.S);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.o = false;
        poz.G(this.h, this.S);
        poz.a(this.g, this.S);
        poz.b(this.j, this.S);
        poz.e(this.l, this.S);
        poz.H(null, this.S);
        poz.c(false, (com.taobao.taolive.sdk.core.g) this.S);
    }

    private String w() {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f74eee2", new Object[]{this});
        }
        Intent intent = this.H.getIntent();
        if (intent != null && (data = intent.getData()) != null) {
            return data.getQueryParameter("clickid");
        }
        return null;
    }

    @Override // com.taobao.taolive.sdk.controller.b
    public void initAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bec36126", new Object[]{this});
            return;
        }
        this.mItemHeight = 0;
        this.mFirstCell = true;
        this.mAdapter = new com.taobao.taolive.sdk.controller.a(this.H);
        this.mAdapter.a(this.S);
        a.C0905a c0905a = new a.C0905a();
        com.taobao.taolive.sdk.controller.e eVar = this.S;
        if (eVar != null && eVar.f() != null) {
            c0905a.f21814a = OpenLiveSingleRoomVH.class;
        } else {
            c0905a.f21814a = TaoLiveSingleRoomVH.class;
        }
        c0905a.b = R.layout.taolive_vh_liveroom;
        this.mAdapter.a(ContentType.Live.ordinal(), c0905a);
        this.mAdapter.a(this.P);
        if (aa.bQ()) {
            a.C0905a c0905a2 = new a.C0905a();
            c0905a2.f21814a = TaoLiveGoodCardVH.class;
            c0905a2.b = R.layout.taolive_vh_good_card;
            this.mAdapter.a(ContentType.Good_Card.ordinal(), c0905a2);
        }
        if (this.mRecyclerView == null) {
            return;
        }
        this.mRecyclerView.setAdapter(this.mAdapter);
    }

    @Override // com.taobao.taolive.sdk.controller.b
    public void beforeUpDownSwitchEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("794dc532", new Object[]{this});
            return;
        }
        l();
        if (com.taobao.taolive.room.utils.n.a() == null) {
            return;
        }
        com.taobao.taolive.room.utils.n.a().d(true);
    }

    @Override // com.taobao.taolive.sdk.controller.b
    public void afterUpDownSwitchEnd() {
        TBLiveRecEngineV2 tBLiveRecEngineV2;
        com.taobao.android.live.plugin.proxy.debugPanel.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeda1fb5", new Object[]{this});
            return;
        }
        ab.c(a.TAG, "afterUpDownSwitchEnd");
        TBLiveRecEngineV2 tBLiveRecEngineV22 = this.r;
        if (tBLiveRecEngineV22 != null) {
            tBLiveRecEngineV22.b(this.lastStart);
        }
        this.f21604a = false;
        if (com.taobao.taolive.room.utils.n.a() != null) {
            com.taobao.taolive.room.utils.n.a().c(true);
        }
        if (!com.taobao.taolive.room.utils.d.a() || (tBLiveRecEngineV2 = this.r) == null || (aVar = this.p) == null) {
            return;
        }
        aVar.refreshData(tBLiveRecEngineV2.l(), this.r.m());
    }

    @Override // com.taobao.taolive.sdk.controller.b
    public void handleUpDownSwitch(boolean z, int i, int i2) {
        TBLiveRecEngineV2.RecModel k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7fea474", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
            return;
        }
        TBLiveRecEngineV2 tBLiveRecEngineV2 = this.r;
        if (tBLiveRecEngineV2 != null) {
            if (z) {
                k = tBLiveRecEngineV2.d();
            } else {
                k = tBLiveRecEngineV2.k();
            }
            poz.c(this.r.e(), this.S);
            poy.l(pqj.a(k), com.taobao.taolive.room.utils.n.a());
            a(k, z);
        }
        c("UpDown");
    }

    @Override // com.taobao.taolive.sdk.controller.b
    public void handlePreload(boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb1ec26c", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
            return;
        }
        TBLiveRecEngineV2 tBLiveRecEngineV2 = this.r;
        if (tBLiveRecEngineV2 == null) {
            return;
        }
        if (!z) {
            i = i2;
        }
        tBLiveRecEngineV2.c(i);
    }

    @Override // com.taobao.taolive.sdk.controller.b
    public void onReachBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3d42326", new Object[]{this});
        } else if (poz.t(this.S)) {
            if (pmd.a().m() == null) {
                return;
            }
            pnj m = pmd.a().m();
            m.a("TBLiveUpDownWatch", "onReachBottom_return======" + poz.t(this.S));
        } else {
            plk.a(this.H, "猜中你的喜欢有点难，再滑一下试试~");
            TBLiveRecEngineV2 tBLiveRecEngineV2 = this.r;
            if (tBLiveRecEngineV2 == null) {
                return;
            }
            tBLiveRecEngineV2.g();
        }
    }

    private void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        W();
        com.taobao.taolive.room.utils.a.a(this.I);
        com.taobao.taolive.room.utils.m.a(this.I, true);
        this.I.setKeepScreenOn(true);
        View findViewById = this.I.findViewById(R.id.taolive_close_btn);
        findViewById.setOnClickListener(this);
        if (Build.VERSION.SDK_INT < 23) {
            findViewById.setAlpha(1.0f);
        }
        this.mRecyclerView = (TaoLiveRecyclerView) this.I.findViewById(R.id.taolive_recyclerview);
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRecyclerView2.class);
        arrayList.add(MessageCardScrollView.class);
        this.mRecyclerView.setNestedScrollChilds(arrayList);
        this.mRecyclerView.setBackgroundColor(-13223097);
        this.mRecyclerView.setGlobalContext(this.S);
        initRecyclerView(this.mRecyclerView);
        this.S.a(this.mRecyclerView);
        initAdapter();
        if (!as.a(this.S)) {
            return;
        }
        X();
        a((RightDrawerLayout) this.I);
    }

    private void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be50d37f", new Object[]{this, new Boolean(z)});
            return;
        }
        ViewGroup viewGroup = this.I;
        if (!(viewGroup instanceof RightDrawerLayout)) {
            return;
        }
        if (z) {
            ((RightDrawerLayout) viewGroup).setDrawerLockMode(0);
        } else {
            ((RightDrawerLayout) viewGroup).setDrawerLockMode(1);
        }
    }

    private void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df815e", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.H).inflate(R.layout.taolive_activity_video_2, (ViewGroup) null);
        if (as.a(this.S)) {
            this.I = new RightDrawerLayout(this.H, null);
            this.I.addView(viewGroup, new ViewGroup.MarginLayoutParams(-1, -1));
            LinearLayout linearLayout = new LinearLayout(this.H);
            linearLayout.setGravity(GravityCompat.END);
            linearLayout.setBackgroundColor(Color.parseColor("#66000000"));
            linearLayout.setId(R.id.taolive_drawer_container);
            linearLayout.setOrientation(1);
            this.I.addView(linearLayout, new ViewGroup.MarginLayoutParams(-1, -1));
            return;
        }
        this.I = viewGroup;
    }

    private void a(RightDrawerLayout rightDrawerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f7933ab", new Object[]{this, rightDrawerLayout});
        } else {
            rightDrawerLayout.addDrawerListener(new RightDrawerLayout.a() { // from class: com.taobao.taolive.room.controller2.TaoLiveRealController$4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.room.widget.RightDrawerLayout.a
                public void a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    } else if (q.e(q.this) == null) {
                    } else {
                        q.b(q.this, false);
                        q.e(q.this).a();
                        q.e(q.this).b();
                    }
                }

                @Override // com.taobao.taolive.room.widget.RightDrawerLayout.a
                public void b(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("91037249", new Object[]{this, view});
                    } else if (q.e(q.this) == null) {
                    } else {
                        q.b(q.this, true);
                        q.e(q.this).c();
                        q.e(q.this).d();
                    }
                }
            });
        }
    }

    private void X() {
        String str = pjt.CLASS_MAPPING.get(this.ae);
        if (!StringUtils.isEmpty(str)) {
            try {
                Class<?> cls = Class.forName(str);
                this.an = (r) cls.getMethod("createLiveCustomView", ViewGroup.class).invoke(cls.newInstance(), this.I.findViewById(R.id.taolive_drawer_container));
            } catch (Exception e) {
                com.taobao.taolive.sdk.utils.q.a("TaoLiveRealController", "createComponentWithContext", e);
            }
        }
    }

    public void l() {
        long j;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (this.r == null) {
        } else {
            VideoInfo u = poy.u(com.taobao.taolive.room.utils.n.a());
            if (u == null || u.broadCaster == null) {
                j = 0;
                z = false;
            } else {
                long j2 = u.viewCount;
                pmt pmtVar = new pmt();
                pmtVar.f32764a = u.broadCaster.accountId;
                j = j2;
                z = pmd.a().B().a(pmtVar);
            }
            this.r.a(this.c, System.currentTimeMillis() - this.u, z, j, com.taobao.taolive.room.ui.fanslevel.a.a().d());
        }
    }

    private String a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d56608a1", new Object[]{this, uri});
        }
        if (uri == null) {
            return "";
        }
        if ("pages.tmall.com".equals(uri.getHost())) {
            return uri.getQueryParameter(aw.PARAM_ELEVEN_LIVE_ID);
        }
        String queryParameter = uri.getQueryParameter("id");
        return StringUtils.isEmpty(queryParameter) ? uri.getQueryParameter(aw.PARAM_ELEVEN_LIVE_ID) : queryParameter;
    }

    private void a(com.taobao.taolive.sdk.controller.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24a981fe", new Object[]{this, eVar});
            return;
        }
        this.C = false;
        if (Build.VERSION.SDK_INT >= 23) {
            this.H.getWindow().getDecorView().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.taobao.taolive.room.controller2.q.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    q.this = this;
                }

                /* JADX WARN: Code restructure failed: missing block: B:63:0x0196, code lost:
                    if (com.taobao.taolive.room.controller2.q.i(com.taobao.taolive.room.controller2.q.this) > 0) goto L31;
                 */
                /* JADX WARN: Removed duplicated region for block: B:69:0x01e2  */
                @Override // android.view.View.OnLayoutChangeListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onLayoutChange(android.view.View r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13) {
                    /*
                        Method dump skipped, instructions count: 522
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.room.controller2.q.AnonymousClass7.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
                }
            });
        } else {
            int i = this.G;
            if (i > 0) {
                poz.m(true, (com.taobao.taolive.sdk.core.g) this.S);
                poz.b(this.G, (com.taobao.taolive.sdk.core.g) this.S);
                poz.c(0, (com.taobao.taolive.sdk.core.g) this.S);
                y();
            } else if (i == 0) {
                poz.m(false, (com.taobao.taolive.sdk.core.g) this.S);
                poz.b(0, (com.taobao.taolive.sdk.core.g) this.S);
                poz.c(0, (com.taobao.taolive.sdk.core.g) this.S);
                y();
            }
        }
        com.taobao.taolive.room.service.d.a(this.S);
    }

    private void y() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        if (this.C) {
            pnj m = pmd.a().m();
            m.b(MediaConstant.LBLIVE_SOURCE, "adaptDisplayCutout mCutoutHeight = " + this.D);
            if (!aa.dn() ? this.H.getRequestedOrientation() == 1 : this.H.getResources().getConfiguration().orientation == 1) {
                z = true;
            }
            ViewGroup viewGroup = this.I;
            if (viewGroup != null) {
                View findViewById = viewGroup.findViewById(R.id.taolive_close_btn);
                if (findViewById != null && (layoutParams2 = findViewById.getLayoutParams()) != null) {
                    if (z) {
                        pnj m2 = pmd.a().m();
                        m2.b(MediaConstant.LBLIVE_SOURCE, "adaptDisplayCutout  portrait mCutoutHeight = " + this.D);
                        if (ply.aa()) {
                            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = com.taobao.taolive.room.utils.d.a(this.H, 12.0f) + Math.max(this.D, com.taobao.taolive.room.c.c);
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = com.taobao.taolive.room.utils.d.a(this.H, 12.0f) + this.D;
                        }
                    } else if (ply.aa()) {
                        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = com.taobao.taolive.room.c.c;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = com.taobao.taolive.room.utils.d.a(this.H, 12.0f);
                    }
                    findViewById.setLayoutParams(layoutParams2);
                }
                View findViewById2 = this.I.findViewById(R.id.taolive_stop_game_btn);
                if (findViewById2 != null && (layoutParams = findViewById2.getLayoutParams()) != null) {
                    if (z) {
                        if (ply.aa()) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = com.taobao.taolive.room.utils.d.a(this.H, 12.0f) + Math.max(this.D, com.taobao.taolive.room.c.c);
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = com.taobao.taolive.room.utils.d.a(this.H, 12.0f) + this.D;
                        }
                    } else if (ply.aa()) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = com.taobao.taolive.room.c.c;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = com.taobao.taolive.room.utils.d.a(this.H, 12.0f);
                    }
                }
            }
        } else {
            m();
        }
        c(this.C);
    }

    public void c(boolean z) {
        View findViewById;
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else if (this.I == null || !j.c() || (layoutParams = (findViewById = this.I.findViewById(R.id.taolive_home_page_tab)).getLayoutParams()) == null) {
        } else {
            pnj m = pmd.a().m();
            m.b(MediaConstant.LBLIVE_SOURCE, "adaptDisplayCutout  portrait mCutoutHeight = " + this.D);
            if (z) {
                if (ply.aa()) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = Math.max(this.D, com.taobao.taolive.room.c.c) - j.d();
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.D - j.d();
                }
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = com.taobao.taolive.room.c.c;
            }
            findViewById.setLayoutParams(layoutParams);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public com.taobao.taolive.sdk.controller.e j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.controller.e) ipChange.ipc$dispatch("c83a9807", new Object[]{this}) : this.S;
    }

    public void m() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (this.I == null || !ply.aa()) {
        } else {
            View findViewById = this.I.findViewById(R.id.taolive_close_btn);
            if (findViewById != null && (layoutParams2 = findViewById.getLayoutParams()) != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = com.taobao.taolive.room.utils.d.a(this.H, 14.0f) + com.taobao.taolive.room.c.c;
                findViewById.setLayoutParams(layoutParams2);
            }
            View findViewById2 = this.I.findViewById(R.id.taolive_stop_game_btn);
            if (findViewById2 == null || (layoutParams = findViewById2.getLayoutParams()) == null) {
                return;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = com.taobao.taolive.room.utils.d.a(this.H, 14.0f) + com.taobao.taolive.room.c.c;
        }
    }

    private void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        this.Z = this.I.findViewById(R.id.taolive_close_btn);
        if (this.Z != null) {
            if (pmd.a().a("closeBtn") && !poz.z(this.S)) {
                this.Z.setVisibility(0);
            } else {
                this.Z.setVisibility(8);
            }
            if (this.V == null) {
                this.V = new ddv() { // from class: com.taobao.taolive.room.controller2.q.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.ddv
                    public String bizCode() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("36951559", new Object[]{this}) : "TaoLiveController2";
                    }

                    {
                        q.this = this;
                    }

                    @Override // tb.ddv
                    public void onEvent(String str, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("c3897928", new Object[]{this, str, obj});
                        } else if ("com.taobao.taolive.room.live_type".equals(str)) {
                            if (q.m(q.this) == null) {
                                return;
                            }
                            q.m(q.this).a(obj);
                            q.m(q.this).a(t.KEY_APP_NAME, "taobao");
                            if (q.d(q.this) == null || !(q.d(q.this).f() instanceof ATaoLiveOpenEntity)) {
                                return;
                            }
                            String str2 = ((ATaoLiveOpenEntity) q.d(q.this).f()).bizCode;
                            if (StringUtils.equals(str2, TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString())) {
                                q.m(q.this).a(t.KEY_TAOLIVEOPENBIZCODE, "Tab2");
                            } else if (StringUtils.equals(str2, TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.toString())) {
                                q.m(q.this).a(t.KEY_TAOLIVEOPENBIZCODE, "OpenWatch");
                            } else if (!StringUtils.equals(str2, TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_StandardOpenWatch.toString())) {
                            } else {
                                q.m(q.this).a(t.KEY_TAOLIVEOPENBIZCODE, "OpenWatchPublic");
                            }
                        } else if (xkw.EVENT_GET_FOLLOW_STATUS.equalsIgnoreCase(str)) {
                            if (q.m(q.this) == null) {
                                return;
                            }
                            q.m(q.this).a("followStatus", String.valueOf(obj));
                        } else if (xkw.EVENT_FOLLOW_FROM_FOLLOWFRAME.equalsIgnoreCase(str)) {
                            if (q.m(q.this) == null) {
                                return;
                            }
                            q.m(q.this).a("followStatus", "true");
                        } else if ("com.taobao.taolive.room.recommend.good.card.did.appear".equals(str)) {
                            if (q.a(q.this) == null) {
                                return;
                            }
                            q.a(q.this).setVisibility(8);
                        } else if (!"com.taobao.taolive.room.recommend.good.card.did.disappear".equals(str) || poy.as(com.taobao.taolive.room.utils.n.a()) || q.a(q.this) == null) {
                        } else {
                            q.a(q.this).setVisibility(0);
                        }
                    }

                    @Override // tb.ddv
                    public String[] observeEvents() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (String[]) ipChange2.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{xkw.EVENT_GET_FOLLOW_STATUS, xkw.EVENT_FOLLOW_FROM_FOLLOWFRAME, "com.taobao.taolive.room.live_type", "com.taobao.taolive.room.recommend.good.card.did.appear", "com.taobao.taolive.room.recommend.good.card.did.disappear"};
                    }

                    @Override // tb.ddv
                    public String observeUniqueIdentification() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (String) ipChange2.ipc$dispatch("4914bdfe", new Object[]{this});
                        }
                        if (q.d(q.this) == null) {
                            return null;
                        }
                        return q.d(q.this).i();
                    }
                };
            }
            ddw.a().a(this.V);
        }
        n();
        ViewGroup viewGroup = (ViewGroup) this.I.findViewById(R.id.taolive_global_layout);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        if (!com.taobao.taolive.room.utils.d.a() || this.r == null) {
            return;
        }
        com.taobao.android.live.plugin.proxy.f.C().createDebugPanel(this.H, this.I, new com.taobao.android.live.plugin.proxy.debugPanel.b() { // from class: com.taobao.taolive.room.controller2.q.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                q.this = this;
            }

            @Override // com.taobao.android.live.plugin.proxy.debugPanel.b
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                } else {
                    q.b(q.this).c(str);
                }
            }
        }, true);
        this.p = com.taobao.android.live.plugin.proxy.f.C().createDisplayView(this.H, this.I, true);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(ISmallWindowStrategy iSmallWindowStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa4d14aa", new Object[]{this, iSmallWindowStrategy});
            return;
        }
        e("setSmallWindowClickListener");
        this.aa = iSmallWindowStrategy;
        com.taobao.taolive.sdk.playcontrol.c.a(this.P, this.aa);
    }

    private void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        com.taobao.android.live.plugin.proxy.ir.a.a().a(IRRoomProxy.KEY, RRoomProxy.getInstance());
        this.M = false;
        r();
        LocalBroadcastManager.getInstance(this.H).sendBroadcast(new Intent("action.com.taobao.taolive.room.start"));
        if (this.P == null) {
            this.P = new com.taobao.taolive.sdk.playcontrol.b();
        }
        this.t = System.currentTimeMillis();
        if (this.w == null) {
            this.w = ddw.a();
            this.w.a(this);
        }
        e(z);
        if (y.a(this.c)) {
            x();
            a(this.f, this.J);
            a(aa.C(), this.d, this.f, null, this.J, false, false, false);
            return;
        }
        d(z2);
        if (z) {
            reset();
            TBLiveRecEngineV2 tBLiveRecEngineV2 = this.r;
            if (tBLiveRecEngineV2 != null) {
                tBLiveRecEngineV2.a();
                this.r = null;
            }
            com.taobao.taolive.sdk.playcontrol.c.b(this.P);
            initAdapter();
        } else {
            x();
        }
        a(this.f, this.J);
        z();
        this.u = System.currentTimeMillis();
        this.x = this.H.getRequestedOrientation();
        c("EnterRoom");
    }

    private void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.taolive.room.utils.m.b("TaoLiveController2_initAll");
        a(z, false);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            e(i.b.MEASURE_ONCREATE);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        e("onStart");
        if (this.mAdapter == null) {
            return;
        }
        this.mAdapter.g();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de36f47", new Object[]{this, kVar});
        } else {
            this.ab = kVar;
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        ai.a(this.S, this.H, "Page_TaobaoLiveWatch");
        com.taobao.taolive.sdk.controller.e eVar = this.S;
        ai.a(eVar, (Object) this.H, this.i, poz.m(eVar), this.m, this.n, true);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        TBLiveRecEngineV2 tBLiveRecEngineV2 = this.r;
        if (tBLiveRecEngineV2 == null) {
            return;
        }
        tBLiveRecEngineV2.a(this.H);
    }

    @Override // com.taobao.taolive.sdk.controller.b, com.taobao.taolive.room.controller2.d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        e("onResume");
        b(true, false);
    }

    private void b(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ff8829", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        k(false);
        this.ac = String.valueOf(System.nanoTime());
        com.taobao.taolive.room.utils.m.b("TaoLiveController2_onResume");
        pla plaVar = this.aj;
        if (plaVar == null || !plaVar.u || this.ab == null) {
            ai.a(this.S, this.H, "Page_TaobaoLiveWatch");
            com.taobao.taolive.sdk.controller.e eVar = this.S;
            ai.a(eVar, (Object) this.H, this.i, poz.m(eVar), this.m, this.n, true);
        }
        com.taobao.taolive.sdk.core.j.f(null);
        if (z && this.S.g()) {
            ai.b(this.S, this.H);
            ai.a(this.S);
        }
        if (z2 && (this.S.f() instanceof ATaoLiveOpenEntity) && ((ATaoLiveOpenEntity) this.S.f()).bizCode != null && ((ATaoLiveOpenEntity) this.S.f()).bizCode.equals(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString())) {
            ai.c(this.S, this.H);
        }
        String a2 = ai.a(this.S, this.H);
        if (!StringUtils.isEmpty(a2)) {
            poz.c(a2, this.S);
        }
        if (as.a(this.S, this.L)) {
            ddw.a().a("com.taobao.taolive.room.check_rv_foreground");
        }
        C();
        if (this.mAdapter != null) {
            this.mAdapter.i();
        }
        IBottomProxy.a aVar = this.T;
        if (aVar != null) {
            aVar.a(poz.c(this.S), poz.i(this.S));
        }
        if (z2) {
            return;
        }
        A();
    }

    private void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
        } else if (!B()) {
        } else {
            this.J.remove(aw.PARAM_WEB_VIEW_LAYER_URL);
            this.J.remove(aw.PARAM_ITEM_HOLD_TYPE);
        }
    }

    private boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue();
        }
        if (!this.J.containsKey(aw.PARAM_ITEM_HOLD_TYPE) || !this.J.containsKey(aw.PARAM_WEB_VIEW_LAYER_URL) || !"showWebViewLayer".equals(this.J.get(aw.PARAM_ITEM_HOLD_TYPE))) {
            return false;
        }
        String str = this.J.get(aw.PARAM_WEB_VIEW_LAYER_URL);
        Uri parse = Uri.parse(Uri.decode(str));
        TaoLiveWebBottomFragment.a aVar = new TaoLiveWebBottomFragment.a();
        if (parse.getQueryParameter("maxHeight") != null) {
            aVar.c(Float.parseFloat(parse.getQueryParameter("maxHeight")));
        }
        if (parse.getQueryParameter("panEnable") != null) {
            aVar.a(Boolean.parseBoolean(parse.getQueryParameter("panEnable")));
        }
        com.taobao.taolivecontainer.b bVar = new com.taobao.taolivecontainer.b(this.H, "Waitou_LiveRoomHalf", new o(), new n(), new String[]{com.taobao.tbliveinteractive.container.h5.d.a()});
        aVar.a(bVar);
        aVar.a(this.H);
        final TaoLiveWebBottomFragment a2 = aVar.a();
        Activity activity = this.H;
        if (activity instanceof FragmentActivity) {
            final FragmentActivity fragmentActivity = (FragmentActivity) activity;
            bVar.b(str);
            new Handler().post(new Runnable() { // from class: com.taobao.taolive.room.controller2.q.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    q.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TaoLiveWebBottomFragment taoLiveWebBottomFragment = a2;
                    FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                    taoLiveWebBottomFragment.show(supportFragmentManager, TaoLiveWebBottomFragment.tag() + "_waitou");
                }
            });
        }
        return true;
    }

    private void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.controller.e eVar = this.S;
        String str = this.ac;
        String str2 = this.c;
        ai.a(eVar, str, str2, "liveoprt_id=" + this.l);
        this.L = System.currentTimeMillis();
    }

    private void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.controller.e eVar = this.S;
        ai.a(eVar, "stay", "time=" + J());
        this.L = System.currentTimeMillis();
        ai.c(this.S, (String) null, new String[0]);
    }

    @Override // com.taobao.taolive.sdk.controller.b, com.taobao.taolive.room.controller2.d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        e("onPause");
        c(true, false);
    }

    private void c(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5e5c36a", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        k(true);
        com.taobao.taolive.sdk.core.j.g(null);
        if (z && this.S.g()) {
            ai.a(this.S, (Object) this.H);
        }
        if (z2 && (this.S.f() instanceof ATaoLiveOpenEntity) && ((ATaoLiveOpenEntity) this.S.f()).bizCode != null && ((ATaoLiveOpenEntity) this.S.f()).bizCode.equals(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString())) {
            ai.a(this.S, (Object) this.H);
        }
        if (this.mAdapter != null) {
            this.mAdapter.h();
        }
        ai.b(this.S, this.ac, this.c, new String[0]);
        poz.X(null, this.S);
    }

    private void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93249a2", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.taolive.sdk.controller.e eVar = this.S;
        if (!(eVar instanceof c)) {
            return;
        }
        ((c) eVar).z = z;
    }

    @Override // com.taobao.taolive.sdk.controller.b, com.taobao.taolive.room.controller2.d
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            g(true);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
            return;
        }
        e(MessageID.onStop);
        if (this.mAdapter != null) {
            this.mAdapter.a(z);
        }
        com.taobao.taolive.sdk.controller.e eVar = this.S;
        ai.a(eVar, "stay", "time=" + J());
        this.L = System.currentTimeMillis();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.ad;
    }

    @Override // com.taobao.taolive.sdk.controller.b, com.taobao.taolive.room.controller2.d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        e(MessageID.onDestroy);
        h(false);
        this.S.c();
        Activity activity = this.H;
        if (activity == null) {
            return;
        }
        xpg.b(activity.hashCode());
    }

    private void h(boolean z) {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b413bfc5", new Object[]{this, new Boolean(z)});
        } else if (this.ad) {
        } else {
            this.ad = true;
            this.aj = null;
            com.taobao.android.live.plugin.proxy.f.m().activityDestroy();
            ai.c(this.S, (String) null, new String[0]);
            t tVar = this.ap;
            if (tVar != null) {
                tVar.b();
                this.ap.a();
                this.ap = null;
            }
            com.taobao.taolive.room.dx.b.c().b();
            com.taobao.taolive.sdk.morelive.e.a().f();
            s();
            com.taobao.taolive.room.service.g.a(this.H).b();
            com.taobao.taolive.room.service.g.a(this.H).c();
            com.taobao.taolive.room.service.f.a(false);
            qne.a();
            com.taobao.taolive.room.ui.fanslevel.a.a().g();
            p();
            pmd.a().B().a();
            r rVar = this.an;
            if (rVar != null) {
                rVar.e();
                this.an = null;
            }
            ddw ddwVar = this.w;
            if (ddwVar != null) {
                ddwVar.b(this);
                this.w = null;
            }
            if (this.V != null) {
                ddw.a().b(this.V);
            }
            TBLiveRecEngineV2 tBLiveRecEngineV2 = this.r;
            if (tBLiveRecEngineV2 != null) {
                tBLiveRecEngineV2.a();
            }
            try {
                if (this.mRecyclerView != null) {
                    this.mRecyclerView.setAdapter(null);
                }
            } catch (Exception unused) {
            }
            com.taobao.taolive.sdk.controller.e eVar = this.S;
            if (eVar != null && eVar.d() != null && (this.S.d() instanceof com.taobao.android.live.plugin.proxy.usertask.g)) {
                ((com.taobao.android.live.plugin.proxy.usertask.g) this.S.d()).d();
                this.S.a((pll) null);
            }
            j jVar = this.U;
            if (jVar != null) {
                jVar.b();
                this.U = null;
            }
            if (StringUtils.equals(b, toString())) {
                pmd.a().m().b("TBLiveXXX", "onDestroy same instance");
                com.taobao.taolive.sdk.core.j.a(this.S.e());
                y yVar = this.q;
                if (yVar != null) {
                    yVar.c();
                    this.q = null;
                }
            } else {
                pmd.a().m().b("TBLiveXXX", "onDestroy not same instance");
            }
            com.taobao.taolive.sdk.playcontrol.b bVar = this.P;
            if (bVar != null) {
                com.taobao.taolive.sdk.playcontrol.c.a(bVar);
                this.P = null;
            }
            poz.b((String) null, this.S);
            poz.a((String) null, this.S);
            poz.a((LiveDetailMessinfoResponseData.AlimamaInfo) null, this.S);
            poz.a((LiveDetailMessinfoResponseData.AlimamaInfo2) null, this.S);
            poz.c((String) null, this.S);
            poz.d("", this.S);
            plk.a();
            com.taobao.taolive.room.utils.n.a(this.S.e());
            c("QuitRoom");
            if (com.taobao.taolive.room.utils.d.a()) {
                com.taobao.android.live.plugin.proxy.f.C().destroyDebugPanel(this.H);
            }
            if (!as.f() || (activity = this.H) == null || activity.getWindow() == null) {
                return;
            }
            this.H.getWindow().clearFlags(128);
        }
    }

    private void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.playcontrol.c.a((com.taobao.alilive.aliliveframework.frame.a) null, VideoStatus.VIDEO_NORMAL_STATUS);
        if (com.taobao.taolive.sdk.core.j.d(null)) {
            return;
        }
        if (aa.ar()) {
            G();
        }
        this.J.put(aw.PARAM_BACK_TO_LIVE, "true");
        this.J.remove("bubbleGoodInfoJson");
        this.J.remove(aw.PARAM_SJSD_ITEM_ID);
        this.J.remove(aw.PARAM_TIMEMOVING_ITEM_ID);
        this.J.remove("timePointPlayUrl");
        this.J.remove(aw.PARAM_TIMEMOVE_KEYPOINTID);
        this.J.remove(aw.PARAM_CUSTOM_PLAY_CTRL);
        this.J.remove(aw.PARAM_PLAY_VIEW_TOKEN);
        this.J.remove("timeMovingSpfPlayVideo");
        this.J.remove("timeMovingPcmIdParam");
        this.J.remove("highlightSignByRePlay");
        this.J.remove(aw.PRE_REQUEST_TIME_MOVE_KEY);
        this.J.remove(aw.PARAM_PRODUCT_TYPE);
        com.taobao.taolive.sdk.playcontrol.c.b(this.P);
        com.taobao.taolive.sdk.core.j.a(com.taobao.taolive.room.utils.n.a(), true, (String) null);
        F();
        a(true, true);
    }

    private void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
            return;
        }
        VideoInfo u = poy.u(com.taobao.taolive.room.utils.n.a());
        if (u == null || !u.isOfficialType() || t() == null || t().getData() == null) {
            return;
        }
        Uri data = t().getData();
        String queryParameter = data.getQueryParameter("id");
        String queryParameter2 = data.getQueryParameter("userId");
        if (StringUtils.isEmpty(queryParameter)) {
            return;
        }
        this.c = queryParameter;
        this.d = queryParameter2;
    }

    private void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
            return;
        }
        ai.a(this.S, (Object) this.H);
        ai.c(this.S, this.H);
        ai.a(this.S, this.H, "Page_TaobaoLiveWatch");
    }

    private void H() {
        Map<String, String> map;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
            return;
        }
        if (com.taobao.taolive.sdk.utils.p.a("enableReopenShopWindow", true) && (map = this.J) != null && v.a(map.get("needReopenShopWindow"), true) && (str = this.J.get("reopenUrl")) != null) {
            String decode = Uri.decode(str);
            if (!StringUtils.isEmpty(decode)) {
                Nav.from(this.H).toUri(decode);
            }
        }
        if (!w.a(this.S) || this.aj != null) {
            return;
        }
        this.H.finish();
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (this.H.isFinishing()) {
        } else {
            if (this.ah != null) {
                if ((!aa.cZ() || this.mRecyclerView.getScrollState() != 0) && aa.cZ()) {
                    return;
                }
                this.ah.onClick(view);
                HashMap hashMap = new HashMap();
                hashMap.put(cpe.PLT_SCREENSHOT_FLOAT_WINDOW_TRIGGER_ID, "taobao");
                pmd.a().e().a("Page_TaobaoLiveWatch", "Page_TaobaoLive_Button-Button-UpShare", hashMap);
                return;
            }
            new com.taobao.taolive.room.ui.view.b(this.H).show();
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.I.findViewById(R.id.taolive_close_btn);
        if (j.c()) {
            com.taobao.taolive.sdk.controller.e eVar = this.S;
            if (eVar instanceof c) {
                ((c) eVar).a(true);
            }
            this.U = new j(this.H, frameLayout, (FrameLayout) this.I.findViewById(R.id.taolive_home_page_tab));
            this.U.a();
            return;
        }
        ((c) this.S).a(false);
        frameLayout.setBackgroundResource(R.drawable.taolive_room_close_btn_background_small);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.width = com.taobao.taolive.room.utils.d.a(this.H, 66.0f);
        layoutParams.height = com.taobao.taolive.room.utils.d.a(this.H, 25.0f);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.removeAllViews();
        a(frameLayout);
    }

    private void a(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f363e3eb", new Object[]{this, frameLayout});
            return;
        }
        LayoutInflater.from(this.H).inflate(com.taobao.android.live.plugin.proxy.f.u().getRealRIdMap().get(IFullScreenProxy.R_LAYOUT_TAOLIVE_CLOSE_BTN_LAYOUT).intValue(), frameLayout);
        frameLayout.setImportantForAccessibility(2);
        View findViewById = frameLayout.findViewById(com.taobao.android.live.plugin.proxy.f.u().getRealRIdMap().get(IFullScreenProxy.R_ID_TAOLIVE_ROOM_TOP_MORE_BTN).intValue());
        View findViewById2 = frameLayout.findViewById(com.taobao.android.live.plugin.proxy.f.u().getRealRIdMap().get(IFullScreenProxy.R_ID_TAOLIVE_ROOM_TOP_CLOSE_BTN).intValue());
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.room.controller2.q.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                q.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    q.a(q.this, view);
                }
            }
        });
        if (aa.dq()) {
            findViewById2.setOnClickListener(this);
        }
        if (findViewById2 != null) {
            findViewById2.setContentDescription("关闭");
        }
        if (findViewById != null) {
            findViewById.setContentDescription("更多");
        }
        com.taobao.taolive.room.utils.b.a(findViewById2);
        com.taobao.taolive.room.utils.b.a(findViewById);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        TBLiveRecEngineV2 tBLiveRecEngineV2;
        com.taobao.taolive.sdk.controller.e eVar;
        final int findLastVisibleItemPosition;
        int findLastVisibleItemPosition2;
        TBLiveRecEngineV2.RecModel recModel;
        VideoInfo videoInfo;
        VideoInfo videoInfo2;
        Map<String, String> map;
        Uri parse;
        Map<String, String> b2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (xkw.EVENT_TRACK.equals(str)) {
            if (!(obj instanceof String)) {
                return;
            }
            if (poy.J(com.taobao.taolive.room.utils.n.a())) {
                ai.b(this.S, (String) obj, "feed_id=" + this.c, ag.ARG_SCM + this.i);
                return;
            }
            ai.a(this.S, (String) obj, this.g);
        } else if ("com.taobao.taolive.room.killself".equals(str)) {
            K();
        } else if (FullScreenFrame.EVENT_PREVIEW_VIDEO_FULL_SCREEN.equals(str)) {
            this.I.findViewById(R.id.taolive_close_btn).setVisibility(8);
        } else if (FullScreenFrame.EVENT_PREVIEW_VIDEO_NORMAL_SCREEN.equals(str)) {
            if (pmd.a().a("closeBtn") && !poz.z(this.S)) {
                this.I.findViewById(R.id.taolive_close_btn).setVisibility(0);
            } else {
                this.I.findViewById(R.id.taolive_close_btn).setVisibility(8);
            }
        } else if ("com.taobao.taolive.room.hide_btn_close".equals(str)) {
            this.I.findViewById(R.id.taolive_close_btn).setVisibility(8);
        } else if ("com.taobao.taolive.room.show_btn_close".equals(str)) {
            if (pmd.a().a("closeBtn") && !poz.z(this.S)) {
                this.I.findViewById(R.id.taolive_close_btn).setVisibility(0);
            } else {
                this.I.findViewById(R.id.taolive_close_btn).setVisibility(8);
            }
        } else {
            String str2 = "unknown";
            if ("com.taobao.taolive.room.enable_updown_switch".equals(str)) {
                if (this.z || this.B || this.A) {
                    return;
                }
                if (obj != null) {
                    str2 = (String) obj;
                }
                com.taobao.taolive.sdk.utils.q.b("TaoLiveRealController", "receive enable upDown switch " + str2);
                if (!StringUtils.isEmpty(str2) && "liveShop".equals(str2)) {
                    this.N = false;
                }
                String str3 = "==== EVENT_ENABLE_UPDOWN_SWITCH===== id = " + this.c;
                VideoInfo u = poy.u(com.taobao.taolive.room.utils.n.a());
                if (u != null) {
                    z = poy.b(u, com.taobao.taolive.room.utils.n.b());
                }
                if (u == null || u.closeUpAndDownSlide) {
                    return;
                }
                if ((z && !aa.B()) || this.M) {
                    return;
                }
                if (poy.e(com.taobao.taolive.room.utils.n.a()) && !c(this.H)) {
                    return;
                }
                updateScrollEnabled(true);
            } else if ("com.taobao.taolive.room.mediaplatform_switch_room".equals(str)) {
                if (!(obj instanceof Map)) {
                    return;
                }
                Map map2 = (Map) obj;
                String str4 = (String) map2.get("url");
                if (StringUtils.isEmpty(str4) || (b2 = ak.b((parse = Uri.parse(str4)))) == 0) {
                    return;
                }
                b2.put("highlightSignByRePlay", map2.get("highlightSignByRePlay"));
                if (!StringUtils.isEmpty((CharSequence) map2.get(aw.HIGHLIGHT_TRANSPARENT_PARAMS))) {
                    b2.put(aw.PARAM_TRANSPARENT_PARAMS, map2.get(aw.HIGHLIGHT_TRANSPARENT_PARAMS));
                }
                a(parse, b2);
                ai.b(this.S);
                G();
                String str5 = null;
                if (parse != null) {
                    str5 = parse.getQueryParameter(aw.PARAM_LIVE_ROOM_SPM_PARAM);
                }
                a((String) b2.get("id"), (String) b2.get("userId"), (String) b2.get("livesource"), str5, b2, parse.getBooleanQueryParameter(aw.PARAM_FORCE_REFRESH, false), false, false);
            } else if ("com.taobao.taolive.room.disable_updown_switch".equals(str)) {
                if (obj != null) {
                    str2 = (String) obj;
                }
                com.taobao.taolive.sdk.utils.q.b("TaoLiveRealController", "receive disable upDown switch " + str2);
                if (!StringUtils.isEmpty(str2) && aw.TAOLIVE_MORE_LIVE.equals(str2)) {
                    this.M = true;
                } else if ("liveShop".equals(str2)) {
                    this.N = true;
                }
                updateScrollEnabled(false);
            } else if ("com.taobao.taolive.room.mediaplatform_close_room".equals(str)) {
                K();
            } else {
                String str6 = "PlayBackToLive";
                if (FullScreenFrame.EVENT_BACK_TO_LIVE.equals(str)) {
                    if ((obj instanceof String) && (map = this.J) != null) {
                        map.put("livesource", (String) obj);
                    }
                    if (aa.cs() && com.taobao.taolive.movehighlight.utils.c.w() && obj == null) {
                        com.taobao.taolive.sdk.controller.e eVar2 = this.S;
                        if (eVar2 != null && !StringUtils.isEmpty(eVar2.q)) {
                            str6 = "PlayBackToLive." + this.S.q;
                        }
                        this.J.put("livesource", str6);
                    }
                    E();
                    ai.a(this.S, ag.CALCK_SHIFTTIME, (String) null);
                } else if ("com.taobao.taolive.room.replay_backToLive".equals(str)) {
                    if (!(obj instanceof String)) {
                        return;
                    }
                    String str7 = (String) obj;
                    if (this.S != null && com.taobao.taolive.movehighlight.utils.c.w() && !StringUtils.isEmpty(this.S.q)) {
                        str6 = "PlayBackToLive." + this.S.q;
                    }
                    com.taobao.taolive.room.utils.s.a(this.H, com.taobao.taolive.room.utils.c.a(str7) + "&livesource=" + str6 + "&backwardSwitch=true");
                } else if ("com.taobao.taolive.room.addcarting".equals(str)) {
                    if (!(obj instanceof Long)) {
                        return;
                    }
                    this.v = ((Long) obj).longValue();
                } else if ("com.taobao.taolive.room.goods_list_showing".equals(str)) {
                    if (!(obj instanceof Boolean)) {
                        return;
                    }
                    this.z = ((Boolean) obj).booleanValue();
                } else if (xkw.EVENT_NEW_PROFILE__IS_SHOWING.equals(str)) {
                    if (!(obj instanceof Boolean)) {
                        return;
                    }
                    this.A = ((Boolean) obj).booleanValue();
                    com.taobao.taolive.sdk.utils.q.b("TaoLiveRealController", "赋值 mIsProfilePageShowing：" + this.A);
                } else if (xkw.EVENT_REWARD_PANEL_SHOWING.equals(str)) {
                    if (!(obj instanceof Boolean)) {
                        return;
                    }
                    this.B = ((Boolean) obj).booleanValue();
                } else if (FullScreenFrame.EVENT_TYPE_UPDOWNSWITCH_INIT.equals(str)) {
                    if (this.r == null || (videoInfo2 = (VideoInfo) obj) == null || videoInfo2.broadCaster == null) {
                        return;
                    }
                    String str8 = videoInfo2.liveId;
                    String str9 = videoInfo2.broadCaster.accountId;
                    if (videoInfo2.isOfficialType()) {
                        str8 = videoInfo2.officialLiveInfo.officialLiveId;
                        str9 = videoInfo2.officialLiveInfo.accountId;
                    }
                    this.r.a(str8, str9, videoInfo2.recommendBindId, this.s);
                } else if ("com.taobao.taolive.room.updownswitch.official.dedup".equals(str)) {
                    if (this.r == null || (videoInfo = (VideoInfo) obj) == null || videoInfo.broadCaster == null || !videoInfo.isOfficialLive()) {
                        return;
                    }
                    this.r.a(videoInfo);
                } else if ("com.taobao.taolive.room.refresh.recmodel".equals(str)) {
                    TBLiveRecEngineV2 tBLiveRecEngineV22 = this.r;
                    if (tBLiveRecEngineV22 == null || (recModel = (TBLiveRecEngineV2.RecModel) obj) == null) {
                        return;
                    }
                    tBLiveRecEngineV22.a(recModel);
                } else if ("com.taobao.taolive.room.show_global_miniLive".equals(str)) {
                    if (R()) {
                        a(false, "ZoomBtn");
                    } else {
                        K();
                    }
                } else if ("com.taobao.taolive.room.show_error".equals(str)) {
                    pla plaVar = this.aj;
                    if (plaVar == null || !plaVar.u || this.ab == null) {
                        return;
                    }
                    com.taobao.taolive.sdk.controller.e eVar3 = this.S;
                    Map<String, String> a2 = ai.a(eVar3, (Object) this.H, this.i, poz.m(eVar3), this.m, this.n, false);
                    a2.put("pageName", "Page_TaobaoLiveWatch");
                    this.ab.a(a2);
                } else if ("com.taobao.taolive.room.need_back".equals(str)) {
                    this.o = true;
                } else if ("com.taobao.taolive.room.enter_ut_track".equals(str)) {
                    pla plaVar2 = this.aj;
                    if (plaVar2 != null && plaVar2.u && this.ab != null) {
                        com.taobao.taolive.sdk.controller.e eVar4 = this.S;
                        Map<String, String> a3 = ai.a(eVar4, (Object) this.H, this.i, poz.m(eVar4), this.m, this.n, false);
                        a3.put("pageName", "Page_TaobaoLiveWatch");
                        this.ab.a(a3);
                        return;
                    }
                    com.taobao.taolive.sdk.controller.e eVar5 = this.S;
                    ai.a(eVar5, (Object) this.H, this.i, poz.m(eVar5), this.m, this.n, true, false);
                } else if ("com.taobao.taolive.room.update_params".equals(str)) {
                    this.u = System.currentTimeMillis();
                    TBLiveDataModel tBLiveDataModel = (TBLiveDataModel) obj;
                    if (tBLiveDataModel == null) {
                        return;
                    }
                    if (tBLiveDataModel.mInitParams != null) {
                        this.i = tBLiveDataModel.mInitParams.get("scm");
                    }
                    VideoInfo videoInfo3 = tBLiveDataModel.mVideoInfo;
                    if (videoInfo3 == null) {
                        return;
                    }
                    this.c = videoInfo3.liveId;
                    if (this.mAdapter != null) {
                        this.mAdapter.a(tBLiveDataModel.mViewItemId);
                    }
                    if (videoInfo3.broadCaster != null) {
                        this.d = videoInfo3.broadCaster.accountId;
                    }
                    if (!videoInfo3.isOfficialType()) {
                        return;
                    }
                    this.c = videoInfo3.officialLiveInfo.officialLiveId;
                    this.d = videoInfo3.officialLiveInfo.accountId;
                } else if ("com.taobao.taolive.room.sliding_close_page".equals(str)) {
                    com.taobao.taolive.sdk.utils.m.a("TBLiveService", "SideSlip event");
                    com.taobao.taolive.sdk.controller.e eVar6 = this.S;
                    if (eVar6 != null && eVar6.t() != null && !this.S.t().a()) {
                        return;
                    }
                    if (Q() && com.taobao.taolive.room.utils.n.a() != null && !com.taobao.taolive.room.utils.n.a().V()) {
                        a(true, "SideSlip");
                        com.taobao.taolive.sdk.utils.m.a("TBLiveService", "SideSlip showGlobalMiniWindow");
                        return;
                    }
                    K();
                } else if ("com.taobao.taolive.room.switch.liveroom.down".equals(str)) {
                    if (this.mRecyclerView == null || this.mLayoutManager == null || this.mAdapter == null) {
                        return;
                    }
                    int findLastVisibleItemPosition3 = this.mLayoutManager.findLastVisibleItemPosition() + 1;
                    if (this.mAdapter.getItemCount() > findLastVisibleItemPosition3) {
                        this.mRecyclerView.smoothScrollToPosition(findLastVisibleItemPosition3);
                    } else {
                        K();
                    }
                } else if ("com.taobao.taolive.room.more_btn_click".equals(str)) {
                    a((View) obj);
                } else if (xkw.EVENT_NEGATIVE_FEEDBACK.equals(str)) {
                    if (this.mRecyclerView == null || this.mLayoutManager == null || this.mAdapter == null || this.mAdapter.getItemCount() <= (findLastVisibleItemPosition2 = (findLastVisibleItemPosition = this.mLayoutManager.findLastVisibleItemPosition()) + 1)) {
                        return;
                    }
                    this.mRecyclerView.smoothScrollToPosition(findLastVisibleItemPosition2);
                    handleUpDownSwitch(false, findLastVisibleItemPosition, this.mLayoutManager.findLastVisibleItemPosition());
                    this.mRecyclerView.postDelayed(new Runnable() { // from class: com.taobao.taolive.room.controller2.q.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        {
                            q.this = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            q.b(q.this).a(findLastVisibleItemPosition);
                            q.c(q.this, findLastVisibleItemPosition);
                        }
                    }, 400L);
                } else if (VideoFrameErrorController.EVENT_AUTO_DOWN.equals(str)) {
                    a(true, obj);
                } else if ("com.taobao.taolive.room.auto_up".equals(str)) {
                    a(false, obj);
                } else if ("com.taobao.taolive.room.check_rv_foreground".equals(str)) {
                    TBLiveRecEngineV2 tBLiveRecEngineV23 = this.r;
                    if (tBLiveRecEngineV23 == null) {
                        return;
                    }
                    tBLiveRecEngineV23.n();
                } else if ("com.taobao.taolive.room.refresh".equals(str)) {
                    if (!(obj instanceof Uri)) {
                        return;
                    }
                    a((Uri) obj, true);
                } else if ("com.taobao.taolive.room.remove".equals(str)) {
                    TBLiveRecEngineV2 tBLiveRecEngineV24 = this.r;
                    if (tBLiveRecEngineV24 == null) {
                        return;
                    }
                    tBLiveRecEngineV24.a(tBLiveRecEngineV24.e());
                } else if ("smartlanding_event_action_hotReservation".equals(str) && aa.m1383do()) {
                    com.taobao.taolive.sdk.utils.q.b("TaoLiveRealController", "BottomSlideNewGuide：收到smartlanding发送的展示下滑引导event");
                    if (!(obj instanceof JSONObject) || (eVar = this.S) == null || eVar.M()) {
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.getJSONObject("actionData") != null) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("actionData");
                        if (jSONObject2.getJSONObject("bizData") != null) {
                            if ("2".equals(jSONObject2.getJSONObject("bizData").getString("bizType")) && jSONObject2.getJSONObject("bizData").getJSONObject("bottomInfo") != null) {
                                LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo = new LiveDetailMessinfoResponseData.RecommendCardInfo();
                                recommendCardInfo.dxTemplateName = jSONObject2.getJSONObject("bizData").getJSONObject("bottomInfo").getString("dxTemplateName");
                                recommendCardInfo.dxData = jSONObject2.getJSONObject("bizData").getJSONObject("bottomInfo").getJSONObject(bkm.PARSER_KEY_DX_DATA);
                                hashMap.put("bottomInfo", recommendCardInfo);
                            } else {
                                TBLiveRecEngineV2 tBLiveRecEngineV25 = this.r;
                                if (tBLiveRecEngineV25 != null && tBLiveRecEngineV25.j() != null && this.r.j().reserveItemCardInfo != null && this.r.j().reserveItemCardInfo.cardInfo != null && this.r.j().reserveItemCardInfo.bottomInfo != null) {
                                    hashMap.put("bottomInfo", this.r.j().reserveItemCardInfo.bottomInfo);
                                }
                            }
                        }
                        hashMap.put("actionData", jSONObject2);
                        hashMap.put("popId", jSONObject.getString("popId"));
                    }
                    ddw.a().a(xkw.f34361a, hashMap, observeUniqueIdentification());
                } else if (!"com.taobao.taolive.room.updownswitch.willappear".equals(str) || (tBLiveRecEngineV2 = this.r) == null) {
                } else {
                    tBLiveRecEngineV2.p();
                }
            }
        }
    }

    private void a(boolean z, Object obj) {
        TBLiveRecEngineV2.RecModel c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9984048", new Object[]{this, new Boolean(z), obj});
            return;
        }
        ab.c(a.TAG, "receive EVENT_AUTO_DOWN mIsMoreLive = " + this.M);
        if (this.mRecyclerView == null || this.mLayoutManager == null || this.mAdapter == null || this.r == null || this.M || !this.S.h || (c = this.r.c()) == null || !(obj instanceof String) || !obj.equals(c.liveId) || this.mScrollState != 0) {
            return;
        }
        ab.c(a.TAG, "smoothScrollToPosition liveId = " + c.liveId);
        int e = this.r.e();
        if (z) {
            e++;
        } else if (e > 0) {
            e--;
        }
        if (this.mAdapter.getItemCount() <= e) {
            return;
        }
        this.f21604a = true;
        updateScrollEnabled(true);
        this.mRecyclerView.smoothScrollToPosition(e);
    }

    private boolean c(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{this, context})).booleanValue() : com.taobao.taolive.sdk.utils.y.a() && com.taobao.taolive.sdk.utils.y.e(context);
    }

    private void a(Uri uri, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c4fbc6", new Object[]{this, uri, map});
            return;
        }
        String queryParameter = uri.getQueryParameter("timeMovingSpfPlayVideo");
        if (StringUtils.isEmpty(queryParameter)) {
            return;
        }
        map.put("timeMovingSpfPlayVideo", queryParameter);
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{xkw.EVENT_TRACK, "com.taobao.taolive.room.killself", "com.taobao.taolive.room.show_btn_close", "com.taobao.taolive.room.hide_btn_close", "com.taobao.taolive.room.enable_updown_switch", "com.taobao.taolive.room.disable_updown_switch", "com.taobao.taolive.room.mediaplatform_switch_room", "com.taobao.taolive.room.mediaplatform_close_room", FullScreenFrame.EVENT_BACK_TO_LIVE, "com.taobao.taolive.room.replay_backToLive", "com.taobao.taolive.room.addcarting", "com.taobao.taolive.room.goods_list_showing", "com.taobao.taolive.room.show_error", "com.taobao.taolive.room.need_back", "com.taobao.taolive.room.enter_ut_track", "com.taobao.taolive.room.update_params", FullScreenFrame.EVENT_TYPE_UPDOWNSWITCH_INIT, "com.taobao.taolive.room.updownswitch.official.dedup", "com.taobao.taolive.room.refresh.recmodel", "com.taobao.taolive.room.updownswitch.willappear", "com.taobao.taolive.room.show_global_miniLive", "com.taobao.taolive.room.sliding_close_page", "com.taobao.taolive.room.switch.liveroom.down", "com.taobao.taolive.room.more_btn_click", xkw.EVENT_NEGATIVE_FEEDBACK, xkw.EVENT_NEW_PROFILE__IS_SHOWING, xkw.EVENT_REWARD_PANEL_SHOWING, VideoFrameErrorController.EVENT_AUTO_DOWN, "com.taobao.taolive.room.auto_up", "com.taobao.taolive.room.check_rv_foreground", "com.taobao.taolive.room.refresh", xkw.d, "smartlanding_event_action_hotReservation"};
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if ((!aa.dq() || com.taobao.android.live.plugin.proxy.f.u() == null || com.taobao.android.live.plugin.proxy.f.u().getRealRIdMap() == null || com.taobao.android.live.plugin.proxy.f.u().getRealRIdMap().get(IFullScreenProxy.R_ID_TAOLIVE_ROOM_TOP_CLOSE_BTN) == null || view.getId() != com.taobao.android.live.plugin.proxy.f.u().getRealRIdMap().get(IFullScreenProxy.R_ID_TAOLIVE_ROOM_TOP_CLOSE_BTN).intValue()) && (aa.dq() || view.getId() != R.id.taolive_close_btn)) {
        } else {
            if (this.ag != null && (!I() || com.taobao.taolive.sdk.playcontrol.c.i(com.taobao.taolive.room.utils.n.a()) != VideoStatus.VIDEO_TIMESHIFT_STATUS || poy.B(com.taobao.taolive.room.utils.n.a()) != 0 || !aa.v())) {
                this.ag.onClick(view);
            } else {
                i(false);
            }
        }
    }

    private boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[]{this})).booleanValue();
        }
        VideoInfo u = poy.u(com.taobao.taolive.room.utils.n.a());
        if (u == null) {
            return false;
        }
        return "1".equals(u.roomStatus);
    }

    @Override // com.taobao.taolive.sdk.controller.b, com.taobao.taolive.room.controller2.d
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        i(true);
        return true;
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7931bad1", new Object[]{this, onClickListener});
            return;
        }
        e("setClickCloseRoomListener");
        this.ag = onClickListener;
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void b(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04fabb0", new Object[]{this, onClickListener});
            return;
        }
        e("setClickCloseRoomListener");
        this.ah = onClickListener;
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de0b50d", new Object[]{this, eVar});
        } else {
            this.af = eVar;
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            i(false);
        }
    }

    private void i(boolean z) {
        com.taobao.taolive.sdk.controller.e eVar;
        VideoInfo u;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c89864", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.taolive.sdk.controller.e eVar2 = this.S;
        if (eVar2 != null && eVar2.t() != null && !this.S.t().a()) {
            return;
        }
        if (aa.aK() && com.taobao.taolive.sdk.morelive.e.a().d()) {
            if (com.taobao.taolive.sdk.morelive.e.a().e() == null) {
                return;
            }
            com.taobao.taolive.sdk.morelive.e.a().e().b();
        } else if (this.N) {
            ddw.a().a("com.taobao.taolive.room.fandom.close_item_rank", false);
            this.N = false;
        } else if (this.z) {
            ddw.a().a("com.taobao.taolive.room.hide_goods_list");
        } else if (this.A) {
            ddw.a().a(xkw.EVENT_AVATAR_CARD__HIDE);
        } else if (this.B) {
            ddw.a().a(xkw.EVENT_HIDE_REWARD_PANEL);
        } else if (this.o) {
            ddw.a().a("com.taobao.taolive.room.mediaplatform_switch_to_portrait");
            this.o = false;
        } else if (com.taobao.taolive.sdk.playcontrol.c.i(com.taobao.taolive.room.utils.n.a()) == VideoStatus.VIDEO_TIMESHIFT_STATUS && aa.v() && (u = poy.u(com.taobao.taolive.room.utils.n.a())) != null && u.status == 0 && poy.B(com.taobao.taolive.room.utils.n.a()) == 0) {
            if (this.J != null) {
                String str = "timemoveReturn";
                if (this.S != null && com.taobao.taolive.movehighlight.utils.c.w() && !StringUtils.isEmpty(this.S.q)) {
                    str = "timemoveReturn." + this.S.q;
                }
                this.J.put("livesource", str);
            }
            E();
            ai.a(this.S, ag.CALCK_SHIFTTIME, (String) null);
        } else if (aa.dj() && (eVar = this.S) != null && eVar.F != null && this.S.F.f() && this.S.F.a("leave", new ISmartLandingProxy.a() { // from class: com.taobao.taolive.room.controller2.q.3
            {
                q.this = this;
            }
        })) {
        } else {
            if (z) {
                com.taobao.taolive.sdk.utils.m.a("TBLiveService", "KeyBackDown event");
                if (Q() && com.taobao.taolive.room.utils.n.a() != null && !com.taobao.taolive.room.utils.n.a().V()) {
                    a(true, "KeyBackDown");
                    com.taobao.taolive.sdk.utils.m.a("TBLiveService", "KeyBackDown showGlobalMiniWindow");
                    return;
                }
                K();
                return;
            }
            K();
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (pmd.a().n() == null) {
        } else {
            poj n = pmd.a().n();
            String str = this.c;
            n.a("taolive", "liveRoomMemoryWarning", str, str);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (pmd.a().n() == null) {
        } else {
            String valueOf = String.valueOf(i);
            pmd.a().n().a("taolive", "liveRoomMemoryTrimMemory", valueOf, valueOf, valueOf);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de1296c", new Object[]{this, fVar});
        } else {
            this.ai = fVar;
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public View b(boolean z) {
        TaoLiveSingleRoomVH taoLiveSingleRoomVH;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("18d4778d", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            ViewGroup viewGroup = this.I;
            if (viewGroup == null) {
                return null;
            }
            ViewStub viewStub = (ViewStub) viewGroup.findViewById(R.id.taolive_top_ubee_container_stub);
            if (viewStub != null) {
                viewStub.inflate();
            }
            return this.I.findViewById(R.id.taolive_ubee_container);
        }
        int findFirstCompletelyVisibleItemPosition = this.mLayoutManager.findFirstCompletelyVisibleItemPosition();
        if (findFirstCompletelyVisibleItemPosition >= 0 && (taoLiveSingleRoomVH = (TaoLiveSingleRoomVH) this.mRecyclerView.findViewHolderForAdapterPosition(findFirstCompletelyVisibleItemPosition)) != null) {
            return taoLiveSingleRoomVH.getUbeeContainer();
        }
        return null;
    }

    public void a(pla plaVar) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9d2b6d3", new Object[]{this, plaVar});
            return;
        }
        if (plaVar != null) {
            this.G = plaVar.b;
            if (plaVar.d && (view = this.Z) != null) {
                view.setVisibility(8);
            }
            poz.q(plaVar.o, this.S);
            poz.p(plaVar.h, this.S);
            poz.o(plaVar.d, this.S);
            this.S.w = plaVar.j;
            poz.d(plaVar.f32745a, this.S);
            poz.i(plaVar.c, this.S);
            poz.O(plaVar.g, this.S);
            poz.M(plaVar.g, this.S);
            poz.M(plaVar.g, this.S);
            poz.e(plaVar.i, this.S);
            poz.f(plaVar.e, this.S);
            poz.g(plaVar.f, this.S);
            poz.b(System.currentTimeMillis() + plaVar.k, this.S);
            poz.h(plaVar.l, this.S);
            poz.r(plaVar.n, this.S);
            poz.s(plaVar.r, this.S);
            this.S.m = plaVar.b;
        }
        this.aj = plaVar;
    }

    private void a(Intent intent) {
        String str;
        String str2;
        JSONObject jSONObject;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        JSONObject jSONObject2;
        Bundle extras;
        String queryParameter;
        String str10;
        String b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        com.taobao.taolive.room.utils.m.b("TaoLiveController2_initParams");
        if (intent != null) {
            Uri data = intent.getData();
            poz.f(intent.getDataString(), this.S);
            poz.f(intent.getDataString(), this.S);
            this.ak = intent.getLongExtra("firstTime", 0L);
            poz.a(pqj.c(intent.getStringExtra("homepageTabExposureList")), this.S);
            this.J = new HashMap();
            if (data != null) {
                if (aa.cx()) {
                    for (String str11 : data.getQueryParameterNames()) {
                        this.J.put(str11, data.getQueryParameter(str11));
                    }
                }
                if ("pages.tmall.com".equals(data.getHost())) {
                    this.c = data.getQueryParameter(aw.PARAM_ELEVEN_LIVE_ID);
                    this.J.put("id", this.c);
                    str9 = null;
                    jSONObject2 = null;
                    str3 = null;
                    str4 = null;
                    str5 = null;
                    str6 = null;
                    str7 = null;
                } else {
                    com.taobao.taolive.sdk.controller.e eVar = this.S;
                    if (eVar != null) {
                        eVar.c(data.getQueryParameter(aw.PARAM_PM_PARAMS));
                    }
                    this.J.put(aw.PARAM_INTENT_URL, data.toString());
                    this.J.put(aw.PARAM_WEB_VIEW_LAYER_URL, data.getQueryParameter(aw.PARAM_WEB_VIEW_LAYER_URL));
                    this.c = data.getQueryParameter("id");
                    if (StringUtils.isEmpty(this.c)) {
                        this.c = data.getQueryParameter(aw.PARAM_ELEVEN_LIVE_ID);
                    }
                    this.J.put("id", this.c);
                    this.J.put("contentId", data.getQueryParameter("contentId"));
                    this.J.put(aw.PARAM_SUB_CONTENT_ID, data.getQueryParameter(aw.PARAM_SUB_CONTENT_ID));
                    this.J.put(aw.PARAM_SPECIAL_LIVE, data.getQueryParameter(aw.PARAM_SPECIAL_LIVE));
                    this.J.put(aw.PARAM_EXTEND, data.getQueryParameter(aw.PARAM_EXTEND));
                    this.J.put(aw.PARAM_PLAYER_TOKEN, data.getQueryParameter(aw.PARAM_PLAYER_TOKEN));
                    this.J.put(aw.PARAM_PLAY_MODE, data.getQueryParameter(aw.PARAM_PLAY_MODE));
                    this.J.put(aw.PARAM_TCP_OUTER_PARAM, data.getQueryParameter(aw.PARAM_TCP_OUTER_PARAM));
                    ((c) this.S).f21593a = data.getQueryParameter(aw.PARAM_TCP_OUTER_PARAM);
                    ((c) this.S).b = data.getQueryParameter(aw.PARAM_OUTER_PARAM);
                    this.S.n = data.getQueryParameter(aw.PARAM_LIVE_ROOM_SPM_PARAM);
                    this.J.put(aw.CHANNEL_EXP_INFO, data.getQueryParameter(aw.CHANNEL_EXP_INFO));
                    this.J.put(aw.PARAM_302_URL, data.getQueryParameter(aw.PARAM_302_URL));
                    this.J.put(aw.PARAM_302_TYPE, data.getQueryParameter(aw.PARAM_302_TYPE));
                    String a2 = ak.a(data);
                    Map<String, String> map = this.J;
                    if (a2 == null) {
                        a2 = "";
                    }
                    map.put(aw.PARAM_TRANSPARENT_PARAMS, a2);
                    this.d = data.getQueryParameter("userId");
                    this.J.put("userId", this.d);
                    this.J.put("needReopenShopWindow", data.getQueryParameter("needReopenShopWindow"));
                    this.J.put("reopenUrl", data.getQueryParameter("reopenUrl"));
                    this.g = data.getQueryParameter("spm");
                    this.h = data.getQueryParameter("content");
                    this.i = data.getQueryParameter("scm");
                    if (aa.bX()) {
                        String queryParameter2 = data.getQueryParameter("trackInfo");
                        Bundle extras2 = intent.getExtras();
                        String string = extras2 != null ? extras2.getString("trackInfo") : null;
                        if (!StringUtils.isEmpty(string)) {
                            this.j = Uri.decode(string);
                        } else {
                            this.j = queryParameter2;
                        }
                    } else {
                        this.j = data.getQueryParameter("trackInfo");
                    }
                    poz.d(com.taobao.taolive.sdk.controller.k.a(this.j, data), this.S);
                    this.k = data.getQueryParameter("clickid");
                    this.J.put(aw.PARAM_FORCE_FULL_SCREEN, Boolean.toString(data.getBooleanQueryParameter(aw.PARAM_FORCE_FULL_SCREEN, false)));
                    if ("/app/mtb/content/pages/live".equals(data.getPath())) {
                        this.f = data.getQueryParameter("bizFrom");
                    } else {
                        this.f = data.getQueryParameter("livesource");
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("url_liveSource", this.f);
                    hashMap.put("url_spm", this.g);
                    ai.a(this.S, "LiveSourceCheck", hashMap);
                    if (aa.cD() && !poz.H(this.S)) {
                        poz.g(data.getBooleanQueryParameter(aw.DISABLEVERTICALSCROLL, false), this.S);
                    }
                    this.J.put("newRoomType", data.getQueryParameter("newRoomType"));
                    this.J.put(aw.PARAM_PRODUCT_TYPE, data.getQueryParameter(aw.PARAM_PRODUCT_TYPE));
                    poz.S(data.getQueryParameter(aw.PARAM_FANDOM_DEFAULT_TAB), this.S);
                    this.J.put(aw.PARAM_IGNORE_PV, data.getQueryParameter(aw.PARAM_IGNORE_PV));
                    this.J.put("livesource", this.f);
                    j.f21601a = data.getQueryParameter(j.PARAM_LIVEHOMEMIX);
                    if (j.c()) {
                        this.G = j.d();
                    }
                    j.a(data.getQueryParameter(j.PARAM_LIVEHOME_SPM));
                    this.J.put(j.PARAM_LIVEHOMEMIX, j.f21601a);
                    if (!StringUtils.isEmpty(j.e())) {
                        this.J.put(j.PARAM_LIVEHOME_SPM, j.e());
                    }
                    String queryParameter3 = data.getQueryParameter(aw.PARAM_RCMD);
                    if (!StringUtils.isEmpty(queryParameter3)) {
                        this.J.put(aw.PARAM_RCMD, queryParameter3);
                    }
                    String queryParameter4 = data.getQueryParameter(aw.PARAM_SWITCH_RT_RCMD);
                    if (!StringUtils.isEmpty(queryParameter4)) {
                        this.J.put(aw.PARAM_SWITCH_RT_RCMD, queryParameter4);
                    }
                    String queryParameter5 = data.getQueryParameter(aw.PARAM_HIDE_CLOSE);
                    if (!StringUtils.isEmpty(queryParameter5)) {
                        poz.o(v.e(queryParameter5), this.S);
                    }
                    String queryParameter6 = data.getQueryParameter(aw.PARAM_DIS_HORISCRL);
                    if (!StringUtils.isEmpty(queryParameter6)) {
                        poz.f(v.e(queryParameter6), this.S);
                    }
                    String queryParameter7 = data.getQueryParameter(aw.PARAM_ADD_TOP);
                    if (!StringUtils.isEmpty(queryParameter7)) {
                        this.G = v.b(queryParameter7);
                    }
                    String queryParameter8 = data.getQueryParameter(aw.PARAM_SEARCH_KEYWORD_RN);
                    String queryParameter9 = data.getQueryParameter(aw.PARAM_SEARCH_KEYWORD_POS);
                    if (!StringUtils.isEmpty(queryParameter8)) {
                        this.J.put(aw.PARAM_SEARCH_KEYWORD_RN, queryParameter8);
                    }
                    if (!StringUtils.isEmpty(queryParameter9)) {
                        this.J.put(aw.PARAM_SEARCH_KEYWORD_POS, queryParameter9);
                    }
                    poz.t(data.getQueryParameter("realExposure"), this.S);
                    poz.x(data.getQueryParameter("scm"), this.S);
                    poz.y(data.getQueryParameter("spm"), this.S);
                    poz.z(v.a(data), this.S);
                    this.J.put("itemid", data.getQueryParameter("itemid"));
                    this.J.put(aw.PARAM_TIMEMOVING_ITEM_ID, data.getQueryParameter(aw.PARAM_TIMEMOVING_ITEM_ID));
                    String queryParameter10 = data.getQueryParameter(aw.PARAM_SJSD_ITEM_ID);
                    this.J.put(aw.PARAM_SJSD_ITEM_ID, queryParameter10);
                    poz.V(queryParameter10, this.S);
                    this.J.put(aw.PARAM_TIMEMOVE_KEYPOINTID, data.getQueryParameter(aw.PARAM_TIMEMOVE_KEYPOINTID));
                    this.J.put(aw.PARAM_HIDE_UI, data.getQueryParameter(aw.PARAM_HIDE_UI));
                    ((c) this.S).y = v.a(data.getQueryParameter(aw.PARAM_HIDE_UI), false);
                    String queryParameter11 = data.getQueryParameter(aw.PARAM_HIDE_DYNAMIC);
                    str5 = data.getQueryParameter(aw.PARAM_HIDE_H5_DYNAMIC);
                    String queryParameter12 = data.getQueryParameter(aw.PARAM_SHARER_ID);
                    this.J.put(aw.PARAM_SHARER_ID, queryParameter12);
                    this.J.put(aw.PARAM_FORCE_FANDOM, data.getQueryParameter(aw.PARAM_FORCE_FANDOM));
                    this.J.put(aw.PARAM_AUTO_SHARE, data.getQueryParameter(aw.PARAM_AUTO_SHARE));
                    this.J.put("mock", data.getQueryParameter("mock"));
                    this.J.put(aw.PARAM_USE_CDN, data.getQueryParameter(aw.PARAM_USE_CDN));
                    this.J.put(aw.PARAM_TEST_COMPONENT_PARAMS, data.getQueryParameter(aw.PARAM_TEST_COMPONENT_PARAMS));
                    this.J.put("queryKey", data.getQueryParameter("queryKey"));
                    this.J.put("queryDetailInfo", data.getQueryParameter("queryDetailInfo"));
                    this.J.put("liveAdParams", data.getQueryParameter("liveAdParams"));
                    this.J.put(aw.PARAM_PLAY_VIEW_TOKEN, data.getQueryParameter(aw.PARAM_PLAY_VIEW_TOKEN));
                    this.J.put(aw.PARAM_SHOW_ANIMATED, data.getQueryParameter(aw.PARAM_SHOW_ANIMATED));
                    poz.p(!v.a(data.getQueryParameter(aw.PARAM_ENABLE_FULLSCREEN), true), this.S);
                    String queryParameter13 = data.getQueryParameter(aw.PARAM_ENABLE_NEW_KANDIAN);
                    if (!StringUtils.isEmpty(queryParameter13)) {
                        u.b = v.a(queryParameter13, true);
                        u.c = true;
                    }
                    if (aa.aw()) {
                        this.J.put(aw.PARAM_LIVE_PLAY_URL, data.getQueryParameter(aw.PARAM_LIVE_PLAY_URL));
                        this.J.put(aw.PARAM_LIVE_URL_TYPE, data.getQueryParameter(aw.PARAM_LIVE_URL_TYPE));
                    }
                    if (aa.aT()) {
                        String queryParameter14 = data.getQueryParameter(aw.PARAM_QUICK_LIVE_URL);
                        if (!StringUtils.isEmpty(queryParameter14) && (b2 = ak.b(queryParameter14)) != null) {
                            this.J.put(aw.PARAM_QUICK_LIVE_URL, b2);
                        }
                    }
                    JSONObject b3 = b(data);
                    if (b3 != null) {
                        b3.put(aw.PARAM_SHARER_ID, (Object) queryParameter12);
                    }
                    str3 = data.getQueryParameter(aw.PARAM_VRPASS);
                    str4 = data.getQueryParameter("utLogMap");
                    str6 = data.getQueryParameter(aw.PARAMS_LIVE_TRACKINFO);
                    poz.l(data.getBooleanQueryParameter(aw.PARAM_IS_PERFORMANCE, false), this.S);
                    poz.X(data.getQueryParameter(aw.PARAM_SERVER_PARAMS), this.S);
                    str7 = queryParameter11;
                    this.J.put(aw.PARAM_TRACK_LIVEOPRT_ID, data.getQueryParameter(aw.PARAM_TRACK_LIVEOPRT_ID));
                    this.J.put(aw.PARAM_SHAQRE_ITEM_ID, data.getQueryParameter(aw.PARAM_SHAQRE_ITEM_ID));
                    this.J.put(aw.PARAM_ACTIVITY_URL, data.getQueryParameter(aw.PARAM_ACTIVITY_URL));
                    this.J.put("renderType", data.getQueryParameter("renderType"));
                    this.J.put(aw.PARAM_ACTIVITY_POSITION, data.getQueryParameter(aw.PARAM_ACTIVITY_POSITION));
                    this.J.put(aw.PARAM_SHOULD_OPEN_ONCE, data.getQueryParameter(aw.PARAM_SHOULD_OPEN_ONCE));
                    this.J.put("enterAnimation", data.getQueryParameter("enterAnimation"));
                    this.J.put("exitAnimation", data.getQueryParameter("exitAnimation"));
                    this.J.put("modal", data.getQueryParameter("modal"));
                    this.J.put(aw.PARAM_MINILIVE_ENABLE_SHOW, data.getQueryParameter(aw.PARAM_MINILIVE_ENABLE_SHOW));
                    this.J.put("landScapeVideo", data.getQueryParameter("landScapeVideo"));
                    this.J.put(aw.PARAM_USER_TASK_JSON, data.getQueryParameter(aw.PARAM_USER_TASK_JSON));
                    this.J.put(aw.PARAM_FLOW_SOURCE, data.getQueryParameter(aw.PARAM_FLOW_SOURCE));
                    this.J.put(j.PARAM_LIVEHOME_SPM, data.getQueryParameter(j.PARAM_LIVEHOME_SPM));
                    this.y = data.getQueryParameter("timePointPlayUrl");
                    this.K = data.getQueryParameter(aw.PARAM_RECOMMEND_SOURCE);
                    if (!StringUtils.isEmpty(this.K)) {
                        this.J.put(aw.PARAM_RECOMMEND_SOURCE, this.K);
                    }
                    this.J.put(aw.PARAM_COVER_GAUSS_SAMPLING, data.getQueryParameter(aw.PARAM_COVER_GAUSS_SAMPLING));
                    this.J.put(aw.PARAM_COVER_GAUSS_RADIUS, data.getQueryParameter(aw.PARAM_COVER_GAUSS_RADIUS));
                    if (aa.aO()) {
                        this.J.put(aw.PARAM_NEED_RECOMMEND, data.getQueryParameter(aw.PARAM_NEED_RECOMMEND));
                    }
                    try {
                        extras = intent.getExtras();
                        if (StringUtils.isEmpty(this.y) && extras != null) {
                            this.y = extras.getString("timePointPlayUrl");
                        }
                        queryParameter = data.getQueryParameter(aw.PARAM_CUSTOM_PLAY_CTRL);
                        try {
                            if (StringUtils.isEmpty(queryParameter) && extras != null) {
                                queryParameter = extras.getString("mediaInfo");
                            }
                            if (StringUtils.isEmpty(queryParameter) && extras != null) {
                                queryParameter = extras.getString(aw.PARAM_CUSTOM_PLAY_CTRL);
                            }
                            try {
                                a(data, this.J);
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                        }
                    } catch (Exception unused3) {
                        str8 = null;
                    }
                    if (extras != null) {
                        str10 = queryParameter;
                        try {
                            this.J.put("coverImage", extras.getString("coverImage"));
                            a(extras);
                            this.J.put("bubbleGoodInfoJson", extras.getString("bubbleGoodInfoJson"));
                            HashMap hashMap2 = (HashMap) extras.getSerializable("goodInfoWeitao");
                            if (hashMap2 != null) {
                                this.J.put("goodInfoWeitao", JSONObject.toJSONString(hashMap2));
                            }
                        } catch (Exception unused4) {
                        }
                        str8 = str10;
                        c(data);
                        str9 = str8;
                        jSONObject2 = b3;
                    }
                    str10 = queryParameter;
                    str8 = str10;
                    c(data);
                    str9 = str8;
                    jSONObject2 = b3;
                }
                this.J.put(aw.PARAM_ITEM_IDS, data.getQueryParameter(aw.PARAM_ITEM_IDS));
                this.J.put(aw.PARAM_ITEM_HOLD_TYPE, data.getQueryParameter(aw.PARAM_ITEM_HOLD_TYPE));
                this.J.put("traceId", data.getQueryParameter("traceId"));
                this.J.put(aw.PARAM_FANDOM_INTERACTTYPE, data.getQueryParameter(aw.PARAM_FANDOM_INTERACTTYPE));
                this.J.put("timeMovingStatus", data.getQueryParameter("timeMovingStatus"));
                this.J.put(aw.PARAM_OPEN_REWARD_PANEL, data.getQueryParameter(aw.PARAM_OPEN_REWARD_PANEL));
                this.J.put(aw.PARAM_OPEN_REWARD_IS_FROM_NOTICE, data.getQueryParameter(aw.PARAM_OPEN_REWARD_IS_FROM_NOTICE));
                this.J.put(aw.PARAM_OPEN_REWARD_GIFT_ID, data.getQueryParameter(aw.PARAM_OPEN_REWARD_GIFT_ID));
                this.J.put(aw.PARAM_OPEN_REWARD_SOURCE_LIVE_ID, data.getQueryParameter(aw.PARAM_OPEN_REWARD_SOURCE_LIVE_ID));
                this.J.put(aw.PARAM_OPEN_REWARD_SENDER_USER_NICK, data.getQueryParameter(aw.PARAM_OPEN_REWARD_SENDER_USER_NICK));
                this.S.k = v.a(data.getQueryParameter(aw.PARAM_KEEP_MUTE), false);
                this.J.put(aw.PARAM_LIVE_IS_AD, data.getQueryParameter(aw.PARAM_LIVE_IS_AD));
                str = str9;
                jSONObject = jSONObject2;
                str2 = str7;
            } else {
                str = null;
                str2 = null;
                jSONObject = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
            }
            this.J.put("spm", this.g);
            this.J.put("content", this.h);
            this.J.put("scm", this.i);
            this.J.put("trackInfo", this.j);
            this.J.put("clickid", this.k);
            this.J.put("timePointPlayUrl", this.y);
            this.J.put(aw.PARAM_CUSTOM_PLAY_CTRL, str);
            this.J.put(aw.PARAM_HIDE_DYNAMIC, str2);
            this.J.put(aw.PARAM_HIDE_H5_DYNAMIC, str5);
            this.J.put(aw.PARAM_VRPASS, str3);
            this.J.put("utLogMap", str4);
            this.J.put(aw.PARAMS_LIVE_TRACKINFO, str6);
            if (jSONObject != null) {
                this.J.put(aw.PARAM_LIVE_DETAIL_EXT_JSON, jSONObject.toJSONString());
            }
        }
        ae.b("taolive_timemove_back", (String) null);
        pbt.a().g.a("liveRoom", pdt.entryQuery, this.J);
        pbt.a().g.a("liveRoom", "query", this.J);
    }

    private void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
            return;
        }
        String string = bundle.getString("adTransParams");
        if (!StringUtils.isEmpty(string)) {
            JSONObject parseObject = JSON.parseObject(string);
            if (parseObject == null || !parseObject.containsKey("action_list") || !parseObject.containsKey("pay_url")) {
                return;
            }
            String string2 = parseObject.getString("action_list");
            String string3 = parseObject.getString("pay_url");
            String string4 = parseObject.getString("adLiveId");
            if (StringUtils.isEmpty(string2) || StringUtils.isEmpty(string3)) {
                return;
            }
            List parseArray = JSONArray.parseArray(string2, String.class);
            LiveDetailMessinfoResponseData.AlimamaInfo2 alimamaInfo2 = new LiveDetailMessinfoResponseData.AlimamaInfo2();
            if (alimamaInfo2.action_list == null) {
                alimamaInfo2.action_list = new ArrayList<>();
            } else {
                alimamaInfo2.action_list.clear();
            }
            alimamaInfo2.action_list.addAll(parseArray);
            alimamaInfo2.pay_url = string3;
            alimamaInfo2.adLiveId = string4;
            poz.a(alimamaInfo2, this.S);
            return;
        }
        poz.a((LiveDetailMessinfoResponseData.AlimamaInfo2) null, this.S);
    }

    private JSONObject b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6f95739e", new Object[]{this, uri});
        }
        String queryParameter = uri.getQueryParameter("anchorGuard");
        String queryParameter2 = uri.getQueryParameter("timestamp");
        String queryParameter3 = uri.getQueryParameter(SimpleProfile.KEY_SIGNATURE);
        JSONObject jSONObject = new JSONObject();
        if (!StringUtils.isEmpty(queryParameter)) {
            jSONObject.put("anchorGuard", (Object) queryParameter);
        }
        if (!StringUtils.isEmpty(queryParameter2)) {
            jSONObject.put("timestamp", (Object) queryParameter2);
        }
        if (!StringUtils.isEmpty(queryParameter3)) {
            jSONObject.put(SimpleProfile.KEY_SIGNATURE, (Object) queryParameter3);
        }
        return jSONObject;
    }

    private void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{this, context});
            return;
        }
        Intent intent = new Intent("com.taobao.live.room.init");
        this.am = hashCode();
        intent.putExtra("seqId", this.am);
        LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcastSync(intent);
    }

    private long J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4284fc5", new Object[]{this})).longValue() : (System.currentTimeMillis() - this.L) / 1000;
    }

    private void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[]{this});
            return;
        }
        e eVar = this.af;
        if (eVar != null) {
            eVar.a();
        } else {
            H();
        }
    }

    private void a(TBLiveRecEngineV2.RecModel recModel, boolean z) {
        boolean z2;
        String str;
        String str2;
        String str3;
        String str4;
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73a201e0", new Object[]{this, recModel, new Boolean(z)});
        } else if (recModel == null) {
        } else {
            com.taobao.taolive.movehighlight.utils.f.a().a(System.currentTimeMillis());
            com.taobao.taolive.movehighlight.utils.f.a().a(com.taobao.taolive.movehighlight.utils.f.b);
            if (recModel.alimama != null) {
                poz.a(recModel.alimama, this.S);
                if (recModel.alimama != null) {
                    phm.a(recModel.alimama.ifsUrl, recModel.alimama.pid, "liveUpAndDown");
                }
            } else {
                poz.a((LiveDetailMessinfoResponseData.AlimamaInfo) null, this.S);
            }
            if (recModel.adTransParams != null) {
                poz.a(recModel.adTransParams, this.S);
            } else {
                poz.a((LiveDetailMessinfoResponseData.AlimamaInfo2) null, this.S);
            }
            ai.a(this.S, ag.CLICK_SWITCHROOM, this.g);
            if (!StringUtils.isEmpty(recModel.actionUrl)) {
                String str5 = "a2141.8001249";
                if (aa.aI()) {
                    if (!recModel.actionUrl.contains("spm=")) {
                        if (j.f() && recModel.initParams != null) {
                            String str6 = recModel.initParams.get(j.PARAM_LIVEHOME_SPM);
                            if (StringUtils.isEmpty(str6) && (map = this.J) != null) {
                                str6 = map.get(j.PARAM_LIVEHOME_SPM);
                            }
                            if (recModel.actionUrl.contains("?")) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(recModel.actionUrl);
                                if (StringUtils.isEmpty(str6)) {
                                    str3 = "";
                                } else {
                                    str3 = "&spm=" + str6;
                                }
                                sb.append(str3);
                                if (StringUtils.isEmpty(str6)) {
                                    str4 = "";
                                } else {
                                    str4 = "&livehomeSpm=" + str6;
                                }
                                sb.append(str4);
                                recModel.actionUrl = sb.toString();
                            } else {
                                recModel.actionUrl += "?spm=a2141.8001249";
                            }
                            if (recModel.actionUrl.contains("?")) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(recModel.actionUrl);
                                sb2.append("&spm=");
                                if (!StringUtils.isEmpty(str6)) {
                                    str5 = str6;
                                }
                                sb2.append(str5);
                                recModel.actionUrl = sb2.toString();
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(recModel.actionUrl);
                                sb3.append("?spm=");
                                if (!StringUtils.isEmpty(str6)) {
                                    str5 = str6;
                                }
                                sb3.append(str5);
                                recModel.actionUrl = sb3.toString();
                            }
                            recModel.initParams.put("spm", str6);
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(recModel.actionUrl);
                            if (StringUtils.isEmpty(str6)) {
                                str2 = "";
                            } else {
                                str2 = "&livehomeSpm=" + str6;
                            }
                            sb4.append(str2);
                            recModel.actionUrl = sb4.toString();
                            recModel.initParams.put(j.PARAM_LIVEHOME_SPM, str6);
                            Map<String, String> map2 = this.J;
                            if (map2 != null && !StringUtils.isEmpty(map2.get(j.PARAM_LIVEHOMEMIX))) {
                                recModel.initParams.put(j.PARAM_LIVEHOMEMIX, this.J.get(j.PARAM_LIVEHOMEMIX));
                            }
                        } else {
                            if (!StringUtils.isEmpty(this.S.n)) {
                                str5 = this.S.n;
                            }
                            if (recModel.actionUrl.contains("?")) {
                                recModel.actionUrl += "&spm=" + str5;
                            } else {
                                recModel.actionUrl += "?spm=" + str5;
                            }
                            if (recModel.initParams != null) {
                                recModel.initParams.put("spm", str5);
                            }
                        }
                    }
                    if (!recModel.actionUrl.contains("trackInfo=")) {
                        if (recModel.actionUrl.contains("?")) {
                            recModel.actionUrl += "&trackInfo=" + recModel.trackInfo;
                        } else {
                            recModel.actionUrl += "?trackInfo=" + recModel.trackInfo;
                        }
                    }
                } else if (!recModel.actionUrl.contains("spm=")) {
                    if (recModel.actionUrl.contains("?")) {
                        recModel.actionUrl += "&spm=a2141.8001249&trackInfo=" + recModel.trackInfo;
                    } else {
                        recModel.actionUrl += "?spm=a2141.8001249&trackInfo=" + recModel.trackInfo;
                    }
                    if (recModel.initParams != null) {
                        recModel.initParams.put("spm", str5);
                    }
                }
                Map<String, String> map3 = this.J;
                if (map3 != null && !v.a(map3.get(aw.PARAM_MINILIVE_ENABLE_SHOW), true)) {
                    if (recModel.actionUrl.contains("?")) {
                        recModel.actionUrl += "&enableminilive=false";
                    } else {
                        recModel.actionUrl += "?enableminilive=false";
                    }
                }
            }
            if (!StringUtils.isEmpty(recModel.actionUrl)) {
                if (j.c() && !recModel.actionUrl.contains(j.PARAM_LIVEHOMEMIX)) {
                    if (recModel.actionUrl.contains("?")) {
                        recModel.actionUrl += "&" + j.PARAM_LIVEHOMEMIX + "=true";
                    } else {
                        recModel.actionUrl += "?" + j.PARAM_LIVEHOMEMIX + "=true";
                    }
                }
                Uri parse = Uri.parse(recModel.actionUrl);
                if (parse != null) {
                    str = parse.getQueryParameter("trackInfo");
                    poz.d(com.taobao.taolive.sdk.controller.k.a(str, parse), this.S);
                    try {
                        if (aa.bq() && recModel.isFirst) {
                            this.H.getIntent().setData(this.Q);
                        } else {
                            this.H.getIntent().setData(parse);
                        }
                        if (aa.aP()) {
                            this.H.getIntent().putExtra("mediaInfo", "");
                        }
                    } catch (Exception unused) {
                    }
                } else {
                    str = "";
                }
                ai.a(this.S, str);
                ai.a(this.S, "switch", "newFeedId=" + a(parse), "isUp=" + (z ? 1 : 0));
            }
            D();
            if (recModel.alimama != null) {
                poz.a(recModel.alimama, this.S);
            }
            if (recModel.adTransParams != null) {
                poz.a(recModel.adTransParams, this.S);
            }
            f fVar = this.ai;
            if (fVar != null) {
                if (z) {
                    fVar.a(recModel.initParams);
                } else {
                    fVar.b(recModel.initParams);
                }
            }
            if (z) {
                poz.a(poz.s(this.S) - 1, this.S);
                poz.a(1, (com.taobao.taolive.sdk.core.g) this.S);
                z2 = false;
            } else {
                poz.a(poz.s(this.S) + 1, this.S);
                z2 = false;
                poz.a(0, (com.taobao.taolive.sdk.core.g) this.S);
            }
            if (this.aj != null && this.ab != null) {
                ai.a(this.S, this.H, "Page_TaobaoLiveWatch");
                ai.a(this.S, (Object) this.H);
                ai.c(this.S, this.H);
                ai.a(this.S, this.H, "Page_TaobaoLiveWatch");
            } else {
                ai.a(this.S, (Object) this.H);
                if (aa.bQ()) {
                    HashMap hashMap = new HashMap();
                    if (recModel != null && (recModel.recommendCardInfo != null || (recModel.reserveItemCardInfo != null && recModel.reserveItemCardInfo.cardInfo != null))) {
                        hashMap.put(fjp.BIZ_CONTEXT_KEY_CARD_TYPE, "recommendGoodsCard");
                    } else {
                        hashMap.put(fjp.BIZ_CONTEXT_KEY_CARD_TYPE, "");
                    }
                    com.taobao.taolive.sdk.core.a.a(com.taobao.taolive.room.utils.n.a(), ai.d(this.S, this.H), hashMap);
                }
                if ((this.S.f() instanceof ATaoLiveOpenEntity) && ((ATaoLiveOpenEntity) this.S.f()).bizCode != null && ((ATaoLiveOpenEntity) this.S.f()).bizCode.equals(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString())) {
                    z2 = true;
                }
                if (z2) {
                    ai.c(this.S, this.H);
                } else {
                    ai.b(this.S, this.H);
                }
                ai.a(this.S, this.H, "Page_TaobaoLiveWatch");
            }
            t tVar = this.ap;
            if (tVar != null) {
                tVar.b();
                this.ap.a(false, recModel.actionUrl, recModel.initParams != null ? recModel.initParams.get("livesource") : null, recModel.liveId, recModel.anchorId);
            }
            if (pmd.a().m() == null || !aa.ag()) {
                return;
            }
            pmd.a().m().a("handleUpDownSwitch", "isUp" + z + LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID + recModel.liveId + hashCode());
        }
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, this.c);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        pbt.a().a(LpmEventType.SYSTEM, str, jSONObject, "liveRoom", "");
    }

    @Override // com.taobao.taolive.sdk.controller.b
    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        super.reset();
        j(true);
    }

    @Override // com.taobao.taolive.sdk.controller.b
    public void updateScrollEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5738a2", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.taolive.sdk.utils.m.a("BaseListController", "updateScrollEnabled " + z);
        n(z);
        if (!z && this.f21604a) {
            return;
        }
        this.mScrollEnabled = z;
        if (this.mLayoutManager == null) {
            return;
        }
        if (this.mItemHeight != 0 && this.totalDy % this.mItemHeight != 0) {
            return;
        }
        this.mLayoutManager.a(z);
        com.taobao.taolive.sdk.utils.m.a("BaseListController", "real updateScrollEnabled " + z);
    }

    private void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d7103", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.taolive.sdk.utils.m.a("BaseListController", "setScrollEnableByDesign " + z);
        this.S.h = z;
        this.mLayoutManager.a(z);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        com.taobao.android.live.plugin.proxy.e.a().a(com.taobao.android.live.plugin.proxy.e.ATYPE, false, context);
        com.taobao.android.live.plugin.proxy.e.a().a(com.taobao.android.live.plugin.proxy.e.BTYPE, false, context);
        com.taobao.android.live.plugin.proxy.f.m().setActionAdapter(new com.taobao.taolive.room.ui.goods.adapter.d());
        com.taobao.android.live.plugin.proxy.f.m().setNavAdapter(new com.taobao.taolive.room.ui.goods.adapter.e());
        com.taobao.android.live.plugin.proxy.f.m().setTrackAdapter(new com.taobao.taolive.room.ui.goods.adapter.f());
        com.taobao.android.live.plugin.proxy.f.m().setH5TabFrameAdapter(new com.taobao.taolive.room.ui.goods.adapter.c());
        com.taobao.android.live.plugin.proxy.f.m().setGoodFrameAdapter(new com.taobao.taolive.room.ui.goods.adapter.b());
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae72241", new Object[]{this, new Boolean(z)});
        } else {
            this.ao = z;
        }
    }

    private boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48af45c", new Object[]{this})).booleanValue();
        }
        if (!R() || com.taobao.taolive.sdk.playcontrol.c.i(com.taobao.taolive.room.utils.n.a()) == VideoStatus.VIDEO_TIMESHIFT_STATUS || !this.ao || !aa.cr() || !ae.b("KEY_WINDOW_ZOOM_SWITCH", true)) {
            return false;
        }
        return ae.b("KEY_ENABLE_SHOW_AUTO", true);
    }

    private boolean R() {
        VideoInfo u;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4990bdd", new Object[]{this})).booleanValue();
        }
        com.taobao.taolive.sdk.controller.e eVar = this.S;
        return ((eVar != null && !eVar.z()) || !v.a(this.J.get(aw.PARAM_MINILIVE_ENABLE_SHOW), true) || (u = poy.u(com.taobao.taolive.room.utils.n.a())) == null || u.status == -1 || u.status == 3 || u.status == 4 || u.closeXiaochuang) ? false : true;
    }

    private void a(final boolean z, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
            return;
        }
        ddw.a().a(xkw.EVENT_MEDIAPLATFORM_DISABLE_SMALLWINDOW, null, observeUniqueIdentification());
        com.taobao.taolive.sdk.utils.m.a("TBLiveService", "showGlobalMiniWindow");
        if (Build.VERSION.SDK_INT >= 24) {
            if (Settings.canDrawOverlays(this.H)) {
                d(str);
                return;
            } else if ("ZoomBtn".equals(str)) {
                com.taobao.taolive.sdk.utils.m.a("TBLiveService", "showGlobalMiniWindow checkFloatWindowPermisson");
                com.taobao.taolive.sdk.permisson.a.b(this.H, new a.InterfaceC0910a() { // from class: com.taobao.taolive.room.controller2.q.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        q.this = this;
                    }

                    @Override // com.taobao.taolive.sdk.permisson.a.InterfaceC0910a
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            q.b(q.this, str);
                        }
                    }

                    @Override // com.taobao.taolive.sdk.permisson.a.InterfaceC0910a
                    public void b() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                        } else if (!z) {
                        } else {
                            q.n(q.this);
                        }
                    }
                });
                return;
            } else {
                com.taobao.taolive.sdk.utils.m.a("TBLiveService", "showGlobalMiniWindow checkFloatWindowPermisson");
                com.taobao.taolive.sdk.permisson.a.a(this.H, new a.InterfaceC0910a() { // from class: com.taobao.taolive.room.controller2.q.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        q.this = this;
                    }

                    @Override // com.taobao.taolive.sdk.permisson.a.InterfaceC0910a
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            q.b(q.this, str);
                        }
                    }

                    @Override // com.taobao.taolive.sdk.permisson.a.InterfaceC0910a
                    public void b() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                        } else if (!z) {
                        } else {
                            q.n(q.this);
                        }
                    }
                });
                return;
            }
        }
        d(str);
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        com.taobao.taolive.sdk.utils.m.a("TBLiveService", "startZoomWindow triggerMode = " + str);
        HashMap hashMap = new HashMap();
        com.taobao.taolive.sdk.ui.media.d c = com.taobao.taolive.sdk.playcontrol.c.c(this.P);
        if (c != null && c.d() != null && !StringUtils.isEmpty(c.e())) {
            hashMap.put(aw.PARAM_PLAY_URL, c.e());
            hashMap.put(CommandID.seekTo, String.valueOf(c.m()));
            hashMap.put("loop", c.p() ? "true" : "false");
        }
        if (c != null) {
            hashMap.put(aw.PARAM_IS_LIVE_MUTE, String.valueOf(c.x()));
        }
        hashMap.put("triggerMode", str);
        hashMap.put(pqq.KEY_LIVE_SOURCE, poy.ac(com.taobao.taolive.room.utils.n.a()));
        hashMap.put("entryLiveSource", poy.R(com.taobao.taolive.room.utils.n.a()));
        hashMap.put("spm", poy.K(com.taobao.taolive.room.utils.n.a()));
        hashMap.put("trackInfo", poy.L(com.taobao.taolive.room.utils.n.a()));
        com.taobao.alilive.aliliveframework.frame.a a2 = com.taobao.taolive.room.utils.n.a();
        pmc.a().b().a(this.H, poy.u(com.taobao.taolive.room.utils.n.a()), "zoom", hashMap, a2 instanceof com.taobao.taolive.sdk.core.e ? ((com.taobao.taolive.sdk.core.e) a2).J() : null);
        K();
    }

    private void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        ab.c("TaoLiveRealController", str + " id = " + hashCode());
    }

    private void c(Uri uri) {
        boolean e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beadfb1d", new Object[]{this, uri});
            return;
        }
        String queryParameter = uri.getQueryParameter(aw.PARAM_IS_LIVE_MUTE);
        e("initMute preMute = " + queryParameter);
        if (!sst.a()) {
            e("initMute isIndependentMuteABOpen false");
            if (StringUtils.isEmpty(queryParameter)) {
                return;
            }
            com.taobao.taolive.sdk.ui.media.mute.b.a(this.H, v.a(queryParameter, false));
            return;
        }
        e("initMute isIndependentMuteABOpen true");
        if (StringUtils.isEmpty(queryParameter)) {
            e = sst.d();
        } else {
            e = v.e(queryParameter);
        }
        e("initMute result liveRoomMute = " + e);
        com.taobao.taolive.sdk.controller.e eVar = this.S;
        if (eVar == null) {
            return;
        }
        eVar.a(e, true);
    }

    private void a(TaoliveOpenLiveRoom taoliveOpenLiveRoom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5cbf4", new Object[]{this, taoliveOpenLiveRoom});
            return;
        }
        com.taobao.taolive.sdk.controller.e eVar = this.S;
        if (eVar != null) {
            eVar.a(taoliveOpenLiveRoom);
        }
        if (taoliveOpenLiveRoom == null || taoliveOpenLiveRoom.abilityCompontent == null) {
            return;
        }
        poz.o(taoliveOpenLiveRoom.abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Container_HideCloseICON), this.S);
    }

    private void a(Activity activity, String str, String str2) {
        Bundle extras;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e36e85ce", new Object[]{this, activity, str, str2});
            return;
        }
        if (!aa.cE()) {
            if (activity != null && activity.getIntent() != null) {
                poz.f(activity.getIntent().getDataString(), this.S);
            }
        } else if (activity != null && activity.getIntent() != null) {
            poz.f(this.Q.toString(), this.S);
        }
        poz.J(str2, this.S);
        poz.a(this.J, this.S);
        poz.L(this.f, this.S);
        poz.P(this.J.get(aw.PARAM_USE_CDN), this.S);
        String str3 = null;
        poz.T(null, this.S);
        poz.a((com.taobao.taolive.sdk.core.g) this.S, true);
        poz.t(true, (com.taobao.taolive.sdk.core.g) this.S);
        poz.T(null, this.S);
        poz.q(str, this.S);
        poz.Z(this.J.get(aw.PARAM_LIVE_IS_AD), this.S);
        String c = poz.c(this.S);
        if (!StringUtils.isEmpty(c)) {
            Uri uri = this.Q;
            if (uri == null) {
                uri = Uri.parse(c);
            }
            poz.B(uri.getQueryParameter(aw.PARAM_PVID), this.S);
            poz.C(uri.getQueryParameter("feedId"), this.S);
            poz.D(uri.getQueryParameter("contentId"), this.S);
            poz.E(uri.getQueryParameter("accountId"), this.S);
            poz.F(uri.getQueryParameter(aw.PARAM_LIVESCM), this.S);
            if (aa.bX()) {
                String queryParameter = uri.getQueryParameter(aw.PARAM_UT_PARAMS);
                if (activity != null && activity.getIntent() != null && (extras = activity.getIntent().getExtras()) != null) {
                    str3 = extras.getString(aw.PARAM_UT_PARAMS);
                }
                if (!StringUtils.isEmpty(str3)) {
                    queryParameter = str3;
                }
                poz.A(Uri.encode(queryParameter), this.S);
            } else {
                poz.A(Uri.encode(uri.getQueryParameter(aw.PARAM_UT_PARAMS)), this.S);
            }
            poz.g(uri.getQueryParameter("liveBucket"), this.S);
            poz.h(uri.getQueryParameter("liveAbid"), this.S);
            poz.j(uri.getQueryParameter("scmPre"), this.S);
            poz.k(uri.getQueryParameter("spmPre"), this.S);
            poz.o(Uri.encode(uri.getQueryParameter("utparamPre")), this.S);
            poz.p(uri.getQueryParameter("livesourcePre"), this.S);
            poz.N(uri.getQueryParameter("singleLiveTabSessionId"), this.S);
            if (StringUtils.isEmpty(poz.r(this.S))) {
                poz.N(UTDevice.getUtdid(activity) + "_" + System.currentTimeMillis(), this.S);
            }
        }
        poz.r(this.J.get("queryKey"), this.S);
        poz.s(this.J.get("spm"), this.S);
        poz.u(this.J.get("scm"), this.S);
        if (this.J.get("traceId") != null) {
            poz.v(this.J.get("traceId"), this.S);
        } else {
            poz.v(this.J.get(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_TRACE_ID), this.S);
        }
        poz.a(0L, (com.taobao.taolive.sdk.core.g) this.S);
        poz.a(T(), (com.taobao.taolive.sdk.core.g) this.S);
        this.S.r = true;
    }

    private int T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b53ace", new Object[]{this})).intValue();
        }
        com.taobao.taolive.sdk.controller.e eVar = this.S;
        return (eVar == null || !eVar.F() || poz.J(this.S) == 2) ? 1 : 2;
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        poz.K(null, this.S);
        poz.b(false, (com.taobao.taolive.sdk.core.g) this.S);
        poz.a((JSONArray) null, this.S);
        poz.a((JSONArray) null, this.S);
        poz.q(false, (com.taobao.taolive.sdk.core.g) this.S);
        poz.p(false, (com.taobao.taolive.sdk.core.g) this.S);
        poz.o(false, (com.taobao.taolive.sdk.core.g) this.S);
        poz.d(false, (com.taobao.taolive.sdk.core.g) this.S);
        poz.f(false, (com.taobao.taolive.sdk.core.g) this.S);
        poz.g(false, (com.taobao.taolive.sdk.core.g) this.S);
        poz.e(false, (com.taobao.taolive.sdk.core.g) this.S);
        poz.O(null, this.S);
        poz.i(false, (com.taobao.taolive.sdk.core.g) this.S);
        poz.b(0L, (com.taobao.taolive.sdk.core.g) this.S);
        poz.b(0L, (com.taobao.taolive.sdk.core.g) this.S);
        if (com.taobao.taolive.room.utils.n.a() != null) {
            poz.a(false, (com.taobao.taolive.sdk.core.g) this.S);
            poz.m((String) null, this.S);
            poz.n((String) null, this.S);
            poz.l((String) null, this.S);
        }
        poz.h(true, (com.taobao.taolive.sdk.core.g) this.S);
        poz.r(true, (com.taobao.taolive.sdk.core.g) this.S);
        poz.s(false, (com.taobao.taolive.sdk.core.g) this.S);
        poz.t((String) null, this.S);
    }

    private String L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6fe962d", new Object[]{this});
        }
        String valueOf = !StringUtils.isEmpty(this.c) ? String.valueOf(this.c.hashCode()) : "";
        Random random = new Random();
        return valueOf + "_" + System.currentTimeMillis() + random.nextInt(1000);
    }

    private void b(TaoliveOpenLiveRoom taoliveOpenLiveRoom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b66c513", new Object[]{this, taoliveOpenLiveRoom});
        } else if (taoliveOpenLiveRoom == null || taoliveOpenLiveRoom.taoliveOpenContext == null || taoliveOpenLiveRoom.taoliveOpenContext.f == null) {
        } else {
            this.S.i = taoliveOpenLiveRoom.taoliveOpenContext.f.get("utPage");
            this.ae = v.a(taoliveOpenLiveRoom.taoliveOpenContext.f.get("OpenWatchType"));
            Object obj = taoliveOpenLiveRoom.taoliveOpenContext.f.get("enableReplayStatusShowLiveEnd");
            if (obj instanceof Boolean) {
                this.S.D = ((Boolean) obj).booleanValue();
            }
            if (StringUtils.isEmpty(this.ae)) {
                return;
            }
            this.S.D = true;
        }
    }

    @Override // com.taobao.taolive.sdk.controller.b
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
        } else if (!this.S.M()) {
        } else {
            this.w.a(xkw.d, "beginScroll", observeUniqueIdentification());
        }
    }
}
