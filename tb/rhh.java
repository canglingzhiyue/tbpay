package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.launcher.task.ScheduleTask;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.s;
import java.util.List;

/* loaded from: classes5.dex */
public final class rhh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final rhf f33158a;
    private final rhf b;

    static {
        kge.a(654121160);
    }

    public rhh() {
        if (s.a(s.SWITCH_ENABLE_A_DAEMON, true)) {
            this.f33158a = new mrk();
        } else {
            this.f33158a = new rhg();
        }
        this.b = new rhe();
        q.b("TaskSchedulers", "TaskSchedulers 初始化成功，主线程任务调度器：" + this.f33158a + ", 后台线程任务调度器：" + this.b);
    }

    public void a(List<ScheduleTask> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        for (ScheduleTask scheduleTask : list) {
            if (TextUtils.equals(scheduleTask.j(), "complete")) {
                q.b("TaskSchedulers", "提交任务失败，任务已完成：" + scheduleTask);
            } else {
                if (TextUtils.equals(scheduleTask.l(), "main")) {
                    this.f33158a.a(scheduleTask);
                } else {
                    this.b.a(scheduleTask);
                }
                scheduleTask.a();
                q.b("TaskSchedulers", "提交任务成功：" + scheduleTask);
            }
        }
        q.b("TaskSchedulers", "提交任务结束，任务队列任务个数：" + list.size());
    }

    public void b(List<ScheduleTask> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        for (ScheduleTask scheduleTask : list) {
            if (TextUtils.equals(scheduleTask.j(), "complete")) {
                q.b("TaskSchedulers", "取消任务失败，任务已完成：" + scheduleTask);
            } else {
                if (TextUtils.equals(scheduleTask.l(), "main")) {
                    this.f33158a.b(scheduleTask);
                } else {
                    this.b.b(scheduleTask);
                }
                scheduleTask.d();
                q.b("TaskSchedulers", "取消任务成功：" + scheduleTask);
            }
        }
        q.b("TaskSchedulers", "取消任务结束，任务队列任务个数：" + list.size());
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f33158a.a();
        this.b.a();
    }
}
