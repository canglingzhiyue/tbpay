package com.taobao.search.mmd.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import tb.kge;
import tb.noa;
import tb.nog;

/* loaded from: classes7.dex */
public class SearchContext implements Parcelable {
    public static final Parcelable.Creator<SearchContext> CREATOR;
    private static final String KEY_BIZARGS = "bizargs";
    private static final String KEY_FOOTPRINT_ABTEST = "footprintAbtest";
    public static String compassTitleForUT;
    private String inShopCompassDisplayQuery;
    public String lastCompassTitle;
    private final HashMap<String, String> mLocalParams;
    private final HashSet<String> mParamBlackList;
    private final HashMap<String, String> mWsearchParams;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SearchContext(Map<String, String> map) {
        this.mParamBlackList = new HashSet<>();
        this.mLocalParams = new HashMap<>();
        this.mWsearchParams = new HashMap<>();
        this.inShopCompassDisplayQuery = "";
        this.lastCompassTitle = "";
        String d = g.d();
        if (!TextUtils.isEmpty(d)) {
            map.put(noa.KEY_EDITION_CODE, d);
        }
        initBlackList();
        handleParams(map);
        String str = map.get("q");
        this.inShopCompassDisplayQuery = TextUtils.isEmpty(str) ? "" : str;
    }

    private SearchContext() {
        this.mParamBlackList = new HashSet<>();
        this.mLocalParams = new HashMap<>();
        this.mWsearchParams = new HashMap<>();
        this.inShopCompassDisplayQuery = "";
        this.lastCompassTitle = "";
    }

    public static SearchContext fromMap(Map<String, String> map) {
        if (map == null) {
            return new SearchContext();
        }
        return new SearchContext(map);
    }

    private void handleParams(Map<String, String> map) {
        Iterator<String> it = this.mParamBlackList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            String remove = map.remove(next);
            if (!TextUtils.isEmpty(remove)) {
                this.mLocalParams.put(next, remove);
            }
        }
        this.mWsearchParams.putAll(map);
        rewriteKeywordValue();
        String wsearchParam = getWsearchParam("catId");
        if (!TextUtils.isEmpty(wsearchParam)) {
            this.mWsearchParams.put(noa.KEY_CATMAP, wsearchParam);
        }
        this.mLocalParams.putAll(c.a(this.mLocalParams.get(KEY_BIZARGS)));
    }

    private void initBlackList() {
        this.mParamBlackList.add("referrer");
        this.mParamBlackList.add("price");
        this.mParamBlackList.add("tagInfo");
        this.mParamBlackList.add(nog.PRD_PICURL);
        this.mParamBlackList.add("compassQuery");
        this.mParamBlackList.add(KEY_BIZARGS);
        this.mParamBlackList.add("searchTips");
        this.mParamBlackList.add("searchWord");
        this.mParamBlackList.add(com.taobao.search.common.util.k.KEY_DATASOURCE_TOKEN);
        this.mParamBlackList.add(com.taobao.search.common.util.k.KEY_SRP_CUSTOM_TITLE);
        this.mParamBlackList.add(com.taobao.search.common.util.k.FROM_SEARCH_TUNNEL);
        this.mParamBlackList.add(com.taobao.search.common.util.k.DEFAULT_ONESEARCH_URL);
    }

    private void rewriteKeywordValue() {
        String wsearchParam = getWsearchParam("q");
        String remove = this.mWsearchParams.remove("query");
        if (!TextUtils.isEmpty(remove)) {
            wsearchParam = remove;
        }
        String remove2 = this.mWsearchParams.remove("search");
        if (!TextUtils.isEmpty(remove2)) {
            wsearchParam = remove2;
        }
        HashMap<String, String> hashMap = this.mWsearchParams;
        if (wsearchParam == null || "null".equals(wsearchParam)) {
            wsearchParam = "";
        }
        hashMap.put("q", wsearchParam);
    }

    public String getWsearchParam(String str) {
        return getWsearchParam(str, "");
    }

    public String getWsearchParam(String str, String str2) {
        String str3 = this.mWsearchParams.get(str);
        return str3 == null ? str2 : str3;
    }

    public String getKeyword() {
        return getWsearchParam("q");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.mParamBlackList);
        parcel.writeMap(this.mLocalParams);
        parcel.writeMap(this.mWsearchParams);
        parcel.writeString(this.inShopCompassDisplayQuery);
        parcel.writeString(this.lastCompassTitle);
    }

    static {
        kge.a(476995481);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<SearchContext>() { // from class: com.taobao.search.mmd.util.SearchContext.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.search.mmd.util.SearchContext, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ SearchContext createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.search.mmd.util.SearchContext[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ SearchContext[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public SearchContext a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (SearchContext) ipChange.ipc$dispatch("e87a1ba7", new Object[]{this, parcel}) : new SearchContext(parcel);
            }

            public SearchContext[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (SearchContext[]) ipChange.ipc$dispatch("6dc86496", new Object[]{this, new Integer(i)}) : new SearchContext[0];
            }
        };
    }

    private SearchContext(Parcel parcel) {
        this.mParamBlackList = new HashSet<>();
        this.mLocalParams = new HashMap<>();
        this.mWsearchParams = new HashMap<>();
        this.inShopCompassDisplayQuery = "";
        this.lastCompassTitle = "";
        HashSet hashSet = (HashSet) parcel.readSerializable();
        HashMap readHashMap = parcel.readHashMap(null);
        HashMap readHashMap2 = parcel.readHashMap(null);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (hashSet != null) {
            this.mParamBlackList.addAll(hashSet);
        }
        if (readHashMap != null) {
            this.mLocalParams.putAll(readHashMap);
        }
        if (readHashMap2 != null) {
            this.mWsearchParams.putAll(readHashMap2);
        }
        if (readString != null) {
            this.inShopCompassDisplayQuery = readString;
        }
        if (readString2 != null) {
            this.lastCompassTitle = readString2;
        }
    }

    public HashMap<String, String> getmWsearchParams() {
        return this.mWsearchParams;
    }
}
