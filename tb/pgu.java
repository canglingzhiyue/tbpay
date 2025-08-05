package tb;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taolive.movehighlight.utils.b;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.ui.component.VideoFrame2;

/* loaded from: classes8.dex */
public abstract class pgu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public BaseFrame f32644a;
    public BaseFrame b;
    public ViewGroup c;
    public VideoFrame2 d;
    public Context e;
    public TBLiveDataModel f;
    public boolean g;
    public a h;

    /* loaded from: classes8.dex */
    public interface a {
        BaseFrame a();

        void a(BaseFrame baseFrame);

        void a(String str);

        void a(boolean z);
    }

    static {
        kge.a(1948579417);
    }

    public abstract void a(com.taobao.alilive.aliliveframework.frame.a aVar);

    public pgu(BaseFrame baseFrame, ViewGroup viewGroup, VideoFrame2 videoFrame2, Context context, TBLiveDataModel tBLiveDataModel, boolean z, a aVar) {
        this.b = baseFrame;
        this.c = viewGroup;
        this.d = videoFrame2;
        this.e = context;
        this.f = tBLiveDataModel;
        this.g = z;
        this.h = aVar;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : (b.b() * 9) / 16;
    }

    public void a(boolean z, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d75da4d9", new Object[]{this, new Boolean(z), aVar});
            return;
        }
        poy.a(z, aVar);
        if (z) {
            if (((Activity) this.e).getRequestedOrientation() != 1) {
                return;
            }
            ((Activity) this.e).setRequestedOrientation(0);
        } else if (((Activity) this.e).getRequestedOrientation() != 0) {
        } else {
            ((Activity) this.e).setRequestedOrientation(1);
        }
    }
}
