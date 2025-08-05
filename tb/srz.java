package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.arch.flow.fatigue.a;
import com.taobao.bootimage.arch.flow.view.c;
import com.taobao.bootimage.arch.flow.view.d;

/* loaded from: classes6.dex */
public class srz extends sry implements d.a.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(683244407);
        kge.a(-1288763514);
    }

    public static /* synthetic */ Object ipc$super(srz srzVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1474194533) {
            super.a(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode != 1544639176) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
    }

    @Override // tb.ssb
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 101;
    }

    public srz(sro sroVar, srk srkVar, a aVar, srw srwVar, d.a aVar2) {
        super(sroVar, srkVar, aVar, srwVar, aVar2);
    }

    @Override // tb.sry
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.a(i, i2);
        kej.a("2ARCH_CreateViewState", "handle --> 2ARCH_CreateViewState");
        Activity a2 = this.d.a();
        if (a2 == null) {
            kej.a("2ARCH_CreateViewState", "handle: activity null");
        } else if (this.c.c() == null) {
            kej.a("2ARCH_CreateViewState", "handle: mBizData null");
        } else {
            c a3 = this.f33876a.a(a2, this.c.c(), i2, this);
            if (a3 == null || a3.c()) {
                kej.a("2ARCH_CreateViewState", "handle: notifyCreateView fail");
                this.d.a(104, this.e);
                return;
            }
            this.b.a(this.c.c(), a3, i2);
        }
    }

    @Override // tb.sry
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        kej.a("2ARCH_CreateViewState", "onTimeOut: ");
        this.d.a(104, this.e);
    }

    @Override // tb.sry, tb.srs
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        super.a(i);
        int i2 = i == 2001 ? 102 : 104;
        kej.a("2ARCH_CreateViewState", "notifyViewCreate nextState: " + i2);
        this.d.a(i2, this.e);
    }

    @Override // com.taobao.bootimage.arch.flow.view.d.a.b
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        kej.a("2ARCH_CreateViewState", "notifyViewCreate onError: " + str);
        this.d.a(104, this.e);
    }
}
