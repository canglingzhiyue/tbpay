package tb;

import android.support.v4.provider.FontsContractCompat;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.vpm.publish.contentDO.ContentMetaInfo;
import com.taobao.vpm.publish.contentDO.a;
import com.taobao.vpm.publish.contentDO.b;
import com.taobao.vpm.utils.VPMConstant;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class rio extends rim {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(a aVar, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e14039a3", new Object[]{aVar, hashMap});
        } else if (!com.taobao.vpm.utils.a.c()) {
        } else {
            a(VPMConstant.PUBLISH_ENTER_LOG, b(aVar, (b) null, hashMap));
        }
    }

    public static void b(a aVar, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7440502", new Object[]{aVar, hashMap});
        } else if (!com.taobao.vpm.utils.a.c()) {
        } else {
            a(VPMConstant.PUBLISH_START_LOG, b(aVar, (b) null, hashMap));
        }
    }

    public static void a(ContentMetaInfo contentMetaInfo, b bVar, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baeeafa7", new Object[]{contentMetaInfo, bVar, hashMap});
        } else if (!com.taobao.vpm.utils.a.c()) {
        } else {
            a(VPMConstant.PUBLISH_END_LOG, c(contentMetaInfo, bVar, hashMap));
        }
    }

    public static void a(a aVar, b bVar, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13c843c", new Object[]{aVar, bVar, hashMap});
        } else if (!com.taobao.vpm.utils.a.c()) {
        } else {
            a(VPMConstant.UPLOAD_START_LOG, b(aVar, bVar, hashMap));
        }
    }

    public static void b(ContentMetaInfo contentMetaInfo, b bVar, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb69c546", new Object[]{contentMetaInfo, bVar, hashMap});
        } else if (!com.taobao.vpm.utils.a.c()) {
        } else {
            a(VPMConstant.UPLOAD_END_LOG, c(contentMetaInfo, bVar, hashMap));
        }
    }

    private static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(VPMConstant.Publish_Page_Name, VPMConstant.Publish_Event_Id, str, "", "", map).build());
        }
    }

    private static HashMap<String, String> b(a aVar, b bVar, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("c1d6d0be", new Object[]{aVar, bVar, hashMap});
        }
        HashMap<String, String> hashMap2 = new HashMap<>();
        if (aVar == null) {
            return hashMap2;
        }
        hashMap2.put("content_monitor_biz_line", aVar.f23468a);
        hashMap2.put("content_monitor_biz_code", aVar.b);
        hashMap2.put("content_monitor_trackId", aVar.d);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("biz_scene", aVar.c);
        if (bVar != null) {
            hashMap3.put("video", bVar.getMapParams());
        }
        if (hashMap != null) {
            hashMap3.put("extra", hashMap);
        }
        hashMap2.put("content_monitor_full_message", new JSONObject(hashMap3).toString());
        return hashMap2;
    }

    private static HashMap<String, String> c(ContentMetaInfo contentMetaInfo, b bVar, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e9270108", new Object[]{contentMetaInfo, bVar, hashMap});
        }
        HashMap<String, String> hashMap2 = new HashMap<>();
        if (contentMetaInfo == null) {
            return hashMap2;
        }
        HashMap<String, String> b = b((a) contentMetaInfo, bVar, hashMap);
        b.put("content_monitor_state", String.valueOf(contentMetaInfo.e));
        b.put("content_monitor_result_code", contentMetaInfo.f);
        try {
            JSONObject jSONObject = new JSONObject(b.get("content_monitor_full_message"));
            if (contentMetaInfo.j != null) {
                jSONObject.put("content_type", contentMetaInfo.j);
            } else {
                jSONObject.put("content_type", "");
            }
            if (contentMetaInfo.i != null) {
                jSONObject.put("content_id", contentMetaInfo.i);
            } else {
                jSONObject.put("content_id", "");
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("video");
            if (jSONObject2 != null && !TextUtils.isEmpty(contentMetaInfo.g)) {
                jSONObject2.put(FontsContractCompat.Columns.FILE_ID, contentMetaInfo.g);
            }
            if (jSONObject2 != null && !TextUtils.isEmpty(contentMetaInfo.h)) {
                jSONObject2.put("video_info", contentMetaInfo.h);
            }
            jSONObject.put("video", jSONObject2);
            b.put("content_monitor_full_message", jSONObject.toString());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return b;
    }
}
