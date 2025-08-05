package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class mzj implements myo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1722839418);
        kge.a(-470766481);
    }

    @Override // tb.myo
    public void startSpan(myr myrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf6febd", new Object[]{this, myrVar});
            return;
        }
        String str = "startSpan=" + myrVar.toString();
    }

    @Override // tb.myo
    public void releaseLog(myr myrVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc74da78", new Object[]{this, myrVar, str});
            return;
        }
        String str2 = "span=" + myrVar.toString() + ", log=" + str;
    }

    @Override // tb.myo
    public void finishSpan(myr myrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d26944ee", new Object[]{this, myrVar});
            return;
        }
        String str = "finishSpan=" + myrVar.toString();
    }
}
