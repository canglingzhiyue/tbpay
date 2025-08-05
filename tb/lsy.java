package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService;
import com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.model.b;
import java.util.List;

/* loaded from: classes.dex */
public class lsy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f30907a = -1;
    private IVideoPlayControllerService.b b;
    private List<b> c;

    static {
        kge.a(791552386);
    }

    public void a(IVideoPlayControllerService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1fe7668", new Object[]{this, aVar});
            return;
        }
        c(aVar);
        a((List<b>) null);
    }

    public void a(List<b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.c = list;
        this.f30907a = -1;
    }

    public boolean b(IVideoPlayControllerService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ff1dc4b", new Object[]{this, aVar})).booleanValue();
        }
        List<b> list = this.c;
        if (list == null || list.isEmpty()) {
            ldf.d("PlayControllerQueues", "队列为空");
            return false;
        }
        this.f30907a++;
        if (this.f30907a >= this.c.size()) {
            ldf.d("PlayControllerQueues", "队列已播放完");
            return false;
        }
        IVideoPlayControllerService.b bVar = this.b;
        b bVar2 = this.c.get(this.f30907a);
        IVideoPlayControllerService.b a2 = bVar2.a();
        if (bVar != null && !bVar.equals(a2)) {
            ldf.d("PlayControllerQueues", "停止播放旧视频");
            bVar.b(aVar);
        }
        ldf.d("PlayControllerQueues", "播放：" + this.f30907a + ", 曝光比例：" + bVar2.b().a());
        bVar2.a().a(aVar);
        return true;
    }

    public void c(IVideoPlayControllerService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5de54226", new Object[]{this, aVar});
        } else if (this.b == null) {
        } else {
            ldf.d("PlayControllerQueues", "停止视频：" + this.f30907a);
            this.b.b(aVar);
            this.b = null;
        }
    }

    public void a(IVideoPlayControllerService.a aVar, List<b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2433359", new Object[]{this, aVar, list});
        } else if (list != null && !list.isEmpty() && this.b != null) {
            for (b bVar : list) {
                if (this.b.equals(bVar.a())) {
                    c(aVar);
                }
            }
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b != null;
    }

    public void a(IVideoPlayControllerService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1feeac7", new Object[]{this, bVar});
        } else {
            this.b = bVar;
        }
    }
}
