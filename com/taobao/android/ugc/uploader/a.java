package com.taobao.android.ugc.uploader;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.export.g;
import com.uploader.export.l;
import java.util.List;
import tb.kge;
import tb.rpb;
import tb.rpc;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f15726a;
    private Handler c = new Handler(Looper.myLooper());
    private g b = l.a();

    static {
        kge.a(-205654214);
    }

    public a(Context context) {
        this.f15726a = context;
        if (!this.b.isInitialized()) {
            rpc rpcVar = new rpc(this.f15726a);
            g gVar = this.b;
            Context context2 = this.f15726a;
            gVar.initialize(context2, new rpb(context2, rpcVar));
        }
    }

    public void a(List<UploaderTask> list, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aaea555", new Object[]{this, list, cVar});
            return;
        }
        d dVar = new d(this.b, list, cVar);
        for (UploaderTask uploaderTask : list) {
            this.b.uploadAsync(uploaderTask, dVar, this.c);
        }
    }
}
