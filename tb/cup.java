package tb;

import android.net.Uri;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.HybridPreRenderHelper$Companion$enablePreRequestRefund$2;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.HybridPreRenderHelper$Companion$enableRefundUseAsync$2;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.HybridPreRenderHelper$Companion$useSurfaceView$2;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.cts;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/utils/HybridPreRenderHelper;", "", "()V", "Companion", "ultron-view-kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class cup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static final d f26542a;
    private static final d b;
    private static final d c;

    public static final boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : Companion.c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0007R!\u0010\u0003\u001a\u00020\u00048FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R!\u0010\n\u001a\u00020\u00048FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\r\u0010\t\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\u0007R!\u0010\u000e\u001a\u00020\u00048FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\t\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/utils/HybridPreRenderHelper$Companion;", "", "()V", "enablePreRequestRefund", "", "getEnablePreRequestRefund$annotations", "getEnablePreRequestRefund", "()Z", "enablePreRequestRefund$delegate", "Lkotlin/Lazy;", "enableRefundUseAsync", "getEnableRefundUseAsync$annotations", "getEnableRefundUseAsync", "enableRefundUseAsync$delegate", "useSurfaceView", "getUseSurfaceView$annotations", "getUseSurfaceView", "useSurfaceView$delegate", "generateRefundPreloadUrl", "", "ultron-view-kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-239866668);
        }

        public final boolean a() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("56c6c6c", new Object[]{this});
            } else {
                d a2 = cup.a();
                a aVar = cup.Companion;
                value = a2.getValue();
            }
            return ((Boolean) value).booleanValue();
        }

        public final boolean b() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("57a83ed", new Object[]{this});
            } else {
                d b = cup.b();
                a aVar = cup.Companion;
                value = b.getValue();
            }
            return ((Boolean) value).booleanValue();
        }

        public final boolean c() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("5889b6e", new Object[]{this});
            } else {
                d c = cup.c();
                a aVar = cup.Companion;
                value = c.getValue();
            }
            return ((Boolean) value).booleanValue();
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        @JvmStatic
        public final String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
            }
            Uri.Builder buildUpon = Uri.parse(abm.a(cts.a.PRE_RENDER_URL_REFUND_LIST)).buildUpon();
            a aVar = this;
            if (aVar.b()) {
                buildUpon.appendQueryParameter(tbt.PRE_REQUEST, "true");
            }
            if (aVar.c()) {
                buildUpon.appendQueryParameter(cts.a.QUERY_ASYNC_CREATE_INSTANCE, "true");
            }
            if (iro.c()) {
                buildUpon.appendQueryParameter("hitRefundDetailHybridContainer", "true");
            }
            String builder = buildUpon.toString();
            q.b(builder, "resUrl.toString()");
            return builder;
        }
    }

    public static final /* synthetic */ d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("bc9a1587", new Object[0]) : f26542a;
    }

    public static final /* synthetic */ d b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("9e77df26", new Object[0]) : b;
    }

    public static final /* synthetic */ d c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("8055a8c5", new Object[0]) : c;
    }

    static {
        kge.a(216154252);
        Companion = new a(null);
        f26542a = e.a(HybridPreRenderHelper$Companion$useSurfaceView$2.INSTANCE);
        b = e.a(HybridPreRenderHelper$Companion$enablePreRequestRefund$2.INSTANCE);
        c = e.a(HybridPreRenderHelper$Companion$enableRefundUseAsync$2.INSTANCE);
    }
}
