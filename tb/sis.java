package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.core.f;
import com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.RangeSeekBar;

/* loaded from: classes5.dex */
public class sis implements siu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33613a;
    private final f<six> b = new f<>();

    static {
        kge.a(-114197818);
        kge.a(-1909516300);
    }

    public sis(FluidContext fluidContext) {
        this.f33613a = fluidContext;
    }

    @Override // tb.siw
    public void a(six sixVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fed16eb6", new Object[]{this, sixVar});
        } else if (sixVar == null) {
        } else {
            this.b.a(sixVar);
        }
    }

    @Override // tb.six
    public void a(RangeSeekBar rangeSeekBar, float f, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6c7b4db", new Object[]{this, rangeSeekBar, new Float(f), new Float(f2), new Boolean(z)});
            return;
        }
        for (six sixVar : this.b.a()) {
            try {
                sixVar.a(rangeSeekBar, f, f2, z);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33613a, sixVar, "onRangeChanged", e);
            }
        }
    }

    @Override // tb.six
    public void a(RangeSeekBar rangeSeekBar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("286a829b", new Object[]{this, rangeSeekBar, new Boolean(z)});
            return;
        }
        for (six sixVar : this.b.a()) {
            try {
                sixVar.a(rangeSeekBar, z);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33613a, sixVar, "onStartTrackingTouch", e);
            }
        }
    }

    @Override // tb.six
    public void b(RangeSeekBar rangeSeekBar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee950b5c", new Object[]{this, rangeSeekBar, new Boolean(z)});
            return;
        }
        for (six sixVar : this.b.a()) {
            try {
                sixVar.b(rangeSeekBar, z);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33613a, sixVar, "onStopTrackingTouch", e);
            }
        }
    }
}
