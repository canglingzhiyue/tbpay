package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.a;
import com.taobao.android.searchbaseframe.datasource.result.SearchResult;
import com.taobao.android.searchbaseframe.net.e;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.util.Map;
import kotlin.jvm.internal.q;
import tb.itt;

/* loaded from: classes7.dex */
public final class nnt extends nsq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-54763557);
    }

    @Override // tb.nsq
    public boolean a(CommonSearchResult commonSearchResult, e eVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cdc8ada", new Object[]{this, commonSearchResult, eVar, map})).booleanValue();
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nnt(imn core) {
        super(core);
        q.c(core, "core");
    }

    @Override // tb.nsq, tb.isk
    public /* bridge */ /* synthetic */ boolean a(SearchResult searchResult, e eVar, Map map) {
        return a((CommonSearchResult) searchResult, eVar, (Map<String, String>) map);
    }

    @Override // com.taobao.android.meta.data.f, com.taobao.android.searchbaseframe.datasource.impl.b
    public itt.a a(Map<String, String> map, a.C0571a c0571a) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (itt.a) ipChange.ipc$dispatch("df2e9b1e", new Object[]{this, map, c0571a}) : new itt.a(nnd.WSEARCH_TPP_API_NAME_VALUE, "1.0", "wsearch");
    }
}
