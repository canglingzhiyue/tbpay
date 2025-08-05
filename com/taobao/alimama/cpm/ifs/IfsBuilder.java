package com.taobao.alimama.cpm.ifs;

import android.app.Application;
import android.text.TextUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class IfsBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Application mApplication;
    private Map<String, String> mArgsMap = new HashMap();
    private String mUrl;

    static {
        kge.a(-23394999);
    }

    public IfsBuilder(Application application, String str) {
        this.mApplication = application;
        this.mUrl = str;
    }

    public IfsBuilder withArgPid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IfsBuilder) ipChange.ipc$dispatch("a8de8694", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.mArgsMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, str);
        }
        return this;
    }

    public IfsBuilder withArgNamespace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IfsBuilder) ipChange.ipc$dispatch("72e4ae64", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.mArgsMap.put("namespace", str);
        }
        return this;
    }

    public IfsBuilder withArg(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IfsBuilder) ipChange.ipc$dispatch("fa577113", new Object[]{this, str, str2});
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.mArgsMap.put(str, str2);
        }
        return this;
    }

    public IfsBuilder withArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IfsBuilder) ipChange.ipc$dispatch("a18c87c3", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            this.mArgsMap.putAll(map);
        }
        return this;
    }

    public String commit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a70abe22", new Object[]{this}) : new NEW_IfsCommitter(this.mUrl, this.mArgsMap).a();
    }
}
