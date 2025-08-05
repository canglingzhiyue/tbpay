package com.taobao.android.live.plugin.proxy.projectscreen;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.bn;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.g;
import tb.kge;

/* loaded from: classes6.dex */
public class ProjectScreenProxy extends g<ProjectScreenProxy> implements IProjectScreenProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ORANGE_INSTALL_LIVE_PLUGIN = "installLiveProjectScreenPlugin";
    private static final String TAG = "ProjectScreenProxy";
    private static final String TRACK_NAME = "投屏";

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final ProjectScreenProxy f14123a;

        static {
            kge.a(-783072592);
            f14123a = new ProjectScreenProxy();
        }

        public static /* synthetic */ ProjectScreenProxy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ProjectScreenProxy) ipChange.ipc$dispatch("14041d9", new Object[0]) : f14123a;
        }
    }

    static {
        kge.a(1976009792);
        kge.a(-867497989);
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this}) : IProjectScreenProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this}) : "com.taobao.android.live.plugin.atype.flexalocal.proxy.ProjectScreenProxyX";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this}) : ORANGE_INSTALL_LIVE_PLUGIN;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this}) : TRACK_NAME;
    }

    public static ProjectScreenProxy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProjectScreenProxy) ipChange.ipc$dispatch("34c03703", new Object[0]) : a.a();
    }

    private ProjectScreenProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            e.c("[ProjectScreenProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.projectscreen.IProjectScreenProxy
    public Class<? extends BaseFrame> getProjectScreenSearchFrameClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("334fc156", new Object[]{this});
        }
        ProjectScreenProxy real = getReal();
        Class<? extends BaseFrame> projectScreenSearchFrameClass = real != null ? real.getProjectScreenSearchFrameClass() : null;
        e.c("[ProjectScreenProxy#getProjectScreenFrameClass]: " + projectScreenSearchFrameClass);
        return projectScreenSearchFrameClass;
    }

    @Override // com.taobao.android.live.plugin.proxy.projectscreen.IProjectScreenProxy
    public Class<? extends BaseFrame> getProjectScreenOptFrameClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("b39843e3", new Object[]{this});
        }
        ProjectScreenProxy real = getReal();
        Class<? extends BaseFrame> projectScreenOptFrameClass = real != null ? real.getProjectScreenOptFrameClass() : null;
        e.c("[ProjectScreenProxy#getProjectScreenOptFrameClass]: " + projectScreenOptFrameClass);
        return projectScreenOptFrameClass;
    }

    @Override // com.taobao.android.live.plugin.proxy.projectscreen.IProjectScreenProxy
    public Class<? extends BaseFrame> getProjectScreenIconFrameClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3f2cbc27", new Object[]{this});
        }
        ProjectScreenProxy real = getReal();
        Class<? extends BaseFrame> projectScreenIconFrameClass = real != null ? real.getProjectScreenIconFrameClass() : null;
        e.c("[ProjectScreenProxy#getProjectScreenIconFrameClass]: " + projectScreenIconFrameClass);
        return projectScreenIconFrameClass;
    }

    @Override // com.taobao.android.live.plugin.proxy.projectscreen.IProjectScreenProxy
    public Pair<Long, bn> getProjectScreenDXHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("89efe398", new Object[]{this});
        }
        ProjectScreenProxy real = getReal();
        Pair<Long, bn> projectScreenDXHandler = real != null ? real.getProjectScreenDXHandler() : null;
        e.c("[ProjectScreenProxy#getProjectScreenDXHandler]: " + projectScreenDXHandler);
        return projectScreenDXHandler;
    }
}
