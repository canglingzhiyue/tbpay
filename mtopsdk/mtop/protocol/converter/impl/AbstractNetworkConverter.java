package mtopsdk.mtop.protocol.converter.impl;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.framework.domain.a;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.protocol.converter.INetworkConverter;
import tb.kge;

/* loaded from: classes.dex */
public abstract class AbstractNetworkConverter implements INetworkConverter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_CONN_TIMEOUT = 10000;
    private static final int DEFAULT_SOCKET_TIMEOUT = 15000;
    private static final String TAG = "mtopsdk.AbstractNetworkConverter";

    /* renamed from: mtopsdk.mtop.protocol.converter.impl.AbstractNetworkConverter$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum = new int[EnvModeEnum.values().length];

        static {
            try {
                $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[EnvModeEnum.ONLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[EnvModeEnum.PREPARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[EnvModeEnum.TEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[EnvModeEnum.TEST_SANDBOX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        kge.a(1295380583);
        kge.a(837353311);
    }

    public abstract Map<String, String> getHeaderConversionMap();

    /* JADX WARN: Removed duplicated region for block: B:126:0x02ec A[Catch: Throwable -> 0x03e1, TryCatch #1 {Throwable -> 0x03e1, blocks: (B:136:0x030c, B:137:0x0326, B:139:0x0330, B:141:0x033f, B:143:0x0345, B:145:0x0355, B:150:0x036f, B:152:0x0375, B:154:0x037b, B:148:0x0363, B:155:0x0391, B:157:0x0399, B:162:0x03b6, B:164:0x03bc, B:166:0x03c2, B:160:0x03a8, B:167:0x03d8, B:126:0x02ec, B:128:0x02f2, B:130:0x02f6, B:132:0x0302, B:134:0x0306, B:122:0x02dd), top: B:180:0x02dd }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x030c A[Catch: Throwable -> 0x03e1, TryCatch #1 {Throwable -> 0x03e1, blocks: (B:136:0x030c, B:137:0x0326, B:139:0x0330, B:141:0x033f, B:143:0x0345, B:145:0x0355, B:150:0x036f, B:152:0x0375, B:154:0x037b, B:148:0x0363, B:155:0x0391, B:157:0x0399, B:162:0x03b6, B:164:0x03bc, B:166:0x03c2, B:160:0x03a8, B:167:0x03d8, B:126:0x02ec, B:128:0x02f2, B:130:0x02f6, B:132:0x0302, B:134:0x0306, B:122:0x02dd), top: B:180:0x02dd }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0330 A[Catch: Throwable -> 0x03e1, TryCatch #1 {Throwable -> 0x03e1, blocks: (B:136:0x030c, B:137:0x0326, B:139:0x0330, B:141:0x033f, B:143:0x0345, B:145:0x0355, B:150:0x036f, B:152:0x0375, B:154:0x037b, B:148:0x0363, B:155:0x0391, B:157:0x0399, B:162:0x03b6, B:164:0x03bc, B:166:0x03c2, B:160:0x03a8, B:167:0x03d8, B:126:0x02ec, B:128:0x02f2, B:130:0x02f6, B:132:0x0302, B:134:0x0306, B:122:0x02dd), top: B:180:0x02dd }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0355 A[Catch: Throwable -> 0x03e1, TryCatch #1 {Throwable -> 0x03e1, blocks: (B:136:0x030c, B:137:0x0326, B:139:0x0330, B:141:0x033f, B:143:0x0345, B:145:0x0355, B:150:0x036f, B:152:0x0375, B:154:0x037b, B:148:0x0363, B:155:0x0391, B:157:0x0399, B:162:0x03b6, B:164:0x03bc, B:166:0x03c2, B:160:0x03a8, B:167:0x03d8, B:126:0x02ec, B:128:0x02f2, B:130:0x02f6, B:132:0x0302, B:134:0x0306, B:122:0x02dd), top: B:180:0x02dd }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0399 A[Catch: Throwable -> 0x03e1, TryCatch #1 {Throwable -> 0x03e1, blocks: (B:136:0x030c, B:137:0x0326, B:139:0x0330, B:141:0x033f, B:143:0x0345, B:145:0x0355, B:150:0x036f, B:152:0x0375, B:154:0x037b, B:148:0x0363, B:155:0x0391, B:157:0x0399, B:162:0x03b6, B:164:0x03bc, B:166:0x03c2, B:160:0x03a8, B:167:0x03d8, B:126:0x02ec, B:128:0x02f2, B:130:0x02f6, B:132:0x0302, B:134:0x0306, B:122:0x02dd), top: B:180:0x02dd }] */
    @Override // mtopsdk.mtop.protocol.converter.INetworkConverter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public mtopsdk.network.domain.Request convert(mtopsdk.framework.domain.a r27) {
        /*
            Method dump skipped, instructions count: 1009
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mtopsdk.mtop.protocol.converter.impl.AbstractNetworkConverter.convert(mtopsdk.framework.domain.a):mtopsdk.network.domain.Request");
    }

    public Map<String, String> buildRequestHeaders(Map<String, String> map, Map<String, String> map2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fe213a1d", new Object[]{this, map, map2, new Boolean(z)});
        }
        Map<String, String> headerConversionMap = getHeaderConversionMap();
        if (headerConversionMap == null) {
            TBSdkLog.e(TAG, "[buildRequestHeaders]headerConversionMap is null,buildRequestHeaders error.");
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
                            TBSdkLog.e(TAG, "[buildRequestHeaders]urlEncode " + key + "=" + value + "error");
                        }
                    } else {
                        value = null;
                    }
                }
                hashMap.put(key, value);
            }
        }
        for (Map.Entry<String, String> entry2 : headerConversionMap.entrySet()) {
            String key2 = entry2.getKey();
            String remove = map.remove(entry2.getValue());
            if (remove != null) {
                try {
                    hashMap.put(key2, URLEncoder.encode(remove, "utf-8"));
                } catch (Exception unused2) {
                    TBSdkLog.e(TAG, "[buildRequestHeaders]urlEncode " + key2 + "=" + remove + "error");
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
                TBSdkLog.e(TAG, "[buildRequestHeaders]urlEncode x-location=" + sb.toString() + "error");
            }
        }
        return hashMap;
    }

    public String buildBaseUrl(a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d4f78a", new Object[]{this, aVar, str, str2});
        }
        StringBuilder sb = new StringBuilder(64);
        try {
            MtopConfig mtopConfig = aVar.f25000a.getMtopConfig();
            MtopNetworkProp mtopNetworkProp = aVar.d;
            mtopNetworkProp.envMode = mtopConfig.envMode;
            sb.append(mtopNetworkProp.protocol.getProtocol());
            String customDomain = getCustomDomain(aVar);
            if (StringUtils.isNotBlank(customDomain)) {
                sb.append(customDomain);
            } else {
                sb.append(mtopConfig.mtopDomain.getDomain(aVar.d.envMode));
            }
            sb.append("/");
            sb.append(mtopConfig.entrance.getEntrance());
            sb.append("/");
            sb.append(str);
            sb.append("/");
            sb.append(str2);
            sb.append("/");
        } catch (Exception e) {
            TBSdkLog.e(TAG, aVar.h, "[buildBaseUrl] build mtop baseUrl error.", e);
        }
        return sb.toString();
    }

    private String getCustomDomain(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8851703", new Object[]{this, aVar});
        }
        MtopNetworkProp mtopNetworkProp = aVar.d;
        if (StringUtils.isNotBlank(mtopNetworkProp.customDomain)) {
            return mtopNetworkProp.customDomain;
        }
        int i = AnonymousClass1.$SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[mtopNetworkProp.envMode.ordinal()];
        if (i == 1) {
            if (!StringUtils.isNotBlank(mtopNetworkProp.customOnlineDomain)) {
                return null;
            }
            return mtopNetworkProp.customOnlineDomain;
        } else if (i == 2) {
            if (!StringUtils.isNotBlank(mtopNetworkProp.customPreDomain)) {
                return null;
            }
            return mtopNetworkProp.customPreDomain;
        } else if (i != 3 || !StringUtils.isNotBlank(mtopNetworkProp.customDailyDomain)) {
            return null;
        } else {
            return mtopNetworkProp.customDailyDomain;
        }
    }

    public void addMtopSdkProperty(Mtop mtop, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ff793f", new Object[]{this, mtop, map});
        } else if (SwitchConfig.getInstance().isMtopsdkPropertySwitchOpen()) {
            for (Map.Entry<String, String> entry : mtop.getMtopConfig().getMtopProperties().entrySet()) {
                try {
                    String key = entry.getKey();
                    if (StringUtils.isNotBlank(key) && key.startsWith(HttpHeaderConstant.MTOPSDK_PROPERTY_PREFIX)) {
                        map.put(key.substring(8), entry.getValue());
                    }
                } catch (Exception unused) {
                    TBSdkLog.e(TAG, "[addMtopSdkProperty]get mtopsdk properties error,key=" + entry.getKey() + ",value=" + entry.getValue());
                }
            }
        }
    }
}
