package com.taobao.avplayer.playercontrol;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.aw;
import com.taobao.mediaplay.playercontrol.ProgressImageView;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import tb.kcl;
import tb.kcm;
import tb.kge;

/* loaded from: classes6.dex */
public class e implements aw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f16568a;
    private DWContext b;
    private ProgressImageView c;
    private TextView d;
    private TextView e;
    private Animation f;
    private View g;
    private boolean h;
    private boolean i = true;

    static {
        kge.a(-1492837851);
        kge.a(-123403623);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
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
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    public static /* synthetic */ DWContext a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWContext) ipChange.ipc$dispatch("e8f4e388", new Object[]{eVar}) : eVar.b;
    }

    public static /* synthetic */ void a(e eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e28d9f7", new Object[]{eVar, str});
        } else {
            eVar.a(str);
        }
    }

    public static /* synthetic */ boolean a(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e08f0b", new Object[]{eVar, new Boolean(z)})).booleanValue();
        }
        eVar.h = z;
        return z;
    }

    public e(DWContext dWContext) {
        this.b = dWContext;
        h();
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_sdk_DWNoticeViewController);
    }

    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.f16568a;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.f16568a = (ViewGroup) LayoutInflater.from(this.b.getActivity()).inflate(R.layout.dw_tbavsdk_video_notice, (ViewGroup) null, false);
        this.g = this.f16568a.findViewById(R.id.tbavsdk_video_error_notice_layout);
        this.c = (ProgressImageView) this.f16568a.findViewById(R.id.tbavsdk_video_loading);
        this.f = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.f.setDuration(600L);
        this.f.setInterpolator(new LinearInterpolator());
        this.f.setRepeatCount(-1);
        this.d = (TextView) this.f16568a.findViewById(R.id.tbavsdk_video_retry_tv);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.avplayer.playercontrol.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (!kcm.a(e.a(e.this).getActivity())) {
                    e eVar = e.this;
                    e.a(eVar, e.a(eVar).getActivity().getString(R.string.tbavsdk_nonetwork_error_state));
                } else {
                    e.a(e.this, false);
                    e.a(e.this).getVideo().v();
                    e.this.b();
                }
            }
        });
        this.e = (TextView) this.f16568a.findViewById(R.id.tbavsdk_video_notice_tv);
        a(this.b.screenType());
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f16568a == null || this.b == null) {
        } else {
            this.d.setVisibility(8);
            this.e.setVisibility(8);
            if (this.h || this.b.isHiddenLoading()) {
                return;
            }
            this.g.setVisibility(8);
            this.c.setVisibility(0);
            this.f16568a.setVisibility(0);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.f16568a;
        if (viewGroup == null || viewGroup.getVisibility() == 8) {
            return;
        }
        this.f16568a.setVisibility(8);
    }

    private void a(String str) {
        DWContext dWContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        ProgressImageView progressImageView = this.c;
        if (progressImageView != null) {
            progressImageView.setVisibility(8);
        }
        if (this.f16568a == null || (dWContext = this.b) == null || dWContext.isHiddenPlayErrorView() || !this.i) {
            return;
        }
        this.f16568a.setBackgroundColor(this.b.getActivity().getResources().getColor(R.color.dw_tbavsdk_black_a));
        this.g.setVisibility(0);
        this.d.setVisibility(0);
        this.e.setText(str);
        this.f16568a.setVisibility(0);
        this.e.setVisibility(0);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        ProgressImageView progressImageView = this.c;
        return progressImageView != null && progressImageView.getVisibility() == 8;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.c.setVisibility(8);
        this.f16568a.setBackgroundColor(this.b.getActivity().getResources().getColor(17170445));
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        } else {
            e();
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
        } else {
            e();
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        DWContext dWContext = this.b;
        if (dWContext != null && kcm.a(dWContext.getActivity())) {
            new Handler().postDelayed(new Runnable() { // from class: com.taobao.avplayer.playercontrol.e.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if ((e.a(e.this) != null && e.a(e.this).getVideo() != null && e.a(e.this).getVideo().u() != 3) || e.a(e.this) == null) {
                    } else {
                        e eVar = e.this;
                        e.a(eVar, e.a(eVar).getActivity().getString(R.string.dw_tbavsdk_video_error_for_server));
                    }
                }
            }, 2000L);
            return;
        }
        DWContext dWContext2 = this.b;
        if (dWContext2 == null) {
            return;
        }
        a(dWContext2.getActivity().getString(R.string.tbavsdk_nonetwork_error_state));
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
        } else {
            a(dWVideoScreenType);
        }
    }

    private void a(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8225b511", new Object[]{this, dWVideoScreenType});
        } else if (DWVideoScreenType.LANDSCAPE_FULL_SCREEN == dWVideoScreenType) {
            this.e.setTextSize(2, 18.0f);
            this.d.setTextSize(2, 18.0f);
            this.d.getLayoutParams().width = kcl.a(this.b.getActivity(), 100.0f);
            this.d.getLayoutParams().height = kcl.a(this.b.getActivity(), 40.0f);
            ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = kcl.a(this.b.getActivity(), 24.0f);
        } else {
            this.e.setTextSize(2, 13.0f);
            this.d.setTextSize(2, 13.0f);
            this.d.getLayoutParams().width = kcl.a(this.b.getActivity(), 80.0f);
            this.d.getLayoutParams().height = kcl.a(this.b.getActivity(), 30.0f);
            ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = kcl.a(this.b.getActivity(), 24.0f);
        }
    }

    public void a(String str, boolean z) {
        DWContext dWContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        ProgressImageView progressImageView = this.c;
        int i = 8;
        if (progressImageView != null) {
            progressImageView.setVisibility(8);
        }
        if (this.f16568a == null || (dWContext = this.b) == null || dWContext.isHiddenPlayErrorView()) {
            return;
        }
        this.i = z;
        this.h = true;
        this.g.setVisibility(0);
        if (this.g.getLayoutParams() != null && (this.g.getLayoutParams() instanceof FrameLayout.LayoutParams) && !z) {
            ((FrameLayout.LayoutParams) this.g.getLayoutParams()).topMargin = 0;
        }
        this.f16568a.setBackgroundColor(this.b.getActivity().getResources().getColor(R.color.dw_tbavsdk_black_a));
        TextView textView = this.d;
        if (z) {
            i = 0;
        }
        textView.setVisibility(i);
        this.e.setText(str);
        this.f16568a.setVisibility(0);
        this.e.setVisibility(0);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        TextView textView = this.d;
        if (textView != null) {
            textView.setOnClickListener(null);
        }
        ProgressImageView progressImageView = this.c;
        if (progressImageView == null) {
            return;
        }
        progressImageView.setVisibility(8);
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.f16568a.getVisibility() == 0 && this.d.getVisibility() == 0;
    }
}
