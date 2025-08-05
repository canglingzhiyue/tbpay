package com.etao.kakalib.express;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.huoyan.util.f;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import tb.kge;

/* loaded from: classes4.dex */
public class ExpressResult implements Parcelable {
    public static final Parcelable.Creator<ExpressResult> CREATOR;
    public String companyName;
    public String mExpressCode;
    public List<String> order;
    public ExpressSection[] stepInfo;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    static {
        kge.a(975983956);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<ExpressResult>() { // from class: com.etao.kakalib.express.ExpressResult.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public ExpressResult mo637createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ExpressResult) ipChange.ipc$dispatch("dd0fdc1a", new Object[]{this, parcel}) : new ExpressResult(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public ExpressResult[] mo638newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ExpressResult[]) ipChange.ipc$dispatch("ed9aea03", new Object[]{this, new Integer(i)}) : new ExpressResult[i];
            }
        };
    }

    private ExpressResult(Parcel parcel) {
        this.stepInfo = (ExpressSection[]) parcel.readArray(ExpressResult.class.getClassLoader());
    }

    private ExpressResult() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeArray(this.stepInfo);
    }

    /* loaded from: classes4.dex */
    public static class ExpressSection implements Parcelable {
        public static final Parcelable.Creator<ExpressSection> CREATOR;
        private SimpleDateFormat mDataFormat;
        private SimpleDateFormat mShowDataFormat;
        public String sinceNow;
        public String statusDesc;
        public String statusTime;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getStatusDesc() {
            return this.statusDesc;
        }

        public void setStatusDesc(String str) {
            this.statusDesc = str;
        }

        public String getStatusTime() {
            return this.statusTime;
        }

        public void setStatusTime(String str) {
            long j;
            try {
                j = this.mDataFormat.parse(str).getTime();
            } catch (ParseException e) {
                e.printStackTrace();
                j = 0;
            }
            this.statusTime = this.mShowDataFormat.format(new Date(j));
            this.sinceNow = f.a(j);
        }

        public String getSinceNow() {
            return this.sinceNow;
        }

        public void setSinceNow(String str) {
            this.sinceNow = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.statusDesc);
            parcel.writeString(this.statusTime);
            parcel.writeString(this.sinceNow);
        }

        static {
            kge.a(-1778393403);
            kge.a(1630535278);
            CREATOR = new Parcelable.Creator<ExpressSection>() { // from class: com.etao.kakalib.express.ExpressResult.ExpressSection.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                /* renamed from: createFromParcel */
                public ExpressSection mo639createFromParcel(Parcel parcel) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (ExpressSection) ipChange.ipc$dispatch("b34bd703", new Object[]{this, parcel}) : new ExpressSection(parcel);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                /* renamed from: newArray */
                public ExpressSection[] mo640newArray(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (ExpressSection[]) ipChange.ipc$dispatch("d16819fa", new Object[]{this, new Integer(i)}) : new ExpressSection[i];
                }
            };
        }

        private ExpressSection(Parcel parcel) {
            this.statusDesc = parcel.readString();
            this.statusTime = parcel.readString();
            this.sinceNow = parcel.readString();
        }

        public ExpressSection() {
            this.mDataFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            this.mShowDataFormat = new SimpleDateFormat("MM-dd HH:mm");
        }
    }

    public boolean isTaobaoExpress() {
        List<String> list = this.order;
        return list != null && list.size() > 0;
    }

    public long getOrderId() {
        List<String> list = this.order;
        return Long.parseLong(list != null ? list.get(0) : "0");
    }

    public List<String> getOrderList() {
        return this.order;
    }
}
