package org.ifaa.android.manager.fingerprint;

import android.os.Parcel;

/* loaded from: classes9.dex */
public final class IFAAFingerprint {
    private long mDeviceId;
    private int mFingerId;
    private int mGroupId;
    private CharSequence mName;

    public IFAAFingerprint(CharSequence charSequence, int i, int i2, long j) {
        this.mName = charSequence;
        this.mGroupId = i;
        this.mFingerId = i2;
        this.mDeviceId = j;
    }

    public int describeContents() {
        return 0;
    }

    public long getDeviceId() {
        return this.mDeviceId;
    }

    public int getFingerId() {
        return this.mFingerId;
    }

    public int getGroupId() {
        return this.mGroupId;
    }

    public CharSequence getName() {
        return this.mName;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mName.toString());
        parcel.writeInt(this.mGroupId);
        parcel.writeInt(this.mFingerId);
        parcel.writeLong(this.mDeviceId);
    }
}
