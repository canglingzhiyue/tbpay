package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.arch.flow.fatigue.a;
import com.taobao.bootimage.arch.flow.view.d;
import com.taobao.bootimage.data.BootImageInfo;

/* loaded from: classes6.dex */
public class ssc extends sry {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int g;

    static {
        kge.a(-2069063480);
    }

    public static /* synthetic */ Object ipc$super(ssc sscVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 90991720) {
            super.a();
            return null;
        } else if (hashCode == 388604526) {
            super.a((BootImageInfo) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
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
        return 100;
    }

    public static /* synthetic */ int a(ssc sscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff54cde8", new Object[]{sscVar})).intValue();
        }
        int i = sscVar.g;
        sscVar.g = i + 1;
        return i;
    }

    public static /* synthetic */ void a(ssc sscVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d678515", new Object[]{sscVar, new Integer(i), new Integer(i2)});
        } else {
            sscVar.b(i, i2);
        }
    }

    public static /* synthetic */ int b(ssc sscVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("edd7d469", new Object[]{sscVar})).intValue() : sscVar.g;
    }

    public static /* synthetic */ void b(ssc sscVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d742ef56", new Object[]{sscVar, new Integer(i), new Integer(i2)});
        } else {
            super.a(i, i2);
        }
    }

    public ssc(sro sroVar, srk srkVar, a aVar, srw srwVar, d.a aVar2) {
        super(sroVar, srkVar, aVar, srwVar, aVar2);
        this.g = 0;
    }

    @Override // tb.sry
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (c()) {
            kej.a("2ARCH_StartState", "handleNext: 尝试超限");
        } else {
            super.a();
            kej.a("2ARCH_StartState", "onTimeOut index: " + this.g);
            this.g = this.g + 1;
            this.b.a(this.c, this.e, null, this.g);
        }
    }

    @Override // tb.sry
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        kej.a("2ARCH_StartState", "handle --> index " + this.g);
        this.e = i2;
        this.g = 0;
        b(i, i2);
    }

    @Override // tb.sry, tb.srs
    public void a(BootImageInfo bootImageInfo, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1729a26e", new Object[]{this, bootImageInfo, new Integer(i), new Integer(i2)});
            return;
        }
        super.a(bootImageInfo, i, i2);
        if (i2 == 2001) {
            this.g = 0;
            kej.a("2ARCH_StartState", "notifyOnStart success: ");
            this.c.a(bootImageInfo);
            this.d.a(101, i);
            return;
        }
        kej.a("2ARCH_StartState", "notifyOnStart fail index: " + this.g);
        this.g = this.g + 1;
        b(100, i);
    }

    private void b(final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (c()) {
            kej.a("2ARCH_StartState", "handleNext: 尝试超限");
        } else {
            kej.a("2ARCH_StartState", "handleStartState:" + this.g);
            this.b.a(this.c, i2, new srr() { // from class: tb.ssc.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.srr
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    kej.a("2ARCH_StartState", "handleNext:");
                    ssc.a(ssc.this);
                    ssc.a(ssc.this, i, i2);
                }

                @Override // tb.srr
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                        return;
                    }
                    kej.a("2ARCH_StartState", "success: " + ssc.b(ssc.this));
                    ssc.b(ssc.this, i, i2);
                }
            }, this.g);
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (this.g <= 2) {
            return false;
        }
        kej.a("2ARCH_StartState", "isReachedAttemptsLimit: 尝试达到上限");
        this.g = 0;
        return true;
    }
}
