package com.taobao.tbpoplayer.nativerender.dsl;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.b;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class EventActionModel implements INativeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "action")
    public ActionModel action;
    @JSONField(name = b.KEY_ACTIONS)
    public List<ActionsItemModel> actions;
    public int costTimes = 0;
    @JSONField(name = "eventName")
    public String eventName;
    @JSONField(name = "listenTimes")
    public long listenTimes;
    @JSONField(name = MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT)
    public List<ConditionHandleModel> onEvent;
    @JSONField(name = "sourceName")
    public String sourceName;

    /* loaded from: classes8.dex */
    public static class ConditionHandleModel implements INativeModel {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        @JSONField(name = "action")
        public ActionModel action;
        @JSONField(name = b.KEY_ACTIONS)
        public List<ActionsItemModel> actions;
        @JSONField(name = "condition")
        public ConditionModel condition;

        static {
            kge.a(88453451);
            kge.a(310138031);
        }

        @Override // com.taobao.tbpoplayer.nativerender.dsl.INativeModel
        public boolean isValid() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
            }
            return true;
        }
    }

    static {
        kge.a(-1512709089);
        kge.a(310138031);
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.sourceName) && !StringUtils.isEmpty(this.eventName);
    }
}
