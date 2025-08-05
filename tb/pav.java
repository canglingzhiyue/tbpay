package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/taobao/taolive/adapterimpl/utils/AdapterSwitchConfigUtil;", "", "()V", "TBLIVE_ORANGE_GROUP", "", "mEnablePackCache", "", "isEnablePack", "", "parseBoolean", "str", "taoliveroom_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes8.dex */
public final class pav {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final pav INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static int f32542a;

    static {
        kge.a(-1362058379);
        INSTANCE = new pav();
        f32542a = -1;
    }

    private pav() {
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (f32542a == -1) {
            f32542a = a(new pab().a("tblive", "enableAdapterPack20240919", "false")) ? 1 : 0;
        }
        return f32542a == 1;
    }

    private final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (Exception unused) {
            return false;
        }
    }
}
