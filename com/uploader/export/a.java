package com.uploader.export;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes9.dex */
public class a implements i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final k f24056a;

    public a(k kVar) {
        this.f24056a = kVar;
    }

    @Override // com.uploader.export.i
    public String getBizType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this}) : this.f24056a.f24059a;
    }

    @Override // com.uploader.export.i
    public String getFilePath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1bcb7a22", new Object[]{this}) : this.f24056a.b;
    }

    @Override // com.uploader.export.i
    public String getFileType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("105a7e2d", new Object[]{this}) : this.f24056a.c;
    }

    @Override // com.uploader.export.i
    public Map<String, String> getMetaInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("8d01c005", new Object[]{this}) : this.f24056a.d;
    }
}
