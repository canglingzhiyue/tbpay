package com.taobao.taobaoavsdk.cache.library;

import anetwork.channel.aidl.ParcelableInputStream;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.InputStream;
import tb.kge;

/* loaded from: classes8.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ParcelableInputStream f21333a;
    private BufferedInputStream b;

    static {
        kge.a(1216439696);
    }

    private m() {
    }

    public m(ParcelableInputStream parcelableInputStream) {
        this.f21333a = parcelableInputStream;
    }

    public m(InputStream inputStream) {
        this.b = new BufferedInputStream(inputStream, 8192);
    }

    public void a() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ParcelableInputStream parcelableInputStream = this.f21333a;
        if (parcelableInputStream != null) {
            p.a(parcelableInputStream);
        }
        BufferedInputStream bufferedInputStream = this.b;
        if (bufferedInputStream == null) {
            return;
        }
        p.a(bufferedInputStream);
    }

    public int a(byte[] bArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c196722", new Object[]{this, bArr})).intValue();
        }
        ParcelableInputStream parcelableInputStream = this.f21333a;
        if (parcelableInputStream != null) {
            return parcelableInputStream.read(bArr);
        }
        BufferedInputStream bufferedInputStream = this.b;
        if (bufferedInputStream == null) {
            return -1;
        }
        return bufferedInputStream.read(bArr);
    }
}
