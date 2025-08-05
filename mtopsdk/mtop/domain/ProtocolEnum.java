package mtopsdk.mtop.domain;

import com.taobao.search.common.util.k;

/* loaded from: classes.dex */
public enum ProtocolEnum {
    HTTP(k.HTTP_PREFIX),
    HTTPSECURE(k.HTTPS_PREFIX);
    
    private String protocol;

    ProtocolEnum(String str) {
        this.protocol = str;
    }

    public String getProtocol() {
        return this.protocol;
    }
}
