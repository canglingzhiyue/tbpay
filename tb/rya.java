package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alicom.model.network.PreholdingPhoneNumberData;
import java.net.URLDecoder;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.framework.domain.FilterResult;
import mtopsdk.framework.domain.a;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopUnitStrategy;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import mtopsdk.mtop.util.MtopStatistics;
import mtopsdk.mtop.xcommand.XcmdEventMgr;

/* loaded from: classes.dex */
public class rya implements rxm, rxn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: tb.rya$2  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f33414a = new int[EnvModeEnum.values().length];

        static {
            try {
                f33414a[EnvModeEnum.ONLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33414a[EnvModeEnum.PREPARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33414a[EnvModeEnum.TEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33414a[EnvModeEnum.TEST_SANDBOX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        kge.a(-1394610091);
        kge.a(178679831);
        kge.a(-2079716300);
    }

    @Override // tb.rxo
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "mtopsdk.AppConfigDuplexFilter";
    }

    @Override // tb.rxm
    public String a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b93eb6d", new Object[]{this, aVar});
        }
        Map<String, List<String>> headerFields = aVar.c.getHeaderFields();
        MtopConfig mtopConfig = aVar.f25000a.getMtopConfig();
        String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(headerFields, HttpHeaderConstant.X_COMMAND_ORANGE);
        if (StringUtils.isNotBlank(singleHeaderFieldByKey) && StringUtils.isNotBlank(singleHeaderFieldByKey)) {
            try {
                XcmdEventMgr.getInstance().onOrangeEvent(URLDecoder.decode(singleHeaderFieldByKey, "utf-8"));
            } catch (Exception e) {
                String str = aVar.h;
                TBSdkLog.w("mtopsdk.AppConfigDuplexFilter", str, "parse XCommand header field x-orange-p error,xcmdOrange=" + singleHeaderFieldByKey, e);
            }
        }
        String singleHeaderFieldByKey2 = HeaderHandlerUtil.getSingleHeaderFieldByKey(headerFields, HttpHeaderConstant.X_APP_CONF_V);
        if (StringUtils.isBlank(singleHeaderFieldByKey2)) {
            return FilterResult.CONTINUE;
        }
        long j = 0;
        try {
            j = Long.parseLong(singleHeaderFieldByKey2);
        } catch (NumberFormatException e2) {
            String str2 = aVar.h;
            TBSdkLog.e("mtopsdk.AppConfigDuplexFilter", str2, "parse remoteAppConfigVersion error.appConfigVersion=" + singleHeaderFieldByKey2, e2);
        }
        if (j > mtopConfig.xAppConfigVersion) {
            a(j, aVar);
        }
        return FilterResult.CONTINUE;
    }

    private void a(final long j, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53c4f687", new Object[]{this, new Long(j), aVar});
            return;
        }
        final MtopConfig mtopConfig = aVar.f25000a.getMtopConfig();
        MtopSDKThreadPoolExecutorFactory.submit(new Runnable() { // from class: tb.rya.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Removed duplicated region for block: B:47:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 274
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: tb.rya.AnonymousClass1.run():void");
            }
        });
    }

    @Override // tb.rxn
    public String b(a aVar) {
        EnvModeEnum envModeEnum;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d3d918c", new Object[]{this, aVar});
        }
        Mtop mtop = aVar.f25000a;
        MtopStatistics mtopStatistics = aVar.g;
        MtopNetworkProp mtopNetworkProp = aVar.d;
        try {
            if (StringUtils.isNotBlank(mtopStatistics.falcoId) && SwitchConfig.getInstance().getEnableFullTraceId()) {
                String str = mtopStatistics.falcoId;
                mtopNetworkProp.clientTraceId = str;
                mtopStatistics.clientTraceId = str;
            } else {
                StringBuilder sb = new StringBuilder(64);
                sb.append(mtop.getMtopConfig().utdid);
                sb.append(System.currentTimeMillis());
                sb.append(new DecimalFormat(PreholdingPhoneNumberData.PRE_SUCCESS).format(mtopStatistics.intSeqNo % 10000));
                sb.append("1");
                sb.append(mtop.getMtopConfig().processId);
                mtopNetworkProp.clientTraceId = sb.toString();
                mtopStatistics.clientTraceId = mtopNetworkProp.clientTraceId;
            }
        } catch (Exception e) {
            TBSdkLog.e("mtopsdk.AppConfigDuplexFilter", aVar.h, "generate client-trace-id failed.", e);
        }
        mtopNetworkProp.falcoId = mtopStatistics.falcoId;
        try {
            if (rxf.a().b(aVar.b.getKey()) && (envModeEnum = mtop.getMtopConfig().envMode) != null) {
                int i = AnonymousClass2.f33414a[envModeEnum.ordinal()];
                if (i == 1) {
                    mtopNetworkProp.customOnlineDomain = MtopUnitStrategy.TRADE_ONLINE_DOMAIN;
                } else if (i == 2) {
                    mtopNetworkProp.customPreDomain = MtopUnitStrategy.TRADE_PRE_DOMAIN;
                } else if (i == 3 || i == 4) {
                    mtopNetworkProp.customDailyDomain = MtopUnitStrategy.TRADE_DAILY_DOMAIN;
                }
            }
            return FilterResult.CONTINUE;
        } catch (Exception e2) {
            TBSdkLog.e("mtopsdk.AppConfigDuplexFilter", aVar.h, "setCustomDomain for trade unit api error", e2);
            return FilterResult.CONTINUE;
        }
    }
}
