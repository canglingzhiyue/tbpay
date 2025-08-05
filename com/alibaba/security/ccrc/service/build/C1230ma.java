package com.alibaba.security.ccrc.service.build;

import anetwork.channel.download.DownloadManager;
import com.alibaba.security.ccrc.service.build.C1236oa;
import com.android.alibaba.ip.runtime.IpChange;

/* renamed from: com.alibaba.security.ccrc.service.build.ma  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1230ma implements DownloadManager.DownloadListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1236oa.a f3314a;
    public final /* synthetic */ C1236oa b;

    public C1230ma(C1236oa c1236oa, C1236oa.a aVar) {
        this.b = c1236oa;
        this.f3314a = aVar;
    }

    @Override // anetwork.channel.download.DownloadManager.DownloadListener
    public void onFail(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a94ab7ce", new Object[]{this, new Integer(i), new Integer(i2), str});
        } else {
            this.f3314a.a(i, str);
        }
    }

    @Override // anetwork.channel.download.DownloadManager.DownloadListener
    public void onProgress(int i, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0712230", new Object[]{this, new Integer(i), new Long(j), new Long(j2)});
        }
    }

    @Override // anetwork.channel.download.DownloadManager.DownloadListener
    public void onSuccess(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631dc082", new Object[]{this, new Integer(i), str});
        } else {
            this.f3314a.onSuccess(i, str);
        }
    }
}
