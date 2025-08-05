package tb;

import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.device.IDeviceService;
import kotlin.Pair;
import tb.snz;

/* loaded from: classes5.dex */
public class sih extends snz.a implements smr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final sic f33602a;
    private sjq b;

    static {
        kge.a(-1460041838);
        kge.a(-855224269);
    }

    public static /* synthetic */ Object ipc$super(sih sihVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.smr
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    public sih(sic sicVar) {
        this.f33602a = sicVar;
        cS_();
    }

    public sjq cK_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sjq) ipChange.ipc$dispatch("38cf1cee", new Object[]{this}) : this.b;
    }

    private void cS_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fb6316", new Object[]{this});
            return;
        }
        ((IDeviceService) this.f33602a.z().getService(IDeviceService.class)).addDeviceRotateListener(this);
        this.f33602a.O().a((snz.a) this);
    }

    @Override // tb.smr
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f33602a.h() == null) {
        } else {
            a(this.f33602a.h().e());
        }
    }

    @Override // tb.snz.a, tb.snz
    public void onDataUpdate(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f0585f5", new Object[]{this, pswVar});
        } else if (this.f33602a.h() == null) {
        } else {
            a(this.f33602a.h().e());
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            Pair<sjq, FrameLayout.LayoutParams> a2 = sjs.a(this.f33602a.z(), z);
            if (a2 == null) {
                return;
            }
            this.b = a2.getFirst();
            this.f33602a.cf_().a(a2.getSecond());
        } catch (Exception e) {
            e.printStackTrace();
            spz.a("VideoPicSizeManager", "resizeMedia exception", e);
        }
    }
}
