package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.mmd.datasource.bean.SearchApiModel;
import java.util.HashMap;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public final class nty {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final nty INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, SearchApiModel> f31763a;
    private static final HashMap<String, HashMap<String, String>> b;

    static {
        kge.a(569514595);
        INSTANCE = new nty();
        f31763a = new HashMap<>();
        b = new HashMap<>();
    }

    private nty() {
    }

    public final void a(String biz, HashMap<String, String> api) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3202a441", new Object[]{this, biz, api});
            return;
        }
        q.c(biz, "biz");
        q.c(api, "api");
        b.put(biz, api);
    }

    public final HashMap<String, String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("30adc416", new Object[]{this, str});
        }
        if (str != null) {
            return b.get(str);
        }
        return null;
    }

    public final void a(String tab, SearchApiModel apiBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65dace16", new Object[]{this, tab, apiBean});
            return;
        }
        q.c(tab, "tab");
        q.c(apiBean, "apiBean");
        f31763a.put(tab, apiBean);
    }

    public final SearchApiModel a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchApiModel) ipChange.ipc$dispatch("317bbe48", new Object[]{this, str});
        }
        if (str != null) {
            return f31763a.get(str);
        }
        return null;
    }
}
