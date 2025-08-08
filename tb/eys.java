package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.h;
import com.taobao.android.detail.ttdetail.component.module.n;

/* loaded from: classes4.dex */
public class eys implements n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ eyq f27661a;

    public eys(eyq eyqVar) {
        this.f27661a = eyqVar;
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.n
    public void a(String str, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18670bf2", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        h a2 = eyq.f(this.f27661a).a(eyq.c(this.f27661a).getCurrentItem());
        if (a2 == null || !StringUtils.equals(str, ((ezc) a2.getComponentData()).b())) {
            return;
        }
        eyq.a(this.f27661a, (i3 * 1.0f) / i4, true);
    }
}
