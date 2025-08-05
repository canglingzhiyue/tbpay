package com.taobao.tbpoplayer.nativerender.dsl;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.b;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class BlockModel extends ComponentBaseModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "action")
    public ActionModel action;
    @JSONField(name = b.KEY_ACTIONS)
    public List<ActionsItemModel> actions;
    @JSONField(name = "alignItems")
    public String alignItems;
    @JSONField(name = "blockLayout")
    public String blockLayout;
    @JSONField(name = "children")
    public List<JSONObject> children;
    @JSONField(name = "flexDirection")
    public String flexDirection;
    @JSONField(name = "justifyContent")
    public String justifyContent;
    @JSONField(name = "style")
    public StyleModel style;

    static {
        kge.a(-709564510);
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel, com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        List<JSONObject> list = this.children;
        return list != null && !list.isEmpty();
    }
}
