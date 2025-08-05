package com.taobao.android.revisionswitch.core;

import android.os.Build;
import android.provider.Settings;
import android.taobao.windvane.extra.uc.WVHeaderManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopParamType;
import mtopsdk.mtop.intf.MtopSetting;
import tb.ilw;
import tb.ilz;

/* loaded from: classes.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_GROUP_NAME = "guangguangGreyHosts";

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f14892a = new AtomicBoolean(false);
    private static final List<String> b = new ArrayList<String>() { // from class: com.taobao.android.revisionswitch.core.TrackManager$1
        {
            add("tesi.m.taobao.com");
            add("tesi.wapa.taobao.com");
            add("tesi-assets.m.taobao.com");
        }
    };
    private WVHeaderManager.CustomRequestHeader c = null;
    private final ilz d;

    public static /* synthetic */ ilz a(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ilz) ipChange.ipc$dispatch("6795363e", new Object[]{iVar}) : iVar.d;
    }

    public i(ilz ilzVar) {
        this.d = ilzVar;
    }

    private WVHeaderManager.CustomRequestHeader a(ilz ilzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVHeaderManager.CustomRequestHeader) ipChange.ipc$dispatch("66c941fa", new Object[]{this, ilzVar});
        }
        if (this.c == null) {
            List<String> c = ilzVar.c();
            if (c == null || c.size() == 0) {
                c = b;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("x-gg-hit-grey", "true");
            this.c = new WVHeaderManager.CustomRequestHeader(c, hashMap);
        }
        return this.c;
    }

    public void a(final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94cb817", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            try {
                String a2 = cVar.a("elderHome");
                if (a2 != null) {
                    MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, "elderHome", a2);
                }
                MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, "x-social-attr", cVar.a());
                if (!TBRevisionSwitchManager.f14881a) {
                    if (cVar.e()) {
                        UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty("dosaab", cVar.b().a());
                    } else {
                        UTAnalytics.getInstance().getDefaultTracker().removeGlobalProperty("dosaab");
                    }
                }
                if (!TBRevisionSwitchManager.f14881a && (!cVar.b().b().c().a(ilw.KEY_NEW_CONTENT_ENABLE) || !cVar.c().a().c().b(ilw.KEY_NEW_CONTENT_ENABLE, true))) {
                    WVHeaderManager.getInstance().unregisterCustomRequestHeader(a(this.d));
                    if (TBRevisionSwitchManager.f14881a || !f14892a.compareAndSet(false, true)) {
                    }
                    TCrashSDK.instance().addJvmUncaughtCrashListener(new JvmUncaughtCrashListener() { // from class: com.taobao.android.revisionswitch.core.i.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
                        public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return (Map) ipChange2.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
                            }
                            HashMap hashMap = new HashMap();
                            try {
                                hashMap.put("dosa_revision_ab", cVar.e() ? cVar.b().a() : "");
                                if (Build.VERSION.SDK_INT >= 17) {
                                    hashMap.put("alwaysFinishActivities", Integer.valueOf(Settings.Global.getInt(cVar.d().getContentResolver(), "always_finish_activities", 0)));
                                }
                            } catch (Exception unused) {
                            }
                            return hashMap;
                        }
                    });
                    return;
                }
                WVHeaderManager.getInstance().registerCustomRequestHeader(a(this.d));
                if (TBRevisionSwitchManager.f14881a) {
                }
            } catch (Throwable th) {
                TLog.loge("TrackManager", "track error: " + th.getMessage());
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{ORANGE_GROUP_NAME}, new com.taobao.orange.d() { // from class: com.taobao.android.revisionswitch.core.i.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map) {
                    String customConfig;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                        return;
                    }
                    try {
                        if (!i.ORANGE_GROUP_NAME.equals(str) || (customConfig = OrangeConfig.getInstance().getCustomConfig(str, null)) == null) {
                            return;
                        }
                        i.a(i.this).e(customConfig);
                    } catch (Throwable th) {
                        TLog.loge("TrackManager", "orange update Exception: " + th.getMessage());
                    }
                }
            }, true);
        }
    }
}
