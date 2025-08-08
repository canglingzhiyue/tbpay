package tb;

import android.support.v4.util.ArrayMap;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.q;
import com.taobao.search.searchdoor.searchbar.data.SearchBarHintBean;

/* loaded from: classes7.dex */
public class npx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ArrayMap<String, SearchBarHintBean> f31636a = new ArrayMap<>();

    static {
        kge.a(-2072116314);
    }

    public void a(String str, SearchBarHintBean searchBarHintBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49d6ff89", new Object[]{this, str, searchBarHintBean});
        } else if (StringUtils.isEmpty(str)) {
            q.b("SearchBarHintManager", "addSearchBarHint tab is empty");
        } else if (searchBarHintBean == null) {
            q.b("SearchBarHintManager", "searchBarHint is null");
        } else {
            this.f31636a.put(str, searchBarHintBean);
        }
    }

    public SearchBarHintBean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchBarHintBean) ipChange.ipc$dispatch("9e49b8dd", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            q.b("SearchBarHintManager", "getSearchBarHint tab is empty");
            return null;
        }
        return this.f31636a.get(str);
    }
}
