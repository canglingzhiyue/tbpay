package com.taobao.android.dinamicx.widget.video;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.dinamicx.widget.al;
import com.taobao.android.dinamicx.widget.video.DXVideoProgressView;
import com.taobao.android.dinamicx.widget.video.DXVideoView;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.fuw;
import tb.fxy;
import tb.fym;

/* loaded from: classes5.dex */
public class DXVideoViewWidgetNode extends DXWidgetNode implements al, fym {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXVIDEOVIEW_BUSINESSID = 6324682256668551971L;
    public static final long DXVIDEOVIEW_CANPLAY = 4728577732966363983L;
    public static final long DXVIDEOVIEW_CONTROLMODE = -5617586525335578991L;
    public static final int DXVIDEOVIEW_CONTROLMODE_AUTO = 0;
    public static final int DXVIDEOVIEW_CONTROLMODE_MANUAL = 1;
    public static final int DXVIDEOVIEW_CONTROLMODE_PLAYCONTROL = 2;
    public static final long DXVIDEOVIEW_COVERSCALETYPE = -2261513180223804489L;
    public static final int DXVIDEOVIEW_COVERSCALETYPE_CENTERCROP = 2;
    public static final int DXVIDEOVIEW_COVERSCALETYPE_FITCENTER = 0;
    public static final int DXVIDEOVIEW_COVERSCALETYPE_FITXY = 1;
    public static final long DXVIDEOVIEW_COVERURL = 1756289496339923034L;
    public static final long DXVIDEOVIEW_ENABLEPREPARETOFIRSTFRAME = 969596831546698501L;
    public static final long DXVIDEOVIEW_HIDDENICONONSTOP = 2254251221971377256L;
    public static final long DXVIDEOVIEW_ICONID = 9418897494345820L;
    public static final long DXVIDEOVIEW_IGNORENETWORK = 9075198007090888571L;
    public static final long DXVIDEOVIEW_LOOP = 35880685214L;
    public static final long DXVIDEOVIEW_MUTE = 36176011951L;
    public static final long DXVIDEOVIEW_ONACTION = -8545689907459660475L;
    public static final long DXVIDEOVIEW_ONTIMEUPDATED = 1082484218474589760L;
    public static final long DXVIDEOVIEW_ONVIDEOERROR = 7340625222798644714L;
    public static final long DXVIDEOVIEW_ONVIDEOSTART = 7340629229134476526L;
    public static final long DXVIDEOVIEW_ONVIDEOSTOP = -7567658013608852091L;
    public static final long DXVIDEOVIEW_PASSONTRACK = -5458098620721369484L;
    public static final long DXVIDEOVIEW_PROGRESSBARID = -8545689907459660476L;
    public static final long DXVIDEOVIEW_PROGRESSINTERVAL = -1950664219134012726L;
    public static final long DXVIDEOVIEW_SCALETYPE = 1015096712691932083L;
    public static final int DXVIDEOVIEW_SCALETYPE_CENTERCROP = 2;
    public static final int DXVIDEOVIEW_SCALETYPE_FITCENTER = 0;
    public static final int DXVIDEOVIEW_SCALETYPE_FITXY = 1;
    public static final long DXVIDEOVIEW_SUBBUSINESSID = 5688343922917753936L;
    public static final long DXVIDEOVIEW_VIDEOID = 5435952498458972235L;
    public static final long DXVIDEOVIEW_VIDEOURL = 7344459856848172626L;
    public static final long DXVIDEOVIEW_VIDEOVIEW = -4556233998858362981L;
    public static final String VIEW_TAT = "ts_video_view";
    private String businessId;
    private String coverUrl;
    private String passOnTrack;
    private String progressBarId;
    private DXProgressBarWidgetNode progressBarWidgetNode;
    private int progressInterval;
    private String subBusinessId;
    private String videoId;
    private String videoUrl;
    private boolean canPlay = true;
    private int controlMode = 0;
    private int coverScaleType = 0;
    private boolean enablePrepareToFirstFrame = false;
    private boolean hiddenIconOnStop = false;
    private boolean ignoreNetwork = false;
    private boolean loop = false;
    private boolean mute = false;
    private int scaleType = 0;
    private String iconId = "";
    private final DXVideoProgressView.a videoSeekToCallback = new DXVideoProgressView.a() { // from class: com.taobao.android.dinamicx.widget.video.DXVideoViewWidgetNode.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.dinamicx.widget.video.DXVideoProgressView.a
        public void a(int i, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c114003", new Object[]{this, new Integer(i), new Double(d)});
                return;
            }
            if (DXVideoViewWidgetNode.access$000(DXVideoViewWidgetNode.this) != null) {
                DXVideoViewWidgetNode.access$000(DXVideoViewWidgetNode.this).setValue(d);
            }
            DXVideoViewWidgetNode.this.seekTo(i);
        }
    };
    private final DXVideoView.a iVideoPlayEventListener = new DXVideoView.a() { // from class: com.taobao.android.dinamicx.widget.video.DXVideoViewWidgetNode.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.dinamicx.widget.video.DXVideoView.a
        public void a(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
                return;
            }
            DXEvent dXEvent = new DXEvent(DXVideoViewWidgetNode.DXVIDEOVIEW_ONVIDEOSTART);
            HashMap hashMap = new HashMap();
            hashMap.put("isPlayControlTrigger", f.a(z));
            hashMap.put("isResumePlay", f.a(z2));
            hashMap.put("videoIdentifier", f.a(StringUtils.isEmpty(DXVideoViewWidgetNode.access$100(DXVideoViewWidgetNode.this)) ? DXVideoViewWidgetNode.access$200(DXVideoViewWidgetNode.this) : DXVideoViewWidgetNode.access$100(DXVideoViewWidgetNode.this)));
            dXEvent.setArgs(hashMap);
            DXVideoViewWidgetNode.this.postEvent(dXEvent);
        }
    };

    /* loaded from: classes5.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXVideoViewWidgetNode();
        }
    }

    public static /* synthetic */ Object ipc$super(DXVideoViewWidgetNode dXVideoViewWidgetNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
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

    public static /* synthetic */ DXProgressBarWidgetNode access$000(DXVideoViewWidgetNode dXVideoViewWidgetNode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXProgressBarWidgetNode) ipChange.ipc$dispatch("d2efd6b9", new Object[]{dXVideoViewWidgetNode}) : dXVideoViewWidgetNode.progressBarWidgetNode;
    }

    public static /* synthetic */ String access$100(DXVideoViewWidgetNode dXVideoViewWidgetNode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a6d0515f", new Object[]{dXVideoViewWidgetNode}) : dXVideoViewWidgetNode.videoId;
    }

    public static /* synthetic */ String access$200(DXVideoViewWidgetNode dXVideoViewWidgetNode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("92b683e", new Object[]{dXVideoViewWidgetNode}) : dXVideoViewWidgetNode.videoUrl;
    }

    @Override // com.taobao.android.dinamicx.widget.al
    public Object getNodePropByKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5ad97ad4", new Object[]{this, str});
        }
        if ("isPlaying".equals(str)) {
            View v = getDXRuntimeContext().v();
            if (!(v instanceof DXVideoView)) {
                return false;
            }
            return Boolean.valueOf(((DXVideoView) v).isPlaying());
        } else if (!"isMuted".equals(str)) {
            return null;
        } else {
            View v2 = getDXRuntimeContext().v();
            if (!(v2 instanceof DXVideoView)) {
                return false;
            }
            return Boolean.valueOf(((DXVideoView) v2).isMuted());
        }
    }

    @Override // tb.fym
    public void onCanPlay(final fxy<?, fym> fxyVar, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bcb3bff", new Object[]{this, fxyVar, str});
            return;
        }
        fuw.d("nov_video", "onCanPlay");
        playVideo(new DXVideoView.b() { // from class: com.taobao.android.dinamicx.widget.video.DXVideoViewWidgetNode.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.dinamicx.widget.video.DXVideoView.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    fxyVar.c(DXVideoViewWidgetNode.this, str);
                }
            }

            @Override // com.taobao.android.dinamicx.widget.video.DXVideoView.b
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    fxyVar.d(DXVideoViewWidgetNode.this, str);
                }
            }
        });
    }

    @Override // tb.fym
    public void onShouldStop(fxy<?, fym> fxyVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c198f0e", new Object[]{this, fxyVar, str});
            return;
        }
        fuw.d("nov_video", "onShouldStop");
        View v = getDXRuntimeContext().v();
        if (!(v instanceof DXVideoView)) {
            return;
        }
        DXVideoView dXVideoView = (DXVideoView) v;
        dXVideoView.setITSVideoStatusCallback(null);
        dXVideoView.destroyVideo();
        resetProgress();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXVideoViewWidgetNode();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (!(dXWidgetNode instanceof DXVideoViewWidgetNode)) {
        } else {
            super.onClone(dXWidgetNode, z);
            DXVideoViewWidgetNode dXVideoViewWidgetNode = (DXVideoViewWidgetNode) dXWidgetNode;
            this.controlMode = dXVideoViewWidgetNode.controlMode;
            this.canPlay = dXVideoViewWidgetNode.canPlay;
            this.coverScaleType = dXVideoViewWidgetNode.coverScaleType;
            this.coverUrl = dXVideoViewWidgetNode.coverUrl;
            this.loop = dXVideoViewWidgetNode.loop;
            this.mute = dXVideoViewWidgetNode.mute;
            this.scaleType = dXVideoViewWidgetNode.scaleType;
            this.videoId = dXVideoViewWidgetNode.videoId;
            this.videoUrl = dXVideoViewWidgetNode.videoUrl;
            this.hiddenIconOnStop = dXVideoViewWidgetNode.hiddenIconOnStop;
            this.ignoreNetwork = dXVideoViewWidgetNode.ignoreNetwork;
            this.enablePrepareToFirstFrame = dXVideoViewWidgetNode.enablePrepareToFirstFrame;
            this.progressBarId = dXVideoViewWidgetNode.progressBarId;
            this.subBusinessId = dXVideoViewWidgetNode.subBusinessId;
            this.progressInterval = dXVideoViewWidgetNode.progressInterval;
            this.iconId = dXVideoViewWidgetNode.iconId;
            this.progressBarWidgetNode = dXVideoViewWidgetNode.progressBarWidgetNode;
            this.businessId = dXVideoViewWidgetNode.businessId;
            this.passOnTrack = dXVideoViewWidgetNode.passOnTrack;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        DXVideoView dXVideoView = new DXVideoView(context);
        dXVideoView.setTag(VIEW_TAT);
        return dXVideoView;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        findProgressBarNode();
        view.setTag(R.id.dx_video_player_event, this.iVideoPlayEventListener);
        DXVideoView dXVideoView = (DXVideoView) view;
        DXWidgetNode queryRootWidgetNode = queryRootWidgetNode();
        if (StringUtils.isEmpty(this.iconId)) {
            dXVideoView.setPlayButtonImage("https://gw.alicdn.com/imgextra/i4/O1CN01JbjPoN1KKufxzJk3o_!!6000000001146-2-tps-192-192.png");
        } else {
            dXVideoView.setCustomerPlayIcon(queryRootWidgetNode.queryWidgetNodeByUserId(this.iconId));
        }
        dXVideoView.setBizId(StringUtils.isEmpty(this.businessId) ? "DXVideo" : this.businessId);
        dXVideoView.setSubBusinessId(StringUtils.isEmpty(this.subBusinessId) ? "" : this.subBusinessId);
        dXVideoView.setProgressInterval(this.progressInterval);
        dXVideoView.setVideoId(this.videoId);
        dXVideoView.setVideoUrl(this.videoUrl);
        dXVideoView.setCoverImageScaleType(this.coverScaleType);
        dXVideoView.setCoverImage(this.coverUrl);
        dXVideoView.setLooping(this.loop);
        dXVideoView.setMuted(this.mute);
        dXVideoView.canPlay(this.canPlay);
        dXVideoView.setScaleType(this.scaleType);
        dXVideoView.setVideoSize(getMeasuredWidth(), getMeasuredHeight());
        dXVideoView.setPassOnTrack(this.passOnTrack);
        dXVideoView.setHideIconOnStop(this.hiddenIconOnStop);
        dXVideoView.setPlayIgnoreNetwork(this.ignoreNetwork);
        dXVideoView.setClickListenerControlPlay(getEnabled() == 1);
        if (this.enablePrepareToFirstFrame) {
            dXVideoView.prepareToFirstFrame();
        }
        int i = this.controlMode;
        if (i == 0) {
            dXVideoView.setEnablePlayControl(false);
            dXVideoView.setAutoControl(true);
            dXVideoView.playVideo(true);
        } else if (i == 2) {
            dXVideoView.setEnablePlayControl(true);
            dXVideoView.setAutoControl(false);
        } else {
            dXVideoView.setEnablePlayControl(false);
            dXVideoView.setAutoControl(false);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (dXEvent.getEventId() == DXVIDEOVIEW_ONACTION) {
            Map<String, f> args = dXEvent.getArgs();
            if (args != null && (fVar = args.get("action")) != null) {
                doAction(fVar.i());
            }
            return true;
        }
        return super.onEvent(dXEvent);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
            return;
        }
        if (j == DXVIDEOVIEW_BUSINESSID) {
            this.businessId = str;
        } else if (j == 1756289496339923034L) {
            this.coverUrl = str;
        } else if (j == DXVIDEOVIEW_PASSONTRACK) {
            this.passOnTrack = str;
        } else if (j == DXVIDEOVIEW_SUBBUSINESSID) {
            this.subBusinessId = str;
        } else if (j == 5435952498458972235L) {
            this.videoId = str;
        } else if (j == 7344459856848172626L) {
            this.videoUrl = str;
        }
        if (j == DXVIDEOVIEW_ICONID) {
            this.iconId = str;
        } else if (j == DXVIDEOVIEW_PROGRESSBARID) {
            this.progressBarId = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        if (j == DXVIDEOVIEW_CONTROLMODE) {
            this.controlMode = i;
        } else if (j == 4728577732966363983L) {
            if (i != 0) {
                z = true;
            }
            this.canPlay = z;
        } else if (j == DXVIDEOVIEW_COVERSCALETYPE) {
            this.coverScaleType = i;
        } else if (j == DXVIDEOVIEW_LOOP) {
            if (i != 0) {
                z = true;
            }
            this.loop = z;
        } else if (j == 36176011951L) {
            if (i != 0) {
                z = true;
            }
            this.mute = z;
        } else if (j == 1015096712691932083L) {
            this.scaleType = i;
        } else if (j == DXVIDEOVIEW_HIDDENICONONSTOP) {
            if (i == 1) {
                z = true;
            }
            this.hiddenIconOnStop = z;
        } else if (j == DXVIDEOVIEW_IGNORENETWORK) {
            if (i == 1) {
                z = true;
            }
            this.ignoreNetwork = z;
        } else if (j == DXVIDEOVIEW_ENABLEPREPARETOFIRSTFRAME) {
            if (i != 0) {
                z = true;
            }
            this.enablePrepareToFirstFrame = z;
        }
        if (j == DXVIDEOVIEW_PROGRESSINTERVAL) {
            this.progressInterval = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXVIDEOVIEW_COVERSCALETYPE) {
            return 1;
        }
        if (j == DXVIDEOVIEW_LOOP) {
            return 0;
        }
        if (j == 36176011951L || j == 1015096712691932083L) {
            return 1;
        }
        if (j != DXVIDEOVIEW_CONTROLMODE) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 0;
    }

    public void playVideo(DXVideoView.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d83d1f", new Object[]{this, bVar});
            return;
        }
        View v = getDXRuntimeContext().v();
        if (!(v instanceof DXVideoView)) {
            return;
        }
        DXVideoView dXVideoView = (DXVideoView) v;
        dXVideoView.setITSVideoStatusCallback(bVar);
        dXVideoView.playVideo();
    }

    public void pauseVideo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d7fc628", new Object[]{this, new Boolean(z)});
            return;
        }
        View v = getDXRuntimeContext().v();
        if (!(v instanceof DXVideoView)) {
            return;
        }
        if (z) {
            ((DXVideoView) v).destroyVideo();
        } else {
            ((DXVideoView) v).pauseVideo();
        }
        ((DXVideoView) v).setITSVideoStatusCallback(null);
    }

    public boolean isPlayIgnoreNetwork() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d7ae4ea9", new Object[]{this})).booleanValue() : this.ignoreNetwork;
    }

    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        View v = getDXRuntimeContext().v();
        if (!(v instanceof DXVideoView)) {
            return;
        }
        ((DXVideoView) v).seekTo(i);
    }

    private void findProgressBarNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f5d3d6", new Object[]{this});
        } else if (StringUtils.isEmpty(this.progressBarId)) {
        } else {
            DXWidgetNode queryWTByUserId = queryRootWidgetNode().queryWTByUserId(this.progressBarId);
            if (!(queryWTByUserId instanceof DXProgressBarWidgetNode)) {
                return;
            }
            this.progressBarWidgetNode = (DXProgressBarWidgetNode) queryWTByUserId;
        }
    }

    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        DXProgressBarWidgetNode dXProgressBarWidgetNode = this.progressBarWidgetNode;
        if (dXProgressBarWidgetNode == null) {
            return;
        }
        dXProgressBarWidgetNode.setVideoSeekToCallback(this.videoSeekToCallback);
        this.progressBarWidgetNode.onVideoProgressChanged(i, i2, i3);
    }

    private void resetProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac205b23", new Object[]{this});
            return;
        }
        DXProgressBarWidgetNode dXProgressBarWidgetNode = this.progressBarWidgetNode;
        if (dXProgressBarWidgetNode == null) {
            return;
        }
        dXProgressBarWidgetNode.reset();
    }

    private void doAction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87a4be72", new Object[]{this, str});
            return;
        }
        View v = getDXRuntimeContext().v();
        if (!(v instanceof DXVideoView)) {
            return;
        }
        DXVideoView dXVideoView = (DXVideoView) v;
        char c = 65535;
        switch (str.hashCode()) {
            case -840405966:
                if (str.equals("unmute")) {
                    c = 1;
                    break;
                }
                break;
            case 3363353:
                if (str.equals("mute")) {
                    c = 0;
                    break;
                }
                break;
            case 3443508:
                if (str.equals("play")) {
                    c = 3;
                    break;
                }
                break;
            case 94750088:
                if (str.equals("click")) {
                    c = 2;
                    break;
                }
                break;
            case 106440182:
                if (str.equals("pause")) {
                    c = 4;
                    break;
                }
                break;
        }
        if (c == 0) {
            dXVideoView.setMuted(true);
        } else if (c == 1) {
            dXVideoView.setMuted(false);
        } else if (c == 2) {
            dXVideoView.responseOnClick();
        } else if (c == 3) {
            dXVideoView.playVideo();
        } else if (c != 4) {
        } else {
            dXVideoView.pauseVideo();
        }
    }
}
