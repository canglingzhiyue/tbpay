package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.ISceneService;

/* loaded from: classes.dex */
public class ldp implements lkm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ISceneService f30505a;

    static {
        kge.a(688892403);
        kge.a(1680316397);
    }

    public ldp(ljs ljsVar, ISceneService iSceneService) {
        this.f30505a = iSceneService;
    }

    @Override // tb.lld
    public void onPageScrolled(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e3dde4", new Object[]{this, new Float(f), new Integer(i)});
        } else {
            this.f30505a.onPageScrolled(f, i);
        }
    }

    @Override // tb.lld
    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
        } else {
            this.f30505a.onPageSelected();
        }
    }

    @Override // tb.lld
    public void onPageUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dadaf89", new Object[]{this});
        } else {
            this.f30505a.onPageUnSelected();
        }
    }
}
