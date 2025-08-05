package tb;

import com.alibaba.analytics.core.db.annotation.Column;
import com.alibaba.analytics.core.db.annotation.Ingore;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class aof {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Ingore

    /* renamed from: a  reason: collision with root package name */
    private static boolean f25468a;
    @Column("_id")
    public long c = -1;

    static {
        kge.a(-56166386);
        f25468a = false;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            aob.a().G().a(this);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            aob.a().G().b(this);
        }
    }
}
