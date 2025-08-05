package tb;

import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/taobao/mytaobao/dataservice/service/MtbGlobalDataService;", "", "()V", "Companion", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xnu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static Pair<String, ? extends xns> f34412a;

    static {
        kge.a(56906605);
        Companion = new a(null);
    }

    public static final /* synthetic */ Pair a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("cde83151", new Object[0]) : f34412a;
    }

    public static final /* synthetic */ void a(Pair pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("328b7e91", new Object[]{pair});
        } else {
            f34412a = pair;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007R\u001c\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/taobao/mytaobao/dataservice/service/MtbGlobalDataService$Companion;", "", "()V", "dataService", "Lkotlin/Pair;", "", "Lcom/taobao/mytaobao/dataservice/service/IMainPageDataService;", "currentDataService", "login", "", "userId", Baggage.Amnet.USER_O, "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(524851829);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        @JvmStatic
        public final xns a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xns) ipChange.ipc$dispatch("f0cdc81", new Object[]{this});
            }
            Pair a2 = xnu.a();
            if (a2 == null) {
                return null;
            }
            return (xns) a2.getSecond();
        }

        @JvmStatic
        public final boolean a(String userId) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, userId})).booleanValue();
            }
            q.c(userId, "userId");
            Pair a2 = xnu.a();
            if (q.a((Object) (a2 != null ? (String) a2.getFirst() : null), (Object) userId)) {
                return false;
            }
            xnu.a(new Pair(userId, new xnt(userId)));
            return true;
        }

        @JvmStatic
        public final void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            TLog.loge("mtbMainLink", "logout,数据层销毁");
            xnu.a(null);
        }
    }
}
