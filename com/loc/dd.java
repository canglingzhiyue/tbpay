package com.loc;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import mtopsdk.mtop.upload.domain.UploadConstants;

/* loaded from: classes4.dex */
public final class dd {
    public static boolean a(byte[] bArr) {
        String str;
        if (bArr != null) {
            byte[] bArr2 = null;
            try {
                ek ekVar = new ek();
                ekVar.b.put("Content-Type", UploadConstants.FILE_CONTENT_TYPE);
                ekVar.b.put("aps_c_src", Base64.encodeToString(ek.a().getBytes(), 2));
                ekVar.b.put("aps_c_key", Base64.encodeToString(ek.b().getBytes(), 2));
                ekVar.d = bArr;
                if (cu.f7732a) {
                    str = "http://cgicol.amap.com/collection/collectData?src=baseCol&ver=v74&";
                } else {
                    str = (cu.b ? com.taobao.search.common.util.k.HTTPS_PREFIX : com.taobao.search.common.util.k.HTTP_PREFIX) + "cgicol.amap.com/collection/collectData?src=baseCol&ver=v74&";
                }
                ekVar.f7760a = str;
                el a2 = dy.b().a(ekVar);
                if (a2 != null && a2.f7761a == 200) {
                    bArr2 = a2.c;
                }
                if (bArr2 == null) {
                    return false;
                }
                return "true".equals(new String(bArr2, StandardCharsets.UTF_8));
            } catch (Exception e) {
                ej.a(e);
                return false;
            }
        }
        return false;
    }
}
