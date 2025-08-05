package com.taobao.android.layoutmanager.adapter.impl;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.android.autosize.WindowType;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import tb.kge;
import tb.scs;

/* loaded from: classes5.dex */
public class p implements IDeviceInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f13134a;
    private static boolean b;

    static {
        kge.a(206544386);
        kge.a(-71338143);
        f13134a = com.taobao.android.autosize.l.d(ab.a());
        b = com.taobao.android.autosize.l.b(ab.a());
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : b() == 2;
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        com.taobao.application.common.d a2 = com.taobao.application.common.c.a();
        if (a2 == null) {
            return -1;
        }
        return a2.a("deviceLevel", -1);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo
    public JSONObject a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("58b28f80", new Object[]{this, context});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("deviceLevel", (Object) Integer.valueOf(b()));
        return jSONObject;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : f13134a;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : b;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo
    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : !com.taobao.android.autosize.h.a().b(ab.a());
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo
    public Rect a(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("28388f83", new Object[]{this, activity}) : com.taobao.android.autosize.i.a(activity);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo
    public int b(Activity activity) {
        WindowType windowType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3fdb366e", new Object[]{this, activity})).intValue();
        }
        if (f()) {
            windowType = com.taobao.android.autosize.h.a().b(activity);
        } else {
            windowType = WindowType.MIN;
        }
        return a(windowType);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo
    public float b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0fef", new Object[]{this, context})).floatValue();
        }
        if (context instanceof Activity) {
            return com.taobao.android.autosize.h.a().a((Activity) context);
        }
        Activity a2 = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().a();
        if (!(a2 instanceof Activity)) {
            return 1.0f;
        }
        return com.taobao.android.autosize.h.a().a(a2);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo
    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : c() || d();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo
    public boolean c(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("792c4740", new Object[]{this, activity})).booleanValue() : scs.c(activity);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo
    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : b();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo
    public String c(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{this, context}) : UTDevice.getUtdid(context);
    }

    private int a(WindowType windowType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7bd2b954", new Object[]{this, windowType})).intValue();
        }
        if (windowType == WindowType.MIN) {
            return 0;
        }
        if (windowType == WindowType.SMALL) {
            return 1;
        }
        if (windowType == WindowType.MEDIUM) {
            return 2;
        }
        return windowType == WindowType.LARGE ? 3 : 4;
    }
}
