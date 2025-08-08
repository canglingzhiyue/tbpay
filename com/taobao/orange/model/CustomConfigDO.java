package com.taobao.orange.model;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.util.OLog;
import tb.kge;

/* loaded from: classes7.dex */
public class CustomConfigDO extends ConfigDO {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "content")
    public String stringContent;

    static {
        kge.a(-1376401198);
    }

    @Override // com.taobao.orange.model.ConfigDO, com.taobao.orange.model.a
    public boolean checkValid() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b6d1a5f", new Object[]{this})).booleanValue();
        }
        if (StringUtils.isEmpty(this.appKey) || StringUtils.isEmpty(this.appVersion) || StringUtils.isEmpty(this.id) || StringUtils.isEmpty(this.name) || StringUtils.isEmpty(this.resourceId) || StringUtils.isEmpty(this.type) || StringUtils.isEmpty(this.loadLevel) || StringUtils.isEmpty(this.stringContent) || StringUtils.isEmpty(this.version)) {
            OLog.w(ConfigDO.TAG, "lack param", new Object[0]);
            return false;
        }
        if ((!this.appVersion.equals("*") && !this.appVersion.equals(com.taobao.orange.a.j)) || !this.appKey.equals(com.taobao.orange.a.h)) {
            z = false;
        }
        if (!z) {
            OLog.w(ConfigDO.TAG, "invaild", new Object[0]);
        }
        return z;
    }
}
