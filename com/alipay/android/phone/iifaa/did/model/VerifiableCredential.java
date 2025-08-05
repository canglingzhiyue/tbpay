package com.alipay.android.phone.iifaa.did.model;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.android.phone.iifaa.did.model.VCFilter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.ifh;

/* loaded from: classes3.dex */
public class VerifiableCredential {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_BLIND = "BlindCredential";
    public static final String TYPE_D_IMG = "DigitalImageCredential";
    public static final String TYPE_REAL_ID = "RealIdentityCredential";
    public static final String TYPE_REAL_ID_TEST = "RealIdentityCredentialTest";
    public static final String TYPE_SELECTIVE_DISCLOSURE = "SelectiveDisclosureCredentialType";
    @JSONField(name = "@context", ordinal = 1)
    public List<String> context;
    @JSONField(name = "credentialStatus", ordinal = 8)
    public CredentialStatus credentialStatus;
    @JSONField(name = "credentialSubject", ordinal = 7)
    public CredentialSubject credentialSubject;
    @JSONField(name = "expirationDate", ordinal = 6)
    public String expirationDate;
    @JSONField(name = "id", ordinal = 3)
    public String id;
    @JSONField(name = "issuanceDate", ordinal = 5)
    public String issuanceDate;
    @JSONField(name = "issuer", ordinal = 4)
    public String issuer;
    @JSONField(name = "proof", ordinal = 9)
    public Proof proof;
    @JSONField(name = "templateId", ordinal = 10)
    public String templateId;
    @JSONField(name = "type", ordinal = 2)
    public List<String> type;
    @JSONField(name = "version", ordinal = 11)
    public String version;

    /* loaded from: classes3.dex */
    public static class CredentialStatus {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        @JSONField(name = "id", ordinal = 1)
        public String id;
        @JSONField(name = "statusListCredential", ordinal = 5)
        public String statusListCredential;
        @JSONField(name = "statusListIndex", ordinal = 4)
        public String statusListIndex;
        @JSONField(name = "statusPurpose", ordinal = 3)
        public String statusPurpose;
        @JSONField(name = "type", ordinal = 2)
        public String type;

        public String getId() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("81e05888", new Object[]{this}) : this.id;
        }

