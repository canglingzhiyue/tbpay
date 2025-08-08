package com.taobao.tbpoplayer.nativerender.dsl;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class PreLoadModel implements INativeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "ERTestUrl")
    public String ERTestUrl;
    @JSONField(name = "containerType")
    public String containerType = "h5";
    @JSONField(name = "enable")
    public boolean enable;
    @JSONField(name = "ignoreStatusCheck")
    public boolean ignoreStatusCheck;
    @JSONField(name = "url")
    public String url;

    static {
        kge.a(-173751802);
        kge.a(310138031);
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : this.enable && (!StringUtils.isEmpty(this.url) || !StringUtils.isEmpty(this.ERTestUrl));
    }
}
