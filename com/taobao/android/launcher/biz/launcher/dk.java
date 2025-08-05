package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import anet.channel.Config;
import anet.channel.SessionCenter;
import anet.channel.entity.ConnType;
import anet.channel.entity.ENV;
import anet.channel.entity.SessionType;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.StrategyTemplate;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.LinkRule;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.orange.OConstant;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import java.util.HashMap;
import tb.guc;

/* loaded from: classes5.dex */
public class dk extends com.taobao.android.launcher.biz.task.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(dk dkVar, String str, Object... objArr) {
        if (str.hashCode() == -222138312) {
            return new Boolean(super.intercept((com.taobao.android.job.core.task.c) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public dk(String str) {
        super(str);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
        } else if (android.taobao.safemode.h.a().c() == null || ((Integer) com.taobao.android.launcher.common.c.a(OConstant.LAUNCH_ENVINDEX, 0)).intValue() != 0) {
        } else {
            a("miniapp-package-zcache.taobao.com", ConnProtocol.valueOf(ConnType.HTTP2, ConnType.RTT_0, "cdn"));
            a("guide-acs4miniapp-inner.m.taobao.com", ConnProtocol.valueOf(ConnType.HTTP2, ConnType.RTT_0, ConnType.PK_ACS));
        }
    }

    private static void a(String str, ConnProtocol connProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cee820e0", new Object[]{str, connProtocol});
            return;
        }
        StrategyTemplate.getInstance().registerConnProtocol(str, connProtocol);
        SessionCenter.getInstance(new Config.Builder().setAppkey((String) com.taobao.android.launcher.common.c.a(OConstant.LAUNCH_ONLINEAPPKEY, null)).setEnv(ENV.ONLINE).build()).get(HttpUrl.parse(StringUtils.concatString("https", HttpConstant.SCHEME_SPLIT, str)), SessionType.LONG_LINK, 0L);
    }

    @Override // com.taobao.android.job.core.task.e
    public boolean intercept(com.taobao.android.job.core.task.c<String, Void> cVar) {
        LinkRule b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2c27038", new Object[]{this, cVar})).booleanValue();
        }
        if (!super.intercept(cVar) || (b = com.taobao.android.launcher.bootstrap.tao.ability.h.b()) == null) {
            return false;
        }
        String str = b.name;
        return (TMSCalendarBridge.namespace.equals(str) || "unicontainer".equals(str)) && !guc.a(LauncherRuntime.g, "link_triver_network_off");
    }
}
