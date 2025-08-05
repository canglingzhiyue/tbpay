package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.g;
import com.taobao.zcache.ResourceResponse;
import com.taobao.zcache.ResourceResponseCallback;

/* loaded from: classes4.dex */
public abstract class xit implements ResourceResponseCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1983357274);
        kge.a(1653717064);
    }

    public abstract void a(ResourceResponse resourceResponse);

    @Override // com.taobao.zcache.ResourceResponseCallback
    public void finish(ResourceResponse resourceResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b4c3406", new Object[]{this, resourceResponse});
            return;
        }
        try {
            a(resourceResponse);
        } catch (Throwable th) {
            a(th);
        }
    }

    public void a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
        } else {
            g.a(th);
        }
    }
}
