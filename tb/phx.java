package tb;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taolive.room.utils.d;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.ui.component.VideoFrame2;

/* loaded from: classes8.dex */
public abstract class phx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public BaseFrame f32670a;
    public BaseFrame b;
    public ViewGroup c;
    public VideoFrame2 d;
    public Context e;
    public TBLiveDataModel f;
    public boolean g;
    public a h;
    public com.taobao.alilive.aliliveframework.frame.a i;

    /* loaded from: classes8.dex */
    public interface a {
        void a();

        void a(BaseFrame baseFrame);

        void a(String str);

        void a(boolean z);

        void b();

        BaseFrame c();
    }

    static {
        kge.a(373201895);
    }

    public abstract void c();

    public phx(BaseFrame baseFrame, ViewGroup viewGroup, VideoFrame2 videoFrame2, Context context, TBLiveDataModel tBLiveDataModel, boolean z, com.taobao.alilive.aliliveframework.frame.a aVar, a aVar2) {
        this.b = baseFrame;
        this.c = viewGroup;
        this.d = videoFrame2;
        this.e = context;
        this.f = tBLiveDataModel;
        this.g = z;
        this.i = aVar;
        this.h = aVar2;
    }

    public void a(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd977ce1", new Object[]{this, tBLiveDataModel});
        } else {
            this.f = tBLiveDataModel;
        }
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : (d.c() * 9) / 16;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        poy.a(z, this.i);
        if (z) {
            if (((Activity) this.e).getRequestedOrientation() == 1) {
                ((Activity) this.e).setRequestedOrientation(0);
            }
        } else if (((Activity) this.e).getRequestedOrientation() == 0) {
            ((Activity) this.e).setRequestedOrientation(1);
        }
        poy.a(false, this.i);
    }

    public BaseFrame e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseFrame) ipChange.ipc$dispatch("15876ee6", new Object[]{this}) : this.f32670a;
    }
}
