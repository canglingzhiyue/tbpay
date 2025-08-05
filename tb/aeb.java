package tb;

import android.taobao.windvane.thread.WVThreadPool;
import android.taobao.windvane.util.m;
import android.taobao.windvane.util.p;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.model.ZCacheResourceResponse;
import com.taobao.zcache.o;

/* loaded from: classes2.dex */
public class aeb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "PackageApp-Runtime";

    /* loaded from: classes2.dex */
    public interface a {
        void callback(aef aefVar);
    }

    static {
        kge.a(-837916914);
    }

    public static void getZCacheResourceResponse(final String str, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73388e93", new Object[]{str, aVar});
        } else {
            WVThreadPool.getInstance().execute(new Runnable() { // from class: tb.aeb.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        aVar.callback(aeb.getZCacheResourceResponse(str));
                    }
                }
            });
        }
    }

    public static aef getZCacheResourceResponse(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aef) ipChange.ipc$dispatch("f470acc6", new Object[]{str});
        }
        String d = p.d(str);
        o.a().b();
        ZCacheResourceResponse a2 = com.taobao.zcache.p.a().a(d);
        aef aefVar = new aef();
        if (a2 != null) {
            m.c("ZCache", "weex use ZCache 3.0, url=[" + d + "], with response:[" + a2.isSuccess + riy.ARRAY_END_STR);
            aefVar.encoding = a2.encoding;
            aefVar.headers = a2.headers;
            aefVar.inputStream = a2.inputStream;
            aefVar.isSuccess = a2.isSuccess;
            aefVar.mimeType = a2.mimeType;
        } else {
            m.c("ZCache", "weex use ZCache 3.0, url=[" + d + "], with response=[null]");
        }
        return aefVar;
    }

    public static boolean isLocalVisit(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d277547f", new Object[]{str})).booleanValue() : com.taobao.zcache.p.a().b(str);
    }
}
