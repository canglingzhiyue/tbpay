package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.q;
import com.taobao.search.sf.datasource.c;

/* loaded from: classes7.dex */
public class nnz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static nnz f31605a;
    private String b = "";
    private c c;

    static {
        kge.a(-1839955691);
        f31605a = new nnz();
    }

    private nnz() {
    }

    public static nnz a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nnz) ipChange.ipc$dispatch("f0851a4", new Object[0]) : f31605a;
    }

    public String a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d06a5e08", new Object[]{this, cVar});
        }
        this.c = cVar;
        this.b = String.valueOf(System.currentTimeMillis());
        return this.b;
    }

    public c a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("6d97b7a2", new Object[]{this, str});
        }
        if (!StringUtils.equals(str, this.b)) {
            q.a("SearchDatasourceManager", "token is invalid");
            return null;
        }
        c cVar = this.c;
        if (cVar == null) {
            q.a("SearchDatasourceManager", "there is no live datasource");
            return null;
        }
        this.b = "";
        this.c = null;
        return cVar;
    }
}
