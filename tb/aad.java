package tb;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.android.ultron.vfw.viewholder.l;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.i;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import kotlin.t;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010\u000f\u001a\u00020\tH\u0002J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/alibaba/android/icart/core/performance/dx/CartDXButterUpgrade;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "containerWhiteListForDXButter", "Ljava/util/concurrent/ConcurrentHashMap;", "", "<set-?>", "", "enableSmoothButter", "getEnableSmoothButter", "()Z", "enableButterForDXTemplate", "templateName", "getEnableSmoothButterValue", "getPreRenderTimesOfDXTemplate", "updateContainerWhiteListForDXButter", "", "updateEnableSmoothButter", "updateSwitchConfig", "icart-core-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class aad {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final aad INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f25171a;
    private static final ConcurrentHashMap<String, Integer> b;

    static {
        kge.a(624571541);
        aad aadVar = new aad();
        INSTANCE = aadVar;
        f25171a = aadVar.c();
        b = new ConcurrentHashMap<>();
    }

    private aad() {
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : f25171a;
    }

    @JvmStatic
    public static final int a(String templateName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{templateName})).intValue();
        }
        q.d(templateName, "templateName");
        Integer num = b.get(templateName);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @JvmStatic
    public static final boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : str != null && f25171a && b.containsKey(str);
    }

    @JvmStatic
    public static final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        INSTANCE.e();
        INSTANCE.d();
    }

    private final boolean c() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (jqi.a("iCart", "enableSmoothButter", false) && jqi.a("iCart", "enableSmoothButterOrange", true, true)) {
            z = true;
        }
        jqg.b("CartDXButterUpgrade", "enableSmoothButter=" + z);
        return z;
    }

    private final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            Result.a aVar = Result.Companion;
            String a2 = jqi.a("iCart", "containerWhiteListForDXButter", (String) null);
            if (ifp.a()) {
                Result.a aVar2 = Result.Companion;
                jqg.b("CartDXButterUpgrade", "updateContainerWhiteListForDXButter:" + a2);
                Result.m2371constructorimpl(t.INSTANCE);
            }
            b.clear();
            if (a2 != null) {
                Object parseObject = JSON.parseObject(a2, Map.class);
                if (parseObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
                }
                Map<? extends String, ? extends Integer> map = (Map) parseObject;
                if (!map.isEmpty()) {
                    b.putAll(map);
                }
            }
            Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar3 = Result.Companion;
            Result.m2371constructorimpl(i.a(th));
        }
    }

    private final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        boolean c = c();
        if (f25171a && !c) {
            try {
                Result.a aVar = Result.Companion;
                LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(Globals.getApplication());
                Intent intent = new Intent();
                intent.setAction(l.sBroadcastActionDXButterDowngrade);
                intent.putExtra("bizCode", "iCart");
                t tVar = t.INSTANCE;
                Result.m2371constructorimpl(Boolean.valueOf(localBroadcastManager.sendBroadcast(intent)));
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                Result.m2371constructorimpl(i.a(th));
            }
        }
        f25171a = c;
    }
}
