package tb;

import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.mainpic.c;

/* loaded from: classes4.dex */
public class euh extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public c f27577a;

    public euh(c cVar) {
        this.f27577a = cVar;
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
        } else {
            this.f27577a.a();
        }
    }
}
