package com.alipay.mobile.security.bio.runtime.download;

/* loaded from: classes3.dex */
public interface BioResPostProcessor {
    boolean canProcess(BioDownloadItem bioDownloadItem);

    boolean process(BioDownloadItem bioDownloadItem);
}
