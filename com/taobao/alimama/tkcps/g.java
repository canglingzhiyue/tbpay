package com.taobao.alimama.tkcps;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.io.SharedPreferencesUtils;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.tao.timestamp.TimeStampManager;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes4.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final g f8465a;
    private ConcurrentHashMap<String, TaokeParam> b = new ConcurrentHashMap<>();

    static {
        kge.a(-169740352);
        f8465a = new g();
    }

    private g() {
    }

    public static g a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("51085f32", new Object[0]) : f8465a;
    }

    public String a(String str) {
        TaokeParam taokeParam;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str) || (taokeParam = this.b.get(str)) == null || TimeStampManager.instance().getCurrentTimeStamp() > taokeParam.expireTime.longValue()) {
            return null;
        }
        return taokeParam.content;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str) || str2 == null) {
        } else {
            TaokeParam taokeParam = new TaokeParam();
            taokeParam.content = str2;
            taokeParam.expireTime = Long.valueOf(TimeStampManager.instance().getCurrentTimeStamp() + 1296000000);
            this.b.put(str, taokeParam);
        }
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        String string = SharedPreferencesUtils.getString("tk_cps_param", null);
        if (!StringUtils.isEmpty(string)) {
            try {
                ConcurrentHashMap<String, TaokeParam> concurrentHashMap = (ConcurrentHashMap) JSON.parseObject(string, new TypeReference<ConcurrentHashMap<String, TaokeParam>>() { // from class: com.taobao.alimama.tkcps.g.1
                }, new Feature[0]);
                if (concurrentHashMap != null) {
                    Iterator<Map.Entry<String, TaokeParam>> it = concurrentHashMap.entrySet().iterator();
                    boolean z = false;
                    while (it.hasNext()) {
                        if (TimeStampManager.instance().getCurrentTimeStamp() > it.next().getValue().expireTime.longValue()) {
                            it.remove();
                            z = true;
                        }
                    }
                    if (z) {
                        c();
                    }
                    this.b = concurrentHashMap;
                    TaoLog.Logd("AlimamaSdk", String.format("loaded tk_cps_param: %s", JSON.toJSONString(this.b)));
                }
            } catch (Exception unused) {
            }
        }
    }

    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.b.isEmpty()) {
            SharedPreferencesUtils.removeKey("tk_cps_param");
        } else {
            SharedPreferencesUtils.putString("tk_cps_param", JSON.toJSONString(this.b));
        }
    }
}
