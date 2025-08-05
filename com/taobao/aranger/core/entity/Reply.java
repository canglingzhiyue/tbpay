package com.taobao.aranger.core.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import com.taobao.aranger.utils.e;
import tb.kge;

/* loaded from: classes.dex */
public class Reply implements Parcelable {
    public static final Parcelable.Creator<Reply> CREATOR;
    private int mErrorCode;
    private String mErrorMessage;
    private ParameterWrapper[] mFlowParameterWrappers;
    private long mInvokeTime;
    private Object mResult;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static Reply obtain() {
        return new Reply();
    }

    static {
        kge.a(206218210);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<Reply>() { // from class: com.taobao.aranger.core.entity.Reply.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.aranger.core.entity.Reply] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Reply createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.aranger.core.entity.Reply[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Reply[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public Reply a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Reply) ipChange.ipc$dispatch("bb881afe", new Object[]{this, parcel});
                }
                Reply obtain = Reply.obtain();
                obtain.readFromParcel(parcel);
                return obtain;
            }

            public Reply[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Reply[]) ipChange.ipc$dispatch("1786336d", new Object[]{this, new Integer(i)}) : new Reply[i];
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte((byte) this.mErrorCode);
        if (!TextUtils.isEmpty(this.mErrorMessage)) {
            parcel.writeByte((byte) 0);
            parcel.writeString(this.mErrorMessage);
        } else {
            parcel.writeByte((byte) 1);
        }
        if (this.mFlowParameterWrappers != null) {
            parcel.writeByte((byte) 0);
            e.a(parcel, this.mFlowParameterWrappers, i, true);
        } else {
            parcel.writeByte((byte) 1);
        }
        parcel.writeInt((int) this.mInvokeTime);
        e.a(parcel, this.mResult, i, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readFromParcel(Parcel parcel) {
        this.mErrorCode = parcel.readByte();
        if (parcel.readByte() == 0) {
            this.mErrorMessage = parcel.readString();
        }
        if (parcel.readByte() == 0) {
            this.mFlowParameterWrappers = (ParameterWrapper[]) e.a(getClass().getClassLoader(), parcel);
        }
        this.mInvokeTime = parcel.readInt();
        this.mResult = e.a(getClass().getClassLoader(), parcel);
    }

    private Reply() {
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public String getErrorMessage() {
        return this.mErrorMessage;
    }

    public boolean isError() {
        return this.mErrorCode != 0;
    }

    public Object getResult() {
        return this.mResult;
    }

    public ParameterWrapper[] getFlowParameterWrappers() {
        return this.mFlowParameterWrappers;
    }

    public Reply setFlowParameterWrappers(ParameterWrapper[] parameterWrapperArr) {
        this.mFlowParameterWrappers = parameterWrapperArr;
        return this;
    }

    public long getInvokeTime() {
        return this.mInvokeTime;
    }

    public Reply setInvokeTime(long j) {
        this.mInvokeTime = j;
        return this;
    }

    public Reply setErrorCode(int i) {
        this.mErrorCode = i;
        return this;
    }

    public Reply setErrorMessage(String str) {
        this.mErrorMessage = str;
        return this;
    }

    public Reply setResult(Object obj) {
        this.mResult = obj;
        return this;
    }
}
