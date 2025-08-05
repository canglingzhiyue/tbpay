package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer;
import com.taobao.android.detail2.core.framework.b;
import com.taobao.android.detail2.core.framework.base.media.frame.DimensionEnum;
import com.taobao.android.detail2.core.framework.base.media.frame.a;
import com.taobao.android.detail2.core.framework.base.widget.RoundRectCardRoot;
import com.taobao.android.detail2.core.framework.data.global.NewDetailScreenConfig;
import com.taobao.android.detail2.core.framework.data.model.MainMediaInfo;
import com.taobao.android.detail2.core.framework.view.navbar.AtmosParams;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.aw;
import com.taobao.avplayer.ax;
import com.taobao.avplayer.ba;
import com.taobao.global.setting.c;
import com.taobao.monitor.procedure.v;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.fit;
import tb.fiw;

/* loaded from: classes5.dex */
public class fja implements fiy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context b;
    private fmd c;
    private fhi d;
    private MainMediaInfo e;
    private fix f;
    private fit.a g;
    private fjb h;
    private boolean i;
    private b j;
    private a k;
    private final ViewGroup l;
    private final TUrlImageView m;
    private final ImageView n;
    private final RoundRectCardRoot o;
    private final View p;
    private View q;
    private com.taobao.android.detail2.core.framework.view.feeds.a s;
    private String v;
    private boolean x;
    private boolean y;
    private boolean z;
    private List<JSONObject> r = new ArrayList();
    private boolean t = false;
    private int u = 0;
    private aw w = new aw() { // from class: tb.fja.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.avplayer.aw
        public void onVideoStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
                return;
            }
            fjt.a(fjt.TAG_MEDIA_CONTROLLER, "onVideoStart", (Throwable) null);
            fja.a(fja.this, AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PLAYING, new JSONObject(), true);
            fja.a(fja.this, true);
            fja.a(fja.this, 0);
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            } else {
                fjt.a(fjt.TAG_MEDIA_CONTROLLER, "onVideoPause", (Throwable) null);
            }
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("931007b7", new Object[]{this});
                return;
            }
            fjt.a(fjt.TAG_MEDIA_CONTROLLER, "onVideoPlay", (Throwable) null);
            fja.a(fja.this, AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PLAYING, new JSONObject(), true);
            fja.a(fja.this, true);
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
            } else {
                fjt.a(fjt.TAG_MEDIA_CONTROLLER, "onVideoSeekTo", (Throwable) null);
            }
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoPrepared(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
                return;
            }
            fjt.a(fjt.TAG_MEDIA_CONTROLLER, "onVideoPrepared", (Throwable) null);
            fja.a(fja.this, "prepared", new JSONObject(), true);
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoError(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                return;
            }
            fjt.a(fjt.TAG_MEDIA_CONTROLLER, "onVideoError", (Throwable) null);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorCode", (Object) String.valueOf(i));
            jSONObject.put("subErrCode", (Object) String.valueOf(i2));
            fja.a(fja.this, "error", jSONObject, true);
            fja.a(fja.this).setVisibility(0);
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
                return;
            }
            fjt.a(fjt.TAG_MEDIA_CONTROLLER, "onVideoInfo what=" + j, (Throwable) null);
            if (3 != j) {
                return;
            }
            if (fja.b(fja.this) != null) {
                if (fja.c(fja.this) != null && fja.c(fja.this).n().aO()) {
                    fjt.a(fjt.TAG_TIP, "NdApmToken: onVideoInfo ，检测到 Apm 降级，不打标。 ");
                } else {
                    if (fja.c(fja.this) == null) {
                        fjt.a(fjt.TAG_TIP, "NdApmToken: onVideoInfo mNewDetailContext 为空。");
                    }
                    fja.b(fja.this).setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_VALID);
                    fjt.a(fjt.TAG_TIP, "NdApmToken: onVideoInfo , ndTagSuccess ");
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("firstFrameTime", (Object) Long.valueOf(System.currentTimeMillis()));
            fja.a(fja.this, "firstvideoframe", jSONObject, true);
            a();
            if (fja.e(fja.this) == null) {
                return;
            }
            fja.e(fja.this).a();
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                fja.a(fja.this).postDelayed(new Runnable() { // from class: tb.fja.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        fja.f(fja.this);
                        fjt.a(fjt.TAG_MEDIA_CONTROLLER, "coverViewGoneVideo 隐藏mCoverImageView延迟", (Throwable) null);
                    }
                }, 30L);
            }
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            } else {
                fja.a(fja.this, (JSONObject) null);
            }
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24db3403", new Object[]{this});
            } else {
                fjt.a(fjt.TAG_MEDIA_CONTROLLER, "onVideoClose", (Throwable) null);
            }
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
            } else {
                fjt.a(fjt.TAG_MEDIA_CONTROLLER, "onVideoScreenChanged", (Throwable) null);
            }
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            if (fja.d(fja.this) == 0 || i < fja.d(fja.this) || i - fja.d(fja.this) >= 300 || i == i3) {
                fja.a(fja.this, i);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("totalPlayTime", (Object) Integer.valueOf(i3));
                jSONObject.put("duration", (Object) Integer.valueOf(i3));
                jSONObject.put("currentTime", (Object) Integer.valueOf(i));
                fja.a(fja.this, "timeupdate", jSONObject, false);
                fjt.a(fjt.TAG_MEDIA_CONTROLLER, "onVideoProgressChanged currentPosition=" + i + "，bufferPercent=" + i2 + "，total=" + i3 + ",lastMsgPosition=" + fja.d(fja.this), (Throwable) null);
            }
            fjc.a(fja.g(fja.this), fja.h(fja.this), i, i3, i2);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public ax f27989a = new ax() { // from class: tb.fja.7
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.avplayer.ax
        public void onLoopCompletion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a22ee66", new Object[]{this});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isLoopCompletion", (Object) "true");
            fja.a(fja.this, jSONObject);
        }
    };

    static {
        kge.a(903190615);
        kge.a(1921064773);
    }

    public static /* synthetic */ int a(fja fjaVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c1c94bb", new Object[]{fjaVar, new Integer(i)})).intValue();
        }
        fjaVar.u = i;
        return i;
    }

    public static /* synthetic */ TUrlImageView a(fja fjaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("9ba08a81", new Object[]{fjaVar}) : fjaVar.m;
    }

    public static /* synthetic */ String a(fja fjaVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc07c89b", new Object[]{fjaVar, str});
        }
        fjaVar.v = str;
        return str;
    }

    public static /* synthetic */ void a(fja fjaVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("191d357", new Object[]{fjaVar, view});
        } else {
            fjaVar.a(view);
        }
    }

    public static /* synthetic */ void a(fja fjaVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d10a08b5", new Object[]{fjaVar, jSONObject});
        } else {
            fjaVar.a(jSONObject);
        }
    }

    public static /* synthetic */ void a(fja fjaVar, String str, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40551749", new Object[]{fjaVar, str, jSONObject, new Boolean(z)});
        } else {
            fjaVar.a(str, jSONObject, z);
        }
    }

    public static /* synthetic */ void a(fja fjaVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c1cd499", new Object[]{fjaVar, new Boolean(z)});
        } else {
            fjaVar.d(z);
        }
    }

    public static /* synthetic */ ViewGroup b(fja fjaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("c2bca279", new Object[]{fjaVar}) : fjaVar.l;
    }

    public static /* synthetic */ boolean b(fja fjaVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfa9e3c", new Object[]{fjaVar, new Boolean(z)})).booleanValue();
        }
        fjaVar.i = z;
        return z;
    }

    public static /* synthetic */ b c(fja fjaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("bf4fa04c", new Object[]{fjaVar}) : fjaVar.j;
    }

    public static /* synthetic */ boolean c(fja fjaVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("efd867db", new Object[]{fjaVar, new Boolean(z)})).booleanValue();
        }
        fjaVar.x = z;
        return z;
    }

    public static /* synthetic */ int d(fja fjaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b42f2511", new Object[]{fjaVar})).intValue() : fjaVar.u;
    }

    public static /* synthetic */ fit.a e(fja fjaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fit.a) ipChange.ipc$dispatch("27d2a839", new Object[]{fjaVar}) : fjaVar.g;
    }

    public static /* synthetic */ void f(fja fjaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91353220", new Object[]{fjaVar});
        } else {
            fjaVar.i();
        }
    }

    public static /* synthetic */ fmd g(fja fjaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fmd) ipChange.ipc$dispatch("b3e59e8", new Object[]{fjaVar}) : fjaVar.c;
    }

    public static /* synthetic */ fhi h(fja fjaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fhi) ipChange.ipc$dispatch("f2e01e1d", new Object[]{fjaVar}) : fjaVar.d;
    }

    public static /* synthetic */ fix i(fja fjaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fix) ipChange.ipc$dispatch("da81fa0e", new Object[]{fjaVar}) : fjaVar.f;
    }

    public static /* synthetic */ a j(fja fjaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("d0bf38ab", new Object[]{fjaVar}) : fjaVar.k;
    }

    public static /* synthetic */ ImageView k(fja fjaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("7719008b", new Object[]{fjaVar}) : fjaVar.n;
    }

    public static /* synthetic */ String l(fja fjaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd174c3a", new Object[]{fjaVar}) : fjaVar.v;
    }

    public fja(b bVar, fmd fmdVar, ViewGroup viewGroup, com.taobao.android.detail2.core.framework.view.feeds.a aVar) {
        this.j = bVar;
        this.b = this.j.g();
        this.c = fmdVar;
        this.l = (ViewGroup) viewGroup.findViewById(R.id.video_host);
        this.m = new TUrlImageView(this.b);
        this.n = (ImageView) viewGroup.findViewById(R.id.iv_blur);
        this.o = (RoundRectCardRoot) viewGroup.findViewById(R.id.iv_blur_round_rect);
        this.p = viewGroup.findViewById(R.id.iv_blur_mask);
        this.m.setAutoRelease(false);
        this.q = viewGroup.findViewById(R.id.imv_play_public_pause);
        this.s = aVar;
        this.h = new fjb() { // from class: tb.fja.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.fjb
            public fix a() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (fix) ipChange.ipc$dispatch("f049ba9", new Object[]{this}) : fja.i(fja.this);
            }

            @Override // tb.fjb
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    fja.b(fja.this, true);
                }
            }

            @Override // tb.fjb
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                    return;
                }
                fja.b(fja.this, false);
                if (fja.i(fja.this) == null) {
                    return;
                }
                if (fja.i(fja.this).g() != null && (fja.i(fja.this).g().getParent() instanceof ViewGroup)) {
                    ((ViewGroup) fja.i(fja.this).g().getParent()).removeView(fja.i(fja.this).g());
                }
                fja.i(fja.this).a(fja.j(fja.this).d, fja.j(fja.this).c);
                fja fjaVar = fja.this;
                fja.a(fjaVar, fja.i(fjaVar).g());
                if (fja.i(fja.this).f() == 1 || fja.i(fja.this).f() != 2) {
                    return;
                }
                fja.i(fja.this).b();
                fja.c(fja.this, true);
            }
        };
    }

    public a f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("57eb6782", new Object[]{this}) : this.k;
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        fhi fhiVar = this.d;
        if (fhiVar == null) {
            fjt.a(fjt.TAG_VIDEO_ZOOM, "adjustVideoSizeWithFrameSize失效，mItemNode为空");
            return;
        }
        a a2 = com.taobao.android.detail2.core.framework.base.media.frame.b.a(this.j, fhiVar, this.e, this.s.b(), this.s.c());
        a aVar = this.k;
        if (aVar != null && aVar.c == a2.c && this.k.d == a2.d && this.k.e == a2.e) {
            return;
        }
        this.k = a2;
        fix fixVar = this.f;
        if (fixVar == null) {
            fjt.a(fjt.TAG_VIDEO_ZOOM, "adjustVideoSizeWithFrameSize失效，mDWInstance为空");
            return;
        }
        ViewGroup g = fixVar.g();
        if (g == null) {
            fjt.a(fjt.TAG_VIDEO_ZOOM, "adjustVideoSizeWithFrameSize失效，mDWInstance.getView()为空");
            return;
        }
        ViewGroup.LayoutParams layoutParams = g.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            fjt.a(fjt.TAG_VIDEO_ZOOM, "adjustVideoSizeWithFrameSize失效，LayoutParams类型不符");
            return;
        }
        ViewParent parent = g.getParent();
        boolean z = parent instanceof RoundRectCardRoot;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = this.k.d;
        marginLayoutParams.height = this.k.c;
        if (!z) {
            marginLayoutParams.topMargin = this.k.e;
        } else {
            ViewGroup.LayoutParams layoutParams2 = ((RoundRectCardRoot) parent).getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = this.k.e;
            }
        }
        this.f.a(this.k.d, this.k.c);
        d(fln.a(this.b, this.e.data.videoThumbnailURL));
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.k == null) {
            fjt.a(fjt.TAG_VIDEO_ZOOM, "adjustVideoSize失效，mVideoFrameSizeObject为空");
        } else {
            fix fixVar = this.f;
            if (fixVar == null) {
                fjt.a(fjt.TAG_VIDEO_ZOOM, "adjustVideoSize失效，mDWInstance为空");
                return;
            }
            ViewGroup g = fixVar.g();
            if (g == null) {
                fjt.a(fjt.TAG_VIDEO_ZOOM, "adjustVideoSize失效，mDWInstance.getView()为空");
                return;
            }
            int i3 = (int) (i * (this.k.d / this.k.c));
            ViewGroup.LayoutParams layoutParams = g.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                fjt.a(fjt.TAG_VIDEO_ZOOM, "adjustVideoSize失效，LayoutParams类型不符");
                return;
            }
            ViewParent parent = g.getParent();
            boolean z = parent instanceof RoundRectCardRoot;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = i3;
            marginLayoutParams.height = i;
            if (!z) {
                marginLayoutParams.topMargin = i2;
            } else {
                ViewGroup.LayoutParams layoutParams2 = ((RoundRectCardRoot) parent).getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i2;
                }
            }
            this.f.a(i3, i);
        }
    }

    @Override // tb.fiy
    public void a(fhi fhiVar, MainMediaInfo mainMediaInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc3864d2", new Object[]{this, fhiVar, mainMediaInfo});
            return;
        }
        this.d = fhiVar;
        this.e = mainMediaInfo;
    }

    @Override // tb.fiy
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        MainMediaInfo mainMediaInfo = this.e;
        if (mainMediaInfo == null) {
            return null;
        }
        return mainMediaInfo.type;
    }

    @Override // tb.fiy
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.k = com.taobao.android.detail2.core.framework.base.media.frame.b.a(this.j, this.d, this.e, this.s.b(), this.s.c());
        this.m.setScaleType(this.k.h);
        String a2 = fln.a(this.b, this.e.data.videoThumbnailURL);
        e(a2);
        a(this.m);
        d(a2);
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        AtmosParams G = this.j.h().G();
        ViewGroup.LayoutParams layoutParams = this.o.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (this.j.h().H() && this.d.f == 0) {
            float c = this.j.h().K().c(G.layoutInfo.borderRadius);
            this.o.setCornerRadius(new float[]{c, c, c, c, 0.0f, 0.0f, 0.0f, 0.0f});
            marginLayoutParams.topMargin = l() ? com.taobao.android.detail2.core.framework.base.media.frame.b.b(this.j, G) : com.taobao.android.detail2.core.framework.base.media.frame.b.a(this.j, G);
        } else {
            this.o.setCornerRadius(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
            marginLayoutParams.topMargin = 0;
        }
        this.n.setScaleType(ImageView.ScaleType.CENTER_CROP);
        com.taobao.android.detail2.core.framework.base.media.frame.b.a(this.n.getContext());
        if (!h(str)) {
            return;
        }
        com.taobao.phenix.intf.b.h().a(str).bitmapProcessors(true, new com.taobao.phenix.compat.effects.b(this.n.getContext(), m(), 2)).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: tb.fja.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
            }

            public boolean a(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                }
                if (succPhenixEvent == null) {
                    return false;
                }
                if (fja.e(fja.this) != null) {
                    fja.e(fja.this).a(succPhenixEvent, true);
                }
                if (succPhenixEvent.getDrawable() != null) {
                    fja.k(fja.this).setImageDrawable(succPhenixEvent.getDrawable());
                }
                return false;
            }
        }).fetch();
        g();
    }

    private boolean h(String str) {
        MainMediaInfo mainMediaInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb017cfd", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || this.d == null || (mainMediaInfo = this.e) == null || mainMediaInfo.data == null) {
            return false;
        }
        if (DimensionEnum.NINE_SIXTEEN.getDimensionRatio().equals(this.e.data.dimension) && this.e.data.bottomAreaHeight == null && !l()) {
            return false;
        }
        return this.d.X();
    }

    private boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        NewDetailScreenConfig.ScreenType f = this.j.h().K().f();
        return (f == NewDetailScreenConfig.ScreenType.NORMAL_PHONE || f == NewDetailScreenConfig.ScreenType.FOLD_DEVICE_PORTRAIT) ? false : true;
    }

    private int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue();
        }
        NewDetailScreenConfig.ScreenType f = this.j.h().K().f();
        if (f != NewDetailScreenConfig.ScreenType.NORMAL_PHONE && f != NewDetailScreenConfig.ScreenType.FOLD_DEVICE_PORTRAIT) {
            return 100;
        }
        return this.j.h().K().c(100);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        String string = this.d.H().getString("maskBackgroundColor");
        if (string == null) {
            return;
        }
        try {
            this.p.setBackgroundColor(Color.parseColor(string));
            this.p.setVisibility(0);
        } catch (Exception e) {
            fjt.a(fjt.TAG_MEDIA_CONTROLLER, "maskBackgroundColor解析失败" + string, e);
        }
    }

    private void e(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            com.taobao.phenix.intf.b.h().a(str).addLoaderExtra(esr.BUNDLE_BIZ_CODE, fln.PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: tb.fja.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    String str2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    if (succPhenixEvent != null && (str2 = str) != null && !str2.equals(fja.l(fja.this))) {
                        BitmapDrawable drawable = succPhenixEvent.getDrawable();
                        fja.a(fja.this, str);
                        if (fja.e(fja.this) != null) {
                            fja.e(fja.this).a(succPhenixEvent, false);
                        }
                        if (drawable != null) {
                            fja.a(fja.this).setImageDrawable(drawable);
                            if (fja.b(fja.this) != null) {
                                if (fja.c(fja.this) != null && fja.c(fja.this).n().aO()) {
                                    fjt.a(fjt.TAG_TIP, "NdApmToken: VideoCoverImageView ，检测到 Apm 降级，不打标。 ");
                                } else {
                                    if (fja.c(fja.this) == null) {
                                        fjt.a(fjt.TAG_TIP, "NdApmToken: VideoCoverImageView mNewDetailContext 为空。");
                                    }
                                    fja.b(fja.this).setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_VALID);
                                    fjt.a(fjt.TAG_TIP, "NdApmToken: VideoCoverImageView , ndTagSuccess ");
                                }
                            }
                        }
                    }
                    return false;
                }
            }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: tb.fja.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    if (failPhenixEvent == null) {
                        return false;
                    }
                    if (fja.h(fja.this) != null && fja.h(fja.this).f == 0 && fja.c(fja.this) != null) {
                        fjp.a(fja.c(fja.this).f(), "NPicFail", (Object) "phenix");
                    }
                    fjt.a(fjt.TAG_MEDIA_CONTROLLER, "封面图加载失败 index=" + fja.h(fja.this).f + ", url: " + failPhenixEvent.getUrl(), (Throwable) null);
                    return false;
                }
            }).fetch();
        }
    }

    @Override // tb.fiy
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        MainMediaInfo mainMediaInfo = this.e;
        if (mainMediaInfo == null || mainMediaInfo.data == null) {
            return;
        }
        h();
        if (this.k == null) {
            this.k = com.taobao.android.detail2.core.framework.base.media.frame.b.a(this.j, this.d, this.e, this.s.b(), this.s.c());
        }
        ctu.a("videoPlayerNewBuilder");
        fiw.a aVar = new fiw.a((Activity) this.b);
        ctu.a();
        aVar.a(this.e.data.videoId);
        aVar.d(this.e.data.url);
        aVar.e(this.e.data.videoSource);
        aVar.a(this.k.d);
        aVar.b(this.k.c);
        aVar.a(this.k.h == ImageView.ScaleType.CENTER_CROP ? DWAspectRatio.DW_CENTER_CROP : DWAspectRatio.DW_FIT_CENTER);
        aVar.a(DWInstanceType.PIC);
        aVar.a(true);
        aVar.b(true);
        if (ipa.a("fast_key_simple_bind_video_data") || ipa.aL()) {
            String str = this.e.data.videoResourceStr;
            if (!TextUtils.isEmpty(str)) {
                try {
                    fjt.a(fjt.TAG_TIP, "传递一跳的播控数据成功。");
                    aVar.a(new org.json.JSONObject(str));
                } catch (Exception e) {
                    fjt.a(fjt.TAG_MEDIA_CONTROLLER, "播控创建出错", e);
                }
            }
        } else {
            if (fkd.a((Object) Boolean.valueOf(this.e.config != null && this.e.config.enableStreamOpti), false)) {
                String str2 = this.e.data.videoResourceStr;
                if (!TextUtils.isEmpty(str2)) {
                    fjt.a(fjt.TAG_MEDIA_CONTROLLER, "PickPreloadController创建播放器使用播控");
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                        com.taobao.android.detail2.core.framework.base.media.videodecide.b.a(jSONObject, null, false, true, this.d);
                        aVar.a(jSONObject);
                    } catch (Exception e2) {
                        fjt.a(fjt.TAG_MEDIA_CONTROLLER, "播控创建出错", e2);
                    }
                } else {
                    fjt.a(fjt.TAG_MEDIA_CONTROLLER, "PickPreloadController创建播放器播控为null");
                }
            }
        }
        aVar.b(this.e.data.videoPlayScenes);
        aVar.c(this.e.data.source);
        if (this.j.n().aL()) {
            if (c.a(Globals.getApplication(), "nd").b().a("tbGlobalMuteSetting")) {
                aVar.c(true);
            } else {
                aVar.c(false);
            }
        }
        this.f = aVar.a();
        this.f.a(DWInstanceType.VIDEO);
        this.f.a(this.w);
        this.f.a(this.f27989a);
        if (fkd.a((Object) Boolean.valueOf(this.e.config != null && this.e.config.p2ff), false)) {
            this.f.h();
        }
        a(this.f.g());
        a(true, (JSONObject) null);
        fjt.a(fjt.TAG_RENDER, "播放器创建完成: " + this.e.data.videoId);
    }

    private void a(View view) {
        View view2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null) {
        } else {
            if (view.getParent() != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof RoundRectCardRoot) {
                    view2 = (View) parent;
                    ((RoundRectCardRoot) parent).removeView(view);
                    parent = parent.getParent();
                } else {
                    view2 = view;
                }
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view2);
                }
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.k.d, this.k.c);
            layoutParams.gravity = 1;
            layoutParams.topMargin = this.k.e;
            if (this.k.k != null) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.gravity = 1;
                layoutParams2.topMargin = this.k.e;
                layoutParams.topMargin = 0;
                RoundRectCardRoot roundRectCardRoot = new RoundRectCardRoot(view.getContext());
                roundRectCardRoot.setCornerRadius(this.k.k);
                this.l.addView(roundRectCardRoot, 0, layoutParams2);
                roundRectCardRoot.addView(view, 0, layoutParams);
                return;
            }
            this.l.addView(view, 0, layoutParams);
        }
    }

    private void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else if (view == null || view.getParent() == null) {
        } else {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                return;
            }
            ((ViewGroup) parent).removeView(view);
        }
    }

    @Override // tb.fiy
    public void a(HashMap<String, String> hashMap) {
        fix fixVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
        } else if (hashMap == null || (fixVar = this.f) == null) {
        } else {
            fixVar.b(hashMap);
        }
    }

    private boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        fhi fhiVar = this.d;
        if (fhiVar == null) {
            fjt.a("new_detail异常", "NdVideoSettingHelper: disableMySettingVideoPlayConfig,无法读取 mItemNode 。");
            return false;
        } else if (!"true".equals(fhiVar.H().getString("disableMySettingVideoPlayConfig"))) {
            return false;
        } else {
            fjt.a(fjt.TAG_TIP, "NdVideoSettingHelper: 服务端下发了禁止履约视频自动播放配置的实验标识。");
            return true;
        }
    }

    @Override // tb.fiy
    public void a(String str) {
        fix fixVar;
        MainMediaInfo mainMediaInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.i || (fixVar = this.f) == null || fixVar.f() == 1) {
        } else {
            if (this.f.f() == 2) {
                this.f.b();
                this.x = true;
            } else {
                if ("weex".equals(str) || "videoIdInconsistent".equals(str) || ((mainMediaInfo = this.e) != null && mainMediaInfo.config != null && this.e.config.autoPlay && p())) {
                    this.f.a();
                    StringBuilder sb = new StringBuilder();
                    sb.append("播放器start调用: ");
                    sb.append(this.e.data != null ? this.e.data.videoId : "");
                    fjt.a(fjt.TAG_RENDER, sb.toString());
                    this.x = true;
                    o();
                }
                this.c.a(this.h);
            }
            this.f.a(new ba() { // from class: tb.fja.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.avplayer.ba
                public void cJ_() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f89fc57f", new Object[]{this});
                    } else {
                        fja.this.b(true);
                    }
                }
            });
        }
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        fjt.a(fjt.TAG_TIP, "NdVideoSettingHelper: appendUtParamsRun.");
        fit.a aVar = this.g;
        if (aVar == null || aVar.b() == null) {
            return;
        }
        HashMap<String, String> b = this.g.b();
        if (!b.containsKey("spm-cnt")) {
            b.put("spm-cnt", "a2141.b8745808");
        }
        if (!b.containsKey("is_ad")) {
            b.put("is_ad", "0");
        }
        if (!b.containsKey("subprodType")) {
            b.put("subprodType", "");
        }
        if (!b.containsKey("prodType")) {
            b.put("prodType", "");
        }
        if (b.containsKey("cardnum")) {
            b.put("index", b.get("cardnum"));
        }
        b.put("playerScene", "Page_Newdetailvideo");
        b.put(oyw.VIDEO_PLAY_SCENES, "Page_Newdetailvideo");
        this.f.a(b);
    }

    private boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
        }
        if (n()) {
            fjt.a(fjt.TAG_TIP, "NdVideoSettingHelper: checkSupport:服务端下发禁止标。");
            return true;
        }
        this.z = true;
        if (new com.taobao.android.detail2.core.framework.base.media.frame.c(this.j.h()).a()) {
            fjt.a(fjt.TAG_TIP, "NdVideoSettingHelper: checkSupport:videoCanAutoPlay-True");
            return true;
        }
        this.y = true;
        this.d.ai = true;
        d(false);
        fjt.a(fjt.TAG_TIP, "NdVideoSettingHelper: checkSupport:videoCanAutoPlay-False");
        o();
        return false;
    }

    @Override // tb.fiy
    public void b(String str) {
        fix fixVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (this.i || (fixVar = this.f) == null) {
        } else {
            fixVar.c();
            this.x = false;
            f(str);
        }
    }

    @Override // tb.fiy
    public void c(String str) {
        fix fixVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (this.i || (fixVar = this.f) == null) {
        } else {
            fixVar.c();
            this.x = false;
            f(str);
        }
    }

    @Override // tb.fiy
    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        fix fixVar = this.f;
        if (fixVar == null || i < 0) {
            return;
        }
        fixVar.a(i);
        if (z) {
            this.f.c();
            this.x = false;
        } else {
            this.f.b();
            this.x = true;
        }
        this.u = i;
    }

    @Override // tb.fiy
    public void a(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b98504", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        fix fixVar = this.f;
        if (fixVar == null) {
            return;
        }
        fixVar.a(z, jSONObject);
    }

    @Override // tb.fiy
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        fix fixVar = this.f;
        if (fixVar == null) {
            return;
        }
        fixVar.b(z);
    }

    @Override // tb.fiy
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            h();
        } else {
            i();
        }
        fix fixVar = this.f;
        if (fixVar == null) {
            return;
        }
        b(fixVar.g());
        this.f.e();
        this.f = null;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.m;
        if (tUrlImageView == null) {
            return;
        }
        tUrlImageView.setVisibility(0);
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.m;
        if (tUrlImageView == null) {
            return;
        }
        tUrlImageView.setVisibility(4);
    }

    @Override // tb.fiy
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.t) {
        } else {
            this.t = true;
            j();
        }
    }

    @Override // tb.fiy
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        fix fixVar = this.f;
        if (fixVar == null) {
            return;
        }
        if (fixVar.f() == 1) {
            if (kxs.b(this.j)) {
                fjt.a(fjt.TAG_TIP, "NdMultiWindowUtil:  页面聚焦时间内，且视频播放中，忽略本次视频击事件。");
                return;
            }
            this.f.c();
            this.x = false;
            f("click");
            return;
        }
        if (this.z) {
            if (this.y) {
                this.y = false;
                this.f.a();
            } else {
                this.f.b();
            }
        } else {
            this.f.b();
        }
        this.x = true;
        g("click");
    }

    @Override // tb.fiy
    public void a(fit.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41c2e78a", new Object[]{this, aVar});
        } else {
            this.g = aVar;
        }
    }

    @Override // tb.fiy
    public boolean dF_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("26b29e48", new Object[]{this})).booleanValue() : this.x;
    }

    @Override // tb.fiy
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        fix fixVar = this.f;
        if (fixVar == null) {
            return;
        }
        fixVar.a(f);
    }

    private void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        if (!"scroll".equals(str)) {
            d(false);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("scene", (Object) str);
        a("paused", jSONObject, true);
    }

    private void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("scene", (Object) str);
        a(AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PLAYING, jSONObject, true);
    }

    private void a(String str, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60829596", new Object[]{this, str, jSONObject, new Boolean(z)});
            return;
        }
        fit.a aVar = this.g;
        if (aVar == null) {
            return;
        }
        if (this.t) {
            aVar.a(str, jSONObject);
        } else if (!z) {
        } else {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", (Object) str);
            jSONObject2.put("info", (Object) jSONObject);
            this.r.add(jSONObject2);
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        for (JSONObject jSONObject : this.r) {
            a(jSONObject.getString("type"), jSONObject.getJSONObject("info"), false);
        }
        this.r.clear();
    }

    private void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        fix fixVar = this.f;
        if (fixVar == null || fixVar.f() == 3) {
            return;
        }
        if (z) {
            this.q.setVisibility(8);
        } else {
            this.q.setVisibility(0);
        }
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        fjt.a(fjt.TAG_MEDIA_CONTROLLER, "onVideoComplete", (Throwable) null);
        a("finish", jSONObject, true);
        a("ended", jSONObject, true);
    }
}
