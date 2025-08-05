package com.taobao.android.artry.resource;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.resource.d;
import com.uploader.export.i;
import com.uploader.export.j;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes4.dex */
public class c implements com.uploader.export.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f9073a;
    private List<e> b;
    private AtomicInteger c = new AtomicInteger(0);
    private final int d;
    private d.a e;

    static {
        kge.a(-1436292299);
        kge.a(1593071130);
        f9073a = c.class.getSimpleName();
    }

    public c(List<e> list, d.a aVar) {
        this.b = new ArrayList(list);
        this.d = this.b.size();
        this.e = aVar;
    }

    @Override // com.uploader.export.d
    public void onWait(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1be90445", new Object[]{this, iVar});
            return;
        }
        String str = f9073a;
        StringBuilder sb = new StringBuilder();
        sb.append("waiting on the task[%s]...");
        sb.append(iVar == null ? "" : iVar.getFilePath());
        Log.e(str, sb.toString());
    }

    @Override // com.uploader.export.d
    public void onStart(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ee4d16", new Object[]{this, iVar});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("submit the task[%s]...");
        sb.append(iVar == null ? "" : iVar.getFilePath());
        sb.toString();
    }

    @Override // com.uploader.export.d
    public void onResume(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc5b564d", new Object[]{this, iVar});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("resume the task[%s]...");
        sb.append(iVar == null ? "" : iVar.getFilePath());
        sb.toString();
    }

    @Override // com.uploader.export.d
    public void onPause(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a48f02", new Object[]{this, iVar});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("pause the task[%s]...");
        sb.append(iVar == null ? "" : iVar.getFilePath());
        sb.toString();
    }

    @Override // com.uploader.export.d
    public void onSuccess(i iVar, com.uploader.export.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0ea4aef", new Object[]{this, iVar, eVar});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("success to invoke the task[%s]...");
        sb.append(iVar == null ? "" : iVar.getFilePath());
        sb.toString();
        if (com.taobao.android.artry.utils.d.a(this.b) || !this.b.contains(iVar)) {
            return;
        }
        if (eVar != null && (iVar instanceof e)) {
            e eVar2 = (e) iVar;
            eVar2.f9076a = true;
            eVar2.b = eVar.b();
            eVar2.c = eVar.a();
            try {
                eVar2.d = new JSONObject(eVar.a()).getString("ossObjectKey");
            } catch (Throwable unused) {
            }
        }
        if (this.c.addAndGet(1) < this.d) {
            return;
        }
        a();
    }

    @Override // com.uploader.export.d
    public void onFailure(i iVar, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b751f291", new Object[]{this, iVar, jVar});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("failed the task[%s], the error is %s... ");
        sb.append(iVar == null ? "" : iVar.getFilePath());
        sb.append(" errorcode ");
        sb.append(jVar == null ? "null" : jVar.f24058a);
        sb.toString();
        if (com.taobao.android.artry.utils.d.a(this.b) || !this.b.contains(iVar)) {
            return;
        }
        if (iVar instanceof e) {
            e eVar = (e) iVar;
            eVar.f9076a = false;
            eVar.b = null;
        }
        if (this.c.addAndGet(1) < this.d) {
            return;
        }
        a();
    }

    @Override // com.uploader.export.d
    public void onCancel(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("227e67e0", new Object[]{this, iVar});
            return;
        }
        String str = f9073a;
        StringBuilder sb = new StringBuilder();
        sb.append("cancel the task[%s]...");
        sb.append(iVar == null ? "" : iVar.getFilePath());
        Log.e(str, sb.toString());
    }

    @Override // com.uploader.export.d
    public void onProgress(i iVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43b04c96", new Object[]{this, iVar, new Integer(i)});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("upload the task[%s], the progress is %d...");
        sb.append(iVar == null ? "" : iVar.getFilePath());
        sb.toString();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        d.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        try {
            aVar.a(this.b);
        } catch (Throwable th) {
            String str = f9073a;
            Log.e(str, "failed to invoke the onBatchUploadFinish method..." + th);
        }
    }
}
