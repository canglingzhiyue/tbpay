package com.taobao.appbundle.remote;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class LoadConfig implements Parcelable {
    public static final Parcelable.Creator<LoadConfig> CREATOR;
    private String bizLine;
    private String bizScene;
    private Intent failIntent;
    private String failToastText;
    private boolean isActivityAnimFromBottom;
    private boolean isTitleEnable;
    private boolean isToastEnable;
    private int logoResId;
    private Intent successIntent;
    private String successToastText;
    private String title;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    static {
        kge.a(-1605205486);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<LoadConfig>() { // from class: com.taobao.appbundle.remote.LoadConfig.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.appbundle.remote.LoadConfig, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ LoadConfig createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.appbundle.remote.LoadConfig[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ LoadConfig[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public LoadConfig a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (LoadConfig) ipChange.ipc$dispatch("1f4fd8e", new Object[]{this, parcel}) : new LoadConfig(parcel);
            }

            public LoadConfig[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (LoadConfig[]) ipChange.ipc$dispatch("56ceb63d", new Object[]{this, new Integer(i)}) : new LoadConfig[i];
            }
        };
    }

    protected LoadConfig(Parcel parcel) {
        this.bizLine = parcel.readString();
        this.bizScene = parcel.readString();
        this.title = parcel.readString();
        this.logoResId = parcel.readInt();
        this.successToastText = parcel.readString();
        this.failToastText = parcel.readString();
        this.successIntent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.failIntent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        boolean z = true;
        this.isTitleEnable = parcel.readByte() != 0;
        this.isActivityAnimFromBottom = parcel.readByte() != 0;
        this.isToastEnable = parcel.readByte() == 0 ? false : z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.bizLine);
        parcel.writeString(this.bizScene);
        parcel.writeString(this.title);
        parcel.writeInt(this.logoResId);
        parcel.writeString(this.successToastText);
        parcel.writeString(this.failToastText);
        parcel.writeParcelable(this.successIntent, i);
        parcel.writeParcelable(this.failIntent, i);
        parcel.writeByte(this.isTitleEnable ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isActivityAnimFromBottom ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isToastEnable ? (byte) 1 : (byte) 0);
    }

    public String toString() {
        return "LoadConfig{bizLine='" + this.bizLine + "'bizScene='" + this.bizScene + "', title='" + this.title + "', logoResId=" + this.logoResId + ", successToastText='" + this.successToastText + "', failToastText='" + this.failToastText + "', isTitleEnable=" + this.isTitleEnable + ", isActivityAnimFromBottom=" + this.isActivityAnimFromBottom + '}';
    }

    public String getTitle() {
        return this.title;
    }

    public int getLogoResId() {
        return this.logoResId;
    }

    public String getFailToastText() {
        return this.failToastText;
    }

    public Intent getSuccessIntent() {
        return this.successIntent;
    }

    public Intent getFailIntent() {
        return this.failIntent;
    }

    public String getBizLine() {
        return this.bizLine;
    }

    public String getBizScene() {
        return this.bizScene;
    }

    public boolean isTitleEnable() {
        return this.isTitleEnable;
    }

    public boolean isToastEnable() {
        return this.isToastEnable;
    }

    public boolean isActivityAnimFromBottom() {
        return this.isActivityAnimFromBottom;
    }

    public String getSuccessToastText() {
        return this.successToastText;
    }

    private LoadConfig(a aVar) {
        this.bizLine = a.a(aVar);
        this.bizScene = a.b(aVar);
        this.title = a.c(aVar);
        this.logoResId = a.d(aVar);
        this.successToastText = a.e(aVar);
        this.failToastText = a.f(aVar);
        this.failIntent = a.g(aVar);
        this.successIntent = a.h(aVar);
        this.isActivityAnimFromBottom = a.i(aVar);
        this.isTitleEnable = a.j(aVar);
        this.isToastEnable = a.k(aVar);
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f16299a;
        private int b;
        private String c;
        private String d;
        private Intent e;
        private Intent f;
        private String g;
        private String h;
        private boolean i;
        private boolean j = false;
        private boolean k = true;

        static {
            kge.a(1747396329);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ef059f8", new Object[]{aVar}) : aVar.g;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1d515dd7", new Object[]{aVar}) : aVar.h;
        }

        public static /* synthetic */ String c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9bb261b6", new Object[]{aVar}) : aVar.f16299a;
        }

        public static /* synthetic */ int d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f84e525e", new Object[]{aVar})).intValue() : aVar.b;
        }

        public static /* synthetic */ String e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("98746974", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ String f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("16d56d53", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ Intent g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("62ba0425", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ Intent h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("9b9a64c4", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ boolean i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("43b111b4", new Object[]{aVar})).booleanValue() : aVar.j;
        }

        public static /* synthetic */ boolean j(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b92b37f5", new Object[]{aVar})).booleanValue() : aVar.i;
        }

        public static /* synthetic */ boolean k(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2ea55e36", new Object[]{aVar})).booleanValue() : aVar.k;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f43e80a4", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public a a(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("290bde11", new Object[]{this, intent});
            }
            this.f = intent;
            return this;
        }

        public LoadConfig a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (LoadConfig) ipChange.ipc$dispatch("1ae464b", new Object[]{this}) : new LoadConfig(this);
        }
    }
}
