package tb;

import com.alibaba.poplayer.norm.IModuleSwitchAdapter;
import com.alibaba.poplayer.norm.ISceneFreqAdapter;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class bzl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IModuleSwitchAdapter f26201a;
    private ISceneFreqAdapter b;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final bzl f26202a;

        static {
            kge.a(-716373377);
            f26202a = new bzl();
        }

        public static /* synthetic */ bzl a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bzl) ipChange.ipc$dispatch("f03088a", new Object[0]) : f26202a;
        }
    }

    static {
        kge.a(1360409004);
    }

    public static bzl a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bzl) ipChange.ipc$dispatch("f03088a", new Object[0]) : a.a();
    }

    public IModuleSwitchAdapter b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IModuleSwitchAdapter) ipChange.ipc$dispatch("ff1f1ed1", new Object[]{this}) : this.f26201a;
    }

    public void a(IModuleSwitchAdapter iModuleSwitchAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a786182c", new Object[]{this, iModuleSwitchAdapter});
        } else {
            this.f26201a = iModuleSwitchAdapter;
        }
    }

    public ISceneFreqAdapter c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ISceneFreqAdapter) ipChange.ipc$dispatch("9c864d0c", new Object[]{this}) : this.b;
    }

    public void a(ISceneFreqAdapter iSceneFreqAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d95d00a", new Object[]{this, iSceneFreqAdapter});
        } else {
            this.b = iSceneFreqAdapter;
        }
    }
}
