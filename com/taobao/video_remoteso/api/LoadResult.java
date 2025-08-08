package com.taobao.video_remoteso.api;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class LoadResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mLibName;

    static {
        kge.a(-890800306);
    }

    public RSoException getException() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RSoException) ipChange.ipc$dispatch("c350a0f9", new Object[]{this});
        }
        return null;
    }

    public LoadResult(String str) {
        this.mLibName = str;
    }

    public boolean isLoadSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7f4973be", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.mLibName);
    }

    public String getLibName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3ff65cbf", new Object[]{this}) : this.mLibName;
    }
}
