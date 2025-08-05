package com.alipay.zoloz.toyger.util;

import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.SoundPlayService;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SoundUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void play(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f858a6c5", new Object[]{str});
            return;
        }
        SoundPlayService a2 = a();
        if (a2 == null) {
            return;
        }
        a2.play(str);
    }

    public static void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[0]);
            return;
        }
        SoundPlayService a2 = a();
        if (a2 == null) {
            return;
        }
        a2.stop();
    }

    public static boolean isInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18d112d5", new Object[0])).booleanValue();
        }
        SoundPlayService a2 = a();
        if (a2 == null) {
            return false;
        }
        return a2.isInitialized();
    }

    private static SoundPlayService a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SoundPlayService) ipChange.ipc$dispatch("8ad0f98d", new Object[0]);
        }
        BioServiceManager currentInstance = BioServiceManager.getCurrentInstance();
        if (currentInstance == null) {
            return null;
        }
        return (SoundPlayService) currentInstance.getBioService(SoundPlayService.class);
    }
}
