package com.taobao.linkmanager.flowout.data;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class FlowOutConfigData implements Serializable {
    @JSONField(name = "androidActions")
    public String[] androidActions;
    @JSONField(name = "blockTip")
    public String blockTip;
    @JSONField(name = "floutEnable")
    public boolean floutEnable;
    @JSONField(name = "floutIdEnable")
    public boolean floutIdEnable;
    @JSONField(name = "floutIdList")
    public List<FloutIdListBean> floutIdList;
    @JSONField(name = "floutIdWhiteList")
    public String[] floutIdWhiteList;
    @JSONField(name = "floutWhiteList")
    public List<FloutWhiteListBean> floutWhiteList;
    @JSONField(name = "systemActions")
    public String[] systemActions;

    static {
        kge.a(-1212103867);
        kge.a(1028243835);
    }
}
