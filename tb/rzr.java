package tb;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.EnvModeEnum;

/* loaded from: classes.dex */
public abstract class rzr implements rzx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: tb.rzr$1  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f33438a = new int[EnvModeEnum.values().length];

        static {
            try {
                f33438a[EnvModeEnum.ONLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33438a[EnvModeEnum.PREPARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33438a[EnvModeEnum.TEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33438a[EnvModeEnum.TEST_SANDBOX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public abstract Map<String, String> a();

    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb A[Catch: Throwable -> 0x010d, TryCatch #0 {Throwable -> 0x010d, blocks: (B:7:0x0026, B:9:0x004f, B:17:0x0062, B:18:0x0066, B:19:0x006a, B:20:0x006d, B:23:0x007b, B:24:0x0083, B:26:0x0089, B:28:0x009b, B:30:0x00a4, B:32:0x00ac, B:34:0x00c7, B:40:0x00fb, B:42:0x0102, B:41:0x00fe, B:35:0x00ce, B:37:0x00db), top: B:47:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe A[Catch: Throwable -> 0x010d, TryCatch #0 {Throwable -> 0x010d, blocks: (B:7:0x0026, B:9:0x004f, B:17:0x0062, B:18:0x0066, B:19:0x006a, B:20:0x006d, B:23:0x007b, B:24:0x0083, B:26:0x0089, B:28:0x009b, B:30:0x00a4, B:32:0x00ac, B:34:0x00c7, B:40:0x00fb, B:42:0x0102, B:41:0x00fe, B:35:0x00ce, B:37:0x00db), top: B:47:0x0026 }] */
    @Override // tb.rzx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public mtopsdk.network.domain.Request a(mtopsdk.ssrcore.c r12) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rzr.a(mtopsdk.ssrcore.c):mtopsdk.network.domain.Request");
    }

    public Map<String, String> a(Map<String, String> map, Map<String, String> map2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9ba18d41", new Object[]{this, map, map2, new Boolean(z)});
        }
        Map<String, String> a2 = a();
        if (a2 == null) {
            TBSdkLog.e("ssr.AbstractSsrNetworkConverter", "[buildRequestHeaders]headerConversionMap is null,buildRequestHeaders error.");
            return map2;
        }
        HashMap hashMap = new HashMap(64);
        if (map2 != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (z) {
                    if (value != null) {
                        try {
                            value = URLEncoder.encode(value, "utf-8");
                        } catch (Exception unused) {
                            TBSdkLog.e("ssr.AbstractSsrNetworkConverter", "[buildRequestHeaders]urlEncode " + key + "=" + value + "error");
                        }
                    } else {
                        value = null;
                    }
                }
                if ("user-agent".equalsIgnoreCase(key)) {
                    key = "user-agent";
                }
                hashMap.put(key, value);
            }
        }
        for (Map.Entry<String, String> entry2 : a2.entrySet()) {
            String key2 = entry2.getKey();
            String remove = map.remove(entry2.getValue());
            if (remove != null) {
                try {
                    hashMap.put(key2, URLEncoder.encode(remove, "utf-8"));
                } catch (Exception unused2) {
                    TBSdkLog.e("ssr.AbstractSsrNetworkConverter", "[buildRequestHeaders]urlEncode " + key2 + "=" + remove + "error");
                }
            }
        }
        String remove2 = map.remove(DispatchConstants.LONGTITUDE);
        String remove3 = map.remove(DispatchConstants.LATITUDE);
        if (remove2 != null && remove3 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(remove2);
            sb.append(",");
            sb.append(remove3);
            try {
                hashMap.put(HttpHeaderConstant.X_LOCATION, URLEncoder.encode(sb.toString(), "utf-8"));
            } catch (Exception unused3) {
                TBSdkLog.e("ssr.AbstractSsrNetworkConverter", "[buildRequestHeaders]urlEncode x-location=" + sb.toString() + "error");
            }
        }
        return hashMap;
    }
}
