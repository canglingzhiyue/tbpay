package com.taobao.android.fm_base;

import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.desktoplinktask.trigger.e;
import java.util.HashMap;
import mtopsdk.mtop.upload.domain.UploadConstants;

/* loaded from: classes5.dex */
public class IdsMonitorUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DOWNGRAD_ERROR = "moduleInstallDowngrade";
    public static final String INSTALL_ERROR = "moduleInstallError";

    /* renamed from: a  reason: collision with root package name */
    public static String f12699a = "tb_fm";

    /* loaded from: classes5.dex */
    public enum StageType {
        STAGE_REQUESTED(e.FUNNEL_STEP_AFTER_REQUEST),
        STAGE_DOWNLOADED("downloaded"),
        STAGE_INSTALL("installed");
        
        private final String value;

        StageType(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    public static void a(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3202a441", new Object[]{str, hashMap});
        } else if (!a.a(a.NAMESPACE, "installMonitorSuccess", true)) {
        } else {
            if (hashMap == null) {
                hashMap = new HashMap<>();
            }
            if (hashMap != null && !TextUtils.isEmpty(str)) {
                hashMap.put("bizCode", str);
            }
            AppMonitor.Alarm.commitSuccess("FM_SCENE", "Monitor_Module_Error", hashMap.toString());
            String str2 = "commitSuccess: " + hashMap.toString();
        }
    }

    public static void a(String str, HashMap<String, String> hashMap, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa808cd5", new Object[]{str, hashMap, str2, str3});
            return;
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("bizCode", str);
        }
        AppMonitor.Alarm.commitFail("FM_SCENE", "Monitor_Module_Error", hashMap.toString(), str2, str3);
        String str4 = "commitFail: " + str2 + ", " + str3 + ", " + hashMap.toString();
    }

    public static void a(String str, String str2, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba8242", new Object[]{str, str2, new Double(d)});
            return;
        }
        MeasureSet create = MeasureSet.create();
        create.addMeasure(StageType.STAGE_REQUESTED.value);
        create.addMeasure(StageType.STAGE_INSTALL.value);
        create.addMeasure(StageType.STAGE_DOWNLOADED.value);
        DimensionSet create2 = DimensionSet.create();
        create2.addDimension(UploadConstants.BIZ_CODE);
        AppMonitor.register("FM_SCENE", "Monitor_Module_trace", create, create2, false);
        AppMonitor.Stat.commit("FM_SCENE", "Monitor_Module_trace", DimensionValueSet.create().setValue(UploadConstants.BIZ_CODE, str), MeasureValueSet.create().setValue(str2, d));
        String str3 = "commitTraceStatics: " + str + "," + str2 + ", " + d;
    }
}
