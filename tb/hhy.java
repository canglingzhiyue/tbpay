package tb;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.datamodel.pop.a;
import com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class hhy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f28672a;
    private int b;
    private int c;
    private int d;
    private float e;
    private float f;
    private boolean g;
    private sii h;
    private boolean i = false;
    public ValueAnimator j;

    static {
        kge.a(-471619771);
        kge.a(-1608645198);
    }

    public static /* synthetic */ void a(hhy hhyVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d182e1", new Object[]{hhyVar, new Float(f)});
        } else {
            hhyVar.a(f);
        }
    }

    public hhy(sii siiVar) {
        this.h = siiVar;
    }

    public void a(sii siiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feca9d25", new Object[]{this, siiVar});
        } else {
            this.h = siiVar;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0074, code lost:
        if (r8.equals(com.taobao.android.abilitykit.ability.pop.render.IAKPopRender.LifecycleType.OUT_ANIMATION_START) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r8, com.taobao.android.fluid.framework.data.datamodel.pop.a r9) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hhy.a(java.lang.String, com.taobao.android.fluid.framework.data.datamodel.pop.a):void");
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c5554e2", new Object[]{this, aVar});
        } else if (!c(aVar)) {
        } else {
            a(aVar.d);
        }
    }

    private void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        float f2 = this.e;
        float f3 = (f - f2) / (this.f - f2);
        int i = this.c;
        int i2 = (int) (i - ((i - this.d) * f3));
        int i3 = this.f28672a;
        int i4 = (int) (i3 - ((i3 - this.b) * f3));
        a(i2, i4);
        spz.c("PopVideoSizeAdjustHandler", "y=" + f + "调整height: " + i2 + ", marginTop: " + i4 + ", ratio: " + f3);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.i) {
        } else {
            a(false);
        }
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        sjq b = this.h.ah().b();
        snv h = this.h.h();
        if (b == null || h == null) {
            spz.c("PopVideoSizeAdjustHandler", "adjustVideoSize失效或者mDWInstance为空，mVideoFrameSizeObject为空");
            return;
        }
        ViewGroup f = h.f();
        if (f == null) {
            spz.c("PopVideoSizeAdjustHandler", "adjustVideoSize失效，mDWInstance.getView()为空");
            return;
        }
        int i3 = (int) (i * (b.d / b.c));
        ViewGroup.LayoutParams layoutParams = f.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            spz.c("PopVideoSizeAdjustHandler", "adjustVideoSize失效，LayoutParams类型不符");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = i3;
        marginLayoutParams.height = i;
        marginLayoutParams.topMargin = i2;
        h.a(i3, i);
    }

    private void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1093c481", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            if (aVar.b > aVar.f12533a) {
                this.g = true;
            } else {
                this.g = false;
            }
            spz.c("PopVideoSizeAdjustHandler", "PAN_ANIMATION_RECOVER_START, popPosition.startY: " + aVar.f12533a + ", popPosition.endY: " + aVar.b);
        }
    }

    private void a(a aVar, sjq sjqVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bafa2618", new Object[]{this, aVar, sjqVar});
        } else if (aVar == null || sjqVar == null) {
        } else {
            int h = ohd.h(FluidSDK.getContext());
            this.e = aVar.f12533a;
            this.f = aVar.b;
            this.f28672a = sjqVar.e;
            if (spj.k(this.h.z())) {
                i = h;
            }
            this.b = i;
            this.c = sjqVar.c;
            this.d = ((int) aVar.b) - h;
            a(true);
            spz.c("PopVideoSizeAdjustHandler", "IN_ANIMATION_START, popStartY: " + aVar.f12533a + ", popEndY: " + aVar.b + ", videoStartMarginTop: " + this.f28672a + ", videoEndMarginTopStart: " + this.b + ", videoStartHeight: " + this.c + ", videoEndHeightStart: " + this.d);
        }
    }

    private boolean c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4d23424", new Object[]{this, aVar})).booleanValue();
        }
        if (!sjt.l()) {
            spz.c("PopVideoSizeAdjustHandler", "开关关闭，不响应");
            return false;
        } else if (aVar != null && this.h != null) {
            return true;
        } else {
            spz.c("PopVideoSizeAdjustHandler", " position为空或者播放器为空,不响应");
            return false;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        spz.c("PopVideoSizeAdjustHandler", "sendToRootTnodeMessage isHide: " + z);
        c(z);
        this.i = z;
        b(z);
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("hidden", Boolean.valueOf(z));
        FluidContext z2 = this.h.z();
        spz.c("PopVideoSizeAdjustHandler", "[webcomponent]setTopLayoutHide,发送给Node节点消息");
        ((IHostTNodeService) z2.getService(IHostTNodeService.class)).sendMessage("onHiddenPage", null, hashMap, null);
        ((IHostTNodeService) z2.getService(IHostTNodeService.class)).reLayoutForVirtualNavigationBar();
        IContainerService iContainerService = (IContainerService) z2.getService(IContainerService.class);
        if (z) {
            i = 8;
        }
        iContainerService.getAndSetTopLayoutVisibility(i);
    }

    private void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        sii siiVar = this.h;
        if (siiVar == null || siiVar.A() == null) {
            return;
        }
        this.h.A().a(!z);
    }

    public void a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        this.e = i;
        this.f = i2;
        this.c = this.h.ah().b().c;
        this.f28672a = this.h.ah().b().e;
        this.d = i3;
    }

    private void a(float f, float f2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25edd59b", new Object[]{this, new Float(f), new Float(f2), new Integer(i)});
            return;
        }
        ValueAnimator valueAnimator = this.j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.j = ValueAnimator.ofFloat(f, f2);
        this.j.setDuration(i);
        this.j.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.hhy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                } else {
                    hhy.a(hhy.this, ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                }
            }
        });
        spz.c("PopVideoSizeAdjustHandler", "自动开启动画，" + f + " to " + f2 + "; duration=" + i);
        this.j.start();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.j = null;
    }
}
