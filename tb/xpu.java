package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.IUGCMedia;
import com.taobao.android.litecreator.base.workflow.e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.ios;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/taobao/android/litecreator/base/account/AccountUtils;", "", "()V", "Companion", "litecreator_sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class xpu {
    public static final a Companion;

    static {
        kge.a(1325617600);
        Companion = new a(null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/taobao/android/litecreator/base/account/AccountUtils$Companion;", "", "()V", "isContentUltra", "", "params", "", "", "isContentUltraUser", "context", "Landroid/content/Context;", "litecreator_sdk_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(753405192);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final boolean a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
            }
            q.d(context, "context");
            IUGCMedia d = e.d(context);
            ios.a a2 = ios.a(d != null ? d.getPublishSessionId() : null);
            q.b(a2, "UrlParams.of(ugcMedia?.publishSessionId)");
            return a2 != null && a2.a(ios.KEY_IS_USE_NEW_PUBLISHER, 0) == 1;
        }

        public final boolean a(Map<String, String> params) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{this, params})).booleanValue();
            }
            q.d(params, "params");
            return TextUtils.equals(params.get(ios.KEY_IS_USE_NEW_PUBLISHER), "1");
        }
    }
}
