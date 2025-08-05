package com.taobao.android.tschedule.cache;

import android.os.AsyncTask;
import android.os.SystemClock;
import anetwork.channel.Header;
import anetwork.channel.Param;
import anetwork.channel.Request;
import anetwork.channel.Response;
import anetwork.channel.statist.StatisticData;
import com.alibaba.fastjson.JSON;
import com.alibaba.security.realidentity.u2;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.android.tschedule.i;
import com.taobao.android.tscheduleprotocol.ScheduleCache;
import com.taobao.android.tscheduleprotocol.ScheduleCacheCallBack;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.jmc;
import tb.kge;

/* loaded from: classes6.dex */
public class TScheduleHttpCache implements ScheduleCache<Object, Response, AsyncTask> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final Response EMPTAY_RESPONSE;
    private static final String TAG = "TS.httpCache";
    private static Map<Object, HttpCacheData> cacheData;

    /* renamed from: com.taobao.android.tschedule.cache.TScheduleHttpCache$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15657a = new int[ScheduleCacheCallBack.ScheduleCacheCallBackType.values().length];

        static {
            try {
                f15657a[ScheduleCacheCallBack.ScheduleCacheCallBackType.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15657a[ScheduleCacheCallBack.ScheduleCacheCallBackType.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15657a[ScheduleCacheCallBack.ScheduleCacheCallBackType.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15657a[ScheduleCacheCallBack.ScheduleCacheCallBackType.EXPIRE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15657a[ScheduleCacheCallBack.ScheduleCacheCallBackType.FULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public class HttpCacheData implements Serializable {
        public ScheduleCacheCallBack callback;
        public Object key;
        public Request reqData;
        public Response response;
        public AsyncTask runningTask;
        public long startTime = SystemClock.uptimeMillis();
        public ScheduleProtocolCallback taskCallback;

        static {
            kge.a(-221692685);
            kge.a(1028243835);
        }

        public HttpCacheData(Object obj, ScheduleProtocolCallback scheduleProtocolCallback) {
            this.key = obj;
            this.taskCallback = scheduleProtocolCallback;
        }
    }

    public static /* synthetic */ void access$000(TScheduleHttpCache tScheduleHttpCache, Object obj, ScheduleCacheCallBack.ScheduleCacheCallBackType scheduleCacheCallBackType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66c67e6b", new Object[]{tScheduleHttpCache, obj, scheduleCacheCallBackType});
        } else {
            tScheduleHttpCache.clearBefore(obj, scheduleCacheCallBackType);
        }
    }

    static {
        kge.a(-2034676397);
        kge.a(-1943134356);
        cacheData = new ConcurrentHashMap(32);
        EMPTAY_RESPONSE = new Response() { // from class: com.taobao.android.tschedule.cache.TScheduleHttpCache.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anetwork.channel.Response
            public Map<String, List<String>> getConnHeadFields() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Map) ipChange.ipc$dispatch("3de6d7b7", new Object[]{this});
                }
                return null;
            }

            @Override // anetwork.channel.Response
            public String getDesc() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("f24b4252", new Object[]{this});
                }
                return null;
            }

            @Override // anetwork.channel.Response
            public Throwable getError() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Throwable) ipChange.ipc$dispatch("4db6723e", new Object[]{this});
                }
                return null;
            }

            @Override // anetwork.channel.Response
            public StatisticData getStatisticData() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (StatisticData) ipChange.ipc$dispatch("396a8f27", new Object[]{this});
                }
                return null;
            }

            @Override // anetwork.channel.Response
            public int getStatusCode() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("eae362ef", new Object[]{this})).intValue();
                }
                return -20190718;
            }

            @Override // anetwork.channel.Response
            public byte[] getBytedata() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("6e9b5c0e", new Object[]{this}) : new byte[0];
            }
        };
    }

    public void saveReqData(Object obj, Request request) {
        HttpCacheData httpCacheData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e0105c", new Object[]{this, obj, request});
        } else if (request == null || (httpCacheData = cacheData.get(obj)) == null) {
        } else {
            httpCacheData.reqData = request;
        }
    }

    @Override // com.taobao.android.tscheduleprotocol.ScheduleCache
    public void prefetch(Object obj, AsyncTask asyncTask, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ae4cbfe", new Object[]{this, obj, asyncTask, objArr});
            return;
        }
        clearBefore(obj, ScheduleCacheCallBack.ScheduleCacheCallBackType.CANCEL);
        cacheData.put(obj, new HttpCacheData(obj, (objArr == null || objArr.length == 0) ? null : objArr[0]));
    }

    @Override // com.taobao.android.tscheduleprotocol.ScheduleCache
    public void finish(final Object obj, Response response, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ecb7b55", new Object[]{this, obj, response, objArr});
            return;
        }
        HttpCacheData httpCacheData = cacheData.get(obj);
        if (httpCacheData == null) {
            return;
        }
        if (response == null) {
            response = EMPTAY_RESPONSE;
        }
        httpCacheData.response = response;
        httpCacheData.runningTask = null;
        if (httpCacheData.callback != null) {
            callbackBiz(obj);
            return;
        }
        long j = 10000;
        if (objArr != null && objArr.length > 0) {
            try {
                j = Long.valueOf(objArr[0].toString()).longValue();
            } catch (Throwable unused) {
            }
        }
        i.b().a(new Runnable() { // from class: com.taobao.android.tschedule.cache.TScheduleHttpCache.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    TScheduleHttpCache.access$000(TScheduleHttpCache.this, obj, ScheduleCacheCallBack.ScheduleCacheCallBackType.EXPIRE);
                }
            }
        }, j);
    }

    @Override // com.taobao.android.tscheduleprotocol.ScheduleCache
    public void fetch(Object obj, ScheduleCacheCallBack scheduleCacheCallBack, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df0a1056", new Object[]{this, obj, scheduleCacheCallBack, objArr});
        } else if (scheduleCacheCallBack == null) {
        } else {
            if (obj == null) {
                scheduleCacheCallBack.onFinish(ScheduleCacheCallBack.ScheduleCacheCallBackType.FAILED, null, new Object[0]);
                return;
            }
            String configPath = getConfigPath(obj.toString());
            HttpCacheData httpCacheData = cacheData.get(configPath);
            if (httpCacheData == null) {
                scheduleCacheCallBack.onFinish(ScheduleCacheCallBack.ScheduleCacheCallBackType.FAILED, null, new Object[0]);
                return;
            }
            httpCacheData.callback = scheduleCacheCallBack;
            if (httpCacheData.runningTask != null) {
                return;
            }
            callbackBiz(configPath);
        }
    }

    private void callbackBiz(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5cfc4b1", new Object[]{this, obj});
            return;
        }
        try {
            HttpCacheData remove = cacheData.remove(obj);
            Response response = remove == null ? null : remove.response;
            ScheduleCacheCallBack.ScheduleCacheCallBackType scheduleCacheCallBackType = response == null ? ScheduleCacheCallBack.ScheduleCacheCallBackType.FAILED : ScheduleCacheCallBack.ScheduleCacheCallBackType.SUCCESS;
            HashMap<String, String> track = track(scheduleCacheCallBackType, remove);
            if (remove.callback != null) {
                remove.callback.onFinish(scheduleCacheCallBackType, response, new Object[0]);
            }
            if (remove.taskCallback == null) {
                return;
            }
            ScheduleProtocolCallback.ScheduleProtocolCallbackType scheduleProtocolCallbackType = response == null ? ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_MISS : ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_HIT;
            track.put("taskType", "http");
            remove.taskCallback.onPreload(scheduleProtocolCallbackType, track);
        } catch (Throwable th) {
            jmc.a("downgrade", obj.toString(), "1.0", "TSchedule", "http", null, "TS_HTTP_EXCEPTION", th.getMessage());
        }
    }

    private void clearBefore(Object obj, ScheduleCacheCallBack.ScheduleCacheCallBackType scheduleCacheCallBackType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5acf41a7", new Object[]{this, obj, scheduleCacheCallBackType});
            return;
        }
        try {
            HttpCacheData remove = cacheData.remove(obj);
            if (remove == null) {
                return;
            }
            if (remove.runningTask == null && remove.response == null) {
                return;
            }
            if (remove.runningTask != null) {
                try {
                    remove.runningTask.cancel(true);
                } catch (Throwable unused) {
                }
            }
            track(scheduleCacheCallBackType, remove);
        } catch (Throwable th) {
            jmc.a("downgrade", obj.toString(), "1.0", "TSchedule", "http", null, "TS_HTTP_EXCEPTION", th.getMessage());
        }
    }

    private HashMap<String, String> track(ScheduleCacheCallBack.ScheduleCacheCallBackType scheduleCacheCallBackType, HttpCacheData httpCacheData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("15980627", new Object[]{this, scheduleCacheCallBackType, httpCacheData});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(HiAnalyticsConstant.BI_KEY_COST_TIME, String.valueOf(SystemClock.uptimeMillis() - httpCacheData.startTime));
        if (scheduleCacheCallBackType == ScheduleCacheCallBack.ScheduleCacheCallBackType.SUCCESS) {
            jmc.a("downgrade", httpCacheData.key.toString(), "1.0", "TSchedule", "http", hashMap);
            return hashMap;
        }
        if (httpCacheData.reqData != null) {
            hashMap.put("req_url", httpCacheData.reqData.getUrlString());
            List<Header> headers = httpCacheData.reqData.getHeaders();
            if (headers != null && !headers.isEmpty()) {
                hashMap.put("headers", JSON.toJSONString(headers));
            }
            List<Param> params = httpCacheData.reqData.getParams();
            if (params != null && !params.isEmpty()) {
                hashMap.put("api_params", JSON.toJSONString(params));
            }
        }
        StatisticData statisticData = httpCacheData.response == null ? null : httpCacheData.response.getStatisticData();
        HashMap<String, String> sumNetStat = statisticData != null ? sumNetStat(statisticData) : hashMap;
        jmc.a("downgrade", httpCacheData.key.toString(), "1.0", "TSchedule", "http", sumNetStat, getUCode(scheduleCacheCallBackType), null);
        return sumNetStat;
    }

    private String getUCode(ScheduleCacheCallBack.ScheduleCacheCallBackType scheduleCacheCallBackType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb44a055", new Object[]{this, scheduleCacheCallBackType});
        }
        int i = AnonymousClass3.f15657a[scheduleCacheCallBackType.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "TS_HTTP_OTHER" : "TS_HTTP_FULL" : "TS_HTTP_EXPIRE" : "TS_HTTP_CANCEL" : "TS_HTTP_FAILED" : "TS_HTTP_SUCCESS";
    }

    private String getConfigPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5818c912", new Object[]{this, str});
        }
        int indexOf = str.indexOf("?");
        return indexOf > 0 ? str.substring(0, indexOf) : str;
    }

    private HashMap<String, String> sumNetStat(StatisticData statisticData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e1c0b4cc", new Object[]{this, statisticData});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("isSuccess", String.valueOf(statisticData.isRequestSuccess));
        hashMap.put("host", String.valueOf(statisticData.host));
        hashMap.put("resultCode", String.valueOf(statisticData.resultCode));
        hashMap.put(u2.k, String.valueOf(statisticData.retryTime));
        return hashMap;
    }
}
