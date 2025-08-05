package com.taobao.tbpoplayer.nativerender.dsl;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.b;
import com.taobao.tbpoplayer.nativerender.dsl.style.ImageStyleModel;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class ImageModel extends ComponentBaseModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "action")
    public ActionModel action;
    @JSONField(name = b.KEY_ACTIONS)
    public List<ActionsItemModel> actions;
    @JSONField(name = "isAnimate")
    public boolean isAnimate;
    @JSONField(name = "loopEndAction")
    public ActionModel loopEndAction;
    @JSONField(name = "loopEndActions")
    public List<ActionsItemModel> loopEndActions;
    @JSONField(name = "loopTimes")
    public int loopTimes;
    @JSONField(name = "style")
    public ImageStyleModel style;
    @JSONField(name = "url")
    public String url;

    static {
        kge.a(856085396);
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel, com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(this.url);
    }
}
