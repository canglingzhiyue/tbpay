package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import anetwork.channel.download.DownloadManager;
import com.android.alibaba.ip.runtime.IpChange;

/* renamed from: com.alibaba.security.ccrc.service.build.oa  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1236oa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f3317a;

    /* renamed from: com.alibaba.security.ccrc.service.build.oa$a */
    /* loaded from: classes3.dex */
    public interface a {
        void a(int i, String str);

        void onSuccess(int i, String str);
    }

    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else {
            this.f3317a = str;
        }
    }

    public void a(String str, String str2, String str3, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8aa99bb", new Object[]{this, str, str2, str3, aVar});
        } else {
            DownloadManager.getInstance().enqueue(str, str2, str3, new C1230ma(this, aVar));
        }
    }

    public void a(String str, String str2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f448a871", new Object[]{this, str, str2, aVar});
        } else {
            DownloadManager.getInstance().enqueue(str, this.f3317a, str2, new C1233na(this, aVar));
        }
    }
}
