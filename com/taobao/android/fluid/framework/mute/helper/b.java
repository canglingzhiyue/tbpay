package com.taobao.android.fluid.framework.mute.helper;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.mute.IMuteService;
import tb.kge;
import tb.spz;

/* loaded from: classes5.dex */
public class b extends e implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final b f12598a;

        static {
            kge.a(2009205596);
            f12598a = new b();
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("4445cd6f", new Object[0]) : f12598a;
        }
    }

    static {
        kge.a(-1817965472);
        kge.a(-271870066);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        if (str.hashCode() == -1952812637) {
            super.j((FluidContext) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private b() {
        super("guangguang_last_show_mute_tips_time", "guangguang_has_show_mute_tips_count", "guangguang_mute_storage", e.MUTE_FLAG);
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("4445cd6f", new Object[0]) : a.a();
    }

    @Override // com.taobao.android.fluid.framework.mute.helper.d
    public void a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc4079a", new Object[]{this, fluidContext});
        } else {
            super.j(fluidContext);
        }
    }

    @Override // com.taobao.android.fluid.framework.mute.helper.d
    public void b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4da19b", new Object[]{this, fluidContext});
            return;
        }
        ((IMuteService) fluidContext.getService(IMuteService.class)).setMuteABTestForSettings(false);
        g(fluidContext);
        spz.c("GuangGuangVideoMuteImpl", "降级打开静音");
    }
}
