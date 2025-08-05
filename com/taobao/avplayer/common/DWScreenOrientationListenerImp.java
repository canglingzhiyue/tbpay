package com.taobao.avplayer.common;

import android.content.Context;
import android.view.OrientationEventListener;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import tb.kge;

/* loaded from: classes6.dex */
public class DWScreenOrientationListenerImp extends OrientationEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Orientation f16476a;
    private a b;

    /* loaded from: classes6.dex */
    public enum Orientation {
        PORTRAIT,
        LANDSCAPE_90,
        LANDSCAPE_270
    }

    /* loaded from: classes6.dex */
    public interface a {
        void a(Orientation orientation);
    }

    static {
        kge.a(-1533702683);
    }

    public DWScreenOrientationListenerImp(Context context) {
        super(context);
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_sdk_DWScreenOrientationListenerImp);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56f6a437", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f9b5e39", new Object[]{this, new Integer(i)});
        } else if (i == -1) {
        } else {
            if (i > 85 && i < 95) {
                a aVar = this.b;
                if (aVar != null) {
                    aVar.a(Orientation.LANDSCAPE_90);
                }
                this.f16476a = Orientation.LANDSCAPE_90;
            } else if (i > 265 && i < 275) {
                a aVar2 = this.b;
                if (aVar2 != null) {
                    aVar2.a(Orientation.LANDSCAPE_270);
                }
                this.f16476a = Orientation.LANDSCAPE_270;
            } else if (i <= 350 && i >= 10 && (i <= 170 || i >= 190)) {
            } else {
                a aVar3 = this.b;
                if (aVar3 != null) {
                    aVar3.a(Orientation.PORTRAIT);
                }
                this.f16476a = Orientation.PORTRAIT;
            }
        }
    }
}
