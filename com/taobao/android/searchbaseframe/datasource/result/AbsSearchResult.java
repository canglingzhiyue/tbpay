package com.taobao.android.searchbaseframe.datasource.result;

import android.os.Bundle;
import android.os.Parcel;
import com.taobao.android.searchbaseframe.datasource.a;
import com.taobao.android.searchbaseframe.net.ResultError;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.imn;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class AbsSearchResult implements SearchResult {
    private imn mCore;
    private boolean mIsCache;
    private boolean mIsNew;
    private boolean mIsPreLoad;
    private boolean mIsSuccess;
    private ResultError mResultError;
    private a.C0571a mSearchConfig;
    private boolean sseFinished;
    private boolean sseMode;
    private Map<String, TemplateBean> templates;

    static {
        kge.a(402799425);
        kge.a(1153290843);
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public boolean bizRuleNoResult() {
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AbsSearchResult(imn imnVar, boolean z) {
        this.mIsSuccess = true;
        this.mCore = imnVar;
        this.mIsNew = z;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public boolean isSseMode() {
        return this.sseMode;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public void setSseMode(boolean z) {
        this.sseMode = z;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public boolean isSseFinished() {
        return this.sseFinished;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public void setSseFinished(boolean z) {
        this.sseFinished = z;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public boolean isCache() {
        return this.mIsCache;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public void setCache(boolean z) {
        this.mIsCache = z;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public boolean isPreload() {
        return this.mIsPreLoad;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public void setPreLoad(boolean z) {
        this.mIsPreLoad = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbsSearchResult(Parcel parcel) {
        boolean z = true;
        this.mIsSuccess = true;
        this.mIsSuccess = parcel.readInt() == 0;
        this.mResultError = (ResultError) parcel.readSerializable();
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        if (readBundle != null) {
            this.templates = new HashMap(readBundle.size());
            for (String str : readBundle.keySet()) {
                this.templates.put(str, (TemplateBean) readBundle.getSerializable(str));
            }
        }
        this.mIsNew = parcel.readInt() != 0 ? false : z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(!this.mIsSuccess ? 1 : 0);
        parcel.writeSerializable(this.mResultError);
        Map<String, TemplateBean> map = this.templates;
        if (map != null) {
            Bundle bundle = new Bundle(map.size());
            for (Map.Entry<String, TemplateBean> entry : this.templates.entrySet()) {
                bundle.putSerializable(entry.getKey(), entry.getValue());
            }
            parcel.writeBundle(bundle);
        } else {
            parcel.writeBundle(null);
        }
        parcel.writeInt(!this.mIsNew ? 1 : 0);
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public final boolean isFailed() {
        return !this.mIsSuccess;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public boolean isSuccess() {
        return this.mIsSuccess;
    }

    public void setSuccess(boolean z) {
        this.mIsSuccess = z;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public boolean isNew() {
        return this.mIsNew;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public final ResultError getError() {
        return this.mResultError;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public void setResultError(ResultError resultError) {
        this.mIsSuccess = false;
        this.mResultError = resultError;
    }

    public final void setTemplates(Map<String, TemplateBean> map) {
        this.templates = map;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public final Map<String, TemplateBean> getTemplates() {
        return this.templates;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public final imn getCore() {
        return this.mCore;
    }

    public final imn c() {
        return this.mCore;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public final void setCore(imn imnVar) {
        this.mCore = imnVar;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public void partialMerge(Set<String> set, SearchResult searchResult) {
        throw new IllegalStateException("Not support partial search");
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public void setSearchConfig(a.C0571a c0571a) {
        this.mSearchConfig = c0571a;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public a.C0571a getSearchConfig() {
        return this.mSearchConfig;
    }
}
