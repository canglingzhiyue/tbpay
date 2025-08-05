package com.alipay.mobile.verifyidentity.log;

import android.content.Context;
import com.alipay.mobile.verifyidentity.utils.ReflectUtils;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DebugViewer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile BaseDebugViewer f5874a;

    public static BaseDebugViewer getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseDebugViewer) ipChange.ipc$dispatch("a245f34c", new Object[0]);
        }
        if (f5874a == null) {
            synchronized (DebugViewer.class) {
                if (f5874a == null) {
                    Object invokeStaticMethod = ReflectUtils.invokeStaticMethod("com.alipay.mobile.verifyidentity.helper.DebugViewer", "getInstance", new Class[0], new Object[0]);
                    if (invokeStaticMethod == null) {
                        return new BaseDebugViewer() { // from class: com.alipay.mobile.verifyidentity.log.DebugViewer.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.mobile.verifyidentity.log.BaseDebugViewer
                            public final void addVerifyLogger(String str, String str2) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("ee271ec5", new Object[]{this, str, str2});
                                }
                            }

                            @Override // com.alipay.mobile.verifyidentity.log.BaseDebugViewer
                            public final void getEnvironParams(String str) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("242c5636", new Object[]{this, str});
                                }
                            }

                            @Override // com.alipay.mobile.verifyidentity.log.BaseDebugViewer
                            public final void gotRpcResult(Long l, MICRpcResponse mICRpcResponse) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("c8557f42", new Object[]{this, l, mICRpcResponse});
                                }
                            }

                            @Override // com.alipay.mobile.verifyidentity.log.BaseDebugViewer
                            public final void init(Context context) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("609fd211", new Object[]{this, context});
                                }
                            }

                            @Override // com.alipay.mobile.verifyidentity.log.BaseDebugViewer
                            public final void sendRpc(Long l, Object obj) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("8b3fe89f", new Object[]{this, l, obj});
                                }
                            }

                            @Override // com.alipay.mobile.verifyidentity.log.BaseDebugViewer
                            public final void start() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("810347e9", new Object[]{this});
                                }
                            }

                            @Override // com.alipay.mobile.verifyidentity.log.BaseDebugViewer
                            public final void unregisterSensorListener() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("475ce971", new Object[]{this});
                                }
                            }
                        };
                    }
                    f5874a = (BaseDebugViewer) invokeStaticMethod;
                }
            }
        }
        return f5874a;
    }
}
