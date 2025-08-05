package com.taobao.linkmanager.launcher;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.AfcLifeCycleCenter;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import tb.kge;
import tb.kns;
import tb.mpa;

/* loaded from: classes.dex */
public class b implements kns {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(921696590);
        kge.a(94951178);
    }

    @Override // tb.kns
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : TbFcLinkInit.launchType;
    }

    @Override // tb.kns
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : com.taobao.application.common.c.a().a("deviceLevel", -1);
    }

    @Override // tb.kns
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : com.taobao.application.common.c.a().a("isInBackground", false);
    }

    @Override // tb.kns
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : TFCCommonUtils.b((Context) TbFcLinkInit.instance().mApplication);
    }

    @Override // tb.kns
    public long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue() : com.taobao.application.common.c.a().a("startProcessSystemTime", 0L);
    }

    @Override // tb.kns
    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : com.taobao.application.common.c.a().a("launchType", mpa.COLD);
    }

    @Override // tb.kns
    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : AfcLifeCycleCenter.instance().getCurrentActivityName();
    }

    @Override // tb.kns
    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : AfcLifeCycleCenter.instance().getCurrentActivityUrl();
    }

    @Override // tb.kns
    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : com.taobao.application.common.c.a().a("currFragmentName", (String) null);
    }
}
