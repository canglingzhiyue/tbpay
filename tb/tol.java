package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.framework.domain.FilterResult;
import mtopsdk.framework.domain.a;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.MtopUnitStrategy;

/* loaded from: classes9.dex */
public class tol implements rxm, rxn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f34245a = new HashMap();

    /* renamed from: tb.tol$1  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f34246a = new int[EnvModeEnum.values().length];

        static {
            try {
                f34246a[EnvModeEnum.ONLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34246a[EnvModeEnum.PREPARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34246a[EnvModeEnum.TEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        kge.a(1300769112);
        kge.a(178679831);
        kge.a(-2079716300);
    }

    @Override // tb.rxo
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "mtopsdk.UnitCorrectionDuplexFilter";
    }

    public tol() {
        this.f34245a.put("GUIDE", "UNIT_GUIDE");
        this.f34245a.put("TRADE", "UNIT_TRADE");
        this.f34245a.put("CENTER", MtopUnitStrategy.UNIT_CENTER);
    }

    @Override // tb.rxn
    public String b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d3d918c", new Object[]{this, aVar});
        }
        if (!SwitchConfig.getInstance().isUnitCalibrationEnable() || StringUtils.isNotBlank(c(aVar))) {
            return FilterResult.CONTINUE;
        }
        String key = aVar.b.getKey();
        String a2 = tok.a().a(key);
        if (StringUtils.isNotBlank(a2)) {
            String str = aVar.h;
            TBSdkLog.e("mtopsdk.UnitCorrectionDuplexFilter", str, "change unit to " + a2 + ", api=" + key);
            aVar.o.mo1328setUnitStrategy(a2);
            aVar.g.unitCalibration = true;
        }
        return FilterResult.CONTINUE;
    }

    @Override // tb.rxm
    public String a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b93eb6d", new Object[]{this, aVar});
        }
        if (!SwitchConfig.getInstance().isUnitCalibrationEnable()) {
            return FilterResult.CONTINUE;
        }
        String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(aVar.c.getHeaderFields(), HttpHeaderConstant.X_UNIT);
        if (StringUtils.isNotBlank(singleHeaderFieldByKey)) {
            String str = this.f34245a.get(singleHeaderFieldByKey);
            if (!StringUtils.isEmpty(str)) {
                String key = aVar.b.getKey();
                String str2 = aVar.h;
                TBSdkLog.e("mtopsdk.UnitCorrectionDuplexFilter", str2, "[unit store]api=" + key + ", unit=" + str);
                tok.a().a(key, str);
            }
        }
        return FilterResult.CONTINUE;
    }

    private String c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee737ab", new Object[]{this, aVar});
        }
        MtopNetworkProp mtopNetworkProp = aVar.d;
        if (StringUtils.isNotBlank(mtopNetworkProp.customDomain)) {
            return mtopNetworkProp.customDomain;
        }
        int i = AnonymousClass1.f34246a[mtopNetworkProp.envMode.ordinal()];
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
}
