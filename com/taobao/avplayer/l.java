package com.taobao.avplayer;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.core.model.DWStabilityData;
import com.taobao.mediaplay.MediaPlayControlContext;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import java.util.HashMap;
import java.util.Map;
import tb.kck;
import tb.kcl;
import tb.kge;

/* loaded from: classes6.dex */
public class l implements aw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String d;

    /* renamed from: a  reason: collision with root package name */
    public DWContext f16523a;
    public boolean b;
    public boolean c;
    private DWVideoContainer e;
    private m f;
    private k g;
    private ProgressBar h;
    private Animation i;
    private au j;
    private boolean k;
    private long l;
    private long m;
    private boolean n;
    private boolean o;
    private boolean p = true;
    private boolean q;
    private boolean r;

    /* loaded from: classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public Activity f16529a;
        public String b;
        public String c;
        public String e;
        public String f;
        public int g;
        public int h;
        public com.taobao.avplayer.common.p i;
        public com.taobao.avplayer.common.v j;
        public as k;
        public ap l;
        public com.taobao.avplayer.common.d m;
        public Map<String, String> n;
        public boolean p;
        public String q;
        public boolean s;
        public boolean t;
        public com.taobao.avplayer.common.ad u;
        public long d = -1;
        public boolean o = true;
        public boolean r = false;

        static {
            kge.a(182240584);
        }
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddec2135", new Object[]{this, bVar});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    public static /* synthetic */ void a(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a924573", new Object[]{lVar});
        } else {
            lVar.i();
        }
    }

    public static /* synthetic */ boolean a(l lVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17b71bc5", new Object[]{lVar, new Boolean(z)})).booleanValue();
        }
        lVar.p = z;
        return z;
    }

    public static /* synthetic */ m b(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("92b3f17c", new Object[]{lVar}) : lVar.f;
    }

    public static /* synthetic */ void c(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c345431", new Object[]{lVar});
        } else {
            lVar.k();
        }
    }

    public static /* synthetic */ k d(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("76073d7c", new Object[]{lVar}) : lVar.g;
    }

    public static /* synthetic */ ProgressBar e(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProgressBar) ipChange.ipc$dispatch("ee6d52bb", new Object[]{lVar}) : lVar.h;
    }

    public static /* synthetic */ void f(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eea76a4e", new Object[]{lVar});
        } else {
            lVar.j();
        }
    }

    public static /* synthetic */ DWVideoContainer g(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWVideoContainer) ipChange.ipc$dispatch("418643d9", new Object[]{lVar}) : lVar.e;
    }

    static {
        kge.a(-464235296);
        kge.a(-123403623);
        d = "DWGifInstance";
    }

    public l(b bVar) {
        boolean z = true;
        this.f16523a = new DWContext(bVar.f16529a);
        this.f16523a.mPlayContext = new MediaPlayControlContext(bVar.f16529a);
        this.f16523a.mPlayContext.setVideoUrl(bVar.b);
        this.f16523a.mPlayContext.mConfigGroup = "DWInteractive";
        this.f16523a.mPlayContext.setPlayerType(3);
        this.f16523a.mWidth = bVar.g;
        this.f16523a.mHeight = bVar.h;
        this.f16523a.mNormalWidth = bVar.g;
        this.f16523a.mNormalHeight = bVar.h;
        this.f16523a.mDWImageAdapter = bVar.i;
        this.f16523a.mNetworkAdapter = bVar.j;
        this.f16523a.mUTAdapter = bVar.k;
        this.f16523a.mConfigAdapter = bVar.l;
        this.f16523a.mConfigParamsAdapter = bVar.m;
        this.f16523a.mute(bVar.s);
        this.f16523a.mNeedVideoCache = (Build.VERSION.SDK_INT == 19 || !bVar.r) ? false : z;
        this.f16523a.mUserId = bVar.d;
        DWContext dWContext = this.f16523a;
        MediaPlayControlContext mediaPlayControlContext = dWContext.mPlayContext;
        String str = bVar.e;
        mediaPlayControlContext.mFrom = str;
        dWContext.mFrom = str;
        DWContext dWContext2 = this.f16523a;
        MediaPlayControlContext mediaPlayControlContext2 = dWContext2.mPlayContext;
        String str2 = bVar.f;
        mediaPlayControlContext2.mVideoId = str2;
        dWContext2.mVideoId = str2;
        this.f16523a.setInstanceType(DWInstanceType.GIF);
        this.f16523a.mPlayContext.mBusinessId = "DWGif";
        this.q = bVar.o;
        a(bVar);
        b(bVar);
        if (bVar.n != null) {
            this.f16523a.addUtParams(bVar.n);
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_sdk_DWGifInstance);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.k = true;
        if (!g()) {
            if (kck.a()) {
                throw new RuntimeException("please set bizcode , source and  videoUrl parameters");
            }
            com.taobao.taobaoavsdk.util.c.b("DWInstance", "please set mBizcode , mVideoSource and  mVideoUrl parameters");
        }
        h();
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.f16523a.mPlayContext.getVideoUrl())) {
            return false;
        }
        if (TextUtils.isEmpty(this.f16523a.mFrom)) {
            this.f16523a.mFrom = "default";
        }
        return !TextUtils.isEmpty(this.f16523a.mVideoId);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.f16523a.mFrom)) {
            hashMap.put("page", this.f16523a.mFrom.toLowerCase());
        }
        if (!TextUtils.isEmpty(this.f16523a.mVideoId)) {
            hashMap.put(com.taobao.android.fluid.business.usertrack.track.b.PROPERTY_VIDEO_ID, this.f16523a.mVideoId + "");
        }
        hashMap.put("userId", String.valueOf(this.f16523a.mUserId));
        hashMap.put("interactId", String.valueOf(this.f16523a.mInteractiveId));
        hashMap.put("mediaType", "4");
        this.f16523a.addUtParams(hashMap);
    }

    private void b(final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de98ccd4", new Object[]{this, bVar});
            return;
        }
        this.f = new m(this.f16523a, bVar.t);
        this.e = new DWVideoContainer(this.f16523a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f16523a.mWidth, this.f16523a.mHeight);
        layoutParams.gravity = 17;
        this.e.addView(this.f.d(), layoutParams);
        if (bVar.p && !TextUtils.isEmpty(bVar.q)) {
            this.g = new k(this.f16523a, bVar.q);
            this.g.a().setOnClickListener(new View.OnClickListener() { // from class: com.taobao.avplayer.l.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    l.a(l.this, false);
                    l.a(l.this);
                    l.b(l.this).i();
                    l.c(l.this);
                }
            });
            this.e.addView(this.g.a(), new FrameLayout.LayoutParams(this.f16523a.mWidth, this.f16523a.mHeight));
        }
        this.f.d().setOnClickListener(new View.OnClickListener() { // from class: com.taobao.avplayer.l.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (TextUtils.isEmpty(bVar.c) || l.this.f16523a.getDWEventAdapter() == null) {
                } else {
                    l.this.f16523a.getDWEventAdapter().a(bVar.c);
                    HashMap hashMap = new HashMap();
                    hashMap.put("link", "success");
                    l.this.f16523a.mUTAdapter.a("DWVideo", "Button", "videopicLink", l.this.f16523a.getUTParams(), hashMap);
                }
            }
        });
        if (this.h == null && this.q) {
            this.h = new ProgressBar(this.f16523a.getActivity());
            this.h.setVisibility(8);
            this.h.setIndeterminateDrawable(this.f16523a.getActivity().getResources().getDrawable(R.drawable.tbavsdk_video_loading));
            this.i = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            this.i.setDuration(600L);
            this.i.setInterpolator(new LinearInterpolator());
            this.i.setRepeatCount(-1);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(kcl.a(this.f16523a.getActivity(), 80.0f), kcl.a(this.f16523a.getActivity(), 80.0f));
            layoutParams2.gravity = 17;
            this.e.addView(this.h, layoutParams2);
        }
        this.f.a(new com.taobao.avplayer.common.ae() { // from class: com.taobao.avplayer.l.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.avplayer.common.ae
            public void a(com.taobao.avplayer.player.c cVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d4f22b7c", new Object[]{this, cVar});
                } else if (l.d(l.this) == null || l.d(l.this).a() == null || l.b(l.this).t() != 1) {
                } else {
                    if (l.d(l.this).a().getVisibility() != 0 && l.e(l.this).getVisibility() != 0) {
                        return;
                    }
                    if (!l.this.b && Build.VERSION.SDK_INT >= 17) {
                        return;
                    }
                    l.f(l.this);
                    l.g(l.this).postDelayed(new Runnable() { // from class: com.taobao.avplayer.l.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (l.d(l.this) == null) {
                            } else {
                                l.d(l.this).a().setVisibility(8);
                            }
                        }
                    }, 400L);
                }
            }
        });
        this.f.a(this);
    }

    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.e;
    }

    public void a(au auVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1736025d", new Object[]{this, auVar});
        } else {
            this.j = auVar;
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (!this.q || this.i == null) {
        } else {
            this.h.setVisibility(0);
            this.h.setAnimation(this.i);
            this.i.start();
        }
    }

    private void j() {
        ProgressBar progressBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (!this.q || (progressBar = this.h) == null || progressBar.getVisibility() == 8) {
        } else {
            this.h.clearAnimation();
            this.h.setVisibility(8);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        m mVar = this.f;
        if (mVar == null || !mVar.e()) {
            return;
        }
        i();
        this.f.i();
    }

    public void d() {
        m mVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.f.t() == 1 || (mVar = this.f) == null) {
        } else {
            mVar.j();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        m mVar = this.f;
        if (mVar == null) {
            return;
        }
        mVar.m();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.r) {
        } else {
            this.r = true;
            m();
            m mVar = this.f;
            if (mVar == null) {
                return;
            }
            mVar.l();
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        l();
        au auVar = this.j;
        if (auVar != null) {
            auVar.a();
        }
        this.m = System.currentTimeMillis();
        DWContext dWContext = this.f16523a;
        if (dWContext == null || dWContext.mDWAlarmAdapter == null) {
            return;
        }
        DWStabilityData dWStabilityData = new DWStabilityData();
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append("bizCode=");
        stringBuffer.append(this.f16523a.mFrom);
        stringBuffer.append(",videoId=");
        stringBuffer.append(this.f16523a.mVideoId);
        stringBuffer.append(",useCache=");
        m mVar = this.f;
        stringBuffer.append(mVar != null ? mVar.a() : false);
        stringBuffer.append(",hitCache=");
        m mVar2 = this.f;
        if (mVar2 != null) {
            z = mVar2.b();
        }
        stringBuffer.append(z);
        stringBuffer.append(",url=");
        stringBuffer.append(this.f16523a.mPlayContext.getVideoUrl());
        stringBuffer.append(",videoSource=");
        stringBuffer.append(this.f16523a.getVideoSource());
        dWStabilityData.args = stringBuffer.toString();
        this.f16523a.mDWAlarmAdapter.a(this.f16523a.getActivity(), "DWGif", "GifPlay", true, dWStabilityData);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            return;
        }
        au auVar = this.j;
        if (auVar == null) {
            return;
        }
        auVar.b();
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
            return;
        }
        au auVar = this.j;
        if (auVar != null) {
            auVar.c();
        }
        this.m = System.currentTimeMillis();
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        k kVar = this.g;
        if (kVar != null) {
            kVar.a().setVisibility(8);
        }
        j();
        au auVar = this.j;
        if (auVar != null) {
            auVar.a(obj, i, i2);
        }
        DWContext dWContext = this.f16523a;
        if (dWContext == null || dWContext.mDWAlarmAdapter == null) {
            return;
        }
        DWStabilityData dWStabilityData = new DWStabilityData();
        dWStabilityData.code = String.valueOf(i);
        dWStabilityData.msg = String.valueOf(i2);
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append("bizCode=");
        stringBuffer.append(this.f16523a.mFrom);
        stringBuffer.append(",videoId=");
        stringBuffer.append(this.f16523a.mVideoId);
        stringBuffer.append(",useCache=");
        m mVar = this.f;
        stringBuffer.append(mVar != null ? mVar.a() : false);
        stringBuffer.append(",hitCache=");
        m mVar2 = this.f;
        if (mVar2 != null) {
            z = mVar2.b();
        }
        stringBuffer.append(z);
        stringBuffer.append(",url=");
        stringBuffer.append(this.f16523a.mPlayContext.getVideoUrl());
        stringBuffer.append(",videoSource=");
        stringBuffer.append(this.f16523a.getVideoSource());
        dWStabilityData.args = stringBuffer.toString();
        this.f16523a.mDWAlarmAdapter.a(this.f16523a.getActivity(), "DWGif", "GifPlay", false, dWStabilityData);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        } else if (3 != j) {
        } else {
            this.b = true;
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        au auVar = this.j;
        if (auVar == null) {
            return;
        }
        auVar.d();
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if (this.m != 0) {
            this.l += System.currentTimeMillis() - this.m;
        }
        this.m = System.currentTimeMillis();
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (this.c) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("wifiAuto", String.valueOf(this.p));
            if (this.f16523a.mUTAdapter != null) {
                this.f16523a.mUTAdapter.a("DWVideo", "Button", "videopicClick", this.f16523a.getUTParams(), hashMap);
            }
            if (kck.a()) {
                String str = d;
                com.taobao.taobaoavsdk.util.c.a(str, "commitFirstPlayClickUT -->:" + this.f16523a.getUTParams().toString() + " extendParams:" + hashMap.toString());
            }
            this.c = true;
        }
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        if (!this.o) {
            hashMap.put("wifiAuto", String.valueOf(this.p));
        }
        if (this.f16523a.mUTAdapter != null) {
            this.f16523a.mUTAdapter.a("DWVideo", "Button", "videopicPlay", this.f16523a.getUTParams(), hashMap);
        }
        if (kck.a()) {
            String str = d;
            com.taobao.taobaoavsdk.util.c.a(str, "commitFirstPlayUT -->:" + this.f16523a.getUTParams().toString() + " extendParams:" + hashMap.toString());
        }
        this.o = true;
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (this.n) {
        } else {
            if (this.f16523a.mUTAdapter != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("playTime", String.valueOf(this.l));
                this.f16523a.mUTAdapter.a("DWVideo", "Button", "videopicPlaytime", this.f16523a.getUTParams(), hashMap);
                if (kck.a()) {
                    String str = d;
                    com.taobao.taobaoavsdk.util.c.a(str, "commitPlayTimeUT -->:" + this.f16523a.getUTParams().toString() + " extendParams:" + hashMap.toString());
                }
            }
            this.n = true;
        }
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public b f16528a = new b();

        static {
            kge.a(-1924641865);
        }

        public a(Activity activity) {
            this.f16528a.f16529a = activity;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("68fa320", new Object[]{this, str});
            }
            this.f16528a.b = str;
            return this;
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.f16528a.s = z;
            }
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("57357f89", new Object[]{this, new Integer(i)});
            }
            if (i <= 0) {
                i = kcl.a();
            }
            this.f16528a.g = i;
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("57e22b28", new Object[]{this, new Integer(i)});
            }
            if (i <= 0) {
                i = kcl.a(600.0f);
            }
            this.f16528a.h = i;
            return this;
        }

        public a a(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c3bc9839", new Object[]{this, hashMap});
            }
            this.f16528a.n = hashMap;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("264447f9", new Object[]{this, new Boolean(z)});
            }
            this.f16528a.p = z;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7c09c961", new Object[]{this, str});
            }
            this.f16528a.q = str;
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("26f0f398", new Object[]{this, new Boolean(z)});
            }
            this.f16528a.r = z;
            return this;
        }

        public a d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("279d9f37", new Object[]{this, new Boolean(z)});
            }
            this.f16528a.t = z;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f183efa2", new Object[]{this, str});
            }
            this.f16528a.f = str;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("66fe15e3", new Object[]{this, str});
            }
            this.f16528a.e = str;
            return this;
        }
    }
}
