package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.ISceneService;

/* loaded from: classes.dex */
public class ldm implements lki {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ISceneService f30502a;

    static {
        kge.a(-1660590509);
        kge.a(-1593366559);
    }

    public ldm(ljs ljsVar, ISceneService iSceneService) {
        this.f30502a = iSceneService;
    }

    @Override // tb.lko
    public void onAppToBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938dadf2", new Object[]{this});
        } else {
            this.f30502a.onAppToBackground();
        }
    }

    @Override // tb.lko
    public void onAppToFront() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c238d3", new Object[]{this});
        } else {
            this.f30502a.onAppToFront();
        }
    }
}
