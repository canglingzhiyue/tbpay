package tb;

import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.arc;

@AURAExtensionImpl(code = "tbbuy.impl.aspect.error.adjust")
/* loaded from: classes6.dex */
public final class ide extends idc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1357410324);
    }

    public static /* synthetic */ Object ipc$super(ide ideVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e5  */
    @Override // tb.aro
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.alibaba.android.aura.b r14) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ide.a(com.alibaba.android.aura.b):void");
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        AURAGlobalData c = c();
        tcy tcyVar = (tcy) c.get("aliBuyGlobalDataStreamResponseProcessor", tcy.class);
        if (tcyVar == null) {
            arc.a().b("streamExceptionProcessor is null !!", arc.a.a().b("TBBuyAdjustOrderErrorExtension").b());
            return false;
        }
        return tcyVar.a(b().b(), c);
    }
}
