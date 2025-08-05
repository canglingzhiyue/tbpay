package com.taobao.tao.tbmainfragment.anim;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class FragmentAnimator implements Parcelable {
    public static final Parcelable.Creator<FragmentAnimator> CREATOR;
    protected int enter;
    protected int exit;
    protected int popEnter;
    protected int popExit;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public FragmentAnimator() {
    }

    public FragmentAnimator(int i, int i2) {
        this.enter = i;
        this.exit = i2;
    }

    public FragmentAnimator(int i, int i2, int i3, int i4) {
        this.enter = i;
        this.exit = i2;
        this.popEnter = i3;
        this.popExit = i4;
    }

    public FragmentAnimator copy() {
        return new FragmentAnimator(getEnter(), getExit(), getPopEnter(), getPopExit());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentAnimator(Parcel parcel) {
        this.enter = parcel.readInt();
        this.exit = parcel.readInt();
        this.popEnter = parcel.readInt();
        this.popExit = parcel.readInt();
    }

    static {
        kge.a(1438586781);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<FragmentAnimator>() { // from class: com.taobao.tao.tbmainfragment.anim.FragmentAnimator.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.tao.tbmainfragment.anim.FragmentAnimator, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ FragmentAnimator createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.tao.tbmainfragment.anim.FragmentAnimator[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ FragmentAnimator[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public FragmentAnimator a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (FragmentAnimator) ipChange.ipc$dispatch("31a5e339", new Object[]{this, parcel}) : new FragmentAnimator(parcel);
            }

            public FragmentAnimator[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (FragmentAnimator[]) ipChange.ipc$dispatch("14f3feea", new Object[]{this, new Integer(i)}) : new FragmentAnimator[i];
            }
        };
    }

    public int getEnter() {
        return this.enter;
    }

    public FragmentAnimator setEnter(int i) {
        this.enter = i;
        return this;
    }

    public int getExit() {
        return this.exit;
    }

    public FragmentAnimator setExit(int i) {
        this.exit = i;
        return this;
    }

    public int getPopEnter() {
        return this.popEnter;
    }

    public FragmentAnimator setPopEnter(int i) {
        this.popEnter = i;
        return this;
    }

    public int getPopExit() {
        return this.popExit;
    }

    public FragmentAnimator setPopExit(int i) {
        this.popExit = i;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enter);
        parcel.writeInt(this.exit);
        parcel.writeInt(this.popEnter);
        parcel.writeInt(this.popExit);
    }
}
