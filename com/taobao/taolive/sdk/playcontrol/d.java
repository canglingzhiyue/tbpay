package com.taobao.taolive.sdk.playcontrol;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.controller2.g;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.core.e;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import com.taobao.taolive.sdk.core.j;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.taolive.sdk.ui.media.f;
import com.taobao.taolive.sdk.ui.media.h;
import com.taobao.taolive.sdk.ui.media.r;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.taobao.taolive.sdk.utils.ad;
import com.taobao.taolive.sdk.utils.m;
import com.taobao.taolive.sdk.utils.o;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.t;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.ddt;
import tb.ipz;
import tb.kge;
import tb.pmb;
import tb.pmc;
import tb.pmd;
import tb.pnj;
import tb.pnk;
import tb.poy;
import tb.ppp;
import tb.ppr;
import tb.ppt;
import tb.pqg;
import tb.pqq;
import tb.sst;

/* loaded from: classes8.dex */
public class d implements d.a, com.taobao.taolive.sdk.playcontrol.a, ddt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ON_LIVE_CARD_START_ACTION = "com.taobao.taolive.card.start";
    public static final String ON_LIVE_START_ACTION = "com.taobao.taolive.start";
    public static final String ON_VIDEO_MUTE_CHANGE_ACTION = "com.taobao.avplayer.muteStateChanged";
    public static final String ON_VIDEO_START_ACTION = "com.taobao.avplayer.start";

    /* renamed from: a  reason: collision with root package name */
    private static final String f21883a;
    public boolean A;
    private com.taobao.alilive.aliliveframework.frame.a b;
    private com.taobao.taolive.sdk.ui.media.d c;
    private ViewGroup d;
    private TelephonyManager i;
    private String n;
    private a o;
    private PhoneStateListener p;
    private boolean r;
    private ISmallWindowStrategy t;
    private String v;
    private boolean z;
    private boolean e = false;
    private CopyOnWriteArrayList<ppr> f = new CopyOnWriteArrayList<>();
    private boolean g = false;
    private boolean h = false;
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;
    private float B = -1.0f;
    private ppp.a q = new ppp.a() { // from class: com.taobao.taolive.sdk.playcontrol.d.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.ppp.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            if (d.a(d.this) != null) {
                d.a(d.this).a();
            }
            if (d.b(d.this)) {
                d.a(d.this, 8);
            }
            d.a(d.this, true);
        }

        @Override // tb.ppp.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            if (d.a(d.this) != null) {
                d.a(d.this);
            }
            if (t.a() && t.b() && pmc.a().b() != null && pmc.a().b().a() != null) {
                pmc.a().b().a().setVisibility(0);
            }
            d.a(d.this, false);
        }
    };
    private boolean s = false;
    private ppt u = new ppt() { // from class: com.taobao.taolive.sdk.playcontrol.d.8
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.ppt
        public void a_(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1ba025a", new Object[]{this, new Integer(i), obj});
            } else if (i == 1) {
                d.a(d.this, (TBLiveDataModel) obj);
            } else if (i == 3) {
                d.i(d.this);
            } else if (i == 4) {
                d.g(d.this);
            } else if (i != 5) {
            } else {
                d.j(d.this);
            }
        }
    };
    private int w = -2;
    private BroadcastReceiver x = new BroadcastReceiver() { // from class: com.taobao.taolive.sdk.playcontrol.VideoViewController$7
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
            if (r0 == false) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
            if (r0 == false) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d0, code lost:
            com.taobao.taolive.sdk.playcontrol.d.k(r7.f21879a);
         */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onReceive(android.content.Context r8, android.content.Intent r9) {
            /*
                r7 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.taolive.sdk.playcontrol.VideoViewController$7.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                r2 = 2
                r3 = 0
                r4 = 3
                r5 = 1
                if (r1 == 0) goto L18
                java.lang.Object[] r1 = new java.lang.Object[r4]
                r1[r3] = r7
                r1[r5] = r8
                r1[r2] = r9
                java.lang.String r8 = "3c04d85a"
                r0.ipc$dispatch(r8, r1)
                return
            L18:
                java.lang.String r8 = r9.getAction()
                if (r8 == 0) goto Lda
                boolean r0 = android.text.TextUtils.isEmpty(r8)
                if (r0 != 0) goto Lda
                java.lang.String r0 = "isMute"
                boolean r0 = r9.getBooleanExtra(r0, r3)
                r1 = -1
                int r6 = r8.hashCode()
                switch(r6) {
                    case -1350174833: goto L52;
                    case -937845795: goto L48;
                    case -144023305: goto L3e;
                    case 212707137: goto L34;
                    default: goto L33;
                }
            L33:
                goto L5b
            L34:
                java.lang.String r3 = "com.taobao.avplayer.muteStateChanged"
                boolean r8 = r8.equals(r3)
                if (r8 == 0) goto L5b
                r1 = 3
                goto L5b
            L3e:
                java.lang.String r3 = "com.taobao.taolive.card.start"
                boolean r8 = r8.equals(r3)
                if (r8 == 0) goto L5b
                r1 = 2
                goto L5b
            L48:
                java.lang.String r6 = "com.taobao.avplayer.start"
                boolean r8 = r8.equals(r6)
                if (r8 == 0) goto L5b
                r1 = 0
                goto L5b
            L52:
                java.lang.String r3 = "com.taobao.taolive.start"
                boolean r8 = r8.equals(r3)
                if (r8 == 0) goto L5b
                r1 = 1
            L5b:
                java.lang.String r8 = "TimeMovingPlay"
                java.lang.String r3 = "subBussinessType"
                if (r1 == 0) goto La8
                if (r1 == r5) goto Ld5
                if (r1 == r2) goto L92
                if (r1 == r4) goto L69
                goto Ld5
            L69:
                java.lang.String r9 = r9.getStringExtra(r3)
                java.lang.String r1 = com.taobao.taolive.sdk.playcontrol.c.TAG
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "ON_VIDEO_MUTE_CHANGE_ACTION mLiveContextKey = "
                r2.append(r3)
                com.taobao.taolive.sdk.playcontrol.d r3 = com.taobao.taolive.sdk.playcontrol.d.this
                java.lang.String r3 = com.taobao.taolive.sdk.playcontrol.d.l(r3)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.taobao.taolive.sdk.utils.m.a(r1, r2)
                boolean r8 = r8.equals(r9)
                if (r8 != 0) goto Ld5
                if (r0 != 0) goto Ld5
                goto Ld0
            L92:
                java.lang.String r8 = "SubBusinessType"
                java.lang.String r8 = r9.getStringExtra(r8)
                java.lang.String r9 = "ShopSampleCard"
                boolean r8 = r9.equals(r8)
                if (r8 != 0) goto La2
                if (r0 != 0) goto Ld5
            La2:
                com.taobao.taolive.sdk.playcontrol.d r8 = com.taobao.taolive.sdk.playcontrol.d.this
                r8.p()
                goto Ld5
            La8:
                java.lang.String r9 = r9.getStringExtra(r3)
                java.lang.String r1 = com.taobao.taolive.sdk.playcontrol.c.TAG
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "ON_VIDEO_START_ACTION mLiveContextKey = "
                r2.append(r3)
                com.taobao.taolive.sdk.playcontrol.d r3 = com.taobao.taolive.sdk.playcontrol.d.this
                java.lang.String r3 = com.taobao.taolive.sdk.playcontrol.d.l(r3)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.taobao.taolive.sdk.utils.m.a(r1, r2)
                boolean r8 = r8.equals(r9)
                if (r8 != 0) goto Ld5
                if (r0 != 0) goto Ld5
            Ld0:
                com.taobao.taolive.sdk.playcontrol.d r8 = com.taobao.taolive.sdk.playcontrol.d.this
                com.taobao.taolive.sdk.playcontrol.d.k(r8)
            Ld5:
                com.taobao.taolive.sdk.playcontrol.d r8 = com.taobao.taolive.sdk.playcontrol.d.this
                com.taobao.taolive.sdk.playcontrol.d.c(r8, r5)
            Lda:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.sdk.playcontrol.VideoViewController$7.onReceive(android.content.Context, android.content.Intent):void");
        }
    };
    private boolean y = false;

    /* loaded from: classes8.dex */
    public interface a {
        void a();
    }

    public static /* synthetic */ a a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("2b47c051", new Object[]{dVar}) : dVar.o;
    }

    public static /* synthetic */ void a(d dVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50aa0ee1", new Object[]{dVar, new Integer(i)});
        } else {
            dVar.b(i);
        }
    }

    public static /* synthetic */ void a(d dVar, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79cb9b5b", new Object[]{dVar, tBLiveDataModel});
        } else {
            dVar.a(tBLiveDataModel);
        }
    }

    public static /* synthetic */ boolean a(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50aa4eb6", new Object[]{dVar, new Boolean(z)})).booleanValue();
        }
        dVar.g = z;
        return z;
    }

    public static /* synthetic */ boolean b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1125df27", new Object[]{dVar})).booleanValue() : dVar.s;
    }

    public static /* synthetic */ boolean b(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1396b815", new Object[]{dVar, new Boolean(z)})).booleanValue();
        }
        dVar.j = z;
        return z;
    }

    public static /* synthetic */ com.taobao.taolive.sdk.ui.media.d c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.ui.media.d) ipChange.ipc$dispatch("f087086e", new Object[]{dVar}) : dVar.c;
    }

    public static /* synthetic */ boolean c(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6832174", new Object[]{dVar, new Boolean(z)})).booleanValue();
        }
        dVar.y = z;
        return z;
    }

    public static /* synthetic */ boolean d(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dba8bca9", new Object[]{dVar})).booleanValue() : dVar.j;
    }

    public static /* synthetic */ boolean d(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("996f8ad3", new Object[]{dVar, new Boolean(z)})).booleanValue();
        }
        dVar.k = z;
        return z;
    }

    public static /* synthetic */ ISmallWindowStrategy e(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ISmallWindowStrategy) ipChange.ipc$dispatch("40ff49a8", new Object[]{dVar}) : dVar.t;
    }

    public static /* synthetic */ boolean e(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c5bf432", new Object[]{dVar, new Boolean(z)})).booleanValue();
        }
        dVar.m = z;
        return z;
    }

    public static /* synthetic */ void f(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62b9a27", new Object[]{dVar});
        } else {
            dVar.t();
        }
    }

    public static /* synthetic */ void g(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b6d08e8", new Object[]{dVar});
        } else {
            dVar.s();
        }
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a h(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("78a4e4de", new Object[]{dVar}) : dVar.b;
    }

    public static /* synthetic */ void i(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55efe66a", new Object[]{dVar});
        } else {
            dVar.r();
        }
    }

    public static /* synthetic */ void j(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b31552b", new Object[]{dVar});
        } else {
            dVar.q();
        }
    }

    public static /* synthetic */ void k(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2072c3ec", new Object[]{dVar});
        } else {
            dVar.o();
        }
    }

    public static /* synthetic */ CopyOnWriteArrayList m(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArrayList) ipChange.ipc$dispatch("53079b1b", new Object[]{dVar}) : dVar.f;
    }

    @Override // com.taobao.taolive.sdk.playcontrol.a, tb.ddt
    public /* synthetic */ IMediaPlayer a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMediaPlayer) ipChange.ipc$dispatch("d9b93764", new Object[]{this}) : e();
    }

    static {
        kge.a(113139213);
        kge.a(-2101054629);
        kge.a(1646757887);
        kge.a(-1994742814);
        f21883a = d.class.getSimpleName();
    }

    public com.taobao.taolive.sdk.ui.media.d l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.ui.media.d) ipChange.ipc$dispatch("f9225bd", new Object[]{this}) : this.c;
    }

    public void a(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1819755d", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            String str = c.TAG;
            m.a(str, "VideoViewController init mLiveContextKey = " + this.n);
            this.n = aVar.j();
            this.b = aVar;
            this.z = o.n();
            com.taobao.alilive.aliliveframework.frame.a aVar2 = this.b;
            if (aVar2 != null) {
                pqg.a(aVar2.j(), this);
            }
            Application c = pmd.a().u().c();
            if (c == null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.taobao.avplayer.start");
            intentFilter.addAction("com.taobao.taolive.start");
            intentFilter.addAction(ON_LIVE_CARD_START_ACTION);
            intentFilter.addAction("com.taobao.avplayer.muteStateChanged");
            c.registerReceiver(this.x, intentFilter);
            pmd.a().u().a(this.q);
            this.i = (TelephonyManager) c.getSystemService("phone");
            this.p = new PhoneStateListener() { // from class: com.taobao.taolive.sdk.playcontrol.d.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass4 anonymousClass4, String str2, Object... objArr) {
                    if (str2.hashCode() == -1198008378) {
                        super.onCallStateChanged(((Number) objArr[0]).intValue(), (String) objArr[1]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
                }

                @Override // android.telephony.PhoneStateListener
                public void onCallStateChanged(int i, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b897d7c6", new Object[]{this, new Integer(i), str2});
                    } else if (d.c(d.this) == null) {
                    } else {
                        if (i != 0) {
                            if ((i == 1 || i == 2) && d.c(d.this).l()) {
                                d.c(d.this).i();
                                d.b(d.this, true);
                            }
                        } else if (!d.c(d.this).l() && d.d(d.this)) {
                            d.this.v();
                            d.b(d.this, false);
                        }
                        super.onCallStateChanged(i, str2);
                    }
                }
            };
            try {
                this.i.listen(this.p, 32);
            } catch (Exception unused) {
            }
            j.a(this.b, this.u);
            j.a(this.b, this, new MessageTypeFilter() { // from class: com.taobao.taolive.sdk.playcontrol.d.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
                public boolean filter(int i) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 3005;
                }
            });
        }
    }

    @Override // com.taobao.taolive.sdk.playcontrol.a
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        String str = c.TAG;
        m.a(str, "VideoViewController destroy mLiveContextKey = " + this.n);
        com.taobao.alilive.aliliveframework.frame.a aVar = this.b;
        if (aVar == null) {
            return;
        }
        pqg.a(aVar.j());
        poy.a(VideoStatus.VIDEO_NORMAL_STATUS, this.b);
        this.o = null;
        this.t = null;
        try {
            if (this.i != null && this.p != null) {
                this.i.listen(this.p, 0);
                this.i = null;
                this.p = null;
            }
            if (pmc.a().b() != null) {
                pmc.a().b().c();
                pmc.a().b().b();
            }
        } catch (Exception unused) {
        }
        if (ad.a(this.b, OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedSimpleLive)) {
            D();
        } else {
            com.taobao.taolive.sdk.ui.media.d dVar = this.c;
            if (dVar != null) {
                if (!z2) {
                    if (z) {
                        dVar.i();
                    }
                    this.c.o();
                    this.c.c();
                }
                this.c = null;
            }
        }
        this.e = false;
        CopyOnWriteArrayList<ppr> copyOnWriteArrayList = this.f;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
        try {
            pmd.a().u().c().unregisterReceiver(this.x);
        } catch (Exception e) {
            e.printStackTrace();
        }
        j.b(this.b, this.u);
        j.a(this.b, this);
        pmd.a().u().b(this.q);
        this.d = null;
        this.k = false;
        this.l = false;
        this.g = false;
        this.e = false;
        this.s = false;
        this.y = false;
        z();
        this.b = null;
    }

    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.ui.media.d dVar = this.c;
        if (dVar == null) {
            return;
        }
        ((f) dVar).N();
    }

    @Override // com.taobao.taolive.sdk.playcontrol.a
    public com.taobao.taolive.sdk.ui.media.d a(Context context, String str, MediaData mediaData, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taolive.sdk.ui.media.d) ipChange.ipc$dispatch("d120841a", new Object[]{this, context, str, mediaData, str2});
        }
        String str3 = c.TAG;
        m.a(str3, "VideoViewController getPreloadVideoView mLiveContextKey = " + this.n);
        b(context, str, mediaData, str2);
        if (o.a("enableOpenSurfaceViewFirstIndex", true)) {
            com.taobao.alilive.aliliveframework.frame.a aVar = this.b;
            if ((aVar instanceof g) && ((g) aVar).w() != null && ((g) this.b).w().isFirst) {
                HashMap hashMap = new HashMap();
                hashMap.put("hasPreloadVideoData", "false");
                this.c.a((Map<String, String>) hashMap);
                m.a("VideoViewController", "VideoViewController getPreloadVideoView hasPreloadVideoData = false mLiveContextKey = " + this.n);
            }
        }
        this.c.a(true);
        return this.c;
    }

    @Override // com.taobao.taolive.sdk.playcontrol.a
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        String str = c.TAG;
        m.c(str, "VideoViewController isPreloadVideoFirstFrame mLiveContextKey = " + this.n);
        return this.m;
    }

    @Override // com.taobao.taolive.sdk.playcontrol.a
    public com.taobao.taolive.sdk.ui.media.d a(Context context, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taolive.sdk.ui.media.d) ipChange.ipc$dispatch("5719c26d", new Object[]{this, context, str, new Integer(i), str2});
        }
        String str3 = c.TAG;
        m.a(str3, "VideoViewController getVideoView mLiveContextKey = " + this.n);
        return a(context, str, i, str2, null, null);
    }

    private com.taobao.taolive.sdk.ui.media.d a(Context context, String str, int i, String str2, MediaData mediaData, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taolive.sdk.ui.media.d) ipChange.ipc$dispatch("8118db81", new Object[]{this, context, str, new Integer(i), str2, mediaData, str3});
        }
        if (!TextUtils.isEmpty(str)) {
            this.v = str;
        }
        this.w = i;
        if (this.c == null) {
            b(context, str2, mediaData, str3);
        }
        if (sst.a()) {
            String str4 = c.TAG;
            m.a(str4, "startMainVideoView isIndependentMuteABOpen true mLiveContextKey = " + this.n);
            this.c.a(u());
        } else {
            String str5 = c.TAG;
            m.a(str5, "startMainVideoView isIndependentMuteABOpen false mLiveContextKey = " + this.n);
            this.c.a(false);
        }
        return this.c;
    }

    private com.taobao.taolive.sdk.ui.media.d b(Context context, String str, MediaData mediaData, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taolive.sdk.ui.media.d) ipChange.ipc$dispatch("5dd6de5b", new Object[]{this, context, str, mediaData, str2});
        }
        String a2 = r.a(mediaData, str2);
        h hVar = new h();
        hVar.f21934a = str;
        if (ad.a(this.b, OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedSimpleLive) && TextUtils.isEmpty(str) && !TextUtils.isEmpty(a2)) {
            hVar.f21934a = com.taobao.taolive.sdk.ui.media.g.e(a2);
        }
        hVar.b = a2;
        this.c = r.b(hVar);
        this.c.a(context);
        B();
        pnk q = pmd.a().q();
        if (q != null) {
            this.c.e(q.a());
        }
        if (!TextUtils.isEmpty(this.v)) {
            this.c.d(this.v);
        }
        com.taobao.taolive.sdk.ui.media.d dVar = this.c;
        dVar.c("deviceLevel:" + this.w);
        this.c.G().setBackgroundColor(context.getResources().getColor(R.color.tblivesdk_text_color_gray));
        n();
        return this.c;
    }

    @Override // com.taobao.taolive.sdk.playcontrol.a
    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        String str = c.TAG;
        m.c(str, "VideoViewController getVideoPath mLiveContextKey = " + this.n);
        com.taobao.taolive.sdk.ui.media.d dVar = this.c;
        return dVar != null ? dVar.e() : "";
    }

    @Override // com.taobao.taolive.sdk.playcontrol.a
    public com.taobao.taolive.sdk.ui.media.d e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.ui.media.d) ipChange.ipc$dispatch("908b62f6", new Object[]{this}) : this.c;
    }

    @Override // com.taobao.taolive.sdk.playcontrol.a
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            this.r = true;
        }
    }

    @Override // com.taobao.taolive.sdk.playcontrol.a
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            this.r = false;
        }
    }

    @Override // com.taobao.taolive.sdk.playcontrol.a
    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.h;
    }

    @Override // com.taobao.taolive.sdk.playcontrol.a
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c35ed805", new Object[]{this, aVar});
            return;
        }
        String str = c.TAG;
        m.a(str, "VideoViewController setAppLifecyclerListener mLiveContextKey = " + this.n);
        this.o = aVar;
    }

    @Override // tb.ddt
    public VideoStatus b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoStatus) ipChange.ipc$dispatch("200bf3d6", new Object[]{this}) : poy.y(this.b);
    }

    @Override // com.taobao.taolive.sdk.playcontrol.a
    public void a(ISmallWindowStrategy iSmallWindowStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa4d14aa", new Object[]{this, iSmallWindowStrategy});
            return;
        }
        String str = c.TAG;
        m.a(str, "VideoViewController setSmallWindowClickListener mLiveContextKey = " + this.n);
        this.t = iSmallWindowStrategy;
    }

    @Override // com.taobao.taolive.sdk.playcontrol.a
    public boolean a(final Context context, final String str, final int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd0ff3df", new Object[]{this, context, str, new Integer(i), new Boolean(z)})).booleanValue();
        }
        String str2 = c.TAG;
        m.a(str2, "VideoViewController toSmall mLiveContextKey = " + this.n);
        com.taobao.taolive.sdk.ui.media.d dVar = this.c;
        if (dVar != null && dVar.l()) {
            this.e = true;
            this.d = (ViewGroup) this.c.G().getParent();
            ViewGroup viewGroup = this.d;
            if (viewGroup != null) {
                viewGroup.removeView(this.c.G());
            }
            if (pmc.a().b() != null && poy.u(this.b) != null) {
                HashMap hashMap = new HashMap();
                hashMap.put(pqq.KEY_LIVE_SOURCE, poy.ac(this.b));
                hashMap.put("entryLiveSource", poy.R(this.b));
                hashMap.put("spm", poy.K(this.b));
                hashMap.put("trackInfo", poy.L(this.b));
                com.taobao.taolive.sdk.ui.media.d dVar2 = this.c;
                if (dVar2 != null) {
                    hashMap.put(aw.PARAM_IS_LIVE_MUTE, String.valueOf(dVar2.x()));
                }
                ipz ipzVar = null;
                com.taobao.alilive.aliliveframework.frame.a aVar = this.b;
                if (aVar instanceof e) {
                    ipzVar = ((e) aVar).J();
                }
                pmc.a().b().a(context, this.c, poy.u(this.b), z, true, hashMap, ipzVar);
                pmc.a().b().a(new View.OnClickListener() { // from class: com.taobao.taolive.sdk.playcontrol.d.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
                        if (r1 != null) goto L12;
                     */
                    @Override // android.view.View.OnClickListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public void onClick(android.view.View r5) {
                        /*
                            r4 = this;
                            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.taolive.sdk.playcontrol.d.AnonymousClass6.$ipChange
                            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                            r2 = 1
                            if (r1 == 0) goto L15
                            r1 = 2
                            java.lang.Object[] r1 = new java.lang.Object[r1]
                            r3 = 0
                            r1[r3] = r4
                            r1[r2] = r5
                            java.lang.String r5 = "8dfcefe2"
                            r0.ipc$dispatch(r5, r1)
                            return
                        L15:
                            int r0 = r2
                            if (r0 != r2) goto L1d
                            java.lang.String r0 = "replay"
                            goto L20
                        L1d:
                            java.lang.String r0 = "living"
                        L20:
                            com.taobao.taolive.sdk.playcontrol.d r1 = com.taobao.taolive.sdk.playcontrol.d.this
                            com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy r1 = com.taobao.taolive.sdk.playcontrol.d.e(r1)
                            if (r1 == 0) goto L3a
                            com.taobao.taolive.sdk.playcontrol.d r1 = com.taobao.taolive.sdk.playcontrol.d.this
                            com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy r1 = com.taobao.taolive.sdk.playcontrol.d.e(r1)
                        L2e:
                            android.content.Context r2 = r3
                            java.lang.String r2 = com.taobao.taolive.sdk.utils.x.a(r2)
                            java.lang.String r3 = r4
                            r1.a(r5, r2, r3, r0)
                            goto L45
                        L3a:
                            com.taobao.taolive.sdk.core.f r1 = com.taobao.taolive.sdk.core.f.a()
                            com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy r1 = r1.d()
                            if (r1 == 0) goto L45
                            goto L2e
                        L45:
                            com.taobao.taolive.sdk.playcontrol.d r5 = com.taobao.taolive.sdk.playcontrol.d.this
                            com.taobao.taolive.sdk.playcontrol.d.f(r5)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.sdk.playcontrol.d.AnonymousClass6.onClick(android.view.View):void");
                    }
                });
            }
            pmc.a().b();
            pmc.a().b();
            if (sst.a(this.b)) {
                com.taobao.android.miniLive.a.a().a(new com.taobao.android.miniLive.ui.d() { // from class: com.taobao.taolive.sdk.playcontrol.d.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.miniLive.ui.d
                    public void a(boolean z2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z2)});
                        } else if (d.h(d.this) == null || !(d.h(d.this).z() instanceof com.taobao.taolive.sdk.controller.e)) {
                        } else {
                            ((com.taobao.taolive.sdk.controller.e) d.h(d.this).z()).e(z2);
                        }
                    }
                });
            }
            try {
                pmc.a().b().d();
                pmb.f32756a = true;
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.taobao.taolive.sdk.playcontrol.a
    public void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{this, context, new Boolean(z)});
            return;
        }
        String str = c.TAG;
        m.a(str, "VideoViewController toLarge mLiveContextKey = " + this.n);
        if (pmc.a().b() != null) {
            try {
                if (pmc.a().b().a() != null) {
                    pmc.a().b().c();
                    pmc.a().b().b();
                }
            } catch (Exception unused) {
            }
        }
        if (this.d == null) {
            return;
        }
        if (this.c == null) {
            this.c = b(context, null, null, null);
        }
        ViewGroup viewGroup = (ViewGroup) this.c.G().getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.c.G());
        }
        this.d.addView(this.c.G(), 0, new ViewGroup.LayoutParams(-1, -1));
        if (z && !this.c.l() && !this.k) {
            v();
        }
        if (sst.a(this.b)) {
            this.c.a(u());
        } else {
            this.c.a(false);
        }
        if (this.c.A()) {
            this.c.l(true);
        } else {
            this.c.B();
        }
        this.e = false;
    }

    @Override // com.taobao.taolive.sdk.playcontrol.a
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.e;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        com.taobao.taolive.sdk.ui.media.d dVar = this.c;
        return dVar != null && dVar.l();
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        String str = c.TAG;
        m.a(str, "VideoViewController destroySmallVideoViewWhenVideoStart mLiveContextKey = " + this.n);
        if (o.C()) {
            if (!this.e || !this.r || poy.g(this.b)) {
                return;
            }
            b(8);
            com.taobao.taolive.sdk.ui.media.d dVar = this.c;
            if (dVar == null) {
                return;
            }
            dVar.o();
        } else if (!this.r || poy.g(this.b)) {
        } else {
            b(8);
            com.taobao.taolive.sdk.ui.media.d dVar2 = this.c;
            if (dVar2 == null) {
                return;
            }
            dVar2.o();
        }
    }

    @Override // com.taobao.taolive.sdk.playcontrol.a
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        String str = c.TAG;
        m.a(str, "VideoViewController destroySmallVideoViewWhenLiveStart mLiveContextKey = " + this.n);
        if (!this.r) {
            return;
        }
        b(8);
        com.taobao.taolive.sdk.ui.media.d dVar = this.c;
        if (dVar == null) {
            return;
        }
        dVar.o();
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (pmc.a().b() == null || pmc.a().b().a() == null) {
        } else {
            pmc.a().b().a().setVisibility(i);
            if (8 != i) {
                return;
            }
            pmb.f32756a = false;
            pmc.a().b().b();
        }
    }

    private void a(TBLiveDataModel tBLiveDataModel) {
        com.taobao.taolive.sdk.ui.media.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd977ce1", new Object[]{this, tBLiveDataModel});
        } else if (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null || (dVar = this.c) == null) {
        } else {
            dVar.b(tBLiveDataModel.mVideoInfo.pushFeature);
        }
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        this.k = true;
        CopyOnWriteArrayList<ppr> copyOnWriteArrayList = this.f;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        Iterator<ppr> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        this.l = true;
        CopyOnWriteArrayList<ppr> copyOnWriteArrayList = this.f;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            Iterator<ppr> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
        if (this.c == null || poy.y(this.b) != VideoStatus.VIDEO_NORMAL_STATUS) {
            return;
        }
        if (this.z && this.b.z().u()) {
            return;
        }
        this.c.o();
    }

    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        this.l = false;
        CopyOnWriteArrayList<ppr> copyOnWriteArrayList = this.f;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            Iterator<ppr> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
        }
        if (this.g) {
            return;
        }
        if ((c() && !m()) || this.c == null || poy.y(this.b) != VideoStatus.VIDEO_NORMAL_STATUS) {
            return;
        }
        if (this.z && this.b.z().u()) {
            return;
        }
        this.c.q();
        v();
    }

    @Override // com.taobao.taolive.sdk.playcontrol.a
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        String str = c.TAG;
        m.c(str, "VideoViewController updateLinkLiveState mLiveContextKey = " + this.n);
        if (pmc.a().b() == null) {
            return;
        }
        pmc.a().b();
    }

    @Override // com.taobao.taolive.sdk.core.c
    public void onMessageReceived(int i, Object obj) {
        com.taobao.taolive.sdk.ui.media.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
        } else if (i != 3005 || !(obj instanceof TLiveMsg) || (dVar = this.c) == null) {
        } else {
            dVar.a((TLiveMsg) obj);
        }
    }

    @Override // com.taobao.taolive.sdk.playcontrol.a
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.v = str;
        }
    }

    @Override // com.taobao.taolive.sdk.playcontrol.a
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.w = i;
        }
    }

    @Override // com.taobao.taolive.sdk.playcontrol.a
    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue();
        }
        if (!sst.a()) {
            String str = c.TAG;
            m.a(str, "getLiveRoomMute isIndependentMuteABOpen false mLiveContextKey = " + this.n);
            return false;
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.b;
        if (aVar == null || !(aVar.z() instanceof com.taobao.taolive.sdk.controller.e)) {
            return false;
        }
        boolean r = ((com.taobao.taolive.sdk.controller.e) this.b.z()).r();
        String str2 = c.TAG;
        m.a(str2, "getLiveRoomMute  ret = " + r + " mLiveContextKey = " + this.n);
        return r;
    }

    @Override // com.taobao.taolive.sdk.playcontrol.a
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (!sst.a()) {
            String str = c.TAG;
            m.a(str, "setIndependentMute isIndependentMuteABOpen false mLiveContextKey = " + this.n);
        } else {
            String str2 = c.TAG;
            m.a(str2, "setIndependentMute mute = " + z + " false mLiveContextKey = " + this.n);
            com.taobao.alilive.aliliveframework.frame.a aVar = this.b;
            if (aVar != null && (aVar.z() instanceof com.taobao.taolive.sdk.controller.e)) {
                ((com.taobao.taolive.sdk.controller.e) this.b.z()).e(z);
            }
            com.taobao.taolive.sdk.ui.media.d dVar = this.c;
            if (dVar == null) {
                return;
            }
            dVar.a(z);
        }
    }

    @Override // com.taobao.taolive.sdk.playcontrol.a
    public void a(ppr pprVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa12cf26", new Object[]{this, pprVar});
            return;
        }
        String str = c.TAG;
        m.a(str, "VideoViewController registerListener mLiveContextKey = " + this.n);
        CopyOnWriteArrayList<ppr> copyOnWriteArrayList = this.f;
        if (copyOnWriteArrayList == null || pprVar == null || copyOnWriteArrayList.contains(pprVar)) {
            return;
        }
        this.f.add(pprVar);
    }

    @Override // com.taobao.taolive.sdk.playcontrol.a
    public void b(ppr pprVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e895d5a7", new Object[]{this, pprVar});
            return;
        }
        String str = c.TAG;
        m.a(str, "VideoViewController unRegisterListener mLiveContextKey = " + this.n);
        CopyOnWriteArrayList<ppr> copyOnWriteArrayList = this.f;
        if (copyOnWriteArrayList == null || pprVar == null || !copyOnWriteArrayList.contains(pprVar)) {
            return;
        }
        this.f.remove(pprVar);
    }

    @Override // com.taobao.taolive.sdk.playcontrol.a
    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.y;
    }

    @Override // com.taobao.taolive.sdk.playcontrol.a
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.y = false;
        }
    }

    private void B() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        this.c.b(2);
        String str = f21883a;
        m.a(str, "setRenderType " + this.n);
        com.taobao.alilive.aliliveframework.frame.a aVar = this.b;
        if (aVar == null || !(aVar.z() instanceof com.taobao.taolive.sdk.controller.e) || !o.a((com.taobao.taolive.sdk.controller.e) this.b.z())) {
            return;
        }
        com.taobao.alilive.aliliveframework.frame.a aVar2 = this.b;
        boolean z2 = (!(aVar2 instanceof e) || ((e) aVar2).r() == null) ? true : ((e) this.b).r().isFirst;
        if (Build.VERSION.SDK_INT >= o.a(30)) {
            z = true;
        }
        String str2 = f21883a;
        m.a(str2, "setRenderType isFirstPosition = " + z2 + " sdkEnable = " + z + " mLiveContextKey = " + this.n);
        if (z2 || !z) {
            return;
        }
        this.c.p(true);
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        this.c.a(new IMediaPlayer.i() { // from class: com.taobao.taolive.sdk.playcontrol.d.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.i
            public void onPrepared(IMediaPlayer iMediaPlayer) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d91c57f9", new Object[]{this, iMediaPlayer});
                    return;
                }
                pmd.a().m().c(pnj.LOG_TAG, "mediaPlayer: onPrepared");
                d.d(d.this, false);
                if (d.m(d.this) == null || d.m(d.this).size() <= 0) {
                    return;
                }
                Iterator it = d.m(d.this).iterator();
                while (it.hasNext()) {
                    ((ppr) it.next()).b();
                }
            }
        });
        this.c.a(new IMediaPlayer.e() { // from class: com.taobao.taolive.sdk.playcontrol.d.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.e
            public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("1e2c1ca", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
                }
                pnj m = pmd.a().m();
                m.c(pnj.LOG_TAG, "mediaPlayer: onError what---" + i + "  extra---" + i2);
                d.d(d.this, false);
                if (d.m(d.this) != null && d.m(d.this).size() > 0) {
                    for (int i3 = 0; i3 < d.m(d.this).size(); i3++) {
                        ((ppr) d.m(d.this).get(i3)).a(iMediaPlayer, i, i2);
                    }
                }
                return false;
            }
        });
        this.c.a(new IMediaPlayer.g() { // from class: com.taobao.taolive.sdk.playcontrol.d.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.g
            public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("5622e1ba", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
                }
                pnj m = pmd.a().m();
                m.c(pnj.LOG_TAG, "mediaPlayer: onInfo what---" + j + "  extra---" + j2);
                d.d(d.this, false);
                if (j == 3) {
                    d.e(d.this, true);
                }
                if (d.m(d.this) != null && d.m(d.this).size() > 0) {
                    Iterator it = d.m(d.this).iterator();
                    while (it.hasNext()) {
                        ((ppr) it.next()).a(iMediaPlayer, j, j2, obj);
                    }
                }
                return false;
            }
        });
        this.c.a(new IMediaPlayer.d() { // from class: com.taobao.taolive.sdk.playcontrol.d.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.d
            public void onCompletion(IMediaPlayer iMediaPlayer) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9b380e18", new Object[]{this, iMediaPlayer});
                    return;
                }
                pmd.a().m().c(pnj.LOG_TAG, "mediaPlayer: onCompletion");
                d.d(d.this, true);
                if (d.m(d.this) == null || d.m(d.this).size() <= 0) {
                    return;
                }
                for (int i = 0; i < d.m(d.this).size(); i++) {
                    ((ppr) d.m(d.this).get(i)).c(iMediaPlayer);
                }
            }
        });
        this.c.a(new IMediaPlayer.j() { // from class: com.taobao.taolive.sdk.playcontrol.VideoViewController$12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.j
            public void onStart(IMediaPlayer iMediaPlayer) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cb76ac0", new Object[]{this, iMediaPlayer});
                    return;
                }
                pmd.a().m().c(pnj.LOG_TAG, "mediaPlayer: onStart");
                if (d.m(d.this) == null || d.m(d.this).size() <= 0) {
                    return;
                }
                Iterator it = d.m(d.this).iterator();
                while (it.hasNext()) {
                    ((ppr) it.next()).a(iMediaPlayer);
                }
            }
        });
        this.c.a(new IMediaPlayer.h() { // from class: com.taobao.taolive.sdk.playcontrol.VideoViewController$13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.h
            public void onPause(IMediaPlayer iMediaPlayer) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e1f7bf54", new Object[]{this, iMediaPlayer});
                    return;
                }
                pmd.a().m().c(pnj.LOG_TAG, "mediaPlayer: onPause");
                if (d.m(d.this) == null || d.m(d.this).size() <= 0) {
                    return;
                }
                Iterator it = d.m(d.this).iterator();
                while (it.hasNext()) {
                    ((ppr) it.next()).b(iMediaPlayer);
                }
            }
        });
    }

    private void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        VideoInfo u = poy.u(this.b);
        if (u != null) {
            if (!TextUtils.isEmpty(u.liveId)) {
                hashMap.put("feed_id", u.liveId);
            }
            if (!TextUtils.isEmpty(u.itemid)) {
                hashMap.put("item_id", u.itemid);
            }
            if (u.broadCaster != null && !TextUtils.isEmpty(u.broadCaster.accountId)) {
                hashMap.put("account_id", u.broadCaster.accountId);
            }
        }
        hashMap.put("from_channel", "0");
        if (pmd.a().e() == null) {
            return;
        }
        pmd.a().e().a("Page_Mini_Live", 2101, "taobao_live_mini", "", "0", hashMap);
    }

    @Override // com.taobao.taolive.sdk.playcontrol.a
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        m.a("TaoLiveRoomPlayer", "start" + this.n);
        if (A()) {
            com.taobao.taolive.sdk.ui.media.d dVar = this.c;
            if (dVar == null) {
                return;
            }
            dVar.g();
            return;
        }
        m.a("TaoLiveRoomPlayer", "start no Permission" + this.n);
    }

    @Override // com.taobao.taolive.sdk.playcontrol.a
    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        m.a("TaoLiveRoomPlayer", "stop" + this.n);
        com.taobao.taolive.sdk.ui.media.d dVar = this.c;
        if (dVar == null) {
            return;
        }
        dVar.o();
    }

    @Override // com.taobao.taolive.sdk.playcontrol.a
    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        m.a("TaoLiveRoomPlayer", "startByToken" + this.n);
        if (A()) {
            com.taobao.taolive.sdk.ui.media.d dVar = this.c;
            if (dVar == null) {
                return;
            }
            dVar.w();
            return;
        }
        m.a("TaoLiveRoomPlayer", "startByToken no Permission" + this.n);
    }

    private void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
        } else {
            this.A = false;
        }
    }

    private boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue() : !y();
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[]{this})).booleanValue() : this.A && o.i();
    }

    @Override // com.taobao.taolive.sdk.playcontrol.a
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.A = z;
        }
    }

    @Override // tb.ddt
    public float C() {
        VideoInfo u;
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c5ab3a", new Object[]{this})).floatValue();
        }
        if (this.B <= 0.0f && (u = poy.u(this.b)) != null) {
            String str = u.liveConfigForStream;
            if (!TextUtils.isEmpty(str) && (parseObject = JSON.parseObject(str)) != null) {
                this.B = parseObject.getFloatValue("ntpStartLiveOffset");
                String str2 = f21883a;
                q.b(str2, "获取NTP,getLatestRenderFrameNTP mVideoBaseNTP = " + this.B);
            }
        }
        com.taobao.taolive.sdk.ui.media.d dVar = this.c;
        float dX_ = dVar != null ? dVar.dX_() * 1000.0f : -1.0f;
        float f = this.B;
        if (f <= 0.0f || dX_ <= 0.0f) {
            return -1.0f;
        }
        float f2 = (f + dX_) - 2.20898892E12f;
        String str3 = f21883a;
        q.b(str3, "获取NTP,getLatestRenderFrameNTP finalNtp = " + f2);
        return f2;
    }
}
