package com.taobao.search.sf.context;

import android.content.Intent;
import android.os.Parcel;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.context.BaseSearchContext;
import com.taobao.android.searchbaseframe.util.f;
import com.taobao.android.searchbaseframe.util.g;
import com.taobao.android.task.Coordinator;
import com.taobao.search.common.util.k;
import com.taobao.search.common.util.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.kgt;
import tb.nde;
import tb.noa;

/* loaded from: classes8.dex */
public class CommonSearchContext extends BaseSearchContext {
    private static final String KEY_BIZARGS = "bizargs";
    private static volatile List<String> sBlackList;
    public static final HashSet<String> sOtherTabWhiteList;
    private Map<String, Map<String, String>> mTabParamsMap;

    static {
        kge.a(1237740404);
        sOtherTabWhiteList = new HashSet<>();
        sBlackList = new ArrayList();
        sOtherTabWhiteList.add("q");
        sOtherTabWhiteList.add("from");
        sOtherTabWhiteList.add("search_action");
        sOtherTabWhiteList.add(noa.KEY_JARVIS_DISABLED);
        sOtherTabWhiteList.add(noa.KEY_CHANGED_ADDRESS);
        sOtherTabWhiteList.add(noa.KEY_HAS_TAB);
    }

    protected CommonSearchContext(Map<String, String> map) {
        super(filterBlackListParams(map));
        this.mTabParamsMap = new HashMap();
        updateBlackList();
        String param = getParam("catId", "");
        if (!StringUtils.isEmpty(param)) {
            setParam(noa.KEY_CATMAP, param);
        }
    }

    public void updateParams(Map<String, String> map) {
        this.mParams.clear();
        handleParams(filterBlackListParams(map));
        String param = getParam("catId", "");
        if (!StringUtils.isEmpty(param)) {
            setParam(noa.KEY_CATMAP, param);
        }
    }

