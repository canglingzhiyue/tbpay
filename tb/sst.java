package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.global.setting.c;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.sdk.core.g;
import com.taobao.taolive.sdk.utils.ad;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.u;

/* loaded from: classes8.dex */
public class sst {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MUTE_SETTING_MODULE_BIZ_NAME = "TaoliveRoom";

    /* renamed from: a  reason: collision with root package name */
    private static final String f33893a;

    static {
        kge.a(-1111560179);
        f33893a = sst.class.getSimpleName();
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (!u.T()) {
            q.b(f33893a, "isIndependentMuteABOpen enableIndependentLiveMuteSwitch == false");
            return false;
        }
        return c.a(pmd.a().u().c(), "TaoliveRoom").b().a("tbGlobalMuteSetting");
    }

    public static boolean a(a aVar) {
        g z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18197561", new Object[]{aVar})).booleanValue();
        }
        if (a() && aVar != null && (z = aVar.z()) != null) {
            return z.s();
        }
        return false;
    }

    public static boolean b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c31b80", new Object[]{aVar})).booleanValue();
        }
        if (!a(aVar) || aVar == null || aVar.M() == null || aVar.M().a() || ad.a(aVar, OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedSimpleLive)) {
            return false;
        }
        return aVar.M().b();
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            a(System.currentTimeMillis());
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        return System.currentTimeMillis() - e() > u.U() * 1000;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        if (pmd.a().u() == null || pmd.a().u().c() == null) {
            q.b(f33893a, "isGlobalMuteSettingOpen context == null");
            return false;
        }
        Boolean bool = (Boolean) c.a(pmd.a().u().c(), "TaoliveRoom").b().a("TaoliveRoom", "liveMute", false, null);
        String str = f33893a;
        q.b(str, "isGlobalMuteSettingOpen state:" + bool);
        return bool.booleanValue();
    }

    private static void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{new Long(j)});
            return;
        }
        SharedPreferences.Editor edit = pmd.a().u().c().getSharedPreferences("taolive", 0).edit();
        edit.putLong("StrongMuteViewShowTimeMS", j);
        edit.apply();
    }

    private static long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[0])).longValue() : pmd.a().u().c().getSharedPreferences("taolive", 0).getLong("StrongMuteViewShowTimeMS", 0L);
    }
}
