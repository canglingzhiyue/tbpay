package com.taobao.taolive.movehighlight.utils;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cgl;
import tb.kge;
import tb.poy;

/* loaded from: classes8.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1716052060);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        if (str.contains("goodstimemove")) {
            str = str.replaceAll("goodstimemove.", "");
        }
        if (str.contains("timemoveReturn")) {
            str = str.replaceAll("timemoveReturn.", "");
        }
        if (str.contains("PlayBackToLive")) {
            str = str.replaceAll("PlayBackToLive.", "");
        }
        return str.contains("switchTimemove") ? str.replaceAll("switchTimemove.", "") : str;
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb15ad07", new Object[]{aVar, new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("time", String.valueOf(j));
        hashMap.put("newLiveSwitch", String.valueOf(u.g()));
        o.a(aVar, "UpDownPlay", (Map<String, String>) hashMap);
    }

    public static void a(String str, com.taobao.alilive.aliliveframework.frame.a aVar, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1551206c", new Object[]{str, aVar, strArr});
        } else {
            cgl.s().a("taobaolive", str, poy.L(aVar), (String[]) a(aVar, strArr).toArray(new String[0]));
        }
    }

    private static List<String> a(com.taobao.alilive.aliliveframework.frame.a aVar, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fbe7a965", new Object[]{aVar, strArr});
        }
        ArrayList arrayList = new ArrayList();
        VideoInfo u = poy.u(aVar);
        arrayList.add("feedId=" + a(aVar));
        arrayList.add("liveSource=" + poy.ac(aVar));
        arrayList.add("entrySource=" + poy.ad(aVar));
        arrayList.add("timestamp=" + System.currentTimeMillis());
        arrayList.add("timeShiftEntry=" + poy.B(aVar));
        arrayList.add("jiangjie_ID=" + poy.C(aVar));
        arrayList.add("oneproduct_jiangjie=" + poy.D(aVar));
        arrayList.add("oneproduct_mounting=" + poy.E(aVar));
        if (u != null) {
            String str = u.broadCaster != null ? u.broadCaster.accountId : "";
            arrayList.add("accountId=" + str);
            arrayList.add("roomStatus=" + u.roomStatus);
        }
        if (!StringUtils.isEmpty(poy.L(aVar))) {
            arrayList.add("trackInfo=" + poy.L(aVar));
        }
        arrayList.add("serverParams=" + poy.n(aVar));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return arrayList;
    }

    private static String a(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b9844e3", new Object[]{aVar});
        }
        VideoInfo u = poy.u(aVar);
        if (u == null) {
            return null;
        }
        return u.liveId;
    }
}
