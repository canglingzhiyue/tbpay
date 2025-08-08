package tb;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.common.view.VideoRoundCornerLayout;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class shy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final float[] f33592a;
    private static final float[] b;

    public static /* synthetic */ void a(ViewGroup viewGroup, float f, sia siaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edf288be", new Object[]{viewGroup, new Float(f), siaVar});
        } else {
            b(viewGroup, f, siaVar);
        }
    }

    public static /* synthetic */ void a(ViewGroup viewGroup, sia siaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f163f6c", new Object[]{viewGroup, siaVar});
        } else {
            b(viewGroup, siaVar);
        }
    }

    static {
        kge.a(1445636197);
        f33592a = new float[]{54.0f, 54.0f, 54.0f, 54.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        b = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public static void a(final sia siaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fec6fa2d", new Object[]{siaVar});
        } else if (siaVar == null) {
        } else {
            spz.c("ShowSlidedownBarHelper", "收到VSMSG_screenMove消息,SlideDownParam:" + siaVar.toString());
            final ViewGroup f = siaVar.f();
            if (f == null) {
                return;
            }
            final int a2 = siaVar.a();
            final int b2 = siaVar.b() + a2;
            if (!siaVar.d()) {
                b(f, b2, siaVar);
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(a2, b2);
            ofFloat.setInterpolator(oel.a(siaVar.i()));
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.shy.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    } else {
                        shy.a(f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), siaVar);
                    }
                }
            });
            ofFloat.setDuration(siaVar.c());
            ofFloat.addListener(new Animator.AnimatorListener() { // from class: tb.shy.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    shy.a(f, b2, siaVar);
                    shy.a(f, siaVar);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    } else {
                        shy.a(f, a2, siaVar);
                    }
                }
            });
            ofFloat.start();
        }
    }

    private static void b(ViewGroup viewGroup, sia siaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82be12ed", new Object[]{viewGroup, siaVar});
        } else if (!a() || viewGroup == null || siaVar == null || !siaVar.g()) {
        } else {
            boolean h = siaVar.h();
            String j = siaVar.j();
            VideoRoundCornerLayout videoRoundCornerLayout = (VideoRoundCornerLayout) viewGroup.findViewById(R.id.video_host);
            VideoRoundCornerLayout videoRoundCornerLayout2 = (VideoRoundCornerLayout) viewGroup.findViewById(R.id.live_host);
            if (videoRoundCornerLayout != null) {
                a(h, videoRoundCornerLayout, j);
            } else if (videoRoundCornerLayout2 == null) {
            } else {
                a(h, videoRoundCornerLayout2, j);
            }
        }
    }

    private static void b(ViewGroup viewGroup, float f, sia siaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f45255d", new Object[]{viewGroup, new Float(f), siaVar});
        } else if (viewGroup != null && siaVar != null) {
            boolean g = siaVar.g();
            boolean e = siaVar.e();
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (g) {
                    if (a(e, childAt)) {
                    }
                    childAt.setTranslationY(f);
                } else {
                    if (childAt instanceof TNodeView) {
                    }
                    childAt.setTranslationY(f);
                }
            }
        }
    }

    private static boolean a(boolean z, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fff475ea", new Object[]{new Boolean(z), view})).booleanValue();
        }
        if (z) {
            return false;
        }
        if (view == null) {
            return true;
        }
        if (!b()) {
            return StringUtils.equals("FlutterSplashView", view.getClass().getSimpleName());
        }
        return view.getId() == R.id.fluid_sdk_weex_interactive_card;
    }

    private static void a(boolean z, VideoRoundCornerLayout videoRoundCornerLayout, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0f02af", new Object[]{new Boolean(z), videoRoundCornerLayout, str});
        } else if (videoRoundCornerLayout == null) {
        } else {
            try {
                if (z) {
                    videoRoundCornerLayout.setCornerRadii(b);
                    videoRoundCornerLayout.setBackgroundColor(0);
                    return;
                }
                videoRoundCornerLayout.setCornerRadii(f33592a);
                if (StringUtils.isEmpty(str)) {
                    return;
                }
                videoRoundCornerLayout.setBackgroundColor(Color.parseColor(str));
            } catch (Throwable th) {
                spz.a("ShowSlidedownBarHelper", "", th);
            }
        }
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableCellShowRoundCardAfterMove", true);
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableUseWeexCardIdToMove", true);
    }
}
