package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.component.module.d;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0003JG\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\f\"\u0004\u0018\u00010\rH\u0016¢\u0006\u0002\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/taobao/android/detail/ttdetail/component/builder/DetailDescSuffixShrinkBuilder;", "Lcom/taobao/android/detail/ttdetail/component/view/IComponentBuilder;", "Lcom/taobao/android/detail/ttdetail/data/ComponentData;", "()V", CartRecommendRefreshScene.build, "Lcom/taobao/android/detail/ttdetail/component/module/Component;", "context", "Landroid/content/Context;", "detailContext", "Lcom/taobao/android/detail/ttdetail/context/DetailContext;", "data", "initComponentData", "", "Lcom/taobao/android/detail/ttdetail/component/module/DataEntry;", "(Landroid/content/Context;Lcom/taobao/android/detail/ttdetail/context/DetailContext;Lcom/taobao/android/detail/ttdetail/data/ComponentData;[Lcom/taobao/android/detail/ttdetail/component/module/DataEntry;)Lcom/taobao/android/detail/ttdetail/component/module/Component;", "Companion", "tt-detail_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes4.dex */
public final class lez implements eyp<eyy> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String NAME = "descSuffixShrink";

    static {
        kge.a(1809809414);
        kge.a(1842823874);
        Companion = new a(null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/android/detail/ttdetail/component/builder/DetailDescSuffixShrinkBuilder$Companion;", "", "()V", "NAME", "", "tt-detail_release"}, k = 1, mv = {1, 1, 16})
    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(-1251238962);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // tb.eyp
    public d<eyy> a(Context context, eyx eyxVar, eyy eyyVar, DataEntry... initComponentData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("58ba28a4", new Object[]{this, context, eyxVar, eyyVar, initComponentData});
        }
        q.c(context, "context");
        q.c(initComponentData, "initComponentData");
        return new ojw(context, eyxVar, eyyVar, (DataEntry[]) Arrays.copyOf(initComponentData, initComponentData.length));
    }
}
