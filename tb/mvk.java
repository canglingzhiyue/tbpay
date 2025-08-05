package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.wrapper.pagemanager.headerpic.b;

/* loaded from: classes5.dex */
public class mvk extends lco {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-217484484);
    }

    public static /* synthetic */ Object ipc$super(mvk mvkVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public mvk() {
        emu.a("com.taobao.android.detail.wrapper.pagemanager.DoubleColumnPageLifecycle");
    }

    @Override // tb.lco
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            b();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        lpa a2 = this.f30475a.a();
        if (!(a2 instanceof b)) {
            return;
        }
        b bVar = (b) a2;
        bVar.a(bVar.a().getMeasuredWidth() / bVar.a().getMeasuredHeight());
    }
}
