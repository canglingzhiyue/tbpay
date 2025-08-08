package com.taobao.tbpoplayer.nativerender;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tbpoplayer.nativerender.k;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes8.dex */
public class PopAction$7 implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    public final /* synthetic */ e f22220a;
    public final /* synthetic */ String b;
    public final /* synthetic */ k.a c;
    public final /* synthetic */ JSONObject d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ BaseConfigItem val$configFromRequest;
    public final /* synthetic */ boolean val$needLogin;
    public final /* synthetic */ boolean val$originEmbed;

    public PopAction$7(boolean z, BaseConfigItem baseConfigItem, boolean z2, e eVar, k.a aVar, JSONObject jSONObject, boolean z3, boolean z4, String str) {
        this.val$needLogin = z;
        this.val$configFromRequest = baseConfigItem;
        this.val$originEmbed = z2;
        this.f22220a = eVar;
        this.c = aVar;
        this.d = jSONObject;
        this.e = z3;
        this.f = z4;
        this.b = str;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, final MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        try {
            if (this.val$needLogin) {
                this.val$configFromRequest.embed = this.val$originEmbed;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        e eVar = this.f22220a;
        final k.a aVar = this.c;
        final JSONObject jSONObject = this.d;
        final boolean z = this.e;
        final boolean z2 = this.f;
        eVar.b(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$PopAction$7$Bg_ykUIf9_dYXjoOsKxgX8Bc-ZY
            @Override // java.lang.Runnable
            public final void run() {
                PopAction$7.lambda$onSystemError$106(k.a.this, jSONObject, mtopResponse, z, z2);
            }
        });
    }

    public static /* synthetic */ void lambda$onSystemError$106(k.a aVar, JSONObject jSONObject, MtopResponse mtopResponse, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39fc3ba3", new Object[]{aVar, jSONObject, mtopResponse, new Boolean(z), new Boolean(z2)});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("MtopOnSystemError.retCode=");
        sb.append(mtopResponse != null ? mtopResponse.getRetCode() : "");
        k.a(aVar, jSONObject, false, sb.toString(), z, z2);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, final MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        try {
            if (this.val$needLogin) {
                this.val$configFromRequest.embed = this.val$originEmbed;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        final e eVar = this.f22220a;
        final String str = this.b;
        final k.a aVar = this.c;
        final JSONObject jSONObject = this.d;
        final boolean z = this.e;
        final boolean z2 = this.f;
        eVar.b(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$PopAction$7$ZHkIKWcmw9HRD-DOkALZ2fmXfyg
            @Override // java.lang.Runnable
            public final void run() {
                PopAction$7.lambda$onSuccess$107(MtopResponse.this, eVar, str, aVar, jSONObject, z, z2);
            }
        });
    }

    public static /* synthetic */ void lambda$onSuccess$107(MtopResponse mtopResponse, e eVar, String str, k.a aVar, JSONObject jSONObject, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ab08966", new Object[]{mtopResponse, eVar, str, aVar, jSONObject, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (mtopResponse != null && mtopResponse.isApiSuccess()) {
            try {
                byte[] bytedata = mtopResponse.getBytedata();
                String str2 = bytedata != null ? new String(bytedata, "UTF-8") : "";
                JSONObject jSONObject2 = null;
                if (!StringUtils.isEmpty(str2)) {
                    jSONObject2 = JSON.parseObject(str2).getJSONObject("data");
                }
                if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                    eVar.a(str, jSONObject2);
                }
                if (k.a(aVar, jSONObject)) {
                    k.a(aVar, jSONObject, true, "", z, z2);
                    return;
                }
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("dealPreFetchMTOP.parseObject.responseContent.error.", th);
            }
        }
        k.a(aVar, jSONObject, false, "MtopOnSuccess.ResponseIsNullOrFail", z, z2);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, final MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        try {
            if (this.val$needLogin) {
                this.val$configFromRequest.embed = this.val$originEmbed;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        e eVar = this.f22220a;
        final k.a aVar = this.c;
        final JSONObject jSONObject = this.d;
        final boolean z = this.e;
        final boolean z2 = this.f;
        eVar.b(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$PopAction$7$i0Ts4kXovglSWBJfCoTUBpMGtWw
            @Override // java.lang.Runnable
            public final void run() {
                PopAction$7.lambda$onError$108(k.a.this, jSONObject, mtopResponse, z, z2);
            }
        });
    }

    public static /* synthetic */ void lambda$onError$108(k.a aVar, JSONObject jSONObject, MtopResponse mtopResponse, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96e9752", new Object[]{aVar, jSONObject, mtopResponse, new Boolean(z), new Boolean(z2)});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("MtopOnError.retCode=%s");
        sb.append(mtopResponse != null ? mtopResponse.getRetCode() : "");
        k.a(aVar, jSONObject, false, sb.toString(), z, z2);
    }
}
