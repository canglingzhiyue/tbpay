package com.taobao.infoflow.core.subservice.base.item.dxservice.impl.render;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.ba;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import java.io.Serializable;
import tb.kge;
import tb.ljs;

/* loaded from: classes.dex */
public class InfoFlowDxUserContext extends ba implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final BaseSectionModel<?> mBaseSectionModel;
    private JSONObject mContext = new JSONObject();
    private final ljs mInfoFlowContext;

    static {
        kge.a(-899549132);
        kge.a(1028243835);
    }

    public InfoFlowDxUserContext(ljs ljsVar, BaseSectionModel<?> baseSectionModel) {
        this.mInfoFlowContext = ljsVar;
        this.mBaseSectionModel = baseSectionModel;
    }

    public ljs getInfoFlowContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ljs) ipChange.ipc$dispatch("3fbbbb0d", new Object[]{this}) : this.mInfoFlowContext;
    }

    public BaseSectionModel<?> getBaseSectionModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseSectionModel) ipChange.ipc$dispatch("7b1cb86c", new Object[]{this}) : this.mBaseSectionModel;
    }

    public InfoFlowDxUserContext addContext(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InfoFlowDxUserContext) ipChange.ipc$dispatch("920f3b38", new Object[]{this, str, obj});
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
