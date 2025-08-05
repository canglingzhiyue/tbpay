package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class lnb extends lna {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean b;

    static {
        kge.a(-1103059586);
    }

    public static /* synthetic */ Object ipc$super(lnb lnbVar, String str, Object... objArr) {
        if (str.hashCode() == -650670724) {
            super.a((String) objArr[0], (String) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.lna
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "infoFlowAutoErasedBizParams_";
    }

    public lnb(String str) {
        super(str);
    }

    @Override // tb.lna
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        super.a(str, str2);
        this.b = false;
    }

    @Override // tb.lna
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.b = true;
        }
    }

    @Override // tb.lna
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ldf.d("DiskAutoErasedModeHandler", "onRequestSucceed isAutoClear : " + this.b);
        if (!this.b) {
            return;
        }
        e();
    }
}
