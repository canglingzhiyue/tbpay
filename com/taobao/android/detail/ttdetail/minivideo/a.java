package com.taobao.android.detail.ttdetail.minivideo;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.ShowLightOffMessage;
import com.taobao.android.detail.ttdetail.bizmessage.e;
import com.taobao.android.detail.ttdetail.communication.c;
import com.taobao.android.detail.ttdetail.communication.f;
import com.taobao.android.detail.ttdetail.performance.d;
import com.taobao.android.detail.ttdetail.utils.m;
import com.taobao.android.detail.ttdetail.utils.n;
import com.taobao.android.detail.ttdetail.widget.draglayout.DragLayout;
import com.taobao.android.detail.ttdetail.widget.video.AbsMiniVideoView;
import com.taobao.android.detail.ttdetail.widget.video.BizMiniVideoView;
import com.taobao.android.detail.ttdetail.widget.video.MiniVideoView;
import com.taobao.android.detail.ttdetail.widget.video.b;
import com.taobao.taobao.R;
import java.util.List;
import java.util.Map;
import tb.eyx;
import tb.ezc;
import tb.eze;
import tb.kge;
import tb.lfn;

/* loaded from: classes5.dex */
public class a implements f<e, Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f10767a;
    private eyx b;
    private List<ezc> c;
    private DragLayout d;
    private AbsMiniVideoView e;
    private ViewGroup f;
    private String g;
    private String h;
    private volatile boolean i;
    private MiniVideoType j;
    private volatile boolean k;
    private List<lfn> l;
    private boolean m;

    static {
        kge.a(-340845157);
        kge.a(1548924286);
    }

    public static /* synthetic */ Context a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("1f92eb8c", new Object[]{aVar}) : aVar.f10767a;
    }

    public static /* synthetic */ void a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b05b55e", new Object[]{aVar, str});
        } else {
            aVar.d(str);
        }
    }

    public static /* synthetic */ void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d46cba15", new Object[]{aVar});
        } else {
            aVar.k();
        }
    }

    public static /* synthetic */ List c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("9f3307f1", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ void d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eee21d17", new Object[]{aVar});
        } else {
            aVar.i();
        }
    }

    public static /* synthetic */ void e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c1cce98", new Object[]{aVar});
        } else {
            aVar.f();
        }
    }

    public static /* synthetic */ DragLayout f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DragLayout) ipChange.ipc$dispatch("79dec33", new Object[]{aVar}) : aVar.d;
    }

    public a(Context context, eyx eyxVar) {
        this.f10767a = context;
        this.b = eyxVar;
        a(context);
        c.a(this.f10767a, e.class, this);
    }

    private void a(Context context) {
        View inflate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        d a2 = d.a(context);
        if (a2 != null) {
            inflate = a2.a(context, R.layout.tt_detail_mini_video_drag_wrapper, null, true);
        } else {
            inflate = LayoutInflater.from(context).inflate(R.layout.tt_detail_mini_video_drag_wrapper, (ViewGroup) null);
        }
        this.d = (DragLayout) inflate.findViewById(R.id.dl_mini_video_drag_container);
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.e = new MiniVideoView(this.f10767a);
        l();
        this.m = true;
        this.e.setOnMiniVideoListener(new b() { // from class: com.taobao.android.detail.ttdetail.minivideo.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.video.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.b
            public void a(View view, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("76c0c6b4", new Object[]{this, view, str});
                    return;
                }
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                c.a(a.a(a.this), new ShowLightOffMessage(ShowLightOffMessage.Source.MINI_VIDEO, str, new Rect(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight())));
                a.a(a.this, "FloatingVideo");
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.b
            public void a(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                } else {
                    a.b(a.this);
                }
            }
        });
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.e = new BizMiniVideoView(this.f10767a);
        l();
        this.m = false;
        this.e.setOnMiniVideoListener(new b() { // from class: com.taobao.android.detail.ttdetail.minivideo.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.video.b
            public void a(View view, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("76c0c6b4", new Object[]{this, view, str});
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.b
            public void a(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                } else {
                    a.b(a.this);
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (a.c(a.this) != null && !a.c(a.this).isEmpty()) {
                    a.d(a.this);
                    a.e(a.this);
                } else {
                    a.this.e();
                }
            }
        });
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        e();
        d("FloatingVideo_Close");
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 53;
        layoutParams.topMargin = com.taobao.android.detail.ttdetail.utils.f.a(196.0f);
        this.e.setWindowRatio(3.75f);
        this.d.removeAllViews();
        this.d.addView(this.e, layoutParams);
        this.d.setTargetView(this.e);
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        JSONObject a2 = m.a(this.b.a());
        a2.put(com.taobao.android.fluid.business.usertrack.track.b.PROPERTY_VIDEO_ID, (Object) e("videoId"));
        m.a(2101, str, a2);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.k;
    }

    public boolean a(MiniVideoType miniVideoType) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f0da98bb", new Object[]{this, miniVideoType})).booleanValue() : a() && miniVideoType == this.j;
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        List<ezc> list = this.c;
        if (list != null && !list.isEmpty()) {
            for (ezc ezcVar : this.c) {
                if (StringUtils.equals(str, ezcVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    private String e(String str) {
        Map<String, String> videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("666b162a", new Object[]{this, str});
        }
        AbsMiniVideoView absMiniVideoView = this.e;
        if (absMiniVideoView != null && (videoInfo = absMiniVideoView.getVideoInfo()) != null) {
            return videoInfo.get(str);
        }
        return null;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!a() || this.f == null || this.d.getParent() != this.f) {
        } else {
            this.d.setVisibility(8);
            this.g = e("videoUrl");
            AbsMiniVideoView absMiniVideoView = this.e;
            if (absMiniVideoView == null) {
                return;
            }
            this.i = absMiniVideoView.pause();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!a() || this.f == null || this.d.getParent() != this.f) {
        } else {
            this.d.setVisibility(0);
            if (!this.i) {
                return;
            }
            this.i = false;
            AbsMiniVideoView absMiniVideoView = this.e;
            if (absMiniVideoView == null) {
                return;
            }
            absMiniVideoView.play(this.g);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!a() || this.f == null || this.d.getParent() != this.f || !this.i) {
        } else {
            this.i = false;
            AbsMiniVideoView absMiniVideoView = this.e;
            if (absMiniVideoView == null) {
                return;
            }
            absMiniVideoView.play(this.g);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (!a() || this.f == null || this.d.getParent() != this.f) {
        } else {
            this.g = e("videoUrl");
            AbsMiniVideoView absMiniVideoView = this.e;
            if (absMiniVideoView == null) {
                return;
            }
            this.i = absMiniVideoView.pause();
        }
    }

    public Rect d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("9b2bb1f4", new Object[]{this});
        }
        AbsMiniVideoView absMiniVideoView = this.e;
        if (absMiniVideoView != null && absMiniVideoView.getWindowToken() != null) {
            return this.e.getContentScreenRect();
        }
        return null;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        AbsMiniVideoView absMiniVideoView = this.e;
        if (absMiniVideoView == null) {
            return;
        }
        absMiniVideoView.attachVideoLastFrame(str);
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        AbsMiniVideoView absMiniVideoView = this.e;
        if (absMiniVideoView == null) {
            return;
        }
        absMiniVideoView.play(str);
    }

    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
        } else {
            this.f = viewGroup;
        }
    }

    private void f() {
        JSONObject trackParams;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        if ((this.l != null || this.c != null) && this.f != null) {
            z = true;
        }
        this.k = z;
        if (!a()) {
            e();
            return;
        }
        c.a(this.f10767a, e.class, this);
        ViewParent parent = this.d.getParent();
        if (parent != this.f) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.d);
            }
            this.f.addView(this.d, new ViewGroup.LayoutParams(-1, -1));
        }
        AbsMiniVideoView absMiniVideoView = this.e;
        if (absMiniVideoView == null) {
            return;
        }
        absMiniVideoView.bindDetailContext(this.b);
        this.e.setVideoData(this.m ? this.c : this.l);
        this.e.play(this.h);
        JSONObject a2 = m.a(this.b.a());
        a2.put(com.taobao.android.fluid.business.usertrack.track.b.PROPERTY_VIDEO_ID, (Object) e("videoId"));
        if (!this.m && (trackParams = this.e.getTrackParams()) != null && !trackParams.isEmpty()) {
            a2.putAll(trackParams);
        }
        m.a(2201, "FloatingVideo", a2);
    }

    public void a(eze ezeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7d48288", new Object[]{this, ezeVar});
            return;
        }
        this.l = null;
        this.c = null;
        this.h = e("videoUrl");
        if (n.a(this.f10767a)) {
            return;
        }
        if (ezeVar == null) {
            return;
        }
        try {
            List<lfn> k = ezeVar.k();
            if (k != null && !k.isEmpty()) {
                this.l = k;
                j();
            }
            List<ezc> p = ezeVar.p();
            if (p != null && !p.isEmpty()) {
                this.c = p;
                if (this.l == null) {
                    i();
                }
            }
            this.j = MiniVideoType.INDEPENDENT;
        } finally {
            f();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.k = false;
        AbsMiniVideoView absMiniVideoView = this.e;
        if (absMiniVideoView != null) {
            absMiniVideoView.detachVideoView();
        }
        ViewParent parent = this.d.getParent();
        if (parent instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup) parent;
            if (Build.VERSION.SDK_INT >= 18 && viewGroup.isInLayout()) {
                this.b.b().a(new Runnable() { // from class: com.taobao.android.detail.ttdetail.minivideo.a.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            viewGroup.removeView(a.f(a.this));
                        }
                    }
                });
            } else {
                viewGroup.removeView(this.d);
            }
        }
        c.a(this.f10767a, this);
    }

    @Override // com.taobao.android.detail.ttdetail.communication.f
    public Boolean a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("8b959779", new Object[]{this, eVar}) : Boolean.valueOf(a(eVar.a()));
    }
}
