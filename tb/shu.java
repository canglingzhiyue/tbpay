package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import tb.sht;

/* loaded from: classes5.dex */
public class shu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final psw f33588a;
    private final FluidContext b;

    static {
        kge.a(-1406928710);
    }

    public static /* synthetic */ FluidContext a(shu shuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("25ec1d30", new Object[]{shuVar}) : shuVar.b;
    }

    public static /* synthetic */ psw b(shu shuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (psw) ipChange.ipc$dispatch("343bcf79", new Object[]{shuVar}) : shuVar.f33588a;
    }

    public shu(psw pswVar) {
        this.f33588a = pswVar;
        this.b = pswVar.z();
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f33588a.u().a(new sht.a() { // from class: tb.shu.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == 1387239154) {
                        super.onTripleClick(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue());
                        return null;
                    } else if (hashCode == 1597345284) {
                        return new Boolean(super.onLongClick(((Boolean) objArr[0]).booleanValue()));
                    } else {
                        if (hashCode != 2139361695) {
                            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                        }
                        super.onDoubleClick(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue());
                        return null;
                    }
                }

                @Override // tb.sht.a, tb.sht
                public void onDoubleClick(float f, float f2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7f84119f", new Object[]{this, new Float(f), new Float(f2)});
                        return;
                    }
                    super.onDoubleClick(f, f2);
                    sme.a(shu.a(shu.this), shu.b(shu.this), f, f2);
                }

                @Override // tb.sht.a, tb.sht
                public void onTripleClick(float f, float f2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("52af96f2", new Object[]{this, new Float(f), new Float(f2)});
                        return;
                    }
                    super.onTripleClick(f, f2);
                    sme.b(shu.a(shu.this), shu.b(shu.this), f, f2);
                }

                @Override // tb.sht.a, tb.sht
                public boolean onLongClick(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("5f358e04", new Object[]{this, new Boolean(z)})).booleanValue();
                    }
                    sme.b(shu.a(shu.this), shu.b(shu.this));
                    return super.onLongClick(z);
                }
            });
        }
    }
}
