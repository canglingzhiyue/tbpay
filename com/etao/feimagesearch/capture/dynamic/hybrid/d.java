package com.etao.feimagesearch.capture.dynamic.hybrid;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bean.DynCaptureImgGotConfig;
import com.etao.feimagesearch.pipline.NodeType;
import com.etao.feimagesearch.pipline.b;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.cpx;
import tb.crl;
import tb.crp;
import tb.kge;

/* loaded from: classes3.dex */
public final class d implements b.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f6557a;
    private DynCaptureImgGotConfig b;

    static {
        kge.a(-1853580470);
        kge.a(1653497275);
    }

    public d(DynCaptureImgGotConfig dynCaptureImgGotConfig) {
        q.c(dynCaptureImgGotConfig, "dynCaptureImgGotConfig");
        this.b = dynCaptureImgGotConfig;
        this.f6557a = new JSONObject();
        com.etao.feimagesearch.pipline.a a2 = this.b.a();
        if (a2 != null) {
            a2.a(this);
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.etao.feimagesearch.pipline.a a2 = this.b.a();
        if (a2 == null) {
            return;
        }
        a2.b();
    }

    @Override // com.etao.feimagesearch.pipline.b.a
    public void a(crl event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3fd43db", new Object[]{this, event});
            return;
        }
        q.c(event, "event");
        String e = event.e();
        if (e == null) {
            return;
        }
        int hashCode = e.hashCode();
        if (hashCode != -1597291667) {
            if (hashCode != 453063860 || !e.equals("ImageProcess") || !event.d() || !(event.c() instanceof crp)) {
                return;
            }
            JSONObject jSONObject = this.f6557a.getJSONObject("imgData");
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            Object c = event.c();
            if (c == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.etao.feimagesearch.pipline.model.ImgProcessResult");
            }
            crp crpVar = (crp) c;
            Integer[] b = crpVar.b();
            if ((b != null ? b.length : 0) >= 2) {
                JSONObject jSONObject2 = jSONObject;
                if (b == null) {
                    q.a();
                }
                jSONObject2.put((JSONObject) "w", (String) b[0]);
                jSONObject2.put((JSONObject) "h", (String) b[1]);
            } else {
                JSONObject jSONObject3 = jSONObject;
                jSONObject3.put((JSONObject) "w", (String) 0);
                jSONObject3.put((JSONObject) "h", (String) 0);
            }
            jSONObject.put((JSONObject) "base64", crpVar.a());
            this.f6557a.put((JSONObject) "imgData", (String) jSONObject);
        } else if (!e.equals(NodeType.NODE_IMAGE_MOCK_SEARCH)) {
        } else {
            if (event.d() && (event.c() instanceof Map)) {
                JSONObject jSONObject4 = this.f6557a;
                Object c2 = event.c();
                if (c2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                }
                jSONObject4.put((JSONObject) "searchParams", (String) ((Map) c2));
            }
            cpx b2 = this.b.b();
            if (b2 != null) {
                b2.a(this.f6557a, 0, "");
            }
            this.b.a().d().q();
        }
    }
}