        public String getStatusListCredential() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fdb9527c", new Object[]{this}) : this.statusListCredential;
        }

        public String getStatusListIndex() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("64b239ad", new Object[]{this}) : this.statusListIndex;
        }

        public String getStatusPurpose() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a6974ba3", new Object[]{this}) : this.statusPurpose;
        }

        public String getType() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : this.type;
        }

        public void setId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb80bee", new Object[]{this, str});
            } else {
                this.id = str;
            }
        }

        public void setStatusListCredential(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9dbaa57a", new Object[]{this, str});
            } else {
                this.statusListCredential = str;
            }
        }

        public void setStatusListIndex(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebbcd0d1", new Object[]{this, str});
            } else {
                this.statusListIndex = str;
            }
        }

        public void setStatusPurpose(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60f20a9b", new Object[]{this, str});
            } else {
                this.statusPurpose = str;
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
    }

    /* loaded from: classes3.dex */
    public static class CredentialSubject {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        @JSONField(name = "claims", ordinal = 3)
        public Claims claims;
        @JSONField(name = com.taobao.tao.messagekit.base.network.a.KEY_DID, ordinal = 2)
        public String did;
        @JSONField(name = "id", ordinal = 1)
        public String id;

        /* loaded from: classes3.dex */
        public static class Claims {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            @JSONField(name = "disclosedSalt", ordinal = 2)
            public Map<String, String> disclosedSalt;
            @JSONField(name = "merkle", ordinal = 3)
            public Map<String, String> merkle;
            @JSONField(name = "merkleNoSign", ordinal = 4)
            public Map<String, String> merkleNoSign;
            @JSONField(name = "seed", ordinal = 5)
            public String seed;
            @JSONField(name = "subject", ordinal = 1)
            public Map<String, String> subject;

            public Map<String, String> getDisclosedSalt() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3c91eb36", new Object[]{this}) : this.disclosedSalt;
            }

            public Map<String, String> getMerkle() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7cc8347c", new Object[]{this}) : this.merkle;
            }

            public Map<String, String> getMerkleNoSign() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7766243a", new Object[]{this}) : this.merkleNoSign;
            }

            public String getSeed() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("28ef1e72", new Object[]{this}) : this.seed;
            }

            public Map<String, String> getSubject() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("e9f31df2", new Object[]{this}) : this.subject;
            }

            public void setDisclosedSalt(Map<String, String> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1f961fb0", new Object[]{this, map});
                } else {
                    this.disclosedSalt = map;
                }
            }

            public void setMerkle(Map<String, String> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5dcc5a92", new Object[]{this, map});
                } else {
                    this.merkle = map;
                }
            }

            public void setMerkleNoSign(Map<String, String> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4a9d3b94", new Object[]{this, map});
                } else {
                    this.merkleNoSign = map;
                }
            }

            public void setSeed(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8973f044", new Object[]{this, str});
                } else {
                    this.seed = str;
                }
            }

            public void setSubject(Map<String, String> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3bf0fd74", new Object[]{this, map});
                } else {
                    this.subject = map;
                }
            }
        }

        public Claims getClaims() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Claims) ipChange.ipc$dispatch("d7149218", new Object[]{this}) : this.claims;
        }

        public String getDid() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("52885150", new Object[]{this}) : this.did;
        }

        public String getId() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("81e05888", new Object[]{this}) : this.id;
        }

        public void setClaims(Claims claims) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("74eb9476", new Object[]{this, claims});
            } else {
                this.claims = claims;
            }
        }

        public void setDid(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed0ebb8e", new Object[]{this, str});
            } else {
                this.did = str;
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
    }

    /* loaded from: classes3.dex */
    public class a implements Comparator<Map.Entry<String, String>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(VerifiableCredential verifiableCredential) {
        }

        @Override // java.util.Comparator
        public int compare(Map.Entry<String, String> entry, Map.Entry<String, String> entry2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, entry, entry2})).intValue() : entry.getKey().compareTo(entry2.getKey());
        }
    }

    public static VerifiableCredential fromJson(String str) {
        IpChange ipChange = $ipChange;
        return (VerifiableCredential) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("9d0a62c3", new Object[]{str}) : JSONObject.parseObject(str, VerifiableCredential.class));
    }

    public VerifiableCredential doSelectiveDisclose(List<String> list) {
        CredentialSubject.Claims claims;
        String seed;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (VerifiableCredential) ipChange.ipc$dispatch("f58b4953", new Object[]{this, list});
        }
        if (list != null && list.size() > 0 && (seed = (claims = this.credentialSubject.getClaims()).getSeed()) != null) {
            Map<String, String> subject = claims.getSubject();
            int size = subject.size();
            ArrayList arrayList = new ArrayList();
            String copyValueOf = String.copyValueOf(ifh.d(seed).toCharArray());
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(ifh.d(seed.concat(copyValueOf)));
                copyValueOf = String.copyValueOf(((String) arrayList.get(i2)).toCharArray());
            }
            claims.setSeed(null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList<Map.Entry> arrayList2 = new ArrayList(size);
            arrayList2.addAll(subject.entrySet());
            Collections.sort(arrayList2, new a(this));
            for (Map.Entry entry : arrayList2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (String str : linkedHashMap.keySet()) {
                String str2 = (String) arrayList.get(i);
                if (list.contains(str)) {
                    linkedHashMap2.put(str, str2);
                } else {
                    String str3 = linkedHashMap.get(str);
                    if (str3 == null) {
                        str3 = "";
                    }
                    linkedHashMap.put(str, ifh.d(str3.concat(str2)));
                }
                i++;
            }
            claims.setSubject(linkedHashMap);
            claims.setDisclosedSalt(linkedHashMap2);
        }
        return this;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || VerifiableCredential.class != obj.getClass()) {
            return false;
        }
        VerifiableCredential verifiableCredential = (VerifiableCredential) obj;
        if (!this.issuer.equals(verifiableCredential.issuer) || this.type.size() != verifiableCredential.type.size()) {
            return false;
        }
        for (String str : this.type) {
            if (!verifiableCredential.type.contains(str)) {
                return false;
            }
        }
        return true;
    }

    public List<String> getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("dc3e10c7", new Object[]{this}) : this.context;
    }

    public CredentialStatus getCredentialStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CredentialStatus) ipChange.ipc$dispatch("d2568fa3", new Object[]{this}) : this.credentialStatus;
    }

    public CredentialSubject getCredentialSubject() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CredentialSubject) ipChange.ipc$dispatch("6f05f035", new Object[]{this}) : this.credentialSubject;
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

    public Proof getProof() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Proof) ipChange.ipc$dispatch("90c60be3", new Object[]{this}) : this.proof;
    }

    public String getTemplateId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a67390ae", new Object[]{this}) : this.templateId;
    }

    public List<String> getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("8797d930", new Object[]{this}) : this.type;
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : this.version;
    }

    public boolean matchItemValueFilter(VCFilter.VCItem vCItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb749e23", new Object[]{this, vCItem})).booleanValue();
        }
        try {
            if (vCItem.getValueFilter() != null && !vCItem.getValueFilter().isEmpty()) {
                return vCItem.getValueFilter().contains(this.credentialSubject.getClaims().getSubject().get(vCItem.getKey()));
            }
            return true;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    public void setContext(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e5629e5", new Object[]{this, list});
        } else {
            this.context = list;
        }
    }

    public void setCredentialStatus(CredentialStatus credentialStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59455ce5", new Object[]{this, credentialStatus});
        } else {
            this.credentialStatus = credentialStatus;
        }
    }

    public void setCredentialSubject(CredentialSubject credentialSubject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27f27cc5", new Object[]{this, credentialSubject});
        } else {
            this.credentialSubject = credentialSubject;
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

    public void setProof(Proof proof) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254ff8b", new Object[]{this, proof});
        } else {
            this.proof = proof;
        }
    }

    public void setTemplateId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ee80c88", new Object[]{this, str});
        } else {
            this.templateId = str;
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

    public void setVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e718c27", new Object[]{this, str});
        } else {
            this.version = str;
        }
    }

    public boolean supportSelectiveDiscloser() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a4930dc6", new Object[]{this})).booleanValue() : this.type.contains(TYPE_SELECTIVE_DISCLOSURE);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : JSONObject.toJSONString(this);
    }

    public JSONObject traceInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("93e9e5ba", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("vcType", (Object) this.type.get(0));
        jSONObject.put("issuerDid", (Object) this.issuer);
        return jSONObject;
    }
}
