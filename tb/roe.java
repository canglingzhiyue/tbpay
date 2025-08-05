package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.implement.d;
import java.lang.ref.WeakReference;

/* loaded from: classes9.dex */
public abstract class roe implements rop {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final rod f33258a;
    public volatile WeakReference<rom> b;
    public final int c = hashCode();
    public d d;

    public roe(d dVar, rod rodVar) {
        this.d = dVar;
        this.f33258a = rodVar;
    }

    @Override // tb.rop
    public rod a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rod) ipChange.ipc$dispatch("f0a2437", new Object[]{this}) : this.f33258a;
    }

    @Override // tb.rop
    public void a(rom romVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd6c2308", new Object[]{this, romVar});
        } else {
            this.b = new WeakReference<>(romVar);
        }
    }

    public rom b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rom) ipChange.ipc$dispatch("16bbcaad", new Object[]{this});
        }
        WeakReference<rom> weakReference = this.b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
