package com.taobao.oversea.homepage.common.aiservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IAiService;
import com.taobao.infoflow.taobao.subservice.biz.aiservice.impl.AiServiceImpl;
import com.tmall.android.dai.f;

/* loaded from: classes7.dex */
public abstract class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "tovs_gul_edge_user_state.alinn";

    public abstract String c();

    public abstract String d();

    @Override // com.taobao.oversea.homepage.common.aiservice.b
    public IAiService a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAiService) ipChange.ipc$dispatch("370be8ba", new Object[]{this});
        }
        AiServiceImpl aiServiceImpl = new AiServiceImpl();
        aiServiceImpl.setConfig(b());
        return aiServiceImpl;
    }

    /* renamed from: com.taobao.oversea.homepage.common.aiservice.a$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public class AnonymousClass1 extends IAiService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass1() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IAiService.a
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : f.a(a.MODULE_NAME, "version");
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IAiService.a
        public IAiService.IApiInfo b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (IAiService.IApiInfo) ipChange.ipc$dispatch("13bcc0fa", new Object[]{this}) : new IAiService.IApiInfo() { // from class: com.taobao.oversea.homepage.common.aiservice.AbstractAiService$1$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.infoflow.protocol.subservice.biz.IAiService.IApiInfo
                public String getApi() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("67b7a95", new Object[]{this}) : a.this.c();
                }

                @Override // com.taobao.infoflow.protocol.subservice.biz.IAiService.IApiInfo
                public String getVersion() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("2a8fef97", new Object[]{this}) : a.this.d();
                }
            };
        }
    }

    public IAiService.a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IAiService.a) ipChange.ipc$dispatch("37f2c77c", new Object[]{this}) : new AnonymousClass1();
    }
}
