package com.taobao.tbpoplayer.nativerender.dsl;

import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.tao.flexbox.layoutmanager.container.b;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class HotSpotModel extends ComponentBaseModel {
    @JSONField(name = "action")
    public ActionModel action;
    @JSONField(name = b.KEY_ACTIONS)
    public List<ActionsItemModel> actions;
    @JSONField(name = "style")
    public StyleModel style;

    static {
        kge.a(-1084482304);
    }
}
