package tb;

import android.util.Log;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliUserTrackerInterface;
import com.taobao.android.detail.mainpic.g;
import com.taobao.android.detail.mainpic.h;
import com.taobao.android.u;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.vessel.utils.VesselType;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class euw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String C_BIZNAME_MAINPIC_ERROR = "[mainpic_error]";
    public static final String C_BIZNAME_MAINPIC_INFO = "[mainpic_info]";
    public static final String ERROR_CODE_ASYNC_RESPONSE_ERROR = "[mainpic_error]async_response_error";
    public static final String ERROR_CODE_DATA_ERROR = "[mainpic_error]data_error";
    public static final String ERROR_CODE_DATA_PARSE_ERROR = "[mainpic_error]data_parse_error";
    public static final String ERROR_CODE_DELTA_INFO = "[mainpic_info]picGallery$delta";
    public static final String ERROR_CODE_DIALOG_ERROR = "[mainpic_error]dialog_error";
    public static final String ERROR_CODE_EMPTY_FRAME_DATA = "[mainpic_error]empty_frame_data";
    public static final String ERROR_CODE_EXTRADATA_PREFIX_INFO = "[mainpic_info]picGallery$extraData_";
    public static final String ERROR_CODE_INDICATOR_INFO = "[mainpic_info]picGallery$indicator";
    public static final String ERROR_CODE_LOCAL_TEMPLATE_ERROR = "[mainpic_error]local_template_error";
    public static final String ERROR_CODE_NO_FRAME = "[mainpic_error]no_frame";
    public static final String ERROR_CODE_OPEN_SHARE_FLOAT_ERROR = "[mainpic_info]openShareFloatError";
    public static final String ERROR_CODE_USE_NEW_PIC_INFO = "[mainpic_info]useNewPicGallery";
    public static final String ERROR_CODE_VIDEO_PLAY_ERROR = "[mainpic_error]video_play_error";
    public static final String ERROR_CODE_WEEX_LOAD_ERROR = "[mainpic_error]weex_load_error";
    public static final String KEY_UMBRELLA_LIGHTOFF_OPEN_SHAREFLOAT_ERROR = "10014";
    public static final String MSG_UMBRELLA_LIGHTOFF_OPEN_SHAREFLOAT_ERROR = "黑灯页打开分享面板失败";
    public static final String UT_ARG1_DELTA = "Page_Detail_Delta";
    public static final String UT_ARG1_EXTRADATA = "Page_Detail_ExtraData";
    public static final String UT_ARG1_LOCATOR = "Page_Detail_Locator";
    public static final String UT_ARG1_ONCREATE = "Page_Detail_OnCreate";

    /* renamed from: a  reason: collision with root package name */
    private static final UMLinkLogInterface f27589a = bpp.a();
    private static final AliUserTrackerInterface b = u.a();

    public static void a(g gVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a39a7f0f", new Object[]{gVar, str, str2});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("videoUrl", str);
            hashMap.put("videoId", str2);
            a(gVar, hashMap);
            f27589a.commitFailure(ERROR_CODE_VIDEO_PLAY_ERROR, "", "", "detail2", C_BIZNAME_MAINPIC_ERROR, hashMap, ERROR_CODE_VIDEO_PLAY_ERROR, "新头图视频播放错误");
        } catch (Exception e) {
            UnifyLog.d("MultiMediaMonitor", "videoPlayError commit error " + Log.getStackTraceString(e));
        }
    }

    public static void a(g gVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c759a319", new Object[]{gVar, str, str2, str3});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("api", str);
            hashMap.put("errorCode", str2);
            hashMap.put("errorMsg", str3);
            a(gVar, hashMap);
            f27589a.commitFailure(ERROR_CODE_ASYNC_RESPONSE_ERROR, "", "", "detail2", C_BIZNAME_MAINPIC_ERROR, hashMap, ERROR_CODE_ASYNC_RESPONSE_ERROR, "新头图异步接口错误");
        } catch (Exception e) {
            UnifyLog.d("MultiMediaMonitor", "asyncResponseError commit error " + Log.getStackTraceString(e));
        }
    }

    public static void a(g gVar, String str, String str2, String str3, VesselType vesselType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdfccf54", new Object[]{gVar, str, str2, str3, vesselType});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("url", str);
            hashMap.put("errorCode", str2);
            hashMap.put("errorMsg", str3);
            if (vesselType != null) {
                hashMap.put("vesselType", vesselType.toString());
            }
            a(gVar, hashMap);
            f27589a.commitFailure(ERROR_CODE_WEEX_LOAD_ERROR, "", "", "detail2", C_BIZNAME_MAINPIC_ERROR, hashMap, ERROR_CODE_WEEX_LOAD_ERROR, "新头图weex渲染错误");
        } catch (Exception e) {
            UnifyLog.d("MultiMediaMonitor", "weexLoadError commit error " + Log.getStackTraceString(e));
        }
    }

    public static void a(g gVar, String str, String str2, String str3, int i) {
        h k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23db330a", new Object[]{gVar, str, str2, str3, new Integer(i)});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("locator", str);
            hashMap.put("type", str2);
            hashMap.put("floatType", str3);
            hashMap.put("index", String.valueOf(i));
            a(gVar, hashMap);
            if (gVar != null && (k = gVar.k()) != null) {
                if (k.a(ERROR_CODE_EXTRADATA_PREFIX_INFO + str)) {
                    f27589a.commitFailure(ERROR_CODE_EXTRADATA_PREFIX_INFO + str, "", "", "detail2", C_BIZNAME_MAINPIC_INFO, hashMap, ERROR_CODE_EXTRADATA_PREFIX_INFO + str, "新头图extraData");
                }
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_Detail", 2201, UT_ARG1_EXTRADATA, null, null, hashMap).build());
        } catch (Exception e) {
            UnifyLog.d("MultiMediaMonitor", "extraDataInfo commit error " + Log.getStackTraceString(e));
        }
    }

    public static void a(g gVar, JSONArray jSONArray, int i) {
        h k;
        h k2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0642ec0", new Object[]{gVar, jSONArray, new Integer(i)});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            if (jSONArray != null) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                    jSONArray2.add(jSONArray.getJSONObject(i2).getString("locator"));
                }
                hashMap.put("locators", jSONArray2.toJSONString());
                hashMap.put("renderLocatorNum", String.valueOf(i));
            }
            a(gVar, hashMap);
            if (gVar != null && (k2 = gVar.k()) != null && k2.a(ERROR_CODE_INDICATOR_INFO)) {
                f27589a.commitFailure(ERROR_CODE_INDICATOR_INFO, "", "", "detail2", C_BIZNAME_MAINPIC_INFO, hashMap, ERROR_CODE_INDICATOR_INFO, "新头图锚点监控");
            }
            if (gVar == null || (k = gVar.k()) == null || !k.a(UT_ARG1_LOCATOR)) {
                return;
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_Detail", 2201, UT_ARG1_LOCATOR, null, null, hashMap).build());
        } catch (Exception e) {
            UnifyLog.d("MultiMediaMonitor", "indicatorInfo commit error " + Log.getStackTraceString(e));
        }
    }

    public static void a(g gVar, JSONObject jSONObject) {
        h k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc94aad5", new Object[]{gVar, jSONObject});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            if (jSONObject != null) {
                hashMap.put(c.MSG_SOURCE_PARENT, jSONObject.getString(c.MSG_SOURCE_PARENT));
                hashMap.put("position", jSONObject.getString("position"));
                hashMap.put("target", jSONObject.getString("target"));
            }
            a(gVar, hashMap);
            if (gVar != null && (k = gVar.k()) != null && k.a(ERROR_CODE_DELTA_INFO)) {
                f27589a.commitFailure(ERROR_CODE_DELTA_INFO, "", "", "detail2", C_BIZNAME_MAINPIC_INFO, hashMap, ERROR_CODE_DELTA_INFO, "新头图异步数据监控");
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_Detail", 2201, UT_ARG1_DELTA, null, null, hashMap).build());
        } catch (Exception e) {
            UnifyLog.d("MultiMediaMonitor", "deltaInfo commit error " + Log.getStackTraceString(e));
        }
    }

    public static void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("200e2b7b", new Object[]{gVar});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            a(gVar, hashMap);
            f27589a.commitFailure(ERROR_CODE_USE_NEW_PIC_INFO, "", "", "detail2", C_BIZNAME_MAINPIC_INFO, hashMap, ERROR_CODE_USE_NEW_PIC_INFO, "新头图创建实例监控");
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_Detail", 2201, UT_ARG1_ONCREATE, null, null, hashMap).build());
        } catch (Exception e) {
            UnifyLog.d("MultiMediaMonitor", "picInstanceCreateInfo commit error " + Log.getStackTraceString(e));
        }
    }

    private static void a(g gVar, Map<String, String> map) {
        Map<String, String> v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bddeaaa", new Object[]{gVar, map});
        } else if (gVar == null || (v = gVar.v()) == null) {
        } else {
            map.putAll(v);
        }
    }

    public static void a(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931341f1", new Object[]{str, gVar});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            a(gVar, hashMap);
            UMLinkLogInterface uMLinkLogInterface = f27589a;
            uMLinkLogInterface.commitFailure(str, "", "", "detail2", C_BIZNAME_MAINPIC_ERROR, hashMap, str, "新头图数据错误: " + str);
        } catch (Exception e) {
            UnifyLog.d("MultiMediaMonitor", "picGalleryDataError commit error " + Log.getStackTraceString(e));
        }
    }

    public static void b(g gVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9bd0ae", new Object[]{gVar, str, str2});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("scene", str);
            hashMap.put("errorStack", str2);
            a(gVar, hashMap);
            f27589a.commitFailure(ERROR_CODE_DATA_PARSE_ERROR, "", "", "detail2", C_BIZNAME_MAINPIC_ERROR, hashMap, ERROR_CODE_DATA_PARSE_ERROR, "新头图数据解析错误");
        } catch (Exception e) {
            UnifyLog.d("MultiMediaMonitor", "dataParseError commit error " + Log.getStackTraceString(e));
        }
    }

    public static void c(g gVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d59d224d", new Object[]{gVar, str, str2});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("scene", str);
            hashMap.put("errorStack", str2);
            a(gVar, hashMap);
            f27589a.commitFailure(ERROR_CODE_DIALOG_ERROR, "", "", "detail2", C_BIZNAME_MAINPIC_ERROR, hashMap, ERROR_CODE_DIALOG_ERROR, "新头图dialog错误");
        } catch (Exception e) {
            UnifyLog.d("MultiMediaMonitor", "dialogError commit error " + Log.getStackTraceString(e));
        }
    }

    public static void a(IDMComponent iDMComponent, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("283ed277", new Object[]{iDMComponent, gVar});
            return;
        }
        try {
            if (iDMComponent == null) {
                a(ERROR_CODE_DATA_ERROR, gVar);
                return;
            }
            List<IDMComponent> children = iDMComponent.getChildren();
            if (children != null && !children.isEmpty()) {
                for (IDMComponent iDMComponent2 : children) {
                    if (iDMComponent2 != null && iDMComponent2.getPosition() == null && !euq.d(iDMComponent2)) {
                        a(ERROR_CODE_EMPTY_FRAME_DATA, gVar);
                        return;
                    }
                }
                return;
            }
            a(ERROR_CODE_NO_FRAME, gVar);
        } catch (Exception e) {
            UnifyLog.d("MultiMediaMonitor", "checkProtocol commit error " + Log.getStackTraceString(e));
        }
    }

    public static void a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48075352", new Object[]{jSONObject, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("shareParams", str);
        if (jSONObject != null) {
            hashMap.put("itemId", jSONObject.getString("itemId"));
        }
        f27589a.commitFailure(ERROR_CODE_OPEN_SHARE_FLOAT_ERROR, "", "", "detail2", "", hashMap, "10014", MSG_UMBRELLA_LIGHTOFF_OPEN_SHAREFLOAT_ERROR);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorMsg", str);
        f27589a.commitFailure("[mainpic_info]imageSaveFailed", "", "", "detail2", "", hashMap, "[mainpic_info]imageSaveFailed", "详情2.0头图图片保存失败");
    }
}
