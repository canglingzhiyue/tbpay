package tb;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.opos.process.bridge.provider.BridgeExecuteException;

/* loaded from: classes4.dex */
public final class cwf extends dbk {
    static {
        kge.a(-905753802);
    }

    public cwf(Context context, Bundle bundle) {
        super(context, null, bundle);
        this.k = new String[]{"com.heytap.htms.MspCoreProvider"};
    }

    @Override // tb.dbk
    public String a() {
        return "com.heytap.msp.v2.ipcchannel.provider.MspCoreProvider";
    }

    public final IBinder b() {
        Object b = b(this.f26657a, "com.heytap.msp.v2.ipcchannel.provider.MspCoreModule", this.c, 0, new Object[0]);
        if (!IBinder.class.isPrimitive() || b != null) {
            if (b == null || (b instanceof IBinder)) {
                return (IBinder) b;
            }
            throw new BridgeExecuteException("return value is not match:" + b, 102004);
        }
        throw new BridgeExecuteException("Primitive not allow return null", 101009);
    }
}
