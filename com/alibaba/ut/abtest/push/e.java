package com.alibaba.ut.abtest.push;

import com.alibaba.ut.abtest.internal.util.ClassUtils;
import com.alibaba.ut.abtest.internal.util.h;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cew;
import tb.kge;

/* loaded from: classes.dex */
public class e implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private f f4218a;

    static {
        kge.a(-1083242445);
        kge.a(-733928589);
    }

    @Override // com.alibaba.ut.abtest.push.d
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        h.a("PushServiceImpl", "initialize.");
        try {
            d();
            if (this.f4218a == null) {
                return false;
            }
            this.f4218a.initialize();
            return true;
        } catch (Exception e) {
            com.alibaba.ut.abtest.internal.util.b.a("PushServiceImpl.initialize", e);
            return false;
        }
    }

    @Override // com.alibaba.ut.abtest.push.d
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        h.a("PushServiceImpl", "unbindService.");
        synchronized (e.class) {
            if (this.f4218a != null) {
                this.f4218a.destory();
                this.f4218a = null;
            }
        }
        return true;
    }

    @Override // com.alibaba.ut.abtest.push.d
    public void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
            return;
        }
        if (z) {
            h.b("PushServiceImpl", "【实验数据】开始强制更新实验数据。");
        } else {
            h.b("PushServiceImpl", "【实验数据】开始更新实验数据。");
        }
        f fVar = this.f4218a;
        if (fVar == null) {
            return;
        }
        fVar.syncExperiments(z, str);
    }

    @Override // com.alibaba.ut.abtest.push.d
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        h.a("PushServiceImpl", "isCrowd. pushClient=" + this.f4218a + ", crowdId=" + str);
        f fVar = this.f4218a;
        if (fVar == null) {
            return false;
        }
        return fVar.isCrowd(str);
    }

    @Override // com.alibaba.ut.abtest.push.d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        h.a("PushServiceImpl", "cancelSyncCrowd");
        f fVar = this.f4218a;
        if (fVar == null) {
            return;
        }
        fVar.cancelSyncCrowd();
    }

    private f d() {
        f fVar = this.f4218a;
        if (fVar != null) {
            return fVar;
        }
        Class<?> a2 = ClassUtils.a(cew.a.PUSHCLIENT_CLASSNAME, null);
        if (a2 == null) {
            return null;
        }
        try {
            this.f4218a = (f) a2.newInstance();
            return this.f4218a;
        } catch (Exception e) {
            h.c("PushServiceImpl", e.getMessage(), e);
            return null;
        }
    }
}
