package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\rJ\u001e\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00172\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u001c\u0010\u0018\u001a\u00020\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u001a2\u0006\u0010\u001b\u001a\u00020\rJ$\u0010\u001c\u001a\u00020\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u001a2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001eJ \u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J \u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J\u0016\u0010\"\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\rJ\u001e\u0010#\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010$\u001a\u00020\rJ\u0016\u0010%\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\rJ\u0016\u0010&\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\rJ\u0016\u0010'\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\rJ\u0018\u0010(\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\rJ\u0010\u0010*\u001a\u00020\u000f2\b\u0010)\u001a\u0004\u0018\u00010\rR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/OpenArchService;", "", "<init>", "()V", "multiInstanceService", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/multi_instance_manage/MultiInstanceService;", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/entity/OpenArchEntity;", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/definition/OpenArchContext;", "performStartPointTS", "", "createEntity", "context", "parentEntityIdentifier", "", "removeEntity", "", "entity", "inactiveEntity", "activeEntity", "releaseEntity", "fetchEntity", "multiInstanceIdentifier", "fetchDescriptionFromEntity", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/multi_instance_manage/MultiInstanceDescription;", "log4Debug", "msg", "", "category", "log4", "debugOnly", "", "log4EntityInfo", "from", "log4MemoryIssue", "log4IntentPerform", "log4MessageService", "subCategory", "log4MessageServiceSend", "log4MessageServiceSubscribe", "log4MessageServiceUnsubscribe", "log4PerformCheckPoint", "tag", "log4PerformStartPoint", "Companion", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class tqx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static tqx b;

    /* renamed from: a  reason: collision with root package name */
    private final tqw<Object, Object> f34293a = tqw.Companion.a();

    static {
        kge.a(1205481671);
        Companion = new a(null);
    }

    public final void a(String msg, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, msg, str});
        } else {
            q.d(msg, "msg");
        }
    }

    public static final /* synthetic */ tqx a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tqx) ipChange.ipc$dispatch("f0b16e3", new Object[0]) : b;
    }

    public static final /* synthetic */ void a(tqx tqxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7035d", new Object[]{tqxVar});
        } else {
            b = tqxVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/OpenArchService$Companion;", "", "<init>", "()V", "serviceSingleton", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/OpenArchService;", "getService", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-600502449);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }

        public final tqx a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tqx) ipChange.ipc$dispatch("f0b16e3", new Object[]{this});
            }
            tqx a2 = tqx.a();
            if (a2 != null) {
                return a2;
            }
            tqx tqxVar = new tqx();
            a aVar = tqx.Companion;
            tqx.a(tqxVar);
            return tqxVar;
        }
    }
}
