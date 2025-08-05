package com.alipay.mobile.common.amnet.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class AmnetPost implements Parcelable {
    public static final Parcelable.Creator<AmnetPost> CREATOR = new Parcelable.Creator<AmnetPost>() { // from class: com.alipay.mobile.common.amnet.api.model.AmnetPost.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public AmnetPost mo555createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AmnetPost) ipChange.ipc$dispatch("b39803e4", new Object[]{this, parcel}) : new AmnetPost(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public AmnetPost[] mo556newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AmnetPost[]) ipChange.ipc$dispatch("8387c4d", new Object[]{this, new Integer(i)}) : new AmnetPost[i];
        }
    };
    public static final String MMTP_EXT_FORWARD_IP = "mmtp_forward_ip";
    public byte[] body;
    public byte channel;
    public Map<String, String> header;
    public boolean important;
    public long ipcM2p;
    public boolean isUrgent;
    public boolean localAmnet;
    public boolean multiplex;
    public Map<String, String> params;
    public int reqSeqId;
    public boolean secret;
    public boolean toBizSys;
    public long ts;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AmnetPost() {
        this.reqSeqId = -1;
        this.secret = false;
        this.important = false;
        this.toBizSys = true;
        this.ts = 0L;
        this.multiplex = false;
        this.localAmnet = false;
        this.isUrgent = false;
    }

    public void addParam(String str, String str2) {
        if (this.params == null) {
            this.params = new HashMap();
        }
        this.params.put(str, str2);
    }

    private AmnetPost(Parcel parcel) {
        this.reqSeqId = -1;
        this.secret = false;
        this.important = false;
        this.toBizSys = true;
        this.ts = 0L;
        this.multiplex = false;
        this.localAmnet = false;
        this.isUrgent = false;
        readFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.channel);
        parcel.writeMap(this.header);
        parcel.writeInt(this.body.length);
        parcel.writeByteArray(this.body);
        parcel.writeInt(this.reqSeqId);
        parcel.writeByte(this.secret ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.important ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.toBizSys ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.ts);
        parcel.writeLong(this.ipcM2p);
        parcel.writeMap(this.params);
        parcel.writeByte(this.isUrgent ? (byte) 1 : (byte) 0);
    }

    public void readFromParcel(Parcel parcel) {
        this.channel = parcel.readByte();
        this.header = new HashMap();
        parcel.readMap(this.header, getClass().getClassLoader());
        this.body = new byte[parcel.readInt()];
        parcel.readByteArray(this.body);
        this.reqSeqId = parcel.readInt();
        boolean z = true;
        this.secret = parcel.readByte() != 0;
        this.important = parcel.readByte() != 0;
        this.toBizSys = parcel.readByte() != 0;
        this.ts = parcel.readLong();
        this.ipcM2p = parcel.readLong();
        this.params = new HashMap();
        parcel.readMap(this.params, getClass().getClassLoader());
        if (parcel.readByte() == 0) {
            z = false;
        }
        this.isUrgent = z;
    }
}
