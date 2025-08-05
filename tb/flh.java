package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.b;
import com.taobao.android.detail2.core.framework.data.DetailDataManager;
import com.taobao.android.detail2.core.framework.e;
import com.taobao.android.detail2.core.framework.view.feeds.d;

/* loaded from: classes5.dex */
public class flh implements e.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public fmd f28028a;
    public DetailDataManager b;
    public b c;

    static {
        kge.a(353183321);
        kge.a(-325923294);
    }

    @Override // com.taobao.android.detail2.core.framework.e.a
    public void a(d dVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("552393d9", new Object[]{this, dVar, jSONObject});
        }
    }

    public flh(b bVar, fmd fmdVar, DetailDataManager detailDataManager) {
        this.c = bVar;
        this.f28028a = fmdVar;
        this.b = detailDataManager;
    }

    @Override // com.taobao.android.detail2.core.framework.e.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        flo i = this.b.i();
        if (i == null) {
            return;
        }
        i.a(this.c.g());
    }
}
