package com.alibaba.android.umf.datamodel.service.rule;

import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.b;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class UMFRuleIO extends UMFBaseIO {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = b.KEY_ACTIONS)
    private List<a> mActions;
    @JSONField(name = "confirm")
    private boolean mConfirm;
    @JSONField(name = "type")
    private String mType;

    static {
        kge.a(-1091033751);
    }

    public UMFRuleIO(List<a> list) {
        this.mConfirm = false;
        this.mType = "modify";
        this.mActions = list;
    }

    public UMFRuleIO(String str) {
        this.mConfirm = false;
        this.mType = "modify";
        this.mType = str;
    }

    public UMFRuleIO(List<a> list, String str, boolean z) {
        this.mConfirm = false;
        this.mType = "modify";
        this.mActions = list;
        this.mType = str;
        this.mConfirm = z;
    }

    public List<a> getActions() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("39cd6eb9", new Object[]{this}) : this.mActions;
    }

    public boolean isConfirm() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c069a7c1", new Object[]{this})).booleanValue() : this.mConfirm;
    }

    public void setActions(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2b28a33", new Object[]{this, list});
        } else {
            this.mActions = list;
        }
    }

    public String getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : this.mType;
    }

    public void setType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
        } else {
            this.mType = str;
        }
    }
}
