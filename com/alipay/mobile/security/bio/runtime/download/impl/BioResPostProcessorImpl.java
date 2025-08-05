package com.alipay.mobile.security.bio.runtime.download.impl;

import com.alipay.bis.core.protocol.BioLibFile;
import com.alipay.bis.core.protocol.BioModelFile;
import com.alipay.mobile.security.bio.runtime.download.BioDownloadItem;
import com.alipay.mobile.security.bio.runtime.download.BioResPostProcessor;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import tb.riy;

/* loaded from: classes3.dex */
public class BioResPostProcessorImpl implements BioResPostProcessor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Object f5799a = new Object();
    private static final Map<String, Boolean> b = new HashMap();

    private boolean a(BioDownloadItem bioDownloadItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1ec39ea", new Object[]{this, bioDownloadItem})).booleanValue();
        }
        return true;
    }

    @Override // com.alipay.mobile.security.bio.runtime.download.BioResPostProcessor
    public boolean canProcess(BioDownloadItem bioDownloadItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("83b408c", new Object[]{this, bioDownloadItem})).booleanValue() : (bioDownloadItem instanceof BioLibFile) || (bioDownloadItem instanceof BioModelFile);
    }

    @Override // com.alipay.mobile.security.bio.runtime.download.BioResPostProcessor
    public boolean process(BioDownloadItem bioDownloadItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b417249c", new Object[]{this, bioDownloadItem})).booleanValue();
        }
        if (bioDownloadItem instanceof BioLibFile) {
            return a((BioLibFile) bioDownloadItem);
        }
        if (!(bioDownloadItem instanceof BioModelFile)) {
            return true;
        }
        return a(bioDownloadItem);
    }

    private boolean a(BioLibFile bioLibFile) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4672c63", new Object[]{this, bioLibFile})).booleanValue();
        }
        String str = "processLibFile() called with: file = [" + bioLibFile + riy.ARRAY_END_STR;
        synchronized (f5799a) {
            String absolutePath = new File(bioLibFile.getSavePath(), bioLibFile.getFileName()).getAbsolutePath();
            if (b.containsKey(absolutePath) && b.get(absolutePath).booleanValue()) {
                return true;
            }
            System.load(absolutePath);
            b.put(absolutePath, true);
            return true;
        }
    }
}
