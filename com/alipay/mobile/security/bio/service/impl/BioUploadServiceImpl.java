package com.alipay.mobile.security.bio.service.impl;

import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.BioUploadCallBack;
import com.alipay.mobile.security.bio.service.BioUploadItem;
import com.alipay.mobile.security.bio.service.BioUploadService;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class BioUploadServiceImpl extends BioUploadService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private BioUploadWatchThread f5814a;

    @Override // com.alipay.mobile.security.bio.service.BioUploadService
    public void addCallBack(BioUploadCallBack bioUploadCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e491f528", new Object[]{this, bioUploadCallBack});
            return;
        }
        BioUploadWatchThread bioUploadWatchThread = this.f5814a;
        if (bioUploadWatchThread == null || bioUploadCallBack == null) {
            return;
        }
        bioUploadWatchThread.addBioUploadCallBack(bioUploadCallBack);
    }

    @Override // com.alipay.mobile.security.bio.service.BioUploadService
    public int upload(BioUploadItem bioUploadItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf45848", new Object[]{this, bioUploadItem})).intValue();
        }
        BioUploadWatchThread bioUploadWatchThread = this.f5814a;
        if (bioUploadWatchThread != null) {
            bioUploadWatchThread.addBioUploadItem(bioUploadItem);
        }
        return 0;
    }

    @Override // com.alipay.mobile.security.bio.service.BioUploadService
    public boolean isFulled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7004e1c3", new Object[]{this})).booleanValue();
        }
        BioUploadWatchThread bioUploadWatchThread = this.f5814a;
        if (bioUploadWatchThread == null) {
            return false;
        }
        return bioUploadWatchThread.isFulled();
    }

    @Override // com.alipay.mobile.security.bio.service.BioService
    public void onCreate(BioServiceManager bioServiceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b84b0b", new Object[]{this, bioServiceManager});
            return;
        }
        this.f5814a = new BioUploadWatchThread("BioUploadService", bioServiceManager);
        this.f5814a.start();
    }

    @Override // com.alipay.mobile.security.bio.service.BioUploadService
    public void clearUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a490c24f", new Object[]{this});
            return;
        }
        BioUploadWatchThread bioUploadWatchThread = this.f5814a;
        if (bioUploadWatchThread == null || !bioUploadWatchThread.isEmpty()) {
            return;
        }
        this.f5814a.clearUploadItems();
        this.f5814a.clearBioUploadCallBacks();
    }

    @Override // com.alipay.mobile.security.bio.service.BioService
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        BioUploadWatchThread bioUploadWatchThread = this.f5814a;
        if (bioUploadWatchThread == null) {
            return;
        }
        if (bioUploadWatchThread.isEmpty()) {
            this.f5814a.release();
            this.f5814a = null;
            return;
        }
        this.f5814a.b();
    }
}
