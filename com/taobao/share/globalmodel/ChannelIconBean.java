package com.taobao.share.globalmodel;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes8.dex */
public class ChannelIconBean implements Serializable {
    @JSONField(name = "action")
    public String action;
    @JSONField(name = "icon")
    public String icon;
    @JSONField(name = com.taobao.tao.powermsg.model.a.COL_MARK)
    public String mark;
    @JSONField(name = "priority")
    public int priority;
    @JSONField(name = "type")
    public String type;

    static {
        kge.a(-454266592);
        kge.a(1028243835);
    }
}
