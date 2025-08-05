package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class fft extends lhc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public fft(ljs ljsVar) {
        super(ljsVar);
    }

    public static /* synthetic */ Object ipc$super(fft fftVar, String str, Object... objArr) {
        if (str.hashCode() == -1342773960) {
            return super.a();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.lhc, com.taobao.infoflow.protocol.engine.invoke.biz.l
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        String a2 = super.a();
        return TextUtils.isEmpty(a2) ? "Page_TMGDynamic" : a2;
    }
}
