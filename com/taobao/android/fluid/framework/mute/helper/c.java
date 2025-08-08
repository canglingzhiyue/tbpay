package com.taobao.android.fluid.framework.mute.helper;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import tb.kge;
import tb.obw;
import tb.spz;

/* loaded from: classes5.dex */
public class c extends e implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final c f12599a;

        static {
            kge.a(-1950871396);
            f12599a = new c();
        }

        public static /* synthetic */ c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("4445cd8e", new Object[0]) : f12599a;
        }
    }

    static {
        kge.a(321357339);
        kge.a(-271870066);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1952812637) {
            super.j((FluidContext) objArr[0]);
            return null;
        } else if (hashCode != -1945053278) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.i((FluidContext) objArr[0]);
            return null;
        }
    }

    private c() {
        super("last_show_mute_tips_time", "has_show_mute_tips_count", "tab3_mute_storage", e.MUTE_FLAG);
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("4445cd8e", new Object[0]) : a.a();
    }

    @Override // com.taobao.android.fluid.framework.mute.helper.d
    public void a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc4079a", new Object[]{this, fluidContext});
            return;
        }
        FluidInstanceConfig instanceConfig = fluidContext.getInstanceConfig();
        instanceConfig.getMuteTipCount();
        String tab3CardType = instanceConfig.getTab3CardType();
        if (instanceConfig.isTab3FromLauncher() && !f.b(fluidContext, f.j(fluidContext))) {
            spz.c("tab3MuteUpgrade", "原有逻辑，拉端进入默认静音");
            h(fluidContext);
        } else if (StringUtils.equals(tab3CardType, obw.TAB2_CONTAINER_TYPE_LIVE_LARGE)) {
        } else {
            super.j(fluidContext);
        }
    }

    @Override // com.taobao.android.fluid.framework.mute.helper.d
    public void b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4da19b", new Object[]{this, fluidContext});
        } else {
            super.i(fluidContext);
        }
    }
}
