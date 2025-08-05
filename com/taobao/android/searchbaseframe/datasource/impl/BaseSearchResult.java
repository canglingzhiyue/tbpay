package com.taobao.android.searchbaseframe.datasource.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultLayoutInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.datasource.result.AbsSearchResult;
import com.taobao.android.searchbaseframe.datasource.result.SearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.imn;
import tb.isj;
import tb.kge;

/* loaded from: classes6.dex */
public class BaseSearchResult extends AbsSearchResult {
    public static final Parcelable.Creator<BaseSearchResult> CREATOR;
    private static final String LOG_TAG = "BaseSearchResult";
    protected final List<BaseCellBean> mCells;
    private final Map<String, String> mExtMods;
    private boolean mHasBarrier;
    private boolean mHasSectionClip;
    private boolean mHasSections;
    private ResultMainInfoBean mMainInfo;
    private final Map<String, BaseTypedBean> mMods;
    private final Map<String, String> mRawMods;
    private JSONObject mRawResult;
    private List<TabBean> mTabs;

    @Override // com.taobao.android.searchbaseframe.datasource.result.AbsSearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BaseSearchResult(imn imnVar, boolean z) {
        super(imnVar, z);
        this.mCells = new ArrayList();
        this.mMainInfo = ResultMainInfoBean.createDefault();
        this.mMods = new HashMap();
        this.mRawMods = new HashMap();
        this.mExtMods = new HashMap();
    }

    protected BaseSearchResult(Parcel parcel) {
        super(parcel);
        this.mCells = new ArrayList();
        this.mMainInfo = ResultMainInfoBean.createDefault();
        this.mMods = new HashMap();
        this.mRawMods = new HashMap();
        this.mExtMods = new HashMap();
        parcel.readList(this.mCells, getClass().getClassLoader());
        this.mMainInfo = (ResultMainInfoBean) parcel.readSerializable();
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        for (String str : readBundle.keySet()) {
            this.mMods.put(str, (BaseTypedBean) readBundle.getSerializable(str));
        }
        Bundle readBundle2 = parcel.readBundle(getClass().getClassLoader());
        for (String str2 : readBundle2.keySet()) {
            this.mRawMods.put(str2, readBundle2.getString(str2));
        }
        Bundle readBundle3 = parcel.readBundle(getClass().getClassLoader());
        for (String str3 : readBundle3.keySet()) {
            this.mExtMods.put(str3, readBundle3.getString(str3));
        }
    }

    public void _setDebugRawResult(JSONObject jSONObject) {
        this.mRawResult = jSONObject;
    }

    public JSONObject _getDebugRawResult() {
        return this.mRawResult;
    }

    public void setHasSections(boolean z) {
        this.mHasSections = z;
    }

    public void setHasBarrier(boolean z) {
        this.mHasBarrier = z;
    }

    public void setHasSectionClip(boolean z) {
        this.mHasSectionClip = z;
    }

    public boolean hasSectionClip() {
        return this.mHasSectionClip;
    }

    public boolean hasSections() {
        return this.mHasSections;
    }

    public boolean hasBarrier() {
        return this.mHasBarrier;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.AbsSearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeList(this.mCells);
        parcel.writeSerializable(this.mMainInfo);
        Bundle bundle = new Bundle(this.mMods.size());
        for (Map.Entry<String, BaseTypedBean> entry : this.mMods.entrySet()) {
            bundle.putSerializable(entry.getKey(), entry.getValue());
        }
        parcel.writeBundle(bundle);
        Bundle bundle2 = new Bundle(this.mRawMods.size());
        for (Map.Entry<String, String> entry2 : this.mRawMods.entrySet()) {
            bundle2.putString(entry2.getKey(), entry2.getValue());
        }
        parcel.writeBundle(bundle2);
        Bundle bundle3 = new Bundle(this.mExtMods.size());
        for (Map.Entry<String, String> entry3 : this.mExtMods.entrySet()) {
            bundle3.putString(entry3.getKey(), entry3.getValue());
        }
        parcel.writeBundle(bundle3);
    }

    static {
        kge.a(972764713);
        CREATOR = new Parcelable.Creator<BaseSearchResult>() { // from class: com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ BaseSearchResult createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ BaseSearchResult[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public BaseSearchResult a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (BaseSearchResult) ipChange.ipc$dispatch("a2ae402d", new Object[]{this, parcel}) : new BaseSearchResult(parcel);
            }

            public BaseSearchResult[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (BaseSearchResult[]) ipChange.ipc$dispatch("d9d8d9de", new Object[]{this, new Integer(i)}) : new BaseSearchResult[i];
            }
        };
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public void merge(SearchResult searchResult) {
        if (!(searchResult instanceof BaseSearchResult)) {
            c().b().b(LOG_TAG, "result is not BaseSearchResult");
            return;
        }
        BaseSearchResult baseSearchResult = (BaseSearchResult) searchResult;
        onCellMerge(baseSearchResult);
        this.mExtMods.putAll(baseSearchResult.mExtMods);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onCellMerge(BaseSearchResult baseSearchResult) {
        this.mCells.addAll(baseSearchResult.mCells);
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public final int getTotalResult() {
        return this.mMainInfo.totalResult;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public int getPageSize() {
        return this.mMainInfo.pageSize;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public boolean isPageFinished() {
        return this.mMainInfo.finish;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public int calcMuiseCellCount() {
        int i = 0;
        for (BaseCellBean baseCellBean : getCells()) {
            if (baseCellBean instanceof MuiseCellBean) {
                i++;
            }
        }
        return i;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public final int getPageNo() {
        return this.mMainInfo.page;
    }

    public void setMainInfo(ResultMainInfoBean resultMainInfoBean) {
        this.mMainInfo = resultMainInfoBean;
    }

    public final ResultMainInfoBean getMainInfo() {
        return this.mMainInfo;
    }

    public ResultLayoutInfoBean getThemeBean() {
        return this.mMainInfo.layoutInfo;
    }

    public final BaseCellBean getCell(int i) {
        return this.mCells.get(i);
    }

    public void addCell(BaseCellBean baseCellBean) {
        this.mCells.add(baseCellBean);
    }

    public void addCells(List<BaseCellBean> list) {
        this.mCells.addAll(list);
    }

    public void addCell(BaseCellBean baseCellBean, int i) {
        this.mCells.add(Math.min(this.mCells.size(), Math.max(0, i)), baseCellBean);
    }

    public final int getCellsCount() {
        return this.mCells.size();
    }

    public final List<BaseCellBean> getCells() {
        return this.mCells;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public boolean hasListResult() {
        if (this.mCells.size() > 0) {
            return true;
        }
        if (this.mMainInfo.layoutInfo == null) {
            return false;
        }
        List<String> list = this.mMainInfo.layoutInfo.listHeaders;
        if (!list.isEmpty()) {
            for (String str : list) {
                if (getMod(str) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Map<String, BaseTypedBean> getMods() {
        return this.mMods;
    }

    public final BaseTypedBean getMod(String str) {
        return this.mMods.get(str);
    }

    public void addMod(String str, BaseTypedBean baseTypedBean) {
        this.mMods.put(str, baseTypedBean);
    }

    public final String getRawMod(String str) {
        return this.mRawMods.get(str);
    }

    public void addRawMod(String str, String str2) {
        this.mRawMods.put(str, str2);
    }

    public final String getExtMod(String str) {
        return this.mExtMods.get(str);
    }

    public final String popExtMod(String str) {
        String str2 = this.mExtMods.get(str);
        this.mExtMods.remove(str);
        return str2;
    }

    public void addExtMod(String str, String str2) {
        this.mExtMods.put(str, str2);
    }

    public final boolean isModDynamic(BaseTypedBean baseTypedBean) {
        return isj.a(baseTypedBean) || isj.b(baseTypedBean);
    }

    public void setTabs(List<TabBean> list) {
        this.mTabs = list;
    }

    public List<TabBean> getTabs() {
        return this.mTabs;
    }

    public String toString() {
        return buildSummaryInfo(new StringBuilder()).toString();
    }

    public StringBuilder buildSummaryInfo(StringBuilder sb) {
        sb.append("Template Count: ");
        sb.append(getTemplates() == null ? 0 : getTemplates().size());
        sb.append('\n');
        sb.append("Cell Count: ");
        sb.append(this.mCells.size());
        sb.append('\n');
        sb.append("Mods Count: ");
        sb.append(this.mMods.size());
        sb.append('\n');
        return sb;
    }
}
