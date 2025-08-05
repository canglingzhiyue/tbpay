package anet.channel.util;

import android.content.Context;
import anet.channel.GlobalAppRuntimeInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes.dex */
public class SerializeHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.SerializeHelper";
    private static File cacheDir;

    static {
        kge.a(-963041376);
        cacheDir = null;
    }

    public static File getCacheFiles(String str) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("1ea9b631", new Object[]{str});
        }
        if (cacheDir == null && (context = GlobalAppRuntimeInfo.getContext()) != null) {
            cacheDir = context.getCacheDir();
        }
        return new File(cacheDir, str);
    }

    public static synchronized void persist(Serializable serializable, File file) {
        synchronized (SerializeHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("972a3166", new Object[]{serializable, file});
            } else {
                persist(serializable, file, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0099 A[Catch: all -> 0x0131, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x0013, B:13:0x0029, B:17:0x005f, B:33:0x0092, B:35:0x0099, B:39:0x00aa, B:41:0x00b0, B:43:0x00b6, B:49:0x00f9, B:53:0x00ff, B:58:0x010e, B:61:0x0113, B:44:0x00e8, B:31:0x008e, B:66:0x0121, B:67:0x0124, B:68:0x0125), top: B:77:0x0009, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0 A[Catch: all -> 0x0131, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x0013, B:13:0x0029, B:17:0x005f, B:33:0x0092, B:35:0x0099, B:39:0x00aa, B:41:0x00b0, B:43:0x00b6, B:49:0x00f9, B:53:0x00ff, B:58:0x010e, B:61:0x0113, B:44:0x00e8, B:31:0x008e, B:66:0x0121, B:67:0x0124, B:68:0x0125), top: B:77:0x0009, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0121 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void persist(java.io.Serializable r18, java.io.File r19, anet.channel.statist.StrategyStatObject r20) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.util.SerializeHelper.persist(java.io.Serializable, java.io.File, anet.channel.statist.StrategyStatObject):void");
    }

    public static synchronized <T> T restore(File file) {
        synchronized (SerializeHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("4f627e6", new Object[]{file});
            }
            return (T) restore(file, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ca, code lost:
        if (r10 != null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized <T> T restore(java.io.File r17, anet.channel.statist.StrategyStatObject r18) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.util.SerializeHelper.restore(java.io.File, anet.channel.statist.StrategyStatObject):java.lang.Object");
    }
}
