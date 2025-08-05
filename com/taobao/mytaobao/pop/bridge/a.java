package com.taobao.mytaobao.pop.bridge;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import kotlin.Metadata;
import kotlin.collections.g;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.reflect.k;
import tb.aej;
import tb.aek;
import tb.ael;
import tb.kge;
import tb.mvn;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J9\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0010\"\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0002\u0010\u0012R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/taobao/mytaobao/pop/bridge/TBMyTaobaoWindVaneListener;", "Landroid/taobao/windvane/service/WVEventListener;", "()V", "enable", "", "getEnable", "()Z", "enable$delegate", "Lkotlin/Lazy;", MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT, "Landroid/taobao/windvane/service/WVEventResult;", "id", "", "ctx", "Landroid/taobao/windvane/service/WVEventContext;", "obj", "", "", "(ILandroid/taobao/windvane/service/WVEventContext;[Ljava/lang/Object;)Landroid/taobao/windvane/service/WVEventResult;", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class a implements aek {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ k[] f18463a;
    private final d b = e.a(TBMyTaobaoWindVaneListener$enable$2.INSTANCE);

    static {
        kge.a(132520396);
        kge.a(1845411121);
        f18463a = new k[]{t.a(new PropertyReference1Impl(t.b(a.class), "enable", "getEnable()Z"))};
    }

    private final boolean a() {
        IpChange ipChange = $ipChange;
        return ((Boolean) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("56c6c6c", new Object[]{this}) : this.b.getValue())).booleanValue();
    }

    @Override // tb.aek
    public ael onEvent(int i, aej aejVar, Object... obj) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ael) ipChange.ipc$dispatch("786a51d8", new Object[]{this, new Integer(i), aejVar, obj});
        }
        q.c(obj, "obj");
        if (i != 3005 || !a()) {
            return null;
        }
        Object a2 = g.a(obj, 0);
        if (!(a2 instanceof String)) {
            a2 = null;
        }
        String str = (String) a2;
        if (str == null) {
            return null;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject != null && (string = parseObject.getString("event")) != null && q.a((Object) mvn.ACTION_USER_AVATAR_CHANGED, (Object) string)) {
                com.taobao.global.setting.data.e.a().a("Global_User_Profile" + Login.getUserId());
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
