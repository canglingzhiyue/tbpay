package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.os.Looper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.at;
import com.taobao.android.detail.ttdetail.utils.bf;
import tb.eyx;
import tb.ezm;
import tb.kge;
import tb.odg;
import tb.pir;
import tb.pkw;

/* loaded from: classes5.dex */
public class g implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "checkCollect";

    /* renamed from: a  reason: collision with root package name */
    private Context f10700a;
    private eyx b;
    private volatile boolean c;

    static {
        kge.a(1436100345);
        kge.a(1967244270);
    }

    public static /* synthetic */ eyx a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyx) ipChange.ipc$dispatch("65125ee7", new Object[]{gVar}) : gVar.b;
    }

    public static /* synthetic */ boolean b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ce229c0", new Object[]{gVar})).booleanValue() : gVar.c;
    }

    public g(Context context, eyx eyxVar) {
        this.f10700a = context;
        this.b = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, final RuntimeAbilityParam... runtimeAbilityParamArr) {
        final JSONObject b;
        final String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (aVar == null || (b = aVar.b()) == null) {
            return false;
        }
        if (com.taobao.android.detail.ttdetail.utils.d.a(this.b.a())) {
            return true;
        }
        pir pirVar = (pir) this.b.a().a(pkw.PARSER_ID);
        if (at.a(pirVar)) {
            string = at.c(pirVar);
        } else {
            string = b.getString("itemId");
        }
        this.c = false;
        odg.k().a(string, new odg.i() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.odg.i
            public void a(final boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                    return;
                }
                final com.taobao.android.detail.ttdetail.component.module.d a2 = com.taobao.android.detail.ttdetail.utils.a.a(runtimeAbilityParamArr);
                if (a2 == null) {
                    com.taobao.android.detail.ttdetail.utils.i.a("CheckCollectImplementor", "queryCollect success with value: " + z + ", but not found triggerComponent for write back");
                    return;
                }
                Runnable runnable = new Runnable() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.g.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        boolean a3 = com.taobao.android.detail.ttdetail.utils.v.a(a2, z);
                        if (!a3) {
                            a3 = com.taobao.android.detail.ttdetail.utils.v.a(a2, b, z);
                        }
                        if (!a3) {
                            return;
                        }
                        Runnable runnable2 = new Runnable() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.g.1.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange4 = $ipChange;
                                if (ipChange4 instanceof IpChange) {
                                    ipChange4.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    a2.updateComponent();
                                }
                            }
                        };
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            runnable2.run();
                        } else {
                            g.a(g.this).b().a(runnable2);
                        }
                    }
                };
                if (!g.b(g.this)) {
                    runnable.run();
                } else {
                    bf.a(runnable);
                }
            }

            @Override // tb.odg.i
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    return;
                }
                com.taobao.android.detail.ttdetail.utils.i.a("CheckCollectImplementor", "queryCollect failed with errCode: " + str + " errMsg: " + str2 + ", for item: " + string);
            }
        });
        this.c = true;
        return true;
    }
}
