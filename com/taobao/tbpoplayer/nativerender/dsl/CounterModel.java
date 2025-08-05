package com.taobao.tbpoplayer.nativerender.dsl;

import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.tao.flexbox.layoutmanager.container.b;
import com.taobao.tao.powermsg.model.a;
import com.taobao.tbpoplayer.nativerender.dsl.style.CounterStyleModel;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class CounterModel extends ComponentBaseModel {
    @JSONField(name = "action")
    public ActionModel action;
    @JSONField(name = b.KEY_ACTIONS)
    public List<ActionsItemModel> actions;
    @JSONField(name = "autoStart")
    public boolean autoStart = true;
    @JSONField(name = "endTime")
    public String endTime;
    @JSONField(name = "format")
    public String format;
    @JSONField(name = "marginalValue")
    public int marginalValue;
    @JSONField(name = a.COL_S_TIME)
    public String serverTime;
    @JSONField(name = "showMilliseconds")
    public boolean showMilliseconds;
    @JSONField(name = "style")
    public CounterStyleModel style;

    static {
        kge.a(-1149126125);
    }
}
