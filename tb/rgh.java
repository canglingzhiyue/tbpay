package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;

/* loaded from: classes9.dex */
public class rgh implements req {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-150026023);
        kge.a(-423019888);
    }

    @Override // tb.req
    public void execute(final Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
        } else {
            Coordinator.postTask(new Coordinator.TaggedRunnable("update-sdk") { // from class: tb.rgh.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        runnable.run();
                    }
                }
            });
        }
    }

    @Override // tb.req
    public void delayExecute(final Runnable runnable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d05115ec", new Object[]{this, runnable, new Integer(i)});
        } else {
            Coordinator.postTask(new Coordinator.TaggedRunnable("update-sdk") { // from class: tb.rgh.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        runnable.run();
                    }
                }
            }, i);
        }
    }
}
