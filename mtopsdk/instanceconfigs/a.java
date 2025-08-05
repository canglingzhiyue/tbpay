package mtopsdk.instanceconfigs;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import mtopsdk.common.util.ConfigStoreManager;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.instanceconfigs.MtopExternalInstanceConfigsData;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import mtopsdk.mtop.util.MtopStatistics;
import tb.kge;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, MtopExternalInstanceConfigsData.a> f25002a;
    private static final Map<String, Future<String>> b;
    private static a c;

    public static /* synthetic */ String a(a aVar, Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ac269cc", new Object[]{aVar, context, str, str2}) : aVar.b(context, str, str2);
    }

    static {
        kge.a(494728321);
        f25002a = new HashMap();
        b = new HashMap();
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("bb72d648", new Object[0]);
        }
        if (c == null) {
            synchronized (a.class) {
                if (c == null) {
                    c = new a();
                }
            }
        }
        return c;
    }

    public MtopExternalInstanceConfigsData.a a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopExternalInstanceConfigsData.a) ipChange.ipc$dispatch("b643c7bb", new Object[]{this, context, str}) : a(context, str, "", 5000L);
    }

    public MtopExternalInstanceConfigsData.a a(final Context context, final String str, final String str2, long j) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopExternalInstanceConfigsData.a) ipChange.ipc$dispatch("44bfd1e1", new Object[]{this, context, str, str2, new Long(j)});
        }
        if (StringUtils.isBlank(str)) {
            return null;
        }
        Future<String> future = b.get(str);
        if (future != null && !future.isDone()) {
            try {
                if (j > 0) {
                    str3 = future.get(j, TimeUnit.MILLISECONDS);
                } else {
                    str3 = future.get();
                }
                return a(str3, str2);
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.InstanceConfigsManager", "[getInstanceFromAccountSite] error ---" + th.toString());
                return null;
            }
        }
        final FutureTask futureTask = new FutureTask(new Callable<String>() { // from class: mtopsdk.instanceconfigs.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.String] */
            @Override // java.util.concurrent.Callable
            public /* synthetic */ String call() throws Exception {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("6d249ded", new Object[]{this}) : a();
            }

            public String a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : a.a(a.this, context, str, str2);
            }
        });
        MtopSDKThreadPoolExecutorFactory.submit(new Runnable() { // from class: mtopsdk.instanceconfigs.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    futureTask.run();
                }
            }
        });
        b.put(str, futureTask);
        try {
            if (j > 0) {
                return a((String) futureTask.get(j, TimeUnit.MILLISECONDS), str2);
            }
            return a((String) futureTask.get(), str2);
        } catch (Throwable th2) {
            TBSdkLog.e("mtopsdk.InstanceConfigsManager", "[getInstanceFromAccountSite] error ---" + th2.toString());
            return null;
        }
    }

    public MtopExternalInstanceConfigsData.a a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopExternalInstanceConfigsData.a) ipChange.ipc$dispatch("4e12ea85", new Object[]{this, context, str, str2});
        }
        MtopExternalInstanceConfigsData.a aVar = f25002a.get(str2);
        if (aVar != null) {
            return aVar;
        }
        String str3 = null;
        if (context == null) {
            return null;
        }
        ConfigStoreManager configStoreManager = ConfigStoreManager.getInstance();
        MtopExternalInstanceConfigsData.a a2 = a(configStoreManager.getConfigItem(context, ConfigStoreManager.MTOP_CONFIG_STORE, "MTOPSDK_INSTANCE_CONFIG_STORE" + str, "instance_config"), str2);
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            StringBuilder sb = new StringBuilder();
            sb.append("[getLocalInstanceConfig]get instanceId from store accountSite=");
            sb.append(str2);
            sb.append("; instanceId=");
            if (a2 != null) {
                str3 = a2.b;
            }
            sb.append(str3);
            TBSdkLog.i("mtopsdk.InstanceConfigsManager", sb.toString());
        }
        if (a2 != null) {
            f25002a.put(str2, a2);
        }
        return a2;
    }

    private String b(Context context, String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3b17b6d", new Object[]{this, context, str, str2});
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i("mtopsdk.InstanceConfigsManager", "[getRemoteInstanceConfig] called!accountSite=" + str2);
        }
        int currentTimeMillis = (int) System.currentTimeMillis();
        MtopExternalInstanceConfigsGetRequest mtopExternalInstanceConfigsGetRequest = new MtopExternalInstanceConfigsGetRequest();
        Mtop instance = Mtop.instance(Mtop.Id.INNER, (Context) null);
        MtopResponse syncRequest = instance.build((IMTOPDataObject) mtopExternalInstanceConfigsGetRequest, (String) null).mo1340setBizId(4099).syncRequest();
        if (syncRequest.isApiSuccess()) {
            try {
                byte[] bytedata = syncRequest.getBytedata();
                if (bytedata != null && bytedata.length != 0) {
                    str3 = new String(bytedata, StandardCharsets.UTF_8);
                    if (context == null) {
                        return null;
                    }
                    try {
                        ConfigStoreManager configStoreManager = ConfigStoreManager.getInstance();
                        configStoreManager.saveConfigItem(context, ConfigStoreManager.MTOP_CONFIG_STORE, "MTOPSDK_INSTANCE_CONFIG_STORE" + str, "instance_config", str3);
                    } catch (Throwable th) {
                        th = th;
                        TBSdkLog.e("mtopsdk.InstanceConfigsManager", "[getRemoteInstanceConfig] error ---" + th.toString());
                        a(instance.getMtopConfig(), str2, currentTimeMillis, syncRequest, str3);
                        return str3;
                    }
                }
                TBSdkLog.e("mtopsdk.InstanceConfigsManager", "jsonData is blank");
                return null;
            } catch (Throwable th2) {
                th = th2;
                str3 = "";
            }
        } else {
            str3 = "";
        }
        a(instance.getMtopConfig(), str2, currentTimeMillis, syncRequest, str3);
        return str3;
    }

    private MtopExternalInstanceConfigsData.a a(String str, String str2) {
        BaseOutDo baseOutDo;
        MtopExternalInstanceConfigsData mtopExternalInstanceConfigsData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopExternalInstanceConfigsData.a) ipChange.ipc$dispatch("bd55f48d", new Object[]{this, str, str2});
        }
        if (!StringUtils.isNotBlank(str) || (baseOutDo = (BaseOutDo) JSON.parseObject(str, MtopExternalInstanceConfigsGetResponse.class)) == null || (mtopExternalInstanceConfigsData = (MtopExternalInstanceConfigsData) baseOutDo.mo2429getData()) == null || mtopExternalInstanceConfigsData.externalInstanceConfigs == null || mtopExternalInstanceConfigsData.externalInstanceConfigs.size() <= 0) {
            return null;
        }
        for (MtopExternalInstanceConfigsData.a aVar : mtopExternalInstanceConfigsData.externalInstanceConfigs) {
            if (aVar != null && TextUtils.equals(aVar.f25001a, str2)) {
                return aVar;
            }
        }
        return null;
    }

    private void a(MtopConfig mtopConfig, String str, int i, MtopResponse mtopResponse, String str2) {
        IpChange ipChange = $ipChange;
        int i2 = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63da6e3d", new Object[]{this, mtopConfig, str, new Integer(i), mtopResponse, str2});
            return;
        }
        MtopStatistics mtopStat = mtopResponse.getMtopStat();
        if (mtopStat == null) {
            return;
        }
        mtopStat.configReqDomain = mtopConfig.mtopDomain.getDomain(mtopConfig.envMode);
        mtopStat.instanceId = Mtop.Id.INNER;
        mtopStat.accountSite = str;
        mtopStat.configRequestType = !StringUtils.isBlank(str) ? 1 : 0;
        mtopStat.configReqStartTime = i;
        mtopStat.configReqFinishTime = System.currentTimeMillis();
        if (!mtopResponse.isApiSuccess()) {
            i2 = -1;
        } else if (StringUtils.isBlank(str2)) {
            i2 = 0;
        }
        mtopStat.configReturnType = i2;
        mtopStat.commitCustomStatData(0, mtopStat);
    }
}
