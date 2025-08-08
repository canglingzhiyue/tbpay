package com.taobao.tbpoplayer.nativerender.dsl;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.b;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class PopCloseBtnModel extends ComponentBaseModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "action")
    public ActionModel action;
    @JSONField(name = b.KEY_ACTIONS)
    public List<ActionsItemModel> actions;
    @JSONField(name = "alignLeftStateMargin")
    public int alignLeftStateMargin;
    @JSONField(name = "alignScreenRightMargin")
    public int alignScreenRightMargin;
    @JSONField(name = "alignScreenTopMargin")
    public int alignScreenTopMargin;
    @JSONField(name = "belowStateMargin")
    public int belowStateMargin;
    @JSONField(name = "style")
    public StyleModel style;
    @JSONField(name = "url")
    public String url;

    static {
        kge.a(-739185158);
    }

    public static /* synthetic */ Object ipc$super(PopCloseBtnModel popCloseBtnModel, String str, Object... objArr) {
        if (str.hashCode() == 67041405) {
            return new Boolean(super.isValid());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel, com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : super.isValid() && !StringUtils.isEmpty(this.url);
    }
}
