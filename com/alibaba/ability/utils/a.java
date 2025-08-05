package com.alibaba.ability.utils;

import com.alibaba.ability.e;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ao;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.text.n;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0018J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0002J\r\u0010\u001a\u001a\u00020\u001bH\u0000¢\u0006\u0002\b\u001cJ\b\u0010\u001d\u001a\u00020\u001bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/alibaba/ability/utils/AbilityOrangeConfig;", "", "()V", "ENABLE_PARAMETERS_LOG", "", "KEY_AB_CONFIG_GROUP", "MAIN_THREAD_ABILITIES", "MAIN_THREAD_APIS", "NAME_SPACE", "VALUE_TRUE", "<set-?>", "", "enableLogParameter", "getEnableLogParameter", "()Z", "", "mainThreadAbilities", "getMainThreadAbilities", "()Ljava/util/Set;", "mainThreadApis", "getMainThreadApis", "getBooleanConfigByOrange", com.taobao.android.behavix.feature.a.FEATURE_NAME, AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "getBooleanConfigByOrange$open_ability_release", "getStringConfigByOrange", "registerOrangeListener", "", "registerOrangeListener$open_ability_release", "updateOrangeConfigs", "open_ability_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a INSTANCE = new a();

    /* renamed from: a  reason: collision with root package name */
    private static Set<String> f1985a = ao.a();
    private static Set<String> b = ao.a();
    private static boolean c = true;

    private a() {
    }

    public static final /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf96c5c", new Object[]{aVar});
        } else {
            aVar.e();
        }
    }

    public final Set<String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("a0177257", new Object[]{this}) : f1985a;
    }

    public final Set<String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("6dc1d418", new Object[]{this}) : b;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : c;
    }

    public final boolean a(String featureName, String defaultValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, featureName, defaultValue})).booleanValue();
        }
        q.d(featureName, "featureName");
        q.d(defaultValue, "defaultValue");
        return q.a((Object) "true", (Object) b(featureName, defaultValue));
    }

    private final String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2});
        }
        String config = OrangeConfig.getInstance().getConfig("openability_option_abconfig", str, str2);
        q.b(config, "OrangeConfig.getInstance…   defaultValue\n        )");
        return config;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"megability"}, C0060a.INSTANCE, true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010$\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032F\u0010\u0005\u001aB\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004* \u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00070\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "namespace", "", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "", "onConfigUpdate"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.alibaba.ability.utils.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0060a implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final C0060a INSTANCE = new C0060a();

        @Override // com.taobao.orange.d
        public final void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if (!q.a((Object) "megability", (Object) str)) {
            } else {
                e.c((Runnable) AnonymousClass1.INSTANCE);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
        /* renamed from: com.alibaba.ability.utils.a$a$1  reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass1 implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    a.a(a.INSTANCE);
                }
            }
        }
    }

    private final void e() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        OrangeConfig orangeConfig = OrangeConfig.getInstance();
        String sApis = orangeConfig.getConfig("megability", "mainThreadApis", "");
        q.b(sApis, "sApis");
        String str = sApis;
        if (str.length() > 0) {
            b = p.m(n.b((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null));
        }
        String sAbilities = orangeConfig.getConfig("megability", "mainThreadAbilities", "");
        q.b(sAbilities, "sAbilities");
        String str2 = sAbilities;
        if (str2.length() > 0) {
            z = true;
        }
        if (z) {
            f1985a = p.m(n.b((CharSequence) str2, new String[]{","}, false, 0, 6, (Object) null));
        }
        c = q.a((Object) orangeConfig.getConfig("megability", "enableParametersLog", "true"), (Object) "true");
    }
}
