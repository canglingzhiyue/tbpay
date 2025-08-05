package com.taobao.tao.tbmainfragment.anim;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes.dex */
public class DefaultHorizontalAnimator extends FragmentAnimator implements Parcelable {
    public static final Parcelable.Creator<DefaultHorizontalAnimator> CREATOR;

    @Override // com.taobao.tao.tbmainfragment.anim.FragmentAnimator, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DefaultHorizontalAnimator() {
        this.enter = R.anim.h_fragment_enter;
        this.exit = R.anim.h_fragment_exit;
        this.popEnter = R.anim.h_fragment_pop_enter;
        this.popExit = R.anim.h_fragment_pop_exit;
    }

    protected DefaultHorizontalAnimator(Parcel parcel) {
        super(parcel);
    }

    @Override // com.taobao.tao.tbmainfragment.anim.FragmentAnimator, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    static {
        kge.a(-1060023354);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<DefaultHorizontalAnimator>() { // from class: com.taobao.tao.tbmainfragment.anim.DefaultHorizontalAnimator.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.tao.tbmainfragment.anim.DefaultHorizontalAnimator] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ DefaultHorizontalAnimator createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.tao.tbmainfragment.anim.DefaultHorizontalAnimator[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ DefaultHorizontalAnimator[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public DefaultHorizontalAnimator a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (DefaultHorizontalAnimator) ipChange.ipc$dispatch("18bfc89a", new Object[]{this, parcel}) : new DefaultHorizontalAnimator(parcel);
            }

            public DefaultHorizontalAnimator[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (DefaultHorizontalAnimator[]) ipChange.ipc$dispatch("b2e74409", new Object[]{this, new Integer(i)}) : new DefaultHorizontalAnimator[i];
            }
        };
    }
}
