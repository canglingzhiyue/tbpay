package com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.LiveItem;
import tb.hir;
import tb.kge;

/* loaded from: classes6.dex */
public class ButtonStateHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes6.dex */
    public enum ButtonState {
        DOWN_SHELF("1"),
        VIP_BUY("2"),
        TIME_SHELF("3"),
        PRE_SALE_PREHEATING("4"),
        SINGLE_DEFAULT("6"),
        SINGLE_DEFAULT_NEWBUY("7"),
        PRE_SALE_DEPOSIT("8");
        
        private String value;

        ButtonState(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    static {
        kge.a(1535522653);
    }

    public void a(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, LiveItem liveItem, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("575ddb6a", new Object[]{this, cVar, liveItem, new Boolean(z), new Boolean(z2)});
        } else if (liveItem == null) {
        } else {
            liveItem.native_buttonStatus = b(cVar, liveItem, z, z2);
        }
    }

    public void a(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, JSONObject jSONObject, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe92d381", new Object[]{this, cVar, jSONObject, new Boolean(z), new Boolean(z2)});
        } else if (jSONObject == null) {
        } else {
            jSONObject.put("native_buttonStatus", (Object) b(cVar, jSONObject, z, z2));
        }
    }

    private String b(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, JSONObject jSONObject, boolean z, boolean z2) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        boolean z3 = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6579b800", new Object[]{this, cVar, jSONObject, new Boolean(z), new Boolean(z2)});
        }
        if (jSONObject == null) {
            return ButtonState.SINGLE_DEFAULT.value;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("liveItemStatusData");
        if (jSONObject3 != null && (jSONObject3.getBooleanValue("isDownShelf") || jSONObject3.getBooleanValue("isGray"))) {
            return ButtonState.DOWN_SHELF.value;
        }
        if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().h(cVar) != 0 && !com.taobao.android.live.plugin.atype.flexalocal.good.a.a().f(cVar) && z2 && (jSONObject2 = jSONObject.getJSONObject("extendVal")) != null) {
            String string = jSONObject2.getString("liveItemBizTags");
            if (!StringUtils.isEmpty(string)) {
                if (!string.contains("vipFirst") && !string.contains("vipBuyGift")) {
                    z3 = false;
                }
                if (z3) {
                    return ButtonState.VIP_BUY.value;
                }
            }
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("itemExtData");
        if (jSONObject4 != null) {
            if (StringUtils.equals("0", jSONObject4.getString("timingUpShelfStatus")) && hir.d()) {
                return ButtonState.TIME_SHELF.value;
            }
            String string2 = jSONObject4.getString("preSaleStatus");
            if (StringUtils.equals("0", string2)) {
                return ButtonState.PRE_SALE_PREHEATING.value;
            }
            if (StringUtils.equals("1", string2)) {
                return ButtonState.PRE_SALE_DEPOSIT.value;
            }
        }
        return z ? ButtonState.SINGLE_DEFAULT_NEWBUY.value : ButtonState.SINGLE_DEFAULT.value;
    }

    private String b(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, LiveItem liveItem, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        boolean z3 = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4c95755", new Object[]{this, cVar, liveItem, new Boolean(z), new Boolean(z2)});
        }
        if (liveItem == null) {
            return ButtonState.SINGLE_DEFAULT.value;
        }
        if (liveItem.liveItemStatusData != null && (liveItem.liveItemStatusData.getBooleanValue("isDownShelf") || liveItem.liveItemStatusData.getBooleanValue("isGray"))) {
            return ButtonState.DOWN_SHELF.value;
        }
        if (liveItem.extendVal != null && liveItem.extendVal.liveItemBizTags != null) {
            if ((!liveItem.extendVal.liveItemBizTags.contains("vipFirst") && !liveItem.extendVal.liveItemBizTags.contains("vipBuyGift")) || com.taobao.android.live.plugin.atype.flexalocal.good.a.a().h(cVar) == 0 || com.taobao.android.live.plugin.atype.flexalocal.good.a.a().f(cVar) || !z2) {
                z3 = false;
            }
            if (z3) {
                return ButtonState.VIP_BUY.value;
            }
        }
        if (liveItem.itemExtData != null) {
            if (StringUtils.equals("0", liveItem.itemExtData.getString("timingUpShelfStatus")) && hir.d()) {
                return ButtonState.TIME_SHELF.value;
            }
            String string = liveItem.itemExtData.getString("preSaleStatus");
            if (StringUtils.equals("0", string)) {
                return ButtonState.PRE_SALE_PREHEATING.value;
            }
            if (StringUtils.equals("1", string)) {
                return ButtonState.PRE_SALE_DEPOSIT.value;
            }
        }
        return z ? ButtonState.SINGLE_DEFAULT_NEWBUY.value : ButtonState.SINGLE_DEFAULT.value;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        return StringUtils.equals("nbButton", str) || StringUtils.equals("twoButton", str);
    }
}
