package com.taobao.tbpoplayer.adapter;

import com.alibaba.poplayer.norm.ISceneFreqAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class l implements ISceneFreqAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1932336583);
        kge.a(-770159505);
    }

    @Override // com.alibaba.poplayer.norm.ISceneFreqAdapter
    public String getSceneFreqConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("74350da9", new Object[]{this}) : com.taobao.tbpoplayer.info.a.a().T();
    }
}
