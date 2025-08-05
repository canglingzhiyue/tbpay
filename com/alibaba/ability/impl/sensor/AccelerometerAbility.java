package com.alibaba.ability.impl.sensor;

import android.content.Context;
import com.alibaba.ability.impl.sensor.listener.ShakeListener;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsAccelerometerAbility;
import com.taobao.android.abilityidl.ability.AccelerometerShakeRet;
import com.taobao.android.abilityidl.ability.bb;
import com.taobao.android.abilityidl.ability.d;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.als;
import tb.amh;
import tb.gml;
import tb.kge;

/* loaded from: classes2.dex */
public final class AccelerometerAbility extends AbsAccelerometerAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ShakeListener f1955a;

    static {
        kge.a(746111527);
    }

    public static /* synthetic */ Object ipc$super(AccelerometerAbility accelerometerAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAccelerometerAbility
    public void setShakeListener(als abilityContext, d params, bb events) {
        Float c;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b89ab6c5", new Object[]{this, abilityContext, params, events});
            return;
        }
        q.d(abilityContext, "abilityContext");
        q.d(params, "params");
        q.d(events, "events");
        Context f = abilityContext.f().f();
        if (f == null) {
            events.a(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (o) null));
            return;
        }
        Double valueOf = Double.valueOf(params.b);
        if (!(valueOf.doubleValue() >= ((double) 2))) {
            valueOf = null;
        }
        double doubleValue = valueOf != null ? valueOf.doubleValue() : 2.0d;
        Integer valueOf2 = Integer.valueOf(params.d);
        if (valueOf2.intValue() < 3) {
            z = false;
        }
        if (!z) {
            valueOf2 = null;
        }
        int intValue = valueOf2 != null ? valueOf2.intValue() : 3;
        ShakeListener shakeListener = this.f1955a;
        if (shakeListener != null) {
            shakeListener.b();
        }
        String str = params.f8805a;
        q.b(str, "params.axis");
        a aVar = new a(events, f, params, doubleValue, intValue, f, str, doubleValue - (amh.c() != null ? c.floatValue() : 1.2f), params.c, intValue, params.e);
        aVar.a();
        t tVar = t.INSTANCE;
        this.f1955a = aVar;
    }

    /* loaded from: classes2.dex */
    public static final class a extends ShakeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bb f1956a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ d c;
        public final /* synthetic */ double d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(bb bbVar, Context context, d dVar, double d, int i, Context context2, String str, double d2, int i2, int i3, boolean z) {
            super(context2, str, d2, i2, i3, z);
            this.f1956a = bbVar;
            this.b = context;
            this.c = dVar;
            this.d = d;
            this.e = i;
        }

        @Override // com.alibaba.ability.impl.sensor.listener.ShakeListener
        public void a(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a82180d6", new Object[]{this, new Double(d)});
                return;
            }
            bb bbVar = this.f1956a;
            AccelerometerShakeRet accelerometerShakeRet = new AccelerometerShakeRet();
            accelerometerShakeRet.result = Double.valueOf(d);
            t tVar = t.INSTANCE;
            bbVar.a(accelerometerShakeRet);
        }

        @Override // com.alibaba.ability.impl.sensor.listener.ShakeListener
        public void a(ShakeListener.Error error) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a2d96ba8", new Object[]{this, error});
                return;
            }
            q.d(error, "error");
            this.f1956a.a(new ErrorResult("ACCELEROMETER_NOT_AVAILABLE", "register shake listener fail", (Map) null, 4, (o) null));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAccelerometerAbility
    public void unsetShakeListener(als abilityContext, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2667196a", new Object[]{this, abilityContext, callback});
            return;
        }
        q.d(abilityContext, "abilityContext");
        q.d(callback, "callback");
        ShakeListener shakeListener = this.f1955a;
        if (shakeListener != null) {
            shakeListener.b();
        }
        this.f1955a = null;
    }

    @Override // com.taobao.android.abilityidl.b, com.taobao.android.abilityidl.c
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ShakeListener shakeListener = this.f1955a;
        if (shakeListener != null) {
            shakeListener.b();
        }
        this.f1955a = null;
    }
}
