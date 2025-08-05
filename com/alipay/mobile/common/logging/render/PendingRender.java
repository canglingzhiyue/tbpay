package com.alipay.mobile.common.logging.render;

import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.IRender;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.abtest.AbtestInfoGetter;
import com.alipay.mobile.common.logging.api.abtest.AbtestInfoGetterV2;
import com.alipay.mobile.common.logging.api.antevent.AntEvent;
import com.alipay.mobile.common.logging.api.antevent.AntEventWrapper;
import com.alipay.mobile.common.logging.api.behavor.Behavor;
import com.alipay.mobile.common.logging.api.monitor.Performance;
import com.alipay.mobile.common.logging.api.monitor.PerformanceID;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.common.logging.strategy.GlobalLogConfigService;
import com.alipay.mobile.common.logging.strategy.LogLengthConfig;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class PendingRender implements IRender {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f5450a = new ArrayList<String>() { // from class: com.alipay.mobile.common.logging.render.PendingRender.1
        {
            add("keybiztrace");
            add(LogCategory.CATEGORY_LOGMONITOR);
            add("exception");
            add("crash");
            add(LogCategory.CATEGORY_HIGHAVAIL);
            add("apm");
        }
    };
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public boolean i;
    private BaseRender j;
    private Object[] k;

    public static PendingRender a(PerformanceRender performanceRender, Object obj, Object obj2, Object obj3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PendingRender) ipChange.ipc$dispatch("55125f81", new Object[]{performanceRender, obj, obj2, obj3});
        }
        if (performanceRender != null) {
            return new PendingRender(performanceRender, new Object[]{obj, obj2, obj3}, false);
        }
        return null;
    }

    public static PendingRender a(BehavorRender behavorRender, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PendingRender) ipChange.ipc$dispatch("e3fdce58", new Object[]{behavorRender, obj, obj2});
        }
        if (behavorRender != null) {
            return new PendingRender(behavorRender, new Object[]{obj, obj2}, false);
        }
        return null;
    }

    public static PendingRender a(BehavorRender behavorRender, Object obj, Object obj2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PendingRender) ipChange.ipc$dispatch("25104b9a", new Object[]{behavorRender, obj, obj2, new Boolean(z)});
        }
        if (behavorRender != null) {
            return new PendingRender(behavorRender, new Object[]{obj, obj2}, z);
        }
        return null;
    }

    public static PendingRender a(AntEventRender antEventRender, AntEvent antEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PendingRender) ipChange.ipc$dispatch("8d6802c5", new Object[]{antEventRender, antEvent});
        }
        if (antEventRender != null) {
            return new PendingRender(antEventRender, new Object[]{antEvent}, antEvent.isNeedAbtest());
        }
        return null;
    }

    private PendingRender(BaseRender baseRender, Object[] objArr, boolean z) {
        this.i = false;
        this.j = baseRender;
        this.k = objArr;
        this.i = z;
        try {
            this.b = LoggingUtil.getNowTime();
            this.c = LoggerFactory.getLogContext().getContextParam(LogContext.STORAGE_REFVIEWID);
            this.d = LoggerFactory.getLogContext().getContextParam(LogContext.STORAGE_VIEWID);
            this.e = LoggerFactory.getLogContext().getContextParam(LogContext.LOCAL_STORAGE_ACTIONID);
            this.f = LoggerFactory.getLogContext().getContextParam(LogContext.LOCAL_STORAGE_ACTIONTOKEN);
            this.g = LoggerFactory.getLogContext().getContextParam(LogContext.STORAGE_APPID);
            this.h = LoggerFactory.getLogContext().getContextParam(LogContext.LOCAL_STORAGE_REFER);
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().warn("PendingRender", th);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.IRender
    public String doRender() {
        AbtestInfoGetter abtestInfoGetter;
        Map<String, String> extInfoForSpmID;
        String str;
        String str2;
        String str3;
        int i;
        String a2;
        String str4;
        int length;
        AbtestInfoGetter abtestInfoGetter2;
        Map<String, String> extInfoForSpmID2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6534398", new Object[]{this});
        }
        BaseRender baseRender = this.j;
        if (baseRender == null) {
            return null;
        }
        try {
            if (baseRender instanceof BehavorRender) {
                Behavor behavor = (Behavor) this.k[1];
                if (this.i && behavor != null && TextUtils.isEmpty(behavor.getAbTestInfo()) && LoggerFactory.getLogContext() != null && (abtestInfoGetter2 = LoggerFactory.getLogContext().getAbtestInfoGetter()) != null) {
                    String seedID = behavor.getSeedID();
                    if (!TextUtils.isEmpty(seedID) && seedID.contains(".")) {
                        behavor.setAbTestInfo(abtestInfoGetter2.getLogForSpmID(seedID));
                        if ((abtestInfoGetter2 instanceof AbtestInfoGetterV2) && (extInfoForSpmID2 = ((AbtestInfoGetterV2) abtestInfoGetter2).getExtInfoForSpmID(seedID)) != null) {
                            for (Map.Entry<String, String> entry : extInfoForSpmID2.entrySet()) {
                                behavor.addExtParam(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                }
                String a3 = ((BehavorRender) this.j).a((String) this.k[0], behavor, this);
                if (a3 == null) {
                    return a3;
                }
                int length2 = a3.getBytes().length;
                String behaviourPro = ((Behavor) this.k[1]).getBehaviourPro();
                if (length2 <= 16384 || f5450a.contains(behaviourPro) || !LogLengthConfig.a().f5453a) {
                    return a3;
                }
                Behavor behavor2 = new Behavor();
                behavor2.setSeedID("LogLength");
                behavor2.setParam1(behaviourPro);
                behavor2.setParam2(((Behavor) this.k[1]).getSeedID());
                behavor2.setParam3(String.valueOf(length2));
                behavor2.setLoggerLevel(3);
                behavor2.setBehaviourPro(LogCategory.CATEGORY_LOGMONITOR);
                return ((BehavorRender) this.j).a("event", behavor2, this);
            } else if (baseRender instanceof PerformanceRender) {
                if (this.k[0] instanceof PerformanceID) {
                    str4 = ((PerformanceID) this.k[0]).getDes();
                    Performance performance = (Performance) this.k[1];
                    Map<String, String> map = (Map) this.k[2];
                    String subType = performance.getSubType();
                    String param1 = performance.getParam1();
                    String param2 = performance.getParam2();
                    String param3 = performance.getParam3();
                    String pageId = performance.getPageId();
                    Map<String, String> extPramas = performance.getExtPramas();
                    int loggerLevel = performance.getLoggerLevel();
                    i = 16384;
                    str = "LogLength";
                    str2 = LogCategory.CATEGORY_LOGMONITOR;
                    str3 = "event";
                    a2 = ((PerformanceRender) this.j).a((PerformanceID) this.k[0], subType, param1, param2, param3, pageId, extPramas, map, loggerLevel, this);
                } else {
                    str = "LogLength";
                    str2 = LogCategory.CATEGORY_LOGMONITOR;
                    str3 = "event";
                    i = 16384;
                    String str5 = (String) this.k[0];
                    PerformanceRender performanceRender = (PerformanceRender) baseRender;
                    String str6 = (String) this.k[0];
                    Performance performance2 = (Performance) this.k[1];
                    a2 = performanceRender.a(str6, performance2.getSubType(), performance2.getParam1(), performance2.getParam2(), performance2.getParam3(), performance2.getPageId(), performance2.getExtPramas(), (Map) this.k[2], performance2.getLoggerLevel(), this);
                    str4 = str5;
                }
                if (a2 == null || (length = a2.getBytes().length) <= i || f5450a.contains(str4) || !LogLengthConfig.a().f5453a) {
                    return a2;
                }
                Behavor behavor3 = new Behavor();
                behavor3.setSeedID(str);
                behavor3.setParam1(str4);
                behavor3.setParam2(((Performance) this.k[1]).getSubType());
                behavor3.setParam3(String.valueOf(length));
                behavor3.setLoggerLevel(3);
                behavor3.setBehaviourPro(str2);
                return new BehavorRender(LoggerFactory.getLogContext()).a(str3, behavor3, this);
            } else if (!(baseRender instanceof AntEventRender) || !(this.k[0] instanceof AntEvent)) {
                return null;
            } else {
                AntEvent antEvent = (AntEvent) this.k[0];
                if (this.i && antEvent != null && TextUtils.isEmpty(antEvent.getAbtestId()) && LoggerFactory.getLogContext() != null && (abtestInfoGetter = LoggerFactory.getLogContext().getAbtestInfoGetter()) != null) {
                    String str7 = antEvent.getExtParams().get("spm");
                    if (!TextUtils.isEmpty(str7) && str7.contains(".")) {
                        new AntEventWrapper(antEvent).setAbtestId(abtestInfoGetter.getLogForSpmID(str7));
                        if ((abtestInfoGetter instanceof AbtestInfoGetterV2) && (extInfoForSpmID = ((AbtestInfoGetterV2) abtestInfoGetter).getExtInfoForSpmID(str7)) != null) {
                            for (Map.Entry<String, String> entry2 : extInfoForSpmID.entrySet()) {
                                antEvent.getExtParams().put(entry2.getKey(), entry2.getValue());
                            }
                        }
                    }
                }
                String a4 = ((AntEventRender) this.j).a(antEvent);
                int length3 = a4.getBytes().length;
                if (length3 > 16384) {
                    GlobalLogConfigService.a();
                    if (GlobalLogConfigService.c()) {
                        TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                        traceLogger.warn("PendingRender", "bizType= " + antEvent.getBizType() + " ,len= " + length3 + " ,eventid= " + antEvent.getEventID() + " ,exceed 16k, discard it");
                        Behavor behavor4 = new Behavor();
                        behavor4.setSeedID("LogLength");
                        behavor4.setParam1(antEvent.getBizType());
                        behavor4.setParam2(antEvent.getEventID());
                        behavor4.setParam3(String.valueOf(length3));
                        behavor4.setLoggerLevel(3);
                        behavor4.setBehaviourPro(LogCategory.CATEGORY_LOGMONITOR);
                        return new BehavorRender(LoggerFactory.getLogContext()).a("event", behavor4, this);
                    }
                }
                return a4;
            }
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().warn("PendingRender", th);
            return null;
        }
    }
}
