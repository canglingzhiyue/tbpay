package com.taobao.android.tschedule.task;

import android.graphics.drawable.Drawable;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.taskcontext.PhenixTaskContext;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import tb.jmg;
import tb.jmh;
import tb.kge;

/* loaded from: classes6.dex */
public class PhenixScheduleTask extends ScheduleTask<PhenixTaskContext> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static LruCache<String, Drawable> imgCache;

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public boolean cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("707fe605", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public boolean isFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9673ae47", new Object[]{this})).booleanValue();
        }
        return false;
    }

    static {
        kge.a(-1593672737);
        imgCache = new LruCache<>(5);
    }

    public PhenixScheduleTask(String str, PhenixTaskContext phenixTaskContext) {
        super(str, phenixTaskContext);
    }

    public PhenixScheduleTask(String str, PhenixTaskContext phenixTaskContext, ScheduleProtocolCallback scheduleProtocolCallback) {
        super(str, phenixTaskContext, scheduleProtocolCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b A[Catch: Throwable -> 0x00ce, TryCatch #0 {Throwable -> 0x00ce, blocks: (B:8:0x001b, B:10:0x001e, B:12:0x0024, B:14:0x002a, B:15:0x0055, B:17:0x005b, B:19:0x0067, B:20:0x006f, B:24:0x0084, B:26:0x008e, B:27:0x0092, B:29:0x0098, B:30:0x00b3, B:32:0x00b9, B:23:0x007c), top: B:37:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c A[Catch: Throwable -> 0x00ce, TryCatch #0 {Throwable -> 0x00ce, blocks: (B:8:0x001b, B:10:0x001e, B:12:0x0024, B:14:0x002a, B:15:0x0055, B:17:0x005b, B:19:0x0067, B:20:0x006f, B:24:0x0084, B:26:0x008e, B:27:0x0092, B:29:0x0098, B:30:0x00b3, B:32:0x00b9, B:23:0x007c), top: B:37:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e A[Catch: Throwable -> 0x00ce, TryCatch #0 {Throwable -> 0x00ce, blocks: (B:8:0x001b, B:10:0x001e, B:12:0x0024, B:14:0x002a, B:15:0x0055, B:17:0x005b, B:19:0x0067, B:20:0x006f, B:24:0x0084, B:26:0x008e, B:27:0x0092, B:29:0x0098, B:30:0x00b3, B:32:0x00b9, B:23:0x007c), top: B:37:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3 A[Catch: Throwable -> 0x00ce, TryCatch #0 {Throwable -> 0x00ce, blocks: (B:8:0x001b, B:10:0x001e, B:12:0x0024, B:14:0x002a, B:15:0x0055, B:17:0x005b, B:19:0x0067, B:20:0x006f, B:24:0x0084, B:26:0x008e, B:27:0x0092, B:29:0x0098, B:30:0x00b3, B:32:0x00b9, B:23:0x007c), top: B:37:0x001b }] */
    @Override // com.taobao.android.tschedule.task.ScheduleTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void realExecute(java.lang.String r9, java.lang.Object... r10) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tschedule.task.PhenixScheduleTask.realExecute(java.lang.String, java.lang.Object[]):void");
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public boolean validate(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("152894ae", new Object[]{this, str, objArr})).booleanValue() : (this.taskContext == 0 || ((PhenixTaskContext) this.taskContext).params == null || !jmh.a(jmg.SWITCH_KEY_ENABLE_TASK_PHENIX, false) || ((PhenixTaskContext) this.taskContext).params.imgUrls == null || ((PhenixTaskContext) this.taskContext).params.imgUrls.isEmpty()) ? false : true;
    }
}
