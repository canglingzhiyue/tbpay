package com.taobao.android.searchbaseframe.context;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.f;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class BaseSearchContext implements Parcelable, a {
    public static final Parcelable.Creator<BaseSearchContext> CREATOR;
    protected final Map<String, String> mParams = new HashMap();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseSearchContext(Map<String, String> map) {
        handleParams(map);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseSearchContext() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseSearchContext(Parcel parcel) {
        HashMap readHashMap = parcel.readHashMap(null);
        if (readHashMap != null) {
            this.mParams.putAll(readHashMap);
        }
    }

    public static BaseSearchContext fromIntent(Intent intent) {
        return fromMap(f.a(intent));
    }

    public static BaseSearchContext fromMap(Map<String, String> map) {
        if (map == null) {
            return new BaseSearchContext();
        }
        return new BaseSearchContext(map);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void handleParams(Map<String, String> map) {
        this.mParams.putAll(map);
    }

    public void clearParams() {
        this.mParams.clear();
    }

    @Override // com.taobao.android.searchbaseframe.context.a
    public boolean getBooleanParam(String str) {
        return "true".equals(getParam(str));
    }

    @Override // com.taobao.android.searchbaseframe.context.a
    public String getParam(String str) {
        return getParam(str, "");
    }

    @Override // com.taobao.android.searchbaseframe.context.a
    public String getParam(String str, String str2) {
        String str3 = this.mParams.get(str);
        return str3 == null ? str2 : str3;
    }

    @Override // com.taobao.android.searchbaseframe.context.a
    public void setParam(String str, String str2) {
        this.mParams.put(str, str2);
    }

    public String removeParam(String str) {
        return this.mParams.remove(str);
    }

    @Override // com.taobao.android.searchbaseframe.context.a
    public Map<String, String> getParamsSnapshot() {
        return new HashMap(this.mParams);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.mParams);
    }

    static {
        kge.a(344650728);
        kge.a(1630535278);
        kge.a(2035390956);
        CREATOR = new Parcelable.Creator<BaseSearchContext>() { // from class: com.taobao.android.searchbaseframe.context.BaseSearchContext.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.searchbaseframe.context.BaseSearchContext, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ BaseSearchContext createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.android.searchbaseframe.context.BaseSearchContext[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ BaseSearchContext[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public BaseSearchContext a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (BaseSearchContext) ipChange.ipc$dispatch("3c3a2cb8", new Object[]{this, parcel}) : new BaseSearchContext(parcel);
            }

            public BaseSearchContext[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (BaseSearchContext[]) ipChange.ipc$dispatch("d661a827", new Object[]{this, new Integer(i)}) : new BaseSearchContext[0];
            }
        };
    }
}
