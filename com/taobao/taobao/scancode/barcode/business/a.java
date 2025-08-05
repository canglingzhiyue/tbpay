package com.taobao.taobao.scancode.barcode.business;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.flexa.compat.c;
import com.alipay.android.phone.inside.api.model.consultroute.ConsultRouteModel;
import com.alipay.android.phone.inside.api.model.scan.CodeTypeEnum;
import com.alipay.android.phone.inside.service.InsideOperationService;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import org.json.JSONObject;
import tb.kge;
import tb.oxx;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f21218a;

    /* renamed from: com.taobao.taobao.scancode.barcode.business.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public interface InterfaceC0882a {
        void a(String str);
    }

    static {
        kge.a(-472139299);
    }

    public static /* synthetic */ void a(a aVar, String str, InterfaceC0882a interfaceC0882a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60488321", new Object[]{aVar, str, interfaceC0882a});
        } else {
            aVar.b(str, interfaceC0882a);
        }
    }

    public a(Context context) {
        this.f21218a = context;
    }

    public boolean a(final String str, final InterfaceC0882a interfaceC0882a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e9029de", new Object[]{this, str, interfaceC0882a})).booleanValue();
        }
        if (!a(str)) {
            return false;
        }
        c.a("com.alipay.android.phone.inside.service.InsideOperationService", new c.a() { // from class: com.taobao.taobao.scancode.barcode.business.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.flexa.compat.c.a
            public void onClassLoaded(Class<?> cls) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5ad6f018", new Object[]{this, cls});
                } else {
                    Coordinator.execute(new Runnable() { // from class: com.taobao.taobao.scancode.barcode.business.a.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                a.a(a.this, str, interfaceC0882a);
                            }
                        }
                    });
                }
            }

            @Override // com.alibaba.flexa.compat.c.a
            public void onClassNotFound() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ad9dd2ef", new Object[]{this});
                    return;
                }
                InterfaceC0882a interfaceC0882a2 = interfaceC0882a;
                if (interfaceC0882a2 == null) {
                    return;
                }
                interfaceC0882a2.a(str);
            }
        });
        return true;
    }

    private void b(String str, InterfaceC0882a interfaceC0882a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dadeb9", new Object[]{this, str, interfaceC0882a});
            return;
        }
        ConsultRouteModel consultRouteModel = new ConsultRouteModel();
        consultRouteModel.setCode(str);
        consultRouteModel.setTimeout(6);
        if (TextUtils.equals("qrCode", "qrCode")) {
            consultRouteModel.setCodeType(CodeTypeEnum.QRCODE);
        } else {
            consultRouteModel.setCodeType(CodeTypeEnum.BARCODE);
        }
        try {
            String string = new JSONObject(InsideOperationService.getInstance().startAction(this.f21218a, consultRouteModel).getResult()).getJSONObject("supportParams").getString("alipayRouteScheme");
            if (TextUtils.isEmpty(string)) {
                throw new NullPointerException();
            }
            if (interfaceC0882a == null) {
                return;
            }
            interfaceC0882a.a(string);
        } catch (Throwable unused) {
            if (interfaceC0882a == null) {
                return;
            }
            interfaceC0882a.a(str);
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : oxx.a() && str != null && (str.startsWith("https://qr.alipay.com") || str.startsWith("http://qr.alipay.com") || str.startsWith("alp://"));
    }
}
