package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.i;
import kotlin.io.f;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import kotlin.t;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/taobao/android/ultron/utils/UltronLocalSwitcher;", "", "()V", "enable", "", "switchKey", "", "getString", "ali-ultron-sdk_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes6.dex */
public final class mrd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final mrd INSTANCE;

    static {
        kge.a(1189482962);
        INSTANCE = new mrd();
    }

    private mrd() {
    }

    @JvmStatic
    public static final boolean a(String switchKey) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{switchKey})).booleanValue();
        }
        q.d(switchKey, "switchKey");
        try {
            Result.a aVar = Result.Companion;
            return new File("/data/local/tmp/", '.' + switchKey).exists();
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(i.a(th));
            return false;
        }
    }

    @JvmStatic
    public static final String b(String switchKey) {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{switchKey});
        }
        q.d(switchKey, "switchKey");
        try {
            Result.a aVar = Result.Companion;
            file = new File("/data/local/tmp/", '.' + switchKey);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(i.a(th));
        }
        if (!file.exists()) {
            Result.m2371constructorimpl(t.INSTANCE);
            return null;
        }
        return f.a(file, null, 1, null);
    }
}
