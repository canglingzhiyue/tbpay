package com.taobao.android.live.plugin.atype.flexalocal.comments.notify;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.comments.ICommentsProxy;
import tb.hkm;
import tb.kge;

/* loaded from: classes5.dex */
public class e implements ICommentsProxy.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int IMPORTANT_EVENT_PRIORITY_BRAND_HOT = 4;
    public static final int IMPORTANT_EVENT_PRIORITY_COMMON = 5;
    public static final int IMPORTANT_EVENT_PRIORITY_EVERY_BODY_SAYS = 0;
    public static final int IMPORTANT_EVENT_PRIORITY_PROFESSIONAL_PEOPLE = 10;
    public static final int IMPORTANT_EVENT_PRIORITY_REWARD_NIUBILITY_ENTER = 11;
    public static final long IMPORTANT_MESSAGE_ANIM_END_TIME = 500;
    public static final long IMPORTANT_MESSAGE_ANIM_FIRST_TIME = 500;
    public static final long IMPORTANT_MESSAGE_ANIM_SECOND_TIME = 500;
    public static final long IMPORTANT_MESSAGE_INTERVAL_TIME = 2000;
    public static final long IMPORTANT_MESSAGE_TIMEOUT_TIME = 30000;

    static {
        kge.a(580747520);
        kge.a(1424413491);
    }

    @Override // com.taobao.android.live.plugin.proxy.comments.ICommentsProxy.b
    public Long getImportantMessageTimeoutTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("eacdcafb", new Object[]{this});
        }
        com.taobao.android.live.plugin.proxy.e.c("ImportantEventConstants: class: " + getClass().getName() + ", pluginEnv: " + hkm.a());
        return 30000L;
    }

    @Override // com.taobao.android.live.plugin.proxy.comments.ICommentsProxy.b
    public Long getImportantMessageIntervalTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("2197bec1", new Object[]{this});
        }
        com.taobao.android.live.plugin.proxy.e.c("ImportantEventConstants: class: " + getClass().getName() + ", pluginEnv: " + hkm.a());
        return 2000L;
    }
}
