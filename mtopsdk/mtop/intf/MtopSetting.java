package mtopsdk.mtop.intf;

import anetwork.network.cache.b;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.common.log.LogAdapter;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.SwitchConfigUtil;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.antiattack.AntiAttackHandler;
import mtopsdk.mtop.common.MtopRequestStListener;
import mtopsdk.mtop.common.MtopStatsListener;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.features.MtopFeatureManager;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.stat.IUploadStats;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import tb.kge;
import tb.rxe;
import tb.ryn;
import tb.ryv;

/* loaded from: classes.dex */
public final class MtopSetting {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.MtopSetting";
    public static final Map<String, MtopConfig> mtopConfigMap;
    public static volatile IWVRequestInterceptor sWVRequestInterceptor;

    @Deprecated
    public static void setSecurityAppKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("289de771", new Object[]{str});
        }
    }

    static {
        kge.a(808132634);
        mtopConfigMap = new HashMap();
    }

    private MtopSetting() {
    }

    public static MtopConfig getMtopConfigByID(String str) {
        MtopConfig mtopConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopConfig) ipChange.ipc$dispatch("660e70b6", new Object[]{str});
        }
        if (!StringUtils.isNotBlank(str)) {
            str = Mtop.Id.INNER;
        }
        Mtop mtop = Mtop.instanceMap.get(str);
        if (mtop == null) {
            synchronized (Mtop.class) {
                mtop = Mtop.instanceMap.get(str);
                if (mtop == null) {
                    MtopConfig mtopConfig2 = mtopConfigMap.get(str);
                    if (mtopConfig2 == null) {
                        synchronized (MtopSetting.class) {
                            mtopConfig = mtopConfigMap.get(str);
                            if (mtopConfig == null) {
                                mtopConfig = new MtopConfig(str);
                                mtopConfigMap.put(str, mtopConfig);
                            }
                        }
                        mtopConfig2 = mtopConfig;
                    }
                    return mtopConfig2;
                }
            }
        }
        return mtop.getMtopConfig();
    }

    public static void setAppKeyIndex(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a8ae9e3", new Object[]{str, new Integer(i), new Integer(i2)});
            return;
        }
        MtopConfig mtopConfigByID = getMtopConfigByID(str);
        mtopConfigByID.onlineAppKeyIndex = i;
        mtopConfigByID.dailyAppkeyIndex = i2;
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i(TAG, mtopConfigByID.instanceId + " [setAppKeyIndex] onlineAppKeyIndex=" + i + ",dailyAppkeyIndex=" + i2);
    }

    @Deprecated
    public static void setAppKeyIndex(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17b256d9", new Object[]{new Integer(i), new Integer(i2)});
        } else {
            setAppKeyIndex(null, i, i2);
        }
    }

    public static void setAuthCode(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d080952", new Object[]{str, str2});
            return;
        }
        MtopConfig mtopConfigByID = getMtopConfigByID(str);
        mtopConfigByID.authCode = str2;
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i(TAG, mtopConfigByID.instanceId + " [setAuthCode] authCode=" + str2);
    }

    @Deprecated
    public static void setAuthCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b493188", new Object[]{str});
        } else {
            setAuthCode(null, str);
        }
    }

    public static void setWuaAuthCode(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dc9871", new Object[]{str, str2});
            return;
        }
        MtopConfig mtopConfigByID = getMtopConfigByID(str);
        mtopConfigByID.wuaAuthCode = str2;
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i(TAG, mtopConfigByID.instanceId + " [setWuaAuthCode] wuaAuthCode=" + str2);
    }

    public static void setAppVersion(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd95e94", new Object[]{str, str2});
            return;
        }
        MtopConfig mtopConfigByID = getMtopConfigByID(str);
        mtopConfigByID.appVersion = str2;
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i(TAG, mtopConfigByID.instanceId + " [setAppVersion] appVersion=" + str2);
    }

    public static void setAppKey(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f58e859b", new Object[]{str, str2});
            return;
        }
        MtopConfig mtopConfigByID = getMtopConfigByID(str);
        mtopConfigByID.appKey = str2;
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i(TAG, mtopConfigByID.instanceId + " [setAppKey] appKey=" + str2);
    }

    @Deprecated
    public static void setAppVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cefab34a", new Object[]{str});
        } else {
            setAppVersion(null, str);
        }
    }

    public static void setMtopDomain(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5f35f5d", new Object[]{str, str2, str3, str4});
            return;
        }
        MtopConfig mtopConfigByID = getMtopConfigByID(str);
        if (StringUtils.isNotBlank(str2)) {
            mtopConfigByID.mtopDomain.updateDomain(EnvModeEnum.ONLINE, str2);
        }
        if (StringUtils.isNotBlank(str3)) {
            mtopConfigByID.mtopDomain.updateDomain(EnvModeEnum.PREPARE, str3);
        }
        if (!StringUtils.isNotBlank(str4)) {
            return;
        }
        mtopConfigByID.mtopDomain.updateDomain(EnvModeEnum.TEST, str4);
    }

    @Deprecated
    public static void setMtopDomain(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ac98453", new Object[]{str, str2, str3});
        } else {
            setMtopDomain(null, str, str2, str3);
        }
    }

    @Deprecated
    public static void setMtopFeatureFlag(MtopFeatureManager.MtopFeatureEnum mtopFeatureEnum, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96aeeb98", new Object[]{mtopFeatureEnum, new Boolean(z)});
        } else {
            setMtopFeatureFlag(null, MtopFeatureManager.getMtopFeatureByFeatureEnum(mtopFeatureEnum), z);
        }
    }

    public static void setMtopFeatureFlag(String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77bcce5a", new Object[]{str, new Integer(i), new Boolean(z)});
        } else if (i <= 0) {
        } else {
            MtopConfig mtopConfigByID = getMtopConfigByID(str);
            if (z) {
                mtopConfigByID.mtopFeatures.add(Integer.valueOf(i));
            } else {
                mtopConfigByID.mtopFeatures.remove(Integer.valueOf(i));
            }
        }
    }

    public static void setAntiAttackHandler(String str, AntiAttackHandler antiAttackHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c65d2d", new Object[]{str, antiAttackHandler});
            return;
        }
        MtopConfig mtopConfigByID = getMtopConfigByID(str);
        mtopConfigByID.antiAttackHandler = antiAttackHandler;
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i(TAG, mtopConfigByID.instanceId + " [setAntiAttackHandler] set antiAttackHandler succeed.");
    }

    public static void setMtopRequestStListener(String str, MtopRequestStListener mtopRequestStListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f915d4", new Object[]{str, mtopRequestStListener});
            return;
        }
        MtopConfig mtopConfigByID = getMtopConfigByID(str);
        mtopConfigByID.requestStListener = mtopRequestStListener;
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i(TAG, mtopConfigByID.instanceId + " [setMtopRequestStListener] set request security track listener succeed");
    }

    @Deprecated
    public static void setXOrangeQ(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6437519e", new Object[]{str});
        } else {
            setXOrangeQ(null, str);
        }
    }

    public static void setXOrangeQ(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf528fe8", new Object[]{str, str2});
        } else if (!StringUtils.isNotBlank(str2)) {
        } else {
            MtopConfig mtopConfigByID = getMtopConfigByID(str);
            mtopConfigByID.xOrangeQ = str2;
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                return;
            }
            TBSdkLog.i(TAG, mtopConfigByID.instanceId + " [setXOrangeQ] set xOrangeQ succeed.xOrangeQ=" + str2);
        }
    }

    public static void setMtopConfigListener(final rxe rxeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fad66b8", new Object[]{rxeVar});
            return;
        }
        SwitchConfig.getInstance().setMtopConfigListener(rxeVar);
        SwitchConfigUtil.setMtopConfigListener(rxeVar);
        TBSdkLog.i(TAG, "[setMtopConfigListener] set MtopConfigListener succeed.");
        MtopSDKThreadPoolExecutorFactory.submit(new Runnable() { // from class: mtopsdk.mtop.intf.MtopSetting.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (rxe.this == null) {
                } else {
                    MtopConfig mtopConfigByID = MtopSetting.getMtopConfigByID(null);
                    if (mtopConfigByID.context == null) {
                        return;
                    }
                    rxe.this.a(mtopConfigByID.context);
                }
            }
        });
    }

    public static void setLogAdapterImpl(LogAdapter logAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58993c30", new Object[]{logAdapter});
        } else if (logAdapter == null) {
        } else {
            MtopConfig.logAdapterImpl = logAdapter;
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                return;
            }
            TBSdkLog.i(TAG, "[setLogAdapterImpl] set logAdapter succeed.logAdapterImpl=" + logAdapter);
        }
    }

    @Deprecated
    public static void setCacheImpl(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77351824", new Object[]{bVar});
        } else {
            setCacheImpl(null, bVar);
        }
    }

    public static void setCacheImpl(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b1955ae", new Object[]{str, bVar});
        } else if (bVar == null) {
        } else {
            MtopConfig mtopConfigByID = getMtopConfigByID(str);
            mtopConfigByID.cacheImpl = bVar;
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                return;
            }
            TBSdkLog.i(TAG, mtopConfigByID.instanceId + " [setCacheImpl] set CacheImpl succeed.cacheImpl=" + bVar);
        }
    }

    public static void setISignImpl(String str, ryv ryvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e89e3656", new Object[]{str, ryvVar});
            return;
        }
        MtopConfig mtopConfigByID = getMtopConfigByID(str);
        mtopConfigByID.sign = ryvVar;
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i(TAG, mtopConfigByID.instanceId + "[setISignImpl] set ISign succeed.signImpl=" + ryvVar);
    }

    public static void setUploadStats(String str, IUploadStats iUploadStats) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e83836", new Object[]{str, iUploadStats});
            return;
        }
        MtopConfig mtopConfigByID = getMtopConfigByID(str);
        mtopConfigByID.uploadStats = iUploadStats;
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i(TAG, mtopConfigByID.instanceId + "[setUploadStats] set IUploadStats succeed.uploadStats=" + iUploadStats);
    }

    public static void setCallFactoryImpl(String str, ryn.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98826d87", new Object[]{str, aVar});
        } else if (aVar == null) {
        } else {
            MtopConfig mtopConfigByID = getMtopConfigByID(str);
            mtopConfigByID.callFactory = aVar;
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                return;
            }
            TBSdkLog.i(TAG, mtopConfigByID.instanceId + "[setCallFactoryImpl] set CallFactoryImpl succeed.callFactory=" + aVar);
        }
    }

    public static void setEnableProperty(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bebbbdf", new Object[]{str, str2, new Boolean(z)});
        } else if (str2 == null) {
        } else {
            MtopConfig mtopConfigByID = getMtopConfigByID(str);
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i(TAG, mtopConfigByID.instanceId + "[setEnableProperty] set enableProperty succeed.property=" + str2 + ",enable=" + z);
            }
            char c = 65535;
            int hashCode = str2.hashCode();
            if (hashCode != -514993282) {
                if (hashCode != -309052356) {
                    if (hashCode == 1971193321 && str2.equals(MtopEnablePropertyType.ENABLE_NEW_DEVICE_ID)) {
                        c = 1;
                    }
                } else if (str2.equals(MtopEnablePropertyType.ENABLE_HEADER_URL_ENCODE)) {
                    c = 2;
                }
            } else if (str2.equals(MtopEnablePropertyType.ENABLE_NOTIFY_SESSION_RET)) {
                c = 0;
            }
            if (c == 0) {
                mtopConfigByID.notifySessionResult = z;
            } else if (c == 1) {
                mtopConfigByID.enableNewDeviceId = z;
            } else if (c != 2) {
            } else {
                mtopConfigByID.enableHeaderUrlEncode = z;
            }
        }
    }

    public static void setParam(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95622e7a", new Object[]{str, str2, str3, str4});
        } else if (str2 == null || str3 == null || str4 == null) {
        } else {
            MtopConfig mtopConfigByID = getMtopConfigByID(str);
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i(TAG, mtopConfigByID.instanceId + "[setParam] set Param succeed.mtopParamType=" + str2 + ",key=" + str3 + ",value=" + str4);
            }
            char c = 65535;
            int hashCode = str2.hashCode();
            if (hashCode != 77406376) {
                if (hashCode != 1924418611) {
                    if (hashCode == 2127025805 && str2.equals(MtopParamType.HEADER)) {
                        c = 0;
                    }
                } else if (str2.equals(MtopParamType.ABTEST)) {
                    c = 2;
                }
            } else if (str2.equals(MtopParamType.QUERY)) {
                c = 1;
            }
            if (c == 0) {
                mtopConfigByID.mtopGlobalHeaders.put(str3, str4);
            } else if (c == 1) {
                mtopConfigByID.mtopGlobalQuerys.put(str3, str4);
            } else if (c != 2) {
            } else {
                mtopConfigByID.mtopGlobalABTestParams.put(str3, str4);
            }
        }
    }

    public static void removeParam(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6faf984e", new Object[]{str, str2, str3});
        } else if (str2 == null || str3 == null) {
        } else {
            MtopConfig mtopConfigByID = getMtopConfigByID(str);
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i(TAG, mtopConfigByID.instanceId + "[removeParam] remove Param succeed.mtopParamType=" + str2 + ",key=" + str3);
            }
            char c = 65535;
            int hashCode = str2.hashCode();
            if (hashCode != 77406376) {
                if (hashCode != 1924418611) {
                    if (hashCode == 2127025805 && str2.equals(MtopParamType.HEADER)) {
                        c = 0;
                    }
                } else if (str2.equals(MtopParamType.ABTEST)) {
                    c = 2;
                }
            } else if (str2.equals(MtopParamType.QUERY)) {
                c = 1;
            }
            if (c == 0) {
                mtopConfigByID.mtopGlobalHeaders.remove(str3);
            } else if (c == 1) {
                mtopConfigByID.mtopGlobalQuerys.remove(str3);
            } else if (c != 2) {
            } else {
                mtopConfigByID.mtopGlobalABTestParams.remove(str3);
            }
        }
    }

    public static void addMtopStatisListener(String str, MtopStatsListener mtopStatsListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f783b904", new Object[]{str, mtopStatsListener});
            return;
        }
        MtopConfig mtopConfigByID = getMtopConfigByID(str);
        mtopConfigByID.mtopStatsListener = mtopStatsListener;
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i(TAG, mtopConfigByID.instanceId + " [addMtopStatisListener] set MtopStatsListener succeed.");
    }

    public static void setRouterId(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a7e14e1", new Object[]{str, str2});
        } else if (StringUtils.isEmpty(str2)) {
        } else {
            MtopConfig mtopConfigByID = getMtopConfigByID(str);
            mtopConfigByID.routerId = str2;
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                return;
            }
            TBSdkLog.i(TAG, mtopConfigByID.instanceId + "[setRouterId] set routerId succeed.routerId=" + str2);
        }
    }

    public static void setPlaceId(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b07c7db", new Object[]{str, str2});
        } else if (StringUtils.isEmpty(str2)) {
        } else {
            MtopConfig mtopConfigByID = getMtopConfigByID(str);
            mtopConfigByID.placeId = str2;
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                return;
            }
            TBSdkLog.i(TAG, mtopConfigByID.instanceId + "[setPlaceId] set placeId succeed.placeId=" + str2);
        }
    }

    public static void registerWVRequestInterceptor(IWVRequestInterceptor iWVRequestInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5140f532", new Object[]{iWVRequestInterceptor});
        } else {
            sWVRequestInterceptor = iWVRequestInterceptor;
        }
    }
}
