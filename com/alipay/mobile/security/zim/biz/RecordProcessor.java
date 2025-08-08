package com.alipay.mobile.security.zim.biz;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import com.alipay.mobile.security.bio.common.record.MetaRecord;
import com.alipay.mobile.security.bio.log.BehaviourIdEnum;
import com.alipay.mobile.security.bio.log.VerifyBehavior;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.ZimRecordService;
import com.alipay.mobile.security.bio.service.local.apsecurity.ApSecurityService;
import com.alipay.mobile.security.bio.service.local.monitorlog.MonitorLogService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.json.JSONObject;
import tb.rrv;

/* loaded from: classes3.dex */
public class RecordProcessor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String KEY_VALIDATE_REQUEST = "validateRequest";
    public static String KEY_VALIDATE_RESPONSE = "validateResponse";

    /* renamed from: a  reason: collision with root package name */
    public static String f5842a = "zimStart";
    public static String b = "verifyRequest";
    public static String c = "initProdRequest";
    public static String d = "initProdResponse";
    public static String e = "authRequest";
    public static String f = "authResponse";
    public static String g = "verifyResponse";
    public static String h = "zimExit";
    private static RecordProcessor k;
    public Context j;
    private String l;
    private ZimRecordService p;
    private MonitorLogService r;
    private int m = 0;
    private int n = 0;
    private boolean o = true;
    private HashMap<String, MetaRecord> q = new HashMap<>();
    public Map<String, String> i = new HashMap();

    public static synchronized RecordProcessor createInstance(Context context) {
        synchronized (RecordProcessor.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecordProcessor) ipChange.ipc$dispatch("4d72659a", new Object[]{context});
            }
            RecordProcessor recordProcessor = new RecordProcessor(context);
            k = recordProcessor;
            return recordProcessor;
        }
    }

    public static RecordProcessor getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecordProcessor) ipChange.ipc$dispatch("7ae98a58", new Object[0]) : k;
    }

    public RecordProcessor(Context context) {
        this.j = context;
        Random random = new Random();
        this.l = (UUID.randomUUID().toString() + random.nextInt() + "").replace("-", "").toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.append("new RecordProcessor() : mUniqueID is:");
        sb.append(this.l);
        BioLog.i(sb.toString());
        this.i.put("logModelVersion", "V1.0");
        this.i.put("logPlanId", "ZOLOZ_LOGPLAN_ALIPAYCLOUD_V1");
        this.i.put("logType", "BI_C_V1");
        HashMap<String, MetaRecord> hashMap = this.q;
        String str = f5842a;
        hashMap.put(str, new MetaRecord("UC-RZHY-170807-01", "event", "20001117", str, 1));
        HashMap<String, MetaRecord> hashMap2 = this.q;
        String str2 = b;
        hashMap2.put(str2, new MetaRecord("UC-RZHY-170807-01", "event", "20001117", str2, 1));
        HashMap<String, MetaRecord> hashMap3 = this.q;
        String str3 = c;
        hashMap3.put(str3, new MetaRecord("UC-RZHY-170807-02", "event", "20001117", str3, 1));
        HashMap<String, MetaRecord> hashMap4 = this.q;
        String str4 = d;
        hashMap4.put(str4, new MetaRecord("UC-RZHY-170807-03", "event", "20001117", str4, 1));
        HashMap<String, MetaRecord> hashMap5 = this.q;
        String str5 = e;
        hashMap5.put(str5, new MetaRecord("UC-RZHY-170807-04", "event", "20001117", str5, 1));
        HashMap<String, MetaRecord> hashMap6 = this.q;
        String str6 = f;
        hashMap6.put(str6, new MetaRecord("UC-RZHY-170807-05", "event", "20001117", str6, 1));
        HashMap<String, MetaRecord> hashMap7 = this.q;
        String str7 = KEY_VALIDATE_REQUEST;
        hashMap7.put(str7, new MetaRecord("UC-RZHY-170807-06", "event", "20001117", str7, 1));
        HashMap<String, MetaRecord> hashMap8 = this.q;
        String str8 = KEY_VALIDATE_RESPONSE;
        hashMap8.put(str8, new MetaRecord("UC-RZHY-170807-07", "event", "20001117", str8, 1));
        HashMap<String, MetaRecord> hashMap9 = this.q;
        String str9 = g;
        hashMap9.put(str9, new MetaRecord("UC-RZHY-170807-08", "event", "20001117", str9, 1));
        HashMap<String, MetaRecord> hashMap10 = this.q;
        String str10 = h;
        hashMap10.put(str10, new MetaRecord("UC-RZHY-170807-09", "event", "20001117", str10, 1));
    }

    public void setUniqueID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3076073f", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.l = str;
        }
    }

    public String getUniqueID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4faa1617", new Object[]{this}) : this.l;
    }

    public void zimInit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3051d5f", new Object[]{this, str});
            return;
        }
        BioServiceManager currentInstance = BioServiceManager.getCurrentInstance();
        if (this.p != null) {
            return;
        }
        this.p = (ZimRecordService) currentInstance.getBioService(ZimRecordService.class.getName());
        this.i.put("zimId", str);
        ApSecurityService apSecurityService = (ApSecurityService) currentInstance.getBioService(ApSecurityService.class);
        String apDidToken = apSecurityService != null ? apSecurityService.getApDidToken() : "";
        if (StringUtils.isEmpty(apDidToken)) {
            apDidToken = ApSecurityService.getStaticApDidToken();
        }
        this.i.put(rrv.APDIDTOKEN, apDidToken);
        this.p.init(this.l, this.m, this.n, this.i);
        MonitorLogService monitorLogService = this.r;
        if (monitorLogService == null) {
            return;
        }
        monitorLogService.destroy();
        this.r = null;
    }

    public void addExtProperty(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb6f4d0", new Object[]{this, str, str2});
            return;
        }
        this.i.put(str, str2);
        ZimRecordService zimRecordService = this.p;
        if (zimRecordService == null) {
            return;
        }
        zimRecordService.addExtProperty(str, str2);
    }

    public void addExtProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6781de2b", new Object[]{this, map});
            return;
        }
        this.i.putAll(map);
        ZimRecordService zimRecordService = this.p;
        if (zimRecordService == null) {
            return;
        }
        zimRecordService.addExtProperties(map);
    }

    public boolean record(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ecfa2426", new Object[]{this, str})).booleanValue() : record(str, (Map<String, String>) null);
    }

    public boolean record(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0aaaf27", new Object[]{this, str, map})).booleanValue();
        }
        if (this.q.containsKey(str)) {
            return record(this.q.get(str), map);
        }
        BioLog.w("Not support record: key=" + str);
        return false;
    }

    public boolean record(MetaRecord metaRecord) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5621bb3d", new Object[]{this, metaRecord})).booleanValue() : record(metaRecord, (Map<String, String>) null);
    }

    public boolean record(MetaRecord metaRecord, Map<String, String> map) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("829d2730", new Object[]{this, metaRecord, map})).booleanValue();
        }
        ZimRecordService zimRecordService = this.p;
        if (zimRecordService == null) {
            if (this.r == null) {
                this.r = (MonitorLogService) BioServiceManager.getLocalService(this.j, MonitorLogService.class);
                MonitorLogService monitorLogService = this.r;
                if (monitorLogService == null) {
                    BioLog.w(new IllegalStateException("mZimRecordService == null && mMonitorLogService == null"));
                    return false;
                }
                monitorLogService.create(null);
            }
            VerifyBehavior verifyBehavior = new VerifyBehavior();
            verifyBehavior.setUserCaseID(metaRecord.getCaseID());
            String actionID = metaRecord.getActionID();
            verifyBehavior.setAppID(metaRecord.getAppID());
            verifyBehavior.setSeedID(metaRecord.getSeedID());
            verifyBehavior.setParam1(this.l);
            StringBuilder sb = new StringBuilder();
            int i = this.m + 1;
            this.m = i;
            sb.append(i);
            sb.append("");
            verifyBehavior.setParam2(sb.toString());
            verifyBehavior.setParam3(this.n + "");
            verifyBehavior.setBizType(metaRecord.getBizType());
            verifyBehavior.setLoggerLevel(metaRecord.getPriority());
            verifyBehavior.addExtParam("base64", "true");
            HashMap hashMap = new HashMap();
            for (String str : this.i.keySet()) {
                String str2 = this.i.get(str);
                if (ZimRecordService.EXCLUDE_EXT_PARAMS.contains(str)) {
                    verifyBehavior.addExtParam(str, str2);
                } else {
                    hashMap.put(str, str2);
                }
            }
            verifyBehavior.addExtParam("publicParam", Base64.encodeToString(new JSONObject(hashMap).toString().getBytes(), 2));
            if (map != null) {
                jSONObject = new JSONObject(map);
            } else {
                jSONObject = new JSONObject();
            }
            verifyBehavior.addExtParam("extParam", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            this.r.logBehavior(BehaviourIdEnum.convert(actionID), verifyBehavior);
            return true;
        }
        return zimRecordService.write(metaRecord, map);
    }

    public void retry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ea132f", new Object[]{this});
        } else {
            this.n++;
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.q.clear();
        this.p = null;
        this.n = 0;
        this.m = 0;
        k = null;
        BioLog.d("RecordProcessor.destroy()");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ZimRecordService zimRecordService = this.p;
        if (zimRecordService == null) {
            return;
        }
        this.n = zimRecordService.getRetryID();
        this.m = this.p.getSequenceID();
        this.p = null;
    }

    public void setDestroyable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb9427db", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    public boolean destroyable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7ffde2df", new Object[]{this})).booleanValue() : this.o;
    }
}
