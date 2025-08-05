package com.alipay.android.phone.iifaa.did.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.spec.InvalidKeySpecException;
import tb.ifh;
import tb.ifj;
import tb.iqh;

/* loaded from: classes3.dex */
public class PublicKeyJwk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String crv;
    public String kid;
    public String kty;
    public String x;
    public String y;

    public PublicKeyJwk() {
    }

    public PublicKeyJwk(String str, String str2) {
        this.crv = str2;
        this.kty = str;
    }

    public String genDerKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("441e9dbb", new Object[]{this});
        }
        try {
            byte[] m = ifh.m(this.x);
            byte[] m2 = ifh.m(this.y);
            ByteBuffer order = ByteBuffer.allocate(m.length + 8 + m2.length).order(ByteOrder.LITTLE_ENDIAN);
            order.putInt(m.length).put(m).putInt(m2.length).put(m2);
            return ifh.a(ifj.a().d.a(1, order.array()));
        } catch (Exception e) {
            iqh.a().c("DID_PublicKeyJwk", e.getMessage());
            return null;
        }
    }

    public String getCrv() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("67ac44e8", new Object[]{this}) : this.crv;
    }

    public String getKid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36933969", new Object[]{this}) : this.kid;
    }

    public String getKty() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6fad1e3f", new Object[]{this}) : this.kty;
    }

    public String getX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2fc92077", new Object[]{this}) : this.x;
    }

    public String getY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b64edb16", new Object[]{this}) : this.y;
    }

    public void parseRawPubKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aea31248", new Object[]{this, str});
        } else if (!"EC".equalsIgnoreCase(this.kty) || !"sm2p256v1".equalsIgnoreCase(this.crv)) {
            throw new IllegalArgumentException("Not supported key type: " + this.kty);
        } else {
            byte[] a2 = ifj.a().d.a(0, ifh.l(str));
            if (a2 == null || a2.length == 0) {
                throw new InvalidKeySpecException("公钥格式转换异常");
            }
            ByteBuffer order = ByteBuffer.wrap(a2).order(ByteOrder.LITTLE_ENDIAN);
            byte[] bArr = new byte[order.getInt()];
            order.get(bArr);
            byte[] bArr2 = new byte[order.getInt()];
            order.get(bArr2);
            this.x = ifh.b(bArr);
            this.y = ifh.b(bArr2);
        }
    }

    public void setCrv(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c693af6", new Object[]{this, str});
        } else {
            this.crv = str;
        }
    }

    public void setKid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a60d695", new Object[]{this, str});
        } else {
            this.kid = str;
        }
    }

    public void setKty(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74838c7f", new Object[]{this, str});
        } else {
            this.kty = str;
        }
    }

    public void setX(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("844b5e47", new Object[]{this, str});
        } else {
            this.x = str;
        }
    }

    public void setY(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce7cf788", new Object[]{this, str});
        } else {
            this.y = str;
        }
    }
}
