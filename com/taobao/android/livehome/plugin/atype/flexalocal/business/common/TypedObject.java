package com.taobao.android.livehome.plugin.atype.flexalocal.business.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class TypedObject implements Parcelable, IMTOPDataObject {
    public static final Parcelable.Creator<TypedObject> CREATOR;
    public int dataType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    static {
        kge.a(-196867993);
        kge.a(-350052935);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<TypedObject>() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.business.common.TypedObject.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.livehome.plugin.atype.flexalocal.business.common.TypedObject, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ TypedObject createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.android.livehome.plugin.atype.flexalocal.business.common.TypedObject[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ TypedObject[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public TypedObject a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (TypedObject) ipChange.ipc$dispatch("4d6f152f", new Object[]{this, parcel}) : new TypedObject(parcel);
            }

            public TypedObject[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (TypedObject[]) ipChange.ipc$dispatch("4d13ad60", new Object[]{this, new Integer(i)}) : new TypedObject[i];
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.dataType);
    }

    public TypedObject() {
    }

    protected TypedObject(Parcel parcel) {
        this();
        this.dataType = parcel.readInt();
    }
}
