package android.support.v4.os;

import android.os.Parcel;

@Deprecated
/* loaded from: classes2.dex */
public interface ParcelableCompatCreatorCallbacks<T> {
    /* renamed from: createFromParcel */
    T mo1563createFromParcel(Parcel parcel, ClassLoader classLoader);

    /* renamed from: newArray */
    T[] mo1564newArray(int i);
}
