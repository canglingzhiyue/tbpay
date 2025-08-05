package com.taobao.android.detail2.core.framework.data.net.recommend;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.optimize.preload.a;
import com.taobao.android.detail2.core.optimize.preload.b;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bga;
import tb.ctu;
import tb.fjp;
import tb.idk;
import tb.ipa;

/* loaded from: classes5.dex */
public class RecInfoManager$1 implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ a this$0;
    public final /* synthetic */ boolean val$isPageUp;
    public final /* synthetic */ int val$pageIndex;

    public RecInfoManager$1(a aVar, boolean z, int i) {
        this.this$0 = aVar;
        this.val$isPageUp = z;
        this.val$pageIndex = i;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        a.a(this.this$0, this.val$isPageUp, this.val$pageIndex, mtopResponse);
        bga.b.a("new_detail", mtopResponse);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, final MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        ctu.a("request_onSuccess");
        if (!this.val$isPageUp && this.val$pageIndex == 0) {
            a aVar = this.this$0;
            fjp.b(a.$ipChange.f(), fjp.SECTION_FIRST_TPP_REQUEST, "");
            a aVar2 = this.this$0;
            fjp.a(a.$ipChange.f(), fjp.SECTION_FIRST_TPP_REQUEST_PARSE, "");
        }
        if (ipa.ak()) {
            a aVar3 = this.this$0;
            b unused = a.$ipChange;
            idk.c(new ipa.c() { // from class: com.taobao.android.detail2.core.framework.data.net.recommend.RecInfoManager$1.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ipa.c
                public String b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this}) : "preCheckMtopDataForAsync";
                }

                @Override // tb.ipa.c
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    ctu.a("preCheckMtopData");
                    MtopResponse mtopResponse2 = mtopResponse;
                    boolean z = RecInfoManager$1.this.val$isPageUp;
                    int i2 = RecInfoManager$1.this.val$pageIndex;
                    a aVar4 = RecInfoManager$1.this.this$0;
                    final a.C0468a a2 = com.taobao.android.detail2.core.optimize.preload.a.a(mtopResponse2, z, i2, a.$ipChange);
                    ctu.a();
                    ipa.N().post(new ipa.c() { // from class: com.taobao.android.detail2.core.framework.data.net.recommend.RecInfoManager.1.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.ipa.c
                        public String b() {
                            IpChange ipChange3 = $ipChange;
                            return ipChange3 instanceof IpChange ? (String) ipChange3.ipc$dispatch("367c9fd7", new Object[]{this}) : "dealMtopSuccess";
                        }

                        @Override // tb.ipa.c
                        public void a() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                return;
                            }
                            if (a2.f11672a != null) {
                                JSONObject jSONObject = a2.f11672a;
                                a aVar5 = RecInfoManager$1.this.this$0;
                                com.taobao.android.detail2.core.optimize.preload.a.a(jSONObject, a.$ipChange);
                            }
                            if (a2.f && a2.f11672a != null) {
                                a.a(RecInfoManager$1.this.this$0, RecInfoManager$1.this.val$isPageUp, RecInfoManager$1.this.val$pageIndex, a2.f11672a, mtopResponse);
                            } else {
                                a.a(RecInfoManager$1.this.this$0, RecInfoManager$1.this.val$isPageUp, RecInfoManager$1.this.val$pageIndex, a2.b);
                            }
                        }
                    });
                    if (a2.f && a2.f11672a != null) {
                        bga.b.b("new_detail", mtopResponse);
                        return;
                    }
                    String str = a2.c;
                    String str2 = a2.d;
                    a aVar5 = RecInfoManager$1.this.this$0;
                    fjp.a("recommend", str, str2, a.$ipChange.h().T(), "", a2.e);
                }
            });
            ctu.a();
            return;
        }
        a aVar4 = this.this$0;
        boolean z = this.val$isPageUp;
        int i2 = this.val$pageIndex;
        JSONObject jSONObject = a.$ipChange;
        if (jSONObject == null) {
            ctu.a();
            return;
        }
        a.a(this.this$0, this.val$isPageUp, this.val$pageIndex, jSONObject, mtopResponse);
        bga.b.b("new_detail", mtopResponse);
        ctu.a();
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        a.a(this.this$0, this.val$isPageUp, this.val$pageIndex, mtopResponse);
        bga.b.a("new_detail", mtopResponse);
    }
}
