package com.taobao.taolive.sdk.adapter.network;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import tb.kge;

/* loaded from: classes8.dex */
public abstract class NetBaseOutDo implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String api;
    private String[] ret;
    private String v;

    static {
        kge.a(-238510219);
        kge.a(-540945145);
    }

    /* renamed from: getData */
    public abstract Object mo1437getData();

    public String getApi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("67b7a95", new Object[]{this}) : this.api;
    }

    public void setApi(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b780bae9", new Object[]{this, str});
        } else {
            this.api = str;
        }
    }

    public String getV() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("22bdab39", new Object[]{this}) : this.v;
    }

    public void setV(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe82bc5", new Object[]{this, str});
        } else {
            this.v = str;
        }
    }

    public String[] getRet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("64c49bc1", new Object[]{this}) : this.ret;
    }

    public void setRet(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("923179", new Object[]{this, strArr});
        } else {
            this.ret = strArr;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "NetBaseOutDo{api='" + this.api + "', v='" + this.v + "', ret=" + Arrays.toString(this.ret) + '}';
    }
}
