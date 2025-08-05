package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.engine.invoke.biz.b;
import com.taobao.infoflow.protocol.engine.invoke.biz.c;
import com.taobao.infoflow.protocol.engine.invoke.biz.d;
import com.taobao.infoflow.protocol.engine.invoke.biz.e;
import com.taobao.infoflow.protocol.engine.invoke.biz.f;
import com.taobao.infoflow.protocol.engine.invoke.biz.g;
import com.taobao.infoflow.protocol.engine.invoke.biz.h;
import com.taobao.infoflow.protocol.engine.invoke.biz.j;
import com.taobao.infoflow.protocol.engine.invoke.biz.k;
import com.taobao.infoflow.protocol.engine.invoke.biz.l;
import com.taobao.infoflow.protocol.subservice.biz.ISceneService;

/* loaded from: classes.dex */
public class ldn implements lkj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ISceneService f30503a;

    static {
        kge.a(-1764285967);
        kge.a(-1774366545);
    }

    public ldn(ljs ljsVar, ISceneService iSceneService) {
        this.f30503a = iSceneService;
    }

    @Override // tb.lkj
    public b getContainerInvoker() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("fe95b7ea", new Object[]{this}) : this.f30503a.getContainerInvoker();
    }

    @Override // tb.lkj
    public h getPullDownRefreshInvoker() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("cb98e77", new Object[]{this}) : this.f30503a.getPullDownRefreshInvoker();
    }

    @Override // tb.lkj
    public j getRocketInvoker() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("f071c461", new Object[]{this}) : this.f30503a.getRocketInvoker();
    }

    @Override // tb.lkj
    public l getUtInvoker() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("6541bcea", new Object[]{this}) : this.f30503a.getUtInvoker();
    }

    @Override // tb.lkj
    public e getNaviBarInvoker() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("3391ad3", new Object[]{this}) : this.f30503a.getNaviBarInvoker();
    }

    @Override // tb.lkj
    public c getGlobalThemeInvoker() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("9859236e", new Object[]{this}) : this.f30503a.getGlobalThemeInvoker();
    }

    @Override // tb.lkj
    public d getMulticlassTabInvoker() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("bfefc85d", new Object[]{this}) : this.f30503a.getMulticlassTabInvoker();
    }

    @Override // tb.lkj
    public f getOutLinkInvoker() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("c706464d", new Object[]{this}) : this.f30503a.getOutLinkInvoker();
    }

    @Override // tb.lkj
    public g getPopInvoker() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("cee405d5", new Object[]{this}) : this.f30503a.getPopInvoker();
    }

    @Override // tb.lkj
    public k getTopViewInvoker() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("d4ce611a", new Object[]{this}) : this.f30503a.getTopViewInvoker();
    }

    @Override // tb.lkj
    public tmu getPassParamsInvoker() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tmu) ipChange.ipc$dispatch("dcc67f16", new Object[]{this}) : this.f30503a.getPassParamsInvoker();
    }
}
