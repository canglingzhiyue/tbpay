package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.launcher.task.ScheduleTask;

/* loaded from: classes5.dex */
public class mrk implements rhf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(850972796);
        kge.a(-1389886184);
    }

    @Override // tb.rhf
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // tb.rhf
    public void a(ScheduleTask scheduleTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ec118ca", new Object[]{this, scheduleTask});
        } else if (scheduleTask.m() > 0) {
            mrl.a(scheduleTask, scheduleTask.m());
        } else {
            mrl.a(scheduleTask);
        }
    }

    @Override // tb.rhf
    public void b(ScheduleTask scheduleTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebae2fe9", new Object[]{this, scheduleTask});
        } else {
            mrl.b(scheduleTask);
        }
    }
}
