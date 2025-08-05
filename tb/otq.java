package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.NewScrollLogic;

/* loaded from: classes8.dex */
public class otq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final otp f32411a;

    static {
        kge.a(1453608777);
    }

    public otq(otp otpVar, ksk kskVar) {
        this.f32411a = otpVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f32411a.b();
        e.e("WeexCompleteVisibleStatus", "嵌套weex信息流不完全展示了");
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f32411a.a();
        e.e("WeexCompleteVisibleStatus", "嵌套weex信息流完全展示了");
    }

    public void a(NewScrollLogic.PullState pullState, NewScrollLogic.PullState pullState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("722f4868", new Object[]{this, pullState, pullState2});
        } else if (NewScrollLogic.PullState.PULL_TOP.equals(pullState2) && NewScrollLogic.PullState.PULL_MEDIUM.equals(pullState)) {
            e.e("WeexCompleteVisibleStatus", "拖拽weex信息流完全展示了");
            this.f32411a.a();
        } else if (!NewScrollLogic.PullState.PULL_MEDIUM.equals(pullState2) || !NewScrollLogic.PullState.PULL_TOP.equals(pullState)) {
        } else {
            e.e("WeexCompleteVisibleStatus", "拖拽weex信息流不完全展示了");
            this.f32411a.b();
        }
    }
}
