package com.taobao.android.ultron.datamodel.imp;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class DMEvent implements com.taobao.android.ultron.common.model.b, Serializable, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<IDMComponent> mComponents;
    private JSONObject mFields;
    private int mOption;
    private JSONObject mStashFields;
    private String mType;

    static {
        kge.a(978320502);
        kge.a(-1493939094);
        kge.a(-723128125);
        kge.a(1028243835);
    }

    public DMEvent(String str, JSONObject jSONObject, List<IDMComponent> list) {
        this.mType = str;
        this.mFields = jSONObject;
        this.mComponents = list;
    }

    public DMEvent(String str, JSONObject jSONObject, List<IDMComponent> list, int i) {
        this.mType = str;
        this.mFields = jSONObject;
        this.mOption = i;
        this.mComponents = list;
    }

    public int getOption() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("400d8265", new Object[]{this})).intValue() : this.mOption;
    }

    public void setOption(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5808b245", new Object[]{this, new Integer(i)});
        } else {
            this.mOption = i;
        }
    }

    @Override // com.taobao.android.ultron.common.model.b
    public String getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : this.mType;
    }

    @Override // com.taobao.android.ultron.common.model.b
    public JSONObject getFields() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b4e209d6", new Object[]{this}) : this.mFields;
    }

    @Override // com.taobao.android.ultron.common.model.b
    public List<IDMComponent> getComponents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d86cc054", new Object[]{this}) : this.mComponents;
    }

    public void setComponents(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6023090", new Object[]{this, list});
        } else {
            this.mComponents = list;
        }
    }

    @Override // com.taobao.android.ultron.common.model.b
    public void writeFields(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fac4fa5", new Object[]{this, str, obj});
        } else if (this.mFields == null || TextUtils.isEmpty(str) || obj == null) {
        } else {
            this.mFields.put(str, obj);
        }
    }

    @Override // com.taobao.android.ultron.common.model.b
    public void rollBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a52d58b", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.mStashFields;
        if (jSONObject == null) {
            return;
        }
        this.mFields = jSONObject;
        this.mStashFields = null;
    }

    @Override // com.taobao.android.ultron.common.model.b
    public void record() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bbb6058", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.mFields;
        if (jSONObject == null) {
            return;
        }
        this.mStashFields = JSON.parseObject(jSONObject.toJSONString());
    }
}
