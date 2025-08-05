package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.alilive.adapter.uikit.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.movehighlight.utils.o;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.controller.k;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.f;
import com.taobao.taolive.sdk.ui.component.VideoFrame2;
import java.util.HashMap;
import java.util.Map;
import tb.pgu;

/* loaded from: classes8.dex */
public class pgs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public BaseFrame f32638a;
    public ViewGroup b;
    public VideoFrame2 c;
    public Context d;
    public TBLiveDataModel e;
    public boolean f;
    public long g;
    public boolean h;
    private BaseFrame i;
    private f j;
    private boolean k;
    private pkm l;
    private AliUrlImageView m;
    private long n;
    private pgv o;
    private pgw p;
    private pgu.a q;

    static {
        kge.a(-1281088918);
    }

    public static /* synthetic */ BaseFrame a(pgs pgsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseFrame) ipChange.ipc$dispatch("85626c76", new Object[]{pgsVar}) : pgsVar.i;
    }

    public static /* synthetic */ BaseFrame a(pgs pgsVar, BaseFrame baseFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("98053148", new Object[]{pgsVar, baseFrame});
        }
        pgsVar.i = baseFrame;
        return baseFrame;
    }

    public void a(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd977ce1", new Object[]{this, tBLiveDataModel});
        } else {
            this.e = tBLiveDataModel;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f = z;
        pgv pgvVar = this.o;
        if (pgvVar != null) {
            pgvVar.g = z;
        }
        pgw pgwVar = this.p;
        if (pgwVar == null) {
            return;
        }
        pgwVar.g = z;
    }

    public pgs(a aVar) {
        this.f32638a = a.a(aVar);
        this.b = a.b(aVar);
        this.c = a.c(aVar);
        this.d = a.d(aVar);
        this.e = a.e(aVar);
        this.f = a.f(aVar);
        this.j = a.g(aVar);
        this.k = a.h(aVar);
        this.l = a.i(aVar);
        this.m = a.j(aVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.q == null) {
            this.q = new pgu.a() { // from class: tb.pgs.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.pgu.a
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    } else {
                        pgs.this.a(str);
                    }
                }

                @Override // tb.pgu.a
                public void a(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                    } else {
                        pgs.this.h = z;
                    }
                }

                @Override // tb.pgu.a
                public void a(BaseFrame baseFrame) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2d2b08e2", new Object[]{this, baseFrame});
                    } else {
                        pgs.a(pgs.this, baseFrame);
                    }
                }

                @Override // tb.pgu.a
                public BaseFrame a() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (BaseFrame) ipChange2.ipc$dispatch("7f374ae2", new Object[]{this}) : pgs.a(pgs.this);
                }
            };
        }
        if (this.o == null) {
            this.o = new pgv(this.f32638a, this.b, this.c, this.d, this.e, this.f, this.q);
        }
        if (this.p != null) {
            return;
        }
        this.p = new pgw(this.f32638a, this.b, this.c, this.d, this.e, this.f, this.q);
    }

    private void a(String str, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6465f45b", new Object[]{this, str, videoInfo});
        } else if (this.c == null || videoInfo == null) {
        } else {
            ImageView imageView = null;
            if (!TextUtils.isEmpty(videoInfo.coverImg169)) {
                imageView = new ImageView(this.d);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            this.c.setVideoErrorInfo(str, imageView);
            final AliUrlImageView aliUrlImageView = new AliUrlImageView(this.d);
            aliUrlImageView.setSkipAutoSize(true);
            aliUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01Kc64oQ1UxyVXhxmg2_!!6000000002585-54-tps-111-89.apng");
            aliUrlImageView.setImageLoadListener(new c() { // from class: tb.pgs.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alilive.adapter.uikit.c
                public void a(Drawable drawable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                    }
                }

                @Override // com.alilive.adapter.uikit.c
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        aliUrlImageView.setImageDrawable(pgs.this.d.getResources().getDrawable(R.drawable.taolive_icon_error_anim));
                    }
                }
            });
            this.c.setVideoErrorLoading(aliUrlImageView);
        }
    }

    public void a(com.taobao.alilive.aliliveframework.frame.a aVar, VideoInfo videoInfo, String str, String str2, pgp pgpVar, com.taobao.alilive.aliliveframework.frame.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55e83d4a", new Object[]{this, aVar, videoInfo, str, str2, pgpVar, aVar2});
            return;
        }
        a(aVar, ag.CALC_REPLAY_ENTER, videoInfo);
        if (this.c != null) {
            a(this.d.getString(R.string.taolive_time_shift_video_error_hint), videoInfo);
            this.c.changeStatus(2);
        }
        if (this.k) {
            return;
        }
        if (videoInfo.landScape && videoInfo.publishCommentsUseMtop && videoInfo.fetchCommentsUseMtop) {
            this.p.a(this.q).b(aVar).c().a(aVar);
        } else {
            this.o.b(aVar).a(aVar);
        }
        poy.h("1", aVar2);
        a(str, str2, pgpVar, aVar2);
    }

    private void a(final String str, final String str2, final pgp pgpVar, final com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a8c7b2", new Object[]{this, str, str2, pgpVar, aVar});
            return;
        }
        f fVar = this.j;
        if (fVar == null) {
            return;
        }
        fVar.post(new Runnable() { // from class: tb.pgs.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (pfb.a(aVar).e() == null) {
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("itemId", str);
                    hashMap.put(aw.PARAM_TIMEMOVE_KEYPOINTID, str2);
                    pfb.a(aVar).e().a(hashMap, true, pgpVar);
                }
            }
        });
    }

    public void a(String str) {
        AliUrlImageView aliUrlImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str) || (aliUrlImageView = this.m) == null) {
        } else {
            aliUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.m.setImageUrl(str);
            this.m.setVisibility(0);
        }
    }

    private void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab173206", new Object[]{this, aVar, str, videoInfo});
        } else if (videoInfo == null) {
        } else {
            this.n = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            int i = videoInfo.roomType;
            if (poy.b(videoInfo, aVar)) {
                i = 13;
            }
            String str2 = "1";
            if (videoInfo.broadCaster != null) {
                hashMap.put("accountType", k.a(videoInfo.broadCaster.type) + "");
                hashMap.put("account_id", videoInfo.broadCaster.accountId);
                hashMap.put(ag.KEY_IS_FANS, videoInfo.broadCaster.follow ? str2 : "0");
            }
            hashMap.put("feedId", videoInfo.liveId);
            hashMap.put("feed_id", videoInfo.liveId);
            hashMap.put(ag.KEY_FEED_TYPE, videoInfo.type + "");
            hashMap.put("from", poy.K(aVar));
            hashMap.put("livesource", poy.ac(aVar));
            hashMap.put("entrySource", poy.ad(aVar));
            hashMap.put("roomtype2=", i + "");
            if (!videoInfo.landScape) {
                str2 = "0";
            }
            hashMap.put("landscape", str2);
            hashMap.put("deviceLevel", com.taobao.taolive.room.utils.k.a() + "");
            hashMap.put("trackInfo", poy.L(aVar));
            hashMap.put(aw.PARAM_TRACK_LIVEOPRT_ID, poy.N(aVar));
            o.a(aVar, str, (Map<String, String>) hashMap);
        }
    }

    public void a(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1819755d", new Object[]{this, aVar});
            return;
        }
        VideoInfo a2 = k.a(this.e);
        if (a2 == null || a2.broadCaster == null || !"1".equals(a2.roomStatus)) {
            return;
        }
        int i = a2.roomType;
        if (poy.b(a2, aVar)) {
            i = 13;
        }
        o.a(aVar, ag.CALC_STAY_TIME, "duration=" + ((System.currentTimeMillis() - this.g) / 1000));
        o.a(aVar, "TaoLiveLeave", "from=" + poy.K(aVar), "livesource=" + poy.ac(aVar), "entrySource=" + poy.ad(aVar), "duration=" + (System.currentTimeMillis() - this.n), "deviceLevel=" + com.taobao.taolive.room.utils.k.a(), "roomtype2=" + i, "feed_id=" + a2.liveId, "feedtype=" + a2.type);
    }

    public BaseFrame b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseFrame) ipChange.ipc$dispatch("a4cb53e3", new Object[]{this}) : this.i;
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private BaseFrame f32642a;
        private ViewGroup b;
        private VideoFrame2 c;
        private Context d;
        private TBLiveDataModel e;
        private boolean f;
        private f g;
        private boolean h;
        private pkm i;
        private AliUrlImageView j;

        static {
            kge.a(1465839425);
        }

        public static /* synthetic */ BaseFrame a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (BaseFrame) ipChange.ipc$dispatch("df6f1a19", new Object[]{aVar}) : aVar.f32642a;
        }

        public static /* synthetic */ ViewGroup b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("ef68ab5", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ VideoFrame2 c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (VideoFrame2) ipChange.ipc$dispatch("52854a36", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ Context d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("d5baf0da", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ TBLiveDataModel e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TBLiveDataModel) ipChange.ipc$dispatch("2584e94c", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ boolean f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a6566c68", new Object[]{aVar})).booleanValue() : aVar.f;
        }

        public static /* synthetic */ f g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("31e0b509", new Object[]{aVar}) : aVar.g;
        }

        public static /* synthetic */ boolean h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a0d40ea", new Object[]{aVar})).booleanValue() : aVar.h;
        }

        public static /* synthetic */ pkm i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (pkm) ipChange.ipc$dispatch("66eba9ed", new Object[]{aVar}) : aVar.i;
        }

        public static /* synthetic */ AliUrlImageView j(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AliUrlImageView) ipChange.ipc$dispatch("7c62784a", new Object[]{aVar}) : aVar.j;
        }

        public a a(AliUrlImageView aliUrlImageView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6c1da803", new Object[]{this, aliUrlImageView});
            }
            this.j = aliUrlImageView;
            return this;
        }

        public a a(BaseFrame baseFrame) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4b2ed92b", new Object[]{this, baseFrame});
            }
            this.f32642a = baseFrame;
            return this;
        }

        public a a(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ad76f06", new Object[]{this, viewGroup});
            }
            this.b = viewGroup;
            return this;
        }

        public a a(VideoFrame2 videoFrame2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a2eaf4b0", new Object[]{this, videoFrame2});
            }
            this.c = videoFrame2;
            return this;
        }

        public a a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("21d88b6d", new Object[]{this, context});
            }
            this.d = context;
            return this;
        }

        public a a(TBLiveDataModel tBLiveDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c73b740c", new Object[]{this, tBLiveDataModel});
            }
            this.e = tBLiveDataModel;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("67d249e1", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public a a(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6d9b302d", new Object[]{this, fVar});
            }
            this.g = fVar;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c1adb422", new Object[]{this, new Boolean(z)});
            }
            this.h = z;
            return this;
        }

        public a a(pkm pkmVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b143cec7", new Object[]{this, pkmVar});
            }
            this.i = pkmVar;
            return this;
        }

        public pgs a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (pgs) ipChange.ipc$dispatch("f091f42", new Object[]{this}) : new pgs(this);
        }
    }
}
