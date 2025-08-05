package com.taobao.android.artry.resource;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.export.g;
import com.uploader.export.l;
import java.util.List;
import tb.kge;
import tb.rpb;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f9074a;
    private Object b;
    private boolean c;
    private g d;

    /* loaded from: classes4.dex */
    public interface a {
        void a(List<e> list);
    }

    /* loaded from: classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final d f9075a;

        static {
            kge.a(756603098);
            f9075a = new d();
        }

        public static /* synthetic */ d a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("852cce3e", new Object[0]) : f9075a;
        }
    }

    static {
        kge.a(98049543);
        f9074a = d.class.getSimpleName();
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("852cce3e", new Object[0]) : b.a();
    }

    private d() {
        this.b = new Object();
        this.c = false;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (context == null) {
        } else {
            synchronized (this.b) {
                if (this.c) {
                    return;
                }
                this.c = true;
                this.d = l.a();
                this.d.initialize(context, new rpb());
            }
        }
    }

    public void a(List<e> list, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("223691d0", new Object[]{this, list, aVar});
        } else if (b() && !com.taobao.android.artry.utils.d.a(list)) {
            c cVar = new c(list, aVar);
            for (e eVar : list) {
                String str = "upload the file[%s] async..." + eVar.getFilePath();
                this.d.uploadAsync(eVar, cVar, null);
            }
        } else if (aVar != null) {
            try {
                aVar.a(list);
            } catch (Throwable th) {
                Log.e(f9074a, "failed to invoke the onBatchUploadFinish method..." + th);
            }
        }
    }

    private boolean b() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        synchronized (this.b) {
            z = this.c;
        }
        return z;
    }
}
