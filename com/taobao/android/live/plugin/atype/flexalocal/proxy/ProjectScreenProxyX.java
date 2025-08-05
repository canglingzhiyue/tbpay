package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.bn;
import com.taobao.android.live.plugin.atype.flexalocal.projectscreen.ProjectScreenIconFrame;
import com.taobao.android.live.plugin.atype.flexalocal.projectscreen.ProjectScreenOptFrame;
import com.taobao.android.live.plugin.atype.flexalocal.projectscreen.ProjectScreenSearchFrame;
import com.taobao.android.live.plugin.atype.flexalocal.projectscreen.b;
import com.taobao.android.live.plugin.proxy.projectscreen.IProjectScreenProxy;
import tb.kge;

/* loaded from: classes6.dex */
public class ProjectScreenProxyX implements IProjectScreenProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(105217154);
        kge.a(-867497989);
    }

    @Override // com.taobao.android.live.plugin.proxy.projectscreen.IProjectScreenProxy
    public Class<? extends BaseFrame> getProjectScreenSearchFrameClass() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("334fc156", new Object[]{this}) : ProjectScreenSearchFrame.class;
    }

    @Override // com.taobao.android.live.plugin.proxy.projectscreen.IProjectScreenProxy
    public Class<? extends BaseFrame> getProjectScreenOptFrameClass() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("b39843e3", new Object[]{this}) : ProjectScreenOptFrame.class;
    }

    @Override // com.taobao.android.live.plugin.proxy.projectscreen.IProjectScreenProxy
    public Class<? extends BaseFrame> getProjectScreenIconFrameClass() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("3f2cbc27", new Object[]{this}) : ProjectScreenIconFrame.class;
    }

    @Override // com.taobao.android.live.plugin.proxy.projectscreen.IProjectScreenProxy
    public Pair<Long, bn> getProjectScreenDXHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("89efe398", new Object[]{this}) : Pair.create(Long.valueOf((long) b.DX_EVENT_TAOLIVEPROJECTSCREENACTION), new b());
    }
}
