package com.taobao.tbpoplayer.nativerender.dsl;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.b;
import com.taobao.tbpoplayer.nativerender.dsl.style.VideoStyleModel;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class VideoModel extends ComponentBaseModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "action")
    public ActionModel action;
    @JSONField(name = b.KEY_ACTIONS)
    public List<ActionsItemModel> actions;
    @JSONField(name = "loopTimes")
    public int loopTimes;
    @JSONField(name = "style")
    public VideoStyleModel style;
    @JSONField(name = "triggerActions")
    public List<TriggerActionsModel> triggerActions;
    @JSONField(name = "url")
    public String url;
    @JSONField(name = "videoId")
    public String videoId;

    static {
        kge.a(681008244);
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel, com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(this.url) || !TextUtils.isEmpty(this.videoId);
    }
}
