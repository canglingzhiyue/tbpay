package com.alibaba.security.client.smart.core.wukong.action;

import com.alibaba.security.ccrc.common.keep.IKeep;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class BaseWuKongActionPerform implements IKeep {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract void accept(String str, String str2, String str3, String str4, int i);

    public abstract String actionPerformCode();

    public abstract void release();
}
