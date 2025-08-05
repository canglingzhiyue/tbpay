package com.taobao.android.pissarro.remote;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class TaopaiLoadConfig implements Parcelable {
    public static final Parcelable.Creator<TaopaiLoadConfig> CREATOR;
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

    protected TaopaiLoadConfig(Parcel parcel) {
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
        return "TaopaiLoadConfig{bizLine='" + this.bizLine + "'bizScene='" + this.bizScene + "', title='" + this.title + "', logoResId=" + this.logoResId + ", successToastText='" + this.successToastText + "', failToastText='" + this.failToastText + "', isTitleEnable=" + this.isTitleEnable + ", isActivityAnimFromBottom=" + this.isActivityAnimFromBottom + '}';
    }

    static {
        kge.a(1687710066);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<TaopaiLoadConfig>() { // from class: com.taobao.android.pissarro.remote.TaopaiLoadConfig.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.pissarro.remote.TaopaiLoadConfig] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ TaopaiLoadConfig createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.android.pissarro.remote.TaopaiLoadConfig[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ TaopaiLoadConfig[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public TaopaiLoadConfig a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (TaopaiLoadConfig) ipChange.ipc$dispatch("fdf6cc04", new Object[]{this, parcel}) : new TaopaiLoadConfig(parcel);
            }

            public TaopaiLoadConfig[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (TaopaiLoadConfig[]) ipChange.ipc$dispatch("e144e7b5", new Object[]{this, new Integer(i)}) : new TaopaiLoadConfig[i];
            }
        };
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

    private TaopaiLoadConfig(a aVar) {
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
        private String f14667a;
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
            kge.a(1899998793);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3547e056", new Object[]{aVar}) : aVar.g;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36165ed7", new Object[]{aVar}) : aVar.h;
        }

        public static /* synthetic */ String c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36e4dd58", new Object[]{aVar}) : aVar.f14667a;
        }

        public static /* synthetic */ int d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("33167b9a", new Object[]{aVar})).intValue() : aVar.b;
        }

        public static /* synthetic */ String e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3881da5a", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ String f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("395058db", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ Intent g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("2303a2cf", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ Intent h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("ca7f7c90", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ boolean i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("51297486", new Object[]{aVar})).booleanValue() : aVar.j;
        }

        public static /* synthetic */ boolean j(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("572d3fe5", new Object[]{aVar})).booleanValue() : aVar.i;
        }

        public static /* synthetic */ boolean k(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5d310b44", new Object[]{aVar})).booleanValue() : aVar.k;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5e45924e", new Object[]{this, new Boolean(z)});
            }
            this.i = z;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ddf9fa94", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dec87915", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("64495dad", new Object[]{this, new Boolean(z)});
            }
            this.k = z;
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6a4d290c", new Object[]{this, new Boolean(z)});
            }
            this.j = z;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("df96f796", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a a(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5bfa9647", new Object[]{this, intent});
            }
            this.e = intent;
            return this;
        }

        public TaopaiLoadConfig a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TaopaiLoadConfig) ipChange.ipc$dispatch("34505e67", new Object[]{this}) : new TaopaiLoadConfig(this);
        }
    }
}
