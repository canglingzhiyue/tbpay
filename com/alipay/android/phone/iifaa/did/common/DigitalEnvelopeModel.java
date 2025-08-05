package com.alipay.android.phone.iifaa.did.common;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.ifh;

/* loaded from: classes3.dex */
public class DigitalEnvelopeModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String algorithm;
    public String cipher;
    public String data;
    public String key;
    public String keyAlias;
    public String keyCipher;

    public DigitalEnvelopeModel() {
    }

    public DigitalEnvelopeModel(String str, String str2) {
        this.algorithm = str;
        this.key = str2;
    }

    public DigitalEnvelopeModel(String str, String str2, String str3) {
        this.algorithm = str;
        this.cipher = str2;
        this.keyCipher = str3;
    }

    public DigitalEnvelopeModel(String str, String str2, String str3, String str4) {
        this.keyAlias = str;
        this.key = str2;
        this.algorithm = str3;
        this.data = str4;
    }

    public static boolean isInValidEncEnvelope(DigitalEnvelopeModel digitalEnvelopeModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4f5ff6e3", new Object[]{digitalEnvelopeModel})).booleanValue() : ifh.a(digitalEnvelopeModel.keyAlias, digitalEnvelopeModel.keyCipher, digitalEnvelopeModel.cipher, digitalEnvelopeModel.algorithm);
    }

    public String getAlgorithm() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8bca06e0", new Object[]{this}) : this.algorithm;
    }

    public String getCipher() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8d3d8098", new Object[]{this}) : this.cipher;
    }

    public String getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f6b2ad9", new Object[]{this}) : this.data;
    }

    public String getKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("16c52370", new Object[]{this}) : this.key;
    }

    public String getKeyAlias() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("690a84b2", new Object[]{this}) : this.keyAlias;
    }

    public String getKeyCipher() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4c074e5", new Object[]{this}) : this.keyCipher;
    }

    public void setAlgorithm(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fb490fe", new Object[]{this, str});
        } else {
            this.algorithm = str;
        }
    }

    public void setCipher(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba1c7fde", new Object[]{this, str});
        } else {
            this.cipher = str;
        }
    }

    public void setData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427970bd", new Object[]{this, str});
        } else {
            this.data = str;
        }
    }

    public void setKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b06c2d6e", new Object[]{this, str});
        } else {
            this.key = str;
        }
    }

    public void setKeyAlias(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43236c04", new Object[]{this, str});
        } else {
            this.keyAlias = str;
        }
    }

    public void setKeyCipher(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("158be399", new Object[]{this, str});
        } else {
            this.keyCipher = str;
        }
    }
}
