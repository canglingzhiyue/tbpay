package com.alipay.android.phone.iifaa.did.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes3.dex */
public class VerifiableCredentialBasicInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String credentialStatusUrl;
    public String expirationDate;
    public String id;
    public String issuanceDate;
    public String issuer;
    public List<String> type;

    public VerifiableCredentialBasicInfo() {
    }

    public VerifiableCredentialBasicInfo(VerifiableCredential verifiableCredential) {
        this.type = verifiableCredential.getType();
        this.issuer = verifiableCredential.getIssuer();
        this.id = verifiableCredential.getId();
        this.issuanceDate = verifiableCredential.getIssuanceDate();
        this.expirationDate = verifiableCredential.getExpirationDate();
        if (verifiableCredential.getCredentialStatus() != null) {
            this.credentialStatusUrl = verifiableCredential.getCredentialStatus().getId();
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && VerifiableCredentialBasicInfo.class == obj.getClass()) {
            VerifiableCredentialBasicInfo verifiableCredentialBasicInfo = (VerifiableCredentialBasicInfo) obj;
            List<String> list = this.type;
            if (list == null ? verifiableCredentialBasicInfo.type != null : !list.equals(verifiableCredentialBasicInfo.type)) {
                return false;
            }
            String str = this.issuer;
            if (str == null ? verifiableCredentialBasicInfo.issuer != null : !str.equals(verifiableCredentialBasicInfo.issuer)) {
                return false;
            }
            String str2 = this.id;
            if (str2 != null) {
                return str2.equals(verifiableCredentialBasicInfo.id);
            }
            if (verifiableCredentialBasicInfo.id == null) {
                return true;
            }
        }
        return false;
    }

    public String getCredentialStatusUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9e259aa9", new Object[]{this}) : this.credentialStatusUrl;
    }

    public String getExpirationDate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9615a8e6", new Object[]{this}) : this.expirationDate;
    }

    public String getId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("81e05888", new Object[]{this}) : this.id;
    }

    public String getIssuanceDate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d726c33a", new Object[]{this}) : this.issuanceDate;
    }

    public String getIssuer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50464caa", new Object[]{this}) : this.issuer;
    }

    public List<String> getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("8797d930", new Object[]{this}) : this.type;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        List<String> list = this.type;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.issuer;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.id;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public void setCredentialStatusUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee633555", new Object[]{this, str});
        } else {
            this.credentialStatusUrl = str;
        }
    }

    public void setExpirationDate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d6b9550", new Object[]{this, str});
        } else {
            this.expirationDate = str;
        }
    }

    public void setId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb80bee", new Object[]{this, str});
        } else {
            this.id = str;
        }
    }

    public void setIssuanceDate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e50187c", new Object[]{this, str});
        } else {
            this.issuanceDate = str;
        }
    }

    public void setIssuer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("582d360c", new Object[]{this, str});
        } else {
            this.issuer = str;
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
}
