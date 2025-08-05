package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u001c*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004:\u0001\u001cB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\u0006\u0010\f\u001a\u00028\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010\u000eJ5\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\u0006\u0010\f\u001a\u00028\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00018\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u001e\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\tJ\"\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\u0006\u0010\u0010\u001a\u00020\u0011JA\u0010\u0018\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00018\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nJ\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\nR&\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/multi_instance_manage/MultiInstanceService;", "T", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/multi_instance_manage/IOpenArchInstanceManaged;", "TC", "", "<init>", "()V", "instanceMap", "", "", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/multi_instance_manage/MultiInstanceDescription;", "loadInstance", "instance", "instanceContext", "(Lcom/taobao/taolive/crossplatformfoundation/arch/core/multi_instance_manage/IOpenArchInstanceManaged;Lcom/taobao/taolive/crossplatformfoundation/arch/core/multi_instance_manage/IOpenArchInstanceManaged;)Lcom/taobao/taolive/crossplatformfoundation/arch/core/multi_instance_manage/MultiInstanceDescription;", "loadActiveInstance", "isActive", "", "(Lcom/taobao/taolive/crossplatformfoundation/arch/core/multi_instance_manage/IOpenArchInstanceManaged;Lcom/taobao/taolive/crossplatformfoundation/arch/core/multi_instance_manage/IOpenArchInstanceManaged;Z)Lcom/taobao/taolive/crossplatformfoundation/arch/core/multi_instance_manage/MultiInstanceDescription;", "fetchMultiInstanceDescriptionFromIdentifier", "identifier", "updateDescriptionActiveState", "", "description", "updateDescription", "(Lcom/taobao/taolive/crossplatformfoundation/arch/core/multi_instance_manage/MultiInstanceDescription;Lcom/taobao/taolive/crossplatformfoundation/arch/core/multi_instance_manage/IOpenArchInstanceManaged;Lcom/taobao/taolive/crossplatformfoundation/arch/core/multi_instance_manage/IOpenArchInstanceManaged;Z)V", "removeDescription", "fetchActiveInstance", "Companion", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class tqw<T, TC> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static tqw<?, ?> b;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object<T, TC>> f34292a;

    static {
        kge.a(209499169);
        Companion = new a(null);
    }

    public /* synthetic */ tqw(o oVar) {
        this();
    }

    private tqw() {
        this.f34292a = new LinkedHashMap();
    }

    public static final /* synthetic */ tqw a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tqw) ipChange.ipc$dispatch("f0b16c4", new Object[0]) : b;
    }

    public static final /* synthetic */ void a(tqw tqwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f68efe", new Object[]{tqwVar});
        } else {
            b = tqwVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u0005\"\b\b\u0002\u0010\u0007*\u00020\t\"\b\b\u0003\u0010\b*\u00020\tR\u0018\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/multi_instance_manage/MultiInstanceService$Companion;", "", "<init>", "()V", "serviceSingleton", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/multi_instance_manage/MultiInstanceService;", "getService", "T", "TC", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/multi_instance_manage/IOpenArchInstanceManaged;", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(506898985);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }

        public final <T, TC> tqw<T, TC> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tqw) ipChange.ipc$dispatch("f0b16c4", new Object[]{this});
            }
            if (tqw.a() == null) {
                tqw.a(new tqw(null));
            }
            tqw<T, TC> a2 = tqw.a();
            q.e(a2, "null cannot be cast to non-null type com.taobao.taolive.crossplatformfoundation.arch.core.multi_instance_manage.MultiInstanceService<T of com.taobao.taolive.crossplatformfoundation.arch.core.multi_instance_manage.MultiInstanceService.Companion.getService, TC of com.taobao.taolive.crossplatformfoundation.arch.core.multi_instance_manage.MultiInstanceService.Companion.getService>");
            return a2;
        }
    }
}
