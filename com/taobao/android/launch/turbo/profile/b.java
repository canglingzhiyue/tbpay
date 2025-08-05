package com.taobao.android.launch.turbo.profile;

import android.content.Context;
import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f13011a = new Handler(Coordinator.getWorkerLooper());
    private a b;

    static {
        kge.a(-1969046751);
    }

    public static /* synthetic */ void a(b bVar, Context context, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61f0ff2d", new Object[]{bVar, context, cVar});
        } else {
            bVar.b(context, cVar);
        }
    }

    public void a(final Context context, final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34e5b23e", new Object[]{this, context, cVar});
        } else {
            this.f13011a.post(new Runnable() { // from class: com.taobao.android.launch.turbo.profile.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        b.a(b.this, context, cVar);
                    }
                }
            });
        }
    }

    private void b(Context context, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbf1993f", new Object[]{this, context, cVar});
        } else if (this.b != null) {
        } else {
            this.b = new a(context, cVar);
            this.b.f();
        }
    }
}
