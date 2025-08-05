package com.ali.user.open.core.task;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class TaskWithDialog<Params, Progress, Result> extends AbsAsyncTask<Params, Progress, Result> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Activity activity;

    static {
        kge.a(-442128435);
    }

    @Override // com.ali.user.open.core.task.AbsAsyncTask
    public void doFinally() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bc23aff", new Object[]{this});
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("873a6298", new Object[]{this});
        }
    }

    public TaskWithDialog(Activity activity) {
        this.activity = activity;
    }
}
