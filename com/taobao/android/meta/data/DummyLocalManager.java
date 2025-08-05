package com.taobao.android.meta.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.LocalDataManager;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class DummyLocalManager implements LocalDataManager {
    public static final a CREATOR;

    static {
        kge.a(-1298921508);
        kge.a(-1334742732);
        CREATOR = new a(null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    public DummyLocalManager() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DummyLocalManager(Parcel parcel) {
        this();
        q.c(parcel, "parcel");
    }

    /* loaded from: classes6.dex */
    public static final class a implements Parcelable.Creator<DummyLocalManager> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.meta.data.DummyLocalManager, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DummyLocalManager createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
        }

        /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.android.meta.data.DummyLocalManager[], java.lang.Object[]] */
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DummyLocalManager[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
        }

        public DummyLocalManager a(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DummyLocalManager) ipChange.ipc$dispatch("d3b3c04", new Object[]{this, parcel});
            }
            q.c(parcel, "parcel");
            return new DummyLocalManager(parcel);
        }

        public DummyLocalManager[] a(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DummyLocalManager[]) ipChange.ipc$dispatch("3a4d5b3", new Object[]{this, new Integer(i)}) : new DummyLocalManager[i];
        }
    }
}
