package com.taobao.android.mnncv.mtop;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.MRTRuntimeException;
import com.taobao.mrt.task.desc.MRTCodeDescription;
import com.taobao.mrt.task.desc.MRTFilesDescription;
import com.taobao.mrt.task.desc.MRTPythonLibDescription;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.dvq;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static MRTTaskDescription a(Map map) throws MRTRuntimeException {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRTTaskDescription) ipChange.ipc$dispatch("78783b3f", new Object[]{map});
        }
        String str2 = null;
        if (map == null) {
            return null;
        }
        Object obj = map.get("n");
        Object obj2 = map.get("furl");
        Object obj3 = map.get("mmd5");
        Object obj4 = map.get("fmd5");
        com.taobao.mrt.utils.f.b(obj);
        com.taobao.mrt.utils.f.b(obj2);
        com.taobao.mrt.utils.f.b(obj3);
        Object obj5 = map.get("cln");
        Object obj6 = map.get("r");
        Object obj7 = map.get("or");
        MRTTaskDescription mRTTaskDescription = new MRTTaskDescription();
        mRTTaskDescription.name = com.taobao.mrt.utils.f.a(obj);
        mRTTaskDescription.model = new MRTCodeDescription(com.taobao.mrt.utils.f.a(obj2), com.taobao.mrt.utils.f.a(obj3), com.taobao.mrt.utils.f.a(obj4), mRTTaskDescription);
        mRTTaskDescription.clnName = com.taobao.mrt.utils.f.a(obj5);
        if (obj6 != null && (obj6 instanceof Map)) {
            mRTTaskDescription.resource = a((Map) obj6, mRTTaskDescription);
        }
        Object obj8 = map.get("async");
        if (obj8 != null && (obj8 instanceof Boolean)) {
            mRTTaskDescription.async = ((Boolean) obj8).booleanValue();
        }
        if (obj7 != null && (obj7 instanceof List)) {
            List list = (List) obj7;
            if (list.size() > 0) {
                com.taobao.mrt.utils.a.c("WalleModelConfigConvert", "option resource size >1");
            }
            if (list.get(0) != null && (list.get(0) instanceof Map)) {
                mRTTaskDescription.optResource = a((Map) list.get(0), mRTTaskDescription);
            }
        }
        if (map.get("cid") == null) {
            str = null;
        } else {
            str = map.get("cid") + "";
        }
        mRTTaskDescription.cid = str;
        if (map.get("ea1") != null) {
            str2 = map.get("ea1") + "";
        }
        mRTTaskDescription.extentAgr1 = str2;
        return mRTTaskDescription;
    }

    private static MRTFilesDescription a(Map map, MRTTaskDescription mRTTaskDescription) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRTFilesDescription) ipChange.ipc$dispatch("5ded0283", new Object[]{map, mRTTaskDescription});
        }
        return new MRTFilesDescription((Map) map.get(dvq.FILES_DIR_NAME), map.get("furl") + "", map.get("fmd5") + "", mRTTaskDescription);
    }

    public static List<MRTTaskDescription> b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ffc624b", new Object[]{map});
        }
        ArrayList arrayList = new ArrayList();
        if (map == null) {
            com.taobao.mrt.utils.a.c("WalleModelConfigConvert", "configMap is null");
            return arrayList;
        }
        Object obj = map.get("models");
        if (obj == null || !(obj instanceof List)) {
            com.taobao.mrt.utils.a.c("WalleModelConfigConvert", "models is null or not list :" + obj);
            return arrayList;
        }
        for (Map map2 : (List) obj) {
            try {
                arrayList.add(a(map2));
            } catch (MRTRuntimeException e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    public static List<MRTPythonLibDescription> c(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("76d5220c", new Object[]{map});
        }
        ArrayList arrayList = null;
        Object obj = map.get("libs");
        if (obj != null && (obj instanceof List)) {
            arrayList = new ArrayList();
            for (Object obj2 : (List) obj) {
                if (obj2 != null && (obj2 instanceof HashMap)) {
                    try {
                        Map map2 = (Map) obj2;
                        arrayList.add(new MRTPythonLibDescription((String) map2.get("n"), (String) map2.get("md5"), (String) map2.get("furl"), (String) map2.get("fmd5"), null));
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
        return arrayList;
    }
}
