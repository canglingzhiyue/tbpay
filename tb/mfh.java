package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.b;
import com.taobao.android.detail2.core.framework.view.feeds.d;
import com.taobao.android.detail2.core.framework.view.feeds.e;

/* loaded from: classes5.dex */
public class mfh extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2088717742);
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.e
    public void a(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3526812", new Object[]{this, str, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.e
    public boolean b(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1cf2bb88", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.e
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public mfh(fmd fmdVar, b bVar, d dVar) {
        super(fmdVar, bVar, dVar);
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.e
    public float e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[]{this})).floatValue() : moo.b(this.b);
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.e
    public float f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1dd", new Object[]{this})).floatValue() : moo.a(this.b);
    }
}
