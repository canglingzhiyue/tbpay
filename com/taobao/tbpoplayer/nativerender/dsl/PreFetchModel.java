package com.taobao.tbpoplayer.nativerender.dsl;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.data.remote.c;
import tb.kge;

/* loaded from: classes8.dex */
public class PreFetchModel implements INativeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "dataId")
    public String dataId;
    @JSONField(name = c.KEY_DATA_SOURCE)
    public String dataSource;
    @JSONField(name = "needWua")
    public boolean needWua;
    @JSONField(name = "preCondition")
    public ConditionModel preCondition;
    @JSONField(name = "requestAddress")
    public String requestAddress;
    @JSONField(name = "requestMethod")
    public String requestMethod;
    @JSONField(name = "requestMethodName")
    public String requestMethodName;
    @JSONField(name = "requestParams")
    public String requestParams;
    @JSONField(name = "requestSuccessJudge")
    public ConditionModel requestSuccessJudge;
    @JSONField(name = "requestVer")
    public String requestVer;
    @JSONField(name = "safeToken")
    public String safeToken;
    @JSONField(name = "version")
    public String version;

    static {
        kge.a(-409513780);
        kge.a(310138031);
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (!"mtop".equals(this.dataSource) && !"windvane".equals(this.dataSource)) {
            return false;
        }
        if ("mtop".equals(this.dataSource) && ((TextUtils.isEmpty(this.requestVer) && TextUtils.isEmpty(this.version)) || TextUtils.isEmpty(this.requestAddress) || TextUtils.isEmpty(this.requestParams))) {
            return false;
        }
        return (!"windvane".equals(this.dataSource) || (!TextUtils.isEmpty(this.requestMethodName) && !TextUtils.isEmpty(this.requestParams))) && !TextUtils.isEmpty(this.dataId);
    }
}
