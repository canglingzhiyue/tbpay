package com.taobao.update;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.j;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.req;

/* loaded from: classes9.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private req f23426a = (req) com.taobao.update.framework.a.getInstance(req.class);
    private j b = j.createInstance();
    private Map<String, j.c> c = new ConcurrentHashMap();

    static {
        kge.a(1569838396);
    }

    public static /* synthetic */ Map a(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7c933338", new Object[]{iVar}) : iVar.c;
    }

    public static /* synthetic */ j b(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("c20ce49c", new Object[]{iVar}) : iVar.b;
    }

    public j getTasks() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("d6cf5919", new Object[]{this}) : this.b;
    }

    public void addTask(String str, j.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22e89ab4", new Object[]{this, str, cVar});
        } else {
            this.c.put(str, cVar);
        }
    }

    public void idleRun() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6bca31e", new Object[]{this});
        } else {
            this.f23426a.execute(new Runnable() { // from class: com.taobao.update.i.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    for (Map.Entry entry : i.a(i.this).entrySet()) {
                        entry.getKey();
                        ((j.c) entry.getValue()).run();
                    }
                    i.b(i.this).shutDown();
                }
            });
        }
    }
}
