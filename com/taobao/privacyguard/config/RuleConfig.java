package com.taobao.privacyguard.config;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class RuleConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean enable = false;
    public String hashRate = "100_-1_100";
    public List<String> permissionCheckList = null;
    public List<String> reportActivityBlackList = null;
    public long permissionCheckInterval = -1;
    public boolean reportStack = true;
    public boolean reportParams = true;
    public int stackLevel = -1;
    public String abComponent = "privacy_guard_performance_v2";
    public boolean reportPermissionCheck = true;

    static {
        kge.a(-1450802196);
        kge.a(1028243835);
    }

    public List<String> getPermissionCheckList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("14ec1fbf", new Object[]{this}) : this.permissionCheckList;
    }

    public String getHashRate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f375e0f5", new Object[]{this}) : this.hashRate;
    }

    public boolean isReportStack() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dbd199b5", new Object[]{this})).booleanValue() : this.reportStack;
    }

    public boolean isReportParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("43d148af", new Object[]{this})).booleanValue() : this.reportParams;
    }

    public boolean isEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue() : this.enable;
    }

    public boolean isReportPermissionCheck() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3d78ca6", new Object[]{this})).booleanValue() : this.reportPermissionCheck;
    }
}
