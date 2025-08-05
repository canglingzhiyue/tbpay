package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.b;
import com.taobao.android.launcher.common.f;

/* loaded from: classes5.dex */
public class gut extends gtk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final f f28467a = new gth();

        public static /* synthetic */ f a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("527ec1ff", new Object[0]) : f28467a;
        }
    }

    @Override // tb.gtk
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        }
    }

    @Override // tb.gtk
    public b<String, Void> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("642ff9a9", new Object[]{this});
        }
        return null;
    }

    @Override // tb.gtk
    public b<String, Void> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("cb08b96a", new Object[]{this});
        }
        return null;
    }

    public gut(gua guaVar) {
        super(guaVar);
    }

    @Override // tb.gtk
    public f f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("7778cb9a", new Object[]{this}) : a.a();
    }
}
