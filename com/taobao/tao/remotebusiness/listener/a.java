package com.taobao.tao.remotebusiness.listener;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import mtopsdk.mtop.common.MtopListener;
import tb.kge;

/* loaded from: classes.dex */
public class a implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private MtopFinishListenerImpl f21030a;
    private MtopProgressListenerImpl b;
    private MtopCacheListenerImpl c;
    private MtopStreamListenerImpl d;
    private MtopBusiness e;
    private MtopListener f;

    static {
        kge.a(1557398217);
        kge.a(16938580);
    }

    public a(MtopBusiness mtopBusiness, MtopListener mtopListener) {
        this.f21030a = new MtopFinishListenerImpl(mtopBusiness, mtopListener);
        this.e = mtopBusiness;
        this.f = mtopListener;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        char c;
        String name = method.getName();
        switch (name.hashCode()) {
            case -1809154262:
                if (name.equals(Constants.KEY_DATA_RECEIVED_TIME)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1624820274:
                if (name.equals("onReceiveData")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1030363105:
                if (name.equals("onCached")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1123967826:
                if (name.equals("onFinish")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1177139532:
                if (name.equals("onHeader")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 2096292721:
                if (name.equals("onFinished")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c == 1 || c == 2) {
                if (this.b == null) {
                    this.b = new MtopProgressListenerImpl(this.e, this.f);
                }
                return method.invoke(this.b, objArr);
            } else if (c == 3) {
                if (this.c == null) {
                    this.c = new MtopCacheListenerImpl(this.e, this.f);
                }
                return method.invoke(this.c, objArr);
            } else if (c != 4 && c != 5) {
                return null;
            } else {
                if (this.d == null) {
                    this.d = new MtopStreamListenerImpl(this.e, this.f);
                }
                return method.invoke(this.d, objArr);
            }
        }
        return method.invoke(this.f21030a, objArr);
    }
}
