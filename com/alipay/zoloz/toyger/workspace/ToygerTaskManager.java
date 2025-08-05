package com.alipay.zoloz.toyger.workspace;

import android.os.Handler;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.BioTaskService;
import com.alipay.mobile.security.bio.task.ActionFrame;
import com.alipay.mobile.security.bio.task.SubTask;
import com.alipay.zoloz.toyger.interfaces.ToygerCallback;
import com.alipay.zoloz.toyger.upload.UploadManager;
import com.alipay.zoloz.toyger.widget.ToygerCirclePattern;
import com.alipay.zoloz.toyger.workspace.task.CherryCaptureTask;
import com.alipay.zoloz.toyger.workspace.task.ToygerBaseTask;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class ToygerTaskManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f6337a;
    private BioServiceManager b;
    private ToygerCirclePattern c;
    private BioTaskService d;
    private Handler e;
    private ToygerCallback f;
    private UploadManager g;

    public ToygerTaskManager(BioServiceManager bioServiceManager, ToygerCirclePattern toygerCirclePattern, Handler handler, ToygerCallback toygerCallback, UploadManager uploadManager) {
        this.b = bioServiceManager;
        this.c = toygerCirclePattern;
        this.e = handler;
        this.d = (BioTaskService) this.b.getBioService(BioTaskService.class);
        this.f = toygerCallback;
        this.g = uploadManager;
    }

    public void resetTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d7d31fb", new Object[]{this});
            return;
        }
        this.f6337a = true;
        a();
        CherryCaptureTask cherryCaptureTask = new CherryCaptureTask(this.b, this.c, this.e, this.f);
        cherryCaptureTask.setUploadManager(this.g);
        BioTaskService bioTaskService = this.d;
        if (bioTaskService == null) {
            return;
        }
        bioTaskService.addTask(cherryCaptureTask);
        this.d.initAndBegin();
    }

    public void action(ActionFrame actionFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0320f57", new Object[]{this, actionFrame});
            return;
        }
        BioTaskService bioTaskService = this.d;
        if (bioTaskService == null || !this.f6337a) {
            return;
        }
        bioTaskService.action(actionFrame);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        BioTaskService bioTaskService = this.d;
        if (bioTaskService == null) {
            return;
        }
        Iterator<SubTask> it = bioTaskService.getTasks().iterator();
        while (it.hasNext()) {
            SubTask next = it.next();
            if (next instanceof ToygerBaseTask) {
                ((ToygerBaseTask) next).stop();
            }
        }
        this.d.clearTask();
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        a();
        this.f6337a = false;
        this.b = null;
        this.c = null;
        this.e = null;
        this.d = null;
    }
}
