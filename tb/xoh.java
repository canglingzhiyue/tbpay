package tb;

import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/taobao/mytaobao/pagev2/basement/dataservice/BasementDataServiceFacade;", "", "()V", "Companion", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xoh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static Pair<String, ? extends xok> f34428a;

    static {
        kge.a(1851399732);
        Companion = new a(null);
    }

    @JvmStatic
    public static final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            Companion.a(str);
        }
    }

    @JvmStatic
    public static final xok b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xok) ipChange.ipc$dispatch("16be84a9", new Object[0]) : Companion.a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007J\b\u0010\u000b\u001a\u00020\tH\u0007R\u001c\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/taobao/mytaobao/pagev2/basement/dataservice/BasementDataServiceFacade$Companion;", "", "()V", "dataService", "Lkotlin/Pair;", "", "Lcom/taobao/mytaobao/pagev2/basement/dataservice/IBasementDataService;", "currentDataService", "login", "", "userId", Baggage.Amnet.USER_O, "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1322309756);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        @JvmStatic
        public final xok a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xok) ipChange.ipc$dispatch("f0cdf4a", new Object[]{this});
            }
            Pair a2 = xoh.a();
            if (a2 == null) {
                return null;
            }
            return (xok) a2.getSecond();
        }

        @JvmStatic
        public final void a(String userId) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, userId});
                return;
            }
            q.c(userId, "userId");
            Pair a2 = xoh.a();
            if (q.a((Object) (a2 != null ? (String) a2.getFirst() : null), (Object) userId)) {
                return;
            }
            xoh.a(new Pair(userId, new xog(userId)));
        }

        @JvmStatic
        public final void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                xoh.a((Pair) null);
            }
        }
    }

    public static final /* synthetic */ Pair a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("cde83151", new Object[0]) : f34428a;
    }

    public static final /* synthetic */ void a(Pair pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("328b7e91", new Object[]{pair});
        } else {
            f34428a = pair;
        }
    }
}
