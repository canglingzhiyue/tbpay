package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.jvm.internal.q;
import tb.sui;

/* loaded from: classes9.dex */
public final class sum implements sui {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ITMSPage f33909a;
    private final ITMSPage b;

    static {
        kge.a(-812212266);
        kge.a(2049738243);
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c_(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f4ed18e", new Object[]{this, page});
        } else {
            q.d(page, "page");
        }
    }

    public sum(ITMSPage page, ITMSPage tabPage) {
        q.d(page, "page");
        q.d(tabPage, "tabPage");
        this.f33909a = page;
        this.b = tabPage;
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            sui.a.a(this);
        }
    }

    @Override // tb.sui
    public ITMSPage a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("3648cf19", new Object[]{this}) : this.b;
    }

    @Override // tb.sui
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        suj sujVar = (suj) this.b.a(suj.class);
        if (sujVar == null) {
            return -1;
        }
        return sujVar.a(this.f33909a);
    }
}
