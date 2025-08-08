package com.alipay.android.phone.iifaa.did.model;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class VerifiablePresentation {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "@context", ordinal = 1)
    public List<String> context;
    @JSONField(name = "proof", ordinal = 4)
    public Proof proof;
    @JSONField(name = "type", ordinal = 2)
    public List<String> type;
    @JSONField(name = "verifiableCredential", ordinal = 3)
    public List<VerifiableCredential> verifiableCredential;

    public VerifiablePresentation() {
    }

    public VerifiablePresentation(List<VerifiableCredential> list, List<String> list2) {
        this.verifiableCredential = list;
        this.type = list2;
        this.context = Arrays.asList("https://www.w3.org/2018/credentials/v1", "https://www.w3.org/2018/credentials/examples/v1");
    }

    public VerifiablePresentation genProof(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerifiablePresentation) ipChange.ipc$dispatch("d6dcb9d6", new Object[]{this, str, str2, str3});
        }
        this.proof = new Proof(str, str2);
        if (!StringUtils.isEmpty(str3)) {
            this.proof.setChallenge(str3);
        }
        return this;
    }

    public List<String> getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("dc3e10c7", new Object[]{this}) : this.context;
    }

    public Proof getProof() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Proof) ipChange.ipc$dispatch("90c60be3", new Object[]{this}) : this.proof;
    }

    public List<String> getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("8797d930", new Object[]{this}) : this.type;
    }

    public List<VerifiableCredential> getVerifiableCredential() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f7488e70", new Object[]{this}) : this.verifiableCredential;
    }

    public void setContext(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e5629e5", new Object[]{this, list});
        } else {
            this.context = list;
        }
    }

    public void setProof(Proof proof) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254ff8b", new Object[]{this, proof});
        } else {
            this.proof = proof;
        }
    }

    public void setType(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5ea2c34", new Object[]{this, list});
        } else {
            this.type = list;
        }
    }

    public void setVerifiableCredential(List<VerifiableCredential> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b9486f4", new Object[]{this, list});
        } else {
            this.verifiableCredential = list;
        }
    }
}
