package com.taobao.tao.homepage.windvane;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.por;
import tb.pps;
import tb.qqa;
import tb.rhj;
import tb.sgz;
import tb.shi;
import tb.shj;
import tb.sik;
import tb.sqd;
import tb.sqe;
import tb.sqf;
import tb.sue;
import tb.suy;
import tb.svz;
import tb.swa;
import tb.szz;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final List<b> f20616a;
    private static final Map<String, b> b;

    static {
        kge.a(443170630);
        f20616a = new CopyOnWriteArrayList();
        b = new ConcurrentHashMap();
        f20616a.add(new por());
        f20616a.add(new pps());
        f20616a.add(new qqa());
        f20616a.add(new rhj());
        f20616a.add(new sgz());
        f20616a.add(new shi());
        f20616a.add(new shj());
        f20616a.add(new sik());
        f20616a.add(new sqd());
        f20616a.add(new sqe());
        f20616a.add(new sqf());
        f20616a.add(new suy());
        f20616a.add(new svz());
        f20616a.add(new swa());
        f20616a.add(new szz());
        f20616a.add(new sue());
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        for (b bVar : f20616a) {
            a(bVar);
        }
    }

    public static void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("462a5659", new Object[]{bVar});
            return;
        }
        List<String> c = bVar.c();
        if (c != null && !c.isEmpty()) {
            for (String str : c) {
                b.put(str, bVar);
            }
            return;
        }
        e.e("HomePageJsFeatureDispatcher", "registerAction actions null ,feature: " + bVar);
    }

    public static boolean a(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77d86ebd", new Object[]{str, str2, wVCallBackContext})).booleanValue();
        }
        e.e("HomePageJsFeatureDispatcher", "dispatcherAction " + str + ",params:" + str2);
        String[] a2 = a(str, str2);
        e.e("HomePageJsFeatureDispatcher", "dispatcherAction jsParams action:" + a2[0] + ",params:" + a2[1]);
        b bVar = b.get(a2[0]);
        if (bVar != null) {
            return bVar.a(a2[0], a2[1], wVCallBackContext);
        }
        e.e("HomePageJsFeatureDispatcher", "dispatcherAction " + str + " feature not found");
        return false;
    }

    private static String[] a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("66657a4b", new Object[]{str, str2});
        }
        if (!StringUtils.equals(str, com.taobao.android.weex_framework.adapter.e.RECORD_EXECUTE)) {
            return new String[]{str, str2};
        }
        try {
            JSONObject parseObject = JSON.parseObject(str2);
            if (parseObject != null) {
                str = parseObject.getString("action");
                str2 = parseObject.getString("param");
            }
        } catch (Exception e) {
            e.e("HomePageJsFeatureDispatcher", "compatibleAction parse error" + e);
        }
        return new String[]{str, str2};
    }
}
