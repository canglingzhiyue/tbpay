package com.taobao.taolive.room.mediaplatform.container.h5;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.room.utils.q;
import com.taobao.taolive.sdk.goodlist.ItemGroupPageInfo;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;
import java.util.Map;
import tb.ddw;
import tb.kge;
import tb.pqj;
import tb.xkw;

/* loaded from: classes8.dex */
public class TBLiveGoodsWVPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String NO_FUNCTION = "{\"result\":\"no_function\"}";
    private static LiveItem sLiveItem;

    static {
        kge.a(-1595327662);
    }

    public static /* synthetic */ Object ipc$super(TBLiveGoodsWVPlugin tBLiveGoodsWVPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static void setLiveItem(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ae80c3", new Object[]{liveItem});
        } else {
            sLiveItem = liveItem;
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        JSONArray c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        com.taobao.tbliveinteractive.container.h5.e eVar = new com.taobao.tbliveinteractive.container.h5.e(str, str2, wVCallBackContext);
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1625877436:
                if (str.equals("closeLiveCart")) {
                    c2 = 4;
                    break;
                }
                break;
            case -1584104366:
                if (str.equals("fetchGroupItemTradeParams")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1302819495:
                if (str.equals("updateGoodItem")) {
                    c2 = 3;
                    break;
                }
                break;
            case -681442553:
                if (str.equals("showGoodsAggregationList")) {
                    c2 = 2;
                    break;
                }
                break;
            case 2036680113:
                if (str.equals("processAddCartSuccess")) {
                    c2 = 1;
                    break;
                }
                break;
        }
        if (c2 == 0) {
            JSONObject jSONObject = new JSONObject();
            LiveItem liveItem = sLiveItem;
            if (liveItem != null && liveItem.extendVal != null && sLiveItem.extendVal.groupItemTradeParams != null) {
                jSONObject.put("groupItemTradeParams", (Object) pqj.b(sLiveItem.extendVal.groupItemTradeParams));
            }
            sLiveItem = null;
            eVar.a(jSONObject.toJSONString());
            return true;
        } else if (c2 == 1) {
            Map<String, String> c3 = q.c(str2);
            if (c3 != null && c3.containsKey("itemIds") && (c = pqj.c(c3.get("itemIds"))) != null) {
                for (int i = 0; i < c.size(); i++) {
                    ddw.a().a("com.taobao.taolive.room.addcart", c.get(i), n.c());
                }
            }
            return true;
        } else if (c2 == 2) {
            if (!checkAggregationParam(str2)) {
                return false;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("show_item_group", "true");
            hashMap.put("data", str2);
            ddw.a().a(xkw.EVENT_SHOW_GOODSPACKAGE, hashMap, n.c());
            return true;
        } else if (c2 == 3) {
            Map<String, String> c4 = q.c(str2);
            if (c4 == null || c4.isEmpty()) {
                return false;
            }
            ddw.a().a("com.taobao.taolive.goods.update.item", c4, n.c());
            return true;
        } else if (c2 == 4) {
            if (wVCallBackContext.getWebview().getContext() instanceof FragmentActivity) {
                Fragment findFragmentByTag = ((FragmentActivity) wVCallBackContext.getWebview().getContext()).getSupportFragmentManager().findFragmentByTag("goods_weex_bottom");
                if (findFragmentByTag instanceof DialogFragment) {
                    ((DialogFragment) findFragmentByTag).dismissAllowingStateLoss();
                }
            }
            return true;
        } else {
            eVar.a(NO_FUNCTION);
            return true;
        }
    }

    private boolean checkAggregationParam(String str) {
        ItemGroupPageInfo itemGroupPageInfo;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("eb2d0a48", new Object[]{this, str})).booleanValue() : !TextUtils.isEmpty(str) && (itemGroupPageInfo = (ItemGroupPageInfo) JSON.parseObject(str, ItemGroupPageInfo.class)) != null && itemGroupPageInfo.checkInfo();
    }
}
