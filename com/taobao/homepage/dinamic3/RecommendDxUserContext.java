package com.taobao.homepage.dinamic3;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.ba;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class RecommendDxUserContext extends ba implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject mContext = new JSONObject();

    static {
        kge.a(-312307023);
        kge.a(1028243835);
    }

    public static RecommendDxUserContext newInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecommendDxUserContext) ipChange.ipc$dispatch("8cebf2fc", new Object[0]) : new RecommendDxUserContext();
    }

    private RecommendDxUserContext() {
    }

    public RecommendDxUserContext addContext(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecommendDxUserContext) ipChange.ipc$dispatch("95d38d1b", new Object[]{this, str, obj});
        }
        this.mContext.put(str, obj);
        return this;
    }

    public String getStringValue(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f60d845", new Object[]{this, str}) : this.mContext.getString(str);
    }

    public int getIntValue(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e8b0a4bc", new Object[]{this, str})).intValue() : this.mContext.getIntValue(str);
    }

    public Object getObject(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c26088ec", new Object[]{this, str}) : this.mContext.get(str);
    }
}
