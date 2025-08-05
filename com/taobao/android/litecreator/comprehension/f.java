package com.taobao.android.litecreator.comprehension;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.export.i;
import java.io.File;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class f implements i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CANCEL = "101";
    public static final String CUSTOM_ERROR_CODE = "99999";
    public static final String FILE_TYPE_IMAGE_JPG = "jpg";
    public static final String FILE_TYPE_VIDEO_MP4 = "mp4";
    public static final String TIME_OUT_ERROR = "100";

    /* renamed from: a  reason: collision with root package name */
    private String f13332a;
    private String b;
    private String c;
    private long d;
    private Map<String, String> e;

    static {
        kge.a(-6292665);
        kge.a(671985108);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.f13332a = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.d = new File(str).length();
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    @Override // com.uploader.export.i
    public String getBizType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this}) : this.b;
    }

    @Override // com.uploader.export.i
    public String getFilePath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1bcb7a22", new Object[]{this}) : this.f13332a;
    }

    @Override // com.uploader.export.i
    public String getFileType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("105a7e2d", new Object[]{this}) : this.c;
    }

    @Override // com.uploader.export.i
    public Map<String, String> getMetaInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("8d01c005", new Object[]{this}) : this.e;
    }
}
