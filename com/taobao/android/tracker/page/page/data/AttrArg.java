package com.taobao.android.tracker.page.page.data;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes6.dex */
public class AttrArg implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String attrName;
    private String commitKey;
    private boolean recursive;

    static {
        kge.a(428671338);
        kge.a(1028243835);
    }

    public String getCommitKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ec368b47", new Object[]{this}) : this.commitKey;
    }

    public void setCommitKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cd89977", new Object[]{this, str});
        } else {
            this.commitKey = str;
        }
    }

    public String getAttrName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e57c18a7", new Object[]{this}) : this.attrName;
    }

    public void setAttrName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54e456af", new Object[]{this, str});
        } else {
            this.attrName = str;
        }
    }

    public boolean isRecursive() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2cbfd6b3", new Object[]{this})).booleanValue() : this.recursive;
    }

    public void setRecursive(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b1e5f3d", new Object[]{this, new Boolean(z)});
        } else {
            this.recursive = z;
        }
    }
}
