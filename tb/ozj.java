package tb;

import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class ozj extends LruCache<String, ozn> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2064430972);
    }

    public final int a(String str, ozn oznVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38d385d2", new Object[]{this, str, oznVar})).intValue();
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, tb.ozn] */
    @Override // android.util.LruCache
    public /* synthetic */ ozn create(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("863f8c73", new Object[]{this, str}) : a(str);
    }

    @Override // android.util.LruCache
    public /* synthetic */ void entryRemoved(boolean z, String str, ozn oznVar, ozn oznVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbb419b3", new Object[]{this, new Boolean(z), str, oznVar, oznVar2});
        } else {
            a(z, str, oznVar, oznVar2);
        }
    }

    @Override // android.util.LruCache
    public /* synthetic */ int sizeOf(String str, ozn oznVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("33c6036a", new Object[]{this, str, oznVar})).intValue() : a(str, oznVar);
    }

    public ozj(int i) {
        super(i);
    }

    public final ozn a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ozn) ipChange.ipc$dispatch("7c739a91", new Object[]{this, str}) : ozk.g().a(str);
    }

    public final void a(boolean z, String str, ozn oznVar, ozn oznVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5f56890", new Object[]{this, new Boolean(z), str, oznVar, oznVar2});
        } else {
            ozk.g().a(z, str, oznVar);
        }
    }
}
