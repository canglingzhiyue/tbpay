package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.analytics.core.sync.b;
import com.alibaba.analytics.core.sync.e;
import com.alibaba.analytics.core.sync.h;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class apa implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private h f25492a;
    private int b = 0;

    static {
        kge.a(-5706439);
        kge.a(1578308352);
    }

    public apa() {
        try {
            this.f25492a = new h();
            this.f25492a.a("s-adashx.ut.taobao.com");
            this.f25492a.b(2);
            a(apg.a(aob.a().k(), apb.TAG_STATIC_TNET_HOST_PORT));
            a(aqb.a(aob.a().k(), apb.TAG_STATIC_TNET_HOST_PORT));
        } catch (Throwable unused) {
        }
    }

    @Override // com.alibaba.analytics.core.sync.e
    public h e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("3a62d683", new Object[]{this});
        }
        if (this.b < aow.a().e()) {
            return this.f25492a;
        }
        return null;
    }

    @Override // com.alibaba.analytics.core.sync.e
    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("617dc0c5", new Object[]{this, bVar});
        } else if (bVar.a()) {
            this.b = 0;
        } else {
            this.b++;
        }
    }

    private void a(String str) {
        String trim;
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str) || (indexOf = (trim = str.trim()).indexOf(":")) == -1) {
        } else {
            String substring = trim.substring(0, indexOf);
            int parseInt = Integer.parseInt(trim.substring(indexOf + 1, trim.length()));
            if (StringUtils.isEmpty(substring) || parseInt <= 0) {
                return;
            }
            this.f25492a.a(substring);
            this.f25492a.a(parseInt);
        }
    }
}
