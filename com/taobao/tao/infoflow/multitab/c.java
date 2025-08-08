package com.taobao.tao.infoflow.multitab;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.uc.webview.export.media.MessageID;
import tb.kge;
import tb.suf;

/* loaded from: classes8.dex */
public class c implements suf.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f20635a = 0;
    private String b;
    private JSONObject c;
    private final a d;
    private JSONObject e;

    /* loaded from: classes8.dex */
    public interface a {
        void a(JSONObject jSONObject);

        boolean a(String str, String str2, boolean z);

        void b(JSONObject jSONObject);
    }

    static {
        kge.a(-767165386);
        kge.a(-1156182721);
    }

    public c(a aVar) {
        this.d = aVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        g.a("MultiTabRequestService", "onStart");
        if (this.f20635a == 2) {
            c();
        }
        this.f20635a = 0;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        g.a("MultiTabRequestService", MessageID.onStop);
        this.f20635a = 1;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.f20635a == 1 && com.taobao.android.home.component.utils.j.a("enableFixSubscribeLoginSwitch", true)) {
            this.f20635a = 2;
            g.a("MultiTabRequestService", "checkAndRefreshTab 当前onStop wait onStart ");
        } else {
            boolean equals = StringUtils.equals("base", this.c.getString("dataChangeType"));
            g.a("MultiTabRequestService", "onProcess " + equals);
            if (equals) {
                this.d.a(this.e);
            } else {
                this.d.b(this.e);
            }
        }
    }

    @Override // tb.suf.a
    public void a(IContainerDataModel<?> iContainerDataModel, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fafb607", new Object[]{this, iContainerDataModel, jSONObject, str});
        } else if (iContainerDataModel == null || jSONObject == null) {
        } else {
            String string = jSONObject.getString(com.taobao.themis.kernel.i.CDN_REQUEST_TYPE);
            g.a("MultiTabRequestService", "requestType: " + string);
            if (!this.d.a(this.b, string, "local".equals(jSONObject.getString("dataSourceType")))) {
                return;
            }
            this.b = string;
            this.c = jSONObject;
            this.e = e.a(iContainerDataModel);
            c();
        }
    }
}
