package com.taobao.android.diagnose.scene.engine.reader;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public class RuleDefine {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<ActionDefine> actions;
    public String appVer;
    public String bizName;
    public String condition;
    public String conditionVer;
    public long expireTime;
    public int expireType;
    public String id;
    public String osVer;
    public int sampling;
    public String sceneCode;
    public String sceneRuleCode;
    public long sceneVersion;

    /* loaded from: classes.dex */
    public static class ActionDefine {
        public String actionID;
        public int actionLimit = -1;
        public String actionData = null;
        public int sampling = 10000;

        static {
            kge.a(-1898823522);
        }
    }

    static {
        kge.a(-1382224233);
    }

    @JSONField(serialize = false)
    public boolean isExpire() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4f97d6f4", new Object[]{this})).booleanValue() : this.expireType == 2 && System.currentTimeMillis() > this.expireTime;
    }
}
