package com.alibaba.security.wukong.bx.workconf;

import com.alibaba.fastjson.JSON;
import com.alibaba.security.ccrc.common.keep.IKeep;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.wukong.bx.algo.BxData;
import com.alibaba.security.wukong.bx.workconf.BaseWorkConfHandler;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class WorkConfOperator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3625a = "WorkConfOperator";

    /* loaded from: classes3.dex */
    public static class Action implements IKeep {
        public String op;
        public List<BxData.OpConfItemValue> rules;
    }

    /* loaded from: classes3.dex */
    public static class WorkConf implements IKeep {
        public List<Action> action;
        public String feature;
    }

    public BaseWorkConfHandler.WorkConfResult a(Map<String, Object> map, String str) {
        Map<String, Object> map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseWorkConfHandler.WorkConfResult) ipChange.ipc$dispatch("bdb85945", new Object[]{this, map, str});
        }
        List parseArray = JSON.parseArray(str, WorkConf.class);
        if (parseArray != null && !parseArray.isEmpty()) {
            BaseWorkConfHandler.WorkConfResult workConfResult = new BaseWorkConfHandler.WorkConfResult();
            WorkConf workConf = (WorkConf) parseArray.get(0);
            Object obj = map.get(workConf.feature);
            if (obj != null && (map2 = JsonUtils.toMap(obj)) != null && !map2.isEmpty()) {
                workConfResult.finalResult = a(map, map2, workConf);
                workConfResult.featureNeedDelete = workConf.feature;
                return workConfResult;
            }
        }
        return null;
    }

    private Map<String, Object> a(Map<String, Object> map, Map<String, Object> map2, WorkConf workConf) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6ed65875", new Object[]{this, map, map2, workConf});
        }
        for (Action action : workConf.action) {
            BaseWorkConfHandler a2 = BaseWorkConfHandler.a.a(action.op);
            if (a2 != null) {
                map2 = a2.a(map, map2, action.rules);
            }
        }
        return map2;
    }
}
