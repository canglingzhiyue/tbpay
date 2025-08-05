package com.taobao.taopai2.material.business.res;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.kge;
import tb.pzc;
import tb.qbq;
import tb.qcf;
import tb.rsj;

/* loaded from: classes8.dex */
public class d implements rsj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private qbq f22091a;
    private com.taobao.taopai.material.request.materialfile.a b;
    private com.taobao.taopai.material.request.materialfile.b c;
    private boolean d = true;

    static {
        kge.a(1760338741);
        kge.a(2122870431);
    }

    public static /* synthetic */ void lambda$3MuV0OqH0lsVRRieX67a7fN9Uh8(d dVar, File file) {
        dVar.b(file);
    }

    public static /* synthetic */ void lambda$GdjDh5LmsgyIoVPf7aYkErRTRDU(d dVar) {
        dVar.d();
    }

    public d(com.taobao.taopai.material.request.materialfile.b bVar, com.taobao.taopai.material.request.materialfile.a aVar) {
        this.c = bVar;
        this.b = aVar;
    }

    public void a(qbq qbqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb01ea58", new Object[]{this, qbqVar});
            return;
        }
        this.f22091a = qbqVar;
        this.f22091a.a(this.b);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        qbq qbqVar = this.f22091a;
        if (qbqVar == null) {
            return;
        }
        qbqVar.b();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.f22091a == null) {
            this.f22091a = new qbq(this.b);
        }
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.taobao.taopai2.material.business.res.-$$Lambda$d$GdjDh5LmsgyIoVPf7aYkErRTRDU
            {
                d.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                d.lambda$GdjDh5LmsgyIoVPf7aYkErRTRDU(d.this);
            }
        });
    }

    public /* synthetic */ void d() {
        final File a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.c.a()) {
            if (!TextUtils.isEmpty(this.c.n())) {
                a2 = new File(this.c.n());
            } else {
                a2 = this.f22091a.a(this.c.j(), this.c.i(), this.c.k());
            }
            if (!a(a2)) {
                pzc.a(new Runnable() { // from class: com.taobao.taopai2.material.business.res.-$$Lambda$d$3MuV0OqH0lsVRRieX67a7fN9Uh8
                    {
                        d.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        d.lambda$3MuV0OqH0lsVRRieX67a7fN9Uh8(d.this, a2);
                    }
                });
                qcf.a(this.c.b(), "file");
                return;
            }
            c();
        } else {
            c();
        }
    }

    public /* synthetic */ void b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("584201a0", new Object[]{this, file});
        } else {
            this.b.a(String.valueOf(this.c.j()), file.getAbsolutePath());
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (this.f22091a == null) {
            this.f22091a = new qbq(this.c.h(), this.b);
        }
        if (!TextUtils.isEmpty(this.c.n())) {
            this.f22091a.a(this.c.n(), this.c.k());
        } else {
            this.f22091a.a(this.c.b(), String.valueOf(this.c.j()), this.c.k(), this.c.i(), this.d);
        }
    }

    private boolean a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{this, file})).booleanValue();
        }
        if (file != null) {
            String absolutePath = file.getAbsolutePath();
            if (!TextUtils.isEmpty(absolutePath)) {
                File file2 = new File(absolutePath);
                if (file2.exists() && System.currentTimeMillis() - file2.lastModified() <= b()) {
                    return false;
                }
            }
        }
        return true;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.c.c() * 1000;
    }
}
