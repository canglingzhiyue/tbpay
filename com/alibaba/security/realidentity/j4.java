package com.alibaba.security.realidentity;

import android.content.Context;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class j4 implements k4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f3453a;
    public String b;
    public u4 c;

    public j4(Context context, String str, u4 u4Var) {
        this.f3453a = context;
        this.b = str;
        this.c = u4Var;
    }

    public void a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba98c8", new Object[]{this, str, str2, new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("fileName", str);
        hashMap.put(com.taobao.tao.log.statistics.d.PARAM_UPLOAD_FILE_TYPE, str2);
        hashMap.put("fileLength", Long.valueOf(j));
        a(TrackLog.createOssUploadFileBeginLog(b.a((Object) hashMap)));
    }

    public void a(String str, String str2, String str3, String str4, String str5, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52bb845a", new Object[]{this, str, str2, str3, str4, str5, new Long(j), new Long(j2)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("fileName", str);
        hashMap.put(com.taobao.tao.log.statistics.d.PARAM_UPLOAD_FILE_TYPE, str2);
        hashMap.put("fileLength", Long.valueOf(j2));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("ossUrl", str3);
        hashMap2.put("errorCode", str4);
        hashMap2.put("errorMsg", str5);
        a(TrackLog.createOssUploadFileEndLog(b.a((Object) hashMap), b.a((Object) hashMap2), j));
    }

    public void a(TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6099b195", new Object[]{this, trackLog});
        } else {
            this.c.a(this.b, trackLog);
        }
    }
}
