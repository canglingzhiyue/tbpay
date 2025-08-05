package com.taobao.android.diagnose.scene.engine.reader;

import com.android.alibaba.ip.runtime.IpChange;
import tb.fmy;
import tb.kge;

/* loaded from: classes.dex */
public abstract class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(193884460);
    }

    public abstract fmy a(RuleDefine ruleDefine);

    public fmy b(RuleDefine ruleDefine) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fmy) ipChange.ipc$dispatch("8a7a4c73", new Object[]{this, ruleDefine}) : a(ruleDefine);
    }
}
