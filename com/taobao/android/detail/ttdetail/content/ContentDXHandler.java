package com.taobao.android.detail.ttdetail.content;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.l;
import java.io.Serializable;
import tb.eyx;
import tb.kge;

/* loaded from: classes4.dex */
public class ContentDXHandler implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FUN_CLICK_CONTENT = "clickContent";
    private static final String FUN_CLICK_ELEVATOR_BACK_TOP = "backToTop";
    private static final String FUN_CLICK_ELEVATOR_EXPAND = "expand";
    private static final String FUN_CLICK_ELEVATOR_FLOOR = "clickFloor";
    private static final String FUN_FILTER = "filter";
    private static final String FUN_LOAD_DATA = "loadData";
    private static final String FUN_LOAD_MORE = "loadMoreData";
    private static final String FUN_OPEN_CONTENT = "openContent";
    private static final String FUN_OPEN_URL = "openUrl";
    private static final String TAG = "ContentDXHandler";

    static {
        kge.a(-2019883578);
        kge.a(1028243835);
    }

    public static boolean handleEvent(Context context, eyx eyxVar, TTDContentController tTDContentController, i iVar, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7aa675a", new Object[]{context, eyxVar, tTDContentController, iVar, objArr})).booleanValue();
        }
        if (objArr == null || objArr.length == 0 || !(objArr[0] instanceof String)) {
            return false;
        }
        if (context instanceof ContentDetailActivity) {
            return handleContentDetailEvent(context, objArr);
        }
        return handleContentListDxEvent(context, tTDContentController, iVar, objArr);
    }

    private static boolean handleContentDetailEvent(Context context, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1671234c", new Object[]{context, objArr})).booleanValue();
        }
        ContentDetailActivity contentDetailActivity = (ContentDetailActivity) context;
        if (FUN_LOAD_MORE.equals((String) objArr[0])) {
            contentDetailActivity.a();
        }
        return true;
    }

    private static boolean handleContentListDxEvent(Context context, TTDContentController tTDContentController, i iVar, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c09e669", new Object[]{context, tTDContentController, iVar, objArr})).booleanValue();
        }
        String str = (String) objArr[0];
        if (FUN_CLICK_ELEVATOR_FLOOR.equals(str) && objArr.length >= 2) {
            com.taobao.android.detail.ttdetail.utils.i.a(TAG, "content tab user clickFloor with locatorId: " + ((String) objArr[1]));
            return true;
        } else if (FUN_CLICK_ELEVATOR_BACK_TOP.equals(str)) {
            com.taobao.android.detail.ttdetail.utils.i.a(TAG, "content tab user click backToTop");
            return true;
        } else if ("expand".equals(str)) {
            com.taobao.android.detail.ttdetail.utils.i.a(TAG, "content tab user click floor to expand");
            return true;
        } else {
            if (FUN_LOAD_MORE.equals(str)) {
                tTDContentController.h();
            } else if (FUN_OPEN_CONTENT.equals(str)) {
                String str2 = (String) objArr[1];
                tTDContentController.a(findIndexByContentId(tTDContentController, str2));
                Bundle bundle = new Bundle();
                bundle.putString("dxName", (String) objArr[2]);
                bundle.putString("dxVersion", (String) objArr[3]);
                bundle.putString("dxUrl", (String) objArr[4]);
                bundle.putString("uniqueId", tTDContentController.i());
                l.a(context, bundle, 10, "http://internal.tt.content.taobao.com/awp/core/detail/content.htm?contentId=" + str2);
                trackContentCardClick(context, objArr);
            } else if ("filter".equals(str)) {
                String str3 = (String) objArr[1];
                tTDContentController.a(str3);
                trackContentFilterClick(context, objArr, str3);
            } else if ("openUrl".equals(str)) {
                try {
                    l.a(context, (String) objArr[1]);
                } catch (Throwable th) {
                    com.taobao.android.detail.ttdetail.utils.i.a(TAG, "open url error : ", th);
                }
            } else if (FUN_LOAD_DATA.equals(str)) {
                tTDContentController.g();
            } else if ("clickContent".equals(str)) {
                iVar.e();
            }
            return true;
        }
    }

    private static void trackContentCardClick(Context context, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef89bba", new Object[]{context, objArr});
        } else if (objArr.length < 6 || !(objArr[5] instanceof JSONObject)) {
        } else {
            final JSONObject jSONObject = (JSONObject) objArr[5];
            com.taobao.android.detail.ttdetail.communication.c.a(context, new com.taobao.android.detail.ttdetail.bizmessage.h("userTrack", new JSONObject() { // from class: com.taobao.android.detail.ttdetail.content.ContentDXHandler.1
                {
                    put("arg1", "Page_Detail_Button_ContentTab_Card");
                    put("args", (Object) JSONObject.this);
                }
            }, new RuntimeAbilityParam[0]));
        }
    }

    private static void trackContentFilterClick(Context context, Object[] objArr, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6cf611c", new Object[]{context, objArr, str});
        } else if (objArr.length < 3 || !(objArr[2] instanceof JSONObject)) {
        } else {
            final JSONObject jSONObject = (JSONObject) objArr[2];
            com.taobao.android.detail.ttdetail.communication.c.a(context, new com.taobao.android.detail.ttdetail.bizmessage.h("userTrack", new JSONObject() { // from class: com.taobao.android.detail.ttdetail.content.ContentDXHandler.2
                {
                    put("arg1", "Page_Detail_Button_ContentTab_Filter");
                    put("args", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.content.ContentDXHandler.2.1
                        {
                            putAll(JSONObject.this);
                            put("FilterType", (Object) str);
                        }
                    });
                }
            }, new RuntimeAbilityParam[0]));
        }
    }

    private static int findIndexByContentId(TTDContentController tTDContentController, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e3ced99", new Object[]{tTDContentController, str})).intValue() : tTDContentController.b(str);
    }
}
