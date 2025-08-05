package com.taobao.tbpoplayer.nativerender.dsl;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class DSLModel implements INativeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "autoCloseTime")
    public long autoCloseTime;
    @JSONField(name = "component")
    public List<StateModel> component;
    @JSONField(name = "condition")
    public ConditionModel condition;
    @JSONField(name = "conditionFalseCountTire")
    public boolean conditionFalseCountTire;
    @JSONField(name = "conditionFalseNeverShow")
    public boolean conditionFalseNeverShow;
    @JSONField(name = "countTire")
    public boolean countTire;
    @JSONField(name = "defaultToastText")
    public String defaultToastText;
    @JSONField(name = "displayActions")
    public List<ActionsItemModel> displayActions;
    @JSONField(name = "displayMode")
    public String displayMode;
    @JSONField(name = "event")
    public EventModel event;
    @JSONField(name = "extraInfo")
    public String extraInfo;
    @JSONField(name = "gradualDeviceLevel")
    public List<String> gradualDeviceLevel;
    @JSONField(name = "groupStates")
    public Map<String, GroupStateModel> groupStates;
    @JSONField(name = "listenEvents")
    public List<ListenEventModel> listenEvents;
    @JSONField(name = "name")
    public String name;
    @JSONField(name = "neverShow")
    public boolean neverShow;
    @JSONField(name = "prefetch")
    public List<PreFetchModel> prefetch;
    @JSONField(name = "preload")
    public PreLoadModel preload;
    @JSONField(name = "resPreLoad")
    public List<String> resPreLoad;
    @JSONField(name = "spm")
    public String spm;
    @JSONField(name = "startStates")
    public List<String> startStates;
    @JSONField(name = "triggerActions")
    public List<TriggerActionsModel> triggerActions;

    static {
        kge.a(1307472370);
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
