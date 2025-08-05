package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService;
import com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.HVideoView;
import com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.PlayControlVideoView;
import com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.d;
import com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.dwplayer.view.PlayControlDwVideoView;
import com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.g;
import com.taobao.tao.log.TLog;
import java.util.Objects;
import tb.mto;

/* loaded from: classes7.dex */
public class lmh extends DXWidgetNode implements IVideoPlayControllerService.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXHVIDEOVIEW_HVIDEOID = 3199987006404765204L;
    public static final long DXHVIDEOVIEW_HVIDEOPLAYINFO = 6814434335289370511L;
    public static final long DXHVIDEOVIEW_PLAYCONTROLLERENABLE = -8795905679455764171L;
    public static final long DX_HVIDEOVIEW_ASPECTRATIO = 7594222789952419722L;
    public static final long DX_HVIDEOVIEW_CANPLAY = 4728577732966363983L;
    public static final long DX_HVIDEOVIEW_COVERURL = 1756289496339923034L;
    public static final long DX_HVIDEOVIEW_DURATION = 2057626925900400238L;
    public static final long DX_HVIDEOVIEW_ICONOFFSETY = 8577182346642010996L;
    public static final long DX_HVIDEOVIEW_ICONSIZE = 3509390040415201356L;
    public static final long DX_HVIDEOVIEW_ICONURL = 4951885508200836195L;
    public static final long DX_HVIDEOVIEW_ONENDPLAYING = -2313153628473349676L;
    public static final long DX_HVIDEOVIEW_ONERRORPLAYING = -2442905352582921527L;
    public static final long DX_HVIDEOVIEW_SCALETYPE = 1015096712691932083L;
    public static final long DX_HVIDEOVIEW_VIDEOURL = 7344459856848172626L;
    public static final long H_VIDEO_VIEW = -8690577844899785500L;
    public static final String TAG = "HVideoViewWidgetNodeByService";
    public static final long USER_DEFINE_PARAM_HASH_CODE = 9999999999L;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String j;
    private JSONObject k;
    private String l;
    private String m;

    /* renamed from: a */
    private double f30707a = mto.a.GEO_NOT_SUPPORT;
    private boolean b = true;
    private boolean h = true;
    private int i = 0;

    static {
        kge.a(1631474003);
        kge.a(-1812803939);
    }

    public static /* synthetic */ Object ipc$super(lmh lmhVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void lambda$Rivn7QZAZLO7LkOkkFo_9Ms9F5Q(IVideoPlayControllerService.a aVar) {
        c(aVar);
    }

    public static /* synthetic */ void a(lmh lmhVar, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dfc6ac6", new Object[]{lmhVar, new Integer(i), str, str2});
        } else {
            lmhVar.a(i, str, str2);
        }
    }

    public static /* synthetic */ void a(lmh lmhVar, IVideoPlayControllerService.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("136e38c9", new Object[]{lmhVar, aVar, str});
        } else {
            lmhVar.a(aVar, str);
        }
    }

    public static /* synthetic */ void a(lmh lmhVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6942a440", new Object[]{lmhVar, dVar});
        } else {
            lmhVar.a(dVar);
        }
    }

    public static /* synthetic */ void b(lmh lmhVar, IVideoPlayControllerService.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80daf5e8", new Object[]{lmhVar, aVar, str});
        } else {
            lmhVar.b(aVar, str);
        }
    }

    /* loaded from: classes7.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(154412330);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new lmh();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new lmh();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService.b
    public void a(final IVideoPlayControllerService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1fe7668", new Object[]{this, aVar});
        } else if (!c()) {
        } else {
            View v = getDXRuntimeContext().v();
            if (!(v instanceof d)) {
                ldf.d(TAG, "onCanPlay, view invalid");
                return;
            }
            d dVar = (d) v;
            a(dVar, aVar);
            int g = aVar.g();
            ldf.d(TAG, "seekTime: " + g);
            if (g != -1) {
                dVar.seekTo(g);
            }
            ldf.d(TAG, "onCanPlay, videoUrl: " + this.j + ", coverUrl : " + this.c);
            dVar.playVideo();
            if (g == -1) {
                return;
            }
            v.postDelayed(new Runnable() { // from class: tb.-$$Lambda$lmh$Rivn7QZAZLO7LkOkkFo_9Ms9F5Q
                @Override // java.lang.Runnable
                public final void run() {
                    lmh.lambda$Rivn7QZAZLO7LkOkkFo_9Ms9F5Q(IVideoPlayControllerService.a.this);
                }
            }, 2000L);
        }
    }

    public static /* synthetic */ void c(IVideoPlayControllerService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5de54226", new Object[]{aVar});
        } else {
            aVar.h();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService.b
    public void b(IVideoPlayControllerService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ff1dc47", new Object[]{this, aVar});
        } else if (!c()) {
        } else {
            View v = getDXRuntimeContext().v();
            if (!(v instanceof d)) {
                return;
            }
            d dVar = (d) v;
            a(dVar);
            dVar.stopVideo();
            ldf.d(TAG, "onShouldStop, videoUrl: " + this.j + ", coverUrl : " + this.c);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService.b
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : c();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        boolean c = c();
        if (!d()) {
            if (c) {
                return new PlayControlVideoView(context, true);
            }
            return new HVideoView(context);
        } else if (c) {
            PlayControlDwVideoView playControlDwVideoView = new PlayControlDwVideoView(context);
            String str = this.m;
            if (str != null && !str.isEmpty()) {
                playControlDwVideoView.setVideoPlayInfo(this.m);
                String str2 = this.l;
                if (str2 != null && !str2.isEmpty()) {
                    playControlDwVideoView.setVideoID(this.l);
                    TLog.logd("TB_Service", TAG, "setVideoID succeed");
                }
                TLog.logd("TB_Service", TAG, "setVideoPlayInfo succeed");
            } else {
                playControlDwVideoView.setVideoUrl(this.j);
            }
            playControlDwVideoView.init(context, true, b());
            return playControlDwVideoView;
        } else {
            return new HVideoView(context);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof lmh)) {
            return;
        }
        lmh lmhVar = (lmh) dXWidgetNode;
        this.i = lmhVar.i;
        this.g = lmhVar.g;
        this.j = lmhVar.j;
        this.l = lmhVar.l;
        this.m = lmhVar.m;
        this.e = lmhVar.e;
        this.f = lmhVar.f;
        this.d = lmhVar.d;
        this.c = lmhVar.c;
        this.f30707a = lmhVar.f30707a;
        this.h = lmhVar.h;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (!(view instanceof d)) {
        } else {
            d dVar = (d) view;
            a(dVar, context);
            if (this.l != null && this.m != null) {
                lme.a().a(context, this.m, new lmg(this.j, this.l));
            }
            JSONObject e = getDXRuntimeContext().e();
            this.k = e;
            dVar.updateData(e);
            String str = this.l;
            if (str != null && str.isEmpty()) {
                dVar.setVideoID(this.l);
            }
            dVar.setVideoUrl(this.j);
            dVar.setVideoID(this.l);
            dVar.setVideoPlayInfo(this.m);
            dVar.setIconOffsetY(this.e);
            dVar.setIconSize(this.f);
            dVar.setCoverImage(this.c);
            dVar.setPlayButtonImage(this.g);
            dVar.setDurationTime(this.d);
            a(dVar, this.i);
            dVar.canPlay(this.b);
            ldf.d(TAG, "video_load_url=" + this.j);
            ldf.d(TAG, "video_id=" + this.l);
        }
    }

    private void a(d dVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b28109ba", new Object[]{this, dVar, new Integer(i)});
        } else if (i == 1) {
            dVar.setScaleType(3);
            dVar.setCoverScaleType(ImageView.ScaleType.FIT_XY);
        } else if (i == 2) {
            dVar.setScaleType(1);
            dVar.setCoverScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            dVar.setScaleType(0);
            dVar.setCoverScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    private DWAspectRatio b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWAspectRatio) ipChange.ipc$dispatch("377618a0", new Object[]{this});
        }
        int i = this.i;
        if (i == 1) {
            return DWAspectRatio.DW_FIT_X_Y;
        }
        if (i == 2) {
            return DWAspectRatio.DW_CENTER_CROP;
        }
        return DWAspectRatio.DW_FIT_CENTER;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (Double.compare(this.f30707a, mto.a.GEO_NOT_SUPPORT) <= 0) {
            super.onMeasure(i, i2);
        } else {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 != 1073741824) {
                size2 = (int) (size / this.f30707a);
                i2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            }
            if (mode != 1073741824 && mode2 == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec((int) (size2 * this.f30707a), 1073741824);
            }
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (dXEvent == null) {
            return false;
        }
        if (super.onEvent(dXEvent)) {
            return true;
        }
        if (c()) {
            return false;
        }
        long eventId = dXEvent.getEventId();
        if (eventId == 5288671110273408574L) {
            return a("play");
        }
        if (eventId != 5388973340095122049L) {
            return false;
        }
        return a("pause");
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        View v = getDXRuntimeContext().v();
        if (!(v instanceof HVideoView)) {
            return false;
        }
        String str2 = "";
        if (TextUtils.equals(str, "play")) {
            ((HVideoView) v).playVideo();
            String[] strArr = new String[2];
            strArr[0] = "start video: section:";
            JSONObject jSONObject = this.k;
            if (jSONObject != null) {
                str2 = jSONObject.getString("sectionBizCode");
            }
            strArr[1] = str2;
            ldf.d(TAG, strArr);
        } else if (TextUtils.equals(str, "pause")) {
            ((HVideoView) v).pauseVideo();
            String[] strArr2 = new String[2];
            strArr2[0] = "pause video: section:";
            JSONObject jSONObject2 = this.k;
            if (jSONObject2 != null) {
                str2 = jSONObject2.getString("sectionBizCode");
            }
            strArr2[1] = str2;
            ldf.d(TAG, strArr2);
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 1015096712691932083L) {
            this.i = i;
        } else if (j == 4728577732966363983L) {
            if (i == 1) {
                z = true;
            }
            this.b = z;
        } else if (j == -8795905679455764171L) {
            if (i == 1) {
                z = true;
            }
            this.h = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == 7594222789952419722L) {
            this.f30707a = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == 1756289496339923034L) {
            this.c = str;
        } else if (j == 2057626925900400238L) {
            this.d = str;
        } else if (j == 8577182346642010996L) {
            this.e = str;
        } else if (j == 3509390040415201356L) {
            this.f = str;
        } else if (j == 7344459856848172626L) {
            this.j = str;
        } else if (j == 4951885508200836195L) {
            this.g = str;
        } else if (j == DXHVIDEOVIEW_HVIDEOID) {
            this.l = str;
        } else if (j == DXHVIDEOVIEW_HVIDEOPLAYINFO) {
            this.m = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j != 4728577732966363983L && j != -8795905679455764171L) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 1;
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.h;
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        String str = this.m;
        return str != null && !str.isEmpty();
    }

    private void a(IVideoPlayControllerService.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f789d632", new Object[]{this, aVar, str});
            return;
        }
        aVar.d(this);
        ldf.d(TAG, "onPlayError, msg : " + str);
    }

    private void b(IVideoPlayControllerService.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb92251", new Object[]{this, aVar, str});
            return;
        }
        aVar.e(this);
        ldf.d(TAG, "onPlayComplete, msg : " + str);
    }

    private void a(final d dVar, final IVideoPlayControllerService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("936999c7", new Object[]{this, dVar, aVar});
        } else {
            dVar.registerVideoStatusListener(new g() { // from class: tb.lmh.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    lmh.this = this;
                }

                @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.g
                public void a(int i, String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8114572f", new Object[]{this, new Integer(i), str, str2});
                    } else if (i == 1) {
                        lmh.a(lmh.this, dVar);
                        lmh.b(lmh.this, aVar, str2);
                    } else if (i == 2 || i == 4) {
                        lmh.a(lmh.this, dVar);
                        lmh.a(lmh.this, aVar, str2);
                        lmh.a(lmh.this, i, str, str2);
                    } else if (i == 5) {
                        aVar.b(lmh.this);
                    } else if (i == 6) {
                        aVar.a(lmh.this);
                    } else if (i != 7) {
                    } else {
                        lmh.a(lmh.this, dVar);
                        aVar.c(lmh.this);
                    }
                }
            });
        }
    }

    private void a(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8114572f", new Object[]{this, new Integer(i), str, str2});
        } else if (i == 2) {
            ldk.a("video", "video_playFail", "", "Page_Home_VideoPlayer", "", null, str, str2);
        } else if (i != 4) {
        } else {
            if (TextUtils.equals("pre_download_failed", str)) {
                ldk.a("video", "video_downloadFail", "", "Page_Home_VideoPlayer", "", null, str, str2);
            } else {
                ldk.a("video", "video_fetchFail", "", "Page_Home_VideoPlayer", "", null, str, str2);
            }
        }
    }

    private void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16463669", new Object[]{this, dVar});
        } else {
            dVar.registerVideoStatusListener(null);
        }
    }

    private void a(d dVar, Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80d42d7f", new Object[]{this, dVar, context});
        } else if (!(dVar instanceof PlayControlDwVideoView)) {
        } else {
            PlayControlDwVideoView playControlDwVideoView = (PlayControlDwVideoView) dVar;
            if (Objects.equals(playControlDwVideoView.getVideoID(), this.l) && (str = this.l) != null && !str.isEmpty()) {
                return;
            }
            playControlDwVideoView.release();
            String str2 = this.m;
            if (str2 != null && !str2.isEmpty()) {
                playControlDwVideoView.setVideoPlayInfo(this.m);
                String str3 = this.l;
                if (str3 != null && !str3.isEmpty()) {
                    playControlDwVideoView.setVideoID(this.l);
                    TLog.logd("TB_Service", TAG, "setVideoID succeed");
                }
                TLog.logd("TB_Service", TAG, "setVideoPlayInfo succeed");
            } else {
                playControlDwVideoView.setVideoUrl(this.j);
            }
            playControlDwVideoView.init(context, true, b());
        }
    }
}
