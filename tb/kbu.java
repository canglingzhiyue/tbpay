package tb;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWLifecycleType;
import com.taobao.avplayer.common.q;
import com.taobao.avplayer.common.y;
import com.taobao.avplayer.core.model.DWResponse;
import com.taobao.avplayer.interactivelifecycle.frontcover.model.DWFrontCoverBean;
import com.taobao.avplayer.interactivelifecycle.frontcover.model.b;
import com.taobao.avplayer.interactivelifecycle.frontcover.model.c;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.CodeUsageCounter;

/* loaded from: classes6.dex */
public class kbu implements q, y {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f29949a;
    private DWFrontCoverBean b;
    private DWContext c;
    private FrameLayout d;
    private ImageView e;
    private TextView f;
    private TextView g;
    private c h = new b();
    private DWLifecycleType i;
    private FrameLayout j;
    private FrameLayout k;

    static {
        kge.a(43620268);
        kge.a(-607416234);
        kge.a(556437024);
    }

    public static /* synthetic */ FrameLayout a(kbu kbuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("b103207f", new Object[]{kbuVar}) : kbuVar.d;
    }

    public static /* synthetic */ DWContext b(kbu kbuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWContext) ipChange.ipc$dispatch("63277c36", new Object[]{kbuVar}) : kbuVar.c;
    }

    public static /* synthetic */ ImageView c(kbu kbuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("9e881f4", new Object[]{kbuVar}) : kbuVar.e;
    }

    public kbu(DWContext dWContext) {
        this.c = dWContext;
        d();
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_sdk_DWFrontCoverManager);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.d = (FrameLayout) this.c.getActivity().getLayoutInflater().inflate(R.layout.dw_interactive_frontcover, (ViewGroup) null);
        this.e = (ImageView) this.d.findViewById(R.id.dw_frontcover_cover);
        this.e.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.g = (TextView) this.d.findViewById(R.id.dw_frontcover_bottom_playtimes_textview);
        this.j = (FrameLayout) this.d.findViewById(R.id.dw_frontcover_bottom_playtimes_layout);
        this.f = (TextView) this.d.findViewById(R.id.dw_frontcover_bottom_videoduration_textview);
        this.k = (FrameLayout) this.d.findViewById(R.id.dw_frontcover_bottom_layout);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.h.a(this.c, this);
        }
    }

    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.d;
    }

    @Override // com.taobao.avplayer.common.y
    public void a(int i, DWResponse dWResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e54bc982", new Object[]{this, new Integer(i), dWResponse});
        } else {
            this.d.setVisibility(8);
        }
    }

    @Override // com.taobao.avplayer.common.y
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else if (obj == null || !(obj instanceof DWFrontCoverBean)) {
        } else {
            this.b = (DWFrontCoverBean) obj;
            if (!StringUtils.isEmpty(this.b.getCoverPicUrl()) && this.e != null) {
                this.c.mDWImageAdapter.a(this.b.getCoverPicUrl(), this.e);
                if (this.b.getScaleType() != null) {
                    this.e.setScaleType(this.b.getScaleType());
                }
            }
            if (this.b.getPlayTimes() > 0) {
                StringBuilder a2 = kci.a(this.b.getPlayTimes());
                a2.append("人已观看");
                this.k.setVisibility(0);
                this.j.setVisibility(0);
                this.g.setText(a2);
            }
            if (StringUtils.isEmpty(this.b.getVideoDuration())) {
                return;
            }
            this.f.setText(this.b.getVideoDuration());
            this.k.setVisibility(0);
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.f29949a) {
        } else {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(500L);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            this.d.startAnimation(alphaAnimation);
            this.f29949a = true;
            alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: tb.kbu.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                        return;
                    }
                    kbu kbuVar = kbu.this;
                    kbuVar.f29949a = false;
                    kbu.a(kbuVar).setVisibility(8);
                    if (kbu.b(kbu.this).mDWImageAdapter == null || kbu.c(kbu.this) == null) {
                        return;
                    }
                    kbu.b(kbu.this).mDWImageAdapter.a((String) null, kbu.c(kbu.this));
                }
            });
        }
    }

    @Override // com.taobao.avplayer.common.q
    public void onLifecycleChanged(DWLifecycleType dWLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e41106", new Object[]{this, dWLifecycleType});
            return;
        }
        this.i = dWLifecycleType;
        if (this.i != DWLifecycleType.BEFORE && this.d.getVisibility() == 0) {
            if (!this.c.needRequestFrontCoverData()) {
                e();
            } else if (this.c.mDWImageAdapter != null && this.e != null) {
                this.c.mDWImageAdapter.a((String) null, this.e);
            }
            this.d.setVisibility(8);
        } else if (!this.c.isNeedFrontCover() || this.i != DWLifecycleType.BEFORE) {
        } else {
            this.d.setVisibility(0);
            DWFrontCoverBean dWFrontCoverBean = this.b;
            if (dWFrontCoverBean != null) {
                a(dWFrontCoverBean);
            } else if (this.c.needRequestFrontCoverData()) {
                a();
            } else if (this.c.getFrontCoverData() != null && this.c.getFrontCoverData().b() != null) {
                this.d.removeAllViews();
                View b = this.c.getFrontCoverData().b();
                if (b != null && b.getParent() != null) {
                    ((ViewGroup) b.getParent()).removeView(b);
                }
                this.d.addView(this.c.getFrontCoverData().b(), new FrameLayout.LayoutParams(-1, -1));
            } else if (this.c.getFrontCoverData() == null || this.c.getFrontCoverData().a() == null) {
            } else {
                a(this.c.getFrontCoverData().a());
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.c.mDWImageAdapter == null || this.e == null) {
        } else {
            this.c.mDWImageAdapter.a((String) null, this.e);
        }
    }
}