    private static void updateBlackList() {
        Coordinator.execute(new Runnable() { // from class: com.taobao.search.sf.context.CommonSearchContext.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                String B = r.B();
                if (StringUtils.isEmpty(B)) {
                    return;
                }
                List unused = CommonSearchContext.sBlackList = new ArrayList(Arrays.asList(B.split("&")));
            }
        });
    }

    private static Map<String, String> filterBlackListParams(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            for (String str : sBlackList) {
                map.remove(str);
            }
        }
        return map;
    }

    protected CommonSearchContext() {
        this.mTabParamsMap = new HashMap();
    }

    protected CommonSearchContext(Parcel parcel) {
        super(parcel);
        this.mTabParamsMap = new HashMap();
    }

    public static CommonSearchContext fromIntent(Intent intent) {
        return fromMap(f.a(intent));
    }

    public void setTabParams(String str, String str2, String str3) {
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            return;
        }
        Map<String, String> map = this.mTabParamsMap.get(str);
        if (map == null) {
            map = new HashMap<>();
            this.mTabParamsMap.put(str, map);
        }
        map.put(str2, str3);
    }

    public Map<String, String> getTabParams(String str) {
        return this.mTabParamsMap.get(str);
    }

    public static CommonSearchContext fromMap(Map<String, String> map) {
        if (map == null) {
            return new CommonSearchContext();
        }
        return new CommonSearchContext(map);
    }

    public void init() {
        rewriteKeywordValue();
        handleBizArgs();
    }

    private void handleBizArgs() {
        Map<String, String> a2 = f.a(getParam(KEY_BIZARGS));
        if (a2 == null) {
            return;
        }
        for (Map.Entry<String, String> entry : a2.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!StringUtils.isEmpty(key) && !StringUtils.isEmpty(value)) {
                setParam(key, value);
            }
        }
    }

    public String getKeyword() {
        return getParam("q");
    }

    private void rewriteKeywordValue() {
        String removeParam = removeParam("query");
        String removeParam2 = removeParam("search");
        String param = getParam("q");
        if (!StringUtils.isEmpty(param)) {
            removeParam = param;
        }
        if (StringUtils.isEmpty(removeParam)) {
            removeParam = removeParam2;
        }
        if (removeParam == null || "null".equals(removeParam)) {
            removeParam = "";
        }
        setParam("q", removeParam);
    }

    public boolean isSimilarModule() {
        return StringUtils.equals(noa.VALUE_SHOWTYPE_SIMILAR, getParam(noa.KEY_SHOWTYPE));
    }

    public boolean isSameStyleModule() {
        return StringUtils.equals(noa.VALUE_SHOWTYPE_SAME, getParam(noa.KEY_SHOWTYPE));
    }

    public boolean isShopSimilarSearchModule() {
        return StringUtils.equals(noa.VALUE_SHOWTYPE_SIMILAR_SHOP, getParam("m")) || StringUtils.equals(noa.VALUE_SIMILAR_SHOP_NEW, getParam("m"));
    }

    public boolean isLongSleeveRecommendModule() {
        return StringUtils.equals(noa.VALUE_LONG_SLEEVE_RECOMMEND, getParam("m"));
    }

    public Map<String, String> getGlobalParams() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : getParamsSnapshot().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!StringUtils.isEmpty(key) && !StringUtils.isEmpty(value) && key.startsWith(noa.GLOBAL_PARAM_PREFIX)) {
                hashMap.put(key, value);
            }
        }
        return hashMap;
    }

    public String getChannelSrp() {
        String param = getParam(nde.G_CHANNELSRP);
        return StringUtils.isEmpty(param) ? getParam("channelSrp") : param;
    }

    public boolean isGallerySrp() {
        return isGallerySrp(getParam("m"));
    }

    public boolean isPopupSrp() {
        String param = getParam(noa.KEY_POP_UP);
        if (!r.bI()) {
            return false;
        }
        return StringUtils.equals(param, "true");
    }

    public boolean isChannelSrp() {
        return !StringUtils.isEmpty(getChannelSrp());
    }

    public boolean isPopupDrag() {
        return StringUtils.equals(getParamIncludingGlobal(noa.KEY_POP_UP_STYLE), kgt.EVENT_DRAG);
    }

    public boolean isPopupIcon() {
        return StringUtils.equals(getParamIncludingGlobal(noa.KEY_POP_UP_STYLE), "icon");
    }

    public boolean isPopupCloseStyle() {
        return StringUtils.equals(getParamIncludingGlobal(noa.KEY_POP_UP_STYLE), "close");
    }

    public float getPopupHeight() {
        String param = getParam(noa.KEY_POP_UP_HEIGHT);
        if (StringUtils.isEmpty(param)) {
            return -1.0f;
        }
        return g.a(param, -1.0f);
    }

    public static boolean isGallerySrp(String str) {
        return StringUtils.equals(str, "pictureview");
    }

    public Map<String, String> getOtherTabParams() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : this.mParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!StringUtils.isEmpty(key) && (sOtherTabWhiteList.contains(key) || key.startsWith(noa.GLOBAL_PARAM_PREFIX))) {
                hashMap.put(key, value);
            }
        }
        return hashMap;
    }

    public void handleInShopSearchParams() {
        String[] strArr = {"sellerId", "seller_id", "userId", "user_id"};
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String param = getParam(strArr[i]);
            if (!StringUtils.isEmpty(param)) {
                this.mParams.put("sellerId", param);
                break;
            }
            i++;
        }
        this.mParams.remove("userId");
        this.mParams.remove("user_id");
        String param2 = getParam("shop_id");
        if (!StringUtils.isEmpty(param2)) {
            this.mParams.remove("shop_id");
            this.mParams.put("shopId", param2);
        }
    }

    public String getDatasourceToken() {
        return getParam(k.KEY_DATASOURCE_TOKEN);
    }

    public String getParamIncludingGlobal(String str) {
        String param = getParam(str);
        if (StringUtils.isEmpty(param)) {
            return getParam(noa.GLOBAL_PARAM_PREFIX + str);
        }
        return param;
    }
}
