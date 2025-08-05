package com.taobao.android.cachecleaner.autoclear.biz.data;

import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.tao.powermsg.model.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class BizTaskData {
    public static final String BACKGROUND_TIME = "background";
    public static final String IDLE_INIT_TIME = "launch";
    public static final String MANUAL_TIME = "manual";
    @JSONField(name = "condition")
    public BizVerConditionData condition;
    @JSONField(name = "sizeCondition")
    public BizOpConditionData sizeCondition;
    @JSONField(name = a.COL_TASK)
    public String taskId = "";
    @JSONField(name = "pathMap")
    public Map<String, Long> pathMap = new HashMap();
    @JSONField(name = "triggerTime")
    public String triggerTime = "background";
    @JSONField(name = "actionList")
    public List<BizActionData> actionList = new ArrayList();

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface TriggerTime {
    }

    static {
        kge.a(-73262926);
    }
}
