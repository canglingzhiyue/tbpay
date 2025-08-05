package tb;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.n;
import com.taobao.android.launcher.bootstrap.tao.f;

/* loaded from: classes.dex */
public class gtw implements n, gtu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final gtv f28451a;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Application f28452a;
        private final gtx b;

        public a(Application application, gtx gtxVar) {
            this.f28452a = application;
            this.b = gtxVar;
        }

        public gtu a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (gtu) ipChange.ipc$dispatch("f0538f6", new Object[]{this}) : new gtw(this.f28452a, this.b);
        }
    }

    private gtw(Application application, gtx gtxVar) {
        gvt.a("Bootstrap");
        this.f28451a = f.a(application, gtxVar);
        this.f28451a.a(application, gtxVar);
        gvt.a();
    }

    @Override // tb.gtu
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        gvt.a("Bootstrap#attachBaseContext");
        this.f28451a.a(context);
        gvt.a();
    }

    @Override // tb.gtu
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        gvt.a("Bootstrap#onCreate");
        this.f28451a.a();
        gvt.a();
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.n
    public boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue();
        }
        gtv gtvVar = this.f28451a;
        if (!(gtvVar instanceof n)) {
            return false;
        }
        return ((n) gtvVar).b(context);
    }
}
