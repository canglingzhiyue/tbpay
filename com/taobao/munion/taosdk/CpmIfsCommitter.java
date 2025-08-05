package com.taobao.munion.taosdk;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.cpm.ifs.IfsBuilder;
import java.util.Map;
import tb.kge;

@Deprecated
/* loaded from: classes7.dex */
public class CpmIfsCommitter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Application mApplication;
    private Map<String, String> mArgs;

    static {
        kge.a(-35529481);
    }

    public CpmIfsCommitter(Application application, Map<String, String> map) {
        this.mApplication = application;
        this.mArgs = map;
    }

    public void commitEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a8c11f4", new Object[]{this, str});
        } else {
            new IfsBuilder(this.mApplication, str).withArgs(this.mArgs).commit();
        }
    }

    public void commitEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f93426be", new Object[]{this, str, str2});
        } else {
            new IfsBuilder(this.mApplication, str2).withArgs(this.mArgs).commit();
        }
    }

    public String commitEventForResult(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4cdfbaec", new Object[]{this, str}) : new IfsBuilder(this.mApplication, str).withArgs(this.mArgs).commit();
    }
}
