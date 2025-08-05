package com.taobao.android.detail.ttdetail.utils;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Resource;
import java.util.List;
import tb.eyx;
import tb.kge;

/* loaded from: classes5.dex */
public class ac {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CODE_NPS = "detailNps";
    public static final String CODE_TALK_GROUP = "detailTalkGroup";

    static {
        kge.a(-2072000393);
    }

    public static Resource.c a(eyx eyxVar, String str) {
        List<Resource.c> floatButtons;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resource.c) ipChange.ipc$dispatch("ddf0ebca", new Object[]{eyxVar, str});
        }
        Resource resource = (Resource) eyxVar.a().a(Resource.class);
        if (resource != null && (floatButtons = resource.getFloatButtons()) != null && !floatButtons.isEmpty()) {
            for (Resource.c cVar : floatButtons) {
                if (str.equals(cVar.d())) {
                    return cVar;
                }
            }
        }
        return null;
    }

    public static String a(Resource.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("23c897cc", new Object[]{cVar});
        }
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    public static String b(Resource.c cVar) {
        Resource.b c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2af17a0d", new Object[]{cVar});
        }
        if (cVar != null && (c = c(cVar)) != null) {
            return c.c();
        }
        return null;
    }

    public static Resource.b c(Resource.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resource.b) ipChange.ipc$dispatch("e64e335f", new Object[]{cVar});
        }
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    public static String d(Resource.c cVar) {
        Resource.b c;
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39433e8f", new Object[]{cVar});
        }
        if (cVar != null && (c = c(cVar)) != null && (b = c.b()) != null) {
            return b.getString("url");
        }
        return null;
    }
}
