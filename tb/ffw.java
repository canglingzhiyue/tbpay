package tb;

import com.alibaba.ability.result.ErrorResult;
import com.taobao.android.abilityidl.ability.BroadcastAddListenerEventResult;
import com.taobao.android.abilityidl.ability.BroadcastEventResult;
import com.taobao.android.abilityidl.ability.bg;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.q;

/* loaded from: classes4.dex */
public interface ffw extends bg {

    /* renamed from: tb.ffw$-CC  reason: invalid class name */
    /* loaded from: classes9.dex */
    public final /* synthetic */ class CC {
        @JvmDefault
        public static void $default$a(ffw ffwVar, ErrorResult result) {
            q.d(result, "result");
            bg.a.a(ffwVar, result);
        }
    }

    @Override // tb.gml
    @JvmDefault
    void a(ErrorResult errorResult);

    @Override // com.taobao.android.abilityidl.ability.bg
    @JvmDefault
    void a(BroadcastAddListenerEventResult broadcastAddListenerEventResult);

    @Override // com.taobao.android.abilityidl.ability.bg
    @JvmDefault
    void onEvent(BroadcastEventResult broadcastEventResult);
}
