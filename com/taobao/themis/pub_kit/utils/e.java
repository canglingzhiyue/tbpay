package com.taobao.themis.pub_kit.utils;

import android.content.Context;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.n;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0007J \u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\rH\u0002J<\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0007J \u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/taobao/themis/pub_kit/utils/PubTimesFatigueUtils;", "", "()V", "PUB_POP_GUIDE_START_TIME", "", "PUB_POP_GUIDE_TIMES", RPCDataItems.SWITCH_TAG_LOG, "addTimesFatigue", "", "context", "Landroid/content/Context;", "type", "appTimesFatigue", "Lcom/taobao/themis/pub_kit/utils/PubTimesFatigue;", "userTimesFatigue", "globalTimesFatigue", "addTimesMDayNTimes", "timesFatigue", "timesFatigueMDayNTimes", "", "timesMDayNTimes", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final e INSTANCE;

    static {
        kge.a(-1023245374);
        INSTANCE = new e();
    }

    private e() {
    }

    public static /* synthetic */ boolean a(Context context, String str, d dVar, d dVar2, d dVar3, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81ff5721", new Object[]{context, str, dVar, dVar2, dVar3, new Integer(i), obj})).booleanValue();
        }
        if ((i & 4) != 0) {
            dVar = null;
        }
        if ((i & 8) != 0) {
            dVar2 = null;
        }
        if ((i & 16) != 0) {
            dVar3 = null;
        }
        return a(context, str, dVar, dVar2, dVar3);
    }

    @JvmStatic
    public static final boolean a(Context context, String type, d dVar, d dVar2, d dVar3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e29c5c6", new Object[]{context, type, dVar, dVar2, dVar3})).booleanValue();
        }
        q.d(context, "context");
        q.d(type, "type");
        if (!n.a()) {
            TMSLogger.d("PubTimesFatigueUtils", "timesFatigueMDayNTimes is disabled");
            return false;
        } else if (dVar == null && dVar2 == null) {
            TMSLogger.d("PubTimesFatigueUtils", "timesFatigueMDayNTimes, appTimesFatigue and userTimesFatigue are disabled");
            return true;
        } else {
            boolean a2 = dVar != null ? INSTANCE.a(context, type, dVar) : false;
            if (dVar2 == null) {
                return a2;
            }
            boolean z = INSTANCE.a(context, type, dVar2) || a2;
            if (dVar3 == null) {
                return z;
            }
            e eVar = INSTANCE;
            StringBuilder sb = new StringBuilder();
            sb.append(dVar3.a());
            sb.append("_global");
            return eVar.a(context, sb.toString(), dVar3) || z;
        }
    }

    public static /* synthetic */ void b(Context context, String str, d dVar, d dVar2, d dVar3, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5936d07c", new Object[]{context, str, dVar, dVar2, dVar3, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            dVar = null;
        }
        if ((i & 8) != 0) {
            dVar2 = null;
        }
        if ((i & 16) != 0) {
            dVar3 = null;
        }
        b(context, str, dVar, dVar2, dVar3);
    }

    @JvmStatic
    public static final void b(Context context, String type, d dVar, d dVar2, d dVar3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("244902c3", new Object[]{context, type, dVar, dVar2, dVar3});
            return;
        }
        q.d(context, "context");
        q.d(type, "type");
        if (dVar != null) {
            TMSLogger.a("PubTimesFatigueUtils", "increase appTimesFatigue: " + dVar.a() + ", " + dVar.b() + ", " + dVar.c());
            INSTANCE.b(context, type, dVar);
        }
        if (dVar2 != null) {
            TMSLogger.a("PubTimesFatigueUtils", "increase userTimesFatigue: " + dVar2.a() + ", " + dVar2.b() + ", " + dVar2.c());
            INSTANCE.b(context, type, dVar2);
        }
        if (dVar2 == null || dVar3 == null) {
            return;
        }
        TMSLogger.a("PubTimesFatigueUtils", "increase globalTimesFatigue: " + dVar3.a() + ", " + dVar3.b() + ", " + dVar3.c());
        e eVar = INSTANCE;
        StringBuilder sb = new StringBuilder();
        sb.append(dVar3.a());
        sb.append("_global");
        eVar.b(context, sb.toString(), dVar3);
    }

    private final boolean a(Context context, String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec4cdec6", new Object[]{this, context, str, dVar})).booleanValue();
        }
        if (dVar.b() == 0 || dVar.c() == 0) {
            TMSLogger.d("PubTimesFatigueUtils", "timesFatigue's dayValue or timesValue is 0");
            return true;
        }
        if (dVar.b() == -1) {
            TMSLogger.b("PubTimesFatigueUtils", "timesFatigue's dayValue is -1");
            dVar.a(9999999);
        }
        if (dVar.c() == -1) {
            TMSLogger.b("PubTimesFatigueUtils", "timesFatigue's timesValue is -1");
            dVar.b(9999999);
        }
        String str2 = "pub_add_guide_start_time_" + dVar.a() + '_' + str;
        long b = com.taobao.themis.utils.j.b(context, str2, 0L);
        int b2 = com.taobao.themis.utils.j.b(context, "pub_add_guide_times_" + dVar.a() + '_' + str, 0);
        TMSLogger.b("PubTimesFatigueUtils", "type: " + str + ", id: " + dVar.a() + ", dayValue: " + dVar.b() + ", timeValue: " + dVar.c());
        TMSLogger.b("PubTimesFatigueUtils", "type: " + str + ", id: " + dVar.a() + ", addCount: " + b2 + ", duration: " + (System.currentTimeMillis() - b));
        if (b != 0 && System.currentTimeMillis() - b <= dVar.b() * 24 * 60 * 60 * 1000) {
            return b2 >= dVar.c();
        }
        com.taobao.themis.utils.j.a(context, str2, System.currentTimeMillis());
        return false;
    }

    private final void b(Context context, String str, d dVar) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93c8b883", new Object[]{this, context, str, dVar});
        } else if (dVar.b() == 0 || dVar.c() == 0) {
            TMSLogger.d("PubTimesFatigueUtils", "addTimesMDayNTimes, timesFatigue's dayValue or timesValue is 0");
        } else {
            if (dVar.b() == -1) {
                TMSLogger.b("PubTimesFatigueUtils", "addTimesMDayNTimes, timesFatigue's dayValue is -1");
                dVar.a(9999999);
            }
            if (dVar.c() == -1) {
                TMSLogger.b("PubTimesFatigueUtils", "addTimesMDayNTimes, timesFatigue's timesValue is -1");
                dVar.b(9999999);
            }
            com.taobao.themis.utils.j.a(context, "pub_add_guide_times_" + dVar.a() + '_' + str, com.taobao.themis.utils.j.b(context, str2, 0) + 1);
        }
    }
}
