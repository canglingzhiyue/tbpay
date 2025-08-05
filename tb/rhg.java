package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.launcher.task.ScheduleTask;

/* loaded from: classes5.dex */
public final class rhg implements Handler.Callback, rhf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f33157a = new Handler(Looper.getMainLooper(), this);

    static {
        kge.a(427349330);
        kge.a(-1389886184);
        kge.a(-1043440182);
    }

    @Override // tb.rhf
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        return false;
    }

    @Override // tb.rhf
    public void a(ScheduleTask scheduleTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ec118ca", new Object[]{this, scheduleTask});
        } else if (scheduleTask.m() > 0) {
            this.f33157a.postDelayed(scheduleTask, scheduleTask.m());
        } else {
            this.f33157a.post(scheduleTask);
        }
    }

    @Override // tb.rhf
    public void b(ScheduleTask scheduleTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebae2fe9", new Object[]{this, scheduleTask});
        } else {
            this.f33157a.removeCallbacks(scheduleTask);
        }
    }
}
