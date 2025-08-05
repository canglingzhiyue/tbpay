package android.taobao.windvane.extra.storage;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.alivfssdk.cache.b;
import com.taobao.alivfssdk.cache.h;
import tb.kge;

/* loaded from: classes2.dex */
public class WVStorageImpl implements IStorage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private h mAvfsCache;
    private String mNamespace;

    static {
        kge.a(783723333);
        kge.a(-1729238039);
    }

    public WVStorageImpl(String str) {
        b cacheForModule;
        this.mNamespace = str;
        AVFSCacheManager aVFSCacheManager = AVFSCacheManager.getInstance();
        if (aVFSCacheManager == null || (cacheForModule = aVFSCacheManager.cacheForModule(str)) == null) {
            return;
        }
        this.mAvfsCache = cacheForModule.b();
    }

    @Override // android.taobao.windvane.extra.storage.IStorage
    public boolean write(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b6c0efe", new Object[]{this, str, str2})).booleanValue();
        }
        h hVar = this.mAvfsCache;
        if (hVar == null) {
            return false;
        }
        return hVar.a(str, (Object) str2);
    }

    @Override // android.taobao.windvane.extra.storage.IStorage
    public String read(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a0eb7d9", new Object[]{this, str});
        }
        h hVar = this.mAvfsCache;
        if (hVar == null) {
            return null;
        }
        return (String) hVar.b(str);
    }

    @Override // android.taobao.windvane.extra.storage.IStorage
    public boolean remove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39af3819", new Object[]{this, str})).booleanValue();
        }
        h hVar = this.mAvfsCache;
        if (hVar == null) {
            return false;
        }
        return hVar.c(str);
    }
}
