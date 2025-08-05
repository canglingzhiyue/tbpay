package com.alipay.mobile.security.bio.common.record.impl;

import android.util.Base64;
import com.alipay.mobile.security.bio.common.record.MetaRecord;
import com.alipay.mobile.security.bio.log.BehaviourIdEnum;
import com.alipay.mobile.security.bio.log.VerifyBehavior;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.ZimRecordService;
import com.alipay.mobile.security.bio.service.local.monitorlog.MonitorLogService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ZimRecordServiceImpl extends ZimRecordService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_CLASSIFIERS = "log_classifiers";
    public static final String ZOLOZ_RECORDS = "zoloz_records";
    private MonitorLogService f;

    /* renamed from: a  reason: collision with root package name */
    public String f5774a = "";
    public int b = 0;
    public int c = -1;
    public Map<String, String> d = new Hashtable();
    private final Set<String> g = new HashSet(Arrays.asList(MetaRecord.DEFAULT_LOG_CLASSIFIERS.split("#")));

    public static /* synthetic */ Object ipc$super(ZimRecordServiceImpl zimRecordServiceImpl, String str, Object... objArr) {
        if (str.hashCode() == 548948747) {
            super.onCreate((BioServiceManager) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alipay.mobile.security.bio.service.BioService
    public void onCreate(BioServiceManager bioServiceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b84b0b", new Object[]{this, bioServiceManager});
            return;
        }
        super.onCreate(bioServiceManager);
        this.f = (MonitorLogService) bioServiceManager.getBioService(MonitorLogService.class);
    }

    @Override // com.alipay.mobile.security.bio.service.ZimRecordService
    public boolean write(MetaRecord metaRecord) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("49f9a6f", new Object[]{this, metaRecord})).booleanValue() : write(metaRecord, null);
    }

    @Override // com.alipay.mobile.security.bio.service.ZimRecordService
    public boolean write(MetaRecord metaRecord, Map<String, String> map) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8942bdbe", new Object[]{this, metaRecord, map})).booleanValue();
        }
        if (metaRecord == null || !this.g.contains(metaRecord.getClassifier())) {
            return false;
        }
        VerifyBehavior verifyBehavior = new VerifyBehavior();
        verifyBehavior.setUserCaseID(metaRecord.getCaseID());
        String actionID = metaRecord.getActionID();
        verifyBehavior.setAppID(metaRecord.getAppID());
        verifyBehavior.setSeedID(metaRecord.getSeedID());
        verifyBehavior.setParam1(this.f5774a);
        StringBuilder sb = new StringBuilder();
        int i = this.b + 1;
        this.b = i;
        sb.append(i);
        sb.append("");
        verifyBehavior.setParam2(sb.toString());
        verifyBehavior.setParam3(this.c + "");
        verifyBehavior.setBizType(metaRecord.getBizType());
        verifyBehavior.setLoggerLevel(metaRecord.getPriority());
        verifyBehavior.addExtParam("base64", "true");
        verifyBehavior.addExtParam("logBizTime", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date()));
        HashMap hashMap = new HashMap();
        for (String str : this.d.keySet()) {
            String str2 = this.d.get(str);
            if (EXCLUDE_EXT_PARAMS.contains(str)) {
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
        BehaviourIdEnum convert = BehaviourIdEnum.convert(actionID);
        MonitorLogService monitorLogService = this.f;
        if (monitorLogService == null) {
            BioLog.e(new RuntimeException(getClass().getName() + ".write(" + metaRecord + ") failed. MonitorLogService==null"));
            return false;
        }
        monitorLogService.logBehavior(convert, verifyBehavior);
        return true;
    }

    @Override // com.alipay.mobile.security.bio.service.ZimRecordService
    public void init(String str, int i, int i2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf61d1a4", new Object[]{this, str, new Integer(i), new Integer(i2), map});
            return;
        }
        this.f5774a = str;
        this.b = i;
        this.c = i2;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                    this.d.put(entry.getKey(), entry.getValue());
                }
            }
        }
        BioLog.d("mExtParams:" + StringUtil.map2String(this.d));
    }

    @Override // com.alipay.mobile.security.bio.service.ZimRecordService
    public void addExtProperty(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb6f4d0", new Object[]{this, str, str2});
        } else {
            this.d.put(str, str2);
        }
    }

    @Override // com.alipay.mobile.security.bio.service.ZimRecordService
    public void addExtProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6781de2b", new Object[]{this, map});
        } else {
            this.d.putAll(map);
        }
    }

    @Override // com.alipay.mobile.security.bio.service.ZimRecordService
    public String getUniqueID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4faa1617", new Object[]{this}) : this.f5774a;
    }

    @Override // com.alipay.mobile.security.bio.service.ZimRecordService
    public int getSequenceID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("928b380c", new Object[]{this})).intValue() : this.b;
    }

    @Override // com.alipay.mobile.security.bio.service.ZimRecordService
    public int getRetryID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7b275387", new Object[]{this})).intValue() : this.c;
    }

    @Override // com.alipay.mobile.security.bio.service.ZimRecordService
    public void retry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ea132f", new Object[]{this});
        } else {
            this.c++;
        }
    }

    @Override // com.alipay.mobile.security.bio.service.ZimRecordService
    public void setLogClassifier(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49965f35", new Object[]{this, set});
        } else if (set == null) {
        } else {
            this.g.clear();
            this.g.addAll(set);
        }
    }

    @Override // com.alipay.mobile.security.bio.service.ZimRecordService
    public Map<String, String> getExtProperties() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("185e757a", new Object[]{this}) : this.d;
    }
}
