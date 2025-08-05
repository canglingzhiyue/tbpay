package com.taobao.ugc.utils;

import com.alibaba.android.split.core.splitinstall.g;
import com.alibaba.android.split.core.splitinstall.j;
import com.alibaba.android.split.core.splitinstall.m;
import com.alibaba.android.split.core.tasks.d;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.litecreator.util.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/taobao/ugc/utils/RemoteUtils;", "", "()V", "Companion", "RemoteCallback", "taobao_rate_sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class w {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f23228a;
    private static boolean b;
    private static com.alibaba.android.split.core.splitinstall.o c;
    private static final HashMap<Integer, b> d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/taobao/ugc/utils/RemoteUtils$RemoteCallback;", "", "onFailed", "", "onSuccess", "taobao_rate_sdk_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes9.dex */
    public interface b {
        void a();

        void b();
    }

    @JvmStatic
    public static final void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dd93f51", new Object[]{bVar});
        } else {
            Companion.a(bVar);
        }
    }

    @JvmStatic
    public static final boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : Companion.b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014H\u0007J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0007J\b\u0010\u0017\u001a\u00020\bH\u0007J\u0006\u0010\u0018\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R2\u0010\n\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bj\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/taobao/ugc/utils/RemoteUtils$Companion;", "", "()V", "FEATURE_NAME_CORE", "", "FEATURE_NAME_RATE", RPCDataItems.SWITCH_TAG_LOG, "sIsInit", "", "sIsPreLoad", "sRemoteCallbackMap", "Ljava/util/HashMap;", "", "Lcom/taobao/ugc/utils/RemoteUtils$RemoteCallback;", "Lkotlin/collections/HashMap;", "sRemoteListener", "Lcom/alibaba/android/split/core/splitinstall/SplitInstallStateUpdatedListener;", "doInit", "", "successCallback", "Lkotlin/Function0;", "failedCallback", "callback", "isInit", "registerRemoteListenerOnce", "taobao_rate_sdk_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Ljava/lang/Exception;", "kotlin.jvm.PlatformType", "onFailure"}, k = 3, mv = {1, 4, 0})
        /* loaded from: classes9.dex */
        public static final class b implements d {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b f23230a;

            public b(b bVar) {
                this.f23230a = bVar;
            }

            @Override // com.alibaba.android.split.core.tasks.d
            public final void onFailure(Exception exc) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ebfde814", new Object[]{this, exc});
                    return;
                }
                b bVar = this.f23230a;
                if (bVar == null) {
                    return;
                }
                bVar.b();
            }
        }

        static {
            kge.a(-489649916);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "sessionId", "", "kotlin.jvm.PlatformType", "onSuccess", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 4, 0})
        /* renamed from: com.taobao.ugc.utils.w$a$a  reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        public static final class C0994a<TResult> implements com.alibaba.android.split.core.tasks.e<Integer> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b f23229a;

            public C0994a(b bVar) {
                this.f23229a = bVar;
            }

            @Override // com.alibaba.android.split.core.tasks.e
            public /* synthetic */ void onSuccess(Integer num) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ea580ec7", new Object[]{this, num});
                } else {
                    a(num);
                }
            }

            public final void a(Integer num) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
                } else {
                    w.b().put(num, this.f23229a);
                }
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (w.a() != null) {
            } else {
                w.a(c.INSTANCE);
                g c2 = com.taobao.appbundle.c.Companion.a().c();
                if (c2 == null) {
                    return;
                }
                c2.a(w.a());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "status", "Lcom/alibaba/android/split/core/splitinstall/SplitInstallSessionState;", "kotlin.jvm.PlatformType", "onStateUpdate"}, k = 3, mv = {1, 4, 0})
        /* loaded from: classes9.dex */
        public static final class c implements com.alibaba.android.split.core.splitinstall.o {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final c INSTANCE = new c();

            @Override // com.alibaba.android.split.core.listener.b
            public /* synthetic */ void onStateUpdate(m mVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("bd17bbbe", new Object[]{this, mVar});
                } else {
                    a(mVar);
                }
            }

            public final void a(m mVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("398f1780", new Object[]{this, mVar});
                } else if (!w.b().containsKey(Integer.valueOf(mVar.a()))) {
                } else {
                    int b = mVar.b();
                    if (b == 5) {
                        u.d("RateRemoteUtils", "ugc-component-rate installed");
                        u.d("RateRemoteUtils", "ugc-core installed");
                        b bVar = (b) w.b().get(Integer.valueOf(mVar.a()));
                        if (bVar != null) {
                            bVar.a();
                        }
                        l.a("XRateRemoteLoadingSuccess", null, null, 6, null);
                        p.b("XRateRemoteLoading");
                    } else if (b != 6) {
                    } else {
                        u.d("RateRemoteUtils", "ugc-component-rate init failed");
                        u.d("RateRemoteUtils", "ugc-core init failed");
                        b bVar2 = (b) w.b().get(Integer.valueOf(mVar.a()));
                        if (bVar2 != null) {
                            bVar2.b();
                        }
                        p.b("XRateRemoteLoading");
                        String valueOf = String.valueOf(mVar.d());
                        StringBuilder sb = new StringBuilder();
                        sb.append(mVar.d());
                        sb.append('_');
                        sb.append(mVar.c());
                        l.a("XRateRemoteLoadingFailed", valueOf, sb.toString());
                    }
                }
            }
        }

        @JvmStatic
        public final boolean b() {
            Set<String> a2;
            Set<String> a3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            if (w.c()) {
                return true;
            }
            g c2 = com.taobao.appbundle.c.Companion.a().c();
            if (com.android.tools.bundleInfo.b.a().c("ugc_component_rate") == null && com.android.tools.bundleInfo.b.a().c("ugc_core") == null) {
                u.d("RateRemoteUtils", "ugc DynamicFeature is null, is Init true");
                w.a(true);
                return true;
            } else if (c2 != null && (a2 = c2.a()) != null && a2.contains("ugc_component_rate") && (a3 = c2.a()) != null && a3.contains("ugc_core")) {
                u.d("RateRemoteUtils", "ugc installed, is Init true");
                w.a(true);
                return true;
            } else {
                u.d("RateRemoteUtils", "ugc not installed, is Init false");
                if (!w.d()) {
                    w.b(true);
                    ArrayList arrayList = new ArrayList();
                    if (com.android.tools.bundleInfo.b.a().c("ugc_component_rate") != null) {
                        arrayList.add("ugc_component_rate");
                    }
                    if (com.android.tools.bundleInfo.b.a().c("ugc_core") != null) {
                        arrayList.add("ugc_core");
                    }
                    if (c2 != null) {
                        c2.a(arrayList);
                    }
                }
                return false;
            }
        }

        @JvmStatic
        public final void a(b bVar) {
            com.alibaba.android.split.core.tasks.h<Integer> a2;
            com.alibaba.android.split.core.tasks.h<Integer> a3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7dd93f51", new Object[]{this, bVar});
                return;
            }
            a aVar = this;
            aVar.a();
            l.a("XRateRemoteCheck", null, null, 6, null);
            if (aVar.b()) {
                if (bVar == null) {
                    return;
                }
                bVar.a();
                return;
            }
            l.a("XRateRemoteLoading", null, null, 6, null);
            p.a("XRateRemoteLoading");
            j a4 = j.a().a("ugc_component_rate").a("ugc_core").a();
            kotlin.jvm.internal.q.b(a4, "SplitInstallRequest.newB…EATURE_NAME_CORE).build()");
            g c2 = com.taobao.appbundle.c.Companion.a().c();
            if (c2 == null || (a2 = c2.a(a4)) == null || (a3 = a2.a(new C0994a(bVar))) == null) {
                return;
            }
            a3.a(new b(bVar));
        }
    }

    public static final /* synthetic */ com.alibaba.android.split.core.splitinstall.o a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.split.core.splitinstall.o) ipChange.ipc$dispatch("79ff36fe", new Object[0]) : c;
    }

    public static final /* synthetic */ void a(com.alibaba.android.split.core.splitinstall.o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3990003e", new Object[]{oVar});
        } else {
            c = oVar;
        }
    }

    public static final /* synthetic */ void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    public static final /* synthetic */ HashMap b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("8adf10c", new Object[0]) : d;
    }

    public static final /* synthetic */ void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{new Boolean(z)});
        } else {
            f23228a = z;
        }
    }

    public static final /* synthetic */ boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : b;
    }

    public static final /* synthetic */ boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : f23228a;
    }

    static {
        kge.a(1973115068);
        Companion = new a(null);
        d = new HashMap<>();
    }
}
