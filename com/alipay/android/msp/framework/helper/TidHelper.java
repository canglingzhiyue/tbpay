package com.alipay.android.msp.framework.helper;

import android.content.Context;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.helper.Tid;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.sys.DeviceInfo;
import com.alipay.android.msp.framework.tid.TidStorage;
import com.alipay.android.msp.network.MiscRequestUtils;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.FlybirdUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.e;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public class TidHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f4792a = false;
    private static final Lock b = new ReentrantLock();

    public static Tid loadTID(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Tid) ipChange.ipc$dispatch("575df2d6", new Object[]{context}) : loadTID(context, "");
    }

    public static Tid loadTID(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Tid) ipChange.ipc$dispatch("9d849c20", new Object[]{context, str});
        }
        LogUtil.record(2, "phonecashier", "TidHelper:loadTID", e.RECORD_EXECUTE);
        a(context);
        return TidStorage.getInstance(context).getTID();
    }

    public static synchronized Tid loadOrCreateTID(Context context) {
        Tid query;
        synchronized (TidHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Tid) ipChange.ipc$dispatch("3ec5c1f5", new Object[]{context});
            }
            LogUtil.record(4, "phonecashier", "TidHelper:loadOrCreateTID", "start");
            a(context);
            Tid tid = TidStorage.getInstance(context).getTID();
            if (tid != null && !tid.isEmpty()) {
                query = tid;
                return query;
            }
            StatisticInfo statisticInfo = new StatisticInfo(-1);
            statisticInfo.updateAttr(Vector.Trade, "bizType", "tid");
            if (Looper.myLooper() == Looper.getMainLooper()) {
                LogUtil.record(2, "phonecashier", "TidHelper.loadOrCreateTID", "in mainLooper");
                StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, "TidLoadFail_mainLooper", new Exception());
                statisticInfo.onStatisticEnd();
                return null;
            }
            query = MiscRequestUtils.TidRequest.query(context, statisticInfo);
            statisticInfo.onStatisticEnd();
            return query;
        }
    }

    public static String getTIDValue(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62db7737", new Object[]{context});
        }
        Tid loadOrCreateTID = loadOrCreateTID(context);
        return (loadOrCreateTID == null || loadOrCreateTID.isEmpty()) ? "" : loadOrCreateTID.getTid();
    }

    public static boolean resetTID(Context context) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25192465", new Object[]{context})).booleanValue();
        }
        LogUtil.record(2, "phonecashier", "TidHelper.resetTID", "resetTID");
        StatisticInfo statisticInfo = new StatisticInfo(-1);
        statisticInfo.updateAttr(Vector.Trade, "bizType", "tid");
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Exception exc = new Exception("不能在主线程中调用此方法");
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, "TidClearFail_mainLooper", exc);
            statisticInfo.onStatisticEnd();
            throw exc;
        }
        a(context);
        clearTID();
        statisticInfo.addEvent(new StEvent("", "TidClear", ""));
        Tid query = MiscRequestUtils.TidRequest.query(context, statisticInfo);
        statisticInfo.onStatisticEnd();
        return query != null && !query.isEmpty();
    }

    public static void clearTID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("774d0289", new Object[0]);
        } else {
            TidStorage.getInstance().delete();
        }
    }

    public static String getIMEI(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("95cf663d", new Object[]{context});
        }
        a(context);
        return DeviceInfo.getInstance(context).getIMEI(context);
    }

    public static String getIMSI(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bee4406f", new Object[]{context});
        }
        a(context);
        return DeviceInfo.getInstance(context).getIMSI(context);
    }

    public static String getVirtualImei(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ecb781c", new Object[]{context});
        }
        a(context);
        return MspConfig.getInstance().getVirtualImei();
    }

    public static String getVirtualImsi(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7e0524e", new Object[]{context});
        }
        a(context);
        return MspConfig.getInstance().getVirtualImsi();
    }

    private static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        try {
            synchronized (b) {
                GlobalHelper.getInstance().init(context);
                if (f4792a) {
                    return;
                }
                f4792a = true;
                PhoneCashierMspEngine.getMspBase().loadProperties(context);
                FlybirdUtil.initLoggingSdk(context);
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    public static Tid loadLocalTid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Tid) ipChange.ipc$dispatch("f4e5044f", new Object[0]) : TidStorage.getInstance().getTID();
    }

    public static void updateMspSwitch(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a91c6159", new Object[]{context, map});
        } else if (map == null) {
        } else {
            String str = map.get("msp_switch");
            if (StringUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject parseObject = JSON.parseObject(str);
                JSONObject jSONObject = parseObject.getJSONObject("content");
                String string = parseObject.getString(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION);
                if (StringUtils.isEmpty(string)) {
                    return;
                }
                DrmManager.getInstance(context).onUpdate(jSONObject, string);
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }
}
