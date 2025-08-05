package com.ali.user.open.core.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes2.dex */
public class RpcRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String mtopInstanceName;
    public int mtopInstanceType;
    public String target;
    public String version;
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;
    public boolean SHOW_LOGIN_UI = true;
    public ArrayList<String> paramNames = new ArrayList<>();
    public ArrayList<Object> paramValues = new ArrayList<>();

    static {
        kge.a(-1410463520);
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
        return "RpcRequest [target=" + this.target + ", version=" + this.version + ", params=]";
    }
}
