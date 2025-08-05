package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.communication.a;
import com.taobao.android.detail.ttdetail.widget.desc.picgallery.c;

/* loaded from: classes5.dex */
public class szp extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c f33973a;

    static {
        kge.a(1428468166);
    }

    public szp(c cVar) {
        this.f33973a = cVar;
    }

    public c b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("92f87278", new Object[]{this}) : this.f33973a;
    }
}
