package com.alipay.mobile.security.bio.api;

import java.util.Map;

/* loaded from: classes3.dex */
public interface BioProgressCallback extends BioCallback {
    boolean onFaceDetected(Map<String, String> map);
}
