package com.taobao.android.detail.ttdetail.component.module;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import com.taobao.android.detail.ttdetail.bizmessage.ShowLightOffMessage;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.widget.TTObservedImageView;
import com.taobao.android.detail.ttdetail.widget.video.NormalVideoView;
import com.taobao.android.detail.ttdetail.widget.video.VideoView;
import com.taobao.taobao.R;
import tb.eyx;
import tb.eyy;
import tb.ezc;
import tb.kge;

/* loaded from: classes4.dex */
public class p extends k implements com.taobao.android.detail.ttdetail.widget.draglayout.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public NormalVideoView f10556a;
    public NormalVideoView.a b;
    private final j d;
    private volatile boolean e;
    private VideoView.b f;
    private VideoView.d g;

    static {
        kge.a(703764192);
        kge.a(887644476);
    }

    public static /* synthetic */ Object ipc$super(p pVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1857981988:
                super.onDidAppear();
                return null;
            case -236809011:
                super.onWillAppear();
                return null;
            case 1252518699:
                super.onDisAppear();
                return null;
            case 1889499016:
                return super.a();
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public p(Context context, eyx eyxVar, eyy eyyVar, DataEntry... dataEntryArr) {
        super(context, eyxVar, eyyVar, dataEntryArr);
        this.d = new j(-1, -1, 17);
        this.e = true;
        this.b = new NormalVideoView.a() { // from class: com.taobao.android.detail.ttdetail.component.module.p.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.a
            public void a(NormalVideoView normalVideoView, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("bb1a0a08", new Object[]{this, normalVideoView, new Boolean(z)});
                } else {
                    com.taobao.android.detail.ttdetail.communication.c.a(p.this.mContext, new com.taobao.android.detail.ttdetail.bizmessage.f(z));
                }
            }
        };
        this.g = new VideoView.d() { // from class: com.taobao.android.detail.ttdetail.component.module.p.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.d
            public boolean a(VideoView videoView) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("a8b91589", new Object[]{this, videoView})).booleanValue();
                }
                if (!p.this.k()) {
                    return true;
                }
                h hVar = (h) p.this.getParentComponent();
                String b = hVar != null ? ((ezc) hVar.getComponentData()).b() : null;
                int[] iArr = new int[2];
                videoView.getLocationOnScreen(iArr);
                p.this.triggerClickEvent(new RuntimeAbilityParam(com.taobao.android.detail.ttdetail.handler.bizhandlers.a.KEY_OPEN_SOURCE, ShowLightOffMessage.Source.VIDEO_COMPONENT), new RuntimeAbilityParam(com.taobao.android.detail.ttdetail.handler.bizhandlers.a.KEY_FRAME_COMPONENT_ID, b), new RuntimeAbilityParam(com.taobao.android.detail.ttdetail.handler.bizhandlers.a.KEY_TRIGGER_VIEW_RECT, new Rect(iArr[0], iArr[1], iArr[0] + videoView.getWidth(), iArr[1] + videoView.getHeight())));
                return true;
            }
        };
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.k
    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        JSONObject a2 = super.a();
        JSONObject d = this.mComponentData.d();
        if (d != null) {
            a2.put(com.taobao.android.fluid.business.usertrack.track.b.PROPERTY_VIDEO_ID, (Object) d.getString("videoId"));
        }
        return a2;
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view}) : a(view);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public j onGetFrameSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("dd5270c3", new Object[]{this, new Integer(i), new Integer(i2)}) : this.d;
    }

    public View a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9c7a352c", new Object[]{this, view});
        }
        if (view == null || view.getId() != R.id.vv_video_content) {
            com.taobao.android.detail.ttdetail.performance.d a2 = com.taobao.android.detail.ttdetail.performance.d.a(this.mContext);
            if (a2 != null) {
                view = a2.a(this.mContext, R.layout.tt_detail_video_component, null, true);
            } else {
                view = LayoutInflater.from(this.mContext).inflate(R.layout.tt_detail_video_component, (ViewGroup) null);
            }
        }
        NormalVideoView normalVideoView = (NormalVideoView) view.findViewById(R.id.vv_video_content);
        ImageView coverImageView = normalVideoView.getCoverImageView();
        if (coverImageView instanceof TTObservedImageView) {
            ((TTObservedImageView) coverImageView).setObserveListener(this.c);
        }
        normalVideoView.bindData(this.mComponentData, this.mDetailContext);
        normalVideoView.setOnUserClickPlay(this.b);
        normalVideoView.setVideoOnClickListener(this.g);
        normalVideoView.setVideoLifecycleListener(this.f);
        if (this.e) {
            normalVideoView.showCoverImage();
            normalVideoView.switchToPauseUI();
            this.e = false;
        }
        this.f10556a = normalVideoView;
        return view;
    }

    public void a(VideoView.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d9f34c7", new Object[]{this, bVar});
            return;
        }
        this.f = bVar;
        NormalVideoView normalVideoView = this.f10556a;
        if (normalVideoView == null) {
            return;
        }
        normalVideoView.setVideoLifecycleListener(this.f);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e294cd", new Object[]{this});
            return;
        }
        super.onWillAppear();
        d();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (m()) {
        } else {
            e();
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        NormalVideoView normalVideoView = this.f10556a;
        if (normalVideoView == null) {
            return false;
        }
        boolean attachDwInstanceView = normalVideoView.attachDwInstanceView();
        if (!attachDwInstanceView) {
            j();
        }
        return attachDwInstanceView;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        NormalVideoView normalVideoView = this.f10556a;
        if (normalVideoView == null || !TextUtils.equals(normalVideoView.getVideoUrl(), NormalVideoView.getVideoUrl(this.mComponentData))) {
            return;
        }
        if (!this.f10556a.isBuildInCoverVisible()) {
            i();
            this.f10556a.hideCoverImage();
        } else {
            this.f10556a.showCoverImage();
        }
        if (!z && !this.f10556a.isVideoPlaying()) {
            this.f10556a.switchToPauseUI();
        } else {
            this.f10556a.switchToPlayUI();
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (m() || e()) {
        } else {
            j();
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.k
    public String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this});
        }
        String q = q();
        if (!TextUtils.isEmpty(q)) {
            return q;
        }
        String s = s();
        return TextUtils.isEmpty(s) ? t() : s;
    }

    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : NormalVideoView.getThumbnailUrl(this.mComponentData);
    }

    public String s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("255e0466", new Object[]{this}) : NormalVideoView.getVideoUrl(this.mComponentData);
    }

    public String t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("abe3bf05", new Object[]{this}) : NormalVideoView.getVideoId(this.mComponentData);
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        JSONObject d = this.mComponentData.d();
        if (d == null) {
            return null;
        }
        return d.getString("thumbnailDimension");
    }

    public FrameLayout o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("b93699a3", new Object[]{this}) : this.f10556a.getExtraView();
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        super.onDidAppear();
        h();
    }

    private boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        Boolean bool = (Boolean) com.taobao.android.detail.ttdetail.communication.c.b(this.mContext, new com.taobao.android.detail.ttdetail.bizmessage.d());
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        boolean b = com.taobao.android.detail.ttdetail.widget.video.a.a().b(this.mContext);
        Feature feature = (Feature) this.mDetailContext.a().a(Feature.class);
        boolean z2 = com.taobao.android.detail.ttdetail.utils.n.a(this.mContext, feature) || b;
        boolean a2 = com.taobao.android.detail.ttdetail.utils.n.a(feature);
        if (!z2 || a2) {
            z = false;
        }
        if (!z || m()) {
            return;
        }
        b(false);
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        NormalVideoView normalVideoView = this.f10556a;
        if (normalVideoView == null) {
            return false;
        }
        return normalVideoView.attachVideoLastFrame();
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        NormalVideoView normalVideoView = this.f10556a;
        if (normalVideoView == null) {
            return;
        }
        normalVideoView.hideAttachedVideoLastFrame();
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        NormalVideoView normalVideoView = this.f10556a;
        return normalVideoView != null && normalVideoView.isVideoPlaying();
    }

    public final boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d6ac0f", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (this.f10556a == null) {
            return false;
        }
        c(z);
        return this.f10556a.play();
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        NormalVideoView normalVideoView = this.f10556a;
        if (normalVideoView == null) {
            return false;
        }
        return normalVideoView.pause();
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa7eb2b", new Object[]{this});
            return;
        }
        super.onDisAppear();
        n();
    }

    private void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        JSONObject a2 = com.taobao.android.detail.ttdetail.utils.m.a(this.mDetailContext.a());
        a2.putAll(a());
        a2.put("playType", (Object) (z ? BizTaskData.MANUAL_TIME : "auto"));
        com.taobao.android.detail.ttdetail.utils.m.a(2101, "DetailVideoPlay_industry", a2);
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.a
    public Rect c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("61daa133", new Object[]{this});
        }
        if (this.mView == null || this.mView.getWindowToken() == null) {
            return null;
        }
        int[] iArr = new int[2];
        this.mView.getLocationOnScreen(iArr);
        return new Rect(iArr[0], iArr[1], iArr[0] + this.mView.getWidth(), iArr[1] + this.mView.getHeight());
    }
}
