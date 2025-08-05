package tb;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.alivfssdk.cache.c;
import com.taobao.alivfssdk.cache.h;

/* loaded from: classes8.dex */
public class ozz implements pmh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "taolive";

    static {
        kge.a(1717466476);
        kge.a(-22747910);
    }

    @Override // tb.pmh
    public Object a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("dd22ba48", new Object[]{this, context, str});
        }
        try {
            c cVar = new c();
            cVar.f8483a = Long.valueOf(psm.o());
            h a2 = AVFSCacheManager.getInstance().cacheForModule("taolive").a(context.getClassLoader()).a(cVar).a();
            if (a2 != null) {
                return a2.b(str);
            }
            return null;
        } catch (Exception e) {
            Log.e("TLiveCacheAdapter", "readData", e);
            return null;
        }
    }

    @Override // tb.pmh
    public boolean a(Context context, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("840caf8a", new Object[]{this, context, str, obj})).booleanValue();
        }
        try {
            c cVar = new c();
            cVar.f8483a = Long.valueOf(psm.o());
            return AVFSCacheManager.getInstance().cacheForModule("taolive").a(context.getClassLoader()).a(cVar).a().a(str, obj);
        } catch (Exception e) {
            Log.e("TLiveCacheAdapter", "writeData", e);
            return false;
        }
    }
}
