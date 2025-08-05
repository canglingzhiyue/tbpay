package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.engine.invoke.biz.e;
import com.taobao.oversea.homepage.litetao.service.biz.search.ITaoTeSearchService;

/* loaded from: classes7.dex */
public class ndb implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ljs f31366a;

    public ndb(ljs ljsVar) {
        this.f31366a = ljsVar;
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.e
    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        ITaoTeSearchService iTaoTeSearchService = (ITaoTeSearchService) this.f31366a.a(ITaoTeSearchService.class);
        if (iTaoTeSearchService == null) {
            return null;
        }
        return iTaoTeSearchService.getSearchData();
    }
}
