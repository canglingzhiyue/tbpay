package tb;

import com.alibaba.ability.result.ErrorResult;
import com.taobao.android.abilityidl.ability.BroadcastAddListenerEventResult;
import com.taobao.android.abilityidl.ability.BroadcastEventResult;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.q;
import tb.ffw;

/* loaded from: classes4.dex */
public final class fgn implements ffw {
    static {
        kge.a(1396811909);
        kge.a(-1495763774);
    }

    @Override // tb.ffw, tb.gml
    @JvmDefault
    public /* synthetic */ void a(ErrorResult errorResult) {
        ffw.CC.$default$a(this, errorResult);
    }

    @Override // tb.ffw, com.taobao.android.abilityidl.ability.bg
    @JvmDefault
    public /* synthetic */ void a(BroadcastAddListenerEventResult broadcastAddListenerEventResult) {
        q.d(broadcastAddListenerEventResult, "result");
    }

    @Override // tb.ffw, com.taobao.android.abilityidl.ability.bg
    @JvmDefault
    public /* synthetic */ void onEvent(BroadcastEventResult broadcastEventResult) {
        q.d(broadcastEventResult, "result");
    }
}
