package com.alipay.android.phone.iifaa.did.model;

import android.os.Build;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public class Proof {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(ordinal = 5)
    public String challenge;
    @JSONField(ordinal = 2)
    public String created;
    @JSONField(ordinal = 3)
    public String proofPurpose;
    @JSONField(ordinal = 6)
    public String proofValue;
    @JSONField(ordinal = 7)
    public String txId;
    @JSONField(ordinal = 1)
    public String type;
    @JSONField(ordinal = 4)
    public String verificationMethod;

    public Proof() {
    }

    public Proof(String str, String str2) {
        this.type = str;
        Date date = new Date();
        this.created = Build.VERSION.SDK_INT >= 24 ? new SimpleDateFormat("EEE MMM dd HH:mm:ss 'GMT'XXX yyyy", Locale.ENGLISH).format(date) : date.toString();
        this.verificationMethod = str2;
    }

    public String getChallenge() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("14c87f6c", new Object[]{this}) : this.challenge;
    }

    public String getCreated() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7da37787", new Object[]{this}) : this.created;
    }

    public String getProofPurpose() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("542bf349", new Object[]{this}) : this.proofPurpose;
    }

    public String getProofValue() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aca83456", new Object[]{this}) : this.proofValue;
    }

    public String getTxId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43d042e4", new Object[]{this}) : this.txId;
    }

    public String getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : this.type;
    }

    public String getVerificationMethod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6b9a1167", new Object[]{this}) : this.verificationMethod;
    }

    public void setChallenge(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68529f2", new Object[]{this, str});
        } else {
            this.challenge = str;
        }
    }

    public void setCreated(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dcf0237", new Object[]{this, str});
        } else {
            this.created = str;
        }
    }

    public void setProofPurpose(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1f0ea4d", new Object[]{this, str});
        } else {
            this.proofPurpose = str;
        }
    }

    public void setProofValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f47dde0", new Object[]{this, str});
        } else {
            this.proofValue = str;
        }
    }

    public void setTxId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab75a12", new Object[]{this, str});
        } else {
            this.txId = str;
        }
    }

    public void setType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
        } else {
            this.type = str;
        }
    }

    public void setVerificationMethod(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b79d6ef", new Object[]{this, str});
        } else {
            this.verificationMethod = str;
        }
    }
}
