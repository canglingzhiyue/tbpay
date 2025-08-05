package com.alibaba.android.aura.datamodel.parse;

import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class AURAParseIO extends UMFBaseIO {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "action")
    private String mAction;
    @JSONField(name = "data")
    private List<a> mData;
    private String mRootKey;

    static {
        kge.a(515792799);
    }

    public AURAParseIO(List<a> list) {
        this.mAction = "default";
        this.mData = list;
    }

    public AURAParseIO(List<a> list, String str) {
        this.mAction = "default";
        this.mData = list;
        this.mAction = str;
    }

    public List<a> getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dbd142c0", new Object[]{this});
        }
        if (this.mData == null) {
            this.mData = new ArrayList();
        }
        return this.mData;
    }

    public String getRootKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7cbb1772", new Object[]{this}) : this.mRootKey;
    }

    public void setRootKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21ab5fac", new Object[]{this, str});
        } else {
            this.mRootKey = str;
        }
    }

    public void setData(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ddf4a4", new Object[]{this, list});
        } else {
            this.mData = list;
        }
    }

    public void setAction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb72d5c9", new Object[]{this, str});
        } else {
            this.mAction = str;
        }
    }

    public String getAction() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e81f414d", new Object[]{this}) : this.mAction;
    }
}
