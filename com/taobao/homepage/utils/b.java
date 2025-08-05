package com.taobao.homepage.utils;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.Globals;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import tb.gbg;
import tb.kge;
import tb.ksk;
import tb.ope;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-922029575);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : b(ksk.NEW_FACE_PARENT.f30287a);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : b(str);
    }

    private static boolean b(String str) {
        AwesomeGetContainerData b;
        IContainerInnerDataModel<SectionModel> base;
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!b() && !c()) {
            return false;
        }
        if (c() && b(Globals.getApplication())) {
            return false;
        }
        try {
            ope f = com.taobao.tao.homepage.d.f(str);
            if (f == null || (b = f.b(str)) == null || (base = b.getBase()) == null || (ext = base.getExt()) == null) {
                return false;
            }
            boolean booleanValue = ext.getBooleanValue("isHudScreen");
            com.taobao.android.home.component.utils.e.e("HudScreenUtil", str + " isHudScreen: " + booleanValue);
            return booleanValue;
        } catch (Exception e) {
            com.taobao.android.home.component.utils.e.a("HudScreenUtil", "isHudScreen error", e);
            return false;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : com.taobao.infoflow.taobao.subservice.biz.padandfolddeviceservice.b.a();
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        if (b()) {
            return true;
        }
        return c() && !b(Globals.getApplication());
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : com.taobao.infoflow.taobao.subservice.biz.padandfolddeviceservice.b.b();
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue() : com.taobao.infoflow.taobao.subservice.biz.padandfolddeviceservice.b.b(context);
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        if (context == null) {
            context = Globals.getApplication();
        }
        if (!b() && !c()) {
            return context.getResources().getDisplayMetrics().widthPixels;
        }
        if (context instanceof Activity) {
            return com.taobao.android.autosize.i.a((Activity) context).width();
        }
        return gbg.b(Globals.getApplication());
    }
}
