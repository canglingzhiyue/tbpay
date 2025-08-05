package com.taobao.avplayer.playercontrol;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWLifecycleType;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.aw;
import com.taobao.avplayer.common.q;
import com.taobao.avplayer.common.w;
import com.taobao.avplayer.core.model.DWResponse;
import com.taobao.avplayer.core.protocol.DWInteractiveVideoObject;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import tb.kca;
import tb.kcl;
import tb.kco;
import tb.kge;

/* loaded from: classes6.dex */
public class g implements aw, q {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String b;

    /* renamed from: a  reason: collision with root package name */
    public boolean f16572a;
    private FrameLayout c;
    private DWContext d;
    private ProgressBar e;
    private boolean g;
    private TextView h;
    private kca i;
    private a k;
    private boolean f = false;
    private DWLifecycleType j = DWLifecycleType.BEFORE;

    /* loaded from: classes6.dex */
    public interface a {
        void a();
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
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

    public static /* synthetic */ kca a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kca) ipChange.ipc$dispatch("4bc8912", new Object[]{gVar}) : gVar.i;
    }

    static {
        kge.a(1623073497);
        kge.a(-123403623);
        kge.a(556437024);
        b = g.class.getSimpleName();
    }

    public g(DWContext dWContext, FrameLayout frameLayout) {
        this.d = dWContext;
        this.c = frameLayout;
        d();
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_sdk_DWSmallBarViewController);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.e = (ProgressBar) LayoutInflater.from(this.d.getActivity()).inflate(R.layout.dw_tbavsdk_video_silence, (ViewGroup) null, false);
        if (this.d.isMiniProgressAnchorShown()) {
            this.i = new kca(this.d, this.e);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, kcl.a(this.d.getActivity(), 2.0f));
        layoutParams.gravity = 80;
        this.c.addView(this.e, 0, layoutParams);
        if (this.d.isHiddenMiniProgressBar()) {
            c(true);
        }
        if (!this.d.isHiddenPlayingIcon()) {
            this.h = new TextView(this.d.getActivity());
            this.h.setTextColor(this.d.getActivity().getResources().getColor(R.color.dw_interactive_sdk_white));
            this.h.setSingleLine();
            this.h.setTextSize(2, 14.0f);
            this.h.setShadowLayer(4.0f, 0.0f, 1.0f, this.d.getActivity().getResources().getColor(R.color.dw_interactive_sdk_black_12));
            this.h.setText(this.d.getActivity().getResources().getString(R.string.tbavsdk_defaulttime));
            this.h.setGravity(85);
            this.h.setPadding(0, 0, kcl.a(this.d.getActivity(), 3.0f), kcl.a(this.d.getActivity(), 2.0f));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(kcl.a(this.d.getActivity(), 80.0f), kcl.a(this.d.getActivity(), 40.0f));
            layoutParams2.rightMargin = kcl.a(this.d.getActivity(), 10.0f);
            layoutParams2.bottomMargin = kcl.a(this.d.getActivity(), 8.0f);
            layoutParams2.gravity = 85;
            this.c.addView(this.h, 1, layoutParams2);
        }
        b();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.i == null) {
        } else {
            this.g = true;
            this.d.queryInteractiveData(new w() { // from class: com.taobao.avplayer.playercontrol.g.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.avplayer.common.w
                public void onError(DWResponse dWResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1f1dda8d", new Object[]{this, dWResponse});
                    }
                }

                @Override // com.taobao.avplayer.common.w
                public void onSuccess(DWResponse dWResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c6105f72", new Object[]{this, dWResponse});
                        return;
                    }
                    try {
                        DWInteractiveVideoObject dWInteractiveVideoObject = new DWInteractiveVideoObject(dWResponse.data);
                        if (g.a(g.this) == null) {
                            return;
                        }
                        g.a(g.this).a(dWInteractiveVideoObject);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }, false);
        }
    }

    public void a(boolean z) {
        kca kcaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if ((this.j != DWLifecycleType.MID && z) || (kcaVar = this.i) == null) {
        } else {
            if (z) {
                if (!this.g) {
                    e();
                }
                this.i.a();
                return;
            }
            kcaVar.b();
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (c()) {
        } else {
            if (this.j == DWLifecycleType.MID && this.e != null) {
                b(false);
                a aVar = this.k;
                if (aVar != null) {
                    aVar.a();
                }
            }
            if (this.j == DWLifecycleType.MID && this.h != null && this.d.isMute()) {
                this.h.setVisibility(0);
            }
            this.f16572a = true;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (this.e == null) {
        } else {
            if (this.f && !z) {
                return;
            }
            this.f = false;
            this.e.setVisibility(0);
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else if (this.f) {
        } else {
            ProgressBar progressBar = this.e;
            if (progressBar != null && progressBar.getVisibility() != 4) {
                this.e.setVisibility(8);
            }
            this.f = z;
        }
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        TextView textView = this.h;
        if (textView == null) {
            return;
        }
        if (z && this.f16572a) {
            textView.setVisibility(0);
        } else {
            this.h.setVisibility(8);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!c()) {
        } else {
            if (this.e != null) {
                c(false);
            }
            TextView textView = this.h;
            if (textView != null) {
                textView.setVisibility(8);
            }
            this.f16572a = false;
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b85a538e", new Object[]{this, aVar});
        } else {
            this.k = aVar;
        }
    }

    public boolean c() {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        ProgressBar progressBar = this.e;
        if (progressBar == null) {
            return false;
        }
        return progressBar.getVisibility() == 0 || ((textView = this.h) != null && textView.getVisibility() == 0);
    }

    private void a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        int i4 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if (i3 > 0) {
            i4 = (int) Math.ceil(((i * 1.0f) / i3) * 1000.0f);
        }
        this.e.setProgress(i4);
        this.e.setSecondaryProgress(i2 * 10);
        if (i > i3) {
            i = i3;
        }
        if (this.h == null || !this.d.isMute()) {
            return;
        }
        this.h.setText(kco.a(i3 - i));
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        } else {
            b();
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        ProgressBar progressBar = this.e;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        b();
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            a(i, i2, i3);
        }
    }

    @Override // com.taobao.avplayer.common.q
    public void onLifecycleChanged(DWLifecycleType dWLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e41106", new Object[]{this, dWLifecycleType});
            return;
        }
        this.j = dWLifecycleType;
        if (this.j == DWLifecycleType.BEFORE || this.j == DWLifecycleType.MID_BEGIN || this.j == DWLifecycleType.MID_END || this.j == DWLifecycleType.AFTER) {
            b();
        } else if (this.j != DWLifecycleType.MID) {
        } else {
            a();
            a(this.d.isShowInteractive());
        }
    }
}
