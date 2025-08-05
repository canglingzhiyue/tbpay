package com.alipay.mobile.security.bio.service.impl;

import android.content.Context;
import com.alipay.mobile.security.bio.exception.BioIllegalArgumentException;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.BioTaskService;
import com.alipay.mobile.security.bio.task.ActionFrame;
import com.alipay.mobile.security.bio.task.ActionType;
import com.alipay.mobile.security.bio.task.SubTask;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Vector;

/* loaded from: classes3.dex */
public class BioTaskServiceImpl extends BioTaskService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f5811a;
    private BioTaskService.TaskListener b;
    private Vector<SubTask> c = new Vector<>();
    private SubTask d = null;
    private int f;

    /* renamed from: com.alipay.mobile.security.bio.service.impl.BioTaskServiceImpl$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5812a = new int[ActionType.values().length];

        static {
            try {
                f5812a[ActionType.INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5812a[ActionType.RUN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5812a[ActionType.DONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public BioTaskServiceImpl(Context context) {
        if (context == null) {
            throw new BioIllegalArgumentException();
        }
        this.f5811a = context;
    }

    @Override // com.alipay.mobile.security.bio.service.BioService
    public void onCreate(BioServiceManager bioServiceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b84b0b", new Object[]{this, bioServiceManager});
        } else {
            this.c.clear();
        }
    }

    @Override // com.alipay.mobile.security.bio.service.BioService
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        if (this.b != null) {
            this.b = null;
        }
        Vector<SubTask> vector = this.c;
        if (vector == null) {
            return;
        }
        vector.clear();
        this.d = null;
    }

    @Override // com.alipay.mobile.security.bio.service.BioTaskService
    public void addTask(SubTask subTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b1eaaf9", new Object[]{this, subTask});
        } else if (subTask == null || this.c == null) {
        } else {
            BioLog.i(subTask.getClass().getCanonicalName());
            this.c.add(subTask);
        }
    }

    @Override // com.alipay.mobile.security.bio.service.BioTaskService
    public int getLeftTaskCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7204a087", new Object[]{this})).intValue() : this.c.size() - this.f;
    }

    @Override // com.alipay.mobile.security.bio.service.BioTaskService
    public int getSubTaskCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("773c071a", new Object[]{this})).intValue() : this.c.size();
    }

    @Override // com.alipay.mobile.security.bio.service.BioTaskService
    public Vector<SubTask> getTasks() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Vector) ipChange.ipc$dispatch("9f2bd343", new Object[]{this}) : this.c;
    }

    @Override // com.alipay.mobile.security.bio.service.BioTaskService
    public void setTaskListener(BioTaskService.TaskListener taskListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d91a356", new Object[]{this, taskListener});
        } else {
            this.b = taskListener;
        }
    }

    @Override // com.alipay.mobile.security.bio.service.BioTaskService
    public void initAndBegin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aefe9c9", new Object[]{this});
            return;
        }
        BioTaskService.TaskListener taskListener = this.b;
        if (taskListener != null) {
            taskListener.onTasksBegin();
        }
        if (this.c.size() > 0) {
            this.d = this.c.get(0);
            this.d.init();
        }
        this.f = 0;
    }

    @Override // com.alipay.mobile.security.bio.service.BioTaskService
    public void clearTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb7aecf9", new Object[]{this});
            return;
        }
        Vector<SubTask> vector = this.c;
        if (vector != null) {
            vector.clear();
        }
        this.f = 0;
    }

    @Override // com.alipay.mobile.security.bio.service.BioTaskService
    public SubTask getCurrentTask() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SubTask) ipChange.ipc$dispatch("ebc08ec5", new Object[]{this}) : this.d;
    }

    @Override // com.alipay.mobile.security.bio.service.BioTaskService
    public <T> void action(ActionFrame<T> actionFrame) {
        int i;
        SubTask subTask;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0320f57", new Object[]{this, actionFrame});
            return;
        }
        SubTask subTask2 = this.d;
        if (subTask2 == null || (i = AnonymousClass1.f5812a[subTask2.action(actionFrame).ordinal()]) == 1 || i == 2 || i != 3 || (subTask = this.d) == null) {
            return;
        }
        subTask.done();
        this.f++;
        if (this.f < this.c.size()) {
            this.d = this.c.get(this.f);
            this.d.init();
            return;
        }
        this.d = null;
    }

    @Override // com.alipay.mobile.security.bio.service.BioTaskService
    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.f = 0;
        Vector<SubTask> vector = this.c;
        if (vector == null) {
            return;
        }
        vector.clear();
    }
}
