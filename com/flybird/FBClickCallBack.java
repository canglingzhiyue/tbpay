package com.flybird;

import com.alipay.android.app.template.FBContext;
import com.alipay.android.app.template.ITemplateClickCallback;
import com.alipay.birdnest.util.FBLogger;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class FBClickCallBack implements ITemplateClickCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final FBContext.JsExecOptions f7115a = FBContext.JsExecOptions.create().setCallbackMode(0).setBlockTimeoutMs(10000).setAsyncMode(1);
    public long b;
    public FBDocument c;

    public FBClickCallBack(long j, FBDocument fBDocument) {
        this.b = -1L;
        this.b = j;
        this.c = fBDocument;
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.c = null;
        this.b = -1L;
    }

    public FBDocument getDocument() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FBDocument) ipChange.ipc$dispatch("96342765", new Object[]{this}) : this.c;
    }

    @Override // com.alipay.android.app.template.ITemplateClickCallback
    public void onClickCallback(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e708925f", new Object[]{this, str});
            return;
        }
        FBDocument fBDocument = this.c;
        if (fBDocument == null || this.b == -1) {
            return;
        }
        try {
            fBDocument.safeCallJsMethod(this.b, new Object[]{new JSONObject(str)}, f7115a, null);
        } catch (JSONException e) {
            FBLogger.e(getClass().getName(), e);
        }
    }
}
