package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\bH\u0002J\u0006\u0010\f\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\r"}, d2 = {"Lcom/taobao/detail/rate/vivid/utils/PreRenderUtils;", "", "()V", "AB_COMPONENT", "", "AB_KEY", "AB_MODULE", "preRenderEnable", "", "Ljava/lang/Boolean;", "isPreRenderOpen", "isVersionOK", "preRenderOpen", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class ses {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ses INSTANCE = new ses();

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f33516a;

    private ses() {
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (f33516a == null) {
            if (c() && b()) {
                z = true;
            }
            f33516a = Boolean.valueOf(z);
        }
        Boolean bool = true;
        f33516a = bool;
        if (bool == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        }
        return bool.booleanValue();
    }

    private final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        JSONObject a2 = kio.INSTANCE.a();
        Long l = a2 != null ? a2.getLong("version") : null;
        return l != null && l.longValue() >= ((long) kio.INSTANCE.k());
    }

    private final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        VariationSet activate = UTABTest.activate("rate_list_pre_render_component", "rate_list_pre_render_module");
        Boolean bool = null;
        Variation variation = activate != null ? activate.getVariation("rate_list_pre_render_enable") : null;
        if (variation != null) {
            bool = Boolean.valueOf(variation.getValueAsBoolean(false));
        }
        return kio.INSTANCE.j() && q.a((Object) bool, (Object) true);
    }
}
