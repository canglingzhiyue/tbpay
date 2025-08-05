package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.b;
import com.taobao.android.detail2.core.framework.data.DetailDataManager;
import com.taobao.android.detail2.core.framework.view.feeds.d;

/* loaded from: classes5.dex */
public class fli extends flh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1747133462);
    }

    public fli(b bVar, fmd fmdVar, DetailDataManager detailDataManager) {
        super(bVar, fmdVar, detailDataManager);
    }

    @Override // tb.flh, com.taobao.android.detail2.core.framework.e.a
    public void a(d dVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("552393d9", new Object[]{this, dVar, jSONObject});
        } else if (dVar == null || dVar.F() != 0) {
        } else {
            if (dVar.H() != null && !dVar.H().y) {
                return;
            }
            this.b.a(this.c.h().f(), false);
        }
    }
}
