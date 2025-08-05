package com.taobao.android.stdpop;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class PopConfigModel implements Parcelable {
    public static final Parcelable.Creator<PopConfigModel> CREATOR;
    public boolean animateBackground;
    public String animation;
    public boolean droidFullScreen;
    public boolean droidPanEnable;
    public boolean droidShouldHandleBack;
    public boolean enableBindingX;
    public boolean enableSendEventToFromPage;
    public boolean enableWindowChangeNotify;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PopConfigModel() {
        this.enableWindowChangeNotify = true;
        this.enableSendEventToFromPage = false;
        this.animation = null;
        this.animateBackground = false;
        this.droidFullScreen = true;
        this.droidShouldHandleBack = true;
        this.droidPanEnable = false;
        this.enableBindingX = false;
    }

    protected PopConfigModel(Parcel parcel) {
        boolean z = true;
        this.enableWindowChangeNotify = true;
        this.enableSendEventToFromPage = false;
        this.animation = null;
        this.animateBackground = false;
        this.droidFullScreen = true;
        this.droidShouldHandleBack = true;
        this.droidPanEnable = false;
        this.enableBindingX = false;
        this.enableWindowChangeNotify = parcel.readByte() != 0;
        this.enableSendEventToFromPage = parcel.readByte() != 0;
        this.animation = parcel.readString();
        this.animateBackground = parcel.readByte() != 0;
        this.droidFullScreen = parcel.readByte() != 0;
        this.droidShouldHandleBack = parcel.readByte() != 0;
        this.droidPanEnable = parcel.readByte() != 0;
        this.enableBindingX = parcel.readByte() == 0 ? false : z;
    }

    static {
        kge.a(-1836285948);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<PopConfigModel>() { // from class: com.taobao.android.stdpop.PopConfigModel.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.stdpop.PopConfigModel, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ PopConfigModel createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.android.stdpop.PopConfigModel[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ PopConfigModel[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public PopConfigModel a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (PopConfigModel) ipChange.ipc$dispatch("3620089c", new Object[]{this, parcel}) : new PopConfigModel(parcel);
            }

            public PopConfigModel[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (PopConfigModel[]) ipChange.ipc$dispatch("bb6e518b", new Object[]{this, new Integer(i)}) : new PopConfigModel[i];
            }
        };
    }

    public String toString() {
        return "PopConfigModel{enableWindowChangeNotify=" + this.enableWindowChangeNotify + ", enableSendEventToFromPage=" + this.enableSendEventToFromPage + ", animation='" + this.animation + "', animateBackground=" + this.animateBackground + "', droidFullScreen='" + this.droidFullScreen + "', droidShouldHandleBack='" + this.droidShouldHandleBack + "', droidPanEnable='" + this.droidPanEnable + "', enableBindingX='" + this.enableBindingX + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.enableWindowChangeNotify ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableSendEventToFromPage ? (byte) 1 : (byte) 0);
        parcel.writeString(this.animation);
        parcel.writeByte(this.animateBackground ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.droidFullScreen ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.droidShouldHandleBack ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.droidPanEnable ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableBindingX ? (byte) 1 : (byte) 0);
    }
}
