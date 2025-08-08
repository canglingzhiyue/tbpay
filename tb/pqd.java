package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.common.MUSConstants;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.monitor.bean.LiveAPMBean;
import com.taobao.taolive.sdk.monitor.bean.a;
import com.taobao.taolive.sdk.utils.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public class pqd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1080580846);
    }

    public void a(String str, ConcurrentHashMap<String, LiveAPMBean> concurrentHashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31902a02", new Object[]{this, str, concurrentHashMap});
        } else if (pmd.a().e() != null && concurrentHashMap != null) {
            Map<String, String> hashMap = new HashMap<>();
            if (!concurrentHashMap.keySet().contains(str)) {
                return;
            }
            pmd.a().m().b("UploadDataManager", "start upload sessionId : " + str);
            LiveAPMBean liveAPMBean = concurrentHashMap.get(str);
            if (liveAPMBean == null) {
                pmd.a().m().b("UploadDataManager", "liveAPMBean is null upload data fail");
                return;
            }
            hashMap.put("sessionId", str);
            hashMap.put("originSessionId", liveAPMBean.originSessionId);
            if (liveAPMBean.extParams != null && liveAPMBean.extParams.size() > 0) {
                hashMap.putAll(liveAPMBean.extParams);
            }
            List<LiveAPMBean.SceneData> list = liveAPMBean.sceneDataList;
            for (LiveAPMBean.SceneData sceneData : list) {
                if (!StringUtils.equals(sceneData.scenePoint, "start")) {
                    hashMap.put(sceneData.scenePoint, JSON.toJSONString(sceneData.performanceData));
                }
            }
            liveAPMBean.totalPerformanceData.hitchTotal /= 1000000;
            hashMap.put(pqe.STAGE_INTERACTIVE_DELAY_FINISH, JSON.toJSONString(liveAPMBean.dataDelay1s));
            hashMap.put(pqe.STAGE_IS_COLD_START, String.valueOf(liveAPMBean.isColdStart));
            hashMap.put(pqe.STAGE_REFRESH_RATE, String.valueOf(liveAPMBean.refreshRate));
            if (u.aF() && liveAPMBean.dataDelay5s != null) {
                hashMap.put(pqe.STAGE_INTERACTIVE_DELAY_FINISH_5S, JSON.toJSONString(liveAPMBean.dataDelay5s));
            }
            pmd.a().e().a("Page_TaobaoLiveWatch", "Live_APM_Monitor", hashMap);
            a(str, liveAPMBean);
            try {
                StringBuilder sb = new StringBuilder();
                Iterator<String> it = hashMap.keySet().iterator();
                while (it != null && it.hasNext()) {
                    String next = it.next();
                    sb.append(next);
                    sb.append(":");
                    sb.append(hashMap.get(next));
                    sb.append(">>>>");
                }
                pmd.a().m().b("UploadDataManager", "start upload sessionId : " + sb.toString());
                a(list);
            } catch (Exception e) {
                pmd.a().m().b("UploadDataManager", "upload sessionId fail " + e.getMessage());
            }
        }
    }

    private void a(String str, LiveAPMBean liveAPMBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d33b7ee", new Object[]{this, str, liveAPMBean});
        } else if (liveAPMBean != null && u.aL() && !StringUtils.isEmpty(str) && str.contains("LIVE_CODE_BOOT_STAGE")) {
            List<LiveAPMBean.SceneData> list = liveAPMBean.sceneDataList;
            HashMap hashMap = new HashMap();
            if (liveAPMBean.extParams != null) {
                hashMap.putAll(liveAPMBean.extParams);
            }
            a aVar = new a();
            aVar.f21865a = new ArrayList();
            for (LiveAPMBean.SceneData sceneData : list) {
                if (StringUtils.equals(sceneData.scenePoint, "start")) {
                    a.C0909a a2 = a(sceneData);
                    a2.c = "start";
                    aVar.f21865a.add(a2);
                } else if (StringUtils.equals(sceneData.scenePoint, pqe.STAGE_T2)) {
                    a.C0909a a3 = a(sceneData);
                    a3.c = "request";
                    aVar.f21865a.add(a3);
                } else if (StringUtils.equals(sceneData.scenePoint, pqe.STAGE_INTERACTIVE)) {
                    a.C0909a a4 = a(sceneData);
                    a4.c = "end";
                    aVar.f21865a.add(a4);
                }
            }
            if (aVar.f21865a != null) {
                hashMap.put(MUSConstants.STEPS, JSON.toJSONString(aVar.f21865a));
            }
            pmd.a().e().a(aw.STAIN_TRACK_PAGE, "Page_liveRoomStability_lpm_fps_monitor", hashMap);
        }
    }

    private a.C0909a a(LiveAPMBean.SceneData sceneData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.C0909a) ipChange.ipc$dispatch("eabbe29a", new Object[]{this, sceneData});
        }
        a.C0909a c0909a = new a.C0909a();
        if (sceneData != null && sceneData.performanceData != null) {
            c0909a.f21866a = sceneData.performanceData.cpu;
            c0909a.b = sceneData.performanceData.memory;
            c0909a.g = sceneData.performanceData.seriousFrames;
            c0909a.h = sceneData.performanceData.stuckFrames;
            c0909a.i = sceneData.performanceData.allFrameNums;
            c0909a.d = sceneData.performanceData.f0_t1;
            c0909a.e = sceneData.performanceData.ft1_t2;
            c0909a.f = sceneData.performanceData.ft2_x;
        }
        return c0909a;
    }

    private void a(List<LiveAPMBean.SceneData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        if (list != null && list.size() > 0 && list.contains(pqe.STAGE_T0) && list.contains(pqe.STAGE_T1) && list.contains(pqe.STAGE_T2)) {
            list.contains(pqe.STAGE_INTERACTIVE);
        }
        LiveAPMBean.SceneData sceneData = null;
        LiveAPMBean.SceneData sceneData2 = null;
        LiveAPMBean.SceneData sceneData3 = null;
        LiveAPMBean.SceneData sceneData4 = null;
        for (LiveAPMBean.SceneData sceneData5 : list) {
            if (StringUtils.equals(sceneData5.scenePoint, "start")) {
                sceneData2 = sceneData5;
            } else if (StringUtils.equals(sceneData5.scenePoint, pqe.STAGE_T1)) {
                sceneData = sceneData5;
            } else if (StringUtils.equals(sceneData5.scenePoint, pqe.STAGE_T2)) {
                sceneData3 = sceneData5;
            } else if (StringUtils.equals(sceneData5.scenePoint, pqe.STAGE_INTERACTIVE)) {
                sceneData4 = sceneData5;
            }
        }
        long j = sceneData.performanceData.currentTime - sceneData2.performanceData.currentTime;
        long j2 = sceneData3.performanceData.currentTime - sceneData2.performanceData.currentTime;
        pmd.a().m().b("UploadDataManager", "firstFrame:" + j + " interactive:" + (sceneData4.performanceData.currentTime - sceneData2.performanceData.currentTime) + " detailTime:" + j2);
    }
}
