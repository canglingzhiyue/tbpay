package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.application.common.IScrollListener;
import com.taobao.application.common.c;

/* loaded from: classes7.dex */
public class xmv implements IScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private xmu f34387a;

    @Override // com.taobao.application.common.IScrollListener
    public void onDoFrame(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ad383a", new Object[]{this, new Long(j)});
        }
    }

    @Override // com.taobao.application.common.IScrollListener
    @Deprecated
    public /* synthetic */ void onScrollEnd(Activity activity, String str) {
        IScrollListener.CC.$default$onScrollEnd(this, activity, str);
    }

    @Override // com.taobao.application.common.IScrollListener
    public void onStopMonitorDoFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4729dd0", new Object[]{this});
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f34387a = new xmu();
        this.f34387a.a("falco.scroll_action");
        this.f34387a.c("");
        this.f34387a.d("");
        c.a(this);
    }

    @Override // com.taobao.application.common.IScrollListener
    public void onScrollStart(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b005994", new Object[]{this, activity, new Integer(i)});
        } else if (i != 1) {
        } else {
            this.f34387a.e(SceneIdentifier.getCurrentPageNameWithFragment());
            this.f34387a.f(SceneIdentifier.getCurrentPageUrl());
            this.f34387a.a();
        }
    }

    @Override // com.taobao.application.common.IScrollListener
    public void onScrollEnd(Activity activity, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc32d85", new Object[]{this, activity, new Integer(i), str});
        } else {
            this.f34387a.b();
        }
    }
}
