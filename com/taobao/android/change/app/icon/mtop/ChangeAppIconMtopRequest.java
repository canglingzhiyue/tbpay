package com.taobao.android.change.app.icon.mtop;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes4.dex */
public class ChangeAppIconMtopRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String API_NAME;
    public String dailyDomain;
    public String onlineDomain;
    public String preDomain;
    public int requestSite;
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;
    public ArrayList<String> paramNames = new ArrayList<>();
    public ArrayList<Object> paramValues = new ArrayList<>();
    public int connectionTimeoutMilliSecond = 7000;
    public int socketTimeoutMilliSecond = 7000;

    static {
        kge.a(395889224);
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

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ChangeAppIconMtopRequest{API_NAME='" + this.API_NAME + "', VERSION='" + this.VERSION + "', NEED_ECODE=" + this.NEED_ECODE + ", NEED_SESSION=" + this.NEED_SESSION + ", paramNames=" + this.paramNames + ", paramValues=" + this.paramValues + ", requestSite=" + this.requestSite + ", dailyDomain='" + this.dailyDomain + "', preDomain='" + this.preDomain + "', onlineDomain='" + this.onlineDomain + "', connectionTimeoutMilliSecond=" + this.connectionTimeoutMilliSecond + ", socketTimeoutMilliSecond=" + this.socketTimeoutMilliSecond + '}';
    }
}
