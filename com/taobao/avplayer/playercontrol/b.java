package com.taobao.avplayer.playercontrol;

import android.app.Activity;
import android.os.Handler;
import android.taobao.windvane.export.adapter.ILocalizationService;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.aw;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import tb.kcl;
import tb.kge;

/* loaded from: classes6.dex */
public class b implements aw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DWContext f16563a;
    public ViewGroup b;
    private ViewGroup.LayoutParams c;
    private int d;
    private ViewGroup e;
    private com.taobao.avplayer.common.j f;
    private ProgressBar g;
    private TextView h;
    private FrameLayout i;
    private ImageView j;

    static {
        kge.a(845159185);
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
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
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

    @Override // com.taobao.avplayer.aw
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        }
    }

    public static /* synthetic */ com.taobao.avplayer.common.j a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.avplayer.common.j) ipChange.ipc$dispatch("86b00929", new Object[]{bVar}) : bVar.f;
    }

    public static /* synthetic */ TextView b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("2b1d34e3", new Object[]{bVar}) : bVar.h;
    }

    public b(DWContext dWContext, ViewGroup viewGroup, com.taobao.avplayer.common.j jVar) {
        this.f16563a = dWContext;
        this.b = viewGroup;
        this.f = jVar;
        d();
        this.f16563a.getVideo().b(this);
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_sdk_DWFloatViewController);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.i.setVisibility(8);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.i = new FrameLayout(this.f16563a.getActivity());
        this.g = (ProgressBar) LayoutInflater.from(this.f16563a.getActivity()).inflate(R.layout.dw_tbavsdk_video_silence, (ViewGroup) null, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, kcl.a(this.f16563a.getActivity(), 2.0f));
        layoutParams.gravity = 80;
        this.i.addView(this.g, 0, layoutParams);
        this.h = new TextView(this.f16563a.getActivity());
        this.h.setEllipsize(TextUtils.TruncateAt.END);
        this.h.setMaxLines(1);
        this.h.setTextSize(2, 12.0f);
        this.h.setTextColor(-1);
        this.h.setText(ILocalizationService.APP_LOAD_FAIL);
        this.h.setGravity(17);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, kcl.a(this.f16563a.getActivity(), 40.0f));
        layoutParams2.gravity = 17;
        this.i.addView(this.h, layoutParams2);
        this.h.setVisibility(8);
        this.j = new ImageView(this.f16563a.getActivity());
        this.j.setImageResource(R.drawable.dw_floatview_close_icon);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(kcl.a(this.f16563a.getActivity(), 30.0f), kcl.a(this.f16563a.getActivity(), 30.0f));
        layoutParams3.gravity = 53;
        this.i.addView(this.j, layoutParams3);
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.avplayer.playercontrol.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (b.this.f16563a == null || !b.this.f16563a.isFloating()) {
                } else {
                    if ((b.a(b.this) == null || !b.a(b.this).b()) && b.a(b.this) != null) {
                        return;
                    }
                    b.this.c();
                }
            }
        });
        a();
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        try {
            if (!this.f16563a.isFloating() && (this.f16563a.getActivity() instanceof Activity)) {
                this.f16563a.setFloating(true);
                this.e = (ViewGroup) this.b.getParent();
                FrameLayout frameLayout = (FrameLayout) this.f16563a.getActivity().getWindow().getDecorView();
                if (this.b.getLayoutParams() != null) {
                    this.c = this.b.getLayoutParams();
                }
                int c = (int) (kcl.c() * 0.46f);
                int ceil = (int) Math.ceil(c * (this.f16563a.mHeight / this.f16563a.mWidth));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c, ceil);
                layoutParams.topMargin = (kcl.d() - kcl.a(this.f16563a.getActivity())) + ((this.f16563a.getActivity() == null || this.f16563a.getActivity().getWindow() == null || this.f16563a.getActivity().getWindow().findViewById(16908290) == null) ? 0 : this.f16563a.getActivity().getWindow().findViewById(16908290).getTop()) + 10;
                layoutParams.leftMargin = (kcl.c() - 10) - c;
                this.d = this.e.indexOfChild(this.b);
                this.e.removeView(this.b);
                frameLayout.addView(this.b, layoutParams);
                this.f.a(c, ceil);
                if (this.i.getParent() == null) {
                    this.b.addView(this.i, new ViewGroup.LayoutParams(-1, -1));
                }
                this.i.setVisibility(0);
                this.i.setBackgroundColor(this.f16563a.getActivity().getResources().getColor(R.color.dw_interactive_sdk_transparent));
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        try {
            this.f16563a.setFloating(false);
            ((ViewGroup) this.b.getParent()).removeView(this.b);
            this.e.addView(this.b, this.d, this.c);
            this.f.a();
            if (this.i.getParent() != null) {
                this.b.removeView(this.i);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        this.i.setBackgroundColor(this.f16563a.getActivity().getResources().getColor(R.color.dw_tbavsdk_black_a));
        TextView textView = this.h;
        if (textView != null) {
            textView.setVisibility(0);
        }
        new Handler().postDelayed(new Runnable() { // from class: com.taobao.avplayer.playercontrol.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (b.b(b.this) == null) {
                } else {
                    b.b(b.this).setVisibility(8);
                    if (b.this.f16563a == null || !b.this.f16563a.isFloating()) {
                        return;
                    }
                    if ((b.a(b.this) == null || !b.a(b.this).b()) && b.a(b.this) != null) {
                        return;
                    }
                    b.this.c();
                }
            }
        }, 2000L);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        int i4 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if (i3 > 0) {
            i4 = (int) Math.ceil(((i * 1.0f) / i3) * 1000.0f);
        }
        this.g.setProgress(i4);
        this.g.setSecondaryProgress(i2 * 10);
    }
}
