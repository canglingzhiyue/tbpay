package com.alibaba.android.icart.core.data.model;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class CartGlobal implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String address;
    public AllItemInfo allItemInfo;
    public ControlParas controlParas;
    public Excludes excludes;
    public Feature feature;
    public JSONArray includes;
    @JSONField(deserialize = false, serialize = false)
    private JSONObject mOriginGlobal;

    static {
        kge.a(-462191227);
        kge.a(1028243835);
    }

    public ControlParas getControlParas() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ControlParas) ipChange.ipc$dispatch("b362dcaf", new Object[]{this}) : this.controlParas;
    }

    public void setControlParas(ControlParas controlParas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c0207ad", new Object[]{this, controlParas});
        } else {
            this.controlParas = controlParas;
        }
    }

    public Excludes getExcludes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Excludes) ipChange.ipc$dispatch("837aac4f", new Object[]{this}) : this.excludes;
    }

    public JSONArray getIncludes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("4edbd6f6", new Object[]{this}) : this.includes;
    }

    public void setIncludes(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14327e7c", new Object[]{this, jSONArray});
        } else {
            this.includes = jSONArray;
        }
    }

    public void setExcludes(Excludes excludes) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe5db527", new Object[]{this, excludes});
        } else {
            this.excludes = excludes;
        }
    }

    public Feature getFeature() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Feature) ipChange.ipc$dispatch("d7f36247", new Object[]{this}) : this.feature;
    }

    public void setFeature(Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b100c3d3", new Object[]{this, feature});
        } else {
            this.feature = feature;
        }
    }

    public AllItemInfo getAllItemInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AllItemInfo) ipChange.ipc$dispatch("cbbe5eef", new Object[]{this}) : this.allItemInfo;
    }

    public void setAllItemInfo(AllItemInfo allItemInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78debbd3", new Object[]{this, allItemInfo});
        } else {
            this.allItemInfo = allItemInfo;
        }
    }

    public String getAddress() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6b6339fb", new Object[]{this}) : this.address;
    }

    public void setAddress(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8078e43", new Object[]{this, str});
        } else {
            this.address = str;
        }
    }

    public JSONObject getOriginGlobal() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("751b4d06", new Object[]{this}) : this.mOriginGlobal;
    }

    public void setOriginGlobal(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b38d123e", new Object[]{this, jSONObject});
        } else {
            this.mOriginGlobal = jSONObject;
        }
    }

    /* loaded from: classes2.dex */
    public static class ControlParas implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public JSONObject accsArgs;
        public JSONObject buyTransferParams;
        public String cartMode;
        public boolean clearFilterItemAndReQuery;
        public boolean doCalculate;
        public boolean enableDesignScale;
        public String exParamsTransparentState;
        public JSONObject feedFlowConfig;
        public JSONObject filterCheckOptimize;
        public String filterItemMAIN;
        public boolean forceRemoteCheck;
        public boolean hasAllRepeatBuy;
        public boolean isAndroidSupportItemSwipe;
        public String isCalcualteDetailDegrade;
        public boolean isPromotionChecked;
        public String jumpComponentKey;
        public boolean mixCart;
        public boolean newCart;
        public List<String> newCartTabFilterItems;
        public boolean openBadgeAndBubble;
        public JSONObject orderByH5Urls;
        public JSONObject orderByNative;
        public JSONObject popWindow;
        public boolean preLoadOpen;
        public JSONObject promotionUtInfo;
        public boolean remoteCheck;
        public JSONObject shake;
        public int supportModalBuyCount;
        public JSONArray swipeItems;
        public String toastMessage;
        public String topUrl;
        public String wakeUpErrorMsg;
        public int firstBundleLineHeight = -1;
        public boolean isShot2024ItemV2Gray = false;

        static {
            kge.a(-217698795);
            kge.a(1028243835);
        }

        public JSONArray getSwipeItems() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("d9cebabb", new Object[]{this}) : this.swipeItems;
        }

        public void setSwipeItems(JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60558057", new Object[]{this, jSONArray});
            } else {
                this.swipeItems = jSONArray;
            }
        }

        public String getToastMessage() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b7cd7663", new Object[]{this}) : this.toastMessage;
        }

        public void setToastMessage(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d27fca73", new Object[]{this, str});
            } else {
                this.toastMessage = str;
            }
        }

        public String calcualteDetailDegrade() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6e200370", new Object[]{this}) : this.isCalcualteDetailDegrade;
        }

        public void setIsCalcualteDetailDegrade(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c97dec46", new Object[]{this, str});
            } else {
                this.isCalcualteDetailDegrade = str;
            }
        }

        public List<String> getNewCartTabFilterItems() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("6d822823", new Object[]{this});
            }
            List<String> list = this.newCartTabFilterItems;
            return list == null ? Collections.emptyList() : list;
        }

        public void setNewCartTabFilterItems(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4091e309", new Object[]{this, list});
            } else {
                this.newCartTabFilterItems = list;
            }
        }

        public boolean isRemoteCheck() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9a882d63", new Object[]{this})).booleanValue() : this.remoteCheck;
        }

        public void setRemoteCheck(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("586a708d", new Object[]{this, new Boolean(z)});
            } else {
                this.remoteCheck = z;
            }
        }

        public JSONObject getOrderByNative() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("c8c3adad", new Object[]{this}) : this.orderByNative;
        }

        public void setOrderByNative(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d89dc0f", new Object[]{this, jSONObject});
            } else {
                this.orderByNative = jSONObject;
            }
        }

        public boolean isPreLoadOpen() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6562f494", new Object[]{this})).booleanValue() : this.preLoadOpen;
        }

        public void setPreLoadOpen(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8e88f7c", new Object[]{this, new Boolean(z)});
            } else {
                this.preLoadOpen = z;
            }
        }

        public JSONObject getOrderByH5Urls() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("3b3903e7", new Object[]{this}) : this.orderByH5Urls;
        }

        public void setOrderByH5Urls(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29bf4d15", new Object[]{this, jSONObject});
            } else {
                this.orderByH5Urls = jSONObject;
            }
        }

        public JSONObject getShake() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("cc06e0f7", new Object[]{this}) : this.shake;
        }

        public void setShake(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5375de05", new Object[]{this, jSONObject});
            } else {
                this.shake = jSONObject;
            }
        }

        public String getWakeUpErrorMsg() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cc2395eb", new Object[]{this}) : this.wakeUpErrorMsg;
        }

        public void setWakeUpErrorMsg(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c91b48eb", new Object[]{this, str});
            } else {
                this.wakeUpErrorMsg = str;
            }
        }

        public JSONObject getAccsArgs() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("4b4576ac", new Object[]{this}) : this.accsArgs;
        }

        public void setAccsArgs(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32007758", new Object[]{this, jSONObject});
            } else {
                this.accsArgs = jSONObject;
            }
        }

        public boolean isDoCalculate() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("443af39c", new Object[]{this})).booleanValue() : this.doCalculate;
        }

        public void setDoCalculate(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5107174", new Object[]{this, new Boolean(z)});
            } else {
                this.doCalculate = z;
            }
        }

        public String getFilterItemMAIN() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91f3f5f", new Object[]{this}) : this.filterItemMAIN;
        }

        public void setFilterItemMAIN(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b94cdf7", new Object[]{this, str});
            } else {
                this.filterItemMAIN = str;
            }
        }

        public boolean isNewCart() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f72e79e1", new Object[]{this})).booleanValue() : this.newCart;
        }

        public void setNewCart(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b33e0fcf", new Object[]{this, new Boolean(z)});
            } else {
                this.newCart = z;
            }
        }

        public boolean isHasAllRepeatBuy() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e5e99305", new Object[]{this})).booleanValue() : this.hasAllRepeatBuy;
        }

        public void setHasAllRepeatBuy(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e13632b", new Object[]{this, new Boolean(z)});
            } else {
                this.hasAllRepeatBuy = z;
            }
        }

        public JSONObject getPopWindow() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("3f75a512", new Object[]{this}) : this.popWindow;
        }

        public void setPopWindow(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c9b74a", new Object[]{this, jSONObject});
            } else {
                this.popWindow = jSONObject;
            }
        }

        public boolean isOpenBadgeAndBubble() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f52df1f", new Object[]{this})).booleanValue() : this.openBadgeAndBubble;
        }

        public void setOpenBadgeAndBubble(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aea68e1", new Object[]{this, new Boolean(z)});
            } else {
                this.openBadgeAndBubble = z;
            }
        }

        public JSONObject getFeedFlowConfig() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("6280f8eb", new Object[]{this});
            }
            JSONObject jSONObject = this.feedFlowConfig;
            return jSONObject == null ? new JSONObject(0) : jSONObject;
        }

        public void setFeedFlowConfig(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85ff95f9", new Object[]{this, jSONObject});
            } else {
                this.feedFlowConfig = jSONObject;
            }
        }

        public boolean androidSupportItemSwipe() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("441bf672", new Object[]{this})).booleanValue() : this.isAndroidSupportItemSwipe;
        }

        public void setIsAndroidSupportItemSwipe(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a1d09972", new Object[]{this, new Boolean(z)});
            } else {
                this.isAndroidSupportItemSwipe = z;
            }
        }

        public String getCartMode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91cffa40", new Object[]{this}) : this.cartMode;
        }

        public void setCartMode(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("330ca836", new Object[]{this, str});
            } else {
                this.cartMode = str;
            }
        }

        public boolean isMixCart() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c7b3fa9d", new Object[]{this})).booleanValue() : this.mixCart;
        }

        public void setMixCart(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f368a693", new Object[]{this, new Boolean(z)});
            } else {
                this.mixCart = z;
            }
        }

        public String getTopUrl() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4ffc5e29", new Object[]{this}) : this.topUrl;
        }

        public void setTopUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f39546d", new Object[]{this, str});
            } else {
                this.topUrl = str;
            }
        }

        public JSONObject getPromotionUtInfo() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("3adf32e1", new Object[]{this}) : this.promotionUtInfo;
        }

        public void setPromotionUtInfo(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7012aa5b", new Object[]{this, jSONObject});
            } else {
                this.promotionUtInfo = jSONObject;
            }
        }

        public boolean isIsPromotionChecked() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d382c623", new Object[]{this})).booleanValue() : this.isPromotionChecked;
        }

        public void setIsPromotionChecked(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cb7625d", new Object[]{this, new Boolean(z)});
            } else {
                this.isPromotionChecked = z;
            }
        }

        public boolean isClearFilterItemAndReQuery() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ca5f7f7", new Object[]{this})).booleanValue() : this.clearFilterItemAndReQuery;
        }

        public void setClearFilterItemAndReQuery(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("42af679", new Object[]{this, new Boolean(z)});
            } else {
                this.clearFilterItemAndReQuery = z;
            }
        }

        public JSONObject getFilterCheckOptimize() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e7ef7c5e", new Object[]{this}) : this.filterCheckOptimize;
        }

        public void setFilterCheckOptimize(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d9d2a7e", new Object[]{this, jSONObject});
            } else {
                this.filterCheckOptimize = jSONObject;
            }
        }

        public String getJumpComponentKey() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("12ba33d3", new Object[]{this}) : this.jumpComponentKey;
        }

        public void setJumpComponentKey(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("80ced503", new Object[]{this, str});
            } else {
                this.jumpComponentKey = str;
            }
        }

        public boolean isForceRemoteCheck() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("423a5dcc", new Object[]{this})).booleanValue() : this.forceRemoteCheck;
        }

        public void setForceRemoteCheck(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("978491d4", new Object[]{this, new Boolean(z)});
            } else {
                this.forceRemoteCheck = z;
            }
        }

        public String getExParamsTransparentState() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fdad45ab", new Object[]{this}) : this.exParamsTransparentState;
        }

        public void setExParamsTransparentState(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("572f322b", new Object[]{this, str});
            } else {
                this.exParamsTransparentState = str;
            }
        }

        public boolean isEnableDesignScale() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2b51c9aa", new Object[]{this})).booleanValue() : this.enableDesignScale;
        }

        public void setEnableDesignScale(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fac61326", new Object[]{this, new Boolean(z)});
            } else {
                this.enableDesignScale = z;
            }
        }

        public int getSupportModalBuyCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("68550ad7", new Object[]{this})).intValue() : this.supportModalBuyCount;
        }

        public void setSupportModalBuyCount(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec191d13", new Object[]{this, new Integer(i)});
            } else {
                this.supportModalBuyCount = i;
            }
        }

        public JSONObject getBuyTransferParams() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("1b7477e8", new Object[]{this}) : this.buyTransferParams;
        }

        public void setBuyTransferParams(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75227334", new Object[]{this, jSONObject});
            } else {
                this.buyTransferParams = jSONObject;
            }
        }

        public int getFirstBundleLineHeight() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1156b271", new Object[]{this})).intValue() : this.firstBundleLineHeight;
        }

        public void setFirstBundleLineHeight(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93ec651", new Object[]{this, new Integer(i)});
            } else {
                this.firstBundleLineHeight = i;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class Excludes implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public List<String> global;
        public JSONArray groupSettlementTitleList;
        public JSONObject inner;
        public List<String> innerGlobal;
        public JSONObject tip;

        static {
            kge.a(-751911368);
            kge.a(1028243835);
        }

        public JSONObject getInner() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("451b7847", new Object[]{this}) : this.inner;
        }

        public void setInner(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcf430b5", new Object[]{this, jSONObject});
            } else {
                this.inner = jSONObject;
            }
        }

        public List<String> getInnerGlobal() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("7295499d", new Object[]{this}) : this.innerGlobal;
        }

        public void setInnerGlobal(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("984b31cf", new Object[]{this, list});
            } else {
                this.innerGlobal = list;
            }
        }

        public List<String> getGlobal() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("18af07a7", new Object[]{this}) : this.global;
        }

        public void setGlobal(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7aab99d", new Object[]{this, list});
            } else {
                this.global = list;
            }
        }

        public JSONArray getGroupSettlementTitleList() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("3efc1df3", new Object[]{this}) : this.groupSettlementTitleList;
        }

        public void setGroupSettlementTitleList(JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("111b7f1f", new Object[]{this, jSONArray});
            } else {
                this.groupSettlementTitleList = jSONArray;
            }
        }

        public JSONObject getTip() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("6522b68c", new Object[]{this}) : this.tip;
        }

        public void setTip(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d5cce10", new Object[]{this, jSONObject});
            } else {
                this.tip = jSONObject;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class Feature implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean clientTotalPrice;
        public String exceedMaxCountTips;
        public boolean forceReload;
        public String forceReloadText;
        public String forceReloadTitle;
        public boolean gzip;
        public JSONObject otherParams;
        public int maxCheckCount = Integer.MAX_VALUE;
        public int checkMax = Integer.MAX_VALUE;

        static {
            kge.a(456233655);
            kge.a(1028243835);
        }

        public String getForceReloadTitle() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2089756f", new Object[]{this}) : this.forceReloadTitle;
        }

        public void setForceReloadTitle(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ce7c6e7", new Object[]{this, str});
            } else {
                this.forceReloadTitle = str;
            }
        }

        public String getForceReloadText() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ab24645e", new Object[]{this}) : this.forceReloadText;
        }

        public void setForceReloadText(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("738ffc40", new Object[]{this, str});
            } else {
                this.forceReloadText = str;
            }
        }

        public int getMaxCheckCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c518d3af", new Object[]{this})).intValue() : this.maxCheckCount;
        }

        public void setMaxCheckCount(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("752d98d3", new Object[]{this, new Integer(i)});
            } else {
                this.maxCheckCount = i;
            }
        }

        public int getCheckMax() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8f92e42c", new Object[]{this})).intValue() : this.checkMax;
        }

        public void setCheckMax(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5a07c5e", new Object[]{this, new Integer(i)});
            } else {
                this.checkMax = i;
            }
        }

        public String getExceedMaxCountTips() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dbbe9d6c", new Object[]{this}) : this.exceedMaxCountTips;
        }

        public void setExceedMaxCountTips(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ffe6cb8a", new Object[]{this, str});
            } else {
                this.exceedMaxCountTips = str;
            }
        }

        public boolean isGzip() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8b75982f", new Object[]{this})).booleanValue() : this.gzip;
        }

        public void setGzip(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f8c20fd1", new Object[]{this, new Boolean(z)});
            } else {
                this.gzip = z;
            }
        }

        public boolean isForceReload() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6180065", new Object[]{this})).booleanValue() : this.forceReload;
        }

        public void setForceReload(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ed4fdcb", new Object[]{this, new Boolean(z)});
            } else {
                this.forceReload = z;
            }
        }

        public boolean isClientTotalPrice() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c623e365", new Object[]{this})).booleanValue() : this.clientTotalPrice;
        }

        public void setClientTotalPrice(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90cbbf5b", new Object[]{this, new Boolean(z)});
            } else {
                this.clientTotalPrice = z;
            }
        }

        public JSONObject getOtherParams() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("268fb327", new Object[]{this}) : this.otherParams;
        }

        public void setOtherParams(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("350398d5", new Object[]{this, jSONObject});
            } else {
                this.otherParams = jSONObject;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class AllItemInfo implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String title;
        public int value;

        static {
            kge.a(-1789751709);
            kge.a(1028243835);
        }

        public String getTitle() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this}) : this.title;
        }

        public void setTitle(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
            } else {
                this.title = str;
            }
        }

        public int getValue() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d1b766b5", new Object[]{this})).intValue() : this.value;
        }

        public void setValue(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("935a328d", new Object[]{this, new Integer(i)});
            } else {
                this.value = i;
            }
        }
    }

    public static CartGlobal parseCartGlobal(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CartGlobal) ipChange.ipc$dispatch("4368bfed", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            CartGlobal cartGlobal = (CartGlobal) JSONObject.toJavaObject(jSONObject, CartGlobal.class);
            cartGlobal.setOriginGlobal(jSONObject);
            return cartGlobal;
        } catch (Throwable unused) {
            return new CartGlobal();
        }
    }
}
