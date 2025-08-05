package com.taobao.tinct.model;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class c extends BaseChangeInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "bid")

    /* renamed from: a  reason: collision with root package name */
    public String f22959a;

    public c() {
        this(null, null);
    }

    public c(String str, String str2) {
        super(ChangeType.TOUCH_STONE);
        this.f22959a = str2;
        this.bizName = str;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f22959a;
    }

    @Override // com.taobao.tinct.model.BaseChangeInfo
    public String getTinctTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8f9becd3", new Object[]{this}) : String.format("ts|%s|%s", this.bizName, this.f22959a);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (!TextUtils.isEmpty(this.f22959a) && getTinctTag().equals(cVar.getTinctTag())) {
                return true;
            }
        }
        return false;
    }
}
