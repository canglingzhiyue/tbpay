package com.taobao.taolive.adapterimpl.network;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.kge;
import tb.kml;
import tb.kmm;
import tb.kmo;
import tb.kmq;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;

/* loaded from: classes8.dex */
public class b implements com.taobao.taolive.sdk.adapter.network.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-178130660);
        kge.a(-1624857240);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.b
    public int a(Map map, final com.taobao.taolive.sdk.adapter.network.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10e8ca08", new Object[]{this, map, aVar})).intValue();
        }
        kmm kmmVar = new kmm();
        if (map.get("downloadParam") instanceof Map) {
            HashMap hashMap = (HashMap) map.get("downloadParam");
            kmq kmqVar = new kmq();
            kmqVar.f30169a = (String) hashMap.get("bizId");
            if (hashMap.containsKey(MonitorMediaPlayer.ABTEST_USE_CACHE_ENABLE)) {
                kmqVar.s = Boolean.valueOf(String.valueOf(hashMap.get(MonitorMediaPlayer.ABTEST_USE_CACHE_ENABLE))).booleanValue();
            }
            kmmVar.b = kmqVar;
        }
        if (map.get("downloadList") instanceof JSONArray) {
            ArrayList arrayList = new ArrayList();
            Iterator<Object> it = ((JSONArray) map.get("downloadList")).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    kmo kmoVar = new kmo();
                    kmoVar.f30167a = ((JSONObject) next).getString("url");
                    arrayList.add(kmoVar);
                }
            }
            kmmVar.f30166a = arrayList;
        }
        return com.taobao.downloader.b.a().a(kmmVar, new kml() { // from class: com.taobao.taolive.adapterimpl.network.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.kml
            public void onDownloadProgress(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                }
            }

            @Override // tb.kml
            public void onDownloadStateChange(String str, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
                }
            }

            @Override // tb.kml
            public void onFinish(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                }
            }

            @Override // tb.kml
            public void onNetworkLimit(int i, kmq kmqVar2, kml.a aVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6919023a", new Object[]{this, new Integer(i), kmqVar2, aVar2});
                }
            }

            @Override // tb.kml
            public void onDownloadError(String str, int i, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                    return;
                }
                com.taobao.taolive.sdk.adapter.network.a aVar2 = aVar;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a(str, i, str2);
            }

            @Override // tb.kml
            public void onDownloadFinish(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                    return;
                }
                com.taobao.taolive.sdk.adapter.network.a aVar2 = aVar;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a(str, str2);
            }
        });
    }

    @Override // com.taobao.taolive.sdk.adapter.network.b
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            com.taobao.downloader.b.a().a(i);
        }
    }
}
