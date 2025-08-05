package com.taobao.taobao.scancode.gateway.util;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.gateway.activity.ResultViewController;
import com.taobao.taobao.scancode.huoyan.object.MailTraceWrapper;
import com.taobao.taobao.scancode.huoyan.object.MtopEtaoKakaMailtraceResponse;
import com.taobao.taobao.scancode.v2.result.MaResult;
import tb.css;
import tb.kge;

/* loaded from: classes8.dex */
public class e extends f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public com.taobao.taobao.scancode.barcode.util.b f;
    public ResultViewController g;
    public com.taobao.taobao.scancode.huoyan.util.g<MtopEtaoKakaMailtraceResponse> h;

    static {
        kge.a(-313133542);
    }

    public e(m mVar, FragmentActivity fragmentActivity, Intent intent, boolean z, css cssVar) {
        super(mVar, fragmentActivity, intent, z, cssVar);
        this.h = new com.taobao.taobao.scancode.huoyan.util.g<MtopEtaoKakaMailtraceResponse>() { // from class: com.taobao.taobao.scancode.gateway.util.e.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobao.scancode.huoyan.util.d
            public void a(MtopEtaoKakaMailtraceResponse mtopEtaoKakaMailtraceResponse, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d141ef3f", new Object[]{this, mtopEtaoKakaMailtraceResponse, str});
                } else if (mtopEtaoKakaMailtraceResponse == null) {
                } else {
                    e.this.a(mtopEtaoKakaMailtraceResponse.mo2429getData(), a());
                }
            }

            @Override // com.taobao.taobao.scancode.huoyan.util.d
            public void a(Throwable th) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                } else {
                    e.this.a(null, a());
                }
            }
        };
        this.f = new com.taobao.taobao.scancode.barcode.util.b(mVar);
    }

    public void b(MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e284831", new Object[]{this, maResult});
        } else if (!android.taobao.util.g.a(this.b)) {
            this.f.a(this.b);
        } else {
            String text = maResult.getText();
            this.h.a(text);
            com.taobao.taobao.scancode.huoyan.util.e.a(this.b, text, this.h);
            this.f.b(this.b);
        }
    }

    public void a(final MailTraceWrapper mailTraceWrapper, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a77e82", new Object[]{this, mailTraceWrapper, str});
        } else if (this.b == null) {
        } else {
            this.b.runOnUiThread(new Runnable() { // from class: com.taobao.taobao.scancode.gateway.util.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    MailTraceWrapper mailTraceWrapper2 = mailTraceWrapper;
                    e.this.f.a(e.this.b, str, mailTraceWrapper2 != null ? mailTraceWrapper2.getTraces() : null, 1);
                }
            });
        }
    }
}
