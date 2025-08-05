package android.taobao.windvane.extra.storage;

import android.taobao.windvane.config.j;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class StorageFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-819506458);
    }

    private StorageFactory() {
    }

    public static IStorage createStorageInstance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IStorage) ipChange.ipc$dispatch("cd8da0f7", new Object[]{str});
        }
        if (j.commonConfig.cP) {
            return new ProtoDBStorageImpl(str);
        }
        return new WVStorageImpl(str);
    }
}
