package com.alipay.mobile.security.bio.common.record.impl;

import com.alipay.mobile.security.bio.common.record.MetaRecord;
import com.alipay.mobile.security.bio.log.BehaviourIdEnum;
import com.alipay.mobile.security.bio.log.VerifyBehavior;
import com.alipay.mobile.security.bio.service.BioRecordService;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.local.monitorlog.MonitorLogService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.SignHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Hashtable;
import java.util.Map;

/* loaded from: classes3.dex */
public class BioRecordServiceImpl extends BioRecordService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String b;
    private MonitorLogService f;

    /* renamed from: a  reason: collision with root package name */
    public int f5773a = 0;
    public Map<String, String> c = new Hashtable();
    public Object d = new Object();

    public static /* synthetic */ Object ipc$super(BioRecordServiceImpl bioRecordServiceImpl, String str, Object... objArr) {
        if (str.hashCode() == 548948747) {
            super.onCreate((BioServiceManager) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alipay.mobile.security.bio.service.BioService
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public BioRecordServiceImpl() {
        this.b = "";
        this.b = SignHelper.SHA1("" + System.currentTimeMillis() + Math.round(10000.0f));
        synchronized (this.d) {
            if (this.c != null) {
                this.c.clear();
            }
        }
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
        BioLog.w(getClass().getName() + " call mBioServiceManager.getBioService(MonitorLogService.class): " + this.f);
    }

    public static void a(Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0efabc8", new Object[]{map, map2});
        } else if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && value != null) {
                    map2.put(key.toString(), value.toString());
                }
            }
        }
    }

    @Override // com.alipay.mobile.security.bio.service.BioRecordService
    public void write(MetaRecord metaRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49f9a6b", new Object[]{this, metaRecord});
            return;
        }
        superWrite(metaRecord);
        BioLog.i(getClass().getSimpleName() + "(sequenceId=" + this.f5773a + "):" + metaRecord);
        if (metaRecord == null) {
            return;
        }
        VerifyBehavior verifyBehavior = new VerifyBehavior();
        verifyBehavior.setUserCaseID(metaRecord.getCaseID());
        String actionID = metaRecord.getActionID();
        verifyBehavior.setAppID(metaRecord.getAppID());
        verifyBehavior.setSeedID(metaRecord.getSeedID());
        verifyBehavior.setParam1(this.b);
        verifyBehavior.setParam2(metaRecord.getParam2());
        verifyBehavior.setParam3(metaRecord.getParam3());
        verifyBehavior.setBizType(metaRecord.getBizType());
        verifyBehavior.setLoggerLevel(metaRecord.getPriority());
        a(verifyBehavior, this.c);
        a(verifyBehavior, metaRecord.getParam4());
        BehaviourIdEnum convert = BehaviourIdEnum.convert(actionID);
        MonitorLogService monitorLogService = this.f;
        if (monitorLogService == null) {
            BioLog.e(new RuntimeException(getClass().getName() + ".write(" + metaRecord + ") failed. MonitorLogService==null"));
            return;
        }
        monitorLogService.logBehavior(convert, verifyBehavior);
    }

    private void a(VerifyBehavior verifyBehavior, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd805102", new Object[]{this, verifyBehavior, map});
        } else if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && value != null) {
                    verifyBehavior.addExtParam(key.toString(), value.toString());
                }
            }
        }
    }

    public void superWrite(MetaRecord metaRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f118bb46", new Object[]{this, metaRecord});
            return;
        }
        synchronized (this.d) {
            if (metaRecord != null) {
                metaRecord.setParam1(this.b);
                if (metaRecord.isEnableSequence()) {
                    this.f5773a++;
                    metaRecord.setSequenceId(this.f5773a);
                    this.c.put("sequence_id", "" + this.f5773a);
                } else {
                    this.c.remove("sequence_id");
                }
            }
        }
    }

    @Override // com.alipay.mobile.security.bio.service.BioRecordService
    public String getUniqueID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4faa1617", new Object[]{this}) : this.b;
    }

    @Override // com.alipay.mobile.security.bio.service.BioRecordService
    public void setUniqueID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3076073f", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    @Override // com.alipay.mobile.security.bio.service.BioRecordService
    public void setExtProperty(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8ba3a4a", new Object[]{this, map});
            return;
        }
        synchronized (this.d) {
            a(map, this.c);
        }
    }

    @Override // com.alipay.mobile.security.bio.service.BioRecordService
    public int getSequenceID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("928b380c", new Object[]{this})).intValue() : this.f5773a;
    }
}
