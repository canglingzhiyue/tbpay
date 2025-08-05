package com.etao.feimagesearch.capture.scan;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.intelli.ClientModelType;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import java.util.HashMap;
import java.util.Map;
import tb.cot;
import tb.cpf;
import tb.kge;

/* loaded from: classes3.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Activity f6611a;
    private final com.etao.feimagesearch.model.b b;
    private final String c;
    private final CaptureManager d;

    static {
        kge.a(23986940);
    }

    public k(Activity activity, com.etao.feimagesearch.model.b bVar, String str, CaptureManager captureManager) {
        this.f6611a = activity;
        this.b = bVar;
        this.c = str;
        this.d = captureManager;
    }

    public void a(Bitmap bitmap, c cVar, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f74cb80", new Object[]{this, bitmap, cVar, iVar});
            return;
        }
        HashMap hashMap = new HashMap(8);
        if (!TextUtils.isEmpty(this.c)) {
            hashMap.put(ClientModelType.KEY_CLIENT_MODEL_TYPE, this.c);
        }
        if (this.d.t()) {
            cpf.a(this.f6611a, bitmap, cVar.k(), this.b, hashMap, (Map<String, String>) null, bitmap.hashCode(), cVar.j(), this.d.U());
            a(cVar, iVar);
            return;
        }
        cot.c("_scancode_GoIrpIfNeededTask", "goAndSendScanResult2Irp: find to get lock");
    }

    public void a(c cVar, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83afb1a2", new Object[]{this, cVar, iVar});
        } else {
            com.etao.feimagesearch.capture.scan.irp.b.a().a(cVar, iVar);
        }
    }
}
