package anetwork.network.cache;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import java.security.MessageDigest;
import mtopsdk.common.util.RemoteConfig;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;

/* loaded from: classes.dex */
public class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    @Override // anetwork.network.cache.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public anetwork.network.cache.RpcCache a(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.String r0 = "mtopsdk.AVFSApiCache"
            com.android.alibaba.ip.runtime.IpChange r1 = anetwork.network.cache.a.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L1e
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r4] = r10
            r0[r3] = r11
            r11 = 2
            r0[r11] = r12
            java.lang.String r11 = "22059f00"
            java.lang.Object r11 = r1.ipc$dispatch(r11, r0)
            anetwork.network.cache.RpcCache r11 = (anetwork.network.cache.RpcCache) r11
            return r11
        L1e:
            long r1 = java.lang.System.currentTimeMillis()
            r5 = 0
            com.taobao.alivfssdk.cache.AVFSCacheManager r6 = com.taobao.alivfssdk.cache.AVFSCacheManager.getInstance()     // Catch: java.lang.Throwable -> L56
            java.lang.String r7 = r10.c(r12)     // Catch: java.lang.Throwable -> L56
            com.taobao.alivfssdk.cache.b r6 = r6.cacheForModule(r7)     // Catch: java.lang.Throwable -> L56
            if (r6 == 0) goto L54
            java.lang.String r7 = r10.d(r11)     // Catch: java.lang.Throwable -> L56
            boolean r8 = r10.a()     // Catch: java.lang.Throwable -> L52
            if (r8 == 0) goto L47
            com.taobao.alivfssdk.cache.h r6 = r6.b()     // Catch: java.lang.Throwable -> L52
            java.lang.Object r6 = r6.b(r7)     // Catch: java.lang.Throwable -> L52
            anetwork.network.cache.RpcCache r6 = (anetwork.network.cache.RpcCache) r6     // Catch: java.lang.Throwable -> L52
        L45:
            r5 = r6
            goto L74
        L47:
            com.taobao.alivfssdk.cache.h r6 = r6.a()     // Catch: java.lang.Throwable -> L52
            java.lang.Object r6 = r6.b(r7)     // Catch: java.lang.Throwable -> L52
            anetwork.network.cache.RpcCache r6 = (anetwork.network.cache.RpcCache) r6     // Catch: java.lang.Throwable -> L52
            goto L45
        L52:
            r6 = move-exception
            goto L58
        L54:
            r7 = r5
            goto L74
        L56:
            r6 = move-exception
            r7 = r5
        L58:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "[get] get cache failed!ModuleName="
            r8.append(r9)
            r8.append(r12)
            java.lang.String r9 = " cacheKey="
            r8.append(r9)
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            mtopsdk.common.util.TBSdkLog.e(r0, r8, r6)
        L74:
            mtopsdk.common.util.TBSdkLog$LogEnable r6 = mtopsdk.common.util.TBSdkLog.LogEnable.DebugEnable
            boolean r6 = mtopsdk.common.util.TBSdkLog.isLogEnable(r6)
            if (r6 == 0) goto Lbb
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r8 = 64
            r6.<init>(r8)
            java.lang.String r8 = "[get] get RpcCache result="
            r6.append(r8)
            if (r5 == 0) goto L8b
            goto L8c
        L8b:
            r3 = 0
        L8c:
            r6.append(r3)
            java.lang.String r3 = " ,time cost(ms):"
            r6.append(r3)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            r6.append(r3)
            java.lang.String r1 = ",cacheKey="
            r6.append(r1)
            r6.append(r11)
            java.lang.String r11 = ",md5key="
            r6.append(r11)
            r6.append(r7)
            java.lang.String r11 = ",cacheBlockName="
            r6.append(r11)
            r6.append(r12)
            java.lang.String r11 = r6.toString()
            mtopsdk.common.util.TBSdkLog.d(r0, r11)
        Lbb:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: anetwork.network.cache.a.a(java.lang.String, java.lang.String):anetwork.network.cache.RpcCache");
    }

    @Override // anetwork.network.cache.b
    public boolean a(String str, String str2, RpcCache rpcCache) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8879a5c", new Object[]{this, str, str2, rpcCache})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        String str3 = null;
        try {
            com.taobao.alivfssdk.cache.b cacheForModule = AVFSCacheManager.getInstance().cacheForModule(c(str2));
            if (cacheForModule != null) {
                str3 = d(str);
                if (a()) {
                    z = cacheForModule.b().a(str3, rpcCache);
                } else {
                    z = cacheForModule.a().a(str3, rpcCache);
                }
            }
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.AVFSApiCache", "[put] put RpcCache failed!ModuleName=" + str2 + " cacheKey=" + str, th);
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("[put]put RpcCache result=");
            sb.append(z);
            sb.append(" ,time cost(ms):");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append(",cacheKey=");
            sb.append(str);
            sb.append(",md5key=");
            sb.append(str3);
            sb.append(",cacheBlockName=");
            sb.append(str2);
            TBSdkLog.d("mtopsdk.AVFSApiCache", sb.toString());
        }
        return z;
    }

    @Override // anetwork.network.cache.b
    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        String str3 = null;
        try {
            com.taobao.alivfssdk.cache.b cacheForModule = AVFSCacheManager.getInstance().cacheForModule(c(str));
            if (cacheForModule != null) {
                str3 = d(str2);
                if (a()) {
                    z = cacheForModule.b().c(str3);
                } else {
                    z = cacheForModule.a().c(str3);
                }
            }
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.AVFSApiCache", "remove cache failed! ModuleName=" + str + " cacheKey=" + str2, th);
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("[remove]remove cache result=");
            sb.append(z);
            sb.append(" ,time cost(ms):");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append(",cacheKey=");
            sb.append(str2);
            sb.append(",md5key=");
            sb.append(str3);
            sb.append(",cacheBlockName=");
            sb.append(str);
            TBSdkLog.d("mtopsdk.AVFSApiCache", sb.toString());
        }
        return z;
    }

    @Override // anetwork.network.cache.b
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        try {
            AVFSCacheManager.getInstance().removeCacheForModule(c(str));
            return true;
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.AVFSApiCache", "uninstall cache failed! ModuleName=" + str, th);
            return false;
        }
    }

    @Override // anetwork.network.cache.b
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        try {
            com.taobao.alivfssdk.cache.b cacheForModule = AVFSCacheManager.getInstance().cacheForModule(c(str));
            if (cacheForModule != null) {
                if (a()) {
                    return cacheForModule.b().b();
                }
                return cacheForModule.a().b();
            }
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.AVFSApiCache", "remove all cache for module failed! ModuleName=" + str, th);
        }
        return false;
    }

    private String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return "mtop_apicache_";
        }
        return "mtop_apicache_" + str;
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : RemoteConfig.getInstance().degradeToSQLite;
    }

    private String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{this, str});
        }
        if (StringUtils.isBlank(str)) {
            return str;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes("utf-8"));
            byte[] digest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                stringBuffer.append(hexString);
            }
            return stringBuffer.toString();
        } catch (Exception e) {
            TBSdkLog.e("mtopsdk.AVFSApiCache", "[getMd5] compute md5 value failed for source str=" + str, e);
            return null;
        }
    }
}
