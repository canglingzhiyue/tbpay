package com.taobao.search.searchdoor.searchbar.data;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class SearchBarHintStructuredBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private List<com.taobao.search.searchdoor.searchbar.data.a> infoList;

    static {
        kge.a(888022967);
        Companion = new a(null);
    }

    @JvmStatic
    public static final SearchBarHintStructuredBean parseStructuredInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SearchBarHintStructuredBean) ipChange.ipc$dispatch("e86469b1", new Object[]{jSONObject}) : Companion.a(jSONObject);
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(666180159);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        @JvmStatic
        public final SearchBarHintStructuredBean a(JSONObject jSONObject) {
            JSONArray a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SearchBarHintStructuredBean) ipChange.ipc$dispatch("18967ce2", new Object[]{this, jSONObject});
            }
            if (jSONObject == null || jSONObject.isEmpty() || (a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "infoList")) == null || a2.isEmpty()) {
                return null;
            }
            SearchBarHintStructuredBean searchBarHintStructuredBean = new SearchBarHintStructuredBean();
            searchBarHintStructuredBean.setInfoList(new ArrayList());
            int size = a2.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject2 = a2.getJSONObject(i);
                String a3 = com.taobao.android.searchbaseframe.util.a.a(jSONObject2, "type", "");
                if (q.a((Object) "image", (Object) a3)) {
                    b a4 = b.Companion.a(jSONObject2);
                    if (a4 != null) {
                        List<com.taobao.search.searchdoor.searchbar.data.a> infoList = searchBarHintStructuredBean.getInfoList();
                        if (infoList == null) {
                            q.a();
                        }
                        infoList.add(a4);
                    }
                } else if (q.a((Object) com.taobao.search.searchdoor.searchbar.data.a.TYPE_IMAGE_TEXT, (Object) a3)) {
                    d a5 = d.Companion.a(jSONObject2);
                    if (a5 != null) {
                        List<com.taobao.search.searchdoor.searchbar.data.a> infoList2 = searchBarHintStructuredBean.getInfoList();
                        if (infoList2 == null) {
                            q.a();
                        }
                        infoList2.add(a5);
                    }
                } else {
                    c a6 = c.Companion.a(jSONObject2);
                    if (a6 != null) {
                        List<com.taobao.search.searchdoor.searchbar.data.a> infoList3 = searchBarHintStructuredBean.getInfoList();
                        if (infoList3 == null) {
                            q.a();
                        }
                        infoList3.add(a6);
                    }
                }
            }
            List<com.taobao.search.searchdoor.searchbar.data.a> infoList4 = searchBarHintStructuredBean.getInfoList();
            if (infoList4 == null) {
                q.a();
            }
            if (!infoList4.isEmpty()) {
                return searchBarHintStructuredBean;
            }
            return null;
        }
    }

    public final List<com.taobao.search.searchdoor.searchbar.data.a> getInfoList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("33e2efbe", new Object[]{this}) : this.infoList;
    }

    public final void setInfoList(List<com.taobao.search.searchdoor.searchbar.data.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e1e8166", new Object[]{this, list});
        } else {
            this.infoList = list;
        }
    }
}
