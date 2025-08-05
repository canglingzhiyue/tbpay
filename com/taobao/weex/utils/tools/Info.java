package com.taobao.weex.utils.tools;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.taobao.tao.powermsg.model.a;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class Info {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "instanceId")
    public String instanceId;
    @JSONField(name = "platform")
    public String platform;
    @JSONField(name = a.COL_TASK)
    public int taskId;
    @JSONField(name = "taskInfo")
    public TaskInfo taskInfo = new TaskInfo();
    @JSONField(name = BaseMnnRunUnit.KEY_TASK_NAME)
    public String taskName;

    static {
        kge.a(-2078340965);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Info : {instanceId = '" + this.instanceId + "',taskName = '" + this.taskName + "',taskInfo = '" + this.taskInfo + "',platform = '" + this.platform + "',taskId = '" + this.taskId + '\'' + riy.BLOCK_END_STR;
    }
}
