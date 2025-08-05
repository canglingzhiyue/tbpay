package com.taobao.weex.utils.tools;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class TaskInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "args")
    public String args;
    @JSONField(name = "relateTaskId")
    public int relateTaskId;

    static {
        kge.a(-1292326592);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TaskInfo{args = '" + this.args + "',relateTaskId = '" + this.relateTaskId + '\'' + riy.BLOCK_END_STR;
    }
}
