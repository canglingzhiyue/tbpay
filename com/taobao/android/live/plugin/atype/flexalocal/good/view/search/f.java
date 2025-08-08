package com.taobao.android.live.plugin.atype.flexalocal.good.view.search;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.spy;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<SearchHistory> f13889a = new ArrayList(20);
    private SharedPreferences b;

    static {
        kge.a(-1630727878);
    }

    public f(Context context) {
        a(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        List list = null;
        try {
            this.b = context.getSharedPreferences(spy.BIZ_GOODS_LIST, 0);
            list = JSON.parseArray(this.b.getString("goods-search-history", ""), SearchHistory.class);
        } catch (Throwable unused) {
        }
        if (list == null || list.size() <= 0) {
            return;
        }
        int min = Math.min(list.size(), 20);
        for (int i = 0; i < min; i++) {
            this.f13889a.add(list.get(i));
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            SearchHistory searchHistory = new SearchHistory(str);
            this.f13889a.remove(searchHistory);
            this.f13889a.add(0, searchHistory);
            if (this.f13889a.size() <= 20) {
                return;
            }
            List<SearchHistory> list = this.f13889a;
            String str2 = "history reach max, remove last one -- " + list.remove(list.size() - 1);
        }
    }

    public List<SearchHistory> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.f13889a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        List<SearchHistory> list = this.f13889a;
        if (list == null) {
            return;
        }
        list.clear();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.b.edit().putString("goods-search-history", JSON.toJSONString(this.f13889a)).apply();
        }
    }
}
