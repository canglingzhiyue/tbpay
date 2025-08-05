package com.taobao.tao.flexbox.layoutmanager.adapter.interfaces;

import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public interface t {
    public static final String BIZ_LIVE = "live";
    public static final String BIZ_TAB2 = "tab2";
    public static final String MODULE_COMMUNITY = "community";
    public static final String MODULE_FULL_PAGE = "fullpage";
    public static final String MODULE_LIVE = "innerlive";

    Map<String, String> a();

    void a(String str);

    void a(String str, String str2);

    void a(String str, String str2, String str3, Map map);

    void a(String str, String str2, Map map);

    void a(String str, String str2, Map<String, Object> map, Map<String, Object> map2);

    void a(String str, List list);

    void a(String[] strArr);

    void b(String str, String str2);
}
