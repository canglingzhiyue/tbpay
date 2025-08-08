package com.taobao.tbpoplayer.view;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.interact.pop.BootImagePopMamaCommercialView;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Class<? extends PopCustomNativeBaseView>> f22265a;

    static {
        kge.a(69047298);
        f22265a = new ConcurrentHashMap();
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        a("nativeSearch", "com.taobao.android.voiceassistant.pop.VoiceAssistantNativePop");
        a(BootImagePopMamaCommercialView.VIEW_TYPE, "com.taobao.bootimage.interact.pop.BootImagePopMamaCommercialView");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        try {
            if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
                f22265a.put(str, Class.forName(str2));
                com.alibaba.poplayer.factory.a.a().a(str);
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopCustomViewManager.registerViewType.fail!", th);
        }
    }

    public static PopCustomNativeBaseView a(Context context, String str) {
        if (f22265a.isEmpty()) {
            a();
        }
        if (BootImagePopMamaCommercialView.VIEW_TYPE.equals(str) && !com.taobao.tbpoplayer.info.a.a().J()) {
            com.alibaba.poplayer.utils.c.a("mamaCommercial.orange.switch.notUseNewType", new Object[0]);
            return null;
        }
        Class<? extends PopCustomNativeBaseView> cls = f22265a.get(str);
        if (cls == null || StringUtils.isEmpty(str)) {
            com.alibaba.poplayer.utils.c.a("%s.create:use baseItem.", new Object[0]);
            return null;
        }
        try {
            Constructor<? extends PopCustomNativeBaseView> declaredConstructor = cls.getDeclaredConstructor(Context.class);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(context);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopCustomViewManager.createLayer.fail!", th);
            return null;
        }
    }
}
