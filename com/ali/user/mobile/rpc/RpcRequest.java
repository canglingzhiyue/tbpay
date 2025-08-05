package com.ali.user.mobile.rpc;

import com.ali.user.mobile.rpc.filter.IAfterFilter;
import com.ali.user.mobile.rpc.filter.IBeforeFilter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class RpcRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String API_NAME;
    public String dailyDomain;
    public String onlineDomain;
    public String preDomain;
    public int requestSite;
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;
    public int timeoutMilliSecond = 7000;
    public boolean SHOW_LOGIN_UI = true;
    public ArrayList<String> paramNames = new ArrayList<>();
    public ArrayList<Object> paramValues = new ArrayList<>();
    public final List<IBeforeFilter> beforeFilters = new LinkedList();
    public final List<IAfterFilter> afterFilters = new LinkedList();
    public int connectionTimeoutMilliSecond = 7000;
    public int socketTimeoutMilliSecond = 7000;

    static {
        kge.a(1037352604);
    }

    public void addParam(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b71899", new Object[]{this, str, obj});
            return;
        }
        this.paramNames.add(str);
        this.paramValues.add(obj);
    }

    public void addAfter(IAfterFilter iAfterFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0919a6f", new Object[]{this, iAfterFilter});
        } else {
            this.afterFilters.add(iAfterFilter);
        }
    }

    public List<IAfterFilter> getAfterFilters() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("cb833fcb", new Object[]{this}) : this.afterFilters;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RpcRequest{API_NAME='" + this.API_NAME + "', VERSION='" + this.VERSION + "', dailyDomain='" + this.dailyDomain + "', preDomain='" + this.preDomain + "', onlineDomain='" + this.onlineDomain + "'}";
    }
}
