package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.ba;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public class iou extends ba {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<c> f29196a;

    static {
        kge.a(-1820599654);
    }

    public iou(c cVar) {
        this.f29196a = new WeakReference<>(cVar);
    }

    public c d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("ce66bfb2", new Object[]{this}) : this.f29196a.get();
    }
}
