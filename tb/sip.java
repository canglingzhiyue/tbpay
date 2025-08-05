package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.RangeSeekBar;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class sip extends pta implements six {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final sii c;

    static {
        kge.a(366434035);
        kge.a(2025534365);
    }

    public static /* synthetic */ Object ipc$super(sip sipVar, String str, Object... objArr) {
        if (str.hashCode() == -1355309186) {
            super.onCreateView((psw) objArr[0], (snp) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.six
    public void a(RangeSeekBar rangeSeekBar, float f, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6c7b4db", new Object[]{this, rangeSeekBar, new Float(f), new Float(f2), new Boolean(z)});
        }
    }

    @Override // tb.ptc
    public String cL_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1e3f2f83", new Object[]{this}) : "GrayMaskLayer";
    }

    public sip(FluidContext fluidContext, sii siiVar) {
        super(fluidContext, siiVar);
        this.c = siiVar;
    }

    @Override // tb.pta, tb.shm
    public void onCreateView(psw pswVar, snp snpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af379f7e", new Object[]{this, pswVar, snpVar});
            return;
        }
        super.onCreateView(pswVar, snpVar);
        this.c.aa().e().a(this);
        c();
    }

    @Override // tb.six
    public void a(RangeSeekBar rangeSeekBar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("286a829b", new Object[]{this, rangeSeekBar, new Boolean(z)});
            return;
        }
        this.c.A().c().a(false);
        if (!((IDataService) this.c.z().getService(IDataService.class)).getConfig().j().aj) {
            return;
        }
        a((Boolean) true, (Boolean) true);
    }

    @Override // tb.six
    public void b(RangeSeekBar rangeSeekBar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee950b5c", new Object[]{this, rangeSeekBar, new Boolean(z)});
            return;
        }
        this.c.A().c().a(true);
        if (!((IDataService) this.c.z().getService(IDataService.class)).getConfig().j().aj) {
            return;
        }
        a((Boolean) true, (Boolean) false);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        snp G = this.c.G();
        skl j = ((IDataService) this.c.z().getService(IDataService.class)).getConfig().j();
        if (G == null || j == null) {
            return;
        }
        spz.a("changfeng", " ShortVideoCard.updateGraymaskView " + j.aj + " tnodeVersion :" + j.f33657a + " weexVersion :" + j.b);
        if (j.aj) {
            G.a(R.id.v_graymask_bottom).setVisibility(4);
            View a2 = G.a(R.id.v_graymask_top);
            ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.height = obx.a(a2.getContext(), 50.0f);
            a2.setLayoutParams(layoutParams);
        } else if (!spj.a(this.c.z())) {
        } else {
            View a3 = G.a(R.id.v_graymask_bottom);
            ViewGroup.LayoutParams layoutParams2 = a3.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = ohd.a(a3.getContext(), 360);
                a3.setLayoutParams(layoutParams2);
            }
            View a4 = G.a(R.id.v_graymask_top);
            ViewGroup.LayoutParams layoutParams3 = a4.getLayoutParams();
            if (layoutParams3 == null) {
                return;
            }
            layoutParams3.height = obx.a(a4.getContext(), 50.0f);
            a4.setLayoutParams(layoutParams3);
        }
    }

    public void a(Boolean bool, Boolean bool2) {
        View a2;
        View a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2c4f948", new Object[]{this, bool, bool2});
        } else if (this.c.G() == null) {
        } else {
            int i = 4;
            if (bool != null && (a3 = this.c.G().a(R.id.v_graymask_top)) != null) {
                a3.setVisibility(bool.booleanValue() ? 0 : 4);
            }
            if (bool2 == null || (a2 = this.c.G().a(R.id.v_graymask_bottom)) == null) {
                return;
            }
            if (bool2.booleanValue()) {
                i = 0;
            }
            a2.setVisibility(i);
        }
    }
}
