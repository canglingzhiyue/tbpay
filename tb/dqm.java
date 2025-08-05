package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class dqm implements dqn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1961101776);
        kge.a(-966459203);
    }

    @Override // tb.dqn
    public void onProperty(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1991a501", new Object[]{this, str, obj});
        }
    }

    @Override // tb.dqn
    public void onStage(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ba4fb14", new Object[]{this, str, new Long(j)});
        }
    }

    @Override // tb.dqn
    public final void onStageIfAbsent(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da2a227e", new Object[]{this, str, new Long(j)});
        } else {
            onStage(str, j);
        }
    }

    @Override // tb.dqn
    public final void onPropertyIfAbsent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564eb9d7", new Object[]{this, str, obj});
        } else {
            onProperty(str, obj);
        }
    }
}
