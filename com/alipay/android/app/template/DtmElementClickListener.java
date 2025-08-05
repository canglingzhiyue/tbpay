package com.alipay.android.app.template;

import com.alipay.android.app.template.EventHandler;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.birdnest.util.FBLogger;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import com.flybird.FBDocumentAssistor;
import com.flybird.support.basics.e;
import tb.riy;

/* loaded from: classes3.dex */
public class DtmElementClickListener implements OnTemplateClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DtmElementClickListener";

    /* renamed from: a  reason: collision with root package name */
    public EventHandler f4441a;
    public String b;
    public BirdNestEngine.LogTracer c;
    public FBDocument d;

    public DtmElementClickListener(EventHandler eventHandler, String str, BirdNestEngine.LogTracer logTracer) {
        this.f4441a = null;
        this.b = "";
        this.f4441a = eventHandler;
        this.b = str;
        this.c = logTracer;
    }

    @Override // com.alipay.android.app.template.OnTemplateClickListener
    public boolean onAsyncEvent(Object obj, String str, ITemplateClickCallback iTemplateClickCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48618963", new Object[]{this, obj, str, iTemplateClickCallback})).booleanValue();
        }
        if (this.f4441a != null) {
            e a2 = FBDocumentAssistor.a(this.d);
            try {
                return this.f4441a.onAsyncEvent(EventHandler.EventType.ASYNC_EVENT, str, iTemplateClickCallback);
            } catch (Throwable th) {
                try {
                    FBLogger.e(TAG, th);
                } finally {
                    FBDocument fBDocument = this.d;
                    FBDocumentAssistor.a(fBDocument, a2, 21, "Dtm:aEv_" + str);
                }
            }
        }
        return false;
    }

    @Override // com.alipay.android.app.template.OnTemplateClickListener
    public final boolean onEvent(Object obj, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("163cef30", new Object[]{this, obj, str, new Boolean(z)})).booleanValue();
        }
        if (this.f4441a != null) {
            e a2 = FBDocumentAssistor.a(this.d);
            try {
                this.f4441a.onEvent(z ? EventHandler.EventType.CLICK : EventHandler.EventType.GENERIC, this.b, "{\"param\":" + str + riy.BLOCK_END_STR, obj);
            } catch (Throwable th) {
                try {
                    FBLogger.e(TAG, th);
                } finally {
                    FBDocument fBDocument = this.d;
                    FBDocumentAssistor.a(fBDocument, a2, 21, "Dtm:sEv_" + str);
                }
            }
        }
        return false;
    }

    @Override // com.alipay.android.app.template.OnTemplateClickListener
    public String onGetCustomAttr(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8229915a", new Object[]{this, obj, str});
        }
        if (this.f4441a == null) {
            return "";
        }
        e a2 = FBDocumentAssistor.a(this.d);
        String onGetCustomAttr = this.f4441a.onGetCustomAttr(obj, str);
        FBDocument fBDocument = this.d;
        FBDocumentAssistor.a(fBDocument, a2, 21, "Dtm:attr_" + str);
        return onGetCustomAttr;
    }

    public void setDocument(FBDocument fBDocument) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed2b1ecb", new Object[]{this, fBDocument});
        } else {
            this.d = fBDocument;
        }
    }

    public DtmElementClickListener(BirdNestEngine.Params params, BirdNestEngine.LogTracer logTracer) {
        this.f4441a = null;
        this.b = "";
        this.f4441a = params.dtmEventListener;
        this.b = params.businessId;
        this.c = logTracer;
    }
}
