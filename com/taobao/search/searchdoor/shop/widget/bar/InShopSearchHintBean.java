package com.taobao.search.searchdoor.shop.widget.bar;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes8.dex */
public final class InShopSearchHintBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String displayText = "";
    private String searchText = "";
    private String tab = "";
    private String level = "0";
    private String end_price = "";
    private String start_price = "";
    private String sort = "";
    private String ppath = "";
    private Map<String, String> utLogMap = new HashMap();
    private String suggest_rn = "";
    private String service = "";
    private String catmap = "";

    static {
        kge.a(-1047105843);
    }

    public final String getDisplayText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1487d8c0", new Object[]{this}) : this.displayText;
    }

    public final void setDisplayText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942a6e1e", new Object[]{this, str});
            return;
        }
        q.c(str, "<set-?>");
        this.displayText = str;
    }

    public final String getSearchText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("df2fcee", new Object[]{this}) : this.searchText;
    }

    public final void setSearchText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27562848", new Object[]{this, str});
            return;
        }
        q.c(str, "<set-?>");
        this.searchText = str;
    }

    public final String getTab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b408fffa", new Object[]{this}) : this.tab;
    }

    public final void setTab(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bba3e224", new Object[]{this, str});
            return;
        }
        q.c(str, "<set-?>");
        this.tab = str;
    }

    public final String getLevel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("33eab9eb", new Object[]{this}) : this.level;
    }

    public final void setLevel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6451953", new Object[]{this, str});
            return;
        }
        q.c(str, "<set-?>");
        this.level = str;
    }

    public final String getEnd_price() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a061742a", new Object[]{this}) : this.end_price;
    }

    public final void setEnd_price(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee0accf4", new Object[]{this, str});
            return;
        }
        q.c(str, "<set-?>");
        this.end_price = str;
    }

    public final String getStart_price() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4e1d6c3", new Object[]{this}) : this.start_price;
    }

    public final void setStart_price(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff10307b", new Object[]{this, str});
            return;
        }
        q.c(str, "<set-?>");
        this.start_price = str;
    }

    public final String getSort() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2ddf2565", new Object[]{this}) : this.sort;
    }

    public final void setSort(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2284c7b1", new Object[]{this, str});
            return;
        }
        q.c(str, "<set-?>");
        this.sort = str;
    }

    public final String getPpath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c13ad7a", new Object[]{this}) : this.ppath;
    }

    public final void setPpath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b33a97a4", new Object[]{this, str});
            return;
        }
        q.c(str, "<set-?>");
        this.ppath = str;
    }

    public final Map<String, String> getUtLogMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("748e55a9", new Object[]{this}) : this.utLogMap;
    }

    public final void setUtLogMap(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d161205", new Object[]{this, map});
            return;
        }
        q.c(map, "<set-?>");
        this.utLogMap = map;
    }

    public final String getSuggest_rn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f84ec44c", new Object[]{this}) : this.suggest_rn;
    }

    public final void setSuggest_rn(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88734caa", new Object[]{this, str});
            return;
        }
        q.c(str, "<set-?>");
        this.suggest_rn = str;
    }

    public final String getService() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("afa701da", new Object[]{this}) : this.service;
    }

    public final void setService(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c3cc244", new Object[]{this, str});
            return;
        }
        q.c(str, "<set-?>");
        this.service = str;
    }

    public final String getCatmap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("456a0bbd", new Object[]{this}) : this.catmap;
    }

    public final void setCatmap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7815959", new Object[]{this, str});
            return;
        }
        q.c(str, "<set-?>");
        this.catmap = str;
    }
}
