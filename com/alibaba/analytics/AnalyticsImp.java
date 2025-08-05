package com.alibaba.analytics;

import android.app.Application;
import android.os.RemoteException;
import com.alibaba.analytics.IAnalytics;
import com.alibaba.analytics.core.config.b;
import com.alibaba.analytics.core.sync.p;
import com.alibaba.appmonitor.event.EventType;
import com.alibaba.mtl.appmonitor.Transaction;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import java.util.HashMap;
import java.util.Map;
import tb.aob;
import tb.apr;
import tb.aqg;
import tb.bsw;
import tb.btb;
import tb.cew;
import tb.kge;

/* loaded from: classes.dex */
public class AnalyticsImp extends IAnalytics.Stub {
    private static Application mApplication;

    static {
        kge.a(-1844096816);
    }

    @Override // com.alibaba.analytics.IAnalytics
    public String selfCheck(String str) throws RemoteException {
        return null;
    }

    public AnalyticsImp(Application application) {
        mApplication = application;
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void initUT() throws RemoteException {
        apr.b("AnalyticsImp", "initUT start..");
        aob.a().a(mApplication);
        apr.b("AnalyticsImp", "initUT end..");
    }

    public static Application getApplication() {
        return mApplication;
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void updateUserAccount(String str, String str2, String str3, String str4) throws RemoteException {
        try {
            com.ut.mini.e.getInstance().updateUserAccount(str, str2, str3, str4);
        } catch (VerifyError e) {
            apr.b(null, e, new Object[0]);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void setAppVersion(String str) throws RemoteException {
        try {
            com.ut.mini.e.getInstance().setAppVersion(str);
        } catch (VerifyError e) {
            apr.b(null, e, new Object[0]);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void setChannel(String str) throws RemoteException {
        try {
            com.ut.mini.e.getInstance().setChannel(str);
        } catch (VerifyError e) {
            apr.b(null, e, new Object[0]);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void updateSessionProperties(Map map) throws RemoteException {
        try {
            com.ut.mini.e.getInstance().updateSessionProperties(map);
        } catch (VerifyError e) {
            apr.b(null, e, new Object[0]);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void setSessionProperties(Map map) throws RemoteException {
        try {
            com.ut.mini.e.getInstance().setSessionProperties(map);
        } catch (VerifyError e) {
            apr.b(null, e, new Object[0]);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void turnOnDebug() throws RemoteException {
        try {
            com.ut.mini.e.getInstance().turnOnDebug();
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void transferLog(Map map) throws RemoteException {
        apr.b();
        try {
            if (!aob.a().I()) {
                aob.a().a(mApplication);
            }
            com.ut.mini.e.getInstance().transferLog(map);
        } catch (VerifyError e) {
            apr.b(null, e, new Object[0]);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void dispatchLocalHits() throws RemoteException {
        try {
            p.a().c();
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void saveCacheDataToLocal() throws RemoteException {
        try {
            com.ut.mini.e.getInstance().saveCacheDataToLocal();
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void init() throws RemoteException {
        try {
            initUT();
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void destroy() throws RemoteException {
        try {
            bsw.b();
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void triggerUpload() throws RemoteException {
        try {
            bsw.c();
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void setSampling(int i) throws RemoteException {
        try {
            bsw.b(i);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void enableLog(boolean z) throws RemoteException {
        try {
            bsw.a(z);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void setStatisticsInterval2(int i, int i2) throws RemoteException {
        try {
            bsw.a(getEventType(i), i2);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void setRequestAuthInfo(boolean z, boolean z2, String str, String str2) throws RemoteException {
        try {
            bsw.a(z, z2, str, str2);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void turnOnRealTimeDebug(Map map) throws RemoteException {
        try {
            aob.a().b(map);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void turnOffRealTimeDebug() throws RemoteException {
        try {
            aob.a().F();
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void counter_setStatisticsInterval(int i) throws RemoteException {
        try {
            bsw.b.a(i);
        } catch (VerifyError e) {
            apr.b(null, e, new Object[0]);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void counter_setSampling(int i) throws RemoteException {
        try {
            bsw.b.b(i);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public boolean counter_checkSampled(String str, String str2) throws RemoteException {
        try {
            return bsw.b.a(str, str2);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
            return false;
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void counter_commit1(String str, String str2, double d) throws RemoteException {
        try {
            bsw.b.a(str, str2, d);
        } catch (VerifyError e) {
            apr.b(null, e, new Object[0]);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void counter_commit2(String str, String str2, String str3, double d) throws RemoteException {
        try {
            bsw.b.a(str, str2, str3, d);
        } catch (VerifyError e) {
            apr.b(null, e, new Object[0]);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void alarm_setStatisticsInterval(int i) throws RemoteException {
        try {
            bsw.a.a(i);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void alarm_setSampling(int i) throws RemoteException {
        try {
            bsw.a.b(i);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public boolean alarm_checkSampled(String str, String str2) throws RemoteException {
        try {
            return bsw.a.a(str, str2);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
            return false;
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void alarm_commitSuccess1(String str, String str2) throws RemoteException {
        try {
            bsw.a.b(str, str2);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void alarm_commitSuccess2(String str, String str2, String str3) throws RemoteException {
        try {
            bsw.a.a(str, str2, str3);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void alarm_commitFail1(String str, String str2, String str3, String str4) throws RemoteException {
        try {
            bsw.a.a(str, str2, str3, str4);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void alarm_commitFail2(String str, String str2, String str3, String str4, String str5) throws RemoteException {
        try {
            bsw.a.a(str, str2, str3, str4, str5);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void offlinecounter_setStatisticsInterval(int i) throws RemoteException {
        try {
            bsw.c.a(i);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void offlinecounter_setSampling(int i) throws RemoteException {
        bsw.c.b(i);
    }

    @Override // com.alibaba.analytics.IAnalytics
    public boolean offlinecounter_checkSampled(String str, String str2) throws RemoteException {
        return bsw.c.a(str, str2);
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void offlinecounter_commit(String str, String str2, double d) throws RemoteException {
        bsw.c.a(str, str2, d);
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void setStatisticsInterval1(int i) throws RemoteException {
        try {
            bsw.a(i);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void register1(String str, String str2, MeasureSet measureSet) throws RemoteException {
        try {
            bsw.a(str, str2, measureSet);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void register2(String str, String str2, MeasureSet measureSet, boolean z) throws RemoteException {
        try {
            bsw.a(str, str2, measureSet, z);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void register3(String str, String str2, MeasureSet measureSet, DimensionSet dimensionSet) throws RemoteException {
        try {
            bsw.a(str, str2, measureSet, dimensionSet);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void register4(String str, String str2, MeasureSet measureSet, DimensionSet dimensionSet, boolean z) throws RemoteException {
        try {
            bsw.a(str, str2, measureSet, dimensionSet, z);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void stat_begin(String str, String str2, String str3) throws RemoteException {
        try {
            bsw.d.a(str, str2, str3);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void stat_end(String str, String str2, String str3) throws RemoteException {
        try {
            bsw.d.b(str, str2, str3);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void stat_setStatisticsInterval(int i) throws RemoteException {
        try {
            bsw.d.a(i);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void stat_setSampling(int i) throws RemoteException {
        try {
            bsw.d.b(i);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public boolean stat_checkSampled(String str, String str2) throws RemoteException {
        return bsw.d.a(str, str2);
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void stat_commit1(String str, String str2, double d) throws RemoteException {
        try {
            bsw.d.a(str, str2, d);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void stat_commit2(String str, String str2, DimensionValueSet dimensionValueSet, double d) throws RemoteException {
        try {
            bsw.d.a(str, str2, dimensionValueSet, d);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void stat_commit3(String str, String str2, DimensionValueSet dimensionValueSet, MeasureValueSet measureValueSet) throws RemoteException {
        try {
            bsw.d.a(str, str2, dimensionValueSet, measureValueSet);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    private EventType getEventType(int i) {
        return EventType.getEventType(i);
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void transaction_begin(Transaction transaction, String str) throws RemoteException {
        try {
            btb.a(transaction, str);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void transaction_end(Transaction transaction, String str) throws RemoteException {
        try {
            btb.b(transaction, str);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void updateMeasure(String str, String str2, String str3, double d, double d2, double d3) throws RemoteException {
        bsw.a(str, str2, str3, d, d2, d3);
    }

    @Override // com.alibaba.analytics.IAnalytics
    public String getValue(String str) throws RemoteException {
        try {
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
        if (b.KEY.equals(str)) {
            return com.alibaba.analytics.core.config.f.a().a(str);
        }
        if ("tpk_md5".equals(str)) {
            return aob.a().h();
        }
        if ("tpk_string".equals(str)) {
            return aob.a().i();
        }
        if ("session_timestamp".equals(str)) {
            return "" + com.alibaba.analytics.core.logbuilder.f.a().b();
        }
        if ("autoExposure".equalsIgnoreCase(str)) {
            return com.alibaba.analytics.core.config.f.a().a(str);
        }
        return null;
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void setGlobalProperty(String str, String str2) throws RemoteException {
        try {
            bsw.a(str, str2);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void removeGlobalProperty(String str) throws RemoteException {
        try {
            bsw.a(str);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void sessionTimeout() throws RemoteException {
        try {
            com.ut.mini.e.getInstance().sessionTimeout();
        } catch (VerifyError e) {
            apr.b(null, e, new Object[0]);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void onBackground() throws RemoteException {
        try {
            saveCacheDataToLocal();
            aqg.a();
        } catch (VerifyError e) {
            apr.b(null, e, new Object[0]);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void onForeground() throws RemoteException {
        try {
            aqg.b();
        } catch (VerifyError e) {
            apr.b(null, e, new Object[0]);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void startMainProcess(long j) throws RemoteException {
        try {
            apr.b("AnalyticsImp", "startMainProcess", Long.valueOf(j));
            if (j == 0) {
                return;
            }
            long M = aob.a().M();
            if (M == 0) {
                aob.a().a(j);
            } else if (M == j) {
            } else {
                sessionTimeout();
                if (j - M <= cew.a.CONFIG_TRACK_1022_INTERVAL_TIME) {
                    return;
                }
                aob.a().a(j);
                setSessionProperties(new HashMap());
            }
        } catch (VerifyError e) {
            apr.b(null, e, new Object[0]);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }
}
