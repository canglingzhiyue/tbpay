package com.taobao.tinct.impl.collect;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.taobao.tinct.model.ABChangeInfo;
import com.taobao.tinct.model.BaseChangeInfo;
import com.taobao.tinct.model.ChangeType;
import com.taobao.tinct.model.CustomChangeInfo;
import com.taobao.tinct.model.InstantPatchChangeInfo;
import com.taobao.tinct.model.OrangeChangeInfo;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UPLOAD_TYPE_CHANGE = "change";
    public static final String UPLOAD_TYPE_EFFECT = "effect";
    public static final String UPLOAD_TYPE_LAUNCH = "launch";

    /* renamed from: a  reason: collision with root package name */
    public static com.taobao.tinct.a f22953a;

    public static void a(com.taobao.tinct.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc78902e", new Object[]{aVar});
        } else {
            f22953a = aVar;
        }
    }

    public static com.taobao.tinct.a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tinct.a) ipChange.ipc$dispatch("e35bff74", new Object[0]) : f22953a;
    }

    public static void a(OrangeChangeInfo orangeChangeInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29b596f9", new Object[]{orangeChangeInfo, str});
            return;
        }
        try {
            if (!com.taobao.tinct.impl.config.a.a(orangeChangeInfo)) {
                return;
            }
            a(b(orangeChangeInfo, str));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(ABChangeInfo aBChangeInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb2ec846", new Object[]{aBChangeInfo, str});
            return;
        }
        try {
            if (!com.taobao.tinct.impl.config.a.c(aBChangeInfo.getExperimentId())) {
                return;
            }
            a(b(aBChangeInfo, str));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(InstantPatchChangeInfo instantPatchChangeInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c6ea4e0", new Object[]{instantPatchChangeInfo, str});
            return;
        }
        try {
            if (TextUtils.isEmpty(instantPatchChangeInfo.getVersion()) || !com.taobao.tinct.impl.config.a.a(instantPatchChangeInfo)) {
                return;
            }
            a(b(instantPatchChangeInfo, str));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(com.taobao.tinct.model.b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c7957d", new Object[]{bVar, str});
            return;
        }
        try {
            if (TextUtils.isEmpty(bVar.getVersion()) || !com.taobao.tinct.impl.config.a.a(bVar)) {
                return;
            }
            a(b((InstantPatchChangeInfo) bVar, str));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(com.taobao.tinct.model.c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a4d501c", new Object[]{cVar, str});
            return;
        }
        try {
            if (TextUtils.isEmpty(cVar.a()) || !com.taobao.tinct.impl.config.a.g()) {
                return;
            }
            a(b(cVar, str));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(CustomChangeInfo customChangeInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74d14956", new Object[]{customChangeInfo, str});
            return;
        }
        try {
            if (!com.taobao.tinct.impl.config.a.c(customChangeInfo)) {
                return;
            }
            a(b(customChangeInfo, str));
            customChangeInfo.setStatistics();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(com.taobao.tinct.model.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d41dade", new Object[]{aVar, str});
            return;
        }
        try {
            if (!com.taobao.tinct.impl.config.a.a(aVar)) {
                return;
            }
            try {
                a(a((BaseChangeInfo) aVar, str).toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        com.taobao.tinct.a aVar = f22953a;
        if (aVar == null) {
            return;
        }
        aVar.a(str);
    }

    public static void a(ChangeRecord changeRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba0e097a", new Object[]{changeRecord});
            return;
        }
        for (OrangeChangeInfo orangeChangeInfo : changeRecord.orangeChangeMap.values()) {
            a(orangeChangeInfo, "launch");
        }
        if (changeRecord.instantPatchInfo != null) {
            a(changeRecord.instantPatchInfo, "launch");
        }
        if (changeRecord.inlinePatchInfo != null) {
            a((InstantPatchChangeInfo) changeRecord.inlinePatchInfo, "launch");
        }
        for (CustomChangeInfo customChangeInfo : changeRecord.customInfo.values()) {
            if (customChangeInfo != null && customChangeInfo.getFullExpireTime() == -1 && com.taobao.tinct.impl.config.a.f(customChangeInfo)) {
                a(customChangeInfo, "launch");
            }
        }
        if (changeRecord.dynamicChangeInfo == null) {
            return;
        }
        a(changeRecord.dynamicChangeInfo, "launch");
    }

    private static JSONObject a(BaseChangeInfo baseChangeInfo, String str) {
        String changeType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4f1fa5d6", new Object[]{baseChangeInfo, str});
        }
        if (baseChangeInfo == null) {
            return null;
        }
        try {
            if (baseChangeInfo.getChangeType() == ChangeType.CUSTOM) {
                changeType = ((CustomChangeInfo) baseChangeInfo).getCustomType();
            } else {
                changeType = baseChangeInfo.getChangeType().toString();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", (Object) str);
            jSONObject.put("changeType", (Object) changeType);
            if (!TextUtils.isEmpty(baseChangeInfo.getBizName())) {
                jSONObject.put("bizName", (Object) baseChangeInfo.getBizName());
            }
            jSONObject.put(com.alibaba.android.umbrella.link.a.PARAM_TINCT_TAG, (Object) baseChangeInfo.getTinctTag());
            jSONObject.put(com.taobao.tao.log.statistics.d.PARAM_IS_INNER, (Object) Boolean.valueOf(com.taobao.tinct.impl.config.a.n()));
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String b(BaseChangeInfo baseChangeInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c5e86eb", new Object[]{baseChangeInfo, str});
        }
        if (baseChangeInfo == null) {
            return null;
        }
        try {
            JSONObject a2 = a(baseChangeInfo, str);
            if (a2 != null) {
                return a2.toJSONString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String b(OrangeChangeInfo orangeChangeInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad0164c8", new Object[]{orangeChangeInfo, str});
        }
        if (orangeChangeInfo == null) {
            return null;
        }
        try {
            JSONObject a2 = a((BaseChangeInfo) orangeChangeInfo, str);
            if (a2 != null) {
                a2.put(NotificationStyle.NOTIFICATION_STYLE, (Object) orangeChangeInfo.getNameSpace());
                a2.put(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, (Object) orangeChangeInfo.getVersion());
                a2.put("isGray", (Object) Boolean.valueOf(orangeChangeInfo.isGray()));
                return a2.toJSONString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String b(ABChangeInfo aBChangeInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9267f9b", new Object[]{aBChangeInfo, str});
        }
        if (aBChangeInfo == null) {
            return null;
        }
        try {
            JSONObject a2 = a((BaseChangeInfo) aBChangeInfo, str);
            if (a2 != null) {
                a2.put("experimentId", (Object) aBChangeInfo.getExperimentId());
                a2.put("bucketId", (Object) aBChangeInfo.getBucketId());
                a2.put("publishId", (Object) aBChangeInfo.getPublishId());
                return a2.toJSONString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String b(InstantPatchChangeInfo instantPatchChangeInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3994bd01", new Object[]{instantPatchChangeInfo, str});
        }
        if (instantPatchChangeInfo == null) {
            return null;
        }
        try {
            JSONObject a2 = a((BaseChangeInfo) instantPatchChangeInfo, str);
            if (a2 != null) {
                a2.put("verType", (Object) instantPatchChangeInfo.getVerType());
                return a2.toJSONString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
