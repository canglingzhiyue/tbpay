package com.alibaba.android.aura.datamodel.linkage;

import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes2.dex */
public class UMFLinkageTrigger implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String mAction;
    private final String mEventKey;
    private MultiTreeNode mMultiTreeNode;
    private String mNeedAdjustOptimize;
    private final String mTriggerComponentKey;

    static {
        kge.a(44123772);
        kge.a(1028243835);
    }

    public UMFLinkageTrigger(String str, String str2, String str3) {
        this.mTriggerComponentKey = str;
        this.mEventKey = str2;
        this.mAction = str3;
    }

    public void setNeedAdjustOptimize(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e43955", new Object[]{this, str});
        } else {
            this.mNeedAdjustOptimize = str;
        }
    }

    public String getNeedAdjustOptimize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("66c6ca41", new Object[]{this}) : this.mNeedAdjustOptimize;
    }

    public String getEventKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("312762fe", new Object[]{this}) : this.mEventKey;
    }

    public String getAction() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e81f414d", new Object[]{this}) : this.mAction;
    }

    public String getTriggerComponentKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a4dd92b5", new Object[]{this}) : this.mTriggerComponentKey;
    }

    public MultiTreeNode getStateTree() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MultiTreeNode) ipChange.ipc$dispatch("ac3a992a", new Object[]{this}) : this.mMultiTreeNode;
    }

    public void setStateTree(MultiTreeNode multiTreeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ad03cc6", new Object[]{this, multiTreeNode});
        } else {
            this.mMultiTreeNode = multiTreeNode;
        }
    }
}
