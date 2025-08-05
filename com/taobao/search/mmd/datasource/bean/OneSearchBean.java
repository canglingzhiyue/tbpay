package com.taobao.search.mmd.datasource.bean;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class OneSearchBean implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String abtest;
    public String backgroundColor;
    public String from;
    public int height;
    public boolean isFull;
    public boolean isNewSearch;
    public boolean isRedirect;
    public boolean isSearchBarHidden;
    public String keyword;
    public Map<String, String> nextPageTraceMap;
    public String rn;
    public String url;
    public int width;

    static {
        kge.a(1598018762);
        kge.a(1028243835);
    }

    public static OneSearchBean convertFromSFOnesearchBean(SFOnesearchBean sFOnesearchBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OneSearchBean) ipChange.ipc$dispatch("b694523c", new Object[]{sFOnesearchBean});
        }
        if (sFOnesearchBean == null) {
            return null;
        }
        OneSearchBean oneSearchBean = new OneSearchBean();
        oneSearchBean.url = sFOnesearchBean.url.trim();
        oneSearchBean.isFull = sFOnesearchBean.isFull;
        oneSearchBean.abtest = sFOnesearchBean.abtest;
        oneSearchBean.height = sFOnesearchBean.height;
        oneSearchBean.width = sFOnesearchBean.width;
        oneSearchBean.keyword = sFOnesearchBean.keyword;
        oneSearchBean.rn = sFOnesearchBean.rn;
        oneSearchBean.nextPageTraceMap = sFOnesearchBean.nextPageTraceMap;
        oneSearchBean.isNewSearch = sFOnesearchBean.isNewSearch;
        oneSearchBean.isSearchBarHidden = sFOnesearchBean.hideNavibar;
        oneSearchBean.isRedirect = sFOnesearchBean.redirect;
        oneSearchBean.backgroundColor = sFOnesearchBean.backgroundColor;
        return oneSearchBean;
    }
}
