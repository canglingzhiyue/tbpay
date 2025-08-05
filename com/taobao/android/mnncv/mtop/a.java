package com.taobao.android.mnncv.mtop;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mnncv.MNNCV;
import com.taobao.mrt.task.desc.MRTPythonLibDescription;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import com.taobao.mrt.task.g;
import java.util.Iterator;
import java.util.List;
import tb.msm;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static a f14404a = new a();

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("96adf1d", new Object[0]) : f14404a;
    }

    public void a(String str) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        Context b = com.taobao.mrt.c.b();
        if (b == null || (sharedPreferences = b.getSharedPreferences(com.tmall.android.dai.internal.config.d.DAI_ORANGE_SWITCH, 0)) == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        edit.putString("mnncvConfigCache", str).apply();
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        String b = b();
        if (TextUtils.isEmpty(b)) {
            return false;
        }
        c cVar = new c(b);
        if (cVar.b != null && cVar.b.size() > 0) {
            List<String> tppLibs = MNNCV.getTppLibs();
            for (MRTPythonLibDescription mRTPythonLibDescription : cVar.b) {
                if (!tppLibs.contains(mRTPythonLibDescription.resourceName) && !msm.a().a(mRTPythonLibDescription.resourceName)) {
                    msm.a().a(mRTPythonLibDescription);
                }
            }
        }
        MRTTaskDescription mRTTaskDescription = null;
        Iterator<MRTTaskDescription> it = cVar.f14407a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            MRTTaskDescription next = it.next();
            if (next != null && str.equals(next.name)) {
                mRTTaskDescription = next;
                break;
            }
        }
        if (mRTTaskDescription == null) {
            return false;
        }
        g.a().a(mRTTaskDescription);
        MNNCV.addToValidTaskNameMap(str);
        return true;
    }

    private String b() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        if (MNNCV.isCVDisabled()) {
            com.taobao.mrt.utils.a.c("ConfigCacheUtil", "[fetchConfigFromLocalCache] disable by OrangeConfig ,key:isCVDisabled");
            return null;
        }
        Context b = com.taobao.mrt.c.b();
        if (b != null && (sharedPreferences = b.getSharedPreferences(com.tmall.android.dai.internal.config.d.DAI_ORANGE_SWITCH, 0)) != null) {
            return sharedPreferences.getString("mnncvConfigCache", null);
        }
        return null;
    }
}
