package com.alipay.mobile.common.logging.api.behavor;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.c;
import java.util.HashMap;
import java.util.Map;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class Behavor implements Parcelable {
    public static final Parcelable.Creator<Behavor> CREATOR = new Parcelable.Creator<Behavor>() { // from class: com.alipay.mobile.common.logging.api.behavor.Behavor.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public final Behavor mo563createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Behavor) ipChange.ipc$dispatch("acd5b416", new Object[]{this, parcel}) : new Behavor(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public final Behavor[] mo564newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Behavor[]) ipChange.ipc$dispatch("5b39b63f", new Object[]{this, new Integer(i)}) : new Behavor[i];
        }
    };
    private String A;
    private int B;
    private Map<String, String> C;

    /* renamed from: a  reason: collision with root package name */
    private String f5418a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private Map<String, String> s;
    private String t;
    private String u;
    private String v;
    private String w;
    private String x;
    private String y;
    private String z;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: classes3.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Behavor f5419a = new Behavor();

        public Builder(String str) {
            this.f5419a.setUserCaseID(str);
        }

        @Deprecated
        public Builder setAppID(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("2743538b", new Object[]{this, str});
            }
            this.f5419a.setAppID(str);
            return this;
        }

        @Deprecated
        public Builder setViewID(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("6d4ca8c3", new Object[]{this, str});
            }
            this.f5419a.setViewID(str);
            return this;
        }

        @Deprecated
        public Builder setRefViewID(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("9a315734", new Object[]{this, str});
            }
            this.f5419a.setRefViewID(str);
            return this;
        }

        @Deprecated
        public Builder setBehaviourPro(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("d9087613", new Object[]{this, str});
            }
            this.f5419a.setBehaviourPro(str);
            return this;
        }

        public Builder setRenderBizType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("bc4ca830", new Object[]{this, str});
            }
            this.f5419a.setRenderBizType(str);
            return this;
        }

        public Builder setSeedID(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("fdd10c77", new Object[]{this, str});
            }
            this.f5419a.setSeedID(str);
            return this;
        }

        public Builder setTrackId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("8cdd5e01", new Object[]{this, str});
            }
            this.f5419a.setTrackId(str);
            return this;
        }

        public Builder setTrackToken(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("e3769615", new Object[]{this, str});
            }
            this.f5419a.setTrackToken(str);
            return this;
        }

        public Builder setTrackDesc(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("eb04cb0b", new Object[]{this, str});
            }
            this.f5419a.setTrackDesc(str);
            return this;
        }

        public Builder setParam1(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("a90df7f", new Object[]{this, str});
            }
            this.f5419a.setParam1(str);
            return this;
        }

        public Builder setParam2(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("52903dde", new Object[]{this, str});
            }
            this.f5419a.setParam2(str);
            return this;
        }

        public Builder setParam3(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("9a8f9c3d", new Object[]{this, str});
            }
            this.f5419a.setParam3(str);
            return this;
        }

        public Builder addExtParam(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("f2c8efae", new Object[]{this, str, str2});
            }
            this.f5419a.addExtParam(str, str2);
            return this;
        }

        public Builder setExtParam(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("8f1fbc86", new Object[]{this, map});
            }
            this.f5419a.setExtParam(map);
            return this;
        }

        public Builder setPageId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("dbe892f9", new Object[]{this, str});
            }
            this.f5419a.setPageId(str);
            return this;
        }

        public Builder setSpmStatus(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("6d198a05", new Object[]{this, str});
            }
            this.f5419a.setSpmStatus(str);
            return this;
        }

        public Builder setLoggerLevel(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("f204be2c", new Object[]{this, new Integer(i)});
            }
            this.f5419a.setLoggerLevel(i);
            return this;
        }

        public Builder setPageStayTime(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("70aa022e", new Object[]{this, str});
            }
            this.f5419a.setPageStayTime(str);
            return this;
        }

        public Builder setEntityContentId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("b8834f16", new Object[]{this, str});
            }
            this.f5419a.setEntityContentId(str);
            return this;
        }

        public Builder setRefer(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("44f46f87", new Object[]{this, str});
            }
            this.f5419a.setRefer(str);
            return this;
        }

        public Builder setAbTestInfo(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("41728f02", new Object[]{this, str});
            }
            this.f5419a.setAbTestInfo(str);
            return this;
        }

        public Builder setXpath(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ed9f244a", new Object[]{this, str});
            }
            this.f5419a.setxPath(str);
            return this;
        }

        public Builder addExtParams5(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("af2dee0c", new Object[]{this, str, str2});
            }
            this.f5419a.addExtParam5(str, str2);
            return this;
        }

        public Behavor build() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Behavor) ipChange.ipc$dispatch("4f241b98", new Object[]{this}) : this.f5419a;
        }

        public void click() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8acd460f", new Object[]{this});
            } else {
                LoggerFactory.getBehavorLogger().click(this.f5419a);
            }
        }

        public void openPage() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c778a800", new Object[]{this});
            } else {
                LoggerFactory.getBehavorLogger().openPage(this.f5419a);
            }
        }

        public void longClick() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b5e2af3", new Object[]{this});
            } else {
                LoggerFactory.getBehavorLogger().longClick(this.f5419a);
            }
        }

        public void submit() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8423f89f", new Object[]{this});
            } else {
                LoggerFactory.getBehavorLogger().submit(this.f5419a);
            }
        }

        public void slide() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d07481b8", new Object[]{this});
            } else {
                LoggerFactory.getBehavorLogger().slide(this.f5419a);
            }
        }

        public void autoOpenPage() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e1fcb4f", new Object[]{this});
            } else {
                LoggerFactory.getBehavorLogger().autoOpenPage(this.f5419a);
            }
        }

        public void autoEvent() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c08e5132", new Object[]{this});
            } else {
                LoggerFactory.getBehavorLogger().autoEvent(this.f5419a);
            }
        }
    }

    public String getUserCaseID() {
        return this.f5418a;
    }

    public void setUserCaseID(String str) {
        this.f5418a = str;
    }

    public String getAppID() {
        return this.b;
    }

    @Deprecated
    public void setAppID(String str) {
        this.b = str;
    }

    public String getViewID() {
        return this.d;
    }

    @Deprecated
    public void setViewID(String str) {
        this.d = str;
    }

    public String getRefViewID() {
        return this.e;
    }

    @Deprecated
    public void setRefViewID(String str) {
        this.e = str;
    }

    public String getSeedID() {
        return this.f;
    }

    public void setSeedID(String str) {
        this.f = str;
    }

    public String getParam1() {
        return this.g;
    }

    public void setParam1(String str) {
        this.g = str;
    }

    public String getParam2() {
        return this.h;
    }

    public void setParam2(String str) {
        this.h = str;
    }

    public String getParam3() {
        return this.i;
    }

    public void setParam3(String str) {
        this.i = str;
    }

    @Deprecated
    public String getLegacyParam() {
        return this.j;
    }

    @Deprecated
    public void setLegacyParam(String str) {
        this.j = str;
    }

    public String getTrackId() {
        return this.k;
    }

    public void setTrackId(String str) {
        this.k = str;
    }

    public String getTrackToken() {
        return this.l;
    }

    public void setTrackToken(String str) {
        this.l = str;
    }

    public String getTrackDesc() {
        return this.m;
    }

    public void setTrackDesc(String str) {
        this.m = str;
    }

    public Map<String, String> getExtParams() {
        if (this.s == null) {
            this.s = new HashMap();
        }
        return this.s;
    }

    public void addExtParam(String str, String str2) {
        if (this.s == null) {
            this.s = new HashMap();
        }
        this.s.put(str, str2);
    }

    public void setExtParam(Map<String, String> map) {
        this.s = map;
    }

    public void removeExtParam(String str) {
        Map<String, String> map = this.s;
        if (map == null) {
            return;
        }
        map.remove(str);
    }

    public String getStatus() {
        return this.n;
    }

    @Deprecated
    public void setStatus(String str) {
        this.n = str;
    }

    public String getStatusMsg() {
        return this.o;
    }

    @Deprecated
    public void setStatusMsg(String str) {
        this.o = str;
    }

    public String getUrl() {
        return this.p;
    }

    @Deprecated
    public void setUrl(String str) {
        this.p = str;
    }

    public String getBehaviourPro() {
        return this.q;
    }

    public String getRenderBizType() {
        return this.A;
    }

    public void setRenderBizType(String str) {
        this.A = str;
    }

    public void setBehaviourPro(String str) {
        this.q = str;
    }

    public String getLogPro() {
        return this.r;
    }

    @Deprecated
    public void setLogPro(String str) {
        this.r = str;
    }

    public String getAppVersion() {
        return this.c;
    }

    @Deprecated
    public void setAppVersion(String str) {
        this.c = str;
    }

    public String getPageId() {
        return this.t;
    }

    public void setPageId(String str) {
        this.t = str;
    }

    public String getSpmStatus() {
        return this.u;
    }

    public void setSpmStatus(String str) {
        this.u = str;
    }

    public int getLoggerLevel() {
        return this.B;
    }

    public void setLoggerLevel(int i) {
        this.B = i;
    }

    public String getEntityContentId() {
        return this.v;
    }

    public void setEntityContentId(String str) {
        this.v = str;
    }

    public String getPageStayTime() {
        return this.w;
    }

    public void setPageStayTime(String str) {
        this.w = str;
    }

    public String getRefer() {
        return this.x;
    }

    public void setRefer(String str) {
        this.x = str;
    }

    public String getAbTestInfo() {
        return this.y;
    }

    public void setAbTestInfo(String str) {
        this.y = str;
    }

    public String getxPath() {
        return this.z;
    }

    public void setxPath(String str) {
        this.z = str;
    }

    public Map<String, String> getExtParams5() {
        if (this.C == null) {
            this.C = new HashMap();
        }
        return this.C;
    }

    public void addExtParam5(String str, String str2) {
        if (this.C == null) {
            this.C = new HashMap();
        }
        this.C.put(str, str2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5418a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        Map<String, String> map = this.s;
        if (map == null) {
            map = new HashMap<>();
        }
        this.s = map;
        parcel.writeInt(this.s.size());
        for (Map.Entry<String, String> entry : this.s.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeString(this.x);
        parcel.writeString(this.y);
        parcel.writeString(this.z);
        parcel.writeInt(this.B);
        parcel.writeString(this.A);
        parcel.writeInt(this.C.size());
        for (Map.Entry<String, String> entry2 : this.C.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeString(entry2.getValue());
        }
    }

    public Behavor() {
        this.q = RVStartParams.KEY_URL_SHORT;
        this.r = c.TAG;
        this.A = null;
        this.B = 2;
    }

    protected Behavor(Parcel parcel) {
        this.q = RVStartParams.KEY_URL_SHORT;
        this.r = c.TAG;
        this.A = null;
        this.B = 2;
        this.f5418a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.k = parcel.readString();
        this.l = parcel.readString();
        this.m = parcel.readString();
        this.n = parcel.readString();
        this.o = parcel.readString();
        this.p = parcel.readString();
        this.q = parcel.readString();
        this.A = parcel.readString();
        this.r = parcel.readString();
        int readInt = parcel.readInt();
        this.s = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            this.s.put(parcel.readString(), parcel.readString());
        }
        this.t = parcel.readString();
        this.u = parcel.readString();
        this.v = parcel.readString();
        this.w = parcel.readString();
        this.x = parcel.readString();
        this.y = parcel.readString();
        this.z = parcel.readString();
        this.B = parcel.readInt();
        this.A = parcel.readString();
        int readInt2 = parcel.readInt();
        this.C = new HashMap(readInt2);
        for (int i2 = 0; i2 < readInt2; i2++) {
            this.C.put(parcel.readString(), parcel.readString());
        }
    }
}
