package com.taobao.android.fluid.framework.mute.helper;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.mute.IMuteService;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.obu;
import tb.occ;
import tb.ocd;
import tb.oec;
import tb.skl;
import tb.spz;

/* loaded from: classes5.dex */
public abstract class e implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MUTE_FLAG = "mute_flag";
    public static final String MUTE_VALUE = "mute";
    public static final String SHOP_VIDEO_MUTE_FLAG = "shop_video_mute_flag";
    public static final String XIAOMI_B1_TAB3_MUTE_FLAG = "xiaomi_b1_tab3_mute_flag";
    public final String b;
    public String c;
    private String d;
    private String e;
    private String f;
    private String g = "guangguang";

    static {
        kge.a(505471902);
        kge.a(-271870066);
    }

    public e(String str, String str2, String str3, String str4) {
        this.d = "last_show_mute_tips_time";
        this.e = "has_show_mute_tips_count";
        this.f = "tab3_mute_storage";
        this.d = str;
        this.e = str2;
        this.f = str3;
        if (str4 == null) {
            this.b = MUTE_FLAG;
        } else {
            this.b = str4;
        }
    }

    public void g(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cfda3a0", new Object[]{this, fluidContext});
            return;
        }
        this.c = null;
        ((IMuteService) fluidContext.getService(IMuteService.class)).a(fluidContext, this.b, this.c);
    }

    @Override // com.taobao.android.fluid.framework.mute.helper.d
    public void a(FluidContext fluidContext, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56de6cab", new Object[]{this, fluidContext, map});
        } else if (map == null) {
        } else {
            Object obj = map.get(MusLiveVideo.ATTR_MUTE);
            if ("true".equals(obj)) {
                h(fluidContext);
            } else if ("false".equals(obj)) {
                g(fluidContext);
            }
            if (!oec.a(map.get("global"), true)) {
                return;
            }
            if (f.b(fluidContext, this.g)) {
                com.taobao.global.setting.c.a(obu.e(), this.g).c().b(this.g, "mute", Boolean.valueOf("true".equals(obj)), null);
            }
            spz.c("MuteBase", "Tnode 发送静音状态改变的消息" + obj);
            Object obj2 = map.get("muteStorage");
            if ("true".equals(obj2)) {
                a(true);
            } else if (!"false".equals(obj2)) {
            } else {
                a(false);
            }
        }
    }

    @Override // com.taobao.android.fluid.framework.mute.helper.d
    public Map<String, Object> c(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("137accd1", new Object[]{this, fluidContext}) : f.a(this.g, fluidContext);
    }

    @Override // com.taobao.android.fluid.framework.mute.helper.d
    public Map<String, Object> d(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("70a5112", new Object[]{this, fluidContext});
        }
        HashMap hashMap = new HashMap();
        if (!m(fluidContext) || !a.a(obu.e())) {
            z = false;
        }
        spz.c("MuteBase", "走了getMuteState， needshowtips值" + z);
        String str = "true";
        hashMap.put(MusLiveVideo.ATTR_MUTE, c() ? str : "false");
        if (!z) {
            str = "false";
        }
        hashMap.put("needShowTips", str);
        hashMap.put("muteStorage", b());
        spz.c("MuteBase", "3.静音逻升级初始化-native，gteMuteState muted：" + hashMap.get(MusLiveVideo.ATTR_MUTE) + "_needShowTips:" + hashMap.get("needShowTips") + "_muteStorage:" + hashMap.get("muteStorage"));
        return hashMap;
    }

    @Override // com.taobao.android.fluid.framework.mute.helper.d
    public void e(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dea6f9e", new Object[]{this, fluidContext});
            return;
        }
        occ.a((Context) obu.e(), this.e, occ.b(obu.e(), this.e, 0) + 1);
        occ.a(obu.e(), this.d, System.currentTimeMillis());
    }

    @Override // com.taobao.android.fluid.framework.mute.helper.d
    public boolean f(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d7409a3", new Object[]{this, fluidContext})).booleanValue();
        }
        if (fluidContext == null) {
            return false;
        }
        return !StringUtils.isEmpty(this.c);
    }

    public void h(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c873da1", new Object[]{this, fluidContext});
            return;
        }
        this.c = "mute";
        ((IMuteService) fluidContext.getService(IMuteService.class)).a(fluidContext, this.b, this.c);
    }

    public void a(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab43ee4", new Object[]{this, fluidContext, str});
            return;
        }
        this.c = str;
        ((IMuteService) fluidContext.getService(IMuteService.class)).a(fluidContext, this.b, this.c);
    }

    public void i(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c10d7a2", new Object[]{this, fluidContext});
            return;
        }
        ((IMuteService) fluidContext.getService(IMuteService.class)).setMuteABTestForSettings(false);
        spz.c("MuteBase", "走了降级的策略");
        if (StringUtils.equals(b(), "true")) {
            h(fluidContext);
        } else if (!m(fluidContext)) {
        } else {
            skl j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
            String str = j.ac;
            spz.c("MuteBase", "1.静音逻升级初始化-native，疲劳度满足，音量正常，commonShowMuteTips：" + str);
            int i = j.ad;
            if (!StringUtils.equals(str, "true") || i < 0) {
                return;
            }
            h(fluidContext);
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        String b = occ.b(obu.e(), this.f, (String) null);
        spz.c("MuteBase", "1.静音getMuteStorage key：" + this.f + "-result:" + b);
        return StringUtils.isEmpty(b) ? "none" : b;
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            occ.a(obu.e(), this.f, String.valueOf(z));
        }
    }

    public void j(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b9a71a3", new Object[]{this, fluidContext});
            return;
        }
        this.g = f.j(fluidContext);
        if (f.b(fluidContext, this.g)) {
            l(fluidContext);
        } else {
            k(fluidContext);
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.c);
    }

    private void k(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b240ba4", new Object[]{this, fluidContext});
        } else if (StringUtils.equals(b(), "true")) {
            h(fluidContext);
        } else if (!m(fluidContext)) {
        } else {
            skl j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
            String str = j.ac;
            spz.c("MuteBase", "1.静音逻升级初始化-native，疲劳度满足，音量正常，commonShowMuteTips：" + str);
            int i = j.ad;
            if (!StringUtils.equals(str, "true") || i < 0) {
                return;
            }
            h(fluidContext);
        }
    }

    private void l(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aada5a5", new Object[]{this, fluidContext});
            return;
        }
        boolean booleanValue = ((Boolean) com.taobao.global.setting.c.a(obu.e(), this.g).b().b(this.g, "mute", false, null)).booleanValue();
        boolean a2 = com.taobao.global.setting.c.a(obu.e(), this.g).b().a("muteCountDown", false);
        if (!booleanValue && !a2) {
            return;
        }
        h(fluidContext);
    }

    private boolean a(Context context, FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7daeb96", new Object[]{this, context, fluidContext})).booleanValue();
        }
        int b = occ.b(context, this.e, 0);
        spz.c("MuteBase", "1.静音isLessThanMaxCount key：" + this.e);
        return b < fluidContext.getInstanceConfig().getMuteTipCount();
    }

    private boolean m(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a373faa", new Object[]{this, fluidContext})).booleanValue();
        }
        if (!"none".equals(b())) {
            return false;
        }
        long c = occ.c(obu.e(), this.d);
        spz.c("MuteBase", "1.静音needShowTips key：" + this.d);
        return a(obu.e(), fluidContext, System.currentTimeMillis(), c);
    }

    private boolean a(Context context, FluidContext fluidContext, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cdd2796", new Object[]{this, context, fluidContext, new Long(j), new Long(j2)})).booleanValue();
        }
        skl j3 = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
        int i = -1;
        if (j3 != null) {
            i = j3.ad;
        }
        spz.c("MuteBase", "2.tab3静音逻升级初始化-native needShowTipsForTab3MuteUpgrade，服务端疲劳度：" + i);
        if (i == 0) {
            return a(context, fluidContext);
        }
        boolean a2 = ocd.a(j2, j, i);
        boolean a3 = ocd.a(j2, j);
        spz.c("MuteBase", "2.tab3静音逻升级初始化-native needShowTipsForTab3MuteUpgrade，isMoreThanDays：" + a2 + "——isSameDay：" + a3);
        return i > 0 && a2 && !a3;
    }
}
