package com.taobao.tbpoplayer.nativerender.dsl;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import tb.kge;

/* loaded from: classes8.dex */
public class WidgetAnimModel implements INativeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "imgSrcList")
    public String imgSrcList;
    @JSONField(name = Constants.Name.INTERVAL)
    public long interval;
    @JSONField(name = com.taobao.accs.common.Constants.KEY_TIMES)
    public int times;

    static {
        kge.a(1968365678);
        kge.a(310138031);
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : this.times > 0 && this.interval > 0 && StringUtils.isEmpty(this.imgSrcList);
    }
}
