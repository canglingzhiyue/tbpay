package com.taobao.search.sf.datasource;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.LocalDataManager;
import com.taobao.search.sf.widgets.preposefilter.PreposeFilterBean;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.nob;

/* loaded from: classes8.dex */
public class CommonLocalManager implements LocalDataManager {
    public static final Parcelable.Creator<CommonLocalManager> CREATOR;
    public boolean isFilterBtnSelected;
    public Serializable lastClickedTag;
    public nob mCurrentTopBarBean;
    public boolean mDisableStyleChange;
    public String mKeyword;
    private Map<String, PreposeFilterBean> preposeFilterCache = new HashMap();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    public CommonLocalManager() {
    }

    protected CommonLocalManager(Parcel parcel) {
    }

    public void setDisableStyleChange(boolean z) {
        this.mDisableStyleChange = z;
    }

    public boolean isDisableStyleChange() {
        return this.mDisableStyleChange;
    }

    public void setCurrentTopBarBean(nob nobVar) {
        this.mCurrentTopBarBean = nobVar;
    }

    public nob getCurrentTopBarBean() {
        return this.mCurrentTopBarBean;
    }

    public PreposeFilterBean getCurrentPreposeFilterBean(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "all";
        }
        return this.preposeFilterCache.get(str);
    }

    public void setCurrentPreposeFilterBean(String str, PreposeFilterBean preposeFilterBean) {
        if (TextUtils.isEmpty(str)) {
            str = "all";
        }
        this.preposeFilterCache.put(str, preposeFilterBean);
    }

    static {
        kge.a(-275775313);
        kge.a(-1334742732);
        CREATOR = new Parcelable.Creator<CommonLocalManager>() { // from class: com.taobao.search.sf.datasource.CommonLocalManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.search.sf.datasource.CommonLocalManager, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ CommonLocalManager createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.search.sf.datasource.CommonLocalManager[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ CommonLocalManager[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public CommonLocalManager a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (CommonLocalManager) ipChange.ipc$dispatch("1163c311", new Object[]{this, parcel}) : new CommonLocalManager(parcel);
            }

            public CommonLocalManager[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (CommonLocalManager[]) ipChange.ipc$dispatch("20faed40", new Object[]{this, new Integer(i)}) : new CommonLocalManager[i];
            }
        };
    }
}
