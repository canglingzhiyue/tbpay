package com.alipay.android.app.render.api.result;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class RenderStatistic {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f4363a = 0;
    private long b = 0;
    private long c = 0;

    public void appendDownLoadTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85fdd0ae", new Object[]{this, new Long(j)});
        } else {
            this.f4363a += j;
        }
    }

    public void appendLoadTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("803aa130", new Object[]{this, new Long(j)});
        } else {
            this.b += j;
        }
    }

    public void setRenderTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6da9ab8", new Object[]{this, new Long(j)});
        } else {
            this.c = j;
        }
    }

    public long getDownloadTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5fc34e6", new Object[]{this})).longValue() : this.f4363a;
    }

    public long getParseTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("12cd80e5", new Object[]{this})).longValue() : this.b - this.f4363a;
    }

    public long getRenderTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4212574", new Object[]{this})).longValue() : this.c;
    }
}
