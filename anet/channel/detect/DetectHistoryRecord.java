package anet.channel.detect;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import mtopsdk.common.util.StringUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes.dex */
public class DetectHistoryRecord {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long DEFAULT_DETECT_VALID_TIME = 21600000;
    private static final int FAILED = 0;
    private static final int SUCCESS = 1;
    private static final String TAG = "awcn.DetectHistoryRecord";
    private static final int UNKNOWN = -1;
    private Map<String, DetectRecord> detectedNetworks = new ConcurrentHashMap();
    private volatile long mValidTime = 21600000;
    private SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext());
    private String spName;

    /* loaded from: classes.dex */
    public static class DetectRecord {
        public boolean enable;
        public long time;

        static {
            kge.a(1188143299);
        }
    }

    static {
        kge.a(-1302987659);
    }

    public DetectHistoryRecord(String str) {
        this.spName = "default_detect";
        this.spName = str;
        load(this.spName);
    }

    private void load(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6772aef7", new Object[]{this, str});
            return;
        }
        String string = this.sharedPreferences.getString(str, null);
        if (StringUtils.isEmpty(string)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                DetectRecord detectRecord = new DetectRecord();
                String string2 = jSONObject.getString("networkUniqueId");
                detectRecord.time = jSONObject.getLong("time");
                detectRecord.enable = jSONObject.getBoolean("enable");
                if (isValid(detectRecord.time)) {
                    synchronized (this.detectedNetworks) {
                        this.detectedNetworks.put(string2, detectRecord);
                    }
                }
            }
            ALog.e(TAG, "DetectHistoryRecord load success.", null, "fileName", str, "content", jSONArray.toString());
        } catch (JSONException unused) {
        }
    }

    public boolean isNeedDetect(String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bc8ddf8", new Object[]{this, str})).booleanValue();
        }
        synchronized (this.detectedNetworks) {
            DetectRecord detectRecord = this.detectedNetworks.get(str);
            if (detectRecord == null) {
                return true;
            }
            if (!isValid(detectRecord.time) || (isValid(detectRecord.time) && !detectRecord.enable)) {
                z = true;
            }
            return z;
        }
    }

    public boolean isValid(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7be08d6f", new Object[]{this, new Long(j)})).booleanValue() : System.currentTimeMillis() - j < this.mValidTime;
    }

    public boolean isNeedsWifiFgDetect(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e2c98bb", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        synchronized (this.detectedNetworks) {
            DetectRecord detectRecord = this.detectedNetworks.get(str);
            if (detectRecord != null && !detectRecord.enable) {
                if (System.currentTimeMillis() - detectRecord.time < AwcnConfig.getDetectIntervalTime() * 1000 || detectRecord.enable) {
                    return false;
                }
                ALog.e(TAG, "[wifi fg detect opt][DetectOpt] last detect ret = false, interval time > " + AwcnConfig.getDetectIntervalTime(), null, "isCondition", Boolean.valueOf(z));
                return z;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[wifi fg detect opt][DetectOpt] last detect ret = ");
            sb.append(detectRecord == null ? "null" : "true");
            ALog.e(TAG, sb.toString(), null, "isCondition", Boolean.valueOf(z));
            return z;
        }
    }

    public void setValidTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a9e8d6", new Object[]{this, new Long(j)});
        } else if (j < 0) {
        } else {
            this.mValidTime = j;
        }
    }

    public void update(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab06bf7a", new Object[]{this, str, new Boolean(z)});
            return;
        }
        DetectRecord detectRecord = new DetectRecord();
        detectRecord.enable = z;
        detectRecord.time = System.currentTimeMillis();
        JSONArray jSONArray = new JSONArray();
        synchronized (this.detectedNetworks) {
            this.detectedNetworks.put(str, detectRecord);
            for (Map.Entry<String, DetectRecord> entry : this.detectedNetworks.entrySet()) {
                String key = entry.getKey();
                DetectRecord value = entry.getValue();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("networkUniqueId", key);
                    jSONObject.put("time", value.time);
                    jSONObject.put("enable", value.enable);
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        this.sharedPreferences.edit().putString(this.spName, jSONArray.toString()).apply();
    }

    public int detectStatus(String str) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74c96139", new Object[]{this, str})).intValue();
        }
        synchronized (this.detectedNetworks) {
            DetectRecord detectRecord = this.detectedNetworks.get(str);
            if (detectRecord == null) {
                return -1;
            }
            if (!detectRecord.enable) {
                i = 0;
            }
            return i;
        }
    }

    public DetectRecord createDetectRecord(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetectRecord) ipChange.ipc$dispatch("cd38b085", new Object[]{this, new Boolean(z)});
        }
        DetectRecord detectRecord = new DetectRecord();
        detectRecord.enable = z;
        detectRecord.time = System.currentTimeMillis();
        return detectRecord;
    }
}
