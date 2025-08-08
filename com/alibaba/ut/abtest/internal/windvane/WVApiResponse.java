package com.alibaba.ut.abtest.internal.windvane;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.ut.abtest.internal.util.g;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mtop.wvplugin.a;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes3.dex */
public class WVApiResponse<T> implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "code")
    private int code;
    @JSONField(name = "data")
    private T data;
    @JSONField(name = "message")
    private String message;
    @JSONField(name = a.RESULT_KEY)
    private String ret;

    static {
        kge.a(-800203876);
        kge.a(1028243835);
    }

    public WVApiResponse() {
        this.code = 0;
    }

    public WVApiResponse(int i) {
        this.code = 0;
        this.code = i;
    }

    public WVApiResponse(int i, String str) {
        this.code = 0;
        this.code = i;
        this.message = str;
    }

    public WVApiResponse(T t) {
        this.code = 0;
        this.code = 0;
        this.data = t;
    }

    public int getCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue() : this.code;
    }

    public void setCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15beaf4d", new Object[]{this, new Integer(i)});
        } else {
            this.code = i;
        }
    }

    public String getMessage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this}) : this.message;
    }

    public void setMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a65216", new Object[]{this, str});
        } else {
            this.message = str;
        }
    }

    public T getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("4ca84d6b", new Object[]{this}) : this.data;
    }

    public void setData(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f836cf", new Object[]{this, t});
        } else {
            this.data = t;
        }
    }

    public String getRet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5a33666e", new Object[]{this}) : this.ret;
    }

    public void setRet(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dac64a30", new Object[]{this, str});
        } else {
            this.ret = str;
        }
    }

    public String toJsonString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d4e3785", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.ret)) {
            this.ret = "HY_SUCCESS";
        }
        return g.a(this);
    }
}
