package com.alipay.zoloz.hardware.camera.utils;

import com.alipay.mobile.security.bio.common.record.MetaRecord;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.ZimRecordService;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class RecordUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CAMERA_LAUNCH_END = "cameraLaunchEnd";
    public static final String CAMERA_LAUNCH_START = "cameraLaunchStart";
    public static final String CAMERA_RESOLUTION = "cameraResolution";
    public static final String CHECK_PROC_MAPS = "checkProcMaps";
    public static final String CHECK_STACKS = "checkStacks";
    private static RecordUtil b;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, MetaRecord> f6253a = new HashMap<>();
    private ZimRecordService c;

    private RecordUtil() {
        this.f6253a.put(CHECK_STACKS, new MetaRecord("UC-YWRLSB-161114-32", "event", "20000189", CHECK_STACKS, 1));
        this.f6253a.put(CHECK_PROC_MAPS, new MetaRecord("UC-YWRLSB-161114-32", "event", "20000189", CHECK_PROC_MAPS, 1));
        this.f6253a.put(CAMERA_LAUNCH_START, new MetaRecord("UC-YWRLSB-161114-32", "event", "20000189", CAMERA_LAUNCH_START, 1));
        this.f6253a.put(CAMERA_LAUNCH_END, new MetaRecord("UC-YWRLSB-161114-32", "event", "20000189", CAMERA_LAUNCH_END, 1));
        this.f6253a.put(CAMERA_RESOLUTION, new MetaRecord("UC-YWRLSB-161114-32", "event", "20000189", CAMERA_RESOLUTION, 1));
        this.c = (ZimRecordService) BioServiceManager.getCurrentInstance().getBioService(ZimRecordService.class);
    }

    public static RecordUtil getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecordUtil) ipChange.ipc$dispatch("bcc807cb", new Object[0]);
        }
        if (b == null) {
            b = new RecordUtil();
        }
        return b;
    }

    public void write(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc66d130", new Object[]{this, str});
        } else {
            write(str, null);
        }
    }

    public void addExtProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6781de2b", new Object[]{this, map});
        } else {
            this.c.addExtProperties(map);
        }
    }

    public void write(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a88455", new Object[]{this, str, map});
        } else {
            this.c.write(this.f6253a.get(str), map);
        }
    }

    public void retry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ea132f", new Object[]{this});
        } else {
            this.c.retry();
        }
    }
}
