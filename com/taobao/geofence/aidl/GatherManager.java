package com.taobao.geofence.aidl;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.fence.client.TBFenceClient;
import com.taobao.fence.common.ContentData;
import com.taobao.fence.common.FenceDataDTO;
import com.taobao.fence.common.ResultEnums;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;
import tb.nea;
import tb.riy;

/* loaded from: classes7.dex */
public class GatherManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG = "lbs_sdk.fence_GatherManager";
    private static final long WAIT_TIME = 4000;
    private Map<TBFenceClient.TypeEnum, CacheData> cache;
    private boolean isGatherIbeacon;
    private boolean isGatherLocation;
    private boolean isGatherWifi;
    private long time;
    private List<String> uuidList;
    private volatile AtomicInteger dataCount = new AtomicInteger(0);
    private volatile int gatherCount = 0;
    private IBeaconGather beaconGather = null;
    private WifiGather wifiGather = null;
    private LocationGather locationGather = null;
    private volatile Object mutex = new Object();
    private FenceDataDTO fenceDataDTO = new FenceDataDTO(true, ResultEnums.SUCCESS);

    static {
        kge.a(534869199);
    }

    public GatherManager(int i, long j, List<String> list, Map<TBFenceClient.TypeEnum, CacheData> map) {
        boolean z = false;
        this.uuidList = null;
        this.cache = null;
        setGatherLocation((TBFenceClient.TypeEnum.GEOMETRY.type & i) == TBFenceClient.TypeEnum.GEOMETRY.type);
        setGatherWifi((TBFenceClient.TypeEnum.WIFI.type & i) == TBFenceClient.TypeEnum.WIFI.type);
        setGatherIbeacon((i & TBFenceClient.TypeEnum.IBEACON.type) == TBFenceClient.TypeEnum.IBEACON.type ? true : z);
        this.time = j;
        this.uuidList = list;
        this.cache = map;
        AppMonitor.Counter.commit("passivelocation", "geofenceGather", 1.0d);
    }

    public ResultEnums check() {
        ResultEnums check;
        ResultEnums check2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResultEnums) ipChange.ipc$dispatch("d8c6307e", new Object[]{this});
        }
        if (this.gatherCount <= 0) {
            return ResultEnums.PARAMETER_FAIL;
        }
        if (this.isGatherLocation && (check2 = this.locationGather.check()) != null) {
            return check2;
        }
        if (this.isGatherWifi && (check = this.wifiGather.check()) != null) {
            return check;
        }
        if (!this.isGatherIbeacon) {
            return null;
        }
        List<String> list = this.uuidList;
        if (list == null || list.isEmpty()) {
            return ResultEnums.NOT_EXSIT_UUID;
        }
        ResultEnums check3 = this.beaconGather.check();
        if (check3 == null) {
            return null;
        }
        return check3;
    }

    public void gather() {
        ResultEnums resultEnums;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9c06d02", new Object[]{this});
            return;
        }
        nea.a(LOG, "gather thread id=" + Thread.currentThread().getId() + ";mutex=" + this.mutex.hashCode() + ";count=" + this.dataCount.get() + ";" + this.dataCount.hashCode());
        if (this.isGatherLocation && this.locationGather.check() == null) {
            this.locationGather.startGather();
        }
        if (this.isGatherWifi && this.wifiGather.check() == null) {
            this.wifiGather.startGather();
        }
        if (!this.isGatherIbeacon) {
            return;
        }
        List<String> list = this.uuidList;
        if (list == null || list.isEmpty()) {
            resultEnums = ResultEnums.NOT_EXSIT_UUID;
        } else {
            resultEnums = this.beaconGather.check();
        }
        if (resultEnums != null) {
            return;
        }
        this.beaconGather.startGather(JSON.toJSONString(this.uuidList));
    }

    public FenceDataDTO getGatherData() {
        ResultEnums resultEnums;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FenceDataDTO) ipChange.ipc$dispatch("3391a66c", new Object[]{this});
        }
        if (this.isGatherLocation) {
            ResultEnums check = this.locationGather.check();
            if (check == null) {
                if (cacheValid(TBFenceClient.TypeEnum.GEOMETRY)) {
                    String cacheValue = getCacheValue(TBFenceClient.TypeEnum.GEOMETRY);
                    if (cacheValue != null) {
                        this.fenceDataDTO.locationStr = cacheValue;
                    } else {
                        nea.d(LOG, "[getGatherData] data null error");
                    }
                    this.dataCount.incrementAndGet();
                } else {
                    this.locationGather.startGather();
                }
            } else {
                this.fenceDataDTO.locationStr = JSON.toJSONString(new ContentData(false, check));
                this.dataCount.incrementAndGet();
            }
        }
        if (this.isGatherWifi) {
            ResultEnums check2 = this.wifiGather.check();
            if (check2 == null) {
                if (cacheValid(TBFenceClient.TypeEnum.WIFI)) {
                    this.fenceDataDTO.wifiStr = getCacheValue(TBFenceClient.TypeEnum.WIFI);
                    this.dataCount.incrementAndGet();
                } else {
                    this.wifiGather.startGather();
                }
            } else {
                this.fenceDataDTO.wifiStr = JSON.toJSONString(new ContentData(false, check2));
                this.dataCount.incrementAndGet();
            }
        }
        if (this.isGatherIbeacon) {
            List<String> list = this.uuidList;
            if (list == null || list.isEmpty()) {
                resultEnums = ResultEnums.NOT_EXSIT_UUID;
            } else {
                resultEnums = this.beaconGather.check();
            }
            if (resultEnums == null) {
                if (cacheValid(TBFenceClient.TypeEnum.IBEACON) && extKeyEqual(TBFenceClient.TypeEnum.IBEACON, JSON.toJSONString(this.uuidList))) {
                    this.fenceDataDTO.ibeaconStr = getCacheValue(TBFenceClient.TypeEnum.IBEACON);
                    this.dataCount.incrementAndGet();
                } else {
                    this.beaconGather.startGather(JSON.toJSONString(this.uuidList));
                }
            } else {
                this.fenceDataDTO.ibeaconStr = JSON.toJSONString(new ContentData(false, resultEnums));
                this.dataCount.incrementAndGet();
            }
        }
        synchronized (this.mutex) {
            if (this.dataCount.get() != this.gatherCount) {
                try {
                    nea.a(LOG, "wait thread id=" + Thread.currentThread().getId() + ";mutex=" + this.mutex.hashCode() + ";max time=4000");
                    this.mutex.wait(4000L);
                } catch (InterruptedException e) {
                    nea.a(LOG, "[getGatherData] InterruptedException", e);
                }
            }
        }
        nea.a(LOG, "notify thread id=" + Thread.currentThread().getId() + ";mutex=" + this.mutex.hashCode() + ";count=" + this.dataCount.get() + ";" + this.dataCount.hashCode());
        nea.d(LOG, "[getGatherData] process success");
        return this.fenceDataDTO;
    }

    public void setGatherData(TBFenceClient.TypeEnum typeEnum, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da48c563", new Object[]{this, typeEnum, str});
        } else {
            setGatherData(typeEnum, str, null);
        }
    }

    public void setGatherData(TBFenceClient.TypeEnum typeEnum, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12a7c6d", new Object[]{this, typeEnum, str, str2});
            return;
        }
        nea.d(LOG, "[setGatherData] type=" + typeEnum + ";content=" + str);
        ContentData contentData = new ContentData(true, ResultEnums.SUCCESS);
        contentData.content = str;
        if (str2 != null) {
            contentData.extraContent = str2;
        }
        String jSONString = JSON.toJSONString(contentData);
        if (typeEnum == TBFenceClient.TypeEnum.IBEACON) {
            this.fenceDataDTO.ibeaconStr = jSONString;
            this.cache.put(typeEnum, new CacheData(jSONString, System.currentTimeMillis(), JSON.toJSONString(this.uuidList)));
        } else {
            if (typeEnum == TBFenceClient.TypeEnum.WIFI) {
                this.fenceDataDTO.wifiStr = jSONString;
            } else if (typeEnum == TBFenceClient.TypeEnum.GEOMETRY) {
                this.fenceDataDTO.locationStr = jSONString;
            }
            this.cache.put(typeEnum, new CacheData(jSONString, System.currentTimeMillis(), null));
        }
        synchronized (this.mutex) {
            if (this.dataCount.incrementAndGet() == this.gatherCount) {
                nea.a(LOG, "wait thread name=" + Thread.currentThread().getName() + ";mutex=" + this.mutex.hashCode() + ";count=" + this.dataCount.get() + ";" + this.dataCount.hashCode());
                this.mutex.notifyAll();
            }
        }
    }

    public void setGatherLocation(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db8be69b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isGatherLocation = z;
        if (!z) {
            return;
        }
        this.locationGather = new LocationGather(this);
        this.gatherCount++;
    }

    public void setGatherWifi(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a23ecbb", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isGatherWifi = z;
        if (!z) {
            return;
        }
        this.wifiGather = new WifiGather(this);
        this.gatherCount++;
    }

    public void setGatherIbeacon(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f60146fd", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isGatherIbeacon = z;
        if (!z) {
            return;
        }
        this.beaconGather = new IBeaconGather(this);
        this.gatherCount++;
    }

    private boolean cacheValid(TBFenceClient.TypeEnum typeEnum) {
        CacheData cacheData;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b1f28bb0", new Object[]{this, typeEnum})).booleanValue() : this.time > 0 && (cacheData = this.cache.get(typeEnum)) != null && CacheData.access$000(cacheData) + this.time >= System.currentTimeMillis();
    }

    private boolean extKeyEqual(TBFenceClient.TypeEnum typeEnum, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("68d9ed36", new Object[]{this, typeEnum, str})).booleanValue() : TextUtils.equals(CacheData.access$100(this.cache.get(typeEnum)), str);
    }

    private String getCacheValue(TBFenceClient.TypeEnum typeEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6adffe9", new Object[]{this, typeEnum});
        }
        CacheData cacheData = this.cache.get(typeEnum);
        if (cacheData != null) {
            return CacheData.access$200(cacheData);
        }
        return null;
    }

    /* loaded from: classes7.dex */
    public class CacheData {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String extKey;
        private final long time;
        private final String value;

        static {
            kge.a(827099287);
        }

        public static /* synthetic */ long access$000(CacheData cacheData) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5bfe36a3", new Object[]{cacheData})).longValue() : cacheData.time;
        }

        public static /* synthetic */ String access$100(CacheData cacheData) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e8d90af0", new Object[]{cacheData}) : cacheData.extKey;
        }

        public static /* synthetic */ String access$200(CacheData cacheData) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("34a040f", new Object[]{cacheData}) : cacheData.value;
        }

        public CacheData(String str, long j, String str2) {
            this.value = str;
            this.time = j;
            this.extKey = str2;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "CacheData [value=" + this.value + ", time=" + this.time + ", extKey=" + this.extKey + riy.ARRAY_END_STR;
        }
    }
}
