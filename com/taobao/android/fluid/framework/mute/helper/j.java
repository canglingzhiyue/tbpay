package com.taobao.android.fluid.framework.mute.helper;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.spz;

/* loaded from: classes5.dex */
public class j extends e implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final j f12611a;

        static {
            kge.a(625084074);
            f12611a = new j();
        }

        public static /* synthetic */ j a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("4445ce67", new Object[0]) : f12611a;
        }
    }

    static {
        kge.a(-1972431417);
        kge.a(-271870066);
    }

    @Override // com.taobao.android.fluid.framework.mute.helper.d
    public void b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4da19b", new Object[]{this, fluidContext});
        }
    }

    private j() {
        super("xiaomi_tab3_last_show_mute_tips_time", "xiaomi_tab3_has_show_mute_tips_count", "xiaomi_tab3_mute_storage", e.XIAOMI_B1_TAB3_MUTE_FLAG);
    }

    public static j a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("4445ce67", new Object[0]) : a.a();
    }

    @Override // com.taobao.android.fluid.framework.mute.helper.e, com.taobao.android.fluid.framework.mute.helper.d
    public Map<String, Object> d(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("70a5112", new Object[]{this, fluidContext});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(MusLiveVideo.ATTR_MUTE, c() ? "true" : "false");
        hashMap.put("needShowTips", "false");
        hashMap.put("muteStorage", b());
        spz.c("XiaomiTab3VideoMuteImpl", "XiaomiB1，3.静音逻升级初始化-native，gteMuteState muted：" + hashMap.get(MusLiveVideo.ATTR_MUTE) + "_muteStorage:" + hashMap.get("muteStorage"));
        return hashMap;
    }

    @Override // com.taobao.android.fluid.framework.mute.helper.d
    public void a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc4079a", new Object[]{this, fluidContext});
        } else {
            h(fluidContext);
        }
    }

    public void b(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6675baa5", new Object[]{this, fluidContext, str});
        } else {
            a(fluidContext, str);
        }
    }
}
