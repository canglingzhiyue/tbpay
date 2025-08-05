package com.taobao.taolive.crossplatformfoundation.arch.core.service.playcontrol;

import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.o;
import tb.kge;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007J\u0016\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0007J\u0016\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007J\u001a\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0002J\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0006J\u000e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0006J\u000e\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/playcontrol/PlayControlService;", "", "<init>", "()V", "instanceMap", "", "", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/playcontrol/instance/PlayControlInstance;", "createInstance", "context", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/playcontrol/context/IPlayControlContext;", "removeInstance", "", "instance", "addListener", DataReceiveMonitor.CB_LISTENER, "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/playcontrol/listener/IPlayControlListener;", "removeListener", "removeAllListener", "logAction", "msg", "type", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/playcontrol/PlayControlService$PlayControlLogType;", "log4Info", "log4Error", "log4Warn", "log4Debug", "Companion", "PlayControlLogType", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlayControlService {
    public static final a Companion;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/playcontrol/PlayControlService$PlayControlLogType;", "", "<init>", "(Ljava/lang/String;I)V", "Info", "Warn", "Error", "Debug", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class PlayControlLogType extends Enum<PlayControlLogType> {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ PlayControlLogType[] $VALUES;
        public static final PlayControlLogType Info = new PlayControlLogType("Info", 0);
        public static final PlayControlLogType Warn = new PlayControlLogType("Warn", 1);
        public static final PlayControlLogType Error = new PlayControlLogType("Error", 2);
        public static final PlayControlLogType Debug = new PlayControlLogType("Debug", 3);

        private static final /* synthetic */ PlayControlLogType[] $values() {
            return new PlayControlLogType[]{Info, Warn, Error, Debug};
        }

        static {
            PlayControlLogType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private PlayControlLogType(String str, int i) {
        }

        public static kotlin.enums.a<PlayControlLogType> getEntries() {
            return $ENTRIES;
        }

        public static PlayControlLogType valueOf(String str) {
            return (PlayControlLogType) Enum.valueOf(PlayControlLogType.class, str);
        }

        public static PlayControlLogType[] values() {
            return (PlayControlLogType[]) $VALUES.clone();
        }
    }

    static {
        kge.a(-1832787744);
        Companion = new a(null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/playcontrol/PlayControlService$Companion;", "", "<init>", "()V", "serviceSingleton", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/playcontrol/PlayControlService;", "getService", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(-1214893016);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }
    }
}
