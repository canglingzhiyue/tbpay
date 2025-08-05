package com.taobao.android.detail.core.detail.content;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.nav.Nav;
import com.taobao.android.trade.event.ThreadMode;
import java.io.Serializable;
import java.util.HashMap;
import tb.dya;
import tb.ecf;
import tb.eei;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class ContentDXSubscriber extends eei<b> implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DETAIL_KEY_DESC = "divisionDesc";
    private static final String DETAIL_KEY_HONE = "detailInfoAura";
    private static final String DETAIL_KEY_RATE = "divisionRate";
    private static final String DETAIL_KEY_RECOMMEND = "divisionDescRecmd";
    private static final String FUN_CLICK_CONTENT = "clickContent";
    private static final String FUN_CLICK_ELEVATOR_BACK_TOP = "backToTop";
    private static final String FUN_CLICK_ELEVATOR_EXPAND = "expand";
    private static final String FUN_CLICK_ELEVATOR_FLOOR = "clickFloor";
    private static final String FUN_FILTER = "filter";
    private static final String FUN_LOAD_DATA = "loadData";
    private static final String FUN_LOAD_MORE = "loadMoreData";
    private static final String FUN_OPEN_CONTENT = "openContent";
    private static final String FUN_OPEN_URL = "openUrl";
    private static final String TAG = "ContentDXSubscriber";
    private final Activity mActivity;

    static {
        kge.a(350032358);
        kge.a(1028243835);
    }

    public static /* synthetic */ Object ipc$super(ContentDXSubscriber contentDXSubscriber, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ContentDXSubscriber(Activity activity) {
        this.mActivity = activity;
        emu.a("com.taobao.android.detail.core.detail.content.ContentDXSubscriber");
    }

    @Override // tb.eei, com.taobao.android.trade.event.j
    public com.taobao.android.trade.event.i handleEvent(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("b35d583a", new Object[]{this, bVar});
        }
        if (this.mActivity == null) {
            return com.taobao.android.trade.event.i.FAILURE;
        }
        Object[] objArr = (Object[]) bVar.getParam();
        if (objArr == null || objArr.length == 0 || !(objArr[0] instanceof String)) {
            return com.taobao.android.trade.event.i.FAILURE;
        }
        Activity activity = this.mActivity;
        if (activity instanceof DetailCoreActivity) {
            return handleContentListDxEvent(objArr);
        }
        if (activity instanceof ContentDetailActivity) {
            return handleContentDetailEvent(objArr);
        }
        return com.taobao.android.trade.event.i.SUCCESS;
    }

    private com.taobao.android.trade.event.i handleContentDetailEvent(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("d68d55fd", new Object[]{this, objArr});
        }
        ContentDetailActivity contentDetailActivity = (ContentDetailActivity) this.mActivity;
        if (FUN_LOAD_MORE.equals((String) objArr[0])) {
            contentDetailActivity.a();
        }
        return com.taobao.android.trade.event.i.SUCCESS;
    }

    private com.taobao.android.trade.event.i handleContentListDxEvent(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("2ffa441c", new Object[]{this, objArr});
        }
        String str = (String) objArr[0];
        dya y = ((DetailCoreActivity) this.mActivity).y();
        if (y == null) {
            return com.taobao.android.trade.event.i.FAILURE;
        }
        if (FUN_CLICK_ELEVATOR_FLOOR.equals(str) && objArr.length >= 2) {
            String str2 = (String) objArr[1];
            y.k.c.b(str2);
            if (objArr.length < 3) {
                ecf.a(this.mActivity, "detailV3", "BackToTop");
            } else {
                ecf.a(this.mActivity, "detailV3", getHighlightType(str2));
            }
            return com.taobao.android.trade.event.i.SUCCESS;
        } else if (FUN_CLICK_ELEVATOR_BACK_TOP.equals(str)) {
            y.k.c.b(DETAIL_KEY_HONE);
            return com.taobao.android.trade.event.i.SUCCESS;
        } else if ("expand".equals(str) && y.k != null && y.k.c != null) {
            y.k.c.f();
            return com.taobao.android.trade.event.i.SUCCESS;
        } else if (y.y() == null || y.y().e() == null) {
            return com.taobao.android.trade.event.i.FAILURE;
        } else {
            ContentController e = y.y().e();
            if (FUN_LOAD_MORE.equals(str)) {
                e.f();
            } else if (FUN_OPEN_CONTENT.equals(str)) {
                String str3 = (String) objArr[1];
                e.a(findIndexByContentId(e, str3));
                Bundle bundle = new Bundle();
                bundle.putString("dxName", (String) objArr[2]);
                bundle.putString("dxVersion", (String) objArr[3]);
                bundle.putString("dxUrl", (String) objArr[4]);
                bundle.putString("uniqueId", e.h());
                Nav.from(this.mActivity).withExtras(bundle).forResult(10).toUri(Uri.parse("http://h5.m.taobao.com/awp/core/detail/content.htm?contentId=" + str3));
                trackContentCardClick(objArr);
            } else if ("filter".equals(str)) {
                String str4 = (String) objArr[1];
                e.a(str4);
                trackContentFilterClick(objArr, str4);
            } else if ("openUrl".equals(str)) {
                try {
                    Nav.from(this.mActivity).toUri(Uri.parse((String) objArr[1]));
                } catch (Exception e2) {
                    com.taobao.android.detail.core.utils.i.a(TAG, "open url error : " + Log.getStackTraceString(e2));
                }
            } else if (FUN_LOAD_DATA.equals(str)) {
                e.e();
            } else if ("clickContent".equals(str)) {
                y.y().a(1);
            }
            return com.taobao.android.trade.event.i.SUCCESS;
        }
    }

    private void trackContentCardClick(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b898c0", new Object[]{this, objArr});
        } else if (objArr.length < 6 || !(objArr[5] instanceof JSONObject)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.putAll((JSONObject) objArr[5]);
            ecf.i(this.mActivity, hashMap);
        }
    }

    private void trackContentFilterClick(Object[] objArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("297ed172", new Object[]{this, objArr, str});
        } else if (objArr.length < 3 || !(objArr[2] instanceof JSONObject)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.putAll((JSONObject) objArr[2]);
            hashMap.put("FilterType", str);
            ecf.j(this.mActivity, hashMap);
        }
    }

    private int findIndexByContentId(ContentController contentController, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c5b8e0d", new Object[]{this, contentController, str})).intValue() : contentController.b(str);
    }

    private String getHighlightType(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("896dc8d7", new Object[]{this, str}) : DETAIL_KEY_HONE.equals(str) ? "GotoDetailHome" : "divisionRate".equals(str) ? "GotoDetailRate" : "divisionDesc".equals(str) ? "GotoDetailDesc" : "divisionDescRecmd".equals(str) ? "GotoShopRecommend" : "";
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
