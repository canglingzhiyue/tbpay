package tb;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.arch.flow.fatigue.a;
import com.taobao.bootimage.arch.flow.view.c;
import com.taobao.bootimage.data.BootImageInfo;
import java.util.List;

/* loaded from: classes6.dex */
public class srx implements srv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final srw f33875a;

    static {
        kge.a(1046656437);
        kge.a(695380187);
    }

    public srx(srk srkVar, a aVar) {
        this.f33875a = new srw(new srp(), srkVar, aVar);
    }

    @Override // tb.srv
    public void b(List<JSONObject> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0262f69", new Object[]{this, list, new Integer(i)});
            return;
        }
        kej.a("2ARCH_StateMachine", "onStart: ");
        this.f33875a.a(100, i);
    }

    @Override // tb.srv
    public void a(BootImageInfo bootImageInfo, c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac3bf80a", new Object[]{this, bootImageInfo, cVar, new Integer(i)});
            return;
        }
        kej.a("2ARCH_StateMachine", "onCreateView: " + cVar);
    }

    @Override // tb.srv
    public void a(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("603694e4", new Object[]{this, cVar, new Integer(i)});
        } else {
            kej.a("2ARCH_StateMachine", "onViewShown: ");
        }
    }

    @Override // tb.srv
    public void onTerminate(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24cfaf3a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        kej.a("2ARCH_StateMachine", "onTerminate: ");
        this.f33875a.a(104, i);
    }

    @Override // tb.srv
    public void a(List<JSONObject> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a074ca", new Object[]{this, list, new Integer(i)});
        } else {
            this.f33875a.a(105, i);
        }
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        kej.a("2ARCH_StateMachine", "setActivity: ");
        this.f33875a.a(activity);
    }
}
