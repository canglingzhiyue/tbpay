package com.taobao.tab2interact.core.layer.h5.view;

import android.content.Context;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.suw;

/* loaded from: classes8.dex */
public final class H5InteractLayerWebView extends WVUCWebView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<suw.b> delegateH5AreaList;
    private boolean isEventConsumedOnDown;

    static {
        kge.a(-1923919848);
    }

    public static /* synthetic */ Object ipc$super(H5InteractLayerWebView h5InteractLayerWebView, String str, Object... objArr) {
        if (str.hashCode() == -1253202540) {
            return new Boolean(super.coreDispatchTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H5InteractLayerWebView(Context context) {
        super(context);
        q.d(context, "context");
        this.delegateH5AreaList = p.a();
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public boolean coreDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b54da594", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent == null) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.isEventConsumedOnDown = false;
            Iterator<suw.b> it = this.delegateH5AreaList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                suw.b next = it.next();
                float a2 = next.a() * getWidth();
                float b = next.b() * getHeight();
                float c = next.c() * getWidth();
                float d = next.d() * getHeight();
                if (motionEvent.getX() >= a2 && motionEvent.getX() < a2 + c && motionEvent.getY() >= b && motionEvent.getY() < b + d) {
                    this.isEventConsumedOnDown = super.coreDispatchTouchEvent(motionEvent);
                    break;
                }
            }
            return this.isEventConsumedOnDown;
        } else if (!this.isEventConsumedOnDown) {
            return false;
        } else {
            return super.coreDispatchTouchEvent(motionEvent);
        }
    }

    public final void setDelegateH5Areas(List<suw.b> areaList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea4e92a", new Object[]{this, areaList});
            return;
        }
        q.d(areaList, "areaList");
        this.delegateH5AreaList = areaList;
    }
}
