package com.taobao.android.diagnose.scene.engine.action;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.scene.engine.reader.RuleDefine;
import java.util.ArrayList;
import java.util.List;
import tb.fmu;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_TLOG_UPLOAD = "ACTION_TLOG_UPLOAD";
    public static final String ACTION_TOOL_CONFIG = "ACTION_TOOL_CONFIG";

    static {
        kge.a(422701927);
    }

    public static fmu a(RuleDefine.ActionDefine actionDefine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fmu) ipChange.ipc$dispatch("efb6d55d", new Object[]{actionDefine});
        }
        if (actionDefine == null) {
            return null;
        }
        if (ACTION_TLOG_UPLOAD.equals(actionDefine.actionID)) {
            return new UploadTLogAction(actionDefine.actionLimit, actionDefine.actionData, actionDefine.sampling);
        }
        if (!ACTION_TOOL_CONFIG.equals(actionDefine.actionID)) {
            return null;
        }
        return new c(actionDefine.actionLimit, actionDefine.actionData, actionDefine.sampling);
    }

    public static List<fmu> a(List<RuleDefine.ActionDefine> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{list});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (RuleDefine.ActionDefine actionDefine : list) {
            fmu a2 = a(actionDefine);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }
}
