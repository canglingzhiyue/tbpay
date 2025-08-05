package tb;

import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.core.f;
import tb.snz;

/* loaded from: classes5.dex */
public class sob implements snz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33762a;
    private final f<snz> b = new f<>();

    static {
        kge.a(-1742898386);
        kge.a(-1902235399);
        kge.a(854340662);
    }

    public sob(FluidContext fluidContext) {
        this.f33762a = fluidContext;
    }

    public void a(snz snzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff18ccf9", new Object[]{this, snzVar});
        } else {
            this.b.a(snzVar);
        }
    }

    public void a(snz.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aee6adc", new Object[]{this, aVar});
        } else {
            this.b.a(aVar);
        }
    }

    public void b(snz snzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9bd37a", new Object[]{this, snzVar});
        } else {
            this.b.c(snzVar);
        }
    }

    public void b(snz.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c9d51d", new Object[]{this, aVar});
        } else {
            this.b.c(aVar);
        }
    }

    @Override // tb.snz
    public void onDataUpdate(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f0585f5", new Object[]{this, pswVar});
            return;
        }
        for (snz snzVar : this.b.a()) {
            try {
                snzVar.onDataUpdate(pswVar);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33762a, snzVar, "onDataUpdate", e);
            }
        }
    }

    @Override // tb.snz
    public void onPauseMedia(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd5c1bf0", new Object[]{this, pswVar});
            return;
        }
        for (snz snzVar : this.b.a()) {
            try {
                snzVar.onPauseMedia(pswVar);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33762a, snzVar, "onPauseMedia", e);
            }
        }
    }

    @Override // tb.snz
    public void onRecyclePlayer(psw pswVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b576cfc", new Object[]{this, pswVar, new Boolean(z)});
            return;
        }
        for (snz snzVar : this.b.a()) {
            try {
                snzVar.onRecyclePlayer(pswVar, z);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33762a, snzVar, "onRecyclePlayer", e);
            }
        }
    }

    @Override // tb.snz
    public void onRequestMediaPlayer(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea476f38", new Object[]{this, pswVar});
            return;
        }
        for (snz snzVar : this.b.a()) {
            try {
                snzVar.onRequestMediaPlayer(pswVar);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33762a, snzVar, "onRequestMediaPlayer", e);
            }
        }
    }

    @Override // tb.snz
    public void onShowCover(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8496fbe", new Object[]{this, pswVar});
            return;
        }
        for (snz snzVar : this.b.a()) {
            try {
                snzVar.onShowCover(pswVar);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33762a, snzVar, "onShowCover", e);
            }
        }
    }

    @Override // tb.snz
    public void onShowFirstCover(psw pswVar, int i, int i2, Drawable drawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e2677f4", new Object[]{this, pswVar, new Integer(i), new Integer(i2), drawable, str});
            return;
        }
        for (snz snzVar : this.b.a()) {
            try {
                snzVar.onShowFirstCover(pswVar, i, i2, drawable, str);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33762a, snzVar, "onShowFirstCover", e);
            }
        }
    }

    @Override // tb.snz
    public void onStartMedia(psw pswVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ffe4c84", new Object[]{this, pswVar, new Boolean(z), new Boolean(z2)});
            return;
        }
        for (snz snzVar : this.b.a()) {
            try {
                snzVar.onStartMedia(pswVar, z, z2);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33762a, snzVar, "onStartMedia", e);
            }
        }
    }

    @Override // tb.snz
    public void onStopMedia(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a288e06", new Object[]{this, pswVar});
            return;
        }
        for (snz snzVar : this.b.a()) {
            try {
                snzVar.onStopMedia(pswVar);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33762a, snzVar, "onStopMedia", e);
            }
        }
    }

    @Override // tb.snz
    public void onUTPairsUpdate(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db420e07", new Object[]{this, pswVar});
            return;
        }
        for (snz snzVar : this.b.a()) {
            try {
                snzVar.onUTPairsUpdate(pswVar);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33762a, snzVar, "onUTPairsUpdate", e);
            }
        }
    }
}
