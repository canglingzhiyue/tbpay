package com.taobao.tbpoplayer.info;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.poplayer.config.model.base.IModel;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class CdnConfigModel implements IModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "ac")
    public Map<String, String> configs;
    @JSONField(name = "sc")
    public String uriMap;
    @JSONField(name = "version")
    public String ver;

    static {
        kge.a(139943853);
        kge.a(-284545415);
    }

    @Override // com.alibaba.poplayer.config.model.base.IModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.ver) && (!(this.uriMap == null || this.configs == null) || (this.uriMap == null && this.configs == null));
    }
}
