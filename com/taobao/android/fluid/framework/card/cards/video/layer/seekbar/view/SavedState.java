package com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<SavedState> CREATOR;
    public float currSelectedMax;
    public float currSelectedMin;
    public float maxValue;
    public float minValue;
    public float rangeInterval;
    public int tickNumber;

    static {
        kge.a(1565220556);
        CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.SavedState.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.SavedState] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.SavedState[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ SavedState[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public SavedState a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (SavedState) ipChange.ipc$dispatch("811058aa", new Object[]{this, parcel}) : new SavedState(parcel);
            }

            public SavedState[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (SavedState[]) ipChange.ipc$dispatch("29efa89b", new Object[]{this, new Integer(i)}) : new SavedState[i];
            }
        };
    }

    public SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    private SavedState(Parcel parcel) {
        super(parcel);
        this.minValue = parcel.readFloat();
        this.maxValue = parcel.readFloat();
        this.rangeInterval = parcel.readFloat();
        this.tickNumber = parcel.readInt();
        this.currSelectedMin = parcel.readFloat();
        this.currSelectedMax = parcel.readFloat();
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.minValue);
        parcel.writeFloat(this.maxValue);
        parcel.writeFloat(this.rangeInterval);
        parcel.writeInt(this.tickNumber);
        parcel.writeFloat(this.currSelectedMin);
        parcel.writeFloat(this.currSelectedMax);
    }
}
